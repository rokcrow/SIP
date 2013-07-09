package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	ProyectosDVW_nxjLayoutAttr
	extends DataViewWidget
{

public ProyectosDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_RepeatingArea1__10 = new DivPanelWidget();
dodiv_RepeatingArea1__10(div_RepeatingArea1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_cajaarribaPVenta__10 = new DivPanelWidget();
dodiv_cajaarribaPVenta__10(div_cajaarribaPVenta__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaywidth","1005");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.setClass("data_view");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","566");
	widget.addAttribute("fieldheight","566");
	widget.addAttribute("fieldwidth","1005");
	widget.addAttribute("id",".top.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","165px");
	widget.addStyle("width","718px");
	widget.addStyle("height","277px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("list_columns",".top:vpy_empresa.0:158;.top:vpy_codigo.158:172;.top:vpy_nombre.330:259;.top:vpy_estado.589:110");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("occurrences","11");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("displaywidth","718");
	widget.addAttribute("displayleft","112");
	widget.setClass("repeating_area");
	widget.addAttribute("displaytop","165");
	widget.addAttribute("displayheight","277");
	widget.addAttribute("fieldheight","277");
	widget.addAttribute("fieldwidth","718");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_empresa__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_empresa__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name",".top:vpy_empresa.");
	widget.addAttribute("displaywidth","158");
	widget.addAttribute("displayleft","0");
	widget.setClass("textfield");
	widget.addAttribute("headertitle","Codigo de Empresa");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","158");
	widget.addAttribute("size","26");
	widget.addAttribute("title","vpy_empresa");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_codigo__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_codigo__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name",".top:vpy_codigo.");
	widget.addAttribute("displaywidth","172");
	widget.addAttribute("displayleft","104");
	widget.setClass("textfield");
	widget.addAttribute("headertitle","Codigo de Proyecto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","172");
	widget.addAttribute("size","28");
	widget.addAttribute("title","vpy_codigo");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_nombre__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_nombre__40(Widget widget)
{
	widget.addAttribute("auto_complete","true");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name",".top:vpy_nombre.");
	widget.addAttribute("displaywidth","259");
	widget.addAttribute("displayleft","234");
	widget.setClass("textfield");
	widget.addAttribute("headertitle","Nombre de Proyecto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","259");
	widget.addAttribute("size","43");
	widget.addAttribute("title","vpy_nombre");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_estado__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_estado__40(Widget widget)
{
	widget.addAttribute("options","Temporal=T;Real=R");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("name",".top:vpy_estado.");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","351");
	widget.setClass("textfield");
	widget.addAttribute("headertitle","Estado");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("size","1");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_navigationbar1__30(Widget widget)
{
	widget.addAttribute("navbarcontainer","true");
	widget.addStyle("left","20px");
	widget.addStyle("top","243px");
	widget.addStyle("width","340px");
	widget.addStyle("height","25px");
}

private void setAttrFor_navigationbar1__40(Widget widget)
{
	widget.addAttribute("displaywidth","340");
	widget.addAttribute("displayleft","20");
	widget.addAttribute("navigationtype","pages");
	widget.setClass("navigation");
	widget.addAttribute("linkinrement","1");
	widget.addAttribute("displaytop","243");
	widget.addAttribute("displayheight","25");
	widget.addAttribute("fieldheight","25");
	widget.addAttribute("fieldwidth","340");
	widget.addAttribute("id",".top:navigationbar1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","511px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.setClass("box");
	widget.addAttribute("displaytop","511");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addAttribute("id",".top:box11.");
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

private void setAttrFor_div_cajaarribaPVenta__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaPVenta__20(Widget widget)
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
	widget.addAttribute("id",".top:cajaarribaPVenta.");
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
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name",".top:cajaarribaPVenta:actualempresa.");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.setClass("textfield");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("size","32");
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
	widget.addAttribute("immediate","false");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("name",".top:cajaarribaPVenta:actualusuario.");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.setClass("textfield");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("size","18");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","241px");
	widget.addStyle("top","14px");
	widget.addStyle("width","248px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","PROYECTOS EN VENTA");
	widget.addAttribute("displaywidth","248");
	widget.addAttribute("displayleft","241");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","248");
	widget.addStyle("text-align","left");
	widget.addAttribute("id",".top:cajaarribaPVenta:label1.");
	widget.addAttribute("instancewidth","248");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","149px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addAttribute("labeltitle","Proyectos en venta");
	widget.addAttribute("displaywidth","149");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","149");
	widget.addStyle("color","Black");
	widget.addStyle("text-align","left");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:label11.");
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
        DivPanelWidget div_vpy_empresa__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vpy_empresa__30,"div_vpy_empresa_");
            setAttrFor_div_vpy_empresa__30(div_vpy_empresa__30);
            TextWidget vpy_empresa__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_empresa__30).addComponent(vpy_empresa__40,"vpy_empresa_");
                setAttrFor_vpy_empresa__40(vpy_empresa__40);
                }
            }
        DivPanelWidget div_vpy_codigo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vpy_codigo__30,"div_vpy_codigo_");
            setAttrFor_div_vpy_codigo__30(div_vpy_codigo__30);
            TextWidget vpy_codigo__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_codigo__30).addComponent(vpy_codigo__40,"vpy_codigo_");
                setAttrFor_vpy_codigo__40(vpy_codigo__40);
                }
            }
        DivPanelWidget div_vpy_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vpy_nombre__30,"div_vpy_nombre_");
            setAttrFor_div_vpy_nombre__30(div_vpy_nombre__30);
            TextWidget vpy_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_nombre__30).addComponent(vpy_nombre__40,"vpy_nombre_");
                setAttrFor_vpy_nombre__40(vpy_nombre__40);
                }
            }
        DivPanelWidget div_vpy_estado__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vpy_estado__30,"div_vpy_estado_");
            setAttrFor_div_vpy_estado__30(div_vpy_estado__30);
            ListWidget vpy_estado__40 = new ListWidget();
                {
                ((ContainerWidget)div_vpy_estado__30).addComponent(vpy_estado__40,"vpy_estado_");
                setAttrFor_vpy_estado__40(vpy_estado__40);
                }
            }
            div_FXGRID_30.addAttribute("id","ProyectosDVW_FXGRID");
            div_FXGRID_30.addStyle("top","0");
            div_FXGRID_30.addStyle("left","0");
            div_FXGRID_30.addStyle("width","718");
            div_FXGRID_30.addStyle("height","243");
            div_FXGRID_30.addStyle("overflow-x","hidden");
            div_FXGRID_30.addStyle("overflow-y","hidden");
            div_FXGRID_30.addAttribute("jsinclude","NXJGrid.js");
            div_FXGRID_30.addAttribute("jslinks","NXJGrid.css");
            div_FXGRID_30.addAttribute("jsinit","var combo3 = ['Temporal', 'Real'];    var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo de Empresa', 	'1', 	'1', 	'158', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_empresa', '.top:vpy_empresa.', '', ''), new NXJGridColumn( 	'Codigo de Proyecto', 	'1', 	'1', 	'172', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_codigo', '.top:vpy_codigo.', '', ''), new NXJGridColumn( 	'Nombre de Proyecto', 	'1', 	'1', 	'259', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_nombre', '.top:vpy_nombre.', '', ''), new NXJGridColumn( 	'Estado', 	'3', 	'1', 	'110', 	'', 	combo3, 	'Temporal', 	'textfield', 	true, 	true, 	'', '.top:vpy_estado.', '', '') ]; ; if (!window.namesToComponents['ProyectosDVW_FXGRID'])     {     window.namesToComponents['ProyectosDVW_FXGRID'] = new NXJGrid('ProyectosDVW_FXGRID', _top_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content/');     } ");
            }
        DivPanelWidget div_navigationbar1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_navigationbar1__30,"div_navigationbar1_");
            setAttrFor_div_navigationbar1__30(div_navigationbar1__30);
            NavBarWidget navigationbar1__40 = new NavBarWidget();
                {
                ((ContainerWidget)div_navigationbar1__30).addComponent(navigationbar1__40,"navigationbar1_");
                setAttrFor_navigationbar1__40(navigationbar1__40);
                navigationbar1__40.addAttribute("zeroWidth",10);
                navigationbar1__40.addAttribute("linkGap",23);
                navigationbar1__40.addAttribute("prevWidth",76);
                navigationbar1__40.addAttribute("nextWidth",42);
                navigationbar1__40.addAttribute("prevTitle","Previous");
                navigationbar1__40.addAttribute("nextTitle","Next");
                navigationbar1__40.addAttribute("nlinks",6);
                }
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
private void dodiv_cajaarribaPVenta__10(Widget div_cajaarribaPVenta__10)
    {
    ((ContainerWidget)this).addComponent(div_cajaarribaPVenta__10,"div_cajaarribaPVenta_");
    setAttrFor_div_cajaarribaPVenta__10(div_cajaarribaPVenta__10);
    FieldSetWidget cajaarribaPVenta__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_cajaarribaPVenta__10).addComponent(cajaarribaPVenta__20,"cajaarribaPVenta_");
        setAttrFor_cajaarribaPVenta__20(cajaarribaPVenta__20);
        DivPanelWidget div_actualempresa__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaPVenta__20).addComponent(div_actualempresa__30,"div_actualempresa_");
            setAttrFor_div_actualempresa__30(div_actualempresa__30);
            TextWidget actualempresa__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualempresa__30).addComponent(actualempresa__40,"actualempresa_");
                setAttrFor_actualempresa__40(actualempresa__40);
                }
            }
        DivPanelWidget div_actualusuario__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaPVenta__20).addComponent(div_actualusuario__30,"div_actualusuario_");
            setAttrFor_div_actualusuario__30(div_actualusuario__30);
            TextWidget actualusuario__40 = new TextWidget();
                {
                ((ContainerWidget)div_actualusuario__30).addComponent(actualusuario__40,"actualusuario_");
                setAttrFor_actualusuario__40(actualusuario__40);
                }
            }
        DivPanelWidget div_label1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)cajaarribaPVenta__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__40 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
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
