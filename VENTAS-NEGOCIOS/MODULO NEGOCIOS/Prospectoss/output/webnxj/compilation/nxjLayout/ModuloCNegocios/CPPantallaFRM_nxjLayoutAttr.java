package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	CPPantallaFRM_nxjLayoutAttr
	extends FormWidget
{

public CPPantallaFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeCPPantalla__10 = new DivPanelWidget();
dodiv_cajagrandeCPPantalla__10(div_cajagrandeCPPantalla__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("footer","none");
	widget.addAttribute("displaywidth","700");
	widget.setClass("form");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("name","NXJForm");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayheight","632");
	widget.addAttribute("fieldheight","637");
	widget.addAttribute("fieldwidth","1201");
}

private void setAttrFor_div_cajagrandeCPPantalla__10(Widget widget)
{
	widget.addStyle("left","192px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","602px");
}

private void setAttrFor_cajagrandeCPPantalla__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1004");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","192");
	widget.addAttribute("id","cajagrandeCPPantalla.");
	widget.addAttribute("displaytop","30");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","602");
	widget.addAttribute("fieldheight","602");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_vlp_listapre__30(Widget widget)
{
	widget.addStyle("left","175px");
	widget.addStyle("top","278px");
	widget.addStyle("width","713px");
	widget.addStyle("height","204px");
}

private void setAttrFor_PUBLIC_vlp_listapre__40(Widget widget)
{
	widget.addAttribute("field_weight","699");
	widget.addAttribute("displaywidth","713");
	widget.setClass("data_view");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","175");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeCPPantalla:PUBLIC_vlp_listapre.");
	widget.addAttribute("displaytop","278");
	widget.addAttribute("displayheight","204");
	widget.addAttribute("fieldheight","204");
	widget.addAttribute("fieldwidth","713");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","618px");
	widget.addStyle("height","193px");
}

private void setAttrFor_RepeatingArea1__60(Widget widget)
{
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","12");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("list_columns","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana.0:101;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad.101:82;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial.183:89;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final.272:78;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni.350:150;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario.500:99");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("displaywidth","618");
	widget.setClass("repeating_area");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("id","cajagrandeCPPantalla:PUBLIC_vlp_listapre:RepeatingArea1.");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","193");
	widget.addAttribute("fieldheight","193");
	widget.addAttribute("fieldwidth","618");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_manzana__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_manzana__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("title","vlp_manzana");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","101");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","Manzana");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","16");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","101");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_unidad__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_unidad__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("title","vlp_unidad");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","82");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","101");
	widget.addAttribute("headertitle","Unidad");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","13");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","82");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_f_inicial__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_f_inicial__80(Widget widget)
{
	widget.addAttribute("accell_type","Date");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("title","vlp_f_inicial");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","89");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","183");
	widget.addAttribute("headertitle","Fecha Inicial");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","89");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_f_final__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_f_final__80(Widget widget)
{
	widget.addAttribute("accell_type","Date");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("title","vlp_f_final");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","78");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","272");
	widget.addAttribute("headertitle","Fecha Final");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","13");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","78");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_precio_uni__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_precio_uni__80(Widget widget)
{
	widget.addAttribute("accell_type","Amount");
	widget.addAttribute("display_justify","Right");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","499");
	widget.addAttribute("title","vlp_precio_uni");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","150");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","350");
	widget.addAttribute("headertitle","Precio Unidad");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","25");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","150");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vlp_usuario__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vlp_usuario__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","599");
	widget.addAttribute("title","vlp_usuario");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","99");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","500");
	widget.addAttribute("headertitle","Usuario");
	widget.addAttribute("name","cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","16");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","99");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
	widget.addStyle("left","2px");
	widget.addStyle("top","551px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("field_weight","799");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","2");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeCPPantalla:box11.");
	widget.addAttribute("displaytop","551");
	widget.addStyle("background-color","#e30000");
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
	widget.addAttribute("id","cajagrandeCPPantalla:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaCPPantalla__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaCPPantalla__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeCPPantalla:cajaarribaCPPantalla.");
	widget.addAttribute("displaytop","2");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
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
	widget.addAttribute("labeltitle","CONSULTA PRECIOS EN PANTALLA");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id","cajagrandeCPPantalla:cajaarribaCPPantalla:label1.");
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
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.setClass("label");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id","cajagrandeCPPantalla:cajaarribaCPPantalla:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__50(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__60(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("name","cajagrandeCPPantalla:cajaarribaCPPantalla:textfield1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","32");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield11__50(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield11__60(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("name","cajagrandeCPPantalla:cajaarribaCPPantalla:textfield11.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","18px");
	widget.addStyle("top","96px");
	widget.addStyle("width","129px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","Listas de Precios");
	widget.addAttribute("displaywidth","129");
	widget.setClass("label");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","18");
	widget.addAttribute("id","cajagrandeCPPantalla:label11.");
	widget.addAttribute("displaytop","96");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","129");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","14");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label311__30(Widget widget)
{
	widget.addStyle("left","345px");
	widget.addStyle("top","183px");
	widget.addStyle("width","31px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label311__40(Widget widget)
{
	widget.addAttribute("labeltitle","Obra");
	widget.addAttribute("displaywidth","31");
	widget.setClass("label");
	widget.addAttribute("displayleft","345");
	widget.addAttribute("id","cajagrandeCPPantalla:label311.");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","31");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label33__30(Widget widget)
{
	widget.addStyle("left","345px");
	widget.addStyle("top","127px");
	widget.addStyle("width","55px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label33__40(Widget widget)
{
	widget.addAttribute("labeltitle","Proyecto");
	widget.addAttribute("displaywidth","55");
	widget.setClass("label");
	widget.addAttribute("displayleft","345");
	widget.addAttribute("id","cajagrandeCPPantalla:label33.");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_nombre__30(Widget widget)
{
	widget.addStyle("left","395px");
	widget.addStyle("top","153px");
	widget.addStyle("width","274px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpy_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","274");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","395");
	widget.addAttribute("name","cajagrandeCPPantalla:vpy_nombre.");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("size","45");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","274");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_nombre__30(Widget widget)
{
	widget.addStyle("left","395px");
	widget.addStyle("top","209px");
	widget.addStyle("width","274px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","599");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","274");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","395");
	widget.addAttribute("name","cajagrandeCPPantalla:xob_nombre.");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("size","45");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","274");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_obra__30(Widget widget)
{
	widget.addStyle("left","345px");
	widget.addStyle("top","209px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_obra__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","499");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","45");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","345");
	widget.addAttribute("name","cajagrandeCPPantalla:xob_obra.");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("size","7");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_proyecto__30(Widget widget)
{
	widget.addStyle("left","345px");
	widget.addStyle("top","153px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xob_proyecto__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","45");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","345");
	widget.addAttribute("name","cajagrandeCPPantalla:xob_proyecto.");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("size","7");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xxx__30(Widget widget)
{
	widget.addStyle("left","69px");
	widget.addStyle("top","192px");
	widget.addStyle("width","38px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xxx__40(Widget widget)
{
	widget.addStyle("visibility","hidden");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","38");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","69");
	widget.addAttribute("name","cajagrandeCPPantalla:xxx.");
	widget.addAttribute("displaytop","192");
	widget.addAttribute("size","6");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","38");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeCPPantalla__10(Widget div_cajagrandeCPPantalla__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeCPPantalla__10,"div_cajagrandeCPPantalla_");
    setAttrFor_div_cajagrandeCPPantalla__10(div_cajagrandeCPPantalla__10);
    FieldSetWidget cajagrandeCPPantalla__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeCPPantalla__10).addComponent(cajagrandeCPPantalla__20,"cajagrandeCPPantalla_");
        setAttrFor_cajagrandeCPPantalla__20(cajagrandeCPPantalla__20);
        DivPanelWidget div_PUBLIC_vlp_listapre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_PUBLIC_vlp_listapre__30,"div_PUBLIC_vlp_listapre_");
            setAttrFor_div_PUBLIC_vlp_listapre__30(div_PUBLIC_vlp_listapre__30);
            DataViewWidget PUBLIC_vlp_listapre__40 = new DataViewWidget();
                {
                ((ContainerWidget)div_PUBLIC_vlp_listapre__30).addComponent(PUBLIC_vlp_listapre__40,"PUBLIC_vlp_listapre_");
                setAttrFor_PUBLIC_vlp_listapre__40(PUBLIC_vlp_listapre__40);
                DivPanelWidget div_RepeatingArea1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vlp_listapre__40).addComponent(div_RepeatingArea1__50,"div_RepeatingArea1_");
                    setAttrFor_div_RepeatingArea1__50(div_RepeatingArea1__50);
                    RepeatingAreaWidget RepeatingArea1__60 = new RepeatingAreaWidget();
                        {
                        ((ContainerWidget)div_RepeatingArea1__50).addComponent(RepeatingArea1__60,"RepeatingArea1_");
                        setAttrFor_RepeatingArea1__60(RepeatingArea1__60);
                        RepeatingGridWidget div_FXGRID_70 = new RepeatingGridWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_FXGRID_70,"div_FXGRID");
                        DivPanelWidget div_vlp_manzana__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_manzana__70,"div_vlp_manzana_");
                            setAttrFor_div_vlp_manzana__70(div_vlp_manzana__70);
                            TextWidget vlp_manzana__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_manzana__70).addComponent(vlp_manzana__80,"vlp_manzana_");
                                setAttrFor_vlp_manzana__80(vlp_manzana__80);
                                }
                            }
                        DivPanelWidget div_vlp_unidad__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_unidad__70,"div_vlp_unidad_");
                            setAttrFor_div_vlp_unidad__70(div_vlp_unidad__70);
                            TextWidget vlp_unidad__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_unidad__70).addComponent(vlp_unidad__80,"vlp_unidad_");
                                setAttrFor_vlp_unidad__80(vlp_unidad__80);
                                }
                            }
                        DivPanelWidget div_vlp_f_inicial__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_f_inicial__70,"div_vlp_f_inicial_");
                            setAttrFor_div_vlp_f_inicial__70(div_vlp_f_inicial__70);
                            TextWidget vlp_f_inicial__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_f_inicial__70).addComponent(vlp_f_inicial__80,"vlp_f_inicial_");
                                setAttrFor_vlp_f_inicial__80(vlp_f_inicial__80);
                                }
                            }
                        DivPanelWidget div_vlp_f_final__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_f_final__70,"div_vlp_f_final_");
                            setAttrFor_div_vlp_f_final__70(div_vlp_f_final__70);
                            TextWidget vlp_f_final__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_f_final__70).addComponent(vlp_f_final__80,"vlp_f_final_");
                                setAttrFor_vlp_f_final__80(vlp_f_final__80);
                                }
                            }
                        DivPanelWidget div_vlp_precio_uni__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_precio_uni__70,"div_vlp_precio_uni_");
                            setAttrFor_div_vlp_precio_uni__70(div_vlp_precio_uni__70);
                            TextWidget vlp_precio_uni__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_precio_uni__70).addComponent(vlp_precio_uni__80,"vlp_precio_uni_");
                                setAttrFor_vlp_precio_uni__80(vlp_precio_uni__80);
                                }
                            }
                        DivPanelWidget div_vlp_usuario__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vlp_usuario__70,"div_vlp_usuario_");
                            setAttrFor_div_vlp_usuario__70(div_vlp_usuario__70);
                            TextWidget vlp_usuario__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vlp_usuario__70).addComponent(vlp_usuario__80,"vlp_usuario_");
                                setAttrFor_vlp_usuario__80(vlp_usuario__80);
                                }
                            }
                            div_FXGRID_70.addAttribute("id","cajagrandeCPPantalla:PUBLIC_vlp_listapre_FXGRID");
                            div_FXGRID_70.addStyle("top","0");
                            div_FXGRID_70.addStyle("left","0");
                            div_FXGRID_70.addStyle("width","618");
                            div_FXGRID_70.addStyle("height","193");
                            div_FXGRID_70.addStyle("overflow-x","hidden");
                            div_FXGRID_70.addStyle("overflow-y","hidden");
                            div_FXGRID_70.addAttribute("jsinclude","NXJGrid.js");
                            div_FXGRID_70.addAttribute("jslinks","NXJGrid.css");
                            div_FXGRID_70.addAttribute("jsinit","   var cajagrandeCPPantalla_PUBLIC_vlp_listapre_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Manzana', 	'1', 	'1', 	'101', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_manzana', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana.', '', ''), new NXJGridColumn( 	'Unidad', 	'1', 	'1', 	'82', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_unidad', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad.', '', ''), new NXJGridColumn( 	'Fecha Inicial', 	'1', 	'2', 	'89', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_f_inicial', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial.', '', ''), new NXJGridColumn( 	'Fecha Final', 	'1', 	'2', 	'78', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_f_final', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final.', '', ''), new NXJGridColumn( 	'Precio Unidad', 	'1', 	'4', 	'150', 	' text-align: Right', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_precio_uni', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni.', '', ''), new NXJGridColumn( 	'Usuario', 	'1', 	'1', 	'99', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vlp_usuario', 'cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario.', '', '') ]; ; if (!window.namesToComponents['cajagrandeCPPantalla:PUBLIC_vlp_listapre_FXGRID'])     {     window.namesToComponents['cajagrandeCPPantalla:PUBLIC_vlp_listapre_FXGRID'] = new NXJGrid('cajagrandeCPPantalla:PUBLIC_vlp_listapre_FXGRID', cajagrandeCPPantalla_PUBLIC_vlp_listapre_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/');     } ");
                            }
                        }
                    }
                }
            }
        DivPanelWidget div_box11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_box11__30,"div_box11_");
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
        DivPanelWidget div_cajaarribaCPPantalla__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_cajaarribaCPPantalla__30,"div_cajaarribaCPPantalla_");
            setAttrFor_div_cajaarribaCPPantalla__30(div_cajaarribaCPPantalla__30);
            FieldSetWidget cajaarribaCPPantalla__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaCPPantalla__30).addComponent(cajaarribaCPPantalla__40,"cajaarribaCPPantalla_");
                setAttrFor_cajaarribaCPPantalla__40(cajaarribaCPPantalla__40);
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCPPantalla__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCPPantalla__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                DivPanelWidget div_textfield1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCPPantalla__40).addComponent(div_textfield1__50,"div_textfield1_");
                    setAttrFor_div_textfield1__50(div_textfield1__50);
                    TextWidget textfield1__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_textfield1__50).addComponent(textfield1__60,"textfield1_");
                        setAttrFor_textfield1__60(textfield1__60);
                        }
                    }
                DivPanelWidget div_textfield11__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCPPantalla__40).addComponent(div_textfield11__50,"div_textfield11_");
                    setAttrFor_div_textfield11__50(div_textfield11__50);
                    TextWidget textfield11__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_textfield11__50).addComponent(textfield11__60,"textfield11_");
                        setAttrFor_textfield11__60(textfield11__60);
                        }
                    }
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_label311__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_label311__30,"div_label311_");
            setAttrFor_div_label311__30(div_label311__30);
            LabelWidget label311__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label311__30).addComponent(label311__40,"label311_");
                setAttrFor_label311__40(label311__40);
                }
            }
        DivPanelWidget div_label33__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_label33__30,"div_label33_");
            setAttrFor_div_label33__30(div_label33__30);
            LabelWidget label33__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label33__30).addComponent(label33__40,"label33_");
                setAttrFor_label33__40(label33__40);
                }
            }
        DivPanelWidget div_vpy_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_vpy_nombre__30,"div_vpy_nombre_");
            setAttrFor_div_vpy_nombre__30(div_vpy_nombre__30);
            TextWidget vpy_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_nombre__30).addComponent(vpy_nombre__40,"vpy_nombre_");
                setAttrFor_vpy_nombre__40(vpy_nombre__40);
                }
            }
        DivPanelWidget div_xob_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_xob_nombre__30,"div_xob_nombre_");
            setAttrFor_div_xob_nombre__30(div_xob_nombre__30);
            TextWidget xob_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_nombre__30).addComponent(xob_nombre__40,"xob_nombre_");
                setAttrFor_xob_nombre__40(xob_nombre__40);
                }
            }
        DivPanelWidget div_xob_obra__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_xob_obra__30,"div_xob_obra_");
            setAttrFor_div_xob_obra__30(div_xob_obra__30);
            TextWidget xob_obra__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_obra__30).addComponent(xob_obra__40,"xob_obra_");
                setAttrFor_xob_obra__40(xob_obra__40);
                }
            }
        DivPanelWidget div_xob_proyecto__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_xob_proyecto__30,"div_xob_proyecto_");
            setAttrFor_div_xob_proyecto__30(div_xob_proyecto__30);
            TextWidget xob_proyecto__40 = new TextWidget();
                {
                ((ContainerWidget)div_xob_proyecto__30).addComponent(xob_proyecto__40,"xob_proyecto_");
                setAttrFor_xob_proyecto__40(xob_proyecto__40);
                }
            }
        DivPanelWidget div_xxx__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCPPantalla__20).addComponent(div_xxx__30,"div_xxx_");
            setAttrFor_div_xxx__30(div_xxx__30);
            TextWidget xxx__40 = new TextWidget();
                {
                ((ContainerWidget)div_xxx__30).addComponent(xxx__40,"xxx_");
                setAttrFor_xxx__40(xxx__40);
                }
            }
        }
    }
}
