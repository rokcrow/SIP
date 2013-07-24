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
	widget.addAttribute("width","988");
	widget.addAttribute("displaywidth","988");
	widget.addAttribute("displayleft","25");
	widget.setClass("horizontal_line");
	widget.addStyle("background-color","Red");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","1");
	widget.addAttribute("fieldheight","1");
	widget.addAttribute("fieldwidth","988");
	widget.addAttribute("id",".top.");
	widget.addStyle("color","Red");
	widget.addStyle("border-color","Red");
	widget.addStyle("overflow","hidden");
}
}
