package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	VendedoresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public VendedoresDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_RepeatingArea1__10 = new DivPanelWidget();
dodiv_RepeatingArea1__10(div_RepeatingArea1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_cajaarribaVendedores__10 = new DivPanelWidget();
dodiv_cajaarribaVendedores__10(div_cajaarribaVendedores__10);
DivPanelWidget div_label111__10 = new DivPanelWidget();
dodiv_label111__10(div_label111__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1005");
	widget.setClass("data_view");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id",".top.");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaytop","25");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","466");
	widget.addAttribute("fieldheight","466");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","250px");
	widget.addStyle("top","100px");
	widget.addStyle("width","476px");
	widget.addStyle("height","302px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","18");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("list_columns",".top:vvh_vendedora.0:118;.top:NombVend.118:339");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("displaywidth","476");
	widget.setClass("repeating_area");
	widget.addAttribute("displayleft","250");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addAttribute("displaytop","100");
	widget.addAttribute("displayheight","302");
	widget.addAttribute("fieldheight","302");
	widget.addAttribute("fieldwidth","476");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vvh_vendedora__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vvh_vendedora__40(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","118");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("name",".top:vvh_vendedora.");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("size","19");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","118");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombVend__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_NombVend__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","339");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","128");
	widget.addAttribute("headertitle","Vendedor (a)");
	widget.addAttribute("name",".top:NombVend.");
	widget.addAttribute("displaytop","20");
	widget.addAttribute("size","56");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","339");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","411px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","411");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
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
	widget.addAttribute("id",".top:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaVendedores__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaVendedores__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:cajaarribaVendedores.");
	widget.addAttribute("displaytop","2");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualempresa__30(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualempresa__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("name",".top:cajaarribaVendedores:actualempresa.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","32");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualusuario__30(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualusuario__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("name",".top:cajaarribaVendedores:actualusuario.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
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
	widget.addAttribute("id",".top:cajaarribaVendedores:label1.");
	widget.addAttribute("labeltitle","VENDEDORES");
	widget.addAttribute("displayheight","23");
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
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.setClass("label");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id",".top:cajaarribaVendedores:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label111__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","149px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label111__20(Widget widget)
{
	widget.addAttribute("labeltitle","Vendedores");
	widget.addAttribute("displaywidth","149");
	widget.setClass("label");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","20");
	widget.addAttribute("id",".top:label111.");
	widget.addAttribute("displaytop","96");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","149");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","14");
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
        RepeatingGridWidget div_FXGRID_30 = new RepeatingGridWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_FXGRID_30,"div_FXGRID");
        DivPanelWidget div_vvh_vendedora__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vvh_vendedora__30,"div_vvh_vendedora_");
            setAttrFor_div_vvh_vendedora__30(div_vvh_vendedora__30);
            TextWidget vvh_vendedora__40 = new TextWidget();
                {
                ((ContainerWidget)div_vvh_vendedora__30).addComponent(vvh_vendedora__40,"vvh_vendedora_");
                setAttrFor_vvh_vendedora__40(vvh_vendedora__40);
                }
            }
        DivPanelWidget div_NombVend__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_NombVend__30,"div_NombVend_");
            setAttrFor_div_NombVend__30(div_NombVend__30);
            TextWidget NombVend__40 = new TextWidget();
                {
                ((ContainerWidget)div_NombVend__30).addComponent(NombVend__40,"NombVend_");
                setAttrFor_NombVend__40(NombVend__40);
                }
            }
            div_FXGRID_30.addAttribute("id","VendedoresDVW_FXGRID");
            div_FXGRID_30.addStyle("top","0");
            div_FXGRID_30.addStyle("left","0");
            div_FXGRID_30.addStyle("width","476");
            div_FXGRID_30.addStyle("height","302");
            div_FXGRID_30.addStyle("overflow-x","hidden");
            div_FXGRID_30.addStyle("overflow-y","hidden");
            div_FXGRID_30.addAttribute("jsinclude","NXJGrid.js");
            div_FXGRID_30.addAttribute("jslinks","NXJGrid.css");
            div_FXGRID_30.addAttribute("jsinit","   var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo', 	'1', 	'1', 	'118', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'', '.top:vvh_vendedora.', '', ''), new NXJGridColumn( 	'Vendedor (a)', 	'1', 	'1', 	'339', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'', '.top:NombVend.', '', '') ]; ; if (!window.namesToComponents['VendedoresDVW_FXGRID'])     {     window.namesToComponents['VendedoresDVW_FXGRID'] = new NXJGrid('VendedoresDVW_FXGRID', _top_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
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
private void dodiv_cajaarribaVendedores__10(Widget div_cajaarribaVendedores__10)
    {
    ((ContainerWidget)this).addComponent(div_cajaarribaVendedores__10,"div_cajaarribaVendedores_");
    setAttrFor_div_cajaarribaVendedores__10(div_cajaarribaVendedores__10);
    FieldSetWidget cajaarribaVendedores__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajaarribaVendedores__10).addComponent(cajaarribaVendedores__20,"cajaarribaVendedores_");
        setAttrFor_cajaarribaVendedores__20(cajaarribaVendedores__20);
        DivPanelWidget div_actualempresa__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaVendedores__20).addComponent(div_actualempresa__30,"div_actualempresa_");
            setAttrFor_div_actualempresa__30(div_actualempresa__30);
            TextWidget actualempresa__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualempresa__30).addComponent(actualempresa__40,"actualempresa_");
                setAttrFor_actualempresa__40(actualempresa__40);
                }
            }
        DivPanelWidget div_actualusuario__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaVendedores__20).addComponent(div_actualusuario__30,"div_actualusuario_");
            setAttrFor_div_actualusuario__30(div_actualusuario__30);
            TextWidget actualusuario__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualusuario__30).addComponent(actualusuario__40,"actualusuario_");
                setAttrFor_actualusuario__40(actualusuario__40);
                }
            }
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaVendedores__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__40 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label211__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaVendedores__20).addComponent(div_label211__30,"div_label211_");
            setAttrFor_div_label211__30(div_label211__30);
            LabelWidget label211__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label211__30).addComponent(label211__40,"label211_");
                setAttrFor_label211__40(label211__40);
                }
            }
        }
    }
private void dodiv_label111__10(Widget div_label111__10)
    {
    ((ContainerWidget)this).addComponent(div_label111__10,"div_label111_");
    setAttrFor_div_label111__10(div_label111__10);
    LabelWidget label111__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label111__10).addComponent(label111__20,"label111_");
        setAttrFor_label111__20(label111__20);
        }
    }
}
