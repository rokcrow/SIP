package nxjLayout;

import com.unify.nxj.awebView.*;

public class
	Form1_nxjLayoutAttr
	extends FormWidget
{

public Form1_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_dropdown__10 = new DivPanelWidget();
dodiv_dropdown__10(div_dropdown__10);
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

private void setAttrFor_div_dropdown__10(Widget widget)
{
	widget.addStyle("left","145px");
	widget.addStyle("top","226px");
	widget.addStyle("width","313px");
	widget.addStyle("height","21px");
}

private void setAttrFor_dropdown__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("displaywidth","313");
	widget.addAttribute("displayleft","145");
	widget.addAttribute("displaytop","226");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","313");
	widget.addAttribute("size","1");
	widget.setClass("dropdown_list");
	widget.addAttribute("name","dropdown.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_dropdown__10(Widget div_dropdown__10)
    {
    ((ContainerWidget)this).addComponent(div_dropdown__10,"div_dropdown_");
    setAttrFor_div_dropdown__10(div_dropdown__10);
    ListWidget dropdown__20 = new ListWidget();
        {
        ((ContainerWidget)div_dropdown__10).addComponent(dropdown__20,"dropdown_");
        setAttrFor_dropdown__20(dropdown__20);
        }
    }
}
