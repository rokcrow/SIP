package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	VendedoresFRM_nxjLayoutAttr
	extends FormWidget
{

public VendedoresFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_view1__10 = new DivPanelWidget();
dodiv_view1__10(div_view1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("footer","none");
	widget.addAttribute("resize_browser","true");
	widget.addAttribute("displaywidth","1074");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","501");
	widget.addAttribute("fieldheight","501");
	widget.addAttribute("fieldwidth","1074");
	widget.addStyle("background-color","#999999");
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
}

private void setAttrFor_div_view1__10(Widget widget)
{
	widget.addStyle("left","50px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1005px");
	widget.addStyle("height","466px");
}

private void setAttrFor_view1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("id","view1.");
	widget.addAttribute("displayheight","466");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayleft","50");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__30(Widget widget)
{
}

private void setAttrFor_RepeatingArea1__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)RepeatingArea1.");
	widget.addAttribute("id","view1:RepeatingArea1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vvh_vendedora__50(Widget widget)
{
}

private void setAttrFor_vvh_vendedora__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("fieldwidth","118");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("_name","view1:(Modulo.VendedoresDVW)vvh_vendedora.");
	widget.addAttribute("name","view1:vvh_vendedora.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombVend__50(Widget widget)
{
}

private void setAttrFor_NombVend__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("fieldwidth","339");
	widget.addAttribute("headertitle","Vendedor (a)");
	widget.addAttribute("_name","view1:(Modulo.VendedoresDVW)NombVend.");
	widget.addAttribute("name","view1:NombVend.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)box11.");
	widget.addAttribute("id","view1:box11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__50(Widget widget)
{
}

private void setAttrFor_image1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)box11:(Modulo.VendedoresDVW)image1.");
	widget.addAttribute("id","view1:box11:image1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box111__30(Widget widget)
{
}

private void setAttrFor_box111__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)box111.");
	widget.addAttribute("id","view1:box111.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)box111:(Modulo.VendedoresDVW)label1.");
	widget.addAttribute("id","view1:box111:label1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)box111:(Modulo.VendedoresDVW)label211.");
	widget.addAttribute("id","view1:box111:label211.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__50(Widget widget)
{
}

private void setAttrFor_textfield1__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.VendedoresDVW)box111:(Modulo.VendedoresDVW)textfield1.");
	widget.addAttribute("name","view1:box111:textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield11__50(Widget widget)
{
}

private void setAttrFor_textfield11__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.VendedoresDVW)box111:(Modulo.VendedoresDVW)textfield11.");
	widget.addAttribute("name","view1:box111:textfield11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label111__30(Widget widget)
{
}

private void setAttrFor_label111__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.VendedoresDVW)label111.");
	widget.addAttribute("id","view1:label111.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_view1__10(Widget div_view1__10)
    {
    ((ContainerWidget)this).addComponent(div_view1__10,"div_view1_");
    setAttrFor_div_view1__10(div_view1__10);
    nxjLayout.Modulo.VendedoresDVW_nxjLayoutAttr view1__20 = new nxjLayout.Modulo.VendedoresDVW_nxjLayoutAttr();
        {
        ((ContainerWidget)div_view1__10).addComponent(view1__20,"view1_");
        setAttrFor_view1__20(view1__20);
        Widget div_RepeatingArea1__30 = ((ContainerWidget)view1__20).getComponent("div_RepeatingArea1_");
        if (div_RepeatingArea1__30 != null)
            {
            setAttrFor_div_RepeatingArea1__30(div_RepeatingArea1__30);
            Widget RepeatingArea1__40 = ((ContainerWidget)div_RepeatingArea1__30).getComponent("RepeatingArea1_");
            if (RepeatingArea1__40 != null)
                {
                setAttrFor_RepeatingArea1__40(RepeatingArea1__40);
                Widget div_FXGRID_50 = ((ContainerWidget)RepeatingArea1__40).getComponent("div_FXGRID");
                if (div_FXGRID_50 != null)
                    {
                Widget div_vvh_vendedora__50 = ((ContainerWidget)RepeatingArea1__40).getComponent("div_vvh_vendedora_");
                if (div_vvh_vendedora__50 != null)
                    {
                    setAttrFor_div_vvh_vendedora__50(div_vvh_vendedora__50);
                    Widget vvh_vendedora__60 = ((ContainerWidget)div_vvh_vendedora__50).getComponent("vvh_vendedora_");
                    if (vvh_vendedora__60 != null)
                        {
                        setAttrFor_vvh_vendedora__60(vvh_vendedora__60);
                        }
                    }
                Widget div_NombVend__50 = ((ContainerWidget)RepeatingArea1__40).getComponent("div_NombVend_");
                if (div_NombVend__50 != null)
                    {
                    setAttrFor_div_NombVend__50(div_NombVend__50);
                    Widget NombVend__60 = ((ContainerWidget)div_NombVend__50).getComponent("NombVend_");
                    if (NombVend__60 != null)
                        {
                        setAttrFor_NombVend__60(NombVend__60);
                        }
                    }
                    div_FXGRID_50.addAttribute("id","view1_FXGRID");
                    div_FXGRID_50.addAttribute("jsinit","   var view1_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo', 	'1', 	'1', 	'118', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'', 'view1:vvh_vendedora.', '', ''), new NXJGridColumn( 	'Vendedor (a)', 	'1', 	'1', 	'339', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'', 'view1:NombVend.', '', '') ]; ; if (!window.namesToComponents['view1_FXGRID'])     {     window.namesToComponents['view1_FXGRID'] = new NXJGrid('view1_FXGRID', view1_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
                    }
                }
            }
        Widget div_box11__30 = ((ContainerWidget)view1__20).getComponent("div_box11_");
        if (div_box11__30 != null)
            {
            setAttrFor_div_box11__30(div_box11__30);
            Widget box11__40 = ((ContainerWidget)div_box11__30).getComponent("box11_");
            if (box11__40 != null)
                {
                setAttrFor_box11__40(box11__40);
                Widget div_image1__50 = ((ContainerWidget)box11__40).getComponent("div_image1_");
                if (div_image1__50 != null)
                    {
                    setAttrFor_div_image1__50(div_image1__50);
                    Widget image1__60 = ((ContainerWidget)div_image1__50).getComponent("image1_");
                    if (image1__60 != null)
                        {
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        Widget div_box111__30 = ((ContainerWidget)view1__20).getComponent("div_box111_");
        if (div_box111__30 != null)
            {
            setAttrFor_div_box111__30(div_box111__30);
            Widget box111__40 = ((ContainerWidget)div_box111__30).getComponent("box111_");
            if (box111__40 != null)
                {
                setAttrFor_box111__40(box111__40);
                Widget div_label1__50 = ((ContainerWidget)box111__40).getComponent("div_label1_");
                if (div_label1__50 != null)
                    {
                    setAttrFor_div_label1__50(div_label1__50);
                    Widget label1__60 = ((ContainerWidget)div_label1__50).getComponent("label1_");
                    if (label1__60 != null)
                        {
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                Widget div_label211__50 = ((ContainerWidget)box111__40).getComponent("div_label211_");
                if (div_label211__50 != null)
                    {
                    setAttrFor_div_label211__50(div_label211__50);
                    Widget label211__60 = ((ContainerWidget)div_label211__50).getComponent("label211_");
                    if (label211__60 != null)
                        {
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                Widget div_textfield1__50 = ((ContainerWidget)box111__40).getComponent("div_textfield1_");
                if (div_textfield1__50 != null)
                    {
                    setAttrFor_div_textfield1__50(div_textfield1__50);
                    Widget textfield1__60 = ((ContainerWidget)div_textfield1__50).getComponent("textfield1_");
                    if (textfield1__60 != null)
                        {
                        setAttrFor_textfield1__60(textfield1__60);
                        }
                    }
                Widget div_textfield11__50 = ((ContainerWidget)box111__40).getComponent("div_textfield11_");
                if (div_textfield11__50 != null)
                    {
                    setAttrFor_div_textfield11__50(div_textfield11__50);
                    Widget textfield11__60 = ((ContainerWidget)div_textfield11__50).getComponent("textfield11_");
                    if (textfield11__60 != null)
                        {
                        setAttrFor_textfield11__60(textfield11__60);
                        }
                    }
                }
            }
        Widget div_label111__30 = ((ContainerWidget)view1__20).getComponent("div_label111_");
        if (div_label111__30 != null)
            {
            setAttrFor_div_label111__30(div_label111__30);
            Widget label111__40 = ((ContainerWidget)div_label111__30).getComponent("label111_");
            if (label111__40 != null)
                {
                setAttrFor_label111__40(label111__40);
                }
            }
        }
    }
}
