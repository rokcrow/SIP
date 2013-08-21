package ModuloCNegocios;

import java.sql.SQLException;
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
    NullableAmount x_precio_uni = NullableFactory.createNullableAmount("x_precio_uni");
    NullableAmount vpc_porcentaje = NullableFactory.createNullableAmount("vpc_porcentaje");
    NullableAmount vlr_ev = NullableFactory.createNullableAmount("vlr_ev");
    NullableAmount zero = NullableFactory.createNullableAmount("zero");
    NullableAmount imporenta = NullableFactory.createNullableAmount("imporenta");
    NullableAmount tasa = NullableFactory.createNullableAmount("tasa");
    NullableAmount preciotot = NullableFactory.createNullableAmount("preciotot");
    NullableAmount cien = NullableFactory.createNullableAmount("cien");
    NullableAmount cero = NullableFactory.createNullableAmount("cero");
    NullableString vmu_etapa_venta = NullableFactory.createNullableString("vmu_etapa_venta");
    NullableString estado = NullableFactory.createNullableString("estado");
    NullableString fechafalsa = (NullableString)NullableFactory.createNullableString("fechafalsa").assign(getSession().us$getRegisterPool().allocateRegister().load("01/01/2001"));
    NullableString x_unidad = NullableFactory.createNullableString("x_unidad");
    NullableString x_obra = NullableFactory.createNullableString("x_obra");
    NullableString x_manzana = NullableFactory.createNullableString("x_manzana");
    NullableString x_campo = NullableFactory.createNullableString("x_campo");
    NullableString x_corporacion = NullableFactory.createNullableString("x_corporacion");
    NullableString gasto_escritura = NullableFactory.createNullableString("gasto_escritura");
    NullableString vendedora = NullableFactory.createNullableString("vendedora");
    NullableString vve_nombre = NullableFactory.createNullableString("vve_nombre");
    NullableString vut_tramite = NullableFactory.createNullableString("vut_tramite");
    NullableString vut_etapa = NullableFactory.createNullableString("vut_etapa");
    NullableString tipounidad = NullableFactory.createNullableString("tipounidad");
    NullableString forma_pago = NullableFactory.createNullableString("forma_pago");
    NullableString cli_clase = NullableFactory.createNullableString("cli_clase");
    NullableString corporacion = NullableFactory.createNullableString("corporacion");
    NullableString deposito2 = NullableFactory.createNullableString("deposito2");
    NullableString deposito1 = NullableFactory.createNullableString("deposito1");
    NullableString garage3 = NullableFactory.createNullableString("garage3");
    NullableString garage2 = NullableFactory.createNullableString("garage2");
    NullableString garage1 = NullableFactory.createNullableString("garage1");
    NullableString etapa_act = NullableFactory.createNullableString("etapa_act");
    NullableString est = NullableFactory.createNullableString("est");
    NullableString etapa_activa = NullableFactory.createNullableString("etapa_activa");
    NullableString xob_proyecto = NullableFactory.createNullableString("xob_proyecto");
    NullableString formasig = NullableFactory.createNullableString("formasig");
    NullableString varCN = NullableFactory.createNullableString("varCN");
    NullableString varIAC = NullableFactory.createNullableString("varIAC");
    NullableString varIC = NullableFactory.createNullableString("varIC");
    NullableNumeric prospecto_ant = NullableFactory.createNullableNumeric("prospecto_ant");
    NullableNumeric adiciona = NullableFactory.createNullableNumeric("adiciona");
    NullableNumeric adicionando = NullableFactory.createNullableNumeric("adicionando");
    NullableDate f_permiso = NullableFactory.createNullableDate("f_permiso");
    NullableDate vmu_ent_escritura = NullableFactory.createNullableDate("vmu_ent_escritura");
    NullableDate f_entrega = NullableFactory.createNullableDate("f_entrega");
    NullableDate f_ent_pacta = NullableFactory.createNullableDate("f_ent_pacta");
    NullableDate f_ent_real = NullableFactory.createNullableDate("f_ent_real");
    NullableDate fecha_separa = NullableFactory.createNullableDate("fecha_separa");
    NullableDate scr_fecha = NullableFactory.createNullableDate("scr_fecha");
    NullableDate x = NullableFactory.createNullableDate("x");
    NullableDate fret_obra = NullableFactory.createNullableDate("fret_obra");
    NullableDate vut_f_real = NullableFactory.createNullableDate("vut_f_real");
    NullableDate f_escritura = NullableFactory.createNullableDate("f_escritura");
    NullableDate f_separacion = NullableFactory.createNullableDate("f_separacion");

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	cajagrandeRBoletines.tabset1.setCurrentPage("tab3");
	cajagrandeRBoletines.varpass1.assign(us$registerPool.allocateRegister().load("25"));
	cajagrandeRBoletines.varpass2.assign(us$registerPool.allocateRegister().load("45"));
	cajagrandeRBoletines.varpass3.assign(us$registerPool.allocateRegister().load("35"));
	varIC.assign(us$registerPool.allocateRegister().load("7"));
	varIAC.assign(us$registerPool.allocateRegister().load("8"));
	varCN.assign(us$registerPool.allocateRegister().load("9"));
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

    public void onClearToAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	adicionando.assign(us$registerPool.allocateRegister().load(1));
	cajagrandeRBoletines.vmu_f_gravacion.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	preciotot.assign(us$registerPool.allocateRegister().load(cero));
	cajagrandeRBoletines.vmu_precio_uni.assign(us$registerPool.allocateRegister().load(cero));
	cajagrandeRBoletines.vmu_vgarage.assign(us$registerPool.allocateRegister().load(cero));
	cajagrandeRBoletines.vmu_descuentos.assign(us$registerPool.allocateRegister().load(cero));
	cajagrandeRBoletines.vmu_cli_clase.setStopForInput(true);
	cajagrandeRBoletines.vau_apoderado.setStopForInput(true);
	cajagrandeRBoletines.vau_apode_nit.setStopForInput(true);
    } // onClearToAdd

    public void beforeAdd()
	throws Exception
    {
	com.unify.nxj.mgr.datatypes.Register us$R1;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	adiciona.assign(us$registerPool.allocateRegister().load(1));
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_precio_uni).plusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_vgarage)));
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).minusOp(cajagrandeRBoletines.vmu_descuentos));
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

    public void onClearToFind()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	adicionando.assign(us$registerPool.allocateRegister().load(0));
	cajagrandeRBoletines.vmu_cli_clase.setStopForInput(true);
	varIC.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.varpass1));
	varIAC.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.varpass2));
	varCN.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.varpass3));
	if (us$registerPool.allocateRegister().load(varIC).eqOp("1").getBooleanValueNullOk())
	    {
	    if (us$registerPool.allocateRegister().load(varIAC).eqOp("2").getBooleanValueNullOk())
		{
		if (us$registerPool.allocateRegister().load(varCN).eqOp("3").getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("ACABA DE INSERTAR O ACTUALIZAR.");
		    }
		else
		    {
		    getSession().displayToMessageBox("Antes debe acceder a COMPROMISOS DEL NEGOCIO.");
		    rejectOperation();
		    }
		}
	    else
		{
		getSession().displayToMessageBox("Antes debe acceder a INFORMACI\u00D3N ADICIONAL DE CLIENTES.");
		rejectOperation();
		}
	    }
	else
	    {
	    getSession().displayToMessageBox("Antes debe acceder a IDENTIFICACI\u00D3N DE COMPRADORES.");
	    rejectOperation();
	    }
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
	cajagrandeRBoletines.vmu_preciotot.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_precio_uni).plusOp(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_vgarage)).minusOp(cajagrandeRBoletines.vmu_descuentos));
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
	    getSession().displayToMessageBox("No se puede seleccionar la tasa para el precio de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ", " + getSession().getStatus() + ".");
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
	    getSession().displayToMessageBox("No se puede actualizar el impuesto de renta de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ", " + getSession().getStatus() + ".");
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
	    getSession().displayToMessageBox("No se puede actualizar el impuesto de renta de la unidad, " + cajagrandeRBoletines.vmu_obra.toString() + ", " + cajagrandeRBoletines.vmu_manzana.toString() + ", " + cajagrandeRBoletines.vmu_unidad.toString() + ", " + getSession().getStatus() + ".");
	    getSession().rollbackTransaction();
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
	else
	    getSession().commitTransaction();
    } // afterUpdate

    public void afterAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (isCurrentRecordStored() == false)
	    {
	    getSession().displayToMessageBox("El registro no puede ser adicionado. Falta informaci\u00F3n.");
	    getSession().rollbackTransaction();
	    getSession().queueCommand("PREVIOUS_FORM");
	    }
	else
	    {
	    if (gra_tramis(new com.unify.nxj.mgr.datatypes.Register().load(cajagrandeRBoletines.vmu_obra), new com.unify.nxj.mgr.datatypes.Register().load(cajagrandeRBoletines.vmu_manzana), new com.unify.nxj.mgr.datatypes.Register().load(cajagrandeRBoletines.vmu_unidad), new com.unify.nxj.mgr.datatypes.Register().load(cajagrandeRBoletines.vmu_f_separacion), new com.unify.nxj.mgr.datatypes.Register().load(cajagrandeRBoletines.vmu_forma_pago)))
		{
		getSession().displayToMessageBox("No se pudo generar los TR\u00C1MITES del Negocio");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn15 = getConnection();
		java.sql.PreparedStatement us$stmt15 = null;
		ResultSet us$rs15 = null;
		try
		    {
		    us$stmt15 = us$conn15.prepareStatement("SELECT vut_etapa, vut_tramite, vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_f_real is not NULL");
		    vmu_empresa.us$setSqlParameterValue(us$stmt15, 1);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt15, 2);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt15, 3);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt15, 4);
		    us$rs15 = us$stmt15.executeQuery();
		    int us$rowsTouched15 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd15 = us$rs15.getMetaData();
			if (us$rsmd15.getColumnCount() != 3)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd15.getColumnCount()), "3"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter15 = us$conn15.createDataIterator(us$rs15);
			while (us$getter15.next())
			    {
			    ++us$rowsTouched15;
			    us$getter15.assignValueToVariable(vut_etapa, 1);
			    us$getter15.assignValueToVariable(vut_tramite, 2);
			    us$getter15.assignValueToVariable(vut_f_real, 3);

				{

				    {
				    getSession().us$setStatus(StatusCode.SS_NORM);
				    NXJDataConnection us$conn16 = getConnection();
				    java.sql.PreparedStatement us$stmt16 = null;
				    ResultSet us$rs16 = null;
				    try
					{
					us$stmt16 = us$conn16.prepareStatement("UPDATE vtu_tramiuni SET vtu_f_real =  ?  WHERE vtu_empresa =  ?  AND vtu_obra =  ?  AND vtu_manzana =  ?  AND vtu_unidad =  ?  AND vtu_etapa =  ?  AND vtu_tramite =  ?");
					vut_f_real.us$setSqlParameterValue(us$stmt16, 1);
					vmu_empresa.us$setSqlParameterValue(us$stmt16, 2);
					cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt16, 3);
					cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt16, 4);
					cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt16, 5);
					vut_etapa.us$setSqlParameterValue(us$stmt16, 6);
					vut_tramite.us$setSqlParameterValue(us$stmt16, 7);
					if (us$stmt16.executeUpdate() == 0)
					    getSession().us$setStatus(StatusCode.SS_NOREC);
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
				if (getSession().getStatus() != StatusCode.SS_NORM && getSession().getStatus() != StatusCode.SS_NOREC)
				    {
				    getSession().displayToMessageBox("No se puede actualizar los tr\u00E1mites de permisos." + getSession().getStatus());
				    getSession().rollbackTransaction();
				    getSession().queueCommand("PREVIOUS_FORM");
				    }
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
	    getSession().displayToMessageBox("Generando Compromiso de EV al negocio.");
	    zero.assign(us$registerPool.allocateRegister().load(0));
	    vlr_ev.assign(us$registerPool.allocateRegister().load(cajagrandeRBoletines.vmu_preciotot).mulOp(-1));

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn17 = getConnection();
		java.sql.PreparedStatement us$stmt17 = null;
		ResultSet us$rs17 = null;
		try
		    {
		    us$stmt17 = us$conn17.prepareStatement("INSERT INTO vcn_comproneg ( vcn_empresa, vcn_obra, vcn_manzana, vcn_unidad, vcn_fec_comp, vcn_cptopago, vcn_vlr_compro, vcn_vlr_pago, vcn_vlr_saldo ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? , \'EV\',  ? ,  ? ,  ?  )");
		    vmu_empresa.us$setSqlParameterValue(us$stmt17, 1);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt17, 2);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt17, 3);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt17, 4);
		    cajagrandeRBoletines.vmu_f_escritura.us$setSqlParameterValue(us$stmt17, 5);
		    vlr_ev.us$setSqlParameterValue(us$stmt17, 6);
		    zero.us$setSqlParameterValue(us$stmt17, 7);
		    vlr_ev.us$setSqlParameterValue(us$stmt17, 8);
		    if (us$stmt17.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
	    if (getSession().getStatus() != StatusCode.SS_NORM)
		{
		getSession().displayToMessageBox("No se puede insertar el compromiso de EV.");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}
	    getSession().displayToMessageBox("Elimina unidad de la Lista de Precios.");

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn18 = getConnection();
		java.sql.PreparedStatement us$stmt18 = null;
		ResultSet us$rs18 = null;
		try
		    {
		    us$stmt18 = us$conn18.prepareStatement("DELETE vlp_listapre WHERE vlp_empresa =  ?  AND vlp_obra =  ?  AND vlp_manzana =  ?  AND vlp_unidad =  ?  AND vlp_f_final is NULL");
		    vmu_empresa.us$setSqlParameterValue(us$stmt18, 1);
		    cajagrandeRBoletines.vmu_obra.us$setSqlParameterValue(us$stmt18, 2);
		    cajagrandeRBoletines.vmu_manzana.us$setSqlParameterValue(us$stmt18, 3);
		    cajagrandeRBoletines.vmu_unidad.us$setSqlParameterValue(us$stmt18, 4);
		    if (us$stmt18.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
	    if (getSession().getStatus() != StatusCode.SS_NORM && getSession().getStatus() != StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No se puede eliminar la unidad de la lista de precios.");
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}
	    }
    } // afterAdd

    public boolean gra_tramis(NullableString obra, NullableString manzana, NullableString unidad, NullableDate fechasep, NullableString formapago)
	throws com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
    {
	com.unify.nxj.mgr.datatypes.Register us$R28;
	com.unify.nxj.mgr.datatypes.Register us$R23;
	((com.unify.nxj.mgr.datatypes.Register)formapago).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)fechasep).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)unidad).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)manzana).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)obra).freezeType();
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NullableDate vtu_f_teorica = NullableFactory.createNullableDate("vtu_f_teorica");
	NullableDate vtu_f_real = NullableFactory.createNullableDate("vtu_f_real");
	NullableDate x_campo = NullableFactory.createNullableDate("x_campo");
	NullableNumeric vdt_duracion = NullableFactory.createNullableNumeric("vdt_duracion");
	NullableNumeric vdt_consec = NullableFactory.createNullableNumeric("vdt_consec");
	NullableNumeric sw_f_real = NullableFactory.createNullableNumeric("sw_f_real");
	NullableNumeric index = NullableFactory.createNullableNumeric("index");
	NullableNumeric x_c = NullableFactory.createNullableNumeric("x_c");
	NullableString vdt_etapa = NullableFactory.createNullableString("vdt_etapa");
	NullableString vdt_tramite = NullableFactory.createNullableString("vdt_tramite");
	NullableString vtn_formapago = NullableFactory.createNullableString("vtn_formapago");
	NullableBoolean varRetorno = (NullableBoolean)NullableFactory.createNullableBoolean("varRetorno").assign(us$registerPool.allocateRegister().load(true));
	getSession().displayToMessageBox("Generando los Tr\u00E1mites del Negocio.");
	vtu_f_teorica.assign(us$registerPool.allocateRegister().load(fechasep));
	try
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn19 = getConnection();
		java.sql.PreparedStatement us$stmt19 = null;
		ResultSet us$rs19 = null;
		try
		    {
		    us$stmt19 = us$conn19.prepareStatement("SELECT vdt_etapa, vdt_tramite, vdt_dura_teori, vdt_consec FROM vdt_tramiobra WHERE vdt_empresa =  ?  AND vdt_obra =  ?  ORDER BY vdt_consec ASC");
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt19, 1);
		    obra.us$setSqlParameterValue(us$stmt19, 2);
		    us$rs19 = us$stmt19.executeQuery();
		    int us$rowsTouched19 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd19 = us$rs19.getMetaData();
			if (us$rsmd19.getColumnCount() != 4)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd19.getColumnCount()), "4"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter19 = us$conn19.createDataIterator(us$rs19);
			while (us$getter19.next())
			    {
			    ++us$rowsTouched19;
			    us$getter19.assignValueToVariable(vdt_etapa, 1);
			    us$getter19.assignValueToVariable(vdt_tramite, 2);
			    us$getter19.assignValueToVariable(vdt_duracion, 3);
			    us$getter19.assignValueToVariable(vdt_consec, 4);

				{

				    {
				    getSession().us$setStatus(StatusCode.SS_NORM);
				    NXJDataConnection us$conn20 = getConnection();
				    java.sql.PreparedStatement us$stmt20 = null;
				    ResultSet us$rs20 = null;
				    try
					{
					us$stmt20 = us$conn20.prepareStatement("SELECT vtn_formapago FROM vtn_traminego WHERE vtn_etapa =  ?  AND vtn_tramite =  ?");
					vdt_etapa.us$setSqlParameterValue(us$stmt20, 1);
					vdt_tramite.us$setSqlParameterValue(us$stmt20, 2);
					us$rs20 = us$stmt20.executeQuery();
					int us$rowsTouched20 = 0;
					try
					    {
					    java.sql.ResultSetMetaData us$rsmd20 = us$rs20.getMetaData();
					    if (us$rsmd20.getColumnCount() != 1)
						throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
						    {
						    Integer.toString(us$rsmd20.getColumnCount()), "1"
						    }));
					    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter20 = us$conn20.createDataIterator(us$rs20);
					    if (us$getter20.next())
						{
						++us$rowsTouched20;
						us$getter20.assignValueToVariable(vtn_formapago, 1);
						}
					    }
					finally
					    {
					    if (us$rowsTouched20 == 0)
						getSession().us$setStatus(StatusCode.SS_NOREC);
					    if (us$rs20 != null)
						us$rs20.close();
					    }
					}
				    catch (SQLException us$ex20)
					{
					getSession().us$setStatus(us$conn20.mapToStatusCode(us$ex20));
					throw us$ex20;
					}
				    catch (NXJDataConnectionException us$ex20)
					{
					getSession().us$setStatus(us$conn20.mapToStatusCode(us$ex20));
					throw us$ex20;
					}
				    finally
					{
					if (us$stmt20 != null)
					    us$conn20.us$closeStatement(us$stmt20);
					}
				    }
				if (getSession().getStatus() != StatusCode.SS_NORM)
				    {
				    getSession().displayToMessageBox("El tr\u00E1mite de obra NO existe en tr\u00E1mites generales.");
				    getSession().displayToMessageBox(vdt_etapa.toString());
				    getSession().displayToMessageBox(vdt_tramite.toString());
				    return true;
				    }

				    {
				    getSession().us$setStatus(StatusCode.SS_NORM);
				    NXJDataConnection us$conn21 = getConnection();
				    java.sql.PreparedStatement us$stmt21 = null;
				    ResultSet us$rs21 = null;
				    try
					{
					us$stmt21 = us$conn21.prepareStatement("SELECT vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_etapa =  ?  AND vut_tramite =  ?");
					((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt21, 1);
					obra.us$setSqlParameterValue(us$stmt21, 2);
					manzana.us$setSqlParameterValue(us$stmt21, 3);
					unidad.us$setSqlParameterValue(us$stmt21, 4);
					vdt_etapa.us$setSqlParameterValue(us$stmt21, 5);
					vdt_tramite.us$setSqlParameterValue(us$stmt21, 6);
					us$rs21 = us$stmt21.executeQuery();
					int us$rowsTouched21 = 0;
					try
					    {
					    java.sql.ResultSetMetaData us$rsmd21 = us$rs21.getMetaData();
					    if (us$rsmd21.getColumnCount() != 1)
						throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
						    {
						    Integer.toString(us$rsmd21.getColumnCount()), "1"
						    }));
					    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter21 = us$conn21.createDataIterator(us$rs21);
					    if (us$getter21.next())
						{
						++us$rowsTouched21;
						us$getter21.assignValueToVariable(vtu_f_real, 1);
						}
					    }
					finally
					    {
					    if (us$rowsTouched21 == 0)
						getSession().us$setStatus(StatusCode.SS_NOREC);
					    if (us$rs21 != null)
						us$rs21.close();
					    }
					}
				    catch (SQLException us$ex21)
					{
					getSession().us$setStatus(us$conn21.mapToStatusCode(us$ex21));
					throw us$ex21;
					}
				    catch (NXJDataConnectionException us$ex21)
					{
					getSession().us$setStatus(us$conn21.mapToStatusCode(us$ex21));
					throw us$ex21;
					}
				    finally
					{
					if (us$stmt21 != null)
					    us$conn21.us$closeStatement(us$stmt21);
					}
				    }
				if (getSession().getStatus() != StatusCode.SS_NORM)
				    {
				    if (getSession().getStatus() == StatusCode.SS_NOREC)
					{
					sw_f_real.assign(us$registerPool.allocateRegister().load(0));
					}
				    else
					{
					getSession().displayToMessageBox("No se puede leer el permiso, verifique.");
					getSession().displayToMessageBox(vdt_etapa.toString());
					getSession().displayToMessageBox(vdt_tramite.toString());
					return true;
					}
				    }
				else
				    {
				    sw_f_real.assign(us$registerPool.allocateRegister().load(1));
				    }
				if (us$registerPool.allocateRegister().load(formapago).eqOp("C").getBooleanValueNullOk())
				    {
				    if (us$registerPool.allocateRegister().load(vtn_formapago).neqOp("CR").getBooleanValueNullOk())
					{
					getSession().displayToMessageBox(vtu_f_teorica.toString());
					getSession().displayToMessageBox(vdt_duracion.toString());
					for (index.assign(us$registerPool.allocateRegister().load(1));
						us$registerPool.allocateRegister().load(index).leOp(us$registerPool.allocateRegister().load(vdt_duracion)).getBooleanValueNullOk();
						index.assign(us$registerPool.allocateRegister().load(index).plusOp(1)))
					    {
					    vtu_f_teorica.assign(us$registerPool.allocateRegister().load(vtu_f_teorica).plusOp(1));
					    x_c.assign(us$registerPool.allocateRegister().load(0));
					    do

						    {

							{
							getSession().us$setStatus(StatusCode.SS_NORM);
							NXJDataConnection us$conn22 = getConnection();
							java.sql.PreparedStatement us$stmt22 = null;
							ResultSet us$rs22 = null;
							try
							    {
							    us$stmt22 = us$conn22.prepareStatement("SELECT vfd_festivo FROM vfd_festidomi WHERE vfd_festivo =  ?");
							    vtu_f_teorica.us$setSqlParameterValue(us$stmt22, 1);
							    us$rs22 = us$stmt22.executeQuery();
							    int us$rowsTouched22 = 0;
							    try
								{
								java.sql.ResultSetMetaData us$rsmd22 = us$rs22.getMetaData();
								if (us$rsmd22.getColumnCount() != 1)
								    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
									{
									Integer.toString(us$rsmd22.getColumnCount()), "1"
									}));
								com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter22 = us$conn22.createDataIterator(us$rs22);
								if (us$getter22.next())
								    {
								    ++us$rowsTouched22;
								    us$getter22.assignValueToVariable(x_campo, 1);
								    }
								}
							    finally
								{
								if (us$rowsTouched22 == 0)
								    getSession().us$setStatus(StatusCode.SS_NOREC);
								if (us$rs22 != null)
								    us$rs22.close();
								}
							    }
							catch (SQLException us$ex22)
							    {
							    getSession().us$setStatus(us$conn22.mapToStatusCode(us$ex22));
							    throw us$ex22;
							    }
							catch (NXJDataConnectionException us$ex22)
							    {
							    getSession().us$setStatus(us$conn22.mapToStatusCode(us$ex22));
							    throw us$ex22;
							    }
							finally
							    {
							    if (us$stmt22 != null)
								us$conn22.us$closeStatement(us$stmt22);
							    }
							}
						    if (getSession().getStatus() == StatusCode.SS_NORM)
							{
							vtu_f_teorica.assign(us$registerPool.allocateRegister().load(vtu_f_teorica).plusOp(1));
							}
						    else
							{
							x_c.assign(us$registerPool.allocateRegister().load(1));
							}
						    }
					    while (us$registerPool.allocateRegister().load(x_c).neqOp(1).getBooleanValueNullOk());
					    }
					if (((us$R23 = us$registerPool.allocateRegister().load(vdt_etapa).eqOp("SP")).isLogicalAndDecided() ? us$R23 : us$R23.logicalAndOp(us$registerPool.allocateRegister().load(vdt_tramite).eqOp("SE"))).getBooleanValueNullOk())
					    {

						{
						getSession().us$setStatus(StatusCode.SS_NORM);
						NXJDataConnection us$conn24 = getConnection();
						java.sql.PreparedStatement us$stmt24 = null;
						ResultSet us$rs24 = null;
						try
						    {
						    us$stmt24 = us$conn24.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor, vtu_f_real ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ? ,  ?  )");
						    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt24, 1);
						    obra.us$setSqlParameterValue(us$stmt24, 2);
						    manzana.us$setSqlParameterValue(us$stmt24, 3);
						    unidad.us$setSqlParameterValue(us$stmt24, 4);
						    vdt_etapa.us$setSqlParameterValue(us$stmt24, 5);
						    vdt_tramite.us$setSqlParameterValue(us$stmt24, 6);
						    vdt_consec.us$setSqlParameterValue(us$stmt24, 7);
						    vtu_f_teorica.us$setSqlParameterValue(us$stmt24, 8);
						    vdt_duracion.us$setSqlParameterValue(us$stmt24, 9);
						    fechasep.us$setSqlParameterValue(us$stmt24, 10);
						    if (us$stmt24.executeUpdate() == 0)
							getSession().us$setStatus(StatusCode.SS_NOREC);
						    }
						catch (SQLException us$ex24)
						    {
						    getSession().us$setStatus(us$conn24.mapToStatusCode(us$ex24));
						    throw us$ex24;
						    }
						catch (NXJDataConnectionException us$ex24)
						    {
						    getSession().us$setStatus(us$conn24.mapToStatusCode(us$ex24));
						    throw us$ex24;
						    }
						finally
						    {
						    if (us$stmt24 != null)
							us$conn24.us$closeStatement(us$stmt24);
						    }
						}
					    if (getSession().getStatus() != StatusCode.SS_NORM)
						{
						getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
						return true;
						}
					    }
					else
					    {
					    if (us$registerPool.allocateRegister().load(sw_f_real).eqOp(1).getBooleanValueNullOk())
						{

						    {
						    getSession().us$setStatus(StatusCode.SS_NORM);
						    NXJDataConnection us$conn25 = getConnection();
						    java.sql.PreparedStatement us$stmt25 = null;
						    ResultSet us$rs25 = null;
						    try
							{
							us$stmt25 = us$conn25.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor, vtu_f_real ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ? ,  ?  )");
							((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt25, 1);
							obra.us$setSqlParameterValue(us$stmt25, 2);
							manzana.us$setSqlParameterValue(us$stmt25, 3);
							unidad.us$setSqlParameterValue(us$stmt25, 4);
							vdt_etapa.us$setSqlParameterValue(us$stmt25, 5);
							vdt_tramite.us$setSqlParameterValue(us$stmt25, 6);
							vdt_consec.us$setSqlParameterValue(us$stmt25, 7);
							vtu_f_teorica.us$setSqlParameterValue(us$stmt25, 8);
							vdt_duracion.us$setSqlParameterValue(us$stmt25, 9);
							vtu_f_real.us$setSqlParameterValue(us$stmt25, 10);
							if (us$stmt25.executeUpdate() == 0)
							    getSession().us$setStatus(StatusCode.SS_NOREC);
							}
						    catch (SQLException us$ex25)
							{
							getSession().us$setStatus(us$conn25.mapToStatusCode(us$ex25));
							throw us$ex25;
							}
						    catch (NXJDataConnectionException us$ex25)
							{
							getSession().us$setStatus(us$conn25.mapToStatusCode(us$ex25));
							throw us$ex25;
							}
						    finally
							{
							if (us$stmt25 != null)
							    us$conn25.us$closeStatement(us$stmt25);
							}
						    }
						if (getSession().getStatus() != StatusCode.SS_NORM)
						    {
						    getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
						    return true;
						    }
						}
					    else
						{

						    {
						    getSession().us$setStatus(StatusCode.SS_NORM);
						    NXJDataConnection us$conn26 = getConnection();
						    java.sql.PreparedStatement us$stmt26 = null;
						    ResultSet us$rs26 = null;
						    try
							{
							us$stmt26 = us$conn26.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ?  )");
							((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt26, 1);
							obra.us$setSqlParameterValue(us$stmt26, 2);
							manzana.us$setSqlParameterValue(us$stmt26, 3);
							unidad.us$setSqlParameterValue(us$stmt26, 4);
							vdt_etapa.us$setSqlParameterValue(us$stmt26, 5);
							vdt_tramite.us$setSqlParameterValue(us$stmt26, 6);
							vdt_consec.us$setSqlParameterValue(us$stmt26, 7);
							vtu_f_teorica.us$setSqlParameterValue(us$stmt26, 8);
							vdt_duracion.us$setSqlParameterValue(us$stmt26, 9);
							if (us$stmt26.executeUpdate() == 0)
							    getSession().us$setStatus(StatusCode.SS_NOREC);
							}
						    catch (SQLException us$ex26)
							{
							getSession().us$setStatus(us$conn26.mapToStatusCode(us$ex26));
							throw us$ex26;
							}
						    catch (NXJDataConnectionException us$ex26)
							{
							getSession().us$setStatus(us$conn26.mapToStatusCode(us$ex26));
							throw us$ex26;
							}
						    finally
							{
							if (us$stmt26 != null)
							    us$conn26.us$closeStatement(us$stmt26);
							}
						    }
						if (getSession().getStatus() != StatusCode.SS_NORM)
						    {
						    getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
						    return true;
						    }
						}
					    }
					}
				    }
				if (us$registerPool.allocateRegister().load(formapago).eqOp("D").getBooleanValueNullOk())
				    {
				    getSession().displayToMessageBox(vtu_f_teorica.toString());
				    getSession().displayToMessageBox(vdt_duracion.toString());
				    for (index.assign(us$registerPool.allocateRegister().load(1));
					    us$registerPool.allocateRegister().load(index).leOp(us$registerPool.allocateRegister().load(vdt_duracion)).getBooleanValueNullOk();
					    index.assign(us$registerPool.allocateRegister().load(index).plusOp(1)))
					{
					vtu_f_teorica.assign(us$registerPool.allocateRegister().load(vtu_f_teorica).plusOp(1));
					x_c.assign(us$registerPool.allocateRegister().load(0));
					do

						{

						    {
						    getSession().us$setStatus(StatusCode.SS_NORM);
						    NXJDataConnection us$conn27 = getConnection();
						    java.sql.PreparedStatement us$stmt27 = null;
						    ResultSet us$rs27 = null;
						    try
							{
							us$stmt27 = us$conn27.prepareStatement("SELECT vfd_festivo FROM vfd_festidomi WHERE vfd_festivo =  ?");
							vtu_f_teorica.us$setSqlParameterValue(us$stmt27, 1);
							us$rs27 = us$stmt27.executeQuery();
							int us$rowsTouched27 = 0;
							try
							    {
							    java.sql.ResultSetMetaData us$rsmd27 = us$rs27.getMetaData();
							    if (us$rsmd27.getColumnCount() != 1)
								throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
								    {
								    Integer.toString(us$rsmd27.getColumnCount()), "1"
								    }));
							    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter27 = us$conn27.createDataIterator(us$rs27);
							    if (us$getter27.next())
								{
								++us$rowsTouched27;
								us$getter27.assignValueToVariable(x_campo, 1);
								}
							    }
							finally
							    {
							    if (us$rowsTouched27 == 0)
								getSession().us$setStatus(StatusCode.SS_NOREC);
							    if (us$rs27 != null)
								us$rs27.close();
							    }
							}
						    catch (SQLException us$ex27)
							{
							getSession().us$setStatus(us$conn27.mapToStatusCode(us$ex27));
							throw us$ex27;
							}
						    catch (NXJDataConnectionException us$ex27)
							{
							getSession().us$setStatus(us$conn27.mapToStatusCode(us$ex27));
							throw us$ex27;
							}
						    finally
							{
							if (us$stmt27 != null)
							    us$conn27.us$closeStatement(us$stmt27);
							}
						    }
						if (getSession().getStatus() == StatusCode.SS_NORM)
						    {
						    vtu_f_teorica.assign(us$registerPool.allocateRegister().load(vtu_f_teorica).plusOp(1));
						    }
						else
						    {
						    x_c.assign(us$registerPool.allocateRegister().load(1));
						    }
						}
					while (us$registerPool.allocateRegister().load(x_c).neqOp(1).getBooleanValueNullOk());
					}
				    if (((us$R28 = us$registerPool.allocateRegister().load(vdt_etapa).eqOp("SP")).isLogicalAndDecided() ? us$R28 : us$R28.logicalAndOp(us$registerPool.allocateRegister().load(vdt_tramite).eqOp("SE"))).getBooleanValueNullOk())
					{

					    {
					    getSession().us$setStatus(StatusCode.SS_NORM);
					    NXJDataConnection us$conn29 = getConnection();
					    java.sql.PreparedStatement us$stmt29 = null;
					    ResultSet us$rs29 = null;
					    try
						{
						us$stmt29 = us$conn29.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor, vtu_f_real ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ? ,  ?  )");
						((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt29, 1);
						obra.us$setSqlParameterValue(us$stmt29, 2);
						manzana.us$setSqlParameterValue(us$stmt29, 3);
						unidad.us$setSqlParameterValue(us$stmt29, 4);
						vdt_etapa.us$setSqlParameterValue(us$stmt29, 5);
						vdt_tramite.us$setSqlParameterValue(us$stmt29, 6);
						vdt_consec.us$setSqlParameterValue(us$stmt29, 7);
						vtu_f_teorica.us$setSqlParameterValue(us$stmt29, 8);
						vdt_duracion.us$setSqlParameterValue(us$stmt29, 9);
						fechasep.us$setSqlParameterValue(us$stmt29, 10);
						if (us$stmt29.executeUpdate() == 0)
						    getSession().us$setStatus(StatusCode.SS_NOREC);
						}
					    catch (SQLException us$ex29)
						{
						getSession().us$setStatus(us$conn29.mapToStatusCode(us$ex29));
						throw us$ex29;
						}
					    catch (NXJDataConnectionException us$ex29)
						{
						getSession().us$setStatus(us$conn29.mapToStatusCode(us$ex29));
						throw us$ex29;
						}
					    finally
						{
						if (us$stmt29 != null)
						    us$conn29.us$closeStatement(us$stmt29);
						}
					    }
					if (getSession().getStatus() != StatusCode.SS_NORM)
					    {
					    getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
					    return true;
					    }
					}
				    else
					{
					if (us$registerPool.allocateRegister().load(sw_f_real).eqOp(1).getBooleanValueNullOk())
					    {

						{
						getSession().us$setStatus(StatusCode.SS_NORM);
						NXJDataConnection us$conn30 = getConnection();
						java.sql.PreparedStatement us$stmt30 = null;
						ResultSet us$rs30 = null;
						try
						    {
						    us$stmt30 = us$conn30.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor, vtu_f_real ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ? ,  ?  )");
						    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt30, 1);
						    obra.us$setSqlParameterValue(us$stmt30, 2);
						    manzana.us$setSqlParameterValue(us$stmt30, 3);
						    unidad.us$setSqlParameterValue(us$stmt30, 4);
						    vdt_etapa.us$setSqlParameterValue(us$stmt30, 5);
						    vdt_tramite.us$setSqlParameterValue(us$stmt30, 6);
						    vdt_consec.us$setSqlParameterValue(us$stmt30, 7);
						    vtu_f_teorica.us$setSqlParameterValue(us$stmt30, 8);
						    vdt_duracion.us$setSqlParameterValue(us$stmt30, 9);
						    vtu_f_real.us$setSqlParameterValue(us$stmt30, 10);
						    if (us$stmt30.executeUpdate() == 0)
							getSession().us$setStatus(StatusCode.SS_NOREC);
						    }
						catch (SQLException us$ex30)
						    {
						    getSession().us$setStatus(us$conn30.mapToStatusCode(us$ex30));
						    throw us$ex30;
						    }
						catch (NXJDataConnectionException us$ex30)
						    {
						    getSession().us$setStatus(us$conn30.mapToStatusCode(us$ex30));
						    throw us$ex30;
						    }
						finally
						    {
						    if (us$stmt30 != null)
							us$conn30.us$closeStatement(us$stmt30);
						    }
						}
					    if (getSession().getStatus() != StatusCode.SS_NORM)
						{
						getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
						return true;
						}
					    }
					else
					    {

						{
						getSession().us$setStatus(StatusCode.SS_NORM);
						NXJDataConnection us$conn31 = getConnection();
						java.sql.PreparedStatement us$stmt31 = null;
						ResultSet us$rs31 = null;
						try
						    {
						    us$stmt31 = us$conn31.prepareStatement("INSERT INTO vtu_tramiuni ( vtu_empresa, vtu_obra, vtu_manzana, vtu_unidad, vtu_etapa, vtu_tramite, vtu_consec, vtu_f_teorica, vtu_aplica, vtu_estado, vtu_dura_teor ) VALUES (  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? , \'S\', 0,  ?  )");
						    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt31, 1);
						    obra.us$setSqlParameterValue(us$stmt31, 2);
						    manzana.us$setSqlParameterValue(us$stmt31, 3);
						    unidad.us$setSqlParameterValue(us$stmt31, 4);
						    vdt_etapa.us$setSqlParameterValue(us$stmt31, 5);
						    vdt_tramite.us$setSqlParameterValue(us$stmt31, 6);
						    vdt_consec.us$setSqlParameterValue(us$stmt31, 7);
						    vtu_f_teorica.us$setSqlParameterValue(us$stmt31, 8);
						    vdt_duracion.us$setSqlParameterValue(us$stmt31, 9);
						    if (us$stmt31.executeUpdate() == 0)
							getSession().us$setStatus(StatusCode.SS_NOREC);
						    }
						catch (SQLException us$ex31)
						    {
						    getSession().us$setStatus(us$conn31.mapToStatusCode(us$ex31));
						    throw us$ex31;
						    }
						catch (NXJDataConnectionException us$ex31)
						    {
						    getSession().us$setStatus(us$conn31.mapToStatusCode(us$ex31));
						    throw us$ex31;
						    }
						finally
						    {
						    if (us$stmt31 != null)
							us$conn31.us$closeStatement(us$stmt31);
						    }
						}
					    if (getSession().getStatus() != StatusCode.SS_NORM)
						{
						getSession().displayToMessageBox("No se puede insertar el tr\u00E1mite: " + vdt_tramite.toString());
						return true;
						}
					    }
					}
				    }
				}
			    }
			}
		    finally
			{
			if (us$rowsTouched19 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs19 != null)
			    us$rs19.close();
			}
		    }
		catch (SQLException us$ex19)
		    {
		    getSession().us$setStatus(us$conn19.mapToStatusCode(us$ex19));
		    throw us$ex19;
		    }
		catch (NXJDataConnectionException us$ex19)
		    {
		    getSession().us$setStatus(us$conn19.mapToStatusCode(us$ex19));
		    throw us$ex19;
		    }
		finally
		    {
		    if (us$stmt19 != null)
			us$conn19.us$closeStatement(us$stmt19);
		    }
		}
	    }
	catch (SQLException sqlExcp)
	    {
	    getSession().displayToMessageBox("No existen productos...");
	    }
	return false;
    } // gra_tramis
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
	public NullableStringField varpass1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "varpass1", false, true, 100);
	public NullableStringField varpass2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "varpass2", false, true, 100);
	public NullableStringField varpass3 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "varpass3", false, true, 100);
	public class vau_apode_nit
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn32 = getConnection();
		    java.sql.PreparedStatement us$stmt32 = null;
		    ResultSet us$rs32 = null;
		    try
			{
			us$stmt32 = us$conn32.prepareStatement("SELECT vco_nombre FROM vco_corredores WHERE vco_codigo =  ?");
			vau_apode_nit.us$setSqlParameterValue(us$stmt32, 1);
			us$rs32 = us$stmt32.executeQuery();
			int us$rowsTouched32 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd32 = us$rs32.getMetaData();
			    if (us$rsmd32.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd32.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter32 = us$conn32.createDataIterator(us$rs32);
			    if (us$getter32.next())
				{
				++us$rowsTouched32;
				us$getter32.assignValueToVariable(vau_apode_nom, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched32 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs32 != null)
				us$rs32.close();
			    }
			}
		    catch (SQLException us$ex32)
			{
			getSession().us$setStatus(us$conn32.mapToStatusCode(us$ex32));
			throw us$ex32;
			}
		    catch (NXJDataConnectionException us$ex32)
			{
			getSession().us$setStatus(us$conn32.mapToStatusCode(us$ex32));
			throw us$ex32;
			}
		    finally
			{
			if (us$stmt32 != null)
			    us$conn32.us$closeStatement(us$stmt32);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    if (getSession().getStatus() == StatusCode.SS_NOREC)
			{
			getSession().displayToMessageBox("El corredor no est\u00E1 en la talba de corredores. Verique.");
			vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
			vau_apode_nit.assign(null);
			vau_apode_nom.assign(null);
			vau_apode_nit.setNextField("vau_apoderado");
			}
		    else
			{
			getSession().displayToMessageBox("No se puede acceder a la tabla de corredores.");
			vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
			vau_apode_nit.assign(null);
			vau_apode_nom.assign(null);
			vau_apode_nit.setNextField("vau_apoderado");
			}
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn33 = getConnection();
		    java.sql.PreparedStatement us$stmt33 = null;
		    ResultSet us$rs33 = null;
		    try
			{
			us$stmt33 = us$conn33.prepareStatement("SELECT vpc_porcentaje FROM vpc_proycorre WHERE vpc_codigo =  ?  AND vpc_finicio <=  ?  AND (vpc_ffinal >=  ?  OR vpc_ffinal = null)");
			vau_apode_nit.us$setSqlParameterValue(us$stmt33, 1);
			vmu_f_separacion.us$setSqlParameterValue(us$stmt33, 2);
			vmu_f_separacion.us$setSqlParameterValue(us$stmt33, 3);
			us$rs33 = us$stmt33.executeQuery();
			int us$rowsTouched33 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd33 = us$rs33.getMetaData();
			    if (us$rsmd33.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd33.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter33 = us$conn33.createDataIterator(us$rs33);
			    if (us$getter33.next())
				{
				++us$rowsTouched33;
				us$getter33.assignValueToVariable(vpc_porcentaje, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched33 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs33 != null)
				us$rs33.close();
			    }
			}
		    catch (SQLException us$ex33)
			{
			getSession().us$setStatus(us$conn33.mapToStatusCode(us$ex33));
			throw us$ex33;
			}
		    catch (NXJDataConnectionException us$ex33)
			{
			getSession().us$setStatus(us$conn33.mapToStatusCode(us$ex33));
			throw us$ex33;
			}
		    finally
			{
			if (us$stmt33 != null)
			    us$conn33.us$closeStatement(us$stmt33);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    if (getSession().getStatus() == StatusCode.SS_NOREC)
			{
			getSession().displayToMessageBox("El corredor no puede ser asignado. Ya expir\u00F3 su convenio. Verifique.");
			vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
			vau_apode_nit.assign(null);
			vau_apode_nom.assign(null);
			vau_apode_nit.setNextField("vau_apoderado");
			}
		    else
			{
			getSession().displayToMessageBox("No se puede acceder a la tabla de corredores.");
			vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
			vau_apode_nit.assign(null);
			vau_apode_nom.assign(null);
			vau_apode_nit.setNextField("vau_apoderado");
			}
		    }
	    } // onDataAccept

	    public void afterField()
		throws Exception
	    {
	    } // afterField

	    public vau_apode_nit()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vau_apode_nit", true, true, 18);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(18);
		us$setCandidateTargetColumnName("vau_apode_nit");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		us$executesCodeBeforeInput = true;
		us$executesCodeAfterInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vau_apode_nit

	public /*multi_valued*/ vau_apode_nit vau_apode_nit = new vau_apode_nit();
	public /*multi_valued*/ NullableStringField vau_apode_nom = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_apode_nom", true, true, 40);
	public class vau_apoderado
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vau_apoderado).eqOp("S").getBooleanValueNullOk())
		    {
		    vau_apoderado.setNextField("vau_apode_nit");
		    }
		else
		    {
		    vau_apode_nit.assign(null);
		    vau_apode_nom.assign(null);
		    vau_apoderado.setNextField("vau_apode_nit");
		    }
	    } // onDataAccept

	    public vau_apoderado()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vau_apoderado", true, true, 2);
		setVisible(true);
		setStyleClass("dropdown_list");
		us$setMultiValued(true);
		us$setView("select");
		us$setFieldLength(2);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("vau_apoderado");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vau_apoderado

	public /*multi_valued*/ vau_apoderado vau_apoderado = new vau_apoderado();
	public class vma_ven_responsa
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R36;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (vma_ven_responsa.isUndefined() == true)
		    {
		    getSession().displayToMessageBox("Digite el c\u00F3digo de la vendedres responsable, por favor.");
		    getSession().queueNextField(vma_ven_responsa);
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn34 = getConnection();
		    java.sql.PreparedStatement us$stmt34 = null;
		    ResultSet us$rs34 = null;
		    try
			{
			us$stmt34 = us$conn34.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
			vma_ven_responsa.us$setSqlParameterValue(us$stmt34, 1);
			us$rs34 = us$stmt34.executeQuery();
			int us$rowsTouched34 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd34 = us$rs34.getMetaData();
			    if (us$rsmd34.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd34.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter34 = us$conn34.createDataIterator(us$rs34);
			    if (us$getter34.next())
				{
				++us$rowsTouched34;
				us$getter34.assignValueToVariable(vve_nombre, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched34 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs34 != null)
				us$rs34.close();
			    }
			}
		    catch (SQLException us$ex34)
			{
			getSession().us$setStatus(us$conn34.mapToStatusCode(us$ex34));
			throw us$ex34;
			}
		    catch (NXJDataConnectionException us$ex34)
			{
			getSession().us$setStatus(us$conn34.mapToStatusCode(us$ex34));
			throw us$ex34;
			}
		    finally
			{
			if (us$stmt34 != null)
			    us$conn34.us$closeStatement(us$stmt34);
			}
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn35 = getConnection();
		    java.sql.PreparedStatement us$stmt35 = null;
		    ResultSet us$rs35 = null;
		    try
			{
			us$stmt35 = us$conn35.prepareStatement("SELECT vvh_vendedora, vvh_fret_obra, vvh_fing_obra FROM vvh_venobras WHERE vvh_empresa =  ?  AND vvh_proyecto =  ?  AND vvh_vendedora =  ?  ORDER BY vvh_fing_obra DESC");
			vmu_empresa.us$setSqlParameterValue(us$stmt35, 1);
			xob_proyecto.us$setSqlParameterValue(us$stmt35, 2);
			vma_ven_responsa.us$setSqlParameterValue(us$stmt35, 3);
			us$rs35 = us$stmt35.executeQuery();
			int us$rowsTouched35 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd35 = us$rs35.getMetaData();
			    if (us$rsmd35.getColumnCount() != 3)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd35.getColumnCount()), "3"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter35 = us$conn35.createDataIterator(us$rs35);
			    if (us$getter35.next())
				{
				++us$rowsTouched35;
				us$getter35.assignValueToVariable(vendedora, 1);
				us$getter35.assignValueToVariable(fret_obra, 2);
				us$getter35.assignValueToVariable(x, 3);
				}
			    }
			finally
			    {
			    if (us$rowsTouched35 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs35 != null)
				us$rs35.close();
			    }
			}
		    catch (SQLException us$ex35)
			{
			getSession().us$setStatus(us$conn35.mapToStatusCode(us$ex35));
			throw us$ex35;
			}
		    catch (NXJDataConnectionException us$ex35)
			{
			getSession().us$setStatus(us$conn35.mapToStatusCode(us$ex35));
			throw us$ex35;
			}
		    finally
			{
			if (us$stmt35 != null)
			    us$conn35.us$closeStatement(us$stmt35);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La vendedora no pertenece al proyecto en cuesti\u00F3n.");
		    getSession().queueNextField(vma_ven_responsa);
		    }
		if (((us$R36 = us$registerPool.allocateRegister().load(fret_obra.isUndefined() != true && !fret_obra.isNull())).isLogicalAndDecided() ? us$R36 : us$R36.logicalAndOp(us$registerPool.allocateRegister().load(fret_obra).neqOp("01/01/2001"))).getBooleanValueNullOk())
		    {
		    if (us$registerPool.allocateRegister().load(fret_obra).ltOp(vmu_f_separacion).getBooleanValueNullOk())
			{
			getSession().displayToMessageBox("La/El vendedor/a ya fue retirada del proyecto");
			getSession().queueNextField(vma_ven_responsa);
			}
		    }
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn37 = getConnection();
		    java.sql.PreparedStatement us$stmt37 = null;
		    ResultSet us$rs37 = null;
		    try
			{
			us$stmt37 = us$conn37.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
			vma_ven_responsa.us$setSqlParameterValue(us$stmt37, 1);
			us$rs37 = us$stmt37.executeQuery();
			int us$rowsTouched37 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd37 = us$rs37.getMetaData();
			    if (us$rsmd37.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd37.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter37 = us$conn37.createDataIterator(us$rs37);
			    if (us$getter37.next())
				{
				++us$rowsTouched37;
				us$getter37.assignValueToVariable(vve_nombre, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched37 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs37 != null)
				us$rs37.close();
			    }
			}
		    catch (SQLException us$ex37)
			{
			getSession().us$setStatus(us$conn37.mapToStatusCode(us$ex37));
			throw us$ex37;
			}
		    catch (NXJDataConnectionException us$ex37)
			{
			getSession().us$setStatus(us$conn37.mapToStatusCode(us$ex37));
			throw us$ex37;
			}
		    finally
			{
			if (us$stmt37 != null)
			    us$conn37.us$closeStatement(us$stmt37);
			}
		    }
	    } // whenValueChanges

	    public vma_ven_responsa()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vma_ven_responsa", true, true, 3);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(3);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("vma_ven_responsa");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		setZoomFormName("Modulo/VendedoresFRM");
		setZoomEnabled(true);
		setZoomActiveMode(NXJCommand.ActiveMode_BOTH);
		setForegroundColor("Black");
		setFontSize("12");
		us$executesCodeBeforeInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vma_ven_responsa

	public /*multi_valued*/ vma_ven_responsa vma_ven_responsa = new vma_ven_responsa();
	public /*multi_valued*/ NullableStringField vmu_cli_ciudad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciudad", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_cli_ciunit = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_ciunit", true, true, 20);
	public class vmu_cli_clase
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R38;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (((us$R38 = us$registerPool.allocateRegister().load(gasto_escritura).neqOp("S")).isLogicalAndDecided() ? us$R38 : us$R38.logicalAndOp(us$registerPool.allocateRegister().load(vmu_cli_clase).eqOp("P"))).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Los gastos de PROMOCI\u00D3N NO est\u00E1n autorizados para esta unidad. Verifique por favor.");
		    vmu_cli_clase.assign(us$registerPool.allocateRegister().load("C"));
		    vmu_cli_clase.setNextField("vmu_cli_clase");
		    }
	    } // onDataAccept

	    public vmu_cli_clase()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_cli_clase", true, true, 2);
		setStyleClass("dropdown_list");
		us$setMultiValued(true);
		us$setView("select");
		us$setFieldLength(2);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("vmu_cli_clase");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$setMultiValuedOptions(false);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_cli_clase

	public /*multi_valued*/ vmu_cli_clase vmu_cli_clase = new vmu_cli_clase();
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
		    NXJDataConnection us$conn39 = getConnection();
		    java.sql.PreparedStatement us$stmt39 = null;
		    ResultSet us$rs39 = null;
		    try
			{
			us$stmt39 = us$conn39.prepareStatement("select xzo_nombre from xzo_zonas");
			us$rs39 = us$stmt39.executeQuery();
			int us$rowsTouched39 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd39 = us$rs39.getMetaData();
			    if (us$rsmd39.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd39.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter39 = us$conn39.createDataIterator(us$rs39);
			    while (us$getter39.next())
				{
				++us$rowsTouched39;
				us$proj1 = us$getter39.getString(1);

				    {
				    if (us$rowCount++ == 300)
					break;
				    us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				    }
				}
			    }
			finally
			    {
			    if (us$rowsTouched39 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs39 != null)
				us$rs39.close();
			    }
			}
		    catch (SQLException us$ex39)
			{
			getSession().us$setStatus(us$conn39.mapToStatusCode(us$ex39));
			throw us$ex39;
			}
		    catch (NXJDataConnectionException us$ex39)
			{
			getSession().us$setStatus(us$conn39.mapToStatusCode(us$ex39));
			throw us$ex39;
			}
		    finally
			{
			if (us$stmt39 != null)
			    us$conn39.us$closeStatement(us$stmt39);
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
	public class vmu_cli_registro
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn40 = getConnection();
		    java.sql.PreparedStatement us$stmt40 = null;
		    ResultSet us$rs40 = null;
		    try
			{
			us$stmt40 = us$conn40.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
			vmu_cli_registro.us$setSqlParameterValue(us$stmt40, 1);
			us$rs40 = us$stmt40.executeQuery();
			int us$rowsTouched40 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd40 = us$rs40.getMetaData();
			    if (us$rsmd40.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd40.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter40 = us$conn40.createDataIterator(us$rs40);
			    if (us$getter40.next())
				{
				++us$rowsTouched40;
				us$getter40.assignValueToVariable(vmu_cli_ciunit, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched40 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs40 != null)
				us$rs40.close();
			    }
			}
		    catch (SQLException us$ex40)
			{
			getSession().us$setStatus(us$conn40.mapToStatusCode(us$ex40));
			throw us$ex40;
			}
		    catch (NXJDataConnectionException us$ex40)
			{
			getSession().us$setStatus(us$conn40.mapToStatusCode(us$ex40));
			throw us$ex40;
			}
		    finally
			{
			if (us$stmt40 != null)
			    us$conn40.us$closeStatement(us$stmt40);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    if (getSession().getStatus() == StatusCode.SS_NOREC)
			{
			getSession().displayToMessageBox("La tramitadora no estpa en la tabla base, verifique por favor.");
			vmu_est_hipote.assign(us$registerPool.allocateRegister().load("N"));
			vmu_cli_registro.assign(null);
			vmu_cli_ciunit.assign(null);
			vmu_cli_registro.setNextField("vmu_est_hipote");
			}
		    else
			{
			getSession().displayToMessageBox("No se puede acceder a la tabla de tramitadoras.");
			vmu_est_hipote.assign(us$registerPool.allocateRegister().load("N"));
			vmu_cli_registro.assign(null);
			vmu_cli_ciunit.assign(null);
			vmu_cli_registro.setNextField("vmu_est_hipote");
			}
		    }
	    } // onDataAccept

	    public void afterField()
		throws Exception
	    {
	    } // afterField

	    public vmu_cli_registro()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_cli_registro", true, true, 15);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(15);
		us$setCandidateTargetColumnName("vmu_cli_registro");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		us$executesCodeBeforeInput = true;
		us$executesCodeAfterInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_cli_registro

	public /*multi_valued*/ vmu_cli_registro vmu_cli_registro = new vmu_cli_registro();
	public /*multi_valued*/ NullableStringField vmu_cli_telof = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_telof", true, true, 30);
	public /*multi_valued*/ NullableStringField vmu_cli_telre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_cli_telre", true, true, 30);
	public class vmu_corporacion
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_corporacion.assign(us$registerPool.allocateRegister().load(vmu_corporacion));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R41;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (((us$R41 = us$registerPool.allocateRegister().load(vmu_forma_pago).eqOp("D")).isLogicalAndDecided() ? us$R41 : us$R41.logicalAndOp(us$registerPool.allocateRegister().load(vmu_corporacion).eqOp("01"))).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Debe registrar un c\u00F3digo de Banco v\u00E1lido, verifique por favor.");
		    vmu_corporacion.assign(us$registerPool.allocateRegister().load(" "));
		    vmu_corporacion.setNextField("vmu_corporacion");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn42 = getConnection();
		    java.sql.PreparedStatement us$stmt42 = null;
		    ResultSet us$rs42 = null;
		    try
			{
			us$stmt42 = us$conn42.prepareStatement("SELECT xcp_nombre FROM xcp_corporacion WHERE xcp_codigo =  ?");
			vmu_corporacion.us$setSqlParameterValue(us$stmt42, 1);
			us$rs42 = us$stmt42.executeQuery();
			int us$rowsTouched42 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd42 = us$rs42.getMetaData();
			    if (us$rsmd42.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd42.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter42 = us$conn42.createDataIterator(us$rs42);
			    if (us$getter42.next())
				{
				++us$rowsTouched42;
				us$getter42.assignValueToVariable(nombre_banco, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched42 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs42 != null)
				us$rs42.close();
			    }
			}
		    catch (SQLException us$ex42)
			{
			getSession().us$setStatus(us$conn42.mapToStatusCode(us$ex42));
			throw us$ex42;
			}
		    catch (NXJDataConnectionException us$ex42)
			{
			getSession().us$setStatus(us$conn42.mapToStatusCode(us$ex42));
			throw us$ex42;
			}
		    finally
			{
			if (us$stmt42 != null)
			    us$conn42.us$closeStatement(us$stmt42);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("C\u00F3digo de banco errado, verifique por favor.");
		    vmu_corporacion.assign(us$registerPool.allocateRegister().load(x_corporacion));
		    vmu_corporacion.setNextField("vmu_corporacion");
		    }
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn43 = getConnection();
		    java.sql.PreparedStatement us$stmt43 = null;
		    ResultSet us$rs43 = null;
		    try
			{
			us$stmt43 = us$conn43.prepareStatement("SELECT xcp_nombre FROM xcp_corporacion WHERE xcp_codigo =  ?");
			vmu_corporacion.us$setSqlParameterValue(us$stmt43, 1);
			us$rs43 = us$stmt43.executeQuery();
			int us$rowsTouched43 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd43 = us$rs43.getMetaData();
			    if (us$rsmd43.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd43.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter43 = us$conn43.createDataIterator(us$rs43);
			    if (us$getter43.next())
				{
				++us$rowsTouched43;
				us$getter43.assignValueToVariable(nombre_banco, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched43 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs43 != null)
				us$rs43.close();
			    }
			}
		    catch (SQLException us$ex43)
			{
			getSession().us$setStatus(us$conn43.mapToStatusCode(us$ex43));
			throw us$ex43;
			}
		    catch (NXJDataConnectionException us$ex43)
			{
			getSession().us$setStatus(us$conn43.mapToStatusCode(us$ex43));
			throw us$ex43;
			}
		    finally
			{
			if (us$stmt43 != null)
			    us$conn43.us$closeStatement(us$stmt43);
			}
		    }
	    } // whenValueChanges

	    public void afterField()
		throws Exception
	    {
	    } // afterField

	    public vmu_corporacion()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_corporacion", true, true, 2);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(2);
		us$setCandidateTargetColumnName("vmu_corporacion");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		us$executesCodeBeforeInput = true;
		us$executesCodeAfterInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_corporacion

	public /*multi_valued*/ vmu_corporacion vmu_corporacion = new vmu_corporacion();
	public /*multi_valued*/ NullableStringField vmu_correo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_correo", true, true, 40);
	public /*multi_valued*/ NullableStringField vmu_correo2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_correo2", true, true, 40);
	public class vmu_descuentos
	    extends com.unify.nxj.mgr.datatypes.NXJAmountField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_descuentos).gtOp(us$registerPool.allocateRegister().load(vmu_precio_uni)).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("El descuento no puede ser mayor al precio de la unidad");
		    vmu_descuentos.assign(us$registerPool.allocateRegister().load(0.0));
		    vmu_descuentos.setNextField("vmu_descuentos");
		    }
		if (vmu_descuentos.isUndefined() == true)
		    {
		    vmu_descuentos.assign(us$registerPool.allocateRegister().load(0.0));
		    }
	    } // onDataAccept

	    public vmu_descuentos()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_descuentos", true, true, 25);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(25);
		us$setCandidateTargetColumnName("vmu_descuentos");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_descuentos

	public /*multi_valued*/ vmu_descuentos vmu_descuentos = new vmu_descuentos();
	public class vmu_est_hipote
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_est_hipote).eqOp("S").getBooleanValueNullOk())
		    {
		    vmu_est_hipote.setNextField("vmu_cli_registro");
		    }
		else
		    {
		    vmu_cli_registro.assign(null);
		    vmu_cli_ciunit.assign(null);
		    vmu_est_hipote.setNextField("vmu_cli_registro");
		    }
	    } // onDataAccept

	    public vmu_est_hipote()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_est_hipote", true, true, 2);
		setStyleClass("dropdown_list");
		us$setMultiValued(true);
		us$setView("select");
		us$setFieldLength(2);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("vmu_est_hipote");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_est_hipote

	public /*multi_valued*/ vmu_est_hipote vmu_est_hipote = new vmu_est_hipote();
	public /*multi_valued*/ NullableStringField vmu_est_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_est_unidad", true, true, 2);
	public class vmu_f_ent_pacta
	    extends com.unify.nxj.mgr.datatypes.NXJDateField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_f_ent_pacta.isUndefined()).ltOp(vmu_f_escritura).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La fecha de entrega debe ser mayor o igual a la de la escritura. Verifique por favor.");
		    vmu_f_ent_pacta.setNextField("vmu_f_ent_pacta");
		    }
	    } // onDataAccept

	    public vmu_f_ent_pacta()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_f_ent_pacta", true, true, 10);
		setStyleClass("date_picker");
		us$setMultiValued(true);
		us$setView("date");
		us$setFieldLength(10);
		us$setCandidateTargetColumnName("vmu_f_ent_pacta");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_f_ent_pacta

	public /*multi_valued*/ vmu_f_ent_pacta vmu_f_ent_pacta = new vmu_f_ent_pacta();
	public /*multi_valued*/ NullableDateField vmu_f_entprog = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_entprog", true, true, 10);
	public class vmu_f_escritura
	    extends com.unify.nxj.mgr.datatypes.NXJDateField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_f_escritura).ltOp(vmu_f_separacion).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La fecha de escritura es inferior a la fecha de separacion.");
		    vmu_f_escritura.setNextField("vmu_f_escritura");
		    }
		if (us$registerPool.allocateRegister().load(vmu_f_escritura).ltOp(us$registerPool.allocateRegister().load(f_escritura)).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La fehca de escritura es inferior a la programada. Verifique por favor.");
		    vmu_f_escritura.setNextField("vmu_f_escritura");
		    }
		else
		    {
		    vmu_f_ent_pacta.assign(us$registerPool.allocateRegister().load(vmu_f_escritura).plusOp(30));
		    if (us$registerPool.allocateRegister().load(adicionando).eqOp(1).getBooleanValueNullOk())
			vmu_f_entprog.assign(us$registerPool.allocateRegister().load(vmu_f_escritura).plusOp(30));
		    }
	    } // onDataAccept

	    public vmu_f_escritura()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_f_escritura", true, true, 10);
		setStyleClass("date_picker");
		us$setMultiValued(true);
		us$setView("date");
		us$setFieldLength(10);
		us$setCandidateTargetColumnName("vmu_f_escritura");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_f_escritura

	public /*multi_valued*/ vmu_f_escritura vmu_f_escritura = new vmu_f_escritura();
	public /*multi_valued*/ NullableDateField vmu_f_gravacion = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vmu_f_gravacion", true, true, 10);
	public class vmu_f_separacion
	    extends com.unify.nxj.mgr.datatypes.NXJDateField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (vmu_f_separacion.isNull() || vmu_f_separacion.isUndefined() == true)
		    {
		    vmu_f_separacion.assign(us$registerPool.allocateRegister().load(scr_fecha));
		    fecha_separa.assign(us$registerPool.allocateRegister().load(vmu_f_separacion));
		    }
		else
		    fecha_separa.assign(us$registerPool.allocateRegister().load(vmu_f_separacion));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R46;
		com.unify.nxj.mgr.datatypes.Register us$R44;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_f_separacion).neqOp(us$registerPool.allocateRegister().load(fecha_separa)).getBooleanValueNullOk())
		    {
		    if (us$registerPool.allocateRegister().load(vmu_f_separacion).ltOp(us$registerPool.allocateRegister().load(fecha_separa)).getBooleanValueNullOk())
			{
			if (((us$R44 = us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).eqOp("ADMVEN")).isLogicalOrDecided() ? us$R44 : us$R44.logicalOrOp(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).eqOp("CUSEZAR"))).getBooleanValueNullOk())
			    {

				{
				getSession().us$setStatus(StatusCode.SS_NORM);
				NXJDataConnection us$conn45 = getConnection();
				java.sql.PreparedStatement us$stmt45 = null;
				ResultSet us$rs45 = null;
				try
				    {
				    us$stmt45 = us$conn45.prepareStatement("SELECT vlp_precio_uni FROM vlp_listapre WHERE vlp_empresa =  ?  AND vlp_obra =  ?  AND vlp_manzana =  ?  AND vlp_unidad =  ?  AND vlp_f_inicial <=  ?  AND (vlp_f_final >=  ?  OR vlp_f_final is NULL)");
				    vmu_empresa.us$setSqlParameterValue(us$stmt45, 1);
				    vmu_obra.us$setSqlParameterValue(us$stmt45, 2);
				    vmu_manzana.us$setSqlParameterValue(us$stmt45, 3);
				    vmu_unidad.us$setSqlParameterValue(us$stmt45, 4);
				    vmu_f_separacion.us$setSqlParameterValue(us$stmt45, 5);
				    vmu_f_separacion.us$setSqlParameterValue(us$stmt45, 6);
				    us$rs45 = us$stmt45.executeQuery();
				    int us$rowsTouched45 = 0;
				    try
					{
					java.sql.ResultSetMetaData us$rsmd45 = us$rs45.getMetaData();
					if (us$rsmd45.getColumnCount() != 1)
					    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
						{
						Integer.toString(us$rsmd45.getColumnCount()), "1"
						}));
					com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter45 = us$conn45.createDataIterator(us$rs45);
					if (us$getter45.next())
					    {
					    ++us$rowsTouched45;
					    us$getter45.assignValueToVariable(x_precio_uni, 1);
					    }
					}
				    finally
					{
					if (us$rowsTouched45 == 0)
					    getSession().us$setStatus(StatusCode.SS_NOREC);
					if (us$rs45 != null)
					    us$rs45.close();
					}
				    }
				catch (SQLException us$ex45)
				    {
				    getSession().us$setStatus(us$conn45.mapToStatusCode(us$ex45));
				    throw us$ex45;
				    }
				catch (NXJDataConnectionException us$ex45)
				    {
				    getSession().us$setStatus(us$conn45.mapToStatusCode(us$ex45));
				    throw us$ex45;
				    }
				finally
				    {
				    if (us$stmt45 != null)
					us$conn45.us$closeStatement(us$stmt45);
				    }
				}
			    if (getSession().getStatus() != StatusCode.SS_NORM)
				{
				if (getSession().getStatus() != StatusCode.SS_NOREC)
				    {
				    getSession().displayToMessageBox("La unidad no puede acceder la lista para esta fecha, verifique por favor. ");
				    vmu_f_separacion.assign(us$registerPool.allocateRegister().load(fecha_separa));
				    vmu_f_separacion.setNextField("vmu_f_separacion");
				    }
				else
				    {
				    getSession().displayToMessageBox("No hay lista de precios para la unidad, se conserva el precio actual.");
				    }
				}
			    else
				{
				vmu_precio_uni.assign(us$registerPool.allocateRegister().load(x_precio_uni));
				}
			    }
			else
			    {
			    getSession().displayToMessageBox("No puede modificar la fecha de separaci\u00F3n, requiere autorizaci\u00F3n.");
			    vmu_f_separacion.assign(us$registerPool.allocateRegister().load(fecha_separa));
			    vmu_f_separacion.setNextField("vmu_f_separacion");
			    }
			}
		    else
			{
			getSession().displayToMessageBox("No puede crear la fecha de separaci\u00F3n mayor a la fecha del d\u00EDa. Verifique por favor. ");
			vmu_f_separacion.assign(us$registerPool.allocateRegister().load(fecha_separa));
			vmu_f_separacion.setNextField("vmu_f_separacion");
			}
		    }
		if (((us$R46 = us$registerPool.allocateRegister().load(vmu_f_separacion).gtOp(us$registerPool.allocateRegister().load(f_escritura))).isLogicalAndDecided() ? us$R46 : us$R46.logicalAndOp(us$registerPool.allocateRegister().load(adicionando).eqOp(1))).getBooleanValueNullOk())
		    {
		    vmu_f_ent_pacta.assign(us$registerPool.allocateRegister().load(vmu_f_separacion).plusOp(60));
		    vmu_f_escritura.assign(us$registerPool.allocateRegister().load(vmu_f_separacion).plusOp(30));
		    }
	    } // onDataAccept

	    public vmu_f_separacion()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_f_separacion", true, true, 10);
		setStyleClass("date_picker");
		us$setMultiValued(true);
		us$setView("date");
		us$setFieldLength(10);
		us$setCandidateTargetColumnName("vmu_f_separacion");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$executesCodeBeforeInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_f_separacion

	public /*multi_valued*/ vmu_f_separacion vmu_f_separacion = new vmu_f_separacion();
	public /*multi_valued*/ NullableStringField vmu_forma_pago = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_forma_pago", true, true, 2);
	public class vmu_manzana
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_manzana.assign(us$registerPool.allocateRegister().load(vmu_manzana));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn47 = getConnection();
		    java.sql.PreparedStatement us$stmt47 = null;
		    ResultSet us$rs47 = null;
		    try
			{
			us$stmt47 = us$conn47.prepareStatement("SELECT vuu_lote FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt47, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt47, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt47, 3);
			us$rs47 = us$stmt47.executeQuery();
			int us$rowsTouched47 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd47 = us$rs47.getMetaData();
			    if (us$rsmd47.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd47.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter47 = us$conn47.createDataIterator(us$rs47);
			    if (us$getter47.next())
				{
				++us$rowsTouched47;
				us$getter47.assignValueToVariable(x_campo, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched47 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs47 != null)
				us$rs47.close();
			    }
			}
		    catch (SQLException us$ex47)
			{
			getSession().us$setStatus(us$conn47.mapToStatusCode(us$ex47));
			throw us$ex47;
			}
		    catch (NXJDataConnectionException us$ex47)
			{
			getSession().us$setStatus(us$conn47.mapToStatusCode(us$ex47));
			throw us$ex47;
			}
		    finally
			{
			if (us$stmt47 != null)
			    us$conn47.us$closeStatement(us$stmt47);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La manzana no corresponde.");
		    vmu_manzana.assign(us$registerPool.allocateRegister().load(x_manzana));
		    vmu_manzana.setNextField("vmu_manzana");
		    }
	    } // onDataAccept

	    public vmu_manzana()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_manzana", true, true, 3);
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
	public class vmu_ngarage
	    extends com.unify.nxj.mgr.datatypes.NXJNumericField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		prospecto_ant.assign(us$registerPool.allocateRegister().load(vmu_ngarage));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_ngarage).neqOp(us$registerPool.allocateRegister().load(prospecto_ant)).getBooleanValueNullOk())
		    {
		    if (prospecto_ant.isUndefined() == false && !prospecto_ant.isNull())
			{

			    {
			    getSession().us$setStatus(StatusCode.SS_NORM);
			    NXJDataConnection us$conn48 = getConnection();
			    java.sql.PreparedStatement us$stmt48 = null;
			    ResultSet us$rs48 = null;
			    try
				{
				us$stmt48 = us$conn48.prepareStatement("UPDATE vpp_prospectos SET vpp_estadopro = \'B\' WHERE vpp_proyecto =  ?  AND vpp_numero =  ?");
				xob_proyecto.us$setSqlParameterValue(us$stmt48, 1);
				vmu_ngarage.us$setSqlParameterValue(us$stmt48, 2);
				if (us$stmt48.executeUpdate() == 0)
				    getSession().us$setStatus(StatusCode.SS_NOREC);
				}
			    catch (SQLException us$ex48)
				{
				getSession().us$setStatus(us$conn48.mapToStatusCode(us$ex48));
				throw us$ex48;
				}
			    catch (NXJDataConnectionException us$ex48)
				{
				getSession().us$setStatus(us$conn48.mapToStatusCode(us$ex48));
				throw us$ex48;
				}
			    finally
				{
				if (us$stmt48 != null)
				    us$conn48.us$closeStatement(us$stmt48);
				}
			    }

			    {
			    getSession().us$setStatus(StatusCode.SS_NORM);
			    NXJDataConnection us$conn49 = getConnection();
			    java.sql.PreparedStatement us$stmt49 = null;
			    ResultSet us$rs49 = null;
			    try
				{
				us$stmt49 = us$conn49.prepareStatement("UPDATE vpp_prospectos SET vpp_estadopro = \'A\' WHERE vpp_proyecto =  ?  AND vpp_numero =  ?");
				xob_proyecto.us$setSqlParameterValue(us$stmt49, 1);
				prospecto_ant.us$setSqlParameterValue(us$stmt49, 2);
				if (us$stmt49.executeUpdate() == 0)
				    getSession().us$setStatus(StatusCode.SS_NOREC);
				}
			    catch (SQLException us$ex49)
				{
				getSession().us$setStatus(us$conn49.mapToStatusCode(us$ex49));
				throw us$ex49;
				}
			    catch (NXJDataConnectionException us$ex49)
				{
				getSession().us$setStatus(us$conn49.mapToStatusCode(us$ex49));
				throw us$ex49;
				}
			    finally
				{
				if (us$stmt49 != null)
				    us$conn49.us$closeStatement(us$stmt49);
				}
			    }
			}
		    else
			{

			    {
			    getSession().us$setStatus(StatusCode.SS_NORM);
			    NXJDataConnection us$conn50 = getConnection();
			    java.sql.PreparedStatement us$stmt50 = null;
			    ResultSet us$rs50 = null;
			    try
				{
				us$stmt50 = us$conn50.prepareStatement("UPDATE vpp_prospectos SET vpp_estadopro = \'B\' WHERE vpp_proyecto =  ?  AND vpp_numero =  ?");
				xob_proyecto.us$setSqlParameterValue(us$stmt50, 1);
				vmu_ngarage.us$setSqlParameterValue(us$stmt50, 2);
				if (us$stmt50.executeUpdate() == 0)
				    getSession().us$setStatus(StatusCode.SS_NOREC);
				}
			    catch (SQLException us$ex50)
				{
				getSession().us$setStatus(us$conn50.mapToStatusCode(us$ex50));
				throw us$ex50;
				}
			    catch (NXJDataConnectionException us$ex50)
				{
				getSession().us$setStatus(us$conn50.mapToStatusCode(us$ex50));
				throw us$ex50;
				}
			    finally
				{
				if (us$stmt50 != null)
				    us$conn50.us$closeStatement(us$stmt50);
				}
			    }
			}
		    }
	    } // onDataAccept

	    public void afterField()
		throws Exception
	    {
	    } // afterField

	    public vmu_ngarage()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_ngarage", true, true, 11);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(11);
		us$setCandidateTargetColumnName("vmu_ngarage");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$executesCodeBeforeInput = true;
		us$executesCodeAfterInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_ngarage

	public /*multi_valued*/ vmu_ngarage vmu_ngarage = new vmu_ngarage();
	public class vmu_obra
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{
	    NullableNumeric ii = NullableFactory.createNullableNumeric("ii");

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_obra.assign(us$registerPool.allocateRegister().load(vmu_obra));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn51 = getConnection();
		    java.sql.PreparedStatement us$stmt51 = null;
		    ResultSet us$rs51 = null;
		    try
			{
			us$stmt51 = us$conn51.prepareStatement("SELECT xob_proyecto FROM xob_obras WHERE xob_empresa =  ?  AND xob_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt51, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt51, 2);
			us$rs51 = us$stmt51.executeQuery();
			int us$rowsTouched51 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd51 = us$rs51.getMetaData();
			    if (us$rsmd51.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd51.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter51 = us$conn51.createDataIterator(us$rs51);
			    if (us$getter51.next())
				{
				++us$rowsTouched51;
				us$getter51.assignValueToVariable(xob_proyecto, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched51 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs51 != null)
				us$rs51.close();
			    }
			}
		    catch (SQLException us$ex51)
			{
			getSession().us$setStatus(us$conn51.mapToStatusCode(us$ex51));
			throw us$ex51;
			}
		    catch (NXJDataConnectionException us$ex51)
			{
			getSession().us$setStatus(us$conn51.mapToStatusCode(us$ex51));
			throw us$ex51;
			}
		    finally
			{
			if (us$stmt51 != null)
			    us$conn51.us$closeStatement(us$stmt51);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La obra no corresponde.");
		    vmu_obra.assign(us$registerPool.allocateRegister().load(x_obra));
		    vmu_obra.setNextField("vmu_obra");
		    }
		ii.assign(us$registerPool.allocateRegister().load(0));

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn52 = getConnection();
		    java.sql.PreparedStatement us$stmt52 = null;
		    ResultSet us$rs52 = null;
		    try
			{
			us$stmt52 = us$conn52.prepareStatement("SELECT vev_etapactu, vev_estado FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt52, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt52, 2);
			us$rs52 = us$stmt52.executeQuery();
			int us$rowsTouched52 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd52 = us$rs52.getMetaData();
			    if (us$rsmd52.getColumnCount() != 2)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd52.getColumnCount()), "2"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter52 = us$conn52.createDataIterator(us$rs52);
			    while (us$getter52.next())
				{
				++us$rowsTouched52;
				us$getter52.assignValueToVariable(etapa_activa, 1);
				us$getter52.assignValueToVariable(est, 2);

				    {
				    ii.assign(us$registerPool.allocateRegister().load(ii).plusOp(1));
				    }
				}
			    }
			finally
			    {
			    if (us$rowsTouched52 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs52 != null)
				us$rs52.close();
			    }
			}
		    catch (SQLException us$ex52)
			{
			getSession().us$setStatus(us$conn52.mapToStatusCode(us$ex52));
			throw us$ex52;
			}
		    catch (NXJDataConnectionException us$ex52)
			{
			getSession().us$setStatus(us$conn52.mapToStatusCode(us$ex52));
			throw us$ex52;
			}
		    finally
			{
			if (us$stmt52 != null)
			    us$conn52.us$closeStatement(us$stmt52);
			}
		    }
		if (us$registerPool.allocateRegister().load(ii).gtOp(1).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("Hay m\u00E1s de una etapa activa. Verifique, por favor.");
		    getSession().queueCommand("PREVIOUS_FORM");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn53 = getConnection();
		    java.sql.PreparedStatement us$stmt53 = null;
		    ResultSet us$rs53 = null;
		    try
			{
			us$stmt53 = us$conn53.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt53, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt53, 2);
			us$rs53 = us$stmt53.executeQuery();
			int us$rowsTouched53 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd53 = us$rs53.getMetaData();
			    if (us$rsmd53.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd53.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter53 = us$conn53.createDataIterator(us$rs53);
			    if (us$getter53.next())
				{
				++us$rowsTouched53;
				us$getter53.assignValueToVariable(etapa_act, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched53 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs53 != null)
				us$rs53.close();
			    }
			}
		    catch (SQLException us$ex53)
			{
			getSession().us$setStatus(us$conn53.mapToStatusCode(us$ex53));
			throw us$ex53;
			}
		    catch (NXJDataConnectionException us$ex53)
			{
			getSession().us$setStatus(us$conn53.mapToStatusCode(us$ex53));
			throw us$ex53;
			}
		    finally
			{
			if (us$stmt53 != null)
			    us$conn53.us$closeStatement(us$stmt53);
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
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_obra

	public /*multi_valued*/ vmu_obra vmu_obra = new vmu_obra();
	public /*multi_valued*/ NullableAmountField vmu_precio_uni = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_precio_uni", true, true, 25);
	public /*multi_valued*/ NullableAmountField vmu_preciotot = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vmu_preciotot", true, true, 25);
	public /*multi_valued*/ NullableStringField vmu_promocion1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_promocion1", true, true, 80);
	public /*multi_valued*/ NullableStringField vmu_promocion2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_promocion2", true, true, 80);
	public /*multi_valued*/ NullableStringField vmu_tipoinmueb = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_tipoinmueb", true, true, 2);
	public /*multi_valued*/ NullableStringField vmu_tramite = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmu_tramite", true, true, 13);
	public class vmu_unidad
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		x_unidad.assign(us$registerPool.allocateRegister().load(vmu_unidad));
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn54 = getConnection();
		    java.sql.PreparedStatement us$stmt54 = null;
		    ResultSet us$rs54 = null;
		    try
			{
			us$stmt54 = us$conn54.prepareStatement("SELECT vlp_precio_uni FROM vlp_listapre WHERE vlp_empresa =  ?  AND vlp_obra =  ?  AND vlp_manzana =  ?  AND vlp_unidad =  ?  AND vlp_f_inicial is NULL");
			vmu_empresa.us$setSqlParameterValue(us$stmt54, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt54, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt54, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt54, 4);
			us$rs54 = us$stmt54.executeQuery();
			int us$rowsTouched54 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd54 = us$rs54.getMetaData();
			    if (us$rsmd54.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd54.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter54 = us$conn54.createDataIterator(us$rs54);
			    if (us$getter54.next())
				{
				++us$rowsTouched54;
				us$getter54.assignValueToVariable(vmu_precio_uni, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched54 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs54 != null)
				us$rs54.close();
			    }
			}
		    catch (SQLException us$ex54)
			{
			getSession().us$setStatus(us$conn54.mapToStatusCode(us$ex54));
			throw us$ex54;
			}
		    catch (NXJDataConnectionException us$ex54)
			{
			getSession().us$setStatus(us$conn54.mapToStatusCode(us$ex54));
			throw us$ex54;
			}
		    finally
			{
			if (us$stmt54 != null)
			    us$conn54.us$closeStatement(us$stmt54);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La unidad no tiene precio de lista actual, verifique por favor. ");
		    vmu_unidad.assign(us$registerPool.allocateRegister().load(x_unidad));
		    vmu_unidad.setNextField("vmu_unidad");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn55 = getConnection();
		    java.sql.PreparedStatement us$stmt55 = null;
		    ResultSet us$rs55 = null;
		    try
			{
			us$stmt55 = us$conn55.prepareStatement("SELECT vuu_estado, vuu_tipoinmueble, vuu_etapa, vuu_plus2 FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt55, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt55, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt55, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt55, 4);
			us$rs55 = us$stmt55.executeQuery();
			int us$rowsTouched55 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd55 = us$rs55.getMetaData();
			    if (us$rsmd55.getColumnCount() != 4)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd55.getColumnCount()), "4"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter55 = us$conn55.createDataIterator(us$rs55);
			    if (us$getter55.next())
				{
				++us$rowsTouched55;
				us$getter55.assignValueToVariable(estado, 1);
				us$getter55.assignValueToVariable(vmu_tipoinmueb, 2);
				us$getter55.assignValueToVariable(vmu_etapa_venta, 3);
				us$getter55.assignValueToVariable(gasto_escritura, 4);
				}
			    }
			finally
			    {
			    if (us$rowsTouched55 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs55 != null)
				us$rs55.close();
			    }
			}
		    catch (SQLException us$ex55)
			{
			getSession().us$setStatus(us$conn55.mapToStatusCode(us$ex55));
			throw us$ex55;
			}
		    catch (NXJDataConnectionException us$ex55)
			{
			getSession().us$setStatus(us$conn55.mapToStatusCode(us$ex55));
			throw us$ex55;
			}
		    finally
			{
			if (us$stmt55 != null)
			    us$conn55.us$closeStatement(us$stmt55);
			}
		    }
		if (getSession().getStatus() != StatusCode.SS_NORM)
		    {
		    getSession().displayToMessageBox("La unidad no corresponde. ");
		    vmu_unidad.assign(us$registerPool.allocateRegister().load(x_unidad));
		    vmu_unidad.setNextField("vmu_unidad");
		    }
		if (us$registerPool.allocateRegister().load(estado).neqOp("D").getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La unidad no est\u00E1 disponible para la venta.");
		    getSession().queueCommand("CLEAR_TO_ADD");
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn56 = getConnection();
		    java.sql.PreparedStatement us$stmt56 = null;
		    ResultSet us$rs56 = null;
		    try
			{
			us$stmt56 = us$conn56.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_etapactu =  ?  AND vev_estado = \'A\' AND vev_empresa =  ?  AND vev_obra =  ?");
			vmu_etapa_venta.us$setSqlParameterValue(us$stmt56, 1);
			vmu_empresa.us$setSqlParameterValue(us$stmt56, 2);
			vmu_obra.us$setSqlParameterValue(us$stmt56, 3);
			us$rs56 = us$stmt56.executeQuery();
			int us$rowsTouched56 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd56 = us$rs56.getMetaData();
			    if (us$rsmd56.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd56.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter56 = us$conn56.createDataIterator(us$rs56);
			    if (us$getter56.next())
				{
				++us$rowsTouched56;
				us$getter56.assignValueToVariable(etapa_activa, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched56 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs56 != null)
				us$rs56.close();
			    }
			}
		    catch (SQLException us$ex56)
			{
			getSession().us$setStatus(us$conn56.mapToStatusCode(us$ex56));
			throw us$ex56;
			}
		    catch (NXJDataConnectionException us$ex56)
			{
			getSession().us$setStatus(us$conn56.mapToStatusCode(us$ex56));
			throw us$ex56;
			}
		    finally
			{
			if (us$stmt56 != null)
			    us$conn56.us$closeStatement(us$stmt56);
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
		    NXJDataConnection us$conn57 = getConnection();
		    java.sql.PreparedStatement us$stmt57 = null;
		    ResultSet us$rs57 = null;
		    try
			{
			us$stmt57 = us$conn57.prepareStatement("SELECT vuu_fterminacion, vuu_f_entregaprog FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt57, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt57, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt57, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt57, 4);
			us$rs57 = us$stmt57.executeQuery();
			int us$rowsTouched57 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd57 = us$rs57.getMetaData();
			    if (us$rsmd57.getColumnCount() != 2)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd57.getColumnCount()), "2"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter57 = us$conn57.createDataIterator(us$rs57);
			    if (us$getter57.next())
				{
				++us$rowsTouched57;
				us$getter57.assignValueToVariable(f_ent_real, 1);
				us$getter57.assignValueToVariable(f_ent_pacta, 2);
				}
			    }
			finally
			    {
			    if (us$rowsTouched57 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs57 != null)
				us$rs57.close();
			    }
			}
		    catch (SQLException us$ex57)
			{
			getSession().us$setStatus(us$conn57.mapToStatusCode(us$ex57));
			throw us$ex57;
			}
		    catch (NXJDataConnectionException us$ex57)
			{
			getSession().us$setStatus(us$conn57.mapToStatusCode(us$ex57));
			throw us$ex57;
			}
		    finally
			{
			if (us$stmt57 != null)
			    us$conn57.us$closeStatement(us$stmt57);
			}
		    }
		if (f_ent_pacta.isNull())
		    {
		    getSession().displayToMessageBox("La unidad no tiene fecha de entre definida, verifique por favor.");
		    getSession().queueCommand("CLEAR_TO_ADD");
		    }
		else
		    {
		    if (f_ent_real.isNull())
			{
			f_entrega.assign(us$registerPool.allocateRegister().load(f_ent_pacta));
			f_escritura.assign(us$registerPool.allocateRegister().load(f_ent_pacta).minusOp(30));
			}
		    else
			{
			f_entrega.assign(us$registerPool.allocateRegister().load(f_ent_real));
			f_escritura.assign(us$registerPool.allocateRegister().load(f_ent_real).minusOp(30));
			}
		    }
		if (us$registerPool.allocateRegister().load(adicionando).eqOp(1).getBooleanValueNullOk())
		    {
		    vmu_f_ent_pacta.assign(us$registerPool.allocateRegister().load(f_entrega));
		    vmu_ent_escritura.assign(us$registerPool.allocateRegister().load(f_escritura));
		    }

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn58 = getConnection();
		    java.sql.PreparedStatement us$stmt58 = null;
		    ResultSet us$rs58 = null;
		    try
			{
			us$stmt58 = us$conn58.prepareStatement("SELECT vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_etapa = \'EV\' AND vut_tramite = \'PO\' AND vut_f_real !=  ?  AND vut_f_real is not NULL");
			vmu_empresa.us$setSqlParameterValue(us$stmt58, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt58, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt58, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt58, 4);
			fechafalsa.us$setSqlParameterValue(us$stmt58, 5);
			us$rs58 = us$stmt58.executeQuery();
			int us$rowsTouched58 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd58 = us$rs58.getMetaData();
			    if (us$rsmd58.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd58.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter58 = us$conn58.createDataIterator(us$rs58);
			    if (us$getter58.next())
				{
				++us$rowsTouched58;
				us$getter58.assignValueToVariable(vut_f_real, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched58 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs58 != null)
				us$rs58.close();
			    }
			}
		    catch (SQLException us$ex58)
			{
			getSession().us$setStatus(us$conn58.mapToStatusCode(us$ex58));
			throw us$ex58;
			}
		    catch (NXJDataConnectionException us$ex58)
			{
			getSession().us$setStatus(us$conn58.mapToStatusCode(us$ex58));
			throw us$ex58;
			}
		    finally
			{
			if (us$stmt58 != null)
			    us$conn58.us$closeStatement(us$stmt58);
			}
		    }
		if (getSession().getStatus() == StatusCode.SS_NORM)
		    {
		    f_permiso.assign(us$registerPool.allocateRegister().load(vut_f_real));
		    getSession().displayToMessageBox("Casa terminada. Entrega r\u00E1pida.");
		    getSession().displayToMessageBox("Debe elaborar el contrato de Comrpa Venta cuanto antes.");
		    }
		else
		    f_permiso.assign(us$registerPool.allocateRegister().load("01/01/2001"));
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn59 = getConnection();
		    java.sql.PreparedStatement us$stmt59 = null;
		    ResultSet us$rs59 = null;
		    try
			{
			us$stmt59 = us$conn59.prepareStatement("SELECT vut_f_real FROM vut_tramites WHERE vut_empresa =  ?  AND vut_obra =  ?  AND vut_manzana =  ?  AND vut_unidad =  ?  AND vut_etapa = \'EV\' AND vut_tramite = \'PO\' AND vut_f_real !=  ?  AND vut_f_real is not NULL");
			vmu_empresa.us$setSqlParameterValue(us$stmt59, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt59, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt59, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt59, 4);
			fechafalsa.us$setSqlParameterValue(us$stmt59, 5);
			us$rs59 = us$stmt59.executeQuery();
			int us$rowsTouched59 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd59 = us$rs59.getMetaData();
			    if (us$rsmd59.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd59.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter59 = us$conn59.createDataIterator(us$rs59);
			    if (us$getter59.next())
				{
				++us$rowsTouched59;
				us$getter59.assignValueToVariable(vut_f_real, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched59 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs59 != null)
				us$rs59.close();
			    }
			}
		    catch (SQLException us$ex59)
			{
			getSession().us$setStatus(us$conn59.mapToStatusCode(us$ex59));
			throw us$ex59;
			}
		    catch (NXJDataConnectionException us$ex59)
			{
			getSession().us$setStatus(us$conn59.mapToStatusCode(us$ex59));
			throw us$ex59;
			}
		    finally
			{
			if (us$stmt59 != null)
			    us$conn59.us$closeStatement(us$stmt59);
			}
		    }
		if (getSession().getStatus() == StatusCode.SS_NORM)
		    {
		    f_permiso.assign(us$registerPool.allocateRegister().load(vut_f_real));
		    }
		else
		    f_permiso.assign(us$registerPool.allocateRegister().load("01/01/2001"));

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn60 = getConnection();
		    java.sql.PreparedStatement us$stmt60 = null;
		    ResultSet us$rs60 = null;
		    try
			{
			us$stmt60 = us$conn60.prepareStatement("SELECT vuu_fterminacion, vuu_f_entregaprog, vuu_area_lote, vuu_area_const, vuu_plus2 FROM vuu_unidades WHERE vuu_empresa =  ?  AND vuu_obra =  ?  AND vuu_manzana =  ?  AND vuu_unidad =  ?");
			vmu_empresa.us$setSqlParameterValue(us$stmt60, 1);
			vmu_obra.us$setSqlParameterValue(us$stmt60, 2);
			vmu_manzana.us$setSqlParameterValue(us$stmt60, 3);
			vmu_unidad.us$setSqlParameterValue(us$stmt60, 4);
			us$rs60 = us$stmt60.executeQuery();
			int us$rowsTouched60 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd60 = us$rs60.getMetaData();
			    if (us$rsmd60.getColumnCount() != 5)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd60.getColumnCount()), "5"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter60 = us$conn60.createDataIterator(us$rs60);
			    if (us$getter60.next())
				{
				++us$rowsTouched60;
				us$getter60.assignValueToVariable(f_ent_real, 1);
				us$getter60.assignValueToVariable(f_ent_pacta, 2);
				us$getter60.assignValueToVariable(area_lote, 3);
				us$getter60.assignValueToVariable(area_const, 4);
				us$getter60.assignValueToVariable(gasto_escritura, 5);
				}
			    }
			finally
			    {
			    if (us$rowsTouched60 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs60 != null)
				us$rs60.close();
			    }
			}
		    catch (SQLException us$ex60)
			{
			getSession().us$setStatus(us$conn60.mapToStatusCode(us$ex60));
			throw us$ex60;
			}
		    catch (NXJDataConnectionException us$ex60)
			{
			getSession().us$setStatus(us$conn60.mapToStatusCode(us$ex60));
			throw us$ex60;
			}
		    finally
			{
			if (us$stmt60 != null)
			    us$conn60.us$closeStatement(us$stmt60);
			}
		    }
		if (f_ent_pacta.isNull())
		    {
		    getSession().displayToMessageBox("La unidad no tiene fecha de entre definida, verifique por favor.");
		    }
		else
		    {
		    if (f_ent_real.isNull())
			{
			f_entrega.assign(us$registerPool.allocateRegister().load(f_ent_pacta));
			f_escritura.assign(us$registerPool.allocateRegister().load(f_ent_pacta).minusOp(30));
			}
		    else
			{
			f_entrega.assign(us$registerPool.allocateRegister().load(f_ent_real));
			f_escritura.assign(us$registerPool.allocateRegister().load(f_ent_real).minusOp(30));
			}
		    }
	    } // whenValueChanges

	    public vmu_unidad()
	    {
		super(ModuloCNegocios.RBoletinesFRM.cajagrandeRBoletines.this, "vmu_unidad", true, true, 4);
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
	    varpass1.setStyleClass("textfield");
	    varpass1.us$setView("text");
	    varpass1.setFindable(false);
	    varpass2.setStyleClass("textfield");
	    varpass2.us$setView("text");
	    varpass2.setFindable(false);
	    varpass3.setStyleClass("textfield");
	    varpass3.us$setView("text");
	    varpass3.setFindable(false);
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
	} // cajagrandeRBoletinespropertySetter_1

	private void cajagrandeRBoletinespropertySetter_2()
	{
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
	    vmu_f_entprog.setStyleClass("date_picker");
	    vmu_f_entprog.us$setMultiValued(true);
	    vmu_f_entprog.us$setView("date");
	    vmu_f_entprog.us$setFieldLength(10);
	    vmu_f_entprog.us$setCandidateTargetColumnName("vmu_f_entprog");
	    vmu_f_entprog.setValueRetrievedDuringFetch(true);
	    vmu_f_entprog.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_entprog.setFindable(true);
	    vmu_f_entprog.setUpdateable(true);
	    vmu_f_gravacion.setStyleClass("date_picker");
	    vmu_f_gravacion.us$setMultiValued(true);
	    vmu_f_gravacion.us$setView("date");
	    vmu_f_gravacion.us$setFieldLength(10);
	    vmu_f_gravacion.us$setCandidateTargetColumnName("vmu_f_gravacion");
	    vmu_f_gravacion.setValueRetrievedDuringFetch(true);
	    vmu_f_gravacion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vmu_f_gravacion.setFindable(true);
	    vmu_f_gravacion.setUpdateable(true);
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
	    vmu_precio_uni.setStopForInput(false);
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
	    vmu_preciotot.setStopForInput(false);
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
	} // cajagrandeRBoletinespropertySetter_2
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
	us$addTargetMapping("vmu_etapa_venta", "vmu_etapa_venta");
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_separacion", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_escritura", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vut_f_real", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "fret_obra", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "scr_fecha", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "fecha_separa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_ent_real", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_ent_pacta", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_entrega", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vmu_ent_escritura", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "f_permiso", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "adicionando", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "adiciona", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "prospecto_ant", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "varIC", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "varIAC", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "varCN", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "formasig", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "xob_proyecto", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_activa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "est", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "etapa_act", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage1", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage2", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "garage3", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "deposito1", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "deposito2", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "corporacion", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cli_clase", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "forma_pago", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "tipounidad", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vut_etapa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vut_tramite", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vve_nombre", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vendedora", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "gasto_escritura", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_corporacion", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_campo", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_manzana", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_obra", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_unidad", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "fechafalsa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "estado", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vmu_etapa_venta", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "cien", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "preciotot", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "tasa", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "imporenta", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "zero", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vlr_ev", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "vpc_porcentaje", false);
	us$addProxyObject(ModuloCNegocios.RBoletinesFRM.class, "x_precio_uni", false);
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

