var DIALOG_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
function NXJDialogField(_1,_2,_3,_4,_5,_6,_7){
this.doButtonOnClick=function(){
if(!this.div.readOnly){
this.dialogWidget.onIconClick();
}
};
this.updateValue=function(_8){
this.text.value=_8;
};
this.getValue=function(){
var _9=this.text.value;
if(this.dialogWidget.allowMultiple){
var _a=new StringBuffer();
var _b=_9.split(";");
for(var _c=0;_c<_b.length;_c++){
var _d=this.findMatchValue(_b[_c]);
if(_c!=0){
_a.append(";");
}
_a.append(_d);
}
return _a.toString();
}
return this.findMatchValue(_9);
};
this.setValue=function(_e){
if(typeof (_e)!="undefined"&&_e!=null){
this.dialogWidget.selectedOptions=new Object();
if(this.dialogWidget.allowMultiple){
var _f=new StringBuffer();
var _10=_e.split(";");
for(var idx=0;idx<_10.length;idx++){
var val=_10[idx];
var _13=val;
val=this.findMatchName(val);
if(idx!=0){
_f.append(";");
}
_f.append(val);
this.dialogWidget.selectedOptions[_13]=val;
}
_e=_f.toString();
}else{
var _14=_e;
_e=this.findMatchName(_e);
this.dialogWidget.selectedOptions[_14]=_e;
}
this.text.value=_e;
}
};
this.findMatchName=function(_15){
var _16=this.dialogWidget.getOptionPairs();
if(_16!=null){
for(var idx=0;idx<_16.length;idx++){
var _18=_16[idx];
if(_18[1]==_15){
_15=_18[0];
break;
}
}
}
return _15;
};
this.findMatchValue=function(_19){
var _1a=this.dialogWidget.getOptionPairs();
if(_1a!=null){
for(var idx=0;idx<_1a.length;idx++){
var _1c=_1a[idx];
if(_1c[0]==_19){
return _1c[1];
}
}
}
return _19;
};
this.focus=function(){
this.text.focus();
};
this.setOptions=function(_1d){
if(_1d&&!this.div.readOnly){
this.button.disabled=false;
}
this.dialogWidget.options=_1d;
};
this.onFocus=function(_1e){
if(DIALOG_IS_IE){
_1e=window.event;
}
if(this.div.onfocus){
this.div.onfocus(_1e);
}
};
this.onBlur=function(_1f){
if(DIALOG_IS_IE){
_1f=window.event;
}
if(this.div.onblur){
this.div.onblur(_1f);
}
};
this.onTextChange=function(_20,_21){
this.div.setValue(this.text.value);
};
this.getId=function(){
return this.outerDivId;
};
this.isDialogField=true;
this.outerDivId=_1;
this.div=document.getElementById(_1);
if(!this.div){
return;
}
this.div.name=_1;
this.style=_3;
this.title=_7;
this.div.getValue=assignMethodToObj(this,"getValue");
this.div.setValue=assignMethodToObj(this,"setValue");
this.div.setOptions=assignMethodToObj(this,"setOptions");
var _22=this.div.getElementsByTagName("input");
for(var idx=0;idx<_22.length;idx++){
var _24=_22[idx];
if(_24.type=="button"){
this.button=_24;
}else{
if(_24.type=="text"){
this.text=_24;
}
}
}
if(this.style){
this.text.style.cssText=this.style;
this.button.style.cssText=this.style;
if(this.text.offsetWidth+this.button.offsetWidth>this.div.offsetWidth){
this.div.style.width=this.text.offsetWidth+this.button.offsetWidth;
}
}
Event.observe(this.button,"click",function(_25){
this.doButtonOnClick();
}.bindAsEventListener(this));
this.button.onblur=associateObjWithEvent(this,"onBlur");
this.button.onfocus=associateObjWithEvent(this,"onFocus");
if(!_6){
if(!_4||_4=="null"){
this.button.disabled="true";
}
}
this.text.onblur=associateObjWithEvent(this,"onBlur");
this.text.onfocus=associateObjWithEvent(this,"onFocus");
Event.observe(this.text,"keypress",function(_26){
switch(_26.keyCode){
case Event.KEY_TAB:
case Event.KEY_RETURN:
case Event.KEY_LEFT:
case Event.KEY_UP:
case Event.KEY_RIGHT:
case Event.KEY_DOWN:
case 16:
case 17:
case 18:
return;
}
if(_26.keyCode>=112&&_26.keyCode<=123){
return;
}
Event.stop(_26);
}.bindAsEventListener(this.text));
this.text.onchange=associateObjWithEvent(this,"onTextChange");
dojo.registerModulePath("composer","../composer");
if(_6){
dojo.require("composer.widget.Names");
this.dialogWidget=new composer.widget.Names(this);
}else{
dojo.require("composer.widget.DialogList");
this.dialogWidget=new composer.widget.DialogList(this,_5,_4);
}
}
function assignMethodToObj(obj,_28){
return (function(_29){
return obj[_28](_29);
});
}

