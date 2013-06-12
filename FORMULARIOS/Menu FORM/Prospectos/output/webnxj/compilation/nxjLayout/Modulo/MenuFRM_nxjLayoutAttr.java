package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	MenuFRM_nxjLayoutAttr
	extends FormWidget
{

public MenuFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_view1__10 = new DivPanelWidget();
dodiv_view1__10(div_view1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","700");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","590");
	widget.addAttribute("fieldheight","590");
	widget.addAttribute("fieldwidth","1198");
	widget.addStyle("background-color","#999999");
	widget.setClass("form");
	widget.addAttribute("name","NXJForm");
}

private void setAttrFor_div_view1__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1005px");
	widget.addStyle("height","439px");
}

private void setAttrFor_view1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("id","view1.");
	widget.addAttribute("displayheight","439");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayleft","190");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_menuPri__30(Widget widget)
{
}

private void setAttrFor_menuPri__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)menuPri.");
	widget.addAttribute("id","view1:menuPri.");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJMenuBar.js");
}

private void setAttrFor_div_EMPRESA__30(Widget widget)
{
}

private void setAttrFor_EMPRESA__40(Widget widget)
{
	widget.addAttribute("_name","view1:(Modulo.MenuDVW)EMPRESA.");
	widget.addAttribute("name","view1:EMPRESA.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombreForma1__30(Widget widget)
{
}

private void setAttrFor_NombreForma1__40(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.MenuDVW)NombreForma1.");
	widget.addAttribute("name","view1:NombreForma1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)box11.");
	widget.addAttribute("id","view1:box11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__50(Widget widget)
{
}

private void setAttrFor_image1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)box11:(Modulo.MenuDVW)image1.");
	widget.addAttribute("id","view1:box11:image1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box111__30(Widget widget)
{
}

private void setAttrFor_box111__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)box111.");
	widget.addAttribute("id","view1:box111.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)box111:(Modulo.MenuDVW)label1.");
	widget.addAttribute("id","view1:box111:label1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)box111:(Modulo.MenuDVW)label211.");
	widget.addAttribute("id","view1:box111:label211.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__50(Widget widget)
{
}

private void setAttrFor_textfield1__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.MenuDVW)box111:(Modulo.MenuDVW)textfield1.");
	widget.addAttribute("name","view1:box111:textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield11__50(Widget widget)
{
}

private void setAttrFor_textfield11__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.MenuDVW)box111:(Modulo.MenuDVW)textfield11.");
	widget.addAttribute("name","view1:box111:textfield11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)label1.");
	widget.addAttribute("id","view1:label1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.MenuDVW)label11.");
	widget.addAttribute("id","view1:label11.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_view1__10(Widget div_view1__10)
    {
    ((ContainerWidget)this).addComponent(div_view1__10,"div_view1_");
    setAttrFor_div_view1__10(div_view1__10);
    nxjLayout.Modulo.MenuDVW_nxjLayoutAttr view1__20 = new nxjLayout.Modulo.MenuDVW_nxjLayoutAttr();
        {
        ((ContainerWidget)div_view1__10).addComponent(view1__20,"view1_");
        setAttrFor_view1__20(view1__20);
        Widget div_menuPri__30 = ((ContainerWidget)view1__20).getComponent("div_menuPri_");
        if (div_menuPri__30 != null)
            {
            setAttrFor_div_menuPri__30(div_menuPri__30);
            Widget menuPri__40 = ((ContainerWidget)div_menuPri__30).getComponent("menuPri_");
            if (menuPri__40 != null)
                {
                setAttrFor_menuPri__40(menuPri__40);
                }
            }
        Widget div_EMPRESA__30 = ((ContainerWidget)view1__20).getComponent("div_EMPRESA_");
        if (div_EMPRESA__30 != null)
            {
            setAttrFor_div_EMPRESA__30(div_EMPRESA__30);
            Widget EMPRESA__40 = ((ContainerWidget)div_EMPRESA__30).getComponent("EMPRESA_");
            if (EMPRESA__40 != null)
                {
                setAttrFor_EMPRESA__40(EMPRESA__40);
                }
            }
        Widget div_NombreForma1__30 = ((ContainerWidget)view1__20).getComponent("div_NombreForma1_");
        if (div_NombreForma1__30 != null)
            {
            setAttrFor_div_NombreForma1__30(div_NombreForma1__30);
            Widget NombreForma1__40 = ((ContainerWidget)div_NombreForma1__30).getComponent("NombreForma1_");
            if (NombreForma1__40 != null)
                {
                setAttrFor_NombreForma1__40(NombreForma1__40);
                }
            }
        Widget div_box11__30 = ((ContainerWidget)view1__20).getComponent("div_box11_");
        if (div_box11__30 != null)
            {
            setAttrFor_div_box11__30(div_box11__30);
            Widget box11__40 = ((ContainerWidget)div_box11__30).getComponent("box11_");
            if (box11__40 != null)
                {
                setAttrFor_box11__40(box11__40);
                Widget div_image1__50 = ((ContainerWidget)box11__40).getComponent("div_image1_");
                if (div_image1__50 != null)
                    {
                    setAttrFor_div_image1__50(div_image1__50);
                    Widget image1__60 = ((ContainerWidget)div_image1__50).getComponent("image1_");
                    if (image1__60 != null)
                        {
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        Widget div_box111__30 = ((ContainerWidget)view1__20).getComponent("div_box111_");
        if (div_box111__30 != null)
            {
            setAttrFor_div_box111__30(div_box111__30);
            Widget box111__40 = ((ContainerWidget)div_box111__30).getComponent("box111_");
            if (box111__40 != null)
                {
                setAttrFor_box111__40(box111__40);
                Widget div_label1__50 = ((ContainerWidget)box111__40).getComponent("div_label1_");
                if (div_label1__50 != null)
                    {
                    setAttrFor_div_label1__50(div_label1__50);
                    Widget label1__60 = ((ContainerWidget)div_label1__50).getComponent("label1_");
                    if (label1__60 != null)
                        {
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                Widget div_label211__50 = ((ContainerWidget)box111__40).getComponent("div_label211_");
                if (div_label211__50 != null)
                    {
                    setAttrFor_div_label211__50(div_label211__50);
                    Widget label211__60 = ((ContainerWidget)div_label211__50).getComponent("label211_");
                    if (label211__60 != null)
                        {
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                Widget div_textfield1__50 = ((ContainerWidget)box111__40).getComponent("div_textfield1_");
                if (div_textfield1__50 != null)
                    {
                    setAttrFor_div_textfield1__50(div_textfield1__50);
                    Widget textfield1__60 = ((ContainerWidget)div_textfield1__50).getComponent("textfield1_");
                    if (textfield1__60 != null)
                        {
                        setAttrFor_textfield1__60(textfield1__60);
                        }
                    }
                Widget div_textfield11__50 = ((ContainerWidget)box111__40).getComponent("div_textfield11_");
                if (div_textfield11__50 != null)
                    {
                    setAttrFor_div_textfield11__50(div_textfield11__50);
                    Widget textfield11__60 = ((ContainerWidget)div_textfield11__50).getComponent("textfield11_");
                    if (textfield11__60 != null)
                        {
                        setAttrFor_textfield11__60(textfield11__60);
                        }
                    }
                }
            }
        Widget div_label1__30 = ((ContainerWidget)view1__20).getComponent("div_label1_");
        if (div_label1__30 != null)
            {
            setAttrFor_div_label1__30(div_label1__30);
            Widget label1__40 = ((ContainerWidget)div_label1__30).getComponent("label1_");
            if (label1__40 != null)
                {
                setAttrFor_label1__40(label1__40);
                }
            }
        Widget div_label11__30 = ((ContainerWidget)view1__20).getComponent("div_label11_");
        if (div_label11__30 != null)
            {
            setAttrFor_div_label11__30(div_label11__30);
            Widget label11__40 = ((ContainerWidget)div_label11__30).getComponent("label11_");
            if (label11__40 != null)
                {
                setAttrFor_label11__40(label11__40);
                }
            }
        }
    }
}
