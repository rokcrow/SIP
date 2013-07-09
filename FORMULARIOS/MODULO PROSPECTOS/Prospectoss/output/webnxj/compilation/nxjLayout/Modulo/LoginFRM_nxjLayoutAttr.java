package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	LoginFRM_nxjLayoutAttr
	extends FormWidget
{

public LoginFRM_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeLogin__10 = new DivPanelWidget();
dodiv_cajagrandeLogin__10(div_cajagrandeLogin__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("header","none");
	widget.addAttribute("menu","none");
	widget.addAttribute("localized","true");
	widget.addAttribute("footer","none");
	widget.addAttribute("key_map","ENTER=DEFAULT_COMMAND;");
	widget.addAttribute("fieldheight","600");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("displayheight","600");
	widget.addAttribute("fieldwidth","1201");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displaywidth","1201");
	widget.addAttribute("title","MLogin");
	widget.setClass("form");
	widget.addAttribute("defaultcommand","logincmd");
}

private void setAttrFor_div_cajagrandeLogin__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","100px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","363px");
}

private void setAttrFor_cajagrandeLogin__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1004");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","190");
	widget.setClass("box");
	widget.addAttribute("displaytop","100");
	widget.addAttribute("displayheight","363");
	widget.addAttribute("fieldheight","363");
	widget.addAttribute("fieldwidth","1004");
	widget.addAttribute("id","cajagrandeLogin.");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_button1__30(Widget widget)
{
	widget.addStyle("left","378px");
	widget.addStyle("top","243px");
	widget.addStyle("width","206px");
	widget.addStyle("height","51px");
}

private void setAttrFor_button1__40(Widget widget)
{
	widget.addAttribute("command","logincmd");
	widget.addAttribute("field_type","button");
	widget.addAttribute("type","button");
	widget.addAttribute("name","cajagrandeLogin:button1.");
	widget.addAttribute("displaywidth","206");
	widget.addStyle("background-color","Red");
	widget.addStyle("border-width","0");
	widget.addAttribute("value","INICIARSESION");
	widget.addAttribute("displayleft","378");
	widget.addStyle("border-style","None");
	widget.setClass("button");
	widget.addAttribute("displaytop","243");
	widget.addAttribute("displayheight","51");
	widget.addAttribute("fieldheight","51");
	widget.addAttribute("fieldwidth","206");
	widget.addStyle("color","White");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("title","IniciarSesion");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaabajoLogin__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","312px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaabajoLogin__40(Widget widget)
{
	widget.addAttribute("field_weight","499");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.setClass("box");
	widget.addAttribute("displaytop","312");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addAttribute("id","cajagrandeLogin:cajaabajoLogin.");
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
	widget.addAttribute("id","cajagrandeLogin:cajaabajoLogin:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaLogin__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaLogin__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.setClass("box");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addAttribute("id","cajagrandeLogin:cajaarribaLogin.");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","522px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","SISTEMADEINFORMACIONDEPROVIVIENDA");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","522");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeLogin:cajaarribaLogin:label1.");
	widget.addAttribute("instancewidth","522");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","674px");
	widget.addStyle("top","131px");
	widget.addStyle("width","38px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","Grupo");
	widget.addAttribute("displaywidth","38");
	widget.addAttribute("displayleft","674");
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("displaytop","131");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","38");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","normal");
	widget.addAttribute("id","cajagrandeLogin:label1.");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","7px");
	widget.addStyle("top","100px");
	widget.addStyle("width","106px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","IniciarSesion");
	widget.addAttribute("displaywidth","106");
	widget.addAttribute("displayleft","7");
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("displaytop","100");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","106");
	widget.addStyle("color","Black");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id","cajagrandeLogin:label11.");
	widget.addStyle("font-size","14");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label3__30(Widget widget)
{
	widget.addStyle("left","451px");
	widget.addStyle("top","131px");
	widget.addStyle("width","48px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label3__40(Widget widget)
{
	widget.addAttribute("labeltitle","Usuario");
	widget.addAttribute("displaywidth","48");
	widget.addAttribute("displayleft","451");
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("displaytop","131");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","48");
	widget.addStyle("color","Black");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","normal");
	widget.addAttribute("id","cajagrandeLogin:label3.");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label31__30(Widget widget)
{
	widget.addStyle("left","448px");
	widget.addStyle("top","187px");
	widget.addStyle("width","86px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label31__40(Widget widget)
{
	widget.addAttribute("labeltitle","Password");
	widget.addAttribute("displaywidth","86");
	widget.addAttribute("displayleft","448");
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("displaytop","187");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","86");
	widget.addStyle("color","Black");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","normal");
	widget.addAttribute("id","cajagrandeLogin:label31.");
	widget.addStyle("font-size","12");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpr_grupo__30(Widget widget)
{
	widget.addStyle("left","674px");
	widget.addStyle("top","157px");
	widget.addStyle("width","122px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xpr_grupo__40(Widget widget)
{
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name","cajagrandeLogin:xpr_grupo.");
	widget.addAttribute("displaywidth","122");
	widget.addAttribute("displayleft","674");
	widget.addStyle("font-family","Verdana");
	widget.setClass("textfield");
	widget.addAttribute("displaytop","157");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","122");
	widget.addAttribute("size","20");
	widget.addAttribute("title","Grupoalquepertenece");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpr_password__30(Widget widget)
{
	widget.addStyle("left","420px");
	widget.addStyle("top","213px");
	widget.addStyle("width","123px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xpr_password__40(Widget widget)
{
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("password","true");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name","cajagrandeLogin:xpr_password.");
	widget.addAttribute("displaywidth","123");
	widget.addAttribute("displayleft","420");
	widget.addStyle("font-family","Verdana");
	widget.setClass("textfield");
	widget.addAttribute("displaytop","213");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","123");
	widget.addAttribute("size","20");
	widget.addAttribute("title","IngresePassword");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpr_usuario__30(Widget widget)
{
	widget.addStyle("left","420px");
	widget.addStyle("top","157px");
	widget.addStyle("width","122px");
	widget.addStyle("height","22px");
}

private void setAttrFor_xpr_usuario__40(Widget widget)
{
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name","cajagrandeLogin:xpr_usuario.");
	widget.addAttribute("displaywidth","122");
	widget.addAttribute("displayleft","420");
	widget.addStyle("font-family","Verdana");
	widget.setClass("textfield");
	widget.addAttribute("displaytop","157");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","122");
	widget.addAttribute("size","20");
	widget.addAttribute("title","IngreseUsuario");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeLogin__10(Widget div_cajagrandeLogin__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeLogin__10,"div_cajagrandeLogin_");
    setAttrFor_div_cajagrandeLogin__10(div_cajagrandeLogin__10);
    FieldSetWidget cajagrandeLogin__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeLogin__10).addComponent(cajagrandeLogin__20,"cajagrandeLogin_");
        setAttrFor_cajagrandeLogin__20(cajagrandeLogin__20);
        DivPanelWidget div_button1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_button1__30,"div_button1_");
            setAttrFor_div_button1__30(div_button1__30);
            ButtonWidget button1__40 = new ButtonWidget();
                {
                ((ContainerWidget)div_button1__30).addComponent(button1__40,"button1_");
                setAttrFor_button1__40(button1__40);
                }
            }
        DivPanelWidget div_cajaabajoLogin__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_cajaabajoLogin__30,"div_cajaabajoLogin_");
            setAttrFor_div_cajaabajoLogin__30(div_cajaabajoLogin__30);
            FieldSetWidget cajaabajoLogin__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaabajoLogin__30).addComponent(cajaabajoLogin__40,"cajaabajoLogin_");
                setAttrFor_cajaabajoLogin__40(cajaabajoLogin__40);
                DivPanelWidget div_image1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaabajoLogin__40).addComponent(div_image1__50,"div_image1_");
                    setAttrFor_div_image1__50(div_image1__50);
                    nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__60 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_image1__50).addComponent(image1__60,"image1_");
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_cajaarribaLogin__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_cajaarribaLogin__30,"div_cajaarribaLogin_");
            setAttrFor_div_cajaarribaLogin__30(div_cajaarribaLogin__30);
            FieldSetWidget cajaarribaLogin__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaLogin__30).addComponent(cajaarribaLogin__40,"cajaarribaLogin_");
                setAttrFor_cajaarribaLogin__40(cajaarribaLogin__40);
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaLogin__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            LabelWidget label1__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_label3__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_label3__30,"div_label3_");
            setAttrFor_div_label3__30(div_label3__30);
            LabelWidget label3__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label3__30).addComponent(label3__40,"label3_");
                setAttrFor_label3__40(label3__40);
                }
            }
        DivPanelWidget div_label31__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_label31__30,"div_label31_");
            setAttrFor_div_label31__30(div_label31__30);
            LabelWidget label31__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label31__30).addComponent(label31__40,"label31_");
                setAttrFor_label31__40(label31__40);
                }
            }
        DivPanelWidget div_xpr_grupo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_xpr_grupo__30,"div_xpr_grupo_");
            setAttrFor_div_xpr_grupo__30(div_xpr_grupo__30);
            TextWidget xpr_grupo__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpr_grupo__30).addComponent(xpr_grupo__40,"xpr_grupo_");
                setAttrFor_xpr_grupo__40(xpr_grupo__40);
                }
            }
        DivPanelWidget div_xpr_password__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_xpr_password__30,"div_xpr_password_");
            setAttrFor_div_xpr_password__30(div_xpr_password__30);
            TextWidget xpr_password__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpr_password__30).addComponent(xpr_password__40,"xpr_password_");
                setAttrFor_xpr_password__40(xpr_password__40);
                }
            }
        DivPanelWidget div_xpr_usuario__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeLogin__20).addComponent(div_xpr_usuario__30,"div_xpr_usuario_");
            setAttrFor_div_xpr_usuario__30(div_xpr_usuario__30);
            TextWidget xpr_usuario__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpr_usuario__30).addComponent(xpr_usuario__40,"xpr_usuario_");
                setAttrFor_xpr_usuario__40(xpr_usuario__40);
                }
            }
        }
    }
}
