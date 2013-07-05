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

public class CorredoresDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    NullableString empresanombre = NullableFactory.createNullableString("empresanombre");

    public void initDataView()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn1 = getConnection();
	    java.sql.PreparedStatement us$stmt1 = null;
	    ResultSet us$rs1 = null;
	    try
		{
		us$stmt1 = us$conn1.prepareStatement("SELECT xem_nombre FROM xem_empresas WHERE xem_codigo =  ?");
		((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt1, 1);
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
			us$getter1.assignValueToVariable(empresanombre, 1);
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
	cajaarribaCorredores.actualempresa.assign(us$registerPool.allocateRegister().load(empresanombre));
	cajaarribaCorredores.actualusuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario));
    } // initDataView
    private CorredoresDVW CorredoresDVW = this;
    public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
    public /*multi_valued*/ NullableStringField vco_codigo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vco_codigo", true, true, 3);
    public /*multi_valued*/ NullableStringField vco_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vco_nombre", true, true, 40);
    public /*multi_valued*/ NullableStringField vco_telefono1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vco_telefono1", true, true, 15);
    public /*multi_valued*/ NullableStringField vco_telefono2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vco_telefono2", true, true, 15);
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.CorredoresDVW.box11.this, "image1", false);
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
    public class cajaarribaCorredores
	extends com.unify.nxj.mgr.NXJBox
    {
	public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	public class label1
	    extends ItemsForm.TituloLBL
	{

	    public label1()
	    {
		super(Modulo.CorredoresDVW.cajaarribaCorredores.this, "label1", false);
	    } // <init>
	} // label1

	public label1 label1 = new label1();
	public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	public cajaarribaCorredores(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajaarribaCorredores", enclosingContainer);
	    us$setBackgroundColor("#e30000");
	    cajaarribaCorredorespropertySetter_0();
	} // <init>

	private void cajaarribaCorredorespropertySetter_0()
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
	} // cajaarribaCorredorespropertySetter_0
    } // cajaarribaCorredores

    public final cajaarribaCorredores cajaarribaCorredores = new cajaarribaCorredores(this);

    public CorredoresDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vco_corredores");
	setAutoFind(true);
	setStartInAddMode(false);
	us$setBindingType("connection");
	us$setBackgroundColor("#cccccc");
	label11.setStyleClass("label");
	label11.setForegroundColor("Black");
	label11.setFontFamily("Verdana");
	label11.setFontSize("14");
	label11.us$setFontWeight("bold");
	vco_codigo.setStyleClass("textfield");
	vco_codigo.us$setMultiValued(true);
	vco_codigo.us$setView("text");
	vco_codigo.us$setFieldLength(3);
	vco_codigo.us$setCandidateTargetColumnName("vco_codigo");
	vco_codigo.setValueRetrievedDuringFetch(true);
	vco_codigo.setFindable(true);
	vco_codigo.setUpdateable(true);
	vco_nombre.setStyleClass("textfield");
	vco_nombre.us$setMultiValued(true);
	vco_nombre.us$setView("text");
	vco_nombre.us$setFieldLength(40);
	vco_nombre.us$setCandidateTargetColumnName("vco_nombre");
	vco_nombre.setValueRetrievedDuringFetch(true);
	vco_nombre.setFindable(true);
	vco_nombre.setUpdateable(true);
	vco_telefono1.setStyleClass("textfield");
	vco_telefono1.us$setMultiValued(true);
	vco_telefono1.us$setView("text");
	vco_telefono1.us$setFieldLength(15);
	vco_telefono1.us$setCandidateTargetColumnName("vco_telefono1");
	vco_telefono1.setValueRetrievedDuringFetch(true);
	vco_telefono1.setFindable(true);
	vco_telefono1.setUpdateable(true);
	vco_telefono2.setStyleClass("textfield");
	vco_telefono2.us$setMultiValued(true);
	vco_telefono2.us$setView("text");
	vco_telefono2.us$setFieldLength(15);
	vco_telefono2.us$setCandidateTargetColumnName("vco_telefono2");
	vco_telefono2.setValueRetrievedDuringFetch(true);
	vco_telefono2.setFindable(true);
	vco_telefono2.setUpdateable(true);
	us$addProxyObject(Modulo.CorredoresDVW.class, "empresanombre", false);
    } // <init>

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(Modulo.CorredoresDVW.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.CorredoresDVW.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.CorredoresDVW.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // CorredoresDVW

