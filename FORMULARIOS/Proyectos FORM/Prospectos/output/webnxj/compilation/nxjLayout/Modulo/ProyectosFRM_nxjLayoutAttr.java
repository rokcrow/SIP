package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	ProyectosFRM_nxjLayoutAttr
	extends FormWidget
{

public ProyectosFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_view1__10 = new DivPanelWidget();
dodiv_view1__10(div_view1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1294");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","869");
	widget.addAttribute("fieldheight","869");
	widget.addAttribute("fieldwidth","1294");
	widget.addStyle("background-color","#999999");
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
}

private void setAttrFor_div_view1__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1081px");
	widget.addStyle("height","716px");
}

private void setAttrFor_view1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1081");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","190");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id","view1.");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayheight","716");
	widget.addAttribute("fieldheight","716");
	widget.addAttribute("fieldwidth","1081");
	widget.setClass("data_view");
	widget.addAttribute("name","view1.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_view1__10(Widget div_view1__10)
    {
    ((ContainerWidget)this).addComponent(div_view1__10,"div_view1_");
    setAttrFor_div_view1__10(div_view1__10);
    DataViewWidget view1__20 = new DataViewWidget();
        {
        ((ContainerWidget)div_view1__10).addComponent(view1__20,"view1_");
        setAttrFor_view1__20(view1__20);
        }
    }
}
