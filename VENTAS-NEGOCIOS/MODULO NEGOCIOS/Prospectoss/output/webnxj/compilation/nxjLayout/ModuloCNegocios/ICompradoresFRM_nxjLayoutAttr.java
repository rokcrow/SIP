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
DivPanelWidget div_textfield1__10 = new DivPanelWidget();
dodiv_textfield1__10(div_textfield1__10);
DivPanelWidget div_vmu_garage1__10 = new DivPanelWidget();
dodiv_vmu_garage1__10(div_vmu_garage1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","700");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","600");
	widget.addAttribute("fieldheight","600");
	widget.addAttribute("fieldwidth","700");
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
}

private void setAttrFor_div_textfield1__10(Widget widget)
{
	widget.addStyle("left","169px");
	widget.addStyle("top","71px");
	widget.addStyle("width","194px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("displaywidth","194");
	widget.addAttribute("displayleft","169");
	widget.addAttribute("displaytop","71");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","194");
	widget.addAttribute("size","32");
	widget.setClass("textfield");
	widget.addAttribute("name","textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vmu_garage1__10(Widget widget)
{
	widget.addStyle("left","50px");
	widget.addStyle("top","248px");
	widget.addStyle("width","199px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vmu_garage1__20(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("displaywidth","199");
	widget.addAttribute("displayleft","50");
	widget.addAttribute("displaytop","248");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","199");
	widget.addAttribute("size","33");
	widget.setClass("textfield");
	widget.addAttribute("name","vmu_garage1.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_textfield1__10(Widget div_textfield1__10)
    {
    ((ContainerWidget)this).addComponent(div_textfield1__10,"div_textfield1_");
    setAttrFor_div_textfield1__10(div_textfield1__10);
    TextWidget textfield1__20 = new TextWidget();
        {
        ((ContainerWidget)div_textfield1__10).addComponent(textfield1__20,"textfield1_");
        setAttrFor_textfield1__20(textfield1__20);
        }
    }
private void dodiv_vmu_garage1__10(Widget div_vmu_garage1__10)
    {
    ((ContainerWidget)this).addComponent(div_vmu_garage1__10,"div_vmu_garage1_");
    setAttrFor_div_vmu_garage1__10(div_vmu_garage1__10);
    TextWidget vmu_garage1__20 = new TextWidget();
        {
        ((ContainerWidget)div_vmu_garage1__10).addComponent(vmu_garage1__20,"vmu_garage1_");
        setAttrFor_vmu_garage1__20(vmu_garage1__20);
        }
    }
}
