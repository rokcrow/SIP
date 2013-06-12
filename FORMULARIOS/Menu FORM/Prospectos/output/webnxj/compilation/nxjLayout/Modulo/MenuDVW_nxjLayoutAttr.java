package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	MenuDVW_nxjLayoutAttr
	extends DataViewWidget
{

public MenuDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_menuPri__10 = new DivPanelWidget();
dodiv_menuPri__10(div_menuPri__10);
DivPanelWidget div_EMPRESA__10 = new DivPanelWidget();
dodiv_EMPRESA__10(div_EMPRESA__10);
DivPanelWidget div_NombreForma1__10 = new DivPanelWidget();
dodiv_NombreForma1__10(div_NombreForma1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_box111__10 = new DivPanelWidget();
dodiv_box111__10(div_box111__10);
DivPanelWidget div_label1__10 = new DivPanelWidget();
dodiv_label1__10(div_label1__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1005");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","439");
	widget.addAttribute("fieldheight","439");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("background-color","#cccccc");
	widget.setClass("data_view");
	widget.addAttribute("name",".top.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_menuPri__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","57px");
	widget.addStyle("width","993px");
	widget.addStyle("height","28px");
}

private void setAttrFor_menuPri__20(Widget widget)
{
	widget.addStyle("font-size","14");
	widget.addAttribute("displaywidth","993");
	widget.addStyle("font-family","Calibri");
	widget.addAttribute("displayleft","4");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:menuPri.");
	widget.addAttribute("displaytop","57");
	widget.addAttribute("displayheight","28");
	widget.addAttribute("fieldheight","28");
	widget.addAttribute("menustylesheet","silver.css");
	widget.addAttribute("fieldwidth","993");
	widget.addStyle("font-style","normal");
	widget.setClass("menu");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJMenuBar.js");
}

private void setAttrFor_div_EMPRESA__10(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","169px");
	widget.addStyle("width","348px");
	widget.addStyle("height","21px");
}

private void setAttrFor_EMPRESA__20(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","348");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("displaytop","169");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","348");
	widget.addAttribute("size","1");
	widget.setClass("listbox");
	widget.addAttribute("name",".top:EMPRESA.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombreForma1__10(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","281px");
	widget.addStyle("width","348px");
	widget.addStyle("height","22px");
}

private void setAttrFor_NombreForma1__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("displaywidth","348");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("displaytop","281");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","348");
	widget.addAttribute("size","58");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:NombreForma1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","384px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","399");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","384");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__30(Widget widget)
{
	widget.addStyle("left","391px");
	widget.addStyle("top","-6px");
	widget.addStyle("width","222px");
	widget.addStyle("height","62px");
}

private void setAttrFor_image1__40(Widget widget)
{
	widget.addAttribute("id",".top:box11:image1.");
	widget.addAttribute("displaytop","-6");
	widget.addAttribute("displayleft","391");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box111__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box111__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box111.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","200px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","MENU DEL SISTEMA");
	widget.addAttribute("displaywidth","200");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("id",".top:box111:label1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","200");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__30(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","55px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__40(Widget widget)
{
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id",".top:box111:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__30(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("size","32");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:box111:textfield1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield11__30(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield11__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("type","text");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("size","18");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:box111:textfield11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__10(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","143px");
	widget.addStyle("width","148px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__20(Widget widget)
{
	widget.addStyle("font-size","12");
	widget.addAttribute("labeltitle","Sociedades Disponibles");
	widget.addAttribute("displaywidth","148");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("id",".top:label1.");
	widget.addAttribute("displaytop","143");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","148");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","255px");
	widget.addStyle("width","142px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addStyle("font-size","12");
	widget.addAttribute("labeltitle","Nombre del Formulario");
	widget.addAttribute("displaywidth","142");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("id",".top:label11.");
	widget.addAttribute("displaytop","255");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","142");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}
private void dodiv_menuPri__10(Widget div_menuPri__10)
    {
    ((ContainerWidget)this).addComponent(div_menuPri__10,"div_menuPri_");
    setAttrFor_div_menuPri__10(div_menuPri__10);
    InternalJavaScriptWidget menuPri__20 = new InternalJavaScriptWidget();
        {
        ((ContainerWidget)div_menuPri__10).addComponent(menuPri__20,"menuPri_");
        setAttrFor_menuPri__20(menuPri__20);
        }
    }
private void dodiv_EMPRESA__10(Widget div_EMPRESA__10)
    {
    ((ContainerWidget)this).addComponent(div_EMPRESA__10,"div_EMPRESA_");
    setAttrFor_div_EMPRESA__10(div_EMPRESA__10);
    ListWidget EMPRESA__20 = new ListWidget();
        {
        ((ContainerWidget)div_EMPRESA__10).addComponent(EMPRESA__20,"EMPRESA_");
        setAttrFor_EMPRESA__20(EMPRESA__20);
        }
    }
private void dodiv_NombreForma1__10(Widget div_NombreForma1__10)
    {
    ((ContainerWidget)this).addComponent(div_NombreForma1__10,"div_NombreForma1_");
    setAttrFor_div_NombreForma1__10(div_NombreForma1__10);
    TextWidget NombreForma1__20 = new TextWidget();
        {
        ((ContainerWidget)div_NombreForma1__10).addComponent(NombreForma1__20,"NombreForma1_");
        setAttrFor_NombreForma1__20(NombreForma1__20);
        }
    }
private void dodiv_box11__10(Widget div_box11__10)
    {
    ((ContainerWidget)this).addComponent(div_box11__10,"div_box11_");
    setAttrFor_div_box11__10(div_box11__10);
    FieldSetWidget box11__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_box11__10).addComponent(box11__20,"box11_");
        setAttrFor_box11__20(box11__20);
        DivPanelWidget div_image1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box11__20).addComponent(div_image1__30,"div_image1_");
            setAttrFor_div_image1__30(div_image1__30);
            nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__40 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                {
                ((ContainerWidget)div_image1__30).addComponent(image1__40,"image1_");
                setAttrFor_image1__40(image1__40);
                }
            }
        }
    }
private void dodiv_box111__10(Widget div_box111__10)
    {
    ((ContainerWidget)this).addComponent(div_box111__10,"div_box111_");
    setAttrFor_div_box111__10(div_box111__10);
    FieldSetWidget box111__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_box111__10).addComponent(box111__20,"box111_");
        setAttrFor_box111__20(box111__20);
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__40 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label211__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_label211__30,"div_label211_");
            setAttrFor_div_label211__30(div_label211__30);
            LabelWidget label211__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label211__30).addComponent(label211__40,"label211_");
                setAttrFor_label211__40(label211__40);
                }
            }
        DivPanelWidget div_textfield1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_textfield1__30,"div_textfield1_");
            setAttrFor_div_textfield1__30(div_textfield1__30);
            TextWidget textfield1__40 = new TextWidget();
                {
                ((ContainerWidget)div_textfield1__30).addComponent(textfield1__40,"textfield1_");
                setAttrFor_textfield1__40(textfield1__40);
                }
            }
        DivPanelWidget div_textfield11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)box111__20).addComponent(div_textfield11__30,"div_textfield11_");
            setAttrFor_div_textfield11__30(div_textfield11__30);
            TextWidget textfield11__40 = new TextWidget();
                {
                ((ContainerWidget)div_textfield11__30).addComponent(textfield11__40,"textfield11_");
                setAttrFor_textfield11__40(textfield11__40);
                }
            }
        }
    }
private void dodiv_label1__10(Widget div_label1__10)
    {
    ((ContainerWidget)this).addComponent(div_label1__10,"div_label1_");
    setAttrFor_div_label1__10(div_label1__10);
    LabelWidget label1__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label1__10).addComponent(label1__20,"label1_");
        setAttrFor_label1__20(label1__20);
        }
    }
private void dodiv_label11__10(Widget div_label11__10)
    {
    ((ContainerWidget)this).addComponent(div_label11__10,"div_label11_");
    setAttrFor_div_label11__10(div_label11__10);
    LabelWidget label11__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label11__10).addComponent(label11__20,"label11_");
        setAttrFor_label11__20(label11__20);
        }
    }
}
