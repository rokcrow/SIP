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

public class CClaveFRM
    extends com.unify.nxj.mgr.NXJForm
{
    NullableString empresanombre = NullableFactory.createNullableString("empresanombre");
    NullableString xus_password = NullableFactory.createNullableString("xus_password");
    NullableDate fechaactual = (NullableDate)NullableFactory.createNullableDate("fechaactual").assign(getSession().us$getRegisterPool().allocateRegister().load(getSession().getCurrentDate()));
    NullableNumeric APassword = NullableFactory.createNullableNumeric("APassword");
    NullableNumeric intentos = (NullableNumeric)NullableFactory.createNullableNumeric("intentos").assign(getSession().us$getRegisterPool().allocateRegister().load(0));

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	cajagrandeCClaveFRM.cajaarribaCClave.actualusuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario));
	cajagrandeCClaveFRM.usuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn1 = getConnection();
	    java.sql.PreparedStatement us$stmt1 = null;
	    ResultSet us$rs1 = null;
	    try
		{
		us$stmt1 = us$conn1.prepareStatement("SELECT xus_password FROM xus_usuarios WHERE xus_usuario =  ?");
		((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario.us$setSqlParameterValue(us$stmt1, 1);
		us$rs1 = us$stmt1.executeQuery();
		int us$rowsTouched1 = 0;
		try
		    {
		    java.sql.ResultSetMetaData us$rsmd1 = us$rs1.getMetaData();
		    if (us$rsmd1.getColumnCount() != 1)
			throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
			    {
			    Integer.toString(us$rsmd1.getColumnCount()), "1"
			    }));
		    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter1 = us$conn1.createDataIterator(us$rs1);
		    if (us$getter1.next())
			{
			++us$rowsTouched1;
			us$getter1.assignValueToVariable(xus_password, 1);
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
    } // beforeForm
    private CClaveFRM CClaveFRM = this;
    public class cajagrandeCClaveFRM
	extends com.unify.nxj.mgr.NXJBox
    {
	public class button2
	    extends ItemsForm.Boton
	{

	    public button2()
	    {
		super(Modulo.CClaveFRM.cajagrandeCClaveFRM.this, "button2", false);
	    } // <init>
	} // button2

	public button2 button2 = new button2();
	public class claveactual
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(claveactual).neqOp(us$registerPool.allocateRegister().load(xus_password)).getBooleanValueNullOk())
		    {
		    intentos.assign(us$registerPool.allocateRegister().load(intentos).plusOp(1));
		    getSession().displayToMessageBox("Clave actual incorrecta.");
		    if (us$registerPool.allocateRegister().load(intentos).ltOp(3).getBooleanValueNullOk())
			{
			getSession().queueNextField(claveactual);
			}
		    else
			{
			getSession().displayToMessageBox("Excedi\u00F3 el n\u00FAmero de intentos permitidos. Intente despu\u00E9s.");
			getSession().exitToURL("salida.html");
			}
		    }
		else
		    getSession().queueNextField(nuevaclave);
	    } // onDataAccept

	    public claveactual()
	    {
		super(Modulo.CClaveFRM.cajagrandeCClaveFRM.this, "claveactual", false, true, 100);
		setStyleClass("textfield");
		us$setView("text");
		setPassword(true);
		setRequired(true);
		setFindable(false);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // claveactual

	public claveactual claveactual = new claveactual();
	public class confirmarclave
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(confirmarclave).neqOp(nuevaclave).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Las claves no coinciden. Verifique por favor.");
		    getSession().queueNextField(confirmarclave);
		    }
	    } // onDataAccept

	    public confirmarclave()
	    {
		super(Modulo.CClaveFRM.cajagrandeCClaveFRM.this, "confirmarclave", false, true, 100);
		setStyleClass("textfield");
		us$setView("text");
		setPassword(true);
		setRequired(true);
		setFindable(false);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // confirmarclave

	public confirmarclave confirmarclave = new confirmarclave();
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public class nuevaclave
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(nuevaclave).eqOp(claveactual).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La nueva clave debe ser distinta a la anterior. Verifique por favor.");
		    getSession().queueNextField(nuevaclave);
		    }
	    } // onDataAccept

	    public nuevaclave()
	    {
		super(Modulo.CClaveFRM.cajagrandeCClaveFRM.this, "nuevaclave", false, true, 100);
		setStyleClass("textfield");
		us$setView("text");
		setPassword(true);
		setRequired(false);
		setFindable(false);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // nuevaclave

	public nuevaclave nuevaclave = new nuevaclave();
	public NullableStringField usuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "usuario", false, true, 100);
	public class cajaabajoCClave
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(Modulo.CClaveFRM.cajagrandeCClaveFRM.cajaabajoCClave.this, "image1", false);
		    setWidth(164);
		    setHeight(46);
		} // <init>
	    } // image1

	    public image1 image1 = new image1();

	    public cajaabajoCClave(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaabajoCClave", enclosingContainer);
		us$setBackgroundColor("#e30000");
	    } // <init>
	} // cajaabajoCClave

	public final cajaabajoCClave cajaabajoCClave = new cajaabajoCClave(this);
	public class cajaarribaCClave
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(Modulo.CClaveFRM.cajagrandeCClaveFRM.cajaarribaCClave.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	    public cajaarribaCClave(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaCClave", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaCClavepropertySetter_0();
	    } // <init>

	    private void cajaarribaCClavepropertySetter_0()
	    {
		actualempresa.setStyleClass("textfield");
		actualempresa.us$setView("text");
		actualempresa.setFindable(false);
		actualempresa.setStopForInput(false);
		actualusuario.setStyleClass("textfield");
		actualusuario.us$setView("text");
		actualusuario.setFindable(false);
		actualusuario.setStopForInput(false);
		label211.setStyleClass("label");
	    } // cajaarribaCClavepropertySetter_0
	} // cajaarribaCClave

	public final cajaarribaCClave cajaarribaCClave = new cajaarribaCClave(this);

	public cajagrandeCClaveFRM(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeCClaveFRM", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeCClaveFRMpropertySetter_0();
	} // <init>

	private void cajagrandeCClaveFRMpropertySetter_0()
	{
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	    label3.setStyleClass("label");
	    label3.setFontSize("12");
	    label31.setStyleClass("label");
	    label31.setFontSize("12");
	    label311.setStyleClass("label");
	    label311.setFontSize("12");
	    label3111.setStyleClass("label");
	    label3111.setFontSize("12");
	    usuario.setStyleClass("textfield");
	    usuario.us$setView("text");
	    usuario.setFindable(false);
	    usuario.setStopForInput(false);
	} // cajagrandeCClaveFRMpropertySetter_0
    } // cajagrandeCClaveFRM

    public final cajagrandeCClaveFRM cajagrandeCClaveFRM = new cajagrandeCClaveFRM(this);
    public final class cambiarclave
	extends NXJCommand
    {

	public cambiarclave()
	{
	    super("cambiarclave", Modulo.CClaveFRM.this, 3, true, 1);
	    us$addCommand(this);
	} // <init>

	public void run()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(cajagrandeCClaveFRM.nuevaclave).eqOp(cajagrandeCClaveFRM.confirmarclave).getBooleanValueNullOk())
		{

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("UPDATE xus_usuarios SET xus_password =  ? , xus_factualiza =  ?  WHERE xus_usuario =  ?");
			cajagrandeCClaveFRM.nuevaclave.us$setSqlParameterValue(us$stmt2, 1);
			fechaactual.us$setSqlParameterValue(us$stmt2, 2);
			cajagrandeCClaveFRM.usuario.us$setSqlParameterValue(us$stmt2, 3);
			if (us$stmt2.executeUpdate() == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
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
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("No se pudo actualizar la clave.");
		    getSession().rollbackTransaction();
		    getSession().exitToURL("salida.html");
		    }
		getSession().commitTransaction();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn3 = getConnection();
		    java.sql.PreparedStatement us$stmt3 = null;
		    ResultSet us$rs3 = null;
		    try
			{
			}
		    catch (SQLException us$ex3)
			{
			getSession().us$setStatus(us$conn3.mapToStatusCode(us$ex3));
			throw us$ex3;
			}
		    catch (NXJDataConnectionException us$ex3)
			{
			getSession().us$setStatus(us$conn3.mapToStatusCode(us$ex3));
			throw us$ex3;
			}
		    finally
			{
			if (us$stmt3 != null)
			    us$conn3.us$closeStatement(us$stmt3);
			}
		    }
		getSession().displayToMessageBox("Clave cambiada con \u00E9xito.");
		getSession().queueNextForm("Modulo.LoginFRM");
		}
	    else
		{
		getSession().displayToMessageBox("Las claves no coinciden. Verifique por favor.");
		getSession().queueNextField(cajagrandeCClaveFRM.confirmarclave);
		}
	} // run
    } // cambiarclave

    public final cambiarclave cambiarclave = new cambiarclave();

    public CClaveFRM(NXJSession session, NXJForm prevForm)
    {
	super("CClaveFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected CClaveFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setBackgroundColor("#999999");
	us$addProxyObject(Modulo.CClaveFRM.class, "intentos", false);
	us$addProxyObject(Modulo.CClaveFRM.class, "APassword", false);
	us$addProxyObject(Modulo.CClaveFRM.class, "fechaactual", false);
	us$addProxyObject(Modulo.CClaveFRM.class, "xus_password", false);
	us$addProxyObject(Modulo.CClaveFRM.class, "empresanombre", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "CClaveFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(Modulo.CClaveFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.CClaveFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.CClaveFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // CClaveFRM

