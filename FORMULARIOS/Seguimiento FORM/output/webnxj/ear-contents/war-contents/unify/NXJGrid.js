var GRID_LABEL=0;
var GRID_TEXTFIELD=1;
var GRID_CHECKBOX=2;
var GRID_COMBO=3;
var GRID_LINK=4;
var GRID_IMAGE=5;
var GRID_IMAGE_BUTTON=6;
var GRID_BUTTON=7;
var GRID_EDITABLE_COMBO=8;
var GRID_DATE_PICKER=9;
var GRID_TEXTAREA=10;
var GRID_PASSWORD=11;
var GRID_TILE_ICON="images/graytile.gif";
var GRID_SEED="NXJGrid";
var gridNextKey=0;
var GRID_ESCAPE_KEY=27;
var GRID_ENTER_KEY=13;
var GRID_UP_KEY=38;
var GRID_DOWN_KEY=40;
var GRID_TAB_KEY=9;
var GRID_MIN_COL_WIDTH=10;
var GRID_MOVE_DELTA=3;
var GRID_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var GRID_ASCENDING_INDICATOR=GRID_IS_IE?5:"&uarr;";
var GRID_DESCENDING_INDICATOR=GRID_IS_IE?6:"&darr;";
var GRID_INT=0;
var GRID_STRING=1;
var GRID_DATE=2;
var GRID_FLOAT=3;
var GRID_AMOUNT=4;
var gridDefaultMonthNames=["January","February","March","April","May","June","July","August","September","October","November","December"];
var gridDefaultDayNames=["S","M","T","W","T","F","S",];
function NXJGridColumn(_1,_2,_3,_4,_5,_6,_7,_8,_9,_a,_b,_c,_d,_e,_f,_10,_11){
this.title=_1;
this.controlType=_2;
this.dataType=_3;
this.width=_4;
this.style=new Array(_5);
this.comboValues=_6;
this.defaultValue=_7;
this.className=new Array(_8);
this.toolTip=_b;
this.stopForInput=_9;
this.visible=new Array(_a);
this.fieldId=_c;
this.dateHeaderFG=_d;
this.dateHeaderBG=_e;
this.options=new Array();
if(this.controlType==GRID_COMBO||this.controlType==GRID_EDITABLE_COMBO){
for(var idx=0;idx<this.comboValues.length;idx++){
var _13=this.comboValues[idx];
var _14;
var _15;
var _16=_13.indexOf("=");
if(_16==-1){
_14=_13;
_15=_13;
}else{
_14=_13.substring(0,_16);
_15=_13.substring(_16+1);
}
this.options[idx]=new Option(_14,_15,false,false);
}
}
}
NXJGridColumn.prototype.toString=new function(){
return "\tTitle:\t"+this.title+"\n\tcontrol:\t"+this.controlType+"\n\ttype:\t"+this.dataType+"\n\twidth:\t"+this.width+"\n\tstyle:\t"+this.style+"\n\tfield id:\t"+this.fieldId;
};
function NXJGrid(_17,_18,_19,_1a,_1b,_1c,_1d,_1e,_1f,_20,_21,_22,_23){
this.nresizes=0;
this.outerDivId=_17;
this.columns=_18;
this.iconDir=_1c;
this.days=_1d;
this.months=_1e;
this.systemIconBase=_1f;
this.projectIconBase=_20;
this.tileIcon=this.getIcon("grid_header",GRID_TILE_ICON);
this.outerDiv=document.getElementById(_17);
if(this.outerDiv==null){
return;
}
var _24=this.getNamedStyle("grid_focus_text");
var _25=(_24&&_24.backgroundColor)?_24.backgroundColor:"white";
var _26=(_24&&_24.color)?_24.color:"black";
this.editCellFG=_1a?_1a:_26;
this.editCellBG=_1b?_1b:_25;
this.rowHeight=_19;
this.beforeChange=null;
this.onShow=null;
this.clientManager=null;
this.dataView=null;
this.classes=new Array();
this.styles=new Array();
this.rowIds=new Array();
this.nextRowId=0;
this.cells=new Array();
this.values=new Array();
this.rowIdToIndex=new Object();
this.rowToManagerRow=new Object();
this.colIdToIndex=new Object();
this.colIndexToColId=new Object();
this.editRow=-1;
this.editCol=-1;
this.deferredRow=-1;
this.deferredCol=-1;
this.selectedRow=-1;
this.isEditingCell=false;
this.savedInnerText=null;
this.sortColId=-1;
this.ascending=true;
this.document=document;
this.banner="nxjgrid";
this.log="";
this.dateFormat="MM/dd/yyyy";
this.monthNames=gridDefaultMonthNames;
this.dayNames=gridDefaultDayNames;
this.isGrid=true;
this.columnsMovable=_21;
this.columnsResizable=_22;
this.columnsSortable=_23;
for(var idx=0;idx<this.columns.length;idx++){
this.colIdToIndex[idx]=idx;
this.colIndexToColId[idx]=idx;
}
var _28;
if(window.parent.saveBlocks!=null&&(_28=window.parent.saveBlocks[this.outerDivId])!=null){
this.sortColId=_28.sortColId;
this.ascending=_28.ascending;
this.colIdToIndex=_28.colIdToIndex;
for(var _29=0;_29<this.columns.length;_29++){
var _2a=this.colIdToIndex[_29];
this.columns[_29].width=_28.widths[_29];
this.colIndexToColId[_2a]=_29;
}
}
var _2b=this.outerDiv.parentNode;
var _2c=_2b.style.borderStyle;
if(_2c&&_2c.toLowerCase()=="none"){
this.outerDiv.style.borderStyle="none";
}
_2b.style.borderStyle="none";
for(var idx=0;idx<_2b.childNodes.length&&!this.navbar;idx++){
var _2d=_2b.childNodes[idx];
if(_2d.tagName=="DIV"&&_2d.getAttribute("navbarcontainer")){
this.navbar=_2d;
}
}
this.horizScrollWidth=_2b.getAttribute("horizontal_scroll_width");
if(this.horizScrollWidth){
_2b.style.width=this.horizScrollWidth;
_2b.style.overflowX="auto";
_2b.style.position="absolute";
this.outerDiv.style.position="absolute";
}
this.rowStyle=_2b.getAttribute("row_class");
if(!this.rowStyle){
this.rowStyle="row";
}
this.altRowStyle=_2b.getAttribute("altRowClass");
if(!this.altRowStyle){
this.altRowStyle="alternate_row";
}
this.selRowStyle=_2b.getAttribute("selected_row_class");
if(!this.selRowStyle){
this.selRowStyle="selected_row";
}
this.disableWrap=(_2b.getAttribute("disable_wrap")=="true");
var _2e=this.getNamedStyle("repeating_area");
if(_2e){
this.gridColor=_2e.borderColor;
}
if(!GRID_IS_IE){
_2b.style.fontSize="12px";
}
this.createBoxEditor();
this.password=this.document.createElement("input");
this.password.type="password";
this.password.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.password.style.position="absolute";
this.password.style.borderStyle="none";
this.password.style.paddingTop=0;
this.combo=this.document.createElement("select");
this.combo.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.combo.onchange=associateObjWithEvent(this,"doComboChange");
this.combo.style.position="absolute";
this.combo.style.borderStyle="none";
this.ecombo=this.document.createElement("div");
this.ecombo.style.height=20;
this.ecombo.style.width=50;
this.ecombo.id=GRID_SEED+gridNextKey++;
this.ecombo.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.ecombo.onchange=new Function("event","if(window.parent.clientManager!=null"+"&&window.parent.clientManager.eventsOK)"+"gridComboChange(event);else return false;");
this.ecombo.style.position="absolute";
this.ecombo.style.borderStyle="none";
this.picker=this.document.createElement("div");
this.picker.style.height=20;
this.picker.style.width=50;
this.picker.id=GRID_SEED+gridNextKey++;
this.picker.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.picker.style.position="absolute";
this.picker.style.borderStyle="none";
this.populate(new Array());
}
NXJGrid.prototype.createBoxEditor=function(){
this.box=this.document.createElement("input");
this.box.type="text";
this.box.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.box.style.position="absolute";
this.box.style.borderStyle="none";
this.box.style.paddingTop=0;
this.textarea=this.document.createElement("textarea");
this.textarea.onkeydown=associateObjWithEvent(this,"doEditorKeyDown");
this.textarea.style.position="absolute";
this.textarea.style.borderStyle="none";
this.textarea.style.paddingTop=0;
};
NXJGrid.prototype.addRow=function(_2f){
var _30=this.nextRowId++;
var _31=this.cells.length;
var row=this.document.createElement("tr");
var _33=this.tbody.childNodes.length+1;
var cls=this.getRowStyle(_33);
if(this.rowHeight){
row.style.height=this.rowHeight+"px";
}
_2f=this.fillInTrimValues(_2f,_33);
this.cells[_31]=new Array();
this.values[_31]=new Array();
this.rowIds[_31]=_30;
this.rowIdToIndex[_30]=_31;
this.rowToManagerRow[_31]=_31;
row.className=cls;
for(var col=0;col<this.columns.length;col++){
var _36=this.colIndexToColId[col];
this.cells[_31][col]=this.createCell(_31,col,_36,_2f[_36]);
this.values[_31][col]=_2f[_36];
row.appendChild(this.cells[_31][col]);
}
this.tbody.appendChild(row);
this.selectRow(_30);
};
NXJGrid.prototype.getRowStyle=function(_37){
return (_37%2)==1?this.rowStyle:this.altRowStyle;
};
NXJGrid.prototype.cancelEditingCell=function(){
if(this.isEditingCell){
if(this.editor.autoCompleteObj){
this.editor.autoCompleteObj.hidePopup();
}
var _38=this.cells[this.editRow][this.editCol];
this.isEditingCell=false;
var _39=this.colIndexToColId[this.editCol];
var _3a=this.rowToManagerRow[this.editRow];
_3a=getSparseArrayIndex(this.columns[_39].style,_3a);
if(!this.columns[_39].visible[_3a]||this.columns[_39].controlType==GRID_CHECKBOX){
return;
}
if(GRID_IS_IE){
_38.removeChild(_38.firstChild);
_38.innerText=this.savedInnerText;
}else{
_38.innerHTML=this.savedInnerText;
}
}
};
NXJGrid.prototype.clearSortCol=function(){
this.sortColId=-1;
this.ascending=true;
};
NXJGrid.prototype.createCell=function(row,col,_3d,_3e){
var _3f=this.columns[_3d];
var _40;
var _41=parseInt(_3f.controlType);
var _42=this.document.createElement("td");
var cls=this.getRowStyle(row);
_42.className=cls;
_42.title=_3f.toolTip;
var _44=this.rowToManagerRow[row];
_44=getSparseArrayIndex(_3f.style,_44);
var _45=_3f.style[_44];
var _46=_3f.visible[_44];
if(_45){
_42.style.cssText=_45;
}
if(this.gridColor){
_42.style.borderColor=this.gridColor;
}
if(!_3e){
_3e="";
}
if(_46==false){
return _42;
}
if(_41==GRID_COMBO||_41==GRID_EDITABLE_COMBO){
_40=_41==GRID_COMBO?"":_3e;
for(var idx=0;idx<_3f.options.length;idx++){
if(_3f.options[idx].value==_3e){
_40=_3f.options[idx].text;
break;
}
}
}else{
_40=_3e;
}
switch(_41){
case GRID_LABEL:
case GRID_TEXTFIELD:
case GRID_COMBO:
case GRID_EDITABLE_COMBO:
case GRID_DATE_PICKER:
if(GRID_IS_IE){
_42.width="100%";
}
this.setInnerText(_42,_40);
break;
case GRID_PASSWORD:
this.setInnerText(_42,this.getPasswordDisplayValue(_40));
break;
case GRID_TEXTAREA:
_42.style.whiteSpace="normal";
if(!_3f.stopForInput){
_42.innerHTML=_40;
}else{
this.setInnerText(_42,_40);
}
break;
case GRID_CHECKBOX:
var _48=this.document.createElement("input");
_48.type="checkbox";
_48.className=cls;
_48.name=_3f.fieldId+row;
if(this.style!=null){
_48.style.cssText=this.style;
}
_42.align="center";
_42.appendChild(_48);
this.hasCheckbox=true;
break;
case GRID_LINK:
var _49=this.document.createElement("a");
var _4a=_40.split("|");
_49.target=_4a[0];
if(_4a.length!=1){
_49.href=_4a[1];
}
var _4b=this.outerDiv.parentNode.getElementsByTagName("A");
if(_4b){
var _4c=_4b[_3f.fieldId];
if(_4c&&_4c.name){
_49.id=_3f.fieldId+this.rowToManagerRow[row];
_49.name=_4c.name;
_49.isInGrid=true;
var _4d=_4c.getAttribute("jscmd");
if(_4d){
_49.jscmd=_4d;
}
}
}
if(_4a.length>=3&&_4a[2].length!=0&&_4a[2].substring(_4a[2].length-1)!="/"){
var _4e=this.document.createElement("img");
_4e.src=_4a[2];
_4e.className=cls;
if(this.style!=null){
_4e.style.cssText=this.style;
}
_4e.style.borderStyle="none";
_49.appendChild(_4e);
}
if(_4a.length==4&&_4a[3].length!=0){
var div=this.document.createElement("nobr");
var _50=this.getNamedStyle("link");
this.setInnerText(div,_4a[3]);
div.className=cls;
if(this.style!=null){
div.style.cssText=this.style;
}
if(_50&&_50.color){
div.style.color=_50.color;
_49.style.color=_50.color;
}
_49.appendChild(div);
}
if(this.style!=null){
_49.style.cssText=this.style;
}
_42.appendChild(_49);
break;
case GRID_IMAGE:
var _4e=this.document.createElement("img");
_4e.src=_40;
_4e.height=this.rowHeight;
_4e.width=_3f.width;
_42.appendChild(_4e);
break;
case GRID_IMAGE_BUTTON:
case GRID_BUTTON:
var _51=this.document.createElement("input");
if(_41==GRID_IMAGE_BUTTON){
_51.type="image";
_51.src=_40;
}else{
_51.type="button";
_51.value=_40;
_51.className=this.className;
}
if(this.style!=null){
_51.style.cssText=this.style;
}
var _52=this.outerDiv.parentNode.getElementsByTagName("INPUT");
if(_52){
var _53=_52[_3f.fieldId];
if(_53&&_53.name){
_51.id=_3f.fieldId+this.rowToManagerRow[row];
_51.name=_53.name;
_51.isInGrid=true;
var _4d=_53.getAttribute("jscmd");
if(_4d){
_51.jscmd=_4d;
}
}
}
_42.appendChild(_51);
break;
}
if((_41==GRID_TEXTFIELD||_41==GRID_LABEL||_41==GRID_IMAGE||_41==GRID_TEXTAREA)&&this.clientManager){
var _48=this.clientManager.document.getElementById(_3f.fieldId);
if(!_48){
var _54=this.clientManager.findFields(_3f.fieldId);
if(_54){
_48=_54[0];
}
}
if(_48&&_48.getAttribute("nxj_dblclick")){
_42.dblClickControl=_48;
_42.ondblclick=new Function("if(window.parent.clientManager!=null"+"&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager"+".dblclickcmd(this.dblClickControl);}catch(e){}}"+"return false;");
}
if(_41==GRID_TEXTFIELD&&_48&&_48.style.textTransform){
_42.style.textTransform=_48.style.textTransform;
}
}
return _42;
};
NXJGrid.prototype.getFirstChild=function(_55){
for(var idx=0;idx<_55.childNodes.length;idx++){
if(_55.childNodes[idx].tagName){
return _55.childNodes[idx];
}
}
return null;
};
NXJGrid.prototype.getPasswordDisplayValue=function(_57){
var _58="";
if(_57){
for(var idx=0;idx<_57.length;idx++){
_58+="*";
}
}
return _58;
};
function getSparseArrayIndex(_5a,_5b){
if(_5b>=_5a.length-1){
return _5a.length-1;
}
while(typeof (_5a[_5b])=="undefined"&&_5b>=0){
_5b--;
}
return _5b>=0?_5b:0;
}
NXJGrid.prototype.dump=function(_5c){
var _5d="Columns\n";
for(var col=0;col<this.columns.length;col++){
_5d+=this.columns[col].dump()+"\n";
}
return _5d+"\n\n"+this.grid.dump(_5c);
};
NXJGrid.prototype.fillInTrimValues=function(_5f,row){
var _61=new Array();
var _62=0;
var mgr=window.parent.clientManager;
for(var _64=0;_64<this.columns.length;_64++){
var _65=this.columns[_64].controlType;
var _66;
if(_65==GRID_LABEL||_65==GRID_LINK||_65==GRID_IMAGE||_65==GRID_IMAGE_BUTTON||_65==GRID_BUTTON){
_66=this.columns[_64].defaultValue;
if(_66.charAt(0)=="="){
_66=_5f[_62++];
}else{
if(_65==GRID_LINK&&_66.indexOf("|=")!=-1){
_66=_66.replace(/\\|=[^\\|]*/g,_5f[_62++]);
}else{
if(_65==GRID_IMAGE&&row>=0&&_66.indexOf("TextBinaryHandler")!=-1){
var _67=this.columns[_64].fieldId+(row-1)+"&windowCounter="+(mgr?mgr.windowCounter:0);
_66=_66.replace(/htmlElementName=.*/,"htmlElementName="+_67);
}
}
}
}else{
_66=_5f[_62++];
}
_61[_64]=_66;
}
return _61;
};
NXJGrid.prototype.getIcon=function(_68,_69){
var _6a;
var _6b;
if((_6a=this.getNamedStyle(_68))&&(_6b=_6a.backgroundImage)){
var _6c=_6b.indexOf("(");
var _6d=_6b.indexOf(")");
if(_6c!=-1&&_6d!=-1&&_6c<_6d){
_6b=_6b.substring(_6c+1,_6d);
}
return this.projectIconBase+"/"+_6b;
}else{
if(_69.indexOf("file:")==0){
return _69;
}
}
return this.systemIconBase.length==0?_69:this.systemIconBase+"/"+_69;
};
NXJGrid.prototype.getRowValues=function(row){
return this.values[this.rowIdToIndex[row]];
};
NXJGrid.prototype.getNamedStyle=function(_6f){
_6f=_6f.toLowerCase();
if(!document.styleSheets){
return null;
}
for(var _70=document.styleSheets.length-1;_70>=0;_70--){
var _71=document.styleSheets[_70];
if(!_71){
continue;
}
var _72=null;
try{
if(_71.rules){
_72=_71.rules;
}else{
if(_71.cssRules){
_72=_71.cssRules;
}
}
}
catch(e){
_72=new Array();
}
for(var idx=0;idx<_72.length;idx++){
var _74=_72[idx];
if(_74.selectorText&&_74.selectorText.toLowerCase()=="."+_6f){
return _74.style;
}
}
}
return null;
};
NXJGrid.prototype.getPreviewData=function(){
var _75=new Array();
for(var row=0;row<100;row++){
var _77=new Array();
for(var col=0;col<this.columns.length;col++){
var _79=this.columns[col].dataType;
var _7a=this.columns[col].controlType;
if(this.columns[col].defaultValue!=null){
_77[col]=this.columns[col].defaultValue;
}else{
if(_79==GRID_INT){
_77[col]=row+1;
}else{
if(_79==GRID_FLOAT){
_77[col]=1;
}else{
if(_79==GRID_DATE){
_77[col]="1/1/2004";
}else{
if(_7a==GRID_TEXTAREA){
var _7b="";
for(var idx=0;idx<20;idx++){
_7b+="<b>Hello</b> there<p>";
}
_77[col]=_7b;
}else{
_77[col]="abc."+row+"."+col;
}
}
}
}
}
}
_75[row]=_77;
}
return _75;
};
NXJGrid.prototype.getRowNumber=function(){
return this.selectedRow+1;
};
NXJGrid.prototype.getRowCount=function(){
return this.values.length;
};
NXJGrid.prototype.getSelectedRowId=function(){
for(var _7d in this.rowIdToIndex){
if(_7d=="extend"){
continue;
}
var row=this.rowIdToIndex[_7d];
if(row==this.selectedRow){
return _7d;
}
}
return null;
};
NXJGrid.prototype.handleKeyEvent=function(_7f){
var key=_7f.keyCode;
if(key==GRID_UP_KEY){
if(!GRID_IS_IE&&this.isEditingCell){
return true;
}
if(this.selectedRow>0&&this.isEditingCell&&this.stopEditingCell()){
this.selectRowFromIndex(this.selectedRow-1);
}else{
if(this.onPreviousRecord!=null&&this.stopEditingCell()){
this.onPreviousRecord(this.clientManager,this.dataView);
}
}
return true;
}else{
if(key==GRID_DOWN_KEY){
if(!GRID_IS_IE&&this.isEditingCell){
return true;
}
if(this.selectedRow<this.cells.length-1&&this.isEditingCell&&this.stopEditingCell()){
this.selectRowFromIndex(this.selectedRow+1);
}else{
if(this.onNextRecord!=null&&this.stopEditingCell()){
this.onNextRecord(this.clientManager,this.dataView);
}
}
return true;
}
}
return false;
};
NXJGrid.prototype.nameToColumnId=function(_81){
for(var _82=0;_82<this.columns.length;_82++){
if(this.columns[_82].fieldId==_81){
return _82;
}
}
return -1;
};
NXJGrid.prototype.removeRow=function(_83){
this.cancelEditingCell();
var row=this.rowIdToIndex[_83];
var _85=this.rowToManagerRow[row];
var _86=false;
if(row==null){
alert(" removeRow no row rowId = "+_83+" row = "+row);
return;
}
this.tbody.removeChild(this.tbody.childNodes[row]);
for(var _87=row;_87<this.cells.length-1;_87++){
this.cells[_87]=this.cells[_87+1];
this.values[_87]=this.values[_87+1];
}
this.cells.length--;
this.values.length--;
for(var _87=row;_87<this.cells.length-1;_87++){
var cls=this.getRowStyle(_87);
var _89=this.tbody.childNodes[_87];
this.setClassRecursively(_89,cls);
}
var _8a=new Object();
var _8b="old =";
if(_86){
for(var _8c in this.rowIdToIndex){
var _8d=this.rowIdToIndex[_8c];
_8b+="\n\tid = "+_8c+" row = "+_8d;
if(_8c>10){
break;
}
}
}
for(var _8c in this.rowIdToIndex){
if(_8c=="extend"){
continue;
}
var _8d=this.rowIdToIndex[_8c];
if(_8c>_83){
_8c--;
}
if(_8d<row){
_8a[_8c]=_8d;
}else{
if(_8d>row){
_8a[_8c]=_8d-1;
}
}
}
this.rowIdToIndex=_8a;
if(_86){
_8b+="\n\nnew =";
for(var _8c in this.rowIdToIndex){
var _8d=this.rowIdToIndex[_8c];
_8b+="\n\tid = "+_8c+" row = "+_8d;
if(_8c>10){
break;
}
}
alert(_8b);
}
var _8e=new Object();
for(var _8f in this.rowToManagerRow){
var _90=this.rowToManagerRow[_8f];
if(_90>_85){
_90--;
}
if(_8f<row){
_8e[_8f]=_90;
}else{
if(_8f!=row){
_8e[_8f-1]=_90;
}
}
}
this.rowToManagerRow=_8e;
};
NXJGrid.prototype.parseDate=function(_91){
var _92=0;
var _93=0;
var _94=0;
var _95=0;
var _96=1;
var mgr=window.parent.clientManager;
var _98=mgr==null?null:parseInt(mgr.validator.centurycutoff,10);
if(_91==null||_91.length==0){
return new Date();
}
var mgr=window.parent.clientManager;
if(mgr!=null&&mgr.dateFormat!=null&&mgr.dateFormat.length!=0){
this.format=mgr.dateFormat;
}
while(_92<this.format.length){
var _99=this.format.charAt(_92);
if(_99=="M"||_99=="d"||_99=="y"){
var _9a=_99;
var _9b=1;
_92++;
while(_92<this.format.length&&this.format.charAt(_92)==_9a){
_9b++;
_92++;
}
var _9c=Math.min(_9b,_91.length-_93);
var _9d;
var _9e;
if(_92<this.format.length){
var _9f=this.format.charAt(_92);
if(_9f!="M"&&_9f!="d"&&_9f!="y"){
var _a0=_91.substring(_93).indexOf(_9f);
_9c=Math.min(_9c,_a0);
}
}
_9d=_93+_9c;
_9e=_91.substring(_93,_9d);
_93=_9d;
switch(_99){
case "M":
_95=-1;
for(var idx=0;idx<this.monthNames.length;idx++){
if(this.monthNames[idx].indexOf(_9e)==0){
_95=idx;
break;
}
}
if(_95==-1){
_95=parseInt(_9e,10)-1;
}
break;
case "d":
_96=parseInt(_9e,10);
break;
case "y":
_94=parseInt(_9e,10);
if(_9b==2){
var old=_94;
_94=_94+1900>_98?_94+1900:_94+2000;
}
break;
}
}else{
_92++;
_93++;
}
}
return new Date(_94,_95,_96,0,0,0,0);
};
NXJGrid.prototype.populate=function(_a3){
var _a4=_a3==null;
var _a5=this.main==null?0:gridPixelValueToInt(this.main.scrollTop);
if(_a4){
_a3=this.getPreviewData();
}else{
var _a6=_a3;
_a3=new Array();
for(var row=0;row<_a6.length;row++){
_a3[row]=this.fillInTrimValues(_a6[row],row);
}
}
this.rowIdToIndex=new Object();
this.rowToManagerRow=new Object();
for(var idx=0;idx<_a3.length;idx++){
this.rowIdToIndex[idx]=idx;
this.rowIds[idx]=idx;
this.rowToManagerRow[idx]=idx;
}
if(this.sortColId==-1||(this.dataView&&this.dataView.findCount>0)){
this.populateInternal(_a3);
}else{
this.values=_a3;
this.ascending=!this.ascending;
this.sort(this.colIdToIndex[this.sortColId]);
}
this.main.scrollTop=_a5;
if(_a4){
this.selectRow(0);
}
if(this.deferredRow!=-1&&this.deferredRow<_a3.length&&!window.parent.clientManager.populatingGrid){
this.startEditingCell(this.deferredRow,this.deferredCol);
this.deferredRow=-1;
this.deferredCol=-1;
}
};
NXJGrid.prototype.populateInternal=function(_a9){
var _aa=new Date().valueOf();
var _ab=this.getNamedStyle("grid_header");
this.selectedRow=-1;
this.cells=new Array();
this.values=new Array();
this.nextRowId=_a9.length;
this.isEditingCell=false;
this.outerDiv=document.getElementById(this.outerDivId);
if(!this.horizScrollWidth){
this.outerDiv.style.width="100%";
}
this.outerDiv.style.height="100%";
while(this.outerDiv.childNodes.length!=0){
this.outerDiv.removeChild(this.outerDiv.childNodes[0]);
}
this.root=this.document.createElement("div");
this.root.className="webfxGrid";
this.root.onresize=associateObjWithEvent(this,"resize");
this.outerDiv.parentNode.onresize=associateObjWithEvent(this,"resize");
this.outerDiv.parentNode.onmove=associateObjWithEvent(this,"resize");
if(this.outerDiv.style.borderStyle=="none"){
this.root.style.borderStyle="none";
}
this.main=this.document.createElement("div");
this.main.className="webfxGridMain";
if(!GRID_IS_IE){
this.main.style.width=this.outerDiv.offsetWidth-34;
}else{
this.main.style.width="100%";
}
this.main.style.left=0;
this.main.style.overflowY="auto";
this.main.style.position="absolute";
var _ac=this.getNamedStyle("grid_scrollbar");
if(_ac){
this.main.style.scrollbarBaseColor=_ac.backgroundColor;
this.outerDiv.parentNode.style.scrollbarBaseColor=_ac.backgroundColor;
}
if(!GRID_IS_IE){
this.main.style.overflow="scroll";
this.root.style.position="absolute";
if(this.adjustedHeight){
this.root.style.height=this.adjustedHeight;
}else{
this.root.style.height=(parseInt(this.outerDiv.parentNode.style.height)-2)+"px";
}
this.root.style.width="100%";
}else{
this.root.style.width="100%";
this.root.style.height="100%";
}
var _ad=0;
for(var idx=0;idx<this.columns.length;idx++){
_ad=parseInt(_ad)+parseInt(this.columns[idx].width);
}
this.table=this.document.createElement("table");
this.table.cellSpacing=0;
this.table.cellPadding=0;
this.table.style.top=0;
this.table.style.left=0;
if(GRID_IS_IE){
this.table.style.width="100%";
}else{
this.table.style.width=_ad;
}
this.table.style.position="absolute";
this.table.onclick=associateObjWithEvent(this,"doOnClick");
this.table.ondblclick=associateObjWithEvent(this,"doOnClick");
this.table.onmouseover=associateObjWithEvent(this,"doMouseEnter");
this.table.onmouseout=associateObjWithEvent(this,"doMouseLeave");
this.table.onkeydown=associateObjWithEvent(this,"doKeyDown");
var _af=0;
this.colgroup=this.document.createElement("colgroup");
this.tbody=this.document.createElement("tbody");
this.colgroup.span=this.columns.length;
this.colgroup.style.width="100%";
for(var idx=0;idx<this.columns.length;idx++){
var _b0=this.colIndexToColId[idx];
var col=this.document.createElement("col");
var _b2=this.columns[_b0].width;
col.width=_b2;
_af+=parseInt(col.width);
this.colgroup.appendChild(col);
}
this.table.appendChild(this.colgroup);
for(var _b3=0;_b3<_a9.length;_b3++){
var row=this.document.createElement("tr");
var cls=this.getRowStyle(_b3);
row.className=cls;
if(this.rowHeight){
row.style.height=this.rowHeight+"px";
}
this.cells[_b3]=new Array();
this.values[_b3]=new Array();
for(var col=0;col<this.columns.length;col++){
var _b0=this.colIndexToColId[col];
this.cells[_b3][col]=this.createCell(_b3,col,_b0,_a9[_b3][_b0]);
this.values[_b3][col]=_a9[_b3][_b0];
row.appendChild(this.cells[_b3][col]);
}
this.tbody.appendChild(row);
}
this.table.appendChild(this.tbody);
this.main.appendChild(this.table);
this.root.appendChild(this.main);
var _b6=this.document.createElement("table");
var _b7=this.document.createElement("tbody");
this.header=this.document.createElement("div");
this.headerRow=this.document.createElement("tr");
this.header.style.left=2;
this.header.style.top=0;
this.filler=this.document.createElement("div");
this.filler.style.left=0;
this.filler.style.width=2;
this.filler.style.top=0;
if(window.location.protocol=="https:"){
var _b8="url(https://"+window.location.host+this.tileIcon+")";
this.filler.style.backgroundImage=_b8;
this.header.style.backgroundImage=_b8;
}else{
this.filler.style.backgroundImage="url("+this.tileIcon+")";
this.header.style.backgroundImage="url("+this.tileIcon+")";
}
if(_ab){
this.header.className="grid_header";
this.filler.className="grid_header";
}else{
this.header.className="webfxGridMainHeader";
}
this.header.style.borderWidth=0;
if(_ab&&_ab.borderStyle&&_ab.borderStyle!="none"){
if(_ab.borderLeftWidth){
var _b9=_ab.borderLeftWidth;
var blw=parseInt(_b9);
if(isNaN(blw)){
if(_b9=="thin"){
this.header.style.borderLeftWidth="2px";
}else{
if(_b9=="thick"){
this.header.style.borderLeftWidth="4px";
}else{
this.header.style.borderLeftWidth="3px";
}
}
}else{
this.header.style.borderLeftWidth=blw;
}
}
if(_ab.borderRightWidth){
var _bb=_ab.borderLeftWidth;
var brw=parseInt(_bb);
if(isNaN(brw)){
if(_bb=="thin"){
this.header.style.borderRightWidth="2px";
}else{
if(_bb=="thick"){
this.header.style.borderRightWidth="4px";
}else{
this.header.style.borderRightWidth="3px";
}
}
}else{
this.header.style.borderRightWidth=brw;
}
}
}
_b6.cellSpacing=0;
_b6.cellPadding=0;
if(GRID_IS_IE){
_b6.style.width="100%";
this.header.style.width="100%";
this.headerRow.style.width="100%";
}else{
_b6.style.width=_ad+20;
this.header.style.width=_ad+20;
}
if(!GRID_IS_IE){
var _bd=this.document.createElement("colgroup");
}
for(var idx=0;idx<this.columns.length;idx++){
var _be=this.document.createElement("td");
var _bf=this.document.createElement("noBR");
var _c0=this.document.createElement("span");
var _b0=this.colIndexToColId[idx];
var _b2=this.columns[_b0].width;
var blw=parseInt(this.header.style.borderLeftWidth);
if(!isNaN(blw)){
_b2-=blw;
}
var brw=parseInt(this.header.style.borderRightWidth);
if(!isNaN(brw)){
_b2-=brw;
}
if(GRID_IS_IE){
_be.style.width=_b2;
}else{
var col=this.document.createElement("col");
col.width=_b2;
_bd.appendChild(col);
}
var _c1="";
if(_b0==this.sortColId){
_c1=this.ascending?GRID_ASCENDING_INDICATOR:GRID_DESCENDING_INDICATOR;
}
_be.onselectstart=new Function("return false;");
_be.onmousedown=associateObjWithEvent(this,"doHeaderDown");
_be.onmouseup=associateObjWithEvent(this,"doHeaderUp");
_be.onmousemove=associateObjWithEvent(this,"doHeaderMove");
_be.title=this.columns[_b0].toolTip;
_bf.title=this.columns[_b0].toolTip;
_c0.title=this.columns[_b0].toolTip;
_bf.style.width=_b2;
_bf.style.overflow="hidden";
_bf.innerHTML=this.columns[_b0].visible[0]==false?"":this.columns[_b0].title;
this.setInnerText(_c0,_c1);
_be.appendChild(_bf);
_bf.appendChild(_c0);
if(_ab){
_be.className="grid_header";
_be.style.borderLeftWidth=this.header.style.borderLeftWidth;
_be.style.borderRightWidth=this.header.style.borderRightWidth;
}
this.headerRow.appendChild(_be);
}
_b7.appendChild(this.headerRow);
if(!GRID_IS_IE){
_b6.appendChild(_bd);
}
_b6.appendChild(_b7);
this.header.appendChild(_b6);
this.root.appendChild(this.header);
this.root.appendChild(this.filler);
if(!GRID_IS_IE){
this.header.style.borderBottomStyle="none";
var _c2=this.headerRow.childNodes[this.headerRow.childNodes.length-1];
var _c3=this.document.createElement("td");
var _bf=this.document.createElement("noBR");
var _c0=this.document.createElement("span");
_c2.style.borderRightWidth=0;
_c3.style.borderLeftWidth=0;
var col=this.document.createElement("col");
col.width=20;
_bd.appendChild(col);
_c3.appendChild(_bf);
_c3.appendChild(_c0);
this.headerRow.appendChild(_c3);
}
this.outerDiv.appendChild(this.root);
var _c4;
if(this.hasCheckbox&&this.clientManager){
for(var _b3=0;_b3<_a9.length;_b3++){
for(var col=0;col<this.columns.length;col++){
var _b0=this.colIndexToColId[col];
if(this.columns[_b0].controlType==GRID_CHECKBOX){
_c4=this.values[_b3][col];
if(this.deferredClick&&this.deferredClick.row==_b3&&this.deferredClick.col==col){
_c4=this.deferredClick.value;
this.deferredClick=null;
}
this.clientManager.setValue(this.cells[_b3][col].childNodes[0],_c4);
}
}
}
}
this.rendered=true;
if(!GRID_IS_IE){
this.resize();
}
var _c5=new Date().valueOf();
return this.rowIds;
};
NXJGrid.prototype.saveState=function(){
var _c6=new Object();
if(window.parent.saveBlocks==null){
window.parent.saveBlocks=new Object();
}
window.parent.saveBlocks[this.outerDivId]=_c6;
_c6.sortColId=this.sortColId;
_c6.ascending=this.ascending;
_c6.colIdToIndex=this.colIdToIndex;
_c6.widths=new Array();
for(var _c7=0;_c7<this.columns.length;_c7++){
_c6.widths[_c7]=this.columns[_c7].width;
}
};
NXJGrid.prototype.scrollRowIntoView=function(_c8){
if(!this.tbody.childNodes||this.tbody.childNodes.length==0){
return;
}
var row=this.tbody.childNodes[_c8];
var _ca=gridPixelValueToInt(row.offsetHeight);
var _cb=_c8*_ca;
var _cc=_cb+_ca-1;
var _cd=gridPixelValueToInt(this.main.scrollTop);
var _ce=_cd+gridPixelValueToInt(this.main.offsetHeight)-1;
var _cf=this.root.offsetHeight-this.header.offsetHeight;
var _d0=Math.floor(_cf/_ca);
if(_cb<_cd){
this.main.scrollTop=_cb;
}else{
if(_cc>_ce){
this.main.scrollTop=_cb-(_d0-1)*_ca;
}
}
};
NXJGrid.prototype.selectCell=function(_d1,_d2){
var _d3=this.nameToColumnId(_d2);
this.startEditingCell(this.rowIdToIndex[_d1],this.colIdToIndex[_d3]);
};
NXJGrid.prototype.selectRow=function(_d4){
var row=this.rowIdToIndex[_d4];
if(row==null){
return;
}
if(row==null||this.selectedRow==row){
if(row!=null&&this.cells[row][0].className!=this.selRowStyle){
for(var col=0;col<this.columns.length;col++){
this.setCellClass(row,col,this.selRowStyle);
}
}
this.scrollRowIntoView(row);
return;
}
this.selectRowFromIndex(row);
};
NXJGrid.prototype.selectRowFromIndex=function(row){
if(this.selectedRow!=-1){
var cls=this.getRowStyle(this.selectedRow);
for(var col=0;col<this.columns.length;col++){
this.setCellClass(this.selectedRow,col,cls);
}
}
this.selectedRow=row;
for(var col=0;col<this.columns.length;col++){
this.setCellClass(this.selectedRow,col,this.selRowStyle);
}
this.scrollRowIntoView(row);
};
NXJGrid.prototype.deselectRow=function(){
if(this.selectedRow!=-1){
var cls=this.getRowStyle(this.selectedRow);
for(var col=0;col<this.columns.length;col++){
this.setCellClass(this.selectedRow,col,cls);
}
}
};
NXJGrid.prototype.reselectRow=function(){
if(this.selectedRow!=-1){
for(var col=0;col<this.columns.length;col++){
this.setCellClass(this.selectedRow,col,this.selRowStyle);
}
}
};
NXJGrid.prototype.setCellClass=function(row,col,_df){
if(row<this.cells.length){
var _e0=this.cells[row][col];
this.setClassRecursively(_e0,_df);
}
};
NXJGrid.prototype.setCellValue=function(_e1,_e2,_e3){
var _e4=this.nameToColumnId(_e2);
var row=this.rowIdToIndex[_e1];
var col=this.colIdToIndex[_e4];
var _e7=this.cells[row][col];
var _e8=this.createCell(row,col,_e4,this.values[row][col]);
var _e9=_e7.getParentNode();
this.values[row][col]=_e3;
this.cells[row][col]=_e8;
_e9.replaceChild(_e8,_e7);
};
NXJGrid.prototype.setColListData=function(_ea,_eb){
var _ec=this.nameToColumnId(_ea);
this.columns[_ec].comboValues=new Array();
this.columns[_ec].options=new Array();
var len=_eb.length/2;
for(var idx=0;idx<len;idx++){
var _ef=_eb[2*idx];
var _f0=_eb[2*idx+1];
this.columns[_ec].comboValues[idx]=_ef+"="+_f0;
this.columns[_ec].options[idx]=new Option(_ef,_f0,false,false);
}
if(this.isEditingCell&&_ec==this.colIndexToColId[this.editCol]){
var _f1=this.values[this.editRow][this.editCol];
if(this.editor==this.combo){
var _f2=this.columns[_ec];
var _f3=-1;
this.combo.options.length=0;
if(_f2.options.length!=0){
this.combo.options.length=_f2.options.length;
}
for(var idx=0;idx<this.combo.options.length;++idx){
if(this.combo.options[idx].text!=_f2.options[idx].text){
this.combo.options[idx].text=_f2.options[idx].text;
}
if(this.combo.options[idx].value!=_f2.options[idx].value){
this.combo.options[idx].value=_f2.options[idx].value;
}
if(_f2.options[idx].value==_f1){
_f3=idx;
}
}
this.combo.selectedIndex=_f3;
}else{
if(this.editor==this.ecombo&&this.ecombo.setOptions){
var _f4="";
for(var idx=0;idx<_eb.length-1;idx+=2){
if(idx!=0){
_f4+=";";
}
_f4+=_eb[idx]+"="+_eb[idx+1];
}
this.ecombo.setOptions(_f4);
this.ecombo.setValue(_f1);
}
}
}
};
NXJGrid.prototype.setRowValues=function(_f5,_f6){
this.cancelEditingCell();
var _f7=this.rowIdToIndex[_f5];
if(typeof (_f7)=="undefined"||!this.tbody.childNodes||!this.tbody.childNodes.length){
return;
}
_f6=this.fillInTrimValues(_f6,_f7);
var row=this.tbody.childNodes[_f7];
var _f9;
for(var _fa=0;_fa<this.columns.length;_fa++){
var _fb=this.colIndexToColId[_fa];
var _fc=this.cells[_f7][_fa];
if(_fc!=row.childNodes[_fa]){
alert("mismatch old = "+_fc.outerHTML+"\nchild = "+row.childNodes[_fa]);
return;
}
this.cells[_f7][_fa]=this.createCell(_f7,_fa,_fb,_f6[_fb]);
this.values[_f7][_fa]=_f6[_fb];
row.replaceChild(this.cells[_f7][_fa],_fc);
if(this.columns[_fb].controlType==GRID_CHECKBOX&&this.cells[_f7][_fa].childNodes.length){
_f9=this.values[_f7][_fa];
if(this.deferredClick&&this.deferredClick.row==_f7&&this.deferredClick.col==_fa){
_f9=this.deferredClick.value;
this.deferredClick=null;
}
this.clientManager.setValue(this.cells[_f7][_fa].childNodes[0],_f9);
}
}
};
NXJGrid.prototype.setStyleInfo=function(_fd,_fe){
var _ff=this.nameToColumnId(_fd);
var desc=this.columns[_ff];
var _101=desc.visible;
var _102=desc.style;
desc.style=new Array();
desc.className=new Array();
desc.visible=new Array();
for(var idx=0;idx<_fe.length;idx++){
if(!_fe[idx]){
continue;
}
var _104=_fe[idx];
var _105=_104.styleClass;
var _106=_104.fgColor;
var _107=_104.bgColor;
var _108=_104.fontFamily;
var _109=_104.fontSize;
var _10a=_104.fontWeight;
var _10b=_104.fontStyle;
var _10c=_104.isVisible;
var _10d="";
if(_106&&_106.length!=0){
_10d="color: "+_104.fgColor;
}
if(_107&&_107.length!=0){
if(_10d.length!=0){
_10d+=";";
}
_10d+="background-color: "+_107;
}
if(_108&&_108.length!=0){
if(_10d.length!=0){
_10d+=";";
}
_10d+="font-family: "+_108;
}
if(_109&&_109.length!=0){
if(_10d.length!=0){
_10d+=";";
}
_10d+="font-size: "+_109;
}
if(_10a&&_10a.length!=0){
if(_10d.length!=0){
_10d+=";";
}
_10d+="font-weight: "+_10a;
}
if(_10b&&_10b.length!=0){
if(_10d.length!=0){
_10d+=";";
}
_10d+="font-style: "+_10b;
}
var _10e=getSparseArrayIndex(_102,idx);
var _10f=_102[_10e];
if(_10f){
var _110=_10f.indexOf("text-align");
if(_110!=-1){
_10d+=";";
var _111=_10f.substring(_110);
var semi=_111.indexOf(";");
if(semi!=-1){
_111=_111.substring(0,semi);
}
_10d+=_111;
}
}
desc.style[idx]=_10d;
desc.className[idx]=_105;
desc.visible[idx]=_10c;
}
var idx=this.colIdToIndex[_ff];
if(this.cells!=null){
var tt;
for(var row=0;row<this.cells.length;row++){
var _115=this.rowToManagerRow[row];
_115=getSparseArrayIndex(desc.style,_115);
_105=desc.className[_115];
style=desc.style[_115];
var _116=this.rowToManagerRow[row];
_116=getSparseArrayIndex(_102,_116);
if(_101[_116]!=desc.visible[_115]){
var _117=this.cells[row][idx];
var _118=this.createCell(row,idx,_ff,this.values[row][idx]);
var _119=_117.parentNode;
this.cells[row][idx]=_118;
_119.replaceChild(_118,_117);
}
if(row!=this.selectedRow){
this.cells[row][idx].className=_105;
}
tt=this.cells[row][idx].style.textTransform;
this.cells[row][idx].style.cssText=style;
if(tt){
this.cells[row][idx].style.textTransform=tt;
}
}
}
};
NXJGrid.prototype.updateColumnStyle=function(_11a){
var _11b=this.nameToColumnId(_11a.name);
if(_11b==-1){
return;
}
var _11c=this.columns[_11b];
var _11d=_11c.style;
var _11e=_11a.justification=="R"?"right":(_11a.justification=="C"?"center":"left");
var _11f=_11a.caseConversion=="U"?"uppercase":(_11a.caseConversion=="L"?"lowercase":"");
var _120=new Array();
for(var _121=0;_121<_11d.length;_121++){
var _122=_11d[_121];
if(!_122){
continue;
}
var _123=true;
if(_122.indexOf("text-align")==-1){
_122+="text-align:"+_11e+";";
_123=false;
}
var _124=true;
if(_122.indexOf("text-transform")==-1&&_11f!=""){
_122+="text-transform:"+_11f+";";
_124=false;
}
if(_123||_124){
var _125="";
var _126=_122.split(";");
for(var idx=0;idx<_126.length;idx++){
if(_123&&_126[idx].indexOf("text-align")!=-1){
_126[idx]="text-align:"+_11e;
}else{
if(_124&&_126[idx].indexOf("text-transform")!=-1){
_126[idx]="text-transform:"+_11f;
}
}
_125+=_126[idx]+";";
}
}else{
_125=_122;
}
_120[_121]=_125;
}
_11c.style=_120;
var idx=this.colIdToIndex[_11b];
if(this.cells!=null){
for(var row=0;row<this.cells.length;row++){
var _129=this.rowToManagerRow[row];
_129=getSparseArrayIndex(_11c.style,_129);
style=_11c.style[_129];
this.cells[row][idx].style.cssText=style;
}
}
};
NXJGrid.prototype.sort=function(_12a){
var _12b=this.colIndexToColId[_12a];
if(_12b==this.sortColId){
this.ascending=!this.ascending;
}else{
this.sortColId=_12b;
}
var keys=new Array();
var type=this.columns[_12b].dataType;
var _12e;
for(var _12f in this.rowIdToIndex){
if(_12f=="extend"){
continue;
}
var row=this.rowIdToIndex[_12f];
var _131=this.rowToManagerRow[row];
var key=this.values[row][_12a];
keys[keys.length]=new GridSortKey(this,key,row,_12f,_131,this.ascending,type);
if(row==this.selectedRow){
_12e=_12f;
}
}
keys.sort(gridCompare);
var _133=new Array();
this.rowIdToIndex=new Object();
this.rowToManagerRow=new Object();
for(var idx=0;idx<keys.length;idx++){
var row=keys[idx].row;
var _131=keys[idx].managerRow;
var _12f=keys[idx].rowId;
this.rowIdToIndex[_12f]=idx;
this.rowToManagerRow[idx]=_131;
var _135=new Array();
var _136=this.values[row];
if(this.clientManager&&this.clientManager.populatingGrid){
_135=_136;
}else{
for(var col=0;col<_136.length;col++){
var _12b=this.colIndexToColId[col];
_135[_12b]=_136[col];
}
}
_133[idx]=_135;
}
this.populateInternal(_133);
if(!GRID_IS_IE){
this.resize();
}
this.selectedRow=-1;
if(typeof (_12e)=="undefined"){
this.selectRowFromIndex(0);
for(var _12f in this.rowIdToIndex){
if(_12f=="extend"){
continue;
}
if(this.rowIdToIndex[_12f]==0){
_12e=_12f;
break;
}
}
}else{
this.selectRow(_12e);
}
if(this.editCol!=-1&&this.clientManager&&this.onShow&&!this.clientManager.populatingGrid){
var _138=this.rowIdToIndex[_12e];
var mgr=this.clientManager;
var _13a=this.dataView.currentRowModified;
this.dataView.currentRowModified=false;
mgr.onListChangeTo(this.dataView,this.rowToManagerRow[_138]);
this.dataView.currentRowModified=_13a;
this.startEditingCell(_138,this.editCol);
}
var _13b=this.headerRow.childNodes[_12a].getElementsByTagName("SPAN");
if(_13b.length){
this.setInnerText(_13b[0],this.ascending?GRID_ASCENDING_INDICATOR:GRID_DESCENDING_INDICATOR);
}
};
NXJGrid.prototype.sortFromEvent=function(_13c){
if(!this.columnsSortable){
return;
}
if(GRID_IS_IE){
_13c=window.event;
}
var elmt=gridGetElementFromEvent(_13c);
while(elmt.tagName.toLowerCase()!="td"){
elmt=elmt.parentNode;
}
var _13e=this.colIndexToColId[elmt.cellIndex];
var desc=this.columns[_13e];
if(desc.visible[0]!=false){
if(this.dataView&&this.clientManager&&this.dataView.findCount>0){
if(_13e==this.sortColId){
this.ascending=!this.ascending;
}else{
this.sortColId=_13e;
}
var mgr=this.clientManager;
var cmd="nxjSortByColumn";
if(this.dataView.name!=mgr.formName){
cmd=this.dataView.name+":"+cmd;
}
mgr.doCommandInternal(cmd,mgr.currentFieldId,this.dataView.currentRow,null,desc.fieldId);
}else{
this.sort(elmt.cellIndex);
}
}
};
NXJGrid.prototype.startEditingCell=function(row,col){
if(row==null||col==null||row>=this.cells.length||col>=this.columns.length){
return;
}
var _144=this.colIndexToColId[col];
var desc=this.columns[_144];
if(this.isEditingCell&&row==this.editRow&&col==this.editCol){
if(desc.controlType==GRID_DATE_PICKER){
var text=this.picker.getElementsByTagName("INPUT");
if(text&&text.length){
text[0].focus();
}
}else{
if(desc.controlType==GRID_COMBO){
this.editor.focus();
}else{
if(desc.controlType==GRID_EDITABLE_COMBO){
this.editor.combo.text.focus();
}else{
this.editor.focus();
}
}
}
return;
}
if(this.isEditingCell){
if(!this.stopEditingCell()){
return;
}
}
if(this.editor){
this.editor.autoCompleteObj=null;
}
if(row!=this.editRow){
if(this.deferredRow==-1&&this.editRow!=-1&&this.dataView!=null&&!this.dataView.isBatch&&((this.dataView.isImmediate&&this.clientManager.focusType!=3)||(this.dataView.hasNextOrPrev&&this.dataView.currentRowModified))&&this.onShow!=null){
var _144=this.colIndexToColId[col];
this.cancelEditingCell();
if(!this.onShow(this.clientManager,this.dataView,this.rowToManagerRow[row],col,this.columns[_144].fieldId)){
return;
}
this.deferredRow=row;
this.deferredCol=col;
return;
}
this.selectRowFromIndex(row);
}
var _147=this.values[row][col];
var cell=this.cells[row][col];
var _149;
var _14a=this.rowToManagerRow[row];
var _14b=getSparseArrayIndex(desc.style,_14a);
if(desc.visible[_14b]==false||!desc.stopForInput){
return;
}
var _14c=true;
var mgr=this.clientManager;
if(mgr&&mgr.fieldDescriptors){
var _14e=mgr.fieldDescriptors[mgr.currentFieldId];
if(_14e&&((_14e.flags&128)==0||_14e.dataViewName!=this.dataView.name)){
if(!mgr.accept()){
return;
}
}
var fidx=mgr.findName(desc.fieldId);
if(typeof (fidx)!="undefined"){
if((mgr.fieldDescriptors[fidx].flags&16)==0||(mgr.fieldDescriptors[fidx].flags&32)==0){
_14c=false;
if(desc.controlType==GRID_CHECKBOX||(mgr.fieldDescriptors[fidx].flags&32)==0){
if(!this.onShow(this.clientManager,this.dataView,this.rowToManagerRow[row],col,desc.fieldId)){
this.cancelEditingCell();
}
return;
}
}
}
}
var _150=desc.style[_14b];
var _151=-1;
if(_150){
_151=_150.indexOf("ime-mode:");
}
var _152="auto";
if(_151!=-1){
_151+="ime-mode".length;
var tail=_150.substring(_151+1);
var end=tail.indexOf(";");
_152=end==-1?tail:tail.substring(0,end);
if(_152=="null"){
_152="auto";
}
}
if(desc.controlType==GRID_COMBO){
var _155=-1;
if(_14c){
_149=this.combo;
}
this.combo.options.length=0;
if(desc.options.length!=0){
this.combo.options.length=desc.options.length;
}
var _156=_147;
for(var idx=0;idx<this.combo.options.length;++idx){
if(this.combo.options[idx].text!=desc.options[idx].text){
this.combo.options[idx].text=desc.options[idx].text;
}
if(this.combo.options[idx].value!=desc.options[idx].value){
this.combo.options[idx].value=desc.options[idx].value;
}
if(desc.options[idx].value==_147){
_155=idx;
_156=desc.options[idx].text;
}
}
this.combo.selectedIndex=_155;
_147=_156;
}else{
if(desc.controlType==GRID_EDITABLE_COMBO){
if(_14c){
_149=this.ecombo;
}
this.ecombo.style.width=GRID_IS_IE?cell.clientWidth:cell.offsetWidth;
this.ecombo.style.height=20;
var _14b=this.rowToManagerRow[row];
_14b=getSparseArrayIndex(desc.style,_14b);
if(GRID_IS_IE){
new NXJCombo(this.ecombo,desc.className[_14b],desc.style[_14b],desc.comboValues,this.iconDir,this.outerDiv);
this.ecombo.setValue(_147);
_147=this.ecombo.combo.text.value;
}
}
}
if(desc.controlType==GRID_DATE_PICKER&&_14c){
_149=this.picker;
this.picker.style.width=GRID_IS_IE?cell.clientWidth:cell.offsetWidth;
this.picker.style.height=20;
}else{
if(desc.controlType==GRID_TEXTAREA){
_149=this.textarea;
_149.value=_147;
_149.readOnly=!_14c;
}else{
if(desc.controlType==GRID_PASSWORD){
_149=this.password;
this.password.value=this.getPasswordDisplayValue(_147);
this.password.classNem=cell.classNem;
this.password.style.imeMode=_152;
_149.readOnly=!_14c;
}else{
if(desc.controlType==GRID_TEXTFIELD||!_14c){
if(GRID_IS_IE){
this.createBoxEditor();
}
_149=this.box;
this.box.value=_147;
this.box.className=cell.className;
this.box.style.imeMode=_152;
this.box.removeAttribute("maxLength");
_149.readOnly=!_14c;
}else{
if(desc.controlType==GRID_CHECKBOX){
if(cell.childNodes.length==0){
return;
}
this.editor=cell.childNodes[0];
this.editor.focus();
this.editRow=row;
this.editCol=col;
this.isEditingCell=true;
if(!this.onShow(this.clientManager,this.dataView,this.rowToManagerRow[row],col,desc.fieldId)){
this.cancelEditingCell();
}else{
if(GRID_IS_IE){
this.editor.blur();
this.editor.focus();
}
}
return;
}else{
if(desc.controlType!=GRID_EDITABLE_COMBO&&desc.controlType!=GRID_COMBO){
return;
}
}
}
}
}
}
this.savedInnerText=GRID_IS_IE?this.cells[row][col].innerText:this.cells[row][col].innerHTML;
this.editRow=row;
this.editCol=col;
this.isEditingCell=true;
this.editor=_149;
_149.className=cell.className;
_149.style.cssText=cell.style.cssText;
if(GRID_IS_IE){
_149.style.fontSize=cell.currentStyle.fontSize;
_149.style.fontFamily=cell.currentStyle.fontFamily;
}else{
var _158=document.defaultView.getComputedStyle(cell,"");
_149.style.fontSize=_158.getPropertyValue("font-size");
_149.style.fontFamily=_158.getPropertyValue("font-family");
}
_149.style.borderStyle="none";
_149.style.position="absolute";
_149.style.left=cell.offsetLeft;
_149.style.top=cell.offsetTop;
_149.style.width=GRID_IS_IE?(col==0?cell.clientWidth-1:cell.clientWidth):cell.offsetWidth-1;
_149.style.height=GRID_IS_IE?(row==0?cell.clientHeight-1:cell.clientHeight):this.rowHeight-1;
_149.style.color=this.editCellFG;
_149.style.backgroundColor=this.editCellBG;
if(cell.nxjInvalid){
if(row==0){
_149.style.borderTopStyle="solid";
_149.style.borderTopColor=this.clientManager.form.errborder;
_149.style.borderTopWidth="1px";
}
if(row==this.cells.length-1){
_149.style.borderBottomStyle="solid";
_149.style.borderBottomColor=this.clientManager.form.errborder;
_149.style.borderBottomWidth="1px";
}
}
if(!GRID_IS_IE){
cell.innerHTML="";
}
cell.appendChild(_149);
if(desc.controlType==GRID_DATE_PICKER&&_14c){
var _14b=this.rowToManagerRow[row];
_14b=getSparseArrayIndex(desc.style,_14b);
var _159=new NXJDatePicker(this.picker.id,desc.className[_14b],desc.style[_14b],this.systemIconBase,this.projectIconBase,desc.dateHeaderFG,desc.dateHeaderBG,this.days,this.months);
_159.fieldId=desc.fieldId;
_159.acceptHook=associateObjWithEvent(this,"doApplyDate");
if(GRID_IS_IE){
_159.div.focus();
}else{
this.scrollRowIntoView(row);
}
_159.text.focus();
this.picker.setValue(_147);
_159.text.select();
}else{
if(desc.controlType==GRID_COMBO&&_14c){
_149.selectedIndex=_155;
_149.focus();
_149.blur();
_149.focus();
}else{
if(GRID_IS_IE){
_149.focus();
}
}
}
if(!GRID_IS_IE&&desc.controlType!=GRID_DATE_PICKER){
this.scrollRowIntoView(row);
}
if(desc.controlType==GRID_EDITABLE_COMBO&&_14c){
if(!GRID_IS_IE){
new NXJCombo(this.ecombo,desc.className[_14b],desc.style[_14b],desc.comboValues,this.iconDir,this.outerDiv);
this.ecombo.setValue(_147);
}
_149.combo.text.focus();
_149.combo.text.select();
}else{
if((desc.controlType==GRID_TEXTFIELD||desc.controlType==GRID_PASSWORD)&&mgr&&mgr.fieldDescriptors){
this.editor.onkeyup=null;
var fidx=mgr.findName(desc.fieldId);
if(typeof (fidx)!="undefined"){
var _15a=mgr.fieldDescriptors[fidx];
if(!mgr.getDataView(_15a.dataViewName).find){
if((_15a.flags&1)!=0){
this.editor.onkeyup=associateObjWithEvent(this,"doEditorKeyUp");
}
this.editor.maxLength=_15a.fieldWidth;
}else{
this.editor.removeAttribute("maxLength");
}
if(_15a.justification=="R"){
_149.style.textAlign="right";
}else{
if(_15a.justification=="L"){
_149.style.textAlign="left";
}else{
if(_15a.justification=="C"){
_149.style.textAlign="center";
}
}
}
}
}
}
if(_149==this.box){
if(_14c){
try{
_149.select();
}
catch(e){
}
}else{
if(!GRID_IS_IE){
_149.focus();
}else{
try{
var tr=_149.createTextRange();
tr.setEndPoint("StartToStart",tr);
}
catch(e){
}
}
}
}
if(this.onShow!=null){
var _144=this.colIndexToColId[col];
if(!this.onShow(this.clientManager,this.dataView,this.rowToManagerRow[row],col,this.columns[_144].fieldId)){
this.cancelEditingCell();
return;
}
}
if(_149==this.box||_149==this.textarea){
try{
_149.focus();
var grid=this;
var _15d=function(){
if(GRID_IS_IE){
grid.scrollRowIntoView(row);
}else{
grid.editor.focus();
}
};
window.setTimeout(_15d,0);
}
catch(e){
}
}
};
NXJGrid.prototype.stopEditingCell=function(){
if(!this.isEditingCell){
return true;
}
var cell=this.cells[this.editRow][this.editCol];
var _15f=this.values[this.editRow][this.editCol];
var _160;
var _161;
var _162=this.colIndexToColId[this.editCol];
var type=this.columns[_162].controlType;
if(this.editor==this.box&&this.editor.readOnly){
cell.rejected=false;
this.savedInnerText=this.box.value;
this.cancelEditingCell();
return true;
}
if(type==GRID_COMBO){
var idx=this.combo.selectedIndex;
_160=idx==-1?"":this.combo.options[idx].value;
_161=idx==-1?"":this.combo.options[idx].text;
}else{
if(type==GRID_EDITABLE_COMBO){
_160=this.ecombo.getValue();
_161=this.ecombo.combo.text.value;
}else{
if(type==GRID_DATE_PICKER){
_160=this.picker.getValue();
_161=_160;
}else{
if(type==GRID_CHECKBOX){
_160=this.clientManager.getValue(cell.childNodes[0]);
_161=_160;
}else{
if(type==GRID_PASSWORD){
_160=this.password.value;
_161=this.getPasswordDisplayValue(_160);
}else{
if(type==GRID_TEXTAREA){
_160=this.textarea.value;
_161=_160;
}else{
_160=this.box.value;
_161=_160;
}
}
}
}
}
}
if(this.beforeChange!=null&&(_15f!=_160||cell.rejected)){
var _165=this.beforeChange(this.clientManager,this.dataView,_160);
if(_165==null){
cell.rejected=true;
return false;
}
_160=_165;
if(type==GRID_PASSWORD){
_161=this.getPasswordDisplayValue(_165);
}else{
if(type!=GRID_COMBO&&type!=GRID_EDITABLE_COMBO){
_161=_165;
}
}
}
cell.rejected=false;
this.values[this.editRow][this.editCol]=_160;
this.savedInnerText=_161;
this.cancelEditingCell();
return true;
};
NXJGrid.prototype.setClassRecursively=function(elmt,_167){
elmt.className=_167;
if((elmt.tagName=="TD"&&elmt.childNodes.length==1&&elmt.childNodes[0].tagName=="INPUT"&&elmt.childNodes[0].type=="checkbox")||elmt.tagName=="SPAN"){
var _168=this.getNamedStyle(_167);
if(_168.backgroundColor){
elmt.style.backgroundColor=_168.backgroundColor;
}
}
for(var idx=0;idx<elmt.childNodes.length;idx++){
var _16a=elmt.childNodes[idx];
if(_16a.tagName){
this.setClassRecursively(_16a,_167);
}
}
};
NXJGrid.prototype.setInnerText=function(elmt,_16c){
if(GRID_IS_IE){
elmt.innerText=_16c;
}else{
elmt.innerHTML=_16c;
}
};
NXJGrid.prototype.doApplyDate=function(_16d,_16e){
if(!this.stopEditingCell()){
return false;
}
this.handleAutoAccept();
return true;
};
NXJGrid.prototype.handleAutoAccept=function(){
var _16f=this.colIndexToColId[this.editCol];
var _170=this.columns[_16f];
if(typeof (_170.isAutoAccept)=="undefined"&&this.clientManager&&this.clientManager.fieldDescriptors){
_170.isAutoAccept=false;
var _171=this.clientManager.fieldDescriptors;
for(idx=0;idx<_171.length;idx++){
if(_171[idx].name==_170.fieldId){
if((_171[idx].flags&1)!=0){
_170.isAutoAccept=true;
}
break;
}
}
}
if(_170.isAutoAccept){
var _172=new Object();
_172.keyCode=GRID_TAB_KEY;
_172.srcElement=this.cells[this.editRow][this.editCol];
if(this.clientManager.delayedFieldOK){
this.clientManager.delayedFieldOK=null;
}
_172.target=_172.srcElement;
this.doEditorKeyDown(_172,_172.target);
}else{
this.startEditingCell(this.editRow,this.editCol);
}
};
NXJGrid.prototype.resize=function(){
if(!window.parent.clientManager||window.parent.clientManager.doingCommand||window.parent.clientManager.populatingGrid){
if(window.parent.clientManager&&window.parent.clientManager.populatingGrid){
var _173=associateObjWithEvent(this,"resize");
window.setTimeout(_173,0);
}
return false;
}
this.header.style.top=0;
this.header.style.left=2;
var _174=this.header.offsetHeight;
if(_174==0){
_174=16;
}
this.main.style.top=_174;
var _175=this.outerDiv.parentNode.offsetHeight;
if(_175==0){
_175=parseInt(this.outerDiv.style.height);
}
var _176=null;
if(this.navbar&&(_176=this.getFirstChild(this.navbar))!=null&&_176.style.visibility!="hidden"){
var gap=GRID_IS_IE?20:40;
_175=Math.max(this.outerDiv.parentNode.offsetHeight-this.navbar.offsetHeight-gap,50);
this.outerDiv.style.height=_175;
this.navbar.style.top=this.outerDiv.offsetTop+_175+10;
}
if(!GRID_IS_IE){
if(this.adjustedHeight){
this.root.style.height=this.adjustedHeight;
}
}else{
this.main.style.height=_175-_174;
}
if(!GRID_IS_IE){
}
this.table.style.left=0;
if(this.table.clientHeight>this.main.clientHeight){
this.header.style.width=this.main.clientWidth;
this.root.style.backgroundColor=this.header.style.backgroundColor;
this.root.style.backgroundImage=this.header.style.backgroundImage;
}else{
this.table.style.width=this.main.clientWidth;
this.header.style.width=this.main.clientWidth;
this.root.style.backgroundColor="transparent";
this.root.style.backgroundImage="";
}
var blw=parseInt(this.header.style.borderLeftWidth);
var brw=parseInt(this.header.style.borderRightWidth);
var _17a=Math.min(this.colgroup.childNodes.length,this.headerRow.childNodes.length);
for(var idx=0;idx<_17a;idx++){
var wid=this.colgroup.childNodes[idx].offsetWidth;
if(wid>0){
if(!isNaN(blw)&&wid>blw){
wid-=blw;
}
if(!isNaN(brw)&&wid>brw){
wid-=brw;
}
}
this.headerRow.childNodes[idx].style.width=wid;
}
if(this.tbody.childNodes.length!=0){
var row=this.tbody.childNodes[0];
var _17e=row.offsetHeight;
if(_17e==0){
_17e=21;
}
var _17f;
if(GRID_IS_IE){
var _17f=this.main.offsetHeight;
if(_17f==0){
_17f=parseInt(this.main.style.height);
}
}else{
var _17f=this.outerDiv.offsetHeight;
if(_17f==0){
_17f=parseInt(this.outerDiv.style.height);
}
}
var _180=Math.floor(_17f/_17e);
if(!GRID_IS_IE&&_180>1){
_180--;
}
var _181=_180*_17e;
if(GRID_IS_IE){
_181+=2;
}
if(_17f!=_181&&this.outerDiv.parentNode.style.height.indexOf("%")==-1){
if(!GRID_IS_IE){
this.root.style.height=_181+_174-2;
if(this.root.offsetHeight){
this.adjustedHeight=this.root.style.height;
}
this.main.style.height=_181;
}else{
if(this.horizScrollWidth){
this.outerDiv.parentNode.style.height=_181+32;
}
this.main.style.height=_181;
this.root.style.height=_181+_174+2;
}
}
if(this.isEditingCell&&this.editor&&this.editor.type!="checkbox"){
var cell=this.cells[this.editRow][this.editCol];
this.editor.style.left=cell.offsetLeft;
this.editor.style.width=cell.clientWidth;
}
}
return true;
};
function gridCompare(key1,key2){
var _185;
if(key1.key<key2.key){
_185=-1;
}else{
if(key1.key==key2.key){
if(key1.row<key2.row){
return -1;
}else{
if(key1.row==key2.row){
_185=0;
}else{
return +1;
}
}
}else{
_185=+1;
}
}
return key1.ascending?_185:-_185;
}
NXJGrid.prototype.doOnClick=function(_186,_187){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_186);
if(elmt.tagName=="TD"){
var row=elmt.parentNode.rowIndex;
var col=elmt.cellIndex;
var _18b=this.colIndexToColId[col];
var type=this.columns[_18b].controlType;
if(type==GRID_TEXTFIELD||type==GRID_COMBO||type==GRID_EDITABLE_COMBO||type==GRID_PASSWORD||type==GRID_DATE_PICKER||type==GRID_TEXTAREA){
this.startEditingCell(row,col);
}
}else{
if(elmt.tagName=="INPUT"&&elmt.type=="checkbox"){
var cell=elmt.parentNode;
var row=cell.parentNode.rowIndex;
var col=cell.cellIndex;
var _18e=row!=this.editRow;
if(!this.stopEditingCell()){
return false;
}
var mgr=window.parent.clientManager;
if(mgr){
var _18b=this.colIndexToColId[col];
var fidx=mgr.findName(this.columns[_18b].fieldId);
if(typeof (fidx)!="undefined"){
var _191=mgr.fieldDescriptors[fidx];
if((_191.flags&32)==0||(_191.flags&16)==0){
if(this.editCol>=0){
this.startEditingCell(row,this.editCol);
}else{
this.selectRowFromIndex(row);
}
return false;
}
}
}
this.startEditingCell(row,col);
if(!this.isEditingCell){
if(this.clientManager.doingCommand&&_18e){
var mgr=this.clientManager;
this.deferredClick=new Object();
this.deferredClick.value=mgr.getValue(elmt);
this.deferredClick.row=row;
this.deferredClick.col=col;
var name=elmt.name;
var _193=name.lastIndexOf(".");
name=name.substring(0,_193+1);
var desc;
for(var idx=0;idx<mgr.fieldDescriptors.length;idx++){
desc=mgr.fieldDescriptors[idx];
if(desc.name==name){
if(desc.field){
mgr.setValue(desc.field,mgr.getValue(elmt));
window.parent.mainManager.delayClickField=desc.field;
}
break;
}
}
}
return true;
}
var _196=elmt.value=="on"?"true":"false";
if(this.beforeChange!=null){
var _197=this.beforeChange(this.clientManager,this.dataView,_196);
if(_197==null){
return false;
}
_196=_197;
}
this.values[row][col]=_196;
this.handleAutoAccept();
}
}
return true;
};
NXJGrid.prototype.doComboChange=function(_198,_199){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
if(!this.tabEvent){
this.stopEditingCell();
this.handleAutoAccept();
}
this.tabEvent=null;
return true;
};
NXJGrid.prototype.doEditorKeyDown=function(_19a,_19b){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var key=_19a.keyCode;
var elmt=gridGetElementFromEvent(_19a);
if(this.clientManager&&(this.clientManager.keyMap[key]=="CLEAR_FIELD"||this.clientManager.keyMap[key]=="SET_NULL")){
this.stopEditingCell();
this.clientManager.onKeyDownForDocument(_19a);
this.values[this.editRow][this.editCol]="";
this.startEditingCell(this.editRow,this.editCol);
return false;
}
if(elmt.tagName=="SELECT"){
if(key!=GRID_TAB_KEY){
return true;
}
}else{
if(elmt.tagName=="INPUT"&&elmt.parentNode.tagName=="DIV"&&elmt.parentNode==this.ecombo){
if(!GRID_IS_IE){
var mgr=this.clientManager;
if(mgr&&mgr.grabHandler){
return true;
}
if(key==GRID_ENTER_KEY){
return false;
}
}
if(key!=GRID_TAB_KEY&&key!=GRID_ENTER_KEY){
return true;
}
if(this.ecombo.combo.text.onchange){
this.ecombo.combo.text.onchange(elmt.parentNode.id);
}
}else{
if(elmt.tagName=="TEXTAREA"){
if(key==GRID_UP_KEY||key==GRID_DOWN_KEY){
_19a.cancelBubble=true;
}
return true;
}
}
}
var mgr=this.clientManager;
if(mgr){
var _19f=mgr.fieldDescriptors[mgr.currentFieldId];
if(_19f.isAutoComplete){
if(!this.editor.autoCompleteObj){
new AutoComplete(this.editor,_19f.name);
}
}
}
if((key==GRID_UP_KEY||key==GRID_DOWN_KEY||key==GRID_ENTER_KEY)&&_19f.isAutoComplete&&this.editor.autoCompleteObj&&this.editor.autoCompleteObj.isPopupShowing()){
if(key==GRID_DOWN_KEY){
this.editor.autoCompleteObj.selectNext();
}else{
if(key==GRID_UP_KEY){
this.editor.autoCompleteObj.selectPrev();
}else{
this.editor.autoCompleteObj.applySelection();
}
}
_19a.cancelBubble=true;
return false;
}
if(key==GRID_ESCAPE_KEY){
if(_19f.isAutoComplete&&this.editor.autoCompleteObj&&this.editor.autoCompleteObj.isPopupShowing()){
this.editor.autoCompleteObj.hidePopup();
}
this.cancelEditingCell();
if(mgr&&mgr.savedValue!=null){
var _19f=mgr.fieldDescriptors[mgr.currentFieldId];
if(_19f.field){
mgr.setValue(_19f.field,mgr.savedValue);
}
}
}else{
if(key==GRID_ENTER_KEY){
if(!this.stopEditingCell()){
_19a.cancelBubble=true;
return false;
}else{
if(GRID_IS_IE&&this.clientManager){
return this.clientManager.onKeyDownForDocument(_19a);
}
}
}else{
if(key==GRID_UP_KEY&&this.editRow>0){
if(!this.stopEditingCell()){
_19a.cancelBubble=true;
return false;
}
this.startEditingCell(this.editRow-1,this.editCol);
if(!GRID_IS_IE){
_19a.cancelBubble=true;
}
return false;
}else{
if(key==GRID_UP_KEY&&this.onPreviousRecord!=null&&this.stopEditingCell()){
this.onPreviousRecord(this.clientManager,this.dataView);
}else{
if(key==GRID_DOWN_KEY&&this.editRow<this.cells.length-1){
if(!this.stopEditingCell()){
_19a.cancelBubble=true;
return false;
}
this.startEditingCell(this.editRow+1,this.editCol);
if(!GRID_IS_IE){
_19a.cancelBubble=true;
}
return false;
}else{
if(key==GRID_DOWN_KEY&&this.onNextRecord!=null&&this.stopEditingCell()){
this.onNextRecord(this.clientManager,this.dataView);
}else{
if(key==GRID_TAB_KEY){
if(_19f.isAutoComplete&&this.editor.autoCompleteObj&&this.editor.autoCompleteObj.isPopupShowing()){
this.editor.autoCompleteObj.applySelection();
}
if(!this.stopEditingCell()){
_19a.cancelBubble=true;
return false;
}
var mgr=this.clientManager;
if(_19a.shiftKey){
var _1a0=this.editRow;
var _1a1=this.editCol-1;
var _1a2=false;
for(;;){
if(_1a1==-1&&_1a0==0){
if(mgr&&this.disableWrap){
_19a.cancelBubble=true;
mgr.doPrevField();
return;
}
if(_1a2){
break;
}
_1a0=this.cells.length-1;
_1a1=this.columns.length-1;
_1a2=true;
continue;
}else{
if(_1a1==-1){
if(mgr&&this.disableWrap){
_19a.cancelBubble=true;
mgr.doPrevField();
return;
}
_1a0--;
_1a1=this.columns.length-1;
continue;
}else{
var _1a3=this.colIndexToColId[_1a1];
var type=this.columns[_1a3].controlType;
var desc=this.columns[_1a3];
var mgr=window.parent.clientManager;
if(mgr){
var fidx=mgr.findName(desc.fieldId);
if(typeof (fidx)!="undefined"){
var _19f=mgr.fieldDescriptors[fidx];
if((_19f.flags&32)==0||(type==GRID_CHECKBOX&&(_19f.flags&16)==0)){
_1a1--;
continue;
}
}
}
var _1a7=this.rowToManagerRow[_1a0];
_1a7=getSparseArrayIndex(desc.style,_1a7);
if(type==GRID_LABEL||type==GRID_LINK||type==GRID_IMAGE||desc.visible[_1a7]==false){
_1a1--;
continue;
}
this.startEditingCell(_1a0,_1a1);
return false;
}
}
}
}else{
var _1a0=this.editRow;
var _1a1=this.editCol+1;
var _1a2=false;
for(;;){
if(_1a1==this.columns.length&&_1a0==this.cells.length-1){
if(mgr&&this.disableWrap){
_19a.cancelBubble=true;
_19a.returnValue=false;
mgr.doNextField();
return;
}
if(_1a2){
break;
}
_1a0=0;
_1a1=0;
_1a2=true;
continue;
}else{
if(_1a1==this.columns.length){
if(mgr&&this.disableWrap){
_19a.cancelBubble=true;
_19a.returnValue=false;
mgr.doNextField();
return;
}
_1a0++;
_1a1=0;
continue;
}else{
var _1a3=this.colIndexToColId[_1a1];
var type=this.columns[_1a3].controlType;
var desc=this.columns[_1a3];
var mgr=window.parent.clientManager;
if(mgr){
var fidx=mgr.findName(desc.fieldId);
if(typeof (fidx)!="undefined"){
var _19f=mgr.fieldDescriptors[fidx];
if((_19f.flags&32)==0||(type==GRID_CHECKBOX&&(_19f.flags&16)==0)){
_1a1++;
continue;
}
}
}
var _1a7=this.rowToManagerRow[_1a0];
_1a7=getSparseArrayIndex(desc.style,_1a7);
if(type==GRID_LABEL||type==GRID_LINK||type==GRID_IMAGE||desc.visible[_1a7]==false){
_1a1++;
continue;
}
this.startEditingCell(_1a0,_1a1);
return false;
}
}
}
}
}else{
if(mgr&&_19f.isAutoComplete&&this.editor.autoCompleteObj){
var obj=this.editor.autoCompleteObj;
var _1a9=function(){
return obj["requestMatches"](window.clientManager);
};
window.setTimeout(_1a9,0);
}
}
}
}
}
}
}
}
return true;
};
NXJGrid.prototype.doEditorKeyUp=function(_1aa,_1ab){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
if((_1aa.keyCode>111&&_1aa.keyCode<=111+12)||(_1aa.keyCode!=32&&_1aa.keyCode<=46)||_1aa.keyCode==145||_1aa.keyCode==91||_1aa.keyCode==92||_1aa.keyCode==93||_1aa.ctrlKey||_1aa.altKey){
return;
}
var mgr=window.parent.clientManager;
if(!mgr||!mgr.fieldDescriptors){
return;
}
var _1ad=mgr.keyMap[_1aa.keyCode];
if(_1ad=="NEXT_FIELD"||_1ad=="PREVIOUS_FIELD"){
return;
}
var desc=mgr.fieldDescriptors[mgr.currentFieldId];
if(!desc||(desc.flags&1)==0){
return;
}
var elmt=gridGetElementFromEvent(_1aa);
var _1b0=desc.fieldWidth;
var _1b1=this.editor.value.length;
if(_1b0==0){
return;
}
if(_1b1==_1b0){
var _1aa=new Object();
_1aa.keyCode=GRID_TAB_KEY;
_1aa.srcElement=this.cells[this.editRow][this.editCol];
_1aa.target=_1aa.srcElement;
this.doEditorKeyDown(_1aa,_1aa.srcElement);
}
};
function gridGetElementFromEvent(_1b2){
return GRID_IS_IE?_1b2.srcElement:_1b2.target;
}
function gridGetXOffsetFromEvent(_1b3){
if(GRID_IS_IE){
return _1b3.offsetX;
}else{
var elmt=_1b3.target;
var _1b5=0;
while(elmt&&elmt.tagName!="BODY"){
_1b5+=elmt.offsetLeft-elmt.scrollLeft;
elmt=elmt.parentNode;
}
return _1b3.pageX-_1b5;
}
}
function gridGetYOffsetFromEvent(_1b6){
if(GRID_IS_IE){
return _1b6.offsetY;
}else{
var elmt=_1b6.target;
var _1b8=0;
while(elmt&&elmt.tagName!="BODY"){
_1b8+=elmt.offsetTop;
elmt=elmt.parentNode;
}
return _1b6.pageY-_1b8;
}
}
NXJGrid.prototype.doHeaderDown=function(_1b9,_1ba){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_1b9);
var cell=elmt.tagName.toLowerCase()=="td"?elmt:elmt.parentNode;
var _1bd=gridGetXOffsetFromEvent(_1b9);
if(this.isEditingCell&&!this.stopEditingCell()){
this.cancelEditingCell();
}
if(elmt!=cell){
_1bd+=elmt.offsetLeft;
}
if(_1bd<=1&&cell.cellIndex!=0){
this.gridHeaderDownOnLeftEdge=true;
}
var _1be=cell.clientWidth;
if(_1bd>=_1be-1&&cell.cellIndex<cell.parentNode.childNodes.length-1){
this.gridHeaderDownOnRightEdge=true;
}
this.gridHeaderDownCell=cell;
this.gridHeaderDownX=_1bd+cell.offsetLeft;
if(!GRID_IS_IE){
_1b9.preventDefault();
}
return true;
};
NXJGrid.prototype.doHeaderMove=function(_1bf,_1c0){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_1bf);
var cell=elmt.tagName.toLowerCase()=="td"?elmt:elmt.parentNode;
var _1c3=gridGetXOffsetFromEvent(_1bf);
var _1c4=false;
if(elmt!=cell){
_1c3+=elmt.offsetLeft;
}
if(this.gridHeaderDownCell){
_1c4=this.gridHeaderDownOnLeftEdge||this.gridHeaderDownOnRightEdge;
}else{
if(_1c3<=1&&cell.cellIndex!=0){
_1c4=true;
}
var _1c5=cell.clientWidth;
if(_1c3>=_1c5-1&&cell.cellIndex<cell.parentNode.childNodes.length-1){
_1c4=true;
}
}
cell.style.cursor=(_1c4&&this.columnsResizable)?"e-resize":"default";
return true;
};
NXJGrid.prototype.doHeaderUp=function(_1c6,_1c7){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_1c6);
if(this.gridHeaderDownCell){
var cell=this.gridHeaderDownCell;
var _1ca=gridGetXOffsetFromEvent(_1c6);
var _1cb;
var _1cc;
if(elmt.tagName=="TD"){
_1cb=elmt;
}else{
_1cb=elmt.parentNode;
_1ca+=elmt.offsetLeft;
}
_1cc=_1ca+_1cb.offsetLeft;
if(this.gridHeaderDownOnLeftEdge||this.gridHeaderDownOnRightEdge){
if(!this.columnsResizable){
return false;
}
var idx=cell.cellIndex;
var _1ce=this.table.firstChild;
var col=_1ce.childNodes[idx];
var _1d0;
_1d0=_1cc-this.gridHeaderDownX;
var _1d1=0;
var blw=parseInt(this.header.style.borderLeftWidth);
if(!isNaN(blw)){
_1d1+=blw;
}
var brw=parseInt(this.header.style.borderRightWidth);
if(!isNaN(brw)){
_1d1+=brw;
}
if(this.gridHeaderDownOnLeftEdge){
var _1d4=this.headerRow.childNodes[idx-1];
var _1d5=_1ce.childNodes[idx-1];
var _1d6=this.colIndexToColId[idx];
var _1d7=this.colIndexToColId[idx-1];
_1d0=Math.min(_1d0,col.width-GRID_MIN_COL_WIDTH);
_1d5.width=gridPixelValueToInt(_1d5.width)+_1d0;
col.width=gridPixelValueToInt(col.width)-_1d0;
cell.style.width=col.width-_1d1;
_1d4.style.width=_1d5.width-_1d1;
cell.firstChild.style.width=col.width-_1d1;
_1d4.firstChild.style.width=_1d5.width-_1d1;
this.columns[_1d6].width=col.width;
this.columns[_1d7].width=_1d5.width;
if(!GRID_IS_IE){
for(var row=0;row<this.cells.length;row++){
this.cells[row][idx].style.width=col.width;
this.cells[row][idx-1].style.width=_1d5.width;
}
}
}else{
var _1d9=this.headerRow.childNodes[idx+1];
var _1da=_1ce.childNodes[idx+1];
var _1d6=this.colIndexToColId[idx];
var _1db=this.colIndexToColId[idx+1];
_1d0=Math.min(_1d0,_1da.width-GRID_MIN_COL_WIDTH);
col.width=gridPixelValueToInt(col.width)+_1d0;
_1da.width=gridPixelValueToInt(_1da.width)-_1d0;
cell.style.width=_1da.width-_1d1;
_1d9.style.width=_1da.width-_1d1;
cell.firstChild.style.width=col.width-_1d1;
_1d9.firstChild.style.width=_1da.width-_1d1;
this.columns[_1d6].width=col.width;
this.columns[_1db].width=_1da.width;
if(!GRID_IS_IE){
for(var row=0;row<this.cells.length;row++){
this.cells[row][idx].style.width=col.width;
this.cells[row][idx+1].style.width=_1da.width;
}
}
}
}else{
if(Math.abs(_1cc-this.gridHeaderDownX)>=GRID_MOVE_DELTA){
if(!this.columnsMovable){
return false;
}
var _1dc=cell.cellIndex;
var _1dd=_1cb;
var _1de=_1dd.cellIndex;
var _1df=new Array();
var _1e0=new Array();
var _1e1=new Array();
for(var _1e2=0;_1e2<this.values.length;_1e2++){
var row=new Array();
for(var _1d6=0;_1d6<this.columns.length;_1d6++){
var _1e3=this.colIdToIndex[_1d6];
row[_1d6]=this.values[_1e2][_1e3];
}
_1e1[_1e2]=row;
}
if(_1dc>_1de){
var slot=0;
for(var idx=0;idx<_1de;idx++){
_1df[slot++]=this.colIndexToColId[idx];
}
_1df[slot++]=this.colIndexToColId[_1dc];
for(var idx=_1de;idx<this.columns.length;idx++){
if(idx!=_1dc){
_1df[slot++]=this.colIndexToColId[idx];
}
}
for(var idx=0;idx<this.columns.length;idx++){
var _1d6=_1df[idx];
_1e0[_1d6]=idx;
}
}else{
var slot=0;
for(var idx=0;idx<_1dc;idx++){
_1df[slot++]=this.colIndexToColId[idx];
}
for(var idx=_1dc+1;idx<=_1de;idx++){
_1df[slot++]=this.colIndexToColId[idx];
}
_1df[slot++]=this.colIndexToColId[_1dc];
for(var idx=_1de+1;idx<this.columns.length;idx++){
_1df[slot++]=this.colIndexToColId[idx];
}
}
for(var idx=0;idx<this.columns.length;idx++){
var _1d6=_1df[idx];
_1e0[_1d6]=idx;
}
this.colIdToIndex=_1e0;
this.colIndexToColId=_1df;
var _1e5=this.selectedRow;
this.populateInternal(_1e1);
if(!GRID_IS_IE){
this.resize();
}
if(_1e5>=0){
this.selectRowFromIndex(_1e5);
}
}else{
this.sortFromEvent(_1c6);
}
}
if(!this.gridHeaderDownOnLeftEdge&&!this.gridHeaderDownOnRightEdge){
var _1e6=false;
for(var idx=0;idx<this.columns.length;idx++){
var _1d6=this.colIndexToColId[idx];
if(this.columns[_1d6].controlType==GRID_LINK){
_1e6=true;
}
}
var mgr=window.parent.clientManager;
if(mgr&&_1e6){
mgr.setLinkStates(window,false);
}
}
this.gridHeaderDownCell.style.cursor="default";
this.gridHeaderDownCell=null;
this.gridHeaderDownOnLeftEdge=false;
this.gridHeaderDownOnRightEdge=false;
this.saveState();
}
return true;
};
NXJGrid.prototype.doKeyDown=function(_1e8,_1e9){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var key=_1e8.keyCode;
var elmt=gridGetElementFromEvent(_1e8);
var cell;
if(elmt.tagName=="TD"){
cell=elmt;
}else{
if(elmt.parentNode.tagName=="TD"){
cell=elmt.parentNode;
}else{
return true;
}
}
if(elmt.tagName=="SELECT"){
return true;
}
if(key==GRID_ENTER_KEY){
var row=elmt.parentNode.rowIndex;
var col=cell.cellIndex;
var _1ef=this.colIndexToColId[col];
var type=this.columns[_1ef].controlType;
if(type==GRID_TEXTFIELD||type==GRID_COMBO||type==GRID_EDITABLE_COMBO||type==GRID_DATE_PICKER){
this.startEditingCell(row,col);
}
return false;
}else{
if(key==GRID_UP_KEY&&this.selectedRow>0&&this.stopEditingCell()){
this.selectRowFromIndex(this.selectedRow-1);
if(elmt.type=="checkbox"){
if(!this.clientManager.doingCommand){
col=cell.cellIndex;
row=this.selectedRow;
this.startEditingCell(row,col);
}
_1e8.cancelBubble=true;
}
return false;
}else{
if(key==GRID_DOWN_KEY&&this.selectedRow<this.cells.length-1&&this.stopEditingCell()){
this.selectRowFromIndex(this.selectedRow+1);
if(elmt.type=="checkbox"){
if(!this.clientManager.doingCommand){
col=cell.cellIndex;
row=this.selectedRow;
this.startEditingCell(row,col);
}
_1e8.cancelBubble=true;
}
return false;
}else{
if(key==GRID_TAB_KEY&&elmt.tagName=="INPUT"&&elmt.type=="checkbox"){
var _1f1=_1e8.shiftKey;
_1e8.cancelBubble=true;
_1e8=new Object();
_1e8.keyCode=GRID_TAB_KEY;
_1e8.srcElement=elmt;
_1e8.target=_1e8.srcElement;
_1e8.shiftKey=_1f1;
this.doEditorKeyDown(_1e8,elmt);
return false;
}
}
}
}
return true;
};
NXJGrid.prototype.doMouseLeave=function(_1f2,_1f3){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_1f2);
return true;
};
NXJGrid.prototype.doMouseEnter=function(_1f5,_1f6){
if(!window.parent.clientManager||!window.parent.clientManager.eventsOK){
return false;
}
var elmt=gridGetElementFromEvent(_1f5);
return true;
};
function gridPixelValueToInt(_1f8){
if(!_1f8.indexOf){
return _1f8;
}else{
if(_1f8.indexOf("px")==-1){
return parseInt(_1f8);
}else{
return parseInt(_1f8.substring(0,_1f8.length-2));
}
}
}
function removeTriSep(key){
var _1fa="";
for(var idx=0;idx<key.length;idx++){
var chr=key.charAt(idx);
if(chr!=","&&chr!=" "){
_1fa+=chr;
}
}
return _1fa;
}
function GridSortKey(grid,key,row,_200,_201,_202,type){
if(type==GRID_INT){
this.key=parseInt(removeTriSep(key));
if(isNaN(this.key)){
this.key=-Number.MAX_VALUE;
}
}else{
if(type==GRID_FLOAT){
this.key=parseFloat(removeTriSep(key));
if(isNaN(this.key)){
this.key=-Number.MAX_VALUE;
}
}else{
if(type==GRID_DATE){
var date=grid.parseDate(key);
this.key=date.getTime();
}else{
if(type==GRID_AMOUNT){
key=removeTriSep(key);
this.key=key;
var len=key.length;
var _206=(key.indexOf("(")!=-1);
for(var idx=0;idx<len;idx++){
var num=parseFloat(key);
if(isNaN(num)){
key=key.substring(1);
}else{
this.key=num;
if(_206){
this.key=-num;
}
break;
}
}
if(isNaN(this.key)){
this.key=-Number.MAX_VALUE;
}
}else{
this.key=key;
}
}
}
}
this.row=row;
this.rowId=_200;
this.managerRow=_201;
this.ascending=_202;
}

