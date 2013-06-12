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
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaywidth","222");
	widget.addAttribute("height","20");
	widget.addAttribute("displayleft","25");
	widget.addAttribute("src","ProviLogo.png");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","62");
	widget.addAttribute("fieldheight","62");
	widget.addAttribute("id",".top.");
	widget.addAttribute("fieldwidth","222");
	widget.setClass("image");
	widget.addStyle("overflow","hidden");
}
}
