package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	Form2_nxjLayoutAttr
	extends FormWidget
{

public Form2_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_textfield1__10 = new DivPanelWidget();
dodiv_textfield1__10(div_textfield1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","700");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","600");
	widget.addAttribute("fieldheight","600");
	widget.addAttribute("fieldwidth","700");
	widget.setClass("form");
}

private void setAttrFor_div_textfield1__10(Widget widget)
{
	widget.addStyle("left","114px");
	widget.addStyle("top","58px");
	widget.addStyle("width","510px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","510");
	widget.addAttribute("name","textfield1.");
	widget.addAttribute("displayleft","114");
	widget.addAttribute("size","85");
	widget.addAttribute("displaytop","58");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","510");
	widget.setClass("textfield");
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
}