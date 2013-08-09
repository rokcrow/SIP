package nxjLayout.ModuloCNegocios;

import com.unify.nxj.awebView.*;

public class
	IAClientesFRM_nxjLayoutAttr
	extends FormWidget
{

public IAClientesFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_textfield1__10 = new DivPanelWidget();
dodiv_textfield1__10(div_textfield1__10);
DivPanelWidget div_vev_etapactu__10 = new DivPanelWidget();
dodiv_vev_etapactu__10(div_vev_etapactu__10);
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

private void setAttrFor_div_textfield1__10(Widget widget)
{
	widget.addStyle("left","114px");
	widget.addStyle("top","58px");
	widget.addStyle("width","510px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("displaywidth","510");
	widget.addAttribute("displayleft","114");
	widget.addAttribute("displaytop","58");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","510");
	widget.addAttribute("size","85");
	widget.setClass("textfield");
	widget.addAttribute("name","textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vev_etapactu__10(Widget widget)
{
	widget.addStyle("left","82px");
	widget.addStyle("top","198px");
	widget.addStyle("width","189px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vev_etapactu__20(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("displaywidth","189");
	widget.addAttribute("displayleft","82");
	widget.addAttribute("displaytop","198");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","189");
	widget.addAttribute("size","31");
	widget.setClass("textfield");
	widget.addAttribute("name","vev_etapactu.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_textfield1__10(Widget div_textfield1__10)
    {
    ((ContainerWidget)this).addComponent(div_textfield1__10,"div_textfield1_");
    setAttrFor_div_textfield1__10(div_textfield1__10);
    TextWidget textfield1__20 = new TextWidget();
        {
        ((ContainerWidget)div_textfield1__10).addComponent(textfield1__20,"textfield1_");
        setAttrFor_textfield1__20(textfield1__20);
        }
    }
private void dodiv_vev_etapactu__10(Widget div_vev_etapactu__10)
    {
    ((ContainerWidget)this).addComponent(div_vev_etapactu__10,"div_vev_etapactu_");
    setAttrFor_div_vev_etapactu__10(div_vev_etapactu__10);
    TextWidget vev_etapactu__20 = new TextWidget();
        {
        ((ContainerWidget)div_vev_etapactu__10).addComponent(vev_etapactu__20,"vev_etapactu_");
        setAttrFor_vev_etapactu__20(vev_etapactu__20);
        }
    }
}
