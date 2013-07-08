dojo.declare("composer.factory.ViewGrid",null,{isViewGrid:true,initializer:function(_1,_2,_3,_4,_5,_6,_7,_8,_9){
this.outerDiv=document.getElementById(_1);
if(!this.outerDiv){
return;
}
dojo.require("composer.widget.NotesView");
var _a=new Array();
if(_7){
var _b=document.createElement("div");
var _c=dojo.widget.createWidget("NotesMarginColumn",{title:" ",width:16},_b);
_a.push(_c);
}
for(var _d=0;_d<_5.length;_d++){
var _e=_5[_d];
var _b=document.createElement("div");
var _c=dojo.widget.createWidget(_e.type,{title:_e.title,width:_e.width,category:(_e.flags&1)!=0,sortable:(_e.flags&4)!=0,cssText:_e.getCssText(),totals:(_e.flags&2048)!=0},_b);
_a.push(_c);
}
var _f=!_4;
this.dojoView=dojo.widget.createWidget("NotesView",{id:_1,columns:_a,showresponsehierarchy:_f,totalRecords:_3,dataViewName:_2,totals:_6,altRowClass:_8,isViewForm:_9},this.outerDiv);
},removeDeletedRow:function(){
this.dojoView.deleteRecord();
},getCurrentRecord:function(){
return this.dojoView.currentRecord;
},setSelectedRow:function(){
},deselectRow:function(){
this.dojoView.deselectRow();
},reselectRow:function(){
this.dojoView.reselectRow();
},getSelectedHTML:function(){
if(!this.dojoView.anyRowsChecked()){
return this.outerDiv.innerHTML;
}
return this.dojoView.getCheckedHTML();
},getCheckedMgrRowIds:function(){
return this.dojoView.getCheckedMgrRowIds();
},refreshChecked:function(){
this.dojoView.refreshChecked();
}});
dojo.declare("composer.factory.ViewGridColumn",null,{initializer:function(_10,_11,_12,_13,_14,_15,_16,_17,_18){
this.type=_10;
this.title=_11;
this.flags=_12;
this.width=_13;
this.color=_14;
this.fontFamily=_15;
this.fontSize=_16;
this.fontWeight=_17;
this.fontStyle=_18;
},getCssText:function(){
var _19=(this.flags&512)!=0?"center":((this.flags&256)!=0?"right":"");
if(_19){
_19=";text-align:"+_19;
}
return "font-size: "+this.fontSize+"; font-weight: "+this.fontWeight+"; color: "+this.color+_19;
}});

