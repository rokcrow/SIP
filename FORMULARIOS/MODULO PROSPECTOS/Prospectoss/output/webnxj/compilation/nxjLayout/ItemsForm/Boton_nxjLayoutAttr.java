package nxjLayout.ItemsForm;

import com.unify.nxj.awebView.*;

public class
	Boton_nxjLayoutAttr
	extends ButtonWidget
{

public Boton_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("field_type","button");
	widget.setClass("button");
	widget.addAttribute("displaywidth","138");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("type","button");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","None");
	widget.addAttribute("name",".top.");
	widget.addAttribute("value","PRESS");
	widget.addStyle("color","White");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","48");
	widget.addAttribute("fieldheight","48");
	widget.addAttribute("fieldwidth","138");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("overflow","hidden");
}
}
