dojo.provide("composer.widget.NotesViewColumn");
dojo.require("dojo.widget.*");
dojo.require("dojo.event.*");
dojo.require("dojo.html.*");
dojo.require("dojo.string.Builder");
dojo.require("dojo.widget.HtmlWidget");
dojo.widget.defineWidget("composer.widget.NotesViewColumn",dojo.widget.HtmlWidget,{title:" ",width:100,category:false,sortable:false,totals:false,blankCell:null,cssText:"",initialize:function(){
this.blankCell=document.createElement("td");
this.blankCell.innerHTML="&nbsp;";
this.blankCell.style.cssText=this.cssText;
},appendHeaderHTML:function(_1){
if(this.title==" "){
this.title="&nbsp;";
}
if(this.sortable){
this.title+="&nbsp;&uarr;";
}
var _2="_"+this.widgetId;
_1.append("<th id='"+_2+"' width='"+this.width+"'><nobr>"+this.title+"</nobr></th>");
},appendCell:function(_3,_4,_5){
if(this.category&&!_3.cr){
this.appendBlankCell(_4);
}else{
var _6=this.blankCell.cloneNode(false);
_6.innerHTML=this.prepareValue(_3.v[_5]);
_4.appendChild(_6);
}
},appendBlankCell:function(_7){
_7.appendChild(this.blankCell.cloneNode(true));
},prepareValue:function(_8){
if(!_8){
return "&nbsp;";
}
return _8;
},getValue:function(_9){
return _9.innerHTML;
}});
dojo.provide("composer.widget.NotesImageViewColumn");
dojo.widget.defineWidget("composer.widget.NotesImageViewColumn",composer.widget.NotesViewColumn,{appendCell:function(_a,_b,_c){
var _d=this.blankCell.cloneNode(true);
_d.innerHTML=this.prepareValue(_a.v[_c]);
_b.appendChild(_d);
},prepareValue:function(_e){
if(_e&&_e!="0"){
_e="<img src='unify/images/View"+_e+".gif'>";
}else{
_e="&nbsp;";
}
return _e;
}});
dojo.provide("composer.widget.NotesMarginColumn");
dojo.widget.defineWidget("composer.widget.NotesMarginColumn",composer.widget.NotesViewColumn,{isMargin:true,appendCell:function(_f,_10,_11){
var _12=document.createElement("td");
_12.innerHTML=this.prepareValue(_f.v[_11]);
_10.appendChild(_12);
},appendBlankCell:function(row){
var _14=this.blankCell.cloneNode(true);
_14.innerHTML="<img src='unify/images/blank.gif'>";
row.appendChild(_14);
},prepareValue:function(_15){
if(_15&&_15!="0"){
_15="<img src='unify/images/check.gif'>";
}else{
_15="<img src='unify/images/blank.gif'>";
}
return _15;
},getValue:function(_16){
return (_16.innerHTML&&_16.innerHTML.indexOf("check.gif")!=-1)?"1":"0";
}});
dojo.provide("composer.widget.NotesTwistieViewColumn");
dojo.widget.defineWidget("composer.widget.NotesTwistieViewColumn",composer.widget.NotesViewColumn,{appendCell:function(row,_18,_19){
var _1a=this.blankCell.cloneNode(true);
var _1b=row.v[_19];
if(this.category&&!row.cr){
_18.appendChild(_1a);
return;
}else{
if(row.c&&!row.rsp){
_1b="<img src='unify/images/expand.gif' id='"+row.r+"'>"+_1b;
}else{
if(!row.rsp){
_1b="&nbsp;&nbsp;&nbsp;&nbsp;"+_1b;
}
}
}
_1a.innerHTML=_1b;
_18.appendChild(_1a);
}});
dojo.provide("composer.widget.NotesResponseViewColumn");
dojo.widget.defineWidget("composer.widget.NotesResponseViewColumn",composer.widget.NotesViewColumn,{isResponseColumn:true,appendCell:function(row,_1d,_1e){
},appendBlankCell:function(row){
},appendHeaderHTML:function(_20){
}});
dojo.provide("composer.widget.NotesView");
dojo.require("composer.widget.NotesViewColumn");
dojo.require("dojo.widget.HtmlWidget");
composer.widget.NotesViewManager=new function(){
this.viewStateCache={};
this.viewCheckCache={};
this.storeState=function(_21,_22){
this.viewStateCache[_21.widgetId]=_22;
};
this.storeChecked=function(_23,_24){
this.viewCheckCache[_23.widgetId]=_24;
};
this.getState=function(_25){
return this.viewStateCache[_25.widgetId];
};
this.getChecked=function(_26){
return this.viewCheckCache[_26.widgetId];
};
this.setCurrent=function(_27){
this.current=_27;
};
this.removeCurrent=function(){
if(this.current){
if(dojo.render.html.ie){
var _28=this.current.grid;
_28.parentNode.removeChild(_28);
}
this.current.destroy();
delete this.current;
}
};
};
dojo.widget.defineWidget("composer.widget.NotesView",dojo.widget.HtmlWidget,{CHILD_ROW_PREFIX:"c_",PARENT_ROW_PREFIX:"p_",MODE_NONE:0,MODE_EXPAND:1,isContainer:true,columns:[],ajaxUrl:"nxjAjax",showresponsehierarchy:false,bgcolor:"#FFFFFF",altrowcolor:"#FFFFFF",columns:[],totalRecords:0,dataViewName:"",totals:[],altRowClass:"",isViewForm:true,postCreate:function(){
var _29=parseInt(this.domNode.offsetWidth)-20+"";
var _2a=new dojo.string.Builder();
_2a.append("<div class='view_grid_header' width='100%'>").append("<table class='view_grid' cellspacing='0' cellpadding='0' width='100%' id='").append(this.widgetId).append("_table_head'>").append("<tr class='grid_header'>");
if(document.styleSheets&&this.altRowClass){
var _2b=getNamedStyle(this.altRowClass);
if(_2b){
this.altrowcolor=_2b.backgroundColor;
}
}
this.hasCategories=false;
for(var idx=0;idx<this.columns.length;idx++){
var _2d=this.columns[idx];
if(_2d.widgetType=="NotesTwistieViewColumn"){
this.hasTwistieColumn=true;
}
if(_2d.isResponseColumn){
this.responseColumnIndex=idx;
}else{
if(_2d.category){
this.hasCategories=true;
this.showingCategories=true;
if(this.embedded){
this.columns.splice(idx--,1);
continue;
}
}else{
if(_2d.widgetType=="NotesMarginColumn"){
this.hasMargin=true;
this.marginIdx=idx;
}
}
}
_2d.appendHeaderHTML(_2a);
}
_2a.append("</tr></table></div>");
this.domNode.innerHTML=_2a.toString();
this.gridHeader=document.getElementById(this.widgetId+"_table_head");
this.gridHeader.style.width=_29+"px";
var _2e=new dojo.string.Builder();
_2e.append("<table class='view_grid' cellspacing='0' cellpadding='0' width='100%' id='").append(this.widgetId).append("_table'>");
if(!this.showresponsehierarchy&&!this.hasCategories){
this.isFlatView=true;
}
if(this.isFlatView){
_2e.append("<tr valign='top'>");
}else{
_2e.append("<tr valign='top' height='1px'>");
}
for(var idx=0;idx<this.columns.length;idx++){
var _2d=this.columns[idx];
if(_2d.isResponseColumn){
continue;
}
_2e.append("<td>&nbsp;</td>");
}
_2e.append("</tr></table>");
var _2f=document.createElement("div");
_2f.className="view_grid_main";
_2f.innerHTML=_2e.toString();
this.domNode.appendChild(_2f);
this.grid=document.getElementById(this.widgetId+"_table");
var _30=this.grid.rows[0];
var _31=0;
var _32=0;
while(_31<_30.cells.length){
var _2d=this.columns[_32];
if(_2d.isResponseColumn){
_32++;
continue;
}
this.addStyleToCell(_30.cells[_31],_2d);
_30.cells[_31].style.width=_2d.width+1;
_31++;
_32++;
}
this.grid.style.width=(parseInt(this.domNode.offsetWidth)-20)+"px";
_2f.appendChild(this.grid);
var _33=this.domNode.offsetHeight;
var _34=this.gridHeader.offsetHeight;
_2f.style.height=_33-_34;
var _35=this.grid.getElementsByTagName("tbody");
if(_35&&_35.length>0){
_35[0].id=this.widgetId+"_header_tbody";
}
dojo.event.connect(this.gridHeader,"onmousemove",dojo.lang.hitch(this,function(evt){
this.updateCursor(evt,this.widgetId+"_table");
}));
dojo.event.connect(this.gridHeader,"onmousedown",this,"headerMouseDown");
dojo.event.connect(_2f,"oncontextmenu",this,"onContextMenu");
dojo.event.connect(this.grid,"onclick",this,"handleClick");
dojo.event.connect(this.grid,"ondblclick",this,"handleDblClick");
if(dojo.render.html.ie){
dojo.event.connect(this.grid,"onkeyup",this,"handleKeyEvent");
}
this.restorePending=false;
var _37=composer.widget.NotesViewManager.getState(this);
var _38=composer.widget.NotesViewManager.getChecked(this);
if(_37||_38){
this.requestRestore=true;
}
if(!this.isFlatView){
this.createHierarchicalView(_2f);
}else{
this.createFlatView(_2f);
var mgr=window.parent.clientManager;
if(mgr){
mgr.closeProgressDialog();
}
}
composer.widget.NotesViewManager.setCurrent(this);
},destroy:function(){
this.saveState();
Event.unloadCache();
for(var idx=0;idx<this.columns.length;idx++){
this.columns[idx].destroy();
}
composer.widget.NotesView.superclass.destroy.call(this);
},createHierarchicalView:function(_3b){
if(_3b){
_3b.style.overflowY="auto";
}
var _3c=new dojo.string.Builder();
_3c.append("controlId=").append(this.widgetId).append("&managerId=").append(MANAGER_ID);
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.updateView),error:dojo.lang.hitch(this,this.handleError),mimetype:"text/plain",postContent:_3c.toString()});
},handleError:function(_3d,_3e,req){
if(req.status==408){
var _40=window.location.pathname;
var idx=_40.lastIndexOf("/");
if(idx>-1){
_40=_40.substring(0,idx);
}
window.location=_40;
}else{
alert(_3e.message);
}
},createFlatView:function(_42){
var _43=this.domNode.offsetHeight/14;
_42.style.width=(parseInt(this.domNode.offsetWidth)+5)+"px";
for(var idx=0;idx<_43;idx++){
var row=document.createElement("tr");
for(var jdx=0;jdx<this.columns.length;jdx++){
this.columns[jdx].appendBlankCell(row);
}
if(this.bgcolor!=this.altrowcolor){
if(idx%2==0){
row.style.backgroundColor=this.altrowcolor;
}else{
row.style.backgroundColor=this.bgcolor;
}
}
row.vAlign="top";
this.grid.tBodies[0].appendChild(row);
}
var _47=this.domNode;
if(this.isViewForm){
_47.style.position="absolute";
_47.style.left="10px";
_47.style.overflowX="";
}
while(_47&&_47.tagName&&_47.tagName=="DIV"){
_47.style.overflowY="";
_47.style.overflow="";
_47=_47.parentNode;
}
var _48=new Array();
_48[0]="controlId="+this.widgetId;
_48[1]="managerId="+MANAGER_ID;
var _49={prefetchBuffer:true,requestParameters:_48,columns:this.columns,hasMargin:this.hasMargin};
this.liveGrid=new Rico.LiveGrid(this.widgetId+"_table",_43,this.totalRecords,this.ajaxUrl,_49,null,this.isViewForm);
},updateView:function(_4a,_4b,evt){
var _4d=eval("("+_4b+")");
var _4e=_4d.root[0].c;
if(!_4e){
return;
}
var _4f;
var _50=0;
var _51=false;
if(typeof (_4d.parentId)!="undefined"){
var _52=document.getElementById(this.PARENT_ROW_PREFIX+_4d.parentId);
_4f=document.createElement("tbody");
_4f.id=this.CHILD_ROW_PREFIX+_4d.parentId;
if(_52.parentNode.tagName=="TBODY"){
_52.appendChild(_4f);
}else{
this.grid.insertBefore(_4f,_52.nextSibling);
}
_50=1;
_51=true;
}else{
_4f=document.createElement("tbody");
this.grid.appendChild(_4f);
}
var _53=this.showingCategories;
if(!_51){
this.showingCategories=false;
}
for(var idx=0;idx<_4e.length;idx++){
var row=_4e[idx];
this.appendRow(row,_4f,_50);
if(row.c&&!_51){
_4f=document.createElement("tbody");
this.grid.appendChild(_4f);
}
if(row.cr){
this.showingCategories=true;
}
}
if(this.requestRestore&&(this.hasTwistieColumn||this.hasMargin)){
dojo.lang.setTimeout(this,this.restoreState,100);
}else{
if(!this.restorePending){
var mgr=window.parent.clientManager;
if(mgr){
mgr.closeProgressDialog();
}
}
}
this.updateRowColors();
if(this.totals&&!this.totalsSet){
if(this.hasMargin){
this.totals.unshift("");
}
var row=document.createElement("tr");
for(var idx=0;idx<this.columns.length;idx++){
var _57=document.createElement("td");
var _58=this.columns[idx];
if(_58.totals){
var _59=this.totals[idx];
_57.innerHTML=_59;
_57.style.borderTop="1px solid #000000";
_57.style.textAlign=_58.blankCell.style.textAlign;
}else{
_57.innerHTML="&nbsp;";
}
row.appendChild(_57);
}
_4f.appendChild(row);
this.totalsSet=true;
}
if(this.isViewForm&&this.grid.clientHeight>this.domNode.offsetHeight){
this.adjustGridDivs();
}
if(!this.currentRecord){
this.selectRecord(this.grid.rows[1]);
}
this.mode=this.MODE_NONE;
},updateCurrentRecord:function(_5a){
if(_5a.parentId){
return;
}
var _5b=0;
for(var idx=0;idx<this.columns.length;idx++){
var _5d=this.columns[idx];
if(_5a[_5d.widgetId]){
var _5e=_5a[_5d.widgetId];
this.currentRecord.cells[_5b].innerHTML=_5e;
}
if(_5d.widgetType!="NotesResponseViewColumn"){
_5b++;
}
}
},updateRowColors:function(){
if(this.bgcolor!=this.altrowcolor){
var _5f=0;
for(var idx=0;idx<this.grid.rows.length;idx++){
var row=this.grid.rows[idx];
var _62=row.parentNode;
if(_62.style.display=="none"){
continue;
}
if(_5f%2){
row.style.backgroundColor=this.altrowcolor;
}else{
row.style.backgroundColor=this.bgcolor;
}
_5f++;
}
}
this.grid.style.cursor="pointer";
},saveState:function(){
if(!this.isFlatView||this.hasMargin){
var _63=new Array();
var _64=0;
var _65=this.grid.getElementsByTagName("tbody");
if(!this.isFlatView){
for(var idx=0;idx<_65.length;idx++){
var id=_65[idx].id;
if(id&&id.length>this.CHILD_ROW_PREFIX.length){
var _68=id.substring(0,this.CHILD_ROW_PREFIX.length);
if(_68==this.CHILD_ROW_PREFIX){
var _69=_65[idx];
if(_69.style.display!="none"){
var _6a=id.substring(this.CHILD_ROW_PREFIX.length);
_63[_64++]=_6a;
}
}
}
}
composer.widget.NotesViewManager.storeState(this,_63);
if(_64>0){
this.requestRestore=true;
}
}
if(this.hasMargin){
var _6b=null;
var row;
var id;
for(var _6d=1;_6d<this.grid.rows.length;_6d++){
row=this.grid.rows[_6d];
var _6e=this.columns[this.marginIdx].getValue(row.cells[this.marginIdx]);
if(_6e&&_6e!="0"){
if(_6b==null){
_6b=new Object();
}
id=row.rowId!=undefined?row.rowId:row.parentNode.id;
_6b[id]=true;
}
}
composer.widget.NotesViewManager.storeChecked(this,_6b);
if(_6b){
this.requestRestore=true;
}
}
}
},restoreState:function(){
if(!this.isFlatView||this.hasMargin){
var _6f=composer.widget.NotesViewManager.getState(this);
if(_6f){
var _70=new Array();
for(var idx=0;idx<_6f.length;idx++){
var id=_6f[idx];
var _73=this.PARENT_ROW_PREFIX+id;
var _74=document.getElementById(_73);
if(!_74){
_70.push(id);
continue;
}
var _75=this.getTwistieElem(_74);
if(_75){
this.toggleNode(_75);
}
}
if(_70.length>0){
this.restorePending=true;
composer.widget.NotesViewManager.storeState(this,_70);
dojo.lang.setTimeout(this,this.restoreState,100);
}else{
this.restorePending=false;
if(window.parent.clientManager){
window.setTimeout("window.parent.clientManager.closeProgressDialog()",100);
}
}
}
var _76=composer.widget.NotesViewManager.getChecked(this);
if(_76){
var row;
var id;
for(var _78=1;_78<this.grid.rows.length;_78++){
row=this.grid.rows[_78];
id=row.rowId!=undefined?row.rowId:row.parentNode.id;
if(_76[id]){
row.cells[this.marginIdx].innerHTML="<img src='unify/images/check.gif'>";
}
}
}
}
this.requestRestore=false;
},getSelectedRowData:function(){
var _79=new Array();
if(this.currentRecord){
for(var idx=0;idx<this.currentRecord.cells.length;idx++){
var _7b=this.currentRecord.cells[idx];
_79.push(this.columns[idx].getValue(_7b));
}
}
return _79;
},appendRow:function(row,_7d,_7e){
var _7f=document.createElement("tr");
_7f.vAlign="top";
if(!row.cr){
_7f.rowId=row.r;
_7f.mgrRowId=row.mgrRowId;
if(this.hasMargin){
row.v.unshift("");
}
}
if(row.rsp){
var _80;
var _81;
for(var idx=0;idx<this.columns.length;idx++){
if(this.columns[idx].isResponseColumn){
_81=this.columns[idx];
_80=row.v[idx];
break;
}
var _83=document.createElement("td");
_83.style.width=this.columns[idx].width+"px";
_83.innerHTML="&nbsp;";
if(this.columns[idx].widgetType=="NotesMarginColumn"){
_83.innerHTML="<img src='unify/images/blank.gif'>";
}
_7f.appendChild(_83);
}
if(!_80){
return;
}
var _84=document.createElement("td");
_84.colSpan=(this.columns.length-idx)-1;
var _85="";
for(var zdx=0;zdx<_7e;zdx++){
_85+="&nbsp;&nbsp;&nbsp;&nbsp;";
}
_84.innerHTML=_85+_80;
this.addStyleToCell(_84,_81);
_7f.appendChild(_84);
}else{
if(row.cr){
if(this.hasMargin){
row.ci++;
}
var idx=0;
for(;idx<row.ci;idx++){
this.columns[idx].appendBlankCell(_7f);
}
this.columns[row.ci].appendCell(row,_7f,0);
if(row.t){
idx++;
if(this.hasMargin){
row.t.unshift("");
}
var _87=false;
var _88=_7f.lastChild;
for(;idx<row.t.length;idx++){
var _89=row.t[idx];
if(_89){
this.columns[idx].appendBlankCell(_7f);
_7f.lastChild.innerHTML=_89;
_87=true;
}else{
if(!_87){
_88.colSpan=(idx-row.ci)+1;
}else{
this.columns[idx].appendBlankCell(_7f);
}
}
}
}else{
_7f.lastChild.colSpan=this.columns.length-row.ci;
}
}else{
for(var idx=0;idx<row.v.length;idx++){
this.columns[idx].appendCell(row,_7f,idx);
}
}
}
if(row.cr&&_7e>0){
var _8a=document.createElement("tbody");
_8a.id=this.PARENT_ROW_PREFIX+row.r;
if(this.mode!=this.MODE_EXPAND||_7e>this.expandLevel){
_8a.style.display="none";
}else{
this.expandLevel=_7e;
}
_8a.appendChild(_7f);
_7d.appendChild(_8a);
if(row.c&&row.c.length==0){
return;
}
}else{
_7d.appendChild(_7f);
}
if(row.c){
_7e++;
var _8b;
if(_7e==1){
_7d.id=this.PARENT_ROW_PREFIX+row.r;
if(row.c.length==0){
return;
}
_8b=document.createElement("tbody");
_8b.id=this.CHILD_ROW_PREFIX+row.r;
if(this.hasTwistieColumn){
_8b.style.display="none";
}
}else{
if(row.cr){
_8b=document.createElement("tbody");
_8b.id=this.CHILD_ROW_PREFIX+row.r;
_8b.style.display="none";
}else{
_8b=_7d;
}
}
for(var idx=0;idx<row.c.length;idx++){
this.appendRow(row.c[idx],_8b,_7e);
}
if(_7e==1){
this.grid.appendChild(_8b);
}else{
if(row.cr){
_7d.appendChild(_8b);
}
}
}
},addStyleToCell:function(_8c,_8d){
_8c.style.cssText=_8d.cssText;
},handleDblClick:function(_8e){
if(this.dblClickHandler){
this.dblClickHandler.call(window);
return;
}
var row=this.findRow(_8e);
if(!row.rowId){
var _90=this.getTwistieElem(_8e.target);
if(_90){
this.toggleNode(_90);
}else{
this.toggleNode(row);
}
return;
}
var _91={name:"view",fromViewGrid:true,id:this.widgetId,commandArg:row.mgrRowId};
if(window.parent.clientManager){
window.parent.clientManager.doCommand(_91);
}
},setDblClickHandler:function(_92,_93){
this.dblClickHandler=(function(){
_92[_93]();
});
},updateCursor:function(_94){
var _95=_94.target;
if(_95.tagName!="TH"){
_95=_95.parentNode;
}
var _96=this.getEdgeInfo(_94);
if(_96.onEdge){
_95.style.cursor="E-resize";
}else{
_95.style.cursor="default";
}
},getEdgeInfo:function(_97){
var _98=_97.target;
var _99=new Object();
_99.onEdge=false;
_99.onRightEdge=false;
_99.onLeftEdge=false;
if(_98.tagName!="TH"){
return _99;
}
if(dojo.render.html.ie){
var _9a=_98.offsetWidth-_97.offsetX;
if(_9a<5){
_99.onEdge=true;
_99.onLeftEdge=true;
}else{
if(_9a>(_98.offsetWidth-5)){
_99.onEdge=true;
_99.onRightEdge=true;
}
}
}else{
if(Math.abs(_97.layerX-(_98.offsetWidth+_98.offsetLeft))<5){
_99.onEdge=true;
_99.onLeftEdge=true;
}else{
if(Math.abs(_97.layerX-_98.offsetLeft)<5){
_99.onEdge=true;
_99.onRightEdge=true;
}
}
}
return _99;
},toggleNode:function(_9b){
var _9c=true;
if(_9b.tagName!="IMG"){
_9c=false;
}
var id;
if(_9c){
id=_9b.id;
}else{
var _9e=_9b.parentNode;
while(_9e&&_9e.tagName!="TBODY"){
_9e=_9e.parentNode;
}
if(!_9e){
return;
}
id=_9e.id.substring(2);
}
var _9f=this.CHILD_ROW_PREFIX+id;
var _a0=document.getElementById(_9f);
var _a1=true;
if(_a0&&_a0.style.display!="none"){
_a1=false;
}
if(this.grid.style.cursor!="progress"){
this.grid.style.cursor="progress";
var _a2=this;
var _a3=function(){
_a2.toggleNode(_9b);
};
window.setTimeout(_a3,0);
return;
}
if(!_a0){
var _a4=_9c?_9b.nextSibling.nodeValue:_9b.nodeValue;
var _a5=new dojo.string.Builder();
_a5.append("action=expand_node&parentId=").append(id).append("&controlId=").append(this.widgetId).append("&categoryName=").append(escape(_a4)).append("&managerId=").append(MANAGER_ID);
this.mode=this.MODE_EXPAND;
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.updateView),mimetype:"text/plain",postContent:_a5.toString()});
}else{
if(_a0&&_a0.style.display==""){
this.hideTBody(_a0);
}
}
if(_a0){
_a0.style.display=_a1?"":"none";
if(_a1){
var _a6=_a0.firstChild;
while(_a6){
if(_a6.tagName=="TBODY"&&"p"==_a6.id.charAt(0)){
_a6.style.display="";
}
_a6=_a6.nextSibling;
}
}
this.updateRowColors();
}
if(this.isViewForm){
this.adjustGridDivs();
}
if(_9c){
_9b.src=_a1?"unify/images/collapse.gif":"unify/images/expand.gif";
}
},hideTBody:function(_a7){
var _a8=_a7.getElementsByTagName("tbody");
if(_a8){
for(var idx=0;idx<_a8.length;idx++){
this.hideTBody(_a8[idx]);
}
}
_a7.style.display="none";
var _aa=this.getTwistieElem(_a7);
if(_aa!=null){
var _ab=_aa.src.lastIndexOf("/");
var _ac=_aa.src.substring(0,_ab+1);
_aa.src=_ac+"expand.gif";
}
},findRow:function(_ad){
var _ae=_ad.target;
while(_ae&&_ae.tagName!="TR"){
_ae=_ae.parentNode;
}
return _ae;
},handleClick:function(_af){
if(_af.target.tagName=="IMG"){
var _b0=this.getTwistieElem(_af.target);
if(_b0){
this.toggleNode(_b0);
}else{
var _b1=this.getMarginElem(_af.target);
if(_b1){
if(_b1.src.indexOf("check.gif")!=-1){
_b1.src="unify/images/blank.gif";
}else{
_b1.src="unify/images/check.gif";
}
}
}
}
var row=this.findRow(_af);
if(this.liveGrid&&row.rowIndex>=this.liveGrid.buffer.size){
return;
}
this.selectRecord(row);
},headerMouseDown:function(_b3){
var _b4=_b3.target;
if(_b4.tagName!="TH"){
_b4=_b4.parentNode;
}
if(_b4.tagName=="TH"&&_b4.style.cursor!="default"){
var _b5=this.getEdgeInfo(_b3);
if(_b5.onRightEdge&&_b4.cellIndex>0){
_b4=this.gridHeader.rows[0].cells[_b4.cellIndex-1];
}
var _b6=parseInt(_b4.offsetWidth);
var x=_b3.x||_b3.layerX;
this.columnResizer=(function(evt){
this.headerDragResize(evt,_b4,_b6,x);
});
dojo.event.connect(this.gridHeader,"onmousemove",this,"columnResizer");
dojo.event.connect(document,"onmouseup",this,"headerStopResize");
}else{
if(_b4.tagName=="TH"&&_b4.style.cursor=="default"){
var _b9=this;
this.gridHeader.onmouseup=function(e){
_b9.headerMouseUp(_b3||window.event);
};
}
}
},headerMouseUp:function(_bb){
var _bc=_bb.target||_bb.srcElement;
if(_bc.tagName!="TH"){
_bc=_bc.parentNode;
}
var _bd=_bc.cellIndex;
var _be=this.columns[_bd];
var _bf=_bc.id;
if(_bf.charAt(0)=="_"){
_bf=_bf.substring(1);
}
for(var idx=0;idx<this.columns.length;idx++){
if(_bf==this.columns[idx].widgetId){
_be=this.columns[idx];
break;
}
}
if(!_be.sortable){
this.gridHeader.onmouseup="";
return;
}
for(var idx=0;idx<this.gridHeader.rows[0].cells.length;idx++){
if(idx==_bc.cellIndex){
continue;
}
var _c1=this.gridHeader.rows[0].cells[idx];
var _c2=_c1.getElementsByTagName("img");
if(_c2&&_c2.length>0){
_c1.removeChild(_c2[0]);
}
}
var _c2=_bc.getElementsByTagName("img");
var asc=false;
if(_c2&&_c2.length>0){
var src=_c2[0].src;
if(src.indexOf("asc")!=-1){
asc=false;
_c2[0].src="unify/images/grid_header_sort_desc.gif";
}else{
if(src.indexOf("desc")!=-1&&this.hasCategories&&!_be.category){
asc=-1;
_bc.removeChild(_c2[0]);
}else{
asc=true;
_c2[0].src="unify/images/grid_header_sort_asc.gif";
}
}
}else{
asc=true;
_bc.innerHTML=_bc.innerHTML+"<img src='unify/images/grid_header_sort_asc.gif'>";
}
if(this.responseColumnIndex&&_bc.cellIndex>=this.responseColumnIndex){
_bd++;
}
if(this.hasMargin){
_bd--;
}
if(this.isFlatView){
var _c5=new Object();
_c5.name=_bd;
_c5.currentSort=asc?"asc":"desc";
this.liveGrid.sortHandler(_c5);
}else{
var _c6=asc==-1?"none":(asc?"asc":"desc");
var _c7=new dojo.string.Builder();
_c7.append("controlId=").append(this.widgetId).append("&sort_col=").append(_bd).append("&sort_dir=").append(_c6).append("&managerId=").append(MANAGER_ID);
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.updateView),mimetype:"text/plain",postContent:_c7.toString()});
if(!this.hasCategories||this.showingCategories){
this.saveState();
}
this.resetContents();
}
this.gridHeader.onmouseup="";
},headerDragResize:function(_c8,_c9,_ca,x){
_c9.style.cursor="E-resize";
var _cc=_ca+((_c8.x||_c8.layerX)-x);
var _cd=this.grid.rows[0].cells[_c9.cellIndex];
_c9.style.width=_cc+"px";
_cd.style.width=_cc+"px";
},headerStopResize:function(){
dojo.event.disconnect(this.gridHeader,"onmousemove",this,"columnResizer");
delete this.columnResizer;
dojo.event.disconnect(document,"onmouseup",this,"headerStopResize");
},resetContents:function(){
var _ce=this.widgetId+"_header_tbody";
while(this.grid.hasChildNodes()){
if(this.grid.lastChild.id==_ce){
break;
}
this.grid.removeChild(this.grid.lastChild);
}
this.currentRecord=undefined;
},onContextMenu:function(_cf){
if(window.parent.clientManager==null){
return;
}
this.closeContextMenu();
var _d0=this.findRow(_cf);
var _d1=_d0?_d0.rowId:undefined;
var _d2=true;
if(typeof (_d1)=="undefined"){
_d2=false;
}
if(_d2){
this.selectRecord(_d0);
}
var _d3=document.createElement("div");
_d3.id=this.widgetId+"_context_menu";
_d3.className="view_grid_context_menu";
var _d4=true;
if(!window.clipboardData){
_d4=false;
}
Event.observe(_d3,"mouseover",function(){
this.overContextMenu=true;
}.bindAsEventListener(this));
Event.observe(_d3,"mouseout",function(){
this.overContextMenu=false;
}.bindAsEventListener(this));
var _d5=_cf.clientX+document.body.scrollLeft;
var top=_cf.clientY+document.body.scrollTop;
if(dojo.render.html.ie){
_d3.style.pixelLeft=_d5;
_d3.style.pixelTop=top;
}else{
_d3.style.left=_d5;
_d3.style.top=top;
}
var _d7=document.createElement("table");
var _d8=_d7.insertRow(0);
var _d9=_d7.insertRow(1);
var _da=_d7.insertRow(2);
var _db=_d8.insertCell(0);
var _dc=_d9.insertCell(0);
var _dd=_da.insertCell(0);
_db.innerHTML="Copy";
_dc.innerHTML="Delete";
_dd.innerHTML="Search This View";
if(!_d2||!_d4){
_db.style.color="#DDDDDD";
}else{
Event.observe(_d8,"click",function(){
if(window.clipboardData){
var _de=new dojo.string.Builder();
_de.append("action=get_form_name&mgrRowId=").append(_d0.mgrRowId).append("&controlId=").append(this.widgetId).append("&managerId=").append(MANAGER_ID);
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.setDocLink),mimetype:"text/plain",postContent:_de.toString()});
}
this.closeContextMenu();
}.bindAsEventListener(this));
}
if(!_d2){
_dc.style.color="#DDDDDD";
}else{
Event.observe(_d9,"click",function(){
this.requestDelete(_d0);
this.closeContextMenu();
}.bindAsEventListener(this));
}
Event.observe(_da,"click",function(_df){
this.closeContextMenu();
this.createSearchDiv(_df);
}.bindAsEventListener(this));
_d3.appendChild(_d7);
var _e0=_d3.getElementsByTagName("tr");
for(var idx=0;idx<_e0.length;idx++){
var row=_e0[idx];
row.onmouseover=(function(e){
this.style.backgroundColor="#EFEFEF";
});
row.onmouseout=(function(e){
this.style.backgroundColor="#FFFFFF";
});
}
Event.observe(document,"mousedown",this.onDocMouseDown.bindAsEventListener(this));
document.body.appendChild(_d3);
dojo.event.browser.stopEvent(_cf);
},setDocLink:function(_e5,_e6){
var _e7=eval("("+_e6+")");
var _e8=_e7.formName;
var _e9=_e7.rowId;
var _ea="<a href='NXJForm:Forms."+_e8+","+_e9+"'><img src='system/default/doclink.gif'></a>";
window.clipboardData.setData("Text",_ea);
},closeContextMenu:function(){
var _eb=document.getElementById(this.widgetId+"_context_menu");
if(_eb){
document.body.removeChild(_eb);
}
this.overContextMenu=false;
},createSearchDiv:function(_ec){
this.saveState();
var _ed=document.createElement("div");
_ed.id=this.widgetId+"_search_box";
_ed.className="view_grid_search_box";
_ed.innerHTML="Search in View:";
var _ee=document.createElement("img");
_ee.src="unify/images/close.gif";
Event.observe(_ee,"click",function(){
this.closeSearchDiv(true);
}.bindAsEventListener(this));
this.overSearchBox=false;
Event.observe(_ed,"mouseover",function(){
this.overSearchBox=true;
}.bindAsEventListener(this));
Event.observe(_ed,"mouseout",function(){
this.overSearchBox=false;
}.bindAsEventListener(this));
_ed.appendChild(_ee);
_ed.appendChild(document.createElement("br"));
var _ef=document.createElement("input");
_ef.type="text";
Event.observe(_ef,"keyup",function(_f0){
if(_f0.keyCode==Event.KEY_RETURN){
this.search(_ef.value);
}
}.bindAsEventListener(this));
_ed.appendChild(_ef);
var _f1=document.createElement("input");
_f1.type="button";
_f1.value="Search";
Event.observe(_f1,"click",function(){
this.search(_ef.value);
}.bindAsEventListener(this));
_ed.appendChild(_f1);
document.body.appendChild(_ed);
var _f2=this.grid.parentNode;
var _f3=_f2.offsetLeft;
var top=_f2.offsetTop;
var _f5=_f2.offsetParent;
while(_f5){
_f3+=_f5.offsetLeft;
top+=_f5.offsetTop;
_f5=_f5.offsetParent;
}
var _f6=document.getElementById("nxjvertline");
if(_f6){
_f3=_f6.offsetLeft+10;
}
if(this.isViewForm){
top=_ec.clientY+document.body.scrollTop-40;
}
_ed.style.left=_f3+"px";
_ed.style.top=top+"px";
var _f7=document.getElementById("nxj_vertmenu_div");
var _f8=_f7?_f7.clientWidth:0;
_ed.style.width=document.body.clientWidth-_f8-10;
_ef.style.width=(_ed.offsetWidth-_f1.offsetWidth)-5;
_ee.style.right="2px";
window.setTimeout(function(){
_ef.focus();
},500);
},closeSearchDiv:function(_f9){
this.overSearchBox=false;
var _fa=document.getElementById(this.widgetId+"_search_box");
if(_fa){
document.body.removeChild(_fa);
if(_f9){
if(this.liveGrid){
this.liveGrid.searchString=undefined;
this.liveGrid.resetContents();
this.liveGrid.fetchBuffer(0,true);
}else{
this.resetContents();
this.requestRestore=true;
this.createHierarchicalView();
}
}
}
},requestDelete:function(_fb){
this.recordToDelete=_fb;
var _fc="DELETE";
if(this.dataViewName&&this.dataViewName.length>0){
_fc=this.dataViewName+":"+_fc;
}
var _fd={fromViewGrid:true,name:_fc,id:this.widgetId,commandArg:_fb.mgrRowId};
if(window.parent.clientManager){
window.parent.clientManager.doCommand(_fd);
}
},deleteRecord:function(){
var _fe=this.recordToDelete.mgrRowId;
if(this.liveGrid){
this.liveGrid.deleteRow(_fe);
}else{
var _ff=this.CHILD_ROW_PREFIX+_fe;
var _100=document.getElementById(_ff);
if(_100&&_100.children.length==1&&this.recordToDelete.rowIndex>0){
var _101=this.grid.rows[this.recordToDelete.rowIndex-1];
if(typeof (_101.mgrRowId)=="undefined"){
_101.parentNode.removeChild(_101);
}
}else{
var _102=this.recordToDelete.rowIndex;
var _103=this.grid.rows[_102+1];
if(_103&&_103.responseLevel){
this.recordToDelete.parentNode.removeChild(_103);
}
}
this.recordToDelete.parentNode.removeChild(this.recordToDelete);
this.recordToDelete=null;
for(var idx=0;idx<this.grid.rows.length;idx++){
var row=this.grid.rows[idx];
if(row.mgrRowId&&row.mgrRowId>_fe){
row.mgrRowId--;
}
}
this.currentRecord=undefined;
}
this.recordToDelete=null;
},search:function(_106){
if(_106&&_106.length>0){
if(this.liveGrid){
this.liveGrid.searchString=_106;
this.liveGrid.resetContents();
this.liveGrid.fetchBuffer(0,true);
}else{
this.resetContents();
var buff=new dojo.string.Builder();
buff.append("action=search&search_string=").append(_106).append("&controlId=").append(this.widgetId).append("&managerId=").append(MANAGER_ID);
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.updateView),mimetype:"text/plain",postContent:buff.toString()});
}
}
},refreshChecked:function(){
this.saveState();
this.requestRestore=true;
this.resetContents();
var buff=new dojo.string.Builder();
buff.append("action=refreshchecked").append("&controlId=").append(this.widgetId).append("&managerId=").append(MANAGER_ID);
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.updateView),mimetype:"text/plain",postContent:buff.toString()});
},onDocMouseDown:function(_109){
if(typeof (this.overContextMenu)!="undefined"&&!this.overContextMenu){
this.closeContextMenu();
}
if(typeof (this.overSearchBox)!="undefined"&&!this.overSearchBox){
this.closeSearchDiv(false);
}
},getTwistieElem:function(elem){
var _10b;
if(elem.tagName=="IMG"){
_10b=new Array(elem);
}else{
_10b=elem.getElementsByTagName("img");
}
if(_10b){
for(var zdx=0;zdx<_10b.length;zdx++){
var img=_10b[zdx];
if(img.src.indexOf("expand.gif")!=-1||img.src.indexOf("collapse.gif")!=-1){
return img;
}
}
}
return null;
},getMarginElem:function(elem){
var _10f;
if(elem.tagName=="IMG"){
_10f=new Array(elem);
}else{
_10f=elem.getElementsByTagName("img");
}
if(_10f){
for(var zdx=0;zdx<_10f.length;zdx++){
var img=_10f[zdx];
if(img.src.indexOf("check.gif")!=-1||img.src.indexOf("blank.gif")!=-1){
return img;
}
}
}
return null;
},selectRecord:function(row){
var _113=this.grid;
if(typeof (row)=="undefined"){
return;
}else{
if(row.tagName!="TR"){
row=_113.rows[row];
}
}
if(this.currentRecord){
var _114=this.currentRecord.cells;
for(var idx=0;idx<_114.length;idx++){
_114[idx].className="";
}
}
if(dojo.render.html.ie){
this.lastSelectedIndex=row.rowIndex;
}
this.currentRecord=row;
var _114=row.cells;
if(_114.length==1){
_114[0].className="selectedSingle";
}else{
_114[0].className="selectedLeft";
_114[_114.length-1].className="selectedRight";
for(var idx=1;idx<_114.length-1;idx++){
_114[idx].className="selectedCenter";
}
}
},deselectRow:function(){
if(this.currentRecord){
var _116=this.currentRecord.cells;
for(var idx=0;idx<_116.length;idx++){
_116[idx].className="";
}
}
},reselectRow:function(){
if(this.currentRecord){
var _118=this.currentRecord.cells;
if(_118.length==1){
_118[0].className="selectedSingle";
}else{
_118[0].className="selectedLeft";
_118[_118.length-1].className="selectedRight";
for(var idx=1;idx<_118.length-1;idx++){
_118[idx].className="selectedCenter";
}
}
}
},handleKeyEvent:function(_11a){
if(_11a.keyCode==_11a.KEY_UP_ARROW){
this.selectRecord(this.lastSelectedIndex-1);
}else{
if(_11a.keyCode==_11a.KEY_DOWN_ARROW){
this.selectRecord(this.lastSelectedIndex+1);
}
}
dojo.event.browser.stopEvent(_11a);
},anyRowsChecked:function(){
if(!this.hasMargin){
return false;
}
for(var _11b=1;_11b<this.grid.rows.length;_11b++){
row=this.grid.rows[_11b];
var _11c=this.columns[this.marginIdx].getValue(row.cells[this.marginIdx]);
if(_11c&&_11c!="0"){
return true;
}
}
return false;
},getCheckedHTML:function(){
var _11d=new dojo.string.Builder();
_11d.append("<div class='view_grid_header'>");
_11d.append(this.gridHeader.parentNode.innerHTML);
_11d.append("</div>");
_11d.append("<div class='view_grid_main'>");
_11d.append("<table class='view_grid' cellspacing='0' cellpadding='0' width='100%' id='").append(this.widgetId).append("_table'>");
for(var idx=0;idx<this.grid.rows.length;idx++){
var row=this.grid.rows[idx];
var _120=row.parentNode;
if(_120.id==this.widgetId+"_header_tbody"){
_11d.append(_120.innerHTML);
}else{
if(row.innerHTML.indexOf("check.gif")!=-1){
if(row.outerHTML){
_11d.append(row.outerHTML.replace(/check.gif/,"blank.gif"));
}else{
_11d.append("<tr>");
_11d.append(row.innerHTML.replace(/check.gif/,"blank.gif"));
_11d.append("</tr>");
}
}
}
}
_11d.append("</table>");
_11d.append("</div>");
return _11d.toString();
},getCheckedMgrRowIds:function(){
var _121=new dojo.string.Builder();
var _122=true;
for(var idx=0;idx<this.grid.rows.length;idx++){
var row=this.grid.rows[idx];
var _125=row.parentNode;
if(row.innerHTML.indexOf("check.gif")!=-1&&typeof (row.mgrRowId)!="undefined"){
if(!_122){
_121.append(";");
}
_122=false;
_121.append(row.mgrRowId);
}
}
return _121.toString();
},adjustGridDivs:function(){
var _126=document.getElementById("nxj_footer_div");
var _127=_126?_126.offsetHeight:0;
if(!this.domNode){
return;
}
var _128=this.domNode.id;
var _129=_128.indexOf("_FXGRID");
if(_129!=-1){
_128=_128.substring(0,_129)+".";
var _12a=this.grid.parentNode;
var _12b=false;
while(_12a&&_12a.tagName=="DIV"){
_12a.style.height=this.grid.clientHeight+this.gridHeader.clientHeight+_127;
if(_12b){
break;
}
if(_12a.id==_128){
break;
}
_12a=_12a.parentNode;
}
}
}});
var Rico={Version:"1.1.2",prototypeVersion:parseFloat(Prototype.Version.split(".")[0]+"."+Prototype.Version.split(".")[1])};
if((typeof Prototype=="undefined")||Rico.prototypeVersion<1.3){
throw ("Rico requires the Prototype JavaScript framework >= 1.3");
}
Rico.ArrayExtensions=new Array();
if(Object.prototype.extend){
Rico.ArrayExtensions[Rico.ArrayExtensions.length]=Object.prototype.extend;
}
if(Array.prototype.push){
Rico.ArrayExtensions[Rico.ArrayExtensions.length]=Array.prototype.push;
}
if(window.DOMParser&&window.XMLSerializer&&window.Node&&Node.prototype&&Node.prototype.__defineGetter__){
if(!Document.prototype.loadXML){
Document.prototype.loadXML=function(s){
var doc2=(new DOMParser()).parseFromString(s,"text/xml");
while(this.hasChildNodes()){
this.removeChild(this.lastChild);
}
for(var i=0;i<doc2.childNodes.length;i++){
this.appendChild(this.importNode(doc2.childNodes[i],true));
}
};
}
Document.prototype.__defineGetter__("xml",function(){
return (new XMLSerializer()).serializeToString(this);
});
}
Rico.LiveGridMetaData=Class.create();
Rico.LiveGridMetaData.prototype={initialize:function(_12f,_130,_131,_132,_133){
this.pageSize=_12f;
this.totalRows=_130;
this.setOptions(_133);
this.ArrowHeight=16;
this.columns=_132;
this.columnCount=_131;
this.hasMargin=_133.hasMargin;
},setOptions:function(_134){
this.options={largeBufferSize:7,nearLimitFactor:0.2};
Object.extend(this.options,_134||{});
},getPageSize:function(){
return this.pageSize;
},getTotalRows:function(){
return this.totalRows;
},setTotalRows:function(n){
this.totalRows=n;
},getLargeBufferSize:function(){
return parseInt(this.options.largeBufferSize*this.pageSize);
},getLimitTolerance:function(){
return parseInt(this.getLargeBufferSize()*this.options.nearLimitFactor);
}};
Rico.LiveGridScroller=Class.create();
Rico.LiveGridScroller.prototype={initialize:function(_136,_137){
this.isIE=navigator.userAgent.toLowerCase().indexOf("msie")>=0;
this.liveGrid=_136;
this.metaData=_136.metaData;
this.createScrollBar();
this.scrollTimeout=null;
this.lastScrollPos=0;
this.viewPort=_137;
this.rows=new Array();
},isUnPlugged:function(){
return this.scrollerDiv.onscroll==null;
},plugin:function(){
this.scrollerDiv.onscroll=this.handleScroll.bindAsEventListener(this);
},unplug:function(){
this.scrollerDiv.onscroll=null;
},sizeIEHeaderHack:function(){
if(!this.isIE){
return;
}
var _138=$(this.liveGrid.tableId+"_header");
if(_138){
_138.rows[0].cells[0].style.width=(_138.rows[0].cells[0].offsetWidth+1)+"px";
}
},createScrollBar:function(){
var _139=this.liveGrid.viewPort.visibleHeight();
this.scrollerDiv=document.createElement("div");
var _13a=this.scrollerDiv.style;
_13a.borderRight=this.liveGrid.options.scrollerBorderRight;
if(this.liveGrid.isViewForm){
this.scrollerDiv.id="liveGridScrollerDiv";
_13a.position="absolute";
_13a.left="-17px";
this.scrollerDiv.adjustLeft=function(){
this.style.left=document.body.scrollLeft-17;
};
}else{
_13a.position="relative";
_13a.left=this.isIE?"-6px":"-3px";
}
_13a.width="19px";
_13a.height=_139+"px";
_13a.overflow="auto";
this.heightDiv=document.createElement("div");
this.heightDiv.style.width="1px";
this.heightDiv.style.height=parseInt(_139*this.metaData.getTotalRows()/this.metaData.getPageSize())+"px";
this.scrollerDiv.appendChild(this.heightDiv);
this.scrollerDiv.onscroll=this.handleScroll.bindAsEventListener(this);
var _13b=this.liveGrid.table;
_13b.parentNode.parentNode.insertBefore(this.scrollerDiv,_13b.parentNode.nextSibling);
var _13c=this.isIE?"mousewheel":"DOMMouseScroll";
Event.observe(_13b,_13c,function(evt){
if(evt.wheelDelta>=0||evt.detail<0){
this.scrollerDiv.scrollTop-=(2*this.viewPort.rowHeight);
}else{
this.scrollerDiv.scrollTop+=(2*this.viewPort.rowHeight);
}
this.handleScroll(false);
}.bindAsEventListener(this),false);
},updateSize:function(){
var _13e=this.liveGrid.table;
var _13f=this.viewPort.visibleHeight();
this.heightDiv.style.height=parseInt(_13f*this.metaData.getTotalRows()/this.metaData.getPageSize())+"px";
},rowToPixel:function(_140){
return (_140/this.metaData.getTotalRows())*this.heightDiv.offsetHeight;
},moveScroll:function(_141){
this.scrollerDiv.scrollTop=this.rowToPixel(_141);
if(this.metaData.options.onscroll){
this.metaData.options.onscroll(this.liveGrid,_141);
}
},handleScroll:function(){
if(this.scrollTimeout){
clearTimeout(this.scrollTimeout);
}
var _142=this.lastScrollPos-this.scrollerDiv.scrollTop;
if(_142!=0){
var r=this.scrollerDiv.scrollTop%this.viewPort.rowHeight;
if(r!=0){
this.unplug();
if(_142<0){
this.scrollerDiv.scrollTop+=(this.viewPort.rowHeight-r);
}else{
this.scrollerDiv.scrollTop-=r;
}
this.plugin();
}
}
var _144=parseInt(this.scrollerDiv.scrollTop/this.viewPort.rowHeight);
this.liveGrid.requestContentRefresh(_144);
this.viewPort.scrollTo(this.scrollerDiv.scrollTop);
if(this.metaData.options.onscroll){
this.metaData.options.onscroll(this.liveGrid,_144);
}
this.scrollTimeout=setTimeout(this.scrollIdle.bind(this),1200);
this.lastScrollPos=this.scrollerDiv.scrollTop;
},scrollIdle:function(){
if(this.metaData.options.onscrollidle){
this.metaData.options.onscrollidle();
}
}};
Rico.LiveGridBuffer=Class.create();
Rico.LiveGridBuffer.prototype={initialize:function(_145,_146){
this.startPos=0;
this.size=0;
this.metaData=_145;
this.rows=new Array();
this.updateInProgress=false;
this.viewPort=_146;
this.maxBufferSize=_145.getLargeBufferSize()*2;
this.maxFetchSize=_145.getLargeBufferSize();
this.lastOffset=0;
},getBlankRow:function(){
if(!this.blankRow){
this.blankRow=new Array();
for(var i=0;i<this.metaData.columnCount;i++){
this.blankRow[i]="&nbsp;";
}
}
return this.blankRow;
},loadRows:function(json){
var rows=json.root[0].c;
var _14a=new Array();
for(var idx=0;idx<rows.length;idx++){
var row=_14a[idx]=new Array();
row.rowId=rows[idx].r;
row.formName=rows[idx].f;
row.mgrRowId=rows[idx].mgrRowId;
if(this.metaData.hasMargin){
rows[idx].v.unshift("");
}
for(var jdx=0;jdx<rows[idx].v.length;jdx++){
row[jdx]=this.metaData.columns[jdx].prepareValue(rows[idx].v[jdx]);
}
}
return _14a;
},update:function(json,_14f){
var _150=this.loadRows(json);
if(this.rows.length==0){
this.rows=_150;
this.size=this.rows.length;
this.startPos=_14f;
return;
}
if(_14f>this.startPos){
if(this.startPos+this.rows.length<_14f){
this.rows=_150;
this.startPos=_14f;
}else{
this.rows=this.rows.concat(_150.slice(0,_150.length));
if(this.rows.length>this.maxBufferSize){
var _151=this.rows.length;
this.rows=this.rows.slice(this.rows.length-this.maxBufferSize,this.rows.length);
this.startPos=this.startPos+(_151-this.rows.length);
}
}
}else{
if(_14f+_150.length<this.startPos){
this.rows=_150;
}else{
this.rows=_150.slice(0,this.startPos).concat(this.rows);
if(this.rows.length>this.maxBufferSize){
this.rows=this.rows.slice(0,this.maxBufferSize);
}
}
this.startPos=_14f;
}
this.size=this.rows.length;
},deleteRow:function(_152){
var _153=0;
var _154=false;
for(var idx=0;idx<this.rows.length;idx++){
var row=this.rows[idx];
if(!_154&&mgrRowId==row.mgrRowId){
_154=true;
_153=idx;
}
if(row.mgrRowId>mgrRowId){
row.mgrRowId--;
}
}
if(_154){
this.rows.splice(_153,1);
this.size=this.rows.length;
}
},clear:function(){
this.rows=new Array();
this.startPos=0;
this.size=0;
},isOverlapping:function(_157,size){
return ((_157<this.endPos())&&(this.startPos<_157+size))||(this.endPos()==0);
},isInRange:function(_159){
return (_159>=this.startPos)&&(_159+this.metaData.getPageSize()<=this.endPos());
},isNearingTopLimit:function(_15a){
return _15a-this.startPos<this.metaData.getLimitTolerance();
},endPos:function(){
return this.startPos+this.rows.length;
},isNearingBottomLimit:function(_15b){
return this.endPos()-(_15b+this.metaData.getPageSize())<this.metaData.getLimitTolerance();
},isAtTop:function(){
return this.startPos==0;
},isAtBottom:function(){
return this.endPos()==this.metaData.getTotalRows();
},isNearingLimit:function(_15c){
return (!this.isAtTop()&&this.isNearingTopLimit(_15c))||(!this.isAtBottom()&&this.isNearingBottomLimit(_15c));
},getFetchSize:function(_15d){
var _15e=this.getFetchOffset(_15d);
var _15f=0;
if(_15e>=this.startPos){
var _160=this.maxFetchSize+_15e;
if(_160>this.metaData.totalRows){
_160=this.metaData.totalRows;
}
_15f=_160-_15e;
if(_15e==0&&_15f<this.maxFetchSize){
_15f=this.maxFetchSize;
}
}else{
var _15f=this.startPos-_15e;
if(_15f>this.maxFetchSize){
_15f=this.maxFetchSize;
}
}
return _15f;
},getFetchOffset:function(_161){
var _162=_161;
if(_161>this.startPos){
_162=(_161>this.endPos())?_161:this.endPos();
}else{
if(_161+this.maxFetchSize>=this.startPos){
var _162=this.startPos-this.maxFetchSize;
if(_162<0){
_162=0;
}
}
}
this.lastOffset=_162;
return _162;
},getRows:function(_163,_164){
var _165=_163-this.startPos;
var _166=_165+_164;
if(_166>this.size){
_166=this.size;
}
var _167=new Array();
var _168=0;
for(var i=_165;i<_166;i++){
_167[_168++]=this.rows[i];
}
return _167;
},convertSpaces:function(s){
return s.split(" ").join("&nbsp;");
}};
Rico.GridViewPort=Class.create();
Rico.GridViewPort.prototype={initialize:function(_16b,_16c,_16d,_16e,_16f){
this.lastDisplayedStartPos=0;
this.div=_16b.parentNode;
this.table=_16b;
this.rowHeight=_16c;
this.div.style.height=(this.rowHeight*_16d)+"px";
this.div.style.width=_16b.style.width;
this.div.style.overflow="hidden";
this.buffer=_16e;
this.liveGrid=_16f;
this.visibleRows=_16d+1;
this.lastPixelOffset=0;
this.startPos=0;
},populateRow:function(_170,row){
if(!_170){
return;
}
_170.mgrRowId=row.mgrRowId;
_170.rowId=row.rowId;
for(var j=0;j<_170.cells.length;j++){
_170.cells[j].innerHTML=row[j];
}
},bufferChanged:function(_173){
this.refreshContents(parseInt(this.lastPixelOffset/this.rowHeight),_173);
},clearRows:function(){
if(!this.isBlank){
this.liveGrid.table.className=this.liveGrid.options.loadingClass;
for(var i=0;i<this.table.rows.length;i++){
this.populateRow(this.table.rows[i],this.buffer.getBlankRow());
}
this.isBlank=true;
}
},clearContents:function(){
this.clearRows();
this.scrollTo(0);
this.startPos=0;
this.lastStartPos=-1;
},refreshContents:function(_175,_176){
if(!_176&&_175==this.lastRowPos&&!this.isPartialBlank&&!this.isBlank){
return;
}
if((_175+this.visibleRows<this.buffer.startPos)||(this.buffer.startPos+this.buffer.size<_175)||(this.buffer.size==0)){
this.clearRows();
return;
}
this.isBlank=false;
var _177=this.buffer.startPos>_175;
var _178=_177?this.buffer.startPos:_175;
var _179=(this.buffer.startPos+this.buffer.size<_175+this.visibleRows)?this.buffer.startPos+this.buffer.size:_175+this.visibleRows;
var _17a=_179-_178;
var rows=this.buffer.getRows(_178,_17a);
var _17c=this.visibleRows-_17a;
var _17d=_177?0:_17a;
var _17e=_177?_17c:0;
if(_17e==0){
var _17f=rows[0];
for(var idx=0;idx<_17f.length;idx++){
_17f[idx]="<nobr>"+_17f[idx]+"</nobr>";
}
}
for(var i=0;i<rows.length;i++){
this.populateRow(this.table.rows[i+_17e],rows[i]);
}
for(var i=0;i<_17c;i++){
this.populateRow(this.table.rows[i+_17d],this.buffer.getBlankRow());
}
this.isPartialBlank=_17c>0;
this.lastRowPos=_175;
this.liveGrid.table.className=this.liveGrid.options.tableClass;
var _182=this.liveGrid.options.onRefreshComplete;
if(_182!=null){
_182();
}
},scrollTo:function(_183){
if(this.lastPixelOffset==_183){
return;
}
this.refreshContents(parseInt(_183/this.rowHeight),false);
this.div.scrollTop=_183%this.rowHeight;
this.lastPixelOffset=_183;
},visibleHeight:function(){
return parseInt(RicoUtil.getElementsComputedStyle(this.div,"height"));
}};
Rico.LiveGridRequest=Class.create();
Rico.LiveGridRequest.prototype={initialize:function(_184,_185){
this.requestOffset=_184;
}};
Rico.LiveGrid=Class.create();
Rico.LiveGrid.prototype={initialize:function(_186,_187,_188,url,_18a,_18b,_18c){
this.options={tableClass:$(_186).className,loadingClass:$(_186).className,scrollerBorderRight:"1px solid #ababab",bufferTimeout:20000,sortAscendImg:"unify/images/sort_asc.gif",sortDescendImg:"unify/images/sort_desc.gif",sortImageWidth:9,sortImageHeight:5,ajaxSortURLParms:[],onRefreshComplete:null,requestParameters:null,inlineStyles:true,columns:null,hasMargin:false};
Object.extend(this.options,_18a||{});
this.ajaxOptions={parameters:null};
Object.extend(this.ajaxOptions,_18b||{});
this.tableId=_186;
this.table=$(_186);
this.isViewForm=_18c;
this.addLiveGridHtml();
var _18d=this.table.rows[0].cells.length;
this.metaData=new Rico.LiveGridMetaData(_187,_188,_18d,_18a.columns,_18a);
this.buffer=new Rico.LiveGridBuffer(this.metaData);
var _18e=this.table.rows.length;
this.viewPort=new Rico.GridViewPort(this.table,this.table.offsetHeight/_18e,_187,this.buffer,this);
this.scroller=new Rico.LiveGridScroller(this,this.viewPort);
this.options.sortHandler=this.sortHandler.bind(this);
if($(_186+"_header")){
this.sort=new Rico.LiveGridSort(_186+"_header",this.options);
}
this.processingRequest=null;
this.unprocessedRequest=null;
this.ajaxUrl=url;
if(this.options.prefetchBuffer||this.options.prefetchOffset>0){
var _18f=0;
if(this.options.offset){
_18f=this.options.offset;
this.scroller.moveScroll(_18f);
this.viewPort.scrollTo(this.scroller.rowToPixel(_18f));
}
if(this.options.sortCol){
this.sortCol=_18a.sortCol;
this.sortDir=_18a.sortDir;
}
this.requestContentRefresh(_18f);
}
},addLiveGridHtml:function(){
if(this.table.getElementsByTagName("thead").length>0){
var _190=this.table.cloneNode(true);
_190.setAttribute("id",this.tableId+"_header");
_190.setAttribute("class",this.table.className+"_header");
for(var i=0;i<_190.tBodies.length;i++){
_190.removeChild(_190.tBodies[i]);
}
this.table.deleteTHead();
this.table.parentNode.insertBefore(_190,this.table);
}
new Insertion.Before(this.table,"<div id='"+this.tableId+"_container'></div>");
this.table.previousSibling.appendChild(this.table);
new Insertion.Before(this.table,"<div id='"+this.tableId+"_viewport' style='float:left;'></div>");
this.table.previousSibling.appendChild(this.table);
},resetContents:function(){
this.scroller.moveScroll(0);
this.buffer.clear();
this.viewPort.clearContents();
},sortHandler:function(_192){
if(!_192){
return;
}
this.sortCol=_192.name;
this.sortDir=_192.currentSort;
this.resetContents();
this.requestContentRefresh(0);
},adjustRowSize:function(){
},setTotalRows:function(_193){
this.metaData.setTotalRows(_193);
this.scroller.updateSize();
},initAjax:function(url){
ajaxEngine.registerRequest(this.tableId+"_request",url);
ajaxEngine.registerAjaxObject(this.tableId+"_updater",this);
},invokeAjax:function(){
},handleTimedOut:function(){
this.processingRequest=null;
this.processQueuedRequest();
},fetchBuffer:function(_195,_196){
if(!_196&&this.buffer.isInRange(_195)&&!this.buffer.isNearingLimit(_195)){
return;
}
if(this.processingRequest){
this.unprocessedRequest=new Rico.LiveGridRequest(_195);
return;
}
var _197=this.buffer.getFetchOffset(_195);
this.processingRequest=new Rico.LiveGridRequest(_195);
this.processingRequest.bufferOffset=_197;
var _198=this.buffer.getFetchSize(_195);
var _199=false;
var _19a;
if(this.options.requestParameters){
_19a=this._createQueryString(this.options.requestParameters,0);
}
_19a=(_19a==null)?"":_19a+"&";
_19a=_19a+"id="+this.tableId+"&page_size="+_198+"&offset="+_197;
if(typeof (this.sortCol)!="undefined"){
_19a=_19a+"&sort_col="+escape(this.sortCol)+"&sort_dir="+this.sortDir;
}
if(typeof (this.searchString)!="undefined"){
_19a=_19a+"&action=search&search_string="+escape(this.searchString);
}
this.ajaxOptions.parameters=_19a;
dojo.io.bind({url:this.ajaxUrl,load:dojo.lang.hitch(this,this.ajaxUpdate),mimetype:"text/plain",postContent:this.ajaxOptions.parameters});
this.timeoutHandler=setTimeout(this.handleTimedOut.bind(this),this.options.bufferTimeout);
},setRequestParams:function(){
this.options.requestParameters=[];
for(var i=0;i<arguments.length;i++){
this.options.requestParameters[i]=arguments[i];
}
},requestContentRefresh:function(_19c){
this.fetchBuffer(_19c,false);
},deleteRow:function(_19d){
this.buffer.deleteRow(_19d);
this.viewPort.bufferChanged(true);
},ajaxUpdate:function(type,data,evt){
try{
clearTimeout(this.timeoutHandler);
var _1a1=eval("("+data+")");
this.buffer.update(_1a1,this.processingRequest.bufferOffset);
this.viewPort.bufferChanged(false);
if(_1a1.recordCount){
this.setTotalRows(_1a1.recordCount);
}
}
catch(err){
}
finally{
this.processingRequest=null;
}
this.processQueuedRequest();
},_createQueryString:function(_1a2,_1a3){
var _1a4="";
if(!_1a2){
return _1a4;
}
for(var i=_1a3;i<_1a2.length;i++){
if(i!=_1a3){
_1a4+="&";
}
var _1a6=_1a2[i];
if(_1a6.name!=undefined&&_1a6.value!=undefined){
_1a4+=_1a6.name+"="+escape(_1a6.value);
}else{
var ePos=_1a6.indexOf("=");
var _1a8=_1a6.substring(0,ePos);
var _1a9=_1a6.substring(ePos+1);
_1a4+=_1a8+"="+escape(_1a9);
}
}
return _1a4;
},processQueuedRequest:function(){
if(this.unprocessedRequest!=null){
this.requestContentRefresh(this.unprocessedRequest.requestOffset);
this.unprocessedRequest=null;
}
}};
var RicoUtil={getElementsComputedStyle:function(_1aa,_1ab,_1ac){
if(arguments.length==2){
_1ac=_1ab;
}
var el=$(_1aa);
if(el.currentStyle){
return el.currentStyle[_1ab];
}else{
return document.defaultView.getComputedStyle(el,null).getPropertyValue(_1ac);
}
}};

