package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	CClaveFRM_nxjLayoutAttr
	extends FormWidget
{

public CClaveFRM_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_cajagrandeCClaveFRM__10 = new DivPanelWidget();
dodiv_cajagrandeCClaveFRM__10(div_cajagrandeCClaveFRM__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("footer","none");
	widget.addAttribute("displayheight","427");
	widget.addAttribute("fieldwidth","1216");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("name","NXJForm");
	widget.addAttribute("fieldheight","427");
	widget.addStyle("background-color","#999999");
	widget.setClass("form");
	widget.addAttribute("displaywidth","1216");
}

private void setAttrFor_div_cajagrandeCClaveFRM__10(Widget widget)
{
	widget.addStyle("left","190px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1004px");
	widget.addStyle("height","392px");
}

private void setAttrFor_cajagrandeCClaveFRM__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.setClass("box");
	widget.addAttribute("displaywidth","1004");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","190");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayheight","392");
	widget.addAttribute("fieldheight","392");
	widget.addAttribute("fieldwidth","1004");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("border-color","transparent");
	widget.addAttribute("id","cajagrandeCClaveFRM.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_button2__30(Widget widget)
{
	widget.addStyle("left","416px");
	widget.addStyle("top","272px");
	widget.addStyle("width","138px");
	widget.addStyle("height","48px");
}

private void setAttrFor_button2__40(Widget widget)
{
	widget.addAttribute("field_type","button");
	widget.addAttribute("command","cambiarclave");
	widget.addAttribute("value","CAMBIAR CLAVE");
	widget.addAttribute("type","button");
	widget.addAttribute("fieldwidth","138");
	widget.addAttribute("displaytop","272");
	widget.addAttribute("name","cajagrandeCClaveFRM:button2.");
	widget.addAttribute("fieldheight","48");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_confirmarclave__30(Widget widget)
{
	widget.addStyle("left","709px");
	widget.addStyle("top","209px");
	widget.addStyle("width","204px");
	widget.addStyle("height","22px");
}

private void setAttrFor_confirmarclave__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","499");
	widget.addAttribute("password","true");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:confirmarclave.");
	widget.addAttribute("displaywidth","204");
	widget.addAttribute("displayleft","709");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","34");
	widget.addAttribute("fieldwidth","204");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label3111__30(Widget widget)
{
	widget.addStyle("left","709px");
	widget.addStyle("top","183px");
	widget.addStyle("width","100px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label3111__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Confirmar Clave");
	widget.addAttribute("displaywidth","100");
	widget.addAttribute("displayleft","709");
	widget.addStyle("font-size","12");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","100");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeCClaveFRM:label3111.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label311__30(Widget widget)
{
	widget.addStyle("left","419px");
	widget.addStyle("top","183px");
	widget.addStyle("width","83px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label311__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Nueva Clave ");
	widget.addAttribute("displaywidth","83");
	widget.addAttribute("displayleft","419");
	widget.addStyle("font-size","12");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","83");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeCClaveFRM:label311.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_nuevaclave__30(Widget widget)
{
	widget.addStyle("left","419px");
	widget.addStyle("top","209px");
	widget.addStyle("width","204px");
	widget.addStyle("height","22px");
}

private void setAttrFor_nuevaclave__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("password","true");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:nuevaclave.");
	widget.addAttribute("displaywidth","204");
	widget.addAttribute("displayleft","419");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","34");
	widget.addAttribute("fieldwidth","204");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label31__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","183px");
	widget.addStyle("width","77px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label31__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Clave Actual");
	widget.addAttribute("displaywidth","77");
	widget.addAttribute("displayleft","112");
	widget.addStyle("font-size","12");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","77");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeCClaveFRM:label31.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_claveactual__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","209px");
	widget.addStyle("width","204px");
	widget.addStyle("height","22px");
}

private void setAttrFor_claveactual__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("password","true");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:claveactual.");
	widget.addAttribute("displaywidth","204");
	widget.addAttribute("displayleft","112");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","34");
	widget.addAttribute("fieldwidth","204");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label3__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","127px");
	widget.addStyle("width","57px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label3__40(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","Usuario");
	widget.addAttribute("displaywidth","57");
	widget.addAttribute("displayleft","112");
	widget.addStyle("font-size","12");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","57");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeCClaveFRM:label3.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_usuario__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","153px");
	widget.addStyle("width","204px");
	widget.addStyle("height","22px");
}

private void setAttrFor_usuario__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:usuario.");
	widget.addAttribute("displaywidth","204");
	widget.addAttribute("displayleft","112");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","34");
	widget.addAttribute("fieldwidth","204");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaCClave__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaCClave__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.addAttribute("id","cajagrandeCClaveFRM:cajaarribaCClave.");
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
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","99");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:cajaarribaCClave:actualempresa.");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","32");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("type","text");
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
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","199");
	widget.setClass("textfield");
	widget.addAttribute("name","cajagrandeCClaveFRM:cajaarribaCClave:actualusuario.");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","18");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","242px");
	widget.addStyle("top","15px");
	widget.addStyle("width","323px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","CAMBIAR CLAVE DE ACCESO");
	widget.addAttribute("displaywidth","323");
	widget.addAttribute("displayleft","242");
	widget.addAttribute("displaytop","15");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","323");
	widget.addStyle("text-align","left");
	widget.addAttribute("instancewidth","323");
	widget.addAttribute("id","cajagrandeCClaveFRM:cajaarribaCClave:label1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label211__50(Widget widget)
{
	widget.addStyle("left","778px");
	widget.addStyle("top","65px");
	widget.addStyle("width","46px");
	widget.addStyle("height","21px");
}

private void setAttrFor_label211__60(Widget widget)
{
	widget.setClass("label");
	widget.addAttribute("labeltitle","top1024");
	widget.addAttribute("displaywidth","46");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","46");
	widget.addStyle("text-align","left");
	widget.addAttribute("id","cajagrandeCClaveFRM:cajaarribaCClave:label211.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaabajoCClave__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","341px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaabajoCClave__40(Widget widget)
{
	widget.addAttribute("field_weight","599");
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("displaytop","341");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.addAttribute("id","cajagrandeCClaveFRM:cajaabajoCClave.");
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
	widget.addAttribute("id","cajagrandeCClaveFRM:cajaabajoCClave:image1.");
	widget.addAttribute("height","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("width","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","194px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("labeltitle","Cambiar Clave de Acceso");
	widget.addAttribute("displaywidth","194");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-size","14");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","194");
	widget.addStyle("font-weight","bold");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.addAttribute("id","cajagrandeCClaveFRM:label11.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_cajagrandeCClaveFRM__10(Widget div_cajagrandeCClaveFRM__10)
    {
    ((ContainerWidget)this).addComponent(div_cajagrandeCClaveFRM__10,"div_cajagrandeCClaveFRM_");
    setAttrFor_div_cajagrandeCClaveFRM__10(div_cajagrandeCClaveFRM__10);
    FieldSetWidget cajagrandeCClaveFRM__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajagrandeCClaveFRM__10).addComponent(cajagrandeCClaveFRM__20,"cajagrandeCClaveFRM_");
        setAttrFor_cajagrandeCClaveFRM__20(cajagrandeCClaveFRM__20);
        DivPanelWidget div_button2__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_button2__30,"div_button2_");
            setAttrFor_div_button2__30(div_button2__30);
            nxjLayout.ItemsForm.Boton_nxjLayoutAttr button2__40 = new nxjLayout.ItemsForm.Boton_nxjLayoutAttr();
                {
                ((ContainerWidget)div_button2__30).addComponent(button2__40,"button2_");
                setAttrFor_button2__40(button2__40);
                }
            }
        DivPanelWidget div_confirmarclave__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_confirmarclave__30,"div_confirmarclave_");
            setAttrFor_div_confirmarclave__30(div_confirmarclave__30);
            TextWidget confirmarclave__40 = new TextWidget();
                {
                ((ContainerWidget)div_confirmarclave__30).addComponent(confirmarclave__40,"confirmarclave_");
                setAttrFor_confirmarclave__40(confirmarclave__40);
                }
            }
        DivPanelWidget div_label3111__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_label3111__30,"div_label3111_");
            setAttrFor_div_label3111__30(div_label3111__30);
            LabelWidget label3111__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label3111__30).addComponent(label3111__40,"label3111_");
                setAttrFor_label3111__40(label3111__40);
                }
            }
        DivPanelWidget div_label311__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_label311__30,"div_label311_");
            setAttrFor_div_label311__30(div_label311__30);
            LabelWidget label311__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label311__30).addComponent(label311__40,"label311_");
                setAttrFor_label311__40(label311__40);
                }
            }
        DivPanelWidget div_nuevaclave__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_nuevaclave__30,"div_nuevaclave_");
            setAttrFor_div_nuevaclave__30(div_nuevaclave__30);
            TextWidget nuevaclave__40 = new TextWidget();
                {
                ((ContainerWidget)div_nuevaclave__30).addComponent(nuevaclave__40,"nuevaclave_");
                setAttrFor_nuevaclave__40(nuevaclave__40);
                }
            }
        DivPanelWidget div_label31__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_label31__30,"div_label31_");
            setAttrFor_div_label31__30(div_label31__30);
            LabelWidget label31__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label31__30).addComponent(label31__40,"label31_");
                setAttrFor_label31__40(label31__40);
                }
            }
        DivPanelWidget div_claveactual__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_claveactual__30,"div_claveactual_");
            setAttrFor_div_claveactual__30(div_claveactual__30);
            TextWidget claveactual__40 = new TextWidget();
                {
                ((ContainerWidget)div_claveactual__30).addComponent(claveactual__40,"claveactual_");
                setAttrFor_claveactual__40(claveactual__40);
                }
            }
        DivPanelWidget div_label3__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_label3__30,"div_label3_");
            setAttrFor_div_label3__30(div_label3__30);
            LabelWidget label3__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label3__30).addComponent(label3__40,"label3_");
                setAttrFor_label3__40(label3__40);
                }
            }
        DivPanelWidget div_usuario__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_usuario__30,"div_usuario_");
            setAttrFor_div_usuario__30(div_usuario__30);
            TextWidget usuario__40 = new TextWidget();
                {
                ((ContainerWidget)div_usuario__30).addComponent(usuario__40,"usuario_");
                setAttrFor_usuario__40(usuario__40);
                }
            }
        DivPanelWidget div_cajaarribaCClave__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_cajaarribaCClave__30,"div_cajaarribaCClave_");
            setAttrFor_div_cajaarribaCClave__30(div_cajaarribaCClave__30);
            FieldSetWidget cajaarribaCClave__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaCClave__30).addComponent(cajaarribaCClave__40,"cajaarribaCClave_");
                setAttrFor_cajaarribaCClave__40(cajaarribaCClave__40);
                DivPanelWidget div_actualempresa__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCClave__40).addComponent(div_actualempresa__50,"div_actualempresa_");
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    TextWidget actualempresa__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualempresa__50).addComponent(actualempresa__60,"actualempresa_");
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                DivPanelWidget div_actualusuario__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCClave__40).addComponent(div_actualusuario__50,"div_actualusuario_");
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    TextWidget actualusuario__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualusuario__50).addComponent(actualusuario__60,"actualusuario_");
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCClave__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__60 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaCClave__40).addComponent(div_label211__50,"div_label211_");
                    setAttrFor_div_label211__50(div_label211__50);
                    LabelWidget label211__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label211__50).addComponent(label211__60,"label211_");
                        setAttrFor_label211__60(label211__60);
                        }
                    }
                }
            }
        DivPanelWidget div_cajaabajoCClave__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_cajaabajoCClave__30,"div_cajaabajoCClave_");
            setAttrFor_div_cajaabajoCClave__30(div_cajaabajoCClave__30);
            FieldSetWidget cajaabajoCClave__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaabajoCClave__30).addComponent(cajaabajoCClave__40,"cajaabajoCClave_");
                setAttrFor_cajaabajoCClave__40(cajaabajoCClave__40);
                DivPanelWidget div_image1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaabajoCClave__40).addComponent(div_image1__50,"div_image1_");
                    setAttrFor_div_image1__50(div_image1__50);
                    nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__60 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_image1__50).addComponent(image1__60,"image1_");
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajagrandeCClaveFRM__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        }
    }
}
