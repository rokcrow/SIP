package nxjLayout.Modulo;

import com.unify.nxj.awebView.*;

public class
	SeguimientoFRM_nxjLayoutAttr
	extends FormWidget
{

public SeguimientoFRM_nxjLayoutAttr()
{
this.isLocalized = true;
setAttrFor_this(this);
DivPanelWidget div_CajaSegui__10 = new DivPanelWidget();
dodiv_CajaSegui__10(div_CajaSegui__10);
}

private void setAttrFor_this(Widget widget)
{
	widget.addAttribute("footer","none");
	widget.addAttribute("localized","true");
	widget.addAttribute("fieldheight","1025");
	widget.setClass("form");
	widget.addAttribute("title","SeguimientodeProspectos1");
	widget.addAttribute("displayheight","1025");
	widget.addAttribute("fieldwidth","1209");
	widget.addAttribute("name","NXJForm");
	widget.addStyle("background-color","#999999");
	widget.addAttribute("stylesheets","");
	widget.addAttribute("displaywidth","1209");
}

private void setAttrFor_div_CajaSegui__10(Widget widget)
{
	widget.addStyle("left","195px");
	widget.addStyle("top","30px");
	widget.addStyle("width","1005px");
	widget.addStyle("height","981px");
}

private void setAttrFor_CajaSegui__20(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","1005");
	widget.addAttribute("id","CajaSegui.");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","195");
	widget.addStyle("background-color","#cccccc");
	widget.addAttribute("displaytop","30");
	widget.addAttribute("displayheight","981");
	widget.addAttribute("fieldheight","981");
	widget.addAttribute("fieldwidth","1005");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_PUBLIC_vps_prosigue__30(Widget widget)
{
	widget.addStyle("left","56px");
	widget.addStyle("top","434px");
	widget.addStyle("width","880px");
	widget.addStyle("height","258px");
}

private void setAttrFor_PUBLIC_vps_prosigue__40(Widget widget)
{
	widget.addAttribute("field_weight","1599");
	widget.addAttribute("displaywidth","880");
	widget.addAttribute("id","CajaSegui:PUBLIC_vps_prosigue.");
	widget.addStyle("border-width","1");
	widget.addAttribute("displayleft","56");
	widget.addStyle("border-style","solid");
	widget.addAttribute("displaytop","434");
	widget.addAttribute("displayheight","258");
	widget.addAttribute("fieldheight","258");
	widget.addAttribute("fieldwidth","880");
	widget.setClass("data_view");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_RepeatingArea1__50(Widget widget)
{
	widget.addStyle("left","10px");
	widget.addStyle("top","10px");
	widget.addStyle("width","866px");
	widget.addStyle("height","205px");
}

private void setAttrFor_RepeatingArea1__60(Widget widget)
{
	widget.addAttribute("list_columns","CajaSegui:PUBLIC_vps_prosigue:vps_consecu.0:74;CajaSegui:PUBLIC_vps_prosigue:vps_fecha.74:67;CajaSegui:PUBLIC_vps_prosigue:vps_hora.141:61;CajaSegui:PUBLIC_vps_prosigue:vps_usuario.202:54;CajaSegui:PUBLIC_vps_prosigue:vps_mediocon.256:93;CajaSegui:PUBLIC_vps_prosigue:vps_califica.349:74;CajaSegui:PUBLIC_vps_prosigue:xpc_nombre.423:237;CajaSegui:PUBLIC_vps_prosigue:vps_estado.660:94;CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto.754:93");
	widget.addAttribute("occurrences","9");
	widget.addAttribute("selected_row_class","selected_row");
	widget.addAttribute("field_weight","99");
	widget.addAttribute("row_class","ROW");
	widget.addAttribute("repeat_style","Grid");
	widget.addAttribute("altRowClass","alternate_row");
	widget.addAttribute("displaywidth","866");
	widget.addAttribute("id","CajaSegui:PUBLIC_vps_prosigue:RepeatingArea1.");
	widget.addAttribute("displayleft","10");
	widget.addAttribute("displaytop","10");
	widget.addAttribute("displayheight","205");
	widget.addAttribute("fieldheight","205");
	widget.addAttribute("fieldwidth","866");
	widget.setClass("repeating_area");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_consecu__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_consecu__80(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("accell_type","Numeric");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","74");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_consecu.");
	widget.addAttribute("displayleft","0");
	widget.addAttribute("size","12");
	widget.addAttribute("headertitle","Consecutivo");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_consecu");
	widget.addAttribute("fieldwidth","74");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_fecha__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_fecha__80(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("accell_type","Date");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","67");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_fecha.");
	widget.addAttribute("displayleft","97");
	widget.addAttribute("size","11");
	widget.addAttribute("headertitle","Fecha");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_fecha");
	widget.addAttribute("fieldwidth","67");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_hora__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_hora__80(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("accell_type","Time");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","61");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_hora.");
	widget.addAttribute("displayleft","174");
	widget.addAttribute("size","10");
	widget.addAttribute("headertitle","Hora");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_hora");
	widget.addAttribute("fieldwidth","61");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_usuario__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_usuario__80(Widget widget)
{
	widget.addAttribute("field_weight","399");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","54");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_usuario.");
	widget.addAttribute("displayleft","244");
	widget.addAttribute("size","9");
	widget.addAttribute("headertitle","Usuario");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_usuario");
	widget.addAttribute("fieldwidth","54");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_mediocon__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_mediocon__80(Widget widget)
{
	widget.addAttribute("field_weight","499");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("options","Email=C;Telefono=T;Fax=F;Personal=P");
	widget.addAttribute("displaywidth","93");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_mediocon.");
	widget.addAttribute("displayleft","424");
	widget.addAttribute("size","1");
	widget.addAttribute("headertitle","Medio Contacto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("title","vps_mediocon");
	widget.addAttribute("fieldwidth","93");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_califica__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_califica__80(Widget widget)
{
	widget.addAttribute("field_weight","599");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","74");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_califica.");
	widget.addAttribute("displayleft","445");
	widget.addAttribute("size","12");
	widget.addAttribute("headertitle","Seguimiento");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_califica");
	widget.addAttribute("fieldwidth","74");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_xpc_nombre__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_xpc_nombre__80(Widget widget)
{
	widget.addAttribute("field_weight","699");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","237");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:xpc_nombre.");
	widget.addAttribute("displayleft","658");
	widget.addAttribute("size","39");
	widget.addAttribute("headertitle","Descripcion");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","237");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_estado__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_estado__80(Widget widget)
{
	widget.addAttribute("field_weight","799");
	widget.addAttribute("accell_type","String");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("options","Si esta interesado=S;Medianamente Interesado=M;No esta interesado=N");
	widget.addAttribute("displaywidth","94");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_estado.");
	widget.addAttribute("displayleft","658");
	widget.addAttribute("size","1");
	widget.addAttribute("headertitle","Estado");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("title","vps_estado");
	widget.addAttribute("fieldwidth","94");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_f_pcontacto__70(Widget widget)
{
	widget.addStyle("display","none");
}

private void setAttrFor_vps_f_pcontacto__80(Widget widget)
{
	widget.addAttribute("field_weight","899");
	widget.addAttribute("accell_type","Date");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","93");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto.");
	widget.addAttribute("displayleft","621");
	widget.addAttribute("size","15");
	widget.addAttribute("headertitle","Fecha Contacto");
	widget.addAttribute("displaytop","0");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("title","vps_f_pcontacto");
	widget.addAttribute("fieldwidth","93");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__50(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","224px");
	widget.addStyle("width","73px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__60(Widget widget)
{
	widget.addAttribute("labeltitle","Comentario");
	widget.addAttribute("displaywidth","73");
	widget.addAttribute("id","CajaSegui:PUBLIC_vps_prosigue:label1.");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("displaytop","224");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","73");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_textfield1__50(Widget widget)
{
	widget.addStyle("left","480px");
	widget.addStyle("top","224px");
	widget.addStyle("width","370px");
	widget.addStyle("height","22px");
}

private void setAttrFor_textfield1__60(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","370");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:textfield1.");
	widget.addAttribute("displayleft","480");
	widget.addAttribute("size","61");
	widget.addAttribute("displaytop","224");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","370");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vps_comentario1__50(Widget widget)
{
	widget.addStyle("left","96px");
	widget.addStyle("top","224px");
	widget.addStyle("width","370px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vps_comentario1__60(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","370");
	widget.addAttribute("name","CajaSegui:PUBLIC_vps_prosigue:vps_comentario1.");
	widget.addAttribute("displayleft","96");
	widget.addAttribute("size","61");
	widget.addAttribute("displaytop","224");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","370");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_box11__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","931px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_box11__40(Widget widget)
{
	widget.addAttribute("field_weight","1899");
	widget.addAttribute("displaywidth","996");
	widget.addAttribute("id","CajaSegui:box11.");
	widget.addStyle("border-width","0");
	widget.addAttribute("displayleft","4");
	widget.addStyle("border-style","None");
	widget.addStyle("background-color","#e30000");
	widget.addAttribute("displaytop","931");
	widget.addAttribute("displayheight","50");
	widget.addAttribute("fieldheight","50");
	widget.addAttribute("fieldwidth","996");
	widget.addStyle("border-color","transparent");
	widget.setClass("box");
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
	widget.addAttribute("width","164");
	widget.addAttribute("displaytop","2");
	widget.addAttribute("height","46");
	widget.addAttribute("id","CajaSegui:box11:image1.");
	widget.addAttribute("displayleft","416");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_cajaarribaSProspectos__30(Widget widget)
{
	widget.addStyle("left","4px");
	widget.addStyle("top","2px");
	widget.addStyle("width","996px");
	widget.addStyle("height","50px");
}

private void setAttrFor_cajaarribaSProspectos__40(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("displaywidth","996");
	widget.addAttribute("id","CajaSegui:cajaarribaSProspectos.");
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

private void setAttrFor_div_actualempresa__50(Widget widget)
{
	widget.addStyle("left","16px");
	widget.addStyle("top","14px");
	widget.addStyle("width","197px");
	widget.addStyle("height","22px");
}

private void setAttrFor_actualempresa__60(Widget widget)
{
	widget.addAttribute("field_weight","99");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","197");
	widget.addAttribute("name","CajaSegui:cajaarribaSProspectos:actualempresa.");
	widget.addAttribute("displayleft","16");
	widget.addAttribute("size","32");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","197");
	widget.setClass("textfield");
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
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","false");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","110");
	widget.addAttribute("name","CajaSegui:cajaarribaSProspectos:actualusuario.");
	widget.addAttribute("displayleft","800");
	widget.addAttribute("size","18");
	widget.addAttribute("displaytop","14");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","110");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__51(Widget widget)
{
	widget.addStyle("left","242px");
	widget.addStyle("top","15px");
	widget.addStyle("width","323px");
	widget.addStyle("height","23px");
}

private void setAttrFor_label1__61(Widget widget)
{
	widget.addAttribute("labeltitle","SEGUIMIENTODEPROSPECTOS");
	widget.addAttribute("displaywidth","323");
	widget.addAttribute("id","CajaSegui:cajaarribaSProspectos:label1.");
	widget.addAttribute("displayleft","242");
	widget.addAttribute("displaytop","15");
	widget.addAttribute("displayheight","23");
	widget.addAttribute("fieldwidth","323");
	widget.addStyle("text-align","left");
	widget.addAttribute("instancewidth","323");
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
	widget.addAttribute("labeltitle","top1024");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("id","CajaSegui:cajaarribaSProspectos:label211.");
	widget.addAttribute("displayleft","778");
	widget.addAttribute("displaytop","65");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","14");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("text-align","left");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label1__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","127px");
	widget.addStyle("width","49px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label1__40(Widget widget)
{
	widget.addAttribute("labeltitle","Numero");
	widget.addAttribute("displaywidth","49");
	widget.addAttribute("id","CajaSegui:label1.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","49");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label10__30(Widget widget)
{
	widget.addStyle("left","454px");
	widget.addStyle("top","239px");
	widget.addStyle("width","100px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label10__40(Widget widget)
{
	widget.addAttribute("labeltitle","TelefonoOficina");
	widget.addAttribute("displaywidth","100");
	widget.addAttribute("id","CajaSegui:label10.");
	widget.addAttribute("displayleft","454");
	widget.addAttribute("displaytop","239");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","100");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11__30(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","96px");
	widget.addStyle("width","155px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11__40(Widget widget)
{
	widget.addAttribute("labeltitle","DatosdelProspecto");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displaywidth","155");
	widget.addAttribute("id","CajaSegui:label11.");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displaytop","96");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","155");
	widget.addStyle("font-size","14");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label111__30(Widget widget)
{
	widget.addStyle("left","454px");
	widget.addStyle("top","295px");
	widget.addStyle("width","44px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label111__40(Widget widget)
{
	widget.addAttribute("labeltitle","Celular");
	widget.addAttribute("displaywidth","44");
	widget.addAttribute("id","CajaSegui:label111.");
	widget.addAttribute("displayleft","454");
	widget.addAttribute("displaytop","295");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","44");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label11211__30(Widget widget)
{
	widget.addStyle("left","20px");
	widget.addStyle("top","805px");
	widget.addStyle("width","135px");
	widget.addStyle("height","18px");
}

private void setAttrFor_label11211__40(Widget widget)
{
	widget.addAttribute("labeltitle","AsesordeVentas");
	widget.addStyle("font-weight","bold");
	widget.addAttribute("displaywidth","135");
	widget.addAttribute("id","CajaSegui:label11211.");
	widget.addAttribute("displayleft","20");
	widget.addStyle("font-family","Verdana");
	widget.addAttribute("displaytop","805");
	widget.addAttribute("displayheight","18");
	widget.addAttribute("fieldheight","18");
	widget.addAttribute("fieldwidth","135");
	widget.addStyle("font-size","14");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label12__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","239px");
	widget.addStyle("width","33px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label12__40(Widget widget)
{
	widget.addAttribute("labeltitle","Email");
	widget.addAttribute("displaywidth","33");
	widget.addAttribute("id","CajaSegui:label12.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("displaytop","239");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","33");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label13__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","295px");
	widget.addStyle("width","45px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label13__40(Widget widget)
{
	widget.addAttribute("labeltitle","Email2");
	widget.addAttribute("displaywidth","45");
	widget.addAttribute("id","CajaSegui:label13.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("displaytop","295");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","45");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label14__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","836px");
	widget.addStyle("width","192px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label14__40(Widget widget)
{
	widget.addAttribute("labeltitle","VendedoraDemostradora");
	widget.addAttribute("displaywidth","192");
	widget.addAttribute("id","CajaSegui:label14.");
	widget.addAttribute("displayleft","112");
	widget.addAttribute("displaytop","836");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","192");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label2__30(Widget widget)
{
	widget.addStyle("left","234px");
	widget.addStyle("top","127px");
	widget.addStyle("width","111px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label2__40(Widget widget)
{
	widget.addAttribute("labeltitle","EstadoProspecto");
	widget.addAttribute("displaywidth","111");
	widget.addAttribute("id","CajaSegui:label2.");
	widget.addAttribute("displayleft","234");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","111");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label3__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","183px");
	widget.addStyle("width","85px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label3__40(Widget widget)
{
	widget.addAttribute("labeltitle","FechaEstado");
	widget.addAttribute("displaywidth","85");
	widget.addAttribute("id","CajaSegui:label3.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","85");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label4__30(Widget widget)
{
	widget.addStyle("left","452px");
	widget.addStyle("top","127px");
	widget.addStyle("width","55px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label4__40(Widget widget)
{
	widget.addAttribute("labeltitle","Proyecto");
	widget.addAttribute("displaywidth","55");
	widget.addAttribute("id","CajaSegui:label4.");
	widget.addAttribute("displayleft","452");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","55");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label5__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","127px");
	widget.addStyle("width","93px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label5__40(Widget widget)
{
	widget.addAttribute("labeltitle","FechaRegistro");
	widget.addAttribute("displaywidth","93");
	widget.addAttribute("id","CajaSegui:label5.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("displaytop","127");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","93");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label6__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","183px");
	widget.addStyle("width","49px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label6__40(Widget widget)
{
	widget.addAttribute("labeltitle","Nombre");
	widget.addAttribute("displaywidth","49");
	widget.addAttribute("id","CajaSegui:label6.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","49");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label7__30(Widget widget)
{
	widget.addStyle("left","452px");
	widget.addStyle("top","183px");
	widget.addStyle("width","56px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label7__40(Widget widget)
{
	widget.addAttribute("labeltitle","Direccion");
	widget.addAttribute("displaywidth","56");
	widget.addAttribute("id","CajaSegui:label7.");
	widget.addAttribute("displayleft","452");
	widget.addAttribute("displaytop","183");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","56");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label8__30(Widget widget)
{
	widget.addStyle("left","762px");
	widget.addStyle("top","295px");
	widget.addStyle("width","26px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label8__40(Widget widget)
{
	widget.addAttribute("labeltitle","Pais");
	widget.addAttribute("displaywidth","26");
	widget.addAttribute("id","CajaSegui:label8.");
	widget.addAttribute("displayleft","762");
	widget.addAttribute("displaytop","295");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","26");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_label9__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","239px");
	widget.addStyle("width","80px");
	widget.addStyle("height","16px");
}

private void setAttrFor_label9__40(Widget widget)
{
	widget.addAttribute("labeltitle","Nacionalidad");
	widget.addAttribute("displaywidth","80");
	widget.addAttribute("id","CajaSegui:label9.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("displaytop","239");
	widget.addAttribute("displayheight","16");
	widget.addAttribute("fieldheight","16");
	widget.addAttribute("fieldwidth","80");
	widget.addStyle("font-size","12");
	widget.addStyle("text-align","left");
	widget.addStyle("color","Black");
	widget.setClass("label");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_line112__30(Widget widget)
{
	widget.addStyle("left","7px");
	widget.addStyle("top","390px");
	widget.addStyle("width","988px");
	widget.addStyle("height","1px");
}

private void setAttrFor_line112__40(Widget widget)
{
	widget.addAttribute("displaywidth","988");
	widget.addAttribute("id","CajaSegui:line112.");
	widget.addAttribute("displayleft","7");
	widget.addAttribute("size","1");
	widget.addStyle("background-color","Red");
	widget.addAttribute("displaytop","390");
	widget.addAttribute("displayheight","1");
	widget.addAttribute("fieldheight","1");
	widget.addAttribute("fieldwidth","988");
	widget.addAttribute("width","988");
	widget.addStyle("color","#ff0033");
	widget.addStyle("border-color","Red");
	widget.setClass("horizontal_line");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_line1121__30(Widget widget)
{
	widget.addStyle("left","7px");
	widget.addStyle("top","761px");
	widget.addStyle("width","988px");
	widget.addStyle("height","1px");
}

private void setAttrFor_line1121__40(Widget widget)
{
	widget.addAttribute("displaywidth","988");
	widget.addAttribute("id","CajaSegui:line1121.");
	widget.addAttribute("displayleft","7");
	widget.addAttribute("size","1");
	widget.addStyle("background-color","Red");
	widget.addAttribute("displaytop","761");
	widget.addAttribute("displayheight","1");
	widget.addAttribute("fieldheight","1");
	widget.addAttribute("fieldwidth","988");
	widget.addAttribute("width","988");
	widget.addStyle("color","#ff0033");
	widget.addStyle("border-color","Red");
	widget.setClass("horizontal_line");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_ciudad__30(Widget widget)
{
	widget.addStyle("left","762px");
	widget.addStyle("top","321px");
	widget.addStyle("width","165px");
	widget.addStyle("height","21px");
}

private void setAttrFor_vpp_ciudad__40(Widget widget)
{
	widget.addAttribute("field_weight","1499");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("displaywidth","165");
	widget.addAttribute("name","CajaSegui:vpp_ciudad.");
	widget.addAttribute("displayleft","762");
	widget.addAttribute("size","1");
	widget.addAttribute("displaytop","321");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","165");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_correo__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","265px");
	widget.addStyle("width","250px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_correo__40(Widget widget)
{
	widget.addAttribute("field_weight","999");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","250");
	widget.addAttribute("name","CajaSegui:vpp_correo.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("size","41");
	widget.addAttribute("displaytop","265");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","250");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_cuanta_correo2__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","321px");
	widget.addStyle("width","250px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_cuanta_correo2__40(Widget widget)
{
	widget.addAttribute("field_weight","1299");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","250");
	widget.addAttribute("name","CajaSegui:vpp_cuanta_correo2.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("size","41");
	widget.addAttribute("displaytop","321");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","250");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_direccion__30(Widget widget)
{
	widget.addStyle("left","452px");
	widget.addStyle("top","209px");
	widget.addStyle("width","250px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_direccion__40(Widget widget)
{
	widget.addAttribute("field_weight","799");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","250");
	widget.addAttribute("name","CajaSegui:vpp_direccion.");
	widget.addAttribute("displayleft","452");
	widget.addAttribute("size","41");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","250");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_estadopro__30(Widget widget)
{
	widget.addStyle("left","234px");
	widget.addStyle("top","153px");
	widget.addStyle("width","180px");
	widget.addStyle("height","21px");
}

private void setAttrFor_vpp_estadopro__40(Widget widget)
{
	widget.addAttribute("field_weight","299");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("options","Activo=A;Cliente Provivienda=B;No aplica para comprar=C;Comproalacompetencia=D");
	widget.addAttribute("displaywidth","180");
	widget.addAttribute("name","CajaSegui:vpp_estadopro.");
	widget.addAttribute("displayleft","234");
	widget.addAttribute("size","1");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","180");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("dropdown_list");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_fecha__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","153px");
	widget.addStyle("width","165px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_fecha__40(Widget widget)
{
	widget.addAttribute("field_weight","599");
	widget.addAttribute("field_type","TEXT");
	widget.addAttribute("displaywidth","165");
	widget.addAttribute("id","CajaSegui:vpp_fecha.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","165");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJDatePicker.js");
	widget.addAttribute("jsinit","window.namesToComponents['CajaSegui:vpp_fecha.'] = new NXJDatePicker('CajaSegui:vpp_fecha.', 'textfield', ' font-size: 12px; color: Black; ime-mode: disabled', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/', '', '', 'S,M,T,W,T,F,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'dd/MM/yyyy');");
	widget.addStyle("width","165");
	widget.addStyle("height","22");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("foreground-color","Black");
}

private void setAttrFor_div_vpp_fechaestado__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","209px");
	widget.addStyle("width","165px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_fechaestado__40(Widget widget)
{
	widget.addAttribute("field_weight","899");
	widget.addAttribute("field_type","TEXT");
	widget.addAttribute("displaywidth","165");
	widget.addAttribute("id","CajaSegui:vpp_fechaestado.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","165");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
	widget.suppressAttribute("name");
	widget.addAttribute("jsinclude","NXJDatePicker.js");
	widget.addAttribute("jsinit","window.namesToComponents['CajaSegui:vpp_fechaestado.'] = new NXJDatePicker('CajaSegui:vpp_fechaestado.', 'textfield', ' font-size: 12px; color: Black; ime-mode: disabled', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/', '', '', 'S,M,T,W,T,F,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'dd/MM/yyyy');");
	widget.addStyle("width","165");
	widget.addStyle("height","22");
	widget.addStyle("background-color","#cccccc");
	widget.addStyle("foreground-color","Black");
}

private void setAttrFor_div_vpp_nacionalidad__30(Widget widget)
{
	widget.addStyle("left","760px");
	widget.addStyle("top","265px");
	widget.addStyle("width","165px");
	widget.addStyle("height","21px");
}

private void setAttrFor_vpp_nacionalidad__40(Widget widget)
{
	widget.addAttribute("field_weight","1199");
	widget.addAttribute("field_type","SELECT");
	widget.addAttribute("displaywidth","165");
	widget.addAttribute("name","CajaSegui:vpp_nacionalidad.");
	widget.addAttribute("displayleft","760");
	widget.addAttribute("size","1");
	widget.addAttribute("displaytop","265");
	widget.addAttribute("displayheight","21");
	widget.addAttribute("fieldheight","21");
	widget.addAttribute("fieldwidth","165");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_nombre__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","209px");
	widget.addStyle("width","250px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_nombre__40(Widget widget)
{
	widget.addAttribute("field_weight","699");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","250");
	widget.addAttribute("name","CajaSegui:vpp_nombre.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("size","41");
	widget.addAttribute("displaytop","209");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","250");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_numero__30(Widget widget)
{
	widget.addStyle("left","110px");
	widget.addStyle("top","153px");
	widget.addStyle("width","80px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_numero__40(Widget widget)
{
	widget.addAttribute("field_weight","199");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","80");
	widget.addAttribute("name","CajaSegui:vpp_numero.");
	widget.addAttribute("displayleft","110");
	widget.addAttribute("size","13");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","80");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_proyecto__30(Widget widget)
{
	widget.addStyle("left","452px");
	widget.addStyle("top","153px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_proyecto__40(Widget widget)
{
	widget.addAttribute("field_weight","399");
	widget.addAttribute("immediate","true");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","45");
	widget.addAttribute("name","CajaSegui:vpp_proyecto.");
	widget.addAttribute("displayleft","452");
	widget.addAttribute("size","7");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_telofi__30(Widget widget)
{
	widget.addStyle("left","454px");
	widget.addStyle("top","265px");
	widget.addStyle("width","120px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_telofi__40(Widget widget)
{
	widget.addAttribute("field_weight","1099");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","120");
	widget.addAttribute("name","CajaSegui:vpp_telofi.");
	widget.addAttribute("displayleft","454");
	widget.addAttribute("size","20");
	widget.addAttribute("displaytop","265");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","120");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_telres__30(Widget widget)
{
	widget.addStyle("left","454px");
	widget.addStyle("top","321px");
	widget.addStyle("width","120px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_telres__40(Widget widget)
{
	widget.addAttribute("field_weight","1399");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","120");
	widget.addAttribute("name","CajaSegui:vpp_telres.");
	widget.addAttribute("displayleft","454");
	widget.addAttribute("size","20");
	widget.addAttribute("displaytop","321");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","120");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpp_vendedor__30(Widget widget)
{
	widget.addStyle("left","112px");
	widget.addStyle("top","862px");
	widget.addStyle("width","45px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpp_vendedor__40(Widget widget)
{
	widget.addAttribute("field_weight","1699");
	widget.addAttribute("field_type","text");
	widget.addAttribute("immediate","true");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","45");
	widget.addAttribute("name","CajaSegui:vpp_vendedor.");
	widget.addAttribute("displayleft","112");
	widget.addAttribute("size","7");
	widget.addAttribute("displaytop","862");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","45");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vpy_nombre__30(Widget widget)
{
	widget.addStyle("left","499px");
	widget.addStyle("top","153px");
	widget.addStyle("width","201px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vpy_nombre__40(Widget widget)
{
	widget.addAttribute("field_weight","499");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","201");
	widget.addAttribute("name","CajaSegui:vpy_nombre.");
	widget.addAttribute("displayleft","499");
	widget.addAttribute("size","33");
	widget.addAttribute("displaytop","153");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","201");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}

private void setAttrFor_div_vve_nombre__30(Widget widget)
{
	widget.addStyle("left","160px");
	widget.addStyle("top","862px");
	widget.addStyle("width","250px");
	widget.addStyle("height","22px");
}

private void setAttrFor_vve_nombre__40(Widget widget)
{
	widget.addAttribute("field_weight","1799");
	widget.addAttribute("field_type","text");
	widget.addAttribute("type","text");
	widget.addAttribute("displaywidth","250");
	widget.addAttribute("name","CajaSegui:vve_nombre.");
	widget.addAttribute("displayleft","160");
	widget.addAttribute("size","41");
	widget.addAttribute("displaytop","862");
	widget.addAttribute("displayheight","22");
	widget.addAttribute("fieldheight","22");
	widget.addAttribute("fieldwidth","250");
	widget.addStyle("font-size","12");
	widget.addStyle("color","Black");
	widget.setClass("textfield");
	widget.addStyle("overflow","hidden");
}
private void dodiv_CajaSegui__10(Widget div_CajaSegui__10)
    {
    ((ContainerWidget)this).addComponent(div_CajaSegui__10,"div_CajaSegui_");
    setAttrFor_div_CajaSegui__10(div_CajaSegui__10);
    FieldSetWidget CajaSegui__20 = new FieldSetWidget();
        {
        ((ContainerWidget)div_CajaSegui__10).addComponent(CajaSegui__20,"CajaSegui_");
        setAttrFor_CajaSegui__20(CajaSegui__20);
        DivPanelWidget div_PUBLIC_vps_prosigue__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_PUBLIC_vps_prosigue__30,"div_PUBLIC_vps_prosigue_");
            setAttrFor_div_PUBLIC_vps_prosigue__30(div_PUBLIC_vps_prosigue__30);
            DataViewWidget PUBLIC_vps_prosigue__40 = new DataViewWidget();
                {
                ((ContainerWidget)div_PUBLIC_vps_prosigue__30).addComponent(PUBLIC_vps_prosigue__40,"PUBLIC_vps_prosigue_");
                setAttrFor_PUBLIC_vps_prosigue__40(PUBLIC_vps_prosigue__40);
                DivPanelWidget div_RepeatingArea1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vps_prosigue__40).addComponent(div_RepeatingArea1__50,"div_RepeatingArea1_");
                    setAttrFor_div_RepeatingArea1__50(div_RepeatingArea1__50);
                    RepeatingAreaWidget RepeatingArea1__60 = new RepeatingAreaWidget();
                        {
                        ((ContainerWidget)div_RepeatingArea1__50).addComponent(RepeatingArea1__60,"RepeatingArea1_");
                        setAttrFor_RepeatingArea1__60(RepeatingArea1__60);
                        RepeatingGridWidget div_FXGRID_70 = new RepeatingGridWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_FXGRID_70,"div_FXGRID");
                        DivPanelWidget div_vps_consecu__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_consecu__70,"div_vps_consecu_");
                            setAttrFor_div_vps_consecu__70(div_vps_consecu__70);
                            TextWidget vps_consecu__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_consecu__70).addComponent(vps_consecu__80,"vps_consecu_");
                                setAttrFor_vps_consecu__80(vps_consecu__80);
                                }
                            }
                        DivPanelWidget div_vps_fecha__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_fecha__70,"div_vps_fecha_");
                            setAttrFor_div_vps_fecha__70(div_vps_fecha__70);
                            TextWidget vps_fecha__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_fecha__70).addComponent(vps_fecha__80,"vps_fecha_");
                                setAttrFor_vps_fecha__80(vps_fecha__80);
                                }
                            }
                        DivPanelWidget div_vps_hora__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_hora__70,"div_vps_hora_");
                            setAttrFor_div_vps_hora__70(div_vps_hora__70);
                            TextWidget vps_hora__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_hora__70).addComponent(vps_hora__80,"vps_hora_");
                                setAttrFor_vps_hora__80(vps_hora__80);
                                }
                            }
                        DivPanelWidget div_vps_usuario__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_usuario__70,"div_vps_usuario_");
                            setAttrFor_div_vps_usuario__70(div_vps_usuario__70);
                            TextWidget vps_usuario__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_usuario__70).addComponent(vps_usuario__80,"vps_usuario_");
                                setAttrFor_vps_usuario__80(vps_usuario__80);
                                }
                            }
                        DivPanelWidget div_vps_mediocon__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_mediocon__70,"div_vps_mediocon_");
                            setAttrFor_div_vps_mediocon__70(div_vps_mediocon__70);
                            ListWidget vps_mediocon__80 = new ListWidget();
                                {
                                ((ContainerWidget)div_vps_mediocon__70).addComponent(vps_mediocon__80,"vps_mediocon_");
                                setAttrFor_vps_mediocon__80(vps_mediocon__80);
                                }
                            }
                        DivPanelWidget div_vps_califica__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_califica__70,"div_vps_califica_");
                            setAttrFor_div_vps_califica__70(div_vps_califica__70);
                            TextWidget vps_califica__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_califica__70).addComponent(vps_califica__80,"vps_califica_");
                                setAttrFor_vps_califica__80(vps_califica__80);
                                }
                            }
                        DivPanelWidget div_xpc_nombre__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_xpc_nombre__70,"div_xpc_nombre_");
                            setAttrFor_div_xpc_nombre__70(div_xpc_nombre__70);
                            TextWidget xpc_nombre__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_xpc_nombre__70).addComponent(xpc_nombre__80,"xpc_nombre_");
                                setAttrFor_xpc_nombre__80(xpc_nombre__80);
                                }
                            }
                        DivPanelWidget div_vps_estado__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_estado__70,"div_vps_estado_");
                            setAttrFor_div_vps_estado__70(div_vps_estado__70);
                            ListWidget vps_estado__80 = new ListWidget();
                                {
                                ((ContainerWidget)div_vps_estado__70).addComponent(vps_estado__80,"vps_estado_");
                                setAttrFor_vps_estado__80(vps_estado__80);
                                }
                            }
                        DivPanelWidget div_vps_f_pcontacto__70 = new DivPanelWidget();
                            {
                            ((ContainerWidget)RepeatingArea1__60).addComponent(div_vps_f_pcontacto__70,"div_vps_f_pcontacto_");
                            setAttrFor_div_vps_f_pcontacto__70(div_vps_f_pcontacto__70);
                            TextWidget vps_f_pcontacto__80 = new TextWidget();
                                {
                                ((ContainerWidget)div_vps_f_pcontacto__70).addComponent(vps_f_pcontacto__80,"vps_f_pcontacto_");
                                setAttrFor_vps_f_pcontacto__80(vps_f_pcontacto__80);
                                }
                            }
                            div_FXGRID_70.addAttribute("id","CajaSegui:PUBLIC_vps_prosigue_FXGRID");
                            div_FXGRID_70.addStyle("top","0");
                            div_FXGRID_70.addStyle("left","0");
                            div_FXGRID_70.addStyle("width","866");
                            div_FXGRID_70.addStyle("height","205");
                            div_FXGRID_70.addStyle("overflow-x","hidden");
                            div_FXGRID_70.addStyle("overflow-y","hidden");
                            div_FXGRID_70.addAttribute("jsinclude","NXJGrid.js");
                            div_FXGRID_70.addAttribute("jslinks","NXJGrid.css");
                            div_FXGRID_70.addAttribute("jsinit","var combo4 = ['Email', 'Telefono', 'Fax', 'Personal']; var combo7 = ['Si esta interesado', 'Medianamente Interesado', 'No esta interesado'];    var CajaSegui_PUBLIC_vps_prosigue_RepeatingArea1__FXColumns = [new NXJGridColumn( 	'Consecutivo', 	'1', 	'0', 	'74', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_consecu', 'CajaSegui:PUBLIC_vps_prosigue:vps_consecu.', '', ''), new NXJGridColumn( 	'Fecha', 	'1', 	'2', 	'67', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_fecha', 'CajaSegui:PUBLIC_vps_prosigue:vps_fecha.', '', ''), new NXJGridColumn( 	'Hora', 	'1', 	'1', 	'61', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_hora', 'CajaSegui:PUBLIC_vps_prosigue:vps_hora.', '', ''), new NXJGridColumn( 	'Usuario', 	'1', 	'1', 	'54', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_usuario', 'CajaSegui:PUBLIC_vps_prosigue:vps_usuario.', '', ''), new NXJGridColumn( 	'Medio Contacto', 	'3', 	'1', 	'93', 	'', 	combo4, 	'Email', 	'textfield', 	true, 	true, 	'vps_mediocon', 'CajaSegui:PUBLIC_vps_prosigue:vps_mediocon.', '', ''), new NXJGridColumn( 	'Seguimiento', 	'1', 	'1', 	'74', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_califica', 'CajaSegui:PUBLIC_vps_prosigue:vps_califica.', '', ''), new NXJGridColumn( 	'Descripcion', 	'1', 	'1', 	'237', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'', 'CajaSegui:PUBLIC_vps_prosigue:xpc_nombre.', '', ''), new NXJGridColumn( 	'Estado', 	'3', 	'1', 	'94', 	'', 	combo7, 	'Si esta interesado', 	'textfield', 	true, 	true, 	'vps_estado', 'CajaSegui:PUBLIC_vps_prosigue:vps_estado.', '', ''), new NXJGridColumn( 	'Fecha Contacto', 	'1', 	'2', 	'93', 	' text-align: Left', 	new Array(), 	null, 	'textfield', 	true, 	true, 	'vps_f_pcontacto', 'CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto.', '', '') ]; ; if (!window.namesToComponents['CajaSegui:PUBLIC_vps_prosigue_FXGRID'])     {     window.namesToComponents['CajaSegui:PUBLIC_vps_prosigue_FXGRID'] = new NXJGrid('CajaSegui:PUBLIC_vps_prosigue_FXGRID', CajaSegui_PUBLIC_vps_prosigue_RepeatingArea1__FXColumns, 22, null, null, '__NXJ_CONTEXT_PATH__/unify', 'S,M,T,W,T,F,S', 'Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre', 'file:///C:/Unify/NXJ/web-app/unify', 'file:/C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content/');     } ");
                            }
                        }
                    }
                DivPanelWidget div_label1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vps_prosigue__40).addComponent(div_label1__50,"div_label1_");
                    setAttrFor_div_label1__50(div_label1__50);
                    LabelWidget label1__60 = new LabelWidget();
                        {
                        ((ContainerWidget)div_label1__50).addComponent(label1__60,"label1_");
                        setAttrFor_label1__60(label1__60);
                        }
                    }
                DivPanelWidget div_textfield1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vps_prosigue__40).addComponent(div_textfield1__50,"div_textfield1_");
                    setAttrFor_div_textfield1__50(div_textfield1__50);
                    TextWidget textfield1__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_textfield1__50).addComponent(textfield1__60,"textfield1_");
                        setAttrFor_textfield1__60(textfield1__60);
                        }
                    }
                DivPanelWidget div_vps_comentario1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)PUBLIC_vps_prosigue__40).addComponent(div_vps_comentario1__50,"div_vps_comentario1_");
                    setAttrFor_div_vps_comentario1__50(div_vps_comentario1__50);
                    TextWidget vps_comentario1__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_vps_comentario1__50).addComponent(vps_comentario1__60,"vps_comentario1_");
                        setAttrFor_vps_comentario1__60(vps_comentario1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_box11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_box11__30,"div_box11_");
            setAttrFor_div_box11__30(div_box11__30);
            FieldSetWidget box11__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_box11__30).addComponent(box11__40,"box11_");
                setAttrFor_box11__40(box11__40);
                DivPanelWidget div_image1__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)box11__40).addComponent(div_image1__50,"div_image1_");
                    setAttrFor_div_image1__50(div_image1__50);
                    nxjLayout.ItemsForm.Logo_nxjLayoutAttr image1__60 = new nxjLayout.ItemsForm.Logo_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_image1__50).addComponent(image1__60,"image1_");
                        setAttrFor_image1__60(image1__60);
                        }
                    }
                }
            }
        DivPanelWidget div_cajaarribaSProspectos__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_cajaarribaSProspectos__30,"div_cajaarribaSProspectos_");
            setAttrFor_div_cajaarribaSProspectos__30(div_cajaarribaSProspectos__30);
            FieldSetWidget cajaarribaSProspectos__40 = new FieldSetWidget();
                {
                ((ContainerWidget)div_cajaarribaSProspectos__30).addComponent(cajaarribaSProspectos__40,"cajaarribaSProspectos_");
                setAttrFor_cajaarribaSProspectos__40(cajaarribaSProspectos__40);
                DivPanelWidget div_actualempresa__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaSProspectos__40).addComponent(div_actualempresa__50,"div_actualempresa_");
                    setAttrFor_div_actualempresa__50(div_actualempresa__50);
                    TextWidget actualempresa__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualempresa__50).addComponent(actualempresa__60,"actualempresa_");
                        setAttrFor_actualempresa__60(actualempresa__60);
                        }
                    }
                DivPanelWidget div_actualusuario__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaSProspectos__40).addComponent(div_actualusuario__50,"div_actualusuario_");
                    setAttrFor_div_actualusuario__50(div_actualusuario__50);
                    TextWidget actualusuario__60 = new TextWidget();
                        {
                        ((ContainerWidget)div_actualusuario__50).addComponent(actualusuario__60,"actualusuario_");
                        setAttrFor_actualusuario__60(actualusuario__60);
                        }
                    }
                DivPanelWidget div_label1__51 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaSProspectos__40).addComponent(div_label1__51,"div_label1_");
                    setAttrFor_div_label1__51(div_label1__51);
                    nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr label1__61 = new nxjLayout.ItemsForm.TituloLBL_nxjLayoutAttr();
                        {
                        ((ContainerWidget)div_label1__51).addComponent(label1__61,"label1_");
                        setAttrFor_label1__61(label1__61);
                        }
                    }
                DivPanelWidget div_label211__50 = new DivPanelWidget();
                    {
                    ((ContainerWidget)cajaarribaSProspectos__40).addComponent(div_label211__50,"div_label211_");
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
            ((ContainerWidget)CajaSegui__20).addComponent(div_label1__30,"div_label1_");
            setAttrFor_div_label1__30(div_label1__30);
            LabelWidget label1__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label1__30).addComponent(label1__40,"label1_");
                setAttrFor_label1__40(label1__40);
                }
            }
        DivPanelWidget div_label10__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label10__30,"div_label10_");
            setAttrFor_div_label10__30(div_label10__30);
            LabelWidget label10__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label10__30).addComponent(label10__40,"label10_");
                setAttrFor_label10__40(label10__40);
                }
            }
        DivPanelWidget div_label11__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label11__30,"div_label11_");
            setAttrFor_div_label11__30(div_label11__30);
            LabelWidget label11__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11__30).addComponent(label11__40,"label11_");
                setAttrFor_label11__40(label11__40);
                }
            }
        DivPanelWidget div_label111__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label111__30,"div_label111_");
            setAttrFor_div_label111__30(div_label111__30);
            LabelWidget label111__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label111__30).addComponent(label111__40,"label111_");
                setAttrFor_label111__40(label111__40);
                }
            }
        DivPanelWidget div_label11211__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label11211__30,"div_label11211_");
            setAttrFor_div_label11211__30(div_label11211__30);
            LabelWidget label11211__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label11211__30).addComponent(label11211__40,"label11211_");
                setAttrFor_label11211__40(label11211__40);
                }
            }
        DivPanelWidget div_label12__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label12__30,"div_label12_");
            setAttrFor_div_label12__30(div_label12__30);
            LabelWidget label12__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label12__30).addComponent(label12__40,"label12_");
                setAttrFor_label12__40(label12__40);
                }
            }
        DivPanelWidget div_label13__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label13__30,"div_label13_");
            setAttrFor_div_label13__30(div_label13__30);
            LabelWidget label13__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label13__30).addComponent(label13__40,"label13_");
                setAttrFor_label13__40(label13__40);
                }
            }
        DivPanelWidget div_label14__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label14__30,"div_label14_");
            setAttrFor_div_label14__30(div_label14__30);
            LabelWidget label14__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label14__30).addComponent(label14__40,"label14_");
                setAttrFor_label14__40(label14__40);
                }
            }
        DivPanelWidget div_label2__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label2__30,"div_label2_");
            setAttrFor_div_label2__30(div_label2__30);
            LabelWidget label2__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label2__30).addComponent(label2__40,"label2_");
                setAttrFor_label2__40(label2__40);
                }
            }
        DivPanelWidget div_label3__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label3__30,"div_label3_");
            setAttrFor_div_label3__30(div_label3__30);
            LabelWidget label3__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label3__30).addComponent(label3__40,"label3_");
                setAttrFor_label3__40(label3__40);
                }
            }
        DivPanelWidget div_label4__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label4__30,"div_label4_");
            setAttrFor_div_label4__30(div_label4__30);
            LabelWidget label4__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label4__30).addComponent(label4__40,"label4_");
                setAttrFor_label4__40(label4__40);
                }
            }
        DivPanelWidget div_label5__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label5__30,"div_label5_");
            setAttrFor_div_label5__30(div_label5__30);
            LabelWidget label5__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label5__30).addComponent(label5__40,"label5_");
                setAttrFor_label5__40(label5__40);
                }
            }
        DivPanelWidget div_label6__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label6__30,"div_label6_");
            setAttrFor_div_label6__30(div_label6__30);
            LabelWidget label6__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label6__30).addComponent(label6__40,"label6_");
                setAttrFor_label6__40(label6__40);
                }
            }
        DivPanelWidget div_label7__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label7__30,"div_label7_");
            setAttrFor_div_label7__30(div_label7__30);
            LabelWidget label7__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label7__30).addComponent(label7__40,"label7_");
                setAttrFor_label7__40(label7__40);
                }
            }
        DivPanelWidget div_label8__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label8__30,"div_label8_");
            setAttrFor_div_label8__30(div_label8__30);
            LabelWidget label8__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label8__30).addComponent(label8__40,"label8_");
                setAttrFor_label8__40(label8__40);
                }
            }
        DivPanelWidget div_label9__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_label9__30,"div_label9_");
            setAttrFor_div_label9__30(div_label9__30);
            LabelWidget label9__40 = new LabelWidget();
                {
                ((ContainerWidget)div_label9__30).addComponent(label9__40,"label9_");
                setAttrFor_label9__40(label9__40);
                }
            }
        DivPanelWidget div_line112__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_line112__30,"div_line112_");
            setAttrFor_div_line112__30(div_line112__30);
            LineWidget line112__40 = new LineWidget();
                {
                ((ContainerWidget)div_line112__30).addComponent(line112__40,"line112_");
                setAttrFor_line112__40(line112__40);
                }
            }
        DivPanelWidget div_line1121__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_line1121__30,"div_line1121_");
            setAttrFor_div_line1121__30(div_line1121__30);
            LineWidget line1121__40 = new LineWidget();
                {
                ((ContainerWidget)div_line1121__30).addComponent(line1121__40,"line1121_");
                setAttrFor_line1121__40(line1121__40);
                }
            }
        DivPanelWidget div_vpp_ciudad__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_ciudad__30,"div_vpp_ciudad_");
            setAttrFor_div_vpp_ciudad__30(div_vpp_ciudad__30);
            ListWidget vpp_ciudad__40 = new ListWidget();
                {
                ((ContainerWidget)div_vpp_ciudad__30).addComponent(vpp_ciudad__40,"vpp_ciudad_");
                setAttrFor_vpp_ciudad__40(vpp_ciudad__40);
                }
            }
        DivPanelWidget div_vpp_correo__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_correo__30,"div_vpp_correo_");
            setAttrFor_div_vpp_correo__30(div_vpp_correo__30);
            TextWidget vpp_correo__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_correo__30).addComponent(vpp_correo__40,"vpp_correo_");
                setAttrFor_vpp_correo__40(vpp_correo__40);
                }
            }
        DivPanelWidget div_vpp_cuanta_correo2__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_cuanta_correo2__30,"div_vpp_cuanta_correo2_");
            setAttrFor_div_vpp_cuanta_correo2__30(div_vpp_cuanta_correo2__30);
            TextWidget vpp_cuanta_correo2__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_cuanta_correo2__30).addComponent(vpp_cuanta_correo2__40,"vpp_cuanta_correo2_");
                setAttrFor_vpp_cuanta_correo2__40(vpp_cuanta_correo2__40);
                }
            }
        DivPanelWidget div_vpp_direccion__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_direccion__30,"div_vpp_direccion_");
            setAttrFor_div_vpp_direccion__30(div_vpp_direccion__30);
            TextWidget vpp_direccion__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_direccion__30).addComponent(vpp_direccion__40,"vpp_direccion_");
                setAttrFor_vpp_direccion__40(vpp_direccion__40);
                }
            }
        DivPanelWidget div_vpp_estadopro__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_estadopro__30,"div_vpp_estadopro_");
            setAttrFor_div_vpp_estadopro__30(div_vpp_estadopro__30);
            ListWidget vpp_estadopro__40 = new ListWidget();
                {
                ((ContainerWidget)div_vpp_estadopro__30).addComponent(vpp_estadopro__40,"vpp_estadopro_");
                setAttrFor_vpp_estadopro__40(vpp_estadopro__40);
                }
            }
        DivPanelWidget div_vpp_fecha__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_fecha__30,"div_vpp_fecha_");
            setAttrFor_div_vpp_fecha__30(div_vpp_fecha__30);
            DatePickerWidget vpp_fecha__40 = new DatePickerWidget();
                {
                ((ContainerWidget)div_vpp_fecha__30).addComponent(vpp_fecha__40,"vpp_fecha_");
                setAttrFor_vpp_fecha__40(vpp_fecha__40);
                }
            }
        DivPanelWidget div_vpp_fechaestado__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_fechaestado__30,"div_vpp_fechaestado_");
            setAttrFor_div_vpp_fechaestado__30(div_vpp_fechaestado__30);
            DatePickerWidget vpp_fechaestado__40 = new DatePickerWidget();
                {
                ((ContainerWidget)div_vpp_fechaestado__30).addComponent(vpp_fechaestado__40,"vpp_fechaestado_");
                setAttrFor_vpp_fechaestado__40(vpp_fechaestado__40);
                }
            }
        DivPanelWidget div_vpp_nacionalidad__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_nacionalidad__30,"div_vpp_nacionalidad_");
            setAttrFor_div_vpp_nacionalidad__30(div_vpp_nacionalidad__30);
            ListWidget vpp_nacionalidad__40 = new ListWidget();
                {
                ((ContainerWidget)div_vpp_nacionalidad__30).addComponent(vpp_nacionalidad__40,"vpp_nacionalidad_");
                setAttrFor_vpp_nacionalidad__40(vpp_nacionalidad__40);
                }
            }
        DivPanelWidget div_vpp_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_nombre__30,"div_vpp_nombre_");
            setAttrFor_div_vpp_nombre__30(div_vpp_nombre__30);
            TextWidget vpp_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_nombre__30).addComponent(vpp_nombre__40,"vpp_nombre_");
                setAttrFor_vpp_nombre__40(vpp_nombre__40);
                }
            }
        DivPanelWidget div_vpp_numero__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_numero__30,"div_vpp_numero_");
            setAttrFor_div_vpp_numero__30(div_vpp_numero__30);
            TextWidget vpp_numero__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_numero__30).addComponent(vpp_numero__40,"vpp_numero_");
                setAttrFor_vpp_numero__40(vpp_numero__40);
                }
            }
        DivPanelWidget div_vpp_proyecto__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_proyecto__30,"div_vpp_proyecto_");
            setAttrFor_div_vpp_proyecto__30(div_vpp_proyecto__30);
            TextWidget vpp_proyecto__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_proyecto__30).addComponent(vpp_proyecto__40,"vpp_proyecto_");
                setAttrFor_vpp_proyecto__40(vpp_proyecto__40);
                }
            }
        DivPanelWidget div_vpp_telofi__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_telofi__30,"div_vpp_telofi_");
            setAttrFor_div_vpp_telofi__30(div_vpp_telofi__30);
            TextWidget vpp_telofi__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_telofi__30).addComponent(vpp_telofi__40,"vpp_telofi_");
                setAttrFor_vpp_telofi__40(vpp_telofi__40);
                }
            }
        DivPanelWidget div_vpp_telres__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_telres__30,"div_vpp_telres_");
            setAttrFor_div_vpp_telres__30(div_vpp_telres__30);
            TextWidget vpp_telres__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_telres__30).addComponent(vpp_telres__40,"vpp_telres_");
                setAttrFor_vpp_telres__40(vpp_telres__40);
                }
            }
        DivPanelWidget div_vpp_vendedor__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpp_vendedor__30,"div_vpp_vendedor_");
            setAttrFor_div_vpp_vendedor__30(div_vpp_vendedor__30);
            TextWidget vpp_vendedor__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpp_vendedor__30).addComponent(vpp_vendedor__40,"vpp_vendedor_");
                setAttrFor_vpp_vendedor__40(vpp_vendedor__40);
                }
            }
        DivPanelWidget div_vpy_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vpy_nombre__30,"div_vpy_nombre_");
            setAttrFor_div_vpy_nombre__30(div_vpy_nombre__30);
            TextWidget vpy_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vpy_nombre__30).addComponent(vpy_nombre__40,"vpy_nombre_");
                setAttrFor_vpy_nombre__40(vpy_nombre__40);
                }
            }
        DivPanelWidget div_vve_nombre__30 = new DivPanelWidget();
            {
            ((ContainerWidget)CajaSegui__20).addComponent(div_vve_nombre__30,"div_vve_nombre_");
            setAttrFor_div_vve_nombre__30(div_vve_nombre__30);
            TextWidget vve_nombre__40 = new TextWidget();
                {
                ((ContainerWidget)div_vve_nombre__30).addComponent(vve_nombre__40,"vve_nombre_");
                setAttrFor_vve_nombre__40(vve_nombre__40);
                }
            }
        }
    }
}
