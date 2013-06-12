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
DivPanelWidget div_menuPri__10 = new DivPanelWidget();
dodiv_menuPri__10(div_menuPri__10);
DivPanelWidget div_label1__10 = new DivPanelWidget();
dodiv_label1__10(div_label1__10);
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

private void setAttrFor_div_menuPri__10(Widget widget)
{
	widget.addStyle("left","32px");
	widget.addStyle("top","76px");
	widget.addStyle("width","621px");
	widget.addStyle("height","23px");
}

private void setAttrFor_menuPri__20(Widget widget)
{
	widget.addStyle("font-size","12");
	widget.addAttribute("displaywidth","621");
	widget.addStyle("font-family","Trebuchet MS");
	widget.addAttribute("displayleft","32");
	widget.addStyle("color","Black");
	widget.addAttribute("id","menuPri.");
	widget.addAttribute("displaytop","76");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("menustylesheet","default.css");
	widget.addAttribute("fieldheight","23");
	widget.addAttribute("fieldwidth","621");
	widget.setClass("menu");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJMenuBar.js");
}

private void setAttrFor_div_label1__10(Widget widget)
{
	widget.addStyle("left","289px");
	widget.addStyle("top","152px");
	widget.addStyle("width","125px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label1__20(Widget widget)
{
	widget.addStyle("font-size","16");
	widget.addAttribute("labeltitle","ñame panamá");
	widget.addAttribute("displaywidth","125");
	widget.addAttribute("displayleft","289");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id","label1.");
	widget.addAttribute("displaytop","152");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","125");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}
private void dodiv_menuPri__10(Widget div_menuPri__10)
    {
    ((ContainerWidget)this).addComponent(div_menuPri__10,"div_menuPri_");
    setAttrFor_div_menuPri__10(div_menuPri__10);
    InternalJavaScriptWidget menuPri__20 = new InternalJavaScriptWidget();
        {
        ((ContainerWidget)div_menuPri__10).addComponent(menuPri__20,"menuPri_");
        setAttrFor_menuPri__20(menuPri__20);
        }
    }
private void dodiv_label1__10(Widget div_label1__10)
    {
    ((ContainerWidget)this).addComponent(div_label1__10,"div_label1_");
    setAttrFor_div_label1__10(div_label1__10);
    LabelWidget label1__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label1__10).addComponent(label1__20,"label1_");
        setAttrFor_label1__20(label1__20);
        }
    }
}
