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
	widget.addAttribute("displaywidth","988");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displayleft","25");
	widget.addAttribute("displaytop","25");
	widget.addStyle("color","Red");
	widget.addAttribute("id",".top.");
	widget.addAttribute("displayheight","1");
	widget.addAttribute("fieldheight","1");
	widget.addAttribute("fieldwidth","988");
	widget.addStyle("background-color","Red");
	widget.addStyle("border-color","Red");
	widget.addAttribute("width","988");
	widget.setClass("horizontal_line");
	widget.addStyle("overflow","hidden");
}
}
