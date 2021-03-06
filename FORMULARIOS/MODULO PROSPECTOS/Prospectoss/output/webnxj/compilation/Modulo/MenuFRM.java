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

public class MenuFRM
    extends com.unify.nxj.mgr.NXJForm
{
    NullableString empresanombre = NullableFactory.createNullableString("empresanombre");

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	cajagrandeMenu.NombreForma1.assign(us$registerPool.allocateRegister().load(this.getFormName()));
	cajagrandeMenu.cajaarribaMenu.actualusuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario));
    } // beforeForm
    private MenuFRM MenuFRM = this;
    public class cajagrandeMenu
	extends com.unify.nxj.mgr.NXJBox
    {

	public void EmpresaList()
	    throws com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    java.util.ArrayList LMenu = new java.util.ArrayList();
	    NullableString ENombre = NullableFactory.createNullableString("ENombre");
	    NullableString ENombreT = NullableFactory.createNullableString("ENombreT");
	    NullableString ECodigo = NullableFactory.createNullableString("ECodigo");
	    NullableNumeric counter = (NullableNumeric)NullableFactory.createNullableNumeric("counter").assign(us$registerPool.allocateRegister().load(0));
	    try
		{

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn1 = getConnection();
		    java.sql.PreparedStatement us$stmt1 = null;
		    ResultSet us$rs1 = null;
		    try
			{
			us$stmt1 = us$conn1.prepareStatement("SELECT xem_nombre, xsu_empresa FROM xsu_socieusu, xem_empresas WHERE xsu_empresa = xem_codigo AND xsu_usuario =  ?  ORDER BY xem_nombre ASC");
			((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario.us$setSqlParameterValue(us$stmt1, 1);
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
				us$getter1.assignValueToVariable(ENombre, 1);
				us$getter1.assignValueToVariable(ECodigo, 2);

				    {
				    NameValuePair nomcod = new NameValuePair(us$registerPool.allocateRegister().load(ENombre).getStringValue(), us$registerPool.allocateRegister().load(ECodigo).getStringValue());
				    LMenu.add(nomcod);
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
		}
	    catch (SQLException sqlExcp)
		{
		getSession().displayToMessageBox("No existen productos...");
		}
	    EMPRESA.setOptions(LMenu);
	} // EmpresaList

	public void menu()
	    throws com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    NXJMenu myMenu = new NXJMenu("myMenu");
	    NXJMenu ParametrosMenu = new NXJMenu("Par\u00E1metros");
	    NXJMenu ObrasMenu = new NXJMenu("Obras");
	    NXJMenu TablasComunesMenu = new NXJMenu("Tablas Comunes -->");
	    NXJMenu TablasMenu = new NXJMenu("Tablas -->");
	    NXJMenu PreciosUMenu = new NXJMenu("Precios Unitarios -->");
	    NXJMenu AnalisisUMenu = new NXJMenu("Analisis Unitario");
	    NXJMenu ReportesTCMenu = new NXJMenu("Reportes");
	    NXJMenu PresupuestosMenu = new NXJMenu("Presupuestos");
	    NXJMenu ProgramacionOMenu = new NXJMenu("Programacion de Obras");
	    NXJMenu ControliMenu = new NXJMenu("Control de Inventarios");
	    NXJMenu ContratosMenu = new NXJMenu("Contratos");
	    NXJMenu AdministracionMenu = new NXJMenu("Administracion");
	    NXJMenu VentasMenu = new NXJMenu("Ventas");
	    NXJMenu ProspectosMenu = new NXJMenu("Prospectos -->");
	    NXJMenu CNegociosMenu = new NXJMenu("Creaci\u00F3n de Negocios -->");
	    NXJMenu ReportesVentasMenu = new NXJMenu("Reportes -->");
	    NXJMenu TesoreriaMenu = new NXJMenu("Tesoreria");
	    NXJMenu ContabilidadMenu = new NXJMenu("Contabilidad");
	    NXJMenu PlanillaMenu = new NXJMenu("Planilla");
	    Servicios.ServAdmin SrvTieneAcceso = new Servicios.ServAdmin();
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("SociedadesFRM"))).getBooleanValueNullOk())
		{
		NXJMenuItem Sociedadesadd = new NXJMenuItem("Sociedades");
		Sociedadesadd.setTitle("Sociedades");
		Sociedadesadd.setCommand("cmdSig");
		Sociedadesadd.setCommandParameter("Modulo.SociedadesFRM");
		ParametrosMenu.add(Sociedadesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ActividadPadd = new NXJMenuItem("Actividades de Presupuesto");
		ActividadPadd.setTitle("Actividades de Presupuesto");
		TablasMenu.add(ActividadPadd);
		TablasComunesMenu.add(TablasMenu);
		ObrasMenu.add(TablasComunesMenu);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem InsumosPadd = new NXJMenuItem("Insumos de Presupuesto");
		InsumosPadd.setTitle("Insumos de Presupuesto");
		TablasMenu.add(InsumosPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ProveedoresIadd = new NXJMenuItem("Proveedores de Insumos");
		ProveedoresIadd.setTitle("Proveedores de Insumos");
		TablasMenu.add(ProveedoresIadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem CategoriasPadd = new NXJMenuItem("Categorias de Proyectos");
		CategoriasPadd.setTitle("Categor\u00EDas de Proyectos");
		TablasMenu.add(CategoriasPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem OrdenesDadd = new NXJMenuItem("Ordenes de Dise\u00F1o");
		OrdenesDadd.setTitle("\u00D3rdenes de Dise\u00F1o");
		TablasMenu.add(OrdenesDadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem CreacionUOadd = new NXJMenuItem("Creacion de Unidad por Obra");
		CreacionUOadd.setTitle("Creaci\u00F3n de Unidad por Obra");
		TablasMenu.add(CreacionUOadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ListaPadd = new NXJMenuItem(" Lista de Proveedores");
		ListaPadd.setTitle(" Lista de Proveedores");
		TablasMenu.add(ListaPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem PreciosUIadd = new NXJMenuItem("Precios Unitarios por Insumo");
		PreciosUIadd.setTitle("Precios Unitarios por Insumo");
		PreciosUMenu.add(PreciosUIadd);
		TablasComunesMenu.add(PreciosUMenu);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem PreciosUPadd = new NXJMenuItem("Precios Unitarios por Proveedor");
		PreciosUPadd.setTitle("Precios Unitarios por Proveedor");
		PreciosUMenu.add(PreciosUPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem CopiaPUadd = new NXJMenuItem("Copia de Precios Unitarios");
		CopiaPUadd.setTitle("Copia de Precios Unitarios");
		PreciosUMenu.add(CopiaPUadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem CalculoTDadd = new NXJMenuItem("Calculo de Tiempos de Despacho");
		CalculoTDadd.setTitle("C\u00E1lculo de Tiempos de Despacho");
		PreciosUMenu.add(CalculoTDadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem AnalisisUadd = new NXJMenuItem("Analisis Unitarios");
		AnalisisUadd.setTitle("An\u00E1lisis Unitarios");
		TablasComunesMenu.add(AnalisisUadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ReportesTCadd = new NXJMenuItem("Reportes");
		ReportesTCadd.setTitle("Reportes");
		TablasComunesMenu.add(ReportesTCadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Presupuestoadd = new NXJMenuItem("Presupuestos");
		Presupuestoadd.setTitle("Presupuestos");
		ObrasMenu.add(Presupuestoadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ProgramacionOadd = new NXJMenuItem("Programacion de Obras");
		ProgramacionOadd.setTitle("Programaci\u00F3n de Obras");
		ObrasMenu.add(ProgramacionOadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ControlIadd = new NXJMenuItem("Control de Inventario");
		ControlIadd.setTitle("Control de Inventario");
		ObrasMenu.add(ControlIadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Contratosadd = new NXJMenuItem("Contratos");
		Contratosadd.setTitle("Contratos");
		ObrasMenu.add(Contratosadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Adminstracionadd = new NXJMenuItem("Administracion");
		Adminstracionadd.setTitle("Administraci\u00F3n");
		ObrasMenu.add(Adminstracionadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Parametrosadd = new NXJMenuItem("Parametros");
		Parametrosadd.setTitle("Parametros");
		VentasMenu.add(Parametrosadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Urbanismoadd = new NXJMenuItem("Urbanismo");
		Urbanismoadd.setTitle("Urbanismo");
		VentasMenu.add(Urbanismoadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Comisionesadd = new NXJMenuItem("Comisiones");
		Comisionesadd.setTitle("Comisiones");
		VentasMenu.add(Comisionesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("ProspectosFRM"))).getBooleanValueNullOk())
		{
		NXJMenuItem RegistroPadd = new NXJMenuItem("Registro de Prospectos");
		RegistroPadd.setTitle("Registro de Prospectos");
		RegistroPadd.setCommand("Go To Form");
		RegistroPadd.setCommandParameter("Modulo.ProspectosFRM");
		ProspectosMenu.add(RegistroPadd);
		VentasMenu.add(ProspectosMenu);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("SeguimientoFRM"))).getBooleanValueNullOk())
		{
		NXJMenuItem SeguimientoPadd = new NXJMenuItem("Seguimiento de Prospectos");
		SeguimientoPadd.setTitle("Seguimiento de Prospectos");
		SeguimientoPadd.setCommand("Go To Form");
		SeguimientoPadd.setCommandParameter("Modulo.SeguimientoFRM");
		ProspectosMenu.add(SeguimientoPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem DUDisponiblesadd = new NXJMenuItem("Creaci\u00F3n de Negocios");
		DUDisponiblesadd.setTitle("Creaci\u00F3n de Negocios");
		VentasMenu.add(DUDisponiblesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Tramitesadd = new NXJMenuItem("Tramites");
		Tramitesadd.setTitle("Tr\u00E1mites");
		VentasMenu.add(Tramitesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem AdministracionVadd = new NXJMenuItem("Administracion");
		AdministracionVadd.setTitle("Administraci\u00F3n");
		VentasMenu.add(AdministracionVadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("RepProspectosFRM"))).getBooleanValueNullOk())
		{
		NXJMenuItem ReportesVentasadd = new NXJMenuItem("Reportes Ventas");
		ReportesVentasadd.setTitle("Reportes Ventas");
		ReportesVentasadd.setCommand("Go To Form");
		ReportesVentasadd.setCommandParameter("Modulo.RepProspectosFRM");
		ReportesVentasMenu.add(ReportesVentasadd);
		VentasMenu.add(ReportesVentasMenu);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ModuloCadd = new NXJMenuItem("Modulo de Caja");
		ModuloCadd.setTitle("M\u00F3dulo de Caja");
		TesoreriaMenu.add(ModuloCadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ModuloBadd = new NXJMenuItem("Modulo de Bancos");
		ModuloBadd.setTitle("M\u00F3dulo de Bancos");
		TesoreriaMenu.add(ModuloBadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem CuentasCadd = new NXJMenuItem("Cuentas por Cobrar");
		CuentasCadd.setTitle("Cuentas por Cobrar");
		TesoreriaMenu.add(CuentasCadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ModuloEadd = new NXJMenuItem("Modulo de Egresos");
		ModuloEadd.setTitle("M\u00F3dulo de Egresos");
		TesoreriaMenu.add(ModuloEadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem AdministracionTadd = new NXJMenuItem("Administracion");
		AdministracionTadd.setTitle("Administraci\u00F3n");
		TesoreriaMenu.add(AdministracionTadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem PlanCadd = new NXJMenuItem("Plan Contable");
		PlanCadd.setTitle("Plan Contable");
		ContabilidadMenu.add(PlanCadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Comprobantesadd = new NXJMenuItem("Comprobantes");
		Comprobantesadd.setTitle("Comprobantes");
		ContabilidadMenu.add(Comprobantesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem AdministracionCadd = new NXJMenuItem("Administracion");
		AdministracionCadd.setTitle("Administraci\u00F3n");
		ContabilidadMenu.add(AdministracionCadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ModuloRadd = new NXJMenuItem("Modulo de Reportes");
		ModuloRadd.setTitle("M\u00F3dulo de Reportes");
		ContabilidadMenu.add(ModuloRadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem DatosEadd = new NXJMenuItem("Datos del Empleado");
		DatosEadd.setTitle("Datos del Empleado");
		PlanillaMenu.add(DatosEadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Novedadesadd = new NXJMenuItem("Novedades");
		Novedadesadd.setTitle("Novedades");
		PlanillaMenu.add(Novedadesadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem LiquidacionPadd = new NXJMenuItem("Liquidaci\u00F3n de Planillas");
		LiquidacionPadd.setTitle("Liquidaci\u00F3n de Planillas");
		PlanillaMenu.add(LiquidacionPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem ReportesPadd = new NXJMenuItem("Reportes");
		ReportesPadd.setTitle("Reportes");
		PlanillaMenu.add(ReportesPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem Administraci\u00F3nPadd = new NXJMenuItem("Administracion");
		Administraci\u00F3nPadd.setTitle("Administraci\u00F3n");
		PlanillaMenu.add(Administraci\u00F3nPadd);
		}
	    if (us$registerPool.allocateRegister().load(SrvTieneAcceso.tieneacceso(new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo), new com.unify.nxj.mgr.datatypes.Register().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario), new com.unify.nxj.mgr.datatypes.Register().load("mantenimie"))).getBooleanValueNullOk())
		{
		NXJMenuItem TablasComunesPadd = new NXJMenuItem("Tablas Comunes");
		TablasComunesPadd.setTitle("Tablas Comunes");
		PlanillaMenu.add(TablasComunesPadd);
		}
	    NXJMenuItem Saliradd = new NXJMenuItem("Salir");
	    Saliradd.setTitle("Salir");
	    Saliradd.setCommand("exit");
	    myMenu.add(ParametrosMenu);
	    myMenu.add(ObrasMenu);
	    myMenu.add(VentasMenu);
	    myMenu.add(TesoreriaMenu);
	    myMenu.add(ContabilidadMenu);
	    myMenu.add(PlanillaMenu);
	    myMenu.add(Saliradd);
	    menuPri.setMenuItems(myMenu);
	} // menu
	public class EMPRESA
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void initField()
		throws Exception
	    {
		EmpresaList();
	    } // initField

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		menu();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("SELECT xem_nombre FROM xem_empresas WHERE xem_codigo =  ?");
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
				us$getter2.assignValueToVariable(empresanombre, 1);
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
		cajaarribaMenu.actualempresa.assign(us$registerPool.allocateRegister().load(empresanombre));
	    } // onDataAccept

	    public EMPRESA()
	    {
		super(Modulo.MenuFRM.cajagrandeMenu.this, "EMPRESA", false, true, 100);
		setStyleClass("listbox");
		us$setView("select");
		setAutoAccept(true);
		setRequired(false);
		setFindable(false);
		setStopForInput(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // EMPRESA

	public EMPRESA EMPRESA = new EMPRESA();
	public NullableStringField MTraspasa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "MTraspasa", false, true, 100);
	public NullableStringField NombreForma1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "NombreForma1", false, true, 100);
	public class button1
	    extends ItemsForm.Boton
	{

	    public button1()
	    {
		super(Modulo.MenuFRM.cajagrandeMenu.this, "button1", false);
	    } // <init>
	} // button1

	public button1 button1 = new button1();
	public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJMenuControl menuPri = new com.unify.nxj.mgr.datatypes.NXJMenuControlImpl(this, "menuPri", false);
	public class cajaabajoMenu
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(Modulo.MenuFRM.cajagrandeMenu.cajaabajoMenu.this, "image1", false);
		} // <init>
	    } // image1

	    public image1 image1 = new image1();

	    public cajaabajoMenu(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaabajoMenu", enclosingContainer);
		us$setBackgroundColor("#e30000");
	    } // <init>
	} // cajaabajoMenu

	public final cajaabajoMenu cajaabajoMenu = new cajaabajoMenu(this);
	public class cajaarribaMenu
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(Modulo.MenuFRM.cajagrandeMenu.cajaarribaMenu.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	    public cajaarribaMenu(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaMenu", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaMenupropertySetter_0();
	    } // <init>

	    private void cajaarribaMenupropertySetter_0()
	    {
		actualempresa.setVisible(true);
		actualempresa.setStyleClass("textfield");
		actualempresa.us$setMultiValued(false);
		actualempresa.us$setView("text");
		actualempresa.setFindable(false);
		actualempresa.setStopForInput(false);
		actualempresa.setForegroundColor("Black");
		actualusuario.setStyleClass("textfield");
		actualusuario.us$setMultiValued(false);
		actualusuario.us$setView("text");
		actualusuario.setRequired(false);
		actualusuario.us$setReadersField(false);
		actualusuario.setFindable(false);
		actualusuario.setStopForInput(false);
		actualusuario.setForegroundColor("Black");
		label211.setStyleClass("label");
	    } // cajaarribaMenupropertySetter_0
	} // cajaarribaMenu

	public final cajaarribaMenu cajaarribaMenu = new cajaarribaMenu(this);
	public final class cmdSig
	    extends NXJCommand
	{

	    public cmdSig()
	    {
		super("cmdSig", Modulo.MenuFRM.cajagrandeMenu.this, 3, true, 1);
		us$addCommand(this);
	    } // <init>

	    public void run()
		throws Exception
	    {
		run(null);
	    } // run

	    public void run(String nombre)
		throws Exception
	    {
		getSession().queueNextForm(nombre, NXJForm.NextFormAction_CONTINUE, NXJDataView.ConsistencyMode_INHERIT, "Connection1");
	    } // run
	} // cmdSig

	public final cmdSig cmdSig = new cmdSig();

	public cajagrandeMenu(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeMenu", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeMenupropertySetter_0();
	} // <init>

	private void cajagrandeMenupropertySetter_0()
	{
	    MTraspasa.setVisible(false);
	    MTraspasa.setStyleClass("textfield");
	    MTraspasa.us$setView("text");
	    MTraspasa.setFindable(false);
	    NombreForma1.setStyleClass("textfield");
	    NombreForma1.us$setView("text");
	    NombreForma1.setFindable(false);
	    NombreForma1.setStopForInput(true);
	    label1.setStyleClass("label");
	    label1.setFontSize("12");
	    label11.setStyleClass("label");
	    label11.setFontSize("12");
	    menuPri.setStyleClass("menu");
	    menuPri.setForegroundColor("Black");
	    menuPri.setFontFamily("Raavi");
	    menuPri.setFontSize("16");
	    menuPri.us$setFontWeight("bold");
	} // cajagrandeMenupropertySetter_0
    } // cajagrandeMenu

    public final cajagrandeMenu cajagrandeMenu = new cajagrandeMenu(this);
    public final class BackMenu
	extends NXJCommand
    {

	public BackMenu()
	{
	    super("BackMenu", Modulo.MenuFRM.this, 3, true, 1);
	    us$addCommand(this);
	} // <init>

	public void run()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    ((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_usuario.assign(us$registerPool.allocateRegister().load(" "));
	    ((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_password.assign(us$registerPool.allocateRegister().load(" "));
	    ((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo.assign(us$registerPool.allocateRegister().load(" "));
	    getSession().queueNextForm("Modulo.LoginFRM");
	} // run
    } // BackMenu

    public final BackMenu BackMenu = new BackMenu();

    public MenuFRM(NXJSession session, NXJForm prevForm)
    {
	super("MenuFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected MenuFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	setStartInAddMode(true);
	us$setBackgroundColor("#999999");
	us$addProxyObject(Modulo.MenuFRM.class, "empresanombre", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "MenuFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(Modulo.MenuFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.MenuFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.MenuFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // MenuFRM

