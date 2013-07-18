package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	Form3_nxjLayoutAttr
	extends FormWidget
{

public Form3_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_box1__10 = new DivPanelWidget();
dodiv_box1__10(div_box1__10);
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

private void setAttrFor_div_box1__10(Widget widget)
{
	widget.addStyle("left","203px");
	widget.addStyle("top","75px");
	widget.addStyle("width","63px");
	widget.addStyle("height","113px");
}

private void setAttrFor_box1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","63");
	widget.addAttribute("id","box1.");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","203");
	widget.addAttribute("displaytop","75");
	widget.addAttribute("displayheight","113");
	widget.addAttribute("fieldheight","113");
	widget.addAttribute("fieldwidth","63");
	widget.addAttribute("legend","Legend");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xxx__30(Widget widget)
{
	widget.addStyle("left","11px");
	widget.addStyle("top","39px");
	widget.addStyle("width","38px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xxx__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addStyle("visibility","hidden");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","38");
	widget.addAttribute("name","box1:xxx.");
	widget.addAttribute("displayleft","11");
	widget.addAttribute("size","6");
	widget.addAttribute("displaytop","39");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","38");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}
private void dodiv_box1__10(Widget div_box1__10)
    {
    ((ContainerWidget)this).addComponent(div_box1__10,"div_box1_");
    setAttrFor_div_box1__10(div_box1__10);
    FieldSetWidget box1__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_box1__10).addComponent(box1__20,"box1_");
        setAttrFor_box1__20(box1__20);
        DivPanelWidget div_xxx__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box1__20).addComponent(div_xxx__30,"div_xxx_");
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
