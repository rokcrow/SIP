var COMBO_BORDER_COLOR="#8888ff";
var COMBO_DOWN_KEY=40;
var COMBO_UP_KEY=38;
var COMBO_ENTER_KEY=13;
var COMBO_ESCAPE_KEY=27;
var COMBO_TAB_KEY=9;
var COMBO_ROW_HEIGHT=15;
var COMBO_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var NORMAL_ICON="images/combo.gif";
var ROLLOVER_ICON="images/combo_over.gif";
function NXJCombo(_1,_2,_3,_4,_5,_6){
if(_1.length){
this.outerDivId=_1;
this.div=document.getElementById(_1);
if(this.div==null){
return;
}
}else{
this.div=_1;
_1=this.div.id;
this.outerDivId=_1;
}
this.isIE=navigator.appName.indexOf("Microsoft")!=-1;
if(this.div.tagName=="SELECT"){
_4="";
var _7=this.div;
var _8=_7.options;
for(var _9=0;_9<_8.length;_9++){
if(_9!=0){
_4+=";";
}
_4+=_8[_9].text+"="+_8[_9].value;
}
var _a=document.createElement("div");
_a.style.cssText=_7.style.cssText;
if(false&&_7.parentNode.tagName=="DIV"){
_a.style.width="100%";
}
_a.name=_7.name;
_a.id=_7.id;
_a.tabIndex=_7.tabIndex;
_a.title=_7.title;
_7.parentNode.replaceChild(_a,_7);
this.div=_a;
}
var _b=this.div;
this.top=0;
this.left=0;
while(_b&&"absolute"!=_b.style.position){
this.top+=_b.offsetTop;
this.left+=_b.offsetLeft;
if(!_b.offsetParent){
break;
}
_b=_b.offsetParent;
}
this.popupParent=_b;
if(_6&&!this.isIE){
var _c=this.div;
this.gridPopupY=0;
this.gridPopupX=0;
while(_c){
this.gridPopupY+=_c.offsetTop;
this.gridPopupX+=_c.offsetLeft;
this.popupParent=_c;
_c=_c.offsetParent;
}
}
if(this.div.parentNode&&this.div.parentNode.tagName=="DIV"){
if(this.div.style.width=="auto"){
this.isAutoWidth=true;
}
this.div.style.width="100%";
}
this.div.onresize=associateObjWithEvent(this,"resize");
this.isCombo=true;
this.iconDir=_5;
this.gridRoot=_6;
this.className=_2;
this.style=_3;
this.titles=new Array();
this.values=new Array();
this.width=this.div.offsetWidth;
if(this.width==0){
this.width=parseInt(this.div.style.width);
}
this.height=this.div.offsetHeight;
if(this.height==0){
this.height=parseInt(this.div.style.height);
}
this.banner="NXJCombo";
this.div.combo=this;
this.div.getValue=comboGetValue;
this.div.setOptions=comboSetOptions;
this.div.setValue=comboSetValue;
var _d;
if(this.div.style.width=="auto"){
this.isAutoWidth=true;
}
if(!_6){
this.div.style.borderStyle="solid";
this.div.style.borderColor=COMBO_BORDER_COLOR;
this.div.style.borderWidth=1;
}
var _e=_4.split?_4.split(";").length:_4.length;
this.text=document.createElement("input");
this.button=document.createElement("img");
this.selectedRow=-1;
this.highlightedRow=-1;
this.listShowing=false;
if(this.isIE){
this.popup=window.createPopup();
for(var _9=0;_9<document.styleSheets.length;_9++){
this.popup.document.createStyleSheet(document.styleSheets[_9].href);
}
}else{
this.popup=document.createElement("div");
this.popup.combo=this;
this.popup.style.display="none";
this.popup.style.position="absolute";
this.popup.style.top=this.height+2;
this.popup.style.left=this.left;
this.popup.style.zIndex=100;
this.popup.document=new Object();
if(this.gridRoot){
var _f=0;
if(this.gridRoot.firstChild.firstChild){
_f=this.gridRoot.firstChild.firstChild.scrollTop;
}
this.popup.style.top=this.gridPopupY+this.height+2-_f;
this.popup.style.left=this.gridPopupX+2;
this.popupParent.appendChild(this.popup);
}else{
this.popupParent.appendChild(this.popup);
this.popupParent.style.overflow="visible";
}
}
this.popup.document.combo=this;
this.popupX=this.left;
this.popupY=this.top+this.height;
this.popupWidth=this.width;
if(!this.isIE){
COMBO_ROW_HEIGHT=16;
}
this.popupHeight=COMBO_ROW_HEIGHT*Math.min(5,_e);
this.text.className=_2;
this.text.tabIndex=this.div.tabIndex;
this.text.title=this.div.title;
this.text.style.cssText=_3;
this.text.style.position="absolute";
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.text.style.height=this.height-2;
this.text.style.width=this.width-18;
this.text.style.borderStyle="none";
this.text.style.borderWidth=0;
this.text.style.paddingLeft=3;
this.text.onchange=associateObjWithEvent(this,"doOnTextChange");
if(this.isIE){
this.text.onkeydown=associateObjWithEvent(this,"doOnTextKeyDown");
this.text.onmouseenter=associateObjWithEvent(this,"doOnMouseEnter");
this.text.onmouseleave=associateObjWithEvent(this,"doOnMouseLeave");
}else{
this.text.onkeypress=associateObjWithEvent(this,"doOnTextKeyDown");
this.text.onmouseover=associateObjWithEvent(this,"doOnMouseEnter");
this.text.onmouseout=associateObjWithEvent(this,"doOnMouseLeave");
}
this.button.className=_2;
this.button.style.cssText=_3;
this.button.style.position="absolute";
if(!_6){
this.top+=1;
}
this.button.style.top=this.top;
this.button.style.left=this.left+this.width-17;
this.button.style.height=this.height-2;
this.button.style.width=16;
this.button.style.borderStyle="none";
this.button.style.borderWidth=1;
this.button.style.borderColor=COMBO_BORDER_COLOR;
this.button.style.backgroundColor="black";
this.button.src=this.getIcon(NORMAL_ICON);
this.button.ondblclick=associateObjWithEvent(this,"doOnClick");
this.button.onmousedown=associateObjWithEvent(this,"doOnClick");
if(this.isIE){
this.button.onmouseenter=associateObjWithEvent(this,"doOnMouseEnter");
this.button.onmouseleave=associateObjWithEvent(this,"doOnMouseLeave");
}else{
this.button.onmouseover=associateObjWithEvent(this,"doOnMouseEnter");
this.button.onmouseout=associateObjWithEvent(this,"doOnMouseLeave");
}
if(this.div.style.visibility=="hidden"){
this.text.style.visibility="hidden";
this.button.style.visibility="hidden";
}
_b.appendChild(this.text);
_b.appendChild(this.button);
_b.onmove=this.div.onmove;
if(this.div.parentNode.tagName=="TD"){
this.div.parentNode.onresize=this.div.onresize;
this.div.parentNode.onMove=this.div.onmove;
}
this.text.name=_1;
this.div.setOptions(_4);
this.div.onchange=new Function("event","if(window.parent.clientManager!=null"+"&&window.parent.clientManager.eventsOK)"+"return window.parent.clientManager.onSelectChange(this)");
this.initialized=true;
}
NXJCombo.prototype.adjustPositions=function(){
var _10=this.div;
this.top=0;
this.left=0;
while(_10&&"absolute"!=_10.style.position){
this.top+=_10.offsetTop;
this.left+=_10.offsetLeft;
_10=_10.offsetParent;
}
this.popupX=this.left+0;
this.popupY=this.top+this.height;
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.button.style.top=this.top+1;
this.button.style.left=this.left+this.width-17;
};
NXJCombo.prototype.getIcon=function(_11){
return this.iconDir+"/"+_11;
};
NXJCombo.prototype.getNamedStyle=function(_12,_13){
_13=_13.toLowerCase();
if(!_12.styleSheets){
return null;
}
for(var _14=_12.styleSheets.length-1;_14>=0;_14--){
var _15=_12.styleSheets[_14];
if(!_15){
continue;
}
var _16=null;
try{
if(_15.rules){
_16=_15.rules;
}else{
if(_15.cssRules){
_16=_15.cssRules;
}
}
}
catch(e){
_16=new Array();
}
for(var idx=0;idx<_16.length;idx++){
var _18=_16[idx];
if(_18.selectorText&&_18.selectorText.toLowerCase()=="."+_13){
return _18.style;
}
}
}
return null;
};
NXJCombo.prototype.doonCellSelect=function(_19,_1a){
if(_1a.id&&_1a.id.indexOf("cell")==0){
var _1b=parseInt(_1a.id.substring(4));
return this.onCellSelect(_1b);
}
};
NXJCombo.prototype.onCellSelect=function(_1c){
this.selectedRow=_1c;
this.text.value=this.titles[_1c];
this.hidePopup();
};
NXJCombo.prototype.hidePopup=function(){
if(this.isIE){
this.popup.hide();
}else{
this.popup.isOpen=false;
this.wasOpen=false;
this.popup.style.display="none";
window.parent.clientManager.grabHandler=null;
}
this.text.focus();
this.listShowing=false;
if(this.div.onchange){
var _1d=new Object();
_1d.srcElement=this.div;
_1d.target=this.div;
this.div.onchange(_1d);
}
var mgr=window.parent.clientManager;
if(mgr){
var _1f=null;
var _20=this.outerDivId;
var dot=_20.lastIndexOf(".");
if(dot!=-1){
_20=_20.substr(0,dot+1);
}
var _22=mgr.findName(_20);
if(typeof (_22)=="undefined"){
return;
}
_1f=mgr.fieldDescriptors[_22];
if((_1f.flags&1)!=0){
mgr.doNextField();
}
}
};
function mozSetHighlightedRow(_23,_24){
var _25=_23.parentNode;
while(_25){
if(_25.tagName=="DIV"&&_25.combo){
combo=_25.combo;
combo.setHighlightedRow(_24);
return;
}
_25=_25.parentNode;
}
}
function mozSetRowColors(_26,_27,_28){
var _29=_26.parentNode;
while(_29){
if(_29.tagName=="DIV"&&_29.combo){
combo=_29.combo;
combo.setRowColors(_27,_28);
break;
}
_29=_29.parentNode;
}
}
function mozOnCellSelect(_2a,_2b){
var _2c=_2a.parentNode;
while(_2c){
if(_2c.tagName=="DIV"&&_2c.combo){
combo=_2c.combo;
combo.onCellSelect(_2b);
break;
}
_2c=_2c.parentNode;
}
}
NXJCombo.prototype.resize=function(_2d,_2e){
if(!this.initialized||this.div.offsetWidth==0){
return;
}
var _2f=this.div;
this.top=0;
this.left=0;
while(_2f&&"absolute"!=_2f.style.position){
this.top+=_2f.offsetTop;
this.left+=_2f.offsetLeft;
_2f=_2f.offsetParent;
}
this.popupX=this.left+0;
this.popupY=this.top+this.height;
this.width=this.div.offsetWidth;
this.popupWidth=this.width;
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.text.style.width=this.width-17;
this.button.style.top=this.top+1;
this.button.style.left=this.left+this.width-17;
};
NXJCombo.prototype.dosetHighlightedRow=function(_30,_31){
if(_31.id&&_31.id.indexOf("cell")==0){
var _32=parseInt(_31.id.substring(4));
return this.setHighlightedRow(_32);
}
};
NXJCombo.prototype.setHighlightedRow=function(_33){
if(this.highlightedRow==_33){
return;
}
if(this.highlightedRow!=-1){
this.setRowColors(this.highlightedRow,false);
}
this.setRowColors(_33,true);
this.highlightedRow=_33;
};
NXJCombo.prototype.setSelectedRow=function(_34){
if(this.highlightedRow==_34){
return;
}
if(this.highlightedRow!=-1&&this.highlightedRow!=_34){
this.setRowColors(this.highlightedRow,false);
}
if(_34!=-1){
this.setRowColors(_34,true);
}
this.selectedRow=_34;
this.highlightedRow=_34;
};
NXJCombo.prototype.dosetRowColors=function(_35,_36){
if(_36.id&&_36.id.indexOf("cell")==0){
var _37=parseInt(_36.id.substring(4));
return this.setRowColors(_37,false);
}
};
NXJCombo.prototype.setRowColors=function(_38,_39){
var _3a;
if(this.isIE){
_3a=this.popup.document.body;
scrollDiv=_3a.firstChild;
}else{
_3a=this.popup;
scrollDiv=_3a;
}
var div=_3a.firstChild;
if(!div){
return;
}
var _3c=div.firstChild;
if(!_3c){
return;
}
var _3d=_3c.firstChild;
var row=_3d.childNodes[_38];
var _3f=row.firstChild;
if(_3f.tagName!="TD"){
_3f=_3f.nextSibling;
}
if(_39){
this.savedFG=_3f.style.color;
this.savedBG=_3f.style.backgroundColor;
_3f.style.color="white";
_3f.style.backgroundColor="blue";
this.highlightedRow=_38;
}else{
_3f.style.color=this.savedFG;
_3f.style.backgroundColor=this.savedBG;
if(_38==this.highlightedRow){
this.highlightedRow=-1;
var _40=scrollDiv.offsetHeight;
var _41=_3f.offsetHeight;
var _42=scrollDiv.scrollTop;
var _43=_42+_40;
var _44=_38*_41;
var _45=_44+_41+2;
var _46=Math.floor(_40/_41);
if(_44<=_42){
scrollDiv.scrollTop=_44-_41;
}else{
if(_45>=_43){
scrollDiv.scrollTop+=_41;
}
}
}
}
};
NXJCombo.prototype.showPopup=function(){
this.wasOpen=true;
this.listShowing=true;
if(window.parent.clientManager){
window.parent.clientManager.setFocus(this.text,true);
}
if(this.isIE){
this.popup.show(this.popupX,this.popupY,this.popupWidth,this.popupHeight,this.popupParent);
}else{
if(this.gridRoot){
if(this.gridRoot.firstChild.firstChild){
scrollTop=this.gridRoot.firstChild.firstChild.scrollTop;
}
this.popup.style.top=this.gridPopupY+this.height+2-scrollTop;
this.popup.style.left=this.gridPopupX+4;
}else{
this.adjustPositions();
this.popup.style.left=this.popupX;
this.popup.style.top=this.popupY;
}
this.popup.isOpen=true;
this.adjustPositions();
this.popup.style.width=this.popupWidth;
this.popup.style.height=this.popupHeight;
this.popup.style.border="solid";
this.popup.style.borderWidth="1";
this.popup.style.display="inline";
window.parent.clientManager.grabHandler=associateObjWithEvent(this,"doOnPopupKeyDown");
window.parent.clientManager.grabId=this.outerDivId;
}
};
function comboGetValue(){
selIdx=this.combo.selectedRow;
if(selIdx!=-1){
return this.combo.values[selIdx];
}
return this.combo.text.value;
}
NXJCombo.prototype.doOnClick=function(_47,_48){
if(!this.gridRoot){
var mgr=window.parent.clientManager;
if(mgr){
if(!mgr.eventsOK){
return;
}
var _4a=null;
var _4b=this.outerDivId;
var dot=_4b.lastIndexOf(".");
if(dot!=-1){
_4b=_4b.substr(0,dot+1);
}
var _4d=mgr.findName(_4b);
if(typeof (_4d)=="undefined"){
return;
}
_4a=mgr.fieldDescriptors[_4d];
if((_4a.flags&16)==0||(_4a.flags&32)==0){
return;
}
var _4e=mgr.fieldDescriptors[mgr.currentFieldId];
if(_4e.field.name!=this.outerDivId&&!this.text.disabled){
if(_4e.field.onblur){
_4e.field.onblur();
}
mgr.focusType=0;
mgr.setFocus(this.text);
window.setTimeout(associateObjWithEvent(this,"doOnClick"),0);
return;
}
}
}
if(this.text.disabled){
return;
}
if(this.popup.isOpen){
this.hidePopup();
}else{
if(this.wasOpen){
this.wasOpen=false;
this.listShowing=false;
return;
}else{
this.showPopup();
}
}
};
NXJCombo.prototype.doOnMouseEnter=function(_4f,_50){
this.button.style.borderStyle="solid";
this.button.style.borderWidth=1;
this.button.style.borderColor=COMBO_BORDER_COLOR;
this.button.src=this.getIcon(ROLLOVER_ICON);
this.mouseInButton=_50==this.button;
this.wasOpen=this.mouseInButton&&this.popup&&this.popup.isOpen;
};
NXJCombo.prototype.doOnMouseLeave=function(_51,_52){
this.button.style.borderStyle="none";
this.button.src=this.getIcon(NORMAL_ICON);
this.mouseInButton=false;
};
NXJCombo.prototype.doOnPopupKeyDown=function(_53,_54){
var key=_53.keyCode;
if(key==COMBO_UP_KEY){
if(this.highlightedRow>0){
this.setSelectedRow(this.highlightedRow-1);
}
}else{
if(key==COMBO_DOWN_KEY){
if(this.highlightedRow<this.titles.length-1){
this.setSelectedRow(this.highlightedRow+1);
}
}else{
if(key==COMBO_ENTER_KEY||key==COMBO_TAB_KEY){
if(this.selectedRow!=-1){
this.text.value=this.titles[this.selectedRow];
}
this.hidePopup();
}else{
if(key==COMBO_ESCAPE_KEY){
this.hidePopup();
}else{
if(_53.type=="mousedown"&&!this.isIE){
var _56=_53.target;
if(_56==this.button||_56==this.text||_56==this.div||_56==this.popup||_56.parentNode==this.popup){
return;
}
var _57=_53.originalTarget;
try{
if((_56&&_56.tagName=="scrollbar")||(_57&&(_57.tagName=="xul:slider"||_57.tagName=="xul:scrollbarbutton"||_57.tagName=="xul:thumb"))){
var _58=_56.parentNode;
while(_58&&_58.tagName!="FORM"){
if(_58==this.popup){
return;
}
_58=_58.parentNode;
}
}
}
catch(e){
}
this.hidePopup();
}
}
}
}
}
return false;
};
NXJCombo.prototype.doOnTextChange=function(_59,_5a){
if(!this.initialized){
return false;
}
this.setSelectedRow(-1);
for(var idx=0;idx<this.values.length;idx++){
if(this.titles[idx]==this.text.value){
this.setSelectedRow(idx);
break;
}
}
};
NXJCombo.prototype.doOnTextKeyDown=function(_5c,_5d){
key=_5c.keyCode;
if(key==COMBO_DOWN_KEY&&(!this.listShowing||(this.isIE&&!this.popup.isOpen))){
this.showPopup();
_5c.cancelBubble=true;
return false;
}
if(this.listShowing&&!this.isIE&&this.popup.grabHandler){
return this.doOnPopupKeyDown(_5c);
}
if(this.div&&this.div.onkeydown&&(key==COMBO_UP_KEY||key==COMBO_DOWN_KEY||key==COMBO_ENTER_KEY||key==COMBO_TAB_KEY||key==COMBO_ESCAPE_KEY)){
if(!this.isIE&&key==COMBO_TAB_KEY){
_5c.cancelBubble=true;
return false;
}
this.div.onkeydown(_5c);
return false;
}
return key;
};
function comboSetOptions(_5e){
var _5f=_5e.split?_5e.split(";"):_5e;
this.combo.popupHeight=COMBO_ROW_HEIGHT*Math.min(5,_5f.length);
if(this.combo.isIE&&this.combo.isAutoWidth){
var _60=document.createElement("select");
_60.options.length=_5f.length;
_60.style.width="auto";
}
for(var idx=0;idx<_5f.length;idx++){
var _62=_5f[idx];
var _63=_62.indexOf("=");
if(_63==-1){
this.combo.titles[idx]=_62;
this.combo.values[idx]=_62;
}else{
this.combo.titles[idx]=_62.substring(0,_63);
this.combo.values[idx]=_62.substring(_63+1);
}
if(_60){
_60.options[idx].text=this.combo.titles[idx];
}
}
this.combo.text.value=this.combo.titles.length==0?"":this.combo.titles[0];
if(this.combo.isIE){
var _64=this.combo.popup.document.body;
}else{
var _64=this.combo.popup;
}
var _65=this.combo.text.style.fontFamily.length==0?"arial":this.combo.text.style.fontFamily;
var _66=this.combo.text.style.fontSize.length==0?"12":this.combo.text.style.fontSize;
if(_60){
var _67=0;
if(_5f.length<=5){
_67=15;
}
_60.style.fontFamily=_65;
_60.style.fontSize=_66;
_60=document.body.appendChild(_60);
this.combo.popupWidth=_60.clientWidth-_67;
document.body.removeChild(_60);
this.combo.popupHeight+=2;
}
var _68="border-style: solid; border-width: 1;";
var _69=this.combo.popupWidth;
if(!this.combo.isIE){
_68="border-style:none;";
}
var _6a="<div style=\"position: absolute;"+_68+" overflow-y: auto; width: "+_69+";height: "+this.combo.popupHeight+"\">";
_6a+="<table cellpadding='0' cellspacing='0'>";
var _6b="padding-left: 3; border-style:none;width: "+_69+";font-family: "+_65+"; font-size: "+_66;
if(this.combo.style&&this.combo.style.length!=0){
_6b+=";"+this.combo.style;
}
for(var idx=0;idx<this.combo.values.length;idx++){
var _6c=this.combo.titles[idx];
if(_6c.indexOf("<")!=-1){
_6c=_6c.replace(/</,"&lt;");
}
if(_6c.indexOf(">")!=-1){
_6c=_6c.replace(/>/,"&gt;");
}
if(this.combo.isIE){
var row="<tr> "+"<td style='"+_6b+"' class='"+this.combo.className+"' "+"id='cell"+idx+"'"+">"+"<nobr>"+_6c+"</nobr>"+"</td></tr>";
}else{
var row="<tr> "+"<td style='"+_6b+"' class='"+this.combo.className+"' "+"onmouseover='mozSetHighlightedRow(this,"+idx+");'"+"onmouseout='mozSetRowColors(this,"+idx+", false);'"+"onMouseDown='mozOnCellSelect(this,"+idx+");'>"+"<nobr>"+_6c+"</nobr>"+"</td></tr>";
}
_6a+=row;
}
_6a+="</table></div>";
_64.innerHTML=_6a;
if(this.combo.isIE){
_64.onkeydown=associateObjWithEvent(this.combo,"doOnPopupKeyDown");
var tds=_64.getElementsByTagName("TD");
for(var idx=0;idx<tds.length;idx++){
var td=tds[idx];
td.onmouseenter=associateObjWithEvent(this.combo,"dosetHighlightedRow");
td.onmouseleave=associateObjWithEvent(this.combo,"dosetRowColors");
td.onmousedown=associateObjWithEvent(this.combo,"doonCellSelect");
}
}else{
_64.grabHandler=associateObjWithEvent(this.combo,"doOnPopupKeyDown");
}
_64.style.cursor="default";
if(!this.combo.isIE){
_64.style.backgroundColor="Window";
_64.style.overflow="auto";
if(_64.childNodes.length&&_64.childNodes[0].childNodes.length){
_64.childNodes[0].childNodes[0].style.borderStyle="none";
}
}
this.combo.selectedRow=-1;
this.combo.highlightedRow=-1;
this.combo.doOnTextChange();
}
function comboSetValue(_70){
for(var idx=0;idx<this.combo.values.length;idx++){
if(this.combo.values[idx]==_70){
_70=this.combo.titles[idx];
break;
}
}
this.combo.text.value=_70;
this.combo.doOnTextChange();
}

