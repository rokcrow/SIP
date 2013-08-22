package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	ObrasFRM_nxjLayoutAttr
	extends FormWidget
{

public ObrasFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeObrasFRM__10 = new DivPanelWidget();
dodiv_cajagrandeObrasFRM__10(div_cajagrandeObrasFRM__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("resize_browser","true");
	widget.addAttribute("footer","none");
	widget.addAttribute("fieldheight","499");
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("displayheight","496");
	widget.addAttribute("fieldwidth","1199");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displaywidth","1193");
}

private void setAttrFor_div_cajagrandeObrasFRM__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","464px");
}

private void setAttrFor_cajagrandeObrasFRM__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1004");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","190");
	widget.addAttribute("id","cajagrandeObrasFRM.");
	widget.addAttribute("displaytop","30");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","464");
	widget.addAttribute("fieldheight","464");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_xob_obras__30(Widget widget)
{
	widget.addStyle("left","303px");
	widget.addStyle("top","159px");
	widget.addStyle("width","425px");
	widget.addStyle("height","194px");
}

private void setAttrFor_PUBLIC_xob_obras__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("displaywidth","425");
	widget.setClass("data_view");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","303");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeObrasFRM:PUBLIC_xob_obras.");
	widget.addAttribute("displaytop","159");
	widget.addAttribute("displayheight","194");
	widget.addAttribute("fieldheight","194");
	widget.addAttribute("fieldwidth","425");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","387px");
	widget.addStyle("height","168px");
}

private void setAttrFor_RepeatingArea1__60(Widget widget)
{
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","10");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("list_columns","cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto.0:105;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra.105:72;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre.177:191");
	widget.addAttribute("columns_sortable","true");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("displaywidth","387");
	widget.setClass("repeating_area");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("horizontal_scroll_width","400");
	widget.addAttribute("id","cajagrandeObrasFRM:PUBLIC_xob_obras:RepeatingArea1.");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","168");
	widget.addAttribute("fieldheight","168");
	widget.addAttribute("fieldwidth","387");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_proyecto__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xob_proyecto__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("title","xob_proyecto");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","105");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","Proyecto");
	widget.addAttribute("name","cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","17");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","105");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_obra__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xob_obra__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("title","xob_obra");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","72");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","105");
	widget.addAttribute("headertitle","Obra");
	widget.addAttribute("name","cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","12");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","72");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xob_nombre__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xob_nombre__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("title","xob_nombre");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","191");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","177");
	widget.addAttribute("headertitle","Nombre");
	widget.addAttribute("name","cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","31");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","191");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
	widget.addStyle("left","3px");
	widget.addStyle("top","414px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","3");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeObrasFRM:box11.");
	widget.addAttribute("displaytop","414");
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
	widget.addAttribute("id","cajagrandeObrasFRM:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaObrasFRM__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaObrasFRM__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeObrasFRM:cajaarribaObrasFRM.");
	widget.addAttribute("displaytop","2");
	widget.addStyle("background-color","#e30000");
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
	widget.addAttribute("field_weight","99");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("name","cajagrandeObrasFRM:cajaarribaObrasFRM:actualempresa.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","32");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
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
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("name","cajagrandeObrasFRM:cajaarribaObrasFRM:actualusuario.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","194px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","Consulta de Obras");
	widget.addAttribute("displaywidth","194");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id","cajagrandeObrasFRM:cajaarribaObrasFRM:label1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","194");
	widget.addStyle("text-align","left");
	widget.addAttribute("instancewidth","194");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","46px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.addAttribute("labeltitle","top1024");
	widget.addAttribute("displaywidth","46");
	widget.setClass("label");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id","cajagrandeObrasFRM:cajaarribaObrasFRM:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","46");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","19px");
	widget.addStyle("top","96px");
	widget.addStyle("width","143px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","Consulta de Obras");
	widget.addAttribute("displaywidth","143");
	widget.setClass("label");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","19");
	widget.addAttribute("id","cajagrandeObrasFRM:label11.");
	widget.addAttribute("displaytop","96");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","143");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","14");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeObrasFRM__10(Widget div_cajagrandeObrasFRM__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeObrasFRM__10,"div_cajagrandeObrasFRM_");
    setAttrFor_div_cajagrandeObrasFRM__10(div_cajagrandeObrasFRM__10);
    FieldSetWidget cajagrandeObrasFRM__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeObrasFRM__10).addComponent(cajagrandeObrasFRM__20,"cajagrandeObrasFRM_");
        setAttrFor_cajagrandeObrasFRM__20(cajagrandeObrasFRM__20);
        DivPanelWidget div_PUBLIC_xob_obras__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeObrasFRM__20).addComponent(div_PUBLIC_xob_obras__30,"div_PUBLIC_xob_obras_");
            setAttrFor_div_PUBLIC_xob_obras__30(div_PUBLIC_xob_obras__30);
            DataViewWidget PUBLIC_xob_obras__40 = new DataViewWidget();
                {
                ((ContainerWidget)div_PUBLIC_xob_obras__30).addComponent(PUBLIC_xob_obras__40,"PUBLIC_xob_obras_");
                setAttrFor_PUBLIC_xob_obras__40(PUBLIC_xob_obras__40);
                DivPanelWidget div_RepeatingArea1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_xob_obras__40).addComponent(div_RepeatingArea1__50,"div_RepeatingArea1_");
                    setAttrFor_div_RepeatingArea1__50(div_RepeatingArea1__50);
                    RepeatingAreaWidget RepeatingArea1__60 = new RepeatingAreaWidget();
                        {
                        ((ContainerWidget)div_RepeatingArea1__50).addComponent(RepeatingArea1__60,"RepeatingArea1_");
                        setAttrFor_RepeatingArea1__60(RepeatingArea1__60);
                        RepeatingGridWidget div_FXGRID_70 = new RepeatingGridWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_FXGRID_70,"div_FXGRID");
                        DivPanelWidget div_xob_proyecto__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_xob_proyecto__70,"div_xob_proyecto_");
                            setAttrFor_div_xob_proyecto__70(div_xob_proyecto__70);
                            TextWidget xob_proyecto__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_xob_proyecto__70).addComponent(xob_proyecto__80,"xob_proyecto_");
                                setAttrFor_xob_proyecto__80(xob_proyecto__80);
                                }
                            }
                        DivPanelWidget div_xob_obra__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_xob_obra__70,"div_xob_obra_");
                            setAttrFor_div_xob_obra__70(div_xob_obra__70);
                            TextWidget xob_obra__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_xob_obra__70).addComponent(xob_obra__80,"xob_obra_");
                                setAttrFor_xob_obra__80(xob_obra__80);
                                }
                            }
                        DivPanelWidget div_xob_nombre__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_xob_nombre__70,"div_xob_nombre_");
                            setAttrFor_div_xob_nombre__70(div_xob_nombre__70);
                            TextWidget xob_nombre__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_xob_nombre__70).addComponent(xob_nombre__80,"xob_nombre_");
                                setAttrFor_xob_nombre__80(xob_nombre__80);
                                }
                            }
                            div_FXGRID_70.addAttribute("id","cajagrandeObrasFRM:PUBLIC_xob_obras_FXGRID");
                            div_FXGRID_70.addStyle("top","0");
                            div_FXGRID_70.addStyle("left","0");
                            div_FXGRID_70.addStyle("width","387");
                            div_FXGRID_70.addStyle("height","168");
                            div_FXGRID_70.addStyle("overflow-x","hidden");
                            div_FXGRID_70.addStyle("overflow-y","hidden");
                            div_FXGRID_70.addAttribute("jsinclude","NXJGrid.js");
                            div_FXGRID_70.addAttribute("jslinks","NXJGrid.css");
                            div_FXGRID_70.addAttribute("jsinit","   var cajagrandeObrasFRM_PUBLIC_xob_obras_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Proyecto', 	'1', 	'1', 	'105', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xob_proyecto', 'cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto.', '', ''), new NXJGridColumn( 	'Obra', 	'1', 	'1', 	'72', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xob_obra', 'cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra.', '', ''), new NXJGridColumn( 	'Nombre', 	'1', 	'1', 	'191', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xob_nombre', 'cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre.', '', '') ]; ; if (!window.namesToComponents['cajagrandeObrasFRM:PUBLIC_xob_obras_FXGRID'])     {     window.namesToComponents['cajagrandeObrasFRM:PUBLIC_xob_obras_FXGRID'] = new NXJGrid('cajagrandeObrasFRM:PUBLIC_xob_obras_FXGRID', cajagrandeObrasFRM_PUBLIC_xob_obras_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/');     } ");
                            }
                        }
                    }
                }
            }
        DivPanelWidget div_box11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeObrasFRM__20).addComponent(div_box11__30,"div_box11_");
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
        DivPanelWidget div_cajaarribaObrasFRM__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeObrasFRM__20).addComponent(div_cajaarribaObrasFRM__30,"div_cajaarribaObrasFRM_");
            setAttrFor_div_cajaarribaObrasFRM__30(div_cajaarribaObrasFRM__30);
            FieldSetWidget cajaarribaObrasFRM__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaObrasFRM__30).addComponent(cajaarribaObrasFRM__40,"cajaarribaObrasFRM_");
                setAttrFor_cajaarribaObrasFRM__40(cajaarribaObrasFRM__40);
                DivPanelWidget div_actualempresa__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaObrasFRM__40).addComponent(div_actualempresa__50,"div_actualempresa_");
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    TextWidget actualempresa__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualempresa__50).addComponent(actualempresa__60,"actualempresa_");
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                DivPanelWidget div_actualusuario__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaObrasFRM__40).addComponent(div_actualusuario__50,"div_actualusuario_");
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    TextWidget actualusuario__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualusuario__50).addComponent(actualusuario__60,"actualusuario_");
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaObrasFRM__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaObrasFRM__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeObrasFRM__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        }
    }
}
