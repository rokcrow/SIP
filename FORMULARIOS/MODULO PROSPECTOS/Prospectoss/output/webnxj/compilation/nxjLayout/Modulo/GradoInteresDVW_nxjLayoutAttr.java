package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	GradoInteresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public GradoInteresDVW_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_RepeatingArea1__10 = new DivPanelWidget();
dodiv_RepeatingArea1__10(div_RepeatingArea1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_cajaarribaGInteres__10 = new DivPanelWidget();
dodiv_cajaarribaGInteres__10(div_cajaarribaGInteres__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1005");
	widget.setClass("data_view");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id",".top.");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaytop","25");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displayheight","574");
	widget.addAttribute("fieldheight","574");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","150px");
	widget.addStyle("top","165px");
	widget.addStyle("width","823px");
	widget.addStyle("height","285px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","12");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("list_columns",".top:xpc_codigo.0:55;.top:xpc_clase.55:129;.top:xpc_nombre.184:620");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("displaywidth","823");
	widget.setClass("repeating_area");
	widget.addAttribute("displayleft","150");
	widget.addAttribute("horizontal_scroll_width","100%");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addAttribute("displaytop","165");
	widget.addAttribute("disable_wrap","false");
	widget.addAttribute("displayheight","285");
	widget.addAttribute("fieldheight","285");
	widget.addAttribute("fieldwidth","823");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_codigo__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_codigo__40(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("title","xpc_codigo");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","55");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","162");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("name",".top:xpc_codigo.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","9");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_clase__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_clase__40(Widget widget)
{
	widget.addAttribute("options","Primer Contacto=P;Seguimiento=S");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("title","xpc_clase");
	widget.addAttribute("displaywidth","129");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","137");
	widget.addAttribute("headertitle","Clase");
	widget.addAttribute("name",".top:xpc_clase.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","1");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","129");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_nombre__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_nombre__40(Widget widget)
{
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("title","xpc_nombre");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","620");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","450");
	widget.addAttribute("headertitle","Nombre");
	widget.addAttribute("name",".top:xpc_nombre.");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("size","103");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","620");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","519px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","519");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_image1__30(Widget widget)
{
	widget.addStyle("left","416px");
	widget.addStyle("top","2px");
	widget.addStyle("width","164px");
	widget.addStyle("height","46px");
}

private void setAttrFor_image1__40(Widget widget)
{
	widget.addAttribute("id",".top:box11:image1.");
	widget.addAttribute("displayheight","46");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaGInteres__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaGInteres__20(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("displaywidth","996");
	widget.setClass("box");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:cajaarribaGInteres.");
	widget.addAttribute("displaytop","2");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualempresa__30(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualempresa__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("name",".top:cajaarribaGInteres:actualempresa.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","32");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_actualusuario__30(Widget widget)
{
	widget.addStyle("left","800px");
	widget.addStyle("top","14px");
	widget.addStyle("width","110px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualusuario__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.setClass("textfield");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("name",".top:cajaarribaGInteres:actualusuario.");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("size","18");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","522px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("id",".top:cajaarribaGInteres:label1.");
	widget.addAttribute("labeltitle","GRADODEINTERES1");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("displaytop","14");
	widget.addStyle("text-align","left");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
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
	widget.addAttribute("labeltitle","top1024");
	widget.addAttribute("displaywidth","55");
	widget.setClass("label");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id",".top:cajaarribaGInteres:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","162px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addAttribute("labeltitle","GradodeInteres2");
	widget.addAttribute("displaywidth","162");
	widget.setClass("label");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displayleft","20");
	widget.addAttribute("id",".top:label11.");
	widget.addAttribute("headertitle","Column1");
	widget.addAttribute("displaytop","96");
	widget.addStyle("color","Black");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","162");
	widget.addStyle("text-align","left");
	widget.addStyle("font-size","14");
	widget.addStyle("overflow","hidden");
}
private void dodiv_RepeatingArea1__10(Widget div_RepeatingArea1__10)
    {
    ((ContainerWidget)this).addComponent(div_RepeatingArea1__10,"div_RepeatingArea1_");
    setAttrFor_div_RepeatingArea1__10(div_RepeatingArea1__10);
    RepeatingAreaWidget RepeatingArea1__20 = new RepeatingAreaWidget();
        {
        ((ContainerWidget)div_RepeatingArea1__10).addComponent(RepeatingArea1__20,"RepeatingArea1_");
        setAttrFor_RepeatingArea1__20(RepeatingArea1__20);
        RepeatingGridWidget div_FXGRID_30 = new RepeatingGridWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_FXGRID_30,"div_FXGRID");
        DivPanelWidget div_xpc_codigo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_codigo__30,"div_xpc_codigo_");
            setAttrFor_div_xpc_codigo__30(div_xpc_codigo__30);
            TextWidget xpc_codigo__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpc_codigo__30).addComponent(xpc_codigo__40,"xpc_codigo_");
                setAttrFor_xpc_codigo__40(xpc_codigo__40);
                }
            }
        DivPanelWidget div_xpc_clase__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_clase__30,"div_xpc_clase_");
            setAttrFor_div_xpc_clase__30(div_xpc_clase__30);
            ListWidget xpc_clase__40 = new ListWidget();
                {
                ((ContainerWidget)div_xpc_clase__30).addComponent(xpc_clase__40,"xpc_clase_");
                setAttrFor_xpc_clase__40(xpc_clase__40);
                }
            }
        DivPanelWidget div_xpc_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_nombre__30,"div_xpc_nombre_");
            setAttrFor_div_xpc_nombre__30(div_xpc_nombre__30);
            TextWidget xpc_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpc_nombre__30).addComponent(xpc_nombre__40,"xpc_nombre_");
                setAttrFor_xpc_nombre__40(xpc_nombre__40);
                }
            }
            div_FXGRID_30.addAttribute("id","GradoInteresDVW_FXGRID");
            div_FXGRID_30.addStyle("top","0");
            div_FXGRID_30.addStyle("left","0");
            div_FXGRID_30.addStyle("width","823");
            div_FXGRID_30.addStyle("height","285");
            div_FXGRID_30.addStyle("overflow-x","hidden");
            div_FXGRID_30.addStyle("overflow-y","hidden");
            div_FXGRID_30.addAttribute("jsinclude","NXJGrid.js");
            div_FXGRID_30.addAttribute("jslinks","NXJGrid.css");
            div_FXGRID_30.addAttribute("jsinit","var combo1 = ['Primer Contacto', 'Seguimiento'];    var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo', 	'1', 	'1', 	'55', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_codigo', '.top:xpc_codigo.', '', ''), new NXJGridColumn( 	'Clase', 	'3', 	'1', 	'129', 	'', 	combo1, 	'Primer Contacto', 	'textfield', 	true, 	true, 	'xpc_clase', '.top:xpc_clase.', '', ''), new NXJGridColumn( 	'Nombre', 	'1', 	'1', 	'620', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_nombre', '.top:xpc_nombre.', '', '') ]; ; if (!window.namesToComponents['GradoInteresDVW_FXGRID'])     {     window.namesToComponents['GradoInteresDVW_FXGRID'] = new NXJGrid('GradoInteresDVW_FXGRID', _top_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', 'D,L,M,M,J,V,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
            }
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
private void dodiv_cajaarribaGInteres__10(Widget div_cajaarribaGInteres__10)
    {
    ((ContainerWidget)this).addComponent(div_cajaarribaGInteres__10,"div_cajaarribaGInteres_");
    setAttrFor_div_cajaarribaGInteres__10(div_cajaarribaGInteres__10);
    FieldSetWidget cajaarribaGInteres__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajaarribaGInteres__10).addComponent(cajaarribaGInteres__20,"cajaarribaGInteres_");
        setAttrFor_cajaarribaGInteres__20(cajaarribaGInteres__20);
        DivPanelWidget div_actualempresa__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaGInteres__20).addComponent(div_actualempresa__30,"div_actualempresa_");
            setAttrFor_div_actualempresa__30(div_actualempresa__30);
            TextWidget actualempresa__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualempresa__30).addComponent(actualempresa__40,"actualempresa_");
                setAttrFor_actualempresa__40(actualempresa__40);
                }
            }
        DivPanelWidget div_actualusuario__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaGInteres__20).addComponent(div_actualusuario__30,"div_actualusuario_");
            setAttrFor_div_actualusuario__30(div_actualusuario__30);
            TextWidget actualusuario__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualusuario__30).addComponent(actualusuario__40,"actualusuario_");
                setAttrFor_actualusuario__40(actualusuario__40);
                }
            }
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaGInteres__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__40 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label211__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaGInteres__20).addComponent(div_label211__30,"div_label211_");
            setAttrFor_div_label211__30(div_label211__30);
            LabelWidget label211__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label211__30).addComponent(label211__40,"label211_");
                setAttrFor_label211__40(label211__40);
                }
            }
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
