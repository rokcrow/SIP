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
DivPanelWidget div_box111__10 = new DivPanelWidget();
dodiv_box111__10(div_box111__10);
DivPanelWidget div_label11__10 = new DivPanelWidget();
dodiv_label11__10(div_label11__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1081");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("id",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","716");
	widget.addAttribute("fieldheight","716");
	widget.addAttribute("fieldwidth","1081");
	widget.addStyle("background-color","#cccccc");
	widget.setClass("data_view");
	widget.addAttribute("name",".top.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","358px");
	widget.addStyle("top","165px");
	widget.addStyle("width","665px");
	widget.addStyle("height","427px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("list_columns",".top:vpy_codigo.0:162;.top:vpy_empresa.162:163;.top:vpy_nombre.325:161;.top:vpy_estado.486:160");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","17");
	widget.addAttribute("displaywidth","665");
	widget.addAttribute("displayleft","358");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addAttribute("displaytop","165");
	widget.addAttribute("displayheight","427");
	widget.addAttribute("fieldheight","427");
	widget.addAttribute("fieldwidth","665");
	widget.setClass("repeating_area");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_codigo__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_codigo__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vpy_codigo");
	widget.addAttribute("displaywidth","162");
	widget.addAttribute("displayleft","104");
	widget.addAttribute("headertitle","Codigo de Proyecto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","162");
	widget.addAttribute("size","27");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vpy_codigo.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_empresa__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_empresa__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vpy_empresa");
	widget.addAttribute("displaywidth","163");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","Codigo de Empresa");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","163");
	widget.addAttribute("size","27");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vpy_empresa.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_nombre__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_nombre__40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("title","vpy_nombre");
	widget.addAttribute("displaywidth","161");
	widget.addAttribute("displayleft","234");
	widget.addAttribute("headertitle","Nombre de Proyecto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("type","text");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","161");
	widget.addAttribute("size","26");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vpy_nombre.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_estado__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vpy_estado__40(Widget widget)
{
	widget.addAttribute("field_weight","399");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("options","Temporal=T;Real=R");
	widget.addAttribute("displaywidth","160");
	widget.addAttribute("displayleft","351");
	widget.addAttribute("headertitle","Estado");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","160");
	widget.addAttribute("size","1");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vpy_estado.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_navigationbar1__30(Widget widget)
{
	widget.addAttribute("navbarcontainer","true");
	widget.addStyle("left","20px");
	widget.addStyle("top","393px");
	widget.addStyle("width","340px");
	widget.addStyle("height","24px");
}

private void setAttrFor_navigationbar1__40(Widget widget)
{
	widget.addAttribute("displaywidth","340");
	widget.addAttribute("displayleft","20");
	widget.addAttribute("navigationtype","rows");
	widget.addAttribute("id",".top:navigationbar1.");
	widget.addAttribute("linkinrement","27");
	widget.addAttribute("displaytop","393");
	widget.addAttribute("displayheight","24");
	widget.addAttribute("fieldheight","24");
	widget.addAttribute("fieldwidth","340");
	widget.setClass("navigation");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","661px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","661");
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
	widget.addStyle("width","522px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("id",".top:box111:label1.");
	widget.addAttribute("labeltitle","PROYECTOS EN VENTA");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("displaytop","14");
	widget.addStyle("text-align","left");
	widget.addAttribute("displaywidth","522");
	widget.addAttribute("displayleft","241");
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

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","149px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addStyle("font-size","14");
	widget.addAttribute("labeltitle","Proyectos en venta");
	widget.addAttribute("displaywidth","149");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displayleft","20");
	widget.addStyle("color","Black");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("id",".top:label11.");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","149");
	widget.addStyle("text-align","left");
	widget.setClass("label");
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
            div_FXGRID_30.addStyle("width","665");
            div_FXGRID_30.addStyle("height","393");
            div_FXGRID_30.addStyle("overflow-x","hidden");
            div_FXGRID_30.addStyle("overflow-y","hidden");
            div_FXGRID_30.addAttribute("jsinclude","NXJGrid.js");
            div_FXGRID_30.addAttribute("jslinks","NXJGrid.css");
            div_FXGRID_30.addAttribute("jsinit","var combo3 = ['Temporal', 'Real'];    var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo de Proyecto', 	'1', 	'1', 	'162', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_codigo', '.top:vpy_codigo.', '', ''), new NXJGridColumn( 	'Codigo de Empresa', 	'1', 	'1', 	'163', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_empresa', '.top:vpy_empresa.', '', ''), new NXJGridColumn( 	'Nombre de Proyecto', 	'1', 	'1', 	'161', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vpy_nombre', '.top:vpy_nombre.', '', ''), new NXJGridColumn( 	'Estado', 	'3', 	'1', 	'160', 	'', 	combo3, 	'Temporal', 	'textfield', 	true, 	true, 	'', '.top:vpy_estado.', '', '') ]; ; if (!window.namesToComponents['ProyectosDVW_FXGRID'])     {     window.namesToComponents['ProyectosDVW_FXGRID'] = new NXJGrid('ProyectosDVW_FXGRID', _top_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/Otros FORMS/Prospectos/sources/Static_Content/');     } ");
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
                navigationbar1__40.addAttribute("linkGap",38);
                navigationbar1__40.addAttribute("prevWidth",76);
                navigationbar1__40.addAttribute("nextWidth",42);
                navigationbar1__40.addAttribute("prevTitle","Previous");
                navigationbar1__40.addAttribute("nextTitle","Next");
                navigationbar1__40.addAttribute("nlinks",2);
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
