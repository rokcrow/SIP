package Modulo;

import java.io.*;
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

public class ProspectosDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    NullableDate fing_obra = NullableFactory.createNullableDate("fing_obra");
    NullableDate fret_obra = NullableFactory.createNullableDate("fret_obra");
    NullableDate fecha_mini = NullableFactory.createNullableDate("fecha_mini");
    NullableNumeric xpc_dias_pvt = NullableFactory.createNullableNumeric("xpc_dias_pvt");
    NullableNumeric xpc_dias_pac = NullableFactory.createNullableNumeric("xpc_dias_pac");
    NullableString empresanombre = NullableFactory.createNullableString("empresanombre");
    NullableString vendedora = NullableFactory.createNullableString("vendedora");
    NullableString estadopro_ant = NullableFactory.createNullableString("estadopro_ant");
    NullableString xpc_califica = NullableFactory.createNullableString("xpc_califica");
    NullableString xpr_usuario = NullableFactory.createNullableString("xpr_usuario");
    NullableString vpy_tipo = NullableFactory.createNullableString("vpy_tipo");
    NullableTime hora = NullableFactory.createNullableTime("hora");

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
	cajaarribaRProspectos.actualempresa.assign(us$registerPool.allocateRegister().load(empresanombre));
	cajaarribaRProspectos.actualusuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario));
	((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.MTraspasa.assign(us$registerPool.allocateRegister().load("1"));
    } // initDataView

    public void onClearToAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	vpp_fecha.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	vpp_fechaestado.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	fecha_mini.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	vpp_estadopro.assign(us$registerPool.allocateRegister().load("A"));
	vpp_numero.setStopForInput(false);
	vpp_estadopro.setStopForInput(false);
	vpp_fecha.setStopForInput(false);
	vpp_fechaestado.setStopForInput(false);
    } // onClearToAdd

    public void onClearToFind()
	throws Exception
    {
	vpp_numero.setStopForInput(true);
	vpp_estadopro.setStopForInput(true);
	vpp_fecha.setStopForInput(true);
	vpp_fechaestado.setStopForInput(true);
    } // onClearToFind

    public void afterFind()
	throws Exception
    {
	vpp_numero.setStopForInput(false);
	vpp_fecha.setStopForInput(false);
	vpp_fechaestado.setStopForInput(false);
    } // afterFind

    public void beforeAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NullableNumeric varX = (NullableNumeric)NullableFactory.createNullableNumeric("varX").assign(us$registerPool.allocateRegister().load(0));
	NullableNumeric xco_numero = NullableFactory.createNullableNumeric("xco_numero");
	while (us$registerPool.allocateRegister().load(varX).ltOp(100).getBooleanValueNullOk())
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn2 = getConnection();
		java.sql.PreparedStatement us$stmt2 = null;
		ResultSet us$rs2 = null;
		try
		    {
		    us$stmt2 = us$conn2.prepareStatement("SELECT xco_ult_numero + 1 FROM xco_consecut WHERE xco_empresa =  ?  AND xco_documento = \'PR\'");
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt2, 1);
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
			    us$getter2.assignValueToVariable(xco_numero, 1);
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
	    if (getSession().getStatus() == StatusCode.SS_LMOUT)
		{
		getSession().displayToMessageBox("Esperando mientras otro usuario accesa el consecutivo");
		varX.assign(us$registerPool.allocateRegister().load(varX).plusOp(1));
		}
	    if (getSession().getStatus() == StatusCode.SS_NORM)
		{
		varX.assign(us$registerPool.allocateRegister().load(101));
		}
	    }
	if (getSession().getStatus() == StatusCode.SS_NOREC || getSession().getStatus() == StatusCode.SS_LMOUT)
	    {
	    getSession().displayToMessageBox("No se puede accesar el consecutivo o no esta creado...");
	    rejectOperation();
	    }
	else
	    {
	    vpp_numero.assign(us$registerPool.allocateRegister().load(xco_numero));
	    }
    } // beforeAdd

    public void beforeFind()
	throws Exception
    {
	com.unify.nxj.mgr.datatypes.Register us$R4;
	com.unify.nxj.mgr.datatypes.Register us$R3;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NullableString Var1 = (NullableString)NullableFactory.createNullableString("Var1").assign(us$registerPool.allocateRegister().load(vpp_proyecto.getSearchRanges()));
	if (((us$R4 = (us$R3 = us$registerPool.allocateRegister().load(Var1.isNull())).isLogicalOrDecided() ? us$R3 : us$R3.logicalOrOp(us$registerPool.allocateRegister().load(Var1).eqOp(""))).isLogicalOrDecided() ? us$R4 : us$R4.logicalOrOp(us$registerPool.allocateRegister().load(Var1).eqOp(" "))).getBooleanValueNullOk())
	    {
	    getSession().displayToMessageBox("Debe indicar el Proyecto.");
	    rejectOperation();
	    }
    } // beforeFind

    public void afterAdd()
	throws Exception
    {
	com.unify.nxj.mgr.datatypes.Register us$R6;
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NullableString xerr = NullableFactory.createNullableString("xerr");
	if (ProspectosDVW.isCurrentRecordStored())
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn5 = getConnection();
		java.sql.PreparedStatement us$stmt5 = null;
		ResultSet us$rs5 = null;
		try
		    {
		    us$stmt5 = us$conn5.prepareStatement("UPDATE xco_consecut SET xco_ult_numero = xco_ult_numero + 1 WHERE xco_empresa =  ?  AND xco_documento = \'PR\'");
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt5, 1);
		    if (us$stmt5.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
		xerr.assign(us$registerPool.allocateRegister().load("El consecutivo no fue actualizado." + getSession().getStatus()));
		getSession().displayToMessageBox(us$registerPool.allocateRegister().load(xerr).getStringValue());
		getSession().rollbackTransaction();
		getSession().queueCommand("PREVIOUS_FORM");
		}
	    if (((us$R6 = us$registerPool.allocateRegister().load(xpc_dias_pac).neqOp(0)).isLogicalOrDecided() ? us$R6 : us$R6.logicalOrOp(us$registerPool.allocateRegister().load(xpc_dias_pvt).neqOp(0))).getBooleanValueNullOk())
		{
		NullableDate f_pcontacto = NullableFactory.createNullableDate("f_pcontacto");
		if (us$registerPool.allocateRegister().load(vpy_tipo).eqOp("A").getBooleanValueNullOk())
		    f_pcontacto.assign(us$registerPool.allocateRegister().load(vpp_fecha_visita).plusOp(us$registerPool.allocateRegister().load(xpc_dias_pac)));
		else
		    f_pcontacto.assign(us$registerPool.allocateRegister().load(vpp_fecha_visita).plusOp(us$registerPool.allocateRegister().load(xpc_dias_pvt)));
		hora.assign(us$registerPool.allocateRegister().load(getSession().getCurrentTime()));

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn7 = getConnection();
		    java.sql.PreparedStatement us$stmt7 = null;
		    ResultSet us$rs7 = null;
		    try
			{
			us$stmt7 = us$conn7.prepareStatement("INSERT INTO vps_prosigue (vps_proyecto, vps_prospecto, vps_consecu, vps_fecha, vps_hora, vps_usuario, vps_mediocon, vps_estado, vps_califica, vps_f_pcontacto, vps_comentario1) VALUES ( ? ,  ? , 1,  ? ,  ? ,  ? , \'P\',  ? ,  ? ,  ? , \'PRIMERA VISITA A SALA DE VENTAS\')");
			vpp_proyecto.us$setSqlParameterValue(us$stmt7, 1);
			vpp_numero.us$setSqlParameterValue(us$stmt7, 2);
			vpp_fecha_visita.us$setSqlParameterValue(us$stmt7, 3);
			hora.us$setSqlParameterValue(us$stmt7, 4);
			((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario.us$setSqlParameterValue(us$stmt7, 5);
			vpp_estado.us$setSqlParameterValue(us$stmt7, 6);
			vpp_califica.us$setSqlParameterValue(us$stmt7, 7);
			f_pcontacto.us$setSqlParameterValue(us$stmt7, 8);
			if (us$stmt7.executeUpdate() == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
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
		    xerr.assign(us$registerPool.allocateRegister().load("No pudo insertar primer seguimiento." + getSession().getStatus()));
		    getSession().displayToMessageBox(us$registerPool.allocateRegister().load(xerr).getStringValue());
		    getSession().rollbackTransaction();
		    getSession().queueCommand("PREVIOUS_FORM");
		    }
		}
	    getSession().commitTransaction();
	    }
	else
	    {
	    getSession().displayToMessageBox("El prospecto no fue adicionado");
	    getSession().rollbackTransaction();
	    }
    } // afterAdd
    private ProspectosDVW ProspectosDVW = this;
    public NXJLabelControl Label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label1", false);
    public NXJLabelControl Label10 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label10", false);
    public NXJLabelControl Label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label11", false);
    public NXJLabelControl Label111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label111", false);
    public NXJLabelControl Label12 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label12", false);
    public NXJLabelControl Label13 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label13", false);
    public NXJLabelControl Label14 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label14", false);
    public NXJLabelControl Label15 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label15", false);
    public NXJLabelControl Label16 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label16", false);
    public NXJLabelControl Label17 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label17", false);
    public NXJLabelControl Label18 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label18", false);
    public NXJLabelControl Label19 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label19", false);
    public NXJLabelControl Label2 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label2", false);
    public NXJLabelControl Label20 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label20", false);
    public NXJLabelControl Label21 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label21", false);
    public NXJLabelControl Label22 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label22", false);
    public NXJLabelControl Label23 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label23", false);
    public NXJLabelControl Label24 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label24", false);
    public NXJLabelControl Label25 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label25", false);
    public NXJLabelControl Label26 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label26", false);
    public NXJLabelControl Label27 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label27", false);
    public NXJLabelControl Label28 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label28", false);
    public NXJLabelControl Label281 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label281", false);
    public NXJLabelControl Label29 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label29", false);
    public NXJLabelControl Label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label3", false);
    public NXJLabelControl Label30 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label30", false);
    public NXJLabelControl Label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label31", false);
    public NXJLabelControl Label32 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label32", false);
    public NXJLabelControl Label33 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label33", false);
    public NXJLabelControl Label34 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label34", false);
    public NXJLabelControl Label35 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label35", false);
    public NXJLabelControl Label36 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label36", false);
    public NXJLabelControl Label361 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label361", false);
    public NXJLabelControl Label3611 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label3611", false);
    public NXJLabelControl Label37 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label37", false);
    public NXJLabelControl Label38 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label38", false);
    public NXJLabelControl Label39 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label39", false);
    public NXJLabelControl Label4 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label4", false);
    public NXJLabelControl Label40 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label40", false);
    public NXJLabelControl Label41 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label41", false);
    public NXJLabelControl Label42 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label42", false);
    public NXJLabelControl Label44 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label44", false);
    public NXJLabelControl Label45 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label45", false);
    public NXJLabelControl Label46 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label46", false);
    public NXJLabelControl Label5 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label5", false);
    public NXJLabelControl Label6 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label6", false);
    public NXJLabelControl Label7 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label7", false);
    public NXJLabelControl Label8 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label8", false);
    public NXJLabelControl Label9 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label9", false);
    public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
    public NXJLabelControl label112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label112", false);
    public NXJLabelControl label1121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1121", false);
    public NXJLabelControl label11211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11211", false);
    public NXJLabelControl label47 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label47", false);
    public NXJLabelControl label471 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label471", false);
    public NXJLabelControl label472 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label472", false);
    public NXJLabelControl label4721 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label4721", false);
    public NXJLabelControl label473 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label473", false);
    public class line1
	extends ItemsForm.LineaRoja
    {

	public line1()
	{
	    super(Modulo.ProspectosDVW.this, "line1", false);
	} // <init>
    } // line1

    public line1 line1 = new line1();
    public class line12
	extends ItemsForm.LineaRoja
    {

	public line12()
	{
	    super(Modulo.ProspectosDVW.this, "line12", false);
	} // <init>
    } // line12

    public line12 line12 = new line12();
    public class line121
	extends ItemsForm.LineaRoja
    {

	public line121()
	{
	    super(Modulo.ProspectosDVW.this, "line121", false);
	} // <init>
    } // line121

    public line121 line121 = new line121();
    public NullableStringField vco_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vco_nombre", false, true, 100);
    public NullableStringField vmp_descripcion = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vmp_descripcion", false, true, 100);
    public class vpp_actilugar
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
		NXJDataConnection us$conn8 = getConnection();
		java.sql.PreparedStatement us$stmt8 = null;
		ResultSet us$rs8 = null;
		try
		    {
		    us$stmt8 = us$conn8.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_tipo = \'A\' OR vpy_tipo = \'V\' ORDER BY vpy_nombre");
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
			while (us$getter8.next())
			    {
			    ++us$rowsTouched8;
			    us$proj1 = us$getter8.getString(1);

				{
				if (us$rowCount++ == 200)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_actilugar()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_actilugar", true, true, 60);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(60);
	    us$setCandidateTargetColumnName("vpp_actilugar");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_actilugar

    public /*multi_valued*/ vpp_actilugar vpp_actilugar = new vpp_actilugar();
    public class vpp_actitiempo
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_actitiempo).eqOp("B").getBooleanValueNullOk())
		{
		vpp_actilugar.assign(us$registerPool.allocateRegister().load(" "));
		vpp_actilugar.setStopForInput(false);
		}
	    if (us$registerPool.allocateRegister().load(vpp_actitiempo).eqOp("A").getBooleanValueNullOk())
		{
		vpp_actilugar.setStopForInput(true);
		}
	} // onDataAccept

	public vpp_actitiempo()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_actitiempo", true, true, 2);
	    setStyleClass("dropdown_list");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_actitiempo");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setRequired(false);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setBackgroundColor("White");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_actitiempo

    public /*multi_valued*/ vpp_actitiempo vpp_actitiempo = new vpp_actitiempo();
    public /*multi_valued*/ NullableStringField vpp_actividad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_actividad", true, true, 2);
    public class vpp_califica
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    com.unify.nxj.mgr.datatypes.Register us$R19;
	    com.unify.nxj.mgr.datatypes.Register us$R18;
	    com.unify.nxj.mgr.datatypes.Register us$R17;
	    com.unify.nxj.mgr.datatypes.Register us$R16;
	    com.unify.nxj.mgr.datatypes.Register us$R15;
	    com.unify.nxj.mgr.datatypes.Register us$R14;
	    com.unify.nxj.mgr.datatypes.Register us$R13;
	    com.unify.nxj.mgr.datatypes.Register us$R12;
	    com.unify.nxj.mgr.datatypes.Register us$R11;
	    com.unify.nxj.mgr.datatypes.Register us$R10;
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn9 = getConnection();
		java.sql.PreparedStatement us$stmt9 = null;
		ResultSet us$rs9 = null;
		try
		    {
		    us$stmt9 = us$conn9.prepareStatement("SELECT xpc_nombre, xpc_califica, xpc_dias_pac, xpc_dias_pvt FROM xpc_proscalif WHERE xpc_codigo =  ?");
		    vpp_califica.us$setSqlParameterValue(us$stmt9, 1);
		    us$rs9 = us$stmt9.executeQuery();
		    int us$rowsTouched9 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd9 = us$rs9.getMetaData();
			if (us$rsmd9.getColumnCount() != 4)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd9.getColumnCount()), "4"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter9 = us$conn9.createDataIterator(us$rs9);
			if (us$getter9.next())
			    {
			    ++us$rowsTouched9;
			    us$getter9.assignValueToVariable(xpc_nombre, 1);
			    us$getter9.assignValueToVariable(xpc_califica, 2);
			    us$getter9.assignValueToVariable(xpc_dias_pac, 3);
			    us$getter9.assignValueToVariable(xpc_dias_pvt, 4);
			    }
			}
		    finally
			{
			if (us$rowsTouched9 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs9 != null)
			    us$rs9.close();
			}
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No existe la calificacion seleccionado en el maestro");
		rejectOperation();
		}
	    else
		{
		if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("I").getBooleanValueNullOk())
		    vpp_estado.assign(us$registerPool.allocateRegister().load("S"));
		else
		    if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("M").getBooleanValueNullOk())
			vpp_estado.assign(us$registerPool.allocateRegister().load("M"));
		    else
			if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("P").getBooleanValueNullOk())
			    vpp_estado.assign(us$registerPool.allocateRegister().load("N"));
		}
	    if (((us$R19 = (us$R18 = (us$R17 = (us$R16 = (us$R15 = (us$R14 = (us$R13 = (us$R12 = (us$R11 = (us$R10 = us$registerPool.allocateRegister().load(vpp_califica).eqOp("23")).isLogicalOrDecided() ? us$R10 : us$R10.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("24"))).isLogicalOrDecided() ? us$R11 : us$R11.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("25"))).isLogicalOrDecided() ? us$R12 : us$R12.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("26"))).isLogicalOrDecided() ? us$R13 : us$R13.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("27"))).isLogicalOrDecided() ? us$R14 : us$R14.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("28"))).isLogicalOrDecided() ? us$R15 : us$R15.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("29"))).isLogicalOrDecided() ? us$R16 : us$R16.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("30"))).isLogicalOrDecided() ? us$R17 : us$R17.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("31"))).isLogicalOrDecided() ? us$R18 : us$R18.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("32"))).isLogicalOrDecided() ? us$R19 : us$R19.logicalOrOp(us$registerPool.allocateRegister().load(vpp_califica).eqOp("33"))).getBooleanValueNullOk())
		{
		getSession().displayToMessageBox("No es una calificacion permitida.");
		rejectOperation();
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn20 = getConnection();
		java.sql.PreparedStatement us$stmt20 = null;
		ResultSet us$rs20 = null;
		try
		    {
		    us$stmt20 = us$conn20.prepareStatement("SELECT xpc_nombre, xpc_califica, xpc_dias_pac, xpc_dias_pvt FROM xpc_proscalif WHERE xpc_codigo =  ?");
		    vpp_califica.us$setSqlParameterValue(us$stmt20, 1);
		    us$rs20 = us$stmt20.executeQuery();
		    int us$rowsTouched20 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd20 = us$rs20.getMetaData();
			if (us$rsmd20.getColumnCount() != 4)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd20.getColumnCount()), "4"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter20 = us$conn20.createDataIterator(us$rs20);
			if (us$getter20.next())
			    {
			    ++us$rowsTouched20;
			    us$getter20.assignValueToVariable(xpc_nombre, 1);
			    us$getter20.assignValueToVariable(xpc_califica, 2);
			    us$getter20.assignValueToVariable(xpc_dias_pac, 3);
			    us$getter20.assignValueToVariable(xpc_dias_pvt, 4);
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
	} // whenValueChanges

	public vpp_califica()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_califica", true, true, 2);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_califica");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setZoomFormName("Modulo/GradoInteresFRM");
	    setZoomEnabled(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_califica

    public /*multi_valued*/ vpp_califica vpp_califica = new vpp_califica();
    public class vpp_ciudad
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
		NXJDataConnection us$conn21 = getConnection();
		java.sql.PreparedStatement us$stmt21 = null;
		ResultSet us$rs21 = null;
		try
		    {
		    us$stmt21 = us$conn21.prepareStatement("select xpa_nombre from xpa_paises");
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
			while (us$getter21.next())
			    {
			    ++us$rowsTouched21;
			    us$proj1 = us$getter21.getString(1);

				{
				if (us$rowCount++ == 300)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_ciudad()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_ciudad", true, true, 30);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(30);
	    us$setCandidateTargetColumnName("vpp_ciudad");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_ciudad

    public /*multi_valued*/ vpp_ciudad vpp_ciudad = new vpp_ciudad();
    public class vpp_corredor
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn22 = getConnection();
		java.sql.PreparedStatement us$stmt22 = null;
		ResultSet us$rs22 = null;
		try
		    {
		    us$stmt22 = us$conn22.prepareStatement("SELECT vco_nombre FROM vco_corredores WHERE vco_codigo =  ?");
		    vpp_corredor.us$setSqlParameterValue(us$stmt22, 1);
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
			    us$getter22.assignValueToVariable(vco_nombre, 1);
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("El corredor no esta registrado verifique.");
		rejectOperation();
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn23 = getConnection();
		java.sql.PreparedStatement us$stmt23 = null;
		ResultSet us$rs23 = null;
		try
		    {
		    us$stmt23 = us$conn23.prepareStatement("SELECT vco_nombre FROM vco_corredores WHERE vco_codigo =  ?");
		    vpp_corredor.us$setSqlParameterValue(us$stmt23, 1);
		    us$rs23 = us$stmt23.executeQuery();
		    int us$rowsTouched23 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd23 = us$rs23.getMetaData();
			if (us$rsmd23.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd23.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter23 = us$conn23.createDataIterator(us$rs23);
			if (us$getter23.next())
			    {
			    ++us$rowsTouched23;
			    us$getter23.assignValueToVariable(vco_nombre, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched23 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs23 != null)
			    us$rs23.close();
			}
		    }
		catch (SQLException us$ex23)
		    {
		    getSession().us$setStatus(us$conn23.mapToStatusCode(us$ex23));
		    throw us$ex23;
		    }
		catch (NXJDataConnectionException us$ex23)
		    {
		    getSession().us$setStatus(us$conn23.mapToStatusCode(us$ex23));
		    throw us$ex23;
		    }
		finally
		    {
		    if (us$stmt23 != null)
			us$conn23.us$closeStatement(us$stmt23);
		    }
		}
	} // whenValueChanges

	public vpp_corredor()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_corredor", true, true, 3);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(3);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_corredor");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setZoomFormName("Modulo/CorredoresFRM");
	    setZoomEnabled(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_corredor

    public /*multi_valued*/ vpp_corredor vpp_corredor = new vpp_corredor();
    public class vpp_correo
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (!vpp_correo.isNull())
		{
		String StrCorreo;
		StrCorreo = us$registerPool.allocateRegister().load(vpp_correo).getStringValue();
		if (StrCorreo.indexOf("@") < 0)
		    {
		    getSession().displayToMessageBox("El formato del correo no es correcto agregue el @");
		    rejectOperation();
		    }
		if (StrCorreo.indexOf(',') > 0)
		    {
		    getSession().displayToMessageBox("El formato del correo no es correcto elimine la ,");
		    rejectOperation();
		    }
		}
	} // onDataAccept

	public vpp_correo()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_correo", true, true, 40);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(40);
	    us$setCandidateTargetColumnName("vpp_correo");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_correo

    public /*multi_valued*/ vpp_correo vpp_correo = new vpp_correo();
    public class vpp_cuanta_correo2
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (!vpp_cuanta_correo2.isNull())
		{
		String StrCorreo;
		StrCorreo = us$registerPool.allocateRegister().load(vpp_cuanta_correo2).getStringValue();
		if (StrCorreo.indexOf("@") < 0)
		    {
		    getSession().displayToMessageBox("El formato del correo no es correcto agregue el @");
		    rejectOperation();
		    }
		if (StrCorreo.indexOf(',') > 0)
		    {
		    getSession().displayToMessageBox("El formato del correo no es correcto elimine la ,");
		    rejectOperation();
		    }
		}
	} // onDataAccept

	public vpp_cuanta_correo2()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_cuanta_correo2", true, true, 40);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(40);
	    us$setCandidateTargetColumnName("vpp_cuanta_correo2");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_cuanta_correo2

    public /*multi_valued*/ vpp_cuanta_correo2 vpp_cuanta_correo2 = new vpp_cuanta_correo2();
    public class vpp_direccion
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
		NXJDataConnection us$conn24 = getConnection();
		java.sql.PreparedStatement us$stmt24 = null;
		ResultSet us$rs24 = null;
		try
		    {
		    us$stmt24 = us$conn24.prepareStatement("select xzo_nombre from xzo_zonas");
		    us$rs24 = us$stmt24.executeQuery();
		    int us$rowsTouched24 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd24 = us$rs24.getMetaData();
			if (us$rsmd24.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd24.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter24 = us$conn24.createDataIterator(us$rs24);
			while (us$getter24.next())
			    {
			    ++us$rowsTouched24;
			    us$proj1 = us$getter24.getString(1);

				{
				if (us$rowCount++ == 300)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
			    }
			}
		    finally
			{
			if (us$rowsTouched24 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs24 != null)
			    us$rs24.close();
			}
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_direccion()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_direccion", true, true, 30);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(30);
	    us$setCandidateTargetColumnName("vpp_direccion");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_direccion

    public /*multi_valued*/ vpp_direccion vpp_direccion = new vpp_direccion();
    public /*multi_valued*/ NullableStringField vpp_distribu_ban = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_ban", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_distribu_emp = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_emp", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_distribu_est = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_est", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_distribu_rec = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_rec", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_distribu_saf = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_saf", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_distribu_ter = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_distribu_ter", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_edad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_edad", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_estado = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_estado", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_estado_civil = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_estado_civil", true, true, 2);
    public class vpp_estadopro
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void beforeField()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    estadopro_ant.assign(us$registerPool.allocateRegister().load(vpp_estadopro));
	} // beforeField

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_estadopro).neqOp(us$registerPool.allocateRegister().load(estadopro_ant)).getBooleanValueNullOk())
		{
		if (us$registerPool.allocateRegister().load(vpp_fechaestado).neqOp("B").getBooleanValueNullOk())
		    {
		    vpp_fechaestado.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
		    }
		else
		    {
		    getSession().displayToMessageBox("El nuevo estado NO puede ser asignado manualmente...");
		    vpp_estadopro.assign(us$registerPool.allocateRegister().load(estadopro_ant));
		    }
		}
	} // onDataAccept

	public vpp_estadopro()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_estadopro", true, true, 2);
	    setStyleClass("dropdown_list");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_estadopro");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    us$setMultiValuedOptions(false);
	    setFontSize("12");
	    us$executesCodeBeforeInput = true;
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_estadopro

    public /*multi_valued*/ vpp_estadopro vpp_estadopro = new vpp_estadopro();
    public class vpp_fecha
	extends com.unify.nxj.mgr.datatypes.NXJDateField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_fecha).gtOp(us$registerPool.allocateRegister().load(getSession().getCurrentDate())).getBooleanValueNullOk())
		{
		getSession().displayToMessageBox("La fecha de Registro NO puede ser mayor a la fecha del dia verifique...!");
		vpp_fecha.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
		rejectOperation();
		}
	} // onDataAccept

	public vpp_fecha()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_fecha", true, true, 100);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("date");
	    us$setCandidateTargetColumnName("vpp_fecha");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_fecha

    public /*multi_valued*/ vpp_fecha vpp_fecha = new vpp_fecha();
    public class vpp_fecha_nacio
	extends com.unify.nxj.mgr.datatypes.NXJDateField
    {
	NullableNumeric mayoredad = (NullableNumeric)NullableFactory.createNullableNumeric("mayoredad").assign(getSession().us$getRegisterPool().allocateRegister().load(6575));

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_fecha_nacio).gtOp(us$registerPool.allocateRegister().load(getSession().getCurrentDate()).minusOp(us$registerPool.allocateRegister().load(mayoredad))).getBooleanValueNullOk())
		{
		getSession().displayToMessageBox("El prospecto debe ser mayor de edad. Verifique por favor.");
		vpp_fecha_nacio.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()).minusOp(us$registerPool.allocateRegister().load(mayoredad)));
		rejectOperation();
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_fecha_nacio).gtOp(us$registerPool.allocateRegister().load(getSession().getCurrentDate()).minusOp(us$registerPool.allocateRegister().load(mayoredad))).getBooleanValueNullOk())
		{
		getSession().displayToMessageBox("El prospecto debe ser mayor de edad. Verifique por favor.");
		vpp_fecha_nacio.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()).minusOp(us$registerPool.allocateRegister().load(mayoredad)));
		rejectOperation();
		}
	} // whenValueChanges

	public vpp_fecha_nacio()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_fecha_nacio", true, true, 100);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("date");
	    us$setCandidateTargetColumnName("vpp_fecha_nacio");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_fecha_nacio

    public /*multi_valued*/ vpp_fecha_nacio vpp_fecha_nacio = new vpp_fecha_nacio();
    public class vpp_fecha_visita
	extends com.unify.nxj.mgr.datatypes.NXJDateField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_fecha_visita).gtOp(vpp_fecha).getBooleanValueNullOk())
		{
		getSession().displayToMessageBox("La fecha de visita NO puede ser mayor a la fecha de registro...!");
		vpp_fecha_visita.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
		rejectOperation();
		}
	} // onDataAccept

	public vpp_fecha_visita()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_fecha_visita", true, true, 100);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("date");
	    us$setCandidateTargetColumnName("vpp_fecha_visita");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_fecha_visita

    public /*multi_valued*/ vpp_fecha_visita vpp_fecha_visita = new vpp_fecha_visita();
    public /*multi_valued*/ NullableDateField vpp_fechaestado = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fechaestado", true, true, 100);
    public /*multi_valued*/ NullableStringField vpp_genero = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_genero", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_ingreso = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_ingreso", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_mediodes = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_mediodes", true, true, 30);
    public class vpp_mediopub
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn25 = getConnection();
		java.sql.PreparedStatement us$stmt25 = null;
		ResultSet us$rs25 = null;
		try
		    {
		    us$stmt25 = us$conn25.prepareStatement("SELECT vmp_descripcion FROM vmp_mediosp WHERE vmp_codigo =  ?");
		    vpp_mediopub.us$setSqlParameterValue(us$stmt25, 1);
		    us$rs25 = us$stmt25.executeQuery();
		    int us$rowsTouched25 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd25 = us$rs25.getMetaData();
			if (us$rsmd25.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd25.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter25 = us$conn25.createDataIterator(us$rs25);
			if (us$getter25.next())
			    {
			    ++us$rowsTouched25;
			    us$getter25.assignValueToVariable(vmp_descripcion, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched25 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs25 != null)
			    us$rs25.close();
			}
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No existe el medio seleccionado en el maestro de medios");
		rejectOperation();
		}
	    if (us$registerPool.allocateRegister().load(vpp_mediopub).neqOp("OT").getBooleanValueNullOk())
		vpp_mediodes.setStopForInput(false);
	    else
		vpp_mediodes.setStopForInput(true);
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn26 = getConnection();
		java.sql.PreparedStatement us$stmt26 = null;
		ResultSet us$rs26 = null;
		try
		    {
		    us$stmt26 = us$conn26.prepareStatement("SELECT vmp_descripcion FROM vmp_mediosp WHERE vmp_codigo =  ?");
		    vpp_mediopub.us$setSqlParameterValue(us$stmt26, 1);
		    us$rs26 = us$stmt26.executeQuery();
		    int us$rowsTouched26 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd26 = us$rs26.getMetaData();
			if (us$rsmd26.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd26.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter26 = us$conn26.createDataIterator(us$rs26);
			if (us$getter26.next())
			    {
			    ++us$rowsTouched26;
			    us$getter26.assignValueToVariable(vmp_descripcion, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched26 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs26 != null)
			    us$rs26.close();
			}
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
	} // whenValueChanges

	public vpp_mediopub()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_mediopub", true, true, 2);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_mediopub");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setZoomFormName("Modulo/MediospFRM");
	    setZoomEnabled(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_mediopub

    public /*multi_valued*/ vpp_mediopub vpp_mediopub = new vpp_mediopub();
    public class vpp_nacionalidad
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
		NXJDataConnection us$conn27 = getConnection();
		java.sql.PreparedStatement us$stmt27 = null;
		ResultSet us$rs27 = null;
		try
		    {
		    us$stmt27 = us$conn27.prepareStatement("select xpa_nombre from xpa_paises");
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
			while (us$getter27.next())
			    {
			    ++us$rowsTouched27;
			    us$proj1 = us$getter27.getString(1);

				{
				if (us$rowCount++ == 300)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_nacionalidad()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_nacionalidad", true, true, 30);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(30);
	    us$setCandidateTargetColumnName("vpp_nacionalidad");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_nacionalidad

    public /*multi_valued*/ vpp_nacionalidad vpp_nacionalidad = new vpp_nacionalidad();
    public /*multi_valued*/ NullableStringField vpp_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_nombre", true, true, 40);
    public /*multi_valued*/ NullableStringField vpp_nombre2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_nombre2", true, true, 40);
    public /*multi_valued*/ NullableNumericField vpp_numero = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "vpp_numero", true, true, 11);
    public /*multi_valued*/ NullableStringField vpp_otro_proyecto = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_otro_proyecto", true, true, 50);
    public /*multi_valued*/ NullableAmountField vpp_pagomes = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vpp_pagomes", true, true, 25);
    public /*multi_valued*/ NullableStringField vpp_pasatiempo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_pasatiempo", true, true, 2);
    public class vpp_proyecto
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn28 = getConnection();
		java.sql.PreparedStatement us$stmt28 = null;
		ResultSet us$rs28 = null;
		try
		    {
		    us$stmt28 = us$conn28.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?");
		    vpp_proyecto.us$setSqlParameterValue(us$stmt28, 1);
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt28, 2);
		    us$rs28 = us$stmt28.executeQuery();
		    int us$rowsTouched28 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd28 = us$rs28.getMetaData();
			if (us$rsmd28.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd28.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter28 = us$conn28.createDataIterator(us$rs28);
			if (us$getter28.next())
			    {
			    ++us$rowsTouched28;
			    us$getter28.assignValueToVariable(vpy_nombre, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched28 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs28 != null)
			    us$rs28.close();
			}
		    }
		catch (SQLException us$ex28)
		    {
		    getSession().us$setStatus(us$conn28.mapToStatusCode(us$ex28));
		    throw us$ex28;
		    }
		catch (NXJDataConnectionException us$ex28)
		    {
		    getSession().us$setStatus(us$conn28.mapToStatusCode(us$ex28));
		    throw us$ex28;
		    }
		finally
		    {
		    if (us$stmt28 != null)
			us$conn28.us$closeStatement(us$stmt28);
		    }
		}
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No existe el proyecto seleccionado en el maestro de proyectos");
		vpp_proyecto.assign(us$registerPool.allocateRegister().load(" "));
		rejectOperation();
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn29 = getConnection();
		java.sql.PreparedStatement us$stmt29 = null;
		ResultSet us$rs29 = null;
		try
		    {
		    us$stmt29 = us$conn29.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?");
		    vpp_proyecto.us$setSqlParameterValue(us$stmt29, 1);
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt29, 2);
		    us$rs29 = us$stmt29.executeQuery();
		    int us$rowsTouched29 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd29 = us$rs29.getMetaData();
			if (us$rsmd29.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd29.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter29 = us$conn29.createDataIterator(us$rs29);
			if (us$getter29.next())
			    {
			    ++us$rowsTouched29;
			    us$getter29.assignValueToVariable(vpy_nombre, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched29 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs29 != null)
			    us$rs29.close();
			}
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
	} // whenValueChanges

	public vpp_proyecto()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_proyecto", true, true, 2);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_proyecto");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setZoomFormName("Modulo/ProyectosFRM");
	    setZoomEnabled(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_proyecto

    public /*multi_valued*/ vpp_proyecto vpp_proyecto = new vpp_proyecto();
    public /*multi_valued*/ NullableStringField vpp_referido_celular = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_celular", true, true, 20);
    public class vpp_referido_correo
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    String StrCorreo;
	    StrCorreo = us$registerPool.allocateRegister().load(vpp_referido_correo).getStringValue();
	    if (StrCorreo.indexOf("@") < 0)
		{
		getSession().displayToMessageBox("El formato del correo no es correcto agregue el @");
		rejectOperation();
		}
	    if (StrCorreo.indexOf(',') > 0)
		{
		getSession().displayToMessageBox("El formato del correo no es correcto elimine la ,");
		rejectOperation();
		}
	} // onDataAccept

	public vpp_referido_correo()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_referido_correo", true, true, 40);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(40);
	    us$setCandidateTargetColumnName("vpp_referido_correo");
	    setValueRetrievedDuringFetch(true);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_referido_correo

    public /*multi_valued*/ vpp_referido_correo vpp_referido_correo = new vpp_referido_correo();
    public /*multi_valued*/ NullableStringField vpp_referido_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_nombre", true, true, 80);
    public class vpp_referido_sn
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(vpp_referido_sn).eqOp("N").getBooleanValueNullOk())
		{
		vpp_referido_nombre.assign(us$registerPool.allocateRegister().load(" "));
		vpp_referido_telefono.assign(us$registerPool.allocateRegister().load(" "));
		vpp_referido_celular.assign(us$registerPool.allocateRegister().load(" "));
		vpp_referido_correo.assign(us$registerPool.allocateRegister().load(" "));
		vpp_referido_nombre.setStopForInput(false);
		vpp_referido_telefono.setStopForInput(false);
		vpp_referido_celular.setStopForInput(false);
		vpp_referido_correo.setStopForInput(false);
		}
	    if (us$registerPool.allocateRegister().load(vpp_referido_sn).eqOp("S").getBooleanValueNullOk())
		{
		vpp_referido_nombre.setStopForInput(true);
		vpp_referido_telefono.setStopForInput(true);
		vpp_referido_celular.setStopForInput(true);
		vpp_referido_correo.setStopForInput(true);
		}
	} // onDataAccept

	public vpp_referido_sn()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_referido_sn", true, true, 2);
	    setStyleClass("dropdown_list");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(2);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_referido_sn");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_referido_sn

    public /*multi_valued*/ vpp_referido_sn vpp_referido_sn = new vpp_referido_sn();
    public /*multi_valued*/ NullableStringField vpp_referido_telefono = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_telefono", true, true, 20);
    public /*multi_valued*/ NullableStringField vpp_tcompra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_tcompra", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_telofi = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telofi", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_telres = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telres", true, true, 30);
    public class vpp_vendedor
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn30 = getConnection();
		java.sql.PreparedStatement us$stmt30 = null;
		ResultSet us$rs30 = null;
		try
		    {
		    us$stmt30 = us$conn30.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
		    vpp_vendedor.us$setSqlParameterValue(us$stmt30, 1);
		    us$rs30 = us$stmt30.executeQuery();
		    int us$rowsTouched30 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd30 = us$rs30.getMetaData();
			if (us$rsmd30.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd30.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter30 = us$conn30.createDataIterator(us$rs30);
			if (us$getter30.next())
			    {
			    ++us$rowsTouched30;
			    us$getter30.assignValueToVariable(vve_nombre, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched30 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs30 != null)
			    us$rs30.close();
			}
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No existe el vendedor seleccionado en el maestro de vendedores");
		rejectOperation();
		}

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn31 = getConnection();
		java.sql.PreparedStatement us$stmt31 = null;
		ResultSet us$rs31 = null;
		try
		    {
		    us$stmt31 = us$conn31.prepareStatement("SELECT vvh_vendedora,vvh_fret_obra, vvh_fing_obra from vvh_venobras where vvh_empresa =  ?  and vvh_proyecto =  ?  and vvh_vendedora =  ?  order by vvh_fing_obra DESC");
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt31, 1);
		    vpp_proyecto.us$setSqlParameterValue(us$stmt31, 2);
		    vpp_vendedor.us$setSqlParameterValue(us$stmt31, 3);
		    us$rs31 = us$stmt31.executeQuery();
		    int us$rowsTouched31 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd31 = us$rs31.getMetaData();
			if (us$rsmd31.getColumnCount() != 3)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd31.getColumnCount()), "3"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter31 = us$conn31.createDataIterator(us$rs31);
			if (us$getter31.next())
			    {
			    ++us$rowsTouched31;
			    us$getter31.assignValueToVariable(vendedora, 1);
			    us$getter31.assignValueToVariable(fret_obra, 2);
			    us$getter31.assignValueToVariable(fing_obra, 3);
			    }
			}
		    finally
			{
			if (us$rowsTouched31 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs31 != null)
			    us$rs31.close();
			}
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("El/La vendedor/a no pertenece al proyecto en cuestion.");
		rejectOperation();
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn32 = getConnection();
		java.sql.PreparedStatement us$stmt32 = null;
		ResultSet us$rs32 = null;
		try
		    {
		    us$stmt32 = us$conn32.prepareStatement("SELECT vco_nombre FROM vco_corredores WHERE vco_codigo =  ?");
		    vpp_corredor.us$setSqlParameterValue(us$stmt32, 1);
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
			    us$getter32.assignValueToVariable(vco_nombre, 1);
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
	} // whenValueChanges

	public vpp_vendedor()
	{
	    super(Modulo.ProspectosDVW.this, "vpp_vendedor", true, true, 3);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(3);
	    setAutoAccept(true);
	    us$setCandidateTargetColumnName("vpp_vendedor");
	    setValueRetrievedDuringFetch(true);
	    setRequired(true);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setZoomFormName("Modulo/VendedoresFRM");
	    setZoomEnabled(true);
	    setZoomActiveMode(NXJCommand.ActiveMode_BOTH);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_vendedor

    public /*multi_valued*/ vpp_vendedor vpp_vendedor = new vpp_vendedor();
    public /*multi_valued*/ NullableStringField vpp_viviactual = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_viviactual", true, true, 2);
    public /*multi_valued*/ NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", true, true, 100);
    public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
    public NullableStringField xpc_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_nombre", false, true, 100);
    public class cajaabajoRegistroP
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.ProspectosDVW.cajaabajoRegistroP.this, "image1", false);
	    } // <init>
	} // image1

	public image1 image1 = new image1();

	public cajaabajoRegistroP(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajaabajoRegistroP", enclosingContainer);
	    us$setBackgroundColor("#e30000");
	} // <init>
    } // cajaabajoRegistroP

    public final cajaabajoRegistroP cajaabajoRegistroP = new cajaabajoRegistroP(this);
    public class cajaarribaRProspectos
	extends com.unify.nxj.mgr.NXJBox
    {
	public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	public class label1
	    extends ItemsForm.TituloLBL
	{

	    public label1()
	    {
		super(Modulo.ProspectosDVW.cajaarribaRProspectos.this, "label1", false);
	    } // <init>
	} // label1

	public label1 label1 = new label1();

	public cajaarribaRProspectos(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajaarribaRProspectos", enclosingContainer);
	    us$setBackgroundColor("#e30000");
	    cajaarribaRProspectospropertySetter_0();
	} // <init>

	private void cajaarribaRProspectospropertySetter_0()
	{
	    actualempresa.setStyleClass("textfield");
	    actualempresa.us$setMultiValued(false);
	    actualempresa.us$setView("text");
	    actualempresa.setFindable(false);
	    actualempresa.setUpdateable(false);
	    actualempresa.setStopForInput(false);
	    actualusuario.setStyleClass("textfield");
	    actualusuario.us$setView("text");
	    actualusuario.setFindable(false);
	    actualusuario.setUpdateable(false);
	    actualusuario.setStopForInput(false);
	} // cajaarribaRProspectospropertySetter_0
    } // cajaarribaRProspectos

    public final cajaarribaRProspectos cajaarribaRProspectos = new cajaarribaRProspectos(this);

    public ProspectosDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vpp_prospectos");
	setAutoFind(false);
	setStartInAddMode(true);
	setSqlOrderByClause("vpp_proyecto, vpp_numero");
	us$setBackgroundColor("#cccccc");
	vpp_califica.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	{

	    public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		throws Exception
	    {
		if (values.length != 1)
		    throw new Exception("TODO: handle value array size mismatch");
		vpp_califica.us$assignZoomValue(values[0]);
	    } // assignValues
	});
	vpp_corredor.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	{

	    public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		throws Exception
	    {
		if (values.length != 1)
		    throw new Exception("TODO: handle value array size mismatch");
		vpp_corredor.us$assignZoomValue(values[0]);
	    } // assignValues
	});
	vpp_mediopub.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	{

	    public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		throws Exception
	    {
		if (values.length != 1)
		    throw new Exception("TODO: handle value array size mismatch");
		vpp_mediopub.us$assignZoomValue(values[0]);
	    } // assignValues
	});
	vpp_proyecto.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	{

	    public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		throws Exception
	    {
		if (values.length != 1)
		    throw new Exception("TODO: handle value array size mismatch");
		vpp_proyecto.us$assignZoomValue(values[0]);
	    } // assignValues
	});
	vpp_vendedor.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	{

	    public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		throws Exception
	    {
		if (values.length != 1)
		    throw new Exception("TODO: handle value array size mismatch");
		vpp_vendedor.us$assignZoomValue(values[0]);
	    } // assignValues
	});
	Label1.setStyleClass("label");
	Label1.setForegroundColor("Black");
	Label1.setFontSize("12");
	Label10.setStyleClass("label");
	Label10.setForegroundColor("Black");
	Label10.setFontSize("12");
	Label11.setStyleClass("label");
	Label11.setForegroundColor("Black");
	Label11.setFontSize("10");
	Label111.setStyleClass("label");
	Label111.setForegroundColor("Black");
	Label111.setFontSize("12");
	Label12.setStyleClass("label");
	Label12.setForegroundColor("Black");
	Label12.setFontSize("12");
	Label13.setStyleClass("label");
	Label13.setForegroundColor("Black");
	Label13.setFontSize("12");
	Label14.setStyleClass("label");
	Label14.setForegroundColor("Black");
	Label14.setFontSize("12");
	Label15.setStyleClass("label");
	Label15.setForegroundColor("Black");
	Label15.setFontSize("12");
	Label16.setStyleClass("label");
	Label16.setForegroundColor("Black");
	Label16.setFontSize("12");
	Label17.setStyleClass("label");
	Label17.setForegroundColor("Black");
	Label17.setFontSize("12");
	Label18.setStyleClass("label");
	Label18.setForegroundColor("Black");
	Label18.setFontSize("12");
	Label19.setStyleClass("label");
	Label19.setForegroundColor("Black");
	Label19.setFontSize("12");
	Label2.setStyleClass("label");
	Label2.setForegroundColor("Black");
	Label2.setFontSize("12");
	Label20.setStyleClass("label");
	Label20.setForegroundColor("Black");
	Label20.setFontSize("12");
	Label21.setStyleClass("label");
	Label21.setForegroundColor("Black");
	Label21.setFontSize("12");
	Label22.setStyleClass("label");
	Label22.setForegroundColor("Black");
	Label22.setFontSize("12");
	Label23.setStyleClass("label");
	Label23.setForegroundColor("Black");
	Label23.setFontSize("12");
	Label24.setStyleClass("label");
	Label24.setForegroundColor("Black");
	Label24.setFontSize("12");
	Label25.setStyleClass("label");
	Label25.setForegroundColor("Black");
	Label25.setFontSize("12");
	Label26.setStyleClass("label");
	Label26.setForegroundColor("Black");
	Label26.setFontSize("12");
	Label27.setStyleClass("label");
	Label27.setForegroundColor("Black");
	Label27.setFontSize("12");
	Label28.setStyleClass("label");
	Label28.setForegroundColor("Black");
	Label28.setFontSize("12");
	Label281.setStyleClass("label");
	Label281.setForegroundColor("Black");
	Label281.setFontSize("12");
	Label29.setStyleClass("label");
	Label29.setForegroundColor("Black");
	Label29.setFontSize("12");
	Label3.setStyleClass("label");
	Label3.setForegroundColor("Black");
	Label3.setFontSize("12");
	Label30.setStyleClass("label");
	Label30.setForegroundColor("Black");
	Label30.setFontSize("12");
	Label31.setStyleClass("label");
	Label31.setForegroundColor("Black");
	Label31.setFontSize("12");
	Label32.setStyleClass("label");
	Label32.setForegroundColor("Black");
	Label32.setFontSize("12");
	Label33.setStyleClass("label");
	Label33.setForegroundColor("Black");
	Label33.setFontSize("12");
	Label34.setStyleClass("label");
	Label34.setForegroundColor("Black");
	Label34.setFontSize("12");
	Label35.setStyleClass("label");
	Label35.setForegroundColor("Black");
	Label35.setFontSize("12");
	Label36.setStyleClass("label");
	Label36.setForegroundColor("Black");
	Label36.setFontSize("12");
	Label361.setStyleClass("label");
	Label361.setForegroundColor("Black");
	Label361.setFontSize("12");
	Label3611.setStyleClass("label");
	Label3611.setForegroundColor("Black");
	Label3611.setFontSize("12");
	Label37.setStyleClass("label");
	Label37.setForegroundColor("Black");
	Label37.setFontSize("12");
	Label38.setStyleClass("label");
	Label38.setForegroundColor("Black");
	Label38.setFontSize("12");
	Label39.setStyleClass("label");
	Label39.setForegroundColor("Black");
	Label39.setFontSize("12");
	Label4.setStyleClass("label");
	Label4.setForegroundColor("Black");
	Label4.setFontSize("12");
	Label40.setStyleClass("label");
	Label40.setForegroundColor("Black");
	Label40.setFontSize("12");
	Label41.setStyleClass("label");
	Label41.setForegroundColor("Black");
	Label41.setFontSize("12");
	Label42.setStyleClass("label");
	Label42.setForegroundColor("Black");
	Label42.setFontSize("12");
	Label44.setStyleClass("label");
	Label44.setForegroundColor("Black");
	Label44.setFontSize("12");
	Label45.setStyleClass("label");
	Label45.setForegroundColor("Black");
	Label45.setFontSize("12");
	Label46.setStyleClass("label");
	Label46.setForegroundColor("Black");
	Label46.setFontSize("12");
	Label5.setStyleClass("label");
	Label5.setForegroundColor("Black");
	Label5.setFontSize("12");
	Label6.setStyleClass("label");
	Label6.setForegroundColor("Black");
	Label6.setFontSize("12");
	Label7.setStyleClass("label");
	Label7.setForegroundColor("Black");
	Label7.setFontSize("12");
	Label8.setStyleClass("label");
	Label8.setForegroundColor("Black");
	Label8.setFontSize("12");
	Label9.setStyleClass("label");
	Label9.setForegroundColor("Black");
	Label9.setFontSize("12");
	label11.setStyleClass("label");
	label11.setForegroundColor("Black");
	label11.setFontFamily("Verdana");
	label11.setFontSize("14");
	label11.us$setFontWeight("bold");
	label112.setStyleClass("label");
	label112.setForegroundColor("Black");
	label112.setFontFamily("Verdana");
	label112.setFontSize("14");
	label112.us$setFontWeight("bold");
	label1121.setStyleClass("label");
	label1121.setForegroundColor("Black");
	label1121.setFontFamily("Verdana");
	label1121.setFontSize("14");
	label1121.us$setFontWeight("bold");
	label11211.setStyleClass("label");
	label11211.setForegroundColor("Black");
	label11211.setFontFamily("Verdana");
	label11211.setFontSize("14");
	label11211.us$setFontWeight("bold");
	label47.setStyleClass("label");
	label47.setFontFamily("KaiTi");
	label47.setFontSize("14");
	label471.setStyleClass("label");
	label471.setFontFamily("KaiTi");
	label471.setFontSize("14");
	label472.setStyleClass("label");
	label472.setFontFamily("KaiTi");
	label472.setFontSize("14");
	label4721.setStyleClass("label");
	label4721.setFontFamily("KaiTi");
	label4721.setFontSize("14");
	label473.setStyleClass("label");
	label473.setFontFamily("KaiTi");
	label473.setFontSize("14");
	vco_nombre.setStyleClass("textfield");
	vco_nombre.us$setView("text");
	vco_nombre.setFindable(false);
	vco_nombre.setUpdateable(false);
	vco_nombre.setStopForInput(false);
	vco_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vco_nombre.setForegroundColor("Black");
	vco_nombre.setFontSize("12");
	vmp_descripcion.setStyleClass("textfield");
	vmp_descripcion.us$setView("text");
	vmp_descripcion.setFindable(true);
	vmp_descripcion.setUpdateable(false);
	vmp_descripcion.setStopForInput(false);
	vmp_descripcion.setCaseConversion(NullableField.CaseConversion_UPPER);
	vmp_descripcion.setForegroundColor("Black");
	vmp_descripcion.setFontSize("12");
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
	vpp_distribu_ban.setStyleClass("dropdown_list");
	vpp_distribu_ban.us$setMultiValued(true);
	vpp_distribu_ban.us$setView("select");
	vpp_distribu_ban.us$setFieldLength(2);
	vpp_distribu_ban.setAutoAccept(true);
	vpp_distribu_ban.us$setCandidateTargetColumnName("vpp_distribu_ban");
	vpp_distribu_ban.setValueRetrievedDuringFetch(true);
	vpp_distribu_ban.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_ban.setFindable(true);
	vpp_distribu_ban.setUpdateable(true);
	vpp_distribu_ban.setForegroundColor("Black");
	vpp_distribu_ban.setFontSize("12");
	vpp_distribu_emp.setStyleClass("dropdown_list");
	vpp_distribu_emp.us$setMultiValued(true);
	vpp_distribu_emp.us$setView("select");
	vpp_distribu_emp.us$setFieldLength(2);
	vpp_distribu_emp.setAutoAccept(true);
	vpp_distribu_emp.us$setCandidateTargetColumnName("vpp_distribu_emp");
	vpp_distribu_emp.setValueRetrievedDuringFetch(true);
	vpp_distribu_emp.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_emp.setFindable(true);
	vpp_distribu_emp.setUpdateable(true);
	vpp_distribu_emp.setForegroundColor("Black");
	vpp_distribu_emp.setFontSize("12");
	vpp_distribu_est.setStyleClass("dropdown_list");
	vpp_distribu_est.us$setMultiValued(true);
	vpp_distribu_est.us$setView("select");
	vpp_distribu_est.us$setFieldLength(2);
	vpp_distribu_est.setAutoAccept(true);
	vpp_distribu_est.us$setCandidateTargetColumnName("vpp_distribu_est");
	vpp_distribu_est.setValueRetrievedDuringFetch(true);
	vpp_distribu_est.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_est.setFindable(true);
	vpp_distribu_est.setUpdateable(true);
	vpp_distribu_est.setForegroundColor("Black");
	vpp_distribu_est.setFontSize("12");
	vpp_distribu_rec.setStyleClass("dropdown_list");
	vpp_distribu_rec.us$setMultiValued(true);
	vpp_distribu_rec.us$setView("select");
	vpp_distribu_rec.us$setFieldLength(2);
	vpp_distribu_rec.setAutoAccept(true);
	vpp_distribu_rec.us$setCandidateTargetColumnName("vpp_distribu_rec");
	vpp_distribu_rec.setValueRetrievedDuringFetch(true);
	vpp_distribu_rec.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_rec.setFindable(true);
	vpp_distribu_rec.setUpdateable(true);
	vpp_distribu_rec.setForegroundColor("Black");
	vpp_distribu_rec.setFontSize("12");
	vpp_distribu_saf.setStyleClass("dropdown_list");
	vpp_distribu_saf.us$setMultiValued(true);
	vpp_distribu_saf.us$setView("select");
	vpp_distribu_saf.us$setFieldLength(2);
	vpp_distribu_saf.setAutoAccept(true);
	vpp_distribu_saf.us$setCandidateTargetColumnName("vpp_distribu_saf");
	vpp_distribu_saf.setValueRetrievedDuringFetch(true);
	vpp_distribu_saf.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_saf.setFindable(true);
	vpp_distribu_saf.setUpdateable(true);
	vpp_distribu_saf.setForegroundColor("Black");
	vpp_distribu_saf.setFontSize("12");
	vpp_distribu_ter.setVisible(true);
	vpp_distribu_ter.setStyleClass("dropdown_list");
	vpp_distribu_ter.us$setMultiValued(true);
	vpp_distribu_ter.us$setView("select");
	vpp_distribu_ter.us$setFieldLength(2);
	vpp_distribu_ter.setAutoAccept(true);
	vpp_distribu_ter.us$setCandidateTargetColumnName("vpp_distribu_ter");
	vpp_distribu_ter.setValueRetrievedDuringFetch(true);
	vpp_distribu_ter.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_distribu_ter.setFindable(true);
	vpp_distribu_ter.setUpdateable(true);
	vpp_distribu_ter.setForegroundColor("Black");
	vpp_distribu_ter.setFontSize("12");
	vpp_edad.setVisible(true);
	vpp_edad.setStyleClass("dropdown_list");
	vpp_edad.us$setMultiValued(true);
	vpp_edad.us$setView("select");
	vpp_edad.us$setFieldLength(2);
	vpp_edad.setAutoAccept(true);
	vpp_edad.us$setCandidateTargetColumnName("vpp_edad");
	vpp_edad.setValueRetrievedDuringFetch(true);
	vpp_edad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_edad.setFindable(true);
	vpp_edad.setUpdateable(true);
	vpp_edad.setForegroundColor("Black");
	vpp_edad.setFontSize("12");
	vpp_estado.setStyleClass("dropdown_list");
	vpp_estado.us$setMultiValued(true);
	vpp_estado.us$setView("select");
	vpp_estado.us$setFieldLength(2);
	vpp_estado.setAutoAccept(true);
	vpp_estado.us$setCandidateTargetColumnName("vpp_estado");
	vpp_estado.setValueRetrievedDuringFetch(true);
	vpp_estado.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_estado.setFindable(true);
	vpp_estado.setUpdateable(true);
	vpp_estado.setStopForInput(false);
	vpp_estado.setForegroundColor("Black");
	vpp_estado.setFontSize("12");
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
	vpp_fechaestado.setStyleClass("textfield");
	vpp_fechaestado.us$setMultiValued(true);
	vpp_fechaestado.us$setView("date");
	vpp_fechaestado.us$setCandidateTargetColumnName("vpp_fechaestado");
	vpp_fechaestado.setValueRetrievedDuringFetch(true);
	vpp_fechaestado.setRequired(true);
	vpp_fechaestado.setFindable(true);
	vpp_fechaestado.setUpdateable(true);
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
	vpp_ingreso.setStyleClass("dropdown_list");
	vpp_ingreso.us$setMultiValued(true);
	vpp_ingreso.us$setView("select");
	vpp_ingreso.us$setFieldLength(2);
	vpp_ingreso.setAutoAccept(true);
	vpp_ingreso.us$setCandidateTargetColumnName("vpp_ingreso");
	vpp_ingreso.setValueRetrievedDuringFetch(true);
	vpp_ingreso.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_ingreso.setFindable(true);
	vpp_ingreso.setUpdateable(true);
	vpp_ingreso.setForegroundColor("Black");
	vpp_ingreso.setFontSize("12");
	vpp_mediodes.setStyleClass("textfield");
	vpp_mediodes.us$setMultiValued(true);
	vpp_mediodes.us$setView("text");
	vpp_mediodes.us$setFieldLength(30);
	vpp_mediodes.us$setCandidateTargetColumnName("vpp_mediodes");
	vpp_mediodes.setValueRetrievedDuringFetch(true);
	vpp_mediodes.setRequired(true);
	vpp_mediodes.setFindable(true);
	vpp_mediodes.setUpdateable(true);
	vpp_mediodes.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_mediodes.setForegroundColor("Black");
	vpp_mediodes.setFontSize("12");
	vpp_nombre.setStyleClass("textfield");
	vpp_nombre.us$setMultiValued(true);
	vpp_nombre.us$setView("text");
	vpp_nombre.us$setFieldLength(40);
	vpp_nombre.us$setCandidateTargetColumnName("vpp_nombre");
	vpp_nombre.setValueRetrievedDuringFetch(true);
	vpp_nombre.setRequired(true);
	vpp_nombre.setFindable(true);
	vpp_nombre.setUpdateable(true);
	vpp_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_nombre.setForegroundColor("Black");
	vpp_nombre.setFontSize("12");
	vpp_nombre2.setStyleClass("textfield");
	vpp_nombre2.us$setMultiValued(true);
	vpp_nombre2.us$setView("text");
	vpp_nombre2.us$setFieldLength(40);
	vpp_nombre2.us$setCandidateTargetColumnName("vpp_nombre2");
	vpp_nombre2.setValueRetrievedDuringFetch(true);
	vpp_nombre2.setFindable(true);
	vpp_nombre2.setUpdateable(true);
	vpp_nombre2.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_nombre2.setForegroundColor("Black");
	vpp_nombre2.setFontSize("12");
	vpp_numero.setStyleClass("textfield");
	vpp_numero.us$setMultiValued(true);
	vpp_numero.us$setView("text");
	vpp_numero.us$setFieldLength(11);
	vpp_numero.us$setCandidateTargetColumnName("vpp_numero");
	vpp_numero.setValueRetrievedDuringFetch(true);
	vpp_numero.setRequired(true);
	vpp_numero.setFindable(true);
	vpp_numero.setUpdateable(true);
	vpp_numero.setFontSize("12");
	vpp_otro_proyecto.setStyleClass("textfield");
	vpp_otro_proyecto.us$setMultiValued(true);
	vpp_otro_proyecto.us$setView("text");
	vpp_otro_proyecto.us$setFieldLength(50);
	vpp_otro_proyecto.us$setCandidateTargetColumnName("vpp_otro_proyecto");
	vpp_otro_proyecto.setValueRetrievedDuringFetch(true);
	vpp_otro_proyecto.setFindable(true);
	vpp_otro_proyecto.setUpdateable(true);
	vpp_otro_proyecto.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_otro_proyecto.setForegroundColor("Black");
	vpp_otro_proyecto.setFontSize("12");
	vpp_pagomes.setStyleClass("textfield");
	vpp_pagomes.us$setMultiValued(true);
	vpp_pagomes.us$setView("text");
	vpp_pagomes.us$setFieldLength(25);
	vpp_pagomes.us$setCandidateTargetColumnName("vpp_pagomes");
	vpp_pagomes.setValueRetrievedDuringFetch(true);
	vpp_pagomes.setFindable(true);
	vpp_pagomes.setUpdateable(true);
	vpp_pagomes.setDisplayJustify(NullableField.DisplayJustify_LEFT);
	vpp_pagomes.setForegroundColor("Black");
	vpp_pagomes.setFontSize("12");
	vpp_pasatiempo.setStyleClass("dropdown_list");
	vpp_pasatiempo.us$setMultiValued(true);
	vpp_pasatiempo.us$setView("select");
	vpp_pasatiempo.us$setFieldLength(2);
	vpp_pasatiempo.setAutoAccept(true);
	vpp_pasatiempo.us$setCandidateTargetColumnName("vpp_pasatiempo");
	vpp_pasatiempo.setValueRetrievedDuringFetch(true);
	vpp_pasatiempo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_pasatiempo.setFindable(true);
	vpp_pasatiempo.setUpdateable(true);
	vpp_pasatiempo.setForegroundColor("Black");
	vpp_pasatiempo.setFontSize("12");
	vpp_referido_celular.setStyleClass("textfield");
	vpp_referido_celular.us$setMultiValued(true);
	vpp_referido_celular.us$setView("text");
	vpp_referido_celular.us$setFieldLength(20);
	vpp_referido_celular.us$setCandidateTargetColumnName("vpp_referido_celular");
	vpp_referido_celular.setValueRetrievedDuringFetch(true);
	vpp_referido_celular.setFindable(true);
	vpp_referido_celular.setUpdateable(true);
	vpp_referido_celular.setForegroundColor("Black");
	vpp_referido_celular.setFontSize("12");
	vpp_referido_nombre.setStyleClass("textfield");
	vpp_referido_nombre.us$setMultiValued(true);
	vpp_referido_nombre.us$setView("text");
	vpp_referido_nombre.us$setFieldLength(80);
	vpp_referido_nombre.us$setCandidateTargetColumnName("vpp_referido_nombre");
	vpp_referido_nombre.setValueRetrievedDuringFetch(true);
	vpp_referido_nombre.setFindable(true);
	vpp_referido_nombre.setUpdateable(true);
	vpp_referido_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_referido_nombre.setForegroundColor("Black");
	vpp_referido_nombre.setFontSize("12");
	vpp_referido_telefono.setStyleClass("textfield");
	vpp_referido_telefono.us$setMultiValued(true);
	vpp_referido_telefono.us$setView("text");
	vpp_referido_telefono.us$setFieldLength(20);
	vpp_referido_telefono.us$setCandidateTargetColumnName("vpp_referido_telefono");
	vpp_referido_telefono.setValueRetrievedDuringFetch(true);
	vpp_referido_telefono.setFindable(true);
	vpp_referido_telefono.setUpdateable(true);
	vpp_referido_telefono.setForegroundColor("Black");
	vpp_referido_telefono.setFontSize("12");
	vpp_tcompra.setStyleClass("dropdown_list");
	vpp_tcompra.us$setMultiValued(true);
	vpp_tcompra.us$setView("select");
	vpp_tcompra.us$setFieldLength(2);
	vpp_tcompra.setAutoAccept(true);
	vpp_tcompra.us$setCandidateTargetColumnName("vpp_tcompra");
	vpp_tcompra.setValueRetrievedDuringFetch(true);
	vpp_tcompra.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_tcompra.setFindable(true);
	vpp_tcompra.setUpdateable(true);
	vpp_tcompra.setForegroundColor("Black");
	vpp_tcompra.setFontSize("12");
	vpp_telofi.setStyleClass("textfield");
	vpp_telofi.us$setMultiValued(true);
	vpp_telofi.us$setView("text");
	vpp_telofi.us$setFieldLength(30);
	vpp_telofi.us$setCandidateTargetColumnName("vpp_telofi");
	vpp_telofi.setValueRetrievedDuringFetch(true);
	vpp_telofi.setFindable(true);
	vpp_telofi.setUpdateable(true);
	vpp_telofi.setForegroundColor("Black");
	vpp_telofi.setFontSize("12");
	vpp_telres.setStyleClass("textfield");
	vpp_telres.us$setMultiValued(true);
	vpp_telres.us$setView("text");
	vpp_telres.us$setFieldLength(30);
	vpp_telres.us$setCandidateTargetColumnName("vpp_telres");
	vpp_telres.setValueRetrievedDuringFetch(true);
	vpp_telres.setFindable(true);
	vpp_telres.setUpdateable(true);
	vpp_telres.setForegroundColor("Black");
	vpp_telres.setFontSize("12");
	vpp_viviactual.setStyleClass("dropdown_list");
	vpp_viviactual.us$setMultiValued(true);
	vpp_viviactual.us$setView("select");
	vpp_viviactual.us$setFieldLength(2);
	vpp_viviactual.setAutoAccept(true);
	vpp_viviactual.us$setCandidateTargetColumnName("vpp_viviactual");
	vpp_viviactual.setValueRetrievedDuringFetch(true);
	vpp_viviactual.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_viviactual.setFindable(true);
	vpp_viviactual.setUpdateable(true);
	vpp_viviactual.setForegroundColor("Black");
	vpp_viviactual.setFontSize("12");
	vpy_nombre.setStyleClass("textfield");
	vpy_nombre.us$setMultiValued(true);
	vpy_nombre.us$setView("text");
	vpy_nombre.setFindable(true);
	vpy_nombre.setUpdateable(false);
	vpy_nombre.setStopForInput(false);
	vpy_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpy_nombre.setForegroundColor("Black");
	vpy_nombre.setFontSize("12");
	vve_nombre.setStyleClass("textfield");
	vve_nombre.us$setView("text");
	vve_nombre.setFindable(false);
	vve_nombre.setUpdateable(false);
	vve_nombre.setStopForInput(false);
	vve_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vve_nombre.setForegroundColor("Black");
	vve_nombre.setFontSize("12");
	xpc_nombre.setStyleClass("textfield");
	xpc_nombre.us$setView("text");
	xpc_nombre.setFindable(false);
	xpc_nombre.setUpdateable(false);
	xpc_nombre.setStopForInput(false);
	xpc_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	xpc_nombre.setForegroundColor("Black");
	xpc_nombre.setFontSize("12");
	us$addProxyObject(Modulo.ProspectosDVW.class, "hora", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "vpy_tipo", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "xpr_usuario", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "xpc_califica", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "estadopro_ant", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "vendedora", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "empresanombre", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "xpc_dias_pac", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "xpc_dias_pvt", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "fecha_mini", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "fret_obra", false);
	us$addProxyObject(Modulo.ProspectosDVW.class, "fing_obra", false);
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
	    super(Modulo.ProspectosDVW.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.ProspectosDVW.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.ProspectosDVW.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // ProspectosDVW

