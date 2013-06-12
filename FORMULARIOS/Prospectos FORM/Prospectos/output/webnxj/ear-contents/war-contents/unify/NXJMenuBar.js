var MENU_SEPARATOR_CLASS="separator";
var MENU_SEPARATOR_LINE_CLASS="separator-line";
var MENU_BUTTON_CLASS="menu-button";
var VERTICAL_MENU_BUTTON_CLASS="vertical-menu-button";
var MENU_BAR_CLASS="menu-bar";
var MENU_BODY_CLASS="menu-body";
var MENU_POPUP_CLASS="popup-body";
var MENU_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var MENU_ON_MOUSE_ENTER=MENU_IS_IE?"onMouseEnter":"onMouseover";
var MENU_ON_MOUSE_LEAVE=MENU_IS_IE?"onMouseLeave":"onMouseout";
var MENU_BLANK_ICON="images/blank.gif";
function MenuBarNode(_1,_2,_3,_4,_5,_6,_7,_8,_9){
this.title=_2;
this.icon=_3;
this.command=_4;
this.dataview=_5;
this.tooltip=_6;
this.parent=_7;
this.separator=_8;
this.level=_9;
this.expanded=false;
this.children=new Array();
this.id=_1.outerDivId+(_1.nextId++);
this.popup=null;
_1.idsToNodes[this.id]=this;
this.banner="NXJMenuBar.MenuBarNode";
}
MenuBarNode.prototype.addChild=function(_a){
this.children[this.children.length]=_a;
};
MenuBarNode.prototype.buildPopupInfo=function(_b){
if(this.level!=0&&this.children.length!=0){
this.popupInnerHTML="<table cellpadding='0' cellspacing='0' class=\""+MENU_POPUP_CLASS+"\">";
for(var _c=0;_c<this.children.length;_c++){
this.popupInnerHTML+=this.children[_c].getHTML(_b);
}
this.popupInnerHTML+="</table>";
if(MENU_IS_IE){
var _d=_b.scroller;
_d.innerHTML=this.popupInnerHTML;
this.popupWidth=_d.scrollWidth;
this.popupHeight=_d.scrollHeight+this.children.length;
}else{
var _d=_b.scroller;
_d.innerHTML=this.popupInnerHTML;
this.popupWidth=_d.firstChild.offsetWidth;
this.popupHeight=_d.firstChild.offsetHeight;
}
}
for(var _c=0;_c<this.children.length;_c++){
this.children[_c].buildPopupInfo(_b);
}
};
MenuBarNode.prototype.getHTML=function(_e){
var _f;
if(this.separator){
return "<tr> <td colspan=\"3\" class=\""+MENU_SEPARATOR_CLASS+"\"><div class=\""+MENU_SEPARATOR_LINE_CLASS+"\"> </div> </td> </tr>";
}else{
if(this.level==0){
if(_e.horizontal){
_f=MENU_BAR_CLASS;
if(_e.customStyle&&_e.customStyle!=_f){
_f=_e.customStyle+" "+_f;
}
var _10="<div class=\""+_f+"\">"+"<table cellpadding='0' cellspacing='0' class=\""+_f+"\"><tr>";
for(var idx=0;idx<this.children.length;idx++){
_10+=this.children[idx].getHTML(_e);
}
_10+="</tr></table></div>";
return _10;
}else{
_f=VERTICAL_MENU_BUTTON_CLASS;
if(_e.customStyle){
_f=_e.customStyle+" "+_f;
}
var _10="<table cellpadding='0' cellspacing='0' class=\""+_f+"\">";
_f=MENU_BUTTON_CLASS;
if(_e.customStyle){
_f=_e.customStyle+" "+_f;
}
for(var idx=0;idx<this.children.length;idx++){
_10+="<tr> <td> <table cellpadding=\"0\" cellspacing=\"0\"class=\""+_f+"\"<tr>"+this.children[idx].getHTML(_e)+"</tr> </table> </td> </tr>";
}
_10+="</tr></td>";
return _10;
}
}else{
if(this.level==1){
var _12="";
if(_e.horizontal){
var _13=_e.outerDiv.style.cssText.split(";");
var _14=false;
for(var idx=0;idx<_13.length;idx++){
var _15=_13[idx];
var _16=_13[idx].toLowerCase();
if(_16.indexOf("width:")==-1){
if(_12.length!=0){
_12+=";";
}
_12+=_13[idx];
}
}
}else{
var _17=_e.outerDiv.parentNode.style;
var _18;
if(_17.width&&isNaN(_17.width)&&_17.width.indexOf("%")!=-1){
_18=_17.width;
}else{
_18=menubarPixelValueToInt(_17.width);
}
_12="style=\"width: "+_18+"\"";
}
if(_12.length!=0){
_12="style='"+_12+"'";
}
var _19=this.icon&&this.icon.length!=0?"<img src="+this.icon+">":"";
_f=MENU_BUTTON_CLASS;
if(_e.customStyle){
_f=_e.customStyle+" "+_f;
}
return "<td id=\""+this.id+"\" class=\""+_f+"\""+MENU_ON_MOUSE_ENTER+"=\"window.menubarMouseEnter('"+_e.outerDivId+"', '"+this.id+"');\""+MENU_ON_MOUSE_LEAVE+"=\"window.menubarMouseLeave('"+_e.outerDivId+"', '"+this.id+"');\""+"onMouseDown=\"window.menubarMouseDown(event,'"+_e.outerDivId+"', '"+this.id+"');\""+"onMouseUp=\"window.menubarMouseUp('"+_e.outerDivId+"', '"+this.id+"');\" "+_12+">"+_19+this.title+"</td>";
}else{
var _12=_e.outerDiv.style.cssText;
var _1a=_12.split(";");
var _1b="";
for(var idx=0;idx<_1a.length;idx++){
var _16=_1a[idx].toLowerCase();
if(_16.indexOf("width:")==-1&&_16.indexOf("height:")==-1){
if(_1b.length!=0){
_1b+=";";
}
_1b+=_1a[idx];
}
}
_12=_1b;
if(_12.length!=0){
_12="style='"+_12+"'";
}
_f=MENU_BODY_CLASS;
if(_e.customStyle){
_f=_e.customStyle+" "+_f;
}
var _10="<tr>  <td id=\""+this.id+"\" class=\""+_f+"\">"+"<table cellspacing='0' cellpadding='0' class=\""+_f+"\""+_12+">"+"<tr "+MENU_ON_MOUSE_ENTER+"=\"window.document.menubarMouseEnter('"+_e.outerDivId+"', '"+this.id+"');\""+MENU_ON_MOUSE_LEAVE+"=\"window.document.menubarMouseLeave('"+_e.outerDivId+"', '"+this.id+"');\""+"onMouseDown=\"window.document.menubarMouseDown(event,'"+_e.outerDivId+"', '"+this.id+"');\""+"onMouseUp=\"window.document.menubarMouseUp('"+_e.outerDivId+"', '"+this.id+"');\""+">";
var _1c=this.icon&&this.icon.length!=0?this.icon:_e.getIcon(MENU_BLANK_ICON);
_10+="<td style='width: 16px; height: "+"16px; padding: 0px 2px 1px 2px; border:0; margin: 0'> <img src=\""+_1c+"\" ></td>";
_10+="<td style='width: 100%'> <nobr>"+this.title+"</nobr> </td>";
if(_e.showHotKeys){
var key=_e.nameToHotKey[this.command];
if(!key){
key="";
}
_10+="<td align='right' style='padding: 0px 8px 1px 8px'> <nobr>"+key+"</nobr> </td>";
}
var _1e;
var _1f="";
if(this.children.length==0){
_1e="&nbsp";
}else{
if(MENU_IS_IE){
_1e=4;
_1f="style = 'font-family: Webdings'";
}else{
_1e="&rArr";
_1f="style = 'font-family: Symbol; font-size: 12'";
}
}
_10+="<td> <span "+_1f+">"+_1e+"</span> </td>";
_10+="</tr></table></tr>";
return _10;
}
}
}
};
MenuBarNode.prototype.setCommandStates=function(_20,doc){
var mgr=window.parent.clientManager;
for(var idx=0;idx<this.children.length;idx++){
var _24=this.children[idx];
if(_24.children.length==0&&_24.command&&_24.command.length!=0){
var _25=MENU_IS_IE?doc.all[_24.id]:doc.getElementById(_24.id);
if(!_25){
window.logBuffer+="\ncant find "+_24.title+"      "+_24.id;
continue;
}
var cmd=_24.command;
if(mgr&&cmd){
var _27=new Object();
var cmd;
_27.name=cmd;
if(_24.dataview){
_27.name=_24.dataview+":"+cmd;
}
_27.parentNode=_20;
cmd=mgr.getActualCommand(_27);
}
var _28=(_20.commandStates[cmd]==false);
window.logBuffer+="\nset "+cmd+" to "+_28;
_20.setDisabledRecursively(_25,_28);
}
}
};
MenuBarNode.prototype.showPopup=function(_29,_2a){
if(!_29.popupInit){
_29.popupInit=true;
_29.root.buildPopupInfo(_29);
}
var mgr=window.parent.clientManager;
if(MENU_IS_IE&&mgr&&!_29.useIEPopup){
_29.mainFrame=mgr.document.parentWindow;
_29.mainDocument=mgr.document;
}
var _2c=_29.getPopup(this.level);
var _2d;
var _2e;
if(MENU_IS_IE&&_29.useIEPopup){
_2c.document.body.innerHTML=this.popupInnerHTML;
}else{
_2c.innerHTML=this.popupInnerHTML;
}
var _2f=0;
var _30=0;
if(!MENU_IS_IE||!_29.useIEPopup){
var _31=_2a;
while(_31){
_2f+=_31.offsetLeft+1;
_30+=_31.offsetTop;
if(_31.parentNode==_29.outerDiv||_31.offsetParent==_29.outerDiv.parentNode){
break;
}
_31=_31.offsetParent;
}
}
if(_29.horizontal&&this.level==1){
_2d=MENU_IS_IE&&_29.useIEPopup?0:_2f;
_2e=_2a.clientHeight;
}else{
if(this.level==1){
if(_29.horizontal){
_2d=_2f+_2a.offsetWidth;
_2e=_30;
}else{
_2d=_2f;
_2e=_30+_2a.offsetHeight;
}
}else{
if(MENU_IS_IE&&_29.useIEPopup){
_2d=_2a.offsetWidth;
_2e=0;
}else{
_2d=_2f+_2a.offsetWidth;
_2e=_30;
}
}
}
if(MENU_IS_IE&&_29.useIEPopup){
this.setCommandStates(_29,_2c.document);
_2c.show(_2d,_2e,this.popupWidth,this.popupHeight,_2a);
}else{
_2c.style.left=_2d;
_2c.style.top=_2e;
_2c.style.position="absolute";
_2c.className=MENU_POPUP_CLASS;
_2c.style.zIndex=2;
_29.outerDiv.parentNode.appendChild(_2c);
this.setCommandStates(_29,document);
if(_29.show2ExtraPopups){
var _32=_29.getToolbarPopup(this.level);
var _33=_29.toolbarFrame.document.forms[0];
if(!_33){
_33=_29.toolbarFrame.document.documentElement;
}
_32.style.position="absolute";
_32.style.width=this.popupWidth;
_32.style.height=this.popupHeight;
_32.innerHTML=_2c.innerHTML;
if(_29.horizontal){
var _34=_2d;
var _35=_2e-_29.frameHeight;
var _31=_29.outerDiv;
while(_31){
_34+=_31.offsetLeft;
_35+=_31.offsetTop;
_31=_31.offsetParent;
}
_32.style.left=_34;
_32.style.top=_35;
}else{
var _34=_2d-_29.frameWidth;
var _35=_2e;
var _31=_29.outerDiv;
while(_31){
_34+=_31.offsetLeft;
_35+=_31.offsetTop;
_31=_31.offsetParent;
}
_32.style.left=_34;
_32.style.top=_35;
}
_33.appendChild(_32);
this.setCommandStates(_29,_29.toolbarFrame.document);
}
if(_29.showExtraPopup){
var _36=_29.getMainPopup(this.level);
var _37=_29.mainFrame.document.forms["NXJForm"];
_36.style.position="absolute";
_36.innerHTML=_2c.innerHTML;
if(_29.horizontal){
var _34=_2d;
var _35=_2e-_29.frameHeight;
var _31=_29.outerDiv;
if(_29.show2ExtraPopups){
toolbarFrameHeight=parseInt(_29.toolbarFrame.innerHeight);
_35-=toolbarFrameHeight;
}
while(_31){
_34+=_31.offsetLeft;
_35+=_31.offsetTop;
_31=_31.offsetParent;
}
_36.style.left=_34;
_36.style.top=_35;
}else{
var _34=_2d-_29.frameWidth;
var _35=_2e;
var _31=_29.outerDiv;
if(_29.show2ExtraPopups){
toolbarFrameWidth=parseInt(_29.toolbarFrame.innerWidth);
_35-=toolbarFrameWidth;
}
while(_31){
_34+=_31.offsetLeft;
_35+=_31.offsetTop;
_31=_31.offsetParent;
}
_36.style.left=_34;
_36.style.top=_35;
}
_37.appendChild(_36);
this.setCommandStates(_29,_29.mainFrame.document);
}
var mgr=window.parent.clientManager;
if(mgr){
mgr.hideMenuFunc=function(){
return _29.hidePopup(1);
};
}
}
};
MenuBarNode.prototype.toString=function(){
return "MenuNode["+this.title+"]";
};
function NXJMenuBar(_38,_39,_3a,_3b,_3c,_3d){
var _3e=new Date().valueOf();
window.logBuffer="";
this.outerDivId=_38;
this.outerDiv=document.getElementById(_38);
if(!this.outerDiv){
return;
}
this.outerDiv.menubar=this;
this.commandStates=new Object();
this.commandInvoked=null;
this.cssFile=_3a;
this.showHotKeys=_3b;
this.hotKeys=_3c;
this.iconDir=_3d;
this.banner="NXJMenuBar";
this.isMenuBar=true;
this.customStyle=this.outerDiv.className;
this.popupInit=false;
this.origTop=this.outerDiv.parentNode.offsetTop;
this.scrollToTop=this.outerDiv.getAttribute("scroll_to_top")=="true";
if(this.outerDiv&&this.outerDiv.getAttribute("menushowkeys")=="true"){
this.showHotKeys=true;
}
var _3f=this.outerDiv.parentNode.style;
var _40=menubarPixelValueToInt(MENU_IS_IE?this.outerDiv.clientWidth:this.outerDiv.parentNode.style.width);
var _41=menubarPixelValueToInt(MENU_IS_IE?this.outerDiv.clientHeight:this.outerDiv.parentNode.style.height);
this.horizontal=_40>=_41;
this.useIEPopup=true;
if(MENU_IS_IE&&window.NXJ_FRAME_TARGET){
this.useIEPopup=false;
this.outerDiv.parentNode.style.zIndex=99;
}
if(MENU_IS_IE&&this.useIEPopup){
var _42="nxjMBIframe";
this.iframe=document.getElementById(_42);
if(!this.iframe){
this.iframe=document.createElement("iframe");
this.iframe.id=_42;
this.iframe.style.position="absolute";
this.iframe.style.visibility="hidden";
this.iframe.style.left=-100;
this.iframe.style.top=-100;
this.iframe.style.width="10px";
this.iframe.style.height="10px";
this.iframe.frameBorder=0;
this.iframe.src="/blank.html";
document.body.appendChild(this.iframe);
}
var _43=this.iframe.contentWindow.document;
this.scroller=_43.getElementById("scroller");
if(!this.scroller){
_43.body.className="menu-body";
this.scroller=_43.createElement("div");
this.scroller.id="scroller";
_43.appendChild(this.scroller);
for(var idx=0;idx<document.styleSheets.length;idx++){
_43.createStyleSheet(document.styleSheets[idx].href);
}
}
}else{
if(this.outerDiv&&this.outerDiv.parentNode){
this.outerDiv.parentNode.style.overflow="visible";
this.outerDiv.style.overflow="visible";
}
this.scroller=document.createElement("div");
this.scroller.className="menu-body";
this.scroller.style.top=-1000;
this.scroller.style.left=-1000;
this.scroller.style.width=1000;
this.scroller.style.position="absolute";
this.mainFrame=window.parent.frames["mainFrame"];
this.mainDocument=null;
this.frameWidth=parseInt(window.innerWidth);
this.frameHeight=parseInt(window.innerHeight);
this.mainPopups=new Array();
this.showExtraPopup=typeof (window.PREFERRED_HEIGHT)!="undefined";
if(this.mainFrame==null){
this.mainFrame=window;
}
if((window.frameElement&&window.frameElement.tagName=="OBJECT")||!this.useIEPopup){
this.frameHeight=parseInt(window.PREFERRED_HEIGHT);
this.frameWidth=parseInt(window.PREFERRED_COLS);
this.mainFrame=window.parent;
this.showExtraPopup=true;
_40=parseInt(this.outerDiv.getAttribute("displaywidth"));
this.outerDiv.style.width=_40;
this.outerDiv.parentNode.style.width=_40;
_41=parseInt(this.outerDiv.getAttribute("displayheight"));
this.outerDiv.style.height=_41;
this.outerDiv.parentNode.style.height=_41;
this.horizontal=_40>=_41;
this.ensureStyleSheetInFrame(this.mainFrame.document,document.styleSheets[0]);
if(window.frameElement&&window.frameElement.id=="nxj_header"){
this.show2ExtraPopups=true;
this.toolbarFrame=window.parent.frames[1];
this.toolbarPopups=new Array();
}
}else{
if(this.showExtraPopup){
var _45=document.styleSheets[0];
this.ensureStyleSheetInFrame(this.mainFrame.document,_45);
if(window.name=="header"){
this.show2ExtraPopups=true;
this.toolbarFrame=window.parent.frames["menu"];
this.toolbarPopups=new Array();
this.ensureStyleSheetInFrame(this.toolbarFrame.document,_45);
}
}
}
document.body.appendChild(this.scroller);
}
if(this.showHotKeys){
this.setHotKeys(_3c);
}
this.setStructure(_39);
var _46=new Date().valueOf();
}
NXJMenuBar.prototype.ensureStyleSheetInFrame=function(_47,_48){
var _49=_47.styleSheets;
var _4a=(_49.length>0);
var _4b=false;
for(var idx=0;idx<_49.length;idx++){
if(_48.href==_49[idx].href){
_4b=true;
break;
}
}
if(!_4b){
var _4d=_47.createElement("link");
_4d.type="text/css";
_4d.rel="stylesheet";
_4d.href=_48.href;
_47.documentElement.appendChild(_4d);
}
};
NXJMenuBar.prototype.findElement=function(id){
var _4f=document.getElementById(id);
if(_4f){
return _4f;
}
for(var idx=0;idx<this.popups.length;idx++){
var _51=this.popups[idx];
if(_51&&(_4f=_51.document.getElementById(id))){
return _4f;
}
}
return null;
};
NXJMenuBar.prototype.findElementInMainFrame=function(id){
var _53=this.mainFrame.document.getElementById(id);
if(_53){
return _53;
}
return null;
};
NXJMenuBar.prototype.findElementInToolbarFrame=function(id){
if(!this.toolbarFrame){
return null;
}
var _55=this.toolbarFrame.document.getElementById(id);
if(_55){
return _55;
}
return null;
};
NXJMenuBar.prototype.getIcon=function(_56){
return this.iconDir+"/"+_56;
};
NXJMenuBar.prototype.getMainPopup=function(_57){
if(this.mainDocument==this.mainFrame.document&&this.mainPopups[_57]){
return this.mainPopups[_57];
}
this.mainDocument=this.mainFrame.document;
this.mainPopups[_57]=this.mainFrame.document.createElement("div");
this.mainDocument.menubarMouseDown=menubarMouseDown;
this.mainDocument.menubarMouseEnter=menubarMouseEnter;
this.mainDocument.menubarMouseLeave=menubarMouseLeave;
this.mainDocument.menubarMouseUp=menubarMouseUp;
return this.mainPopups[_57];
};
NXJMenuBar.prototype.getToolbarPopup=function(_58){
if(this.toolbarDocument==this.toolbarFrame.document&&this.toolbarPopups[_58]){
return this.toolbarPopups[_58];
}
this.toolbarDocument=this.toolbarFrame.document;
this.toolbarPopups[_58]=this.getPopup(_58).cloneNode(true);
this.toolbarDocument.menubarMouseDown=menubarMouseDown;
this.toolbarDocument.menubarMouseEnter=menubarMouseEnter;
this.toolbarDocument.menubarMouseLeave=menubarMouseLeave;
this.toolbarDocument.menubarMouseUp=menubarMouseUp;
return this.toolbarPopups[_58];
};
NXJMenuBar.prototype.getPopup=function(_59){
if(this.popups[_59]){
return this.popups[_59];
}
if(MENU_IS_IE&&this.useIEPopup){
var win=_59==1?window:this.popups[_59-1].document.parentWindow;
this.popups[_59]=win.createPopup();
for(var idx=0;idx<document.styleSheets.length;idx++){
this.popups[_59].document.createStyleSheet(document.styleSheets[idx].href);
}
this.popups[_59].document.menubarMouseDown=menubarMouseDown;
this.popups[_59].document.menubarMouseEnter=menubarMouseEnter;
this.popups[_59].document.menubarMouseLeave=menubarMouseLeave;
this.popups[_59].document.menubarMouseUp=menubarMouseUp;
}else{
this.popups[_59]=document.createElement("div");
document.menubarMouseDown=menubarMouseDown;
document.menubarMouseEnter=menubarMouseEnter;
document.menubarMouseLeave=menubarMouseLeave;
document.menubarMouseUp=menubarMouseUp;
}
return this.popups[_59];
};
NXJMenuBar.prototype.hidePopup=function(_5c){
if(MENU_IS_IE&&this.useIEPopup){
this.popups[_5c].hide();
}else{
for(var idx=_5c;;idx++){
if(this.popups[idx]&&this.popups[idx].parentNode){
this.popups[idx].parentNode.removeChild(this.popups[idx]);
if(this.showExtraPopup){
this.mainPopups[idx].parentNode.removeChild(this.mainPopups[idx]);
}
if(this.show2ExtraPopups){
this.toolbarPopups[idx].parentNode.removeChild(this.toolbarPopups[idx]);
}
}else{
break;
}
}
}
};
NXJMenuBar.prototype.nextToken=function(){
return this.currentToken>=this.tokens.length?"":this.tokens[this.currentToken++];
};
NXJMenuBar.prototype.parseNode=function(_5e,_5f){
var _60=this.nextToken()=="t";
var _61=this.nextToken();
var _62=this.nextToken();
var _63=this.nextToken();
var _64=this.nextToken();
var _65=this.nextToken();
var _66=this.nextToken();
var _67=this.nextToken();
var _68;
_68=new MenuBarNode(this,_61,_64,_62,_63,_65,_5e,_60,_5f);
for(var idx=0;idx<_67;idx++){
_68.addChild(this.parseNode(_68,_5f+1));
}
return _68;
};
NXJMenuBar.prototype.setEnabled=function(_6a,_6b){
this.commandStates[_6a]=_6b;
};
NXJMenuBar.prototype.setDisabledRecursively=function(_6c,_6d){
_6c.disabled=_6d;
if(!MENU_IS_IE){
if(_6c.tagName&&_6c.tagName=="NOBR"){
var _6e=_6d?"GrayText":null;
_6c.style.color=_6e;
}
for(var idx=0;idx<_6c.childNodes.length;idx++){
var _70=_6c.childNodes[idx];
this.setDisabledRecursively(_70,_6d);
}
}
};
NXJMenuBar.prototype.setHoverRecursively=function(_71,add){
var _73=_71.className;
if(_73&&_73.length!=0){
var _74=_73.indexOf("-hover");
if(add&&_74==-1){
var _75="";
var _76=_73.split(" ");
for(var idx=0;idx<_76.length;idx++){
if(idx!=0){
_75+=" ";
}
_75+=_76[idx]+"-hover";
}
_71.className=_75;
if(_71.style.backgroundColor){
_71.saveBG=_71.style.backgroundColor;
_71.style.backgroundColor="";
}
}else{
if(!add&&_74!=-1){
_71.className=_73.replace(/-hover/g,"");
if(_71.saveBG){
_71.style.backgroundColor=_71.saveBG;
}
}
}
}
for(var idx=0;idx<_71.childNodes.length;idx++){
var _78=_71.childNodes[idx];
if(_78.tagName){
this.setHoverRecursively(_78,add);
}
}
};
NXJMenuBar.prototype.setHotKeys=function(_79){
this.nameToHotKey=new Object();
if(_79==null||!this.showHotKeys){
return;
}
var _7a=_79.split("?");
for(var idx=0;idx<_7a.length;idx++){
var _7c=_7a[idx].indexOf("=");
var key=_7a[idx].substring(0,_7c);
var _7e=_7a[idx].substring(_7c+1);
key=key.replace("shift","Shift").replace("ctrl","Ctrl").replace("alt","Alt");
this.nameToHotKey[_7e]=key;
}
if(this.structure!=null){
this.popupInit=false;
this.setStructure(this.structure);
}
};
NXJMenuBar.prototype.setStructure=function(_7f){
this.structure=_7f;
this.tokens=_7f.split("\t");
this.currentToken=0;
this.idsToNodes=new Object();
this.nextId=0;
this.popups=new Array();
this.hoverNodes=new Array();
this.hoverCells=new Array();
this.mainHoverCells=new Array();
this.toolbarHoverCells=new Array();
this.root=this.parseNode(null,0);
this.outerDiv.innerHTML=this.root.getHTML(this);
var _80=MENU_BAR_CLASS;
if(this.customStyle&&this.customStyle!=_80){
_80=this.customStyle+" "+_80;
}
this.outerDiv.className=_80;
var _81=this.outerDiv.style.width;
if(_81&&isNaN(_81)&&_81.indexOf("%")!=-1&&this.outerDiv.childNodes.length){
this.outerDiv.childNodes[0].style.width=_81;
}
var _82=window.name;
if(_82=="menu"||_82=="header"||_82=="footer"){
menubarResize(this.outerDivId);
document.body.onresize=new Function("menubarResize('"+this.outerDivId+"');");
}
};
NXJMenuBar.prototype.updateStyleClass=function(_83){
if(_83==""){
this.outerDiv.className=MENU_BAR_CLASS;
return;
}
if(_83!=this.customStyle){
var _84=this.customStyle.split(" ");
for(var idx=0;idx<_84.length;idx++){
if(_84[idx]==_83){
return;
}
}
this.customStyle=_83;
if(this.structure!=null){
this.popupInit=false;
this.setStructure(this.structure);
}
}
};
function menubarMouseDown(_86,_87,id){
var _89=findOuterDiv(_87);
if(!_89){
return;
}
var _8a=_89.menubar;
var _8b=_8a.findElement(id);
var _8c=_8a.idsToNodes[id];
if(_8c.children.length!=0){
_8c.showPopup(_8a,_8b);
}
if(!MENU_IS_IE){
_86.preventDefault();
}
_86.cancelBubble=true;
}
function menubarMouseEnter(_8d,id){
var _8f=findOuterDiv(_8d);
if(!_8f){
return;
}
var _90=_8f.menubar;
var _91=_90.findElement(id);
var _92=_90.idsToNodes[id];
if(_92==null){
var _93="cant find id "+id;
for(x in _90.idsToNodes){
_93+="\n"+x;
}
alert(_93);
return;
}
var _94=_90.hoverNodes[_92.level];
var _95=_90.hoverCells[_92.level];
if(_94&&_94!=_92){
_94.hovering=false;
window.logBuffer+="\n\tcleared hover for "+_94.title;
if(_95){
_90.setHoverRecursively(_95,false);
window.logBuffer+="\n\tcleared hover class for "+_94.title;
}else{
window.logBuffer+="\n\tno cell for node "+_94.title+" id "+_94.id;
}
if(_94.children.length!=0&&_90.popups[_92.level]&&MENU_IS_IE){
window.logBuffer+="\n\tclosed popup";
_90.hidePopup(_92.level);
}else{
if(_90.popups[_92.level]&&_90.popups[_92.level].parentNode&&!MENU_IS_IE){
_90.hidePopup(_92.level);
}
}
}
_92.hovering=true;
_90.hoverNodes[_92.level]=_92;
_90.hoverCells[_92.level]=_91;
if(_92.level>1&&_92.children.length!=0){
_92.showPopup(_90,_91);
}
_90.setHoverRecursively(_91,true);
if(!MENU_IS_IE||!_90.useIEPopup){
var _96=_90.mainHoverCells[_92.level];
var _97=_90.findElementInMainFrame(id);
if(_96){
_90.setHoverRecursively(_96,false);
}
if(_97){
_90.setHoverRecursively(_97,true);
_90.mainHoverCells[_92.level]=_97;
}
var _98=_90.toolbarHoverCells[_92.level];
var _99=_90.findElementInToolbarFrame(id);
if(_98){
_90.setHoverRecursively(_98,false);
}
if(_99){
_90.setHoverRecursively(_99,true);
_90.toolbarHoverCells[_92.level]=_99;
}
}
}
function menubarMouseLeave(_9a,id){
var _9c=findOuterDiv(_9a);
if(!_9c){
return;
}
var _9d=_9c.menubar;
var _9e=_9d.findElement(id);
var _9f=_9d.idsToNodes[id];
_9f.hovering=false;
window.logBuffer+="\nleave "+_9f.title;
for(var idx=0;idx<_9f.children.length;idx++){
if(_9f.children[idx].hovering){
return;
}
}
_9d.setHoverRecursively(_9e,false);
if(!MENU_IS_IE){
var _a1=_9d.findElementInMainFrame(id);
if(_a1){
_9d.setHoverRecursively(_a1,false);
}
var _a2=_9d.findElementInToolbarFrame(id);
if(_a2){
_9d.setHoverRecursively(_a2,false);
}
}
}
function menubarMouseUp(_a3,id){
var _a5=findOuterDiv(_a3);
if(!_a5){
return;
}
var _a6=_a5.menubar;
var _a7=_a6.findElement(id);
var _a8=_a6.idsToNodes[id];
if(_a8.children.length==0){
if(_a6.popups.length>1){
_a6.hidePopup(1);
}
for(var idx=0;idx<_a6.hoverNodes.length;idx++){
var _aa=_a6.hoverNodes[idx];
var _ab=_a6.hoverCells[idx];
if(_aa){
_aa.hovering=false;
}
if(_ab){
_a6.setHoverRecursively(_ab,false);
}
}
}
var _ac=window.parent.clientManager;
if(_ac!=null&&_a8.command){
var obj=new Object();
obj.name=_a8.command;
if(_a8.dataview){
obj.name=_a8.dataview+":"+obj.name;
}
if(window.name=="mainFrame"||window.name=="command"){
obj.id=_a3;
}else{
obj.id="frame[";
if(window.name=="menu"||window.name=="vertmenu"){
obj.id+="toolbar]";
}else{
obj.id+=window.name+"]";
}
obj.id+="NXJ_MENU_ID:";
}
var _ae=new Array();
for(var _af=_a8;_af.parent;_af=_af.parent){
_ae[_ae.length]=_af.title;
}
for(var idx=_ae.length-1;idx>=0;idx--){
obj.id+=";"+_ae[idx];
}
obj.parentNode=_a6.outerDiv;
_ac.doCommand(obj);
}
}
function menubarPixelValueToInt(_b0){
if(!_b0.indexOf){
return _b0;
}else{
if(_b0.indexOf("px")==-1){
return parseInt(_b0);
}else{
return parseInt(_b0.substring(0,_b0.length-2));
}
}
}
function menubarResize(_b1){
var _b2=findOuterDiv(_b1);
if(!_b2){
return;
}
var _b3=_b2.menubar;
if(window.name=="menu"){
_b3.outerDiv.style.width=document.body.clientWidth;
}
}
function findOuterDiv(_b4){
var _b5=document.getElementById(_b4);
if(!_b5){
if(window.name=="mainFrame"){
for(var idx=0;idx<window.frames.length;idx++){
_b5=window.frames[idx].document.getElementById(_b4);
if(_b5){
break;
}
}
}else{
_b5=window.parent.document.getElementById(_b4);
}
}
return _b5;
}

