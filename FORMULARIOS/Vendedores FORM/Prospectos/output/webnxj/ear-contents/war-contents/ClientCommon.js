var IS_IE=navigator.appName.indexOf("Microsoft")!=-1;
var IS_IE6=navigator.appVersion.indexOf("MSIE 6.")!=-1;
var IS_IE7=navigator.appVersion.indexOf("MSIE 7.")!=-1;
var IS_IE8=navigator.appVersion.indexOf("MSIE 8.")!=-1;
var _AUTO_ACCEPT=1;
var _AUTO_ZOOM=2;
var _REQUIRED=4;
var _ZOOM=8;
var _UPDATEABLE=16;
var _FOCUSABLE=32;
var _ECHOED=64;
var _REPEATING=128;
var _SELSET=256;
var _HAS_WHEN_FIELD_CHANGES=512;
var _HAS_BEFORE_FIELD=1024;
var _HAS_AFTER_FIELD=2048;
var _HAS_ON_FIELD=4096;
var _TRAVERSED=8192;
var _MODIFIED=16384;
var _IMMEDIATE=32768;
var _SET_NULL=65536;
var _FORCE=131072;
var _FIRST=262144;
var _LAST=524288;
var _HELP=1048576;
var _TARGET=2097152;
var _TAB_STOP=4194304;
var _HAS_SEARCH_RANGE_ACCEPT=8388608;
var _INPUT_REJECTED=16777216;
var ACTION_INPUT=0;
var ACTION_OPEN_CHILD=1;
var ACTION_CLOSE=2;
var ACTION_DISPLAY_SUBMIT=3;
var ACTION_DISPLAY=4;
var ACTION_FORM_CHOOSER=5;
var ACTION_EXIT=6;
var ACTION_YES_NO=7;
var ACTION_DISPLAY_TRIM=8;
var ACTION_ERASE_TRIM=9;
var ACTION_OPEN_URL=13;
var ACTION_DO_UPLOAD=14;
var ACTION_BROWSER_REFRESH=15;
var WINDOW_OPTIONS=", status=no,resizeable=no";
var HELP_COMMAND="HELP";
var SET_NULL_COMMAND="SET_NULL";
var ZOOM_COMMAND="ZOOM";
var CLEAR_FIELD_COMMAND="CLEAR_FIELD";
var CMD_CANCEL_CHILDREN="unify.cancelChildren";
var CMD_CLICK_ON_FIELD="ClickOnField";
var CMD_DISPLAY_CHOOSER="unify.displayChooser";
var CMD_FORM_CHOSEN="unify.formChosen";
var CMD_NEW_WINDOW="unify.newWindow";
var CMD_CLOSE_WINDOW="unify.closeWindow";
var CMD_YES_NO="unify.yesNo";
var CMD_REFRESH="unify.refresh";
var CMD_REFRESH_LOCALE="unify.refreshLocale";
var CMD_REFRESH_FRAMESET="unify.refreshFrameSet";
var CMD_RELOAD="unify.reload";
var CMD_LOAD_CMD_FRAME="unify.loadCmdFrame";
var CMD_CONTINUE="unify.continue";
var CMD_AFTER_UPLOAD="unify.afterUpload";
var LEFT_JUSTIFIED="L";
var CENTER_JUSTIFIED="C";
var RIGHT_JUSTIFIED="R";
var _CLICK=0;
var _TAB=1;
var _BACKTAB=2;
var INITIAL_FOCUS_CALL=3;
var NATURAL_ORDER_TAB=4;
var NAV_FIRST_RECORD=1;
var NAV_LAST_RECORD=2;
var NAV_NEXT_RECORD=4;
var NAV_PREVIOUS_RECORD=8;
var NAV_NEXT_SET=16;
var NAV_PREVIOUS_SET=32;
var NAV_FIND_ALLOWED=512;
var NAV_ADD_ALLOWED=1024;
var NAV_UPDATE_ALLOWED=2048;
var NAV_DELETE_ALLOWED=4096;
var ACCEPT="A";
var SUSPEND="S";
var REJECT="R";
var REP_FIELDS="f";
var REP_LIST="l";
var WINDOW_NAME="NXJ_";
var WINDOW_NAME_SEP="_";
var CHOOSER_WINDOW="FormChooser";
var CLOSE_DELAY=100;
var CHOOSER_FEATURES="modal,resizable=no, height=260, width=";
var MIN_CHOOSER_WIDTH=250;
var CHOOSER_PAD=50;
var MAIN_FRAME="mainFrame";
var COMMAND_FRAME="command";
var NBSP="&#160";
var FIELD_DELIMITER=".";
var FIELD_FYI_MESSAGE="fyi_message.";
var FIELD_FORM_MODE="form_mode.";
var FIELD_RECORD_ACTION="record_action.";
var FIELD_RECORD_COUNT="record_count.";
var FIELD_RECORD_STATE="record_state.";
var FIELD_ZOOM_INDICATOR="zoom_indicator.";
var FIELD_RECORD_NUMBER="record_number.";
var FIELD_USER_INFO="nxj_user_info.";
var SPACE_RE=/[\s\u3000]+/;
var sysInfoNames=new Object();
sysInfoNames[FIELD_FYI_MESSAGE]=true;
sysInfoNames[FIELD_FORM_MODE]=true;
sysInfoNames[FIELD_RECORD_ACTION]=true;
sysInfoNames[FIELD_RECORD_COUNT]=true;
sysInfoNames[FIELD_RECORD_STATE]=true;
sysInfoNames[FIELD_ZOOM_INDICATOR]=true;
sysInfoNames[FIELD_RECORD_NUMBER]=true;
sysInfoNames[FIELD_USER_INFO]=true;
var SEL_NO_CHANGE=0;
var SEL_UPDATE_CURRENT=1;
var SEL_DELETE_CURRENT=2;
var SEL_ADD=3;
var SEL_REPLACE=4;
var SEL_CHANGE_RECORD=5;
var SEL_OLD=6;
var FUNCTION_KEY_BASE=111;
var SHIFT_MASK=65536;
var CTRL_MASK=131072;
var ALT_MASK=262144;
var DELETE_KEY=46;
var BACKSPACE_KEY=8;
var LEFT_KEY=37;
var UP_KEY=38;
var RIGHT_KEY=39;
var DOWN_KEY=40;
var ENTER_KEY=13;
var TAB_KEY=9;
var SPACEBAR=32;
var PAGE_UP_KEY=33;
var PAGE_DOWN_KEY=34;
var END_KEY=35;
var HOME_KEY=36;
var TAB_ID=TAB_KEY;
var BACKTAB_ID=(TAB_KEY|SHIFT_MASK);
var SHIFT_KEY=16;
var CTRL_TAB=(TAB_KEY|CTRL_MASK);
var SHIFT_CTRL_TAB=(TAB_KEY|CTRL_MASK|SHIFT_MASK);
var NON_BREAKING_SPACE="&#160;";
var HTML_LTHAN="&lt";
var HTML_GTHAN="&gt";
var HTML_AMPERSAND="&amp";
var HTML_DQUOTE="&#34";
var HTML_SQUOTE="&#39";
var NXJ_FIRST_COMMAND="_nxjfirstcommand";
var CACHE_TIMESTAMP="cacheTimeStamp";
var FIELD_HIGHLIGHT_COLOR=null;
var FIELD_HIGHLIGHT_BACKGROUND_COLOR=null;
var REPEATING_HIGHLIGHT_BACKGROUND_COLOR=null;
var REPEATING_HIGHLIGHT_COLOR=null;
var modeSensitiveSystemCommands=new Array("ADD_UPDATE-F-T","CANCEL_ZOOM-T-T","CLEAR_TO_ADD-T-T","CLEAR_TO_FIND-T-T","DELETE-F-T","EXIT-T-T","FIND-T-F","FIRST_RECORD-F-T","LAST_RECORD-F-T","NEXT_FIELD-T-T","NEXT_FORM-T-T","NEXT_RECORD-F-T","NEXT_SET-F-T","NEXT_TAB-T-T","PREVIOUS_FIELD-T-T","PREVIOUS_RECORD-F-T","PREVIOUS_SET-F-T","PREVIOUS_TAB-T-T");
var defaultCommandActions=new Array("ADD_UPDATE-A","FIND-A","NEXT_FIELD-A","NEXT_TAB-A","NEXT_FORM-S","PREVIOUS_FIELD-A","PREVIOUS_TAB-A","ZOOM-S","nxjSortByColumn-A");
var defaultRefreshCommands=new Array("PREVIOUS_FORM",CMD_REFRESH,CMD_FORM_CHOSEN,CMD_REFRESH_LOCALE);
var attrValues={_AUTO_ACCEPT:"AUTO_ACCEPT",_AUTO_ZOOM:"AUTO_ZOOM",_REQUIRED:"REQUIRED",_ZOOM:"ZOOM",_FOCUSABLE:"FOCUSABLE",_ECHOED:"ECHOED",_REPEATING:"REPEATING",_SELSET:"SELSET",_UPDATEABLE:"UPDATEABLE",_HAS_WHEN_FIELD_CHANGES:"WFC",_HAS_BEFORE_FIELD:"BEFORE_FIELD",_HAS_AFTER_FIELD:"AFTER_FIELD",_HAS_ON_FIELD:"ON_FIELD",_TRAVERSED:"TRAVERSED",_MODIFIED:"MODIFIED",_IMMEDIATE:"IMMEDIATE",_FORCE:"FORCE",_FIRST:"FIRST",_LAST:"LAST",_HELP:"HELP",_TAB_STOP:"TAB_STOP"};
var PLUMTREE="N";
var PLUMTREEURL="";
var HOMEURL="";
var HOMECONTEXT="";
try{
var curr=window.location.href;
if(curr.indexOf("gateway/gateway.asp")>=0){
PLUMTREE="Y";
var pos=curr.lastIndexOf("=")+1;
PLUMTREEURL=curr.substring(0,pos);
var hosturl=curr.substring(pos);
hosturl=hosturl.replace(/%3A/g,":").replace(/%2F/g,"/");
HOMEURL=hosturl.substring(0,hosturl.indexOf("/",10));
HOMECONTEXT=hosturl.substring(hosturl.indexOf("/",10),hosturl.lastIndexOf("/")+1);
HOMECONTEXT=HOMECONTEXT.replace(/\/JSP/g,"");
}
}
catch(e){
}
function PTMakeAbsoluteURL(_1){
var _2=_1.indexOf("?");
var _3;
if(-1!=_2){
_3=_1.substring(0,_2);
}else{
_3=_1;
}
if(-1!=_3.indexOf(":")){
return _1;
}
if("#"==_1.substring(0,1)){
return _1;
}
if("/"==_1.substring(0,1)){
return HOMEURL+_1;
}
var _4=_1;
var _5="http://enttest01:8080/ReactorPortal";
while("../"==_4.substring(0,3)){
_4=_4.substring(3);
var _6=_5.lastIndexOf("/");
if(-1==_6){
return _1;
}
_5=_5.substring(0,_6);
}
if("./"==_4.substring(0,2)){
_4=_4.substring(2);
}
return _5+"/"+_4;
}
function PTFixURLForPlumtree(_7){
var _8=PTMakeAbsoluteURL(_7);
var _9=_8.substring(0,5).toUpperCase();
var _a=_8.indexOf("#");
if(_a==-1){
_a=_8.length;
}
_8=encodeURIComponent(_8.substring(0,_a)).replace(/\x2B/g,"%2B").replace(/\//g,"%2F").replace(/\./g,"%2E")+_8.substring(_a);
return PLUMTREEURL+_8;
}
function modURL(_b,_c){
if(PLUMTREE=="Y"){
_b=PTFixURLForPlumtree(_b);
}
return _b;
}
function NotebookPageDescriptor(_d,_e){
this.pageId=_d;
this.pageTitle=_e;
this.pageDiv=null;
this.notebookId=null;
this.notebookDiv=null;
this.pageButton=null;
this.isCurrentPage=null;
this.isEnabled=true;
this.isVisible=true;
}
function DynamicAttrDescriptor(_f,_10,_11){
this.elementName=_f;
this.attrValueList=_10;
this.valSet=_11;
}
function DataViewDescriptor(_12,_13,_14,_15,_16,_17,_18,_19,_1a,_1b,_1c,_1d,_1e,_1f,_20,_21,_22,_23,_24,_25,_26){
this.name=_12;
this.find=_13;
this.currentRow=_14;
this.initialRow=_14;
this.nrows=_15;
this.stored=_16;
this.navFlags=_17;
this.repOpt=_18;
this.selset=_19;
this.selMode=_1a;
this.recordAction=_1b;
this.recordCount=_1c;
this.recordState=_1d;
this.recordNumber=_1e;
if(this.currentRow==-1){
this.currentRow=0;
}
this.hasNextOrPrev=_21;
this.isBatch=!_1f&&_24&&_21;
this.isImmediate=(_1f||_20);
this.isBrowsing=_22;
this.findCount=_23;
this.currentRowModified=(this.recordState=="stored/modified");
this.hasOnLeave=_25;
this.isViewModified=_26;
if(this.currentRowModified&&!this.hasNextOrPrev&&!this.isImmediate&&!this.isBatch){
this.initModified=true;
}
this.lastRelativeRow=-1;
this.lastRow=1;
if(!this.find&&(this.nrows>1||this.repOpt==REP_LIST)){
var e;
var _28=(-1);
try{
_28=parseInt(this.recordNumber)-1;
}
catch(e){
_28=(-1);
}
this.realRow=_28;
var _29=(-1);
try{
_29=parseInt(this.recordCount)-1;
}
catch(e){
_29=-1;
}
this.lastRow=_29+1;
if(!isNaN(_28)&&_28!=-1&&!isNaN(_29)&&_29!=-1){
this.lastRelativeRow=(_29-_28)+this.currentRow;
}
}
}
function ClientCellDescriptor(_2a,_2b,_2c,x,_2e){
this.name=_2a;
this.displayJustify=_2b.substring(0,1).toUpperCase();
this.width=_2c;
this.x=x;
this.valwidth=_2e;
}
function ClientFieldDescriptor(_2f,_30,_31,_32,_33,_34,_35,_36,_37,_38,_39,_3a,_3b,_3c,_3d,_3e,_3f){
this.name=_2f;
this.dataViewName=_30;
this.caseConversion=_31;
this.displayFormat=_32;
this.type=_33;
this.fyiMessage=_34;
this.fieldWidth=_36;
this.nextFieldId=_35;
this.values=_37;
this.flags=_38;
this.justification=_39;
this.checkboxOnValues=_3a;
this.checkboxStoreFormat=_3b;
this.backgroundColor=undefined;
this.color=undefined;
this.helpURL=_3c;
this.attrs=_3d;
this.hasOptions=_3e;
this.pageInitialized=true;
this.isAutoComplete=_3f;
}
function CtlDesc(_40,_41,_42,_43,_44,_45,_46,_47,_48,_49,_4a){
this.name=_40;
this.isVisible=_41;
this.styleClass=_42;
this.fgColor=_43;
this.bgColor=_44;
this.fontFamily=_45;
this.fontSize=_46;
this.fontWeight=_47;
this.fontStyle=_48;
this.textDecoration=_49;
this.isPastEnd=_4a;
}
function checkBackButton(){
if(window.backCheckSearch){
var _4b;
if(window.backCheckSearch.charAt(0)=="?"){
var _4c=document.getElementById("nxj_backcheck");
if(_4c&&_4c.contentWindow){
_4b=_4c.contentWindow;
var _4d=_4b.location.search;
}
}else{
_4b=window;
_4d=_4b.location.hash;
if(_4d=="#0"&&window.backCheckSearch=="#0"){
window.location.hash="0x";
window.backCheckSearch="#0x";
_4d=_4b.location.hash;
}
}
if(_4d!=window.backCheckSearch&&_4b){
_4b.history.forward();
var mgr=window.clientManager;
if(mgr&&mgr.eventsOK&&!mgr.doingCommand){
mgr.doCommandInternal("PREVIOUS_FORM",0,0);
}
}
}
window.backCheckPolling=true;
window.setTimeout("checkBackButton()",500);
}
function ClientManager(_4f,_50,_51,_52,_53,_54,_55,_56,_57,_58,_59,_5a,_5b,_5c,_5d,_5e,_5f,_60,_61,_62,_63,_64,_65,_66,_67,_68,_69,_6a,_6b,_6c,_6d,_6e,_6f,_70,_71,_72,_73,_74,_75,_76,_77,_78,_79,_7a,_7b,_7c,_7d,_7e,_7f,_80,_81,_82,_83,_84,_85,_86,_87,_88,_89,_8a,_8b){
this.objId=_59;
this.currentFieldId=_4f;
this.firstFieldId=_50;
this.commandStates=_55;
this.commandActions=_56;
this.clickOnField=_58;
this.clickOnField=true;
this.formName=_62;
this.magicNum=_63;
this.messageHandler=_64;
this.systemImageBase=_84;
this.validator=_65;
this.dateFormat=this.validator.dateFormat;
this.keyMap=new Array();
this.backgroundFocus=null;
this.isIE=navigator.appName.indexOf("Microsoft")!=-1;
this.isIE55=navigator.appVersion.indexOf("MSIE 5.5;")!=-1;
this.traversedFields=new Array();
this.doingCommand=false;
this.showingWindow=false;
this.doingRefresh=false;
this.exiting=false;
this.childWindow=null;
this.focusType=INITIAL_FOCUS_CALL;
this.clearedNull=false;
this.lastEventType="";
this.removeNonRepeatingValues=doRemoveNonRepeatingValues;
this.onListChangeTo=doOnListChangeTo;
this.onFocus=doOnFocus;
this.onFocusImmediate=doOnFocusImmediate;
this.onMouseDown=doOnMouseDown;
this.onUnload=doOnUnload;
this.setButtonStates=doSetButtonStates;
this.setOptions=doSetOptions;
this.setImageStates=doSetImageStates;
this.setLinkStates=doSetLinkStates;
this.setComponentStates=doSetComponentStates;
this.setListboxSelection=doSetListboxSelection;
this.setControlStates=doSetControlStates;
this.doCommand=doCommand;
this.doCommandInternal=doCommandInternal;
this.onKeyDown=doOnKeyDown;
this.onKeyDownForDocument=doOnKeyDownForDocument;
this.fireDblClick=doFireDblClick;
this.onKeyUp=doOnKeyUp;
this.setFocus=doSetFocus;
this.applyStyle=applyStyle;
this.applyStyleToAll=applyStyleToAll;
this.setFocusInBackground=doSetFocusInBackground;
this.setTabIndices=doSetTabIndices;
this.getValue=doGetValue;
this.setValue=doSetValue;
this.initializeRepeatingArea=doInitializeRepeatingArea;
this.findFields=doFindFields;
this.findFieldInFrame=doFindFieldInFrame;
this.initField=doInitField;
this.setFieldState=doSetFieldState;
this.accept=doAccept;
this.updateSystemFields=doUpdateSystemFields;
this.clearSystemFields=doClearSystemFields;
this.updateSystemField=doUpdateSystemField;
this.date=new Date();
this.caseInsensitive=_6c;
this.findName=findNameFromNameIDArray;
this.findRepeatingArea=doFindRepeatingArea;
this.findRepeatingDiv=doFindRepeatingDiv;
this.notebookPages=_6d;
this.notebooks=_6e;
this.dynamicListboxValues=_7a;
this.menuString=_6f;
this.vertMenuString=_70;
this.headerString=_71;
this.footerString=_72;
this.updateFrame=updateFrame;
this.dynamicAttributes=_73;
if(window.name==MAIN_FRAME&&window.dynamicAttributes&&!window.isCommand){
this.dynamicAttributes=window.dynamicAttributes;
}
this.updateDynamicElements=updateDynamicElements;
this.updateDynamicElement=updateDynamicElement;
this.adjustControlPositions=doAdjustControlPositions;
this.getDataView=getDataView;
this.findDataView=findDataView;
this.onBlur=doOnBlur;
this.hiliteField=hiliteField;
this.windowCounter=_75;
this.setEventCode=setEventCode;
this.currentNextFieldName=_76;
this.isElementTabbable=isElementTabbable;
this.nonFocusableElements=new Object();
this.fieldIsInDataView=fieldIsInDataView;
this.nameToId=new Object();
this.onSelectChange=onSelectChange;
this.onSelectKeyDown=onSelectKeyDown;
this.denyOnClick=denyOnClick;
this.onClick=onClick;
this.doNextField=doNextField;
this.doPrevField=doPrevField;
this.getNextId=getNextId;
this.moveRepFieldRecord=moveRepFieldRecord;
this.initFieldRows=initFieldRows;
this.initNavBar=initNavBar;
this.findNavBar=doFindNavBar;
this.controls=_7e;
this.mvControls=_7f;
this.getNamedStyle=getNamedStyle;
this.initHiliteColors=initHiliteColors;
this.dblclickcmd=dblclickcmd;
this.getCommandRelativeTo=getCommandRelativeTo;
this.getActualCommand=getActualCommand;
this.onBeforeActivate=doOnBeforeActivate;
this.getDefaultColors=getDefaultColors;
this.progressDialogDelay=_82*1000;
this.isReuse=_83;
this.userInfo=_85;
this.disabledIfNotModMap=_86;
this.disabledIfModMap=_87;
this.checkDisabled=checkDisabled;
this.isFieldOnAnyPage=isFieldOnAnyPage;
this.isFieldOnCurrentPage=isFieldOnCurrentPage;
this.isFieldOnNonCurrentPage=isFieldOnNonCurrentPage;
this.isFieldOnUnavailablePage=isFieldOnUnavailablePage;
this.makeFieldPageCurrent=makeFieldPageCurrent;
this.isElementOnNonCurrentPage=isElementOnNonCurrentPage;
this.makeElementPageCurrent=makeElementPageCurrent;
this.useFrameset=_88;
this.updatePrompt=updatePrompt;
this.adjustTables=adjustTables;
this.resetCursor=resetCursor;
this.makeAjaxRequest=makeAjaxRequest;
this.methodRet=_89;
this.lockFrames=_8b;
if(_57==ACTION_CLOSE&&!_5c){
_66=false;
_5c=true;
_51=new Array();
}
var _8c=window.parent.frames[MAIN_FRAME];
if(!_88){
this.adjustFrameDivMenuPosition=adjustFrameDivMenuPosition;
this.manageNonFrameFrames=manageNonFrameFrames;
if(this.isIE&&window.parent.clientManager==null&&_75!=0&&!_5c&&_57!=ACTION_EXIT){
if(window.name==""){
document.body.style.behavior="url('#default#homePage')";
document.body.navigateHomePage();
return;
}
}
_8c=window;
if(!window.isCommand){
window.name=MAIN_FRAME;
if(window.dynamicAttributes){
this.dynamicAttributes=window.dynamicAttributes;
}
if(!_5c){
if(window.parent.clientManager==null&&this.isIE){
var _8d=document.getElementById("nxj_backcheck");
if(_8d&&_8d.contentWindow){
window.backCheckSearch="?windowCounter="+_75;
var url=_8d.contentWindow.location.pathname+window.backCheckSearch;
_8d.contentWindow.location.assign(url);
}
}
if(!this.isIE){
window.backCheckSearch="#"+_75;
window.location.hash=_75;
}
if(!window.backCheckPolling){
window.setTimeout("checkBackButton()",2500);
}
}
if(typeof (window.NXJ_DEF_SHEETS)!="undefined"){
var _8f=getContextPath();
for(var idx=0;idx<NXJ_DEF_SHEETS.length;idx++){
var id="_nxjdefss"+idx;
var _92=NXJ_DEF_SHEETS[idx];
var _93=document.documentElement.firstChild;
if(_93.all){
var _94=_93.all[id];
}else{
for(var _95=0;_95<_93.childNodes.length;_95++){
if(_93.childNodes[_95].id==id){
_94=_93.childNodes[_95];
break;
}
}
}
var _96=false;
if(!_94){
_96=true;
}else{
var _97=_94.href;
var _98=_97.indexOf(_8f);
if(_98!=-1){
_97=_97.substring(_98);
_97=_97.substring(_8f.length);
}
if(_97!=_92){
_93.removeChild(_94);
_96=true;
}
}
if(_96){
var _99=document.createElement("LINK");
_99.id=id;
_99.href=_8f+_92;
_99.rel="stylesheet";
_99.type="text/css";
_93.appendChild(_99);
}
}
}
}else{
window.name=COMMAND_FRAME;
}
}
if(window.parent.clientManager){
var mgr=window.parent.clientManager;
if(mgr.loading){
if(window.name==COMMAND_FRAME||!this.isIE||_57==ACTION_EXIT||this.formName.indexOf("ViewForms.")!=0){
mgr.loading=false;
if(!this.isIE&&window.parent.childWindow){
window.parent.childWindow.close();
}
}
}
if(mgr.zoomToClose){
mgr.zoomToClose.close();
mgr.zoomToClose=null;
}
}
if(_8c==null){
this.namesToComponents=new Object();
}else{
if(window.name==MAIN_FRAME){
_8c.initInternalJavaScriptComponents();
}
this.namesToComponents=_8c.namesToComponents;
}
var _9b=window.parent;
if(_9b.name==NXJ_FIRST_COMMAND){
_9b=_9b.parent;
}
if(this.isIE&&window.parent.clientManager==null&&!_5c&&_88&&_75>0){
var par=window.parent;
if(!_9b.opener||_9b.opener.closed||_9b.opener.name!=MANAGER_ID){
window.parent.location.href=window.parent.location.href;
return;
}
this.refreshedFrameset=true;
par.cachedManager=_9b.opener.cachedManager;
par.cachedDataViewDescriptors=_9b.opener.cachedDataViewDescriptors;
_9b.opener.close();
_9b.opener=null;
}
var mgr=window.parent.clientManager;
if(this.useFrameset&&mgr!=null&&this.isIE&&_75<=mgr.windowCounter){
this.windowCounter=mgr.windowCounter;
this.document=mgr.document;
this.form=mgr.form;
this.fieldDescriptors=mgr.fieldDescriptors;
this.currentFieldId=mgr.currentFieldId;
this.traversedFields=mgr.traversedFields;
this.dataViewDescriptors=mgr.dataViewDescriptors;
this.refreshCommands=mgr.refreshCommands;
this.commandStates=mgr.commandStates;
this.commandActions=mgr.commandActions;
var _9d=0;
var _9e=this.fieldDescriptors[this.currentFieldId];
if(_9e){
var _9f=this.getDataView(_9e.dataViewName);
if(_9f){
_9d=_9f.currentRow;
}
}
try{
if(this.document.forms){
}
}
catch(e){
if(navigator.appMinorVersion.indexOf("SP1;")!=-1){
try{
this.doCommandInternal(CMD_REFRESH,0,_9d);
}
catch(e){
}
}else{
var _a0=window.parent.location.pathname;
if(_a0.substring(0,1)!="/"){
_a0="/"+_a0;
}
var _a1=_a0.lastIndexOf("/");
_a0=_a0.substring(0,_a1+1);
var _a2=_a0+"UnifyNXJ.jsp?commandName=PREVIOUS_FORM";
_a2+="&clickedOnRow=0&fieldValues=0&clickedOnField=0&focus=0";
_a2+="&managerId="+MANAGER_ID;
_a2+="&target="+window.name;
window.location.replace(_a2);
}
return;
}
if(this.commandStates["PREVIOUS_FORM"]){
try{
this.doCommandInternal("PREVIOUS_FORM_REFRESH",this.currentFieldId,_9d);
}
catch(e){
}
}else{
_64.alert("PrevFormDisabled");
}
if(this.doingCommand){
return;
}
try{
this.doCommandInternal(CMD_REFRESH,0,_9d);
}
catch(e){
}
return;
}
if(window.parent.trimWindows==null){
window.parent.trimWindows=new Object();
}
if(!this.isIE){
var _a3=window.parent.toolbar;
if(_a3){
_a3.visible=false;
}
}
if(!_5c&&window.parent.clientManager==null&&(_88||_75==0)){
window.parent.opener=null;
if(window.parent.name==NXJ_FIRST_COMMAND){
window.parent.parent.opener=null;
}
}
if(_5c||(window.parent.clientManager!=null&&window.parent.clientManager.isZoom)){
this.isZoom=true;
if(typeof (window.parent.promptCounter)!="undefined"){
if(this.isIE){
openersManager=window.dialogArguments;
}else{
var _a4=window.parent.opener;
openersManager=_a4.parent.clientManager;
}
openersManager.windowCounter=this.windowCounter;
}
}
if(!this.isIE){
if(!_5c&&window.parent.clientManager==null){
var _a5=window.parent.document.cookie;
_a5=_a5.replace(/ /g,"");
var _a6=_a5.split(";");
var _a7="";
var _a8=-1;
for(var idx=0;idx<_a6.length;idx++){
var _a9=_a6[idx].split("=");
var _aa=_a9[0];
var val=_a9[1];
if(_aa=="mgrCookie"){
_a7=val;
}else{
if(_aa=="windowCounter"){
_a8=parseInt(val);
}
}
}
if(_a7==""||_a7!=MANAGER_ID){
window.parent.document.cookie="mgrCookie="+MANAGER_ID;
}else{
if(_75<_a8){
window.parent.history.forward();
_64.alert("BadBack");
return;
}else{
this.refreshedFrameset=true;
}
}
window.parent.document.cookie="windowCounter="+_75;
}
}
this.dataViewDescriptors=_54;
if(_66){
var mgr=window.parent.cachedManager;
this.fieldDescriptors=mgr.fieldDescriptors;
this.commandStates=mgr.commandStates;
this.commandActions=mgr.commandActions;
this.dataViewDescriptors=mgr.dataViewDescriptors;
this.controls=mgr.controls;
this.disabledIfNotModMap=mgr.disabledIfNotModMap;
this.disabledIfModMap=mgr.disabledIfModMap;
this.dynamicListboxValues=mgr.dynamicListboxValues;
}else{
if(_6a&&window.parent.cachedManager){
this.diffsOnly=true;
var mgr=window.parent.cachedManager;
var _ac=mgr.fieldDescriptors;
var _ad=0;
var _ae=~(_SET_NULL|_FORCE|_MODIFIED|_TRAVERSED);
this.fieldDescriptors=new Array();
for(var idx=0;idx<_ac.length;idx++){
if(_ad<_51.length&&_ac[idx].name==_51[_ad].name){
this.fieldDescriptors[idx]=_51[_ad++];
this.fieldDescriptors[idx].changed=true;
this.fieldDescriptors[idx].searchedPages=_ac[idx].searchedPages;
this.fieldDescriptors[idx].notebookPage=_ac[idx].notebookPage;
this.fieldDescriptors[idx].selSetIndex=_ac[idx].selSetIndex;
this.fieldDescriptors[idx].pageInitialized=_ac[idx].pageInitialized;
this.fieldDescriptors[idx].listboxValues=_ac[idx].listboxValues;
this.fieldDescriptors[idx].onvalchanges=_ac[idx].onvalchanges;
}else{
this.fieldDescriptors[idx]=_ac[idx];
this.fieldDescriptors[idx].flags&=_ae;
if(_ac[idx].editReset){
this.fieldDescriptors[idx].editReset=null;
this.fieldDescriptors[idx].changed=true;
}else{
this.fieldDescriptors[idx].changed=false;
}
}
}
this.deferredControls=mgr.deferredControls;
}else{
this.fieldDescriptors=_51;
}
if(window.parent.mainManager&&window.parent.mainManager.formName==_62){
for(var idx=0;this.dataViewDescriptors&&idx<this.dataViewDescriptors.length;idx++){
var _af=this.dataViewDescriptors[idx];
if(window.parent.cachedDataViewDescriptors&&window.parent.cachedDataViewDescriptors.length>idx){
var _b0=window.parent.cachedDataViewDescriptors[idx];
if(!_af.find&&_57!=ACTION_DO_UPLOAD&&_80&&_b0.rowState&&_b0.rowState.length>_80){
var _b1=new Array();
var _b2;
var _b3;
for(var _b4=_80-1;_b4<_b0.rowState.length;_b4++){
_b2=_b0.rowState[_b4];
_b1[_b1.length]=_b2;
_b3=_b2.currentRow;
for(var _b5=0;_b5<_b2.fieldState.length;_b5++){
fieldState=_b2.fieldState[_b5];
if(fieldState&&typeof (fieldState.rawValue)!="undefined"){
var _b6=this.fieldDescriptors[_b5];
if(_b6.values&&_b6.values.length>_b3){
_b6.values[_b3]=fieldState.rawValue;
}
if(_b0.selset){
_b0.selset[_b3][_b6.selSetIndex]=fieldState.rawValue;
}
if(_b3==_af.currentRow){
_b6.flags|=_MODIFIED;
_b6.rawValue=fieldState.rawValue;
}
}
}
}
if(_b1.length){
_b3=_b1.length;
_b1[_b3]=new Object();
_b1[_b3].commandName=CMD_CLICK_ON_FIELD;
_b1[_b3].focusIdx=this.currentFieldId;
_b1[_b3].clickedOnField=this.currentFieldId;
_b1[_b3].currentRow=_b0.currentRow;
_b1[_b3].newRow=_af.currentRow;
_b1[_b3].fieldState=_b1[_b3-1].fieldState;
_af.rowState=_b1;
if(_b0.selset){
_af.selset=_b0.selset;
_af.selMode=SEL_REPLACE;
}
}
}
if(!_af.selset){
_af.oldRow=_b0.currentRow;
if(_af.oldRow==_af.currentRow&&_b0.oldRow!=undefined){
_af.oldRow=_b0.oldRow;
}
continue;
}
if(this.refreshedFrameset||(window.name=="command"&&window.parent.clientManager&&window.parent.clientManager.refreshedFrameset)){
_af.selset=_b0.selset;
_af.selMode=SEL_REPLACE;
}
var _9d=_af.currentRow;
var _b7=_af.lastRow;
if(_af.findCount>0){
_9d=_9d%_af.findCount;
var _b8=Math.floor(_af.currentRow/_af.findCount);
var _b9=_b8*_af.findCount;
_b7=Math.min(_af.lastRow-_b9,_af.findCount);
}
switch(_af.selMode){
case SEL_NO_CHANGE:
case SEL_CHANGE_RECORD:
case SEL_UPDATE_CURRENT:
var _ba=null;
if(_af.selset.length){
_ba=_af.selset[0];
}
_af.selset=_b0.selset;
if(_ba){
_af.selset[_9d]=_ba;
}
if(_af.selset.length>_b7){
_af.selset.length=_b7;
}
break;
case SEL_OLD:
var _ba=null;
if(_af.selset.length){
_ba=_af.selset[0];
}
_af.selset=_b0.selset;
var _bb=_b0.currentRow;
if(_ba){
if(typeof (_b0.oldCurrentRow)!="undefined"){
_bb=_b0.oldCurrentRow;
}else{
if(typeof (_b0.initialRow)!="undefined"){
_bb=_b0.initialRow;
}
}
var _bc=_bb;
if(_af.findCount){
_bc=_bb%_af.findCount;
}
_af.selset[_bc]=_ba;
}
_af.prevCurrentRow=_bb;
if(_af.selset.length>_b7){
_af.selset.length=_b7;
}
break;
case SEL_DELETE_CURRENT:
_af.selset=new Array();
var _bb=_b0.currentRow;
if(_af.findCount){
_bb=_bb%_af.findCount;
}
for(var row=0;row<_b0.selset.length;row++){
if(row!=_bb){
_af.selset[_af.selset.length]=_b0.selset[row];
}
_af.atEnd=_b0.atEnd;
}
break;
case SEL_ADD:
var _ba=_af.selset[0];
_af.selset=_b0.selset;
_af.selset[_af.currentRow]=_ba;
break;
case SEL_REPLACE:
break;
}
}
}
}
window.parent.cachedDataViewDescriptors=this.dataViewDescriptors;
}
if(!this.isIE){
var _be=window.parent.clientManager!=null&&this.windowCounter<window.parent.clientManager.windowCounter;
if(_be){
window.onunload=null;
window.parent.clientManager.eventsOK=false;
this.eventsOK=false;
window.parent.history.forward();
_64.alert("BadBack");
return;
}
}
window.parent.cachedManager=this;
var _bf=window.parent.mainManager;
this.SAVE_COLOR=null;
this.SAVE_BACKGROUND_COLOR=null;
if(window.name==MAIN_FRAME||_bf==null){
this.cellDescriptors=_52;
this.cellPadding=_53;
this.pixelsPerRow=_5e;
this.pixelsPerCol=_5f;
this.menuWidth=_60;
this.headerPlusFooterHeight=_61;
this.userKeyMap=_69;
this.document=document;
this.refreshCommands=new Object();
this.resizeBrowser=_7b;
this.tabElements=new Array();
this.document.body.style.cursor="progress";
var _c0=this.document.getElementsByTagName("FIELDSET");
for(var idx=0;idx<_c0.length;idx++){
_c0[idx].style.cursor="progress";
}
for(var idx=0;idx<_6b.length;idx++){
this.refreshCommands[_6b[idx]]=true;
}
for(var idx=0;idx<defaultRefreshCommands.length;idx++){
this.refreshCommands[defaultRefreshCommands[idx]]=true;
}
this.adjustTables();
window.parent.mainManager=this;
if(this.document.documentElement){
var _c1=this.document.title;
if(_c1==undefined||_c1==""){
_c1=this.document.documentElement.title;
if(_c1==undefined||_c1==""){
_c1=this.formName;
}
}
if(_9b.document){
_9b.document.title=_c1;
}
}
if(!this.isIE){
var box;
var _c3=this.document.getElementsByTagName("FIELDSET");
for(var idx=0;idx<_c3.length;idx++){
box=_c3[idx];
box.parentNode.style.overflow="";
if(box.id&&box.style.borderStyle&&box.style.borderStyle!="none"&&box.style.borderWidth){
var _c4=parseInt(box.style.borderWidth);
if(!isNaN(_c4)&&_c4>0){
var _c5=parseInt(box.style.height);
var _c6=parseInt(box.style.width);
if(!isNaN(_c5)&&box.style.height.indexOf("%")==-1){
_c5-=2*_c4;
box.style.height=(_c5)+"px";
}
if(!isNaN(_c6)&&box.style.width.indexOf("%")==-1){
_c6-=2*_c4;
box.style.width=(_c6)+"px";
}
}
}
var _c7=box.getElementsByTagName("LEGEND");
if(_c7.length){
var _c8=this.document.defaultView.getComputedStyle(box,"");
var _c9=_c8.getPropertyValue("font-size");
if(_c9){
var div;
for(var _cb=0;_cb<box.childNodes.length;_cb++){
div=box.childNodes[_cb];
if(div.tagName=="DIV"&&div.style.position=="absolute"&&div.style.top){
div.style.top=parseInt(div.style.top)-parseInt(_c9);
}
}
}
}
}
}
if(this.isIE){
var hrs=this.document.getElementsByTagName("HR");
for(var idx=0;idx<hrs.length;idx++){
hrs[idx].style.marginTop="-7px";
}
}
if(window.top==_9b&&_57!=ACTION_CLOSE){
if(_5c&&_7b&&this.document.forms["NXJForm"]){
var _cd=this.document.forms["NXJForm"].style;
}
if(_7c!=undefined&&_7c!=-1&&_7c<window.screen.width&&_7d!=undefined&&_7d!=-1&&_7d<window.screen.height){
if(this.isIE&&window.dialogArguments){
if(_cd){
window.dialogHeight=_cd.height;
window.dialogWidth=_cd.width;
}
window.dialogLeft=_7c+"px";
window.dialogTop=_7d+"px";
}else{
var e;
try{
if(_cd){
window.top.resizeTo(parseInt(_cd.width),parseInt(_cd.height));
}
window.top.moveTo(_7c,_7d);
}
catch(e){
var _cf="window.top.moveTo("+_7c+","+_7d+")";
window.top.doMoveTo=new Function("var e;try{"+_cf+"}catch(e){window.top.setTimeout("+"'window.top.doMoveTo()',0);}");
window.top.setTimeout("window.top.doMoveTo()",0);
}
}
}else{
if(_7c!=undefined&&_7c!=-1&&_7c<window.screen.width){
var _d0=(_9b.screenLeft?_9b.screenLeft:window.top.screenX);
if(this.isIE){
_d0-=5;
}
if(this.isIE&&window.dialogArguments){
if(_cd){
window.dialogWidth=_cd.width;
}
window.dialogLeft=_7c+"px";
}else{
var e;
var _d1=_7c-_d0;
try{
window.top.moveBy(_d1,0);
}
catch(e){
var _cf="window.top.moveBy("+_d1+",0)";
window.top.doMoveBy=new Function("var e;try{"+_cf+"}catch(e){window.top.setTimeout("+"'window.top.doMoveBy()',0);}");
window.top.setTimeout("window.top.doMoveBy()",0);
}
}
}else{
if(_7d!=undefined&&_7d!=-1&&_7d<window.screen.height){
var _d2=(_9b.screenTop?_9b.screenTop:_9b.screenY);
if(this.isIE){
_d2-=100;
}
if(this.isIE&&window.dialogArguments){
if(_cd){
window.dialogHeight=_cd.height;
}
window.dialogTop=_7d+"px";
}else{
var e;
var _d1=_7d-_d2;
try{
window.top.moveBy(0,_d1);
}
catch(e){
var _cf="window.top.moveBy(0,"+_d1+")";
window.top.doMoveBy=new Function("var e;try{"+_cf+"}catch(e){window.top.setTimeout("+"'window.top.doMoveBy()',0);}");
window.top.setTimeout("window.top.doMoveBy()",0);
}
}
}
}
}
}
}else{
var _d3=false;
this.cellDescriptors=_bf.cellDescriptors;
this.cellPadding=_bf.cellPadding;
this.pixelsPerRow=_bf.pixelsPerRow;
this.pixelsPerCol=_bf.pixelsPerCol;
this.menuWidth=_bf.menuWidth;
this.headerPlusFooterHeight=_bf.headerPlusFooterHeight;
this.userKeyMap=_bf.userKeyMap;
this.document=_bf.document;
this.refreshCommands=_bf.refreshCommands;
this.notebookPages=_bf.notebookPages;
this.notebooks=_bf.notebooks;
var _d4=window.parent.clientManager;
if(_d4){
this.SAVE_COLOR=_d4.SAVE_COLOR;
this.SAVE_BACKGROUND_COLOR=_d4.SAVE_BACKGROUND_COLOR;
this.userCallbackRef=_d4.userCallbackRef;
}
this.lastFieldId=_bf.lastFieldId;
this.tabElements=_bf.tabElements;
this.wasClickOnField=_bf.wasClickOnField;
if(_57!=ACTION_EXIT&&_57!=ACTION_CLOSE&&(_bf.formName!=_62||_57==ACTION_BROWSER_REFRESH||!sameAttributes(_bf.fieldDescriptors,this.fieldDescriptors)||(_d3=_bf.messageHandler.locale!=_64.locale))){
this.doingRefresh=true;
window.parent.clientManager=this;
this.doingCommand=false;
var _d5=0;
var _d6=this.fieldDescriptors[this.currentFieldId];
if(_d6){
var _af=this.getDataView(_d6.dataViewName);
_d5=_af.currentRow;
}
if(_d3||_57==ACTION_BROWSER_REFRESH){
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
this.dataViewDescriptors[idx].selMode=SEL_REPLACE;
}
this.doCommandInternal(CMD_REFRESH_LOCALE,0,_d5);
}else{
this.doCommandInternal(CMD_REFRESH,0,_d5);
}
return;
}
}
if(_57!=ACTION_EXIT&&_57!=ACTION_CLOSE){
var _d7=new Object();
if(window.name==MAIN_FRAME){
var _d8=window.parent.frames;
if(!_88){
_d8=this.getNonFrameFrames();
}
_d7["menu"]=this.updateFrame(_d8["menu"],this.menuString);
_d7["vertmenu"]=this.updateFrame(_d8["vertmenu"],this.vertMenuString);
_d7["header"]=this.updateFrame(_d8["header"],this.headerString);
_d7["footer"]=this.updateFrame(_d8["footer"],this.footerString);
}
if(_81!=null&&_75!=0){
var _d8=window.parent.frames;
if(!_88){
_d8=this.getNonFrameFrames();
this.reloadFrames=_81;
}
for(var idx=0;idx<_81.length;idx++){
if(_d8[_81[idx]]&&!_d7[_81[idx]]){
_d8[_81[idx]].isReady=null;
if(!_88&&!this.isIE){
var _d9=this.document.getElementById("nxj_"+_81[idx]+"_div");
if(_d9){
_d9.style.width=0;
_d9.style.height=0;
}
}
if(_5c&&_88){
_d8[_81[idx]].location=_d8[_81[idx]].location;
}else{
_d7[_81[idx]]=true;
_d8[_81[idx]].location.reload(true);
}
}
}
}
if(!_88&&(_d7["menu"]||_d7["vertmenu"]||_d7["header"]||_d7["footer"])){
this.reloadFrames=true;
window.setTimeout("if(window.parent.clientManager"+"&&window.parent.clientManager.eventsOK"+"&&!window.parent.clientManager.doingCommand)"+"{window.parent.clientManager.manageNonFrameFrames();}",0);
}
}
this.form=this.document.forms["NXJForm"];
this.initHiliteColors();
if(_74!=null&&_74!=""&&this.document.body&&(this.document.body.background==undefined||this.document.body.background=="")){
this.document.body.background=_74;
}
window.onunload=null;
if(this.document.body){
this.document.body.onunload=null;
}
if(_57!=ACTION_EXIT&&_57!=ACTION_CLOSE){
this.updateDynamicElements();
}
if(window.name==MAIN_FRAME){
this.setControlStates(true,true);
}
this.commandStates[ZOOM_COMMAND]=false;
this.commandStates["CANCEL_ZOOM"]=_5c;
this.commandStates["SET_NULL"]=true;
if(this.commandStates["NEXT_FORM"]){
this.commandStates["NEXT_FORM"]=_5d;
}
var _da;
for(var dvx=0;this.dataViewDescriptors&&dvx<this.dataViewDescriptors.length;dvx++){
_af=this.dataViewDescriptors[dvx];
if(dvx==0){
_da="";
}else{
_da=_af.name+":";
this.commandActions[_da+"nxjSortByColumn"]="A";
}
if(_af.find){
this.commandStates[_da+"DELETE"]=false;
}
this.commandStates[_da+"DELETE_RECORD"]=this.commandStates[_da+"DELETE"];
var _dc=undefined;
var _dd=undefined;
if(dvx==0){
var _de=this.form.getAttribute("defaultcommand");
if(_de){
_dc=new Object();
_dc.name=_de;
_dc.parentNode=this.form;
}
_dd=this.form.getAttribute("v8ncmds");
}else{
var _df=this.document.getElementById(_af.name+".");
if(_df){
var _de=_df.getAttribute("defaultcommand");
if(_de){
_dc=new Object();
_dc.name=_de;
_dc.parentNode=_df;
}
_dd=_df.getAttribute("v8ncmds");
if(!this.isIE&&window.name==MAIN_FRAME&&_df.style.borderWidth&&_df.style.borderStyle!="none"){
var _e0=_df.parentNode;
if(_e0.tagName=="DIV"&&_e0.style.overflow=="hidden"){
_e0.style.borderWidth=_df.style.borderWidth;
_e0.style.borderStyle=_df.style.borderStyle;
_df.style.borderWidth=0;
}
}
}
if(!_dc){
_dc=this.dataViewDescriptors[0].defCmdObj;
}
}
if(_dd){
_af.v8nCmds=_dd.split(";");
}
if(_dc){
this.commandStates[_da+"DEFAULT_COMMAND"]=true;
_af.defCmdObj=_dc;
}
}
this.commandStates[CMD_CLICK_ON_FIELD]=true;
for(var dvx=0;this.dataViewDescriptors&&dvx<this.dataViewDescriptors.length;dvx++){
var _af=this.dataViewDescriptors[dvx];
if(dvx==0){
_da="";
}else{
_da=_af.name+":";
}
if(_af.repOpt==REP_LIST){
var row=_af.currentRow;
var _e1=_af.lastRow-1;
this.commandStates[_da+"FIRST_RECORD"]=row!=0;
this.commandStates[_da+"PREVIOUS_RECORD"]=row!=0;
this.commandStates[_da+"PREVIOUS_SET"]=row!=0;
this.commandStates[_da+"LAST_RECORD"]=row!=_e1||_af.isBrowsing;
this.commandStates[_da+"NEXT_RECORD"]=row!=_e1||_af.isBrowsing;
this.commandStates[_da+"NEXT_SET"]=row!=_e1||_af.isBrowsing;
}else{
this.commandStates[_da+"FIRST_RECORD"]=false;
if(_af.navFlags&NAV_FIRST_RECORD){
this.commandStates[_da+"FIRST_RECORD"]=true;
}
this.commandStates[_da+"LAST_RECORD"]=false;
if(_af.navFlags&NAV_LAST_RECORD){
this.commandStates[_da+"LAST_RECORD"]=true;
}
this.commandStates[_da+"NEXT_RECORD"]=false;
if(_af.navFlags&NAV_NEXT_RECORD){
this.commandStates[_da+"NEXT_RECORD"]=true;
}
this.commandStates[_da+"PREVIOUS_RECORD"]=false;
if(_af.navFlags&NAV_PREVIOUS_RECORD){
this.commandStates[_da+"PREVIOUS_RECORD"]=true;
}
this.commandStates[_da+"NEXT_SET"]=false;
if(_af.navFlags&NAV_NEXT_SET){
this.commandStates[_da+"NEXT_SET"]=true;
}
this.commandStates[_da+"PREVIOUS_SET"]=false;
if(_af.navFlags&NAV_PREVIOUS_SET){
this.commandStates[_da+"PREVIOUS_SET"]=true;
}
}
}
for(var idx=0;idx<defaultCommandActions.length;idx++){
var _e2=defaultCommandActions[idx].split("-");
var _aa=_e2[0];
var _e3=_e2[1];
if(this.commandActions[_aa]==null){
this.commandActions[_aa]=_e3;
}
}
for(var _e4 in this.commandStates){
if(this.commandActions[_e4]==null){
this.commandActions[_e4]=ACCEPT;
}
}
var _e5="";
var _e6=new Object();
for(var idx=0;idx<this.userKeyMap.length;idx++){
var _e2=this.userKeyMap[idx].split("=");
var key=mapKeyNameToKeyCode(_e2[0]);
var _e8=_e2[1].split("-");
_e6[_e2[0]]=_e2[1];
if(key==null){
_e5+=this.userKeyMap[idx]+"\n";
}else{
this.keyMap[key]=_e2[1];
for(var cid=0;cid<_e8.length;cid++){
var _ea=_e8[cid];
this.keyMap[_ea]=_e2[0];
}
}
}
this.keyMap[UP_KEY]="PREVIOUS_RECORD";
this.keyMap[DOWN_KEY]="NEXT_RECORD";
this.menubarHotKeys="";
for(key in _e6){
if(this.menubarHotKeys.length!=0){
this.menubarHotKeys+="?";
}
this.menubarHotKeys+=key+"="+_e6[key];
}
if(_e5.length!=0){
this.messageHandler.alert("BadKeyMap",new Array(_e5));
}
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
if(this.caseInsensitive){
_aa=this.fieldDescriptors[idx].name.toUpperCase();
}else{
_aa=this.fieldDescriptors[idx].name;
}
this.nameToId[_aa]=idx;
}
if(this.fieldDescriptors.length!=0&&_57!=ACTION_EXIT&&_57!=ACTION_CLOSE){
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
var _af=this.dataViewDescriptors[idx];
if(_af.repOpt!=REP_FIELDS){
this.initializeRepeatingArea(_af,window.name);
}
}
}
if(window.name==MAIN_FRAME){
window.parent.clientManager=this;
nxjInitCustomJS();
}
var _eb=(window.name==MAIN_FRAME);
for(var idx=0;idx<this.fieldDescriptors.length&&_57!=ACTION_EXIT&&_57!=ACTION_CLOSE;idx++){
var _b6=this.fieldDescriptors[idx];
var _af=this.getDataView(_b6.dataViewName);
if(_af.repOpt!=REP_FIELDS){
var _ec=_b6.name;
if(_b6.hasOptions&&(_b6.flags&_REPEATING)!=0){
_ec+=_af.currentRow;
if(!this.dynamicListboxValues[_ec]){
_ec=_b6.name;
}
}
_b6.field=this.initField(_b6,"",_b6.values[0],_af,this.dynamicListboxValues[_ec],_eb);
}else{
this.initFieldRows(_b6,_af,this.dynamicListboxValues,true,_eb);
}
}
if(!this.useFrameset){
window.onresize=doOnResize;
window.onscroll=doOnScroll;
}else{
if(!this.isIE){
window.onresize=firefoxResize;
}
}
if(_57!=ACTION_EXIT&&_57!=ACTION_CLOSE){
this.initControls(this.controls,_57);
var _ed=this.dataViewDescriptors;
for(var dvx=0;_ed&&dvx<_ed.length;dvx++){
var _af=_ed[dvx];
if(_af.repOpt==REP_LIST||_af.nrows>1){
_af.navbar=this.findNavBar(_af);
if(_af.navbar){
this.initNavBar(_af);
}
}
}
var _d8=this.document.getElementsByTagName("IFRAME");
if(_57!=ACTION_DO_UPLOAD&&_57!=ACTION_EXIT&&_57!=ACTION_CLOSE){
for(var idx=0;idx<_d8.length;idx++){
if(!_d8[idx].getAttribute("nxjupload")){
var _ee=_d8[idx].getAttribute("nxjsrc");
if(_ee&&_ee.indexOf("TextBinaryHandler")>-1){
_d8[idx].src=_ee.replace(/htmlElementName=.*(&cacheTimeStamp=[0-9][0-9]*)?/,"htmlElementName="+_d8[idx].id+"&"+CACHE_TIMESTAMP+"="+this.windowCounter);
}
}
}
}
if(_8a!=null){
for(var ct in _8a){
var ctl=this.document.getElementById(ct);
if(ctl){
var bg=_8a[ct];
ctl.style.backgroundColor=bg;
}
}
}
}
for(var idx=this.fieldDescriptors.length-1;idx>=0;idx--){
var _b6=this.fieldDescriptors[idx];
var _f2=this.fieldDescriptors[_b6.nextFieldId];
if(_f2!=null){
_f2.prevFieldId=idx;
}
}
for(var idx=this.fieldDescriptors.length-1;idx>=0;idx--){
var _b6=this.fieldDescriptors[idx];
if(_b6.prevFieldId==undefined){
_b6.prevFieldId=idx>0?idx-1:this.fieldDescriptors.length-1;
}
}
if(window.parent.clientManager!=null&&window.parent.clientManager.urlWindowIsOpen){
this.isUrlWindowOpen=true;
}
window.parent.clientManager=this;
if(this.fieldDescriptors.length!=0&&_57!=ACTION_EXIT&&_57!=ACTION_DO_UPLOAD&&(_57!=ACTION_OPEN_CHILD||window.name==MAIN_FRAME)&&_57!=ACTION_CLOSE){
if(_79&&this.namesToComponents){
for(var _f3 in this.namesToComponents){
var nb=this.namesToComponents[_f3];
if(nb&&nb.isNotebook&&nb.pages!=null){
if(_79[_f3]){
nb.setDynamicProperties(_79);
}else{
for(var _f5=0;_f5<nb.pages.length;_f5++){
if(_79[nb.pages[_f5].id]){
nb.setDynamicProperties(_79);
break;
}
}
}
}
}
}
if(window.name==MAIN_FRAME){
this.setTabIndices();
}
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
var _af=this.dataViewDescriptors[idx];
if(_af.repOpt!=REP_FIELDS){
this.populateRepeatingArea(_af,window.name);
}
}
var _f6=this.fieldDescriptors[this.currentFieldId];
var _b6=_f6;
var _f7=0;
do{
if(_b6==null){
break;
}
if((_b6.flags&_FOCUSABLE)==0||(_b6.field&&_b6.field.style.visibility=="hidden")||(_b6.field==null)){
if(this.field!=null){
this.accept();
}
this.currentFieldId=_b6.nextFieldId;
_b6=this.fieldDescriptors[this.currentFieldId];
this.currentNextFieldName="";
_f7++;
}else{
var e;
try{
var _f8=true;
var _f9=window.parent.mainManager;
if(_f9&&_f9.focusControl){
if(_f9.focusField==_b6.field){
_f8=false;
this.setFocus(_f9.focusControl);
}
_f9.focusControl=null;
_f9.focusField=null;
}
if(_f8){
if(_79==null&&this.isFieldOnNonCurrentPage(_b6)){
this.makeFieldPageCurrent(_b6);
if(this.isIE){
this.tweakTabs=tweakTabs;
window.setTimeout("window.parent.clientManager.tweakTabs()",0);
}
}
if(!this.isFieldOnNonCurrentPage(_b6)){
if(IS_IE6&&_b6.field&&_b6.field.wasReadOnly){
this.document.body.focus();
}
this.setFocus(_b6.field);
}
if(_57!=ACTION_OPEN_CHILD){
var _fa=this.wasClickOnField;
this.hiliteField(_b6.field,true);
this.wasClickOnField=_fa;
}
}
}
catch(e){
}
break;
}
}while(_b6!=_f6&&_f7<=this.fieldDescriptors.length);
}
if(_57!=ACTION_EXIT&&(_57!=ACTION_OPEN_CHILD||window.name==MAIN_FRAME)&&_57!=ACTION_OPEN_URL&&_57!=ACTION_CLOSE){
var _b6=this.fieldDescriptors[this.currentFieldId];
if(_b6!=null){
if(_b6.field!=null){
if((_b6.flags&_INPUT_REJECTED)!=0){
this.savedValue=null;
_b6.flags&=~_INPUT_REJECTED;
}else{
if(_b6.field.getAttribute("isRichText")){
if(_b6.values&&_b6.values.length>0){
this.savedValue=_b6.values[0];
}
}else{
this.savedValue=this.getValue(_b6.field);
}
}
}
this.setFieldState(_b6);
}
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
var _af=this.dataViewDescriptors[idx];
if(_af.repOpt!=REP_FIELDS){
if(window.name==MAIN_FRAME){
var _fb=this.findRepeatingArea(_af);
if(_fb){
_fb.style.display="inline";
}
}
if(_af.grid&&_af.grid.root&&(_af.grid.root.offsetWidth||!this.isIE)&&_af.grid.resize){
_af.grid.resize();
if(!this.isIE&&_b6!=null&&_b6.field){
this.setFocus(_b6.field);
}
}
}
}
}
var _fc=1;
if(this.dataViewDescriptors&&this.dataViewDescriptors.length){
curDataView=this.dataViewDescriptors[0];
var _fd=this.fieldDescriptors[this.currentFieldId];
if(_fd){
curDataView=this.getDataView(_fd.dataViewName);
}
_fc=curDataView.currentRow;
}
switch(_57){
case ACTION_OPEN_CHILD:
var _fe=(window.parent.screenLeft?window.parent.screenLeft:window.top.screenX)+100;
var _ff=(window.parent.screenTop?window.parent.screenTop:window.parent.screenY)+100;
var _c6=Math.max(_5a*this.pixelsPerCol,this.menuWidth);
var _c5=_5b*this.pixelsPerRow+this.headerPlusFooterHeight;
window.parent.promptCounter=this.windowCounter+1;
this.updatePrompt(window.parent.promptCounter,null,"openchild");
if(this.isIE){
this.showingWindow=true;
window.showModalDialog(modURL(_67,11),window.parent.clientManager,"resizable:yes;help:no;status:no;dialogTop:"+_ff+"px;dialogLeft:"+_fe+"px;"+"dialogWidth:"+_c6+"px;dialogHeight:"+_c5+"px");
this.showingWindow=false;
if(!this.doingCommand){
this.doCommandInternal(CMD_CANCEL_CHILDREN,0,this.magicNum);
return;
}
}else{
var _100;
var _101=WINDOW_NAME+new Date().getTime();
_100="modal,resizable=yes,height="+_c5+",width="+_c6+",top="+_ff+",left="+_fe;
this.childWindow=window.open(modURL(_67,12),_101,_100);
}
break;
case ACTION_CLOSE:
var _102;
if(this.isIE){
_102=window.dialogArguments;
}else{
var _a4=window.parent.opener;
_102=_a4.parent.clientManager;
if(!this.useFrameset){
_102.zoomToClose=window;
}
}
_102.childWindow=null;
_102.setControlStates(false);
this.doingCommand=true;
if(this.isIE){
self.parent.close();
_102.doCommandInternal(CMD_CLOSE_WINDOW,0,_fc);
var _103=window.parent;
for(var ifx=0;ifx<_103.frames.length;ifx++){
var _105=_103.frames[ifx];
if(_105.document){
_105.document.open();
_105.document.close();
}
}
}else{
_102.doCommandInternal(CMD_CLOSE_WINDOW,0,_fc);
if(_88){
self.parent.close();
}else{
window.blur();
}
}
return;
case ACTION_DISPLAY_SUBMIT:
alert(_59);
this.doCommandInternal(CMD_CONTINUE,0,_fc);
_59="";
break;
case ACTION_DISPLAY:
alert(_59);
_59="";
break;
case ACTION_OPEN_URL:
var _106=false;
var _107=this.document.getElementsByTagName("IFRAME");
var _108=null;
var _109=_77.indexOf("|");
if(_109!=-1){
_108=_77.substring(_109+1);
_77=_77.substring(0,_109);
}
for(var idx=0;idx<_107.length;idx++){
if(_107[idx].name==_77){
_106=true;
break;
}
}
if(!_106){
this.urlWindowIsOpen=true;
}else{
this.makeElementPageCurrent(_107[idx]);
}
var form=window.document.createElement("FORM");
var _10b=(_67.search(/\.jsp$/i)!=-1);
if(_10b){
var _a0=window.parent.location.pathname;
if(_a0.substring(0,1)!="/"){
_a0="/"+_a0;
}
var _a1=_a0.lastIndexOf("/");
_a0=_a0.substring(0,_a1+1);
if(_67.indexOf(_a0)==-1){
_10b=false;
}
}
form.name="dummySubmitForm";
form.action=modURL(_67,13);
if(_77=="_nxj_exit_to_url"){
if(this.isZoom){
var _10c=new Array();
var _10d=window;
if(this.isIE){
while(_10d.dialogArguments!=null){
_10c[_10c.length]=_10d;
_10d=_10d.dialogArguments.document.parentWindow;
}
}else{
while(_10d.parent.opener!=null){
_10c[_10c.length]=_10d;
_10d=_10d.parent.opener;
}
}
if(_10d!=null){
var _9b=_10d.parent;
if(_9b.name==NXJ_FIRST_COMMAND){
_9b=_9b.parent;
}
}
}
_9b.name=_77;
}
var _10e=true;
form.target=_77;
window.document.body.appendChild(form);
if(_78||_10b){
var _10f;
var _110;
if(_78==null){
_78=new Array();
}
_78[_78.length]=new Array("managerId",MANAGER_ID);
for(var _111=0;_111<_78.length;_111++){
_110=_78[_111];
_10f=window.document.createElement("INPUT");
_10f.type="hidden";
_10f.name=_110[0];
_10f.value=_110[1];
form.appendChild(_10f);
}
form.method="post";
}else{
form.method="get";
var _112=_67.indexOf("?");
if(_112!=-1){
var _113=_67.substring(_112+1);
var _114=_113.split("&");
for(var pIdx=0;pIdx<_114.length;pIdx++){
_110=_114[pIdx].split("=");
if(_110!=""){
_10f=window.document.createElement("INPUT");
_10f.type="hidden";
_10f.name=_110[0];
if(_110[1]!=undefined){
_10f.value=_110[1];
}
form.appendChild(_10f);
}
}
}else{
if(!_106){
_10e=false;
}
}
}
if((_108||!_10e)&&!_106){
var url=_10e?"about:blank":_67;
if(_108){
window.open(url,_77,_108);
}else{
window.open(url,_77);
}
}
if(_10e){
form.submit();
}
window.document.body.removeChild(form);
if(_77=="_nxj_exit_to_url"){
if(this.isZoom){
for(var idx=_10c.length-1;idx>=0;idx--){
_10c[idx].parent.close();
}
}
}else{
window.setTimeout("window.parent.clientManager.doCommandInternal('"+CMD_CONTINUE+"',0,"+_fc+");",100);
}
_59="";
break;
case ACTION_FORM_CHOOSER:
_59=_59.replace(/\\n/g,"\n");
var _116=_59.split("\n");
var _117="";
var _c6;
var _100;
var _118=_116.length<10?1:(_116.length<100?2:3);
for(var idx=0;idx<_116.length;idx++){
_117=Math.max(_117,_116[idx].length);
}
_c6=Math.max(MIN_CHOOSER_WIDTH,CHOOSER_PAD+(_117+_118+2)*this.pixelsPerCol);
var _fe=(window.parent.screenLeft?window.parent.screenLeft:window.top.screenX)+200;
var _ff=(window.parent.screenTop?window.parent.screenTop:window.parent.screenY)+100;
_100=CHOOSER_FEATURES+_c6+",top="+_ff+",left="+_fe;
if(this.isIE){
_67+="&windowCounter="+_75;
this.childWindow=window.showModalDialog(modURL(_67,14),window.parent.clientManager,"help:no;status:no;dialogTop:"+_ff+"px;dialogLeft:"+_fe+"px;"+"dialogWidth:"+_c6+"px;dialogHeight:260px");
}else{
this.childWindow=window.open(modURL(_67,15),CHOOSER_WINDOW+new Date().getTime(),_100);
}
_59="";
break;
case ACTION_EXIT:
var _102=null;
var _103=window.parent;
if(this.isIE){
_102=window.dialogArguments;
}else{
var _a4=window.parent.opener;
if(_a4){
_102=_a4.parent.clientManager;
}
}
this.exiting=true;
if(_102){
_102.exiting=true;
if(this.isIE){
_103=_102.document.parentWindow.parent;
self.parent.close();
}else{
_103=_a4.parent;
setInterval("self.parent.close()",CLOSE_DELAY);
}
}
var _119=false;
if(_59.search(/http(s)?:/i)==0){
_119=true;
}
var _11a="#e6ebef";
var _c8=this.getNamedStyle("FORM");
if(_c8&&_c8.backgroundColor){
_11a=_c8.backgroundColor;
}
if(_119&&!this.isIE){
if(_103.name==NXJ_FIRST_COMMAND){
_103.parent.location.replace(modURL(_59,1));
}else{
_103.location.replace(modURL(_59,2));
}
return;
}
for(var ifx=0;ifx<_103.frames.length;ifx++){
var _105=_103.frames[ifx];
try{
if(_105.document){
_105.document.open();
_105.document.write("");
_105.document.close();
}
}
catch(e){
}
}
if(_119){
if(_103.name==NXJ_FIRST_COMMAND){
_103.parent.location.replace(modURL(_59,1));
}else{
_103.location.replace(modURL(_59,2));
}
}else{
_103.document.open();
_103.document.write(_59);
_103.document.close();
_103.document.bgColor=_11a;
if(!this.isIE){
_103.document.documentElement.style.backgroundColor=_11a;
_103.document.body.style.backgroundColor=_11a;
_103.document.cookie="windowCounter=0";
}
}
return;
case ACTION_YES_NO:
var _11b=window.confirm(_59);
this.doCommandInternal(CMD_YES_NO,_11b?1:0,0);
return;
case ACTION_DISPLAY_TRIM:
var _100;
_100="resizable=yes,height=300, width=300";
window.parent.trimWindows[_59]=window.open(modURL(_67,16),_59,_100);
this.doCommandInternal(CMD_CONTINUE,0,_fc);
return;
case ACTION_ERASE_TRIM:
var _105=window.parent.trimWindows[_59];
if(_105!=null&&!_105.closed){
_105.close();
window.parent.trimWindows[_59]=null;
}
this.doCommandInternal(CMD_CONTINUE,0,_fc);
return;
case ACTION_DO_UPLOAD:
var _107=this.document.getElementsByTagName("IFRAME");
var _11c;
var _11d=0;
for(var idx=0;idx<_107.length;idx++){
_11c=_107[idx].contentWindow;
if(_107[idx].getAttribute("nxjupload")&&_107[idx].style.visibility!="hidden"&&_11c&&_11c.uploadMgr&&_11c.uploadMgr.chooserField.value){
_11d++;
}
}
if(_11d>0){
for(var idx=0;idx<_107.length;idx++){
_11c=_107[idx].contentWindow;
if(_107[idx].getAttribute("nxjupload")&&_107[idx].style.visibility!="hidden"&&_11c&&_11c.uploadMgr&&_11c.uploadMgr.chooserField.value){
this.doingCommand=true;
this.doingUpload=true;
this.loading=true;
this.eventsOK=false;
this.checkUpload=checkUpload;
this.uploadForm=_11c.uploadMgr.form;
if(_11d>1){
_11c.uploadMgr.form.elements.moreFiles.value="true";
}
this.uploadForm.elements.promptCounter.value=window.parent.promptCounter;
window.status=this.messageHandler.findMessage("Uploading");
window.setTimeout("window.parent.clientManager.checkUpload()",0);
break;
}
}
}
}
this.setControlStates(window.name==MAIN_FRAME);
window.setTimeout("window.parent.clientManager.updateSystemFields()",0);
if(_59){
window.status=_59;
}
if(this.doingCommand){
return;
}
if(!this.useFrameset&&(!window.isCommand||_81!=null)){
this.manageNonFrameFrames();
}
this.eventsOK=true;
this.resetCursor();
window.onunload=new Function("event","try{window.parent.clientManager.onUnload(event);}catch(e){}");
if(window.parent.mainManager.resizeBrowser&&window.top==_9b){
if(!this.refreshedFrameset){
window.parent.mainManager.resizeBrowser=false;
window.setTimeout("window.parent.clientManager.doResizeBrowser();",0);
}
}
if(_57!=ACTION_OPEN_URL&&this.isIE&&this.useFrameset&&(this.refreshedFrameset||_75==0)){
var _d5=0;
var _d6=this.fieldDescriptors[this.currentFieldId];
if(_d6){
var _af=this.getDataView(_d6.dataViewName);
_d5=_af.currentRow;
}
var cmd=CMD_LOAD_CMD_FRAME;
if(this.refreshedFrameset){
cmd=CMD_RELOAD;
}
window.setTimeout("try{window.parent.clientManager.doCommandInternal('"+cmd+"',0,"+_d5+");}catch(e){}",0);
return;
}
if(_bf&&_bf.delayClickField){
var _9e=this.fieldDescriptors[this.currentFieldId];
if(_9e.field==_bf.delayClickField&&(_9e.flags&_AUTO_ACCEPT)!=0){
this.doNextField();
}
_bf.delayClickField=null;
}
if(this.userCallbackRef){
this.userCallbackRef(this.methodRet);
this.userCallbackRef=null;
}
}
function resetCursor(){
if(this.document){
this.document.body.style.cursor="";
var _11f=this.document.getElementsByTagName("FIELDSET");
for(var idx=0;idx<_11f.length;idx++){
_11f[idx].style.cursor="";
}
}
}
function checkUpload(){
if(this.doingUpload||this.loading){
var _121=window.parent.frames["promptFrame"];
if(!this.useFrameset){
_121=window;
}
if(_121&&_121.promptObject){
this.loading=false;
return;
}
if(this.useFrameset){
var url=window.parent.frames["uploadFrame"].location.href;
}else{
var link=this.document.getElementById("uploadFrame");
if(link){
url=link.href;
}else{
url="UploadDialog.jsp?managerId="+MANAGER_ID;
}
}
if(this.isIE){
if(this.uploadForm){
url+=";isupload";
}
var _124=window.parent.screenLeft+200;
var _125=window.parent.screenTop+100;
this.childWindow=true;
var _126=window.parent.showModelessDialog;
this.childWindow=_126(modURL(url,17),window.parent.clientManager,"help:no;status:no;dialogTop:"+_125+"px;dialogLeft:"+_124+"px;"+"dialogWidth:300px;dialogHeight:130px");
this.childWindow=null;
}else{
var _127="modal,resizable=no,height=130,width=300"+",top="+(window.parent.screenY+100)+",left="+(window.parent.screenX+200);
this.childWindow=true;
this.childWindow=window.open(modURL(url,18),"Upload",_127);
if(this.childWindow==null){
var chsr=this.uploadForm.elements.NXJChooser;
chsr.disabled=false;
try{
this.uploadForm.submit();
chsr.disabled=true;
}
catch(e){
this.enableFileChoosers();
this.doingUpload=false;
this.loading=false;
this.doingCommand=false;
this.eventsOK=true;
this.setControlStates(false);
this.resetCursor();
this.messageHandler.alert("BAD_FILE");
}
}
}
}
}
ClientManager.prototype.closeProgressDialog=function(){
if(window.parent.loadingMgr){
window.parent.loadingMgr.loading=false;
}
};
ClientManager.prototype.initControls=function(_129,_12a){
var _12b;
var _12c;
var ctl;
for(var idx=0;idx<_129.length;idx++){
_12b=_129[idx];
_12c=_12b.name;
ctl=null;
if(this.form.all){
ctl=this.form.all[_12c];
if(ctl&&ctl.length>1){
ctl=ctl[0];
}
}else{
var _12f=this.form.getElementsByTagName("*");
ctl=_12f[_12c];
}
if(ctl){
if(this.deferredControls&&this.deferredControls[_12b.name]){
this.deferredControls[_12b.name]=null;
}
_12b.ctl=ctl;
if(window.name==MAIN_FRAME&&ctl.tabIndex){
this.tabElements[ctl.tabIndex-1]=ctl;
}
var _130=_12c.indexOf(":");
if(_130!=-1){
_12b.dvName=_12c.substring(0,_130);
}else{
_12b.dvName=this.formName;
}
if(!ctl.nxjAttrs){
var stl=ctl.style;
ctl.nxjAttrs=new CtlDesc(_12c,!(stl.visibility=="hidden"),ctl.className,stl.color,stl.backgroundColor,stl.fontFamily,stl.fontSize,stl.fontWeight,stl.fontStyle,stl.textDecoration);
}
ctl.isPastEnd=_12b.isPastEnd;
if(_12b.isPastEnd){
_12b=ctl.nxjAttrs;
}
if(this.namesToComponents&&this.namesToComponents[ctl.id]&&this.namesToComponents[ctl.id].isMenuBar){
_12b.isMenuBar=true;
}
this.applyStyle(ctl,_12b);
if(ctl.tagName=="IFRAME"&&ctl.getAttribute("nxjupload")){
var _132=ctl.contentWindow.uploadMgr;
if(_132&&_132.chooserField){
if(_12a!=ACTION_DO_UPLOAD){
_132.chooserField.disabled=false;
this.applyStyle(_132.chooserField,_12b);
var dv=this.findDataView(ctl);
var _134=false;
if(dv.find){
_134=true;
}
_132.chooserField.disabled=_134;
_132.dvName=dv.name;
ctl.disabled=_134;
}
}
}
if(_12a!=ACTION_DO_UPLOAD){
if(ctl.src&&ctl.src.indexOf("TextBinaryHandler")!=-1){
ctl.src=ctl.src.replace(/htmlElementName=.*(&cacheTimeStamp=[0-9][0-9]*)?/,"htmlElementName="+_12b.name+"&"+CACHE_TIMESTAMP+"="+this.windowCounter);
ctl.origImage=undefined;
}
if(ctl.rolloverimage&&ctl.rolloverimage.indexOf("TextBinaryHandler")!=-1){
ctl.rolloverimage=ctl.rolloverimage;
}
}
}else{
if(this.deferredControls==null){
this.deferredControls=new Object();
}
this.deferredControls[_12b.name]=_12b;
}
}
};
ClientManager.prototype.initDeferredControls=function(){
if(this.deferredControls){
var _135=new Array();
for(var name in this.deferredControls){
var _137=this.deferredControls[name];
if(_137!=null){
_135[_135.length]=_137;
}
}
if(_135.length>0){
this.initControls(_135,ACTION_INPUT);
}
}
};
ClientManager.prototype.enableFileChoosers=function(){
var _138=this.document.getElementsByTagName("IFRAME");
var _139;
for(var idx=0;idx<_138.length;idx++){
_139=_138[idx].contentWindow;
if(_138[idx].getAttribute("nxjupload")&&_139&&_139.uploadMgr){
_139.uploadMgr.chooserField.disabled=false;
}
}
};
function adjustFrameDivMenuPosition(_13b,_13c,_13d){
var _13e=(_13b=="nxj_vertmenu");
if(_13e){
_13d=70;
}
var _13f=_13b.substring(4);
var _140=null;
var _141=this.document.getElementById(_13b+"_div");
if(_141){
_141.style.visibility="";
var _142=this.document.getElementById(_13b);
if(this.isIE){
if(_142&&_142.contentWindow){
var _143=_142.contentWindow;
_143.name=_13f;
if(_143.document.body){
_143.document.body.scroll="no";
_143.document.body.style.border="none";
}
if(_13e){
_140=_142.contentWindow.PREFERRED_COLS;
}else{
_140=_142.contentWindow.PREFERRED_HEIGHT;
}
}
}else{
if(_142&&_142.contentDocument&&_142.contentDocument.defaultView){
_142.contentDocument.defaultView.name=_13f;
_142.contentDocument.body.style.overflow="hidden";
if(_13e){
_140=_142.contentDocument.defaultView.PREFERRED_COLS;
}else{
_140=_142.contentDocument.defaultView.PREFERRED_HEIGHT;
}
}
}
if(_140){
if(_13e){
var _144=parseInt(_140);
_141.style.width=_144;
_142.style.width=_144;
_142.style.height="100%";
_13d=_144;
this.adjustVertMenu();
}else{
var _145=parseInt(_140);
_141.style.height=_145;
_141.style.left=0;
_141.style.width=this.document.body.clientWidth;
_142.style.height=_145;
_142.style.border="none";
if(_13b=="nxj_menu"&&this.isIE){
var diff=_143.document.body.scrollHeight-_145;
if(diff>0&&diff<=4){
_142.style.height=_143.document.body.scrollHeight;
}
}
if(_13b=="nxj_footer"){
_141.style.top=_13c-_145;
}else{
_141.style.top=_13c;
}
_13c+=_145;
}
}
if(_13e){
return _13d;
}else{
return _13c;
}
}
}
function tweakTabs(){
if(window.parent.getNotebook&&!this.doingCommand&&this.focusElement){
var nb=window.parent.getNotebook(this.focusElement);
if(nb){
nb.tweakPage();
}
}
}
function getDataView(_148){
for(var idx=0;this.dataViewDescriptors&&idx<this.dataViewDescriptors.length;idx++){
if(this.dataViewDescriptors[idx].name==_148){
return this.dataViewDescriptors[idx];
}
}
return null;
}
function findDataView(_14a){
var _14b=_14a.parentNode;
var _14c;
while(_14b!=null){
if(_14b.tagName=="FORM"){
return this.dataViewDescriptors[0];
}
if(_14b.tagName=="DIV"&&_14b.id!=null){
for(var idx=1;this.dataViewDescriptors&&idx<this.dataViewDescriptors.length;idx++){
_14c=this.dataViewDescriptors[idx].name+".";
if(_14c==_14b.id){
return this.dataViewDescriptors[idx];
}
}
}
_14b=_14b.parentNode;
}
return null;
}
function orderNotebooks(_14e,_14f,_150){
for(var idx=0;idx<_150.length;idx++){
var _152=_150[idx];
if(!_14e[_152]){
var _153=_14f[_152];
if(_153){
var _154=_153.getElementsByTagName("div");
orderNotebooks(_14e,_154,_150);
_14e[_152]=true;
_14e[_14e.length]=_152;
}
}
}
}
function doAdjustControlPositions(){
var all;
if(this.form.all){
all=this.form.all;
}else{
all=this.form.getElementsByTagName("*");
}
for(var name in all){
var _157=all[name];
var dp=null;
if(_157&&_157.tagName=="DIV"&&this.namesToComponents){
dp=this.namesToComponents[_157.id];
if(dp&&(dp.isDatePicker||dp.isCombo)){
dp.adjustPositions();
}
}
}
}
function firefoxResize(){
if(IS_IE){
return;
}
for(var name in window.namesToComponents){
var comp=window.namesToComponents[name];
if(comp.resize){
comp.resize();
}
}
}
function updateDynamicElements(){
for(var ix=0;ix<this.dynamicAttributes.length;ix++){
var _15c=this.dynamicAttributes[ix];
if(_15c.elementName!=null){
var _15d=this.document.getElementById(_15c.elementName);
if(_15d==null&&this.form){
_15d=this.form.elements[_15c.elementName];
}
if(_15d){
this.dynamicAttributes[_15c.elementName]=_15c;
_15c.htmlElement=_15d;
for(var iix=0;iix<_15c.attrValueList.length;iix+=2){
var _15f=_15c.attrValueList[iix];
var _160=_15c.attrValueList[iix+1];
this.updateDynamicElement(_15d,_15f,_160);
}
}
}
}
}
function updateDynamicElement(_161,_162,_163){
var _164=_161[_162];
if(_164&&_164.search(/<nobr>/i)>=0){
_163="<nobr>"+_163+"</nobr>";
}
if(this.isIE){
_161.setAttribute(_162,_163);
}else{
_161[_162]=_163;
if(_162=="innerHTML"){
var _165=_161.style.display;
_161.style.display="none";
_161.style.display=_165;
}
}
if(_162=="src"){
_161.origImage=undefined;
}
}
function updateFrame(_166,_167){
if(_166!=null){
var e;
try{
var _169=_166.location.pathname+_166.location.search;
if(_169&&_169.length>0){
if(_169.charAt(0)!="/"){
_169="/"+_169;
}
if(_169.indexOf(";")!=-1){
_169=_169.replace(/;jsessionid=[\w]+/,"");
}
if(_169!=_167){
if(PLUMTREE=="Y"){
_166.location.replace(modURl(HOMEURL+_167,6));
}else{
_166.isReady=false;
if(window.dialogArguments){
_166.open(_166.location.protocol+"//"+_166.location.host+_167,_166.name);
}else{
_166.location.replace(_166.location.protocol+"//"+_166.location.host+_167);
}
}
return _166.name;
}
}
}
catch(e){
}
}
return null;
}
function doAccept(){
this.displayValue==null;
if(this.fieldDescriptors.length==0){
return true;
}
var _16a=this.fieldDescriptors[this.currentFieldId];
var _16b=_16a.field;
var _16c=_16a.dataViewName;
var _16d=this.getDataView(_16c);
var _16e=this.getValue(_16b);
var _16f;
var _170=_16a.fieldWidth;
var _171=_16a.type;
if(_171==TYPE_BINARYM||_171==TYPE_TEXTM||_171==TYPE_BINARYF||_171==TYPE_TEXTF){
_170=0;
}
var _172=false;
if(_16b&&_16b.getAttribute("isRichText")){
_172=true;
_170=0;
}
if(_16e==null){
_16e="";
}
if(_170>0&&!_16d.find&&this.validator.trim(_16e).length>_170){
this.messageHandler.alert("FieldWidth");
if(_16b){
var mgr=this;
var _174=function(){
mgr.setFocus(_16b);
};
window.setTimeout(_174,0);
}
return false;
}
if((_16a.flags&_UPDATEABLE)==0){
_16e=this.savedValue;
this.setValue(_16b,_16e);
this.clearedNull=false;
}
var _175=_16a.flags;
if(_16e!=this.savedValue||this.clearedNull||(_16b&&_16b.wasDropped)){
if(_16b&&_16b.wasDropped){
_16b.wasDropped=undefined;
}
if(this.clearedNull){
_16a.flags&=~_SET_NULL;
}
if(_16d.find){
_16f=this.validator.validateFind(_16a,_16e);
if(_16f==null){
if(this.isFieldOnNonCurrentPage(_16a)){
this.makeFieldPageCurrent(_16a);
}
this.setFocus(_16b);
return false;
}
}else{
if(_172){
_16f=_16e;
}else{
_16f=this.validator.validateAndFormat(_16a,_16e);
}
if(_16f==null){
if(this.isFieldOnNonCurrentPage(_16a)){
this.makeFieldPageCurrent(_16a);
}
this.setFocus(_16b);
return false;
}else{
if(_171==TYPE_AMOUNT||_171==TYPE_FLOAT||_171==TYPE_NUMERIC||_171==TYPE_DATE||_171==TYPE_TIME||_171==TYPE_DATETIME){
_16e=this.validator.serverValue;
}
}
this.setValue(_16b,_16f,_16e);
}
if(_16a.caseConversion=="U"){
_16e=_16e.toUpperCase();
_16f=_16f.toUpperCase();
}else{
if(_16a.caseConversion=="L"){
_16e=_16e.toLowerCase();
_16f=_16f.toLowerCase();
}
}
_16a.flags|=_MODIFIED;
_16a.rawValue=_16e;
this.savedValue=_16f;
var _16d=this.getDataView(_16a.dataViewName);
if((_16a.flags&(_REPEATING|_SELSET))!=0){
_16d.currentRowModified=true;
}
if((_16a.flags&_TARGET)!=0&&_16d.recordState=="stored"){
_16d.recordState="stored/modified";
this.updateSystemField(FIELD_RECORD_STATE,this.messageHandler.findMessage(_16d.recordState),true,_16d.name);
}
}
if((_16a.flags&_TRAVERSED)==0||_175!=_16a.flags){
_16a.flags|=_TRAVERSED;
var obj=new Object();
obj.fieldId=this.currentFieldId;
obj.flags=_16a.flags;
this.traversedFields[this.traversedFields.length]=obj;
}
return true;
}
function doClearSystemFields(){
if(this.dataViewDescriptors&&this.dataViewDescriptors.length){
for(var idx=0;idx<this.dataViewDescriptors.length;++idx){
this.updateSystemField(FIELD_FYI_MESSAGE,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_RECORD_COUNT,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_FORM_MODE,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_RECORD_NUMBER,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_RECORD_STATE,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_ZOOM_INDICATOR,"",true,this.dataViewDescriptors[idx].name);
this.updateSystemField(FIELD_USER_INFO,"",true,this.dataViewDescriptors[idx].name);
for(fieldName in this.userInfo){
this.updateSystemField(this.userInfo[fieldName],"",true,this.dataViewDescriptors[idx].name);
}
}
}
}
function nxjdbl(obj){
if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK){
return window.parent.clientManager.dblclickcmd(obj);
}
return false;
}
function dblclickcmd(obj){
if(!obj.dblcmd){
var _17a=new Object();
_17a.name=obj.getAttribute("nxj_dblclick");
var _17b=obj.getAttribute("nxj_dblclick_dv");
if(_17b){
_17a.name=_17b+":"+_17a.name;
}
_17a.id=(obj.id?obj.id:obj.name);
_17a.parentNode=obj;
obj.dblcmd=_17a;
}
this.doCommand(obj.dblcmd);
return true;
}
function doCommand(obj){
if(obj&&obj.tagName=="A"&&obj.disabled){
return false;
}
var _17d=0;
var _17e=null;
var _17f=null;
var _180=1;
var _181=null;
var _182=this.childWindow!=null&&!this.childWindow.closed;
var _183=obj.name;
if(_183.indexOf("javascript:")==0){
_183=_183.substring(11);
if(this.useFrameset&&_183.indexOf("window.parent")!=0){
_183="window.parent.mainFrame."+_183;
}
eval(_183);
return;
}
var _184="";
var _185=this.fieldDescriptors[this.currentFieldId];
if(_185){
_184=_185.name;
_181=this.getDataView(_185.dataViewName);
}
if(obj.fromViewGrid&&obj.id.indexOf("_FXGRID")!=-1){
var _186=obj.id.indexOf("_FXGRID");
dvName=obj.id.substring(0,_186);
_181=this.getDataView(dvName);
}
_183=this.getCommandRelativeTo(obj,_184);
if(this.commandStates[_183]==null){
_183=getUpperCommand(_183);
}
if(_181){
_180=_181.currentRow;
_17f=_181;
}
if(this.fieldDescriptors.length>0){
if(_183.indexOf("COFGR")!=-1){
_17d=this.currentFieldId;
var _187=this.findDataView(obj);
if(_17f!=_187){
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_187.name){
_17d=idx;
break;
}
}
}
if(_181.repOpt==REP_LIST){
if(_181.findCount==0){
this.focusType=_CLICK;
var _18a=_187.currentRow;
this.setListboxSelection(_187,obj.targetRow,true);
return;
}
}
_180=obj.targetRow;
_183=CMD_CLICK_ON_FIELD;
}else{
if(_181.grid&&(_185.flags&_REPEATING)&&this.commandStates[_183]){
var grid=_181.grid;
var _18c=_183;
var _18d=_18c.lastIndexOf(":");
if(_18d!=-1){
_18c=_18c.substring(_18d+1);
}
if(_18c=="PREVIOUS_RECORD"&&grid.editRow>0){
if(!grid.stopEditingCell()){
return;
}
grid.startEditingCell(grid.editRow-1,grid.editCol);
return;
}else{
if(_18c=="PREVIOUS_RECORD"&&grid.onPreviousRecord!=null&&grid.stopEditingCell()){
grid.onPreviousRecord(this,grid.dataView);
return;
}else{
if(_18c=="NEXT_RECORD"&&grid.editRow<grid.cells.length-1){
if(!grid.stopEditingCell()){
return;
}
grid.startEditingCell(grid.editRow+1,grid.editCol);
return;
}else{
if(_18c=="NEXT_RECORD"&&grid.onNextRecord!=null&&grid.stopEditingCell()){
grid.onNextRecord(this,grid.dataView);
return;
}
}
}
}
}
}
}
if(obj.id&&_181&&!_181.find){
var _18e=this.findDataView(obj);
if(_18e&&(_18e.repOpt==REP_FIELDS||_18e.grid)&&_18e.nrows>1){
var dot=obj.id.lastIndexOf(".");
if(dot!=-1){
var row=obj.id.substr(dot+1);
var _191=false;
if(row.length==0){
row=0;
var _192=this.document.getElementById(obj.id+"0");
if(_192){
if(row!=_18e.currentRow){
_191=true;
}
}
}else{
if(!isNaN(row)){
row=parseInt(row)+1;
if(_18e.grid){
row--;
if(_18e.grid.editCol!=-1&&!_18e.grid.stopEditingCell()){
return;
}
if(_18e.findCount>0){
var bdv=_18e;
var _194=Math.floor(bdv.currentRow/bdv.findCount);
if(_194>0){
row+=_194*bdv.findCount;
}
}
}
if(row!=_18e.currentRow){
_191=true;
}
}
}
if(_191){
if(!this.accept()){
this.setFocus(_185.field);
return;
}
if(_17f.currentRowModified&&!_17f.isImmediate&&!_17f.hasNextOrPrev&&!_17f.isBatch){
var cmd="ADD_UPDATE";
if(_17f.name!=this.formName){
cmd=_17f.name+":"+cmd;
}
if(this.commandStates[cmd]&&window.confirm(this.messageHandler.findMessage("SAVE_CHANGE"))){
var _196=getAbsoluteRow(_181,row)+1;
cmd+="|"+_196;
this.doCommandInternal(cmd,0,_180,_183,obj.id);
return;
}
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if((desc.flags&(_REPEATING|_SELSET))!=0&&desc.field!=null){
desc.flags=desc.flags&~(_TRAVERSED|_MODIFIED);
}
}
_17f.currentRowModified=false;
this.cleanupTraversedFields();
}
_180=row;
_17e=_183;
_183=CMD_CLICK_ON_FIELD;
_17d=this.currentFieldId;
if(_18e!=_181){
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_18e.name){
_17d=idx;
break;
}
}
}
}
}
}
}
if(obj.fromViewGrid&&_181&&_181.grid&&_181.grid.isViewGrid){
_180=obj.commandArg;
_17e=obj.name;
_183=CMD_CLICK_ON_FIELD;
obj.id=null;
if(typeof (_180)=="string"&&_180.indexOf("Forms.")==0){
obj.id=_180;
_180=_181!=null?_181.currentRow:0;
}
if(_181&&this.fieldDescriptors){
for(idx=0;idx<this.fieldDescriptors.length;idx++){
desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_181.name){
_17d=idx;
break;
}
}
}
}
if(obj.name=="NXJ_TREE_CMD"||(this.commandStates[_183]==true&&!_182)){
this.focusType=NATURAL_ORDER_TAB;
var _197=obj.id;
if(_197&&obj.window&&obj.window.name!="mainFrame"&&obj.window.name!="command"){
var _198=obj.getAttribute("command_parameter");
if(!_198){
_197=null;
}else{
var win=obj.window.name;
_197="frame[";
if(win=="menu"||win=="vertmenu"){
_197+="toolbar";
}else{
_197+=win;
}
_197+="]"+_198;
}
}
if(_197&&(_197=="<parent>:NEXT_SET"||_197=="<parent>:PREVIOUS_SET")){
_197=null;
}
if(obj&&obj.getAttribute){
var _19a=obj.getAttribute("jscmd");
if(_19a){
if(this.useFrameset&&_19a.indexOf("window.parent.mainFrame.")!=0){
_19a="window.parent.mainFrame."+_19a;
}
if(eval(_19a)==false){
return;
}
}
}
this.doCommandInternal(_183,_17d,_180,_17e,_197);
}
}
function doCommandInternal(name,_19c,_19d,_19e,_19f){
if(this.doingCommand||(this.showingWindow&&name!="unify.closeWindow")){
return;
}
var _1a0=this.formName;
var _1a1=name;
var _1a2=name.lastIndexOf(":");
if(_1a2!=-1){
_1a1=name.substring(_1a2+1);
_1a0=name.substring(0,_1a2);
}else{
if(this.fieldDescriptors&&this.fieldDescriptors.length){
var _1a3=this.fieldDescriptors[this.currentFieldId].dataViewName;
var _1a4=this.getDataView(_1a3);
if((_1a4&&_1a4.grid&&_1a4.grid.isViewGrid)||name==CMD_CLICK_ON_FIELD||name=="EDIT"||name.indexOf("COMPOSE")==0||(name=="PREVIOUS_FORM"&&this.isZoom)){
_1a0=_1a3;
}
}
}
if(_1a1==CMD_FORM_CHOSEN&&_19c==-1){
if(this.fieldDescriptors.length!=0){
return;
}
}
if(_1a1==SET_NULL_COMMAND){
if(this.fieldDescriptors.length!=0){
var desc=this.fieldDescriptors[this.currentFieldId];
if((desc.flags&_UPDATEABLE)!=0){
var _1a6=(desc.flags&_SET_NULL)!=0;
desc.flags|=_SET_NULL;
if((desc.flags&_TRAVERSED)==0||!_1a6){
desc.flags|=_TRAVERSED;
var obj=new Object();
obj.fieldId=this.currentFieldId;
obj.flags=desc.flags;
this.traversedFields[this.traversedFields.length]=obj;
}
this.setValue(desc.field,this.validator.validateAndFormat(desc,""));
}
}
return;
}
if(_1a1==HELP_COMMAND){
if(this.fieldDescriptors.length!=0){
var desc=this.fieldDescriptors[this.currentFieldId];
if(desc.helpURL!=null){
window.open(modURL(desc.helpURL,19),"unifyHelp");
}
}
return;
}
var _1a8=null;
var _1a9=null;
var _1aa=REP_FIELDS;
if(this.dataViewDescriptors&&this.dataViewDescriptors.length){
_1a8=this.dataViewDescriptors[0];
if(_1a8.isBatch&&_1a8.rowState){
_1a9=_1a8;
}
var _1ab=0;
for(var idx=1;idx<this.dataViewDescriptors.length;idx++){
var dv=this.dataViewDescriptors[idx];
if(_1a0.indexOf(dv.name)==0){
if(dv.name.length>_1ab){
_1a8=dv;
_1ab=dv.name.length;
}
if(dv.isBatch&&dv.rowState){
_1a9=dv;
}
}
}
_1aa=_1a8.repOpt;
}
if(this.fieldDescriptors.length!=0){
var desc=this.fieldDescriptors[this.currentFieldId];
if(_1a1=="DEFAULT_COMMAND"&&_1a8.defCmdObj){
name=this.getCommandRelativeTo(_1a8.defCmdObj,desc.name);
if(!this.commandStates[name]){
name=getUpperCommand(name);
if(!this.commandStates[name]){
return;
}
}
_1a1=name;
_1a2=name.lastIndexOf(":");
if(_1a2!=-1){
_1a1=name.substring(_1a2+1);
}
if(_1a1=="NEXT_FIELD"){
this.doNextField();
return;
}else{
if(_1a1=="PREVIOUS_FIELD"){
this.doPrevField();
return;
}
}
}
var _1ae=this.commandActions[name];
if(_1ae==ACCEPT&&_1a8.grid!=null&&_1a8.grid.editCol!=-1&&_1a8.grid.isEditingCell){
var grid=_1a8.grid;
var _1b0=grid.colIndexToColId[grid.editCol];
if(grid.columns[_1b0].fieldId!=desc.name){
grid.cancelEditingCell();
}else{
if(!grid.stopEditingCell()){
return;
}
}
}
if(_1ae==ACCEPT&&_1a4&&_1a4!=_1a8&&_1a4.grid&&_1a4.grid.editCol!=-1&&_1a4.grid.isEditingCell){
var grid=_1a4.grid;
var _1b0=grid.colIndexToColId[grid.editCol];
if(grid.columns[_1b0].fieldId!=desc.name){
grid.cancelEditingCell();
}else{
if(!grid.stopEditingCell()){
return;
}
}
}
if(_1ae==ACCEPT&&!this.accept()){
this.skipAcceptOnFocus=true;
return;
}else{
if(_1ae==SUSPEND){
var _1b1=this.getValue(desc.field);
var _1b2=desc.flags;
if(_1b1!=this.savedValue){
desc.flags|=_MODIFIED;
desc.rawValue=_1b1;
}
if((desc.flags&_TRAVERSED)==0||_1b2!=desc.flags){
desc.flags|=_TRAVERSED;
var obj=new Object();
obj.fieldId=this.currentFieldId;
obj.flags=desc.flags;
this.traversedFields[this.traversedFields.length]=obj;
}
}else{
if(_1ae!=ACCEPT){
desc.editReset=true;
}
}
}
}
if(_1a8==null){
return;
}
if(_1a1==CLEAR_FIELD_COMMAND){
if(desc&&desc.field){
if(_1a8.find&&desc.field.tagName=="INPUT"&&desc.field.type=="checkbox"){
desc.field.indeterminate=true;
desc.flags|=_MODIFIED;
if(!this.isIE){
desc.field.checked=true;
var _1b3=" disabledImage";
if(desc.field.className.indexOf(_1b3)==-1){
desc.field.className+=_1b3;
}
}
}else{
this.setValue(desc.field,"");
}
}
return;
}
var _1b4=false;
var _1b5=null;
if(_1a8&&_1a8.grid&&_1a8.grid.isViewGrid&&typeof (_1a8.grid.getCurrentRecord())!="undefined"){
var row=_1a8.grid.getCurrentRecord();
if(typeof (row.mgrRowId)!="undefined"){
_19d=row.mgrRowId;
_1b4=true;
}
_1b5=_1a8.grid.getCheckedMgrRowIds();
}
if(_1aa==REP_LIST&&_1a8.isBatch&&(_1a8==_1a9||_1a9==null)&&(_1a1=="NEXT_RECORD"||_1a1=="PREVIOUS_RECORD")){
var _1b7=1;
if(_1a1=="PREVIOUS_RECORD"){
_1b7=-1;
}
if(_1a8.findCount==0){
this.setListboxSelection(_1a8,_1a8.currentRow+_1b7,true,name,desc);
return;
}else{
var _1b8=_1a8.currentRow%_1a8.findCount;
if((_1a1=="PREVIOUS_RECORD"&&_1b8!=0)||(_1a1=="NEXT_RECORD"&&_1b8<_1a8.findCount-1)){
this.setListboxSelection(_1a8,_1b8+_1b7,true,name,desc);
return;
}
}
}
if(_1a8.v8nCmds){
var _1b9=this.form.elements["validation_error."];
if(_1b9){
_1b9.value="";
}
var _1ba=_1a1;
if(_1ba==CMD_CLICK_ON_FIELD){
if(_19d<_1a8.currentRow){
_1ba="PREVIOUS_RECORD";
}else{
if(_19d>_1a8.currentRow){
_1ba="NEXT_RECORD";
}else{
if(this.doingImmediate){
_1ba="IMMEDIATE";
this.doingImmediate=false;
}
}
}
}
for(vidx=0;vidx<_1a8.v8nCmds.length;vidx++){
if(_1ba==_1a8.v8nCmds[vidx]||getUpperCommand(_1ba)==_1a8.v8nCmds[vidx]){
this.checkV8n=checkV8n;
var _1bb=this.checkV8n(_1a8,true);
if(_1bb){
var msg=this.messageHandler.findMessage("RequiredFieldMissing");
if(_1b9){
_1b9.value=msg;
}else{
window.alert(msg);
}
this.setFocus(_1bb);
return;
}
_1bb=this.checkV8n(_1a8,false);
if(_1bb){
this.setFocus(_1bb);
return;
}
break;
}
}
}
if(_1a1!="PREVIOUS_FORM_REFRESH"&&_1aa==REP_LIST&&!_1a8.isImmediate&&(!_1a8.hasNextOrPrev||!_1a8.currentRowModified)){
var _1bd=this.findRepeatingArea(_1a8);
var _1be=_1bd==null?1:parseInt(_1bd.getAttribute("size"));
if(_1a8.grid&&_1a8.grid.editCol!=-1&&!_1a8.grid.isViewGrid){
var grid=_1a8.grid;
var _1b0=grid.colIndexToColId[grid.editCol];
if(grid.columns[_1b0].fieldId!=desc.name){
grid.cancelEditingCell();
}else{
if(!grid.stopEditingCell()){
return;
}
}
var _1bf=_1a8.currentRowModified;
var _1c0=_1a8.currentRow;
_1be=_1a8.grid.getRowCount();
}
var _1b8=_1a8.currentRow;
if(_1a8.findCount>0){
_1b8=_1a8.currentRow%_1a8.findCount;
}
var _1c1=false;
if(_1bd==null&&_1a8.grid==null){
}else{
if(_1a1=="FIRST_RECORD"&&_1a8.findCount==0){
if(_1a8.selset.length>0){
this.setListboxSelection(_1a8,0,true);
}
_1c1=true;
}else{
if(_1a1=="LAST_RECORD"&&_1a8.findCount==0){
this.setListboxSelection(_1a8,_1a8.selset.length-1,true);
_1c1=true;
}else{
if(_1a1=="NEXT_RECORD"&&_1b8+1<_1a8.selset.length&&!_1a8.grid){
if(_1a8.selset.length>0){
this.setListboxSelection(_1a8,_1b8+1);
}
_1c1=true;
}else{
if(_1a1=="NEXT_SET"&&_1a8.findCount==0){
this.setListboxSelection(_1a8,_1a8.currentRow+_1be<_1a8.selset.length?_1a8.currentRow+_1be:_1a8.selset.length-1,true);
_1c1=true;
}else{
if(_1a1=="PREVIOUS_RECORD"&&_1b8>0&&!_1a8.grid){
if(_1a8.selset.length>0){
this.setListboxSelection(_1a8,_1b8-1);
}
_1c1=true;
}else{
if(_1a1=="PREVIOUS_SET"&&_1a8.findCount==0){
this.setListboxSelection(_1a8,_1a8.currentRow>=_1be?_1a8.currentRow-_1be:0,true);
_1c1=true;
}
}
}
}
}
}
}
if(_1c1){
if(_1a8.grid){
if(_1bf&&!_1a8.isBatch&&!this.doingCommand){
var sid=_1a8.grid.rowIds[_1c0];
var _1c3=_1a8.selset[_1c0];
var _1c4=this.removeNonRepeatingValues(_1a8,_1c3,_1c0);
_1a8.grid.setRowValues(sid,_1c4);
}
this.setFocus(desc.field);
}
return;
}
}
if(_1aa==REP_FIELDS&&((_1a8.isBatch&&(_1a8==_1a9||_1a9==null))||(!_1a8.isImmediate&&(!_1a8.hasNextOrPrev||!_1a8.currentRowModified)))&&_1a8.nrows>1&&((_1a1=="NEXT_RECORD"&&_1a8.currentRow<_1a8.nrows-1&&_1a8.realRow<_1a8.lastRow-1)||(_1a1=="PREVIOUS_RECORD"&&_1a8.currentRow!=0))){
var _1c5=(_1a1=="NEXT_RECORD"?_1a8.currentRow+1:_1a8.currentRow-1);
var _1c6=this.fieldDescriptors[this.currentFieldId];
this.moveRepFieldRecord(_1a8,_1c5,_1c6,name);
return;
}
if(_1aa==REP_FIELDS&&_1a8.nrows>1&&_1a8.currentRowModified&&!_1a8.hasNextOrPrev&&!_1a8.isImmediate&&!_1a8.isBatch&&(_1a1=="NEXT_SET"||_1a1=="PREVIOUS_RECORD"||_1a1=="NEXT_RECORD"||_1a1=="PREVIOUS_SET"||_1a1=="FIRST_RECORD"||_1a1=="LAST_RECORD")){
var cmd="ADD_UPDATE";
if(_1a8.name!=this.formName){
cmd=_1a8.name+":"+cmd;
}
if(this.commandStates[cmd]&&window.confirm(this.messageHandler.findMessage("SAVE_CHANGE"))){
var _1c5;
if(_1a1=="NEXT_RECORD"){
_1c5=_1a8.realRow+1;
}else{
if(_1a1=="PREVIOUS_RECORD"){
_1c5=_1a8.realRow-1;
}else{
if(_1a1=="NEXT_SET"){
_1c5=Math.floor(_1a8.realRow/_1a8.nrows)*_1a8.nrows+_1a8.nrows;
}else{
if(_1a1=="PREVIOUS_SET"){
_1c5=Math.floor(_1a8.realRow/_1a8.nrows)*_1a8.nrows-_1a8.nrows;
}else{
if(_1a1=="FIRST_RECORD"){
_1c5=0;
}else{
if(_1a1=="LAST_RECORD"){
_1c5=_1a8.lastRow;
}
}
}
}
}
}
_1c5=getAbsoluteRow(_1a8,_1c5)+1;
cmd+="|"+_1c5;
this.doCommandInternal(cmd,0,_1a8.currentRow);
return;
}
}
this.eventsOK=false;
if(_1aa==REP_LIST){
var _1bd=this.findRepeatingArea(_1a8);
var _1be=_1bd==null?1:parseInt(_1bd.getAttribute("size"));
if(_1a8.grid&&(_1a1=="NEXT_RECORD"||_1a1=="PREVIOUS_RECORD")){
_1be=_1a8.grid.getRowCount();
if(_1a8.findCount>0){
if(_1a1=="NEXT_RECORD"){
var _1c8=_1a8.grid.selectedRow+1;
if(_1c8>=_1a8.grid.cells.length){
var _1c9=Math.floor(_1a8.currentRow/_1a8.findCount);
_19d=(_1c9+1)*_1a8.findCount;
name=CMD_CLICK_ON_FIELD;
}
}else{
if(_1a1=="PREVIOUS_RECORD"){
var _1c8=_1a8.grid.selectedRow-1;
if(_1c8<0){
var _1c9=Math.floor(_1a8.currentRow/_1a8.findCount);
if(_1c9>0){
_19d=_1c9*_1a8.findCount-1;
name=CMD_CLICK_ON_FIELD;
}
}
}
}
}
}else{
if(_1a1=="FIRST_RECORD"||_1a1=="LAST_RECORD"||_1a1=="NEXT_RECORD"||_1a1=="NEXT_SET"||_1a1=="PREVIOUS_RECORD"||_1a1=="PREVIOUS_SET"){
if(_1a8.currentRowModified&&!_1a8.isImmediate&&!_1a8.hasNextOrPrev&&_1a8.findCount>0){
var _1b8=_1a8.currentRow%_1a8.findCount;
this.onListChangeTo(_1a8,_1b8);
if(this.doingCommand){
return;
}
}
}
}
if(_1be>1){
_1be-=1;
}
if(_1bd!=null){
if(_1a1=="NEXT_SET"){
if(_1a8.findCount==0){
var _1ca=_1a8.currentRow+_1be<_1a8.selset.length?_1a8.currentRow+_1be:_1a8.selset.length-1;
scrollGridIntoView(_1a8,_1bd,_1ca);
}
}else{
if(_1a1=="PREVIOUS_SET"){
if(_1a8.findCount>0){
_1be=_1a8.findCount-1;
}
var _1ca=_1a8.currentRow>=_1be?_1a8.currentRow-_1be:0;
if(_1a8.findCount==0||_1ca==0){
scrollGridIntoView(_1a8,_1bd,_1ca);
}
}else{
if(_1a1=="FIRST_RECORD"){
scrollGridIntoView(_1a8,_1bd,0);
}else{
if(_1a1=="LAST_RECORD"){
scrollGridIntoView(_1a8,_1bd,_1a8.selset.length-1);
}
}
}
}
}
}
var _1cb;
var _1cc;
var _1cd;
if(!this.useFrameset){
_1cd=this.document;
_1cb=null;
}else{
if(this.refreshCommands[_1a1]==true){
_1cd=window.parent.frames.mainFrame.document;
_1cb=_1cd.forms.CommandForm;
if(this.isIE){
var _1ce=_1cd.getElementsByTagName("IFRAME");
var fr;
for(var idx=_1ce.length-1;idx>=0;idx--){
fr=_1ce[idx];
if(fr.getAttribute("nxjupload")){
fr.parentNode.removeChild(fr);
}
}
}
}else{
_1cd=window.parent.frames.command.document;
_1cb=_1cd.forms.CommandForm;
if(!_1cb){
_1cd=window.parent.frames.topcorner.document;
_1cb=_1cd.forms.CommandForm;
if(!_1cb){
this.doingCommand=false;
if(!this.retryCmd){
this.retryCmd=0;
}
if(this.retryCmd++<3){
if(_19e){
_19e="'"+_19e+"'";
}
window.setTimeout("window.parent.clientManager.doCommandInternal('"+name+"',"+_19c+","+_19d+","+_19e+");",0);
return;
}
}
}
}
}
if(this.useFrameset){
_1cc=_1cb.elements;
_1cc["managerId"].value=MANAGER_ID;
_1cc["windowCounter"].value=this.windowCounter;
}else{
var _1d0="managerId="+MANAGER_ID+"&windowCounter="+this.windowCounter;
}
var _1d1=this.currentFieldId;
if(name==CMD_CANCEL_CHILDREN){
_1d1=0;
}
if(name=="PREVIOUS_FORM_REFRESH"){
name="PREVIOUS_FORM";
_1a1="PREVIOUS_FORM";
}
if(_1a1==CMD_CLICK_ON_FIELD&&!_1a8.rowState){
if(_1a8.repOpt==REP_FIELDS||_1a8.grid){
_19d+=":"+_1a8.currentRow;
}else{
_19d+=":"+_1a8.oldCurrentRow;
}
}
if(this.form&&this.form.getAttribute("auto_fill")=="true"){
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.field&&(desc.flags&_REPEATING)==0&&(desc.flags&_TRAVERSED)==0){
var dv=this.getDataView(desc.dataViewName);
if(dv){
var _1d2=(dv.repOpt==REP_FIELDS&&dv.currentRow<desc.values.length)?dv.currentRow:0;
var _1d3=this.getValue(desc.field);
if(_1d3!=desc.values[_1d2]){
setNxjFieldValue(desc.name,_1d3);
}
}
}
}
}
var _1d4=this.traversedFields.length;
if(this.traversedFields.length!=0){
_1d4+="\f";
}
for(var idx=0;idx<this.traversedFields.length;idx++){
var _1d5=this.traversedFields[idx];
var _1d6=_1d5.fieldId;
var _1d7=_1d5.flags;
var desc=this.fieldDescriptors[_1d6];
if((_1d7&(_MODIFIED|_SET_NULL))==0){
_1d4+="T"+"\f"+_1d6;
}else{
if((desc.flags&_SET_NULL)!=0){
_1d4+=(desc.flags&_FORCE)==0?"N":"NF";
_1d4+="\f"+_1d6;
}else{
if((desc.flags&_FORCE)!=0){
_1d4+="F"+"\f"+_1d6+"\f"+desc.rawValue;
}else{
if(desc.field&&desc.field.type=="checkbox"&&desc.field.indeterminate){
desc.rawValue="";
}
_1d4+="M"+"\f"+_1d6+"\f"+desc.rawValue;
}
}
}
if(idx<this.traversedFields.length-1){
_1d4+="\f";
}
}
var _1d8=window.parent.frames[MAIN_FRAME];
if(!this.useFrameset){
_1d8=window;
}
var _1d9=false;
if(_1d8.idToTree&&name!=CMD_LOAD_CMD_FRAME&&name!=CMD_CANCEL_CHILDREN){
_1d4+="\f";
var _1da="";
for(var _1db in _1d8.idToTree){
var _1dc=_1d8.idToTree[_1db];
_1dc.saveState();
if(_1dc.commandInvoked){
name=_1dc.commandInvoked;
_1dc.commandInvoked=null;
_1da+="|";
}
_1da+=_1db+"\f"+_1dc.getSelectedPath()+"\f"+_1dc.getOnExpandPath()+"\f";
_1d4+=_1da;
}
_1d9=true;
}
if(name!=CMD_LOAD_CMD_FRAME&&name!=CMD_CANCEL_CHILDREN&&this.namesToComponents){
for(var _1dd in this.namesToComponents){
var nb=this.namesToComponents[_1dd];
if(nb&&nb.isNotebook&&nb.pages!=null&&nb.selectedIndex!=-1){
var page=nb.pages[nb.selectedIndex];
if(page!=null){
if(!_1d9){
_1d9=true;
_1d4+="\f";
}
_1d4+=_1dd+"\f"+page.id+"\f"+"x"+"\f";
}
}
}
}
if(name!=CMD_CONTINUE&&name!=CMD_AFTER_UPLOAD&&_1a9&&_1ae!=REJECT){
if(this.useFrameset){
_1cb.removeChild(_1cc.focus);
_1cb.removeChild(_1cc.clickedOnField);
_1cb.removeChild(_1cc.commandName);
_1cb.removeChild(_1cc.clickedOnRow);
_1cb.removeChild(_1cc.fieldValues);
}
var _1e0;
var _1e1=_1a8.rowState.length;
_1a9.rowState[_1e1]=new Object();
_1e0=_1a9.rowState[_1e1];
_1e0.focusIdx=_1d1;
_1e0.clickedOnField=_19c;
_1e0.commandName=name;
_1e0.newRow=_19d;
_1e0.currentRow=_1a8.currentRow;
var _1e2=new Array();
for(var idx=0;idx<this.traversedFields.length;idx++){
var _1d5=this.traversedFields[idx];
var _1d6=_1d5.fieldId;
var _1d7=_1d5.flags;
if(!_1e2[_1d6]){
_1e2[_1d6]=new Object();
}
var desc=this.fieldDescriptors[_1d6];
if((desc.flags&_MODIFIED)>0){
_1e2[_1d6].rawValue=desc.rawValue;
}
_1e2[_1d6].flags=desc.flags;
_1e2[_1d6].sortIdx=idx;
}
_1e0.fieldState=_1e2;
var _1e3;
var _1e4=new Object();
var _1e5;
for(var _1e6=_1a9.rowState.length-1;_1e6>=0;_1e6--){
_1e0=_1a9.rowState[_1e6];
if(_1e0){
_1e3=_1e0.fieldState;
if(_1e3){
var _1e7=_1e0.currentRow.toString();
_1e5=_1e4[_1e7];
if(_1e5){
var _1e8=Math.max(_1e5.length,_1e3.length);
for(var _1e9=0;_1e9<_1e8;_1e9++){
if(_1e5[_1e9]){
if(!_1e3[_1e9]||typeof (_1e5[_1e9].rawValue)!="undefined"){
_1e3[_1e9]=_1e5[_1e9];
}
}
}
}
_1e4[_1e7]=_1e3;
}
}
}
var _1ea;
for(var _1e6=0;_1e6<_1a9.rowState.length;_1e6++){
_1e0=_1a9.rowState[_1e6];
if(_1e0){
var fld=_1cd.createElement("INPUT");
fld.type="hidden";
fld.name="focus";
fld.value=_1e0.focusIdx;
if(this.useFrameset){
_1cb.appendChild(fld);
}else{
_1d0+="&"+fld.name+"="+fld.value;
}
fld=_1cd.createElement("INPUT");
fld.type="hidden";
fld.name="clickedOnField";
fld.value=_1e0.clickedOnField;
if(this.useFrameset){
_1cb.appendChild(fld);
}else{
_1d0+="&"+fld.name+"="+fld.value;
}
fld=_1cd.createElement("INPUT");
fld.type="hidden";
fld.name="commandName";
fld.value=_1e0.commandName;
if(this.useFrameset){
_1cb.appendChild(fld);
}else{
_1d0+="&"+fld.name+"="+fld.value;
}
fld=_1cd.createElement("INPUT");
fld.type="hidden";
fld.name="clickedOnRow";
if(_1e0.commandName==CMD_CLICK_ON_FIELD){
fld.value=_1e0.newRow;
fld.value+=":"+_1e0.currentRow;
}else{
fld.value=_1e0.currentRow;
}
if(this.useFrameset){
_1cb.appendChild(fld);
}else{
_1d0+="&"+fld.name+"="+fld.value;
}
var _1ec=new Array();
for(var _1e9=0;_1e9<_1e0.fieldState.length;_1e9++){
_1e3=_1e0.fieldState[_1e9];
if(_1e3){
var _1ed=_1e3.sortIdx;
while(_1ec[_1ed]!=null){
_1ed++;
}
_1ec[_1ed]=_1e3;
_1ec[_1ed].fieldId=_1e9;
}
}
var _1ee=0;
_1ea="\f";
for(var idx=0;idx<_1ec.length;idx++){
_1e3=_1ec[idx];
if(_1e3){
_1e9=_1e3.fieldId;
if((_1e3.flags&_SET_NULL)!=0){
_1ea+=(_1e3.flags&_FORCE)==0?"N":"NF";
_1ea+="\f"+_1e9;
}else{
if((_1e3.flags&_FORCE)!=0){
_1ea+="F"+"\f"+_1e9+"\f"+_1e3.rawValue;
}else{
if(typeof (_1e3.rawValue)!="undefined"){
_1ea+="M"+"\f"+_1e9+"\f"+_1e3.rawValue;
}else{
_1ea+="T"+"\f"+_1e9;
}
}
}
_1ea+="\f";
_1ee++;
}
}
if(_1e6==_1a9.rowState.length-1&&_1da){
_1ea+=_1da;
}
_1ea=_1ee+_1ea;
fld=_1cd.createElement("INPUT");
fld.type="hidden";
fld.name="fieldValues";
fld.value=_1ea;
if(this.useFrameset){
_1cb.appendChild(fld);
}else{
_1d0+="&"+fld.name+"="+encodeURIComponent(fld.value);
}
}
}
}else{
var _1ef=false;
if(name!=CMD_CONTINUE&&name!=CMD_AFTER_UPLOAD&&name!=CMD_CLICK_ON_FIELD&&name!=CMD_LOAD_CMD_FRAME&&this.fieldDescriptors.length&&typeof (this.currentFieldId)!="undefined"){
var dv;
curDvName=this.fieldDescriptors[this.currentFieldId].dataViewName;
for(var _1f0=0;_1f0<this.dataViewDescriptors.length;_1f0++){
dv=this.dataViewDescriptors[_1f0];
if((!dv.isBatch||!dv.rowState)&&dv.name!=curDvName&&!dv.find&&dv.initialRow!=dv.currentRow){
if(!_1ef&&this.useFrameset){
_1cb.removeChild(_1cc.focus);
_1cb.removeChild(_1cc.clickedOnField);
_1cb.removeChild(_1cc.commandName);
_1cb.removeChild(_1cc.clickedOnRow);
_1cb.removeChild(_1cc.fieldValues);
}
_1ef=true;
var _1f1=dv.currentRow;
if(dv.repOpt==REP_FIELDS||dv.grid){
_1f1+=":"+dv.currentRow;
}else{
_1f1+=":"+dv.oldCurrentRow;
}
var _1f2=1;
_1f2+="\f";
var _1f3=0;
var _1f4=false;
for(var idx=this.traversedFields.length-1;idx>=0;idx--){
var _1d5=this.traversedFields[idx];
var _1d6=_1d5.fieldId;
var desc=this.fieldDescriptors[_1d6];
if(desc.dataViewName==dv.name){
_1f2+="T"+"\f"+_1d6;
_1f3=_1d6;
_1f4=true;
break;
}
}
if(!_1f4){
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
desc=this.fieldDescriptors[idx];
if(desc.dataViewName==dv.name){
_1d6=idx;
_1f2+="T"+"\f"+idx;
_1f3=idx;
break;
}
}
}
_1d0=addCommandElements(_1cd,_1cb,_1d6,_1f3,CMD_CLICK_ON_FIELD,_1f1,_1f2,(this.useFrameset?null:_1d0));
}
}
}
if(!_1ef){
if(this.useFrameset){
_1cc["focus"].value=_1d1;
_1cc["clickedOnField"].value=_19c;
_1cc["commandName"].value=name;
_1cc["clickedOnRow"].value=_19d;
_1cc["fieldValues"].value=_1d4;
}else{
_1d0+="&focus="+_1d1+"&clickedOnField="+_19c+"&commandName="+name+"&clickedOnRow="+_19d+"&fieldValues="+encodeURIComponent(_1d4);
}
}else{
_1d0=addCommandElements(_1cd,_1cb,_1d1,_19c,name,_19d,_1d4,(this.useFrameset?null:_1d0));
}
}
if(_19e){
var qCmd=_1cd.createElement("INPUT");
qCmd.type="hidden";
qCmd.name="queueCommand";
qCmd.value=_19e;
if(this.useFrameset){
_1cb.appendChild(qCmd);
}else{
_1d0+="&"+qCmd.name+"="+qCmd.value;
}
}
if(_19f){
var _1f6=_1cd.createElement("INPUT");
_1f6.type="hidden";
_1f6.name="controlId";
_1f6.value=_19f;
if(this.useFrameset){
_1cb.appendChild(_1f6);
}else{
_1d0+="&"+_1f6.name+"="+encodeURIComponent(_1f6.value);
}
}
try{
var _1ce=this.document.getElementsByTagName("IFRAME");
var _1f7;
var _1f8=null;
if(name!=CMD_AFTER_UPLOAD&&name!=CMD_LOAD_CMD_FRAME){
for(var idx=0;idx<_1ce.length;idx++){
_1f7=_1ce[idx].contentWindow;
if(_1ce[idx].getAttribute("nxjupload")&&_1ce[idx].style.visibility!="hidden"&&_1f7&&_1f7.uploadMgr){
_1f7.uploadMgr.chooserField.disabled=true;
if(!_1f8&&_1f7.uploadMgr.chooserField.value){
_1f8=_1cd.createElement("INPUT");
_1f8.type="hidden";
_1f8.name="hasUploads";
_1f8.value="true";
if(this.useFrameset){
_1cb.appendChild(_1f8);
}else{
_1d0+="&"+_1f8.name+"="+_1f8.value;
}
}
}
}
}
}
catch(e){
}
if(_1b4){
_1d0+="&viewselected=1";
}
if(_1b5){
_1d0+="&checked_row_ids="+_1b5;
}
window.parent.cachedDataViewDescriptors=this.dataViewDescriptors;
if(name!=CMD_REFRESH&&name!="PREVIOUS_FORM"){
this.setControlStates(false);
}
var desc=this.fieldDescriptors[this.currentFieldId];
if(!this.refreshCommands[_1a1]&&(_1aa==REP_FIELDS||(desc&&(desc.flags&_REPEATING)==0)||_1a8.hasNextOrPrev||_1a8.isImmediate||_1a8.isBrowsing)){
if(desc&&desc.field){
if(desc.field.blur){
desc.field.blur();
}
if(desc.field.tagName=="DIV"&&this.namesToComponents){
var dp=this.namesToComponents[desc.field.id];
if(dp&&dp.isDatePicker){
dp.text.blur();
}
}
}
}
window.onunload=null;
this.doingCommand=true;
if(typeof (window.parent.promptCounter)=="undefined"){
window.parent.promptCounter=this.windowCounter;
}
if(_1a1!="EXIT_UNLOAD"&&_1a1!=CMD_REFRESH&&_1a1!=CMD_REFRESH_LOCALE&&_1a1!=CMD_REFRESH_FRAMESET&&_1a1!=CMD_AFTER_UPLOAD&&_1a1!=CMD_RELOAD&&_1a1!=CMD_LOAD_CMD_FRAME&&_1a1!=CMD_CONTINUE){
window.parent.promptCounter=this.windowCounter+1;
this.updatePrompt(window.parent.promptCounter);
if(this.progressDialogDelay>=0&&_1a1!="EXIT"&&_1a1!="PREVIOUS_FORM"&&_1a1!=CMD_CONTINUE&&_1f8==null){
this.loading=true;
this.checkUpload=checkUpload;
window.setTimeout("if(window.parent.clientManager.checkUpload)"+"window.parent.clientManager.checkUpload()",this.progressDialogDelay);
}
this.document.body.style.cursor="progress";
var _1fa=this.document.getElementsByTagName("FIELDSET");
for(var idx=0;idx<_1fa.length;idx++){
_1fa[idx].style.cursor="progress";
}
}
if(this.useFrameset){
pc=_1cd.createElement("INPUT");
pc.type="hidden";
pc.name="promptCounter";
_1cb.appendChild(pc);
pc.value=window.parent.promptCounter;
}
window.parent.mainManager.wasClickOnField=(this.focusType==_CLICK)&&this.form.getAttribute("select_on_click")!="true";
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
var dv=this.dataViewDescriptors[idx];
if(dv.selset!=null){
dv.atEnd=dv.currentRow==dv.selset.length-1;
}
}
if(this.useFrameset){
_1cb.method="post";
_1cb.submit();
return;
}
var _1fb=window.location.pathname;
if(_1fb.substring(0,1)!="/"){
_1fb="/"+_1fb;
}
var _1fc=_1fb.lastIndexOf("/");
_1fb=_1fb.substring(0,_1fc+1);
var url=_1fb+"UnifyNXJ.jsp?";
_1d0+="&target=command&promptCounter="+window.parent.promptCounter;
this.makeAjaxRequest(url,{"method":"POST","parameters":_1d0,"onComplete":handleCommandResponse});
}
function handleCommandResponse(_1fe){
window.isCommand=true;
var _1ff=_1fe.responseText;
if(IS_IE){
if(window.parent.clientManager&&window.parent.clientManager.loading){
window.parent.loadingMgr=window.parent.clientManager;
}
var _200=document.getElementById("nxj_command");
if(_200){
_200.text=_1ff;
window.setTimeout("window.nxjOnLoad();",0);
}
}else{
eval(_1ff+";window.onload=nxjOnLoad;window.setTimeout('window.onload()',0);");
}
}
function addCommandElements(_201,_202,_203,_204,_205,_206,_207,_208){
if(_208){
_208+="&focus="+_203+"&clickedOnField="+_204+"&commandName="+_205+"&clickedOnRow="+_206+"&fieldValues="+encodeURIComponent(_207);
return _208;
}
var fld=_201.createElement("INPUT");
fld.type="hidden";
fld.name="focus";
fld.value=_203;
_202.appendChild(fld);
fld=_201.createElement("INPUT");
fld.type="hidden";
fld.name="clickedOnField";
fld.value=_204;
_202.appendChild(fld);
fld=_201.createElement("INPUT");
fld.type="hidden";
fld.name="commandName";
fld.value=_205;
_202.appendChild(fld);
fld=_201.createElement("INPUT");
fld.type="hidden";
fld.name="clickedOnRow";
fld.value=_206;
_202.appendChild(fld);
fld=_201.createElement("INPUT");
fld.type="hidden";
fld.name="fieldValues";
fld.value=_207;
_202.appendChild(fld);
}
function checkV8n(_20a,_20b){
var _20c;
var _20d;
var _20e=null;
var _20f;
var _210;
for(idx=0;idx<this.fieldDescriptors.length;idx++){
_20c=this.fieldDescriptors[idx];
if(_20c.dataViewName==_20a.name&&((_20b&&_20c.field.getAttribute("reqcmd"))||(!_20b&&_20c.field.getAttribute("v8nrules")))){
if(this.isFieldOnUnavailablePage(_20c)){
continue;
}
_20f=false;
if(_20a.grid&&(_20c.flags&_REPEATING)!=0){
_20f=true;
var grid=_20a.grid;
var _212;
if(_20a.findCount>0&&_20a.currentRow>=_20a.findCount){
_212=_20a.currentRow%_20a.findCount;
}else{
_212=_20a.currentRow;
}
var _213=grid.rowIds[_212];
var _214=grid.nameToColumnId(_20c.name);
var _215=grid.rowIdToIndex[_213];
var _216=grid.colIdToIndex[_214];
_20d=grid.cells[_215][_216];
}else{
if(_20c.field.tagName=="SELECT"){
_20d=_20c.field.parentNode;
}else{
_20d=_20c.field;
}
}
if(!_20d.className&&!this.ieIE){
_20d.className="nxj_errborder";
}
cls=_20d.className;
if(_20b){
_210=(this.getValue(_20c.field)!="");
}else{
var _217=_20c.field.getAttribute("v8nrules").split(";");
var fn;
for(ridx=0;ridx<_217.length;ridx++){
if(window.parent.frames["mainFrame"]){
fn="window.parent.frames['mainFrame']."+_217[ridx];
}else{
fn="window."+_217[ridx];
}
_20c.field[fn]=new Function("return "+fn+"(this)");
_210=_20c.field[fn](_20c.field);
if(!_210){
break;
}
}
}
if(!_210){
if(!_20e){
_20e=_20c.field;
if(this.isFieldOnNonCurrentPage(_20c)){
this.makeFieldPageCurrent(_20c);
}
}
if(cls.indexOf("nxj_errborder")==-1){
_20d.className+=" nxj_errborder";
if(_20f){
_20d.style.border="2px solid "+this.form.errborder;
_20d.nxjInvalid=true;
}
}
if(!_20b){
return _20e;
}
}else{
_20d.className=cls.replace(/\s*nxj_errborder/,"");
}
}
}
return _20e;
}
function handlePromptResponse(_219){
var _21a=_219.responseText;
if(IS_IE){
var _21b=document.getElementById("nxj_prompt");
_21b.text=_21a;
window.getPrompt();
}else{
eval(_21a+";getPrompt();");
}
}
function updatePrompt(_21c,_21d){
var url;
var _21f="managerId="+MANAGER_ID;
_21f+="&target=prompt";
_21f+="&promptCounter="+_21c;
if(!this.useFrameset){
var _220=window.location.pathname;
if(_220.substring(0,1)!="/"){
_220="/"+_220;
}
var _221=_220.lastIndexOf("/");
_220=_220.substring(0,_221+1);
url=_220+"UnifyNXJ.jsp";
if(typeof (_21d)!="undefined"){
_21f+="&result="+_21d;
}
this.makeAjaxRequest(url,{"method":"GET","parameters":_21f,"onComplete":handlePromptResponse,"onError":function ignoreError(){
}});
return;
}
_21f="?"+_21f;
var _222=window.parent.frames["promptFrame"];
if(_222){
if(PLUMTREE=="Y"){
hosturl=HOMECONTEXT+"UnifyNXJ.jsp";
url=modURL(hosturl+_21f,30);
}else{
var _223=_222.location.pathname.replace(/prompt(1)?/,"UnifyNXJ");
url=_222.location.protocol+"//"+_222.location.host+_223+_21f;
}
_222.location.replace(url);
}
}
function moveRepFieldRecord(_224,_225,_226,_227){
var _228=_225-_224.currentRow;
_224.realRow+=_228;
this.onListChangeTo(_224,_224.realRow,_227,_226);
if(this.doingCommand){
return;
}
_224.oldRow=_224.currentRow;
_224.currentRow=_225;
var _229=this.fieldDescriptors[this.currentFieldId];
if(_224.recordState=="not stored"||_224.initModified){
var _22a=this.currentFieldId;
if(_229.dataViewName!=_224.name){
for(fidx=0;fidx<this.fieldDescriptors.length;fidx++){
if(this.fieldDescriptors[fidx].dataViewName==_224.name){
_22a=fidx;
break;
}
}
}
_224.initModified=false;
this.doCommandInternal(CMD_CLICK_ON_FIELD,_22a,_224.currentRow);
return;
}
if(_229.field){
this.hiliteField(_229.field,false);
}
this.SAVE_BACKGROUND_COLOR=null;
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
var _22d=this.getDataView(desc.dataViewName);
if(_22d!=_224){
continue;
}
this.initFieldRows(desc,_224,null);
}
_229=this.fieldDescriptors[this.currentFieldId];
this.savedValue=this.getValue(_229.field);
this.clearedNull=false;
var _22e;
var dot;
var ctl;
for(var idx=0;idx<this.mvControls.length;idx++){
_22e=this.mvControls[idx];
ctlName=_22e.name;
dot=ctlName.lastIndexOf(".");
var row=ctlName.substring(dot+1);
if(row==""){
row=0;
}else{
row=parseInt(row)+1;
}
if(row!=_225){
continue;
}
ctlName=ctlName.substring(0,dot+1);
if(!this.fieldIsInDataView(ctlName,_224.name)){
continue;
}
ctl=null;
if(this.form.all){
ctl=this.form.all[ctlName];
if(ctl&&ctl.length>1){
ctl=ctl[0];
}
}else{
var _232=this.form.getElementsByTagName("*");
ctl=_232[ctlName];
}
if(ctl){
this.applyStyle(ctl,_22e);
if(ctl.src&&ctl.src.indexOf("TextBinaryHandler")!=-1){
var _233=_22e.name;
if(row==0){
_233+="_";
}
ctl.src=ctl.src.replace(/htmlElementName=.*(&cacheTimeStamp=[0-9][0-9]*)?/,"htmlElementName="+_233+"&"+CACHE_TIMESTAMP+"="+this.windowCounter);
ctl.origImage=undefined;
}
}
}
if((this.focusType==_CLICK||(_226.flags&_REPEATING)==0)&&_226.field.blur){
_226.field.blur();
}
if(_226.field.tagName=="INPUT"&&(_226.field.type=="checkbox"||_226.field.type=="radio")&&this.focusType==_CLICK){
this.onFocus(_226.field);
}else{
if((_226.flags&_FOCUSABLE)&&_226.field.style.visibility!="hidden"){
if(this.namesToComponents&&this.namesToComponents[_226.name]&&this.namesToComponents[_226.name].isDatePicker){
this.onFocus(_226.field);
}else{
this.setFocus(_226.field,this.focusType==_CLICK||this.isIE);
}
}else{
this.doNextField();
}
}
}
function initFieldRows(desc,_235,_236,_237,_238){
if((desc.flags&_REPEATING)==0){
if(this.diffsOnly&&!desc.changed&&_237&&desc.field){
if(!this.isIE||(desc.field.type!="checkbox"&&desc.field.type!="radio")){
this.nonFocusableElements[desc.name]=((desc.flags&_FOCUSABLE)==0);
return;
}
}
var _239=_236!=null?_236[desc.name]:null;
var row=_235.currentRow;
if((desc.flags&_SELSET)!=0&&_235.selset&&_235.selset.length>row){
value=_235.selset[row][desc.selSetIndex];
}else{
row=(_235.currentRow<desc.values.length)?_235.currentRow:0;
value=desc.values[row];
}
desc.field=this.initField(desc,"",value,_235,_239,_238);
return;
}
var _23b="repeat1.";
if(_235.name!=this.formName){
_23b=_235.name+":"+_23b;
}
var _23c=null;
var _23d=null;
var _23e=null;
var _23f=this.document.getElementById(_23b);
if(_23f==null){
_23b=_23b.replace(/repeat1/,"RepeatingArea1");
_23f=this.document.getElementById(_23b);
}
if(_23f){
_23c=_23f.getAttribute("row_class");
_23d=_23f.getAttribute("altRowClass");
_23e=_23f.getAttribute("selected_row_class");
if(_23c=="row"){
_23c=null;
}
if(_23e=="selected_row"){
_23e=null;
}
}
var row;
var _240=new Array();
if(!_237||(this.diffsOnly&&!desc.changed)){
_240[0]=_235.oldRow;
_240[1]=_235.currentRow;
}else{
for(row=0;row<_235.nrows;row++){
_240[row]=row;
}
}
var _241=false;
for(var idx=0;idx<_240.length;idx++){
row=_240[idx];
var _243;
var _244;
if((desc.flags&_REPEATING)==0){
_243=desc.values[0];
}else{
if(row<desc.values.length){
_243=desc.values[row];
}else{
_243="";
}
}
var _239=_236!=null?_236[desc.name+row]:null;
if(!_239&&_236!=null){
_239=_236[desc.name];
}
_244=this.initField(desc,row,_243,_235,_239,_238);
var _245=_23d;
if((row%2)==0){
_245=_23c;
}
if(row==_235.currentRow){
_245=_23e;
}
if(_245&&_244.className.indexOf(_245)==-1){
_244.className+=" "+_245;
}
if(row==_235.currentRow){
desc.field=_244;
}
var dp=null;
if(_244&&_244.tagName=="DIV"&&this.namesToComponents){
dp=this.namesToComponents[_244.id];
}
if((desc.flags&_REPEATING)!=0&&_244!=null){
if(_244.tagName=="INPUT"&&_244.type=="checkbox"){
_241=true;
}
if(_244.tagName!="SELECT"){
_244.disabled=false;
}
if(dp&&dp.isDatePicker){
dp.button.disabled=false;
dp.text.disabled=false;
}else{
if(_244.type=="radio"){
var _247=this.findFields(_244.name);
for(var fidx=0;fidx<_247.length;fidx++){
_247[fidx].disabled=false;
}
}
}
if(row==_235.currentRow){
if(_244.tagName=="INPUT"||_244.tagName=="SELECT"){
if(REPEATING_HIGHLIGHT_BACKGROUND_COLOR){
_244.style.backgroundColor=REPEATING_HIGHLIGHT_BACKGROUND_COLOR;
}
if(REPEATING_HIGHLIGHT_COLOR){
_244.style.color=REPEATING_HIGHLIGHT_COLOR;
}
}
}else{
if(_235.find||(_235.lastRelativeRow!=-1&&row>_235.lastRelativeRow)){
_244.disabled=true;
if(dp&&dp.isDatePicker){
dp.button.disabled=true;
dp.text.disabled=true;
}else{
if(_244.type=="radio"){
var _247=this.findFields(_244.name);
for(var fidx=0;fidx<_247.length;fidx++){
_247[fidx].disabled=true;
}
}
}
}
}
}
}
if(_241&&this.isIE&&((!_237&&!_235.isBatch)||(this.diffsOnly&&!desc.changed))){
var name;
for(row=0;row<_235.nrows;row++){
if(row==0){
name=desc.name;
}else{
name=desc.name+(row-1).toString();
}
_247=this.findFields(name);
if(_247&&_247.length){
_244=_247[0];
if((desc.flags&_FOCUSABLE)==0||(desc.flags&_UPDATEABLE)==0){
_244.onclick=new Function("if(window.parent.clientManager!=null)"+"{try{return window.parent.clientManager.denyOnClick(this,'"+_243+"');}catch(e){}}"+"return false;");
}else{
_244.onclick=new Function("if(window.parent.clientManager!=null)"+"{try{return window.parent.clientManager.onClick(this,"+desc.flags+");}catch(e){}}"+"return false;");
}
}
}
}
}
function doGetValue(_24a){
if(_24a==null){
return "";
}
if(_24a.tagName=="INPUT"){
if(_24a.type=="checkbox"){
var _24b=this.validator.true_format;
var _24c=this.validator.false_format;
var _24d=_24a.name;
var dot=_24d.lastIndexOf(".");
if(dot!=-1){
_24d=_24d.substr(0,dot+1);
}
var _24f=this.findName(_24d);
if(_24f!=undefined){
var desc=this.fieldDescriptors[_24f];
if(desc.checkboxStoreFormat&&desc.type!=TYPE_BOOL){
var _251=desc.checkboxStoreFormat.split("/");
if(_251.length>0){
_24b=_251[0];
}
if(_251.length>1){
_24c=_251[1];
}
}
}
return _24a.checked?_24b:_24c;
}else{
if(_24a.type=="radio"){
var _252=this.findFields(_24a.name);
for(var idx=0;idx<_252.length;idx++){
if(_252[idx].checked){
return _252[idx].value;
}
}
return "";
}else{
if(this.namesToComponents&&this.namesToComponents[_24a.name]&&this.namesToComponents[_24a.name].isCombo){
var _254=this.namesToComponents[_24a.name];
if(_254.div.getValue){
return _254.div.getValue();
}
}
return _24a.value;
}
}
}else{
if(_24a.tagName=="SELECT"){
if(_24a.multiple){
var _255="";
for(var idx=0;idx<_24a.options.length;idx++){
if(_24a.options[idx].selected){
if(_255!=""){
_255+=";";
}
_255+=_24a.options[idx].value;
}
}
return _255;
}else{
var sel=_24a.selectedIndex;
if(sel==-1){
return "";
}
return _24a.options[sel].value;
}
}else{
if(_24a.tagName=="TEXTAREA"){
return _24a.value;
}else{
if(_24a.tagName=="DIV"&&_24a.getValue){
return _24a.getValue();
}else{
if(_24a.tagName=="DIV"){
if(this.isIE){
return _24a.innerText;
}else{
return _24a.innerHTML;
}
}else{
return _24a.innerHTML;
}
}
}
}
}
}
function doFindFields(name,_258,desc){
var _25a=this.form.elements[name];
if(_25a==null&&this.document.all!=null){
_25a=this.document.all[name];
}
if(_25a==null){
return new Array(this.document.getElementById(name));
}else{
if(_25a.tagName!=null){
if(_25a.tagName=="DIV"&&this.namesToComponents&&this.namesToComponents[_25a.id]&&this.namesToComponents[_25a.id].isCombo){
if((_258&&!_258.grid)||(desc&&(desc.flags&_REPEATING)==0)){
this.namesToComponents[_25a.id].text.name=_25a.id;
this.namesToComponents[_25a.id].text.tabIndex=_25a.tabIndex;
_25a=this.namesToComponents[_25a.id].text;
}
}
return new Array(_25a);
}else{
return _25a;
}
}
}
function doFindFieldInFrame(_25b,name){
if(this.isIE){
return _25b.document.all[name];
}else{
if(_25b.document){
var doc=_25b.document;
var _25e=doc.forms;
for(var idx=0;idx<_25e.length;idx++){
var form=_25e[idx];
var _261=form.elements[name];
if(_261!=null){
return _261;
}
}
}
}
return null;
}
function setEventCode(_262,_263,_264,_265,_266){
var _267=false;
var _268="_nxj"+_263+"set";
if(_262[_263]&&!_262.getAttribute(_268)){
var _269;
var _26a=_264;
try{
_269=_262[_263].toString();
}
catch(e){
_269=_264;
_266=true;
}
if(!this.isIE){
_269=_269.replace(/[\s\n]/g,"");
_26a=_26a.replace(/[\s\n]/g,"");
}
if(_269.indexOf(_26a)==-1){
if(_262[_263].toString().substr(0,20)=="function anonymous()"){
_264=_264+"\n"+_262[_263].toString().substr(21);
}else{
if(!this.isIE&&_269.indexOf("function"+_263+"(event)")!=-1){
var re=new RegExp("function\\s+"+_263+"\\(event\\)");
_264=_264+"\n"+_262[_263].toString().replace(re,"");
}else{
_264=_264+"\n"+_262[_263].toString();
}
}
_264="{\n\t"+_264+"\n}";
_267=true;
}
}
if(!_262[_263]||_267||_266){
_262.setAttribute(_268,true);
if(_265){
_262[_263]=new Function("event",_264);
}else{
_262[_263]=new Function(_264);
}
}
}
function applyStyle(_26c,_26d,_26e){
if(_26e&&_26e.grid){
var key=_26c.id?_26c.id:_26c.name;
var desc;
var id=this.findName(key);
if(id!=null){
desc=this.fieldDescriptors[id];
}
if(desc&&(desc.flags&_REPEATING)!=0){
var _272=function(){
return _26e.grid.setStyleInfo(key,desc.attrs);
};
window.setTimeout(_272,0);
return;
}
}
if(this.isIE&&!_26d.isVisible&&_26c==this.document.activeElement&&_26c.tagName=="SELECT"){
this.forceFocus=forceFocus;
window.setTimeout("if(window.parent.clientManager&&window.parent.clientManager.eventsOK)"+"{window.parent.clientManager.forceFocus();}",0);
}
var _273=_26c.style.visibility;
_26c.style.visibility=_26d.isVisible?"visible":"hidden";
if((_26d.isVisible&&_273=="hidden")||(!_26d.isVisible&&_273!="hidden")){
_26c.parentNode.style.zIndex=_26d.isVisible?1:0;
}
if(!_26d.isMenuBar){
_26c.className=_26d.styleClass;
}
if((_26c.tagName=="A"||_26c.tagName=="IMG")&&_26d.dvName){
dv=this.getDataView(_26d.dvName);
if(dv&&dv.grid){
for(var col=0;col<this.cellDescriptors.length;col++){
var _275=this.cellDescriptors[col];
if(_275.name==_26c.id){
var _272=function(){
var dv=window.parent.clientManager.getDataView(_26d.dvName);
return dv.grid.setStyleInfo(_26c.id,new Array(_26d));
};
window.setTimeout(_272,0);
break;
}
}
}
}
if(_26c.tagName=="IMG"){
var _277=_26c.parentNode;
var _278=_26d.fgColor;
var _279=_26d.bgColor;
if(_278>0){
_26c.style.width=_278.toString()+"px";
if(_277.tagName=="DIV"){
_277.style.width=_26c.style.width;
}
}
if(_279>0){
_26c.style.height=_279.toString()+"px";
if(_277.tagName=="DIV"){
_277.style.height=_26c.style.height;
}
}
return;
}
if(typeof (_26d.fgColor)=="number"&&_26d.fgColor==0){
return;
}
_26c.style.color=_26d.fgColor;
_26c.style.backgroundColor=_26d.bgColor;
_26c.style.fontFamily=_26d.fontFamily;
_26c.style.fontSize=_26d.fontSize;
_26c.style.fontWeight=_26d.fontWeight;
_26c.style.fontStyle=_26d.fontStyle;
_26c.style.textDecoration=_26d.textDecoration;
if(_26d.isMenuBar){
this.namesToComponents[_26c.id].updateStyleClass(_26d.styleClass);
}
}
function applyStyleToAll(_27a,_27b){
this.applyStyle(_27a,_27b);
var all=_27a.all;
if(!all){
all=_27a.getElementsByTagName("*");
}
if(all){
for(var idx=0;idx<all.length;idx++){
this.applyStyle(all[idx],_27b);
}
}
}
function forceFocus(){
var _27e="width=100,height=100,left="+window.screen.width;
var win=window.open("about:blank","_blank",_27e);
if(win){
win.close();
}
}
function doInitField(desc,_281,_282,_283,_284,_285){
var name=desc.name+_281;
var row=parseInt(_281);
if(isNaN(row)){
row=0;
}
if(row==0){
name=desc.name;
if((desc.flags&_REPEATING)==0&&_283.repOpt==REP_FIELDS&&(_283.isBatch||((!_283.hasNextOrPrev||!_283.currentRowModified)&&!_283.isImmediate))){
row=_283.currentRow;
}
}else{
var _288=row-1;
name=desc.name+_288.toString();
}
var _289=this.findFields(name,_283,desc);
if(_289.length==0||_289[0]==null){
desc.pageInitialized=false;
if(desc.hasOptions&&_284){
desc.listboxValues=_284;
}
return null;
}
var _28a;
var _28b;
var _28c=false;
var _28d=row;
if(_283.repOpt==REP_LIST&&(desc.flags&_REPEATING)!=0){
_28d=_283.currentRow;
if(_283.findCount){
_28d=_28d%_283.findCount;
}
}else{
if((desc.flags&_REPEATING)==0){
_28d=_283.currentRow;
}
}
var _28e=_28d;
var _28f=null;
do{
_28f=desc.attrs[_28d--];
}while(!_28f&&_28d>=0);
var _290=true;
var _291;
if(_285&&_28f&&_28f.isVisible=="-"){
_289[0].origCls=_289[0].className;
_28f=null;
}
if(_28f){
if(!_289[0].nxjAttrs){
var cls=_289[0].origCls?_289[0].origCls:_289[0].className;
_28b=_289[0].style;
_289[0].nxjAttrs=new CtlDesc("",!(_28b.visibility=="hidden"),cls,_28b.color,_28b.backgroundColor,_28b.fontFamily,_28b.fontSize,_28b.fontWeight,_28b.fontStyle,_28b.textDecoration);
}
_291=_289[0].nxjAttrs;
if(_28f.isVisible=="-"){
if(_283.grid){
_290=false;
}else{
_28f=_291;
}
var _293=new Array();
for(var adx=0;adx<desc.attrs.length;adx++){
_293[adx]=desc.attrs[adx];
}
_293[_28e]=_28f;
desc.attrs=_293;
}
if(_285){
_290=!(_28f.isVisible==_291.isVisible&&_28f.styleClass==_291.styleClass&&_28f.fgColor==_291.fgColor&&_28f.bgColor==_291.bgColor&&_28f.fontFamily==_291.fontFamily&&_28f.fontSize==_291.fontSize&&_28f.fontWeight==_291.fontWeight&&_28f.fontStyle==_291.fontStyle&&_28f.textDecoration==_291.textDecoration);
if(!_290&&_283.grid&&(!_28f.isVisible||desc.attrs.length>1)){
_290=true;
}
}
if(_28f.isPastEnd){
_28f=_291;
}
if(_289[0].type=="radio"&&_290){
var _295=_289[0].parentNode;
while(_295!=null){
if(_295.tagName=="FIELDSET"){
this.applyStyleToAll(_295,_28f);
break;
}
_295=_295.parentNode;
}
}
}
for(var idx=0;idx<_289.length;idx++){
_28a=_289[idx];
_28b=_28a.style;
if(_28f&&_290){
this.applyStyle(_28a,_28f,_283);
if(this.namesToComponents){
var _297=this.namesToComponents[_28a.name];
if(_297&&(_297.isCombo||_297.isDatePicker)){
if(_297.div){
this.applyStyle(_297.div,_28f);
_297.div.style.color="";
}
if(_297.button){
this.applyStyle(_297.button,_28f);
}
if(_297.text){
this.applyStyle(_297.text,_28f);
}
}
}
}else{
if(this.namesToComponents){
var dp=this.namesToComponents[_28a.name];
if(dp&&dp.isDatePicker&&dp.div){
dp.div.style.color="";
}
}
}
var _299=_28b.textAlign;
var _29a=_28b.textTransform;
if(desc.justification==RIGHT_JUSTIFIED){
_28b.textAlign="right";
}else{
if(desc.justification==LEFT_JUSTIFIED){
_28b.textAlign="left";
}else{
if(desc.justification==CENTER_JUSTIFIED){
_28b.textAlign="center";
}
}
}
if(desc.caseConversion=="U"){
_28b.textTransform="uppercase";
}else{
if(desc.caseConversion=="L"){
_28b.textTransform="lowercase";
}else{
_28b.textTransform="";
}
}
if((_299!=_28b.textAlign||_29a!=_28b.textTransform)&&_283.grid&&!_283.grid.isViewGrid){
_283.grid.updateColumnStyle(desc);
}
if(_28a.tagName=="DIV"){
_28a.name=_28a.id;
if((desc.flags&_AUTO_ACCEPT)!=0&&this.namesToComponents&&this.namesToComponents[_28a.id]&&this.namesToComponents[_28a.id].isDatePicker){
this.namesToComponents[_28a.id].acceptHook=new Function("if(window.parent.clientManager!=null)"+"window.parent.clientManager.doNextField();");
}
}
_28a.disabled=false;
if((desc.flags&_FOCUSABLE)==0){
this.nonFocusableElements[desc.name]=true;
}else{
this.nonFocusableElements[desc.name]=false;
}
if(IS_IE6){
_28a.wasReadOnly=false;
}
if((desc.flags&_UPDATEABLE)==0){
_28a.readOnly=true;
}else{
if(_28a.readOnly){
if(IS_IE6){
_28a.wasReadOnly=true;
}
_28a.readOnly=false;
}
}
var _29b=false;
if((desc.flags&_ECHOED)==0&&(_28a.tagName=="INPUT"||_28a.tagName=="TEXTAREA")){
if(_28a.type=="text"){
this.nxjReplace=nxjReplace;
_28a=this.nxjReplace(desc,_28a,"password");
_289[idx]=_28a;
_28a.wasPassword=true;
_29b=true;
}
}else{
if(_28a.wasPassword){
this.nxjReplace=nxjReplace;
_28a=this.nxjReplace(desc,_28a,"text");
_289[idx]=_28a;
_28a.wasPassword=false;
_29b=true;
}
}
if(idx==0){
this.isFieldOnAnyPage(desc);
}
if(desc.fieldWidth>0&&_28a.tagName=="INPUT"&&(_28a.type=="text"||_28a.type=="password")&&this.isIE){
if(_283.find){
_28a.removeAttribute("maxLength");
}else{
_28a.maxLength=desc.fieldWidth;
}
}
if(_28a.type=="checkbox"||_28a.type=="radio"){
if(_28a.type=="checkbox"){
_28a.indeterminate=false;
}
if((desc.flags&_FOCUSABLE)==0||(desc.flags&_UPDATEABLE)==0){
_28a.onclick=new Function("if(window.parent.clientManager!=null)"+"{try{return window.parent.clientManager.denyOnClick(this,'"+_282+"');}catch(e){}}"+"return false;");
}else{
_28a.onclick=new Function("if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager.onClick(this,"+desc.flags+");}catch(e){}}"+"return false;");
}
}
if(_28a.tagName=="SELECT"){
_28a.disabled=(desc.flags&_FOCUSABLE)==0;
}
var _29c=false;
if(_28a.tabIndex){
this.tabElements[_28a.tabIndex-1]=_28a;
if(_28a.tagName=="DIV"&&this.namesToComponents&&this.namesToComponents[_28a.id]&&this.namesToComponents[_28a.id].text){
var ctl=this.namesToComponents[_28a.id];
this.tabElements[_28a.tabIndex-1]=ctl.text;
ctl.text.tabIndex=_28a.tabIndex;
if((desc.flags&_UPDATEABLE)==0){
ctl.text.readOnly=true;
}else{
if(ctl.text.readOnly){
ctl.text.readOnly=false;
}
}
if(ctl.isDatePicker){
_29c=true;
this.tabElements[_28a.tabIndex-1].isDatePicker=true;
}
}
}
if(_285||!this.isIE||_29b){
if(!this.isIE&&_28a.getAttribute){
_28a.tabIndex=_28a.getAttribute("tabindex");
}
if(_28a.tagName=="INPUT"||_28a.tagName=="TEXTAREA"||_28a.tagName=="SELECT"||_28a.tagName=="DIV"){
var _29e="if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onFocus(this);}catch(e){}}";
this.setEventCode(_28a,"onfocus",_29e,false,false);
var _29f="if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onMouseDown(event);}catch(e){}}";
this.setEventCode(_28a,"onmousedown",_29f,true,false);
var _2a0="if(window.parent.clientManager!=null)"+"{try{window.parent.clientManager.onBlur(this);}catch(e){}}";
this.setEventCode(_28a,"onblur",_2a0,false,false);
if(_29c){
this.setEventCode(this.namesToComponents[_28a.id].text,"onblur",_2a0,false,false);
}
if(_28a.tagName=="TEXTAREA"||_28a.type=="text"){
_28a.ondrop=new Function("if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{this.wasDropped=true;}");
}
if(_28a.tagName=="SELECT"){
_28a.onchange=new Function("if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onSelectChange(this);}catch(e){}}");
_28a.onkeydown=new Function("if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onSelectKeyDown(this);}catch(e){}}");
if(this.isIE){
_28a.onbeforeactivate=new Function("if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onBeforeActivate(this);}catch(e){}}");
if(_28a.size>1&&_28a.style.height.indexOf("%")==-1){
var _2a1=parseInt(_28a.style.height);
_28a.style.height="auto";
var _2a2=Math.floor((_28a.clientHeight)/_28a.size);
if(_2a2>0){
var _2a3=Math.floor((_2a1)/_2a2);
if(_2a3>1&&_2a3!=_28a.size){
_28a.size=_2a3;
}
}
}
}
}
}
if(_28a.tagName=="INPUT"||(!this.isIE&&_29c)){
_28a.onkeyup=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onKeyUp(event);}catch(e){}}");
if(!(this.namesToComponents&&this.namesToComponents[_28a.name]&&this.namesToComponents[_28a.name].isCombo)){
_28a.onkeydown=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager.onKeyDown(event);}catch(e){}}");
}
}
}
if(desc.hasOptions){
if(_284==null&&desc.listboxValues){
_284=desc.listboxValues;
}
if(_284){
this.setOptions(_28a,_284);
}
}
}
var _2a4=undefined;
if(_289[0].tagName=="SELECT"){
if(desc.type==TYPE_AMOUNT){
var re=new RegExp("["+this.validator.currency_symbol+"]");
_2a4=_282.replace(re,"");
_2a4=_2a4.replace(/[\s]/g,"");
if(_2a4.indexOf("(")!=-1){
_2a4=_2a4.replace(/[()]/g,"");
_2a4="-"+_2a4;
}
}else{
if(desc.type==TYPE_FLOAT){
var re=new RegExp("["+this.validator.triad_separator+"]","g");
_2a4=_282.replace(re,"");
var rad=this.validator.radix_separator;
if(_2a4.indexOf(rad)==-1){
_2a4+=rad+"0";
}
}
}
}
var _2a7=false;
var _2a8=window.parent.mainManager.delayClickField;
if(_2a8!=null){
if(_289[0]==_2a8){
_2a7=true;
}else{
if(_289[0].type=="radio"&&_2a8.type=="radio"){
for(var idx=0;idx<_289.length;idx++){
if(_289[idx]==_2a8){
_2a7=true;
break;
}
}
}
}
}
if(_2a7){
_282=this.getValue(_2a8);
if((desc.flags&(_REPEATING|_SELSET))!=0){
_283.currentRowModified=true;
}
if((desc.flags&_TARGET)!=0&&_283.recordState=="stored"){
_283.recordState="stored/modified";
}
desc.flags|=(_TRAVERSED|_MODIFIED);
for(var fidx=0;fidx<this.fieldDescriptors.length;fidx++){
if(desc==this.fieldDescriptors[fidx]){
var obj=new Object();
obj.fieldId=fidx;
obj.flags=desc.flags;
this.traversedFields[this.traversedFields.length]=obj;
break;
}
}
this.setValue(_289[0],_282,_2a4);
desc.rawValue=this.getValue(_289[0]);
}else{
this.setValue(_289[0],_282,_2a4);
}
if(_289[0].type=="radio"){
for(var idx=0;idx<_289.length;idx++){
if(_289[idx].value==_282){
return _289[idx];
}
}
}else{
if(_289[0].type=="checkbox"&&this.isIE&&desc.notebookPage&&_289[0].checked&&_285){
desc.pageInitialized=false;
}
}
return _289[0];
}
function nxjReplace(desc,_2ac,type){
var _2ae=this.fieldDescriptors[this.currentFieldId];
var _2af=(desc==_2ae);
var _2b0=_2ac.parentNode;
var _2b1;
if(type=="password"||!this.isIE){
_2b1=_2ac.cloneNode(true);
}else{
_2b1=this.document.createElement("INPUT");
_2b1.className=_2ac.className;
_2b1.name=_2ac.name;
_2b1.style.cssText=_2ac.style.cssText;
_2b1.tabIndex=_2ac.tabIndex;
if(_2b0.tagName=="DIV"){
_2b1.style.top=_2ac.style.top;
_2b1.style.left=_2ac.style.left;
_2b1.style.width=_2ac.style.width;
}
}
_2b1.type=type;
_2b1.style.visibility=_2ac.style.visibility;
_2b0.replaceChild(_2b1,_2ac);
if(this.tabElements){
this.tabElements[_2ac.tabIndex-1]=_2b1;
}
if(_2af){
this.setFocus(_2b1);
}
return _2b1;
}
function doSetOptions(_2b2,_2b3){
var key=_2b2.id?_2b2.id:_2b2.name;
var dot=key.lastIndexOf(".");
if(dot!=-1){
key=key.substr(0,dot+1);
}
var id=this.findName(key);
var desc=this.fieldDescriptors[id];
var view=this.getDataView(desc.dataViewName);
var _2b9=false;
if(this.namesToComponents&&this.namesToComponents[key]&&this.namesToComponents[key].isCombo){
_2b9=true;
}
if(!this.isIE&&!_2b9&&_2b2.combo&&_2b2.combo.isCombo){
_2b9=true;
}
var _2ba=false;
if(!_2b9&&this.namesToComponents&&this.namesToComponents[_2b2.name]){
var obj=this.namesToComponents[_2b2.name].div;
if(obj&&obj.getAttribute("isDialogField")){
_2ba=true;
}
}
if(_2b2.tagName=="SELECT"||_2b9||_2ba){
if(_2b3==null&&_2b2.options){
_2b3=new Array();
for(var idx=0;idx<_2b2.options.length;++idx){
_2b3[idx*2]=_2b2.options[idx].text;
_2b3[idx*2+1]=_2b2.options[idx].value;
}
}
if(_2b3){
if(view.grid&&(desc.flags&_REPEATING)!=0){
view.grid.setColListData(key,_2b3);
}else{
if((_2b9||_2ba)&&this.namesToComponents[_2b2.name]){
var _2bd="";
for(var idx=0;idx<_2b3.length-1;idx+=2){
if(idx!=0){
_2bd+=";";
}
_2bd+=_2b3[idx]+"="+_2b3[idx+1];
}
var obj=this.namesToComponents[_2b2.name].div;
if(obj&&obj.setOptions){
obj.setOptions(_2bd);
}
return;
}
}
}
}
if(_2b3!=null&&_2b2.tagName=="SELECT"){
if(_2b3.length/2!=_2b2.options.length){
_2b2.options.length=0;
_2b2.options.length=_2b3.length/2;
}
for(var idx=0;idx<_2b2.options.length;++idx){
if(_2b2.options[idx].text!=_2b3[idx*2]){
_2b2.options[idx].text=_2b3[idx*2];
}
if(_2b2.options[idx].value!=_2b3[idx*2+1]){
_2b2.options[idx].value=_2b3[idx*2+1];
}
}
}
}
ClientManager.prototype.deferredSetOptions=function(_2be){
var _2bf=this.getDataView(_2be);
if(!_2bf.grid){
return;
}
var desc;
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_2be&&desc.hasOptions&&desc.listboxValues&&desc.field){
this.setOptions(desc.field,desc.listboxValues);
}
}
};
function getDefaultColors(_2c2,obj){
var _2c4=null;
if(obj.backgroundColor==undefined||obj.backgroundColor==""){
_2c4=this.getNamedStyle(_2c2);
if(_2c4&&_2c4.backgroundColor){
obj.backgroundColor=_2c4.backgroundColor;
}else{
obj.backgroundColor="#ffffff";
}
}
if(obj.color==undefined||obj.color==""){
if(_2c4==null){
_2c4=this.getNamedStyle(_2c2);
}
if(_2c4&&_2c4.color){
obj.color=_2c4.color;
}else{
obj.color="#000000";
}
}
}
function initHiliteColors(){
var _2c5=this.document.styleSheets;
if(!_2c5){
return;
}
var _2c6=this.getNamedStyle("FOCUS_TEXT");
if(_2c6){
FIELD_HIGHLIGHT_BACKGROUND_COLOR=_2c6.backgroundColor;
FIELD_HIGHLIGHT_COLOR=_2c6.color;
}
var _2c7=this.getNamedStyle("repeating_area");
if(_2c7){
REPEATING_HIGHLIGHT_BACKGROUND_COLOR=_2c7.backgroundColor;
REPEATING_HIGHLIGHT_COLOR=_2c7.color;
}
if(!this.getNamedStyle("nxj_selected_tab")){
var _2c8="background:#d4d0c8;color:black;border-style:solid;border-color:#666600;border-width:3px";
var _2c9="background:#7d7d7d;color:white;border-style:solid;border-color:gray;border-width:1px";
this.form.errborder=this.form.getAttribute("errborder");
if(!this.form.errborder){
this.form.errborder="red";
}
var _2ca="border-style:solid;border-color:"+this.form.errborder+";border-width:1px";
if(this.isIE){
_2c5[0].addRule(".nxj_selected_tab",_2c8,0);
_2c5[0].addRule(".nxj_unselected_tab",_2c9,0);
_2c5[_2c5.length-1].addRule(".nxj_errborder",_2ca);
}else{
try{
_2c5[0].insertRule(".nxj_selected_tab{"+_2c8+"}",0);
_2c5[0].insertRule(".nxj_unselected_tab{"+_2c9+"}",0);
_2c5[_2c5.length-1].insertRule(".nxj_errborder{"+_2ca+"}",_2c5[_2c5.length-1].cssRules.length);
}
catch(e){
}
}
}
}
function getNamedStyle(_2cb){
_2cb=_2cb.toLowerCase();
if(!this.document.styleSheets){
return null;
}
for(var didx=this.document.styleSheets.length-1;didx>=0;didx--){
var _2cd=this.document.styleSheets[didx];
if(!_2cd){
continue;
}
var _2ce=null;
try{
if(_2cd.rules){
_2ce=_2cd.rules;
}else{
if(_2cd.cssRules){
_2ce=_2cd.cssRules;
}
}
}
catch(e){
_2ce=new Array();
}
for(var idx=0;_2ce!=null&&idx<_2ce.length;idx++){
var rule=_2ce[idx];
if(rule&&rule.selectorText&&rule.selectorText.toLowerCase()=="."+_2cb){
return rule.style;
}
}
}
return null;
}
function hiliteField(_2d1,_2d2){
if(!this.isIE&&_2d1.tagName=="SELECT"&&navigator.platform!="Win32"){
return;
}
if(_2d1.tagName=="TEXTAREA"&&!this.doingCommand){
if(_2d2&&(this.focusType!=_CLICK||this.form.getAttribute("select_on_click")=="true")&&!this.wasClickOnField){
if(!_2d1.readOnly&&_2d1.getAttribute("auto_select")!="false"){
_2d1.select();
}else{
if(this.isIE&&_2d1.isTextEdit){
var tr=_2d1.createTextRange();
tr.collapse();
tr.select();
}
}
}else{
if(!_2d2){
_2d1.value=_2d1.value;
}
}
this.wasClickOnField=undefined;
}
if(_2d1.tagName=="INPUT"&&_2d1.type!="text"&&_2d1.type!="password"&&_2d1.type!="file"){
return;
}
if(_2d1.type=="file"&&!this.isIE){
return;
}
if(_2d2&&this.doingCommand){
return;
}
if(_2d2&&!FIELD_HIGHLIGHT_BACKGROUND_COLOR){
if((_2d1.type=="text"||_2d1.type=="password")&&(this.focusType!=_CLICK||this.form.getAttribute("select_on_click")=="true")){
if(!this.wasClickOnField){
if(!_2d1.readOnly){
_2d1.select();
}else{
if(this.isIE&&_2d1.isTextEdit){
var tr=_2d1.createTextRange();
tr.collapse();
tr.select();
}
}
}
}
this.wasClickOnField=undefined;
return;
}else{
if(!_2d2&&!this.SAVE_BACKGROUND_COLOR){
if(this.isIE&&!_2d1.readOnly&&_2d1.tagName!="SELECT"){
_2d1.value=_2d1.value;
}
return;
}
}
var _2d4=_2d1.name;
var dot=_2d4.lastIndexOf(".");
if(dot!=-1){
_2d4=_2d4.substr(0,dot+1);
}
if(this.nonFocusableElements[_2d4]){
return;
}
if(_2d1.tagName=="DIV"&&this.namesToComponents&&this.namesToComponents[_2d1.id]&&(this.namesToComponents[_2d1.id].isDatePicker||this.namesToComponents[_2d1.id].isDialogField)){
_2d1=this.namesToComponents[_2d1.id].text;
}
var _2d6=null;
var _2d7=null;
if(this.namesToComponents&&this.namesToComponents[_2d1.name]&&this.namesToComponents[_2d1.name].isCombo){
_2d7=this.namesToComponents[_2d1.name];
if(_2d7.popup&&_2d7.popup.document){
if(this.isIE){
_2d6=_2d7.popup.document.body;
}else{
_2d6=_2d7.popup;
}
}
}
if(_2d2){
this.getDefaultColors(_2d1.className,_2d1.style);
if(_2d1.style.backgroundColor!=FIELD_HIGHLIGHT_BACKGROUND_COLOR){
this.SAVE_BACKGROUND_COLOR=_2d1.style.backgroundColor;
this.SAVE_COLOR=_2d1.style.color;
_2d1.style.backgroundColor=FIELD_HIGHLIGHT_BACKGROUND_COLOR;
_2d1.style.color=FIELD_HIGHLIGHT_COLOR;
if(_2d6){
_2d6.style.backgroundColor=FIELD_HIGHLIGHT_BACKGROUND_COLOR;
}
}
if((_2d1.type=="text"||_2d1.type=="password")&&(this.focusType!=_CLICK||this.form.getAttribute("select_on_click")=="true")){
if(!this.wasClickOnField){
if(!_2d1.readOnly){
_2d1.select();
}else{
if(this.isIE&&_2d1.isTextEdit){
var tr=_2d1.createTextRange();
tr.collapse();
tr.select();
}
}
}
}
}else{
if(this.focusType!=INITIAL_FOCUS_CALL){
_2d1.style.backgroundColor=this.SAVE_BACKGROUND_COLOR;
_2d1.style.color=this.SAVE_COLOR;
if(!_2d1.readOnly&&_2d1.tagName!="SELECT"){
_2d1.value=_2d1.value;
}
}
}
this.wasClickOnField=undefined;
}
function doOnBlur(_2d8){
if(_2d8.autoCompleteObj){
_2d8.autoCompleteObj.hidePopup();
}
this.hiliteField(_2d8,false);
}
function doOnFocus(_2d9){
if(this.focusType==INITIAL_FOCUS_CALL||this.fieldDescriptors.length==0){
if(!this.isIE&&this.focusType==INITIAL_FOCUS_CALL&&this.fieldDescriptors.length&&_2d9.name&&_2d9.blur){
var idx=this.findName(_2d9.name);
if(idx!=null){
var desc=this.fieldDescriptors[idx];
var dv=this.getDataView(desc.dataViewName);
if(dv.repOpt==REP_LIST&&!dv.grid){
_2d9.blur();
}
}
}
if(!this.useFrameset&&this.document.activeElement&&this.document.activeElement.tagName=="OBJECT"){
}
this.focusType=NATURAL_ORDER_TAB;
this.setFocus(_2d9,true);
if(window.dialogArguments){
this.focusType=NATURAL_ORDER_TAB;
this.setFocus(_2d9,true);
}
this.focusElement=_2d9;
return;
}
var _2dd=this.fieldDescriptors[this.currentFieldId];
var _2de=_2dd.field;
if(_2de&&_2de.getAttribute("isRichText")&&_2d9.id!=_2de.id){
_2de.setReadOnly();
}
var _2df=this.getDataView(_2dd.dataViewName);
if(!_2d9.id||(this.namesToComponents&&this.namesToComponents[_2d9.id]&&this.namesToComponents[_2d9.id].isDatePicker)){
this.focusElement=_2d9;
}
if(_2d9.tagName=="A"||_2d9.isPageButton||_2d9.isTree||(_2d9.tagName=="INPUT"&&(_2d9.type=="button"||_2d9.type=="image"))){
if(_2df.grid&&(_2dd.flags&_REPEATING)!=0){
_2df.grid.stopEditingCell();
}
if((this.focusType==NATURAL_ORDER_TAB||_2d9.isTree)&&!this.skipAcceptOnFocus){
if(!_2df.find&&(_2dd.flags&_REQUIRED)!=0&&this.getValue(_2de).search(/\S/)==-1){
this.messageHandler.alert("RequiredField");
if(this.isFieldOnNonCurrentPage(_2dd)){
this.makeFieldPageCurrent(_2dd);
}
this.setFocus(_2de);
return;
}
modified=this.getValue(_2de)!=this.savedValue||(_2de&&_2de.wasDropped)||((_2dd.flags&_HAS_SEARCH_RANGE_ACCEPT)!=0&&_2df.find&&(_2dd.flags&_MODIFIED)!=0);
if(modified){
if(((_2dd.flags&_HAS_SEARCH_RANGE_ACCEPT)!=0&&_2df.find)||((_2dd.flags&_IMMEDIATE)!=0&&(_2dd.flags&_HAS_WHEN_FIELD_CHANGES)!=0)){
this.onFocusImmediate(_2dd,null,null,this.focusType,modified);
if(this.doingCommand){
window.parent.mainManager.focusControl=_2d9;
window.parent.mainManager.focusField=_2de;
}
}else{
if(!this.accept()){
this.setFocus(_2de);
}
}
}
}
this.skipAcceptOnFocus=false;
return;
}
this.skipAcceptOnFocus=false;
var dot=_2d9.name.lastIndexOf(FIELD_DELIMITER);
var name;
var row;
var _2e3;
var _2e4;
_2e4=this.getValue(_2de)!=this.savedValue||(_2de&&_2de.wasDropped);
if(_2d9.name.indexOf("_",dot)==-1){
name=_2d9.name.substring(0,dot+1);
row=_2d9.name.substring(dot+1);
var iRow=parseInt(row);
if(!isNaN(iRow)){
row=iRow+1;
}else{
row=0;
}
}else{
name=_2d9.name;
row="";
}
_2e3=this.findName(name);
var _2e6=this.focusType;
this.focusType=_CLICK;
if(_2e3==null){
if(!this.accept()){
this.setFocus(_2de);
return;
}
this.setFieldState(null);
return;
}
if(this.childWindow!=null&&!this.childWindow.closed){
if(_2d9!=_2dd.field){
this.setFocus(_2dd.field);
}
return;
}
var _2e7=this.fieldDescriptors[_2e3];
if(_2d9==_2de){
this.setFieldState(_2e7);
this.focusType=_2e6;
this.hiliteField(_2d9,true);
this.deferEval=null;
return;
}
if(_2e7==_2dd&&_2d9.type=="radio"){
if(_2e6==NATURAL_ORDER_TAB){
return;
}
}
if(!this.clickOnField&&_2e6==_CLICK){
this.setFocus(_2de);
return;
}
if(_2de){
var _2e8=_2de.tabIndex;
var _2e9=_2d9.tabIndex;
if(!this.clickOnField&&_2e9!=(_2e8+1)%this.form.elements.length&&_2e9!=(_2e8-1)%this.form.elements.length){
this.setFocus(_2de);
return;
}
}
if(this.childWindow!=null&&!this.childWindow.closed){
this.childWindow=null;
this.setFocus(_2de);
return;
}
var _2ea=undefined;
if(_2e6==_TAB&&this.currentNextFieldName!=""){
this.currentNextFieldName+=".";
if(name!=this.currentNextFieldName){
_2ea=this.findName(this.currentNextFieldName);
if(_2ea!=null&&_2ea!=undefined){
var _2eb=this.fieldDescriptors[_2ea];
if((_2eb.flags&_FOCUSABLE)==0||(_2eb.field&&_2eb.field.style.visibility=="hidden")||(this.isFieldOnNonCurrentPage(_2eb))){
_2ea=undefined;
}else{
_2e3=_2ea;
}
}else{
_2ea=undefined;
}
}
}
this.currentNextFieldName="";
var _2ec=this.getDataView(_2e7.dataViewName);
var _2ed=_2ec.repOpt==REP_FIELDS&&(_2e7.flags&_REPEATING)!=0&&row!=_2ec.currentRow;
if(!_2df.find&&(!_2ed|_2df.stored)&&(_2dd.flags&_REQUIRED)!=0&&this.getValue(_2de).search(/\S/)==-1){
if(!this.ignoreRequired){
this.messageHandler.alert("RequiredField");
if(this.isFieldOnNonCurrentPage(_2dd)){
this.makeFieldPageCurrent(_2dd);
}
this.setFocus(_2de);
return;
}
this.ignoreRequired=false;
}
if((_2e7.flags&_FOCUSABLE)==0){
var e;
try{
_2d9.blur();
if(_2de){
this.setFocus(_2de);
}
}
catch(e){
this.document.body.focus();
}
return;
}
if(_2ed){
if(_2ec.find||!this.clickOnField){
this.setFocus(_2de);
}else{
if(!this.accept()){
this.setFocus(_2de);
return;
}
var _2ef=(_2d9.tagName=="INPUT"&&(_2d9.type=="radio"||_2d9.type=="checkbox")&&_2e6==_CLICK);
if(_2ec.isBatch||(!_2ec.isImmediate&&!_2ef&&(!_2ec.hasNextOrPrev||!_2ec.currentRowModified))){
this.focusType=_2e6;
if(this.focusType==_CLICK){
this.moveRepFieldRecord(_2ec,row,_2e7,CMD_CLICK_ON_FIELD);
}
}else{
if(_2ef){
if(!_2ec.hasNextOrPrev&&_2ec.currentRowModified){
this.focusType=_CLICK;
this.moveRepFieldRecord(_2ec,row,_2e7,CMD_CLICK_ON_FIELD);
return;
}
this.deferredCmd=new Object();
this.deferredCmd.focusId=_2e3;
this.deferredCmd.row=row;
return;
}
this.doCommandInternal(CMD_CLICK_ON_FIELD,_2e3,row);
}
if(this.isIE&&_2e6==_CLICK&&this.form.getAttribute("select_on_click")!="true"&&_2d9.tagName=="INPUT"&&(_2d9.type=="text"||_2d9.type=="password")&&_2d9.isTextEdit){
var _2f0;
var _2f1=window.parent.frames;
for(var idx=0;idx<_2f1.length;idx++){
if(_2f1[idx].event){
_2f0=_2f1[idx].event;
break;
}
}
if(_2f0){
_2d9.insertPos=_2f0.x;
}
}
}
return;
}
if(_2df.grid!=null&&(_2dd.flags&_REPEATING)!=0&&(_2ec.grid!=_2df.grid||(_2e7.flags&_REPEATING)==0)){
if(!_2df.grid.isViewGrid&&!_2df.grid.stopEditingCell()){
return;
}
}
if(!this.accept()){
this.setFocus(_2de);
return;
}
if(_2ec!=_2df&&_2df.currentRowModified&&!_2df.find&&!_2df.isImmediate&&!_2df.hasNextOrPrev&&!_2df.hasOnLeave&&!_2df.isBatch){
var cmd="ADD_UPDATE";
if(_2df.name!=this.formName){
cmd=_2df.name+":"+cmd;
}
if(this.commandStates[cmd]&&window.confirm(this.messageHandler.findMessage("SAVE_CHANGE"))){
this.doCommandInternal(cmd,0,_2df.currentRow);
return;
}
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName!=_2df.name){
continue;
}
if((desc.flags&(_REPEATING|_SELSET))!=0&&desc.field!=null){
desc.flags=desc.flags&~(_TRAVERSED|_MODIFIED);
}
if(_2df.selset&&_2df.selset.length>0){
this.setValue(desc.field,_2df.selset[_2df.currentRow][desc.selSetIndex]);
if(_2df.grid){
var sid=_2df.grid.rowIds[_2df.currentRow];
var _2f4=_2df.selset[_2df.currentRow];
var _2f5=this.removeNonRepeatingValues(_2df,_2f4,_2df.currentRow);
_2df.grid.setRowValues(sid,_2f5);
}
}else{
if(_2df.repOpt==REP_FIELDS&&desc.values&&desc.values.length>_2df.currentRow){
this.setValue(desc.field,desc.values[_2df.currentRow]);
}
}
}
if(_2df.recordState=="stored/modified"){
_2df.recordState="stored";
if(_2dd.dataViewName==_2df.name){
this.updateSystemField(FIELD_RECORD_STATE,this.messageHandler.findMessage(_2df.recordState),true,_2df.name);
}
}
_2df.currentRowModified=false;
this.cleanupTraversedFields();
}
if(!this.deferEval){
this.onFocusImmediate(_2dd,_2e3,_2e7,_2e6,_2e4);
}
if(!this.doingCommand&&_2ea!=undefined){
var _2eb=this.fieldDescriptors[_2ea];
if(_2eb&&_2eb.field){
this.setFocus(_2eb.field);
return;
}
}
this.focusType=_2e6;
this.hiliteField(_2d9,true);
this.currentFieldId=_2e3;
this.savedValue=this.getValue(_2d9);
this.clearedNull=false;
this.commandStates[ZOOM_COMMAND]=(_2e7.flags&_ZOOM)!=0;
this.setFieldState(_2e7);
this.updateSystemField(FIELD_FYI_MESSAGE,_2e7.fyiMessage,true,_2ec.name);
if(_2ec!=_2df){
this.updateSystemFields();
}
var _2f6=_2e7.flags;
if((_2f6&_AUTO_ZOOM)!=0&(_2f6&_ZOOM)!=0){
this.doCommandInternal(ZOOM_COMMAND,_2e3,_2ec.currentRow);
}
if(this.deferEval&&!this.doingCommand){
if(typeof (this.deferEval)=="string"){
eval(this.deferEval);
}else{
callNxjCommand(this.deferEval.ontabsel,this.deferEval.dvName,this.deferEval.param);
}
this.deferEval=null;
}
if(_2d9.tagName=="DIV"&&!this.doingCommand&&_2d9.enterValue){
_2d9.enterValue();
}
}
function doOnFocusImmediate(_2f7,_2f8,_2f9,_2fa,_2fb){
var _2fc=_2f7.flags;
var _2fd=false;
var _2fe=false;
var _2ff=_2f7.dataViewName;
var _300=this.getDataView(_2ff);
if((_2fc&_IMMEDIATE)!=0){
if(typeof (_2fb)=="undefined"){
_2fb=(_2f7.flags&_MODIFIED)!=0;
}
_2fd=(_2fc&_HAS_ON_FIELD)!=0||((_2fc&_HAS_AFTER_FIELD)!=0&&_2f9!=null)||((_2fc&_HAS_WHEN_FIELD_CHANGES)!=0&&(_2fb||(_300.grid&&(_2fc&_MODIFIED)!=0&&(_2fc&_REPEATING)!=0)));
}
if(_300.find&&(_2fc&_HAS_SEARCH_RANGE_ACCEPT)!=0&&(_2fb||(_2f7.flags&_MODIFIED)!=0)){
_2fe=true;
}
var _301=false;
if(_2f9){
var _302=this.getDataView(_2f9.dataViewName);
var _303=_2f9.flags;
if((_303&_IMMEDIATE)!=0){
_301=(_303&_HAS_ON_FIELD)!=0||(_303&_HAS_BEFORE_FIELD)!=0||(_303&_AUTO_ZOOM)!=0;
_2fd|=_301;
}
}else{
_302=_300;
_2f8=this.currentFieldId;
}
if(_302!=_300&&((_300.isBatch&&_300.rowState)||_300.hasOnLeave)){
_2fd=true;
}
if(_2f9&&_2fd&&(_303&_AUTO_ACCEPT)!=0){
if(_2f9.field.tagName=="SELECT"&&_2fa==_CLICK){
_2fd=false;
}
if(_2f9.field.type=="radio"&&_2f9==_2f7){
_2fd=false;
}
}
if((_2fd&&(!_300.find||!_302.find))||_2fe){
if(_2f9!=null&&(_2f9.field.type=="radio"||_2f9.field.type=="checkbox")&&_2fa==_CLICK){
if(!_301&&(_303&_AUTO_ACCEPT)==0){
window.parent.mainManager.delayClickField=_2f9.field;
}else{
this.deferredCmd=new Object();
this.deferredCmd.focusId=_2f8;
this.deferredCmd.row=_302.currentRow;
this.deferredCmd.isImmediate=true;
return;
}
}
this.focusType=_2fa;
if(_2fa==_CLICK||_2fa==NATURAL_ORDER_TAB){
if(_302.repOpt==REP_LIST&&!_302.grid){
_302.oldCurrentRow=_302.currentRow;
}
this.doingImmediate=true;
this.doCommandInternal(CMD_CLICK_ON_FIELD,_2f8,_302.currentRow);
}else{
var _304;
var _305=(_2f9.flags&_TAB_STOP)!=0;
if(_2fa==_TAB&&_305){
_304="NEXT_TAB";
}else{
if(_2fa==_TAB){
_304="NEXT_FIELD";
}else{
if(_2fa==_BACKTAB&&_305){
_304="PREVIOUS_TAB";
}else{
_304="PREVIOUS_FIELD";
}
}
}
this.doCommandInternal(_304,this.currentFieldId,_300.currentRow);
}
return;
}
}
function doOnKeyDown(_306){
if(this.isIE){
var _307=window.parent.frames[MAIN_FRAME];
if(!this.useFrameset){
_307=window;
}
_306=_307.event;
}
var desc=this.fieldDescriptors[this.currentFieldId];
var _309=_306.keyCode;
var _30a=_306.shiftKey?_309|SHIFT_MASK:_309;
if(_306.ctrlKey){
_30a|=CTRL_MASK;
}
if(_306.altKey){
_30a|=ALT_MASK;
}
var _30b=this.keyMap[_30a];
var _30c=desc.dataViewName;
var _30d=this.getDataView(_30c);
if((_30b!=null&&(_30b=="NEXT_FIELD"||_30b=="NEXT_TAB"||_30b=="PREVIOUS_FIELD"||_30b=="PREVIOUS_TAB"))||(_30b==null&&_309==TAB_KEY)){
this.focusType=_306.shiftKey?_BACKTAB:_TAB;
}else{
if((desc.flags&_UPDATEABLE)==0&&_306.keyCode!=ENTER_KEY){
return false;
}
}
if((desc.flags&_SET_NULL)!=0&&_306.keyCode!=9){
this.clearedNull=true;
}
if(!this.isIE&&(_309==UP_KEY||_309==DOWN_KEY||_30a==CTRL_TAB||_30a==SHIFT_CTRL_TAB)){
var ua=window.navigator.userAgent;
var idx=ua.indexOf("rv:");
var rev=ua.substring(idx+3);
if(parseFloat(rev)>=1.7){
return this.onKeyDownForDocument(_306);
}
}
return true;
}
function isElementTabbable(_311,_312){
if(this.isReuse){
if(_311.tabIndex>0){
return true;
}else{
if(_311.tagName=="INPUT"&&_311.type=="file"){
return true;
}else{
if(!this.isIE&&_311.getAttribute("tabindex")>0){
_311.tabIndex=_311.getAttribute("tabindex");
return true;
}
}
}
return false;
}
if(_311.tagName=="INPUT"||(_311.tagName=="SELECT"&&_311.name&&_311.name.indexOf("UnifyRepeatingArea")==-1)||_311.tagName=="TEXTAREA"||_311.tagName=="A"){
if(_311.name&&this.dynamicAttributes[_311.name]&&_311.type=="text"){
return false;
}
if(_311.isPageButton&&_312){
return false;
}
return true;
}else{
if(_311.tagName=="DIV"){
for(var idx=0;idx<this.notebooks.length;idx++){
if(_311.id==this.notebooks[idx]){
return true;
}
}
var _314=window.parent.frames[MAIN_FRAME];
if(!_314){
_314=window;
}
if(_314.nxjRegister&&_314.nxjRegister[_311.id]){
return true;
}
}else{
if(_311.tagName=="IFRAME"&&_311.getAttribute("nxjupload")){
return true;
}else{
if(!_312){
var nb=window.parent.getNotebook(_311);
if(nb&&nb.getCurrentPageButton()==_311){
return true;
}
}
}
}
}
return false;
}
function doFireDblClick(){
nxjdbl(this.form);
}
function doOnKeyDownForDocument(_316){
var _317;
var _318;
var _319;
var _31a;
var _31b;
if(this.isIE){
var _31c;
if(this.useFrameset){
_31c=window.parent.frames;
}else{
_31c=this.getNonFrameFrames();
}
for(var idx=0;idx<_31c.length;idx++){
frame=_31c[idx];
if(frame==null){
continue;
}
_316=frame.event;
if(_316!=null){
break;
}
}
if(_316==null){
var _31c=this.document.getElementsByTagName("IFRAME");
for(var jdx=0;jdx<_31c.length;jdx++){
if(_31c[jdx].getAttribute("nxjupload")&&_31c[jdx].contentWindow.event){
_316=_31c[jdx].contentWindow.event;
break;
}
}
if(_316==null){
return false;
}
}
}
if(this.doingCommand){
if(!this.isIE){
_316.preventDefault();
}
return false;
}
if(this.grabHandler){
return false;
}
var _31f=null;
if(this.isIE){
_31f=_316.srcElement;
}else{
_31f=_316.target;
}
if(!_31f){
_31f=this.focusElement;
}
_317=_316.keyCode;
_31b=_316.shiftKey?_317|SHIFT_MASK:_317;
if(_316.ctrlKey){
_31b|=CTRL_MASK;
}
if(_316.altKey){
_31b|=ALT_MASK;
}
if(_317==BACKSPACE_KEY&&_31f!=null&&_31f.tagName!="TEXTAREA"&&(_31f.tagName!="INPUT"||(_31f.type!="text"&&_31f.type!="password"&&_31f.type!="file")||_31f.readOnly)){
return false;
}
var _320=null;
if(this.dataViewDescriptors&&this.dataViewDescriptors.length){
_320=this.dataViewDescriptors[0];
}
_318=this.keyMap[_31b];
if(this.fieldDescriptors.length==0){
_31a=false;
}else{
desc=this.fieldDescriptors[this.currentFieldId];
_319=desc.field;
_320=this.getDataView(desc.dataViewName);
_31a=((_317==UP_KEY||_317==DOWN_KEY)&&_319!=null&&_319.tagName!="INPUT")||(_317==ENTER_KEY&&_319!=null&&(_319.tagName=="TEXTAREA"||_31f.tagName=="A"||_31f.type=="button"||_31f.type=="image"));
if(_319&&_319.tagName=="DIV"&&this.namesToComponents){
var dp=this.namesToComponents[_319.id];
if(dp&&dp.isDatePicker){
_31a=false;
if(dp.popupShowing&&!this.isIE){
if(_317!=UP_KEY&&_317!=DOWN_KEY&&_317!=LEFT_KEY&&_317!=RIGHT_KEY&&_317!=HOME_KEY&&_317!=END_KEY){
dp.hidePopup();
}
_31a=true;
}else{
if(!dp.popupShowing&&_316.altKey&&_317==DOWN_KEY){
dp.button.click();
_31a=true;
}
}
}
}else{
if(_319&&_319.autoCompleteObj&&_319.autoCompleteObj.isPopupShowing()){
if(_317==DOWN_KEY){
_319.autoCompleteObj.selectNext();
_31a=true;
}else{
if(_317==UP_KEY){
_319.autoCompleteObj.selectPrev();
_31a=true;
}else{
if(_317==ENTER_KEY||_317==TAB_KEY){
_319.autoCompleteObj.applySelection();
_31a=true;
}else{
if(_318!=null){
_319.autoCompleteObj.hidePopup();
}
}
}
}
}
}
}
var _322=this.commandStates;
var _323=1;
if(_320){
_323=_320.currentRow;
}
if(_320&&_320.grid&&_320.grid.isViewGrid){
if(!IS_IE){
return _320.grid.gridHandleKeyEvent(_316,_320.grid);
}
return true;
}
if(_320.grid!=null&&!_31a&&_320.grid.handleKeyEvent(_316)){
this.onListChangeTo(_320,_320.grid.getSelectedRowId());
return false;
}
if(_320.grid!=null&&this.isIE&&(_317==ENTER_KEY||_317==TAB_KEY)&&_319!=null&&_319.tagName=="SELECT"&&(desc.flags&_REPEATING)!=0){
var _324="Next";
if(_316.shiftKey){
_324="Prev";
}
if(_317==TAB_KEY){
_320.grid.tabEvent=true;
}
this.delayedFieldOK=true;
window.setTimeout("if(window.parent.clientManager!=null"+"&&window.parent.clientManager.eventsOK"+"&&window.parent.clientManager.delayedFieldOK)"+"window.parent.clientManager.do"+_324+"Field();",0);
return true;
}
if(_318!=null&&!_31a){
var _325;
var _326=this.childWindow!=null&&!this.childWindow.closed;
_325=_318.split("-");
if(_325.length>1){
_318=_320.find?_325[0]:_325[1];
}
if(_319){
var obj=new Object();
obj.id=_318;
obj.name=_318;
_318=this.getCommandRelativeTo(obj,desc.name);
}
if(_322[_318]==true&&!_326){
if(_318=="NEXT_FIELD"){
if(_31f&&_31f.tagName=="SELECT"&&_31b==ENTER_KEY){
window.setTimeout("window.parent.clientManager.doNextField()",0);
return true;
}
this.doNextField();
return false;
}else{
if(_318=="PREVIOUS_FIELD"){
this.doPrevField();
return false;
}else{
if(_318=="NEXT_TAB"){
var desc=this.fieldDescriptors[this.currentFieldId];
var _329=desc.nextFieldId;
while(_329!=this.currentFieldId){
var _32a=this.fieldDescriptors[_329];
if(_32a.flags&_TAB_STOP&&(!this.isFieldOnAnyPage(_32a)||this.isFieldOnCurrentPage(_32a))&&(_32a.flags&_FOCUSABLE||((_32a.flags&_HAS_BEFORE_FIELD||_32a.flags&_HAS_AFTER_FIELD)&&_32a.flags&_IMMEDIATE))){
this.focusType=_TAB;
if(_32a.flags&_FOCUSABLE){
this.setFocus(_32a.field);
}else{
this.currentFieldId=_329;
this.doCommandInternal(CMD_CLICK_ON_FIELD,this.currentFieldId,_323);
}
break;
}else{
_329=_32a.nextFieldId;
}
}
return false;
}else{
if(_318=="PREVIOUS_TAB"){
var desc=this.fieldDescriptors[this.currentFieldId];
var _32b=desc.prevFieldId;
while(_32b!=this.currentFieldId){
var _32c=this.fieldDescriptors[_32b];
if(_32c.flags&_TAB_STOP&&(!this.isFieldOnAnyPage(_32c)||this.isFieldOnCurrentPage(_32c))&&(_32c.flags&_FOCUSABLE||((_32c.flags&_HAS_BEFORE_FIELD||_32c.flags&_HAS_AFTER_FIELD)&&_32c.flags&_IMMEDIATE))){
this.focusType=_BACKTAB;
if(_32c.flags&_FOCUSABLE){
this.setFocus(_32c.field);
}else{
this.currentFieldId=_32b;
this.doCommandInternal(CMD_CLICK_ON_FIELD,this.currentFieldId,_323);
}
break;
}else{
_32b=_32c.prevFieldId;
}
}
if(!this.isIE){
_316.preventDefault();
}
return false;
}else{
this.focusType=NATURAL_ORDER_TAB;
this.doCommandInternal(_318,0,_323);
}
}
}
}
}
if(this.isIE&&(_317==FUNCTION_KEY_BASE+3||_317==FUNCTION_KEY_BASE+4||_317==FUNCTION_KEY_BASE+5||_317==FUNCTION_KEY_BASE+10||_317==FUNCTION_KEY_BASE+11)){
_316.keyCode+=500;
}
if(!this.isIE){
_316.preventDefault();
}
return false;
}else{
if(_31b==TAB_ID||_31b==BACKTAB_ID){
this.focusType=NATURAL_ORDER_TAB;
if(!this.isElementTabbable(_31f)){
var _32d=(this.focusElement?this.focusElement.tabIndex-1:0);
var _32e=false;
if(this.focusElement&&this.isIE){
var id=this.focusElement.name;
if(!id){
id=this.focusElement.id;
}
var idx=this.findName(id);
if(idx!=null){
var desc=this.fieldDescriptors[idx];
var view=this.getDataView(desc.dataViewName);
if(view.grid!=null&&(desc.flags&_REPEATING)!=0){
_31f=this.focusElement;
_32e=true;
}
}
}
if(!_32e){
if(_31b==TAB_ID){
if(--_32d<0){
_32d=this.tabElements.length-1;
}
_31f=this.tabElements[_32d];
}else{
if(++_32d>this.tabElements.length-1){
_32d=0;
}
_31f=this.tabElements[_32d];
}
if(!_31f){
_31f=findElementByTabIndex(_32d+1,this.document,this.ieIE);
if(!_31f){
return true;
}
this.tabElements[_32d]=_31f;
}
}
}
if(_31f.tagName=="INPUT"&&_31f.type=="file"&&_31f.frameElement){
if(_31b==TAB_ID){
return true;
}
_31f.blur();
_31f=_31f.frameElement;
}
if(_31f.tabIndex<0){
if(!this.isIE){
_316.preventDefault();
}
return false;
}
if(!this.isIE&&_31f.parentNode&&_31f.parentNode.style.display=="none"){
_316.preventDefault();
return false;
}
var _331;
if(_31b==TAB_ID){
_331=_31f.tabIndex+1;
if(_331>this.tabElements.length){
_331=1;
}
}else{
_331=_31f.tabIndex-1;
if(_331<=0){
_331=this.tabElements.length;
}
}
while(_331!=_31f.tabIndex){
var _332=_331-1;
var _333=this.tabElements[_332];
if(!_333){
_333=findElementByTabIndex(_331,this.document,this.ieIE);
if(!_333){
return true;
}
if(this.namesToComponents){
var nb=this.namesToComponents[_333.id];
if(nb&&nb.isNotebook){
_333=nb.getCurrentPageButton();
_333.tabIndex=_331;
}
}
this.tabElements[_332]=_333;
}
if(!this.isReuse&&this.namesToComponents){
var nb=this.namesToComponents[_333.id];
if(nb&&nb.isNotebook){
_333=nb.getCurrentPageButton();
_333.tabIndex=_331;
}
}
if(_333.isDatePicker){
var obj;
for(var _335 in this.namesToComponents){
var obj=this.namesToComponents[_335];
if(obj&&obj.isDatePicker&&obj.text==_333){
_333=obj.div;
break;
}
}
}
var _336=false;
var _337=_333.id;
if(!_337){
_337=_333.name;
}
var dot=_337.lastIndexOf(".");
if(dot!=-1){
var _339=_337.substr(dot+1);
_337=_337.substr(0,dot+1);
var _329=this.findName(_337);
if(_329!=undefined){
var desc=this.fieldDescriptors[_329];
if(desc&&(desc.flags&_REPEATING)&&desc.field!=_333){
_336=true;
}
}else{
var _33a=this.findDataView(_31f);
if(_33a.repOpt==REP_FIELDS){
var _33b=this.findDataView(_333);
if(_33b==_33a){
var row;
if(_339!=""){
row=parseInt(_339)+1;
if(row!=_33a.currentRow){
_336=true;
}
}else{
row=0;
if(row!=_33a.currentRow&&this.document.getElementById(_337+"0")){
_336=true;
}
}
}
}
}
}
var _33d=false;
if(!this.isIE&&!_336){
if(_333.tagName=="A"&&!_333.name&&!_333.id){
_336=true;
}else{
if(!_333.isPageButton){
_33d=this.isElementOnNonCurrentPage(_333);
}
}
}
if(!_333.disabled&&!_336&&!_33d&&!this.nonFocusableElements[_337]&&_333.style.visibility!="hidden"){
var _33e=false;
if(_333.tagName=="A"&&this.isIE&&this.isIE55){
_33e=this.isElementOnNonCurrentPage(_333.parentNode);
}
if(!_33e){
var e;
if(_333.tagName=="IFRAME"&&_333.getAttribute("nxjupload")){
var _340=_333.contentWindow.uploadMgr;
_333=_340.chooserField;
}
try{
this.setFocus(_333);
if(_333.isPageButton){
this.onFocus(_333);
}
if(!this.isIE){
_316.preventDefault();
}
return false;
}
catch(e){
}
}
}
if(_31b==TAB_ID){
_331++;
if(_331>this.tabElements.length){
_331=1;
}
}else{
_331--;
if(_331==0){
_331=this.tabElements.length;
}
}
}
var e;
try{
this.setFocus(_31f);
}
catch(e){
}
if(!this.isIE){
_316.preventDefault();
}
return false;
}else{
if(_31f.isPageButton&&(_31b==RIGHT_KEY||_31b==LEFT_KEY)){
this.focusElement=_31f;
if(_31b==RIGHT_KEY){
this.nextPage(_31f);
}else{
this.previousPage(_31f);
}
return false;
}else{
if(_31b==CTRL_TAB||_31b==SHIFT_CTRL_TAB){
this.focusElement=_31f;
var _341=window.parent.getNotebook(_31f);
if(!_341&&this.namesToComponents){
var obj;
for(var name in this.namesToComponents){
obj=this.namesToComponents[name];
if(obj&&obj.isNotebook){
_341=obj;
break;
}
}
}
if(_341){
if(_31b==CTRL_TAB){
_341.nextPage();
}else{
_341.previousPage();
}
}
return false;
}else{
if(_31b==27){
var desc=this.fieldDescriptors[this.currentFieldId];
if(desc.field==this.focusElement||!this.focusElement){
this.setValue(desc.field,this.savedValue);
if(desc.field&&desc.field.autoCompleteObj&&desc.field.autoCompleteObj.isPopupShowing()){
desc.field.autoCompleteObj.hidePopup();
}
return false;
}
}
}
}
}
}
return true;
}
function findElementByTabIndex(_343,doc,isIE){
var all=doc.getElementsByTagName("*");
var _347=_343-1;
var ele;
for(tidx=_347;tidx<all.length;tidx++){
ele=all[tidx];
if(ele.tabIndex==_343){
return ele;
}else{
if(!isIE&&ele.getAttribute("tabindex")==_343){
ele.tabIndex=ele.getAttribute("tabindex");
return ele;
}
}
}
return null;
}
function doOnKeyUp(_349){
if(this.isIE){
var _34a=window.parent.frames[MAIN_FRAME];
if(!this.useFrameset){
_34a=window;
}
_349=_34a.event;
}
if((_349.keyCode>FUNCTION_KEY_BASE&&_349.keyCode<=FUNCTION_KEY_BASE+12)||(_349.keyCode!=SPACEBAR&&_349.keyCode<=DELETE_KEY)||_349.keyCode==145||_349.keyCode==91||_349.keyCode==92||_349.keyCode==93||_349.ctrlKey||_349.altKey){
if(_349.keyCode==BACKSPACE_KEY||_349.keyCode==DELETE_KEY){
var _34b=this.fieldDescriptors[this.currentFieldId];
var _34c=_34b.field;
if(_34c&&_34c.autoCompleteObj){
_34c.autoCompleteObj.requestMatches(this);
}
}
return;
}
var _34d=this.keyMap[_349.keyCode];
if(_34d=="NEXT_FIELD"||_34d=="PREVIOUS_FIELD"){
return;
}
var _34b=this.fieldDescriptors[this.currentFieldId];
var _34e=this.getDataView(_34b.dataViewName);
if(!_34e||_34e.find){
if(_34b.isAutoComplete&&_34b.field&&_34d==null){
var _34c=_34b.field;
if(!_34c.autoCompleteObj){
new AutoComplete(_34c);
}
_34c.autoCompleteObj.requestMatches(this);
}
return;
}
if((_34b.flags&_UPDATEABLE)==0){
this.setValue(_34b.field,this.savedValue);
return;
}
if(_34b.field&&_34b.field.type=="checkbox"){
return;
}
var _34f=_34b.fieldWidth;
var _350=this.getValue(_34b.field).length;
var _351=(_34b.flags&_AUTO_ACCEPT)!=0;
if(_34f==0){
return;
}else{
if(_351&&_350==_34f){
var _352=_34b.nextFieldId;
var desc;
for(;;){
desc=this.fieldDescriptors[_352];
if(desc==_34b||((desc.flags&_FOCUSABLE)!=0&&desc.field&&desc.field.style.visibility!="hidden")||((desc.flags==_HAS_BEFORE_FIELD||desc.flags==_HAS_AFTER_FIELD)&&desc.flags==_IMMEDIATE)){
break;
}
_352=desc.nextFieldId;
}
var _354=_34b.flags;
var _355=false;
var _356=this.getValue(_34b.field)!=this.savedValue;
if((_354&_IMMEDIATE)!=0){
_355=(_354&_HAS_ON_FIELD)!=0||(_354&_HAS_AFTER_FIELD)!=0||((_354&_HAS_WHEN_FIELD_CHANGES)!=0&&_356);
}
var _357=desc.flags;
if((_357&_IMMEDIATE)!=0){
_355|=(_357&_HAS_ON_FIELD)!=0||(_357&_HAS_BEFORE_FIELD)!=0||(_357&_AUTO_ZOOM)!=0;
}
if(_355){
this.doCommandInternal("NEXT_FIELD",this.currentFieldId,_34e.currentRow);
}else{
if(desc==_34b){
this.accept();
}else{
this.focusType=_CLICK;
this.setFocus(desc.field);
}
}
return;
}else{
if(_350>_34f){
this.messageHandler.alert("FieldWidth");
}else{
if(_34b.isAutoComplete&&_34d==null){
var _34c=_34b.field;
if(!_34c.autoCompleteObj){
new AutoComplete(_34c);
}
_34c.autoCompleteObj.requestMatches(this);
}
}
}
}
}
function AutoComplete(_358,_359){
this.oText=_358;
if(_359){
this.controlId=_359;
}else{
this.controlId=this.oText.name;
}
this.oText.autoCompleteObj=this;
this.popupDiv=document.createElement("DIV");
this.popupDiv.className="popup-body "+this.oText.className;
if(document.defaultView){
var _35a=document.defaultView.getComputedStyle(this.oText,"");
this.popupDiv.style.fontFamily=_35a.fontFamily;
this.popupDiv.style.fontSize=_35a.fontSize;
}
this.popupDiv.style.backgroundColor="white";
this.popupDiv.style.color="black";
this.popupDiv.style.width=_358.offsetWidth;
this.popupDiv.style.overflow="hidden";
this.popupDiv.style.borderBottomStyle="outset";
this.popupDiv.style.borderBottomWidth="thin";
this.popupDiv.style.borderRightStyle="outset";
this.popupDiv.style.borderRightWidth="thin";
this.popupDiv.style.visibility="hidden";
var top=_358.offsetHeight+_358.offsetTop;
var left=_358.offsetLeft;
var _35d=this.oText.offsetParent;
while(_35d){
top+=_35d.offsetTop;
left+=_35d.offsetLeft;
_35d=_35d.offsetParent;
}
this.popupDiv.style.position="absolute";
this.popupDiv.style.left=left;
this.popupDiv.style.top=top;
this.popupDiv.style.zIndex=100;
document.body.appendChild(this.popupDiv);
}
AutoComplete.prototype.requestMatches=function(mgr){
if(this.oText.value==""){
this.hidePopup();
return;
}
this.matchValue=this.oText.value;
var url=getContextPath()+"nxjAjax";
var _360=new Object();
_360.controlId=this.controlId+"_nxjach";
mgr.namesToComponents[_360.controlId]=this;
_360.parameters="controlId="+this.controlId+"&str="+encodeURIComponent(this.matchValue)+"&managerId="+MANAGER_ID;
_360.onComplete=this.matchHandler;
mgr.makeAjaxRequest(url,_360);
};
AutoComplete.prototype.matchHandler=function(_361){
this.popupDiv.innerHTML="";
if(_361.responseText){
var _362=_361.responseText.substring(0,6).toLowerCase();
if(_362=="<html>"){
return;
}
var _363=_361.responseText.split(";");
for(var idx=0;idx<_363.length;idx++){
var div=document.createElement("DIV");
div.innerHTML="&nbsp;"+_363[idx];
div.value=_363[idx];
div.onmousedown=associateObjWithEvent(this,"onMouseDown");
div.onmouseover=associateObjWithEvent(this,"onMouseOver");
div.onmouseout=associateObjWithEvent(this,"onMouseOut");
this.popupDiv.appendChild(div);
}
this.popupDiv.style.visibility="visible";
this.selectedDiv=null;
}else{
this.hidePopup();
}
};
AutoComplete.prototype.hidePopup=function(){
this.popupDiv.style.visibility="hidden";
};
AutoComplete.prototype.isPopupShowing=function(){
return this.popupDiv.style.visibility!="hidden";
};
AutoComplete.prototype.onMouseDown=function(_366,_367){
this.selectedDiv=_367;
this.applySelection();
};
AutoComplete.prototype.unselectDiv=function(_368){
_368.style.backgroundColor="";
_368.style.color="";
};
AutoComplete.prototype.selectDiv=function(_369){
_369.style.backgroundColor="Highlight";
_369.style.color="white";
};
AutoComplete.prototype.onMouseOver=function(_36a,_36b){
if(this.selectedDiv){
this.unselectDiv(this.selectedDiv);
}
this.selectDiv(_36b);
this.selectedDiv=_36b;
};
AutoComplete.prototype.onMouseOut=function(_36c,_36d){
this.unselectDiv(_36d);
};
AutoComplete.prototype.selectNext=function(){
if(!this.selectedDiv){
this.selectedDiv=this.popupDiv.firstChild;
}else{
this.unselectDiv(this.selectedDiv);
if(this.selectedDiv.nextSibling){
this.selectedDiv=this.selectedDiv.nextSibling;
}else{
this.selectedDiv=null;
}
}
if(this.selectedDiv){
this.selectDiv(this.selectedDiv);
}
};
AutoComplete.prototype.selectPrev=function(){
if(!this.selectedDiv){
this.selectedDiv=this.popupDiv.lastChild;
}else{
this.unselectDiv(this.selectedDiv);
if(this.selectedDiv.previousSibling){
this.selectedDiv=this.selectedDiv.previousSibling;
}else{
this.selectedDiv=null;
}
}
if(this.selectedDiv){
this.selectDiv(this.selectedDiv);
}
};
AutoComplete.prototype.applySelection=function(){
this.hidePopup();
if(this.selectedDiv){
this.oText.value=this.selectedDiv.value;
window.clientManager.setFocus(this.oText,true);
}
};
function onSelectChange(_36e){
var desc=this.fieldDescriptors[this.currentFieldId];
this.clearedNull=true;
if(desc&&!this.doingCommand&&desc.field==_36e&&(desc.flags&_AUTO_ACCEPT)!=0){
if(!this.isIE&&this.savedValue==this.getValue(_36e)){
this.savedValue=desc.rawValue;
}
if((desc.flags&_IMMEDIATE)!=0&&((desc.flags&_HAS_AFTER_FIELD)!=0||(desc.flags&_HAS_WHEN_FIELD_CHANGES)!=0)){
var _370=this.getDataView(desc.dataViewName);
this.doCommandInternal("NEXT_FIELD",this.currentFieldId,_370.currentRow);
}else{
if(this.focusType==_CLICK){
this.focusType=_TAB;
this.doNextField();
}
}
}
}
function onSelectKeyDown(_371){
this.focusType=_TAB;
return true;
}
function denyOnClick(_372,_373){
if(_372.type=="radio"){
this.setValue(_372,_373);
}
return false;
}
function onClick(_374,_375){
this.clearedNull=true;
if(_374.type=="checkbox"||_374.type=="radio"){
if(!this.eventsOK||this.doingCommand){
return false;
}
if(_374.type=="checkbox"){
_374.indeterminate=false;
if(!this.isIE){
_374.className=_374.className.replace(/\sdisabledImage/,"");
}
}
if(this.deferredCmd){
if(!this.deferredCmd.isImmediate){
window.parent.mainManager.delayClickField=_374;
}else{
if(_375&&(_375&_AUTO_ACCEPT)!=0){
window.setTimeout("if(window.parent.clientManager!=null)"+"window.parent.clientManager.doNextField();",250);
this.deferredCmd=null;
return true;
}
}
var _376="window.parent.clientManager.doCommandInternal(\""+CMD_CLICK_ON_FIELD+"\","+this.deferredCmd.focusId+","+this.deferredCmd.row+");";
this.deferredCmd=null;
this.focusType=_CLICK;
window.setTimeout(_376,250);
return true;
}
if(_375&&(_375&_AUTO_ACCEPT)!=0){
window.setTimeout("if(window.parent.clientManager!=null)"+"window.parent.clientManager.doNextField();",250);
}
}
return true;
}
function doNextField(){
var desc=this.fieldDescriptors[this.currentFieldId];
var _378=this.getNextId(desc);
var _379=this.fieldDescriptors.length;
var _37a=0;
while(_378!=this.currentFieldId&&_37a<=_379){
var _37b=this.fieldDescriptors[_378];
if((!this.isFieldOnAnyPage(_37b)||this.isFieldOnCurrentPage(_37b))&&(((_37b.flags&_FOCUSABLE)&&_37b.field&&_37b.field.style.visibility!="hidden")||((_37b.flags&_HAS_BEFORE_FIELD||_37b.flags&_HAS_AFTER_FIELD)&&_37b.flags&_IMMEDIATE))){
this.focusType=_TAB;
if((_37b.flags&_FOCUSABLE)&&_37b.field&&_37b.field.style.visibility!="hidden"){
var _37c=(this.isIE&&(desc.dataViewName!=_37b.dataViewName||(desc.flags&_REPEATING)!=(_37b.flags&_REPEATING)));
this.setFocus(_37b.field,_37c);
}else{
if(this.accept()){
var _37d=this.getDataView(desc.dataViewName);
var _37e=1;
if(_37d){
_37e=_37d.currentRow;
}
this.doCommandInternal("NEXT_FIELD",this.currentFieldId,_37e);
}else{
this.setFocus(desc.field);
}
}
break;
}else{
_378=this.getNextId(_37b);
}
_37a++;
}
}
function doPrevField(){
var desc=this.fieldDescriptors[this.currentFieldId];
var _380=true;
var _381=this.getNextId(desc,_380);
while(_381!=this.currentFieldId){
var _382=this.fieldDescriptors[_381];
if((!this.isFieldOnAnyPage(_382)||this.isFieldOnCurrentPage(_382))&&(((_382.flags&_FOCUSABLE)&&_382.field&&_382.field.style.visibility!="hidden")||((_382.flags&_HAS_BEFORE_FIELD||_382.flags&_HAS_AFTER_FIELD)&&_382.flags&_IMMEDIATE))){
this.focusType=_BACKTAB;
if(_382.flags&_FOCUSABLE){
var _383=(this.isIE&&(desc.dataViewName!=_382.dataViewName||(desc.flags&_REPEATING)!=(_382.flags&_REPEATING)));
this.setFocus(_382.field,_383);
}else{
if(this.accept()){
var _384=this.getDataView(desc.dataViewName);
var _385=1;
if(_384){
_385=_384.currentRow;
}
this.doCommandInternal("PREVIOUS_FIELD",this.currentFieldId,_385);
}else{
this.setFocus(desc.field);
}
}
break;
}else{
_381=this.getNextId(_382,_380);
}
}
}
function getNextId(desc,_387){
var _388=_387?desc.prevFieldId:desc.nextFieldId;
var _389=this.getDataView(desc.dataViewName);
if(_389.grid&&(desc.flags&_REPEATING)!=0){
var grid=_389.grid;
for(var idx=0;idx<grid.columns.length;idx++){
var _38c=grid.colIndexToColId[idx];
if(grid.columns[_38c].fieldId==desc.name){
var _38d;
if(_387){
_38d=idx!=0?idx-1:grid.columns.length-1;
if(idx==0&&grid.prevFieldId!=undefined){
return grid.prevFieldId;
}
}else{
_38d=(idx<grid.columns.length-1)?idx+1:0;
if(_38d==0&&grid.nextFieldId!=undefined){
return grid.nextFieldId;
}
}
var _38e=grid.colIndexToColId[_38d];
var _38f=grid.columns[_38e].fieldId;
for(var fid=0;fid<this.fieldDescriptors.length;fid++){
if(this.fieldDescriptors[fid].name==_38f){
return fid;
}
}
}
}
}else{
var _391=this.fieldDescriptors[_388];
var _392=this.getDataView(_391.dataViewName);
if(_392.grid&&(_391.flags&_REPEATING)!=0){
grid=_392.grid;
if(_387){
_38c=grid.colIndexToColId[grid.columns.length-1];
}else{
_38c=grid.colIndexToColId[0];
}
var _38f=grid.columns[_38c].fieldId;
for(var fid=0;fid<this.fieldDescriptors.length;fid++){
if(this.fieldDescriptors[fid].name==_38f){
return fid;
}
}
}
}
return _388;
}
function doOnMouseDown(_393){
this.focusType=_CLICK;
this.currentNextFieldName="";
if(this==window.parent.clientManager&&this.grabHandler){
if(_393.target&&_393.target.id!=this.grabId){
this.grabHandler(_393);
}
}else{
if(this.isIE&&typeof (this.currentFieldId)!="undefined"){
_393=window.event;
var _394;
if(this.useFrameset){
_394=window.parent.frames;
}else{
_394=this.getNonFrameFrames();
}
for(var idx=0;idx<_394.length;idx++){
frame=_394[idx];
if(frame&&frame.event){
var _396=this.useFrameset?frame.name!=MAIN_FRAME:(frame.name!=MAIN_FRAME&&frame.name!=COMMAND_FRAME);
if(_396){
var desc=this.fieldDescriptors[this.currentFieldId];
if(desc&&desc.field&&desc.field.blur){
desc.field.blur();
}
}else{
_393=frame.event;
}
break;
}
}
}
}
if(_393){
var _398=_393.srcElement;
if(!_398){
_398=_393.target;
}
if(_398&&_398.isPageButton){
this.focusType=NATURAL_ORDER_TAB;
}
if(this.hideMenuFunc){
this.hideMenuFunc();
this.hideMenuFunc=null;
}
}
}
function doOnBeforeActivate(_399){
if(this.focusType==_CLICK){
var dot=_399.name.lastIndexOf(FIELD_DELIMITER);
if(_399.name.indexOf("_",dot)==-1){
var name=_399.name.substring(0,dot+1);
var row=_399.name.substring(dot+1);
var iRow=parseInt(row);
if(!isNaN(iRow)){
row=iRow+1;
}else{
row=0;
}
var _39e=this.findName(name);
if(_39e!=undefined){
var _39f=this.fieldDescriptors[_39e];
if(_39f){
var desc=this.fieldDescriptors[this.currentFieldId];
var _3a1=this.getDataView(_39f.dataViewName);
var _3a2=_3a1.repOpt==REP_FIELDS&&(_39f.flags&_REPEATING)!=0&&row!=_3a1.currentRow;
if(_3a2||((desc.flags&_IMMEDIATE)!=0&&(desc.flags&_HAS_AFTER_FIELD)!=0)||((desc.flags&_IMMEDIATE)!=0&&(desc.flags&_HAS_ON_FIELD)!=0)||((_39f.flags&_IMMEDIATE)!=0&&(_39f.flags&_HAS_BEFORE_FIELD)!=0)){
var _3a3=_399.ownerDocument.parentWindow.event;
_3a3.returnValue=false;
_3a3.cancelBubble=true;
this.setFocus(_399);
}else{
var _3a4=function(){
return window.parent.clientManager.hiliteField(_399,true);
};
window.setTimeout(_3a4,0);
}
}
}
}
}
}
function doFindRepeatingArea(_3a5){
if(this.form==null||_3a5.grid){
return null;
}
if(_3a5.name==this.formName){
return this.findRepeatingDiv(_3a5,this.form);
}else{
var _3a6=this.document.getElementById(_3a5.name+".");
if(!_3a6){
return null;
}
return this.findRepeatingDiv(_3a5,_3a6);
}
return null;
}
function doFindRepeatingDiv(_3a7,_3a8){
if(!_3a8.childNodes||_3a8.childNodes.length==0){
return null;
}
var _3a9;
var _3aa;
var _3ab;
for(var idx=0;idx<_3a8.childNodes.length;idx++){
_3a9=_3a8.childNodes[idx];
if(_3a9.tagName=="DIV"&&_3a9.id&&_3a9.id.indexOf("UnifyRepeatingArea")!=-1){
_3aa=this.findDataView(_3a9);
if(_3aa==_3a7){
return _3a9;
}
}else{
if(_3a9.tagName!="SELECT"){
_3ab=this.findRepeatingDiv(_3a7,_3a9);
if(_3ab!=null){
return _3ab;
}
}
}
}
return null;
}
function doFindNavBar(_3ad){
if(this.form==null){
return null;
}
var idx;
var _3af;
var _3b0;
if(_3ad.name==this.formName){
_3b0=this.form.getElementsByTagName("TABLE");
var _3b1;
for(idx=0;idx<_3b0.length;idx++){
_3b1=_3b0[idx].parentNode;
if(_3b1.tagName=="DIV"&&_3b1.getAttribute("navbarcontainer")=="true"){
_3af=this.findDataView(_3b1);
if(_3af==_3ad){
return _3b0[idx];
}
}
}
}else{
var _3b2=this.document.getElementById(_3ad.name+".");
if(!_3b2){
return null;
}
_3b0=_3b2.getElementsByTagName("DIV");
for(idx=0;idx<_3b0.length;idx++){
if(_3b0[idx].getAttribute("navbarcontainer")=="true"){
return getNavBar(_3b0[idx],this.isIE);
}
}
}
return null;
}
function getNavBar(_3b3,isIE){
if(isIE){
return _3b3.childNodes[0];
}
var _3b5=_3b3.childNodes;
for(idx=0;idx<_3b5.length;idx++){
if(_3b5[idx].tagName=="TABLE"){
return _3b5[idx];
}
}
return null;
}
function doOnListChangeTo(_3b6,row,_3b8,_3b9){
var _3ba=false;
if(_3b6.currentRowModified&&!_3b6.hasNextOrPrev&&!_3b6.isImmediate&&!_3b6.isBatch){
var cmd="ADD_UPDATE";
if(_3b6.name!=this.formName){
cmd=_3b6.name+":"+cmd;
}
if(this.commandStates[cmd]&&window.confirm(this.messageHandler.findMessage("SAVE_CHANGE"))){
var _3bc=getAbsoluteRow(_3b6,row)+1;
cmd+="|"+_3bc;
_3b6.oldCurrentRow=undefined;
this.doCommandInternal(cmd,0,_3b6.currentRow);
return;
}
_3b6.currentRowModified=false;
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_3b6.name&&(desc.flags&(_REPEATING|_SELSET))!=0){
desc.flags=desc.flags&~(_TRAVERSED|_MODIFIED);
}
}
this.cleanupTraversedFields();
if(_3b6.initModified&&_3b6.repOpt==REP_LIST){
_3b6.initModified=false;
_3ba=true;
}
}
var _3bf=_3b9&&_3b9.dataViewName==_3b6.name;
if(_3b6.isBatch&&_3b8&&_3bf){
_3b6.currentRowModified=false;
if(!_3b6.rowState){
_3b6.rowState=new Array();
}
var _3c0=_3b6.currentRow;
var _3c1=row%_3b6.nrows;
if(_3b6.repOpt==REP_LIST){
_3c1=row;
if(_3b6.findCount>0){
_3c0=_3b6.currentRow%_3b6.findCount;
if(!_3b6.grid){
_3c1=_3b6.currentRow+(row-_3c0);
}
}
}
var _3c2=new Array();
var _3c3=_3b6.rowState.length;
_3b6.rowState[_3c3]=new Object();
_3b6.rowState[_3c3].focusIdx=this.currentFieldId;
var _3c4=this.currentFieldId;
if(_3b8==CMD_CLICK_ON_FIELD&&_3b9){
_3c4=this.findName(_3b9.name);
}
_3b6.rowState[_3c3].clickedOnField=_3c4;
_3b6.rowState[_3c3].currentRow=_3b6.currentRow;
_3b6.rowState[_3c3].newRow=_3c1;
_3b6.rowState[_3c3].commandName=_3b8;
for(var idx=0;idx<this.traversedFields.length;idx++){
var _3c5=this.traversedFields[idx];
var _3c6=_3c5.fieldId;
if(!_3c2[_3c6]){
_3c2[_3c6]=new Object();
}
var desc=this.fieldDescriptors[_3c6];
if((desc.flags&_MODIFIED)>0){
_3c2[_3c6].rawValue=desc.rawValue;
if(desc.values&&desc.values.length>_3c0){
desc.values[_3c0]=desc.rawValue;
}
if(_3b6.selset){
_3b6.selset[_3c0][desc.selSetIndex]=desc.rawValue;
}
}
if(_3c2[_3c6].rawValue){
desc.flags|=_MODIFIED;
}
_3c2[_3c6].flags=desc.flags;
_3c2[_3c6].sortIdx=idx;
if(desc.field.type=="checkbox"&&desc.field.indeterminate){
desc.rawValue="";
}
}
if(!_3b6.grid&&_3b6.repOpt==REP_LIST){
var _3c7=_3b6.selMode;
_3b6.selMode=SEL_UPDATE_CURRENT;
this.populateRepeatingArea(_3b6);
var _3c8=this.findRepeatingArea(_3b6);
gridSelectRow(_3c8,row,false);
_3b6.selMode=_3c7;
}
_3b6.rowState[_3c3].fieldState=_3c2;
}
if(_3b6.repOpt==REP_LIST){
if(!_3b6.grid){
_3b6.oldCurrentRow=_3b6.currentRow;
}
if(_3b6.findCount>0){
var _3c0=_3b6.currentRow%_3b6.findCount;
var _3c9=row-_3c0;
_3b6.currentRow+=_3c9;
}else{
_3b6.currentRow=row;
}
if(_3b6.isBatch||(!_3b6.isImmediate&&(!_3b6.hasNextOrPrev||!_3b6.currentRowModified))){
var _3ca;
var ctl;
for(var idx=0;idx<this.controls.length;idx++){
_3ca=this.controls[idx];
if(_3ca.ctl&&_3ca.dvName==_3b6.name){
ctl=_3ca.ctl;
if(ctl.src&&ctl.src.indexOf("TextBinaryHandler")!=-1){
var _3cc=_3ca.name;
if(_3b6.currentRow>0){
_3cc+=(_3b6.currentRow-1);
}else{
_3cc+="_";
}
ctl.src=ctl.src.replace(/htmlElementName=.*(&cacheTimeStamp=[0-9][0-9]*)?/,"htmlElementName="+_3cc+"&"+CACHE_TIMESTAMP+"="+this.windowCounter);
ctl.origImage=undefined;
}
}
}
}
}
if(_3b6.find){
_3b6.recordNumber="";
}else{
if(_3b6.grid){
var _3cd=_3b6.grid.getRowNumber();
var _3bc;
if(_3b6.findCount==0){
_3bc=_3cd;
}else{
var _3ce=Math.floor(_3b6.currentRow/_3b6.findCount);
var _3cf=_3ce*_3b6.findCount;
_3bc=_3cf+_3cd;
}
_3b6.recordNumber=_3bc.toString();
}else{
_3b6.recordNumber=(row+1).toString();
if(_3b6.repOpt==REP_LIST&&_3b6.findCount>0){
_3b6.recordNumber=(_3b6.currentRow+1).toString();
}
}
}
var _3d0=this.fieldDescriptors[this.currentFieldId];
if((this.focusType==_CLICK&&!_3b6.find&&!_3b6.isBatch&&(_3b6.isImmediate||(_3b6.hasNextOrPrev&&_3b6.currentRowModified)))||(_3b6.repOpt==REP_LIST&&this.focusType!=INITIAL_FOCUS_CALL&&!_3b6.isImmediate&&_3b6.recordState=="not stored")||_3ba){
var _3d1=this.currentFieldId;
if(_3d0.dataViewName!=_3b6.name){
for(fidx=0;fidx<this.fieldDescriptors.length;fidx++){
if(this.fieldDescriptors[fidx].dataViewName==_3b6.name){
_3d1=fidx;
break;
}
}
}
this.doCommandInternal(CMD_CLICK_ON_FIELD,_3d1,_3b6.currentRow);
return;
}
if(_3d0.dataViewName==_3b6.name){
this.updateSystemField(FIELD_RECORD_NUMBER,_3b6.recordNumber==""?"":(this.messageHandler.findMessage("RECORD_NUMBER")+_3b6.recordNumber),true,_3b6.name);
}
if(_3b6.recordAction){
_3b6.recordAction="";
this.updateSystemField(FIELD_RECORD_ACTION,"",true,_3b6.name);
}
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_3b6.name&&(desc.flags&(_REPEATING|_SELSET))!=0&&desc.field!=null){
desc.flags=desc.flags&~(_TRAVERSED|_MODIFIED);
if(desc.hasOptions&&this.dynamicListboxValues&&_3b6.repOpt!=REP_FIELDS){
var _3d2=this.dynamicListboxValues[desc.name+row];
if(!_3d2){
_3d2=this.dynamicListboxValues[desc.name];
}
if(_3d2){
this.setOptions(desc.field,_3d2);
}
}
if(_3b6.selset&&_3b6.selset.length>0){
if(typeof (desc.selSetIndex)!="undefined"){
this.setValue(desc.field,_3b6.selset[row][desc.selSetIndex]);
}
if(!_3b6.grid||(desc.flags&_REPEATING)==0){
var _3d3=row;
var _3ca;
do{
_3ca=desc.attrs[_3d3--];
}while(!_3ca&&_3d3>=0);
if(_3ca){
var _3d4=true;
if(_3b6.grid&&this.focusType==_CLICK){
_3d4=false;
}
if(desc==_3d0&&_3d4){
this.hiliteField(desc.field,false);
}
if(_3ca.isVisible!="-"){
this.applyStyle(desc.field,_3ca,_3b6);
}
if(desc==_3d0&&_3d4){
this.hiliteField(desc.field,true);
}
}
}
}
if(idx==this.currentFieldId){
this.savedValue=this.getValue(desc.field);
}
}
}
var _3d5;
for(var idx=0;idx<this.dynamicAttributes.length;idx++){
_3d5=this.dynamicAttributes[idx];
if(_3d5.valSet!=null&&_3d5.htmlElement!=null){
var _3d6=_3d5.htmlElement.id;
if(!_3d6){
_3d6=_3d5.htmlElement.name;
}
if(this.fieldIsInDataView(_3d6,_3b6.name)){
var _3d7=_3d5.valSet;
for(var iix=0;iix<_3d7.length;iix++){
var _3d9=_3d5.attrValueList[iix*2];
var _3da=_3d7[iix];
if(row<_3da.length){
this.updateDynamicElement(_3d5.htmlElement,_3d9,_3da[row]);
}
}
}
}
}
var temp=new Array();
var _3dc=0;
for(var idx=0;idx<this.traversedFields.length;idx++){
var _3c5=this.traversedFields[idx];
var _3c6=_3c5.fieldId;
var desc=this.fieldDescriptors[_3c6];
if((desc.flags&(_REPEATING|_SELSET))==0||desc.dataViewName!=_3b6.name){
temp[_3dc++]=this.traversedFields[idx];
}
}
this.traversedFields=temp;
var _3dd;
if((_3b6.findCount>0&&!_3b6.isBrowsing)||!_3b6.selset){
_3dd=_3b6.lastRow;
}else{
_3dd=_3b6.selset.length;
}
if(_3dd>0){
--_3dd;
}
if(_3b6.grid){
row=_3b6.grid.getRowNumber()-1;
}
var _3bc=getAbsoluteRow(_3b6,row);
var _3de="";
if(_3b6.name!=this.formName){
_3de=_3b6.name+":";
}
this.commandStates[_3de+"FIRST_RECORD"]=_3bc!=0;
this.commandStates[_3de+"PREVIOUS_RECORD"]=_3bc!=0;
this.commandStates[_3de+"PREVIOUS_SET"]=_3bc!=0;
this.commandStates[_3de+"LAST_RECORD"]=_3bc!=_3dd||_3b6.isBrowsing;
this.commandStates[_3de+"NEXT_RECORD"]=_3bc!=_3dd||_3b6.isBrowsing;
this.commandStates[_3de+"NEXT_SET"]=_3bc!=_3dd||_3b6.isBrowsing;
if(_3b6.recordState=="stored/modified"){
_3b6.recordState="stored";
if(_3d0.dataViewName==_3b6.name){
this.updateSystemField(FIELD_RECORD_STATE,this.messageHandler.findMessage(_3b6.recordState),true,_3b6.name);
}
}
if(!_3b6.find&&(_3b6.navFlags&NAV_DELETE_ALLOWED)!=0){
if(_3b6.stored||row!=_3dd){
this.commandStates[_3de+"DELETE"]=true;
}else{
this.commandStates[_3de+"DELETE"]=false;
}
}
this.commandStates[_3de+"DELETE_RECORD"]=this.commandStates[_3de+"DELETE"];
if(_3b6.repOpt==REP_LIST&&!_3b6.grid){
this.setControlStates(false);
}
var _3d0=this.fieldDescriptors[this.currentFieldId];
if(_3d0){
var _3df=_3d0.field;
if(_3df&&(_3df.type=="text"||_3df.type=="password"||_3df.tagName=="TEXTAREA")&&_3df.select&&(this.focusType!=_CLICK||this.form.getAttribute("select_on_click")=="true")){
if(!_3df.readOnly){
_3df.select();
}else{
if(this.isIE&&_3df.isTextEdit){
var tr=_3df.createTextRange();
tr.collapse();
tr.select();
}
}
}
}
}
function getAbsoluteRow(_3e1,row){
var _3e3;
if(_3e1.grid){
if(_3e1.findCount==0){
_3e3=row;
}else{
var _3e4=Math.floor(_3e1.currentRow/_3e1.findCount);
var _3e5=_3e4*_3e1.findCount;
_3e3=_3e5+row;
}
}else{
_3e3=row;
if(_3e1.repOpt==REP_LIST&&_3e1.findCount>0){
_3e3=_3e1.currentRow;
}
}
return _3e3;
}
function doOnUnload(_3e6){
if(this.doingCommand||this.exiting||window.parent.parentUnloaded){
return;
}
if(window.parent.clientManager==null){
return;
}
if(this.isIE){
_3e6=window.event;
}
for(name in window.parent.trimWindows){
frame=window.parent.trimWindows[name];
if(frame!=null&&!frame.closed&&frame.close){
frame.close();
}
}
if(this.doingRefresh||window.parent.parentUnloaded){
return;
}
var _3e7=null;
if(this.isIE){
_3e7=window.dialogArguments;
}else{
var _3e8=window.parent.opener;
if(_3e8!=null){
_3e7=_3e8.parent.clientManager;
}
}
if(_3e7!=null){
_3e7.childWindow=null;
if(!this.useFrameset&&!this.isIE){
_3e8.setTimeout("window.parent.clientManager.doCommandInternal(\""+CMD_CANCEL_CHILDREN+"\",0,"+window.parent.clientManager.magicNum+")",0);
}else{
_3e7.doCommandInternal(CMD_CANCEL_CHILDREN,0,window.parent.clientManager.magicNum);
}
var _3e9=window.parent;
for(var ifx=0;ifx<_3e9.frames.length;ifx++){
var _3eb=_3e9.frames[ifx];
if(_3eb.document&&_3eb.name!=window.name){
_3eb.document.open();
_3eb.document.close();
}
}
window.document.open();
window.document.close();
}else{
if(!this.useFrameset){
window.name=MANAGER_ID;
var _3ec=window.location.pathname;
if(_3ec.charAt(0)!="/"){
_3ec="/"+_3ec;
}
var _3ed=_3ec.lastIndexOf("/");
var _3ee=_3ec.substring(_3ed+1);
var _3ef=window.open("exitHandler.html?"+_3ee+"&managerId="+MANAGER_ID,"_blank","width=100,height=100,left="+window.screen.width);
if(!_3ef){
this.doCommandInternal("EXIT",0,0);
}
}
}
}
function checkDisabled(_3f0){
var _3f1=this.dataViewDescriptors[0];
var _3f2=_3f0.lastIndexOf(":");
if(_3f2!=-1){
_3f1=this.getDataView(_3f0.substring(0,_3f2));
}
if(!_3f1.find){
if(!_3f1.currentRowModified){
if(this.disabledIfNotModMap&&this.disabledIfNotModMap[_3f0]){
return true;
}
}else{
if(this.disabledIfModMap&&this.disabledIfModMap[_3f0]){
return true;
}
}
}
return false;
}
function doSetButtonStates(_3f3,form,_3f5){
if(_3f3.skipButtons){
return;
}
if(!_3f3.sysInfoMap){
_3f5=true;
_3f3.sysInfoMap=new Object();
}
var _3f6=this.childWindow!=null&&!this.childWindow.closed;
var _3f7=null;
var _3f8="";
if(this.fieldDescriptors.length>0){
var _3f9=this.fieldDescriptors[this.currentFieldId];
if(_3f9){
_3f7=this.getDataView(_3f9.dataViewName);
_3f8=_3f9.name;
}
}
var _3fa=form.elements;
var _3fb=_3fa.length;
var _3fc;
var _3fd;
var type;
var _3ff=false;
for(var idx=0;idx<_3fb;idx++){
_3fc=_3fa[idx];
if(_3fc==null){
continue;
}
type=_3fc.type;
if(type=="button"&&_3fc.id){
var _401=_3fc.name.lastIndexOf(":");
var isJS=(_3fc.name.indexOf("javascript:")==0);
if(!isJS){
_3fc.window=_3f3;
_3fd=this.getCommandRelativeTo(_3fc,_3f8);
if(this.commandStates[_3fd]==null){
_3fd=getUpperCommand(_3fd);
}
var _403=this.commandStates[_3fd];
if(_403==null){
_403=false;
}
}else{
_403=true;
}
var _404=false;
if(_3f7&&_3f7.defCmdObj&&_3f7.defCmdObj.name){
var _405=this.getCommandRelativeTo(_3f7.defCmdObj,_3f8);
if(_405==_3fd){
_404=true;
}
}
_3ff=true;
var _406=false;
try{
if(_3f3.NXJ_FRAME_TARGET){
_406=true;
}
}
catch(e){
_406=true;
}
if(_3f5||_406||!_3fc.onclick){
var _407="if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.doCommand(this);}catch(e){}}"+"else{return(false);}";
this.setEventCode(_3fc,"onclick",_407,false,_406);
var _408=this.keyMap[_3fd];
if(_408){
if(_3fc.title.indexOf(_408)==-1){
_3fc.title+=" ("+_408+")";
}
}
if(_3f3.name==MAIN_FRAME){
_3fc.onfocus=new Function("if(window.parent.clientManager!=null)"+"try{window.parent.clientManager.onFocus(this)}catch(e){}");
if(_3fc.tabIndex){
this.tabElements[_3fc.tabIndex-1]=_3fc;
}
}
}
var _409=_3f6||this.exiting||this.doingCommand||_403==false||_3fc.isPastEnd;
if(!_409&&(this.disabledIfNotModMap||this.disabledIfModMap)){
_409=this.checkDisabled(_3fd);
}
_3fc.disabled=_409;
var _40a=" DEFAULT_BUTTON";
if(_404&&!_409){
if(_3fc.className.indexOf(_40a)==-1){
_3fc.className+=_40a;
}
}else{
_3fc.className=_3fc.className.replace(/\sDEFAULT_BUTTON/,"");
}
}else{
if(_3f5&&_3fc.name){
var _40b=_3fc.name;
var _401=_40b.lastIndexOf(":");
if(_401!=-1){
_40b=_40b.substring(_401+1);
}
if(sysInfoNames[_40b]){
if(_3f3.name==MAIN_FRAME){
var dv=this.findDataView(_3fc);
if(dv&&dv.name!=this.formName){
_40b=dv.name+":"+_40b;
}
}
_3f3.sysInfoMap[_40b]=_3fc;
}
}
}
}
if(!_3ff){
_3f3.skipButtons=true;
}
}
function doSetControlStates(_40d,_40e){
var _40f=this.getVisibleFrames();
var _410;
var doc;
for(var idx=0;idx<_40f.length;idx++){
try{
if(_40f[idx]==null){
continue;
}
doc=_40f[idx].document;
if(_40e){
if(this.isIE){
doc.onkeydown=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager.onKeyDownForDocument(event);}catch(e){}}"+"return false;");
}else{
doc.onkeypress=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager.onKeyDownForDocument(event);}catch(e){}}"+"return false;");
}
doc.onmousedown=new Function("event","if(window.parent.clientManager!=null)"+"{try{window.parent.clientManager.onMouseDown(event);}catch(e){}}");
doc.onhelp=function(){
return false;
};
}else{
_410=doc.forms;
for(var jdx=0;jdx<_410.length;jdx++){
if(_410[jdx].name!="CommandForm"){
this.setButtonStates(_40f[idx],_410[jdx],_40d);
}
}
this.setImageStates(_40f[idx],_40d);
this.setLinkStates(_40f[idx],_40d);
this.setComponentStates(_40f[idx],_40d);
}
}
catch(e){
}
}
if(_40e){
return;
}
var _414=this.document.getElementsByTagName("IFRAME");
for(var idx=0;idx<_414.length;idx++){
try{
if(_414[idx].contentWindow&&_414[idx].contentWindow.NXJ_FRAME_TARGET){
var _415=_414[idx].contentWindow;
if(_415.document&&_415.document.forms&&_415.document.forms.NXJForm){
var _416=_415.document.forms.NXJForm;
this.setImageStates(_415,_40d);
this.setLinkStates(_415,_40d);
this.setButtonStates(_415,_416,_40d);
}
}
}
catch(e){
}
}
}
function doSetFieldState(desc){
var _418;
var _419="";
if(desc==null||(desc.flags&_ZOOM)==0){
_418="";
}else{
_418=this.messageHandler.findMessage("ZOOM");
_419=desc.dataViewName;
}
this.updateSystemField(FIELD_ZOOM_INDICATOR,_418,true,_419);
var _41a=desc==null?0:desc.flags;
var _41b=desc==null?null:desc.helpURL;
this.commandStates[ZOOM_COMMAND]=(_41a&_ZOOM)!=0;
this.commandStates[HELP_COMMAND]=(_41a&_HELP)!=0||(_41b!=null);
if(this.focusType!=INITIAL_FOCUS_CALL&&!this.doingCommand){
this.setControlStates(false);
}
}
function doSetFocus(_41c,_41d,_41e){
if(_41c==null){
alert("no field");
return;
}
if(this.isUrlWindowOpen||window.parent.clientManager.urlWindowIsOpen){
this.isUrlWindowOpen=false;
this.hiliteField(_41c,true);
return;
}
var key=_41c.id?_41c.id:_41c.name;
var dot=key.lastIndexOf(".");
if(dot!=-1){
key=key.substr(0,dot+1);
}
var id=this.findName(key);
if(id!=null){
var desc=this.fieldDescriptors[id];
var view=this.getDataView(desc.dataViewName);
if(view.grid&&view.grid.isViewGrid){
return;
}
if(view.grid!=null&&(desc.flags&_REPEATING)!=0&&(!this.isFieldOnAnyPage(desc)||this.isFieldOnCurrentPage(desc))){
var _424;
if(view.findCount>0&&view.currentRow>=view.findCount){
_424=view.currentRow%view.findCount;
}else{
_424=view.currentRow;
}
var _425=view.grid.getSelectedRowId();
if(_425==null||!view.stored){
_425=view.grid.rowIds[_424];
}
view.grid.selectCell(_425,key);
if(_41e&&this.isIE){
if(_41c.type=="checkbox"){
var sid=view.grid.rowIds[_424];
var _427=this.removeNonRepeatingValues(view,null,_424);
view.grid.setRowValues(sid,_427);
view.grid.selectRow(sid);
}
view.grid.stopEditingCell();
view.grid.selectCell(view.grid.rowIds[_424],key);
}
return;
}
if(desc.field&&desc.field.tagName=="DIV"&&this.namesToComponents){
key=_41c.name;
if(!key){
key=desc.field.id;
}
var dp=this.namesToComponents[key];
if(dp&&dp.isDatePicker){
dp.text.focus();
return;
}
}
}
if(_41c.style.visibility=="hidden"){
return;
}
if(_41d){
this.backgroundFocus=_41c;
setTimeout("if (window.parent.clientManager != null)"+"window.parent.clientManager.setFocusInBackground()",0);
}else{
_41c.focus();
if(_41c.insertPos){
moveInsert(_41c);
}
}
}
function doSetFocusInBackground(){
if(this.backgroundFocus!=null){
try{
this.backgroundFocus.focus();
if(this.backgroundFocus.insertPos){
moveInsert(this.backgroundFocus);
}
}
catch(e){
}
this.backgroundFocus=null;
}
}
function moveInsert(_429){
var x=_429.insertPos;
_429.insertPos=0;
var tr=_429.createTextRange();
x-=tr.boundingLeft;
if(x<=0){
return;
}
var _42c=tr.boundingWidth;
var _42d=_42c;
while(x<=_42c){
tr.moveEnd("character",-1);
_42d=_42c;
_42c=tr.boundingWidth;
}
var _42e=_42d-_42c;
if(_42e>0){
var _42f=(x-_42c)*2;
if(_42f>_42e){
tr.moveEnd("character",1);
}
}
tr.setEndPoint("StartToEnd",tr);
tr.select();
}
function getActualCommand(_430){
var _431="";
if(this.fieldDescriptors.length>0){
var _432=this.fieldDescriptors[this.currentFieldId];
if(_432){
_431=_432.name;
}
}
var cmd=this.getCommandRelativeTo(_430,_431);
if(this.commandStates[cmd]==null){
cmd=getUpperCommand(cmd);
}
return cmd;
}
function getCommandRelativeTo(_434,_435){
var _436=_434.name;
var _437;
var _438=_436;
var _439=_436.indexOf(":");
if(_439!=-1){
_438=_436.substring(_439+1);
}
if(_436.indexOf("<form>")==0){
_437="";
return _438;
}else{
if(_436.indexOf("<current>")==0||_439==-1){
_437=_435;
_439=_437.lastIndexOf(":");
if(_439==-1){
return _438;
}
_437=_437.substring(0,_439);
}else{
if(_436.indexOf("<parent>")==0){
var _43a=_434.window;
var _43b=null;
if(_43a){
try{
_43b=_43a.NXJ_FRAME_TARGET;
}
catch(e){
}
}
if(_43b){
var _43c=_43a.name;
var _43d=this.document.getElementsByTagName("IFRAME");
var _43e=_43d[_43c];
if(_43e){
_437=_43c;
}
}else{
var _43f=_434.parentNode;
while(_43f!=null){
if(_43f.id){
_437=_43f.id;
break;
}
_43f=_43f.parentNode;
}
if(_43f&&_43f.id&&_43f.id.indexOf("FXGRID")!=-1){
_43f=_43f.parentNode;
_437=_43f.id;
}
}
if(!_437){
return _438;
}
var dot=_437.lastIndexOf(".");
if(dot!=-1){
_437=_437.substring(0,dot);
}
}else{
_437=_436;
if(_437.indexOf(":")==-1){
_437=_435;
_439=_437.lastIndexOf(":");
if(_439==-1){
return _438;
}
_437=_437.substring(0,_439);
}
}
}
}
var name=_437;
var _442=name.length;
while(_442!=-1){
name=name.substring(0,_442);
var _443=name+":"+_438;
if(this.commandStates[_443]==null){
_443=getUpperCommand(_443);
}
if(this.commandStates[_443]!=null){
return _443;
}
_442=name.lastIndexOf(":");
}
return _438;
}
function doMouseOver(_444){
var win=null;
var _446=null;
if(_444.ownerDocument){
win=_444.ownerDocument.parentWindow;
_446=_444.ownerDocument;
}else{
_446=_444.document;
}
if(win==null){
var _447=window.parent.frames;
for(idx=0;idx<_447.length;idx++){
if(_447[idx].document==_446){
win=_447[idx];
break;
}
}
}
if(_444&&win&&win.normalImages!=null){
var _448=_444.name;
var _449=win.disabledImages[_448];
if(_444.src.indexOf(_449)==-1){
_444.src=win.normalImagesOn[_448];
}
win.normalImages[_448]=win.normalImagesOn[_448];
}
}
function doMouseOut(_44a){
var win=null;
var _44c=null;
if(_44a.ownerDocument){
win=_44a.ownerDocument.parentWindow;
_44c=_44a.ownerDocument;
}else{
_44c=_44a.document;
}
if(win==null){
var _44d=window.parent.frames;
for(idx=0;idx<_44d.length;idx++){
if(_44d[idx].document==_44c){
win=_44d[idx];
break;
}
}
}
if(_44a&&win&&win.normalImages!=null){
var _44e=_44a.name;
var _44f=win.disabledImages[_44e];
if(_44a.src.indexOf(_44f)==-1){
_44a.src=win.normalImagesOff[_44e];
}
win.normalImages[_44e]=win.normalImagesOff[_44e];
}
}
function doSetImageStates(_450,_451){
var e;
try{
if(typeof (_450)=="undefined"||_450.skipImages){
return;
}
}
catch(e){
}
var _453;
if(_450.document){
_453=_450.document.getElementsByTagName("input");
if(_453.length==0){
_450.skipImages=true;
return;
}
}else{
return;
}
var _454=this.childWindow!=null&&!this.childWindow.closed;
var _455=_450.normalImages;
var _456=_450.disabledImages;
var _457;
var _458;
var type;
var _45a;
var _45b=_453.length;
var _45c="";
if(this.fieldDescriptors.length>0){
var _45d=this.fieldDescriptors[this.currentFieldId];
if(_45d){
_45c=_45d.name;
}
}
var _45e=false;
for(var idx=0;idx<_45b;idx++){
_457=_453[idx];
type=_457.type;
if(type=="image"&&_457.id){
var isJS=(_457.name.indexOf("javascript:")==0);
if(!isJS){
_457.window=_450;
_458=this.getCommandRelativeTo(_457,_45c);
if(this.commandStates[_458]==null){
_458=getUpperCommand(_458);
}
_45a=this.commandStates[_458];
if(_45a==null){
_45a=false;
}
}else{
_45a=true;
}
_45e=true;
var _461=false;
try{
if(_450.NXJ_FRAME_TARGET){
_461=true;
}
}
catch(e){
_461=true;
}
if(_451||_461||!_457.onclick){
var _462="if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.doCommand(this);}catch(e){}}";
this.setEventCode(_457,"onclick",_462,false,_461);
var _463=this.keyMap[_458];
if(_463){
if(_457.title.indexOf(_463)==-1){
_457.title+=" ("+_463+")";
}
}
}
if(_450.name==MAIN_FRAME&&_457.tabIndex){
this.tabElements[_457.tabIndex-1]=_457;
}
var _464=_454||this.exiting||this.doingCommand||_45a==false||_457.isPastEnd;
if(!_464&&(this.disabledIfNotModMap||this.disabledIfModMap)){
_464=this.checkDisabled(_458);
}
var _465=null;
if(_464&&_456!=null){
_465=_456[_457.name];
}else{
if(!_464&&_455!=null){
_465=_455[_457.name];
}
}
if(_465!=null){
_457.src=_465;
}else{
if(_457.id&&!_457.origImage){
if(!this.isIE&&!_457.rolloverimage){
_457.rolloverimage=_457.getAttribute("rolloverimage");
}
_457.origImage=_457.src;
if(_457.rolloverimage){
_457.onmouseover=new Function("this.src=this.rolloverimage;");
_457.onmouseout=new Function("this.src=this.origImage;");
}
}
if(_457.origImage&&_457.rolloverimage&&_461){
_457.onmouseover=new Function("this.src=this.rolloverimage;");
_457.onmouseout=new Function("this.src=this.origImage;");
}
if(_464){
var _466=" disabledImage";
_457.disabled=true;
if(_457.className.indexOf(_466)==-1){
_457.className+=_466;
}
if(_457.origImage!=undefined){
_457.src=_457.origImage;
}
}else{
_457.disabled=false;
_457.className=_457.className.replace(/\sdisabledImage/,"");
}
}
}
}
if(!_45e){
_450.skipImages=true;
}
}
function getUpperCommand(_467){
if(_467){
var _468=_467.lastIndexOf(":");
if(_468!=-1){
_467=_467.substring(0,_468)+_467.substring(_468).toUpperCase().replace(/ /g,"_");
}else{
_467=_467.toUpperCase().replace(/ /g,"_");
}
}
return _467;
}
function doSetComponentStates(_469,_46a){
if(typeof (_469)=="undefined"||!_469.namesToComponents||!_469.document){
return;
}
var _46b=this.commandStates;
for(var name in _469.namesToComponents){
var comp=_469.namesToComponents[name];
var func=comp.setEnabled;
var _46f=comp.setAllEnabled;
if(comp.setHotKeys!=null){
comp.setHotKeys(this.menubarHotKeys);
}
if(_46f){
comp.setAllEnabled();
}else{
if(func){
for(var _470 in _46b){
var _471=_46b[_470];
if(_471&&(this.disabledIfNotModMap||this.disabledIfModMap)){
_471=!this.checkDisabled(_470);
}
comp.setEnabled(_470,_471);
}
}
}
}
}
function doSetLinkStates(_472,_473){
if(typeof (_472)=="undefined"||!_472.document){
return;
}
var _474;
if(this.isIE){
_474=_472.document.anchors;
}else{
_474=_472.document.getElementsByTagName("A");
}
var _475=_474.length;
if(_475==0){
return;
}
var _476=this.childWindow!=null&&!this.childWindow.closed;
var _477=_472.normalImages;
var _478=_472.disabledImages;
var _479=_472.normalColor;
var _47a=_472.disabledColor;
var link;
var _47c;
var _47d;
var _47e;
var _47f;
var _480;
var _481;
var _482=false;
var _483=_472.document.images;
var _484;
var _485;
var _486;
var _487;
var _488="";
if(this.fieldDescriptors.length>0){
var _489=this.fieldDescriptors[this.currentFieldId];
if(_489){
_488=_489.name;
}
}
for(var idx=0;idx<_475;idx++){
link=_474[idx];
_47e=null;
_47f=null;
_480;
var isJS=(link.name.indexOf("javascript:")==0);
if(!isJS){
link.window=_472;
_47c=this.getCommandRelativeTo(link,_488);
if(this.commandStates[_47c]==null){
_47c=getUpperCommand(_47c);
}
_47d=this.commandStates[_47c];
}else{
_47d=true;
}
if(_47d==null&&!isJS){
_47d=false;
var _48c=link.isPageButton;
if(link.target=="_self"||link.target=="_top"||(!link.target&&!_48c)){
link.target="_blank";
}
if(!link.origImage&&link.href.length>0){
link.origImage=true;
if(!this.isIE){
link.rolloverimage=link.getAttribute("rolloverimage");
}
_487=link.getElementsByTagName("IMG");
for(var _48d=0;_48d<_487.length;_48d++){
_487[_48d].rolloverimage=link.rolloverimage;
_487[_48d].origImage=_487[_48d].src;
if(_487[_48d].rolloverimage){
_487[_48d].onmouseover=new Function("this.src=this.rolloverimage;");
_487[_48d].onmouseout=new Function("this.src=this.origImage;");
}
}
}
if(!link.name){
if(!_48c){
if(!link.isNav){
link.onclick=null;
link.disabled=link.isPastEnd;
}
if(!link.href){
link.disabled=true;
}
if(link.disabled){
link.onclick=new Function("return false;");
if(link.isNav){
link.style.color="GrayText";
}
}
}
continue;
}
}
link.href="#";
link.target="";
link.oncontextmenu=new Function("return false;");
_481="if(window.parent.clientManager!=null"+"&&window.parent.clientManager.doCommand!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.doCommand(this);return(false);}catch(e){}}";
_482=false;
if((this.isIE||link.isNav)&&(_472.name=="menu"||_472.name=="vertmenu"||_472.NXJ_FRAME_TARGET||link.isInGrid||link.name.indexOf("NEXT_SET")!=-1||link.name.indexOf("PREVIOUS_SET")!=-1||link.name.indexOf("COFGR")!=-1)){
_482=true;
}
this.setEventCode(link,"onclick",_481,false,_482);
if((_473||!link.onfocus)&&_472.name==MAIN_FRAME){
link.onfocus=new Function("if(window.parent.clientManager!=null)"+"try{window.parent.clientManager.onFocus(this)}catch(e){}");
if(link.tabIndex){
this.tabElements[link.tabIndex-1]=link;
}
}
_480=_476||this.exiting||this.doingCommand||_47d==false||link.isPastEnd;
if(!_480&&(this.disabledIfNotModMap||this.disabledIfModMap)){
_480=this.checkDisabled(_47c);
}
link.disabled=_480;
if(_480&&_478!=null){
_47e=_478[link.name];
}else{
if(!_480&&_477!=null){
_47e=_477[link.name];
}
}
_47f=_480?_47a:_479;
_484=_483[_47c];
_485;
_486=this.keyMap[_47c];
if(_473&&_486){
if(_484!=null){
if(_484.title.indexOf(_486)==-1){
_484.title+=" ("+_486+")";
}
}else{
if(link.title.indexOf(_486)==-1){
link.title+=" ("+_486+")";
}
}
}
if(this.isIE){
_487=link.children;
for(var jdx=0;jdx<_487.length;jdx++){
if(_487[jdx].tagName=="IMG"){
_484=_487[jdx];
break;
}else{
if(_487[jdx].tagName=="SPAN"){
_485=_487[jdx];
break;
}
}
}
}else{
if(!_484){
_487=link.getElementsByTagName("IMG");
if(_487.length==1){
_484=_487[0];
}
}
}
if(_47e!=null&&_484!=null){
_484.src=_47e;
_484.onmouseover=new Function("return doMouseOver(this);");
_484.onmouseout=new Function("return doMouseOut(this);");
continue;
}
if(_484&&!_484.origImage){
if(!this.isIE){
_484.rolloverimage=link.getAttribute("rolloverimage");
}else{
_484.rolloverimage=link.rolloverimage;
}
_484.origImage=_484.src;
if(_484.rolloverimage){
_484.onmouseover=new Function("if(!this.disabled)this.src=this.rolloverimage;");
_484.onmouseout=new Function("if(!this.disabled)this.src=this.origImage;");
}
}
if(_484&&_484.origImage&&_484.rolloverimage&&_482){
_484.onmouseover=new Function("if(!this.disabled)this.src=this.rolloverimage;");
_484.onmouseout=new Function("if(!this.disabled)this.src=this.origImage;");
}
if(_480){
if(link.isNav){
link.style.color="GrayText";
}
var _48f=" disabledImage";
if(link.className.indexOf(_48f)==-1){
link.className+=_48f;
}
if(_484&&_484.className.indexOf(_48f)==-1){
_484.className+=_48f;
_484.disabled=true;
if(_484.origImage!=undefined){
_484.src=_484.origImage;
}
}
}else{
if(link.isNav){
link.style.color="";
}
link.className=link.className.replace(/\sdisabledImage/,"");
if(_484){
_484.className=_484.className.replace(/\sdisabledImage/,"");
_484.disabled=false;
}
}
if(_485!=null&&_47f!=null){
_485.style.color=_47f;
if(_480){
_485.style.backgroundColor="transparent";
}
continue;
}
if(_47f!=null){
link.style.color=_47f;
if(_480){
link.style.backgroundColor="transparent";
}
continue;
}
}
}
function doSetListboxSelection(_490,row,_492,_493,_494){
if(_490.grid!=null){
_490.grid.selectRowFromIndex(row);
this.onListChangeTo(_490,row,_493,_494);
return;
}
var _495=this.findRepeatingArea(_490);
if(_495!=null){
var _496=_495.length;
var xrow=Math.max(0,Math.min(row,_496-1));
gridSelectRow(_495,xrow,_492);
}
this.onListChangeTo(_490,row,_493,_494);
}
function doSetTabIndices(){
if(this.fieldDescriptors.length==0){
return;
}
var _498=false;
if(!this.keyMap[TAB_ID]||!this.keyMap[BACKTAB_ID]){
_498=true;
}
if(_498){
var all=this.form.getElementsByTagName("*");
if(all){
if(this.isReuse){
for(var idx=all.length-1;idx>=0;idx--){
if(all[idx].tabIndex>0){
this.tabElements[all[idx].tabIndex-1]=all[idx];
break;
}
}
}else{
var _49b=1;
for(var idx=0;idx<all.length;idx++){
if(this.isElementTabbable(all[idx],true)){
all[idx].tabIndex=_49b++;
this.tabElements[this.tabElements.length]=all[idx];
}
}
}
}
}
var _49c=this.firstFieldId;
_49b=1;
this.lastFieldId=this.firstFieldId;
var _49d=0;
do{
desc=this.fieldDescriptors[_49c];
if(desc==null){
break;
}
if(desc.field!=null){
if(_49b==1){
this.firstFieldId=_49c;
desc.flags|=_FIRST;
}
if(!_498){
desc.field.tabIndex=_49b++;
}
_49b++;
this.lastFieldId=_49c;
}
_49d++;
_49c=desc.nextFieldId;
}while(_49c!=this.firstFieldId&&_49d<=this.fieldDescriptors.length);
this.fieldDescriptors[this.lastFieldId].flags|=_LAST;
}
function doSetValue(_49e,_49f,_4a0){
if(_49e==null){
return;
}else{
if(_49e.tagName=="INPUT"){
if(_49e.type=="checkbox"){
var _4a1=false;
if(_49f=="true"||_49f==this.validator.true_format){
_4a1=true;
}else{
var _4a2=_49e.name;
var dot=_4a2.lastIndexOf(".");
if(dot!=-1){
_4a2=_4a2.substr(0,dot+1);
}
var _4a4=this.findName(_4a2);
if(_4a4!=undefined){
var desc=this.fieldDescriptors[_4a4];
if(desc.checkboxOnValues){
var _4a6=desc.checkboxOnValues.split(";");
for(var idx=0;idx<_4a6.length;idx++){
if(_4a6[idx]==_49f){
_4a1=true;
break;
}else{
if(desc.type==TYPE_FLOAT){
var ex;
try{
var _4a9=parseFloat(_49f);
var _4aa=parseFloat(_4a6[idx]);
if(!isNaN(_4aa)&&!isNaN(_4a9)){
if(_4aa==_4a9){
_4a1=true;
break;
}
}
}
catch(ex){
}
}
}
}
}
if(!_4a1&&desc.checkboxStoreFormat&&desc.type!=TYPE_BOOL){
var _4a6=desc.checkboxStoreFormat.split("/");
if(_4a6.length>0){
if(_4a6[0]==_49f){
_4a1=true;
}
}
}
if(!_4a1&&_49f==""&&_49e.name==_4a2){
var dv=this.getDataView(desc.dataViewName);
if(dv&&dv.find){
_4a1=true;
_49e.indeterminate=true;
if(!this.isIE){
var _4ac=" disabledImage";
if(_49e.className.indexOf(_4ac)==-1){
_49e.className+=_4ac;
}
}
}
}
}
}
_49e.checked=_4a1;
}else{
if(_49e.type=="radio"){
var _4ad=this.findFields(_49e.name);
for(var idx=0;idx<_4ad.length;idx++){
_4ad[idx].checked=_4ad[idx].value==_49f;
}
}else{
if(_49e.type!="file"){
if(typeof (_49f)=="undefined"){
_49f="";
}
var _4ae=_49f.length;
while(_4ae>0&&SPACE_RE.test(_49f.charAt(_4ae-1))){
_4ae--;
}
_49e.value=_49f.substring(0,_4ae);
if(this.namesToComponents&&this.namesToComponents[_49e.name]&&this.namesToComponents[_49e.name].isCombo){
var _4af=this.namesToComponents[_49e.name];
if(_4af.div.setValue){
_4af.div.setValue(_49e.value);
}
}
}
}
}
}else{
if(_49e.tagName=="SELECT"){
if(_49e.multiple){
var _4b0=_49f.split(";");
for(var idx=0;idx<_49e.options.length;idx++){
val=_49e.options[idx].value;
var _4b1=false;
for(var _4b2=0;_4b2<_4b0.length;_4b2++){
if(val==_4b0[_4b2]){
_4b1=true;
break;
}
}
_49e.options[idx].selected=_4b1;
}
}else{
var sel=-1;
var val;
for(var idx=0;idx<_49e.options.length;idx++){
val=_49e.options[idx].value;
if(val==_49f||(!val&&_49e.options[idx].text==_49f)){
sel=idx;
break;
}
}
if(sel==-1&&typeof (_4a0)!="undefined"){
for(var idx=0;idx<_49e.options.length;idx++){
val=_49e.options[idx].value;
if(val==_4a0||(!val&&_49e.options[idx].text==_4a0)){
sel=idx;
break;
}
}
}
_49e.selectedIndex=sel;
}
}else{
if(_49e.tagName=="TEXTAREA"){
_49e.value=_49f;
}else{
if(_49e.tagName=="DIV"&&_49e.setValue){
_49e.setValue(_49f);
}else{
var text="";
var vlen=typeof (_49f)!="undefined"?_49f.length:0;
for(var idx=0;idx<vlen;idx++){
var chr=_49f.charAt(idx);
if(chr=="<"){
text+=HTML_LTHAN;
}else{
if(chr==">"){
text+=HTML_GTHAN;
}else{
if(chr=="&"){
text+=HTML_AMPERSAND;
}else{
if(chr=="\""){
text+=HTML_DQUOTE;
}else{
if(chr=="'"){
text+=HTML_SQUOTE;
}else{
if(chr==" "){
text+=NON_BREAKING_SPACE;
}else{
text+=chr;
}
}
}
}
}
}
}
_49e.innerHTML=text;
}
}
}
}
}
var _4a2=_49e.name?_49e.name:_49e.id;
var dot=_4a2.lastIndexOf(".");
if(dot!=-1){
_4a2=_4a2.substring(0,dot+1);
var _4a4=this.findName(_4a2);
if(_4a4!=undefined){
var desc=this.fieldDescriptors[_4a4];
if(desc.onvalchanges){
for(var idx=0;idx<desc.onvalchanges.length;idx++){
desc.onvalchanges[idx](_49e);
}
}
}
}
}
function doUpdateSystemField(name,_4b9,_4ba,_4bb,_4bc){
if(name==FIELD_FYI_MESSAGE){
window.status=_4b9;
}
if(_4bc){
this.updateSysFieldInFrame(name,_4b9,_4bb,_4bc);
return;
}
var _4bd=this.getVisibleFrames();
var _4be;
for(var idx=0;idx<_4bd.length;idx++){
_4be=_4bd[idx];
if(_4be==null){
continue;
}
this.updateSysFieldInFrame(name,_4b9,_4bb,_4be);
}
}
ClientManager.prototype.updateSysFieldInFrame=function(name,_4c1,_4c2,_4c3){
var _4c4;
if(!_4c3.isMain||_4c2==this.formName){
if(_4c3.sysInfoMap){
_4c4=_4c3.sysInfoMap[name];
}
if(_4c4==null){
_4c4=this.findFieldInFrame(_4c3,name);
}
if(_4c4!=null){
if(this.userInfo[name]&&(_4c4.tagName=="SPAN"||_4c4.tagName=="DIV")){
_4c4.innerHTML=_4c1;
}else{
this.setValue(_4c4,_4c1);
}
if(_4c3.isMain){
var fidx=this.findName(name);
if(fidx!=undefined){
var desc=this.fieldDescriptors[fidx];
if(desc&&desc.values&&desc.values.length){
desc.values[0]=_4c1;
}
}
}
}
}
if(_4c3.sysInfoMap){
_4c4=_4c3.sysInfoMap[_4c2+":"+name];
}
if(_4c4==null){
_4c4=this.findFieldInFrame(_4c3,_4c2+":"+name);
}
if(_4c4!=null){
if(this.userInfo[name]&&(_4c4.tagName=="SPAN"||_4c4.tagName=="DIV")){
_4c4.innerHTML=_4c1;
}else{
this.setValue(_4c4,_4c1);
}
}
};
function findNameFromNameIDArray(name){
if(name==null){
return null;
}
if(this.caseInsensitive){
name=name.toUpperCase();
}
return this.nameToId[name];
}
function doUpdateSystemFields(_4c8){
var _4c9;
var _4ca;
var _4cb;
var _4cc;
var fyi;
var _4ce=null;
if(this.fieldDescriptors.length==0||this.currentFieldId==undefined||this.currentFieldId==null||this.fieldDescriptors.length<this.currentFieldId){
_4cc=0;
fyi="";
if(this.dataViewDescriptors&&this.dataViewDescriptors.length){
_4ce=this.dataViewDescriptors[0];
}
}else{
var desc=this.fieldDescriptors[this.currentFieldId];
_4cc=desc.flags;
fyi=desc.fyiMessage;
_4ce=this.getDataView(desc.dataViewName);
}
if(_4ce){
_4c9=(_4cc&_ZOOM)==0?"":this.messageHandler.findMessage("ZOOM");
_4ca=_4ce.find?this.messageHandler.findMessage("FIND"):this.messageHandler.findMessage("UPDATE");
_4cb=this.messageHandler.findMessage(_4ce.recordAction);
var _4d0;
if(_4c8){
_4d0=new Array(_4c8);
}else{
_4d0=this.getVisibleFrames();
}
for(var idx=0;idx<_4d0.length;idx++){
frame=_4d0[idx];
this.updateSystemField(FIELD_FYI_MESSAGE,fyi,true,_4ce.name,frame);
this.updateSystemField(FIELD_RECORD_ACTION,_4cb,true,_4ce.name,frame);
this.updateSystemField(FIELD_RECORD_COUNT,_4ce.recordCount==""?"":this.messageHandler.findMessage("RECORD_COUNT")+_4ce.recordCount,true,_4ce.name,frame);
this.updateSystemField(FIELD_FORM_MODE,_4ca,true,_4ce.name,frame);
this.updateSystemField(FIELD_RECORD_NUMBER,_4ce.recordNumber==""?"":this.messageHandler.findMessage("RECORD_NUMBER")+_4ce.recordNumber,true,_4ce.name,frame);
this.updateSystemField(FIELD_RECORD_STATE,this.messageHandler.findMessage(_4ce.recordState),true,_4ce.name,frame);
this.updateSystemField(FIELD_ZOOM_INDICATOR,_4c9,true,_4ce.name,frame);
for(var _4d2 in this.userInfo){
this.updateSystemField(_4d2,this.userInfo[_4d2],true,_4ce.name,frame);
}
}
}
var _4d3=this.useFrameset?window.parent.frames[MAIN_FRAME]:window;
_4d3.isMain=true;
if((!_4c8||_4c8==_4d3)&&this.dataViewDescriptors.length>1){
for(var idx=0;idx<this.dataViewDescriptors.length;idx++){
var dv=this.dataViewDescriptors[idx];
if(dv==_4ce){
continue;
}
_4cb=this.messageHandler.findMessage(dv.recordAction);
_4ca=dv.find?this.messageHandler.findMessage("FIND"):this.messageHandler.findMessage("UPDATE");
this.updateSystemField(FIELD_RECORD_ACTION,_4cb,true,dv.name,_4d3);
this.updateSystemField(FIELD_RECORD_COUNT,dv.recordCount==""?"":this.messageHandler.findMessage("RECORD_COUNT")+dv.recordCount,true,dv.name,_4d3);
this.updateSystemField(FIELD_FORM_MODE,_4ca,true,dv.name,_4d3);
this.updateSystemField(FIELD_RECORD_NUMBER,dv.recordNumber==""?"":this.messageHandler.findMessage("RECORD_NUMBER")+dv.recordNumber,true,dv.name,_4d3);
this.updateSystemField(FIELD_RECORD_STATE,this.messageHandler.findMessage(dv.recordState),true,dv.name,_4d3);
}
}
}
function fieldIsInDataView(_4d5,_4d6){
var _4d7=this.findName(_4d5);
if(_4d7==null){
var _4d8=this.document.getElementById(_4d5);
if(_4d8){
var dv=this.findDataView(_4d8);
if(dv&&dv.name==_4d6){
return true;
}else{
return false;
}
}
}else{
var _4da=this.fieldDescriptors[_4d7];
if(_4da.dataViewName!=_4d6){
return false;
}
}
return true;
}
function doRemoveNonRepeatingValues(_4db,_4dc,row){
var _4de=new Array();
var _4df=_4db.name;
for(var col=0;col<this.cellDescriptors.length;col++){
var _4e1=this.cellDescriptors[col];
var _4e2=this.findName(_4e1.name);
var _4e3=this.fieldDescriptors[_4e2];
if(this.fieldIsInDataView(_4e1.name,_4df)){
if(_4e3&&_4db.find){
_4de[_4de.length]=_4db.selset[row][_4e3.selSetIndex];
}else{
if(_4e3&&(_4e3.flags&_REPEATING)!=0){
if(_4dc){
_4de[_4de.length]=_4dc[_4e3.selSetIndex];
}else{
if(_4e3.field){
_4de[_4de.length]=this.getValue(_4e3.field);
}else{
if(_4db.selset[row]){
_4de[_4de.length]=_4db.selset[row][_4e3.selSetIndex];
}
}
}
}else{
if(this.dynamicAttributes[_4e1.name]){
var _4e4=this.dynamicAttributes[_4e1.name];
if(_4e4.valSet!=null){
var _4e5=_4e4.valSet;
var _4e6="";
for(var iix=0;iix<_4e5.length;iix++){
var _4e8=_4e4.attrValueList[iix*2];
var _4e9=_4e5[iix];
if(row<_4e9.length){
_4e6=_4e9[row];
}else{
_4e6=_4e4.attrValueList[1];
}
if(_4e8=="innerHTML"||_4e4.attrValueList.length<=2){
break;
}
}
_4de[_4de.length]=_4e6;
}
}
}
}
}
}
return _4de;
}
function doGridBeforeChange(_4ea,_4eb,_4ec){
var desc=_4ea.fieldDescriptors[_4ea.currentFieldId];
var view=_4ea.getDataView(desc.dataViewName);
if(!view.grid||view.grid!=this){
var col=this.editCol;
if(typeof (col)!="undefined"){
var _4f0=this.colIndexToColId[col];
var _4f1=this.columns[_4f0].fieldId;
this.cancelEditingCell();
var _4f2;
if(_4eb.findCount>0&&_4eb.currentRow>=_4eb.findCount){
_4f2=_4eb.currentRow%_4eb.findCount;
}else{
_4f2=_4eb.currentRow;
}
this.selectCell(this.rowIds[_4f2],_4f1);
}
return null;
}
_4ea.setValue(desc.field,_4ec);
if(_4ea.accept()){
if(_4ea.displayValue==null){
return _4ec;
}else{
return _4ea.displayValue;
}
}else{
return null;
}
}
function doGridOnNextRecord(_4f3,_4f4){
var _4f5="";
if(_4f4.name!=_4f3.formName){
_4f5=_4f4.name+":";
}
if(_4f3.commandStates[_4f5+"NEXT_RECORD"]){
_4f3.doCommandInternal(_4f5+"NEXT_RECORD",_4f3.currentFieldId,_4f4.currentRow);
}
}
function doGridOnPreviousRecord(_4f6,_4f7){
var _4f8="";
if(_4f7.name!=_4f6.formName){
_4f8=_4f7.name+":";
}
if(_4f6.commandStates[_4f8+"PREVIOUS_RECORD"]){
_4f6.doCommandInternal(_4f8+"PREVIOUS_RECORD",_4f6.currentFieldId,_4f7.currentRow);
}
}
function doGridOnShow(_4f9,_4fa,_4fb,_4fc,_4fd){
var _4fe;
if(_4fa.findCount==0){
_4fe=_4fb;
}else{
var _4ff=Math.floor(_4fa.currentRow/_4fa.findCount);
var _500=_4ff*_4fa.findCount;
_4fe=_500+_4fb;
}
var _501=_4f9.fieldDescriptors[_4f9.currentFieldId];
var _502=_501.field;
if(typeof (_4f9.savedValue)=="undefined"){
_4f9.savedValue=_4f9.getValue(_502);
}
if(_4fe!=_4fa.currentRow&&!_4fa.isBatch&&(_4fa.isImmediate||(_4fa.hasNextOrPrev&&_4fa.currentRowModified))){
var fidx=_4f9.currentFieldId;
var _504=_4f9.fieldDescriptors;
for(var idx=0;idx<_504.length;idx++){
if(_504[idx].name==_4fd){
fidx=idx;
break;
}
}
this.cancelEditingCell();
_4f9.doCommandInternal(CMD_CLICK_ON_FIELD,fidx,_4fe);
return true;
}else{
var _506=_4f9.document.getElementById(_4fd);
if(_506==null){
_506=_4f9.isIE?_4f9.document.all[_4fd]:window.document.getElementsByName(_4fd)[0];
}
if(_506==null){
var all=window.parent.mainFrame.document.all;
if(!all){
all=window.parent.mainFrame.document.getElementsByTagName("*");
}
if(all){
_506=all[_4fd];
}
}
if(_506==null){
var _508="";
for(x in window.parent.mainFrame.document.all){
_508+=" "+x;
}
alert("no field for "+_4fd+" "+_508);
return;
}
if(_506.tagName=="DIV"){
_506.name=_506.id;
}
_4fa.rowNumber=_4fb;
_4f9.focusType=NATURAL_ORDER_TAB;
if(_4fe!=_4fa.currentRow){
var _509=_4fa.currentRowModified;
var _50a=_4fa.currentRow;
if(_4fa.findCount){
_50a=_50a%_4fa.findCount;
}
_4f9.focusType=_CLICK;
_4f9.onListChangeTo(_4fa,_4fb,CMD_CLICK_ON_FIELD,_501);
if(_4f9.doingCommand){
return;
}
if(_509&&!_4fa.isBatch){
var sid=_4fa.grid.rowIds[_50a];
var _50c=_4fa.selset[_50a];
var _50d=_4f9.removeNonRepeatingValues(_4fa,_50c,_50a);
_4fa.grid.setRowValues(sid,_50d);
_4f9.setFocus(_506);
}
}
_4f9.onFocus(_506);
_501=_4f9.fieldDescriptors[_4f9.currentFieldId];
return _506.name==_501.name;
}
}
function doInitializeRepeatingArea(_50e,_50f){
if(_50e.repOpt!=REP_LIST||_50e.grid!=null){
if(_50e.grid){
var grid=_50e.grid;
grid.onShow=doGridOnShow;
grid.beforeChange=doGridBeforeChange;
grid.onNextRecord=doGridOnNextRecord;
grid.onPreviousRecord=doGridOnPreviousRecord;
grid.dataView=_50e;
grid.clientManager=this;
}
return;
}
var _511=_50e.name;
var dot=_511.lastIndexOf(".");
if(dot!=-1){
_511=_511.substring(dot+1);
}
var name=_511+"_FXGRID";
var grid=this.namesToComponents[name];
if(grid==null){
for(var name in this.namesToComponents){
if(name.indexOf("_FXGRID")==-1){
continue;
}
var _514=this.document.getElementById(name);
if(_514&&this.findDataView(_514)==_50e){
grid=this.namesToComponents[name];
break;
}
}
}
if(grid!=null){
if(!grid.outerDiv){
this.namesToComponents[name]=null;
}else{
_50e.grid=grid;
grid.onShow=doGridOnShow;
grid.beforeChange=doGridBeforeChange;
grid.onNextRecord=doGridOnNextRecord;
grid.onPreviousRecord=doGridOnPreviousRecord;
grid.dataView=_50e;
grid.clientManager=this;
}
}
}
function getContextPath(){
var _515=window.location.pathname;
if(_515.substring(0,1)!="/"){
_515="/"+_515;
}
var _516=_515.lastIndexOf("/");
_515=_515.substring(0,_516+1);
return _515;
}
ClientManager.prototype.populateHandler=function(_517){
eval(_517.responseText);
};
ClientManager.prototype.delayedPopulate=function(_518,_519){
_518.hasSelset=true;
var url=getContextPath()+"nxjAjax";
var _51b=new Object();
_51b.controlId="nxjClientManager";
this.namesToComponents["nxjClientManager"]=this;
_51b.parameters="controlId="+_518.name+"&managerId="+MANAGER_ID;
_51b.onComplete=this.populateHandler;
this.makeAjaxRequest(url,_51b);
};
ClientManager.prototype.populateRepeatingArea=function(_51c,_51d){
if(_51c.grid&&_51c.grid.isViewGrid){
if(_51c.selMode==SEL_DELETE_CURRENT){
_51c.grid.removeDeletedRow();
}else{
if(_51d==MAIN_FRAME&&_51c.currentRow>0){
_51c.grid.setSelectedRow(_51c.currentRow);
}else{
if(_51c.isViewModified){
_51c.grid.refreshChecked();
}
}
}
return;
}
if((_51c.grid||this.findRepeatingArea(_51c)!=null)&&!_51c.hasSelset&&_51c.selMode==SEL_REPLACE){
this.delayedPopulate(_51c,_51d);
return;
}
var _51e=_51c.selset;
var _51f=_51c.selMode;
var _520=_51c.name;
var slot=0;
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==_520&&(desc.flags&(_REPEATING|_SELSET))!=0){
desc.selSetIndex=slot++;
if(_51c.grid&&(desc.flags&_REPEATING)){
var _524=this.fieldDescriptors[desc.nextFieldId];
if(_524.dataViewName!=_51c.name||(_524.flags&_REPEATING)==0){
_51c.grid.nextFieldId=desc.nextFieldId;
}
var _525=this.fieldDescriptors[desc.prevFieldId];
if(_525.dataViewName!=_51c.name||(_525.flags&_REPEATING)==0){
_51c.grid.prevFieldId=desc.prevFieldId;
}
}
}
}
if(_51c.grid!=null){
if(_51c.find){
_51c.grid.clearSortCol();
}
var _526=_51c.currentRow;
if(_51c.findCount>0){
_526=_526%_51c.findCount;
}
switch(_51c.selMode){
case SEL_CHANGE_RECORD:
if(!_51c.find&&_51c.grid.getRowCount()>_51c.selset.length){
var row=_51c.grid.rowIds[_51c.selset.length];
_51c.grid.removeRow(row);
}
break;
case SEL_NO_CHANGE:
case SEL_UPDATE_CURRENT:
var sid=_51c.grid.rowIds[_526];
var _529=_51c.selset[_526];
var _52a=this.removeNonRepeatingValues(_51c,_529,_526);
_51c.grid.setRowValues(sid,_52a);
break;
case SEL_OLD:
var _52b=_51c.prevCurrentRow;
if(_51c.findCount>0){
_52b=_52b%_51c.findCount;
}
var sid=_51c.grid.rowIds[_52b];
var _529=_51c.selset[_52b];
var _52a=this.removeNonRepeatingValues(_51c,_529,_52b);
_51c.grid.setRowValues(sid,_52a);
break;
case SEL_DELETE_CURRENT:
var sid=_51c.grid.rowIds[_526];
if(_51c.atEnd&&_51c.selset.length>0){
sid=_51c.grid.rowIds[_526+1];
}
if(_51c.currentRow==_51c.selset.length){
_51c.currentRow--;
}
_51c.grid.removeRow(sid);
break;
case SEL_ADD:
var _529=_51c.selset[_51c.currentRow];
var _52a=this.removeNonRepeatingValues(_51c,_529,_51c.currentRow);
if(_51c.currentRow==0){
var row=_51c.grid.rowIds[_51c.currentRow];
var sid=_51c.grid.rowIds[row];
_51c.grid.removeRow(sid);
_51c.grid.nextRowId=0;
}
_51c.grid.addRow(_52a);
break;
case SEL_REPLACE:
var _52c=new Array();
for(var row=0;row<_51c.selset.length;row++){
_52c[row]=this.removeNonRepeatingValues(_51c,_51c.selset[row],row);
}
var _52d=_51c.currentRow;
this.populatingGrid=true;
_51c.grid.populate(_52c);
this.populatingGrid=false;
_51c.currentRow=_52d;
break;
}
var _52e;
if(_51c.findCount>0&&_51c.currentRow>=_51c.findCount){
_52e=_51c.currentRow%_51c.findCount;
}else{
_52e=_51c.currentRow;
}
_51c.grid.selectRow(_51c.grid.rowIds[_52e]);
_51c.grid.deferredClick=null;
return;
}
var _52f=this.findRepeatingArea(_51c);
if(_52f==null){
return;
}
if(!this.isIE){
_52f.style.overflow="auto";
}
_52f.style.display="inline";
_52f.dataView=_51c;
_52f.onmousedown=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{window.parent.clientManager.onMouseDown(event);}catch(e){}}");
this.onGridClick=onGridClick;
if(_51c.selset.length==0&&window.name!=MAIN_FRAME){
_52f.innerHTML="";
_52f.ncols=0;
}
var _530=this.document.createElement("div");
var _531=0;
var _532=_51c.selset.length-1;
var _533=false;
if(!this.refreshedFrameset){
switch(_51c.selMode){
case SEL_NO_CHANGE:
case SEL_CHANGE_RECORD:
case SEL_UPDATE_CURRENT:
var _526=_51c.currentRow;
if(_51c.findCount){
_526=_526%_51c.findCount;
}
_531=_526;
_532=_526;
break;
case SEL_OLD:
var _526=_51c.currentRow;
var _534=_51c.prevCurrentRow;
if(_51c.findCount){
_526=_526%_51c.findCount;
}
_531=Math.min(_526,_534);
_532=Math.max(_526,_534);
break;
case SEL_DELETE_CURRENT:
_531=_51c.currentRow;
if(_532-_531>150){
_531=0;
_533=true;
_52f.innerHTML="";
_52f.length=0;
}
break;
case SEL_ADD:
_531=_51c.currentRow;
if(_52f.childNodes.length==0){
_533=true;
}else{
_530=_52f.childNodes[0];
}
break;
case SEL_REPLACE:
_533=true;
_52f.innerHTML="";
_52f.length=0;
break;
}
}else{
_533=true;
_52f.innerHTML="";
_52f.length=0;
}
var _535=_52f.parentNode.parentNode;
_52f.rowStyle=_535.getAttribute("row_class");
_52f.altRowStyle=_535.getAttribute("altRowClass");
_52f.selRowStyle=_535.getAttribute("selected_row_class");
if(!_52f.selRowStyle){
_52f.selRowStyle="UNIFY_DEFAULT_SELECTED_ROW";
}
_52f.style.cursor="default";
var _536=parseInt(_52f.getAttribute("cellHeight"));
_52f.size=parseInt(_52f.getAttribute("size"));
var _537=_52f.all;
if(!_537){
_537=_52f.getElementsByTagName("DIV");
}
var _538;
var _539;
var _53a=0;
for(var row=_531;row<=_532;row++){
_53a=0;
for(var col=0;col<this.cellDescriptors.length;col++){
var _53c=this.cellDescriptors[col];
var _53d=this.findName(_53c.name);
var _53e="";
if(!this.fieldIsInDataView(_53c.name,_520)){
continue;
}
if(_53d!=null){
var _53f=this.fieldDescriptors[_53d];
if(!_51c.find){
_53e=(_53f.flags&_REPEATING)==0?this.getValue(_53f.field):_51c.selset[row][_53f.selSetIndex];
}
if((_53f.flags&_ECHOED)==0){
var _540="";
for(var idx=0;idx<_53e.length;idx++){
_540+="*";
}
_53e=_540;
}
}else{
if(this.dynamicAttributes[_53c.name]){
var _541=this.dynamicAttributes[_53c.name];
if(_541.valSet!=null){
var _542=_541.valSet;
for(var iix=0;iix<_542.length;iix++){
var _544=_541.attrValueList[iix*2];
if(_544!="href"&&_544!="src"){
var _545=_542[iix];
if(row<_545.length){
_53e=_545[row];
}else{
_53e=_541.attrValueList[1];
}
break;
}
}
}
}
}
if(_53e==undefined){
_53e="";
}
var _546=_52f.id+"."+row+"."+_53a++;
_538=_537[_546];
if(!_538){
_538=this.document.createElement("DIV");
_538.id=_546;
_538.style.cssText="position:absolute;overflow:hidden;top:"+row*_536+";left:"+_53c.x+";width:"+_53c.width+";height:"+_536;
_538.className=(row%2==0?_52f.rowStyle:_52f.altRowStyle);
_539=this.document.createElement("DIV");
_539.id=_546+".val";
_539.style.cssText="width:"+_53c.valwidth+";overflow:hidden";
if(_53c.displayJustify==CENTER_JUSTIFIED){
_539.style.textAlign="center";
}else{
if(_53c.displayJustify==RIGHT_JUSTIFIED){
_539.style.textAlign="right";
}
}
_539.noWrap=true;
_538=_530.appendChild(_538);
_538.appendChild(_539);
_539.appendChild(this.document.createTextNode(_53e));
}else{
_539=_538.childNodes[0];
_539.replaceChild(this.document.createTextNode(_53e),_539.childNodes[0]);
_538.className=(row%2==0?_52f.rowStyle:_52f.altRowStyle);
}
}
_52f.ncols=_53a;
}
if(_533){
if(_52f.childNodes.length>0){
_52f.replaceChild(_530,_52f.childNodes[0]);
}else{
_52f.appendChild(_530);
}
}
if(_52f.childNodes.length!=0){
_52f.childNodes[0].onclick=new Function("event","if(window.parent.clientManager!=null&&window.parent.clientManager.eventsOK)"+"{try{return window.parent.clientManager.onGridClick(this,event);}catch(e){}}"+"return false;");
}
if(typeof (_52f.selRow)=="undefined"){
_52f.selRow=-1;
}
var _547=_52f.length;
var _546;
_52f.length=_51c.selset.length;
for(var row=_52f.length;row<_547;row++){
for(var col=0;col<_52f.ncols;col++){
_546=_52f.id+"."+row+"."+col;
if(_537[_546]&&_52f.childNodes.length>0){
_52f.childNodes[0].removeChild(_537[_546]);
}
}
}
if(_51c.findCount>0&&_51c.currentRow>=_51c.findCount){
var _548=_51c.currentRow%_51c.findCount;
gridSelectRow(_52f,_548,true);
}else{
gridSelectRow(_52f,_51c.currentRow,true);
}
if(_51c.selMode==SEL_ADD&&!_533){
scrollGridIntoView(_51c,_52f,_531);
}
};
function onGridClick(div,_54a){
var grid=div.parentNode;
var _54c=this.fieldDescriptors[this.currentFieldId];
var _54d=false;
if(_54c.dataViewName!=grid.dataView.name){
if(!this.accept()){
return false;
}
_54d=true;
}else{
if(!this.accept()){
return false;
}
}
if(this.isIE){
div=window.event.srcElement;
}else{
div=_54a.target;
}
var _54e=div.id;
if(!_54e){
return false;
}
var _54f=_54e.lastIndexOf(".val");
if(_54f!=-1){
_54e=_54e.substring(0,_54f);
}
_54f=_54e.lastIndexOf(".");
var _550=_54e.substring(0,_54f);
var _551=_550.lastIndexOf(".");
var _552=_550.substring(_551+1);
var _553=null;
if(grid.dataView.isBatch){
_553=CMD_CLICK_ON_FIELD;
}
this.setListboxSelection(grid.dataView,parseInt(_552),true,_553);
if(this.doingCommand){
return true;
}
if(_54d){
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(desc.dataViewName==grid.dataView.name&&desc.field.style.visibility!="hidden"&&(desc.flags&_FOCUSABLE)!=0){
this.setFocus(desc.field);
break;
}
}
}else{
this.setFocus(_54c.field);
}
return true;
}
function gridSelectRow(grid,row,_558){
var _559;
if(!this.isIE){
_559=grid.getElementsByTagName("DIV");
}
if(grid.selRow!=-1){
for(var col=0;col<grid.ncols;col++){
var _55b=grid.id+"."+grid.selRow+"."+col;
var _55c;
if(grid.all){
_55c=grid.all[_55b];
}else{
_55c=_559[_55b];
}
if(_55c){
_55c.className=(grid.selRow%2==0?grid.rowStyle:grid.altRowStyle);
}
}
}
grid.selRow=row;
for(var col=0;col<grid.ncols;col++){
var key=grid.id+"."+grid.selRow+"."+col;
var adiv;
if(grid.all){
adiv=grid.all[key];
}else{
adiv=_559[key];
}
if(col==0){
var _55f=grid.scrollTop;
var _560=parseInt(grid.style.height);
var _561=_55f+_560-1;
var _562=parseInt(adiv.style.top);
var _563=parseInt(adiv.style.height);
var _564=_562+_563-1;
if(_562<_55f||(_558&&_564>_561)){
grid.scrollTop=_562;
}else{
if(_564>_561){
grid.scrollTop+=_563;
}
}
}
adiv.className=grid.selRowStyle;
}
}
function scrollGridIntoView(_565,grid,_567){
if(_565.grid){
_565.grid.selectRow(_567);
return;
}
var key=grid.id+"."+_567+".0";
var adiv;
if(grid.all){
adiv=grid.all[key];
}else{
adiv=grid.getElementsByTagName("DIV")[key];
}
if(adiv){
var _56a=grid.scrollTop;
var _56b=parseInt(grid.style.height);
var _56c=_56a+_56b-1;
var _56d=parseInt(adiv.style.top);
var _56e=parseInt(adiv.style.height);
var _56f=_56d+_56e-1;
if(_56d<_56a||_56f>_56c){
grid.scrollTop=_56d;
}
}
}
function mapKeyNameToKeyCode(name){
if(name=="UP"){
return UP_KEY;
}else{
if(name=="DOWN"){
return DOWN_KEY;
}else{
if(name=="ENTER"){
return ENTER_KEY;
}else{
if(name=="shift-TAB"){
return TAB_KEY+SHIFT_MASK;
}else{
if(name=="TAB"){
return TAB_KEY;
}else{
if(name=="shift-ENTER"){
return ENTER_KEY+SHIFT_MASK;
}
}
}
}
}
}
var _571=name;
var _572=false;
var ctrl=false;
var alt=false;
var key;
var _576;
if(_571.substring(0,5)=="ctrl-"){
ctrl=true;
_571=_571.substring(5);
}
if(_571.substring(0,6)=="shift-"){
_572=true;
_571=name.substring(6);
}
if(_571.substring(0,4)=="alt-"){
alt=true;
_571=_571.substring(4);
}
if(_571.substring(0,1)!="F"){
if(_571=="ENTER"){
_576=ENTER_KEY;
}else{
if(_571=="TAB"){
_576=TAB_KEY;
}else{
if(_571=="PAGE_UP"){
_576=PAGE_UP_KEY;
}else{
if(_571=="PAGE_DOWN"){
_576=PAGE_DOWN_KEY;
}else{
if(_571=="End"){
_576=END_KEY;
}else{
if(_571=="Home"){
_576=HOME_KEY;
}else{
return null;
}
}
}
}
}
}
}else{
key=parseInt(_571.substring(1));
if(key==null||key<0||key>12){
return null;
}
_576=key+FUNCTION_KEY_BASE;
}
if(ctrl){
_576|=CTRL_MASK;
}
if(_572){
_576|=SHIFT_MASK;
}
if(alt){
_576|=ALT_MASK;
}
return _576;
}
function sameAttributes(_577,_578){
if(_577.length!=_578.length){
return false;
}
return true;
}
ClientManager.prototype.doResizeBrowser=function(){
var _579=window.parent;
if(_579.name==NXJ_FIRST_COMMAND){
_579=_579.parent;
}
var _57a=null;
if(window.frameElement!=null&&window.frameElement.parentNode!=null){
_57a=window.frameElement.parentNode;
}else{
var _57b=window.parent.document.getElementsByTagName("FRAMESET");
if(_57b.length==1){
_57a=_57b[0];
}
}
if(!this.useFrameset){
_57a=null;
}
var _57c=parseInt(this.form.style.height);
var _57d=parseInt(this.form.style.width);
if(!isNaN(_57c)&&!isNaN(_57d)){
var _57e;
var _57f;
if(this.isIE){
_57e=_579.screenLeft;
_57f=_579.screenTop;
}else{
_57e=_579.screenX+(_579.outerWidth-_579.innerWidth);
_57f=_579.screenY+(_579.outerHeight-_579.innerHeight);
}
var _580=window.screen.availWidth-_57e;
var _581=window.screen.availHeight-_57f;
var _582=4;
if(!this.isIE){
_582+=20;
}
if(_57a!=null){
var rows=_57a.rows;
var _584=rows.split(",");
for(var idx=0;idx<_584.length;idx++){
if(_584[idx]!="*"){
_582+=parseInt(_584[idx]);
}
}
}
_582+=_57c;
var _586=parseInt(this.form.style.borderWidth);
if(!isNaN(_586)){
_582+=2*_586;
}
if(_582>_581){
_582=_581;
}
if(_57a!=null){
var _587=_582-_57a.offsetHeight;
}else{
var top=0;
var _589=this.form.offsetParent;
while(_589){
top+=_589.offsetTop;
_589=_589.offsetParent;
}
var _58a=0;
if(!isNaN(_586)){
_58a=2*_586+1;
}
_587=this.form.offsetParent.offsetHeight+top+_58a;
if(!this.isIE){
_587+=4;
var _58b=false;
if(this.document.body.clientHeight<_587){
_58b=true;
}
}
_587-=this.document.body.clientHeight;
}
var _58c=4;
if(!this.isIE){
_58c+=10;
}
if(_57a!=null){
var cols=_57a.cols;
var _58e=cols.split(",");
for(var idx=0;idx<_58e.length;idx++){
if(_58e[idx]!="*"){
_58c+=parseInt(_58e[idx]);
}
}
}
_58c+=_57d;
if(!isNaN(_586)){
_58c+=2*_586;
}
if(_58c>_580){
_58c=_580;
}
if(_57a!=null){
var _58f=_58c-_57a.offsetWidth;
}else{
var left=0;
var _589=this.form.offsetParent;
while(_589){
left+=_589.offsetLeft;
_589=_589.offsetParent;
}
var _591=false;
if(this.isIE&&this.document.body.clientWidth<this.form.offsetWidth+left){
_591=true;
}
_58f=this.form.offsetWidth+_58a+left-this.document.body.clientWidth;
}
if(this.isIE&&window.dialogArguments){
var _592=this.getNonFrameFrames();
for(var idx=0;idx<_592.length;idx++){
if(!_592[idx].isMain){
var _593=this.document.getElementById("nxj_"+_592[idx].name);
if(_593&&_593.style.width){
if(_592[idx].name=="vertmenu"){
_58c+=parseInt(_593.style.width);
}else{
_582+=parseInt(_593.style.height);
}
}
}
}
window.dialogHeight=(_582+30)+"px";
window.dialogWidth=(_58c+4)+"px";
return;
}
if(_58f==0&&_587==0){
return;
}
var e;
try{
window.top.resizeBy(_58f,_587);
}
catch(e){
var _595="window.top.resizeBy("+_58f+","+_587+")";
window.top.doResizeBy=new Function("var e;try{"+_595+"}catch(e){window.top.setTimeout("+"'window.top.doResizeBy()',0);}");
window.top.setTimeout("window.top.doResizeBy()",0);
}
if(!this.isIE){
var _596=_582!=_581?-24:0;
var _597=_58c!=_580?-14:0;
if(!this.useFrameset){
_597=0;
_596=0;
if(_58b){
_596=-16;
_597=-16;
}
}
_579.resizeBy(_597,_596);
}else{
if(_591){
_579.resizeBy(0,-16);
}
}
if(this.isIE&&!this.useFrameset){
window.setTimeout("doOnResize()",0);
}
}
};
function setNxjFieldValue(_598,_599){
var mgr=window.parent.clientManager;
var _59b=mgr.fieldDescriptors;
var _59c=false;
for(var idx=0;idx<_59b.length;idx++){
var desc=_59b[idx];
if(desc.name==_598){
_59c=true;
var _59f=mgr.getDataView(desc.dataViewName);
var _5a0;
if(_59f.find){
_5a0=mgr.validator.validateFind(desc,_599);
}else{
_5a0=mgr.validator.validateAndFormat(desc,_599);
}
if(_5a0!=null){
desc.field.value=_599;
desc.rawValue=_599;
var _5a1=desc.flags;
desc.flags|=_TRAVERSED;
desc.flags|=_MODIFIED;
if(_5a1!=desc.flags){
var obj=new Object();
obj.fieldId=idx;
obj.flags=desc.flags;
mgr.traversedFields[mgr.traversedFields.length]=obj;
}
}
break;
}
}
if(!_59c){
window.alert("Field "+_598+" not found.");
}
}
ClientManager.prototype.cleanupTraversedFields=function(){
var temp=new Array();
var _5a4=0;
for(var idx=0;idx<this.traversedFields.length;idx++){
var _5a6=this.traversedFields[idx];
var _5a7=_5a6.fieldId;
var desc=this.fieldDescriptors[_5a7];
if((desc.flags&(_TRAVERSED))!=0){
temp[_5a4++]=this.traversedFields[idx];
}
}
this.traversedFields=temp;
};
function onNxjValueChanged(_5a9,_5aa,_5ab){
var mgr=window.parent.clientManager;
if(!mgr){
return;
}
var _5ad=_5a9;
if(_5ad.charAt(_5ad.length-1)!="."){
_5ad+=".";
}
var _5ae=mgr.findName(_5ad);
var desc;
if(_5ae!=undefined){
desc=mgr.fieldDescriptors[_5ae];
}else{
var _5b0=false;
for(var idx=0;idx<mgr.fieldDescriptors.length;idx++){
desc=mgr.fieldDescriptors[idx];
var _5b2=desc.name.lastIndexOf(":");
if(_5b2!=-1){
if(_5ad==desc.name.substring(_5b2+1)){
_5b0=true;
break;
}
}
}
if(!_5b0){
alert("Field "+_5a9+" not found.");
return;
}
}
if(!desc.onvalchanges){
desc.onvalchanges=new Array();
}
desc.onvalchanges[desc.onvalchanges.length]=function(_5b3){
_5aa[_5ab](_5b3);
};
}
function callNxjFormMethod(_5b4,_5b5,_5b6,_5b7){
var mgr=window.parent.clientManager;
if(!mgr||!mgr.eventsOK){
return;
}
var _5b9=mgr.fieldDescriptors[mgr.currentFieldId];
var _5ba=mgr.getDataView(_5b9.dataViewName);
var _5bb=_5ba.currentRow;
var _5bc="_nxjform:"+_5b4;
var _5bd=_5b5;
if(_5b5!=null){
if(typeof (_5b5)=="object"&&_5b5.length>1){
_5bd="";
for(var idx=0;idx<_5b5.length;idx++){
if(idx!=0){
_5bd+="\f";
}
_5bd+=_5b5[idx].toString();
}
}else{
_5bd=_5b5.toString();
}
}
if(typeof (_5b6)=="object"&&typeof (_5b7)=="string"){
mgr.userCallbackRef=function(_5bf){
return _5b6[_5b7](_5bf);
};
}
mgr.doCommandInternal(_5bc,0,_5bb,null,_5bd);
}
function callNxjCommand(_5c0,_5c1,_5c2){
var mgr=window.parent.clientManager;
if(!mgr||!mgr.eventsOK){
return;
}
var _5c4=1;
var _5c5;
var _5c6=mgr.fieldDescriptors[mgr.currentFieldId];
if(_5c1){
_5c5=mgr.getDataView(_5c1);
if(!_5c5){
window.alert("Data view "+_5c1+" not found.");
return;
}
}else{
if(_5c6){
_5c5=mgr.getDataView(_5c6.dataViewName);
}else{
_5c5=mgr.dataViewDescriptors[0];
}
}
if(_5c5){
var obj=new Object();
obj.name=_5c0;
obj.parentNode=mgr.document.getElementById(_5c5.name+".");
_5c0=mgr.getCommandRelativeTo(obj,_5c6?_5c6.name:"");
_5c4=_5c5.currentRow;
if(_5c6){
var _5c8=mgr.getDataView(_5c6.dataViewName);
if(_5c8){
_5c4=_5c8.currentRow;
}
}
}
if(mgr.commandStates[_5c0]==null){
_5c0=getUpperCommand(_5c0);
}
if(mgr.commandStates[_5c0]){
mgr.doCommandInternal(_5c0,0,_5c4,null,_5c2);
}
}
function initNavBar(_5c9){
var _5ca=_5c9.navbar.getElementsByTagName("A");
if(_5c9.navbar.style.visibility=="hidden"){
for(var idx=0;idx<_5ca.length;idx++){
if(_5ca[idx].tabIndex){
this.tabElements[_5ca[idx].tabIndex-1]=_5ca[idx];
}
}
return;
}
if(_5ca.length>0){
_5ca[0].id="<parent>:PREVIOUS_SET";
_5ca[0].name="<parent>:PREVIOUS_SET";
_5ca[0].isNav=true;
if(_5ca.length>1){
_5ca[_5ca.length-1].id="<parent>:NEXT_SET";
_5ca[_5ca.length-1].name="<parent>:NEXT_SET";
_5ca[_5ca.length-1].isNav=true;
}
for(var idx=1;idx<_5ca.length-1;idx++){
_5ca[idx].id="<parent>:COFGR";
_5ca[idx].name="<parent>:COFGR";
_5ca[idx].isNav=true;
}
}
var _5cc=_5c9.nrows;
if(_5c9.repOpt==REP_LIST){
_5cc=_5c9.findCount;
}
var _5cd="";
if(_5c9.name!=this.formName){
_5cd=_5c9.name+":";
}
var _5ce=_5c9.navbar.getAttribute("navigationtype");
var _5cf=0;
var _5d0=_5c9.realRow+1;
var _5d1=_5ca.length-2;
if(_5d1>0){
this.commandStates[_5cd+"COFGR"]=true;
while(_5c9.realRow>=(_5d1-1)*_5cc+_5cf){
_5cf+=_5cc;
}
}
var tds=_5c9.navbar.getElementsByTagName("TD");
var _5d3=parseInt(_5c9.navbar.getAttribute("zeroWidth"));
var _5d4=parseInt(_5c9.navbar.getAttribute("linkGap"));
var row;
var _5d6;
var _5d7;
var _5d8=_5c9.repOpt;
var div=_5c9.navbar.parentNode;
var _5da=div.offsetWidth;
var _5db=_5da-_5ca[0].offsetWidth-_5ca[_5ca.length-1].offsetWidth+_5d4+_5ca.length;
var _5dc=1;
var _5dd=0;
var _5de=0;
var _5df=0;
for(var idx=1;idx<_5ca.length-1;idx++){
tds[idx].style.padding="0px";
row=_5cf+(idx-1)*_5cc+1;
_5d6=row+_5cc-1;
if(_5d6>_5c9.lastRow){
_5d6=_5c9.lastRow;
}
if(row<=_5c9.lastRow){
if(_5ce=="rows"){
_5d7=row.toString()+" - "+(_5d6).toString();
var _5e0=_5d3*_5d7.length+_5d4;
tds[idx].style.width=_5e0;
}else{
_5d7=Math.floor((row+_5cc-1)/_5cc).toString();
if(tds[idx].width=="1"){
tds[idx].width=_5d3*_5d7.length+_5d4;
}
}
tds[idx].style.display="";
if(_5e0>_5db){
var ridx=(_5cf==0&&_5dd!=idx-1)?idx:_5dc++;
tds[ridx].style.width=0;
tds[ridx].style.display="none";
_5de=_5db-_5d4;
_5db=0;
_5df++;
}else{
_5db-=_5e0;
}
_5ca[idx].innerHTML="<nobr>"+_5d7+"</nobr>";
if(_5d8==REP_FIELDS){
_5ca[idx].targetRow=row-(Math.floor((_5d0-1)/_5c9.nrows)*_5c9.nrows+1);
}else{
_5ca[idx].targetRow=row-1;
}
if(_5d0>=row&&_5d0<=_5d6){
_5dd=idx;
_5ca[idx].name="";
_5ca[idx].removeAttribute("href");
_5ca[idx].onclick=null;
}
}else{
if(this.isIE){
_5ca[idx].innerText="";
}else{
_5ca[idx].innerHTML="";
}
tds[idx].width=1;
tds[idx].style.display="none";
if(_5db>0){
_5de=_5db;
_5db=0;
}
_5df++;
}
}
if(_5df>0&&_5de>0){
var gap=_5de/(_5ca.length-2-_5df);
if(gap>0){
for(var idx=1;idx<_5ca.length-1;idx++){
if(tds[idx].style.width>0){
tds[idx].style.width+=gap;
}
}
}
}
}
ClientManager.prototype.pageSelected=function(_5e3,_5e4){
var _5e5=window.parent.getNotebook(_5e3);
var _5e6=_5e5.outerDiv;
if(!this.isIE&&!_5e6.tabIndex){
_5e6.tabIndex=_5e6.getAttribute("tabindex");
}
if(this.tabElements&&_5e6.tabIndex>0){
var _5e7=_5e6.tabIndex-1;
this.tabElements[_5e7]=_5e3;
_5e3.tabIndex=_5e6.tabIndex;
}
for(var idx=0;idx<this.fieldDescriptors.length;idx++){
var desc=this.fieldDescriptors[idx];
if(!desc.pageInitialized&&this.isFieldOnCurrentPage(desc)){
var _5ea=this.getDataView(desc.dataViewName);
desc.changed=true;
this.initFieldRows(desc,_5ea,this.dynamicListboxValues,true,true);
}
}
var desc=this.fieldDescriptors[this.currentFieldId];
var _5eb=window.parent.getNotebookPage(_5e3);
var _5ec=_5eb.getAttribute("nxj_tabselect");
var _5ed=false;
if(!_5ec&&this.focusElement&&this.focusElement.isPageButton&&window.parent.getNotebook(this.focusElement)==_5e5){
this.setFocus(_5e3);
}else{
if(desc){
if(this.isFieldOnNonCurrentPage(desc)){
var _5ee=new Array();
for(var idx=_5e3.tabIndex;idx<this.tabElements.length;idx++){
var _5ef=this.tabElements[idx];
if(window.parent.isOnCurrentPage(_5ef)){
if(_5ef.name){
var dot=_5ef.name.lastIndexOf(".");
if(dot!=-1){
var _5f1=_5ef.name.substring(0,dot+1);
var _5f2=this.findName(_5f1);
if(_5f2!=undefined){
var desc=this.fieldDescriptors[_5f2];
_5ef=desc.field;
if((desc.flags&_FOCUSABLE)==0||_5ef.style.visibility=="hidden"){
continue;
}
try{
var _5f3=(desc.flags&_REPEATING)!=0&&this.getDataView(desc.dataViewName).grid;
if(_5ec&&_5f3){
_5ed=_5ef;
}else{
var _5f4=_5ef;
if(_5f3){
_5f4=_5ef.parentNode;
}
if(!isParentHidden(_5f4,_5eb)){
if(_5f3){
var mgr=this;
var _5f6=function(){
mgr.setFocus(_5ef,!mgr.isIE,true);
};
window.setTimeout(_5f6,100);
}else{
this.setFocus(_5ef,!this.isIE,true);
}
_5ed=true;
}
}
break;
}
catch(e){
}
}else{
if(this.isElementTabbable(_5ef)){
_5ee[_5ee.length]=_5ef;
}
}
}else{
if(this.isElementTabbable(_5ef)){
_5ee[_5ee.length]=_5ef;
}
}
}
}
}
if(!_5ed){
this.setFocus(_5e3);
for(idx=0;idx<_5ee.length;idx++){
_5ef=_5ee[idx];
if(_5ef.style.visibility!="hidden"&&!_5ef.disabled&&!isParentHidden(_5ef,_5eb)){
var _5f7=_5ef;
this.setFocus(_5ef,!this.isIE,true);
break;
}
}
}
}else{
if((desc.flags&_FOCUSABLE)&&desc.field&&desc.field.style.visibility!="hidden"){
if(this.focusType==INITIAL_FOCUS_CALL){
this.hiliteField(desc.field,true);
}else{
if(_5e4){
var _5f8=desc.field.offsetTop;
var op=desc.field.offsetParent;
while(op){
_5f8+=op.offsetTop;
op=op.offsetParent;
}
if(_5f8<this.document.body.scrollTop||_5f8>this.document.body.offsetHeight-this.document.body.scrollTop){
_5f7=_5e3;
}
}
if(_5f7!=_5e3){
this.focusType=NATURAL_ORDER_TAB;
this.setFocus(desc.field,true);
}
}
}
}
}
}
this.adjustTables();
this.updateSystemFields(this.useFrameset?window.parent.frames[MAIN_FRAME]:window);
if(_5ec&&_5e4){
var _5fa=_5eb.getAttribute("nxj_tabselect_dv");
var _5fb=_5eb.getAttribute("tabselect_parameter");
var _5fc="";
if(!_5fb){
_5fb="";
}else{
_5fb="frame[mainFrame]"+_5fb;
}
if(_5fa){
_5eb.dvName=_5fa;
var dv=this.findDataView(_5eb);
if(dv){
_5fc=dv.name;
}
}
if(_5ed){
if(_5ec.indexOf("javascript:")==0||_5ec.indexOf("(")!=-1){
this.deferEval=_5ec;
}else{
this.deferEval=new Object();
this.deferEval.ontabsel=_5ec;
this.deferEval.dvName=_5fc;
this.deferEval.param=_5fb;
}
if(_5ed==_5ef){
var mgr=this;
var _5f6=function(){
mgr.setFocus(_5ef,!mgr.isIE,true);
};
window.setTimeout(_5f6,100);
}
}else{
if(_5ec.indexOf("javascript:")==0||_5ec.indexOf("(")!=-1){
eval(_5ec);
}else{
var _5fe=window.parent.mainManager;
if(this.fieldDescriptors.length){
_5fe.focusField=this.fieldDescriptors[this.currentFieldId].field;
}
_5fe.focusControl=_5f7;
callNxjCommand(_5ec,_5fc,_5fb);
}
}
}
};
function isParentHidden(ele,_600){
var par=ele.parentNode;
while(par&&par.tagName!="FORM"){
if(par!=_600&&par.style.display=="none"){
return true;
}
par=par.parentNode;
}
return false;
}
ClientManager.prototype.nextPage=function(_602){
var _603=window.parent.getNotebook(_602);
_603.nextPage();
};
ClientManager.prototype.previousPage=function(_604){
var _605=window.parent.getNotebook(_604);
_605.previousPage();
};
function isFieldOnAnyPage(desc){
if(window.parent.getNotebook==null){
return false;
}
var _607=this.document.getElementById(desc.name);
if(!_607){
_607=this.form.elements[desc.name];
}
return window.parent.getNotebook(_607)!=null;
}
function isFieldOnCurrentPage(desc){
if(window.parent.isOnCurrentPage==null){
return false;
}
var _609=this.document.getElementById(desc.name);
if(!_609){
_609=this.form.elements[desc.name];
}
return window.parent.isOnCurrentPage(_609);
}
function isFieldOnNonCurrentPage(desc){
if(window.parent.isOnNonCurrentPage==null){
return false;
}
var _60b=this.document.getElementById(desc.name);
if(!_60b){
_60b=this.form.elements[desc.name];
}
return window.parent.isOnNonCurrentPage(_60b);
}
function isFieldOnUnavailablePage(desc){
if(window.parent.isOnUnavailablePage==null){
return false;
}
var _60d=this.document.getElementById(desc.name);
if(!_60d){
_60d=this.form.elements[desc.name];
}
return window.parent.isOnUnavailablePage(_60d);
}
function makeFieldPageCurrent(desc){
if(window.parent.makePageCurrent==null){
return;
}
var _60f=this.document.getElementById(desc.name);
if(!_60f){
_60f=this.form.elements[desc.name];
}
window.parent.makePageCurrent(_60f);
}
function isElementOnNonCurrentPage(_610){
if(window.parent.isOnNonCurrentPage==null){
return false;
}
return window.parent.isOnNonCurrentPage(_610);
}
function makeElementPageCurrent(_611){
if(window.parent.makePageCurrent){
window.parent.makePageCurrent(_611);
}
}
function adjustChildTopPosition(_612,_613,adjY){
var _615=_613.offsetTop;
var _616=_613.offsetHeight;
for(var _617=0;_617<_612.childNodes.length;_617++){
cdiv=_612.childNodes[_617];
if(cdiv!=_613&&cdiv.style&&cdiv.style.position=="absolute"&&cdiv.style.display!="none"){
var _618=parseInt(cdiv.style.top);
if(!isNaN(_618)&&_618+adjY>_615+_616){
_618+=adjY;
cdiv.style.top=_618+"px";
}
}
}
}
function adjustTables(){
var _619=this.document.getElementsByTagName("FIELDSET");
if(_619.length>0){
var _61a=this.document.getElementsByTagName("TABLE");
for(var idx=0;idx<_61a.length;idx++){
if(_61a[idx].getAttribute("nxj_resize")=="1"){
var _61c=_61a[idx].parentNode;
var _61d=_61a[idx].clientHeight;
if(_61d){
_61a[idx].removeAttribute("nxj_resize");
_61c.style.height=_61d;
var _61e=_61c.getAttribute("ORIG_HEIGHT");
if(_61e){
_61e=parseInt(_61e);
var adjY=_61d-_61e;
var _620=_61c.parentNode;
var cdiv;
adjustChildTopPosition(_620,_61c,adjY);
if(_620.tagName!="FORM"){
if(_620.style.height&&_620.style.height.indexOf("%")==-1){
var _622=parseInt(_620.style.height);
if(_622){
_622+=adjY;
_620.style.height=_622+"px";
if(_620.tagName=="FIELDSET"){
_61c=_620.parentNode;
_61c.style.height=_622+"px";
_620=_61c.parentNode;
adjustChildTopPosition(_620,_61c,adjY);
}
}
}
}
}
}
}
}
window.setTimeout("window.clientManager.delayedFooterAdjust()",750);
}
}
function StringBuffer(){
this.buffer=[];
}
StringBuffer.prototype.append=function append(_623){
this.buffer.push(_623);
return this;
};
StringBuffer.prototype.toString=function toString(){
return this.buffer.join("");
};
ClientManager.prototype.getNonFrameFrames=function(){
var _624=new Array(1);
_624[0]=window;
_624[0].isMain=true;
var _625=1;
var _626={"nxj_header":1,"nxj_menu":1,"nxj_vertmenu":1,"nxj_footer":1};
var _627=this.document.getElementsByTagName("IFRAME");
for(var idx=0;idx<_627.length;idx++){
var _629=_627[idx].id;
if(_626[_629]){
var _62a=_627[idx];
if(this.isIE){
if(_62a){
var _62b=_62a.contentWindow;
var _629=_629.substring(4);
_62b.clientManager=this;
_624[_625]=_62b;
_624[_629]=_62b;
_62b.name=_629;
_625++;
}
}else{
if(_62a&&_62a.contentDocument){
_624[_625]=_62a.contentDocument.defaultView;
_624[_629.substring(4)]=_624[_625];
_625++;
}
}
}
}
return _624;
};
ClientManager.prototype.getVisibleFrames=function(){
if(this.useFrameset){
frames=new Array(5);
var _62c=window.parent.frames;
frames[0]=_62c.menu;
frames[1]=_62c.mainFrame;
frames[1].isMain=true;
frames[2]=_62c.vertmenu;
frames[3]=_62c.header;
frames[4]=_62c.footer;
return frames;
}else{
return this.getNonFrameFrames();
}
};
function doOnResize(_62d){
var mgr=window.parent.clientManager;
if(mgr){
var _62f=0;
var _630=this.document.getElementById("nxj_menu_div");
if(_630&&!_62d){
_62f+=_630.clientHeight;
if(window.menuTimerID){
window.clearTimeout(window.menuTimerID);
}
if(mgr.isIE){
if(IS_IE8){
_630.style.display="none";
}
_630.style.visibility="hidden";
}
window.menuTimerID=window.setTimeout("window.clientManager.delayedDivVisible(\"nxj_menu_div\")",500);
}
var _631=this.document.getElementById("nxj_header_div");
if(_631&&!_62d){
_62f+=_631.clientHeight;
if(window.headerTimerID){
window.clearTimeout(window.headerTimerID);
}
if(mgr.isIE){
if(IS_IE8){
_631.style.display="none";
}
_631.style.visibility="hidden";
}
window.headerTimerID=window.setTimeout("window.clientManager.delayedDivVisible(\"nxj_header_div\")",500);
}
var _632=this.document.getElementById("nxj_footer_div");
if(_632){
_62f+=_632.clientHeight;
}
var _633=this.document.getElementById("nxj_main_div");
if(_633&&mgr.lockFrames&&_633.style.overflow){
if(window.mainDivTimerID){
window.clearTimeout(window.mainDivTimerID);
}
window.mainDivTimerID=window.setTimeout("window.clientManager.delayedMainDivResize("+_62f+")",500);
}
if(_632){
if(window.footerTimerID){
window.clearTimeout(window.footerTimerID);
}
_632.style.width="100%";
_632.style.visibility="hidden";
window.footerTimerID=window.setTimeout("window.clientManager.delayedFooterAdjust()",500);
}
}
}
function doOnScroll(){
doOnResize(true);
}
ClientManager.prototype.delayedMainDivResize=function(_634){
var _635=this.document.getElementById("nxj_vertmenu_div");
var _636=this.document.getElementById("nxj_main_div");
var _637=parseInt(_636.style.width);
_636.style.width=this.document.body.clientWidth-(_635?_635.clientWidth:0);
_636.style.height=this.document.body.clientHeight-_634;
if(!this.isIE&&!isNaN(_637)){
if(this.document.body.clientWidth<_637){
this.delayedDivVisible("nxj_header_div");
this.delayedDivVisible("nxj_menu_div");
this.delayedMainDivResize(_634);
if(this.document.getElementById("nxj_footer_div")){
this.delayedFooterAdjust();
}
}
}
};
ClientManager.prototype.delayedFooterAdjust=function(){
var _638=this.document.body.clientHeight+this.document.body.scrollTop;
this.adjustFrameDivMenuPosition("nxj_footer",_638,0);
var _639=this.document.getElementById("nxj_vertmenu_div");
if(_639){
if(!this.lockFrames){
_639.style.left=this.document.body.scrollLeft;
}
if(this.document.defaultView){
var _63a=this.document.defaultView.getComputedStyle(this.document.body,"");
var bg=_63a.backgroundColor;
if(bg=="transparent"){
bg="white";
}
_639.style.backgroundColor=bg;
}
var _63c=this.document.body.clientHeight+this.document.body.scrollTop;
_639.style.height=_63c;
_639.style.zIndex=99;
var _63d=this.document.getElementById("nxjvertline");
if(_63d){
var _63e=this.document.getElementById("nxj_header_div");
var _63f=this.document.getElementById("nxj_footer_div");
var _640=this.document.getElementById("nxj_main_div");
_63d.style.left=parseInt(_640.style.left)+this.document.body.scrollLeft;
_63d.style.height=_63c-(_63e?_63e.clientHeight:0)-(_63f?_63f.clientHeight:0);
var _641=document.getElementById("liveGridScrollerDiv");
if(_641&&_641.adjustLeft){
_641.adjustLeft();
}
}
this.adjustVertMenu();
}
if(this.namesToComponents){
var _642=null;
for(var name in this.namesToComponents){
var obj=this.namesToComponents[name];
if(obj&&obj.isMenuBar&&obj.scrollToTop){
if(_642==null||_642.origTop>obj.origTop){
_642=obj;
}
}
}
if(_642){
var _645=0;
var _63e=this.document.getElementById("nxj_header_div");
if(_63e){
_645=_63e.clientHeight;
}
var _646=this.document.getElementById("nxj_menu_div");
if(_646&&_646.clientHeight){
_645+=_646.clientHeight;
}
var adjH=_642.origTop;
if(this.document.body.scrollTop>_645+adjH){
adjH=this.document.body.scrollTop-_645;
}
_642.outerDiv.parentNode.style.top=adjH;
_642.outerDiv.parentNode.style.zIndex=100;
}
}
};
ClientManager.prototype.adjustVertMenu=function(){
var _648=this.document.getElementById("nxj_vertmenu");
if(!_648){
return;
}
var _649=this.document.getElementById("nxj_main_div");
var _64a=parseInt(_649.style.left);
var _64b=this.document.body.clientHeight+this.document.body.scrollTop;
var _64c=this.document.getElementById("nxj_footer_div");
var _64d=this.document.getElementById("nxj_header_div");
if(_64c){
_64b-=_64c.clientHeight;
}
if(_64d){
_64b-=_64d.clientHeight;
}
var _64e=this.document.getElementById("nxj_vertmenu_div");
_64e.style.height=_64b;
var _64f=null;
if(_648.object&&_648.object.parentWindow){
_64f=_648.object.parentWindow;
}else{
if(_648.contentDocument&&_648.contentDocument.defaultView){
_64f=_648.contentDocument.defaultView;
}
}
if(_64f){
var _650=_64f.document.forms["NXJForm"];
if(_650){
_650.style.height=_64b;
_650.style.width=_64a;
_650.style.overflowX="hidden";
if(_64f.namesToComponents){
for(var name in _64f.namesToComponents){
var obj=_64f.namesToComponents[name];
if(obj&&obj.isTree&&obj.table){
if(obj.table.clientHeight>_64b){
_650.style.overflowY="scroll";
}else{
if(_650.scrollTop==0){
_650.style.overflowY="";
}
}
if(!obj.adjustMenuCB){
obj.adjustMenuCB=associateObjWithEvent(this,"adjustVertMenu");
}
}
}
}
}
}
};
ClientManager.prototype.delayedDivVisible=function(_653){
var div=this.document.getElementById(_653);
if(div){
div.style.visibility="";
if(IS_IE8){
div.style.display="";
}
div.style.width=this.document.body.clientWidth;
}
};
function manageNonFrameFrames(){
var _655=0;
var _656=0;
var _657={"nxj_header":1,"nxj_menu":1,"nxj_vertmenu":1,"nxj_footer":1};
var _658=this.document.getElementsByTagName("IFRAME");
for(var idx=0;idx<_658.length;idx++){
var _65a=_658[idx].id;
if(_657[_65a]){
var _65b=_658[idx];
if(this.isIE){
if(_65b&&_65b.readyState!="complete"){
window.setTimeout("if(window.parent.clientManager"+"&&window.parent.clientManager.eventsOK"+"&&!window.parent.clientManager.doingCommand)"+"{window.parent.clientManager.manageNonFrameFrames();}",0);
return;
}
}else{
if(_65b&&_65b.contentDocument&&_65b.contentDocument.defaultView&&!_65b.contentDocument.defaultView.isReady){
_65b.parentNode.style.width="0px";
window.setTimeout("if(window.parent.clientManager"+"&&window.parent.clientManager.eventsOK"+"&&!window.parent.clientManager.doingCommand)"+"{window.parent.clientManager.manageNonFrameFrames();}",0);
return;
}
}
var pos=this.adjustFrameDivMenuPosition(_65a,_656,_655);
if(typeof (pos)=="undefined"){
continue;
}
if(_65a=="nxj_vertmenu"){
_655=pos;
}else{
_656=pos;
}
}
}
var _65d=this.document.getElementById("nxj_vertmenu_div");
var _65e=_656;
var _65f=this.document.getElementById("nxj_main_div");
if(_65f){
var _660=this.document.getElementById("nxj_header_div");
var _661=this.document.getElementById("nxj_menu_div");
_65f.style.top=_656;
_65f.style.left=_655;
var _662=this.document.getElementById("nxj_footer_div");
var _663=0;
if(_660){
_663+=_660.clientHeight;
}
if(_661){
_663+=_661.clientHeight;
}
if(_662){
_663+=_662.clientHeight;
}
var _664=this.form.getAttribute("height");
if(_664){
if(this.lockFrames){
this.form.style.height="95%";
this.form.style.width="95%";
var _665=parseInt(_65f.style.width);
var _666=this.document.body.clientWidth-(_65d?_65d.clientWidth:0);
if(!isNaN(_665)&&_666<_665){
_65f.style.width=_666;
}
_65f.style.height=this.document.body.clientHeight-_663;
if(isNaN(_665)||_665<_666){
_65f.style.width=_666;
}
_65f.style.overflow="auto";
}else{
_65f.style.height=_664;
_65f.style.width=this.form.style.width;
}
_656=0;
}else{
if(_662==null||_662.style.display=="none"){
this.form.style.position="absolute";
this.form.style.top="0px";
_65f.style.height=this.form.style.height;
_65f.style.overflow="";
}else{
_65f.style.overflow="";
}
}
this.document.body.style.backgroundColor=this.form.style.backgroundColor;
height=this.document.body.clientHeight;
_656+=height;
}
var pos=this.adjustFrameDivMenuPosition("nxj_footer",_656,_655);
var _667=typeof (pos)!="undefined"?pos-_656:0;
if(_65d){
_65d.style.top=_65e;
_65d.style.height=height-_65e-_667;
var _668=this.document.getElementById("nxjvertline");
if(!_668&&_65f){
_668=this.document.createElement("DIV");
_668=this.document.body.appendChild(_668);
_668.id="nxjvertline";
_668.style.position="absolute";
_668.style.top=_65e;
_668.style.width="4px";
_668.style.border="1px solid";
_668.style.borderColor="ThreeDHighlight ThreeDShadow ThreeDShadow ThreeDHighlight";
_668.style.backgroundColor="ThreeDFace";
_668.style.cursor="w-resize";
_668.style.zIndex="1";
if(this.isIE){
_668.onmousedown=new Function("this.setCapture(true);");
_668.onmouseup=associateObjWithEvent(this,"vertlineup");
}else{
_668.lineup=function(_669,obj){
if(this.mousedown){
var mgr=window.parent.clientManager;
var _66c=mgr.document.getElementById("nxj_vertmenu");
if(_66c&&_66c.contentDocument){
_66c.contentDocument.defaultView.PREFERRED_COLS=_669.clientX;
mgr.manageNonFrameFrames();
mgr.delayedFooterAdjust();
}
}
this.mousedown=false;
};
_668.onmousedown=new Function("this.mousedown=true;");
this.document.onmouseup=associateObjWithEvent(_668,"lineup");
_65b=this.document.getElementById("nxj_vertmenu");
_65b.contentDocument.onmouseup=associateObjWithEvent(_668,"lineup");
}
}
_668.style.left=parseInt(_65f.style.left)+this.document.body.scrollLeft;
_668.style.height=document.body.clientHeight+this.document.body.scrollTop-(_660?_660.clientHeight:0)-(_662?_662.clientHeight:0);
var _66d=document.getElementById("liveGridScrollerDiv");
if(_66d&&_66d.adjustLeft){
_66d.adjustLeft();
}
var _662=document.getElementById("nxj_footer_div");
if(_662){
_662.style.zIndex="10";
}
}
if(this.reloadFrames){
this.setControlStates(false);
}
}
ClientManager.prototype.vertlineup=function(_66e,_66f){
_66f.releaseCapture();
if(_66e.x<0){
return;
}
var _670=this.document.getElementById("nxj_vertmenu");
if(_670&&_670.object&&_670.object.parentWindow){
_670.object.parentWindow.PREFERRED_COLS=_66e.x;
this.manageNonFrameFrames();
window.setTimeout("window.parent.clientManager.setControlStates(false);",0);
this.delayedFooterAdjust();
}
};
function associateObjWithEvent(obj,_672){
return (function(e){
e=e||window.event;
if(!e&&obj.popup&&obj.popup.document&&obj.popup.document.parentWindow){
e=obj.popup.document.parentWindow.event;
}
return obj[_672](e,this);
});
}
function makeAjaxRequest(url,_675){
var _676=new AjaxCall(url,_675);
_676.send();
}
function AjaxCall(url,_678){
var req=getRequest();
req.onreadystatechange=(function(){
processResponse(_678);
});
function getRequest(){
if(window.XMLHttpRequest){
return new XMLHttpRequest();
}else{
if(window.ActiveXObject){
return new ActiveXObject("Microsoft.XMLHTTP");
}
}
}
function processResponse(_67a){
if(req.readyState==4){
var _67b=null;
if(_67a.controlId){
_67b=window.namesToComponents[_67a.controlId];
}else{
if(_67a.control){
_67b=_67a.control;
}else{
_67b=this;
}
}
var _67c=false;
if(req.status>=200&&req.status<300){
_67c=true;
}
if(_67c&&_67a.onComplete){
_67a.onComplete.apply(_67b,[req]);
}else{
if(!_67c&&_67a.onError){
_67a.onError.apply(_67b,[req]);
}else{
if(!_67c){
if(req.responseText&&req.responseText.indexOf("_NXJ_TIMEOUT")!=-1){
if(IS_IE){
if(window.parent.clientManager){
window.parent.clientManager.loading=false;
}
var _67d=document.getElementById("nxj_command");
if(_67d){
_67d.text=req.responseText;
window.setTimeout("window.nxjOnLoad();",0);
}
}else{
eval(req.responseText+";window.onload=nxjOnLoad;window.setTimeout('window.onload()',0);");
}
}else{
alert("Communcation Error ("+req.status+"): "+req.statusText);
}
}
}
}
}
}
this.send=function(){
if(!_678.method){
_678.method="get";
}
if(_678.method.toLowerCase()=="get"&&_678.parameters){
url+="?"+_678.parameters;
}
req.open(_678.method,url,true);
if(_678.method.toLowerCase()=="post"){
req.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
req.send(_678.parameters);
}else{
req.send(null);
}
};
}
function launchJavascript(_67e){
var _67f="(?:<script.*?>)((\n|\r|.)*?)(?:</script>)";
var _680=new RegExp(_67f,"img");
var _681=_67e.match(_680);
if(_681){
var js="";
for(var s=0;s<_681.length;s++){
var _680=new RegExp(_67f,"im");
js+=_681[s].match(_680)[1];
}
setTimeout(function(){
eval(js);
},0);
}
}
function openNxjGrid(_684){
var mgr=window.parent.clientManager;
var _686=null;
if(!_684){
for(var idx=0;idx<mgr.dataViewDescriptors.length;idx++){
if(mgr.dataViewDescriptors[idx].grid){
_686=mgr.dataViewDescriptors[idx];
_684=_686.name;
break;
}
}
}else{
_686=mgr.getDataView(_684);
}
if(!_686){
_684+=".";
_686=mgr.getDataView(_684);
if(!_686){
alert("data view not found:"+_684);
return;
}
}
if(!_686.grid){
alert("data view: "+_684+" does not contain a grid");
return;
}
var _688=_686.grid.outerDiv;
_686.grid.deselectRow();
var _689=_688.innerHTML;
if(_686.grid.isViewGrid){
var _68a=new Object();
_68a.promptStr="Print view or documents?";
_68a.options=new Array("      view      ","documents");
_68a.defOpt=0;
window.promptObject=_68a;
var _68b=400;
var _68c=(window.parent.screenLeft?window.parent.screenLeft:window.top.screenX)+200;
var _68d=(window.parent.screenTop?window.parent.screenTop:window.parent.screenY)+100;
var url="NXJOptionButtons.jsp?MANAGER_ID="+window.MANAGER_ID;
if(mgr.isIE){
promptResult=window.showModalDialog(url,window,"help:no;status:no;dialogTop:"+_68d+"px;dialogLeft:"+_68c+"px;"+"dialogWidth:"+_68b+"px;dialogHeight:100px");
window.promptObject=null;
if(promptResult!=0){
_686.grid.reselectRow();
if(promptResult!=1){
return;
}
mgr.doCommandInternal("printDocsFromView",0,1,null,_686.grid.getCheckedMgrRowIds());
return;
}
_689=_686.grid.getSelectedHTML();
}else{
if(window.confirm("Print View?")){
_689=_686.grid.getSelectedHTML();
}else{
_686.grid.reselectRow();
if(window.confirm("Print Documents?")){
mgr.doCommandInternal("printDocsFromView",0,1,null,_686.grid.getCheckedMgrRowIds());
}
return;
}
}
}
var win=window.open("blank.html");
var _690;
if(_686.grid.isViewGrid){
_690=_686.grid.outerDiv.clientHeight;
}else{
var row=_686.grid.tbody.childNodes[0];
var _692=row.offsetHeight;
_690=(_686.grid.values.length+2)*_692;
}
var _693=_684;
var _694=function(){
var doc=win.document;
doc.title=_693;
for(var idx=0;idx<document.styleSheets.length;idx++){
var _697=document.styleSheets[idx];
if(IS_IE){
doc.createStyleSheet(_697.href);
}else{
var link=doc.createElement("link");
link.type="text/css";
link.rel="stylesheet";
link.href=_697.href;
doc.body.appendChild(link);
}
}
var div=doc.createElement("div");
div.style.position="absolute";
div.style.top="0px";
div.style.left="0px";
div.style.width=_688.clientWidth;
div.style.height=_690;
doc.body.appendChild(div);
div.innerHTML=_689;
_686.grid.reselectRow();
if(_686.grid.isViewGrid){
win.gridToggleNode=function(){
};
}else{
div.firstChild.style.height=_690;
div.firstChild.firstChild.style.height=_690;
}
};
if(window.openGridTimerId){
window.clearTimeout(window.openGridTimerId);
}
window.openGridTimerId=win.setTimeout(_694,0);
}
function openNxjPrintForm(){
var win=window.open("blank.html","_blank");
var mgr=window.parent.clientManager;
var _69c=mgr.form.clientHeight;
var _69d=mgr.document.getElementById("nxj_main_div");
var _69e=mgr.formName;
var _69f=function(){
var doc=win.document;
doc.title=_69e;
for(var idx=0;idx<document.styleSheets.length;idx++){
var _6a2=document.styleSheets[idx];
if(IS_IE){
doc.createStyleSheet(_6a2.href);
}else{
var link=doc.createElement("link");
link.type="text/css";
link.rel="stylesheet";
link.href=_6a2.href;
doc.body.appendChild(link);
}
}
for(var name in mgr.namesToComponents){
var comp=mgr.namesToComponents[name];
if(comp&&comp.isMenuBar){
comp.outerDiv.style.display="none";
}
}
var div=doc.createElement("div");
div.style.position="absolute";
div.style.top="0px";
div.style.left="0px";
div.style.width=mgr.form.clientWidth;
div.style.height=_69c;
doc.body.appendChild(div);
div.innerHTML=_69d.firstChild.innerHTML;
for(var name in mgr.namesToComponents){
var comp=mgr.namesToComponents[name];
if(comp&&comp.isMenuBar){
comp.outerDiv.style.display="";
}
}
};
if(window.openPrintFormTimerId){
window.clearTimeout(window.openPrintFormTimerId);
window.openPrintFormTimerId=null;
}
window.openPrintFormTimerId=win.setTimeout(_69f,500);
}
var externalMessages=new Array("RequiredField=You must enter a value for this field","RequiredFieldMissing=You have not supplied values for one or more required fields.","FieldWidth=You have exceeded the maximum field width","ZOOM=zoom","FIND=find","UPDATE=update","BadBack=You cannot use the browser's Back button with\n"+"this application.  You must use the Back button\n"+"in the application instead","INVALID_DATA_TYPE=The data type specified is not valid.","OVERFLOW_ERROR=The formatted value is greater then the field width.","INVALID_CHAR=Invalid charcter in the string value.","INVALID_TIME_FORMAT=Invalid character in time format specified.","INVALID_VALUE=The value specified does not match the format.","INVALID_NUMERIC_VALUE=The value specified is not a valid Numeric value.","INVALID_FORMAT=The format specified contains an invalid character.","INVALID_DATETIME_VALUE=The value specified does not match the DATETIME format.","INVALID_MONTH=The month value in the date is invalid.","INVALID_YEAR=The year value in the date is invalid.","INVALID_DAY=The day value in the date is invalid.","INVALID_HOUR=The hour value in the time is invalid.","INVALID_MINUTE=The minute value in the time is invalid.","INVALID_SECOND=The second value in the time is invalid.","INVALID_MILLISECOND=The millisecond value in the time is invalid.","INVALID_SEPERATOR=The value has invalid separator.","MISMATCH_ERROR=The value given does not match the display format.","PrevFormDisabled=The PREVIOUS FORM command is disabled.","BadKeyMap=The function key name could not be mapped.\n{0}","Uploading=Uploading...","RECORDS_FOUND=records found","NO_RECORDS_FOUND=no records found","ADDED=added","UPDATED=updated","DELETED=deleted","ADDING=adding","UPDATING=updating","DELETING=deleting","not stored=not stored","stored=stored","stored/modified=stored/modified","RECORD_NUMBER=record ","RECORD_COUNT=of ","SAVE_CHANGE=Save changes?","BAD_FILE=No such file","RequiredField.ja=\u5fc5\u9808\u30d5\u30a3\u30fc\u30eb\u30c9\u3067\u3059\u3002\u5024\u3092\u5165\u529b\u3057\u3066\u304f\u3060\u3055\u3044\u3002","FieldWidth.ja=\u5165\u529b\u53ef\u80fd\u306a\u6587\u5b57\u6570\u3092\u8d85\u3048\u3066\u3044\u307e\u3059\u3002","ZOOM.ja=\u30ba\u30fc\u30e0","FIND.ja=\u691c\u7d22","UPDATE.ja=\u66f4\u65b0","BadBack.ja=\u3053\u306e\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u3067\u306f\u3001\u30d6\u30e9\u30a6\u30b6\u306e[\u623b\u308b]\u30dc\u30bf\u30f3\n"+"\u306f\u4f7f\u7528\u3067\u304d\u307e\u305b\u3093\u3002\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u306e[\u623b\u308b]\u30dc\u30bf\u30f3\n"+"\u3092\u4f7f\u7528\u3057\u3066\u4e0b\u3055\u3044\u3002","INVALID_DATA_TYPE.ja=\u6307\u5b9a\u3055\u308c\u305f\u30c7\u30fc\u30bf\u30bf\u30a4\u30d7\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","OVERFLOW_ERROR.ja=\u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u5f8c\u306e\u5024\u304c\u5165\u529b\u53ef\u80fd\u306a\u6587\u5b57\u6570\u3092\u8d85\u3048\u3066\u3044\u307e\u3059\u3002","INVALID_CHAR.ja=\u4e0d\u6b63\u306a\u6587\u5b57\u304c\u6587\u5b57\u5217\u306b\u542b\u307e\u308c\u3066\u3044\u307e\u3059\u3002","INVALID_TIME_FORMAT.ja=\u4e0d\u6b63\u306a\u6587\u5b57\u304c time \u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u306b\u4f7f\u7528\u3055\u308c\u3066\u3044\u307e\u3059\u3002","INVALID_VALUE.ja=\u5165\u529b\u3055\u308c\u305f\u5024\u306f\u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u306b\u4e00\u81f4\u3057\u307e\u305b\u3093\u3002","INVALID_NUMERIC_VALUE.ja=\u5165\u529b\u3055\u308c\u305f\u5024\u306f\u6570\u5024\u3067\u306f\u3042\u308a\u307e\u305b\u3093\u3002","INVALID_FORMAT.ja=\u4e0d\u6b63\u306a\u6587\u5b57\u304c\u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u306b\u4f7f\u7528\u3055\u308c\u3066\u3044\u307e\u3059\u3002","INVALID_DATETIME_VALUE.ja=\u5165\u529b\u3055\u308c\u305f\u5024\u304c DATETIME \u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u306b\u4e00\u81f4\u3057\u307e\u305b\u3093\u3002","INVALID_YEAR.ja=\u65e5\u4ed8\u306e\u5e74\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_MONTH.ja=\u65e5\u4ed8\u306e\u6708\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_DAY.ja=\u65e5\u4ed8\u306e\u65e5\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_HOUR.ja=\u6642\u9593\u306e\u6642\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_MINUTE.ja=\u6642\u9593\u306e\u5206\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_SECOND.ja=\u6642\u9593\u306e\u79d2\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_MILLISECOND.ja=\u6642\u9593\u306e\u30df\u30ea\u79d2\u306e\u5024\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059\u3002","INVALID_SEPERATOR.ja=\u4e0d\u6b63\u306a\u533a\u5207\u308a\u6587\u5b57\u304c\u4f7f\u7528\u3055\u308c\u3066\u3044\u307e\u3059\u3002","MISMATCH_ERROR.ja=\u5024\u304c\u8868\u793a\u30d5\u30a9\u30fc\u30de\u30c3\u30c8\u306b\u4e00\u81f4\u3057\u307e\u305b\u3093\u3002","PrevFormDisabled.ja=PREVIOUS FORM \u30b3\u30de\u30f3\u30c9\u306f\u5229\u7528\u3067\u304d\u307e\u305b\u3093\u3002","BadKeyMap.ja=\u30d5\u30a1\u30f3\u30af\u30b7\u30e7\u30f3\u30ad\u30fc\u540d\u3092\u30de\u30c3\u30d7\u3067\u304d\u307e\u305b\u3093\u3002\n{0}","Uploading.ja=\u30a2\u30c3\u30d7\u30ed\u30fc\u30c9\u4e2d...","RECORDS_FOUND.ja=\u8a72\u5f53\u884c\u3042\u308a","NO_RECORDS_FOUND.ja=\u8a72\u5f53\u884c\u306a\u3057","ADDED.ja=\u8ffd\u52a0\u6e08","UPDATED.ja=\u66f4\u65b0\u6e08","DELETED.ja=\u524a\u9664\u6e08","ADDING.ja=\u8ffd\u52a0\u4e2d","UPDATING.ja=\u66f4\u65b0\u4e2d","DELETING.ja=\u524a\u9664\u4e2d","not stored.ja=\u672a\u683c\u7d0d","stored.ja=\u683c\u7d0d\u6e08","stored/modified.ja=\u683c\u7d0d\u6e08/\u66f4\u65b0\u6e08","RECORD_NUMBER.ja=\u30ec\u30b3\u30fc\u30c9 ","RECORD_COUNT.ja=/ ","SAVE_CHANGE.ja=\u5909\u66f4\u3092\u4fdd\u5b58\u3057\u307e\u3059\u304b\u3002","BAD_FILE.ja=\u30d5\u30a1\u30a4\u30eb\u304c\u5b58\u5728\u3057\u307e\u305b\u3093\u3002","RequiredField.ru=\u0412\u044b \u043e\u0431\u044f\u0437\u0430\u043d\u044b \u0432\u0432\u0435\u0441\u0442\u0438 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u044d\u0442\u043e\u0433\u043e \u043f\u043e\u043b\u044f.","RequiredFieldMissing.ru=\u0412\u044b \u043d\u0435 \u0437\u0430\u0434\u0430\u043b\u0438 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u043e\u0434\u043d\u043e\u0433\u043e \u0438\u043b\u0438 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u0438\u0445 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u044b\u0445 \u0434\u043b\u044f \u0432\u0432\u043e\u0434\u0430 \u043f\u043e\u043b\u0435\u0439.","FieldWidth.ru=\u0412\u044b \u043f\u0440\u0435\u0432\u044b\u0441\u0438\u043b\u0438 \u043c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0443\u044e \u0434\u043b\u0438\u043d\u0443 \u043f\u043e\u043b\u044f.","ZOOM.ru=\u0432\u044b\u0431\u043e\u0440","FIND.ru=\u043f\u043e\u0438\u0441\u043a","UPDATE.ru=\u0437\u0430\u043c\u0435\u043d\u0430","BadBack.ru=\u0412 \u044d\u0442\u043e\u043c \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0438 \u0432\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043a\u043d\u043e\u043f\u043a\u0443 \u041d\u0430\u0437\u0430\u0434 \u0431\u0440\u0430\u0443\u0437\u0435\u0440\u0430.\n"+"\u0412\u043c\u0435\u0441\u0442\u043e \u044d\u0442\u043e\u0433\u043e \u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435\u0441\u044c \u043a\u043d\u043e\u043f\u043a\u043e\u0439 \u041d\u0430\u0437\u0430\u0434 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f.","INVALID_DATA_TYPE.ru=\u0417\u0430\u0434\u0430\u043d \u043d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0442\u0438\u043f \u0434\u0430\u043d\u043d\u044b\u0445.","OVERFLOW_ERROR.ru=\u041e\u0442\u0444\u043e\u0440\u043c\u0430\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u0432\u044b\u0448\u0430\u0435\u0442 \u0434\u043b\u0438\u043d\u0443 \u043f\u043e\u043b\u044f.","INVALID_CHAR.ru=\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b \u0432 \u0441\u0442\u0440\u043e\u043a\u0435.","INVALID_TIME_FORMAT.ru=\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b \u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435 \u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_VALUE.ru=\u0412\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043d\u0435 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0444\u043e\u0440\u043c\u0430\u0442\u0443.","INVALID_NUMERIC_VALUE.ru=\u0412\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0447\u0438\u0441\u043b\u043e\u043c.","INVALID_FORMAT.ru=\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b \u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435.","INVALID_DATETIME_VALUE.ru=\u0412\u0432\u0435\u0434\u0435\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043d\u0435 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0444\u043e\u0440\u043c\u0430\u0442\u0443 \u0434\u0430\u0442\u044b-\u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_MONTH.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u043c\u0435\u0441\u044f\u0446\u0435 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0439 \u0434\u0430\u0442\u0435.","INVALID_YEAR.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u0433\u043e\u0434\u0435 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0439 \u0434\u0430\u0442\u0435.","INVALID_DAY.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u0447\u0438\u0441\u043b\u0435 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0439 \u0434\u0430\u0442\u0435.","INVALID_HOUR.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u0447\u0430\u0441\u0435 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_MINUTE.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u043c\u0438\u043d\u0443\u0442\u0430\u0445 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_SECOND.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_MILLISECOND.ru=\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445 \u0432\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438.","INVALID_SEPERATOR.ru=\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0440\u0430\u0437\u0434\u0435\u043b\u0438\u0442\u0435\u043b\u044c.","MISMATCH_ERROR.ru=\u0412\u0432\u0435\u0434\u0435\u043d\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043d\u0435 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u044d\u043a\u0440\u0430\u043d\u043d\u043e\u043c\u0443 \u0444\u043e\u0440\u043c\u0430\u0442\u0443.","PrevFormDisabled.ru=\u041f\u0435\u0440\u0435\u0445\u043e\u0434 \u043a \u043f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0435\u0439 \u0444\u043e\u0440\u043c\u0435 \u0437\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u043d.","BadKeyMap.ru=\u042d\u0442\u043e\u0439 \u043a\u043b\u0430\u0432\u0438\u0448\u0435 \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d\u043e \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435.\n{0}","Uploading.ru=\u0417\u0430\u0433\u0440\u0443\u0436\u0430\u044e \u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440...","RECORDS_FOUND.ru=\u0437\u0430\u043f\u0438\u0441\u0435\u0439 \u043d\u0430\u0439\u0434\u0435\u043d\u043e","NO_RECORDS_FOUND.ru=\u0437\u0430\u043f\u0438\u0441\u0438 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b","ADDED.ru=\u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e","UPDATED.ru=\u0437\u0430\u043f\u0438\u0441\u0430\u043d\u043e","DELETED.ru=\u0443\u0434\u0430\u043b\u0435\u043d\u043e","ADDING.ru=\u0434\u043e\u0431\u0430\u0432\u043b\u044f\u044e","UPDATING.ru=\u0437\u0430\u043f\u0438\u0441\u044b\u0432\u0430\u044e","DELETING.ru=\u0443\u0434\u0430\u043b\u044f\u044e","not stored.ru=\u043d\u0435 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u043e","stored.ru=\u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u043e","stored/modified.ru=\u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u043e/\u0437\u0430\u043f\u0438\u0441\u0430\u043d\u043e","RECORD_NUMBER.ru=\u0437\u0430\u043f\u0438\u0441\u0435\u0439 ","RECORD_COUNT.ru=\u0438\u0437 ","SAVE_CHANGE.ru=\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u044f?","BAD_FILE.ru=\u041d\u0435\u0442 \u0442\u0430\u043a\u043e\u0433\u043e \u0444\u0430\u0439\u043b\u0430");
function MessageHandler(_6a7){
this.locale=_6a7;
this.alert=doAlert;
this.confirm=doConfirm;
this.findMessage=doFindMessage;
this.getMessage=doGetExpandedMessage;
}
function doAlert(name,args){
window.alert(this.getMessage(name,args));
}
function doConfirm(name,args){
return window.confirm(this.getMessage(name,args));
}
function doFindMessage(name){
var _6ad=null;
if(typeof (externalMessages)!="undefined"){
var _6ae=null;
do{
if(_6ad==null){
_6ae=new String(this.locale);
_6ad=name+"."+_6ae+"=";
}else{
var _6af;
_6af=_6ae.lastIndexOf("_");
if(_6af==-1){
_6ae="";
_6ad=name+"=";
}else{
_6ae=_6ae.substring(0,_6af);
_6ad=name+"."+_6ae+"=";
}
}
for(var idx=0;idx<externalMessages.length;idx++){
if(externalMessages[idx].indexOf(_6ad)==0){
return externalMessages[idx].substring(_6ad.length);
}
}
}while(_6ae!="");
}
return name;
}
function doGetExpandedMessage(name,args){
var text=this.findMessage(name);
if(text==null){
return name;
}else{
if(args==undefined){
return text;
}else{
return expandMessage(text,args);
}
}
}
function expandMessage(_6b4,args){
var text=_6b4;
var _6b7="";
var left;
var _6b9;
while(text.length!=0&&(left=text.indexOf("{"))!=-1&&(_6b9=text.indexOf("}",left+1))!=-1){
var _6ba=text.substring(0,left);
var _6bb=text.substring(left+1,_6b9);
var _6bc=text.substring(_6b9+1);
_6b7=_6b7+_6ba+args[_6bb];
text=_6bc;
}
return _6b7+text;
}
var TYPE_NULL=0;
var TYPE_NUMERIC=1;
var TYPE_FLOAT=2;
var TYPE_BOOL=3;
var TYPE_STRING=4;
var TYPE_DATE=5;
var TYPE_TIME=6;
var TYPE_AMOUNT=7;
var TYPE_TEXTM=8;
var TYPE_TEXTF=9;
var TYPE_BINARYM=10;
var TYPE_BINARYF=11;
var TYPE_DATETIME=12;
var radix_separator;
var triad_separator;
var centurycutoff;
var currency_symbol;
var true_format;
var false_format;
var nulls;
var dateFormat;
var timeFormat;
var dateTimeFormat;
var printfStyle;
var serverValue;
var STRESC="\\";
var STRNXT="%";
var STRREST="^";
var MTCH1=0;
var MTCH2=1;
var SKIP=2;
var TM_24HR=0;
var TM_12HR=1;
var LD_SINGLE_QUOTE="'";
var dayNames=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
var monthNames=new Array("January","Feburary","March","April","May","June","July","August","September","Octobar","November","December");
var shortMonthNames=new Array("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
var shortTimeZoneString="PST";
var longTimeZoneString="Pacific Daylight Time";
var amStr="AM";
var pmStr="PM";
var searchOROperator=",";
var searchRangeOperator="-";
var OrOpLen=1;
var RngOpLen=1;
function Validator(_6bd,_6be,_6bf,_6c0,_6c1,_6c2,_6c3,_6c4,_6c5,_6c6,_6c7,_6c8,_6c9,_6ca,_6cb,_6cc,_6cd,_6ce,_6cf){
this.messageHandler=_6bd;
this.radix_separator=_6be;
this.triad_separator=_6bf;
this.currency_symbol=_6c0;
this.currency_scale=_6cf;
this.nullChars=_6c2;
this.centurycutoff=_6c3;
this.dateFormat=_6c4;
this.validateAndFormat=doValidateAndFormat;
this.validateFind=doValidateFind;
this.trim=trim;
var _6d0=_6c1.split("/");
this.true_format=_6d0.length>0?_6d0[0]:"YES";
this.false_format=_6d0.length>1?_6d0[1]:"NO";
this.timeFormat=_6c5;
this.dateTimeFormat=_6c6;
if(_6c7!=null&&_6c7.length!=0){
this.monthNames=_6c7.split(";");
}
if(_6cb!=null&&_6cb.length!=0){
this.shortMonthNames=_6cb.split(";");
}
if(_6c8!=null&&_6c8.length!=0){
this.dayNames=_6c8.split(";");
}
if(_6ca!=null&&_6ca.length!=0){
var _6d1=_6ca.split(";");
if(_6d1.length==2){
this.amStr=_6d1[0];
this.pmStr=_6d1[1];
}
}
var _6d2=_6c9.split(";");
this.shortTimeZoneString=_6d2[0];
this.longTimeZoneString=_6d2[1];
if(_6cc!=null&&_6cc!=undefined){
this.searchOROperator=_6cc;
this.OrOpLen=_6cc.length;
}
if(_6cd!=null&&_6cd!=undefined){
this.searchRangeOperator=_6cd;
this.RngOpLen=_6cd.length;
}
this.suppressNullDisplay=_6ce;
this.toString=ValidatorToString;
}
function ValidatorToString(){
var buf="";
buf+="radix_separator = "+this.radix_separator;
buf+="\n";
buf+="triad_separator = "+this.triad_separator;
buf+="\n";
buf+="currency_symbol = "+this.currency_symbol;
buf+="\n";
buf+="true_format = "+this.true_format;
buf+="\n";
buf+="false_format = "+this.false_format;
buf+="\n";
nuf+="Century cutoff = "+this.centurycutoff;
buf+="\n";
buf+="Date format = "+this.dateFormat;
buf+="\n";
buf+="Time format = "+this.timeFormat;
buf+="\n";
buf+="DateTime format = "+this.dateTimeFormat;
return buf.toString();
}
function doValidateAndFormat(desc,_6d5){
var _6d6=desc.type;
var _6d7=desc.fieldWidth;
var _6d8=_6d5.length;
var _6d9;
var _6da=null;
var _6db=desc.displayFormat;
var _6dc=this.nullChars.charAt(parseInt(_6d6));
var _6dd=trim(_6d5);
var _6de=false;
if((desc.flags&65536)!=0){
_6de=true;
}else{
if(_6dd.length==0){
_6de=((_6dc==" ")||(_6dc=="\x00"));
}else{
_6de=true;
for(idx=0;idx<_6d8;idx++){
if(_6d5.charAt(idx)!=_6dc){
_6de=false;
break;
}
}
}
}
if(_6de){
_6d5="";
if(_6dc==0||_6dc==32){
this.serverValue=_6d5;
return _6d5;
}
var _6df=_6d7;
if(_6d6==TYPE_TEXTM||_6d6==TYPE_TEXTF){
_6df=10;
}
for(idx=0;idx<desc.fieldWidth;idx++){
_6d5+=_6dc;
}
_6d5=trim(_6d5);
this.serverValue=_6d5;
return _6d5;
}
if(_6db.charAt(0)=="%"){
this.printfStyle=true;
}else{
this.printfStyle=false;
}
if(_6d6==TYPE_BINARYM||_6d6==TYPE_TEXTM||_6d6==TYPE_BINARYF||_6d6==TYPE_TEXTF){
return _6d5;
}else{
if(_6d6==TYPE_STRING){
_6da=validateAndFormatString(this,desc,_6d5);
}else{
if(_6d6==TYPE_DATE){
if(_6dd==""&&this.suppressNullDisplay){
this.serverValue=_6dd;
return _6dd;
}
if(_6db==null||_6db.length==0){
_6db=validatorInstance.dateFormat;
}
_6da=validateAndFormatDateTime(this,_6db,_6d5,_6d6);
this.serverValue=_6da;
}else{
if(_6d6==TYPE_AMOUNT){
_6d5=trim(_6d5);
if(this.currency_symbol=="$"){
_6d5=_6d5.replace(/\$/,"");
}else{
var re=new RegExp(this.currency_symbol);
_6d5=_6d5.replace(re,"");
}
_6da=validateAndFormatFloat(this,_6db,_6d5,_6d6);
}else{
if(_6d6==TYPE_BOOL){
_6da=validateAndFormatBoolean(this,_6db,_6d5);
}else{
if(_6d6==TYPE_TIME){
if(_6db==null||_6db.length==0){
_6db=validatorInstance.timeFormat;
}
_6d5=lTrim(_6d5);
_6da=validateAndFormatDateTime(this,_6db,_6d5,_6d6);
this.serverValue=_6da;
}else{
if(_6d6==TYPE_FLOAT||_6d6==TYPE_NUMERIC){
_6da=validateAndFormatFloat(this,_6db,_6d5,_6d6);
}else{
if(_6d6==TYPE_DATETIME){
if(_6db==null||_6db.length==0){
_6db=validatorInstance.dateTimeFormat;
}
_6da=validateAndFormatDateTime(this,_6db,_6d5,_6d6);
this.serverValue=_6da;
}else{
this.messageHandler.alert("INVALID_DATA_TYPE");
_6d9=false;
}
}
}
}
}
}
}
}
if(_6da==null){
return null;
}
if(_6d7!=0&&_6d8>_6d7){
this.messageHandler.alert("OVERFLOW_ERROR");
var _6e1="";
for(formatCount=0;formatCount<_6d7;formatCount++){
_6e1+="?";
}
return _6e1;
}
return _6da;
}
function doValidateFind(desc,_6e3){
if(desc.type==TYPE_STRING){
return _6e3;
}
var _6e4=_6e3.length;
var _6e5=-1;
var idx,subValue,convString="";
for(idx=0;idx<_6e4;++idx){
var ch=_6e3.charAt(idx);
if(ch==">"||ch=="<"||ch=="!"||_6e3.substr(idx,this.OrOpLen)==this.searchOROperator||_6e3.substr(idx,this.RngOpLen)==this.searchRangeOperator){
if(_6e5!=-1){
subValue=_6e3.substring(_6e5,idx);
if(subValue!="@"){
convString=this.validateAndFormat(desc,subValue);
if(convString==null){
return null;
}
}
_6e5=-1;
}
if(this.OrOpLen>1&&ch==this.searchOROperator.charAt(0)){
idx+=this.OrOpLen-1;
}else{
if(this.RngOpLen>1&&ch==this.searchRangeOperator.charAt(0)){
idx+=this.RngOpLen-1;
}
}
}else{
if(_6e5<0){
_6e5=idx;
}
}
}
if(_6e5!=-1){
subValue=_6e3.substring(_6e5);
if(subValue!="@"){
convString=this.validateAndFormat(desc,subValue);
if(convString==null){
return null;
}
}
}
return _6e3;
}
function parseStringUsing(_6e8,desc,_6ea){
var _6eb,valueLen;
var _6ec="";
var _6ed=desc.displayFormat;
_6eb=_6ed.length;
valueLen=_6ea.length;
var _6ee;
if("^"==_6ed){
return (_6ea);
}
for(_6ee=0;_6ee<_6eb;++_6ee){
var _6ef=_6ed.charAt(_6ee);
switch(_6ef){
case "\\":
if(_6ee+1>=_6eb){
continue;
}
_6ef=_6ed.charAt(++_6ee);
break;
case "%":
continue;
break;
case "^":
continue;
break;
default:
break;
}
switch(_6ef){
case "\\":
case "/":
case ".":
case "*":
case "+":
case "?":
case "|":
case "(":
case ")":
case "[":
case "]":
case "{":
case "}":
_6ec+="\\";
_6ec+=_6ef;
break;
case "\t":
_6ec+="\\t";
break;
default:
_6ec+=_6ef;
break;
}
}
if(_6ec.length>0){
var rex=new RegExp("["+_6ec+"]","g");
result=_6ea.replace(rex,"");
}else{
result=_6ea;
}
return result;
}
function formatStringUsing(_6f1,desc,_6f3){
var _6f4=0;
var _6f5=desc.fieldWidth;
var _6f6=_6f3.length;
var _6f7=desc.displayFormat;
var _6f8=_6f7.length;
var _6f9;
var _6fa="";
if("^"==_6f7){
return (_6f3);
}
for(_6f9=0;_6f9<_6f8;++_6f9){
var _6fb=_6f7.charAt(_6f9);
switch(_6fb){
case "\\":
if(_6f9+1<_6f8){
_6fa+=_6f7.charAt(++_6f9);
}
break;
case "%":
if(_6f4<_6f6){
_6fa+=_6f3.charAt(_6f4++);
}else{
_6fa+=" ";
}
break;
case "^":
if(_6f4<_6f6){
_6fa+=_6f3.substring(_6f4);
_6f4=_6f6;
}
break;
default:
_6fa+=_6fb;
break;
}
}
if(_6f4<_6f6){
_6f1.messageHandler.alert("OVERFLOW_ERROR");
return null;
}
if(_6fa.length>_6f5){
_6f1.messageHandler.alert("OVERFLOW_ERROR");
return null;
}
if(desc.caseConversion=="U"){
_6fa=_6fa.toUpperCase();
}else{
if(desc.caseConversion=="L"){
_6fa=_6fa.toLowerCase();
}
}
return (_6fa);
}
function validateAndFormatString(_6fc,desc,_6fe){
var _6ff=parseStringUsing(_6fc,desc,_6fe);
if(_6ff!=null){
return (formatStringUsing(_6fc,desc,_6ff));
}
return null;
}
function validateAndFormatBoolean(_700,_701,_702){
var _703="";
_702=trim(_702);
if(_702.length==0){
_700.messageHandler.alert("INVALID_VALUE");
return null;
}
if(_701.length==0||_701.indexOf("/")==-1||_700.printfStyle==true){
_700.messageHandler.alert("INVALID_FORMAT");
return null;
}
var sep=_701.split("/");
var _705=sep[0];
var _706=sep[1];
var _707=_700.true_format;
var _708=_700.false_format;
if(_705.length>0){
_707=_705;
}
if(_706.length>0){
_708=_706;
}
var inx=0;
for(inx=0;inx<_707.length&&inx<_708.length;++inx){
if(_707.charAt(inx)!=_708.charAt(inx)){
break;
}
}
var _70a=++inx;
_703=null;
for(idx=0;idx<_70a&&idx<_707.length;idx++){
if(_702.charAt(idx).toUpperCase()==_707.charAt(idx).toUpperCase()){
if(idx+1==_70a){
_703=_705;
break;
}else{
break;
}
}
}
if(_703==null){
for(idx=0;idx<_70a&&idx<_708.length;idx++){
if(_702.charAt(idx).toUpperCase()==_708.charAt(idx).toUpperCase()){
if(idx+1==_70a){
_703=_706;
break;
}
}else{
break;
}
}
}
if(_703==null){
_700.messageHandler.alert("INVALID_VALUE");
}
return _703;
}
function validateAndFormatNumber(_70b,_70c,_70d,_70e){
var _70f="";
_70d=trim(_70d);
if(_70d.length!=0){
var _710=_70d.replace(/[(]/,"");
_710=_710.replace(/[)]/,"");
_710=_710.replace(/[-]/,"");
var _711=parseInt(_710,10);
var _712=false;
if(_711==0){
_712=true;
}
var _70f=checkNumberValue(_70b,_70d,_70e);
_70b.serverValue=_70f;
if(_70f!=null&&_70f!=""&&_70b.printfStyle==false){
if(_70c.indexOf(_70b.radix_separator)!=-1){
_70f=formatFloat(_70b,_70c,_70f,_712,_70e);
}else{
_70f=formatNumber(_70b,_70c,_70f,_712,_70e,0);
}
}
}
return _70f;
}
function validateAndFormatFloat(_713,_714,_715,_716){
var _717="";
_715=trim(_715);
var _718;
var _719;
if(_716==TYPE_FLOAT||_716==TYPE_NUMERIC){
if(_714!=null&&_714.length>0){
_714=_714.replace(/[0]/g,"&");
var _71a=_714.split(";");
if(_71a.length!=2){
_713.messageHandler.alert("INVALID_FORMAT");
return null;
}
_719=_71a[0];
_718=_71a[1];
}
}
if(_715.length!=0){
var _71b=_715.replace(/[(]/,"");
_71b=_71b.replace(/[)] /,"");
_71b=_71b.replace(/[-] /,"");
var _71c=parseFloat(_71b);
var _71d=false;
if(isNaN(_71c)){
_713.messageHandler.alert("INVALID_NUMERIC_VALUE");
return null;
}
if(_71c==0){
_71d=true;
}
var _717=checkNumberValue(_713,_715,_716);
if(_717==null){
return _717;
}
if(_716==TYPE_AMOUNT){
if(_714==null||_714.length==0){
var _71e=false;
var _71f=_713.currency_scale;
var _720=")";
for(idx=0;idx<_71f;idx++){
_720+="&";
_71e=true;
}
if(_71e){
_720+=".";
}
var _721=new Number(_717*Math.pow(10,_71f)).toFixed(0);
var _722=_721.toString();
var _723=_722.length;
_723-=_71f;
_720+="&";
for(bindex=1;bindex<_723;bindex++){
if(bindex%3==0){
_720+=",";
}
_720+="#";
}
_720+="$";
_720+="(";
for(idx=_720.length;idx>0;idx--){
_714+=_720.charAt(idx-1);
}
}
}
if(_716==TYPE_FLOAT||_716==TYPE_NUMERIC){
if(_717.charAt(0)=="-"){
_714=_718;
}else{
_714=_719;
}
}
_713.serverValue=_717;
var _724=parseFloat(_717);
if(isNaN(_724)){
_713.messageHandler.alert("INVALID_NUMERIC_VALUE");
return null;
}
if(_717!=null&&_717!=""&&_713.printfStyle==false){
_717=formatFloat(_713,_714,_724.toString(),_71d,_716);
}
}
var _725=_717;
if(_717!=null&&(_716==TYPE_FLOAT||_716==TYPE_NUMERIC)){
var _726=_717.charAt(0);
if(_726=="-"||_726=="+"){
_725=_717.substr(1);
_717=_726+lTrim(_725);
}else{
_717=lTrim(_717);
}
if(_717.charAt(0)==_713.radix_separator){
_717="0"+_717;
}
if(_717.length==0&_71d){
_717="0";
}
if(_714!=null){
var _727=_714.charAt(_714.length-1);
var _728=_717.charAt(_717.length-1);
if(_727=="."&&_728!=_713.radix_separator){
_717=_717+_713.radix_separator;
}
}
}
return _717;
}
function formatFloat(_729,_72a,_72b,_72c,_72d){
var _72e=0;
var _72f=0;
var _730=0;
if(_72a!=null&&_72a.indexOf(".")!=-1){
_72e=afterdot(_72a);
var _731=afterdot(_72b);
if(_731<_72e&&_72d==TYPE_FLOAT){
_72f=_72e-_731;
}
}
if(!_72c){
_72b=roundup(_72b,_72e,4);
}
_72b=_72b.replace(/[\.]/,"");
if(_72c==false){
var i=0;
while((i<_72b.length)&&_72b.charAt(i)=="0"){
i++;
}
_72b=_72b.substr(i);
}
var _733=formatNumber(_729,_72a,_72b,_72c,_72d,_72f);
if(_733!=null){
var clen=_733.length;
if(_733.charAt(clen-1)==_729.radix_separator){
_733=_733.substr(0,clen-1);
}
}
return _733;
}
function roundup(_735,_736,_737){
var _738=parseFloat(_735);
_738=Math.round(_738*Math.pow(10,_736))/Math.pow(10,_736);
_735=_738.toString();
var _739=_735.indexOf(".");
var _73a=0;
if(_739==-1){
_735+=".";
}else{
_73a=_735.length-_739-1;
}
for(idx=_73a;idx<_736;idx++){
_735+="0";
}
return (_735);
}
function afterdot(_73b){
var _73c=_73b.indexOf(".");
if(_73c==-1){
_73c=_73b.length;
}
var _73d=_73b.substr(_73c+1);
var _73e=_73d.length;
var _73f;
for(var _740=_73d.length;_740>0;_740--){
_73f=_73d.charAt(_740);
if((_73f=="+"||_73f=="-"||_73f=="("||_73f==")"||_73f=="$"||_73f==",")&&_73f!=_73d.charAt(_740-1)&&_73d.charAt(_740-1)!="."){
--_73e;
}
}
return _73e;
}
function beforedot(_741){
var _742=_741.indexOf(".");
if(_742==-1){
_742=_741.length;
}
var _743=_741.substr(0,_742);
scale=_743.length;
var _744;
for(var _745=_743.length;_745>0;_745--){
_744=_743.charAt(_745);
if((_744=="+"||_744=="-"||_744=="("||_744==")"||_744=="$"||_744==",")&&_744!=_743.charAt(_745-1)){
--scale;
}
}
return scale;
}
function formatNumber(_746,_747,_748,_749,_74a,_74b){
var _74c=false;
var _74d=false;
var _74e=0;
var _74f=false;
var pls=0;
var _751=false;
var mini=0;
var _753=false;
var _754=false;
var _755=false;
var _756=false;
var _757=false;
var ch="";
var _759=true;
var _75a=0;
var _75b="";
var _75c=new Array();
var _75d=0;
if(_747==null||_747==""){
return _748;
}
_75a=_747.length-1;
_75d=_747.length;
for(var idx=0;idx<_75d;idx++){
_75c[idx]=" ";
}
var _75f=_75d-1;
if(_748<0||(_748.charAt(0)=="("&&_748.charAt(_748.length-1)==")")||_748.charAt(_748.length-1)=="-"||_748.charAt(0)=="-"){
_748=_748.replace(/[-]/,"");
_748=_748.replace(/[(]/,"");
_748=_748.replace(/[)]/,"");
if(!_749){
_759=false;
}
}
var _760=_748.length-1;
if(_748==""){
_749=true;
}
if(_747.indexOf(".")!=-1){
_74c=true;
}
var _761=new Array();
for(idx=0;idx<_748.length;idx++){
_761[idx]=_748.charAt(idx);
}
while(_757==false&&_75a>0){
ch=_747.charAt(_75a);
if(ch==_747.charAt(_75a-1)){
_757=true;
}else{
if(ch=="-"){
if(!_751){
if(!_759){
_75c[_75f]=_747.charAt(_75a);
++mini;
}else{
_75c[_75f]=" ";
}
_751=true;
}else{
_757=true;
}
}else{
if(ch=="+"){
if(!_74f){
if(_759&&!_749){
_75c[_75f]=_747.charAt(_75a);
++pls;
}else{
if(!_759&&!_749){
_75c[_75f]="-";
++pls;
}else{
_75c[_75f]=" ";
}
}
_74f=true;
}else{
_757=true;
}
}else{
if(ch=="$"){
if(!_74d){
_75c[_75f]=_747.charAt(_75a);
_74d=true;
}else{
_757=true;
}
}else{
_757=true;
}
}
}
}
if(_757!=true){
_75a--;
_75f--;
}
}
var _762=false;
for(;_75a>=0;_75a--){
ch=_747.charAt(_75a);
if(ch=="."){
_74c=false;
_762=false;
if(_749&&_747.charAt(_75a+1)=="#"){
_75c[_75f]=" ";
continue;
}
_75c[_75f]=_747.charAt(_75a);
if(_761[_760]!=_75b[_75f]){
_760++;
}
}else{
if(ch==","){
if(_761[_760]!=" "||(_75a>=0&&_747.charAt(_75a-1)=="&")){
_75c[_75f]=_747.charAt(_75a);
}else{
if(_747.charAt(_75a+1)=="*"){
_75c[_75f]="*";
}else{
_75c[_75f]=" ";
}
}
if(_761[_760]==" "&&_75a>=0){
fmtch=_747.charAt(_75a-1);
if(fmtch=="$"||fmtch=="+"||fmtch=="-"){
++_75f;
}
}
if(_761[_760]!=_75c[_75f]){
++_760;
}
}else{
if(ch=="("){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_755||!_754){
_75c[_75f]=" ";
}else{
if(!_759){
_755=true;
++mini;
_75c[_75f]=_747.charAt(_75a);
}
}
}
}else{
if(ch=="-"){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_751||_756||_759){
_75c[_75f]=" ";
}else{
if(!_759){
_756=true;
++mini;
_75c[_75f]=_747.charAt(_75a);
}
}
}
}else{
if(ch=="+"){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_74f){
_75c[_75f]=" ";
}else{
if(_759&&!pls&&!_749){
++pls;
_75c[_75f]=_747.charAt(_75a);
}else{
if(!_759&&!pls&&!_749){
++pls;
++mini;
_75c[_75f]="-";
}
}
}
}
}else{
if(ch=="$"){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_74d){
_75c[_75f]=" ";
}else{
if(!_74e){
_75c[_75f]=_747.charAt(_75a);
++_74e;
}
}
}
}else{
if(ch==")"){
if(!_759){
_75c[_75f]=")";
_754=true;
}
}else{
if(ch=="#"){
if(_74a==TYPE_FLOAT){
if(_760>=0&&_761[_760]!=" "){
if(_761[_760]!="0"||_762||!_74c){
_75c[_75f]=_761[_760];
if(_74c){
_762=true;
}else{
_762=false;
}
}
}else{
if(_762&&_74c){
_75c[_75f]="0";
}
}
}else{
if(!_749){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_74c){
_75c[_75f]="0";
}else{
if(_74a!=TYPE_NUMERIC){
_75c[_75f]=" ";
}
}
}
}
}
}else{
if(ch=="&"){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
_75c[_75f]="0";
}
}else{
if(ch=="*"){
if(_761[_760]!=" "&&_760>=0){
_75c[_75f]=_761[_760];
}else{
if(_74c){
_75c[_75f]="0";
}else{
_75c[_75f]="*";
}
}
}
}
}
}
}
}
}
}
}
}
_75f--;
if(_747.charAt(_75a)!=")"){
_760--;
}
if(_753){
_761[_760]=_75c[_75f];
}else{
if(_760<0){
_761[_760]=_75c[_75f];
_753=true;
}
}
if(_75f<0){
break;
}
}
if(!_759&&!mini){
if(_75a!=0&&(_747.charAt(0)=="(")&&_754){
if(_75c[0]==" "){
_75c[0]="(";
}
}
}
if(((_761[_760]!=_75c[_75f])&&_761[_760]!=" ")||(!_759&&!mini)){
_746.messageHandler.alert("OVERFLOW_ERROR");
return null;
}
_75b=substitueSymbols(_746,_75c);
return _75b;
}
function substitueSymbols(_763,_764){
outString=convertArrayToString(_764);
outString=rTrim(outString);
var _765=outString.length;
var idx;
var ch="";
var _768=false;
var _769="";
for(idx=_765;idx>=0;idx--){
if(outString.charAt(idx)!=" "&&outString.charAt(idx)!="."){
_768=false;
break;
}
}
for(idx=0;idx<_765;idx++){
ch=outString.charAt(idx);
if(ch=="."){
if(_768==false){
_769+=_763.radix_separator;
}else{
_769+=" ";
}
}else{
if(ch=="$"){
_769+=_763.currency_symbol;
}else{
if(ch==","){
_769+=_763.triad_separator;
}else{
_769+=outString.charAt(idx);
}
}
}
}
return _769;
}
function checkNumberValue(_76a,_76b,stp){
var _76d="";
var _76e=false;
var _76f=false;
var _770=false;
var _771=false;
var _772=false;
var _773=false;
var _774=false;
var _775=false;
var _776=false;
var sign=1;
var _778="INVALID_VALUE";
if(stp==TYPE_NUMERIC){
_778="INVALID_NUMERIC_VALUE";
}
if(stp==TYPE_FLOAT){
_774=true;
_775=true;
}else{
if(stp==TYPE_AMOUNT){
_775=true;
_776=true;
}else{
if(stp!=TYPE_NUMERIC){
_76a.messageHandler.alert("INVALID_DATE_TYPE");
return null;
}
}
}
grouping=3;
var _779="";
var _77a="";
ncurrsym=_76a.currency_symbol.length;
numberStringCount=0;
var ch="";
var _77c=_76a.triad_separator.charCodeAt(0);
for(count=0;count<_76b.length;count++){
ch=_76b.charAt(count);
var _77d=_76b.charAt(count+1);
if(ch==_76a.triad_separator||(ch==" "&&_77c==160)){
continue;
}
if(isDigit(ch)){
_779+=ch;
continue;
}
if(ncurrsym>0&&(_76a.currency_symbol==_76b.substr(count,ncurrsym))){
if(!_776){
_76a.messageHandler.alert(_778);
return null;
}
if(_773){
_76a.messageHandler.alert(_778);
return null;
}
_773=true;
count+=ncurrsym-1;
continue;
}
if(ch==_76a.radix_separator||ch=="."&&ch!=_76a.triad_separator){
if(!_775){
_76a.messageHandler.alert(_778);
return null;
}
if(_76e){
_76a.messageHandler.alert(_778);
return null;
}
_76e=true;
_779+=".";
continue;
}
if(ch=="-"){
if(_770||_771||(count!=0&&count!=_76b.length-1)){
_76a.messageHandler.alert(_778);
return null;
}
_770=true;
sign=-1;
}else{
if(ch=="+"){
if(_770||_771||(count!=0&&count!=_76b.length-1)){
_76a.messageHandler.alert(_778);
return null;
}
_770=true;
sign=1;
}else{
if(ch=="("){
if(_770||_771||count!=0){
_76a.messageHandler.alert(_778);
return null;
}
_771=true;
sign=-1;
saveCount=count;
saveCount++;
ch=_76b.charAt(saveCount);
if(ch==" "||ch=="\t"){
while(saveCount!=_76b.length&&(ch==" "||ch=="\t")){
ch=_76b.charAt(++saveCount);
}
count=--saveCount;
}
}else{
if(ch==")"){
if(_770||!_771||count!=_76b.length-1){
_76a.messageHandler.alert(_778);
return null;
}
if(count+1!=_76b.length){
count++;
if(ncurrsym>0&&(_76a.currency_symbol==_76b.substr(count,ncurrsym))){
count+=ncurrsym-1;
if(count!=_76b.length){
_76a.messageHandler.alert(_778);
return null;
}
}else{
_76a.messageHandler.alert(_778);
return null;
}
}else{
count++;
}
_772=true;
}else{
if(ch=="e"||ch=="E"){
if(!_774){
_76a.messageHandler.alert(_778);
return null;
}
if(_771){
_76a.messageHandler.alert(_778);
return null;
}
_779+=ch;
count++;
if(count==_76b.length){
_76a.messageHandler.alert(_778);
return null;
}
ch=_76b.charAt(count);
if(ch=="-"||ch=="+"){
_779+=ch;
count++;
ch=_76b.charAt(count);
while(count!=_76b.length&&(ch==" "||ch=="\t")){
count++;
}
}
if(count==_76b.length){
_76a.messageHandler.alert(_778);
return null;
}
if(isDigit(ch)){
_779+=_76b.charAt(count++);
}else{
_76a.messageHandler.alert(_778);
return null;
}
while(count<_76b.length){
ch=_76b.charAt(count);
if(isDigit(ch)){
_779+=_76b.charAt(count++);
}else{
_76a.messageHandler.alert(_778);
return null;
}
}
if(count!=_76b.length){
_76a.messageHandler.alert(_778);
return null;
}
}else{
_76a.messageHandler.alert(_778);
return null;
}
}
}
}
}
}
if(_771&&!_772){
_76a.messageHandler.alert(_778);
return null;
}
if(sign==-1){
_77a="-";
}else{
_77a="";
}
for(count=0;count<_779.length;count++){
ch=_779.charAt(count);
if(ch!=","&&ch!=" "){
_77a+=ch;
}
}
if(_77a=="-0.0"){
_77a="0.0";
}
if(_77a=="-"){
_77a="";
}
if(_76a.printfStyle==true){
return _76b;
}
return _77a;
}
function validateAndFormatDateTime(_77e,_77f,_780,_781){
var _782="";
_780=trim(_780);
var year=-1;
var _784=-1;
var day=-1;
var hour=-1;
var _787=-1;
var _788=-1;
var _789=-1;
var _78a="";
var _78b="";
var _78c=0;
var _78d=0;
var _78e=0;
var _78f=0;
var _790=0;
var _791=0;
var _792=0;
var _793=false;
var _794="";
var YYCH="y";
var MMCH="M";
var DDCH="d";
var _798="H";
var _799="h";
var _79a="m";
var SSCH="s";
var MSCH="S";
var _79d="a";
var TZCH="z";
var _79f;
var ch;
var _7a1=-1;
var idx=0;
var _7a3=false;
var _7a4="";
var _7a5=false;
var _7a6;
var _7a7;
var stop;
for(_7a6=0;_7a6<_77f.length;++_7a6){
_79f=_77f.charAt(_7a6);
ch=_780.charAt(idx);
switch(_79f){
case LD_SINGLE_QUOTE:
var _7a9=_77f.charAt(_7a6+1);
if(ch==LD_SINGLE_QUOTE){
idx++;
}
if(_7a9==LD_SINGLE_QUOTE){
_7a6++;
}else{
if(_7a3){
_7a3=false;
_7a5=false;
}else{
_7a3=true;
_7a5=false;
}
}
break;
case YYCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(!isDigit(ch)||ch==_79f){
idx++;
continue;
}
}
if(year!=-1){
_77e.messageHandler.alert("INVALID_FORMAT");
return null;
}
_78c=1;
_79f=_77f.charAt(++_7a6);
while(_79f==YYCH){
++_78c;
_79f=_77f.charAt(++_7a6);
}
_7a6--;
if(_78c>4){
_77e.messageHandler.alert("INVALID_FORMAT");
return null;
}
if(isIntFormatMetaChar(_79f)){
stop=idx+((_78c<=2)?2:4);
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>4){
_77e.messageHandler.alert("INVALID_YEAR");
return null;
}
year=parseInt(_780.substring(_7a7,idx),10);
break;
case MMCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(ch==_79f||(!isDigit(ch)&&!isLetter(_780.charCodeAt(idx)))){
idx++;
continue;
}
}
if(_784!=-1){
_77e.messageHandler.alert("INVALID_FORMAT");
return null;
}
_78d=1;
_79f=_77f.charAt(++_7a6);
while(_79f==MMCH){
++_78d;
_79f=_77f.charAt(++_7a6);
}
_7a6--;
if(_78d<=2||isDigit(ch)){
if(isIntFormatMetaChar(_79f)){
stop=idx+2;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>2){
_77e.messageHandler.alert("INVALID_MONTH");
return null;
}
_784=parseInt(_780.substring(_7a7,idx),10)-1;
}else{
_793=true;
if(_78d>4){
_77e.messageHandler.alert("INVALID_FORMAT");
return null;
}
_7a7=idx;
while(isLetter(_780.charCodeAt(idx))){
++idx;
}
if((idx-_7a7)<3){
_77e.messageHandler.alert("INVALID_MONTH");
return null;
}
monthName=_780.substring(_7a7,idx);
_784=findMonth(_77e,monthName);
if(_784==-1){
_77e.messageHandler.alert("INVALID_MONTH");
return null;
}
}
break;
case DDCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(!isDigit(ch)||ch==_79f){
idx++;
continue;
}
}
if(day!=-1){
_77e.messageHandler.alert("INVALID_FORMAT");
return null;
}
_79f=_77f.charAt(++_7a6);
if(_79f==DDCH){
_78e=2;
_79f=_77f.charAt(_7a6+1);
}else{
_78e=1;
_7a6--;
}
if(isIntFormatMetaChar(_79f)){
stop=idx+2;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>2){
_77e.messageHandler.alert("INVALID_DAY");
return null;
}
day=parseInt(_780.substring(_7a7,idx),10);
break;
case "E":
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(ch==_79f||!isLetter(_780.charCodeAt(idx))){
idx++;
continue;
}
}
var _7aa=0;
while(_79f=="E"){
_7a6++;
_79f=_77f.charAt(_7a6);
_7aa++;
}
_7a6--;
while(isLetter(_780.charCodeAt(idx))){
ch=_780.charAt(++idx);
}
if(ch==_79f){
_793=true;
}
break;
case _798:
case _799:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(!isDigit(ch)||ch==_79f){
idx++;
continue;
}
}
if(hour!=-1){
_77e.messageHandler.alert("INVALID_TIME_FORMAT");
return null;
}
var _7ab=_79f;
_79f=_77f.charAt(++_7a6);
if(_79f==_7ab){
_78f=2;
_79f=_77f.charAt(_7a6+1);
}else{
_78f=1;
_7a6--;
}
if(isIntFormatMetaChar(_79f)||(_780.indexOf(_79f)==-1&&_780.length==4)){
stop=idx+2;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>2){
_77e.messageHandler.alert("INVALID_HOUR");
return null;
}
hour=parseInt(_780.substring(_7a7,idx),10);
if(_79f==_799){
if(hour==0){
hour=12;
}
if(hour>12){
hour=hour-12;
}
if(hour<1||hour>12){
_77e.messageHandler.alert("INVALID_HOUR");
return null;
}
}else{
if(hour<0||hour>23){
_77e.messageHandler.alert("INVALID_HOUR");
return null;
}
}
break;
case _79a:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
if(!isDigit(ch)||ch==_79f){
_793=false;
idx++;
continue;
}
}
if(_787!=-1){
_77e.messageHandler.alert("INVALID_TIME_FORMAT");
return null;
}
_79f=_77f.charAt(++_7a6);
if(_79f==_79a){
_790=2;
_79f=_77f.charAt(_7a6+1);
}else{
_790=1;
_7a6--;
}
if(isIntFormatMetaChar(_79f)){
stop=idx+2;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>2){
_77e.messageHandler.alert("INVALID_MINUTE");
return null;
}
_787=parseInt(_780.substring(_7a7,idx),10);
break;
case SSCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(!isDigit(ch)||ch==_79f){
idx++;
continue;
}
}
if(_788!=-1){
_77e.messageHandler.alert("INVALID_TIME_FORMAT");
return null;
}
_79f=_77f.charAt(++_7a6);
if(_79f==SSCH){
_791=2;
_79f=_77f.charAt(_7a6+1);
}else{
_791=1;
_7a6--;
}
if(isIntFormatMetaChar(_79f)){
stop=idx+2;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>2){
if(_7a7>=_780.length){
_788=0;
}else{
_77e.messageHandler.alert("INVALID_SECOND");
return null;
}
}else{
_788=parseInt(_780.substring(_7a7,idx),10);
}
break;
case MSCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
if(_793){
_793=false;
if(!isDigit(ch)||ch==_79f){
idx++;
continue;
}
}
if(_789!=-1){
_77e.messageHandler.alert("INVALID_TIME_FORMAT");
return null;
}
_792=1;
_79f=_77f.charAt(++_7a6);
while(_79f==MSCH){
++_792;
_79f=_77f.charAt(++_7a6);
}
_7a6--;
if(_792>3){
_77e.messageHandler.alert("INVALID_TIME_FORMAT");
return null;
}
if(isIntFormatMetaChar(_79f)){
stop=idx+3;
}else{
_793=true;
stop=_780.length;
}
_7a7=idx;
while(idx<stop&&isDigit(ch)){
ch=_780.charAt(++idx);
}
if(idx==_7a7||(idx-_7a7)>3){
if(_7a7>=_780.length){
_789=0;
}else{
_77e.messageHandler.alert("INVALID_MILLISECOND");
return null;
}
}else{
_789=parseInt(_780.substring(_7a7,idx),10);
}
break;
case _79d:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
saveIdx=idx;
_7a4="";
while(isLetter(_780.charCodeAt(saveIdx))){
_7a4=_7a4+ch;
ch=_780.charAt(++saveIdx);
}
if(_7a4==_77e.amStr){
_794=_7a4;
idx+=amStr.length;
}else{
if(_7a4==_77e.pmStr){
_794=_7a4;
idx+=pmStr.length;
}
}
break;
case TZCH:
if(_7a3){
if(ch==_79f){
idx++;
}
continue;
}
saveIdx=idx;
_7a4="";
while(isLetter(_780.charCodeAt(saveIdx))){
_7a4=_7a4+ch;
ch=_780.charAt(++saveIdx);
}
if(_7a4==shortTimeZoneString||_7a4==longTimeZoneString){
idx+=_7a4.length;
}
break;
default:
if(_7a3&&!_7a5){
if(ch==_79f){
idx++;
}else{
_7a5=true;
}
}else{
if(ch==_79f||_793||ch==" "){
if(_793){
if(ch==_79f||ch==" "||(!isDigit(ch)&&!isLetter(_780.charCodeAt(idx)))){
_793=false;
}else{
_77e.messageHandler.alert("INVALID_SEPERATOR");
return null;
}
}
idx++;
}
}
break;
}
}
if(idx<_780.length){
_77e.messageHandler.alert("MISMATCH_ERROR");
return null;
}
if(hour==-1){
hour=0;
}
if(_787==-1){
_787=0;
}
if(_788==-1){
_788=0;
}
if(_789==-1){
_789=0;
}
var _7ac=false;
if(_781!=TYPE_TIME){
if(year<100){
year=getCurrentCentury(year,_77e.centurycutoff);
}
var date=new Date(year,_784,day);
if(date==null||typeof date=="undefined"){
_77e.messageHandler.alert("INVALID_VALUE");
return null;
}
if(_784<0||_784>11){
_77e.messageHandler.alert("INVALID_MONTH");
return null;
}
if(day<1||day>31){
_77e.messageHandler.alert("INVALID_DAY");
return null;
}
if(_784==3||_784==5||_784==8||_784==10){
if(day==31){
_77e.messageHandler.alert("INVALID_DAY");
return null;
}
}
var _7ae=(year<1800)?(year%4==0):((year%4==0)&&((year%100!=0)||(year%400==0)));
if(_784==1){
if(day>29||(day==29&&!_7ae)){
_77e.messageHandler.alert("INVALID_DAY");
return null;
}
}
var _7af=parseInt(_77e.centurycutoff,10);
var _7b0=_7af+99;
if((year<_7af)||(year>_7b0)){
if(_78c<=2){
_7ac=true;
}
}
}
if(_781!=TYPE_DATE){
if(!isIntegerInRange(hour,0,23)){
_77e.messageHandler.alert("INVALID_HOUR");
return null;
}
if(!isIntegerInRange(_787,0,59)){
_77e.messageHandler.alert("INVALID_MINUTE");
return null;
}
if(!isIntegerInRange(_788,0,59)){
_77e.messageHandler.alert("INVALID_SECOND");
return null;
}
}
_7a1=-1;
_7a3=false;
for(var idx=0;idx<_77f.length;++idx){
var ch=_77f.charAt(idx);
if(ch!=LD_SINGLE_QUOTE&&_7a1!=-1){
_782+=ch;
continue;
}
switch(ch){
case "E":
var _7b1=0;
while(ch=="E"){
++idx;
ch=_77f.charAt(idx);
++_7b1;
}
--idx;
var _7b2=date.getDay();
var _7b3=dayNames[_7b2];
var _7b4=_7b3.length;
_782+=_7b3.substr(0,Math.min(_7b4,_7b1));
break;
case MMCH:
idx+=_78d-1;
var _7b5;
if(_78d>3){
_7b5=_77e.monthNames[_784];
}else{
if(_78d==3){
_7b5=_77e.shortMonthNames[_784];
}else{
var _7b6=_784+1;
if(_78d==2&&_7b6<10){
_7b5="0"+_7b6;
}else{
_7b5=_7b6;
}
}
}
_782+=_7b5;
break;
case DDCH:
if(_78e==2){
++idx;
if(day<10){
_782+="0";
}
}
_782+=day;
break;
case YYCH:
idx+=_78c-1;
if(_78c>2||_7ac){
_782+=year;
}else{
var _7b7=year%100;
if(_7b7<10){
_782+="0"+_7b7;
}else{
_782+=_7b7;
}
}
break;
case _799:
case _798:
if(_78f==2){
++idx;
if(hour<10){
_782+="0";
}
}
_782+=hour.toString();
break;
case _79a:
if(_790==2){
++idx;
if(_787<10){
_782+="0";
}
}
_782+=_787.toString();
break;
case SSCH:
if(_791==2){
++idx;
if(_788<10){
_782+="0";
}
}
_782+=_788.toString();
break;
case MSCH:
if(_792>1){
idx+=_792-1;
if(_789<10){
_782+="00";
}else{
if(_789<100){
_782+="0";
}
}
}
_782+=_789.toString();
break;
case _79d:
if(_794.length==0){
_782+=_77e.amStr;
}else{
_782+=_794;
}
timeFormatChar=_77f.charAt(idx+1);
while(timeFormatChar==_79d){
idx++;
timeFormatChar=_77f.charAt(idx+1);
}
break;
case TZCH:
var _7b8=1;
timeFormatChar=_77f.charAt(idx+1);
while(timeFormatChar==TZCH){
_7b8++;
idx++;
timeFormatChar=_77f.charAt(idx+1);
}
if(_7b8>3){
_782+=longTimeZoneString;
}else{
_782+=shortTimeZoneString;
}
break;
case LD_SINGLE_QUOTE:
var _7a9=_77f.charAt(idx+1);
if(_7a9==LD_SINGLE_QUOTE){
_7a3=true;
}else{
if(_7a3){
_782+=ch;
_7a3=false;
}else{
if(_7a1!=-1){
_7a1=-1;
}else{
_7a1=idx;
}
}
}
break;
default:
_782+=ch;
}
}
return _782;
}
var whitespace=" \t\n\r";
function findMonth(_7b9,_7ba){
var mlen=_7ba.length;
for(idx=0;idx<_7b9.monthNames.length;idx++){
cmpStr=_7b9.monthNames[idx].substring(0,mlen);
if(_7ba==cmpStr){
return idx;
}
}
return -1;
}
function charInString(c,s){
for(i=0;i<s.length;i++){
if(s.charAt(i)==c){
return true;
}
}
return false;
}
function isalnum(s){
var i;
for(i=0;i<s.length;i++){
var c=s.charAt(i);
if(!(isLetter(s.charCodeAt(i))||isDigit(c))){
return false;
}
}
return true;
}
function isLetter(c){
return (((c>=65)&&(c<=90))||((c>=97)&&(c<=122))||c>192);
}
function isDigit(c){
return ((c>="0")&&(c<="9"));
}
function isInteger(s){
var i;
for(i=0;i<s.length;i++){
var c=s.charAt(i);
if(!isDigit(c)){
return false;
}
}
return true;
}
function isIntFormatMetaChar(c){
if(c){
var str="yMdhHmsS";
return (str.indexOf(c)>=0);
}
return false;
}
function isIntegerInRange(s,a,b){
if(!isInteger(s)){
return false;
}
var num=parseInt(s,10);
return ((num>=a)&&(num<=b));
}
function lTrim(s){
var i=0;
if(s==null){
return s;
}
while((i<s.length)&&charInString(s.charAt(i),whitespace)){
i++;
}
return s.substring(i,s.length);
}
function rTrim(_7ce){
while(1){
if(_7ce.substring(_7ce.length-1,_7ce.length)!=" "){
break;
}
_7ce=_7ce.substring(0,_7ce.length-1);
}
return _7ce;
}
function trim(s){
return lTrim(rTrim(s));
}
function isldsep(c){
return (c=="/"||c=="-"||c=="."||c==" ");
}
function getCurrentCentury(_7d1,_7d2){
var _7d3=_7d2-(_7d2%100);
var low=_7d3+_7d1;
var high=low+100;
if(low>=_7d2){
return low;
}else{
return high;
}
}
function convertArrayToString(_7d6){
var _7d7="";
for(idx=0;idx<_7d6.length;idx++){
_7d7+=_7d6[idx];
}
return _7d7;
}
var Prototype={Version:"1.4.0",ScriptFragment:"(?:<script.*?>)((\n|\r|.)*?)(?:</script>)",emptyFunction:function(){
},K:function(x){
return x;
}};
var Class={create:function(){
return function(){
this.initialize.apply(this,arguments);
};
}};
var Abstract=new Object();
Object.extend=function(_7d9,_7da){
for(property in _7da){
_7d9[property]=_7da[property];
}
return _7d9;
};
Object.inspect=function(_7db){
try{
if(_7db==undefined){
return "undefined";
}
if(_7db==null){
return "null";
}
return _7db.inspect?_7db.inspect():_7db.toString();
}
catch(e){
if(e instanceof RangeError){
return "...";
}
throw e;
}
};
Function.prototype.bind=function(){
var _7dc=this,args=$A(arguments),object=args.shift();
return function(){
return _7dc.apply(object,args.concat($A(arguments)));
};
};
Function.prototype.bindAsEventListener=function(_7dd){
var _7de=this;
return function(_7df){
return _7de.call(_7dd,_7df||window.event);
};
};
Object.extend(Number.prototype,{toColorPart:function(){
var _7e0=this.toString(16);
if(this<16){
return "0"+_7e0;
}
return _7e0;
},succ:function(){
return this+1;
},times:function(_7e1){
$R(0,this,true).each(_7e1);
return this;
}});
var Try={these:function(){
var _7e2;
for(var i=0;i<arguments.length;i++){
var _7e4=arguments[i];
try{
_7e2=_7e4();
break;
}
catch(e){
}
}
return _7e2;
}};
function $(){
var _7e5=new Array();
for(var i=0;i<arguments.length;i++){
var _7e7=arguments[i];
if(typeof _7e7=="string"){
_7e7=document.getElementById(_7e7);
}
if(arguments.length==1){
return _7e7;
}
_7e5.push(_7e7);
}
return _7e5;
}
Object.extend(String.prototype,{stripTags:function(){
return this.replace(/<\/?[^>]+>/gi,"");
},stripScripts:function(){
return this.replace(new RegExp(Prototype.ScriptFragment,"img"),"");
},extractScripts:function(){
var _7e8=new RegExp(Prototype.ScriptFragment,"img");
var _7e9=new RegExp(Prototype.ScriptFragment,"im");
return (this.match(_7e8)||[]).map(function(_7ea){
return (_7ea.match(_7e9)||["",""])[1];
});
},evalScripts:function(){
return this.extractScripts().map(eval);
},escapeHTML:function(){
var div=document.createElement("div");
var text=document.createTextNode(this);
div.appendChild(text);
return div.innerHTML;
},unescapeHTML:function(){
var div=document.createElement("div");
div.innerHTML=this.stripTags();
return div.childNodes[0]?div.childNodes[0].nodeValue:"";
},toQueryParams:function(){
var _7ee=this.match(/^\??(.*)$/)[1].split("&");
return _7ee.inject({},function(_7ef,_7f0){
var pair=_7f0.split("=");
_7ef[pair[0]]=pair[1];
return _7ef;
});
},toArray:function(){
return this.split("");
},camelize:function(){
var _7f2=this.split("-");
if(_7f2.length==1){
return _7f2[0];
}
var _7f3=this.indexOf("-")==0?_7f2[0].charAt(0).toUpperCase()+_7f2[0].substring(1):_7f2[0];
for(var i=1,len=_7f2.length;i<len;i++){
var s=_7f2[i];
_7f3+=s.charAt(0).toUpperCase()+s.substring(1);
}
return _7f3;
},inspect:function(){
return "'"+this.replace("\\","\\\\").replace("'","\\'")+"'";
}});
String.prototype.parseQuery=String.prototype.toQueryParams;
var $break=new Object();
var $continue=new Object();
var Enumerable={each:function(_7f6){
var _7f7=0;
try{
this._each(function(_7f8){
try{
_7f6(_7f8,_7f7++);
}
catch(e){
if(e!=$continue){
throw e;
}
}
});
}
catch(e){
if(e!=$break){
throw e;
}
}
},all:function(_7f9){
var _7fa=true;
this.each(function(_7fb,_7fc){
_7fa=_7fa&&!!(_7f9||Prototype.K)(_7fb,_7fc);
if(!_7fa){
throw $break;
}
});
return _7fa;
},any:function(_7fd){
var _7fe=true;
this.each(function(_7ff,_800){
if(_7fe=!!(_7fd||Prototype.K)(_7ff,_800)){
throw $break;
}
});
return _7fe;
},collect:function(_801){
var _802=[];
this.each(function(_803,_804){
_802.push(_801(_803,_804));
});
return _802;
},detect:function(_805){
var _806;
this.each(function(_807,_808){
if(_805(_807,_808)){
_806=_807;
throw $break;
}
});
return _806;
},findAll:function(_809){
var _80a=[];
this.each(function(_80b,_80c){
if(_809(_80b,_80c)){
_80a.push(_80b);
}
});
return _80a;
},grep:function(_80d,_80e){
var _80f=[];
this.each(function(_810,_811){
var _812=_810.toString();
if(_812.match(_80d)){
_80f.push((_80e||Prototype.K)(_810,_811));
}
});
return _80f;
},include:function(_813){
var _814=false;
this.each(function(_815){
if(_815==_813){
_814=true;
throw $break;
}
});
return _814;
},inject:function(memo,_817){
this.each(function(_818,_819){
memo=_817(memo,_818,_819);
});
return memo;
},invoke:function(_81a){
var args=$A(arguments).slice(1);
return this.collect(function(_81c){
return _81c[_81a].apply(_81c,args);
});
},max:function(_81d){
var _81e;
this.each(function(_81f,_820){
_81f=(_81d||Prototype.K)(_81f,_820);
if(_81f>=(_81e||_81f)){
_81e=_81f;
}
});
return _81e;
},min:function(_821){
var _822;
this.each(function(_823,_824){
_823=(_821||Prototype.K)(_823,_824);
if(_823<=(_822||_823)){
_822=_823;
}
});
return _822;
},partition:function(_825){
var _826=[],falses=[];
this.each(function(_827,_828){
((_825||Prototype.K)(_827,_828)?_826:falses).push(_827);
});
return [_826,falses];
},pluck:function(_829){
var _82a=[];
this.each(function(_82b,_82c){
_82a.push(_82b[_829]);
});
return _82a;
},reject:function(_82d){
var _82e=[];
this.each(function(_82f,_830){
if(!_82d(_82f,_830)){
_82e.push(_82f);
}
});
return _82e;
},sortBy:function(_831){
return this.collect(function(_832,_833){
return {value:_832,criteria:_831(_832,_833)};
}).sort(function(left,_835){
var a=left.criteria,b=_835.criteria;
return a<b?-1:a>b?1:0;
}).pluck("value");
},toArray:function(){
return this.collect(Prototype.K);
},zip:function(){
var _837=Prototype.K,args=$A(arguments);
if(typeof args.last()=="function"){
_837=args.pop();
}
var _838=[this].concat(args).map($A);
return this.map(function(_839,_83a){
_837(_839=_838.pluck(_83a));
return _839;
});
},inspect:function(){
return "#<Enumerable:"+this.toArray().inspect()+">";
}};
Object.extend(Enumerable,{map:Enumerable.collect,find:Enumerable.detect,select:Enumerable.findAll,member:Enumerable.include,entries:Enumerable.toArray});
var $A=Array.from=function(_83b){
if(!_83b){
return [];
}
if(_83b.toArray){
return _83b.toArray();
}else{
var _83c=[];
for(var i=0;i<_83b.length;i++){
_83c.push(_83b[i]);
}
return _83c;
}
};
Object.extend(Array.prototype,Enumerable);
Array.prototype._reverse=Array.prototype.reverse;
Object.extend(Array.prototype,{_each:function(_83e){
for(var i=0;i<this.length;i++){
_83e(this[i]);
}
},clear:function(){
this.length=0;
return this;
},first:function(){
return this[0];
},last:function(){
return this[this.length-1];
},compact:function(){
return this.select(function(_840){
return _840!=undefined||_840!=null;
});
},flatten:function(){
return this.inject([],function(_841,_842){
return _841.concat(_842.constructor==Array?_842.flatten():[_842]);
});
},without:function(){
var _843=$A(arguments);
return this.select(function(_844){
return !_843.include(_844);
});
},indexOf:function(_845){
for(var i=0;i<this.length;i++){
if(this[i]==_845){
return i;
}
}
return -1;
},reverse:function(_847){
return (_847!==false?this:this.toArray())._reverse();
},shift:function(){
var _848=this[0];
for(var i=0;i<this.length-1;i++){
this[i]=this[i+1];
}
this.length--;
return _848;
},inspect:function(){
return "["+this.map(Object.inspect).join(", ")+"]";
}});
ObjectRange=Class.create();
Object.extend(ObjectRange.prototype,Enumerable);
Object.extend(ObjectRange.prototype,{initialize:function(_84a,end,_84c){
this.start=_84a;
this.end=end;
this.exclusive=_84c;
},_each:function(_84d){
var _84e=this.start;
do{
_84d(_84e);
_84e=_84e.succ();
}while(this.include(_84e));
},include:function(_84f){
if(_84f<this.start){
return false;
}
if(this.exclusive){
return _84f<this.end;
}
return _84f<=this.end;
}});
var $R=function(_850,end,_852){
return new ObjectRange(_850,end,_852);
};
if(!window.Element){
var Element=new Object();
}
Object.extend(Element,{visible:function(_853){
return $(_853).style.display!="none";
},toggle:function(){
for(var i=0;i<arguments.length;i++){
var _855=$(arguments[i]);
Element[Element.visible(_855)?"hide":"show"](_855);
}
},hide:function(){
for(var i=0;i<arguments.length;i++){
var _857=$(arguments[i]);
_857.style.display="none";
}
},show:function(){
for(var i=0;i<arguments.length;i++){
var _859=$(arguments[i]);
_859.style.display="";
}
},remove:function(_85a){
_85a=$(_85a);
_85a.parentNode.removeChild(_85a);
},update:function(_85b,html){
$(_85b).innerHTML=html.stripScripts();
setTimeout(function(){
html.evalScripts();
},10);
},getHeight:function(_85d){
_85d=$(_85d);
return _85d.offsetHeight;
},classNames:function(_85e){
return new Element.ClassNames(_85e);
},hasClassName:function(_85f,_860){
if(!(_85f=$(_85f))){
return;
}
return Element.classNames(_85f).include(_860);
},addClassName:function(_861,_862){
if(!(_861=$(_861))){
return;
}
return Element.classNames(_861).add(_862);
},removeClassName:function(_863,_864){
if(!(_863=$(_863))){
return;
}
return Element.classNames(_863).remove(_864);
},cleanWhitespace:function(_865){
_865=$(_865);
for(var i=0;i<_865.childNodes.length;i++){
var node=_865.childNodes[i];
if(node.nodeType==3&&!/\S/.test(node.nodeValue)){
Element.remove(node);
}
}
},empty:function(_868){
return $(_868).innerHTML.match(/^\s*$/);
},scrollTo:function(_869){
_869=$(_869);
var x=_869.x?_869.x:_869.offsetLeft,y=_869.y?_869.y:_869.offsetTop;
window.scrollTo(x,y);
},getStyle:function(_86b,_86c){
_86b=$(_86b);
var _86d=_86b.style[_86c.camelize()];
if(!_86d){
if(document.defaultView&&document.defaultView.getComputedStyle){
var css=document.defaultView.getComputedStyle(_86b,null);
_86d=css?css.getPropertyValue(_86c):null;
}else{
if(_86b.currentStyle){
_86d=_86b.currentStyle[_86c.camelize()];
}
}
}
if(window.opera&&["left","top","right","bottom"].include(_86c)){
if(Element.getStyle(_86b,"position")=="static"){
_86d="auto";
}
}
return _86d=="auto"?null:_86d;
},setStyle:function(_86f,_870){
_86f=$(_86f);
for(name in _870){
_86f.style[name.camelize()]=_870[name];
}
},getDimensions:function(_871){
_871=$(_871);
if(Element.getStyle(_871,"display")!="none"){
return {width:_871.offsetWidth,height:_871.offsetHeight};
}
var els=_871.style;
var _873=els.visibility;
var _874=els.position;
els.visibility="hidden";
els.position="absolute";
els.display="";
var _875=_871.clientWidth;
var _876=_871.clientHeight;
els.display="none";
els.position=_874;
els.visibility=_873;
return {width:_875,height:_876};
},makePositioned:function(_877){
_877=$(_877);
var pos=Element.getStyle(_877,"position");
if(pos=="static"||!pos){
_877._madePositioned=true;
_877.style.position="relative";
if(window.opera){
_877.style.top=0;
_877.style.left=0;
}
}
},undoPositioned:function(_879){
_879=$(_879);
if(_879._madePositioned){
_879._madePositioned=undefined;
_879.style.position=_879.style.top=_879.style.left=_879.style.bottom=_879.style.right="";
}
},makeClipping:function(_87a){
_87a=$(_87a);
if(_87a._overflow){
return;
}
_87a._overflow=_87a.style.overflow;
if((Element.getStyle(_87a,"overflow")||"visible")!="hidden"){
_87a.style.overflow="hidden";
}
},undoClipping:function(_87b){
_87b=$(_87b);
if(_87b._overflow){
return;
}
_87b.style.overflow=_87b._overflow;
_87b._overflow=undefined;
}});
var Toggle=new Object();
Toggle.display=Element.toggle;
Abstract.Insertion=function(_87c){
this.adjacency=_87c;
};
Abstract.Insertion.prototype={initialize:function(_87d,_87e){
this.element=$(_87d);
this.content=_87e.stripScripts();
if(this.adjacency&&this.element.insertAdjacentHTML){
try{
this.element.insertAdjacentHTML(this.adjacency,this.content);
}
catch(e){
if(this.element.tagName.toLowerCase()=="tbody"){
this.insertContent(this.contentFromAnonymousTable());
}else{
throw e;
}
}
}else{
this.range=this.element.ownerDocument.createRange();
if(this.initializeRange){
this.initializeRange();
}
this.insertContent([this.range.createContextualFragment(this.content)]);
}
setTimeout(function(){
_87e.evalScripts();
},10);
},contentFromAnonymousTable:function(){
var div=document.createElement("div");
div.innerHTML="<table><tbody>"+this.content+"</tbody></table>";
return $A(div.childNodes[0].childNodes[0].childNodes);
}};
var Insertion=new Object();
Insertion.Before=Class.create();
Insertion.Before.prototype=Object.extend(new Abstract.Insertion("beforeBegin"),{initializeRange:function(){
this.range.setStartBefore(this.element);
},insertContent:function(_880){
_880.each((function(_881){
this.element.parentNode.insertBefore(_881,this.element);
}).bind(this));
}});
Insertion.Top=Class.create();
Insertion.Top.prototype=Object.extend(new Abstract.Insertion("afterBegin"),{initializeRange:function(){
this.range.selectNodeContents(this.element);
this.range.collapse(true);
},insertContent:function(_882){
_882.reverse(false).each((function(_883){
this.element.insertBefore(_883,this.element.firstChild);
}).bind(this));
}});
Insertion.Bottom=Class.create();
Insertion.Bottom.prototype=Object.extend(new Abstract.Insertion("beforeEnd"),{initializeRange:function(){
this.range.selectNodeContents(this.element);
this.range.collapse(this.element);
},insertContent:function(_884){
_884.each((function(_885){
this.element.appendChild(_885);
}).bind(this));
}});
Insertion.After=Class.create();
Insertion.After.prototype=Object.extend(new Abstract.Insertion("afterEnd"),{initializeRange:function(){
this.range.setStartAfter(this.element);
},insertContent:function(_886){
_886.each((function(_887){
this.element.parentNode.insertBefore(_887,this.element.nextSibling);
}).bind(this));
}});
Element.ClassNames=Class.create();
Element.ClassNames.prototype={initialize:function(_888){
this.element=$(_888);
},_each:function(_889){
this.element.className.split(/\s+/).select(function(name){
return name.length>0;
})._each(_889);
},set:function(_88b){
this.element.className=_88b;
},add:function(_88c){
if(this.include(_88c)){
return;
}
this.set(this.toArray().concat(_88c).join(" "));
},remove:function(_88d){
if(!this.include(_88d)){
return;
}
this.set(this.select(function(_88e){
return _88e!=_88d;
}).join(" "));
},toString:function(){
return this.toArray().join(" ");
}};
Object.extend(Element.ClassNames.prototype,Enumerable);
var Field={clear:function(){
for(var i=0;i<arguments.length;i++){
$(arguments[i]).value="";
}
},focus:function(_890){
$(_890).focus();
},present:function(){
for(var i=0;i<arguments.length;i++){
if($(arguments[i]).value==""){
return false;
}
}
return true;
},select:function(_892){
$(_892).select();
},activate:function(_893){
_893=$(_893);
_893.focus();
if(_893.select){
_893.select();
}
}};
if(!window.Event){
var Event=new Object();
}
Object.extend(Event,{KEY_BACKSPACE:8,KEY_TAB:9,KEY_RETURN:13,KEY_ESC:27,KEY_LEFT:37,KEY_UP:38,KEY_RIGHT:39,KEY_DOWN:40,KEY_DELETE:46,element:function(_894){
return _894.target||_894.srcElement;
},isLeftClick:function(_895){
return (((_895.which)&&(_895.which==1))||((_895.button)&&(_895.button==1)));
},pointerX:function(_896){
return _896.pageX||(_896.clientX+(document.documentElement.scrollLeft||document.body.scrollLeft));
},pointerY:function(_897){
return _897.pageY||(_897.clientY+(document.documentElement.scrollTop||document.body.scrollTop));
},stop:function(_898){
if(_898.preventDefault){
_898.preventDefault();
_898.stopPropagation();
}else{
_898.returnValue=false;
_898.cancelBubble=true;
}
},findElement:function(_899,_89a){
var _89b=Event.element(_899);
while(_89b.parentNode&&(!_89b.tagName||(_89b.tagName.toUpperCase()!=_89a.toUpperCase()))){
_89b=_89b.parentNode;
}
return _89b;
},observers:false,_observeAndCache:function(_89c,name,_89e,_89f){
if(!this.observers){
this.observers=[];
}
if(_89c.addEventListener){
this.observers.push([_89c,name,_89e,_89f]);
_89c.addEventListener(name,_89e,_89f);
}else{
if(_89c.attachEvent){
this.observers.push([_89c,name,_89e,_89f]);
_89c.attachEvent("on"+name,_89e);
}
}
},unloadCache:function(){
if(!Event.observers){
return;
}
for(var i=0;i<Event.observers.length;i++){
Event.stopObserving.apply(this,Event.observers[i]);
Event.observers[i][0]=null;
}
Event.observers=false;
},observe:function(_8a1,name,_8a3,_8a4){
var _8a1=$(_8a1);
_8a4=_8a4||false;
if(name=="keypress"&&(navigator.appVersion.match(/Konqueror|Safari|KHTML/)||_8a1.attachEvent)){
name="keydown";
}
this._observeAndCache(_8a1,name,_8a3,_8a4);
},stopObserving:function(_8a5,name,_8a7,_8a8){
var _8a5=$(_8a5);
_8a8=_8a8||false;
if(name=="keypress"&&(navigator.appVersion.match(/Konqueror|Safari|KHTML/)||_8a5.detachEvent)){
name="keydown";
}
if(_8a5.removeEventListener){
_8a5.removeEventListener(name,_8a7,_8a8);
}else{
if(_8a5.detachEvent){
_8a5.detachEvent("on"+name,_8a7);
}
}
}});
Event.observe(window,"unload",Event.unloadCache,false);

