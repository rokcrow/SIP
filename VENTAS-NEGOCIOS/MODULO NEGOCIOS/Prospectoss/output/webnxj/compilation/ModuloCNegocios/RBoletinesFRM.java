package ModuloCNegocios;

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

public class RBoletinesFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable vmu_cli_clase = NullableFactory.createNullableStringVariable(this, "vmu_cli_clase", true, false);
    /*multi_valued*/ NullableStringVariable vmu_obra = NullableFactory.createNullableStringVariable(this, "vmu_obra", true, false);
    /*multi_valued*/ NullableStringVariable vmu_est_hipote = NullableFactory.createNullableStringVariable(this, "vmu_est_hipote", true, false);
    /*multi_valued*/ NullableStringVariable vmu_empresa = NullableFactory.createNullableStringVariable(this, "vmu_empresa", true, false);
    /*multi_valued*/ NullableAmountVariable vmu_descuentos = NullableFactory.createNullableAmountVariable(this, "vmu_descuentos", true, false);
    /*multi_valued*/ NullableAmountVariable vmu_vgarage = NullableFactory.createNullableAmountVariable(this, "vmu_vgarage", true, false);
    /*multi_valued*/ NullableAmountVariable vmu_precio_uni = NullableFactory.createNullableAmountVariable(this, "vmu_precio_uni", true, false);
    NullableAmount preciotot = NullableFactory.createNullableAmount("preciotot");
    NullableAmount cien = NullableFactory.createNullableAmount("cien");
    NullableAmount cero = NullableFactory.createNullableAmount("cero");
    NullableString etapa_act = NullableFactory.createNullableString("etapa_act");
    NullableString est = NullableFactory.createNullableString("est");
    NullableString etapa_activa = NullableFactory.createNullableString("etapa_activa");
    NullableString xob_proyecto = NullableFactory.createNullableString("xob_proyecto");
    NullableString formasig = NullableFactory.createNullableString("formasig");
    NullableString numero = NullableFactory.createNullableString("numero");
    NullableNumeric adicionando = NullableFactory.createNullableNumeric("adicionando");

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	cajagrandeRBoletines.tabset1.setCurrentPage("tab2");
	cajagrandeRBoletines.number.assign(us$registerPool.allocateRegister().load("23"));
	vmu_empresa.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA;
	    } // evaluate
	});
	vmu_empresa.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA, null)
		    };
	    } // evaluate
	});
	cero.assign(us$registerPool.allocateRegister().load(0));
	cien.assign(us$registerPool.allocateRegister().load(100));
	preciotot.assign(us$registerPool.allocateRegister().load(cero));
	vmu_precio_uni.assign(us$registerPool.allocateRegister().load(cero));
	vmu_vgarage.assign(us$registerPool.allocateRegister().load(cero));
	vmu_descuentos.assign(us$registerPool.allocateRegister().load(cero));
	formasig.assign(us$registerPool.allocateRegister().load("A"));
	vmu_est_hipote.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		return us$registerPool.allocateRegister().load("N");
	    } // evaluate
	});
    } // beforeForm

    public void beforeAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (us$registerPool.allocateRegister().load(cajagrandeRBoletines.number).neqOp("3").getBooleanValueNullOk())
	    {
	    getSession().displayToMessageBox("Debe ir a Compromisos del Negocio antes de agregar un registro.");
	    rejectOperation();
	    }
    } // beforeAdd

    public void onPreviousForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	numero.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.number));
    } // onPreviousForm

    public void onClearToFind()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	adicionando.assign(us$registerPool.allocateRegister().load(0));
	cajagrandeRBoletines.vmu_cli_clase.setStopForInput(true);
    } // onClearToFind
    private RBoletinesFRM RBoletinesFRM = this;
    public class cajagrandeRBoletines
	extends com.unify.nxj.mgr.NXJBox
    {
	public NullableStringField area_const = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "area_const", false, true, 100);
	public NullableStringField area_lote = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "area_lote", false, true, 100);
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public NXJLabelControl label31111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111", false);
	public NXJLabelControl label311111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311111", false);
	public NXJLabelControl label3111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111111", false);
	public NXJLabelControl label31111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111111", false);
	public NXJLabelControl label311111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311111111", false);
	public NXJLabelControl label31111112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111112", false);
	public NXJLabelControl label312 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label312", false);
	public NXJLabelControl label3121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3121", false);
	public NXJLabelControl label313 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313", false);
	public NXJLabelControl label3131 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131", false);
	public NXJLabelControl label31311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311", false);
	public NXJLabelControl label313111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111", false);
	public NXJLabelControl label3131111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111", false);
	public NXJLabelControl label313111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111", false);
	public NXJLabelControl label3131111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111", false);
	public NXJLabelControl label31311111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111", false);
	public NXJLabelControl label313111111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111111", false);
	public NXJLabelControl label3131111111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111111", false);
	public NXJLabelControl label313111111112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112", false);
	public NXJLabelControl label3131111111121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121", false);
	public NXJLabelControl label31311111111211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211", false);
	public NXJLabelControl label313111111112111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111", false);
	public NXJLabelControl label3131111111121111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121111", false);
	public NXJLabelControl label31311111111211111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211111", false);
	public NXJLabelControl label313111111112111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111111", false);
	public NXJLabelControl label3131111111121112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121112", false);
	public NXJLabelControl label31311111111211121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211121", false);
	public NXJLabelControl label313111111112111211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111211", false);
	public NullableStringField nombre_banco = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "nombre_banco", false, true, 100);
	public NullableStringField number = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "number", false, true, 100);
	public /*multi_valued*/ NullableStringField vau_apode_nit = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_apode_nit", true, true, 18);
	public /*multi_valued*/ NullableStringField vau_apode_nom = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_apode_nom", true, true, 40);
	public /*multi_valued*/ NullableStringField vau_apoderado = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_apoderado", true, true, 2);
	public /*multi_valued*/ NullableStringField vma_ven_responsa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vma_ven_responsa", true, true, 3);
	public /*multi_valued*/ NullableDateField vmu__f_entprog = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu__f_entprog", true, true, 10);
	public /*multi_valued*/ NullableStringField vmu_cli_ciudad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciudad", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_cli_ciunit = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciunit", true, true, 20);
	public /*multi_valued*/ NullableStringField vmu_cli_clase = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_clase", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_cli_corres = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_corres", true, true, 50);
	public /*multi_valued*/ NullableStringField vmu_cli_registro = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_registro", true, true, 15);
	public /*multi_valued*/ NullableStringField vmu_cli_telof = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_telof", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_cli_telre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_telre", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_corporacion = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_corporacion", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_correo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_correo", true, true, 40);
	public /*multi_valued*/ NullableStringField vmu_correo2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_correo2", true, true, 40);
	public /*multi_valued*/ NullableAmountField vmu_descuentos = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_descuentos", true, true, 25);
	public /*multi_valued*/ NullableStringField vmu_est_hipote = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_est_hipote", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_est_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_est_unidad", true, true, 2);
	public /*multi_valued*/ NullableDateField vmu_f_ent_pacta = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_ent_pacta", true, true, 10);
	public /*multi_valued*/ NullableDateField vmu_f_escritura = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_escritura", true, true, 10);
	public /*multi_valued*/ NullableDateField vmu_f_gravacion = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_gravacion", true, true, 10);
	public /*multi_valued*/ NullableDateField vmu_f_separacion = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_separacion", true, true, 10);
	public /*multi_valued*/ NullableStringField vmu_forma_pago = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_forma_pago", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_manzana", true, true, 3);
	public /*multi_valued*/ NullableNumericField vmu_ngarage = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "vmu_ngarage", true, true, 11);
	public class vmu_obra
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{
	    NullableNumeric ii = NullableFactory.createNullableNumeric("ii");

	    public void beforeField()
		throws Exception
	    {
	    } // beforeField

	    public void initField()
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
			us$stmt1 = us$conn1.prepareStatement("SELECT xob_proyecto FROM xob_obras WHERE xob_empresa =  ?  AND xob_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt1, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt1, 2);
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
				us$getter1.assignValueToVariable(xob_proyecto, 1);
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
		if (getSession().getStatus() == StatusCode.SS_NOREC)
		    {
		    getSession().displayToMessageBox("La obra no corresponde.");
		    vmu_obra.assign(us$registerPool.allocateRegister().load(" "));
		    rejectOperation();
		    }
		ii.assign(us$registerPool.allocateRegister().load(0));

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("SELECT vev_etapactu, vev_estado FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt2, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt2, 2);
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
				us$getter2.assignValueToVariable(etapa_activa, 1);
				us$getter2.assignValueToVariable(est, 2);

				    {
				    ii.assign(us$registerPool.allocateRegister().load(ii).plusOp(1));
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
		if (us$registerPool.allocateRegister().load(ii).gtOp(1).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Hay m\u00E1s de una etapa activa. Verifique.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn3 = getConnection();
		    java.sql.PreparedStatement us$stmt3 = null;
		    ResultSet us$rs3 = null;
		    try
			{
			us$stmt3 = us$conn3.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt3, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt3, 2);
			us$rs3 = us$stmt3.executeQuery();
			int us$rowsTouched3 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd3 = us$rs3.getMetaData();
			    if (us$rsmd3.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd3.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter3 = us$conn3.createDataIterator(us$rs3);
			    if (us$getter3.next())
				{
				++us$rowsTouched3;
				us$getter3.assignValueToVariable(etapa_act, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched3 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs3 != null)
				us$rs3.close();
			    }
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
		if (getSession().getStatus() == StatusCode.SS_NOREC)
		    {
		    getSession().displayToMessageBox("No hay etapa ACTIVA en ventas.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    rejectOperation();
		    }
	    } // initField

	    public vmu_obra()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_obra", true, true, 2);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(2);
		us$setCandidateTargetColumnName("vmu_obra");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		us$executesCodeBeforeInput = true;
	    } // <init>
	} // vmu_obra

	public /*multi_valued*/ vmu_obra vmu_obra = new vmu_obra();
	public /*multi_valued*/ NullableAmountField vmu_precio_uni = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_precio_uni", true, true, 25);
	public /*multi_valued*/ NullableAmountField vmu_preciotot = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_preciotot", true, true, 25);
	public /*multi_valued*/ NullableStringField vmu_promocion1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_promocion1", true, true, 80);
	public /*multi_valued*/ NullableStringField vmu_promocion2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_promocion2", true, true, 80);
	public /*multi_valued*/ NullableStringField vmu_tipoinmueb = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_tipoinmueb", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_tramite = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_tramite", true, true, 13);
	public /*multi_valued*/ NullableStringField vmu_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_unidad", true, true, 4);
	public /*multi_valued*/ NullableAmountField vmu_vdeposito = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_vdeposito", true, true, 25);
	public /*multi_valued*/ NullableAmountField vmu_vgarage = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_vgarage", true, true, 25);
	public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.box11.this, "image1", false);
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
	public class cajaarribaRBoletines
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);
	    public class rboletinestxtex
		extends ItemsForm.TituloLBL
	    {

		public rboletinestxtex()
		{
		    super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.cajaarribaRBoletines.this, "rboletinestxtex", false);
		} // <init>
	    } // rboletinestxtex

	    public rboletinestxtex rboletinestxtex = new rboletinestxtex();

	    public cajaarribaRBoletines(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaRBoletines", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaRBoletinespropertySetter_0();
	    } // <init>

	    private void cajaarribaRBoletinespropertySetter_0()
	    {
		actualempresa.setStyleClass("textfield");
		actualempresa.us$setView("text");
		actualempresa.setFindable(false);
		actualempresa.setStopForInput(false);
		actualusuario.setStyleClass("textfield");
		actualusuario.us$setMultiValued(false);
		actualusuario.us$setView("text");
		actualusuario.setFindable(false);
		actualusuario.setStopForInput(false);
		label211.setStyleClass("label");
	    } // cajaarribaRBoletinespropertySetter_0
	} // cajaarribaRBoletines

	public final cajaarribaRBoletines cajaarribaRBoletines = new cajaarribaRBoletines(this);
	public class tabset1
	    extends com.unify.nxj.mgr.NXJTabSet
	{

	    public tabset1(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("tabset1", enclosingContainer);
	    } // <init>
	} // tabset1

	public final tabset1 tabset1 = new tabset1(this);

	public cajagrandeRBoletines(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeRBoletines", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    vma_ven_responsa.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	    {

		public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		    throws Exception
		{
		    if (values.length != 1)
			throw new Exception("TODO: handle value array size mismatch");
		    vma_ven_responsa.us$assignZoomValue(values[0]);
		} // assignValues
	    });
	    cajagrandeRBoletinespropertySetter_0();
	    cajagrandeRBoletinespropertySetter_1();
	    cajagrandeRBoletinespropertySetter_2();
	    cajagrandeRBoletinespropertySetter_3();
	} // <init>

	private void cajagrandeRBoletinespropertySetter_0()
	{
	    area_const.setStyleClass("textfield");
	    area_const.us$setView("text");
	    area_const.setFindable(true);
	    area_lote.setStyleClass("textfield");
	    area_lote.us$setMultiValued(false);
	    area_lote.us$setView("text");
	    area_lote.setFindable(true);
	    area_lote.setUpdateable(true);
	    area_lote.setStopForInput(true);
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
	    label31111.setStyleClass("label");
	    label31111.setFontSize("12");
	    label311111.setStyleClass("label");
	    label311111.setFontSize("12");
	    label3111111.setStyleClass("label");
	    label3111111.setFontSize("12");
	    label31111111.setStyleClass("label");
	    label31111111.setFontSize("12");
	    label311111111.setStyleClass("label");
	    label311111111.setFontSize("12");
	    label31111112.setStyleClass("label");
	    label31111112.setFontSize("12");
	    label312.setStyleClass("label");
	    label312.setFontSize("12");
	    label3121.setStyleClass("label");
	    label3121.setFontSize("12");
	    label313.setStyleClass("label");
	    label313.setFontSize("12");
	    label3131.setStyleClass("label");
	    label3131.setFontSize("12");
	    label31311.setStyleClass("label");
	    label31311.setFontSize("12");
	    label313111.setStyleClass("label");
	    label313111.setFontSize("12");
	    label3131111.setStyleClass("label");
	    label3131111.setFontSize("12");
	} // cajagrandeRBoletinespropertySetter_0

	private void cajagrandeRBoletinespropertySetter_1()
	{
	    label313111111.setStyleClass("label");
	    label313111111.setFontSize("12");
	    label3131111111.setStyleClass("label");
	    label3131111111.setFontSize("12");
	    label31311111111.setStyleClass("label");
	    label31311111111.setFontSize("12");
	    label313111111111.setStyleClass("label");
	    label313111111111.setFontSize("12");
	    label3131111111111.setStyleClass("label");
	    label3131111111111.setFontSize("12");
	    label313111111112.setStyleClass("label");
	    label313111111112.setFontSize("12");
	    label3131111111121.setStyleClass("label");
	    label3131111111121.setFontSize("12");
	    label31311111111211.setStyleClass("label");
	    label31311111111211.setFontSize("12");
	    label313111111112111.setStyleClass("label");
	    label313111111112111.setFontSize("12");
	    label3131111111121111.setStyleClass("label");
	    label3131111111121111.setFontSize("12");
	    label31311111111211111.setStyleClass("label");
	    label31311111111211111.setFontSize("12");
	    label313111111112111111.setStyleClass("label");
	    label313111111112111111.setFontSize("12");
	    label3131111111121112.setStyleClass("label");
	    label3131111111121112.setFontSize("12");
	    label31311111111211121.setStyleClass("label");
	    label31311111111211121.setFontSize("12");
	    label313111111112111211.setStyleClass("label");
	    label313111111112111211.setFontSize("12");
	    nombre_banco.setStyleClass("textfield");
	    nombre_banco.us$setView("text");
	    nombre_banco.setFindable(true);
	    nombre_banco.setUpdateable(true);
	    nombre_banco.setStopForInput(false);
	    number.setStyleClass("textfield");
	    number.us$setView("text");
	    number.setFindable(false);
	    vau_apode_nit.setStyleClass("textfield");
	    vau_apode_nit.us$setMultiValued(true);
	    vau_apode_nit.us$setView("text");
	    vau_apode_nit.us$setFieldLength(18);
	    vau_apode_nit.us$setCandidateTargetColumnName("vau_apode_nit");
	    vau_apode_nit.setValueRetrievedDuringFetch(true);
	    vau_apode_nit.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_apode_nit.setFindable(true);
	    vau_apode_nit.setUpdateable(true);
	    vau_apode_nit.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vau_apode_nom.setStyleClass("textfield");
	    vau_apode_nom.us$setMultiValued(true);
	    vau_apode_nom.us$setView("text");
	    vau_apode_nom.us$setFieldLength(40);
	    vau_apode_nom.us$setCandidateTargetColumnName("vau_apode_nom");
	    vau_apode_nom.setValueRetrievedDuringFetch(true);
	    vau_apode_nom.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_apode_nom.setFindable(true);
	    vau_apode_nom.setUpdateable(true);
	    vau_apode_nom.setStopForInput(false);
	    vau_apode_nom.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vau_apoderado.setVisible(true);
	    vau_apoderado.setStyleClass("dropdown_list");
	    vau_apoderado.us$setMultiValued(true);
	    vau_apoderado.us$setView("select");
	    vau_apoderado.us$setFieldLength(2);
	    vau_apoderado.setAutoAccept(true);
	    vau_apoderado.us$setCandidateTargetColumnName("vau_apoderado");
	    vau_apoderado.setValueRetrievedDuringFetch(true);
	    vau_apoderado.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_apoderado.setFindable(true);
	    vau_apoderado.setUpdateable(true);
	} // cajagrandeRBoletinespropertySetter_1

	private void cajagrandeRBoletinespropertySetter_2()
	{
	    vma_ven_responsa.setStyleClass("textfield");
	    vma_ven_responsa.us$setMultiValued(true);
	    vma_ven_responsa.us$setView("text");
	    vma_ven_responsa.us$setFieldLength(3);
	    vma_ven_responsa.setAutoAccept(true);
	    vma_ven_responsa.us$setCandidateTargetColumnName("vma_ven_responsa");
	    vma_ven_responsa.setValueRetrievedDuringFetch(true);
	    vma_ven_responsa.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vma_ven_responsa.setRequired(true);
	    vma_ven_responsa.setFindable(true);
	    vma_ven_responsa.setUpdateable(true);
	    vma_ven_responsa.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vma_ven_responsa.setZoomFormName("Modulo/VendedoresFRM");
	    vma_ven_responsa.setZoomEnabled(true);
	    vma_ven_responsa.setZoomActiveMode(NXJCommand.ActiveMode_BOTH);
	    vma_ven_responsa.setForegroundColor("Black");
	    vma_ven_responsa.setFontSize("12");
	    vmu__f_entprog.setStyleClass("date_picker");
	    vmu__f_entprog.us$setMultiValued(true);
	    vmu__f_entprog.us$setView("date");
	    vmu__f_entprog.us$setFieldLength(10);
	    vmu__f_entprog.us$setCandidateTargetColumnName("vmu_f_entprog");
	    vmu__f_entprog.setValueRetrievedDuringFetch(true);
	    vmu__f_entprog.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu__f_entprog.setFindable(true);
	    vmu__f_entprog.setUpdateable(true);
	    vmu_cli_ciudad.setStyleClass("textfield");
	    vmu_cli_ciudad.us$setMultiValued(true);
	    vmu_cli_ciudad.us$setView("select");
	    vmu_cli_ciudad.us$setFieldLength(30);
	    vmu_cli_ciudad.us$setCandidateTargetColumnName("vmu_cli_ciudad");
	    vmu_cli_ciudad.setValueRetrievedDuringFetch(true);
	    vmu_cli_ciudad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_ciudad.setRequired(true);
	    vmu_cli_ciudad.setFindable(true);
	    vmu_cli_ciudad.setUpdateable(true);
	    vmu_cli_ciunit.setStyleClass("textfield");
	    vmu_cli_ciunit.us$setMultiValued(true);
	    vmu_cli_ciunit.us$setView("text");
	    vmu_cli_ciunit.us$setFieldLength(20);
	    vmu_cli_ciunit.us$setCandidateTargetColumnName("vmu_cli_ciunit");
	    vmu_cli_ciunit.setValueRetrievedDuringFetch(true);
	    vmu_cli_ciunit.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_ciunit.setFindable(true);
	    vmu_cli_ciunit.setUpdateable(true);
	    vmu_cli_ciunit.setStopForInput(false);
	    vmu_cli_ciunit.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_cli_clase.setStyleClass("dropdown_list");
	    vmu_cli_clase.us$setMultiValued(true);
	    vmu_cli_clase.us$setView("select");
	    vmu_cli_clase.us$setFieldLength(2);
	    vmu_cli_clase.setAutoAccept(true);
	    vmu_cli_clase.us$setCandidateTargetColumnName("vmu_cli_clase");
	    vmu_cli_clase.setValueRetrievedDuringFetch(true);
	    vmu_cli_clase.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_clase.setRequired(true);
	    vmu_cli_clase.setFindable(true);
	    vmu_cli_clase.setUpdateable(true);
	    vmu_cli_clase.us$setMultiValuedOptions(false);
	    vmu_cli_corres.setStyleClass("textfield");
	    vmu_cli_corres.us$setMultiValued(true);
	    vmu_cli_corres.us$setView("select");
	    vmu_cli_corres.us$setFieldLength(50);
	    vmu_cli_corres.setAutoAccept(true);
	    vmu_cli_corres.us$setCandidateTargetColumnName("vmu_cli_corres");
	    vmu_cli_corres.setValueRetrievedDuringFetch(true);
	    vmu_cli_corres.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_corres.setRequired(true);
	    vmu_cli_corres.setFindable(true);
	    vmu_cli_corres.setUpdateable(true);
	    vmu_cli_corres.setForegroundColor("Black");
	    vmu_cli_corres.setFontSize("12");
	    vmu_cli_registro.setStyleClass("textfield");
	    vmu_cli_registro.us$setMultiValued(true);
	    vmu_cli_registro.us$setView("text");
	    vmu_cli_registro.us$setFieldLength(15);
	    vmu_cli_registro.us$setCandidateTargetColumnName("vmu_cli_registro");
	    vmu_cli_registro.setValueRetrievedDuringFetch(true);
	    vmu_cli_registro.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_registro.setFindable(true);
	    vmu_cli_registro.setUpdateable(true);
	    vmu_cli_registro.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_cli_telof.setStyleClass("textfield");
	    vmu_cli_telof.us$setMultiValued(true);
	    vmu_cli_telof.us$setView("text");
	    vmu_cli_telof.us$setFieldLength(30);
	    vmu_cli_telof.us$setCandidateTargetColumnName("vmu_cli_telof");
	    vmu_cli_telof.setValueRetrievedDuringFetch(true);
	    vmu_cli_telof.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_telof.setRequired(true);
	    vmu_cli_telof.setFindable(true);
	    vmu_cli_telof.setUpdateable(true);
	    vmu_cli_telof.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_cli_telre.setStyleClass("textfield");
	    vmu_cli_telre.us$setMultiValued(true);
	    vmu_cli_telre.us$setView("text");
	    vmu_cli_telre.us$setFieldLength(30);
	    vmu_cli_telre.us$setCandidateTargetColumnName("vmu_cli_telre");
	    vmu_cli_telre.setValueRetrievedDuringFetch(true);
	    vmu_cli_telre.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_cli_telre.setRequired(true);
	    vmu_cli_telre.setFindable(true);
	    vmu_cli_telre.setUpdateable(true);
	    vmu_cli_telre.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_corporacion.setStyleClass("textfield");
	    vmu_corporacion.us$setMultiValued(true);
	    vmu_corporacion.us$setView("text");
	    vmu_corporacion.us$setFieldLength(2);
	    vmu_corporacion.us$setCandidateTargetColumnName("vmu_corporacion");
	    vmu_corporacion.setValueRetrievedDuringFetch(true);
	    vmu_corporacion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_corporacion.setFindable(true);
	    vmu_corporacion.setUpdateable(true);
	    vmu_correo.setStyleClass("textfield");
	    vmu_correo.us$setMultiValued(true);
	    vmu_correo.us$setView("text");
	    vmu_correo.us$setFieldLength(40);
	    vmu_correo.us$setCandidateTargetColumnName("vmu_correo");
	    vmu_correo.setValueRetrievedDuringFetch(true);
	    vmu_correo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_correo.setFindable(true);
	    vmu_correo.setUpdateable(true);
	    vmu_correo2.setStyleClass("textfield");
	    vmu_correo2.us$setMultiValued(true);
	    vmu_correo2.us$setView("text");
	    vmu_correo2.us$setFieldLength(40);
	    vmu_correo2.us$setCandidateTargetColumnName("vmu_correo2");
	    vmu_correo2.setValueRetrievedDuringFetch(true);
	    vmu_correo2.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_correo2.setFindable(true);
	    vmu_correo2.setUpdateable(true);
	    vmu_descuentos.setStyleClass("textfield");
	    vmu_descuentos.us$setMultiValued(true);
	    vmu_descuentos.us$setView("text");
	    vmu_descuentos.us$setFieldLength(25);
	    vmu_descuentos.us$setCandidateTargetColumnName("vmu_descuentos");
	    vmu_descuentos.setValueRetrievedDuringFetch(true);
	    vmu_descuentos.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_descuentos.setFindable(true);
	    vmu_descuentos.setUpdateable(true);
	    vmu_est_hipote.setStyleClass("dropdown_list");
	    vmu_est_hipote.us$setMultiValued(true);
	    vmu_est_hipote.us$setView("select");
	    vmu_est_hipote.us$setFieldLength(2);
	    vmu_est_hipote.setAutoAccept(true);
	    vmu_est_hipote.us$setCandidateTargetColumnName("vmu_est_hipote");
	    vmu_est_hipote.setValueRetrievedDuringFetch(true);
	    vmu_est_hipote.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_est_hipote.setFindable(true);
	    vmu_est_hipote.setUpdateable(true);
	    vmu_est_unidad.setStyleClass("dropdown_list");
	    vmu_est_unidad.us$setMultiValued(true);
	    vmu_est_unidad.us$setView("select");
	    vmu_est_unidad.us$setFieldLength(2);
	    vmu_est_unidad.setAutoAccept(true);
	    vmu_est_unidad.us$setCandidateTargetColumnName("vmu_est_unidad");
	    vmu_est_unidad.setValueRetrievedDuringFetch(true);
	    vmu_est_unidad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_est_unidad.setFindable(true);
	    vmu_est_unidad.setUpdateable(true);
	    vmu_f_ent_pacta.setStyleClass("date_picker");
	    vmu_f_ent_pacta.us$setMultiValued(true);
	    vmu_f_ent_pacta.us$setView("date");
	    vmu_f_ent_pacta.us$setFieldLength(10);
	    vmu_f_ent_pacta.us$setCandidateTargetColumnName("vmu_f_ent_pacta");
	    vmu_f_ent_pacta.setValueRetrievedDuringFetch(true);
	    vmu_f_ent_pacta.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_ent_pacta.setRequired(true);
	    vmu_f_ent_pacta.setFindable(true);
	    vmu_f_ent_pacta.setUpdateable(true);
	    vmu_f_escritura.setStyleClass("date_picker");
	    vmu_f_escritura.us$setMultiValued(true);
	    vmu_f_escritura.us$setView("date");
	    vmu_f_escritura.us$setFieldLength(10);
	    vmu_f_escritura.us$setCandidateTargetColumnName("vmu_f_escritura");
	    vmu_f_escritura.setValueRetrievedDuringFetch(true);
	    vmu_f_escritura.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_escritura.setRequired(true);
	    vmu_f_escritura.setFindable(true);
	    vmu_f_escritura.setUpdateable(true);
	    vmu_f_gravacion.setStyleClass("date_picker");
	    vmu_f_gravacion.us$setMultiValued(true);
	    vmu_f_gravacion.us$setView("date");
	    vmu_f_gravacion.us$setFieldLength(10);
	    vmu_f_gravacion.us$setCandidateTargetColumnName("vmu_f_gravacion");
	    vmu_f_gravacion.setValueRetrievedDuringFetch(true);
	    vmu_f_gravacion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_gravacion.setFindable(true);
	    vmu_f_gravacion.setUpdateable(true);
	    vmu_f_separacion.setStyleClass("date_picker");
	    vmu_f_separacion.us$setMultiValued(true);
	    vmu_f_separacion.us$setView("date");
	    vmu_f_separacion.us$setFieldLength(10);
	    vmu_f_separacion.us$setCandidateTargetColumnName("vmu_f_separacion");
	    vmu_f_separacion.setValueRetrievedDuringFetch(true);
	    vmu_f_separacion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_separacion.setRequired(true);
	    vmu_f_separacion.setFindable(true);
	    vmu_f_separacion.setUpdateable(true);
	    vmu_forma_pago.setStyleClass("dropdown_list");
	    vmu_forma_pago.us$setMultiValued(true);
	    vmu_forma_pago.us$setView("select");
	    vmu_forma_pago.us$setFieldLength(2);
	    vmu_forma_pago.setAutoAccept(true);
	    vmu_forma_pago.us$setCandidateTargetColumnName("vmu_forma_pago");
	    vmu_forma_pago.setValueRetrievedDuringFetch(true);
	    vmu_forma_pago.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_forma_pago.setRequired(true);
	    vmu_forma_pago.setFindable(true);
	    vmu_forma_pago.setUpdateable(true);
	} // cajagrandeRBoletinespropertySetter_2

	private void cajagrandeRBoletinespropertySetter_3()
	{
	    vmu_manzana.setStyleClass("textfield");
	    vmu_manzana.us$setMultiValued(true);
	    vmu_manzana.us$setView("text");
	    vmu_manzana.us$setFieldLength(3);
	    vmu_manzana.us$setCandidateTargetColumnName("vmu_manzana");
	    vmu_manzana.setValueRetrievedDuringFetch(true);
	    vmu_manzana.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_manzana.setRequired(true);
	    vmu_manzana.setFindable(true);
	    vmu_manzana.setUpdateable(true);
	    vmu_manzana.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_ngarage.setStyleClass("textfield");
	    vmu_ngarage.us$setMultiValued(true);
	    vmu_ngarage.us$setView("text");
	    vmu_ngarage.us$setFieldLength(11);
	    vmu_ngarage.us$setCandidateTargetColumnName("vmu_ngarage");
	    vmu_ngarage.setValueRetrievedDuringFetch(true);
	    vmu_ngarage.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_ngarage.setRequired(true);
	    vmu_ngarage.setFindable(true);
	    vmu_ngarage.setUpdateable(true);
	    vmu_precio_uni.setStyleClass("textfield");
	    vmu_precio_uni.us$setMultiValued(true);
	    vmu_precio_uni.us$setView("text");
	    vmu_precio_uni.us$setFieldLength(25);
	    vmu_precio_uni.us$setCandidateTargetColumnName("vmu_precio_uni");
	    vmu_precio_uni.setValueRetrievedDuringFetch(true);
	    vmu_precio_uni.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_precio_uni.setRequired(true);
	    vmu_precio_uni.setFindable(true);
	    vmu_precio_uni.setUpdateable(false);
	    vmu_preciotot.setStyleClass("textfield");
	    vmu_preciotot.us$setMultiValued(true);
	    vmu_preciotot.us$setView("text");
	    vmu_preciotot.us$setFieldLength(25);
	    vmu_preciotot.us$setCandidateTargetColumnName("vmu_preciotot");
	    vmu_preciotot.setValueRetrievedDuringFetch(true);
	    vmu_preciotot.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_preciotot.setRequired(true);
	    vmu_preciotot.setFindable(true);
	    vmu_preciotot.setUpdateable(false);
	    vmu_promocion1.setStyleClass("textarea");
	    vmu_promocion1.us$setMultiValued(true);
	    vmu_promocion1.us$setView("textarea");
	    vmu_promocion1.us$setFieldLength(80);
	    vmu_promocion1.us$setCandidateTargetColumnName("vmu_promocion1");
	    vmu_promocion1.setValueRetrievedDuringFetch(true);
	    vmu_promocion1.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_promocion1.setFindable(true);
	    vmu_promocion1.setUpdateable(true);
	    vmu_promocion2.setStyleClass("textfield");
	    vmu_promocion2.us$setMultiValued(true);
	    vmu_promocion2.us$setView("text");
	    vmu_promocion2.us$setFieldLength(80);
	    vmu_promocion2.us$setCandidateTargetColumnName("vmu_promocion2");
	    vmu_promocion2.setValueRetrievedDuringFetch(true);
	    vmu_promocion2.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_promocion2.setFindable(true);
	    vmu_promocion2.setUpdateable(true);
	    vmu_tipoinmueb.setStyleClass("dropdown_list");
	    vmu_tipoinmueb.us$setMultiValued(true);
	    vmu_tipoinmueb.us$setView("select");
	    vmu_tipoinmueb.us$setFieldLength(2);
	    vmu_tipoinmueb.us$setCandidateTargetColumnName("vmu_tipoinmueb");
	    vmu_tipoinmueb.setValueRetrievedDuringFetch(true);
	    vmu_tipoinmueb.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_tipoinmueb.setRequired(true);
	    vmu_tipoinmueb.setFindable(true);
	    vmu_tipoinmueb.setUpdateable(true);
	    vmu_tramite.setStyleClass("textfield");
	    vmu_tramite.us$setMultiValued(true);
	    vmu_tramite.us$setView("text");
	    vmu_tramite.us$setFieldLength(13);
	    vmu_tramite.us$setCandidateTargetColumnName("vmu_password");
	    vmu_tramite.setValueRetrievedDuringFetch(true);
	    vmu_tramite.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_tramite.setFindable(true);
	    vmu_tramite.setUpdateable(true);
	    vmu_tramite.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_unidad.setStyleClass("textfield");
	    vmu_unidad.us$setMultiValued(true);
	    vmu_unidad.us$setView("text");
	    vmu_unidad.us$setFieldLength(4);
	    vmu_unidad.us$setCandidateTargetColumnName("vmu_unidad");
	    vmu_unidad.setValueRetrievedDuringFetch(true);
	    vmu_unidad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_unidad.setRequired(true);
	    vmu_unidad.setFindable(true);
	    vmu_unidad.setUpdateable(true);
	    vmu_unidad.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vmu_vdeposito.setStyleClass("textfield");
	    vmu_vdeposito.us$setMultiValued(true);
	    vmu_vdeposito.us$setView("text");
	    vmu_vdeposito.us$setFieldLength(25);
	    vmu_vdeposito.us$setCandidateTargetColumnName("vmu_vdeposito");
	    vmu_vdeposito.setValueRetrievedDuringFetch(true);
	    vmu_vdeposito.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_vdeposito.setFindable(true);
	    vmu_vdeposito.setUpdateable(false);
	    vmu_vgarage.setStyleClass("textfield");
	    vmu_vgarage.us$setMultiValued(true);
	    vmu_vgarage.us$setView("text");
	    vmu_vgarage.us$setFieldLength(25);
	    vmu_vgarage.us$setCandidateTargetColumnName("vmu_vgarage");
	    vmu_vgarage.setValueRetrievedDuringFetch(true);
	    vmu_vgarage.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_vgarage.setFindable(true);
	    vmu_vgarage.setUpdateable(false);
	    vve_nombre.setStyleClass("textfield");
	    vve_nombre.us$setView("text");
	    vve_nombre.setFindable(false);
	    vve_nombre.setUpdateable(true);
	    vve_nombre.setStopForInput(false);
	    vve_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vve_nombre.setForegroundColor("Black");
	    vve_nombre.setFontSize("12");
	} // cajagrandeRBoletinespropertySetter_3
    } // cajagrandeRBoletines

    public final cajagrandeRBoletines cajagrandeRBoletines = new cajagrandeRBoletines(this);

    public RBoletinesFRM(NXJSession session, NXJForm prevForm)
    {
	super("RBoletinesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected RBoletinesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vmu_maestro");
	setDeleteAllowed(true);
	setStartInAddMode(true);
	us$setBindingType("connection");
	us$setBackgroundColor("#999999");
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "adicionando", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "numero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "formasig", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "xob_proyecto", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_activa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "est", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_act", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cien", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "preciotot", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "RBoletinesFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(ModuloCNegocios.RBoletinesFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(ModuloCNegocios.RBoletinesFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(ModuloCNegocios.RBoletinesFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // RBoletinesFRM

