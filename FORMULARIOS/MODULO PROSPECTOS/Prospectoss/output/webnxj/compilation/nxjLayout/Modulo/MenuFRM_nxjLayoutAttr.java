package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	MenuFRM_nxjLayoutAttr
	extends FormWidget
{

public MenuFRM_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeMenu__10 = new DivPanelWidget();
dodiv_cajagrandeMenu__10(div_cajagrandeMenu__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("localized","true");
	widget.addAttribute("header","none");
	widget.addAttribute("footer","none");
	widget.addAttribute("menu","none");
	widget.addAttribute("title","Menu");
	widget.addAttribute("displaywidth","1202");
	widget.setClass("form");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("name","NXJForm");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayheight","525");
	widget.addAttribute("fieldheight","528");
	widget.addAttribute("fieldwidth","1202");
}

private void setAttrFor_div_cajagrandeMenu__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","493px");
}

private void setAttrFor_cajagrandeMenu__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1004");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","190");
	widget.addAttribute("id","cajagrandeMenu.");
	widget.addAttribute("displaytop","30");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","493");
	widget.addAttribute("fieldheight","493");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_EMPRESA__30(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","169px");
	widget.addStyle("width","348px");
	widget.addStyle("height","21px");
}

private void setAttrFor_EMPRESA__40(Widget widget)
{
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("immediate","true");
	widget.addAttribute("displaywidth","348");
	widget.setClass("listbox");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("name","cajagrandeMenu:EMPRESA.");
	widget.addAttribute("displaytop","169");
	widget.addAttribute("size","1");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","348");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_MTraspasa__30(Widget widget)
{
	widget.addStyle("left","70px");
	widget.addStyle("top","134px");
	widget.addStyle("width","41px");
	widget.addStyle("height","22px");
}

private void setAttrFor_MTraspasa__40(Widget widget)
{
	widget.addStyle("visibility","hidden");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","41");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","70");
	widget.addAttribute("name","cajagrandeMenu:MTraspasa.");
	widget.addAttribute("displaytop","134");
	widget.addAttribute("size","6");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","41");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombreForma1__30(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","281px");
	widget.addStyle("width","348px");
	widget.addStyle("height","22px");
}

private void setAttrFor_NombreForma1__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","348");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("name","cajagrandeMenu:NombreForma1.");
	widget.addAttribute("displaytop","281");
	widget.addAttribute("size","58");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","348");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_button1__30(Widget widget)
{
	widget.addStyle("left","17px");
	widget.addStyle("top","325px");
	widget.addStyle("width","168px");
	widget.addStyle("height","48px");
}

private void setAttrFor_button1__40(Widget widget)
{
	widget.addAttribute("field_type","button");
	widget.addAttribute("command","BackMenu");
	widget.addAttribute("value","backlogin");
	widget.addAttribute("type","button");
	widget.addAttribute("displaywidth","168");
	widget.addAttribute("displayleft","17");
	widget.addAttribute("name","cajagrandeMenu:button1.");
	widget.addAttribute("displaytop","325");
	widget.addAttribute("fieldwidth","168");
	widget.addAttribute("instancewidth","168");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaabajoMenu__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","442px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaabajoMenu__40(Widget widget)
{
	widget.addAttribute("field_weight","499");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeMenu:cajaabajoMenu.");
	widget.addAttribute("displaytop","442");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__50(Widget widget)
{
	widget.addStyle("left","416px");
	widget.addStyle("top","2px");
	widget.addStyle("width","164px");
	widget.addStyle("height","46px");
}

private void setAttrFor_image1__60(Widget widget)
{
	widget.addAttribute("id","cajagrandeMenu:cajaabajoMenu:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaMenu__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaMenu__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id","cajagrandeMenu:cajaarribaMenu.");
	widget.addAttribute("displaytop","2");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualempresa__50(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualempresa__60(Widget widget)
{
	widget.addStyle("visibility","visible");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("name","cajagrandeMenu:cajaarribaMenu:actualempresa.");
	widget.addAttribute("displaytop","14");
	widget.addStyle("color","Black");
	widget.addAttribute("size","32");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualusuario__50(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualusuario__60(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("name","cajagrandeMenu:cajaarribaMenu:actualusuario.");
	widget.addAttribute("displaytop","14");
	widget.addStyle("color","Black");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","240px");
	widget.addStyle("top","14px");
	widget.addStyle("width","221px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","MENUDELSISTEMA");
	widget.addAttribute("displaywidth","221");
	widget.addAttribute("displayleft","240");
	widget.addAttribute("id","cajagrandeMenu:cajaarribaMenu:label1.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","221");
	widget.addStyle("text-align","left");
	widget.addAttribute("instancewidth","221");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","55px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.addAttribute("displaywidth","55");
	widget.setClass("label");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id","cajagrandeMenu:cajaarribaMenu:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","143px");
	widget.addStyle("width","148px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","SociedadesDisponibles");
	widget.addAttribute("displaywidth","148");
	widget.setClass("label");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("id","cajagrandeMenu:label1.");
	widget.addAttribute("displaytop","143");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","148");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","365px");
	widget.addStyle("top","255px");
	widget.addStyle("width","142px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","NombredelFormulario");
	widget.addAttribute("displaywidth","142");
	widget.setClass("label");
	widget.addAttribute("displayleft","365");
	widget.addAttribute("id","cajagrandeMenu:label11.");
	widget.addAttribute("displaytop","255");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","142");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_menuPri__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","52px");
	widget.addStyle("width","996px");
	widget.addStyle("height","23px");
}

private void setAttrFor_menuPri__40(Widget widget)
{
	widget.addAttribute("displaywidth","996");
	widget.setClass("menu");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","4");
	widget.addAttribute("id","cajagrandeMenu:menuPri.");
	widget.addAttribute("displaytop","52");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Raavi");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldheight","23");
	widget.addAttribute("menustylesheet","default.css");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("font-size","16");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJMenuBar.js");
}
private void dodiv_cajagrandeMenu__10(Widget div_cajagrandeMenu__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeMenu__10,"div_cajagrandeMenu_");
    setAttrFor_div_cajagrandeMenu__10(div_cajagrandeMenu__10);
    FieldSetWidget cajagrandeMenu__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeMenu__10).addComponent(cajagrandeMenu__20,"cajagrandeMenu_");
        setAttrFor_cajagrandeMenu__20(cajagrandeMenu__20);
        DivPanelWidget div_EMPRESA__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_EMPRESA__30,"div_EMPRESA_");
            setAttrFor_div_EMPRESA__30(div_EMPRESA__30);
            ListWidget EMPRESA__40 = new ListWidget();
                {
                ((ContainerWidget)div_EMPRESA__30).addComponent(EMPRESA__40,"EMPRESA_");
                setAttrFor_EMPRESA__40(EMPRESA__40);
                }
            }
        DivPanelWidget div_MTraspasa__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_MTraspasa__30,"div_MTraspasa_");
            setAttrFor_div_MTraspasa__30(div_MTraspasa__30);
            TextWidget MTraspasa__40 = new TextWidget();
                {
                ((ContainerWidget)div_MTraspasa__30).addComponent(MTraspasa__40,"MTraspasa_");
                setAttrFor_MTraspasa__40(MTraspasa__40);
                }
            }
        DivPanelWidget div_NombreForma1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_NombreForma1__30,"div_NombreForma1_");
            setAttrFor_div_NombreForma1__30(div_NombreForma1__30);
            TextWidget NombreForma1__40 = new TextWidget();
                {
                ((ContainerWidget)div_NombreForma1__30).addComponent(NombreForma1__40,"NombreForma1_");
                setAttrFor_NombreForma1__40(NombreForma1__40);
                }
            }
        DivPanelWidget div_button1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_button1__30,"div_button1_");
            setAttrFor_div_button1__30(div_button1__30);
            nxjLayout.ItemsForm.Boton_nxjLayoutAttr button1__40 = new nxjLayout.ItemsForm.Boton_nxjLayoutAttr();
                {
                ((ContainerWidget)div_button1__30).addComponent(button1__40,"button1_");
                setAttrFor_button1__40(button1__40);
                }
            }
        DivPanelWidget div_cajaabajoMenu__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_cajaabajoMenu__30,"div_cajaabajoMenu_");
            setAttrFor_div_cajaabajoMenu__30(div_cajaabajoMenu__30);
            FieldSetWidget cajaabajoMenu__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaabajoMenu__30).addComponent(cajaabajoMenu__40,"cajaabajoMenu_");
                setAttrFor_cajaabajoMenu__40(cajaabajoMenu__40);
                DivPanelWidget div_image1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaabajoMenu__40).addComponent(div_image1__50,"div_image1_");
                    setAttrFor_div_image1__50(div_image1__50);
                    nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__60 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_image1__50).addComponent(image1__60,"image1_");
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_cajaarribaMenu__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_cajaarribaMenu__30,"div_cajaarribaMenu_");
            setAttrFor_div_cajaarribaMenu__30(div_cajaarribaMenu__30);
            FieldSetWidget cajaarribaMenu__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaMenu__30).addComponent(cajaarribaMenu__40,"cajaarribaMenu_");
                setAttrFor_cajaarribaMenu__40(cajaarribaMenu__40);
                DivPanelWidget div_actualempresa__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaMenu__40).addComponent(div_actualempresa__50,"div_actualempresa_");
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    TextWidget actualempresa__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualempresa__50).addComponent(actualempresa__60,"actualempresa_");
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                DivPanelWidget div_actualusuario__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaMenu__40).addComponent(div_actualusuario__50,"div_actualusuario_");
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    TextWidget actualusuario__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualusuario__50).addComponent(actualusuario__60,"actualusuario_");
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaMenu__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaMenu__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                }
            }
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            LabelWidget label1__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_menuPri__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeMenu__20).addComponent(div_menuPri__30,"div_menuPri_");
            setAttrFor_div_menuPri__30(div_menuPri__30);
            InternalJavaScriptWidget menuPri__40 = new InternalJavaScriptWidget();
                {
                ((ContainerWidget)div_menuPri__30).addComponent(menuPri__40,"menuPri_");
                setAttrFor_menuPri__40(menuPri__40);
                }
            }
        }
    }
}
