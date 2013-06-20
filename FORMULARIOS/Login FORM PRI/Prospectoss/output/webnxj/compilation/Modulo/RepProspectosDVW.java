package Modulo;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.unify.nxj.mgr.LotusMigration;
import com.unify.nxj.mgr.NXJDataView;
import com.unify.nxj.mgr.NXJForm;
import com.unify.nxj.mgr.NXJActivityForm;
import com.unify.nxj.mgr.NXJSession;
import com.unify.nxj.mgr.NXJCommand;
import com.unify.nxj.mgr.NXJClearToAddExpression;
import com.unify.nxj.mgr.NXJClearToFindExpression;
import com.unify.nxj.mgr.NXJZoomReturnExpressions;
import com.unify.nxj.mgr.NXJZoomReturnValuesInto;
import com.unify.nxj.mgr.StatusCode;
import com.unify.nxj.mgr.datatypes.CopyBack;
import com.unify.nxj.mgr.datatypes.Nullable;
import com.unify.nxj.mgr.datatypes.NullableVariable;
import com.unify.nxj.mgr.datatypes.NullableField;
import com.unify.nxj.mgr.datatypes.NullableAmount;
import com.unify.nxj.mgr.datatypes.NullableAmountVariable;
import com.unify.nxj.mgr.datatypes.NullableAmountField;
import com.unify.nxj.mgr.datatypes.NullableAny;
import com.unify.nxj.mgr.datatypes.NullableAnyVariable;
import com.unify.nxj.mgr.datatypes.NullableBinary;
import com.unify.nxj.mgr.datatypes.NullableBinaryVariable;
import com.unify.nxj.mgr.datatypes.NullableBinaryField;
import com.unify.nxj.mgr.datatypes.NullableBoolean;
import com.unify.nxj.mgr.datatypes.NullableBooleanVariable;
import com.unify.nxj.mgr.datatypes.NullableBooleanField;
import com.unify.nxj.mgr.datatypes.NullableCopyBack;
import com.unify.nxj.mgr.datatypes.NullableDate;
import com.unify.nxj.mgr.datatypes.NullableDateVariable;
import com.unify.nxj.mgr.datatypes.NullableDateField;
import com.unify.nxj.mgr.datatypes.NullableDateTime;
import com.unify.nxj.mgr.datatypes.NullableDateTimeVariable;
import com.unify.nxj.mgr.datatypes.NullableDateTimeField;
import com.unify.nxj.mgr.datatypes.NullableFactory;
import com.unify.nxj.mgr.datatypes.NullableFloat;
import com.unify.nxj.mgr.datatypes.NullableFloatVariable;
import com.unify.nxj.mgr.datatypes.NullableFloatField;
import com.unify.nxj.mgr.datatypes.NullableNumeric;
import com.unify.nxj.mgr.datatypes.NullableNumericVariable;
import com.unify.nxj.mgr.datatypes.NullableNumericField;
import com.unify.nxj.mgr.datatypes.NullableString;
import com.unify.nxj.mgr.datatypes.NullableStringVariable;
import com.unify.nxj.mgr.datatypes.NullableStringField;
import com.unify.nxj.mgr.datatypes.NullableText;
import com.unify.nxj.mgr.datatypes.NullableTextVariable;
import com.unify.nxj.mgr.datatypes.NullableTextField;
import com.unify.nxj.mgr.datatypes.NullableTime;
import com.unify.nxj.mgr.datatypes.NullableTimeVariable;
import com.unify.nxj.mgr.datatypes.NullableTimeField;
import com.unify.nxj.mgr.datatypes.NXJException;
import com.unify.nxj.mgr.datatypes.NXJUndefinedValueException;
import com.unify.nxj.mgr.datatypes.NXJNullValueException;
import com.unify.nxj.mgr.datatypes.NXJType;
import com.unify.nxj.mgr.datatypes.NXJButtonControl;
import com.unify.nxj.mgr.datatypes.NXJDynamicTextControl;
import com.unify.nxj.mgr.datatypes.NXJFileChooserControl;
import com.unify.nxj.mgr.datatypes.NXJFontAwareControl;
import com.unify.nxj.mgr.datatypes.NXJIframeControl;
import com.unify.nxj.mgr.datatypes.NXJImageButtonControl;
import com.unify.nxj.mgr.datatypes.NXJImageControl;
import com.unify.nxj.mgr.datatypes.NXJJavascriptControl;
import com.unify.nxj.mgr.datatypes.NXJLabelControl;
import com.unify.nxj.mgr.datatypes.NXJLineControl;
import com.unify.nxj.mgr.datatypes.NXJLinkControl;
import com.unify.nxj.mgr.datatypes.NXJStyledTextBoxControl;
import com.unify.nxj.mgr.datatypes.NXJTreeControl;
import com.unify.nxj.mgr.datatypes.NXJTreeNode;
import com.unify.nxj.mgr.datatypes.NXJLeafNode;
import com.unify.nxj.mgr.datatypes.NXJNavigationBarControl;
import com.unify.nxj.mgr.datatypes.NXJNonLeafNode;
import com.unify.nxj.mgr.datatypes.NXJMenuControl;
import com.unify.nxj.mgr.datatypes.NXJMenuNode;
import com.unify.nxj.mgr.datatypes.NXJMenu;
import com.unify.nxj.mgr.datatypes.NXJMenuItem;
import com.unify.nxj.mgr.datatypes.NXJMenuSeparator;
import com.unify.nxj.mgr.DataViewEventListener;
import com.unify.nxj.mgr.FormEventListener;
import com.unify.nxj.mgr.FieldEventListener;
import com.unify.nxj.mgr.FileChooserEventListener;
import com.unify.nxj.mgr.dataConnection.NXJDataConnection;
import com.unify.nxj.mgr.dataConnection.NXJDataConnectionException;
import com.unify.nxj.mgr.dataConnection.NXJDataConnectionOperationException;
import com.unify.nxj.mgr.dataConnection.NXJParameter;
import com.unify.nxj.mgr.dataConnection.NXJPreparedCall;
import com.unify.nxj.mgr.NXJExceptionHandler;
import com.unify.nxj.mgr.NXJExceptionHandler.NXJExceptionEvent;
import com.unify.nxj.mgr.NXJExceptionHandlingLimitExceededException;
import com.unify.nxj.mgr.NXJScriptException;
import com.unify.nxj.mgr.NXJFormScriptException;
import com.unify.nxj.mgr.NXJDataViewScriptException;
import com.unify.nxj.mgr.NXJFieldScriptException;
import com.unify.nxj.mgr.NXJDataViewTargetException;
import com.unify.nxj.mgr.NXJFileUploadException;
import com.unify.nxj.mgr.NXJRereadAndVerifyException;
import com.unify.nxj.mgr.dataConnection.javaAdapter.NXJJavaClassDataSource;
import com.unify.nxj.mgr.dataConnection.javaAdapter.NXJJavaClassTargetController;
import com.unify.nxj.mgr.dataConnection.spi.NXJColumnSearchCriteria;
import com.unify.nxj.mgr.dataConnection.spi.NXJColumnSearchRange;
import com.unify.nxj.mgr.dataConnection.NXJColumnSortCriteria;
import com.unify.pub.NameValuePair;

public class RepProspectosDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    private RepProspectosDVW RepProspectosDVW = this;
    public class TodosLoProy
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void afterField()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(TodosLoProy).eqOp("T").getBooleanValueNullOk())
		{
		proyecto.setVisible(false);
		proyecto.assign(us$registerPool.allocateRegister().load("*"));
		}
	    else
		{
		proyecto.setVisible(true);
		}
	} // afterField

	public TodosLoProy()
	{
	    super(Modulo.RepProspectosDVW.this, "TodosLoProy", false, true, 100);
	    setStyleClass("checkbox");
	    us$setView("checkbox");
	    setAutoAccept(true);
	    setFindable(false);
	    us$executesCodeAfterInput = true;
	} // <init>
    } // TodosLoProy

    public TodosLoProy TodosLoProy = new TodosLoProy();
    public class TodosLosVend
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void afterField()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(TodosLosVend).eqOp("T").getBooleanValueNullOk())
		{
		vendedor.setVisible(false);
		vendedor.assign(us$registerPool.allocateRegister().load("*"));
		}
	    else
		{
		vendedor.setVisible(true);
		}
	} // afterField

	public TodosLosVend()
	{
	    super(Modulo.RepProspectosDVW.this, "TodosLosVend", false, true, 100);
	    setStyleClass("checkbox");
	    us$setView("checkbox");
	    setAutoAccept(true);
	    setFindable(false);
	    us$executesCodeAfterInput = true;
	} // <init>
    } // TodosLosVend

    public TodosLosVend TodosLosVend = new TodosLosVend();
    public class ejecutarbtn
	extends ItemsForm.Boton
    {

	public ejecutarbtn()
	{
	    super(Modulo.RepProspectosDVW.this, "ejecutarbtn", false);
	} // <init>
    } // ejecutarbtn

    public ejecutarbtn ejecutarbtn = new ejecutarbtn();
    public NullableDateField fecha1 = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "fecha1", false, true, 100);
    public NullableDateField fecha2 = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "fecha2", false, true, 100);
    public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
    public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
    public NXJLabelControl label111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label111", false);
    public NXJLabelControl label12 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label12", false);
    public NXJLabelControl label13 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label13", false);
    public NXJLabelControl label14 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label14", false);
    public NXJLabelControl label141 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label141", false);
    public class proyecto
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public java.util.List us$evaluateListboxQuery()
	    throws java.sql.SQLException, com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
	{
	    int us$rowCount = 0;
	    java.util.List us$list = new java.util.ArrayList();
	    String us$proj1;
	    String us$proj2;

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn1 = getConnection();
		java.sql.PreparedStatement us$stmt1 = null;
		ResultSet us$rs1 = null;
		try
		    {
		    us$stmt1 = us$conn1.prepareStatement("SELECT vpy_nombre, vpy_codigo FROM vpy_proyectos ORDER BY vpy_nombre ASC");
		    us$rs1 = us$stmt1.executeQuery();
		    int us$rowsTouched1 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd1 = us$rs1.getMetaData();
			if (us$rsmd1.getColumnCount() != 2)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd1.getColumnCount()), "2"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter1 = us$conn1.createDataIterator(us$rs1);
			while (us$getter1.next())
			    {
			    ++us$rowsTouched1;
			    us$proj1 = us$getter1.getString(1);
			    us$proj2 = us$getter1.getString(2);

				{
				if (us$rowCount++ == 200)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj2));
				}
			    }
			}
		    finally
			{
			if (us$rowsTouched1 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs1 != null)
			    us$rs1.close();
			}
		    }
		catch (SQLException us$ex1)
		    {
		    getSession().us$setStatus(us$conn1.mapToStatusCode(us$ex1));
		    throw us$ex1;
		    }
		catch (NXJDataConnectionException us$ex1)
		    {
		    getSession().us$setStatus(us$conn1.mapToStatusCode(us$ex1));
		    throw us$ex1;
		    }
		finally
		    {
		    if (us$stmt1 != null)
			us$conn1.us$closeStatement(us$stmt1);
		    }
		}
	    return us$list;
	} // us$evaluateListboxQuery

	public proyecto()
	{
	    super(Modulo.RepProspectosDVW.this, "proyecto", false, true, 100);
	    setStyleClass("textfield");
	    us$setView("select");
	    setFindable(false);
	} // <init>
    } // proyecto

    public proyecto proyecto = new proyecto();
    public class regresarbtn
	extends ItemsForm.Boton
    {

	public regresarbtn()
	{
	    super(Modulo.RepProspectosDVW.this, "regresarbtn", false);
	} // <init>
    } // regresarbtn

    public regresarbtn regresarbtn = new regresarbtn();
    public class vendedor
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public java.util.List us$evaluateListboxQuery()
	    throws java.sql.SQLException, com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
	{
	    int us$rowCount = 0;
	    java.util.List us$list = new java.util.ArrayList();
	    String us$proj1;
	    String us$proj2;

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn2 = getConnection();
		java.sql.PreparedStatement us$stmt2 = null;
		ResultSet us$rs2 = null;
		try
		    {
		    us$stmt2 = us$conn2.prepareStatement("SELECT vve_nombre, vve_codigo FROM vve_vendedora ORDER BY vve_nombre ASC");
		    us$rs2 = us$stmt2.executeQuery();
		    int us$rowsTouched2 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd2 = us$rs2.getMetaData();
			if (us$rsmd2.getColumnCount() != 2)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd2.getColumnCount()), "2"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter2 = us$conn2.createDataIterator(us$rs2);
			while (us$getter2.next())
			    {
			    ++us$rowsTouched2;
			    us$proj1 = us$getter2.getString(1);
			    us$proj2 = us$getter2.getString(2);

				{
				if (us$rowCount++ == 200)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj2));
				}
			    }
			}
		    finally
			{
			if (us$rowsTouched2 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs2 != null)
			    us$rs2.close();
			}
		    }
		catch (SQLException us$ex2)
		    {
		    getSession().us$setStatus(us$conn2.mapToStatusCode(us$ex2));
		    throw us$ex2;
		    }
		catch (NXJDataConnectionException us$ex2)
		    {
		    getSession().us$setStatus(us$conn2.mapToStatusCode(us$ex2));
		    throw us$ex2;
		    }
		finally
		    {
		    if (us$stmt2 != null)
			us$conn2.us$closeStatement(us$stmt2);
		    }
		}
	    return us$list;
	} // us$evaluateListboxQuery

	public vendedor()
	{
	    super(Modulo.RepProspectosDVW.this, "vendedor", false, true, 100);
	    setStyleClass("textfield");
	    us$setView("select");
	    setFindable(false);
	} // <init>
    } // vendedor

    public vendedor vendedor = new vendedor();
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.RepProspectosDVW.box11.this, "image1", false);
	    } // <init>
	} // image1

	public image1 image1 = new image1();

	public box11(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("box11", enclosingContainer);
	    us$setBackgroundColor("#e30000");
	} // <init>
    } // box11

    public final box11 box11 = new box11(this);
    public class box111
	extends com.unify.nxj.mgr.NXJBox
    {
	public class label1
	    extends ItemsForm.TituloLBL
	{

	    public label1()
	    {
		super(Modulo.RepProspectosDVW.box111.this, "label1", false);
	    } // <init>
	} // label1

	public label1 label1 = new label1();
	public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	public NullableStringField textfield11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield11", false, true, 100);

	public box111(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("box111", enclosingContainer);
	    us$setBackgroundColor("#e30000");
	    box111propertySetter_0();
	} // <init>

	private void box111propertySetter_0()
	{
	    textfield1.setStyleClass("textfield");
	    textfield1.us$setView("text");
	    textfield1.setFindable(false);
	    textfield1.setStopForInput(false);
	    textfield11.setStyleClass("textfield");
	    textfield11.us$setView("text");
	    textfield11.setFindable(false);
	    textfield11.setStopForInput(false);
	} // box111propertySetter_0
    } // box111

    public final box111 box111 = new box111(this);
    public final class reportecmd
	extends NXJCommand
    {

	public reportecmd()
	{
	    super("reportecmd", Modulo.RepProspectosDVW.this, 3, true, 1);
	    us$addCommand(this);
	} // <init>

	public void run()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    NullableString vFecha1 = (NullableString)NullableFactory.createNullableString("vFecha1").assign(us$registerPool.allocateRegister().load(fecha1.toString()));
	    NullableString vFecha2 = (NullableString)NullableFactory.createNullableString("vFecha2").assign(us$registerPool.allocateRegister().load(fecha2.toString()));
	    NullableString strReporte = NullableFactory.createNullableString("strReporte");
	    vFecha1.assign(us$registerPool.allocateRegister().load(vFecha1.substring(3, 5).toString() + "/" + vFecha1.substring(0, 2).toString() + "/" + vFecha1.substring(6, 10).toString()));
	    vFecha2.assign(us$registerPool.allocateRegister().load(vFecha2.substring(3, 5).toString() + "/" + vFecha2.substring(0, 2).toString() + "/" + vFecha2.substring(6, 10).toString()));
	    strReporte.assign(us$registerPool.allocateRegister().load("http://localhost:8080/birt/frameset?__report=informe_visitas.rptdesign&PROYECTO=" + proyecto.toString() + "&USUARIO=" + ((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario.toString() + "&EMPRESA=" + ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.toString() + "&FECHAI=" + vFecha1.toString() + "&FECHAF=" + vFecha2.toString()));
	    getSession().openURL(us$registerPool.allocateRegister().load(strReporte).getStringValue());
	} // run
    } // reportecmd

    public final reportecmd reportecmd = new reportecmd();

    public RepProspectosDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setConnectionName("Connection1");
	setStartInAddMode(true);
	us$setBackgroundColor("#cccccc");
	fecha1.setStyleClass("textfield");
	fecha1.us$setView("date");
	fecha1.setFindable(false);
	fecha2.setStyleClass("textfield");
	fecha2.us$setView("date");
	fecha2.setFindable(false);
	label1.setStyleClass("label");
	label1.setFontSize("12");
	label11.setStyleClass("label");
	label11.setForegroundColor("Black");
	label11.setFontFamily("Verdana");
	label11.setFontSize("14");
	label11.us$setFontWeight("bold");
	label111.setStyleClass("label");
	label111.setFontSize("12");
	label12.setStyleClass("label");
	label12.setFontSize("12");
	label13.setStyleClass("label");
	label13.setFontSize("12");
	label14.setStyleClass("label");
	label14.setFontSize("12");
	label141.setStyleClass("label");
	label141.setFontSize("12");
    } // <init>
} // RepProspectosDVW

