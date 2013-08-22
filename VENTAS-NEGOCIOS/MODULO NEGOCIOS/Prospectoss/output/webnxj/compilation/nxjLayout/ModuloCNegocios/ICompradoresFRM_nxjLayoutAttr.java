package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	ICompradoresFRM_nxjLayoutAttr
	extends FormWidget
{

public ICompradoresFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeICompradores__10 = new DivPanelWidget();
dodiv_cajagrandeICompradores__10(div_cajagrandeICompradores__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1136");
	widget.setClass("form");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("name","NXJForm");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayheight","600");
	widget.addAttribute("fieldheight","600");
	widget.addAttribute("fieldwidth","1136");
}

private void setAttrFor_div_cajagrandeICompradores__10(Widget widget)
{
	widget.addStyle("left","69px");
	widget.addStyle("top","40px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","371px");
}

private void setAttrFor_cajagrandeICompradores__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1004");
	widget.setClass("box");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","69");
	widget.addAttribute("id","cajagrandeICompradores.");
	widget.addAttribute("displaytop","40");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","371");
	widget.addAttribute("fieldheight","371");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_tcl_tipclien__30(Widget widget)
{
	widget.addStyle("left","120px");
	widget.addStyle("top","146px");
	widget.addStyle("width","783px");
	widget.addStyle("height","127px");
}

private void setAttrFor_PUBLIC_tcl_tipclien__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("displaywidth","783");
	widget.setClass("data_view");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","120");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeICompradores:PUBLIC_tcl_tipclien.");
	widget.addAttribute("displaytop","146");
	widget.addAttribute("displayheight","127");
	widget.addAttribute("fieldheight","127");
	widget.addAttribute("fieldwidth","783");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","749px");
	widget.addStyle("height","109px");
}

private void setAttrFor_RepeatingArea1__60(Widget widget)
{
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","10");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("list_columns","cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit.0:159;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase.159:122;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo.281:121;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre.402:328");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("displaywidth","749");
	widget.setClass("repeating_area");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("id","cajagrandeICompradores:PUBLIC_tcl_tipclien:RepeatingArea1.");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","109");
	widget.addAttribute("fieldheight","109");
	widget.addAttribute("fieldwidth","749");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_nit__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_nit__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("title","tcl_nit");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","159");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","NIT");
	widget.addAttribute("name","cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","26");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","159");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_clase__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_clase__80(Widget widget)
{
	widget.addAttribute("options","Otro=O;Titular=T");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("title","tcl_clase");
	widget.addAttribute("displaywidth","122");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","183");
	widget.addAttribute("headertitle","Clase");
	widget.addAttribute("name","cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","1");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","122");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_tipo__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_tipo__80(Widget widget)
{
	widget.addAttribute("options","Persona=P;Sociedad=S");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("title","tcl_tipo");
	widget.addAttribute("displaywidth","121");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("headertitle","Tipo");
	widget.addAttribute("name","cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","1");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","121");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_nombre__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_nombre__80(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("title","tcl_nombre");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","328");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","231");
	widget.addAttribute("headertitle","Nombre");
	widget.addAttribute("name","cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","54");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","328");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","320px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("field_weight","399");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeICompradores:box11.");
	widget.addAttribute("displaytop","320");
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
	widget.addAttribute("id","cajagrandeICompradores:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box111__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box111__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeICompradores:box111.");
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
	widget.addAttribute("labeltitle","IDENTIFICACIÓN DE COMPRADORES");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id","cajagrandeICompradores:box111:label1.");
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
	widget.addAttribute("id","cajagrandeICompradores:box111:label211.");
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
	widget.addAttribute("name","cajagrandeICompradores:box111:textfield1.");
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
	widget.addAttribute("name","cajagrandeICompradores:box111:textfield11.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","21px");
	widget.addStyle("top","99px");
	widget.addStyle("width","240px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","Identificación de Compradores");
	widget.addAttribute("displaywidth","240");
	widget.setClass("label");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","21");
	widget.addAttribute("id","cajagrandeICompradores:label11.");
	widget.addAttribute("displaytop","99");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","240");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","14");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_varadhiere__30(Widget widget)
{
	widget.addStyle("left","19px");
	widget.addStyle("top","280px");
	widget.addStyle("width","30px");
	widget.addStyle("height","22px");
}

private void setAttrFor_varadhiere__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","30");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","19");
	widget.addAttribute("name","cajagrandeICompradores:varadhiere.");
	widget.addAttribute("displaytop","280");
	widget.addAttribute("size","5");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","30");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeICompradores__10(Widget div_cajagrandeICompradores__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeICompradores__10,"div_cajagrandeICompradores_");
    setAttrFor_div_cajagrandeICompradores__10(div_cajagrandeICompradores__10);
    FieldSetWidget cajagrandeICompradores__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeICompradores__10).addComponent(cajagrandeICompradores__20,"cajagrandeICompradores_");
        setAttrFor_cajagrandeICompradores__20(cajagrandeICompradores__20);
        DivPanelWidget div_PUBLIC_tcl_tipclien__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeICompradores__20).addComponent(div_PUBLIC_tcl_tipclien__30,"div_PUBLIC_tcl_tipclien_");
            setAttrFor_div_PUBLIC_tcl_tipclien__30(div_PUBLIC_tcl_tipclien__30);
            DataViewWidget PUBLIC_tcl_tipclien__40 = new DataViewWidget();
                {
                ((ContainerWidget)div_PUBLIC_tcl_tipclien__30).addComponent(PUBLIC_tcl_tipclien__40,"PUBLIC_tcl_tipclien_");
                setAttrFor_PUBLIC_tcl_tipclien__40(PUBLIC_tcl_tipclien__40);
                DivPanelWidget div_RepeatingArea1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_tcl_tipclien__40).addComponent(div_RepeatingArea1__50,"div_RepeatingArea1_");
                    setAttrFor_div_RepeatingArea1__50(div_RepeatingArea1__50);
                    RepeatingAreaWidget RepeatingArea1__60 = new RepeatingAreaWidget();
                        {
                        ((ContainerWidget)div_RepeatingArea1__50).addComponent(RepeatingArea1__60,"RepeatingArea1_");
                        setAttrFor_RepeatingArea1__60(RepeatingArea1__60);
                        RepeatingGridWidget div_FXGRID_70 = new RepeatingGridWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_FXGRID_70,"div_FXGRID");
                        DivPanelWidget div_tcl_nit__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_tcl_nit__70,"div_tcl_nit_");
                            setAttrFor_div_tcl_nit__70(div_tcl_nit__70);
                            TextWidget tcl_nit__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_tcl_nit__70).addComponent(tcl_nit__80,"tcl_nit_");
                                setAttrFor_tcl_nit__80(tcl_nit__80);
                                }
                            }
                        DivPanelWidget div_tcl_clase__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_tcl_clase__70,"div_tcl_clase_");
                            setAttrFor_div_tcl_clase__70(div_tcl_clase__70);
                            ListWidget tcl_clase__80 = new ListWidget();
                                {
                                ((ContainerWidget)div_tcl_clase__70).addComponent(tcl_clase__80,"tcl_clase_");
                                setAttrFor_tcl_clase__80(tcl_clase__80);
                                }
                            }
                        DivPanelWidget div_tcl_tipo__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_tcl_tipo__70,"div_tcl_tipo_");
                            setAttrFor_div_tcl_tipo__70(div_tcl_tipo__70);
                            ListWidget tcl_tipo__80 = new ListWidget();
                                {
                                ((ContainerWidget)div_tcl_tipo__70).addComponent(tcl_tipo__80,"tcl_tipo_");
                                setAttrFor_tcl_tipo__80(tcl_tipo__80);
                                }
                            }
                        DivPanelWidget div_tcl_nombre__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_tcl_nombre__70,"div_tcl_nombre_");
                            setAttrFor_div_tcl_nombre__70(div_tcl_nombre__70);
                            TextWidget tcl_nombre__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_tcl_nombre__70).addComponent(tcl_nombre__80,"tcl_nombre_");
                                setAttrFor_tcl_nombre__80(tcl_nombre__80);
                                }
                            }
                            div_FXGRID_70.addAttribute("id","cajagrandeICompradores:PUBLIC_tcl_tipclien_FXGRID");
                            div_FXGRID_70.addStyle("top","0");
                            div_FXGRID_70.addStyle("left","0");
                            div_FXGRID_70.addStyle("width","749");
                            div_FXGRID_70.addStyle("height","109");
                            div_FXGRID_70.addStyle("overflow-x","hidden");
                            div_FXGRID_70.addStyle("overflow-y","hidden");
                            div_FXGRID_70.addAttribute("jsinclude","NXJGrid.js");
                            div_FXGRID_70.addAttribute("jslinks","NXJGrid.css");
                            div_FXGRID_70.addAttribute("jsinit","var combo1 = ['Otro', 'Titular']; var combo2 = ['Persona', 'Sociedad'];    var cajagrandeICompradores_PUBLIC_tcl_tipclien_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'NIT', 	'1', 	'1', 	'159', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'tcl_nit', 'cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit.', '', ''), new NXJGridColumn( 	'Clase', 	'3', 	'1', 	'122', 	'', 	combo1, 	'Otro', 	'textfield', 	true, 	true, 	'tcl_clase', 'cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase.', '', ''), new NXJGridColumn( 	'Tipo', 	'3', 	'1', 	'121', 	'', 	combo2, 	'Persona', 	'textfield', 	true, 	true, 	'tcl_tipo', 'cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo.', '', ''), new NXJGridColumn( 	'Nombre', 	'1', 	'1', 	'328', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'tcl_nombre', 'cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre.', '', '') ]; ; if (!window.namesToComponents['cajagrandeICompradores:PUBLIC_tcl_tipclien_FXGRID'])     {     window.namesToComponents['cajagrandeICompradores:PUBLIC_tcl_tipclien_FXGRID'] = new NXJGrid('cajagrandeICompradores:PUBLIC_tcl_tipclien_FXGRID', cajagrandeICompradores_PUBLIC_tcl_tipclien_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/');     } ");
                            }
                        }
                    }
                }
            }
        DivPanelWidget div_box11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeICompradores__20).addComponent(div_box11__30,"div_box11_");
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
        DivPanelWidget div_box111__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeICompradores__20).addComponent(div_box111__30,"div_box111_");
            setAttrFor_div_box111__30(div_box111__30);
            FieldSetWidget box111__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_box111__30).addComponent(box111__40,"box111_");
                setAttrFor_box111__40(box111__40);
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box111__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box111__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                DivPanelWidget div_textfield1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box111__40).addComponent(div_textfield1__50,"div_textfield1_");
                    setAttrFor_div_textfield1__50(div_textfield1__50);
                    TextWidget textfield1__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_textfield1__50).addComponent(textfield1__60,"textfield1_");
                        setAttrFor_textfield1__60(textfield1__60);
                        }
                    }
                DivPanelWidget div_textfield11__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box111__40).addComponent(div_textfield11__50,"div_textfield11_");
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
            ((ContainerWidget)cajagrandeICompradores__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_varadhiere__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeICompradores__20).addComponent(div_varadhiere__30,"div_varadhiere_");
            setAttrFor_div_varadhiere__30(div_varadhiere__30);
            TextWidget varadhiere__40 = new TextWidget();
                {
                ((ContainerWidget)div_varadhiere__30).addComponent(varadhiere__40,"varadhiere_");
                setAttrFor_varadhiere__40(varadhiere__40);
                }
            }
        }
    }
}
