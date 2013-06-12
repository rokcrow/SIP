dojo.provide("composer.widget.NXJResizableTextarea");
dojo.require("dojo.widget.ResizableTextarea");
dojo.widget.defineWidget("composer.widget.NXJResizableTextarea",dojo.widget.ResizableTextarea,{caption:"",height:"100px",width:"100px",templatePath:dojo.uri.dojoUri("../composer/widget/templates/ResizableTextarea.html"),fillInTemplate:function(_1,_2){
composer.widget.NXJResizableTextarea.superclass.fillInTemplate.apply(this,arguments);
},postCreate:function(){
dojo.event.disconnect(this.resizeHandle.domNode,"onmousedown",this.resizeHandle,"_beginSizing");
dojo.event.connect(this.resizeHandle.domNode,"onmousedown",this,"_mybeginSizing");
},_mybeginSizing:function(e){
dojo.event.connect(this.resizeHandle.domNode,"onmouseup",this,"_myendSizing");
this.resizeHandle._beginSizing(e);
dojo.event.disconnect(this.resizeHandle.domNode,"onmouseup",this.resizeHandle,"_endSizing");
},_myendSizing:function(e){
this.resizeHandle._endSizing(e);
dojo.event.disconnect(this.resizeHandle.domNode,"onmouseup",this,"_myendSizing");
var _5=window.parent.clientManager;
if(_5){
var _6=getContextPath()+"nxjAjax";
var _7=new Object();
_7.parameters="controlId="+this.widgetId+"&width="+this.rootLayoutNode.clientWidth+"&height="+this.rootLayoutNode.clientHeight+"&managerId="+MANAGER_ID;
_5.makeAjaxRequest(_6,_7);
}
}});

