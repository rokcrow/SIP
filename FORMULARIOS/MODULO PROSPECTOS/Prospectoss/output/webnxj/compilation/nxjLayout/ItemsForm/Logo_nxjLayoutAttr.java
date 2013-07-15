package nxjLayout.ItemsForm;

import com.unify.nxj.awebView.*;

public class
	Logo_nxjLayoutAttr
	extends ImageWidget
{

public Logo_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
}

private void setAttrFor_this(Widget widget)
{
	widget.setClass("image");
	widget.addAttribute("width","164");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","25");
	widget.addAttribute("height","46");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("fieldheight","46");
	widget.addAttribute("fieldwidth","164");
	widget.addAttribute("id",".top.");
	widget.addAttribute("src","ProviLogo.png");
	widget.addStyle("overflow","hidden");
}
}
