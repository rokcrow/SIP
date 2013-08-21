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

public class IAClientesFRM
    extends com.unify.nxj.mgr.NXJForm
{

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (us$registerPool.allocateRegister().load(((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.varpass1).eqOp("1").getBooleanValueNullOk())
	    {
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.varpass2.assign(us$registerPool.allocateRegister().load("2"));
	    }
	else
	    {
	    getSession().displayToMessageBox("Antes debe acceder a COMPROMISOS DEL NEGOCIO.");
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
    } // beforeForm
    private IAClientesFRM IAClientesFRM = this;
    public class cajagrandeIAClientes
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl Label19 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label19", false);
	public NXJLabelControl Label20 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label20", false);
	public NXJLabelControl Label9 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label9", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public NXJLabelControl label312 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label312", false);
	public NXJLabelControl label3121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3121", false);
	public NXJLabelControl label3131111111121111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121111", false);
	public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	public NullableStringField textfield11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield11", false, true, 100);
	public /*multi_valued*/ NullableStringField vmu_cli_ciudad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciudad", true, true, 30);
	public class vmu_manzana
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_manzana = us$registerPool.allocateRegister().load(vmu_manzana).getStringValue();
	    } // beforeField

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
			us$stmt1 = us$conn1.prepareStatement("SELECT vuu_lote FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?");
			us$stmt1.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt1, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt1, 3);
			us$rs1 = us$stmt1.executeQuery();
			x_campo = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn1, us$stmt1, us$rs1);
			us$stmt1 = null;
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
		    getSession().displayToMessageBox("La manzana no corresponde.");
		    vmu_manzana.assign(x_manzana);
		    vmu_manzana.setNextField("vmu_manzana");
		    }
	    } // onDataAccept

	    public vmu_manzana()
	    {
		super(ModuloCNegocios.IAClientesFRM.cajagrandeIAClientes.this, "vmu_manzana", true, true, 3);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(3);
		us$setCandidateTargetColumnName("vmu_manzana");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		us$executesCodeBeforeInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_manzana

	public /*multi_valued*/ vmu_manzana vmu_manzana = new vmu_manzana();
	public class vmu_obra
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{
	    NullableNumeric ii = NullableFactory.createNullableNumeric("ii");

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_obra = us$registerPool.allocateRegister().load(vmu_obra).getStringValue();
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("SELECT xob_proyecto FROM xob_obras WHERE xob_empresa =  ?  AND xob_obra =  ?");
			us$stmt2.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt2, 2);
			us$rs2 = us$stmt2.executeQuery();
			xob_proyecto = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn2, us$stmt2, us$rs2);
			us$stmt2 = null;
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
		    getSession().displayToMessageBox("La obra no corresponde.");
		    vmu_obra.assign(x_obra);
		    vmu_obra.setNextField("vmu_obra");
		    }
		ii.assign(us$registerPool.allocateRegister().load(0));

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn3 = getConnection();
		    java.sql.PreparedStatement us$stmt3 = null;
		    ResultSet us$rs3 = null;
		    try
			{
			us$stmt3 = us$conn3.prepareStatement("SELECT vev_etapactu, vev_estado FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			us$stmt3.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt3, 2);
			us$rs3 = us$stmt3.executeQuery();
			int us$rowsTouched3 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd3 = us$rs3.getMetaData();
			    if (us$rsmd3.getColumnCount() != 2)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd3.getColumnCount()), "2"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter3 = us$conn3.createDataIterator(us$rs3);
			    while (us$getter3.next())
				{
				++us$rowsTouched3;
				etapa_activa = us$getter3.getString(1);
				est = us$getter3.getString(2);

				    {
				    ii.assign(us$registerPool.allocateRegister().load(ii).plusOp(1));
				    }
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
		if (us$registerPool.allocateRegister().load(ii).gtOp(1).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Hay m\u00E1s de una etapa activa. Verifique, por favor.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn4 = getConnection();
		    java.sql.PreparedStatement us$stmt4 = null;
		    ResultSet us$rs4 = null;
		    try
			{
			us$stmt4 = us$conn4.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			us$stmt4.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt4, 2);
			us$rs4 = us$stmt4.executeQuery();
			etapa_act = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn4, us$stmt4, us$rs4);
			us$stmt4 = null;
			}
		    catch (SQLException us$ex4)
			{
			getSession().us$setStatus(us$conn4.mapToStatusCode(us$ex4));
			throw us$ex4;
			}
		    catch (NXJDataConnectionException us$ex4)
			{
			getSession().us$setStatus(us$conn4.mapToStatusCode(us$ex4));
			throw us$ex4;
			}
		    finally
			{
			if (us$stmt4 != null)
			    us$conn4.us$closeStatement(us$stmt4);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("No hay etapa ACTIVA en ventas.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    }
	    } // onDataAccept

	    public vmu_obra()
	    {
		super(ModuloCNegocios.IAClientesFRM.cajagrandeIAClientes.this, "vmu_obra", true, true, 2);
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
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_obra

	public /*multi_valued*/ vmu_obra vmu_obra = new vmu_obra();
	public class vmu_unidad
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_unidad = us$registerPool.allocateRegister().load(vmu_unidad).getStringValue();
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn5 = getConnection();
		    java.sql.PreparedStatement us$stmt5 = null;
		    ResultSet us$rs5 = null;
		    try
			{
			us$stmt5 = us$conn5.prepareStatement("SELECT vlp_precio_uni FROM vlp_listapre WHERE vlp_empresa =  ?  AND vlp_obra =  ?  AND vlp_manzana =  ?  AND vlp_unidad =  ?  AND vlp_f_inicial is NULL");
			us$stmt5.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt5, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt5, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt5, 4);
			us$rs5 = us$stmt5.executeQuery();
			vmu_precio_uni = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn5, us$stmt5, us$rs5);
			us$stmt5 = null;
			}
		    catch (SQLException us$ex5)
			{
			getSession().us$setStatus(us$conn5.mapToStatusCode(us$ex5));
			throw us$ex5;
			}
		    catch (NXJDataConnectionException us$ex5)
			{
			getSession().us$setStatus(us$conn5.mapToStatusCode(us$ex5));
			throw us$ex5;
			}
		    finally
			{
			if (us$stmt5 != null)
			    us$conn5.us$closeStatement(us$stmt5);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La unidad no tiene precio de lista actual, verifique por favor. ");
		    vmu_unidad.assign(x_unidad);
		    vmu_unidad.setNextField("vmu_unidad");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn6 = getConnection();
		    java.sql.PreparedStatement us$stmt6 = null;
		    ResultSet us$rs6 = null;
		    try
			{
			us$stmt6 = us$conn6.prepareStatement("SELECT vuu_estado, vuu_tipoinmueble, vuu_etapa, vuu_plus2 FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			us$stmt6.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt6, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt6, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt6, 4);
			us$rs6 = us$stmt6.executeQuery();
			int us$rowsTouched6 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd6 = us$rs6.getMetaData();
			    if (us$rsmd6.getColumnCount() != 4)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd6.getColumnCount()), "4"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter6 = us$conn6.createDataIterator(us$rs6);
			    if (us$getter6.next())
				{
				++us$rowsTouched6;
				estado = us$getter6.getString(1);
				vmu_tipoinmueb = us$getter6.getString(2);
				vmu_etapa_venta = us$getter6.getString(3);
				gasto_escritura = us$getter6.getString(4);
				}
			    }
			finally
			    {
			    if (us$rowsTouched6 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs6 != null)
				us$rs6.close();
			    }
			}
		    catch (SQLException us$ex6)
			{
			getSession().us$setStatus(us$conn6.mapToStatusCode(us$ex6));
			throw us$ex6;
			}
		    catch (NXJDataConnectionException us$ex6)
			{
			getSession().us$setStatus(us$conn6.mapToStatusCode(us$ex6));
			throw us$ex6;
			}
		    finally
			{
			if (us$stmt6 != null)
			    us$conn6.us$closeStatement(us$stmt6);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La unidad no corresponde. ");
		    vmu_unidad.assign(x_unidad);
		    vmu_unidad.setNextField("vmu_unidad");
		    }
		if (estado.neqOp("D").getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La unidad no est\u00E1 disponible para la venta.");
		    getSession().queueCommand("CLEAR_TO_ADD");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn7 = getConnection();
		    java.sql.PreparedStatement us$stmt7 = null;
		    ResultSet us$rs7 = null;
		    try
			{
			us$stmt7 = us$conn7.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_etapactu =  ?  AND vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			us$stmt7.setString(1, vmu_etapa_venta.getStringValue());
			us$stmt7.setString(2, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt7, 3);
			us$rs7 = us$stmt7.executeQuery();
			etapa_activa = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn7, us$stmt7, us$rs7);
			us$stmt7 = null;
			}
		    catch (SQLException us$ex7)
			{
			getSession().us$setStatus(us$conn7.mapToStatusCode(us$ex7));
			throw us$ex7;
			}
		    catch (NXJDataConnectionException us$ex7)
			{
			getSession().us$setStatus(us$conn7.mapToStatusCode(us$ex7));
			throw us$ex7;
			}
		    finally
			{
			if (us$stmt7 != null)
			    us$conn7.us$closeStatement(us$stmt7);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La unidad no se encuentra en Etapa de Ventas Activas. ");
		    getSession().displayToMessageBox("La Etapa Activa actual es: " + etapa_act.toString() + ". ");
		    getSession().queueCommand("CLEAR_TO_ADD");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn8 = getConnection();
		    java.sql.PreparedStatement us$stmt8 = null;
		    ResultSet us$rs8 = null;
		    try
			{
			us$stmt8 = us$conn8.prepareStatement("SELECT vuu_fterminacion, vuu_f_entregaprog FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			us$stmt8.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt8, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt8, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt8, 4);
			us$rs8 = us$stmt8.executeQuery();
			int us$rowsTouched8 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd8 = us$rs8.getMetaData();
			    if (us$rsmd8.getColumnCount() != 2)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd8.getColumnCount()), "2"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter8 = us$conn8.createDataIterator(us$rs8);
			    if (us$getter8.next())
				{
				++us$rowsTouched8;
				f_ent_real = us$getter8.getString(1);
				f_ent_pacta = us$getter8.getString(2);
				}
			    }
			finally
			    {
			    if (us$rowsTouched8 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs8 != null)
				us$rs8.close();
			    }
			}
		    catch (SQLException us$ex8)
			{
			getSession().us$setStatus(us$conn8.mapToStatusCode(us$ex8));
			throw us$ex8;
			}
		    catch (NXJDataConnectionException us$ex8)
			{
			getSession().us$setStatus(us$conn8.mapToStatusCode(us$ex8));
			throw us$ex8;
			}
		    finally
			{
			if (us$stmt8 != null)
			    us$conn8.us$closeStatement(us$stmt8);
			}
		    }
		if (f_ent_pacta.isNull().getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La unidad no tiene fecha de entre definida, verifique por favor.");
		    getSession().queueCommand("CLEAR_TO_ADD");
		    }
		else
		    {
		    if (f_ent_real.isNull().getBooleanValueNullOk())
			{
			f_entrega = f_ent_pacta.getStringValue();
			f_escritura = f_ent_pacta.minusOp(30).getStringValue();
			}
		    else
			{
			f_entrega = f_ent_real.getStringValue();
			f_escritura = f_ent_real.minusOp(30).getStringValue();
			}
		    }
		if (adicionando.eqOp(1).getBooleanValueNullOk())
		    {
		    vmu_f_ent_pacta = f_entrega.getStringValue();
		    vmu_ent_escritura = f_escritura.getStringValue();
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn9 = getConnection();
		    java.sql.PreparedStatement us$stmt9 = null;
		    ResultSet us$rs9 = null;
		    try
			{
			us$stmt9 = us$conn9.prepareStatement("SELECT vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_etapa = \'EV\' AND vut_tramite = \'PO\' AND vut_f_real !=  ?  AND vut_f_real is not NULL");
			us$stmt9.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt9, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt9, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt9, 4);
			us$stmt9.setString(5, fechafalsa.getStringValue());
			us$rs9 = us$stmt9.executeQuery();
			vut_f_real = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn9, us$stmt9, us$rs9);
			us$stmt9 = null;
			}
		    catch (SQLException us$ex9)
			{
			getSession().us$setStatus(us$conn9.mapToStatusCode(us$ex9));
			throw us$ex9;
			}
		    catch (NXJDataConnectionException us$ex9)
			{
			getSession().us$setStatus(us$conn9.mapToStatusCode(us$ex9));
			throw us$ex9;
			}
		    finally
			{
			if (us$stmt9 != null)
			    us$conn9.us$closeStatement(us$stmt9);
			}
		    }
		if (getSession().getStatus() == StatusCode.SS_NORM)
		    {
		    f_permiso = vut_f_real.getStringValue();
		    getSession().displayToMessageBox("Casa terminada. Entrega r\u00E1pida.");
		    getSession().displayToMessageBox("Debe elaborar el contrato de Comrpa Venta cuanto antes.");
		    }
		else
		    f_permiso = "01/01/2001";
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn10 = getConnection();
		    java.sql.PreparedStatement us$stmt10 = null;
		    ResultSet us$rs10 = null;
		    try
			{
			us$stmt10 = us$conn10.prepareStatement("SELECT vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_etapa = \'EV\' AND vut_tramite = \'PO\' AND vut_f_real !=  ?  AND vut_f_real is not NULL");
			us$stmt10.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt10, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt10, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt10, 4);
			us$stmt10.setString(5, fechafalsa.getStringValue());
			us$rs10 = us$stmt10.executeQuery();
			vut_f_real = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn10, us$stmt10, us$rs10);
			us$stmt10 = null;
			}
		    catch (SQLException us$ex10)
			{
			getSession().us$setStatus(us$conn10.mapToStatusCode(us$ex10));
			throw us$ex10;
			}
		    catch (NXJDataConnectionException us$ex10)
			{
			getSession().us$setStatus(us$conn10.mapToStatusCode(us$ex10));
			throw us$ex10;
			}
		    finally
			{
			if (us$stmt10 != null)
			    us$conn10.us$closeStatement(us$stmt10);
			}
		    }
		if (getSession().getStatus() == StatusCode.SS_NORM)
		    {
		    f_permiso = vut_f_real.getStringValue();
		    }
		else
		    f_permiso = "01/01/2001";

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn11 = getConnection();
		    java.sql.PreparedStatement us$stmt11 = null;
		    ResultSet us$rs11 = null;
		    try
			{
			us$stmt11 = us$conn11.prepareStatement("SELECT vuu_fterminacion, vuu_f_entregaprog, vuu_area_lote, vuu_area_const, vuu_plus2 FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			us$stmt11.setString(1, vmu_empresa.getStringValue());
			vmu_obra.us$setSqlParameterValue(us$stmt11, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt11, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt11, 4);
			us$rs11 = us$stmt11.executeQuery();
			int us$rowsTouched11 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd11 = us$rs11.getMetaData();
			    if (us$rsmd11.getColumnCount() != 5)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd11.getColumnCount()), "5"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter11 = us$conn11.createDataIterator(us$rs11);
			    if (us$getter11.next())
				{
				++us$rowsTouched11;
				f_ent_real = us$getter11.getString(1);
				f_ent_pacta = us$getter11.getString(2);
				area_lote = us$getter11.getString(3);
				area_const = us$getter11.getString(4);
				gasto_escritura = us$getter11.getString(5);
				}
			    }
			finally
			    {
			    if (us$rowsTouched11 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs11 != null)
				us$rs11.close();
			    }
			}
		    catch (SQLException us$ex11)
			{
			getSession().us$setStatus(us$conn11.mapToStatusCode(us$ex11));
			throw us$ex11;
			}
		    catch (NXJDataConnectionException us$ex11)
			{
			getSession().us$setStatus(us$conn11.mapToStatusCode(us$ex11));
			throw us$ex11;
			}
		    finally
			{
			if (us$stmt11 != null)
			    us$conn11.us$closeStatement(us$stmt11);
			}
		    }
		if (f_ent_pacta.isNull().getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La unidad no tiene fecha de entre definida, verifique por favor.");
		    }
		else
		    {
		    if (f_ent_real.isNull().getBooleanValueNullOk())
			{
			f_entrega = f_ent_pacta.getStringValue();
			f_escritura = f_ent_pacta.minusOp(30).getStringValue();
			}
		    else
			{
			f_entrega = f_ent_real.getStringValue();
			f_escritura = f_ent_real.minusOp(30).getStringValue();
			}
		    }
	    } // whenValueChanges

	    public vmu_unidad()
	    {
		super(ModuloCNegocios.IAClientesFRM.cajagrandeIAClientes.this, "vmu_unidad", true, true, 4);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(4);
		us$setCandidateTargetColumnName("vmu_unidad");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		us$executesCodeBeforeInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_unidad

	public /*multi_valued*/ vmu_unidad vmu_unidad = new vmu_unidad();
	public /*multi_valued*/ NullableStringField vpp_actividad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_actividad", true, true, 2);
	public /*multi_valued*/ NullableStringField vpp_estado_civil = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_estado_civil", true, true, 2);
	public /*multi_valued*/ NullableStringField vpp_genero = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_genero", true, true, 2);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.IAClientesFRM.cajagrandeIAClientes.box11.this, "image1", false);
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
		    super(ModuloCNegocios.IAClientesFRM.cajagrandeIAClientes.box111.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);
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
		label211.setStyleClass("label");
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

	public cajagrandeIAClientes(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeIAClientes", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeIAClientespropertySetter_0();
	} // <init>

	private void cajagrandeIAClientespropertySetter_0()
	{
	    Label19.setStyleClass("label");
	    Label19.setForegroundColor("Black");
	    Label19.setFontSize("12");
	    Label20.setStyleClass("label");
	    Label20.setForegroundColor("Black");
	    Label20.setFontSize("12");
	    Label9.setStyleClass("label");
	    Label9.setForegroundColor("Black");
	    Label9.setFontSize("12");
	    label31.setStyleClass("label");
	    label31.setFontSize("12");
	    label311.setStyleClass("label");
	    label311.setFontSize("12");
	    label3111.setStyleClass("label");
	    label3111.setFontSize("12");
	    label312.setStyleClass("label");
	    label312.setFontSize("12");
	    label3121.setStyleClass("label");
	    label3121.setFontSize("12");
	    label3131111111121111.setStyleClass("label");
	    label3131111111121111.setFontSize("12");
	    textfield1.setStyleClass("textfield");
	    textfield1.us$setView("text");
	    textfield1.setFindable(false);
	    textfield11.setStyleClass("textfield");
	    textfield11.us$setView("select");
	    textfield11.setFindable(false);
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
	    vpp_actividad.setStyleClass("dropdown_list");
	    vpp_actividad.us$setMultiValued(true);
	    vpp_actividad.us$setView("select");
	    vpp_actividad.us$setFieldLength(2);
	    vpp_actividad.setAutoAccept(true);
	    vpp_actividad.us$setCandidateTargetColumnName("vpp_actividad");
	    vpp_actividad.setValueRetrievedDuringFetch(true);
	    vpp_actividad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vpp_actividad.setFindable(true);
	    vpp_actividad.setUpdateable(true);
	    vpp_actividad.us$setMultiValuedOptions(true);
	    vpp_actividad.setForegroundColor("Black");
	    vpp_actividad.setFontSize("12");
	    vpp_estado_civil.setStyleClass("dropdown_list");
	    vpp_estado_civil.us$setMultiValued(true);
	    vpp_estado_civil.us$setView("select");
	    vpp_estado_civil.us$setFieldLength(2);
	    vpp_estado_civil.setAutoAccept(true);
	    vpp_estado_civil.us$setCandidateTargetColumnName("vpp_estado_civil");
	    vpp_estado_civil.setValueRetrievedDuringFetch(true);
	    vpp_estado_civil.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vpp_estado_civil.setFindable(true);
	    vpp_estado_civil.setUpdateable(true);
	    vpp_estado_civil.setForegroundColor("Black");
	    vpp_estado_civil.setFontSize("12");
	    vpp_genero.setStyleClass("dropdown_list");
	    vpp_genero.us$setMultiValued(true);
	    vpp_genero.us$setView("select");
	    vpp_genero.us$setFieldLength(2);
	    vpp_genero.setAutoAccept(true);
	    vpp_genero.us$setCandidateTargetColumnName("vpp_genero");
	    vpp_genero.setValueRetrievedDuringFetch(true);
	    vpp_genero.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vpp_genero.setFindable(true);
	    vpp_genero.setUpdateable(true);
	    vpp_genero.setForegroundColor("Black");
	    vpp_genero.setFontSize("12");
	} // cajagrandeIAClientespropertySetter_0
    } // cajagrandeIAClientes

    public final cajagrandeIAClientes cajagrandeIAClientes = new cajagrandeIAClientes(this);

    public IAClientesFRM(NXJSession session, NXJForm prevForm)
    {
	super("IAClientesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected IAClientesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vev_etapaven");
	setStartInAddMode(false);
	us$setBackgroundColor("#999999");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "IAClientesFRM";
} // IAClientesFRM

