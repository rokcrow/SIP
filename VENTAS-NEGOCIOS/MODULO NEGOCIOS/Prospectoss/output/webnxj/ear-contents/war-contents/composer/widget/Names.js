dojo.provide("composer.widget.Names");
dojo.declare("composer.widget.Names",null,function(_1){
this.nxjControl=_1;
var _2=djConfig["baseRelativePath"];
this.base=_2.substring(0,_2.length-"dojo/".length);
},{value:"",users:[],onIconClick:function(_3){
if(this.disabled){
return;
}
var _4=document.createElement("div");
_4.style.width="700px";
_4.style.height="500px";
document.body.appendChild(_4);
this.dialog=dojo.widget.createWidget("ModalFloatingPane",{id:"composer_Dialog",title:"Select Names",href:this.base+"composer/widget/templates/NamesAddressBook.html",displayCloseAction:true},_4);
this.dialog.addOnLoad(this,"dialogLoaded");
this.dialog.show();
},dialogLoaded:function(){
this.chooseSelect=document.getElementById("composer_ChooseSelect");
this.namesSelect=document.getElementById("composer_NamesSelect");
this.dialogLayout=dojo.widget.byId("composer_NamesDialogContainer");
var _5=document.getElementById("composer_DialogOk");
var _6=document.getElementById("composer_DialogCancel");
var _7=document.getElementById("composer_DialogAdd");
var _8=document.getElementById("composer_DialogDetails");
var _9=document.getElementById("composer_DialogRemove");
var _a=document.getElementById("composer_DialogRemoveAll");
var _b=document.getElementById("composer_DialogSearchBtn");
dojo.event.connect(_5,"onclick",this,"handleOk");
dojo.event.connect(_6,"onclick",this,"handleCancel");
dojo.event.connect(_7,"onclick",this,"handleAdd");
dojo.event.connect(_8,"onclick",this,"handleDetails");
dojo.event.connect(_9,"onclick",this,"handleRemove");
dojo.event.connect(_a,"onclick",this,"handleRemoveAll");
dojo.event.connect(_b,"onclick",this,"handleSearch");
this.populateNamesSelect();
},handleSearch:function(){
var _c=document.getElementById("composer_DialogSearchStr");
var _d=_c.value;
if(_d&&_d.length>0){
while(this.chooseSelect.hasChildNodes()){
this.chooseSelect.removeChild(this.chooseSelect.lastChild);
}
var _e=getContextPath()+"nxjAjax";
var _f=this.nxjControl.getId();
var _10=new Object();
_10.controlId=_f+"_nxjnames";
window.parent.clientManager.namesToComponents[_10.controlId]=this;
_10.parameters="controlId="+_f+"&filterName=givenname"+"&filterValue="+_d+"&managerId="+MANAGER_ID;
_10.onComplete=this.populateChooseSelect;
window.parent.clientManager.makeAjaxRequest(_e,_10);
}
},handleDetails:function(){
var _11;
for(var idx=0;idx<this.chooseSelect.length;idx++){
var _13=this.chooseSelect[idx];
if(_13.selected){
for(var zdx=0;zdx<this.users.length;zdx++){
if(this.users[zdx].abbreviatedName==_13.value){
_11=this.users[zdx];
break;
}
}
break;
}
}
if(_11){
this.displayDetails(_11);
}
},displayDetails:function(_15){
this.currentUserInfo=_15;
var _16=document.createElement("div");
_16.style.width="500px";
_16.style.height="250px";
document.body.appendChild(_16);
this.detailsDialog=dojo.widget.createWidget("ModalFloatingPane",{id:"composer_DetailsDialog",title:"Address Details",href:this.base+"composer/widget/templates/NamesAddressBookDetails.html"},_16);
this.detailsDialog.addOnLoad(this,"detailsDialogLoaded");
this.detailsDialog.show();
},detailsDialogLoaded:function(){
var _17=this.currentUserInfo;
var _18=document.getElementById("composer_DetailTitle");
var _19=document.getElementById("composer_DetailFirstName");
var _1a=document.getElementById("composer_DetailLastName");
var sal=document.getElementById("composer_DetailSalutation");
var _1c=document.getElementById("composer_DetailEmail");
var _1d=document.getElementById("composer_DetailClose");
dojo.event.connect(_1d,"onclick",this,"handleDetailClose");
_18.innerHTML=_17.firstName+" "+_17.lastName+" - "+_17.email;
_19.value=_17.firstName;
_1a.value=_17.lastName;
sal.value=_17.salutation;
_1c.value=_17.email;
this.twiddle(this.detailsDialog);
},handleAdd:function(){
for(var idx=0;idx<this.chooseSelect.length;idx++){
var _1f=this.chooseSelect[idx];
if(_1f.selected){
var _20=_1f.cloneNode(true);
_20.innerHTML=_20.value;
this.namesSelect.appendChild(_20);
}
}
this.twiddle(this.dialog);
},handleRemove:function(){
for(var idx=0;idx<this.namesSelect.length;idx++){
var _22=this.namesSelect[idx];
if(_22.selected){
this.namesSelect.removeChild(_22);
}
}
this.twiddle(this.dialog);
},handleRemoveAll:function(){
while(this.namesSelect.hasChildNodes()){
this.namesSelect.removeChild(this.namesSelect.lastChild);
}
this.twiddle(this.dialog);
},twiddle:function(_23){
var _24=parseInt(_23.domNode.style.width);
var _25=parseInt(_23.domNode.style.height);
_23.resizeTo(_24-5,_25-5);
_23.resizeTo(_24,_25);
},handleOk:function(){
var _26=new StringBuffer();
for(var idx=0;idx<this.namesSelect.length;idx++){
if(idx>0){
_26.append(";");
}
_26.append(this.namesSelect[idx].text);
}
this.selectedNames=_26.toString();
this.nxjControl.updateValue(this.selectedNames);
this.dialog.closeWindow();
this.nxjControl.focus();
},handleCancel:function(){
this.dialog.closeWindow();
},handleDetailClose:function(){
this.detailsDialog.closeWindow();
},populateNamesSelect:function(){
var _28=this.nxjControl.getValue();
if(_28){
var _29=_28.split(";");
for(var idx=0;idx<_29.length;idx++){
var _2b=_29[idx];
var _2c=document.createElement("option");
_2c.value=_2b;
_2c.innerHTML=_2b;
this.namesSelect.appendChild(_2c);
}
}
this.twiddle(this.dialog);
},populateChooseSelect:function(req){
var _2e=eval("("+req.responseText+")");
var _2f=_2e.users;
for(var idx=0;idx<_2f.length;idx++){
var _31=_2f[idx];
var _32=_31.firstName+" "+_31.lastName+" ("+_31.email+")";
var _33=document.createElement("option");
_33.value=_31.abbreviatedName;
_33.innerHTML=_32;
this.chooseSelect.appendChild(_33);
}
this.twiddle(this.dialog);
this.users=_2f;
},getOptionPairs:function(){
return null;
}});

