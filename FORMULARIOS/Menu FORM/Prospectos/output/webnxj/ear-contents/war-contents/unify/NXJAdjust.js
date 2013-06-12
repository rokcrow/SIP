function adjustChildTopPosition(_1,_2,_3){
var _4=_2.offsetTop;
var _5=_2.offsetHeight;
for(var _6=0;_6<_1.childNodes.length;_6++){
cdiv=_1.childNodes[_6];
if(cdiv!=_2&&cdiv.style&&cdiv.style.position=="absolute"&&cdiv.style.display!="none"){
var _7=parseInt(cdiv.style.top);
if(!isNaN(_7)&&_7+_3>_4+_5){
_7+=_3;
cdiv.style.top=_7+"px";
}
}
}
}
function adjustTables(){
var _8=document.getElementsByTagName("FIELDSET");
if(_8.length>0){
var _9=document.getElementsByTagName("TABLE");
for(var _a=0;_a<_9.length;_a++){
if(_9[_a].getAttribute("nxj_resize")=="1"){
var _b=_9[_a].parentNode;
var _c=_9[_a].clientHeight;
if(_c){
_9[_a].removeAttribute("nxj_resize");
_b.style.height=_c;
var _d=_b.getAttribute("ORIG_HEIGHT");
if(_d){
_d=parseInt(_d);
var _e=_c-_d;
var _f=_b.parentNode;
var _10;
adjustChildTopPosition(_f,_b,_e);
if(_f.tagName!="FORM"){
if(_f.style.height&&_f.style.height.indexOf("%")==-1){
var _11=parseInt(_f.style.height);
if(_11){
_11+=_e;
_f.style.height=_11+"px";
if(_f.tagName=="FIELDSET"){
_b=_f.parentNode;
_b.style.height=_11+"px";
_f=_b.parentNode;
adjustChildTopPosition(_f,_b,_e);
}
}
}
}
}
}
}
}
adjustTopTable();
}
}
function nxjdbl(){
return false;
}
function adjustTopTable(){
var _12=document.getElementById("toptable");
if(_12){
var _13=0;
var _14=document.getElementsByTagName("FORM");
for(var idx=0;idx<_14.length;idx++){
if(_14[idx].name=="NXJForm"){
var _16=_14[idx].firstChild;
var _17=0;
var _18;
while(_16){
_18=_16.offsetTop+_16.offsetHeight;
_17=Math.max(_17,_18);
_16=_16.nextSibling;
}
_14[idx].style.height=_17;
}
}
}
}
function openAttachment(){
}
function getNamedStyle(_19){
_19=_19.toLowerCase();
if(!this.document.styleSheets){
return null;
}
for(var _1a=this.document.styleSheets.length-1;_1a>=0;_1a--){
var _1b=this.document.styleSheets[_1a];
if(!_1b){
continue;
}
var _1c=null;
try{
if(_1b.rules){
_1c=_1b.rules;
}else{
if(_1b.cssRules){
_1c=_1b.cssRules;
}
}
}
catch(e){
_1c=new Array();
}
for(var idx=0;_1c!=null&&idx<_1c.length;idx++){
var _1e=_1c[idx];
if(_1e&&_1e.selectorText&&_1e.selectorText.toLowerCase()=="."+_19){
return _1e.style;
}
}
}
return null;
}

