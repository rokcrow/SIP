package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	Form1_nxjLayoutAttr
	extends FormWidget
{

public Form1_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_vpp_actividad__10 = new DivPanelWidget();
dodiv_vpp_actividad__10(div_vpp_actividad__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("displayheight","600");
	widget.addAttribute("fieldwidth","700");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("fieldheight","600");
	widget.addAttribute("displaywidth","700");
}

private void setAttrFor_div_vpp_actividad__10(Widget widget)
{
	widget.addStyle("left","86px");
	widget.addStyle("top","264px");
	widget.addStyle("width","303px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_actividad__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("size","50");
	widget.addAttribute("displaywidth","303");
	widget.addAttribute("name","vpp_actividad.");
	widget.addAttribute("displayleft","86");
	widget.addAttribute("displaytop","264");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","303");
	widget.addAttribute("type","text");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}
private void dodiv_vpp_actividad__10(Widget div_vpp_actividad__10)
    {
    ((ContainerWidget)this).addComponent(div_vpp_actividad__10,"div_vpp_actividad_");
    setAttrFor_div_vpp_actividad__10(div_vpp_actividad__10);
    TextWidget vpp_actividad__20 = new TextWidget();
        {
        ((ContainerWidget)div_vpp_actividad__10).addComponent(vpp_actividad__20,"vpp_actividad_");
        setAttrFor_vpp_actividad__20(vpp_actividad__20);
        }
    }
}
