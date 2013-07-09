package nxjLayout.ItemsForm;

import com.unify.nxj.awebView.*;

public class
	LineaRoja_nxjLayoutAttr
	extends LineWidget
{

public LineaRoja_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("command",".top.");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaywidth","200");
	widget.addStyle("background-color","Red");
	widget.addAttribute("width","200");
	widget.addAttribute("displayleft","25");
	widget.setClass("horizontal_line");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","1");
	widget.addAttribute("fieldheight","1");
	widget.addAttribute("fieldwidth","200");
	widget.addStyle("color","Red");
	widget.addAttribute("id",".top.");
	widget.addStyle("border-color","Red");
	widget.addStyle("overflow","hidden");
}
}
