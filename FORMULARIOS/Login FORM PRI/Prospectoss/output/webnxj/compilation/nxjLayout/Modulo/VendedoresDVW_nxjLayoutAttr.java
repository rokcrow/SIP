package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	VendedoresDVW_nxjLayoutAttr
	extends DataViewWidget
{

public VendedoresDVW_nxjLayoutAttr()
{
this.isLocalized = false;
setAttrFor_this(this);
DivPanelWidget div_RepeatingArea1__10 = new DivPanelWidget();
dodiv_RepeatingArea1__10(div_RepeatingArea1__10);
DivPanelWidget div_box11__10 = new DivPanelWidget();
dodiv_box11__10(div_box11__10);
DivPanelWidget div_box111__10 = new DivPanelWidget();
dodiv_box111__10(div_box111__10);
DivPanelWidget div_label111__10 = new DivPanelWidget();
dodiv_label111__10(div_label111__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("displaywidth","1005");
	widget.addAttribute("id",".top.");
	widget.addAttribute("name",".top.");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","25");
	widget.addStyle("border-style","solid");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displaytop","25");
	widget.addAttribute("displayheight","466");
	widget.addAttribute("fieldheight","466");
	widget.addAttribute("fieldwidth","1005");
	widget.setClass("data_view");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__10(Widget widget)
{
	widget.addStyle("left","250px");
	widget.addStyle("top","100px");
	widget.addStyle("width","476px");
	widget.addStyle("height","302px");
}

private void setAttrFor_RepeatingArea1__20(Widget widget)
{
	widget.addAttribute("list_columns",".top:vvh_vendedora.0:118;.top:NombVend.118:318");
	widget.addAttribute("occurrences","14");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("field_weight","199");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("repeat_style","List");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("displaywidth","476");
	widget.addAttribute("id",".top:RepeatingArea1.");
	widget.addAttribute("displayleft","250");
	widget.addAttribute("displaytop","100");
	widget.addAttribute("displayheight","302");
	widget.addAttribute("fieldheight","302");
	widget.addAttribute("fieldwidth","476");
	widget.setClass("repeating_area");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_UnifyRepeatingArea_30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","24px");
	widget.addStyle("width","456px");
	widget.addStyle("height","236px");
}

private void setAttrFor_div_Box__30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","0px");
	widget.addStyle("width","456px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Box__40(Widget widget)
{
	widget.addAttribute("displaywidth","456");
	widget.addAttribute("id",".top:Box.");
	widget.addAttribute("displayleft","10");
	widget.addStyle("border-style","none");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","456");
	widget.setClass("header");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Label__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","0px");
	widget.addStyle("width","118px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Label__60(Widget widget)
{
	widget.addAttribute("labeltitle","Vendedor (a)");
	widget.addAttribute("displaywidth","118");
	widget.addAttribute("id",".top:Box:Label.");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","118");
	widget.addStyle("text-align","center");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_Label__51(Widget widget)
{
	widget.addStyle("left","128px");
	widget.addStyle("top","0px");
	widget.addStyle("width","339px");
	widget.addStyle("height","14px");
}

private void setAttrFor_Label__61(Widget widget)
{
	widget.addAttribute("labeltitle","Codigo");
	widget.addAttribute("displaywidth","339");
	widget.addAttribute("id",".top:Box:Label.");
	widget.addAttribute("displayleft","128");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","14");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","339");
	widget.addStyle("text-align","center");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_NombVend__30(Widget widget)
{
	widget.addStyle("left","128px");
	widget.addStyle("top","270px");
	widget.addStyle("width","339px");
	widget.addStyle("height","22px");
}

private void setAttrFor_NombVend__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","339");
	widget.addAttribute("name",".top:NombVend.");
	widget.addAttribute("displayleft","128");
	widget.addAttribute("size","56");
	widget.addAttribute("headertitle","Codigo");
	widget.addAttribute("displaytop","270");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","339");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vvh_vendedora__30(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","270px");
	widget.addStyle("width","118px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vvh_vendedora__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","118");
	widget.addAttribute("name",".top:vvh_vendedora.");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("size","19");
	widget.addAttribute("headertitle","Vendedor (a)");
	widget.addAttribute("displaytop","270");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","118");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__10(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","411px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__20(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("displaywidth","996");
	widget.addAttribute("id",".top:box11.");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displaytop","411");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
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
	widget.addAttribute("displaytop","2");
	widget.addAttribute("id",".top:box11:image1.");
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
	widget.addAttribute("displaywidth","996");
	widget.addAttribute("id",".top:box111.");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
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
	widget.addAttribute("labeltitle","VENDEDORES");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("displaytop","14");
	widget.addStyle("text-align","left");
	widget.addAttribute("id",".top:box111:label1.");
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
	widget.addAttribute("labeltitle","top: 1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("id",".top:box111:label211.");
	widget.addAttribute("displayleft","778");
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
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("name",".top:box111:textfield1.");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("size","32");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.setClass("textfield");
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
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("name",".top:box111:textfield11.");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("size","18");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label111__10(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","149px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label111__20(Widget widget)
{
	widget.addAttribute("labeltitle","Vendedores");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displaywidth","149");
	widget.addAttribute("id",".top:label111.");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","149");
	widget.addStyle("font-size","14");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
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
        DivPanelWidget div_UnifyRepeatingArea_30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_UnifyRepeatingArea_30,"div_UnifyRepeatingArea");
            setAttrFor_div_UnifyRepeatingArea_30(div_UnifyRepeatingArea_30);
            GridWidget UnifyRepeatingArea_40 = new GridWidget();
                {
                ((ContainerWidget)div_UnifyRepeatingArea_30).addComponent(UnifyRepeatingArea_40,"UnifyRepeatingArea");
                UnifyRepeatingArea_40.addAttribute("id","UnifyRepeatingArea");
                UnifyRepeatingArea_40.addAttribute("size",14);
                UnifyRepeatingArea_40.addAttribute("cellHeight",16);
                UnifyRepeatingArea_40.addStyle("top","0");
                UnifyRepeatingArea_40.addStyle("left","0");
                UnifyRepeatingArea_40.addStyle("width","456");
                UnifyRepeatingArea_40.addStyle("height","236");
                }
            }
        DivPanelWidget div_Box__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_Box__30,"div_Box_");
            setAttrFor_div_Box__30(div_Box__30);
            FieldSetWidget Box__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_Box__30).addComponent(Box__40,"Box_");
                setAttrFor_Box__40(Box__40);
                DivPanelWidget div_Label__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)Box__40).addComponent(div_Label__50,"div_Label_");
                    setAttrFor_div_Label__50(div_Label__50);
                    LabelWidget Label__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_Label__50).addComponent(Label__60,"Label_");
                        setAttrFor_Label__60(Label__60);
                        }
                    }
                DivPanelWidget div_Label__51 = new DivPanelWidget();
                    {
                    ((ContainerWidget)Box__40).addComponent(div_Label__51,"div_Label_");
                    setAttrFor_div_Label__51(div_Label__51);
                    LabelWidget Label__61 = new LabelWidget();
                        {
                        ((ContainerWidget)div_Label__51).addComponent(Label__61,"Label_");
                        setAttrFor_Label__61(Label__61);
                        }
                    }
                }
            }
        DivPanelWidget div_NombVend__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_NombVend__30,"div_NombVend_");
            setAttrFor_div_NombVend__30(div_NombVend__30);
            TextWidget NombVend__40 = new TextWidget();
                {
                ((ContainerWidget)div_NombVend__30).addComponent(NombVend__40,"NombVend_");
                setAttrFor_NombVend__40(NombVend__40);
                }
            }
        DivPanelWidget div_vvh_vendedora__30 = new DivPanelWidget();
            {
            ((ContainerWidget)RepeatingArea1__20).addComponent(div_vvh_vendedora__30,"div_vvh_vendedora_");
            setAttrFor_div_vvh_vendedora__30(div_vvh_vendedora__30);
            TextWidget vvh_vendedora__40 = new TextWidget();
                {
                ((ContainerWidget)div_vvh_vendedora__30).addComponent(vvh_vendedora__40,"vvh_vendedora_");
                setAttrFor_vvh_vendedora__40(vvh_vendedora__40);
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
private void dodiv_label111__10(Widget div_label111__10)
    {
    ((ContainerWidget)this).addComponent(div_label111__10,"div_label111_");
    setAttrFor_div_label111__10(div_label111__10);
    LabelWidget label111__20 = new LabelWidget();
        {
        ((ContainerWidget)div_label111__10).addComponent(label111__20,"label111_");
        setAttrFor_label111__20(label111__20);
        }
    }
}
