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
    NullableAmount vlr_ev = NullableFactory.createNullableAmount("vlr_ev");
    NullableAmount zero = NullableFactory.createNullableAmount("zero");
    NullableAmount imporenta = NullableFactory.createNullableAmount("imporenta");
    NullableAmount tasa = NullableFactory.createNullableAmount("tasa");
    NullableAmount preciotot = NullableFactory.createNullableAmount("preciotot");
    NullableAmount cien = NullableFactory.createNullableAmount("cien");
    NullableAmount cero = NullableFactory.createNullableAmount("cero");
    NullableString etapa_act = NullableFactory.createNullableString("etapa_act");
    NullableString est = NullableFactory.createNullableString("est");
    NullableString etapa_activa = NullableFactory.createNullableString("etapa_activa");
    NullableString xob_proyecto = NullableFactory.createNullableString("xob_proyecto");
    NullableString formasig = NullableFactory.createNullableString("formasig");
    NullableString numero = NullableFactory.createNullableString("numero");
    NullableString forma_pago = NullableFactory.createNullableString("forma_pago");
    NullableString cli_clase = NullableFactory.createNullableString("cli_clase");
    NullableString corporacion = NullableFactory.createNullableString("corporacion");
    NullableString deposito2 = NullableFactory.createNullableString("deposito2");
    NullableString deposito1 = NullableFactory.createNullableString("deposito1");
    NullableString garage3 = NullableFactory.createNullableString("garage3");
    NullableString garage2 = NullableFactory.createNullableString("garage2");
    NullableString garage1 = NullableFactory.createNullableString("garage1");
    NullableString tipounidad = NullableFactory.createNullableString("tipounidad");
    NullableNumeric adiciona = NullableFactory.createNullableNumeric("adiciona");
    NullableNumeric adicionando = NullableFactory.createNullableNumeric("adicionando");
    NullableDate f_separacion = NullableFactory.createNullableDate("f_separacion");

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
	com.unify.nxj.mgr.datatypes.Register us$R1;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (us$registerPool.allocateRegister().load(cajagrandeRBoletines.number).neqOp("3").getBooleanValueNullOk())
	    {
	    getSession().displayToMessageBox("Debe ir a Compromisos del Negocio antes de agregar un registro.");
	    rejectOperation();
	    }
	adiciona.assign(us$registerPool.allocateRegister().load(1));
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_precio_uni).plusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_vgarage)));
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).minusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_descuentos)));
	cajagrandeRBoletines.vmu_vdeposito.assign(us$registerPool.allocateRegister().load(0));
	getSession().displayToMessageBox("Actualizando unidad y/o garajes.");
	if (((us$R1 = us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_tipoinmueb).eqOp("C")).isLogicalOrDecided() ? us$R1 : us$R1.logicalOrOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_tipoinmueb).eqOp("A"))).getBooleanValueNullOk())
	    {
	    tipounidad.assign(us$registerPool.allocateRegister().load("V"));
	    }
	else
	    tipounidad.assign(us$registerPool.allocateRegister().load("C"));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn2 = getConnection();
	    java.sql.PreparedStatement us$stmt2 = null;
	    ResultSet us$rs2 = null;
	    try
		{
		us$stmt2 = us$conn2.prepareStatement("SELECT vir_tasa FROM vir_imporenta WHERE vir_tipounidad =  ?  AND vir_precio_min <=  ?  AND vir_precio_max >=  ?");
		tipounidad.us$setSqlParameterValue(us$stmt2, 1);
		cajagrandeRBoletines.vmu_preciotot.us$setSqlParameterValue(us$stmt2, 2);
		cajagrandeRBoletines.vmu_preciotot.us$setSqlParameterValue(us$stmt2, 3);
		us$rs2 = us$stmt2.executeQuery();
		int us$rowsTouched2 = 0;
		try
		    {
		    java.sql.ResultSetMetaData us$rsmd2 = us$rs2.getMetaData();
		    if (us$rsmd2.getColumnCount() != 1)
			throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
			    {
			    Integer.toString(us$rsmd2.getColumnCount()), "1"
			    }));
		    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter2 = us$conn2.createDataIterator(us$rs2);
		    if (us$getter2.next())
			{
			++us$rowsTouched2;
			us$getter2.assignValueToVariable(tasa, 1);
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
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("No se puede seleccionar la tasa para el precio de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ".");
	    tasa.assign(us$registerPool.allocateRegister().load(cero));
	    }
	imporenta.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).mulOp(us$registerPool.allocateRegister().load(tasa)).divOp(us$registerPool.allocateRegister().load(cien)));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn3 = getConnection();
	    java.sql.PreparedStatement us$stmt3 = null;
	    ResultSet us$rs3 = null;
	    try
		{
		us$stmt3 = us$conn3.prepareStatement("UPDATE vuu_unidades SET vuu_estado = \'V\', vuu_imporenta =  ?  WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
		imporenta.us$setSqlParameterValue(us$stmt3, 1);
		vmu_empresa.us$setSqlParameterValue(us$stmt3, 2);
		cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt3, 3);
		cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt3, 4);
		cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt3, 5);
		if (us$stmt3.executeUpdate() == 0)
		    getSession().us$setStatus(StatusCode.SS_NOREC);
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
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("La unidad NO pudo ser actualizada como  vendida.");
	    adiciona.assign(us$registerPool.allocateRegister().load(0));
	    }
	getSession().displayToMessageBox("Actualizando estad\u00EDsticas de obra.");
	if (us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_forma_pago).eqOp("C").getBooleanValueNullOk())
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn4 = getConnection();
		java.sql.PreparedStatement us$stmt4 = null;
		ResultSet us$rs4 = null;
		try
		    {
		    us$stmt4 = us$conn4.prepareStatement("UPDATE ves_estadisticas SET ves_univenco = ves_univenco + 1, ves_unidispo = ves_unidispo - 1 WHERE ves_empresa =  ?  AND ves_obra =  ?");
		    vmu_empresa.us$setSqlParameterValue(us$stmt4, 1);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt4, 2);
		    if (us$stmt4.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
		getSession().displayToMessageBox("No pudo actualizar estad\u00EDsticas de obra.");
		adiciona.assign(us$registerPool.allocateRegister().load(0));
		}
	    }
	if (us$registerPool.allocateRegister().load(adiciona).eqOp(0).getBooleanValueNullOk())
	    rejectOperation();
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

    public void afterFind()
	throws Exception
    {
	com.unify.nxj.mgr.datatypes.Register us$R5;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (((us$R5 = us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).neqOp("ADVEN")).isLogicalOrDecided() ? us$R5 : us$R5.logicalOrOp(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).neqOp("CUSEZAR"))).getBooleanValueNullOk())
	    {
	    cajagrandeRBoletines.vmu_cli_clase.setStopForInput(false);
	    cajagrandeRBoletines.vau_apoderado.setStopForInput(false);
	    cajagrandeRBoletines.vau_apode_nit.setStopForInput(false);
	    }
	else
	    {
	    cajagrandeRBoletines.vmu_cli_clase.setStopForInput(true);
	    cajagrandeRBoletines.vau_apoderado.setStopForInput(true);
	    cajagrandeRBoletines.vau_apode_nit.setStopForInput(true);
	    }
    } // afterFind

    public void beforeUpdate()
	throws Exception
    {
	com.unify.nxj.mgr.datatypes.Register us$R7;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn6 = getConnection();
	    java.sql.PreparedStatement us$stmt6 = null;
	    ResultSet us$rs6 = null;
	    try
		{
		us$stmt6 = us$conn6.prepareStatement("SELECT vmu_f_separacion, vmu_garage1, vmu_garage2, vmu_garage3, vmu_deposito1, vmu_deposito2, vmu_corporacion, vmu_forma_pago, vmu_cli_clase FROM vmu_maestro WHERE vmu_empresa =  ?  AND vmu_obra =  ?  AND vmu_manzana =  ?  AND vmu_unidad =  ?");
		vmu_empresa.us$setSqlParameterValue(us$stmt6, 1);
		cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt6, 2);
		cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt6, 3);
		cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt6, 4);
		us$rs6 = us$stmt6.executeQuery();
		int us$rowsTouched6 = 0;
		try
		    {
		    java.sql.ResultSetMetaData us$rsmd6 = us$rs6.getMetaData();
		    if (us$rsmd6.getColumnCount() != 9)
			throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
			    {
			    Integer.toString(us$rsmd6.getColumnCount()), "9"
			    }));
		    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter6 = us$conn6.createDataIterator(us$rs6);
		    if (us$getter6.next())
			{
			++us$rowsTouched6;
			us$getter6.assignValueToVariable(f_separacion, 1);
			us$getter6.assignValueToVariable(garage1, 2);
			us$getter6.assignValueToVariable(garage2, 3);
			us$getter6.assignValueToVariable(garage3, 4);
			us$getter6.assignValueToVariable(deposito1, 5);
			us$getter6.assignValueToVariable(deposito2, 6);
			us$getter6.assignValueToVariable(corporacion, 7);
			us$getter6.assignValueToVariable(forma_pago, 8);
			us$getter6.assignValueToVariable(cli_clase, 9);
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
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_precio_uni).plusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_vgarage)).minusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_descuentos)));
	if (((us$R7 = us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_tipoinmueb).eqOp("C")).isLogicalOrDecided() ? us$R7 : us$R7.logicalOrOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_tipoinmueb).eqOp("A"))).getBooleanValueNullOk())
	    {
	    tipounidad.assign(us$registerPool.allocateRegister().load("V"));
	    }
	else
	    tipounidad.assign(us$registerPool.allocateRegister().load("C"));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn8 = getConnection();
	    java.sql.PreparedStatement us$stmt8 = null;
	    ResultSet us$rs8 = null;
	    try
		{
		us$stmt8 = us$conn8.prepareStatement("SELECT vir_tasa FROM vir_imporenta WHERE vir_tipounidad =  ?  AND vir_precio_min <=  ?  AND vir_precio_max >=  ?");
		tipounidad.us$setSqlParameterValue(us$stmt8, 1);
		cajagrandeRBoletines.vmu_preciotot.us$setSqlParameterValue(us$stmt8, 2);
		cajagrandeRBoletines.vmu_preciotot.us$setSqlParameterValue(us$stmt8, 3);
		us$rs8 = us$stmt8.executeQuery();
		int us$rowsTouched8 = 0;
		try
		    {
		    java.sql.ResultSetMetaData us$rsmd8 = us$rs8.getMetaData();
		    if (us$rsmd8.getColumnCount() != 1)
			throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
			    {
			    Integer.toString(us$rsmd8.getColumnCount()), "1"
			    }));
		    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter8 = us$conn8.createDataIterator(us$rs8);
		    if (us$getter8.next())
			{
			++us$rowsTouched8;
			us$getter8.assignValueToVariable(tasa, 1);
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
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("No se puede seleccionar la tasa para el precio de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ".");
	    tasa.assign(us$registerPool.allocateRegister().load(cero));
	    }
	imporenta.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).mulOp(us$registerPool.allocateRegister().load(tasa)).divOp(us$registerPool.allocateRegister().load(cien)));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn9 = getConnection();
	    java.sql.PreparedStatement us$stmt9 = null;
	    ResultSet us$rs9 = null;
	    try
		{
		us$stmt9 = us$conn9.prepareStatement("UPDATE vuu_unidades SET vuu_imporenta =  ?  WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
		imporenta.us$setSqlParameterValue(us$stmt9, 1);
		vmu_empresa.us$setSqlParameterValue(us$stmt9, 2);
		cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt9, 3);
		cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt9, 4);
		cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt9, 5);
		if (us$stmt9.executeUpdate() == 0)
		    getSession().us$setStatus(StatusCode.SS_NOREC);
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
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("No se puede actualizar el impuesto de renta de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ".");
	    }
	else
	    getSession().commitTransaction();
    } // beforeUpdate

    public void afterUpdate()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	zero.assign(us$registerPool.allocateRegister().load(0));
	vlr_ev.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).mulOp(-1));

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn10 = getConnection();
	    java.sql.PreparedStatement us$stmt10 = null;
	    ResultSet us$rs10 = null;
	    try
		{
		us$stmt10 = us$conn10.prepareStatement("UPDATE vcn_comproneg SET vcn_vlr_compro =  ? , vcn_vlr_saldo = ( ?  - vcn_vlr_pago), vcn_fec_comp =  ?  WHERE vcn_empresa =  ?  AND vcn_obra =  ?  AND vcn_manzana =  ?  AND vcn_unidad =  ?  AND vcn_cptopago = \'EV\'");
		vlr_ev.us$setSqlParameterValue(us$stmt10, 1);
		vlr_ev.us$setSqlParameterValue(us$stmt10, 2);
		cajagrandeRBoletines.vmu_f_escritura.us$setSqlParameterValue(us$stmt10, 3);
		vmu_empresa.us$setSqlParameterValue(us$stmt10, 4);
		cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt10, 5);
		cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt10, 6);
		cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt10, 7);
		if (us$stmt10.executeUpdate() == 0)
		    getSession().us$setStatus(StatusCode.SS_NOREC);
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
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("No se puede actualizar el compromiso de EV.");
	    getSession().rollbackTransaction();
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
	getSession().displayToMessageBox("Actualizando el compromiso SB o EC y AE, seg\u00FAn el caso.");
	if (us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_forma_pago).eqOp("C").getBooleanValueNullOk())
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn11 = getConnection();
		java.sql.PreparedStatement us$stmt11 = null;
		ResultSet us$rs11 = null;
		try
		    {
		    us$stmt11 = us$conn11.prepareStatement("UPDATE vcn_comproneg SET vcn_fec_comp =  ?  WHERE vcn_empresa =  ?  AND vcn_obra =  ?  AND vcn_manzana =  ?  AND vcn_unidad =  ?  AND vcn_cptopago = \'EC\'");
		    cajagrandeRBoletines.vmu_f_escritura.us$setSqlParameterValue(us$stmt11, 1);
		    vmu_empresa.us$setSqlParameterValue(us$stmt11, 2);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt11, 3);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt11, 4);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt11, 5);
		    if (us$stmt11.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
	    if (getSession().getStatus() != StatusCode.SS_NORM)
		{
		getSession().displayToMessageBox("No se puede actualizar el compromiso de EC.");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}
	    }
	else
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn12 = getConnection();
		java.sql.PreparedStatement us$stmt12 = null;
		ResultSet us$rs12 = null;
		try
		    {
		    us$stmt12 = us$conn12.prepareStatement("UPDATE vcn_comproneg SET vcn_fec_comp =  ?  WHERE vcn_empresa =  ?  AND vcn_obra =  ?  AND vcn_manzana =  ?  AND vcn_unidad =  ?  AND vcn_cptopago = \'SB\'");
		    cajagrandeRBoletines.vmu_f_ent_pacta.us$setSqlParameterValue(us$stmt12, 1);
		    vmu_empresa.us$setSqlParameterValue(us$stmt12, 2);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt12, 3);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt12, 4);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt12, 5);
		    if (us$stmt12.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
		    }
		catch (SQLException us$ex12)
		    {
		    getSession().us$setStatus(us$conn12.mapToStatusCode(us$ex12));
		    throw us$ex12;
		    }
		catch (NXJDataConnectionException us$ex12)
		    {
		    getSession().us$setStatus(us$conn12.mapToStatusCode(us$ex12));
		    throw us$ex12;
		    }
		finally
		    {
		    if (us$stmt12 != null)
			us$conn12.us$closeStatement(us$stmt12);
		    }
		}
	    if (getSession().getStatus() != StatusCode.SS_NORM)
		{
		getSession().displayToMessageBox("No se puede actualizar el compromiso de SB.");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn13 = getConnection();
		java.sql.PreparedStatement us$stmt13 = null;
		ResultSet us$rs13 = null;
		try
		    {
		    us$stmt13 = us$conn13.prepareStatement("UPDATE vcn_comproneg SET vcn_fec_comp =  ?  WHERE vcn_empresa =  ?  AND vcn_obra =  ?  AND vcn_manzana =  ?  AND vcn_unidad =  ?  AND vcn_cptopago = \'AE\'");
		    cajagrandeRBoletines.vmu_f_escritura.us$setSqlParameterValue(us$stmt13, 1);
		    vmu_empresa.us$setSqlParameterValue(us$stmt13, 2);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt13, 3);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt13, 4);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt13, 5);
		    if (us$stmt13.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
		    }
		catch (SQLException us$ex13)
		    {
		    getSession().us$setStatus(us$conn13.mapToStatusCode(us$ex13));
		    throw us$ex13;
		    }
		catch (NXJDataConnectionException us$ex13)
		    {
		    getSession().us$setStatus(us$conn13.mapToStatusCode(us$ex13));
		    throw us$ex13;
		    }
		finally
		    {
		    if (us$stmt13 != null)
			us$conn13.us$closeStatement(us$stmt13);
		    }
		}
	    if (getSession().getStatus() != StatusCode.SS_NORM && getSession().getStatus() != StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No se puede actualizar el compromiso de EC.");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}
	    }

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn14 = getConnection();
	    java.sql.PreparedStatement us$stmt14 = null;
	    ResultSet us$rs14 = null;
	    try
		{
		us$stmt14 = us$conn14.prepareStatement("UPDATE vuu_unidades SET vuu_imporenta =  ?  WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
		imporenta.us$setSqlParameterValue(us$stmt14, 1);
		vmu_empresa.us$setSqlParameterValue(us$stmt14, 2);
		cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt14, 3);
		cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt14, 4);
		cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt14, 5);
		if (us$stmt14.executeUpdate() == 0)
		    getSession().us$setStatus(StatusCode.SS_NOREC);
		}
	    catch (SQLException us$ex14)
		{
		getSession().us$setStatus(us$conn14.mapToStatusCode(us$ex14));
		throw us$ex14;
		}
	    catch (NXJDataConnectionException us$ex14)
		{
		getSession().us$setStatus(us$conn14.mapToStatusCode(us$ex14));
		throw us$ex14;
		}
	    finally
		{
		if (us$stmt14 != null)
		    us$conn14.us$closeStatement(us$stmt14);
		}
	    }
	if (getSession().getStatus() != StatusCode.SS_NORM)
	    {
	    getSession().displayToMessageBox("No se puede actualizar el impuesto de renta de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ".");
	    getSession().rollbackTransaction();
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
	else
	    getSession().commitTransaction();
    } // afterUpdate

    public void afterAdd()
	throws Exception
    {
	if (isCurrentRecordStored() == false)
	    {
	    getSession().displayToMessageBox("El registro no puede ser adicionado. Falta informaci\u00F3n.");
	    getSession().rollbackTransaction();
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
    } // afterAdd
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
	public /*multi_valued*/ NullableStringField vmu_cli_ciudad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciudad", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_cli_ciunit = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciunit", true, true, 20);
	public /*multi_valued*/ NullableStringField vmu_cli_clase = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_clase", true, true, 2);
	public class vmu_cli_corres
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public java.util.List us$evaluateListboxQuery()
		throws java.sql.SQLException, com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
	    {
		int us$rowCount = 0;
		java.util.List us$list = new java.util.ArrayList();
		String us$proj1;

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn15 = getConnection();
		    java.sql.PreparedStatement us$stmt15 = null;
		    ResultSet us$rs15 = null;
		    try
			{
			us$stmt15 = us$conn15.prepareStatement("select xzo_nombre from xzo_zonas");
			us$rs15 = us$stmt15.executeQuery();
			int us$rowsTouched15 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd15 = us$rs15.getMetaData();
			    if (us$rsmd15.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd15.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter15 = us$conn15.createDataIterator(us$rs15);
			    while (us$getter15.next())
				{
				++us$rowsTouched15;
				us$proj1 = us$getter15.getString(1);

				    {
				    if (us$rowCount++ == 300)
					break;
				    us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				    }
				}
			    }
			finally
			    {
			    if (us$rowsTouched15 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs15 != null)
				us$rs15.close();
			    }
			}
		    catch (SQLException us$ex15)
			{
			getSession().us$setStatus(us$conn15.mapToStatusCode(us$ex15));
			throw us$ex15;
			}
		    catch (NXJDataConnectionException us$ex15)
			{
			getSession().us$setStatus(us$conn15.mapToStatusCode(us$ex15));
			throw us$ex15;
			}
		    finally
			{
			if (us$stmt15 != null)
			    us$conn15.us$closeStatement(us$stmt15);
			}
		    }
		return us$list;
	    } // us$evaluateListboxQuery

	    public vmu_cli_corres()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_cli_corres", true, true, 50);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("select");
		us$setFieldLength(50);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("vmu_cli_corres");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		setForegroundColor("Black");
		setFontSize("12");
	    } // <init>
	} // vmu_cli_corres

	public /*multi_valued*/ vmu_cli_corres vmu_cli_corres = new vmu_cli_corres();
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
	public /*multi_valued*/ NullableDateField vmu_f_entprog = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_entprog", true, true, 10);
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
		    NXJDataConnection us$conn16 = getConnection();
		    java.sql.PreparedStatement us$stmt16 = null;
		    ResultSet us$rs16 = null;
		    try
			{
			us$stmt16 = us$conn16.prepareStatement("SELECT xob_proyecto FROM xob_obras WHERE xob_empresa =  ?  AND xob_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt16, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt16, 2);
			us$rs16 = us$stmt16.executeQuery();
			int us$rowsTouched16 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd16 = us$rs16.getMetaData();
			    if (us$rsmd16.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd16.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter16 = us$conn16.createDataIterator(us$rs16);
			    if (us$getter16.next())
				{
				++us$rowsTouched16;
				us$getter16.assignValueToVariable(xob_proyecto, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched16 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs16 != null)
				us$rs16.close();
			    }
			}
		    catch (SQLException us$ex16)
			{
			getSession().us$setStatus(us$conn16.mapToStatusCode(us$ex16));
			throw us$ex16;
			}
		    catch (NXJDataConnectionException us$ex16)
			{
			getSession().us$setStatus(us$conn16.mapToStatusCode(us$ex16));
			throw us$ex16;
			}
		    finally
			{
			if (us$stmt16 != null)
			    us$conn16.us$closeStatement(us$stmt16);
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
		    NXJDataConnection us$conn17 = getConnection();
		    java.sql.PreparedStatement us$stmt17 = null;
		    ResultSet us$rs17 = null;
		    try
			{
			us$stmt17 = us$conn17.prepareStatement("SELECT vev_etapactu, vev_estado FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt17, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt17, 2);
			us$rs17 = us$stmt17.executeQuery();
			int us$rowsTouched17 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd17 = us$rs17.getMetaData();
			    if (us$rsmd17.getColumnCount() != 2)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd17.getColumnCount()), "2"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter17 = us$conn17.createDataIterator(us$rs17);
			    while (us$getter17.next())
				{
				++us$rowsTouched17;
				us$getter17.assignValueToVariable(etapa_activa, 1);
				us$getter17.assignValueToVariable(est, 2);

				    {
				    ii.assign(us$registerPool.allocateRegister().load(ii).plusOp(1));
				    }
				}
			    }
			finally
			    {
			    if (us$rowsTouched17 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs17 != null)
				us$rs17.close();
			    }
			}
		    catch (SQLException us$ex17)
			{
			getSession().us$setStatus(us$conn17.mapToStatusCode(us$ex17));
			throw us$ex17;
			}
		    catch (NXJDataConnectionException us$ex17)
			{
			getSession().us$setStatus(us$conn17.mapToStatusCode(us$ex17));
			throw us$ex17;
			}
		    finally
			{
			if (us$stmt17 != null)
			    us$conn17.us$closeStatement(us$stmt17);
			}
		    }
		if (us$registerPool.allocateRegister().load(ii).gtOp(1).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Hay m\u00E1s de una etapa activa. Verifique.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn18 = getConnection();
		    java.sql.PreparedStatement us$stmt18 = null;
		    ResultSet us$rs18 = null;
		    try
			{
			us$stmt18 = us$conn18.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt18, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt18, 2);
			us$rs18 = us$stmt18.executeQuery();
			int us$rowsTouched18 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd18 = us$rs18.getMetaData();
			    if (us$rsmd18.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd18.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter18 = us$conn18.createDataIterator(us$rs18);
			    if (us$getter18.next())
				{
				++us$rowsTouched18;
				us$getter18.assignValueToVariable(etapa_act, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched18 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs18 != null)
				us$rs18.close();
			    }
			}
		    catch (SQLException us$ex18)
			{
			getSession().us$setStatus(us$conn18.mapToStatusCode(us$ex18));
			throw us$ex18;
			}
		    catch (NXJDataConnectionException us$ex18)
			{
			getSession().us$setStatus(us$conn18.mapToStatusCode(us$ex18));
			throw us$ex18;
			}
		    finally
			{
			if (us$stmt18 != null)
			    us$conn18.us$closeStatement(us$stmt18);
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
	    vmu_f_entprog.setStyleClass("date_picker");
	    vmu_f_entprog.us$setMultiValued(true);
	    vmu_f_entprog.us$setView("date");
	    vmu_f_entprog.us$setFieldLength(10);
	    vmu_f_entprog.us$setCandidateTargetColumnName("vmu_f_entprog");
	    vmu_f_entprog.setValueRetrievedDuringFetch(true);
	    vmu_f_entprog.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_entprog.setFindable(true);
	    vmu_f_entprog.setUpdateable(true);
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
	} // cajagrandeRBoletinespropertySetter_2

	private void cajagrandeRBoletinespropertySetter_3()
	{
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
	us$addTargetMapping("vmu_empresa", "vmu_empresa");
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_separacion", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "adicionando", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "adiciona", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "tipounidad", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage1", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage2", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage3", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "deposito1", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "deposito2", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "corporacion", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cli_clase", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "forma_pago", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "numero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "formasig", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "xob_proyecto", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_activa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "est", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_act", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cien", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "preciotot", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "tasa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "imporenta", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "zero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vlr_ev", false);
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

