package nxjLayout.ItemsForm;

import com.unify.nxj.awebView.*;

public class
	TituloLBL_nxjLayoutAttr
	extends LabelWidget
{

public TituloLBL_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
}

private void setAttrFor_this(Widget widget)
{
	widget.addStyle("font-size","18");
	widget.addAttribute("id",".top.");
	widget.addAttribute("labeltitle","TITULO");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displayleft","25");
	widget.addStyle("color","White");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldheight","23");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("fieldwidth","522");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}
}
