function adjustMenuHeight(_1,_2){
var _3=null;
if(window.frameElement!=null&&window.frameElement.parentNode!=null){
_3=window.frameElement.parentNode;
}
if(_3!=null&&_3.rows){
var _4=_3.rows;
var _5=_4.split(",");
var _6="";
for(var _7=0;_7<_5.length;_7++){
if(_7!=1){
_6+=_5[_7];
}else{
_6+=_1;
}
if(_7!=_5.length-1){
_6+=",";
}
}
if(_6!=""&&_4!=_6){
_3.setAttribute("rows",_6);
}
if(_3.cols!=_2){
_3.setAttribute("cols",_2);
}
var _8=window.parent.clientManager;
if(_8&&_8.uploadingFrames){
_8.uploadingFrames[window.name]=null;
}
}
window.isReady=true;
}
function adjustHeaderHeight(_9){
var _a=null;
if(window.frameElement!=null&&window.frameElement.parentNode!=null){
_a=window.frameElement.parentNode;
}
if(_a!=null&&_a.rows){
var _b=0;
if(window.frameElement.name=="footer"){
_b=3;
}
var _c=_a.rows;
var _d="";
var _e=_c.split(",");
for(var _f=0;_f<_e.length;_f++){
if(_f!=_b){
_d+=_e[_f];
}else{
_d+=_9;
}
if(_f!=_e.length-1){
_d+=",";
}
}
if(_d!=""&&_c!=_d){
_a.setAttribute("rows",_d);
}
var mgr=window.parent.clientManager;
if(mgr&&mgr.uploadingFrames){
mgr.uploadingFrames[window.name]=null;
}
}else{
if(window.NXJ_FRAME_TARGET){
var _11=window.frameElement;
if(!_11&&window.parent){
var _12=window.parent.document.getElementsByTagName("IFRAME");
for(var _f=0;_f<_12.length;_f++){
if(_12[_f].name==window.name){
_11=_12[_f];
break;
}
}
}
if(_11&&_11.tagName=="IFRAME"&&window.document.forms&&window.document.forms.NXJForm){
var _13=window.document.forms.NXJForm;
var _14=parseInt(_13.style.height);
var _15=parseInt(_13.style.width);
if(!isNaN(_14)&&!isNaN(_15)){
var _16=(navigator.userAgent.indexOf("MSIE")>=0);
var _17=4;
if(!_16){
if(navigator.userAgent.indexOf("Netscape")>=0){
_17+=11;
}else{
_17+=12;
}
}
var _18=parseInt(_13.style.borderWidth);
if(!isNaN(_18)){
if(_16){
_17+=_18;
}else{
_17+=2*_18;
}
}
_11.style.height=(_14+_17)+"px";
_11.style.width=(_15+_17)+"px";
_11.allowTransparency=true;
}
}
}
}
window.isReady=true;
}
function adjustToolbar(_19,_1a,_1b){
if(window.name=="menu"){
adjustMenuHeight(_19,"0,*");
}else{
if(window.name=="vertmenu"){
adjustMenuHeight("0",_1a);
}else{
adjustHeaderHeight(_19);
}
}
var _1c=window.document.forms;
var mgr=window.parent.clientManager;
if(mgr!=null){
var e;
try{
window.skipImages=false;
window.skipButtons=false;
mgr.setImageStates(window,true);
mgr.setLinkStates(window,true);
mgr.setButtonStates(window,_1c.NXJForm,true);
mgr.updateSystemFields(window);
}
catch(e){
}
}
if(_1c&&_1c.NXJForm){
_1c.NXJForm.onsubmit=new Function("return false;");
var bg=window.document.body.background;
if(!bg){
bg=_1b;
}
if(bg){
_1c.NXJForm.style.backgroundImage="url("+bg+")";
}
}
window.isReady=true;
var _20=document.getElementsByTagName("SPAN");
if(_20){
for(var idx=0;idx<_20.length;idx++){
var _22=_20[idx].getAttribute("value");
if(_22){
_20[idx].innerHTML=_22;
}
}
}
}

