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

public class Form1
    extends com.unify.nxj.mgr.NXJForm
{
    NullableNumeric tear = (NullableNumeric)NullableFactory.createNullableNumeric("tear").assign(getSession().us$getRegisterPool().allocateRegister().load(1));

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NXJMenu myMenu = new NXJMenu("myMenu");
	NXJMenu ObrasMenu = new NXJMenu("Obras");
	NXJMenu TablasComunesMenu = new NXJMenu("Tablas Comunes -->");
	NXJMenu TablasMenu = new NXJMenu("Tablas -->");
	NXJMenu PreciosUMenu = new NXJMenu("Precios Unitarios -->");
	NXJMenu AnalisisUMenu = new NXJMenu("Analisis Unitario");
	NXJMenu ReporteTCMenu = new NXJMenu("Reporte");
	NXJMenu PresupuestosMenu = new NXJMenu("Presupuestos");
	NXJMenu ProgramacionOMenu = new NXJMenu("Programacion de Obras");
	NXJMenu ControliMenu = new NXJMenu("Control de Inventarios");
	NXJMenu ContratosMenu = new NXJMenu("Contratos");
	NXJMenu AdministracionMenu = new NXJMenu("Administracion");
	NXJMenu VentasMenu = new NXJMenu("Ventas");
	NXJMenu ProspectosMenu = new NXJMenu("Prospectos -->");
	NXJMenu TesoreriaMenu = new NXJMenu("Tesoreria");
	NXJMenu ContabilidadMenu = new NXJMenu("Contabilidad");
	NXJMenu PlanillaMenu = new NXJMenu("Planilla");
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ActividadPadd = new NXJMenuItem("Actividades de Presupuesto");
	    ActividadPadd.setTitle("Actividades de Presupuesto");
	    ActividadPadd.setCommand("Exit");
	    TablasMenu.add(ActividadPadd);
	    TablasComunesMenu.add(TablasMenu);
	    ObrasMenu.add(TablasComunesMenu);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem InsumosPadd = new NXJMenuItem("Insumos de Presupuesto");
	    InsumosPadd.setTitle("Insumos de Presupuesto");
	    InsumosPadd.setCommand("Exit");
	    TablasMenu.add(InsumosPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ProveedoresIadd = new NXJMenuItem("Proveedores de Insumos");
	    ProveedoresIadd.setTitle("Proveedores de Insumos");
	    ProveedoresIadd.setCommand("Exit");
	    TablasMenu.add(ProveedoresIadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CategoriasPadd = new NXJMenuItem("Categorias de Proyectos");
	    CategoriasPadd.setTitle("Categor\u00EDas de Proyectos");
	    CategoriasPadd.setCommand("Exit");
	    TablasMenu.add(CategoriasPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem OrdenesDadd = new NXJMenuItem("Ordenes de Dise\u00F1o");
	    OrdenesDadd.setTitle("\u00D3rdenes de Dise\u00F1o");
	    OrdenesDadd.setCommand("Exit");
	    TablasMenu.add(OrdenesDadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CreacionUOadd = new NXJMenuItem("Creacion de Unidad por Obra");
	    CreacionUOadd.setTitle("Creaci\u00F3n de Unidad por Obra");
	    CreacionUOadd.setCommand("Exit");
	    TablasMenu.add(CreacionUOadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ListaPadd = new NXJMenuItem(" Lista de Proveedores");
	    ListaPadd.setTitle(" Lista de Proveedores");
	    ListaPadd.setCommand("Exit");
	    TablasMenu.add(ListaPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem PreciosUIadd = new NXJMenuItem("Precios Unitarios por Insumo");
	    PreciosUIadd.setTitle("Precios Unitarios por Insumo");
	    PreciosUIadd.setCommand("Exit");
	    PreciosUMenu.add(PreciosUIadd);
	    TablasComunesMenu.add(PreciosUMenu);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem PreciosUPadd = new NXJMenuItem("Precios Unitarios por Proveedor");
	    PreciosUPadd.setTitle("Precios Unitarios por Proveedor");
	    PreciosUPadd.setCommand("Exit");
	    PreciosUMenu.add(PreciosUPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CopiaPUadd = new NXJMenuItem("Copia de Precios Unitarios");
	    CopiaPUadd.setTitle("Copia de Precios Unitarios");
	    CopiaPUadd.setCommand("Exit");
	    PreciosUMenu.add(CopiaPUadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CalculoTDadd = new NXJMenuItem("Calculo de Tiempos de Despacho");
	    CalculoTDadd.setTitle("C\u00E1lculo de Tiempos de Despacho");
	    CalculoTDadd.setCommand("Exit");
	    PreciosUMenu.add(CalculoTDadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem AnalisisUadd = new NXJMenuItem("Analisis Unitarios");
	    AnalisisUadd.setTitle("An\u00E1lisis Unitarios");
	    TablasComunesMenu.add(AnalisisUadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ReportesTCadd = new NXJMenuItem("Reportes");
	    ReportesTCadd.setTitle("Reportes");
	    TablasComunesMenu.add(ReportesTCadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Presupuestoadd = new NXJMenuItem("Presupuestos");
	    Presupuestoadd.setTitle("Presupuestos");
	    ObrasMenu.add(Presupuestoadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ProgramacionOadd = new NXJMenuItem("Programacion de Obras");
	    ProgramacionOadd.setTitle("Programaci\u00F3n de Obras");
	    ObrasMenu.add(ProgramacionOadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ControlIadd = new NXJMenuItem("Control de Inventario");
	    ControlIadd.setTitle("Control de Inventario");
	    ObrasMenu.add(ControlIadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Contratosadd = new NXJMenuItem("Contratos");
	    Contratosadd.setTitle("Contratos");
	    ObrasMenu.add(Contratosadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Adminstracionadd = new NXJMenuItem("Administracion");
	    Adminstracionadd.setTitle("Administraci\u00F3n");
	    ObrasMenu.add(Adminstracionadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Parametrosadd = new NXJMenuItem("Parametros");
	    Parametrosadd.setTitle("Parametros");
	    VentasMenu.add(Parametrosadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Urbanismoadd = new NXJMenuItem("Urbanismo");
	    Urbanismoadd.setTitle("Urbanismo");
	    VentasMenu.add(Urbanismoadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Comisionesadd = new NXJMenuItem("Comisiones");
	    Comisionesadd.setTitle("Comisiones");
	    VentasMenu.add(Comisionesadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem RegistroPadd = new NXJMenuItem("Registro de Prospectos");
	    RegistroPadd.setTitle("Registro de Prospectos");
	    RegistroPadd.setCommand("Exit");
	    ProspectosMenu.add(RegistroPadd);
	    VentasMenu.add(ProspectosMenu);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem SeguimientoPadd = new NXJMenuItem("Seguimiento de Prospectos");
	    SeguimientoPadd.setTitle("Seguimiento de Prospectos");
	    SeguimientoPadd.setCommand("Exit");
	    ProspectosMenu.add(SeguimientoPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CreacionNadd = new NXJMenuItem("Creacion de Negocios");
	    CreacionNadd.setTitle("Creaci\u00F3n de Negocios");
	    VentasMenu.add(CreacionNadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Tramitesadd = new NXJMenuItem("Tramites");
	    Tramitesadd.setTitle("Tr\u00E1mites");
	    VentasMenu.add(Tramitesadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem AdministracionVadd = new NXJMenuItem("Administracion");
	    AdministracionVadd.setTitle("Administraci\u00F3n");
	    VentasMenu.add(AdministracionVadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ReportesVadd = new NXJMenuItem("Reportes");
	    ReportesVadd.setTitle("Reportes");
	    VentasMenu.add(ReportesVadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ModuloCadd = new NXJMenuItem("Modulo de Caja");
	    ModuloCadd.setTitle("M\u00F3dulo de Caja");
	    TesoreriaMenu.add(ModuloCadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ModuloBadd = new NXJMenuItem("Modulo de Bancos");
	    ModuloBadd.setTitle("M\u00F3dulo de Bancos");
	    TesoreriaMenu.add(ModuloBadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem CuentasCadd = new NXJMenuItem("Cuentas por Cobrar");
	    CuentasCadd.setTitle("Cuentas por Cobrar");
	    TesoreriaMenu.add(CuentasCadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ModuloEadd = new NXJMenuItem("Modulo de Egresos");
	    ModuloEadd.setTitle("M\u00F3dulo de Egresos");
	    TesoreriaMenu.add(ModuloEadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem AdministracionTadd = new NXJMenuItem("Administracion");
	    AdministracionTadd.setTitle("Administraci\u00F3n");
	    TesoreriaMenu.add(AdministracionTadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem PlanCadd = new NXJMenuItem("Plan Contable");
	    PlanCadd.setTitle("Plan Contable");
	    ContabilidadMenu.add(PlanCadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Comprobantesadd = new NXJMenuItem("Comprobantes");
	    Comprobantesadd.setTitle("Comprobantes");
	    ContabilidadMenu.add(Comprobantesadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem AdministracionCadd = new NXJMenuItem("Administracion");
	    AdministracionCadd.setTitle("Administraci\u00F3n");
	    ContabilidadMenu.add(AdministracionCadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ModuloRadd = new NXJMenuItem("Modulo de Reportes");
	    ModuloRadd.setTitle("M\u00F3dulo de Reportes");
	    ContabilidadMenu.add(ModuloRadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem DatosEadd = new NXJMenuItem("Datos del Empleado");
	    DatosEadd.setTitle("Datos del Empleado");
	    PlanillaMenu.add(DatosEadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Novedadesadd = new NXJMenuItem("Novedades");
	    Novedadesadd.setTitle("Novedades");
	    PlanillaMenu.add(Novedadesadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem LiquidacionPadd = new NXJMenuItem("Liquidaci\u00F3n de Planillas");
	    LiquidacionPadd.setTitle("Liquidaci\u00F3n de Planillas");
	    PlanillaMenu.add(LiquidacionPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem ReportesPadd = new NXJMenuItem("Reportes");
	    ReportesPadd.setTitle("Reportes");
	    PlanillaMenu.add(ReportesPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem Administraci\u00F3nPadd = new NXJMenuItem("Administracion");
	    Administraci\u00F3nPadd.setTitle("Administraci\u00F3n");
	    PlanillaMenu.add(Administraci\u00F3nPadd);
	    }
	if (us$registerPool.allocateRegister().load(tear).gtOp(0).getBooleanValueNullOk())
	    {
	    NXJMenuItem TablasComunesPadd = new NXJMenuItem("Tablas Comunes");
	    TablasComunesPadd.setTitle("Tablas Comunes");
	    PlanillaMenu.add(TablasComunesPadd);
	    }
	NXJMenuItem Saliradd = new NXJMenuItem("Salir");
	Saliradd.setTitle("Salir");
	Saliradd.setCommand("exit");
	myMenu.add(ObrasMenu);
	myMenu.add(VentasMenu);
	myMenu.add(TesoreriaMenu);
	myMenu.add(ContabilidadMenu);
	myMenu.add(PlanillaMenu);
	myMenu.add(Saliradd);
	menuPri.setMenuItems(myMenu);
    } // beforeForm
    private Form1 Form1 = this;
    public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
    public NXJMenuControl menuPri = new com.unify.nxj.mgr.datatypes.NXJMenuControlImpl(this, "menuPri", false);

    public Form1(NXJSession session, NXJForm prevForm)
    {
	super("Form1", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected Form1(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	label1.setStyleClass("label");
	label1.setFontSize("16");
	label1.us$setFontWeight("bold");
	menuPri.setStyleClass("menu");
	menuPri.setForegroundColor("Black");
	menuPri.setFontFamily("Trebuchet MS");
	menuPri.setFontSize("12");
	us$setStopWithoutFields(true);
	us$addProxyObject(Form1.class, "tear", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "Form1";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(Form1.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Form1.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Form1.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // Form1

