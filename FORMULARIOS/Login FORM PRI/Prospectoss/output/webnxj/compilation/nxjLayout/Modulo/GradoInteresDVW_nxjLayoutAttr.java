package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	GradoInteresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public GradoInteresDVW_nxjLayoutAttr()
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
	widget.setClass("data_view");
	widget.addAttribute("name",".top.");
	widget.addAttribute("displaywidth","1110");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("id",".top.");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","574");
	widget.addAttribute("fieldheight","574");
	widget.addAttribute("fieldwidth","1110");
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
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("occurrences","12");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("list_columns",".top:xpc_codigo.0:49;.top:xpc_clase.49:87;.top:xpc_nombre.136:209;.top:xpc_califica.345:184;.top:xpc_dias_pac.529:85;.top:xpc_dias_pvt.614:190");
	widget.setClass("repeating_area");
	widget.addAttribute("displaywidth","823");
	widget.addAttribute("displayleft","150");
	widget.addAttribute("horizontal_scroll_width","82%");
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
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","8");
	widget.addAttribute("name",".top:xpc_codigo.");
	widget.addAttribute("displaywidth","49");
	widget.addAttribute("displayleft","162");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","49");
	widget.addAttribute("title","xpc_codigo");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_clase__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_clase__40(Widget widget)
{
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("options","Primer Contacto=P;Seguimiento=S");
	widget.setClass("textfield");
	widget.addAttribute("size","1");
	widget.addAttribute("name",".top:xpc_clase.");
	widget.addAttribute("displaywidth","87");
	widget.addAttribute("displayleft","137");
	widget.addAttribute("headertitle","Clase");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","87");
	widget.addAttribute("title","xpc_clase");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_nombre__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","299");
	widget.addAttribute("accell_type","String");
	widget.setClass("textfield");
	widget.addAttribute("size","34");
	widget.addAttribute("name",".top:xpc_nombre.");
	widget.addAttribute("displaywidth","209");
	widget.addAttribute("displayleft","450");
	widget.addAttribute("headertitle","Nombre");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","209");
	widget.addAttribute("title","xpc_nombre");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_califica__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_califica__40(Widget widget)
{
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("field_weight","399");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("options","Interesado=I;Medianamente Interesado=M;Poco Interesado=P");
	widget.setClass("textfield");
	widget.addAttribute("size","1");
	widget.addAttribute("name",".top:xpc_califica.");
	widget.addAttribute("displaywidth","184");
	widget.addAttribute("displayleft","411");
	widget.addAttribute("headertitle","Calificacion");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","184");
	widget.addAttribute("title","xpc_califica");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_dias_pac__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_dias_pac__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","499");
	widget.addAttribute("accell_type","Numeric");
	widget.setClass("textfield");
	widget.addAttribute("size","14");
	widget.addAttribute("name",".top:xpc_dias_pac.");
	widget.addAttribute("displaywidth","85");
	widget.addAttribute("displayleft","247");
	widget.addAttribute("headertitle","Dias Alto Costo");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","85");
	widget.addAttribute("title","xpc_dias_pac");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_dias_pvt__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_dias_pvt__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("field_weight","599");
	widget.addAttribute("accell_type","Numeric");
	widget.setClass("textfield");
	widget.addAttribute("size","31");
	widget.addAttribute("name",".top:xpc_dias_pvt.");
	widget.addAttribute("displaywidth","190");
	widget.addAttribute("displayleft","349");
	widget.addAttribute("headertitle","Dias VTradicional");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","190");
	widget.addAttribute("title","xpc_dias_pvt");
	widget.addAttribute("type","text");
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
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("id",".top:box11.");
	widget.addAttribute("displaytop","519");
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
	widget.addAttribute("displayheight","46");
	widget.addAttribute("id",".top:box11:image1.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displaywidth","164");
	widget.addAttribute("displayleft","416");
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
	widget.addAttribute("field_weight","199");
	widget.setClass("box");
	widget.addAttribute("displaywidth","996");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("id",".top:box111.");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
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
	widget.addAttribute("labeltitle","GRADO DE INTERES");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("id",".top:box111:label1.");
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
	widget.setClass("label");
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("id",".top:box111:label211.");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
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
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","99");
	widget.setClass("textfield");
	widget.addAttribute("size","32");
	widget.addAttribute("name",".top:box111:textfield1.");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.addAttribute("type","text");
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
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_weight","199");
	widget.setClass("textfield");
	widget.addAttribute("size","18");
	widget.addAttribute("name",".top:box111:textfield11.");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.addAttribute("type","text");
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
	widget.setClass("label");
	widget.addAttribute("labeltitle","Grado de Interes");
	widget.addStyle("font-size","14");
	widget.addAttribute("displaywidth","162");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("headertitle","Column1");
	widget.addAttribute("id",".top:label11.");
	widget.addStyle("color","Black");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","162");
	widget.addStyle("font-family","Verdana");
	widget.addStyle("text-align","left");
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
        DivPanelWidget div_xpc_califica__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_califica__30,"div_xpc_califica_");
            setAttrFor_div_xpc_califica__30(div_xpc_califica__30);
            ListWidget xpc_califica__40 = new ListWidget();
                {
                ((ContainerWidget)div_xpc_califica__30).addComponent(xpc_califica__40,"xpc_califica_");
                setAttrFor_xpc_califica__40(xpc_califica__40);
                }
            }
        DivPanelWidget div_xpc_dias_pac__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_dias_pac__30,"div_xpc_dias_pac_");
            setAttrFor_div_xpc_dias_pac__30(div_xpc_dias_pac__30);
            TextWidget xpc_dias_pac__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpc_dias_pac__30).addComponent(xpc_dias_pac__40,"xpc_dias_pac_");
                setAttrFor_xpc_dias_pac__40(xpc_dias_pac__40);
                }
            }
        DivPanelWidget div_xpc_dias_pvt__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_xpc_dias_pvt__30,"div_xpc_dias_pvt_");
            setAttrFor_div_xpc_dias_pvt__30(div_xpc_dias_pvt__30);
            TextWidget xpc_dias_pvt__40 = new TextWidget();
                {
                ((ContainerWidget)div_xpc_dias_pvt__30).addComponent(xpc_dias_pvt__40,"xpc_dias_pvt_");
                setAttrFor_xpc_dias_pvt__40(xpc_dias_pvt__40);
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
            div_FXGRID_30.addAttribute("jsinit","var combo1 = ['Primer Contacto', 'Seguimiento']; var combo3 = ['Interesado', 'Medianamente Interesado', 'Poco Interesado'];    var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo', 	'1', 	'1', 	'49', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_codigo', '.top:xpc_codigo.', '', ''), new NXJGridColumn( 	'Clase', 	'3', 	'1', 	'87', 	'', 	combo1, 	'Primer Contacto', 	'textfield', 	true, 	true, 	'xpc_clase', '.top:xpc_clase.', '', ''), new NXJGridColumn( 	'Nombre', 	'1', 	'1', 	'209', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_nombre', '.top:xpc_nombre.', '', ''), new NXJGridColumn( 	'Calificacion', 	'3', 	'1', 	'184', 	'', 	combo3, 	'Interesado', 	'textfield', 	true, 	true, 	'xpc_califica', '.top:xpc_califica.', '', ''), new NXJGridColumn( 	'Dias Alto Costo', 	'1', 	'0', 	'85', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_dias_pac', '.top:xpc_dias_pac.', '', ''), new NXJGridColumn( 	'Dias VTradicional', 	'1', 	'0', 	'190', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'xpc_dias_pvt', '.top:xpc_dias_pvt.', '', '') ]; ; if (!window.namesToComponents['GradoInteresDVW_FXGRID'])     {     window.namesToComponents['GradoInteresDVW_FXGRID'] = new NXJGrid('GradoInteresDVW_FXGRID', _top_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/FORMULARIOS/Login FORM PRI/Prospectoss/sources/Static_Content/');     } ");
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
