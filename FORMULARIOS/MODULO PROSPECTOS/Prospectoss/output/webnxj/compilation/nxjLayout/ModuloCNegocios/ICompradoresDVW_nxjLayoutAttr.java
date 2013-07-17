package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	ICompradoresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public ICompradoresDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_PUBLIC_tcl_tipclien__10 = new DivPanelWidget();
dodiv_PUBLIC_tcl_tipclien__10(div_PUBLIC_tcl_tipclien__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_box111__10 = new DivPanelWidget();
dodiv_box111__10(div_box111__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("id",".top.");
	widget.addAttribute("displaywidth","1005");
	widget.addAttribute("name",".top.");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","375");
	widget.addAttribute("fieldheight","375");
	widget.addAttribute("fieldwidth","1005");
	widget.setClass("data_view");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_tcl_tipclien__10(Widget widget)
{
	widget.addStyle("left","120px");
	widget.addStyle("top","146px");
	widget.addStyle("width","783px");
	widget.addStyle("height","127px");
}

private void setAttrFor_PUBLIC_tcl_tipclien__20(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("id",".top:PUBLIC_tcl_tipclien.");
	widget.addAttribute("displaywidth","783");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","120");
	widget.addStyle("border-style","solid");
	widget.addAttribute("displaytop","146");
	widget.addAttribute("displayheight","127");
	widget.addAttribute("fieldheight","127");
	widget.addAttribute("fieldwidth","783");
	widget.setClass("data_view");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","749px");
	widget.addStyle("height","109px");
}

private void setAttrFor_RepeatingArea1__40(Widget widget)
{
	widget.addAttribute("occurrences","4");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("list_columns",".top:PUBLIC_tcl_tipclien:tcl_nit.0:159;.top:PUBLIC_tcl_tipclien:tcl_clase.159:122;.top:PUBLIC_tcl_tipclien:tcl_tipo.281:121;.top:PUBLIC_tcl_tipclien:tcl_nombre.402:328");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("id",".top:PUBLIC_tcl_tipclien:RepeatingArea1.");
	widget.addAttribute("displaywidth","749");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","109");
	widget.addAttribute("fieldheight","109");
	widget.addAttribute("fieldwidth","749");
	widget.setClass("repeating_area");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_nit__50(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_nit__60(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("size","26");
	widget.addAttribute("displaywidth","159");
	widget.addAttribute("name",".top:PUBLIC_tcl_tipclien:tcl_nit.");
	widget.addAttribute("title","tcl_nit");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","tcl_nit");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","159");
	widget.addAttribute("type","text");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_clase__50(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_clase__60(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("size","1");
	widget.addAttribute("displaywidth","122");
	widget.addAttribute("name",".top:PUBLIC_tcl_tipclien:tcl_clase.");
	widget.addAttribute("title","tcl_clase");
	widget.addAttribute("displayleft","183");
	widget.addAttribute("headertitle","tcl_clase");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","122");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_tipo__50(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_tipo__60(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("size","1");
	widget.addAttribute("displaywidth","121");
	widget.addAttribute("name",".top:PUBLIC_tcl_tipclien:tcl_tipo.");
	widget.addAttribute("title","tcl_tipo");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("headertitle","tcl_tipo");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","121");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_tcl_nombre__50(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_tcl_nombre__60(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("field_type","text");
	widget.addAttribute("size","54");
	widget.addAttribute("displaywidth","328");
	widget.addAttribute("name",".top:PUBLIC_tcl_tipclien:tcl_nombre.");
	widget.addAttribute("title","tcl_nombre");
	widget.addAttribute("displayleft","231");
	widget.addAttribute("headertitle","tcl_nombre");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","328");
	widget.addAttribute("type","text");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","320px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displaytop","320");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.setClass("box");
	widget.addStyle("border-color","transparent");
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
	widget.addAttribute("displayheight","46");
	widget.addAttribute("id",".top:box11:image1.");
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
	widget.addAttribute("id",".top:box111.");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.setClass("box");
	widget.addStyle("border-color","transparent");
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
	widget.addAttribute("labeltitle","IDENTIFICACIÓN DE COMPRADORES");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("id",".top:box111:label1.");
	widget.addAttribute("displaytop","14");
	widget.addStyle("text-align","left");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
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
	widget.addAttribute("id",".top:box111:label211.");
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
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
	widget.addAttribute("size","32");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("name",".top:box111:textfield1.");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("type","text");
	widget.setClass("textfield");
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
	widget.addAttribute("size","18");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("name",".top:box111:textfield11.");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("type","text");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","240px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addStyle("font-size","14");
	widget.addAttribute("id",".top:label11.");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("labeltitle","Identificación de Compradores");
	widget.addAttribute("displaywidth","240");
	widget.addAttribute("displayleft","20");
	widget.addStyle("color","Black");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("fieldwidth","240");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}
private void dodiv_PUBLIC_tcl_tipclien__10(Widget div_PUBLIC_tcl_tipclien__10)
    {
    ((ContainerWidget)this).addComponent(div_PUBLIC_tcl_tipclien__10,"div_PUBLIC_tcl_tipclien_");
    setAttrFor_div_PUBLIC_tcl_tipclien__10(div_PUBLIC_tcl_tipclien__10);
    DataViewWidget PUBLIC_tcl_tipclien__20 = new DataViewWidget();
        {
        ((ContainerWidget)div_PUBLIC_tcl_tipclien__10).addComponent(PUBLIC_tcl_tipclien__20,"PUBLIC_tcl_tipclien_");
        setAttrFor_PUBLIC_tcl_tipclien__20(PUBLIC_tcl_tipclien__20);
        DivPanelWidget div_RepeatingArea1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)PUBLIC_tcl_tipclien__20).addComponent(div_RepeatingArea1__30,"div_RepeatingArea1_");
            setAttrFor_div_RepeatingArea1__30(div_RepeatingArea1__30);
            RepeatingAreaWidget RepeatingArea1__40 = new RepeatingAreaWidget();
                {
                ((ContainerWidget)div_RepeatingArea1__30).addComponent(RepeatingArea1__40,"RepeatingArea1_");
                setAttrFor_RepeatingArea1__40(RepeatingArea1__40);
                RepeatingGridWidget div_FXGRID_50 = new RepeatingGridWidget();
                    {
                    ((ContainerWidget)RepeatingArea1__40).addComponent(div_FXGRID_50,"div_FXGRID");
                DivPanelWidget div_tcl_nit__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)RepeatingArea1__40).addComponent(div_tcl_nit__50,"div_tcl_nit_");
                    setAttrFor_div_tcl_nit__50(div_tcl_nit__50);
                    TextWidget tcl_nit__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_tcl_nit__50).addComponent(tcl_nit__60,"tcl_nit_");
                        setAttrFor_tcl_nit__60(tcl_nit__60);
                        }
                    }
                DivPanelWidget div_tcl_clase__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)RepeatingArea1__40).addComponent(div_tcl_clase__50,"div_tcl_clase_");
                    setAttrFor_div_tcl_clase__50(div_tcl_clase__50);
                    ListWidget tcl_clase__60 = new ListWidget();
                        {
                        ((ContainerWidget)div_tcl_clase__50).addComponent(tcl_clase__60,"tcl_clase_");
                        setAttrFor_tcl_clase__60(tcl_clase__60);
                        }
                    }
                DivPanelWidget div_tcl_tipo__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)RepeatingArea1__40).addComponent(div_tcl_tipo__50,"div_tcl_tipo_");
                    setAttrFor_div_tcl_tipo__50(div_tcl_tipo__50);
                    ListWidget tcl_tipo__60 = new ListWidget();
                        {
                        ((ContainerWidget)div_tcl_tipo__50).addComponent(tcl_tipo__60,"tcl_tipo_");
                        setAttrFor_tcl_tipo__60(tcl_tipo__60);
                        }
                    }
                DivPanelWidget div_tcl_nombre__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)RepeatingArea1__40).addComponent(div_tcl_nombre__50,"div_tcl_nombre_");
                    setAttrFor_div_tcl_nombre__50(div_tcl_nombre__50);
                    TextWidget tcl_nombre__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_tcl_nombre__50).addComponent(tcl_nombre__60,"tcl_nombre_");
                        setAttrFor_tcl_nombre__60(tcl_nombre__60);
                        }
                    }
                    div_FXGRID_50.addAttribute("id","PUBLIC_tcl_tipclien_FXGRID");
                    div_FXGRID_50.addStyle("top","0");
                    div_FXGRID_50.addStyle("left","0");
                    div_FXGRID_50.addStyle("width","749");
                    div_FXGRID_50.addStyle("height","109");
                    div_FXGRID_50.addStyle("overflow-x","hidden");
                    div_FXGRID_50.addStyle("overflow-y","hidden");
                    div_FXGRID_50.addAttribute("jsinclude","NXJGrid.js");
                    div_FXGRID_50.addAttribute("jslinks","NXJGrid.css");
                    div_FXGRID_50.addAttribute("jsinit","var combo1 = []; var combo2 = [];    var _top_PUBLIC_tcl_tipclien_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'tcl_nit', 	'1', 	'1', 	'159', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'tcl_nit', '.top:PUBLIC_tcl_tipclien:tcl_nit.', '', ''), new NXJGridColumn( 	'tcl_clase', 	'3', 	'1', 	'122', 	'', 	combo1, 	null, 	'textfield', 	true, 	true, 	'tcl_clase', '.top:PUBLIC_tcl_tipclien:tcl_clase.', '', ''), new NXJGridColumn( 	'tcl_tipo', 	'3', 	'1', 	'121', 	'', 	combo2, 	null, 	'textfield', 	true, 	true, 	'tcl_tipo', '.top:PUBLIC_tcl_tipclien:tcl_tipo.', '', ''), new NXJGridColumn( 	'tcl_nombre', 	'1', 	'1', 	'328', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'tcl_nombre', '.top:PUBLIC_tcl_tipclien:tcl_nombre.', '', '') ]; ; if (!window.namesToComponents['PUBLIC_tcl_tipclien_FXGRID'])     {     window.namesToComponents['PUBLIC_tcl_tipclien_FXGRID'] = new NXJGrid('PUBLIC_tcl_tipclien_FXGRID', _top_PUBLIC_tcl_tipclien_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
                    }
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
