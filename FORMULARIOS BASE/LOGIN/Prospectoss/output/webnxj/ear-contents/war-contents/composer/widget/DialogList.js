dojo.provide("composer.widget.DialogList");
dojo.declare("composer.widget.DialogList",null,function(_1,_2,_3){
this.nxjControl=_1;
this.allowMultiple=_2;
this.options=_3;
var _4=djConfig["baseRelativePath"];
this.base=_4.substring(0,_4.length-"dojo/".length);
},{value:"",options:"",allowMultiple:false,selectedOptions:[],onIconClick:function(_5){
if(this.disabled){
return;
}
var _6=document.createElement("div");
_6.style.width="700px";
_6.style.height="500px";
document.body.appendChild(_6);
this.dialog=dojo.widget.createWidget("ModalFloatingPane",{id:"composer_Dialog",title:"Select Keywords",href:this.base+"composer/widget/templates/DialogListContent.html"},_6);
this.dialog.addOnLoad(this,"dialogLoaded");
this.dialog.show();
},dialogLoaded:function(){
this.populateSelectDiv();
var _7=document.getElementById("composer_DialogOK");
var _8=document.getElementById("composer_DialogCancel");
dojo.event.connect(_7,"onclick",this,"handleOk");
dojo.event.connect(_8,"onclick",this,"handleCancel");
},handleOk:function(){
var _9=new Object();
var _a="";
var _b="";
if(this.allowMultiple){
var _c=this.dialogSelectDiv.getElementsByTagName("input");
for(var _d=0;_d<_c.length;_d++){
if(_c[_d].type=="checkbox"&&_c[_d].checked){
if(_a!=""){
_a+=";";
_b+=";";
}
var _e=_c[_d].getAttribute("text");
_a+=_e;
_9[_c[_d].value]=_e;
_b+=_c[_d].value;
}
}
}else{
var _f=this.dialogSelectDiv.getElementsByTagName("select")[0];
var _d;
for(_d=0;_d<_f.length;_d++){
if(_f[_d].selected){
_a=_f[_d].text;
_b=_f[_d].value;
_9[_b]=_f[_d].text;
break;
}
}
}
this.selectedOptions=_9;
this.nxjControl.updateValue(this.getSelectionValue());
this.dialog.closeWindow();
this.nxjControl.focus();
var mgr=window.parent.clientManager;
if(mgr){
var _11=this.nxjControl.outerDivId;
var dot=_11.lastIndexOf(".");
if(dot!=-1){
_11=_11.substr(0,dot+1);
}
var _13=mgr.findName(_11);
if(typeof (_13)!="undefined"){
var _14=mgr.fieldDescriptors[_13];
if((_14.flags&1)!=0){
mgr.doNextField();
}
}
}
},handleCancel:function(){
this.dialog.closeWindow();
},populateSelectDiv:function(){
var _15=new StringBuffer();
if(this.options){
if(this.allowMultiple){
_15.append("<div style='color:black'>");
var _16=this.options.split(";");
for(var idx=0;idx<_16.length;idx++){
var _18=_16[idx].split("=");
if(!_18[1]){
_18[1]=_18[0];
}
var _19=false;
if(this.selectedOptions[_18[1]]!=null){
_19=true;
}
_15.append("<INPUT TYPE='CHECKBOX' value='").append(_18[1]).append("' ").append("id='dialog_options").append(idx).append("'");
if(_19){
_15.append("checked");
}
_15.append(" text='").append(_18[0]).append("' >").append("<label for='dialog_options").append(idx).append("' title='").append(_18[0]).append("'><nobr>").append(_18[0]).append("</nobr></label><BR>");
}
_15.append("</div>");
}else{
_15.append("<SELECT class='dialogSelect' size=20 style='width: 100%; height: 95%'>");
var _16=this.options.split(";");
for(var idx=0;idx<_16.length;idx++){
var _18=_16[idx].split("=");
if(!_18[1]){
_18[1]=_18[0];
}
var _19=false;
if(this.selectedOptions[_18[1]]!=null){
_19=true;
}
_15.append("<OPTION value='").append(_18[1]).append("' ");
_15.append("title='").append(_18[0]).append("' ");
if(_19){
_15.append("selected");
}
_15.append(">").append(_18[0]).append("</OPTION>");
}
_15.append("</SELECT><br>");
}
}
this.dialogSelectDiv=document.getElementById("dialogSelectDiv");
this.dialogSelectDiv.innerHTML=_15.toString();
if(this.allowMultiple){
this.dialogSelectDiv.style.overflowY="scroll";
}else{
var _1a=this.dialogSelectDiv.getElementsByTagName("SELECT")[0];
_1a.multiple=false;
dojo.event.connect(_1a,"ondblclick",this,"handleOk");
}
},getSelectionValue:function(){
var _1b=this.getOptionPairs();
var _1c=new StringBuffer();
var _1d=0;
for(var idx=0;idx<_1b.length;idx++){
var _1f=_1b[idx];
if(this.selectedOptions[_1f[1]]!=null){
if(_1d>0){
_1c.append(";");
}
_1c.append(_1f[0]);
_1d++;
}
}
return _1c.toString();
},getOptionPairs:function(){
if(!this.options){
return null;
}
var _20=this.options.split(";");
var _21=new Array();
for(var idx=0;idx<_20.length;idx++){
var _23=_20[idx].split("=");
if(!_23[1]){
_23[1]=_23[0];
}
_21.push(_23);
}
return _21;
}});

