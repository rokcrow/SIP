var TREE_CLOSED_FOLDER_ICON="images/foldericon.gif";
var TREE_OPEN_FOLDER_ICON="images/openfoldericon.gif";
var TREE_PLUS_ICON="images/Lplus.gif";
var TREE_MINUS_ICON="images/Lminus.gif";
var TREE_FILE_ICON="images/file.gif";
var TREE_BLANK_ICON="images/blank.gif";
var TREE_PATH_DELIMITER=";";
var TREE_INDENT=20;
var TREE_AGE_TIME=5*60*1000;
var TREE_ESCAPE_KEY=27;
var TREE_ENTER_KEY=13;
var TREE_UP_KEY=38;
var TREE_DOWN_KEY=40;
var TREE_LEFT_KEY=37;
var TREE_RIGHT_KEY=39;
var TREE_TAB_KEY=9;
var TREE_HOME_KEY=36;
var TREE_END_KEY=35;
var TREE_IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
function TreeNode(_1,_2,_3,_4,_5,_6,_7,_8){
this.title=_1;
this.iconURL=_2;
this.command=_3;
this.dataview=_4;
this.tooltip=_5;
this.nodeIsLeaf=_6;
this.level=_7;
this.expanded=false;
this.path=_8+TREE_PATH_DELIMITER+_1;
this.children=new Array();
this.banner="NXJTree.Node";
}
TreeNode.prototype.addChild=function(_9){
this.children[this.children.length]=_9;
};
TreeNode.prototype.addExpandedNodes=function(_a){
_a[_a.length]=this;
this.expandTime=new Date().getTime();
if(this.expanded){
for(var _b=0;_b<this.children.length;_b++){
this.children[_b].addExpandedNodes(_a);
}
}
};
TreeNode.prototype.getAgedNodes=function(_c){
if(new Date().getTime()-this.expandTime>TREE_AGE_TIME){
_c[this.path]=this;
}
if(this.expanded){
for(var _d=0;_d<this.children.length;_d++){
this.children[_d].getAgedNodes(_c);
}
}
};
TreeNode.prototype.getDOM=function(_e){
if(this.dom!=null){
this.grabber.src=this.getGrabberIcon(_e);
return this.dom;
}
var _f=this.getGrabberIcon(_e);
var _10=this.getIcon(_e);
var _11=this.level*TREE_INDENT;
if(_e.hideRoot&&this.level>0){
_11-=TREE_INDENT;
}
var _12=document.createElement("td");
_12.style.width=_11;
var _13=document.createElement("td");
var _14=document.createElement("img");
_14.src=_f;
if(!_e.hasAllLeafNodes){
_13.appendChild(_14);
}
var _15=document.createElement("td");
var _16=document.createElement("a");
var _17=document.createElement("img");
_15.className="nxj-tree-item";
_16.style.cursor="default";
_16.disabled=false;
_16.href="#";
_17.src=_10;
_16.appendChild(_17);
_15.appendChild(_16);
var _18=document.createElement("td");
var _19=document.createElement("a");
var _1a=document.createElement("nobr");
_18.className="nxj-tree-item";
_19.style.cursor="default";
_19.style.textDecoration="none";
_19.style.color=_e.outerDiv.style.color;
_19.id=_e.outerDivId+"@"+this.path;
_19.href="#";
if(TREE_IS_IE){
_1a.innerText=this.title;
}else{
_1a.innerHTML=this.title;
}
_19.appendChild(_1a);
_18.appendChild(_19);
var _1b=document.createElement("tr");
if(this.tooltip.length!=0){
_1b.title=this.tooltip;
}
_1b.appendChild(_12);
_1b.appendChild(_13);
_1b.appendChild(_15);
_1b.appendChild(_18);
var _1c=document.createElement("table");
var _1d=document.createElement("tbody");
_1c.cellSpacing=0;
_1c.cellPadding=0;
_1d.appendChild(_1b);
_1c.appendChild(_1d);
var _1e=document.createElement("tr");
var _1f=document.createElement("td");
_1f.appendChild(_1c);
_1e.appendChild(_1f);
_1e.onmouseenter=associateTreeObjWithEvent(_e,"treeOnMouseEnter");
_1e.onmouseleave=associateTreeObjWithEvent(_e,"treeOnMouseLeave");
this.dom=_1e;
this.grabber=_14;
this.titleAnchor=_19;
this.grabberCell=_13;
this.iconImg=_17;
this.iconCell=_15;
this.titleCell=_18;
if(this==_e.root&&_e.hideRoot){
_1e.style.display="none";
}
return _1e;
};
TreeNode.prototype.getGrabberIcon=function(_20){
if(!this.nodeIsLeaf&&this.expanded){
return _20.getIcon(TREE_MINUS_ICON);
}else{
if(!this.nodeIsLeaf){
return _20.getIcon(TREE_PLUS_ICON);
}else{
return _20.getIcon(TREE_BLANK_ICON);
}
}
};
TreeNode.prototype.getIcon=function(_21){
if(this.iconURL&&this.iconURL.length!=0){
return _21.getIcon(this.iconURL);
}else{
if(!this.nodeIsLeaf&&this.expanded){
return _21.getIcon(TREE_OPEN_FOLDER_ICON);
}else{
if(!this.nodeIsLeaf){
return _21.getIcon(TREE_CLOSED_FOLDER_ICON);
}else{
return _21.getIcon(TREE_FILE_ICON);
}
}
}
};
TreeNode.prototype.getPreferredWidth=function(_22){
var _23=this.level*TREE_INDENT;
if(_22.hideRoot&&this.level>0){
_23-=TREE_INDENT;
}
if(TREE_IS_IE){
return this.grabberCell.clientWidth+this.iconCell.clientWidth+this.titleCell.clientWidth+_23;
}else{
return this.grabberCell.offsetWidth+this.iconCell.offsetWidth+this.titleCell.offsetWidth+_23;
}
};
TreeNode.prototype.mouseEnter=function(_24){
this.titleAnchor.style.textDecoration="underline";
this.titleAnchor.style.color=(this==_24.selectedNode)&&_24.showSelection?"white":"blue";
};
TreeNode.prototype.mouseLeave=function(_25){
this.titleAnchor.style.textDecoration="none";
this.titleAnchor.style.color=(this==_25.selectedNode)&&_25.showSelection?"white":_25.outerDiv.style.color;
};
TreeNode.prototype.select=function(_26){
if(_26.showSelection&&_26.selectedNode!=this){
if(_26.selectedNode!=null){
_26.selectedNode.titleAnchor.style.backgroundColor="transparent";
_26.selectedNode.titleAnchor.style.color=_26.outerDiv.style.color;
}
if(this.titleAnchor.disabled){
this.titleAnchor.style.backgroundColor="gray";
}else{
this.titleAnchor.style.backgroundColor="blue";
}
this.titleAnchor.style.color="white";
}
_26.selectedNode=this;
};
function NXJTree(_27,_28,_29,_2a,_2b,_2c){
if(window.idToTree==null){
window.idToTree=new Object();
}
window.idToTree[_27]=this;
this.outerDivId=_27;
this.outerDiv=document.getElementById(_27);
if(!this.outerDiv){
return;
}
this.outerDiv.style.width="100%";
this.outerDiv.style.height="100%";
this.outerDiv.setStructure=this.setStructure;
this.commandStates=new Object();
this.commandInvoked=null;
this.banner="NXJTree";
this.iconDir=_29;
this.showSelection=_2a;
this.selectedNode=null;
this.banner="NXJTree";
this.hasOnSelect=_2b;
this.structure=_28;
this.isTree=true;
if(this.outerDiv.getAttribute&&this.outerDiv.getAttribute("hideroot")=="true"){
this.hideRoot=true;
}
if(window.name=="vertmenu"&&window.frameElement){
var _2d=this.outerDiv.parentNode;
var _2e=_2d.parentNode;
_2d.style.height=_2e.style.height;
_2d.style.width=_2e.style.width;
this.resize();
this.outerDiv.onresize=associateTreeObjWithEvent(this,"treeResize");
}else{
this.outerDiv.onresize=associateTreeObjWithEvent(this,"treeResize");
if(TREE_IS_IE){
var _2f=document.createElement("div");
_2f.style.position=this.outerDiv.parentNode.style.position;
_2f.style.top=this.outerDiv.parentNode.style.top;
_2f.style.left=this.outerDiv.parentNode.style.left;
_2f.style.height=this.outerDiv.parentNode.style.height;
_2f.style.width=this.outerDiv.parentNode.style.width;
this.outerDiv.parentNode.parentNode.appendChild(_2f);
this.outerDiv.parentNode.style.top=0;
this.outerDiv.parentNode.style.left=0;
this.outerDiv.parentNode.style.overflowY="auto";
_2f.appendChild(this.outerDiv.parentNode);
}
}
if(_2c){
this.setOnExpandHandler(treeExpandHandler);
}
if(window.parent.agedNodes==null){
window.parent.agedNodes=new Object();
}
this.setStructure(_28);
var _30=false;
var _31=this.outerDiv;
while(_31.tagName&&_31.tagName!="FORM"){
if(_31.tagName=="DIV"&&_31.style.display=="none"){
_30=true;
break;
}
_31=_31.parentNode;
}
if(!_30){
this.initialized=true;
}
}
NXJTree.prototype.expandCollapse=function(_32){
var _33=_32.expanded;
if(this.onExpandHandler!=null&&!_33&&_32.children.length==0){
var _34=new Object();
this.root.getAgedNodes(_34);
window.parent.agedNodes[this.outerDivId]=_34;
var mgr=window.parent.clientManager;
if(mgr&&mgr.eventsOK){
this.commandInvoked="unify.treeOnExpand";
this.onExpandNode=_32;
_32.expanded=true;
var obj=new Object();
obj.name="NXJ_TREE_CMD";
mgr.doCommand(obj);
}
return;
}
var _37=new Array();
_32.expanded=!_32.expanded;
_32.grabber.src=_32.getGrabberIcon(this);
_32.iconImg.src=_32.getIcon(this);
this.root.addExpandedNodes(_37);
var _38=0;
var _39=0;
if(_33){
while(_38<this.expandedNodes.length){
if(this.expandedNodes[_38]==_37[_39]){
_38++;
_39++;
}else{
this.tbody.removeChild(this.expandedNodes[_38].dom);
_38++;
}
}
}else{
while(_39<_37.length){
var _3a=_37[_39];
if(_38<this.expandedNodes.length){
var _3b=this.expandedNodes[_38];
if(_3b==_3a){
_38++;
_39++;
}else{
this.tbody.insertBefore(_3a.getDOM(this),_3b.dom);
_39++;
}
}else{
this.tbody.appendChild(_3a.getDOM(this));
_39++;
}
}
}
if(this.adjustMenuCB){
this.adjustMenuCB();
}
this.expandedNodes=_37;
this.table.style.width=this.getPreferredWidth();
};
NXJTree.prototype.getDOM=function(){
var _3c=document.createElement("table");
var _3d=document.createElement("tbody");
_3c.cellSpacing=0;
_3c.cellPadding=0;
this.expandedNodes=new Array();
this.root.addExpandedNodes(this.expandedNodes);
for(var idx=0;idx<this.expandedNodes.length;idx++){
var _3f=this.expandedNodes[idx].getDOM(this);
_3d.appendChild(_3f);
}
_3c.appendChild(_3d);
this.tbody=_3d;
_3c.onclick=associateTreeObjWithEvent(this,"treeOnClick");
_3c.ondblclick=associateTreeObjWithEvent(this,"treeOnDblClick");
_3c.onkeydown=associateTreeObjWithEvent(this,"treeOnKeyDown");
this.table=_3c;
return _3c;
};
NXJTree.prototype.getIcon=function(_40){
if(_40.indexOf("file:")==0){
return _40;
}
return this.iconDir.length==0?_40:this.iconDir+"/"+_40;
};
NXJTree.prototype.getNode=function(_41){
var _42="";
var _43=_41;
while(_43!=null&&_43.parentNode!=this.tbody){
_42+="\n"+_43.tagName;
_43=_43.parentNode;
}
return _43==null?null:this.expandedNodes[_43.rowIndex];
};
NXJTree.prototype.getPreferredWidth=function(){
var _44=0;
for(var idx=0;idx<this.expandedNodes.length;idx++){
_44=Math.max(_44,this.expandedNodes[idx].getPreferredWidth(this));
}
return _44;
};
NXJTree.prototype.getSelectedPath=function(){
return this.selectedNode==null?"":this.selectedNode.path;
};
NXJTree.prototype.getOnExpandPath=function(){
return this.onExpandNode==null?"x":this.onExpandNode.path;
};
NXJTree.prototype.getSelectedRow=function(){
for(var idx=0;idx<this.expandedNodes.length;idx++){
if(this.expandedNodes[idx]==this.selectedNode){
return idx;
}
}
return -1;
};
NXJTree.prototype.keyDown=function(key){
var _48=this.getSelectedRow();
var _49=this.expandedNodes.length;
if(_48==-1){
return;
}
if(key==TREE_UP_KEY&&_48!=0){
this.setSelectedRow(_48-1);
}else{
if(key==TREE_DOWN_KEY&&_48<_49-1){
this.setSelectedRow(_48+1);
}else{
if(key==TREE_HOME_KEY){
this.setSelectedRow(0);
}else{
if(key==TREE_END_KEY){
this.setSelectedRow(_49-1);
}else{
var _4a=_48==_49-1?0:_48+1;
for(var idx=0;idx<_49;idx++){
var _4c=this.expandedNodes[_4a];
var _4d=_4c.title.toUpperCase();
if(_4d.length!=0&&_4d.charCodeAt(0)==key){
this.setSelectedRow(_4a);
break;
}else{
if(_4a==_49-1){
_4a=0;
}else{
_4a++;
}
}
}
}
}
}
}
};
NXJTree.prototype.nextToken=function(){
return this.currentToken>=this.tokens.length?"":this.tokens[this.currentToken++];
};
NXJTree.prototype.parseNode=function(_4e,_4f,_50){
var _51=this.nextToken()=="t";
var _52=this.nextToken();
var _53=this.nextToken();
var _54=this.nextToken();
var _55=this.nextToken();
var _56=this.nextToken();
var _57=this.nextToken();
var _58=_57.charAt(0)=="t";
var _59=_57.length>1&&_57.charAt(1)=="t";
var _5a=this.nextToken();
var _5b=window.parent.agedNodes[this.outerDivId];
var _5c=_4e+TREE_PATH_DELIMITER+_52;
var _5d;
if(_50||(this.agedNodes!=null&&this.agedNodes[_5c]==true)){
for(var idx=0;idx<_5a;idx++){
this.parseNode(_5d.path,_4f+1,true);
}
return;
}
_5d=new TreeNode(_52,_55,_53,_54,_56,_58,_4f,_4e);
var _5f;
if(window.parent.saveBlocks!=null&&(_5f=window.parent.saveBlocks[this.outerDivId])!=null){
if(_5f.expandedNodes[_5d.path]){
_5d.expanded=true;
}
}else{
if(_59){
_5d.expanded=true;
}
}
for(var idx=0;idx<_5a;idx++){
_5d.addChild(this.parseNode(_5d.path,_4f+1,false));
}
return _5d;
};
NXJTree.prototype.resize=function(){
if(window.name=="vertmenu"&&window.frameElement){
var _60=this.outerDiv.parentNode;
var _61=_60.parentNode;
_61.style.height=window.frameElement.offsetHeight;
if(_60.offsetHeight>_61.offsetHeight){
if(TREE_IS_IE){
_61.style.overflowY="scroll";
_61.style.overflowX="hidden";
}else{
_61.style.overflow="scroll";
}
}else{
if(TREE_IS_IE){
_61.style.overflowY="";
_61.style.overflowX="";
}else{
_61.style.overflow="";
}
}
}
};
NXJTree.prototype.setAllEnabled=function(){
var _62=this.outerDiv.firstChild;
var _63=_62.firstChild;
var mgr=window.parent.clientManager;
if(!mgr||!mgr.eventsOK){
return;
}
this.commandStates=mgr.commandStates;
for(var idx=0;idx<this.expandedNodes.length;idx++){
var _66=this.expandedNodes[idx];
var cmd=_66.command;
if(mgr&&cmd){
var _68=new Object();
_68.name=cmd;
if(_66.dataview){
_68.name=_66.dataview+":"+cmd;
}
_68.parentNode=this.outerDiv;
cmd=mgr.getActualCommand(_68);
var _69=this.commandStates[cmd];
_66.titleAnchor.disabled=(_69==false);
if(!_69&&_66==this.selectedNode&&this.showSelection){
_66.titleAnchor.style.backgroundColor="gray";
}
}
}
};
NXJTree.prototype.saveState=function(){
if(!this.expandedNodes){
return;
}
var _6a=new Object();
if(window.parent.saveBlocks==null){
window.parent.saveBlocks=new Object();
}
window.parent.saveBlocks[this.outerDivId]=_6a;
_6a.expandedNodes=new Object();
for(var idx=0;idx<this.expandedNodes.length;idx++){
var _6c=this.expandedNodes[idx];
_6a.expandedNodes[_6c.path]=_6c.expanded;
}
};
NXJTree.prototype.setOnExpandHandler=function(_6d){
this.onExpandHandler=_6d;
};
NXJTree.prototype.setSelectedPathDelayed=function(_6e){
var _6f=this;
var _70=function(){
return _6f.setSelectedPath(_6e);
};
window.setTimeout(_70,100);
};
NXJTree.prototype.setSelectedPath=function(_71){
var _72=_71.split(TREE_PATH_DELIMITER);
var _73=this.root;
if(_73==null){
return;
}
for(var idx=0;idx<_72.length;idx++){
if(!_72[idx]){
continue;
}
var _75=_72[idx];
var _76=false;
if(!_73.expanded){
this.expandCollapse(_73);
}
for(var jdx=0;jdx<_73.children.length&&!_76;jdx++){
var _78=_73.children[jdx];
if(_78.title==_75){
_73=_78;
_76=true;
}
}
if(!_76){
return;
}
}
_73.select(this);
this.saveState();
};
NXJTree.prototype.setSelectedRow=function(row){
var _7a=this.expandedNodes[row];
_7a.select(this);
};
NXJTree.prototype.setStructure=function(_7b){
this.tokens=_7b.split("\t");
this.currentToken=0;
this.root=this.parseNode("",0,false);
if(this.hideRoot){
this.root.expanded=true;
this.hasAllLeafNodes=true;
for(var idx=0;idx<this.root.children.length;idx++){
if(!this.root.children[idx].nodeIsLeaf){
this.hasAllLeafNodes=false;
break;
}
}
}
this.expandedNodes=new Array();
if(this.outerDiv.childNodes.length!=0){
this.outerDiv.removeChild(this.outerDiv.childNodes[0]);
}
this.dom=this.getDOM();
this.outerDiv.appendChild(this.dom);
this.table.style.width=this.getPreferredWidth();
this.saveState();
};
function treeGetElementFromEvent(_7d){
return TREE_IS_IE?_7d.srcElement:_7d.target;
}
NXJTree.prototype.treeOnKeyDown=function(_7e,_7f){
var key=_7e.keyCode;
this.keyDown(key);
};
NXJTree.prototype.treeOnMouseEnter=function(_81,_82){
var _83=treeGetElementFromEvent(_81);
var _84=this.getNode(_83);
var mgr=window.parent.clientManager;
if(!mgr||!mgr.eventsOK){
return;
}
if(_84!=null){
var cmd=_84.command;
if(mgr&&cmd){
var _87=new Object();
_87.name=cmd;
if(_84.dataview){
_87.name=_84.dataview+":"+cmd;
}
_87.parentNode=this;
cmd=mgr.getActualCommand(_87);
}
if(cmd&&this.commandStates[cmd]==false){
return;
}
_84.mouseEnter(this);
}
};
NXJTree.prototype.treeOnMouseLeave=function(_88,_89){
var _8a=treeGetElementFromEvent(_88);
var _8b=this.getNode(_8a);
if(_8b!=null){
_8b.mouseLeave(this);
}
};
NXJTree.prototype.treeOnClick=function(_8c,_8d){
var _8e=treeGetElementFromEvent(_8c);
var _8f=this.getNode(_8e);
var _90=window.parent.clientManager;
if(_8f==null){
return;
}
if(_8e==_8f.titleAnchor||_8e.parentNode==_8f.titleAnchor||_8e==_8f.iconImg){
_8f.select(this);
this.onExpandNode=null;
if(this.hasOnSelect){
if(_90!=null&&_90.eventsOK){
this.commandInvoked="unify.treeOnSelect";
var obj=new Object();
obj.name="NXJ_TREE_CMD";
_90.doCommand(obj);
}
}else{
if(_90!=null&&_90.eventsOK&&_8f.command!=null){
var _92=new Object();
_92.name=_8f.command;
if(_8f.dataview){
_92.name=_8f.dataview+":"+_92.name;
}
_92.parentNode=this;
if(window.name=="mainFrame"||window.name=="command"){
_92.id=this.outerDivId;
}else{
_92.id="frame[";
if(window.name=="menu"||window.name=="vertmenu"){
_92.id+="toolbar]";
}else{
_92.id+=window.name+"]";
}
_92.id+="NXJ_TREE_ID:";
}
_92.id+=_8f.path;
_90.doCommand(_92);
}
}
}else{
if(_8e==_8f.grabber){
this.expandCollapse(_8f);
}
}
if(_90&&!_90.doingCommand&&_90.fieldDescriptors&&_90.focusElement!=_8e){
var _93=_90.fieldDescriptors[_90.currentFieldId];
if(_93&&_93.field){
this.outerDiv.isTree=true;
_90.onFocus(this.outerDiv);
}
}
return false;
};
NXJTree.prototype.treeOnDblClick=function(_94,_95){
var _96=treeGetElementFromEvent(_94);
var _97=this.getNode(_96);
if(_96==_97.iconImg){
this.expandCollapse(_97);
}else{
if(!_97.isNodeLeaf&&(_96==_97.titleAnchor||_96.parentNode==_97.titleAnchor)){
this.expandCollapse(_97);
}
}
};
function treeExpandHandler(){
}
NXJTree.prototype.treeResize=function(_98,_99){
if(this.initialized){
this.resize();
}
};
function associateTreeObjWithEvent(obj,_9b){
return (function(e){
e=e||window.event;
return obj[_9b](e,this);
});
}

