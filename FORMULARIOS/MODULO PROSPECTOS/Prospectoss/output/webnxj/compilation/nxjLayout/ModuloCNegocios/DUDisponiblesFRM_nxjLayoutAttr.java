package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	DUDisponiblesFRM_nxjLayoutAttr
	extends FormWidget
{

public DUDisponiblesFRM_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeDUDisponibles__10 = new DivPanelWidget();
dodiv_cajagrandeDUDisponibles__10(div_cajagrandeDUDisponibles__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("footer","none");
	widget.addAttribute("localized","true");
	widget.setClass("form");
	widget.addAttribute("displaywidth","1199");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("displayheight","751");
	widget.addAttribute("fieldheight","751");
	widget.addAttribute("fieldwidth","1199");
}

private void setAttrFor_div_cajagrandeDUDisponibles__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","716px");
}

private void setAttrFor_cajagrandeDUDisponibles__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.setClass("box");
	widget.addAttribute("displaywidth","1004");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","190");
	widget.addAttribute("id","cajagrandeDUDisponibles.");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayheight","716");
	widget.addAttribute("fieldheight","716");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_proyecto__30(Widget widget)
{
	widget.addStyle("left","347px");
	widget.addStyle("top","153px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_proyecto__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","true");
	widget.setClass("textfield");
	widget.addAttribute("size","7");
	widget.addAttribute("displaywidth","45");
	widget.addAttribute("displayleft","347");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("name","cajagrandeDUDisponibles:xob_proyecto.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_vuu_unidades__30(Widget widget)
{
	widget.addStyle("left","64px");
	widget.addStyle("top","277px");
	widget.addStyle("width","877px");
	widget.addStyle("height","203px");
}

private void setAttrFor_PUBLIC_vuu_unidades__40(Widget widget)
{
	widget.addAttribute("field_weight","599");
	widget.setClass("data_view");
	widget.addAttribute("displaywidth","877");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","64");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeDUDisponibles:PUBLIC_vuu_unidades.");
	widget.addAttribute("displaytop","277");
	widget.addAttribute("displayheight","203");
	widget.addAttribute("fieldheight","203");
	widget.addAttribute("fieldwidth","877");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","852px");
	widget.addStyle("height","193px");
}

private void setAttrFor_RepeatingArea1__60(Widget widget)
{
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("occurrences","12");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("list_columns","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.0:72;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.72:72;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.144:66;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.210:74;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.284:73;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.357:73;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.430:79;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.509:64;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.573:116;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.689:144");
	widget.setClass("repeating_area");
	widget.addAttribute("displaywidth","852");
	widget.addStyle("background-color","transparent");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("horizontal_scroll_width","1000");
	widget.addAttribute("id","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1.");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","193");
	widget.addAttribute("fieldheight","193");
	widget.addAttribute("fieldwidth","852");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_manzana__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_manzana__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","12");
	widget.addAttribute("displaywidth","72");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","Manzana");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_manzana");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","72");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_unidad__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_unidad__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","12");
	widget.addAttribute("displaywidth","72");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","82");
	widget.addAttribute("headertitle","Unidad");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_unidad");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","72");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_modelo__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_modelo__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","11");
	widget.addAttribute("displaywidth","66");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","155");
	widget.addAttribute("headertitle","Modelo");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_modelo");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","66");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_area_lote__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_area_lote__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("display_justify","Left");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("accell_type","Float");
	widget.setClass("textfield");
	widget.addAttribute("size","12");
	widget.addAttribute("displaywidth","74");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","221");
	widget.addAttribute("headertitle","AreaLote");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_area_lote");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","74");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_area_const__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_area_const__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("display_justify","Left");
	widget.addAttribute("field_weight","499");
	widget.addAttribute("accell_type","Float");
	widget.setClass("textfield");
	widget.addAttribute("size","12");
	widget.addAttribute("displaywidth","73");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","296");
	widget.addAttribute("headertitle","AreaConst");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_area_const");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","73");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_esquina__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_esquina__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","599");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","12");
	widget.addAttribute("displaywidth","73");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","379");
	widget.addAttribute("headertitle","ESQ");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_esquina");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","73");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_muro1__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_muro1__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","699");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","13");
	widget.addAttribute("displaywidth","79");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","448");
	widget.addAttribute("headertitle","MTC");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_muro1");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","79");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_muro2__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_muro2__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","799");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","10");
	widget.addAttribute("displaywidth","64");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","524");
	widget.addAttribute("headertitle","MLA");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_muro2");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","64");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_parque__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_parque__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","899");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","19");
	widget.addAttribute("displaywidth","116");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","585");
	widget.addAttribute("headertitle","PARQ");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_parque");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","116");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vuu_precio_uni__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vuu_precio_uni__80(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("display_justify","Right");
	widget.addAttribute("field_weight","999");
	widget.addAttribute("accell_type","Amount");
	widget.setClass("textfield");
	widget.addAttribute("size","24");
	widget.addAttribute("displaywidth","144");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayleft","699");
	widget.addAttribute("headertitle","Precio Unidad");
	widget.addAttribute("displaytop","16");
	widget.addAttribute("title","vuu_precio_uni");
	widget.addAttribute("name","cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","144");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_TPrecioFLD__30(Widget widget)
{
	widget.addStyle("left","716px");
	widget.addStyle("top","558px");
	widget.addStyle("width","188px");
	widget.addStyle("height","22px");
}

private void setAttrFor_TPrecioFLD__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","699");
	widget.setClass("textfield");
	widget.addAttribute("size","31");
	widget.addAttribute("displaywidth","188");
	widget.addAttribute("displayleft","716");
	widget.addAttribute("displaytop","558");
	widget.addAttribute("name","cajagrandeDUDisponibles:TPrecioFLD.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","188");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_TUnidadesFLD__30(Widget widget)
{
	widget.addStyle("left","716px");
	widget.addStyle("top","590px");
	widget.addStyle("width","112px");
	widget.addStyle("height","22px");
}

private void setAttrFor_TUnidadesFLD__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","799");
	widget.setClass("textfield");
	widget.addAttribute("size","18");
	widget.addAttribute("displaywidth","112");
	widget.addAttribute("displayleft","716");
	widget.addAttribute("displaytop","590");
	widget.addAttribute("name","cajagrandeDUDisponibles:TUnidadesFLD.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","112");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
	widget.addStyle("left","3px");
	widget.addStyle("top","666px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("field_weight","899");
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","3");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeDUDisponibles:box11.");
	widget.addAttribute("displaytop","666");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__50(Widget widget)
{
	widget.addStyle("left","416px");
	widget.addStyle("top","2px");
	widget.addStyle("width","164px");
	widget.addStyle("height","46px");
}

private void setAttrFor_image1__60(Widget widget)
{
	widget.addAttribute("displayheight","46");
	widget.addAttribute("id","cajagrandeDUDisponibles:box11:image1.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaDUDisponibles__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaDUDisponibles__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeDUDisponibles:cajaarribaDUDisponibles.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualempresa__50(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualempresa__60(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","99");
	widget.setClass("textfield");
	widget.addAttribute("size","32");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("name","cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualempresa.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualusuario__50(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualusuario__60(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","199");
	widget.setClass("textfield");
	widget.addAttribute("size","18");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("name","cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualusuario.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","522px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","dudisponibles");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id","cajagrandeDUDisponibles:cajaarribaDUDisponibles:label1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","522");
	widget.addStyle("text-align","left");
	widget.addAttribute("instancewidth","522");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","55px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","top1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id","cajagrandeDUDisponibles:cajaarribaDUDisponibles:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_imprimirbtn__30(Widget widget)
{
	widget.addStyle("left","204px");
	widget.addStyle("top","549px");
	widget.addStyle("width","138px");
	widget.addStyle("height","48px");
}

private void setAttrFor_imprimirbtn__40(Widget widget)
{
	widget.addAttribute("field_type","button");
	widget.addAttribute("value","IMPRIMIR");
	widget.addAttribute("type","button");
	widget.addAttribute("name","cajagrandeDUDisponibles:imprimirbtn.");
	widget.addAttribute("displaytop","549");
	widget.addAttribute("displayleft","204");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","19px");
	widget.addStyle("top","96px");
	widget.addStyle("width","269px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.setClass("label");
	widget.addStyle("color","Black");
	widget.addAttribute("labeltitle","ddudisponibles");
	widget.addAttribute("displaywidth","269");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayleft","19");
	widget.addStyle("font-size","14");
	widget.addAttribute("id","cajagrandeDUDisponibles:label11.");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","269");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","bold");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label3__30(Widget widget)
{
	widget.addStyle("left","347px");
	widget.addStyle("top","127px");
	widget.addStyle("width","55px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label3__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Proyecto");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","347");
	widget.addStyle("font-size","12");
	widget.addAttribute("id","cajagrandeDUDisponibles:label3.");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label31__30(Widget widget)
{
	widget.addStyle("left","347px");
	widget.addStyle("top","183px");
	widget.addStyle("width","31px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label31__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Obra");
	widget.addAttribute("displaywidth","31");
	widget.addAttribute("displayleft","347");
	widget.addStyle("font-size","12");
	widget.addAttribute("id","cajagrandeDUDisponibles:label31.");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","31");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label311__30(Widget widget)
{
	widget.addStyle("left","716px");
	widget.addStyle("top","538px");
	widget.addStyle("width","47px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label311__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Total");
	widget.addAttribute("displaywidth","47");
	widget.addAttribute("displayleft","716");
	widget.addStyle("font-size","12");
	widget.addAttribute("id","cajagrandeDUDisponibles:label311.");
	widget.addAttribute("displaytop","538");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","47");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_regresarbtn__30(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","549px");
	widget.addStyle("width","138px");
	widget.addStyle("height","48px");
}

private void setAttrFor_regresarbtn__40(Widget widget)
{
	widget.addAttribute("field_type","button");
	widget.addAttribute("command","Previous Form");
	widget.addAttribute("value","REGRESAR");
	widget.addAttribute("type","button");
	widget.addAttribute("name","cajagrandeDUDisponibles:regresarbtn.");
	widget.addAttribute("displaytop","549");
	widget.addAttribute("displayleft","365");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_nombre__30(Widget widget)
{
	widget.addStyle("left","394px");
	widget.addStyle("top","153px");
	widget.addStyle("width","274px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpy_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.setClass("textfield");
	widget.addAttribute("size","45");
	widget.addAttribute("displaywidth","274");
	widget.addAttribute("displayleft","394");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("name","cajagrandeDUDisponibles:vpy_nombre.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","274");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_nombre__30(Widget widget)
{
	widget.addStyle("left","394px");
	widget.addStyle("top","208px");
	widget.addStyle("width","274px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","499");
	widget.setClass("textfield");
	widget.addAttribute("size","45");
	widget.addAttribute("displaywidth","274");
	widget.addAttribute("displayleft","394");
	widget.addAttribute("displaytop","208");
	widget.addAttribute("name","cajagrandeDUDisponibles:xob_nombre.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","274");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_obra__30(Widget widget)
{
	widget.addStyle("left","347px");
	widget.addStyle("top","208px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_obra__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","399");
	widget.setClass("textfield");
	widget.addAttribute("size","7");
	widget.addAttribute("displaywidth","45");
	widget.addAttribute("displayleft","347");
	widget.addAttribute("displaytop","208");
	widget.addAttribute("name","cajagrandeDUDisponibles:xob_obra.");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeDUDisponibles__10(Widget div_cajagrandeDUDisponibles__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeDUDisponibles__10,"div_cajagrandeDUDisponibles_");
    setAttrFor_div_cajagrandeDUDisponibles__10(div_cajagrandeDUDisponibles__10);
    FieldSetWidget cajagrandeDUDisponibles__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeDUDisponibles__10).addComponent(cajagrandeDUDisponibles__20,"cajagrandeDUDisponibles_");
        setAttrFor_cajagrandeDUDisponibles__20(cajagrandeDUDisponibles__20);
        DivPanelWidget div_xob_proyecto__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_xob_proyecto__30,"div_xob_proyecto_");
            setAttrFor_div_xob_proyecto__30(div_xob_proyecto__30);
            TextWidget xob_proyecto__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_proyecto__30).addComponent(xob_proyecto__40,"xob_proyecto_");
                setAttrFor_xob_proyecto__40(xob_proyecto__40);
                }
            }
        DivPanelWidget div_PUBLIC_vuu_unidades__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_PUBLIC_vuu_unidades__30,"div_PUBLIC_vuu_unidades_");
            setAttrFor_div_PUBLIC_vuu_unidades__30(div_PUBLIC_vuu_unidades__30);
            DataViewWidget PUBLIC_vuu_unidades__40 = new DataViewWidget();
                {
                ((ContainerWidget)div_PUBLIC_vuu_unidades__30).addComponent(PUBLIC_vuu_unidades__40,"PUBLIC_vuu_unidades_");
                setAttrFor_PUBLIC_vuu_unidades__40(PUBLIC_vuu_unidades__40);
                DivPanelWidget div_RepeatingArea1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vuu_unidades__40).addComponent(div_RepeatingArea1__50,"div_RepeatingArea1_");
                    setAttrFor_div_RepeatingArea1__50(div_RepeatingArea1__50);
                    RepeatingAreaWidget RepeatingArea1__60 = new RepeatingAreaWidget();
                        {
                        ((ContainerWidget)div_RepeatingArea1__50).addComponent(RepeatingArea1__60,"RepeatingArea1_");
                        setAttrFor_RepeatingArea1__60(RepeatingArea1__60);
                        RepeatingGridWidget div_FXGRID_70 = new RepeatingGridWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_FXGRID_70,"div_FXGRID");
                        DivPanelWidget div_vuu_manzana__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_manzana__70,"div_vuu_manzana_");
                            setAttrFor_div_vuu_manzana__70(div_vuu_manzana__70);
                            TextWidget vuu_manzana__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_manzana__70).addComponent(vuu_manzana__80,"vuu_manzana_");
                                setAttrFor_vuu_manzana__80(vuu_manzana__80);
                                }
                            }
                        DivPanelWidget div_vuu_unidad__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_unidad__70,"div_vuu_unidad_");
                            setAttrFor_div_vuu_unidad__70(div_vuu_unidad__70);
                            TextWidget vuu_unidad__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_unidad__70).addComponent(vuu_unidad__80,"vuu_unidad_");
                                setAttrFor_vuu_unidad__80(vuu_unidad__80);
                                }
                            }
                        DivPanelWidget div_vuu_modelo__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_modelo__70,"div_vuu_modelo_");
                            setAttrFor_div_vuu_modelo__70(div_vuu_modelo__70);
                            TextWidget vuu_modelo__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_modelo__70).addComponent(vuu_modelo__80,"vuu_modelo_");
                                setAttrFor_vuu_modelo__80(vuu_modelo__80);
                                }
                            }
                        DivPanelWidget div_vuu_area_lote__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_area_lote__70,"div_vuu_area_lote_");
                            setAttrFor_div_vuu_area_lote__70(div_vuu_area_lote__70);
                            TextWidget vuu_area_lote__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_area_lote__70).addComponent(vuu_area_lote__80,"vuu_area_lote_");
                                setAttrFor_vuu_area_lote__80(vuu_area_lote__80);
                                }
                            }
                        DivPanelWidget div_vuu_area_const__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_area_const__70,"div_vuu_area_const_");
                            setAttrFor_div_vuu_area_const__70(div_vuu_area_const__70);
                            TextWidget vuu_area_const__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_area_const__70).addComponent(vuu_area_const__80,"vuu_area_const_");
                                setAttrFor_vuu_area_const__80(vuu_area_const__80);
                                }
                            }
                        DivPanelWidget div_vuu_esquina__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_esquina__70,"div_vuu_esquina_");
                            setAttrFor_div_vuu_esquina__70(div_vuu_esquina__70);
                            TextWidget vuu_esquina__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_esquina__70).addComponent(vuu_esquina__80,"vuu_esquina_");
                                setAttrFor_vuu_esquina__80(vuu_esquina__80);
                                }
                            }
                        DivPanelWidget div_vuu_muro1__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_muro1__70,"div_vuu_muro1_");
                            setAttrFor_div_vuu_muro1__70(div_vuu_muro1__70);
                            TextWidget vuu_muro1__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_muro1__70).addComponent(vuu_muro1__80,"vuu_muro1_");
                                setAttrFor_vuu_muro1__80(vuu_muro1__80);
                                }
                            }
                        DivPanelWidget div_vuu_muro2__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_muro2__70,"div_vuu_muro2_");
                            setAttrFor_div_vuu_muro2__70(div_vuu_muro2__70);
                            TextWidget vuu_muro2__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_muro2__70).addComponent(vuu_muro2__80,"vuu_muro2_");
                                setAttrFor_vuu_muro2__80(vuu_muro2__80);
                                }
                            }
                        DivPanelWidget div_vuu_parque__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_parque__70,"div_vuu_parque_");
                            setAttrFor_div_vuu_parque__70(div_vuu_parque__70);
                            TextWidget vuu_parque__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_parque__70).addComponent(vuu_parque__80,"vuu_parque_");
                                setAttrFor_vuu_parque__80(vuu_parque__80);
                                }
                            }
                        DivPanelWidget div_vuu_precio_uni__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vuu_precio_uni__70,"div_vuu_precio_uni_");
                            setAttrFor_div_vuu_precio_uni__70(div_vuu_precio_uni__70);
                            TextWidget vuu_precio_uni__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vuu_precio_uni__70).addComponent(vuu_precio_uni__80,"vuu_precio_uni_");
                                setAttrFor_vuu_precio_uni__80(vuu_precio_uni__80);
                                }
                            }
                            div_FXGRID_70.addAttribute("id","cajagrandeDUDisponibles:PUBLIC_vuu_unidades_FXGRID");
                            div_FXGRID_70.addStyle("top","0");
                            div_FXGRID_70.addStyle("left","0");
                            div_FXGRID_70.addStyle("width","852");
                            div_FXGRID_70.addStyle("height","193");
                            div_FXGRID_70.addStyle("overflow-x","hidden");
                            div_FXGRID_70.addStyle("overflow-y","hidden");
                            div_FXGRID_70.addAttribute("jsinclude","NXJGrid.js");
                            div_FXGRID_70.addAttribute("jslinks","NXJGrid.css");
                            div_FXGRID_70.addAttribute("jsinit","   var cajagrandeDUDisponibles_PUBLIC_vuu_unidades_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Manzana', 	'1', 	'1', 	'72', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_manzana', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.', '', ''), new NXJGridColumn( 	'Unidad', 	'1', 	'1', 	'72', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_unidad', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.', '', ''), new NXJGridColumn( 	'Modelo', 	'1', 	'1', 	'66', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_modelo', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.', '', ''), new NXJGridColumn( 	'AreaLote', 	'1', 	'3', 	'74', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_area_lote', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.', '', ''), new NXJGridColumn( 	'AreaConst', 	'1', 	'3', 	'73', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_area_const', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.', '', ''), new NXJGridColumn( 	'ESQ', 	'1', 	'1', 	'73', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_esquina', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.', '', ''), new NXJGridColumn( 	'MTC', 	'1', 	'1', 	'79', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_muro1', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.', '', ''), new NXJGridColumn( 	'MLA', 	'1', 	'1', 	'64', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_muro2', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.', '', ''), new NXJGridColumn( 	'PARQ', 	'1', 	'1', 	'116', 	' text-align: Left; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_parque', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.', '', ''), new NXJGridColumn( 	'Precio Unidad', 	'1', 	'4', 	'144', 	' text-align: Right; background-color: #999999', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vuu_precio_uni', 'cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.', '', '') ]; ; if (!window.namesToComponents['cajagrandeDUDisponibles:PUBLIC_vuu_unidades_FXGRID'])     {     window.namesToComponents['cajagrandeDUDisponibles:PUBLIC_vuu_unidades_FXGRID'] = new NXJGrid('cajagrandeDUDisponibles:PUBLIC_vuu_unidades_FXGRID', cajagrandeDUDisponibles_PUBLIC_vuu_unidades_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', 'S,M,T,W,T,F,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
                            }
                        }
                    }
                }
            }
        DivPanelWidget div_TPrecioFLD__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_TPrecioFLD__30,"div_TPrecioFLD_");
            setAttrFor_div_TPrecioFLD__30(div_TPrecioFLD__30);
            TextWidget TPrecioFLD__40 = new TextWidget();
                {
                ((ContainerWidget)div_TPrecioFLD__30).addComponent(TPrecioFLD__40,"TPrecioFLD_");
                setAttrFor_TPrecioFLD__40(TPrecioFLD__40);
                }
            }
        DivPanelWidget div_TUnidadesFLD__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_TUnidadesFLD__30,"div_TUnidadesFLD_");
            setAttrFor_div_TUnidadesFLD__30(div_TUnidadesFLD__30);
            TextWidget TUnidadesFLD__40 = new TextWidget();
                {
                ((ContainerWidget)div_TUnidadesFLD__30).addComponent(TUnidadesFLD__40,"TUnidadesFLD_");
                setAttrFor_TUnidadesFLD__40(TUnidadesFLD__40);
                }
            }
        DivPanelWidget div_box11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_box11__30,"div_box11_");
            setAttrFor_div_box11__30(div_box11__30);
            FieldSetWidget box11__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_box11__30).addComponent(box11__40,"box11_");
                setAttrFor_box11__40(box11__40);
                DivPanelWidget div_image1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box11__40).addComponent(div_image1__50,"div_image1_");
                    setAttrFor_div_image1__50(div_image1__50);
                    nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__60 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_image1__50).addComponent(image1__60,"image1_");
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_cajaarribaDUDisponibles__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_cajaarribaDUDisponibles__30,"div_cajaarribaDUDisponibles_");
            setAttrFor_div_cajaarribaDUDisponibles__30(div_cajaarribaDUDisponibles__30);
            FieldSetWidget cajaarribaDUDisponibles__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaDUDisponibles__30).addComponent(cajaarribaDUDisponibles__40,"cajaarribaDUDisponibles_");
                setAttrFor_cajaarribaDUDisponibles__40(cajaarribaDUDisponibles__40);
                DivPanelWidget div_actualempresa__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaDUDisponibles__40).addComponent(div_actualempresa__50,"div_actualempresa_");
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    TextWidget actualempresa__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualempresa__50).addComponent(actualempresa__60,"actualempresa_");
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                DivPanelWidget div_actualusuario__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaDUDisponibles__40).addComponent(div_actualusuario__50,"div_actualusuario_");
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    TextWidget actualusuario__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualusuario__50).addComponent(actualusuario__60,"actualusuario_");
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaDUDisponibles__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaDUDisponibles__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                }
            }
        DivPanelWidget div_imprimirbtn__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_imprimirbtn__30,"div_imprimirbtn_");
            setAttrFor_div_imprimirbtn__30(div_imprimirbtn__30);
            nxjLayout.ItemsForm.Boton_nxjLayoutAttr imprimirbtn__40 = new nxjLayout.ItemsForm.Boton_nxjLayoutAttr();
                {
                ((ContainerWidget)div_imprimirbtn__30).addComponent(imprimirbtn__40,"imprimirbtn_");
                setAttrFor_imprimirbtn__40(imprimirbtn__40);
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_label3__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_label3__30,"div_label3_");
            setAttrFor_div_label3__30(div_label3__30);
            LabelWidget label3__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label3__30).addComponent(label3__40,"label3_");
                setAttrFor_label3__40(label3__40);
                }
            }
        DivPanelWidget div_label31__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_label31__30,"div_label31_");
            setAttrFor_div_label31__30(div_label31__30);
            LabelWidget label31__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label31__30).addComponent(label31__40,"label31_");
                setAttrFor_label31__40(label31__40);
                }
            }
        DivPanelWidget div_label311__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_label311__30,"div_label311_");
            setAttrFor_div_label311__30(div_label311__30);
            LabelWidget label311__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label311__30).addComponent(label311__40,"label311_");
                setAttrFor_label311__40(label311__40);
                }
            }
        DivPanelWidget div_regresarbtn__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_regresarbtn__30,"div_regresarbtn_");
            setAttrFor_div_regresarbtn__30(div_regresarbtn__30);
            nxjLayout.ItemsForm.Boton_nxjLayoutAttr regresarbtn__40 = new nxjLayout.ItemsForm.Boton_nxjLayoutAttr();
                {
                ((ContainerWidget)div_regresarbtn__30).addComponent(regresarbtn__40,"regresarbtn_");
                setAttrFor_regresarbtn__40(regresarbtn__40);
                }
            }
        DivPanelWidget div_vpy_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_vpy_nombre__30,"div_vpy_nombre_");
            setAttrFor_div_vpy_nombre__30(div_vpy_nombre__30);
            TextWidget vpy_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_nombre__30).addComponent(vpy_nombre__40,"vpy_nombre_");
                setAttrFor_vpy_nombre__40(vpy_nombre__40);
                }
            }
        DivPanelWidget div_xob_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_xob_nombre__30,"div_xob_nombre_");
            setAttrFor_div_xob_nombre__30(div_xob_nombre__30);
            TextWidget xob_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_nombre__30).addComponent(xob_nombre__40,"xob_nombre_");
                setAttrFor_xob_nombre__40(xob_nombre__40);
                }
            }
        DivPanelWidget div_xob_obra__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeDUDisponibles__20).addComponent(div_xob_obra__30,"div_xob_obra_");
            setAttrFor_div_xob_obra__30(div_xob_obra__30);
            TextWidget xob_obra__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_obra__30).addComponent(xob_obra__40,"xob_obra_");
                setAttrFor_xob_obra__40(xob_obra__40);
                }
            }
        }
    }
}
