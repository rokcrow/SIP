package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	RepProspectosFRM_nxjLayoutAttr
	extends FormWidget
{

public RepProspectosFRM_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_view1__10 = new DivPanelWidget();
dodiv_view1__10(div_view1__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("localized","true");
	widget.addAttribute("footer","none");
	widget.addAttribute("title","ReportesProspectos");
	widget.addAttribute("displaywidth","1198");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displayheight","413");
	widget.addAttribute("fieldheight","413");
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
	widget.addStyle("height","380px");
}

private void setAttrFor_view1__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("parametros_form1_1369767389242_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767438614-labeltitle","CodigoProyecto");
	widget.addAttribute("id","view1.");
	widget.addAttribute("parametros_form1_1369767389242_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767439751-labeltitle","CodigoVendedor");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayleft","190");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_TodosLoProy__30(Widget widget)
{
}

private void setAttrFor_TodosLoProy__40(Widget widget)
{
	widget.addAttribute("type","checkbox");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)TodosLoProy.");
	widget.addAttribute("name","view1:TodosLoProy.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_TodosLosVend__30(Widget widget)
{
}

private void setAttrFor_TodosLosVend__40(Widget widget)
{
	widget.addAttribute("type","checkbox");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)TodosLosVend.");
	widget.addAttribute("name","view1:TodosLosVend.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)box11.");
	widget.addAttribute("id","view1:box11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__50(Widget widget)
{
}

private void setAttrFor_image1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)box11:(Modulo.RepProspectosDVW)image1.");
	widget.addAttribute("id","view1:box11:image1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaRProspectos__30(Widget widget)
{
}

private void setAttrFor_cajaarribaRProspectos__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)cajaarribaRProspectos.");
	widget.addAttribute("id","view1:cajaarribaRProspectos.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualempresa__50(Widget widget)
{
}

private void setAttrFor_actualempresa__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)cajaarribaRProspectos:(Modulo.RepProspectosDVW)actualempresa.");
	widget.addAttribute("name","view1:cajaarribaRProspectos:actualempresa.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualusuario__50(Widget widget)
{
}

private void setAttrFor_actualusuario__60(Widget widget)
{
	widget.addAttribute("type","text");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)cajaarribaRProspectos:(Modulo.RepProspectosDVW)actualusuario.");
	widget.addAttribute("name","view1:cajaarribaRProspectos:actualusuario.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)cajaarribaRProspectos:(Modulo.RepProspectosDVW)label1.");
	widget.addAttribute("id","view1:cajaarribaRProspectos:label1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_ejecutarbtn__30(Widget widget)
{
}

private void setAttrFor_ejecutarbtn__40(Widget widget)
{
	widget.addAttribute("type","button");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)ejecutarbtn.");
	widget.addAttribute("name","view1:ejecutarbtn.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_fecha1__30(Widget widget)
{
}

private void setAttrFor_fecha1__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)fecha1.");
	widget.addAttribute("id","view1:fecha1.");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJDatePicker.js");
	widget.addAttribute("jsinit","window.namesToComponents['view1:Modulo.RepProspectosDVW;fecha1.'] = new NXJDatePicker('view1:Modulo.RepProspectosDVW;fecha1.', 'textfield', ' ime-mode: disabled', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/', '', '', 'D,L,M,M,J,V,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'dd/MM/yyyy');");
	widget.addStyle("width","140");
	widget.addStyle("height","22");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("foreground-color","Black");
}

private void setAttrFor_div_fecha2__30(Widget widget)
{
}

private void setAttrFor_fecha2__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)fecha2.");
	widget.addAttribute("id","view1:fecha2.");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJDatePicker.js");
	widget.addAttribute("jsinit","window.namesToComponents['view1:Modulo.RepProspectosDVW;fecha2.'] = new NXJDatePicker('view1:Modulo.RepProspectosDVW;fecha2.', 'textfield', ' ime-mode: disabled', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/', '', '', 'D,L,M,M,J,V,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'dd/MM/yyyy');");
	widget.addStyle("width","140");
	widget.addStyle("height","22");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("foreground-color","Black");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","127px");
	widget.addStyle("width","103px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label1.");
	widget.addAttribute("id","view1:label1.");
	widget.addAttribute("labeltitle","CodigoProyecto");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label11.");
	widget.addAttribute("id","view1:label11.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label111__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","183px");
	widget.addStyle("width","109px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label111__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label111.");
	widget.addAttribute("id","view1:label111.");
	widget.addAttribute("labeltitle","CodigoVendedor");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label12__30(Widget widget)
{
}

private void setAttrFor_label12__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label12.");
	widget.addAttribute("id","view1:label12.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label13__30(Widget widget)
{
}

private void setAttrFor_label13__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label13.");
	widget.addAttribute("id","view1:label13.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label14__30(Widget widget)
{
}

private void setAttrFor_label14__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label14.");
	widget.addAttribute("id","view1:label14.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label141__30(Widget widget)
{
}

private void setAttrFor_label141__40(Widget widget)
{
	widget.addAttribute("_id","view1:(Modulo.RepProspectosDVW)label141.");
	widget.addAttribute("id","view1:label141.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_proyecto__30(Widget widget)
{
}

private void setAttrFor_proyecto__40(Widget widget)
{
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)proyecto.");
	widget.addAttribute("name","view1:proyecto.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_regresarbtn__30(Widget widget)
{
}

private void setAttrFor_regresarbtn__40(Widget widget)
{
	widget.addAttribute("type","button");
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)regresarbtn.");
	widget.addAttribute("name","view1:regresarbtn.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vendedor__30(Widget widget)
{
}

private void setAttrFor_vendedor__40(Widget widget)
{
	widget.addAttribute("_name","view1:(Modulo.RepProspectosDVW)vendedor.");
	widget.addAttribute("name","view1:vendedor.");
	widget.addStyle("overflow","hidden");
}
private void dodiv_view1__10(Widget div_view1__10)
    {
    ((ContainerWidget)this).addComponent(div_view1__10,"div_view1_");
    setAttrFor_div_view1__10(div_view1__10);
    nxjLayout.Modulo.RepProspectosDVW_nxjLayoutAttr view1__20 = new nxjLayout.Modulo.RepProspectosDVW_nxjLayoutAttr();
        {
        ((ContainerWidget)div_view1__10).addComponent(view1__20,"view1_");
        setAttrFor_view1__20(view1__20);
        Widget div_TodosLoProy__30 = ((ContainerWidget)view1__20).getComponent("div_TodosLoProy_");
        if (div_TodosLoProy__30 != null)
            {
            setAttrFor_div_TodosLoProy__30(div_TodosLoProy__30);
            Widget TodosLoProy__40 = ((ContainerWidget)div_TodosLoProy__30).getComponent("TodosLoProy_");
            if (TodosLoProy__40 != null)
                {
                setAttrFor_TodosLoProy__40(TodosLoProy__40);
                }
            }
        Widget div_TodosLosVend__30 = ((ContainerWidget)view1__20).getComponent("div_TodosLosVend_");
        if (div_TodosLosVend__30 != null)
            {
            setAttrFor_div_TodosLosVend__30(div_TodosLosVend__30);
            Widget TodosLosVend__40 = ((ContainerWidget)div_TodosLosVend__30).getComponent("TodosLosVend_");
            if (TodosLosVend__40 != null)
                {
                setAttrFor_TodosLosVend__40(TodosLosVend__40);
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
        Widget div_cajaarribaRProspectos__30 = ((ContainerWidget)view1__20).getComponent("div_cajaarribaRProspectos_");
        if (div_cajaarribaRProspectos__30 != null)
            {
            setAttrFor_div_cajaarribaRProspectos__30(div_cajaarribaRProspectos__30);
            Widget cajaarribaRProspectos__40 = ((ContainerWidget)div_cajaarribaRProspectos__30).getComponent("cajaarribaRProspectos_");
            if (cajaarribaRProspectos__40 != null)
                {
                setAttrFor_cajaarribaRProspectos__40(cajaarribaRProspectos__40);
                Widget div_actualempresa__50 = ((ContainerWidget)cajaarribaRProspectos__40).getComponent("div_actualempresa_");
                if (div_actualempresa__50 != null)
                    {
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    Widget actualempresa__60 = ((ContainerWidget)div_actualempresa__50).getComponent("actualempresa_");
                    if (actualempresa__60 != null)
                        {
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                Widget div_actualusuario__50 = ((ContainerWidget)cajaarribaRProspectos__40).getComponent("div_actualusuario_");
                if (div_actualusuario__50 != null)
                    {
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    Widget actualusuario__60 = ((ContainerWidget)div_actualusuario__50).getComponent("actualusuario_");
                    if (actualusuario__60 != null)
                        {
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                Widget div_label1__50 = ((ContainerWidget)cajaarribaRProspectos__40).getComponent("div_label1_");
                if (div_label1__50 != null)
                    {
                    setAttrFor_div_label1__50(div_label1__50);
                    Widget label1__60 = ((ContainerWidget)div_label1__50).getComponent("label1_");
                    if (label1__60 != null)
                        {
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                }
            }
        Widget div_ejecutarbtn__30 = ((ContainerWidget)view1__20).getComponent("div_ejecutarbtn_");
        if (div_ejecutarbtn__30 != null)
            {
            setAttrFor_div_ejecutarbtn__30(div_ejecutarbtn__30);
            Widget ejecutarbtn__40 = ((ContainerWidget)div_ejecutarbtn__30).getComponent("ejecutarbtn_");
            if (ejecutarbtn__40 != null)
                {
                setAttrFor_ejecutarbtn__40(ejecutarbtn__40);
                }
            }
        Widget div_fecha1__30 = ((ContainerWidget)view1__20).getComponent("div_fecha1_");
        if (div_fecha1__30 != null)
            {
            setAttrFor_div_fecha1__30(div_fecha1__30);
            Widget fecha1__40 = ((ContainerWidget)div_fecha1__30).getComponent("fecha1_");
            if (fecha1__40 != null)
                {
                setAttrFor_fecha1__40(fecha1__40);
                }
            }
        Widget div_fecha2__30 = ((ContainerWidget)view1__20).getComponent("div_fecha2_");
        if (div_fecha2__30 != null)
            {
            setAttrFor_div_fecha2__30(div_fecha2__30);
            Widget fecha2__40 = ((ContainerWidget)div_fecha2__30).getComponent("fecha2_");
            if (fecha2__40 != null)
                {
                setAttrFor_fecha2__40(fecha2__40);
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
        Widget div_label111__30 = ((ContainerWidget)view1__20).getComponent("div_label111_");
        if (div_label111__30 != null)
            {
            setAttrFor_div_label111__30(div_label111__30);
            Widget label111__40 = ((ContainerWidget)div_label111__30).getComponent("label111_");
            if (label111__40 != null)
                {
                setAttrFor_label111__40(label111__40);
                }
            }
        Widget div_label12__30 = ((ContainerWidget)view1__20).getComponent("div_label12_");
        if (div_label12__30 != null)
            {
            setAttrFor_div_label12__30(div_label12__30);
            Widget label12__40 = ((ContainerWidget)div_label12__30).getComponent("label12_");
            if (label12__40 != null)
                {
                setAttrFor_label12__40(label12__40);
                }
            }
        Widget div_label13__30 = ((ContainerWidget)view1__20).getComponent("div_label13_");
        if (div_label13__30 != null)
            {
            setAttrFor_div_label13__30(div_label13__30);
            Widget label13__40 = ((ContainerWidget)div_label13__30).getComponent("label13_");
            if (label13__40 != null)
                {
                setAttrFor_label13__40(label13__40);
                }
            }
        Widget div_label14__30 = ((ContainerWidget)view1__20).getComponent("div_label14_");
        if (div_label14__30 != null)
            {
            setAttrFor_div_label14__30(div_label14__30);
            Widget label14__40 = ((ContainerWidget)div_label14__30).getComponent("label14_");
            if (label14__40 != null)
                {
                setAttrFor_label14__40(label14__40);
                }
            }
        Widget div_label141__30 = ((ContainerWidget)view1__20).getComponent("div_label141_");
        if (div_label141__30 != null)
            {
            setAttrFor_div_label141__30(div_label141__30);
            Widget label141__40 = ((ContainerWidget)div_label141__30).getComponent("label141_");
            if (label141__40 != null)
                {
                setAttrFor_label141__40(label141__40);
                }
            }
        Widget div_proyecto__30 = ((ContainerWidget)view1__20).getComponent("div_proyecto_");
        if (div_proyecto__30 != null)
            {
            setAttrFor_div_proyecto__30(div_proyecto__30);
            Widget proyecto__40 = ((ContainerWidget)div_proyecto__30).getComponent("proyecto_");
            if (proyecto__40 != null)
                {
                setAttrFor_proyecto__40(proyecto__40);
                }
            }
        Widget div_regresarbtn__30 = ((ContainerWidget)view1__20).getComponent("div_regresarbtn_");
        if (div_regresarbtn__30 != null)
            {
            setAttrFor_div_regresarbtn__30(div_regresarbtn__30);
            Widget regresarbtn__40 = ((ContainerWidget)div_regresarbtn__30).getComponent("regresarbtn_");
            if (regresarbtn__40 != null)
                {
                setAttrFor_regresarbtn__40(regresarbtn__40);
                }
            }
        Widget div_vendedor__30 = ((ContainerWidget)view1__20).getComponent("div_vendedor_");
        if (div_vendedor__30 != null)
            {
            setAttrFor_div_vendedor__30(div_vendedor__30);
            Widget vendedor__40 = ((ContainerWidget)div_vendedor__30).getComponent("vendedor_");
            if (vendedor__40 != null)
                {
                setAttrFor_vendedor__40(vendedor__40);
                }
            }
        }
    }
}
