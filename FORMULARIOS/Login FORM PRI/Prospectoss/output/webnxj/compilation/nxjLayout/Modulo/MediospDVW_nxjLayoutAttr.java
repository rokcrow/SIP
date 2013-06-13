package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	MediospDVW_nxjLayoutAttr
	extends DataViewWidget
{

public MediospDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_RepeatingArea1__10 = new DivPanelWidget();
dodiv_RepeatingArea1__10(div_RepeatingArea1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_box111__10 = new DivPanelWidget();
dodiv_box111__10(div_box111__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1005");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","566");
	widget.addAttribute("fieldheight","566");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("background-color","#cccccc");
	widget.setClass("data_view");
	widget.addAttribute("name",".top.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","250px");
	widget.addStyle("top","165px");
	widget.addStyle("width","536px");
	widget.addStyle("height","263px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("list_columns","vmp_codigo.0:92;vmp_descripcion.92:300;vmp_categoria.392:114");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("repeat_style","Fields");
	widget.addAttribute("occurrences","10");
	widget.addAttribute("displaywidth","536");
	widget.addAttribute("displayleft","250");
	widget.addStyle("color","Black");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addAttribute("displaytop","165");
	widget.addAttribute("displayheight","263");
	widget.addAttribute("fieldheight","263");
	widget.addAttribute("fieldwidth","536");
	widget.setClass("repeating_area");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Box__30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","0px");
	widget.addStyle("width","536px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Box__40(Widget widget)
{
	widget.addAttribute("displaywidth","536");
	widget.addAttribute("displayleft","10");
	widget.addStyle("border-style","none");
	widget.addAttribute("id",".top:Box.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","536");
	widget.setClass("header");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Label__50(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","0px");
	widget.addStyle("width","55px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Label__60(Widget widget)
{
	widget.addAttribute("labeltitle","Categoria");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","402");
	widget.addStyle("color","Black");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:Box:Label.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","center");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Label1__50(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","0px");
	widget.addStyle("width","65px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","Descripcion");
	widget.addAttribute("displaywidth","65");
	widget.addAttribute("displayleft","102");
	widget.addStyle("color","Black");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:Box:Label1.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","65");
	widget.addStyle("text-align","center");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Label1__51(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","0px");
	widget.addStyle("width","38px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Label1__61(Widget widget)
{
	widget.addAttribute("labeltitle","Codigo");
	widget.addAttribute("displaywidth","38");
	widget.addAttribute("displayleft","10");
	widget.addStyle("color","Black");
	widget.addAttribute("id",".top:Box:Label1.");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","38");
	widget.addStyle("text-align","center");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria__30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","20px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria__40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo__30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","20px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion__30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","20px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_0_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","44px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_0_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.0");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_1_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","68px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_1_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.1");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_2_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","92px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_2_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.2");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_3_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","116px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_3_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.3");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_4_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","140px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_4_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.4");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_5_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","164px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_5_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.5");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_6_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","188px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_6_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.6");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_7_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","212px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_7_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.7");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_categoria_8_30(Widget widget)
{
	widget.addStyle("left","402px");
	widget.addStyle("top","236px");
	widget.addStyle("width","125px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_categoria_8_40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_categoria");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","402");
	widget.addAttribute("headertitle","vmp_categoria");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","125");
	widget.addAttribute("size","20");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_categoria.8");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_0_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","44px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_0_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.0");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_1_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","68px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_1_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.1");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_2_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","92px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_2_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.2");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_3_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","116px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_3_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.3");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_4_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","140px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_4_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.4");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_5_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","164px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_5_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.5");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_6_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","188px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_6_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.6");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_7_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","212px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_7_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.7");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_codigo_8_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","236px");
	widget.addStyle("width","92px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_codigo_8_40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_codigo");
	widget.addAttribute("displaywidth","92");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","vmp_codigo");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","92");
	widget.addAttribute("size","15");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_codigo.8");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_0_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","44px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_0_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.0");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_1_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","68px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_1_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.1");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_2_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","92px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_2_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.2");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_3_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","116px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_3_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.3");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_4_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","140px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_4_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.4");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_5_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","164px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_5_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.5");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_6_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","188px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_6_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.6");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_7_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","212px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_7_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.7");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmp_descripcion_8_30(Widget widget)
{
	widget.addStyle("left","102px");
	widget.addStyle("top","236px");
	widget.addStyle("width","300px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmp_descripcion_8_40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vmp_descripcion");
	widget.addAttribute("displaywidth","300");
	widget.addAttribute("displayleft","102");
	widget.addAttribute("headertitle","vmp_descripcion");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","300");
	widget.addAttribute("size","50");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vmp_descripcion.8");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","511px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","511");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__30(Widget widget)
{
	widget.addStyle("left","416px");
	widget.addStyle("top","2px");
	widget.addStyle("width","164px");
	widget.addStyle("height","46px");
}

private void setAttrFor_image1__40(Widget widget)
{
	widget.addAttribute("id",".top:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box111__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box111__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box111.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","522px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","MEDIOS PUBLICITARIOS");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id",".top:box111:label1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__30(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","55px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__40(Widget widget)
{
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id",".top:box111:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__30(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("size","32");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:box111:textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield11__30(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield11__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("size","18");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:box111:textfield11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","153px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addStyle("font-size","14");
	widget.addAttribute("labeltitle","Medios Publicitarios");
	widget.addAttribute("displaywidth","153");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayleft","20");
	widget.addStyle("color","Black");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:label11.");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","153");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}
private void dodiv_RepeatingArea1__10(Widget div_RepeatingArea1__10)
    {
    ((ContainerWidget)this).addComponent(div_RepeatingArea1__10,"div_RepeatingArea1_");
    setAttrFor_div_RepeatingArea1__10(div_RepeatingArea1__10);
    RepeatingAreaWidget RepeatingArea1__20 = new RepeatingAreaWidget();
        {
        ((ContainerWidget)div_RepeatingArea1__10).addComponent(RepeatingArea1__20,"RepeatingArea1_");
        setAttrFor_RepeatingArea1__20(RepeatingArea1__20);
        DivPanelWidget div_Box__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_Box__30,"div_Box_");
            setAttrFor_div_Box__30(div_Box__30);
            FieldSetWidget Box__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_Box__30).addComponent(Box__40,"Box_");
                setAttrFor_Box__40(Box__40);
                DivPanelWidget div_Label__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)Box__40).addComponent(div_Label__50,"div_Label_");
                    setAttrFor_div_Label__50(div_Label__50);
                    LabelWidget Label__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_Label__50).addComponent(Label__60,"Label_");
                        setAttrFor_Label__60(Label__60);
                        }
                    }
                DivPanelWidget div_Label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)Box__40).addComponent(div_Label1__50,"div_Label1_");
                    setAttrFor_div_Label1__50(div_Label1__50);
                    LabelWidget Label1__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_Label1__50).addComponent(Label1__60,"Label1_");
                        setAttrFor_Label1__60(Label1__60);
                        }
                    }
                DivPanelWidget div_Label1__51 = new DivPanelWidget();
                    {
                    ((ContainerWidget)Box__40).addComponent(div_Label1__51,"div_Label1_");
                    setAttrFor_div_Label1__51(div_Label1__51);
                    LabelWidget Label1__61 = new LabelWidget();
                        {
                        ((ContainerWidget)div_Label1__51).addComponent(Label1__61,"Label1_");
                        setAttrFor_Label1__61(Label1__61);
                        }
                    }
                }
            }
        DivPanelWidget div_vmp_categoria__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria__30,"div_vmp_categoria_");
            setAttrFor_div_vmp_categoria__30(div_vmp_categoria__30);
            TextWidget vmp_categoria__40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria__30).addComponent(vmp_categoria__40,"vmp_categoria_");
                setAttrFor_vmp_categoria__40(vmp_categoria__40);
                }
            }
        DivPanelWidget div_vmp_codigo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo__30,"div_vmp_codigo_");
            setAttrFor_div_vmp_codigo__30(div_vmp_codigo__30);
            TextWidget vmp_codigo__40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo__30).addComponent(vmp_codigo__40,"vmp_codigo_");
                setAttrFor_vmp_codigo__40(vmp_codigo__40);
                }
            }
        DivPanelWidget div_vmp_descripcion__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion__30,"div_vmp_descripcion_");
            setAttrFor_div_vmp_descripcion__30(div_vmp_descripcion__30);
            TextWidget vmp_descripcion__40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion__30).addComponent(vmp_descripcion__40,"vmp_descripcion_");
                setAttrFor_vmp_descripcion__40(vmp_descripcion__40);
                }
            }
        DivPanelWidget div_vmp_categoria_0_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_0_30,"div_vmp_categoria_0");
            setAttrFor_div_vmp_categoria_0_30(div_vmp_categoria_0_30);
            TextWidget vmp_categoria_0_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_0_30).addComponent(vmp_categoria_0_40,"vmp_categoria_0");
                setAttrFor_vmp_categoria_0_40(vmp_categoria_0_40);
                }
            }
        DivPanelWidget div_vmp_categoria_1_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_1_30,"div_vmp_categoria_1");
            setAttrFor_div_vmp_categoria_1_30(div_vmp_categoria_1_30);
            TextWidget vmp_categoria_1_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_1_30).addComponent(vmp_categoria_1_40,"vmp_categoria_1");
                setAttrFor_vmp_categoria_1_40(vmp_categoria_1_40);
                }
            }
        DivPanelWidget div_vmp_categoria_2_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_2_30,"div_vmp_categoria_2");
            setAttrFor_div_vmp_categoria_2_30(div_vmp_categoria_2_30);
            TextWidget vmp_categoria_2_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_2_30).addComponent(vmp_categoria_2_40,"vmp_categoria_2");
                setAttrFor_vmp_categoria_2_40(vmp_categoria_2_40);
                }
            }
        DivPanelWidget div_vmp_categoria_3_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_3_30,"div_vmp_categoria_3");
            setAttrFor_div_vmp_categoria_3_30(div_vmp_categoria_3_30);
            TextWidget vmp_categoria_3_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_3_30).addComponent(vmp_categoria_3_40,"vmp_categoria_3");
                setAttrFor_vmp_categoria_3_40(vmp_categoria_3_40);
                }
            }
        DivPanelWidget div_vmp_categoria_4_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_4_30,"div_vmp_categoria_4");
            setAttrFor_div_vmp_categoria_4_30(div_vmp_categoria_4_30);
            TextWidget vmp_categoria_4_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_4_30).addComponent(vmp_categoria_4_40,"vmp_categoria_4");
                setAttrFor_vmp_categoria_4_40(vmp_categoria_4_40);
                }
            }
        DivPanelWidget div_vmp_categoria_5_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_5_30,"div_vmp_categoria_5");
            setAttrFor_div_vmp_categoria_5_30(div_vmp_categoria_5_30);
            TextWidget vmp_categoria_5_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_5_30).addComponent(vmp_categoria_5_40,"vmp_categoria_5");
                setAttrFor_vmp_categoria_5_40(vmp_categoria_5_40);
                }
            }
        DivPanelWidget div_vmp_categoria_6_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_6_30,"div_vmp_categoria_6");
            setAttrFor_div_vmp_categoria_6_30(div_vmp_categoria_6_30);
            TextWidget vmp_categoria_6_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_6_30).addComponent(vmp_categoria_6_40,"vmp_categoria_6");
                setAttrFor_vmp_categoria_6_40(vmp_categoria_6_40);
                }
            }
        DivPanelWidget div_vmp_categoria_7_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_7_30,"div_vmp_categoria_7");
            setAttrFor_div_vmp_categoria_7_30(div_vmp_categoria_7_30);
            TextWidget vmp_categoria_7_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_7_30).addComponent(vmp_categoria_7_40,"vmp_categoria_7");
                setAttrFor_vmp_categoria_7_40(vmp_categoria_7_40);
                }
            }
        DivPanelWidget div_vmp_categoria_8_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_categoria_8_30,"div_vmp_categoria_8");
            setAttrFor_div_vmp_categoria_8_30(div_vmp_categoria_8_30);
            TextWidget vmp_categoria_8_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_categoria_8_30).addComponent(vmp_categoria_8_40,"vmp_categoria_8");
                setAttrFor_vmp_categoria_8_40(vmp_categoria_8_40);
                }
            }
        DivPanelWidget div_vmp_codigo_0_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_0_30,"div_vmp_codigo_0");
            setAttrFor_div_vmp_codigo_0_30(div_vmp_codigo_0_30);
            TextWidget vmp_codigo_0_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_0_30).addComponent(vmp_codigo_0_40,"vmp_codigo_0");
                setAttrFor_vmp_codigo_0_40(vmp_codigo_0_40);
                }
            }
        DivPanelWidget div_vmp_codigo_1_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_1_30,"div_vmp_codigo_1");
            setAttrFor_div_vmp_codigo_1_30(div_vmp_codigo_1_30);
            TextWidget vmp_codigo_1_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_1_30).addComponent(vmp_codigo_1_40,"vmp_codigo_1");
                setAttrFor_vmp_codigo_1_40(vmp_codigo_1_40);
                }
            }
        DivPanelWidget div_vmp_codigo_2_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_2_30,"div_vmp_codigo_2");
            setAttrFor_div_vmp_codigo_2_30(div_vmp_codigo_2_30);
            TextWidget vmp_codigo_2_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_2_30).addComponent(vmp_codigo_2_40,"vmp_codigo_2");
                setAttrFor_vmp_codigo_2_40(vmp_codigo_2_40);
                }
            }
        DivPanelWidget div_vmp_codigo_3_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_3_30,"div_vmp_codigo_3");
            setAttrFor_div_vmp_codigo_3_30(div_vmp_codigo_3_30);
            TextWidget vmp_codigo_3_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_3_30).addComponent(vmp_codigo_3_40,"vmp_codigo_3");
                setAttrFor_vmp_codigo_3_40(vmp_codigo_3_40);
                }
            }
        DivPanelWidget div_vmp_codigo_4_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_4_30,"div_vmp_codigo_4");
            setAttrFor_div_vmp_codigo_4_30(div_vmp_codigo_4_30);
            TextWidget vmp_codigo_4_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_4_30).addComponent(vmp_codigo_4_40,"vmp_codigo_4");
                setAttrFor_vmp_codigo_4_40(vmp_codigo_4_40);
                }
            }
        DivPanelWidget div_vmp_codigo_5_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_5_30,"div_vmp_codigo_5");
            setAttrFor_div_vmp_codigo_5_30(div_vmp_codigo_5_30);
            TextWidget vmp_codigo_5_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_5_30).addComponent(vmp_codigo_5_40,"vmp_codigo_5");
                setAttrFor_vmp_codigo_5_40(vmp_codigo_5_40);
                }
            }
        DivPanelWidget div_vmp_codigo_6_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_6_30,"div_vmp_codigo_6");
            setAttrFor_div_vmp_codigo_6_30(div_vmp_codigo_6_30);
            TextWidget vmp_codigo_6_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_6_30).addComponent(vmp_codigo_6_40,"vmp_codigo_6");
                setAttrFor_vmp_codigo_6_40(vmp_codigo_6_40);
                }
            }
        DivPanelWidget div_vmp_codigo_7_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_7_30,"div_vmp_codigo_7");
            setAttrFor_div_vmp_codigo_7_30(div_vmp_codigo_7_30);
            TextWidget vmp_codigo_7_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_7_30).addComponent(vmp_codigo_7_40,"vmp_codigo_7");
                setAttrFor_vmp_codigo_7_40(vmp_codigo_7_40);
                }
            }
        DivPanelWidget div_vmp_codigo_8_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_codigo_8_30,"div_vmp_codigo_8");
            setAttrFor_div_vmp_codigo_8_30(div_vmp_codigo_8_30);
            TextWidget vmp_codigo_8_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_codigo_8_30).addComponent(vmp_codigo_8_40,"vmp_codigo_8");
                setAttrFor_vmp_codigo_8_40(vmp_codigo_8_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_0_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_0_30,"div_vmp_descripcion_0");
            setAttrFor_div_vmp_descripcion_0_30(div_vmp_descripcion_0_30);
            TextWidget vmp_descripcion_0_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_0_30).addComponent(vmp_descripcion_0_40,"vmp_descripcion_0");
                setAttrFor_vmp_descripcion_0_40(vmp_descripcion_0_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_1_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_1_30,"div_vmp_descripcion_1");
            setAttrFor_div_vmp_descripcion_1_30(div_vmp_descripcion_1_30);
            TextWidget vmp_descripcion_1_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_1_30).addComponent(vmp_descripcion_1_40,"vmp_descripcion_1");
                setAttrFor_vmp_descripcion_1_40(vmp_descripcion_1_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_2_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_2_30,"div_vmp_descripcion_2");
            setAttrFor_div_vmp_descripcion_2_30(div_vmp_descripcion_2_30);
            TextWidget vmp_descripcion_2_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_2_30).addComponent(vmp_descripcion_2_40,"vmp_descripcion_2");
                setAttrFor_vmp_descripcion_2_40(vmp_descripcion_2_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_3_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_3_30,"div_vmp_descripcion_3");
            setAttrFor_div_vmp_descripcion_3_30(div_vmp_descripcion_3_30);
            TextWidget vmp_descripcion_3_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_3_30).addComponent(vmp_descripcion_3_40,"vmp_descripcion_3");
                setAttrFor_vmp_descripcion_3_40(vmp_descripcion_3_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_4_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_4_30,"div_vmp_descripcion_4");
            setAttrFor_div_vmp_descripcion_4_30(div_vmp_descripcion_4_30);
            TextWidget vmp_descripcion_4_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_4_30).addComponent(vmp_descripcion_4_40,"vmp_descripcion_4");
                setAttrFor_vmp_descripcion_4_40(vmp_descripcion_4_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_5_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_5_30,"div_vmp_descripcion_5");
            setAttrFor_div_vmp_descripcion_5_30(div_vmp_descripcion_5_30);
            TextWidget vmp_descripcion_5_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_5_30).addComponent(vmp_descripcion_5_40,"vmp_descripcion_5");
                setAttrFor_vmp_descripcion_5_40(vmp_descripcion_5_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_6_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_6_30,"div_vmp_descripcion_6");
            setAttrFor_div_vmp_descripcion_6_30(div_vmp_descripcion_6_30);
            TextWidget vmp_descripcion_6_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_6_30).addComponent(vmp_descripcion_6_40,"vmp_descripcion_6");
                setAttrFor_vmp_descripcion_6_40(vmp_descripcion_6_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_7_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_7_30,"div_vmp_descripcion_7");
            setAttrFor_div_vmp_descripcion_7_30(div_vmp_descripcion_7_30);
            TextWidget vmp_descripcion_7_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_7_30).addComponent(vmp_descripcion_7_40,"vmp_descripcion_7");
                setAttrFor_vmp_descripcion_7_40(vmp_descripcion_7_40);
                }
            }
        DivPanelWidget div_vmp_descripcion_8_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vmp_descripcion_8_30,"div_vmp_descripcion_8");
            setAttrFor_div_vmp_descripcion_8_30(div_vmp_descripcion_8_30);
            TextWidget vmp_descripcion_8_40 = new TextWidget();
                {
                ((ContainerWidget)div_vmp_descripcion_8_30).addComponent(vmp_descripcion_8_40,"vmp_descripcion_8");
                setAttrFor_vmp_descripcion_8_40(vmp_descripcion_8_40);
                }
            }
        }
    }
private void dodiv_box11__10(Widget div_box11__10)
    {
    ((ContainerWidget)this).addComponent(div_box11__10,"div_box11_");
    setAttrFor_div_box11__10(div_box11__10);
    FieldSetWidget box11__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_box11__10).addComponent(box11__20,"box11_");
        setAttrFor_box11__20(box11__20);
        DivPanelWidget div_image1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box11__20).addComponent(div_image1__30,"div_image1_");
            setAttrFor_div_image1__30(div_image1__30);
            nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__40 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                {
                ((ContainerWidget)div_image1__30).addComponent(image1__40,"image1_");
                setAttrFor_image1__40(image1__40);
                }
            }
        }
    }
private void dodiv_box111__10(Widget div_box111__10)
    {
    ((ContainerWidget)this).addComponent(div_box111__10,"div_box111_");
    setAttrFor_div_box111__10(div_box111__10);
    FieldSetWidget box111__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_box111__10).addComponent(box111__20,"box111_");
        setAttrFor_box111__20(box111__20);
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__40 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label211__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_label211__30,"div_label211_");
            setAttrFor_div_label211__30(div_label211__30);
            LabelWidget label211__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label211__30).addComponent(label211__40,"label211_");
                setAttrFor_label211__40(label211__40);
                }
            }
        DivPanelWidget div_textfield1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_textfield1__30,"div_textfield1_");
            setAttrFor_div_textfield1__30(div_textfield1__30);
            TextWidget textfield1__40 = new TextWidget();
                {
                ((ContainerWidget)div_textfield1__30).addComponent(textfield1__40,"textfield1_");
                setAttrFor_textfield1__40(textfield1__40);
                }
            }
        DivPanelWidget div_textfield11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_textfield11__30,"div_textfield11_");
            setAttrFor_div_textfield11__30(div_textfield11__30);
            TextWidget textfield11__40 = new TextWidget();
                {
                ((ContainerWidget)div_textfield11__30).addComponent(textfield11__40,"textfield11_");
                setAttrFor_textfield11__40(textfield11__40);
                }
            }
        }
    }
private void dodiv_label11__10(Widget div_label11__10)
    {
    ((ContainerWidget)this).addComponent(div_label11__10,"div_label11_");
    setAttrFor_div_label11__10(div_label11__10);
    LabelWidget label11__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label11__10).addComponent(label11__20,"label11_");
        setAttrFor_label11__20(label11__20);
        }
    }
}
