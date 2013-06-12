package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	CorredoresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public CorredoresDVW_nxjLayoutAttr()
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
	widget.addAttribute("displaywidth","1005");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","465");
	widget.addAttribute("fieldheight","465");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("id",".top.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","262px");
	widget.addStyle("top","165px");
	widget.addStyle("width","571px");
	widget.addStyle("height","181px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("list_columns",".top:vco_codigo.0:85;.top:vco_nombre.85:251;.top:vco_telefono1.336:108;.top:vco_telefono2.444:108");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("occurrences","11");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("repeat_style","Grid");
	widget.setClass("repeating_area");
	widget.addAttribute("displaywidth","571");
	widget.addAttribute("displayleft","262");
	widget.addAttribute("displaytop","165");
	widget.addAttribute("displayheight","181");
	widget.addAttribute("fieldheight","181");
	widget.addAttribute("fieldwidth","571");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vco_codigo__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vco_codigo__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","99");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vco_codigo.");
	widget.addAttribute("displaywidth","85");
	widget.addAttribute("title","vco_codigo");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","14");
	widget.addAttribute("fieldwidth","85");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vco_nombre__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vco_nombre__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","199");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vco_nombre.");
	widget.addAttribute("displaywidth","251");
	widget.addAttribute("title","vco_nombre");
	widget.addAttribute("displayleft","301");
	widget.addAttribute("headertitle","Nombre");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","41");
	widget.addAttribute("fieldwidth","251");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vco_telefono1__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vco_telefono1__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","299");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vco_telefono1.");
	widget.addAttribute("displaywidth","108");
	widget.addAttribute("title","vco_telefono1");
	widget.addAttribute("displayleft","85");
	widget.addAttribute("headertitle","Telefono 1");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","18");
	widget.addAttribute("fieldwidth","108");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vco_telefono2__30(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vco_telefono2__40(Widget widget)
{
	widget.addAttribute("field_type","text");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_weight","399");
	widget.setClass("textfield");
	widget.addAttribute("name",".top:vco_telefono2.");
	widget.addAttribute("displaywidth","108");
	widget.addAttribute("title","vco_telefono2");
	widget.addAttribute("displayleft","193");
	widget.addAttribute("headertitle","Telefono 2");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("size","18");
	widget.addAttribute("fieldwidth","108");
	widget.addAttribute("type","text");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","415px");
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
	widget.addAttribute("displaytop","415");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("background-color","#e30000");
	widget.addStyle("border-color","transparent");
	widget.addAttribute("id",".top:box11.");
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
	widget.addAttribute("id",".top:box111.");
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
	widget.addAttribute("labeltitle","CORREDORES DE VENTA");
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
	widget.setClass("label");
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.addAttribute("id",".top:box111:label211.");
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
	widget.addAttribute("name",".top:box111:textfield1.");
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
	widget.addAttribute("name",".top:box111:textfield11.");
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

private void setAttrFor_div_label11__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","162px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__20(Widget widget)
{
	widget.addStyle("font-family","Verdana");
	widget.setClass("label");
	widget.addAttribute("labeltitle","Corredores de Venta");
	widget.addAttribute("displaywidth","162");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-size","14");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","162");
	widget.addStyle("font-weight","bold");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.addAttribute("id",".top:label11.");
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
        DivPanelWidget div_vco_codigo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vco_codigo__30,"div_vco_codigo_");
            setAttrFor_div_vco_codigo__30(div_vco_codigo__30);
            TextWidget vco_codigo__40 = new TextWidget();
                {
                ((ContainerWidget)div_vco_codigo__30).addComponent(vco_codigo__40,"vco_codigo_");
                setAttrFor_vco_codigo__40(vco_codigo__40);
                }
            }
        DivPanelWidget div_vco_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vco_nombre__30,"div_vco_nombre_");
            setAttrFor_div_vco_nombre__30(div_vco_nombre__30);
            TextWidget vco_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vco_nombre__30).addComponent(vco_nombre__40,"vco_nombre_");
                setAttrFor_vco_nombre__40(vco_nombre__40);
                }
            }
        DivPanelWidget div_vco_telefono1__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vco_telefono1__30,"div_vco_telefono1_");
            setAttrFor_div_vco_telefono1__30(div_vco_telefono1__30);
            TextWidget vco_telefono1__40 = new TextWidget();
                {
                ((ContainerWidget)div_vco_telefono1__30).addComponent(vco_telefono1__40,"vco_telefono1_");
                setAttrFor_vco_telefono1__40(vco_telefono1__40);
                }
            }
        DivPanelWidget div_vco_telefono2__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vco_telefono2__30,"div_vco_telefono2_");
            setAttrFor_div_vco_telefono2__30(div_vco_telefono2__30);
            TextWidget vco_telefono2__40 = new TextWidget();
                {
                ((ContainerWidget)div_vco_telefono2__30).addComponent(vco_telefono2__40,"vco_telefono2_");
                setAttrFor_vco_telefono2__40(vco_telefono2__40);
                }
            }
            div_FXGRID_30.addAttribute("id","CorredoresDVW_FXGRID");
            div_FXGRID_30.addStyle("top","0");
            div_FXGRID_30.addStyle("left","0");
            div_FXGRID_30.addStyle("width","571");
            div_FXGRID_30.addStyle("height","181");
            div_FXGRID_30.addStyle("overflow-x","hidden");
            div_FXGRID_30.addStyle("overflow-y","hidden");
            div_FXGRID_30.addAttribute("jsinclude","NXJGrid.js");
            div_FXGRID_30.addAttribute("jslinks","NXJGrid.css");
            div_FXGRID_30.addAttribute("jsinit","   var _top_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Codigo', 	'1', 	'1', 	'85', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vco_codigo', '.top:vco_codigo.', '', ''), new NXJGridColumn( 	'Nombre', 	'1', 	'1', 	'251', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vco_nombre', '.top:vco_nombre.', '', ''), new NXJGridColumn( 	'Telefono 1', 	'1', 	'1', 	'108', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vco_telefono1', '.top:vco_telefono1.', '', ''), new NXJGridColumn( 	'Telefono 2', 	'1', 	'1', 	'108', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vco_telefono2', '.top:vco_telefono2.', '', '') ]; ; if (!window.namesToComponents['CorredoresDVW_FXGRID'])     {     window.namesToComponents['CorredoresDVW_FXGRID'] = new NXJGrid('CorredoresDVW_FXGRID', _top_RepeatingArea1__FXColumns, 16, null, null, '__NXJ_CONTEXT_PATH__/unify', '', '', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/FORMULARIOS/Login FORM PRI/Prospectoss/sources/Static_Content/');     } ");
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
