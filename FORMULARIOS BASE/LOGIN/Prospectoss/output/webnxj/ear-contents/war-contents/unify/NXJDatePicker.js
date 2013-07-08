var DATE_BORDER_COLOR="#8888ff";
var DATE_ROW_HEIGHT=15;
var DATE_POPUP_WIDTH=150;
var DATE_POPUP_HEIGHT=180;
var DATE_BUTTON_WIDTH=34;
var DATE_BUTTON_HEIGHT=22;
var DATE_ID_DELIMITER="@";
var DATE_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var DATE_ESCAPE_KEY=27;
var DATE_ENTER_KEY=13;
var DATE_UP_KEY=38;
var DATE_DOWN_KEY=40;
var DATE_LEFT_KEY=37;
var DATE_RIGHT_KEY=39;
var DATE_TAB_KEY=9;
var DATE_HOME_KEY=36;
var DATE_END_KEY=35;
var DATE_NORMAL_ICON="images/calbtn.gif";
var DATE_ROLLOVER_ICON="images/calbtn.gif";
var DATE_LEFT_ICON="images/left.gif";
var DATE_RIGHT_ICON="images/right.gif";
DATE_META_CHARACTERS=["<",">","!"];
DOMonth=[31,28,31,30,31,30,31,31,30,31,30,31];
lDOMonth=[31,29,31,30,31,30,31,31,30,31,30,31];
var defaultMonthNames=["January","February","March","April","May","June","July","August","September","October","November","December"];
var defaultDayNames=["S","M","T","W","T","F","S",];
function NXJDatePicker(_1,_2,_3,_4,_5,_6,_7,_8,_9,_a){
this.isDatePicker=true;
this.outerDivId=_1;
this.div=document.getElementById(_1);
if(!this.div){
return null;
}
this.div.name=_1;
while(this.div.childNodes.length!=0){
this.div.removeChild(this.div.childNodes[0]);
}
var _b=this.outerDivId+DATE_ID_DELIMITER+"POPUP";
var _c=document.getElementById(_b);
if(_c!=null){
document.body.removeChild(_c);
}
var _d=this.div;
this.top=0;
this.left=0;
while(_d&&"absolute"!=_d.style.position){
this.top+=_d.offsetTop;
this.left+=_d.offsetLeft;
_d=_d.offsetParent;
}
if(!_d){
_d=this.div;
}
window.parent.logBuffer="";
this.acceptHook=null;
this.systemIconBase=_4;
this.projectIconBase=_5;
this.className=_2;
this.style=_3;
this.format=_a&&_a.length!=0?_a:"MM/dd/yyyy";
this.banner="NXJDate";
this.popup=document.createElement("div");
this.popup.width=DATE_POPUP_WIDTH;
this.popup.height=DATE_POPUP_HEIGHT;
this.popup.style.zIndex=999;
this.popup.style.position="absolute";
this.popup.style.left=DATE_IS_IE?0:"-500px";
this.popup.style.top=DATE_IS_IE?0:"-500px";
this.popup.style.borderStyle="outset";
this.popup.style.borderWidth=2;
this.popup.style.backgroundColor="white";
this.popup.id=this.outerDivId+DATE_ID_DELIMITER+"POPUP";
this.popup.onkeydown=associateObjWithEvent(this,"dateKeyDown");
this.popup.onblur=associateObjWithEvent(this,"dateOnBlur");
this.popup.ondeactivate=associateObjWithEvent(this,"dateOnBlur");
this.div.onresize=associateObjWithEvent(this,"resize");
this.div.onmove=associateObjWithEvent(this,"resize");
if(DATE_IS_IE){
this.popupWindow=window.createPopup();
for(var _e=0;_e<document.styleSheets.length;_e++){
this.popupWindow.document.createStyleSheet(document.styleSheets[_e].href);
}
this.popupWindow.document.picker=this;
this.popupWindow.document.body.onkeydown=associateObjWithEvent(this,"dateKeyDown");
this.popupWindow.document.dateGetElementFromEvent=dateGetElementFromEvent;
this.popupWindow.document.dateGetXOffsetFromEvent=dateGetXOffsetFromEvent;
this.popupWindow.document.dateGetYOffsetFromEvent=dateGetYOffsetFromEvent;
}else{
document.body.appendChild(this.popup);
}
this.div.picker=this;
this.div.getValue=assignGetMethodToObject(this,"dateGetValue");
this.div.setValue=assignSetMethodToObject(this,"dateSetValue");
this.width=this.div.clientWidth;
if(this.width==0){
if(this.div.parentNode.tagName=="DIV"){
this.width=parseInt(this.div.parentNode.style.width);
}else{
this.width=parseInt(this.div.style.width);
}
}
this.height=this.div.clientHeight;
if(this.height==0){
this.height=parseInt(this.div.style.height);
}
if(this.div.parentNode.tagName=="DIV"){
this.div.style.width="100%";
}
if(!this.div.style.borderStyle){
this.div.style.borderStyle="solid";
}
if(!this.div.style.borderWidth){
this.div.style.borderWidth=1;
}
var _f=this.div.parentNode;
if(_f.tagName=="DIV"){
var _10=parseInt(this.div.style.borderWidth);
if(DATE_IS_IE){
if(_10>1){
_f.style.borderColor=this.div.style.borderColor;
_f.style.borderStyle=this.div.style.borderStyle;
_f.style.borderWidth=this.div.style.borderWidth;
}
}else{
this.top+=_10;
this.left+=_10;
}
}
this.text=document.createElement("input");
this.button=document.createElement("img");
this.text.className=_2;
this.text.name=this.outerDivId+"_text";
this.text.tabIndex=this.div.tabIndex;
this.text.style.cssText=_3;
this.text.style.position="absolute";
this.text.style.visibility=this.div.style.visibility;
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.text.style.height=this.height-2;
this.text.style.backgroundImage="none";
this.div.style.backgroundImage="none";
if(this.div.style.backgroundColor){
this.text.style.backgroundColor=this.div.style.backgroundColor;
}
if(this.div.style.foregroundColor){
this.text.style.foregroundColor=this.div.style.foregroundColor;
}
this.text.style.width=Math.max(1,this.width-DATE_BUTTON_WIDTH);
this.text.style.paddingLeft=3;
this.text.onfocus=associateObjWithEvent(this,"dateOnFocus");
this.text.onmousedown=associateObjWithEvent(this,"dateOnMouseDown");
this.button.className=_2;
this.button.style.position="absolute";
this.button.style.visibility=this.div.style.visibility;
this.button.style.top=this.top+1;
this.button.style.left=this.left+this.width-DATE_BUTTON_WIDTH-1;
this.button.style.height=this.height-2;
this.button.style.width=DATE_BUTTON_WIDTH;
this.button.borderStyle="solid";
this.button.borderWidth=1;
this.button.borderColor=DATE_BORDER_COLOR;
this.button.src=this.getIcon(_2,DATE_NORMAL_ICON);
this.button.onclick=associateObjWithEvent(this,"dateOnShowClicked");
this.button.ondblclick=associateObjWithEvent(this,"dateOnShowClicked");
this.button.onfocus=associateObjWithEvent(this,"dateOnFocus");
this.button.onmousedown=associateObjWithEvent(this,"dateOnMouseDown");
this.button.onmouseenter=associateObjWithEvent(this,"dateOnMouseEnter");
this.button.onmouseleave=associateObjWithEvent(this,"dateOnMouseLeave");
this.popupBackground=this.text.style.backgroundColor.length==0?"white":this.text.style.backgroundColor;
if(this.popupBackground=="transparent"){
this.popupBackground="white";
}
this.popupForeground=this.text.style.color.length==0?"black":this.text.style.color;
this.headerBackground=_7.length==0?"#cccccc":_7;
this.headerForeground=_6.length==0?"black":_6;
this.dayNames=_8.length==0?defaultDayNames:_8.split(",");
this.monthNames=_9.length==0?defaultMonthNames:_9.split(",");
_d.appendChild(this.text);
_d.appendChild(this.button);
_d.onmove=this.div.onmove;
if(this.div.parentNode.tagName=="TD"){
this.div.parentNode.onresize=associateObjWithEvent(this,"resize");
this.div.parentNode.onMove=associateObjWithEvent(this,"resize");
}
this.initialized=true;
this.resize();
}
NXJDatePicker.prototype.adjustDate=function(_11){
var _12=this.date.getDate()+_11;
var _13=this.getNumberOfDaysInMonth(this.date.getMonth(),this.date.getYear());
if(_12<1){
var _14=this.getPrevMonth();
var _15=this.getNumberOfDaysInMonth(_14.getMonth(),_14.getYear());
_14.setDate(_15+_12);
this.setDate(_14);
this.populatePopup();
}else{
if(_12>_13){
var _16=_12-_13;
var _17=this.getNextMonth();
_17.setDate(_16);
this.setDate(_17);
this.populatePopup();
}else{
this.selectTile(_12);
}
}
};
NXJDatePicker.prototype.adjustPositions=function(){
var _18=this.div;
this.top=0;
this.left=0;
while(_18&&"absolute"!=_18.style.position){
this.top+=_18.offsetTop;
this.left+=_18.offsetLeft;
_18=_18.offsetParent;
}
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.button.style.top=this.top+2;
this.button.style.left=this.left+this.width-DATE_BUTTON_WIDTH-1;
};
NXJDatePicker.prototype.getFormattedDate=function(){
var idx=0;
var _1a="";
var mgr=window.parent.clientManager;
if(this.metaCharacter!=null){
_1a+=this.metaCharacter;
}
if(mgr!=null&&mgr.dateFormat!=null&&mgr.dateFormat.length!=0){
this.format=mgr.dateFormat;
}
while(idx<this.format.length){
var _1c=this.format.charAt(idx);
switch(_1c){
case "M":
var _1d=1;
idx++;
while(idx<this.format.length&&this.format.charAt(idx)=="M"){
_1d++;
idx++;
}
if(_1d==3){
_1a+=this.monthNames[this.date.getMonth()];
}else{
var _1e=(this.date.getMonth()+1).toString();
for(var jdx=0;jdx<_1d-_1e.length;jdx++){
_1a+="0";
}
_1a+=_1e;
}
break;
case "d":
var _20;
var _21=1;
idx++;
while(idx<this.format.length&&this.format.charAt(idx)=="d"){
idx++;
_21++;
}
_20=this.date.getDate().toString();
for(var jdx=0;jdx<_21-_20.length;jdx++){
_1a+="0";
}
_1a+=_20;
break;
case "y":
var _22=1;
idx++;
while(idx<this.format.length&&this.format.charAt(idx)=="y"){
_22++;
idx++;
}
if(_22==4){
_1a+=this.date.getFullYear();
}else{
var _23=this.date.getFullYear().toString();
_1a+=_23.substring(4-_22);
}
break;
default:
_1a+=_1c;
idx++;
}
}
return _1a;
};
NXJDatePicker.prototype.getHTMLForPopup=function(_24){
var _25;
var _26=this.monthNames[this.date.getMonth()];
var _27=this.date.getFullYear();
var _28;
if(this.format.charAt(this.format.length-1)=="y"){
_28=_26+" "+_27;
}else{
_28=_27+" "+_26;
}
_25="<table cellpadding='0' cellspacing='0' border='0' width='"+DATE_POPUP_WIDTH+"' height='"+DATE_POPUP_HEIGHT+"'>"+"<tr>"+"<td> <table cellspacing=0> <tr style=' background-color: "+this.headerBackground+"; color: "+this.headerForeground+"'>"+"<td style='height: 100%'> <img style='height: 100%' id='"+this.outerDivId+DATE_ID_DELIMITER+"LEFT"+"' src='"+this.getIcon(null,DATE_LEFT_ICON)+"'> </td>"+"<td align='center' width="+(DATE_POPUP_WIDTH-38)+"'>"+"<span style='font-family: arial;"+" font-size: 10pt; font-weight: bold'>"+_28+"</span>"+"</td>"+"<td style='height: 100%'> <img style='height: 100%' id='"+this.outerDivId+DATE_ID_DELIMITER+"RIGHT"+"' src='"+this.getIcon(null,DATE_RIGHT_ICON)+"'> </td>"+"</td> </table> </tr>"+"</tr>"+"<tr>"+"<td> <table cellpadding='0' width='"+DATE_POPUP_WIDTH+"' cellspacing='0'> <tr>";
for(var idx=0;idx<7;idx++){
_25+="<td align='center' width='18' style='"+"font-family: arial; font-size: 8pt; font-weight: bold;"+"border-style: solid; border-color: "+this.popupBackground+"; background-color: "+this.popupBackground+"; border-width: 1'>"+this.dayNames[idx]+" </td>";
}
_25+="</tr> </table> </td> </tr>";
_25+="<tr height='5'>  <td align='center'> <table cellpadding='0' cellspacing='0'> <tr>";
_25+="<td style='width: "+DATE_POPUP_WIDTH+"; background-color: "+this.popupBackground+"'><hr></td> </tr> </table></td> </tr>";
_25+="<tr> <td> <table cellpadding='0' cellspacing='0'> <tr>";
var _26=this.date.getMonth();
var _27=this.date.getFullYear();
var _2a=this.date.getDate();
var _2b=new Date(_27,_26,1,0,0,0,0);
var _2c=_26==0?11:_26-1;
var _2d=_26==0?_27-1:_27;
var _2e=this.getNumberOfDaysInMonth(_2c,_2d);
var _2f=_2b.getDay();
var _30=this.getNumberOfDaysInMonth(_26,_27);
var _31=0;
var _32=_2f==0?7:_2f;
if(_2f==0){
_2e-=7;
}
for(var day=0;day<_32;day++){
_25+=this.getHTMLForTile(_2e-_2f+day+1,false,false);
}
if(_32==7){
_25+="</tr>";
_31++;
}
for(var day=1;day<=_30;day++){
_25+=this.getHTMLForTile(day,true,day==_2a);
if(_2f==6){
_25+="</tr>";
_2f=0;
_31++;
}else{
_2f++;
}
}
day=1;
while(_2f<=6){
_25+=this.getHTMLForTile(day,false,false);
day++;
_2f++;
}
_31++;
if(_31<6){
_25+="</tr>";
_2f=0;
while(_2f<=6){
_25+=this.getHTMLForTile(day,false,false);
day++;
_2f++;
}
}
_25+="</tr> </table> </td>";
_25+="<tr>  <td align='center'> <table cellpadding='0' cellspacing='0'> <tr>";
_25+="<td style='width: "+DATE_POPUP_WIDTH+"; background-color: "+this.popupBackground+"'><hr></td> </tr> </table></td> </tr>";
_25+="<tr>  <td> <table cellpadding='0' cellspacing='0'> <tr>"+"<td style='width: "+DATE_POPUP_WIDTH+"; background-color: "+this.popupBackground+"' align='center'>"+"<input type='button' value='OK' id='"+this.outerDivId+DATE_ID_DELIMITER+"OK"+"'>"+"</td> "+" </tr> </td> </table> </tr>";
return _25;
};
NXJDatePicker.prototype.getHTMLForTile=function(_34,_35,_36){
var _37=_36?"inset":"solid";
var _38=this.outerDivId+DATE_ID_DELIMITER+_34;
var _39=_35?" id='"+_38+"'":"";
var _3a;
var _3b=_36?"":"; border-color: "+this.popupBackground;
_3a="<td align='center' width='18' style='"+"font-family: arial; font-size: 8pt; font-weight: bold;"+"border-style: "+_37+"; color: "+(_35?this.popupForeground:"gray")+"; background-color: "+this.popupBackground+"; border-width: 2"+_3b+"; cursor: default'"+_39+"'";
_3a+=">"+_34+" </td>";
return _3a;
};
NXJDatePicker.prototype.getIcon=function(_3c,_3d){
var _3e;
var _3f;
if(_3c&&(_3e=this.getNamedStyle(_3c))&&(_3f=_3e.backgroundImage)){
var _40=_3f.indexOf("(");
var _41=_3f.indexOf(")");
if(_40!=-1&&_41!=-1&&_40<_41){
_3f=_3f.substring(_40+1,_41);
}
return this.projectIconBase+"/"+_3f;
}
return this.systemIconBase+"/"+_3d;
};
NXJDatePicker.prototype.getNamedStyle=function(_42){
_42=_42.toLowerCase();
if(!document.styleSheets){
return null;
}
for(var _43=document.styleSheets.length-1;_43>=0;_43--){
var _44=document.styleSheets[_43];
if(!_44){
continue;
}
var _45=null;
try{
if(_44.rules){
_45=_44.rules;
}else{
if(_44.cssRules){
_45=_44.cssRules;
}
}
}
catch(e){
_45=new Array();
}
for(var idx=0;idx<_45.length;idx++){
var _47=_45[idx];
if(_47.selectorText&&_47.selectorText.toLowerCase()=="."+_42){
return _47.style;
}
}
}
return null;
};
NXJDatePicker.prototype.getNextMonth=function(){
var _48=this.date.getMonth();
var _49=this.date.getFullYear();
var _4a;
if(_48==11){
_48=0;
_49++;
}else{
_48++;
}
return new Date(_49,_48,1,0,0,0,0);
};
NXJDatePicker.prototype.getNumberOfDaysInMonth=function(_4b,_4c){
if((_4c%4)==0){
if((_4c%100)==0&&(_4c%400)!=0){
return DOMonth[_4b];
}
return lDOMonth[_4b];
}else{
return DOMonth[_4b];
}
};
NXJDatePicker.prototype.getPrevMonth=function(){
var _4d=this.date.getMonth();
var _4e=this.date.getFullYear();
var _4f;
if(_4d==0){
_4d=11;
_4e--;
}else{
_4d--;
}
return new Date(_4e,_4d,this.getNumberOfDaysInMonth(_4d,_4e),0,0,0,0);
};
NXJDatePicker.prototype.hidePopup=function(){
if(DATE_IS_IE){
this.popupWindow.hide();
}else{
this.popup.style.top=-500;
this.popup.style.left=-500;
}
this.popupShowing=false;
};
NXJDatePicker.prototype.parseDate=function(_50){
var _51=0;
var _52=0;
var _53=0;
var _54=0;
var _55=1;
var mgr=window.parent.clientManager;
var _57=mgr==null?null:parseInt(mgr.validator.centurycutoff,10);
if(_50==null||_50.length==0){
return new Date();
}
var mgr=window.parent.clientManager;
if(mgr!=null&&mgr.dateFormat!=null&&mgr.dateFormat.length!=0){
this.format=mgr.dateFormat;
}
while(_51<this.format.length){
var _58=this.format.charAt(_51);
if(_58=="M"||_58=="d"||_58=="y"){
var _59=_58;
var _5a=1;
_51++;
while(_51<this.format.length&&this.format.charAt(_51)==_59){
_5a++;
_51++;
}
var _5b=Math.min(_5a,_50.length-_52);
var _5c;
var _5d;
if(_51<this.format.length){
var _5e=this.format.charAt(_51);
if(_5e!="M"&&_5e!="d"&&_5e!="y"){
var _5f=_50.substring(_52).indexOf(_5e);
_5b=Math.min(_5b,_5f);
}
}
_5c=_52+_5b;
_5d=_50.substring(_52,_5c);
_52=_5c;
switch(_58){
case "M":
_54=-1;
for(var idx=0;idx<this.monthNames.length;idx++){
if(this.monthNames[idx].indexOf(_5d)==0){
_54=idx;
break;
}
}
if(_54==-1){
_54=parseInt(_5d,10)-1;
}
break;
case "d":
_55=parseInt(_5d,10);
break;
case "y":
_53=parseInt(_5d,10);
if(_5a==2){
var old=_53;
_53=_53+1900>_57?_53+1900:_53+2000;
}
break;
}
}else{
_51++;
_52++;
}
}
return new Date(_53,_54,_55,0,0,0,0);
};
NXJDatePicker.prototype.populatePopup=function(){
if(this.popup.childNodes.length!=0){
this.popup.removeChild(this.popup.childNodes[0]);
}
this.popup.innerHTML=this.getHTMLForPopup();
if(DATE_IS_IE){
this.popupWindow.document.body.innerHTML=this.popup.outerHTML;
this.assignPopupHandlers(this.popupWindow.document);
}else{
this.assignPopupHandlers(document);
}
};
NXJDatePicker.prototype.assignPopupHandlers=function(doc){
var _63=doc.getElementById(this.outerDivId+DATE_ID_DELIMITER+"RIGHT");
if(_63){
_63.onclick=associateObjWithEvent(this,"dateDisplayNextMonth");
}
var _64=doc.getElementById(this.outerDivId+DATE_ID_DELIMITER+"LEFT");
if(_64){
_64.onclick=associateObjWithEvent(this,"dateDisplayPrevMonth");
}
var _65=doc.getElementById(this.outerDivId+DATE_ID_DELIMITER+"OK");
if(_65){
_65.onclick=associateObjWithEvent(this,"dateOnOKClicked");
}
for(var idx=1;idx<=31;idx++){
var _67=doc.getElementById(this.outerDivId+DATE_ID_DELIMITER+idx);
if(_67){
_67.onclick=associateObjWithEvent(this,"dateSelectTile");
_67.ondblclick=associateObjWithEvent(this,"dateSelectTileAndOK");
}
}
};
NXJDatePicker.prototype.resize=function(){
if(!this.initialized){
return false;
}
var _68=this.div;
this.top=0;
this.left=0;
while(_68&&"absolute"!=_68.style.position){
this.top+=_68.offsetTop;
this.left+=_68.offsetLeft;
_68=_68.offsetParent;
}
this.width=this.div.clientWidth;
if(!this.width){
if(this.div.parentNode.tagName=="DIV"){
this.width=parseInt(this.div.parentNode.style.width);
}else{
this.width=parseInt(this.div.style.width);
}
}
if(!this.width){
return;
}
this.text.style.top=this.top+1;
this.text.style.left=this.left+1;
this.text.style.height=this.height-2;
this.text.style.width=Math.max(1,this.width-DATE_BUTTON_WIDTH);
this.button.style.top=this.top+1;
this.button.style.left=this.left+this.width-DATE_BUTTON_WIDTH-1;
this.button.style.height=this.height-2;
if(!DATE_IS_IE){
this.text.style.width=this.width-DATE_BUTTON_WIDTH-1;
this.button.style.left=this.left+this.width-DATE_BUTTON_WIDTH-1;
}
};
NXJDatePicker.prototype.selectTile=function(_69){
var _6a=this.outerDivId+DATE_ID_DELIMITER+this.date.getDate();
var _6b=this.outerDivId+DATE_ID_DELIMITER+_69;
var _6c=document.getElementById(_6b);
var _6d=document.getElementById(_6a);
if(_6d==null){
_6d=this.popupWindow.document.getElementById(_6a);
}
if(_6c==null){
_6c=this.popupWindow.document.getElementById(_6b);
}
this.date=new Date(this.date.getFullYear(),this.date.getMonth(),_69,0,0,0,0);
if(_6d!=_6c){
_6d.style.borderStyle="solid";
_6d.style.borderColor=this.popupBackground;
_6c.style.borderStyle="inset";
_6c.style.borderColor="white";
}
};
NXJDatePicker.prototype.setDate=function(_6e){
this.date=_6e;
};
NXJDatePicker.prototype.showPopup=function(){
if(DATE_IS_IE){
this.popupWindow.document.body.innerHTML=this.popup.outerHTML;
this.assignPopupHandlers(this.popupWindow.document);
this.popupWindow.show(0,20,150,200,this.div);
}else{
var top=0;
var _70=0;
var _71=this.div;
while(_71&&_71.tagName!="FORM"){
top+=_71.offsetTop.valueOf();
top-=_71.scrollTop.valueOf();
_70+=_71.offsetLeft.valueOf();
_71=_71.offsetParent;
}
top+=this.height;
this.popup.style.left=_70;
this.popup.style.top=top;
var _72=document.getElementById(this.outerDivId+DATE_ID_DELIMITER+"OK");
_72.focus();
}
this.popupShowing=true;
};
NXJDatePicker.prototype.dateDisplayNextMonth=function(_73,_74){
this.setDate(this.getNextMonth());
this.populatePopup();
};
NXJDatePicker.prototype.dateDisplayPrevMonth=function(_75,_76){
this.setDate(this.getPrevMonth());
this.populatePopup();
};
function dateGetElementFromEvent(_77){
return DATE_IS_IE?_77.srcElement:_77.target;
}
NXJDatePicker.prototype.dateGetValue=function(){
return this.text.value;
};
function dateGetXOffsetFromEvent(_78){
if(DATE_IS_IE){
return _78.offsetX;
}else{
return _78.clientX;
}
}
function dateGetYOffsetFromEvent(_79){
if(DATE_IS_IE){
return _79.offsetY;
}else{
return _79.clientY;
}
}
NXJDatePicker.prototype.dateKeyDown=function(_7a,_7b){
if(_7a==null){
_7a=this.popupWindow.document.parentWindow.event;
}
var key=_7a.keyCode;
if(key==DATE_LEFT_KEY){
this.adjustDate(-1);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_RIGHT_KEY){
this.adjustDate(+1);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_UP_KEY){
this.adjustDate(-7);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_DOWN_KEY){
this.adjustDate(+7);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_HOME_KEY){
this.selectTile(1);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_END_KEY){
var _7d=this.getNumberOfDaysInMonth(this.date.getMonth(),this.date.getFullYear());
this.selectTile(_7d);
_7a.cancelBubble=true;
return false;
}else{
if(key==DATE_ENTER_KEY||key==DATE_TAB_KEY){
this.text.value=this.getFormattedDate();
this.hidePopup();
if(this.acceptHook!=null){
this.acceptHook();
}else{
if(key==DATE_TAB_KEY){
var mgr=window.parent.clientManager;
if(mgr){
if(_7a.shiftKey){
mgr.doPrevField();
}else{
mgr.doNextField();
}
}
}
}
}else{
if(key==DATE_ESCAPE_KEY){
this.hidePopup();
}
}
}
}
}
}
}
}
};
NXJDatePicker.prototype.dateOnBlur=function(_7f,_80){
var key=_7f.keyCode;
var _82=dateGetElementFromEvent(_7f);
var idx=_82.id.indexOf(DATE_ID_DELIMITER);
var _84=dateGetXOffsetFromEvent(_7f);
var _85=dateGetYOffsetFromEvent(_7f);
var _86=_82;
if(this.popup==null){
alert("no popup for "+_82.id+" "+this.banner);
return;
}
while(_86!=null&&_86!=this.popup){
_84+=_86.offsetLeft;
_85+=_86.offsetTop;
_86=_86.offsetParent;
}
if(_86==null){
return;
}
if(_84<0||_84>this.popup.clientWidth||_85<0||_85>this.popup.clientHeight){
this.hidePopup();
}
};
NXJDatePicker.prototype.dateOnFocus=function(_87,_88){
if(this.div.onfocus!=null){
this.div.onfocus(_87);
}
};
NXJDatePicker.prototype.dateOnMouseDown=function(_89,_8a){
if(this.div.onmousedown!=null){
this.div.onmousedown(_89);
}
};
NXJDatePicker.prototype.dateOnMouseEnter=function(_8b,_8c){
var _8d=DATE_IS_IE?_8b.srcElement:_8b.target;
this.mouseInButton=_8d==this.button;
this.wasOpen=this.mouseInButton&&this.popup&&this.popup.isOpen;
};
NXJDatePicker.prototype.dateOnMouseLeave=function(_8e,_8f){
this.mouseInButton=false;
};
NXJDatePicker.prototype.dateOnOKClicked=function(_90,_91){
this.text.value=this.getFormattedDate();
this.hidePopup();
if(this.acceptHook!=null){
this.acceptHook();
}
};
NXJDatePicker.prototype.dateOnShowClicked=function(_92,_93){
if(DATE_IS_IE&&this.popupShowing){
this.popupShowing=this.popupWindow.isOpen;
}
if(this.popupShowing){
this.text.value=this.getFormattedDate();
this.hidePopup();
if(this.acceptHook!=null){
this.acceptHook();
}
return;
}
var _94=this.popup;
var mgr=window.parent.clientManager;
var _96=this.text.value;
if(this.button.disabled){
return;
}
this.metaCharacter=null;
if(mgr!=null){
var _97=false;
var _98=this.outerDivId;
if(_98.indexOf("NXJGrid")==0){
_97=true;
_98=this.fieldId;
}
var dot=_98.lastIndexOf(".");
if(dot!=-1){
_98=_98.substr(0,dot+1);
}
var _9a=mgr.findName(_98);
if(typeof (_9a)=="undefined"){
return;
}
var _9b=mgr.fieldDescriptors[_9a];
if((_9b.flags&16)==0||(_9b.flags&32)==0){
return;
}
var _9c=mgr.findDataView(this.div);
if(_9c.find){
if(_96.indexOf(",")!=-1||_96.indexOf("-")!=-1){
return;
}
for(var idx=0;idx<DATE_META_CHARACTERS.length;idx++){
var _9e=_96.indexOf(DATE_META_CHARACTERS[idx]);
if(_9e!=-1){
this.metaCharacter=DATE_META_CHARACTERS[idx];
_96=_96.substring(_9e+1);
var _9f="";
for(var idx=0;idx<_96.length;idx++){
var chr=_96.charAt(idx);
if(chr!=" "){
_9f+=chr;
}
}
_96=_9f;
break;
}
}
}
if(mgr.focusElement!=this.div&&!_97){
mgr.setFocus(this.div);
}
}
var _a1=this.text.value;
var _9f="";
for(var idx=0;idx<_a1.length;idx++){
var chr=_a1.charAt(idx);
if(chr!=" "){
_9f+=chr;
}
}
_a1=_9f;
var _a2=_a1.length==0?new Date():this.parseDate(_96);
var _a3;
if(isNaN(_a2)){
var mgr=window.parent.clientManager;
if(mgr!=null){
mgr.messageHandler.alert("INVALID_DATETIME_VALUE");
}
_a2=new Date();
}
this.setDate(_a2);
this.populatePopup();
this.showPopup();
};
NXJDatePicker.prototype.dateSetValue=function(_a4){
var _a5="";
for(var idx=0;idx<_a4.length;idx++){
var chr=_a4.charAt(idx);
if(chr!=" "){
_a5+=chr;
}
}
_a4=_a5;
this.text.value=_a4;
};
NXJDatePicker.prototype.dateSelectTile=function(_a8,_a9){
var _aa=_a9.id.split(DATE_ID_DELIMITER);
var _ab=parseInt(_aa[1]);
this.selectTile(_ab);
};
NXJDatePicker.prototype.dateSelectTileAndOK=function(_ac,_ad){
this.dateSelectTile(_ac,_ad);
this.dateOnOKClicked(_ac,_ad);
};
function assignGetMethodToObject(obj,_af){
return (function(){
return obj[_af]();
});
}
function assignSetMethodToObject(obj,_b1){
return (function(_b2){
return obj[_b1](_b2);
});
}

