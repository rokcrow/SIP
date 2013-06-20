var NOTEBOOK_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var NOTEBOOK_SELECTED_ICON="images/winxptabactive.gif";
var NOTEBOOK_DESELECTED_ICON="images/winxptabinactive.gif";
var NOTEBOOK_ROLLOVER=false;
var NOTEBOOK_ELEVATOR_SELECTED_ICON="images/bluetile.gif";
var NOTEBOOK_ELEVATOR_DESELECTED_ICON="images/graytile.gif";
var NOTEBOOK_ELEVATOR_ROLLOVER_ICON="images/lightbluetile.gif";
function NXJNotebook(_1,_2,_3,_4,_5){
var _6=new Date().valueOf();
window.logBuffer="";
this.isNotebook=true;
this.systemIconBase=_3;
this.projectIconBase=_4;
if(_5){
this.selectedIcon=this.getIcon("selected_elevator_tab",NOTEBOOK_ELEVATOR_SELECTED_ICON);
this.deselectedIcon=this.getIcon("unselected_elevator_tab",NOTEBOOK_ELEVATOR_DESELECTED_ICON);
this.rolloverIcon=this.getIcon("rolloverElevatorTab",NOTEBOOK_ELEVATOR_ROLLOVER_ICON);
}else{
this.selectedIcon=this.getIcon("selected_tab_header",NOTEBOOK_SELECTED_ICON);
this.deselectedIcon=this.getIcon("unselected_tab_header",NOTEBOOK_DESELECTED_ICON);
}
this.outerDivId=_1;
this.outerDiv=document.getElementById(_1);
if(!this.outerDiv){
return null;
}
if(NOTEBOOK_IS_IE){
this.outerDiv.hideFocus=true;
}else{
this.outerDiv.onmousedown=associateObjWithEvent(this,"notebookMouseDown");
}
this.selectedIndex=0;
this.hideTabs=(this.outerDiv.getAttribute("hide_tabs")=="true");
this.tabCellSpacing=parseInt(this.outerDiv.getAttribute("tab_cell_spacing"));
if(isNaN(this.tabCellSpacing)){
this.tabCellSpacing=0;
}
this.borderWidth=this.outerDiv.style.borderWidth?parseInt(this.outerDiv.style.borderWidth):0;
this.pages=new Array();
this.elevator=_5;
var _7=0;
for(var _8=0;_8<this.outerDiv.childNodes.length;_8++){
var _9=this.outerDiv.childNodes[_8];
if(_9.tagName){
this.pages[_7++]=_9;
}
}
var _a=this.outerDiv;
this.top=0;
this.left=0;
while(_a&&"absolute"!=_a.style.position){
this.top+=_a.offsetTop;
this.left+=_a.offsetLeft;
_a=_a.offsetParent;
}
if(!_a){
_a=this.outerDiv;
}
if(_a!=this.outerDiv){
_a.className=this.outerDiv.className;
if(this.borderWidth){
_a.style.borderWidth=this.borderWidth;
this.outerDiv.style.borderWidth=0;
}
if(this.outerDiv.style.borderColor){
_a.style.borderColor=this.outerDiv.style.borderColor;
this.outerDiv.style.borderColor="";
}
if(this.outerDiv.style.borderStyle){
_a.style.borderStyle=this.outerDiv.style.borderStyle;
this.outerDiv.style.borderStyle="none";
}
}
this.nvisible=this.pages.length;
if(this.outerDiv.parentNode.tagName=="DIV"){
this.outerDiv.style.width="100%";
this.outerDiv.style.height="100%";
}
this.outerDiv.onresize=associateObjWithEvent(this,"notebookResize");
for(var _8=0;_8<this.pages.length;_8++){
var _b=this.pages[_8];
_b.style.position="absolute";
_b.style.left=NOTEBOOK_IS_IE?this.left+this.borderWidth:this.left+this.borderWidth+1;
_b.style.width="100%";
_b.isPage=true;
_b.notebook=this;
if(_a!=this.outerDiv){
this.outerDiv.removeChild(_b);
_a.appendChild(_b);
}
}
this.disabledTabStyle=this.getNamedStyle("disabled_tab_header");
this.buttons=new Array();
var _c=this.getNamedStyle(_5?"SELECTED_NOTEBOOK_TAB":"SELECTED_TAB");
var _d="verdana, arial, helvetica, sans-serif";
var _e="12";
var _f="";
if(_c){
if(_c.fontFamily&&_c.fontFamily.length!==0){
_d=_c.fontFamily;
}
if(_c.fontSize&&_c.fontSize.length!==0){
_e=_c.fontSize;
}
if(_c.fontWeight&&_c.fontWeight.length!==0){
_f=_c.fontWeight;
}
}
if(_5){
for(var _8=0;_8<_2.length;_8++){
this.buttons[_8]=this.createButton(_2[_8],_d,_e,_f,_8);
if(this.hideTabs){
this.buttons[_8].style.display="none";
}
_a.appendChild(this.buttons[_8]);
}
}else{
this.buttonTable=document.createElement("table");
this.tbody=document.createElement("tbody");
this.buttonRow=document.createElement("tr");
this.buttonTable.style.position="absolute";
this.buttonTable.style.left=this.borderWidth;
this.buttonTable.style.top=this.borderWidth;
if(this.hideTabs){
this.buttonTable.style.display="none";
}else{
this.buttonTable.cellSpacing=this.tabCellSpacing;
this.buttonTable.cellPadding=2;
}
this.tbody.appendChild(this.buttonRow);
this.buttonTable.appendChild(this.tbody);
_a.appendChild(this.buttonTable);
var _10=this.getNamedStyle("selected_tab_header");
for(var _8=0;_8<_2.length;_8++){
this.buttons[_8]=this.createButton(_2[_8],_d,_e,_f,_8,_10);
this.buttonRow.appendChild(this.buttons[_8]);
}
}
for(var _8=0;_8<this.pages.length;_8++){
if(this.pages[_8].title){
this.buttons[_8].title=this.pages[_8].title;
this.pages[_8].title="";
}
}
_a.onmove=this.outerDiv.onmove;
if(this.outerDiv.parentNode.tagName=="TD"){
this.outerDiv.parentNode.onresize=this.outerDiv.onresize;
this.outerDiv.parentNode.onMove=this.outerDiv.onmove;
}
this.layout();
this.initialized=true;
window.parent.makePageCurrent=notebookMakePageCurrent;
window.parent.isOnNonCurrentPage=notebookIsOnNonCurrentPage;
window.parent.isOnCurrentPage=notebookIsOnCurrentPage;
window.parent.isOnUnavailablePage=notebookIsOnUnavailablePage;
window.parent.getNotebook=notebookGetNotebook;
window.parent.getNotebookPage=notebookGetNotebookPage;
var _11=new Date().valueOf();
}
NXJNotebook.prototype.createButton=function(_12,_13,_14,_15,idx,_17){
var tag=this.elevator?"div":"td";
var _19=document.createElement("a");
var _1a=document.createElement(tag);
_1a.noWrap=true;
_19.appendChild(document.createTextNode(_12));
_19.removeAttribute("href");
_19.style.textDecoration="none";
_19.style.borderStyle="none";
_19.style.padding="0px";
_19.isPageButton=true;
_19.id=this.outerDivId.replace(/\./g,"_")+"_link"+idx;
if(!_17){
_1a.style.borderStyle="solid";
_1a.style.borderWidth="1";
}
_1a.style.visibility="visible";
_1a.style.fontFamily=_13;
_1a.style.fontSize=_14;
_1a.style.fontWeight=_15;
_1a.style.paddingTop=0;
_1a.style.cursor="pointer";
_1a.id=_12;
_1a.isPageButton=true;
_1a.notebook=this;
_1a.onmousedown=associateObjWithEvent(this,"notebookMouseDown");
_1a.oncontextmenu=new Function("return false;");
if(this.outerDiv.style.fontFamily){
_19.style.fontFamily=this.outerDiv.style.fontFamily;
}
if(this.outerDiv.style.fontSize){
_19.style.fontSize=this.outerDiv.style.fontSize;
}
if(this.outerDiv.style.fontStyle){
_19.style.fontStyle=this.outerDiv.style.fontStyle;
}
if(this.outerDiv.className){
_19.className=this.outerDiv.className;
}
if(this.elevator){
_1a.style.position="absolute";
_1a.style.left=NOTEBOOK_IS_IE?this.borderWidth:this.borderWidth+1;
_1a.style.borderStyle="solid";
_1a.style.borderWidth="1";
_1a.style.padding="6";
}
if(this.elevator&&NOTEBOOK_ROLLOVER){
_1a.buttonIndex=idx;
_1a.onmouseenter=associateObjWithEvent(this,"notebookMouseEnter");
_1a.onmouseleave=associateObjWithEvent(this,"notebookMouseLeave");
}
_1a.appendChild(_19);
return _1a;
};
NXJNotebook.prototype.getIcon=function(_1b,_1c){
var _1d;
var _1e;
if((_1d=this.getNamedStyle(_1b))&&(_1e=_1d.backgroundImage)&&_1e.indexOf("winxp")==-1){
var _1f=_1e.indexOf("(");
var _20=_1e.indexOf(")");
if(_1f!=-1&&_20!=-1&&_1f<_20){
_1e=_1e.substring(_1f+1,_20);
}
return this.projectIconBase+"/"+_1e;
}else{
if(_1c.indexOf("file:")==0){
return _1c;
}
}
return this.systemIconBase.length==0?_1c:this.systemIconBase+"/"+_1c;
};
NXJNotebook.prototype.getNamedStyle=function(_21){
_21=_21.toLowerCase();
if(!document.styleSheets){
return null;
}
for(var _22=document.styleSheets.length-1;_22>=0;_22--){
var _23=document.styleSheets[_22];
if(!_23){
continue;
}
var _24=null;
try{
if(_23.rules){
_24=_23.rules;
}else{
if(_23.cssRules){
_24=_23.cssRules;
}
}
}
catch(e){
_24=new Array();
}
for(var idx=0;idx<_24.length;idx++){
var _26=_24[idx];
if(_26.selectorText&&_26.selectorText.toLowerCase()=="."+_21){
return _26.style;
}
}
}
return null;
};
NXJNotebook.prototype.layout=function(){
if(this.outerDiv.offsetWidth==0){
var nb=this;
var _28=function(){
nb.layout();
};
window.setTimeout(_28,100);
return;
}
var _29=this.outerDiv;
var _2a="";
this.top=0;
this.left=0;
while(_29&&"absolute"!=_29.style.position){
this.top+=_29.offsetTop;
this.left+=_29.offsetLeft;
_2a+="\n"+_29.tagName+"  "+_29.id+"  "+_29.offsetLeft;
_29=_29.offsetParent;
}
if(this.elevator){
var _2b=this.buttons[0].clientHeight;
var _2c=this.top;
var _2d=this.outerDiv.offsetHeight;
if(_2d==0){
return;
}
var _2e=_2d-this.nvisible*_2b;
var _2f;
var _30=this.outerDiv.parentNode.clientWidth;
if(_30==0){
if(this.outerDiv.style.width){
_30=parseInt(this.outerDiv.style.width);
}else{
_30=parseInt(_29.style.width);
}
}
if(this.selectedIndex!=this.buttons.length-1){
_2e-=2;
}
for(var idx=0;idx<this.buttons.length;idx++){
if(this.buttons[idx].style.visibility=="visible"){
this.buttons[idx].style.top=_2c;
_2c+=_2b;
}else{
this.buttons[idx].style.top=-1000;
}
this.buttons[idx].style.left=this.left;
this.buttons[idx].style.width=_30-1;
if(idx==this.selectedIndex){
this.buttons[idx].style.backgroundRepeat="repeat";
this.buttons[idx].style.backgroundImage="url("+this.selectedIcon+")";
this.buttons[idx].className="selected_elevator_tab";
if(NOTEBOOK_IS_IE){
this.buttons[idx].firstChild.className="selected_elevator_tab";
}
_2f=_2c;
_2c+=_2e;
}else{
this.buttons[idx].style.backgroundImage="url("+this.deselectedIcon+")";
this.buttons[idx].className="unselected_elevator_tab";
if(NOTEBOOK_IS_IE){
this.buttons[idx].firstChild.className="unselected_elevator_tab";
}
}
if(!NOTEBOOK_IS_IE){
this.buttons[idx].style.width=_30-14;
}
}
for(var idx=0;idx<this.pages.length;idx++){
this.pages[idx].style.height=_2e;
this.pages[idx].style.width=_30;
this.pages[idx].style.left=this.left;
if(idx==this.selectedIndex){
this.pages[idx].style.top=_2f;
this.pages[idx].style.display="inline";
}else{
this.pages[idx].style.top=-1000;
this.pages[idx].style.display="none";
}
}
}else{
var _2b=this.buttonTable.clientHeight;
if(_2b==0){
_2b=this.buttonTable.offsetHeight;
}
var _2c=this.top+_2b;
var _32=this.outerDiv.parentNode.clientHeight;
if(_32==0){
_32=this.outerDiv.parentNode.offsetHeight;
}
if(_32==0){
if(this.outerDiv.parentNode.style.height&&this.outerDiv.parentNode.style.height.indexOf("%")==-1){
_32=parseInt(this.outerDiv.style.height);
}else{
_32=parseInt(_29.style.height);
}
}
var _2e=_32-_2b;
var _30=this.outerDiv.parentNode.clientWidth;
this.buttonTable.style.top=this.top;
this.buttonTable.style.left=this.left;
var _33="selected_tab_header";
var _34=this.getNamedStyle(_33);
if(!_34){
_33="selected_tab";
}
var _35="unselected_tab_header";
var _36=this.getNamedStyle(_35);
if(!_36){
_35="unselected_tab";
}
for(var idx=0;idx<this.pages.length;idx++){
this.pages[idx].style.height=_2e;
this.pages[idx].style.width=this.outerDiv.offsetWidth;
this.pages[idx].style.left=this.left;
if(idx==this.selectedIndex){
this.pages[idx].style.top=_2c;
this.pages[idx].style.display="inline";
this.buttons[idx].className=_33;
if(NOTEBOOK_IS_IE){
this.buttons[idx].firstChild.className=_33;
}
if(!_34||_34.backgroundImage){
this.buttons[idx].style.backgroundImage="url("+this.selectedIcon+")";
}else{
if(!_34.backgroundImage){
this.buttons[idx].style.backgroundImage="";
}
}
}else{
this.pages[idx].style.top=-1000;
this.pages[idx].style.display="none";
this.buttons[idx].className=_35;
if(NOTEBOOK_IS_IE){
this.buttons[idx].firstChild.className=_35;
}
if(!_36||_36.backgroundImage){
this.buttons[idx].style.backgroundImage="url("+this.deselectedIcon+")";
}else{
if(!_36.backgroundImage){
this.buttons[idx].style.backgroundImage="";
}
}
}
if(this.buttons[idx].disabled&&this.disabledTabStyle){
this.buttons[idx].className="disabled_tab_header";
}
}
}
if(NOTEBOOK_IS_IE&&this.selectedIndex!=-1){
var _37=this.pages[this.selectedIndex].getElementsByTagName("FIELDSET");
if(_37){
for(var _38=0;_38<_37.length;_38++){
var _39=_37[_38].style.display;
_37[_38].style.display="none";
_37[_38].style.display=_39;
}
}
}
};
NXJNotebook.prototype.nextPage=function(){
var _3a=this.selectedIndex==this.buttons.length-1?0:this.selectedIndex+1;
while(_3a!=this.selectedIndex&&(this.buttons[_3a].style.visibility=="hidden"||this.buttons[_3a].disabled)){
_3a=_3a<this.buttons.length?_3a+1:0;
}
this.setCurrentPage(_3a,true);
};
NXJNotebook.prototype.previousPage=function(){
var _3b=this.selectedIndex==0?this.buttons.length-1:this.selectedIndex-1;
while(_3b!=this.selectedIndex&&(this.buttons[_3b].style.visibility=="hidden"||this.buttons[_3b].disabled)){
_3b=_3b>0?_3b-1:this.buttons.length-1;
}
this.setCurrentPage(_3b,true);
};
NXJNotebook.prototype.resize=function(){
this.layout();
};
NXJNotebook.prototype.tweakPage=function(){
if(this.selectedIndex!=-1){
var _3c=this.selectedIndex;
for(var idx=0;idx<this.pages.length;idx++){
if(idx!=this.selectedIndex){
this.selectedIndex=idx;
this.layout();
this.selectedIndex=_3c;
this.layout();
break;
}
}
}
};
NXJNotebook.prototype.onPageLoad=function(_3e){
eval(_3e.responseText);
this.pageToLoad.setAttribute("html_loaded","1");
var nb=this;
var _40=function(){
nb.loadingPage=true;
nb.setCurrentPage(nb.pageToLoadIdx,nb.isUserEvent);
nb.loadingPage=false;
};
window.setTimeout(_40,0);
};
NXJNotebook.prototype.setCurrentPage=function(idx,_42){
if(idx!=this.selectedIndex){
var mgr=window.parent.clientManager;
if(mgr&&_42&&!mgr.eventsOK){
return;
}
var _44=NOTEBOOK_IS_IE?this.buttons[idx]:this.buttons[idx].childNodes[0];
var _45=window.parent.getNotebookPage(_44);
if(_45&&mgr){
var _46=_45.getAttribute("html_loaded");
if(!_46){
this.pageToLoad=_45;
this.pageToLoadIdx=idx;
this.isUserEvent=_42;
this.doAjax(mgr);
return;
}
}
this.selectedIndex=idx;
this.layout();
if(mgr){
mgr.pageSelected(_44,_42);
}
var n2c=mgr?mgr.namesToComponents:window.namesToComponents;
if(n2c){
for(var _48 in n2c){
var _49=n2c[_48];
if(!_49){
if(mgr&&this.loadingPage&&_45.getAttribute("html_loaded")=="1"){
this.pageToLoad.setAttribute("html_loaded","2");
this.pageToLoad=_45;
this.pageToLoadIdx=idx;
this.isUserEvent=_42;
this.doAjax(mgr);
return;
}
continue;
}
if(_49.elevator&&_49.outerDiv){
var _4a=_49.outerDiv;
while(_4a){
if(_4a==this.pages[idx]){
_49.layout();
if(this.loadingPage){
_49.layout();
}
break;
}
_4a=_4a.parentNode;
}
}else{
if(!NOTEBOOK_IS_IE&&(_49.isDatePicker||_49.isCombo)){
var _4a=_49.outerDiv.parentNode;
while(_4a&&_4a.tagName!="FORM"){
if(_4a==this.pages[idx]){
_49.resize();
break;
}
}
}else{
if(_49.isGrid){
var _4a=_49.outerDiv.parentNode;
while(_4a&&_4a.tagName!="FORM"){
if(_4a==this.pages[idx]){
_49.resize();
if(_49.selectedRow!=-1){
_49.selectRowFromIndex(_49.selectedRow);
}
break;
}
_4a=_4a.parentNode;
}
}else{
if(_49.isTree&&!_49.initialized){
var _4a=_49.outerDiv;
while(_4a){
if(_4a==this.pages[idx]){
_49.setStructure(_49.structure);
_49.initialized=true;
break;
}
_4a=_4a.parentNode;
}
}
}
}
}
}
}
}
};
NXJNotebook.prototype.doAjax=function(mgr){
var _4c=window.location.pathname;
if(_4c.substring(0,1)!="/"){
_4c="/"+_4c;
}
var _4d=_4c.lastIndexOf("/");
_4c=_4c.substring(0,_4d+1);
var url=_4c+"nxjAjax";
var _4f=new Object();
_4f.controlId=this.outerDivId;
_4f.parameters="controlId="+_4f.controlId+"&managerId="+MANAGER_ID+"&newPageId="+this.pageToLoad.id;
_4f.onComplete=this.onPageLoad;
mgr.makeAjaxRequest(url,_4f);
};
NXJNotebook.prototype.setDynamicProperties=function(_50){
if(_50==null){
return;
}
var _51=_50[this.outerDivId];
var _52;
if(_51&&(_52=_51["currentPage"])){
var _53=false;
if(_52.substr(_52.length-1,1)!="."){
_52+=".";
}
for(var idx=0;idx<this.pages.length;idx++){
if(this.pages[idx].id==_52){
_53=true;
this.selectedIndex=idx;
break;
}
}
if(!_53){
alert("current page "+_52+" not found");
}
}
this.nvisible=0;
for(var idx=0;idx<this.pages.length;idx++){
var _55=this.pages[idx];
var _56=_55.id;
var _51=_50[_56];
var _57=undefined;
var _58=undefined;
var _59=undefined;
if(_51){
_57=_51["visible"];
_58=_51["enabled"];
_59=_51["label"];
}
var _5a=this.buttons[idx];
var _5b=_5a.childNodes[0];
if(_57=="true"){
_5a.style.visibility="visible";
if(!this.elevator){
_5a.style.display="";
}
}else{
if(_57=="false"){
_5a.style.visibility="hidden";
if(!this.elevator){
_5a.style.display="none";
}
}
}
if(_5a.style.visibility!="hidden"){
this.nvisible++;
}
if(_58=="true"){
this.buttons[idx].disabled=false;
_5b.style.color="";
}else{
if(_58=="false"){
this.buttons[idx].disabled=true;
if(this.disabledTabStyle&&this.disabledTabStyle.color){
_5b.style.color=this.disabledTabStyle.color;
}else{
_5b.style.color="GrayText";
}
}
}
if(typeof (_59)!="undefined"){
if(NOTEBOOK_IS_IE){
_5b.innerText=_59;
}else{
_5b.innerHTML=_59;
}
}
}
if(this.selectedIndex<0){
for(var idx=0;idx<this.buttons.length;idx++){
if(!this.buttons[idx].disabled&&this.buttons[idx].style.visibility!="hidden"){
this.setCurrentPage(idx);
return;
}
}
}
var idx=this.selectedIndex;
while(idx>=0&&(this.buttons[idx].disabled==true||this.buttons[idx].style.visibility=="hidden")){
idx++;
if(idx>=this.pages.length){
idx=0;
}
if(idx==this.selectedIndex){
this.selectedIndex=-1;
break;
}
}
if(this.selectedIndex>=0&&idx!=this.selectedIndex){
this.setCurrentPage(idx);
}else{
if(this.selectedIndex>=0){
var _5a=NOTEBOOK_IS_IE?this.buttons[idx]:this.buttons[idx].childNodes[0];
var _5c=window.parent.getNotebookPage(_5a);
if(!_5c.getAttribute("html_loaded")){
this.selectedIndex=-1;
this.setCurrentPage(idx);
}else{
this.layout();
}
}else{
this.layout();
}
}
};
NXJNotebook.prototype.getCurrentPageButton=function(){
if(this.selectedIndex>=0){
var _5d=NOTEBOOK_IS_IE?this.buttons[this.selectedIndex]:this.buttons[this.selectedIndex].childNodes[0];
return _5d;
}
if(this.buttons.length>0){
var _5d=NOTEBOOK_IS_IE?this.buttons[0]:this.buttons[0].childNodes[0];
return _5d;
}
return null;
};
function notebookGetNotebook(_5e){
var _5f=_5e;
var _60;
while(_5f){
if(_5f.notebook){
return _5f.notebook;
}else{
_5f=_5f.parentNode;
}
}
return null;
}
function notebookGetNotebookPage(_61){
var _62=_61;
var _63=null;
var _64;
while(_62){
if(_62.notebook){
for(var idx=0;idx<_62.notebook.buttons.length;idx++){
var _66=NOTEBOOK_IS_IE?_62.notebook.buttons[idx]:_62.notebook.buttons[idx].childNodes[0];
if(_61==_66){
return _62.notebook.pages[idx];
}
}
return _63;
}else{
_62=_62.parentNode;
if(_62&&_62.isPage){
_63=_62;
}
}
}
return null;
}
function notebookGetTabIndex(_67){
var _68=window.parent.getNotebook(_67);
for(var idx=0;idx<_68.buttons.length;idx++){
if(_67==_68.buttons[idx]){
return idx;
}
}
return -1;
}
function notebookIsOnCurrentPage(_6a){
var _6b=_6a;
var _6c=null;
var _6d;
while(_6b){
if(_6b.notebook&&!_6b.isPageButton){
for(var idx=0;idx<_6b.notebook.pages.length;idx++){
if(_6b.notebook.pages[idx]==_6c){
if(idx==_6b.notebook.selectedIndex){
var _6f=_6c.parentNode;
while(_6f&&_6f.tagName!="FORM"){
if(_6f.style.display=="none"){
return false;
}
_6f=_6f.parentNode;
}
return true;
}
return false;
}
}
alert("cant find tab");
return false;
}else{
_6b=_6b.parentNode;
if(_6b&&_6b.isPage){
_6c=_6b;
}
}
}
return null;
}
function notebookIsOnNonCurrentPage(_70){
var _71=_70;
var _72=null;
var _73;
while(_71){
if(_71.notebook){
for(var idx=0;idx<_71.notebook.pages.length;idx++){
if(_71.notebook.pages[idx]==_72){
if(idx!=_71.notebook.selectedIndex){
return true;
}
var _75=_72.parentNode;
while(_75&&_75.tagName!="FORM"){
if(_75.style.display=="none"){
return true;
}
_75=_75.parentNode;
}
return false;
}
}
alert("cant find tab");
return false;
}else{
_71=_71.parentNode;
if(_71&&_71.isPage){
_72=_71;
}
}
}
return null;
}
function notebookIsOnUnavailablePage(_76){
var _77=_76;
var _78=null;
var _79;
while(_77){
if(_77.notebook){
for(var idx=0;idx<_77.notebook.pages.length;idx++){
if(_77.notebook.pages[idx]==_78){
return _77.notebook.buttons[idx].style.visibility=="hidden"||_77.notebook.buttons[idx].disabled;
}
}
alert("cant find tab");
return false;
}else{
_77=_77.parentNode;
if(_77&&_77.isPage){
_78=_77;
}
}
}
return null;
}
function notebookMakePageCurrent(_7b){
var _7c=_7b;
var _7d=null;
var _7e;
while(_7c){
if(_7c.notebook){
for(var idx=0;idx<_7c.notebook.pages.length;idx++){
if(_7c.notebook.pages[idx]==_7d){
var nb=_7c.notebook;
if(idx!=nb.selectedIndex){
if(!nb.buttons[idx].disabled&&nb.buttons[idx].style.visibility!="hidden"){
nb.setCurrentPage(idx);
}
}
return;
}
}
alert("cant find tab");
return;
}else{
_7c=_7c.parentNode;
if(_7c&&_7c.isPage){
_7d=_7c;
}
}
}
return null;
}
NXJNotebook.prototype.notebookMouseDown=function(_81,_82){
if(NOTEBOOK_IS_IE){
if(_81.button!=1){
return false;
}
}else{
if(_81.button!=0){
_81.preventDefault();
_81.cancelBubble=true;
return false;
}
}
var _83=NOTEBOOK_IS_IE?_81.srcElement:_81.target;
for(var idx=0;idx<this.buttons.length;idx++){
if(_83==this.buttons[idx]||_83.parentNode==this.buttons[idx]){
if(!this.buttons[idx].disabled){
this.setCurrentPage(idx,true);
}
break;
}
}
return false;
};
NXJNotebook.prototype.notebookMouseEnter=function(_85,_86){
var _87=NOTEBOOK_IS_IE?_85.srcElement:_85.target;
if(_87.tagName=="DIV"){
_87.style.backgroundImage="url("+this.rolloverIcon+")";
}
return false;
};
NXJNotebook.prototype.notebookMouseLeave=function(_88,_89){
var _8a=_89.buttonIndex;
var _8b=NOTEBOOK_IS_IE?_88.srcElement:_88.target;
if(_8b.tagName=="DIV"){
_8b.style.backgroundImage=_8a==this.selectedIndex?"url("+this.selectedIcon+")":"url("+this.deselectedIcon+")";
}
return false;
};
NXJNotebook.prototype.notebookResize=function(_8c,_8d){
if(this.buttons&&this.initialized&&window.parent.ClientManager&&window.parent.ClientManager.eventsOK){
this.resize();
}
};

