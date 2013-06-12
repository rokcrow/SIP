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

public class LoginFRM22
    extends com.unify.nxj.mgr.NXJForm
{
    NullableString xus_password = NullableFactory.createNullableString("xus_password");
    NullableDate xus_factualiza = NullableFactory.createNullableDate("xus_factualiza");
    NullableNumeric intentos = (NullableNumeric)NullableFactory.createNullableNumeric("intentos").assign(getSession().us$getRegisterPool().allocateRegister().load(0));
    private LoginFRM22 LoginFRM22 = this;
    public class cajagrandeLogin
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJButtonControl button1 = new com.unify.nxj.mgr.datatypes.NXJButtonImpl(this, "button1", false);
	public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public /*multi_valued*/ NullableStringField xpr_grupo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpr_grupo", true, true, 100);
	public /*multi_valued*/ NullableStringField xpr_password = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpr_password", true, true, 100);
	public class xpr_usuario
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn1 = getConnection();
		    java.sql.PreparedStatement us$stmt1 = null;
		    ResultSet us$rs1 = null;
		    try
			{
			us$stmt1 = us$conn1.prepareStatement("SELECT xus_password, xus_factualiza, xus_grupo FROM xus_usuarios WHERE xus_usuario =  ?");
			xpr_usuario.us$setSqlParameterValue(us$stmt1, 1);
			us$rs1 = us$stmt1.executeQuery();
			int us$rowsTouched1 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd1 = us$rs1.getMetaData();
			    if (us$rsmd1.getColumnCount() != 3)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd1.getColumnCount()), "3"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter1 = us$conn1.createDataIterator(us$rs1);
			    if (us$getter1.next())
				{
				++us$rowsTouched1;
				us$getter1.assignValueToVariable(xus_password, 1);
				us$getter1.assignValueToVariable(xus_factualiza, 2);
				us$getter1.assignValueToVariable(xpr_grupo, 3);
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
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("Usuario Invalido. Verifique por favor.");
		    rejectOperation();
		    getSession().queueCommand("CLEAR_TO_FIND");
		    }
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("SELECT xus_password, xus_factualiza, xus_grupo FROM xus_usuarios WHERE xus_usuario =  ?");
			xpr_usuario.us$setSqlParameterValue(us$stmt2, 1);
			us$rs2 = us$stmt2.executeQuery();
			int us$rowsTouched2 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd2 = us$rs2.getMetaData();
			    if (us$rsmd2.getColumnCount() != 3)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd2.getColumnCount()), "3"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter2 = us$conn2.createDataIterator(us$rs2);
			    if (us$getter2.next())
				{
				++us$rowsTouched2;
				us$getter2.assignValueToVariable(xus_password, 1);
				us$getter2.assignValueToVariable(xus_factualiza, 2);
				us$getter2.assignValueToVariable(xpr_grupo, 3);
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
	    } // whenValueChanges

	    public xpr_usuario()
	    {
		super(Modulo.LoginFRM22.cajagrandeLogin.this, "xpr_usuario", false, true, 100);
		setStyleClass("textfield");
		us$setMultiValued(false);
		us$setView("text");
		setRequired(true);
		setFindable(false);
		setCaseConversion(NullableField.CaseConversion_LOWER);
		setFontFamily("Verdana");
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // xpr_usuario

	public xpr_usuario xpr_usuario = new xpr_usuario();
	public class cajaabajoLogin
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(Modulo.LoginFRM22.cajagrandeLogin.cajaabajoLogin.this, "image1", false);
		} // <init>
	    } // image1

	    public image1 image1 = new image1();

	    public cajaabajoLogin(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaabajoLogin", enclosingContainer);
		us$setBackgroundColor("#e30000");
	    } // <init>
	} // cajaabajoLogin

	public final cajaabajoLogin cajaabajoLogin = new cajaabajoLogin(this);
	public class cajaarribaLogin
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(Modulo.LoginFRM22.cajagrandeLogin.cajaarribaLogin.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();

	    public cajaarribaLogin(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaLogin", enclosingContainer);
		us$setBackgroundColor("#e30000");
	    } // <init>
	} // cajaarribaLogin

	public final cajaarribaLogin cajaarribaLogin = new cajaarribaLogin(this);

	public cajagrandeLogin(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeLogin", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeLoginpropertySetter_0();
	} // <init>

	private void cajagrandeLoginpropertySetter_0()
	{
	    button1.setStyleClass("button");
	    button1.setForegroundColor("White");
	    button1.setBackgroundColor("Red");
	    button1.us$setFontWeight("bold");
	    label1.setStyleClass("label");
	    label1.setFontFamily("Verdana");
	    label1.setFontSize("12");
	    label1.us$setFontWeight("normal");
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	    label3.setStyleClass("label");
	    label3.setForegroundColor("Black");
	    label3.setFontFamily("Verdana");
	    label3.setFontSize("12");
	    label3.us$setFontWeight("normal");
	    label31.setStyleClass("label");
	    label31.setForegroundColor("Black");
	    label31.setFontFamily("Verdana");
	    label31.setFontSize("12");
	    label31.us$setFontWeight("normal");
	    xpr_grupo.setStyleClass("textfield");
	    xpr_grupo.us$setMultiValued(true);
	    xpr_grupo.us$setView("text");
	    xpr_grupo.setRequired(false);
	    xpr_grupo.setFindable(false);
	    xpr_grupo.setStopForInput(false);
	    xpr_grupo.setFontFamily("Verdana");
	    xpr_password.setStyleClass("textfield");
	    xpr_password.us$setMultiValued(true);
	    xpr_password.us$setView("text");
	    xpr_password.setPassword(true);
	    xpr_password.setAutoAccept(false);
	    xpr_password.setRequired(true);
	    xpr_password.setFindable(false);
	    xpr_password.setFontFamily("Verdana");
	} // cajagrandeLoginpropertySetter_0
    } // cajagrandeLogin

    public final cajagrandeLogin cajagrandeLogin = new cajagrandeLogin(this);
    public final class logincmd
	extends NXJCommand
    {

	public logincmd()
	{
	    super("logincmd", Modulo.LoginFRM22.this, 3, true, 1);
	    us$addCommand(this);
	} // <init>

	public void run()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(cajagrandeLogin.xpr_password).neqOp(us$registerPool.allocateRegister().load(xus_password)).getBooleanValueNullOk())
		{
		intentos.assign(us$registerPool.allocateRegister().load(intentos).plusOp(1));
		getSession().displayToMessageBox("Password Invalido");
		if (us$registerPool.allocateRegister().load(intentos).ltOp(4).getBooleanValueNullOk())
		    {
		    getSession().queueNextField(cajagrandeLogin.xpr_password);
		    }
		else
		    {
		    getSession().displayToMessageBox("Excedio el numero de intentos permitidos. Intente despues.");
		    getSession().wait(10);
		    getSession().queueCommand("exit");
		    }
		}
	    else
		if (us$registerPool.allocateRegister().load(getSession().getCurrentDate()).minusOp(us$registerPool.allocateRegister().load(xus_factualiza)).gtOp(90).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Su clave expiro. Proceda a cambiarla, por favor.");
		    getSession().queueNextForm("Modulo.MenuFRM");
		    }
		else
		    {
		    getSession().queueNextForm("Modulo.MenuFRM");
		    }
	} // run
    } // logincmd

    public final logincmd logincmd = new logincmd();

    public LoginFRM22(NXJSession session, NXJForm prevForm)
    {
	super("LoginFRM22", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected LoginFRM22(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setBackgroundColor("#999999");
	us$addProxyObject(Modulo.LoginFRM22.class, "intentos", false);
	us$addProxyObject(Modulo.LoginFRM22.class, "xus_factualiza", false);
	us$addProxyObject(Modulo.LoginFRM22.class, "xus_password", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "LoginFRM22";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(Modulo.LoginFRM22.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.LoginFRM22.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.LoginFRM22.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // LoginFRM22

