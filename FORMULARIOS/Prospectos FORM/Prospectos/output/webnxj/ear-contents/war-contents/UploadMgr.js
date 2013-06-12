function UploadMgr(_1){
this.onblur=onblur;
this.onchange=onchange;
this.onmousedown=doOnMouseDown;
this.onfocusFrame=onfocusFrame;
this.isIE=(navigator.userAgent.indexOf("MSIE")>=0);
var _2=window.frameElement;
if(!_2&&window.parent){
var _3=window.parent.document.getElementsByTagName("IFRAME");
for(var _4=0;_4<_3.length;_4++){
if(_3[_4].name==window.name){
_2=_3[_4];
break;
}
}
}
this.frameElement=_2;
this.isImmediate=this.frameElement.getAttribute("immediate")=="true";
this.form=window.document.forms.NXJFileChooser;
if(this.form&&this.form.elements){
this.chooserField=this.form.elements.NXJChooser;
this.chooserField.frameElement=_2;
if(this.isImmediate){
this.chooserField.onchange=new Function("if(window.uploadMgr!=null)"+"try{window.uploadMgr.onchange();}catch(e){}");
}
this.chooserField.onblur=new Function("if(window.uploadMgr!=null)"+"try{window.uploadMgr.onblur();}catch(e){}");
_2.onfocus=new Function("if(window.uploadMgr!=null)"+"try{window.uploadMgr.onfocusFrame();}catch(e){}");
this.chooserField.onmousedown=new Function("if(window.uploadMgr!=null)"+"try{window.uploadMgr.onmousedown();}catch(e){}");
if(!this.frameElement.style.height){
var _5=this.chooserField.offsetHeight;
if(!_5){
_5=28;
}
this.frameElement.style.height=(_5+6)+"px";
}
if(!this.isIE){
var _6=11;
if(this.frameElement.style.fontSize){
_6=parseInt(this.frameElement.style.fontSize);
}
var _7=this.chooserField.offsetWidth;
if(!_7){
_7=parseInt(this.frameElement.style.width);
}
var _8=Math.floor((_7-(9*_6))/6);
this.chooserField.size=_8;
this.chooserField.style.width="";
}
}
window.document.onhelp=function(){
return false;
};
if(this.isIE){
window.document.onkeydown=new Function("event","if (window.parent.parent.clientManager != null)"+"try{return window.parent.parent.clientManager."+"onKeyDownForDocument(event);}catch(e){}return false;");
}else{
window.document.onkeypress=new Function("event"," if (window.parent.parent.clientManager != null)"+"try{return window.parent.parent.clientManager."+"onKeyDownForDocument(event);}catch(e){}return false;");
}
if(window.parent.parent.clientManager){
window.uploadMgr=this;
this.clientMgr=window.parent.parent.clientManager;
if(this.clientMgr.doingUpload){
this.clientMgr.doingUpload=false;
this.clientMgr.loading=false;
this.clientMgr.doingCommand=false;
this.clientMgr.doCommandInternal("unify.afterUpload",0,0);
}
}
window.setTimeout("checkMgr()",0);
}
function onchange(){
if(this.isImmediate){
this.clientMgr.doCommandInternal("_nxjNullCmd");
}
}
function onblur(){
this.clientMgr=window.parent.parent.clientManager;
if(this.clientMgr&&this.chooserField&&this.chooserField.value&&this.dvName){
var dv=this.clientMgr.getDataView(this.dvName);
if(dv&&dv.recordState.indexOf("modified")==-1){
dv.recordState+="/modified";
this.clientMgr.updateSystemField("record_state.",dv.recordState,true,dv.name);
}
}
}
function onfocusFrame(){
this.frameElement.blur();
this.chooserField.focus();
}
function doOnMouseDown(){
var _a=window.parent.parent.clientManager;
if(_a){
_a.focusType=0;
}
}
function checkMgr(){
if(uploadMgr&&uploadMgr.chooserField){
uploadMgr.clientMgr=window.parent.parent.clientManager;
if(uploadMgr.clientMgr&&!uploadMgr.dvName&&uploadMgr.chooserField.disabled){
var dv=uploadMgr.clientMgr.findDataView(uploadMgr.frameElement);
var _c=false;
if(dv.find){
_c=true;
}
uploadMgr.chooserField.disabled=_c;
uploadMgr.dvName=dv.name;
if(!uploadMgr.clientMgr.isIE&&!uploadMgr.useFrameset){
window.parent.backCheckSearch="#x"+uploadMgr.clientMgr.windowCounter;
window.parent.location.hash="x"+uploadMgr.clientMgr.windowCounter;
}
}
}
}

