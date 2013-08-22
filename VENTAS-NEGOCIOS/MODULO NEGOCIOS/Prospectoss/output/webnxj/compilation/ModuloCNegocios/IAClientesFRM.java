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
    /*multi_valued*/ NullableStringVariable vau_aux_clase = NullableFactory.createNullableStringVariable(this, "vau_aux_clase", true, false);
    /*multi_valued*/ NullableStringVariable vau_apoderado = NullableFactory.createNullableStringVariable(this, "vau_apoderado", true, false);
    /*multi_valued*/ NullableStringVariable vau_aux_ciuexp = NullableFactory.createNullableStringVariable(this, "vau_aux_ciuexp", true, false);
    /*multi_valued*/ NullableStringVariable vau_aux_nombre = NullableFactory.createNullableStringVariable(this, "vau_aux_nombre", true, false);
    /*multi_valued*/ NullableStringVariable vau_aux_codig = NullableFactory.createNullableStringVariable(this, "vau_aux_codig", true, false);
    /*multi_valued*/ NullableStringVariable vau_unidad = NullableFactory.createNullableStringVariable(this, "vau_unidad", true, false);
    /*multi_valued*/ NullableStringVariable vau_manzana = NullableFactory.createNullableStringVariable(this, "vau_manzana", true, false);
    /*multi_valued*/ NullableStringVariable vau_obra = NullableFactory.createNullableStringVariable(this, "vau_obra", true, false);
    /*multi_valued*/ NullableStringVariable vau_empresa = NullableFactory.createNullableStringVariable(this, "vau_empresa", true, false);
    NullableString tipo_cliente = NullableFactory.createNullableString("tipo_cliente");
    NullableString clase_cliente = NullableFactory.createNullableString("clase_cliente");

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
	vau_empresa.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA;
	    } // evaluate
	});
	vau_empresa.setClearFindExp(new NXJClearToFindExpression()
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
	vau_obra.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_obra;
	    } // evaluate
	});
	vau_obra.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_obra, null)
		    };
	    } // evaluate
	});
	vau_manzana.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_manzana;
	    } // evaluate
	});
	vau_manzana.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_manzana, null)
		    };
	    } // evaluate
	});
	vau_unidad.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_unidad;
	    } // evaluate
	});
	vau_unidad.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_unidad, null)
		    };
	    } // evaluate
	});
	vau_aux_codig.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_nit;
	    } // evaluate
	});
	vau_aux_codig.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_nit, null)
		    };
	    } // evaluate
	});
	vau_aux_nombre.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_nombre;
	    } // evaluate
	});
	vau_aux_nombre.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, ((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_nombre, null)
		    };
	    } // evaluate
	});
	vau_aux_ciuexp.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		return us$registerPool.allocateRegister().load("PANAMENA");
	    } // evaluate
	});
	clase_cliente.assign(us$registerPool.allocateRegister().load(((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_clase));
	tipo_cliente.assign(us$registerPool.allocateRegister().load(((ModuloCNegocios.ICompradoresFRM)us$findForm(ModuloCNegocios.ICompradoresFRM.class)).cajagrandeICompradores.PUBLIC_tcl_tipclien.tcl_tipo));
	if (us$registerPool.allocateRegister().load(clase_cliente).eqOp("A").getBooleanValueNullOk())
	    {
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apoderado.setStopForInput(false);
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apode_nit.setStopForInput(false);
	    }
	if (us$registerPool.allocateRegister().load(tipo_cliente).eqOp("P").getBooleanValueNullOk())
	    {
	    vau_aux_clase.assign(us$registerPool.allocateRegister().load("C"));
	    }
	else
	    {
	    vau_aux_clase.assign(us$registerPool.allocateRegister().load("A"));
	    }
    } // beforeForm

    public void onClearToAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (us$registerPool.allocateRegister().load(clase_cliente).eqOp("A").getBooleanValueNullOk())
	    {
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apoderado.assign(us$registerPool.allocateRegister().load("N"));
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apoderado.setStopForInput(false);
	    ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vau_apode_nit.setStopForInput(false);
	    }
	if (us$registerPool.allocateRegister().load(tipo_cliente).eqOp("P").getBooleanValueNullOk())
	    {
	    vau_aux_clase.assign(us$registerPool.allocateRegister().load("C"));
	    }
	else
	    {
	    vau_aux_clase.assign(us$registerPool.allocateRegister().load("A"));
	    }
    } // onClearToAdd

    public void afterAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (us$registerPool.allocateRegister().load(clase_cliente).eqOp("T").getBooleanValueNullOk())
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn1 = getConnection();
		java.sql.PreparedStatement us$stmt1 = null;
		ResultSet us$rs1 = null;
		try
		    {
		    us$stmt1 = us$conn1.prepareStatement("INSERT INTO xau_auxiliar (xau_clase, xau_codigo, xau_nombre) VALUES ( ? ,  ? ,  ? )");
		    vau_aux_clase.us$setSqlParameterValue(us$stmt1, 1);
		    vau_aux_codig.us$setSqlParameterValue(us$stmt1, 2);
		    vau_aux_nombre.us$setSqlParameterValue(us$stmt1, 3);
		    if (us$stmt1.executeUpdate() == 0)
			getSession().us$setStatus(StatusCode.SS_NOREC);
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
	    getSession().commitTransaction();

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn2 = getConnection();
		java.sql.PreparedStatement us$stmt2 = null;
		ResultSet us$rs2 = null;
		try
		    {
		    vau_aux_clase.us$setSqlParameterValue(us$stmt2, 1);
		    vau_aux_codig.us$setSqlParameterValue(us$stmt2, 2);
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
	    }
    } // afterAdd
    private IAClientesFRM IAClientesFRM = this;
    public class cajagrandeIAClientes
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl Label19 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label19", false);
	public NXJLabelControl Label20 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label20", false);
	public NXJLabelControl Label9 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label9", false);
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public NXJLabelControl label312 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label312", false);
	public NXJLabelControl label3121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3121", false);
	public NXJLabelControl label3131111111121111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121111", false);
	public /*multi_valued*/ NullableStringField vau_aux_ciuexp = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_aux_ciuexp", true, true, 30);
	public /*multi_valued*/ NullableStringField vau_aux_clase = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_aux_clase", true, true, 2);
	public /*multi_valued*/ NullableStringField vau_aux_codig = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_aux_codig", true, true, 18);
	public /*multi_valued*/ NullableStringField vau_aux_esciv = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_aux_esciv", true, true, 2);
	public /*multi_valued*/ NullableStringField vau_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_manzana", true, true, 3);
	public /*multi_valued*/ NullableStringField vau_obra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_obra", true, true, 2);
	public /*multi_valued*/ NullableStringField vau_ocupacion = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_ocupacion", true, true, 30);
	public /*multi_valued*/ NullableStringField vau_soc_conyu = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_soc_conyu", true, true, 2);
	public /*multi_valued*/ NullableStringField vau_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_unidad", true, true, 4);
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
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
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
	    vau_aux_ciuexp.setStyleClass("textfield");
	    vau_aux_ciuexp.us$setMultiValued(true);
	    vau_aux_ciuexp.us$setView("select");
	    vau_aux_ciuexp.us$setFieldLength(30);
	    vau_aux_ciuexp.us$setCandidateTargetColumnName("vau_aux_ciuexp");
	    vau_aux_ciuexp.setValueRetrievedDuringFetch(true);
	    vau_aux_ciuexp.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_aux_ciuexp.setRequired(true);
	    vau_aux_ciuexp.setFindable(true);
	    vau_aux_ciuexp.setUpdateable(true);
	    vau_aux_clase.setStyleClass("textfield");
	    vau_aux_clase.us$setMultiValued(true);
	    vau_aux_clase.us$setView("select");
	    vau_aux_clase.us$setFieldLength(2);
	    vau_aux_clase.setAutoAccept(true);
	    vau_aux_clase.us$setCandidateTargetColumnName("vau_aux_clase");
	    vau_aux_clase.setValueRetrievedDuringFetch(true);
	    vau_aux_clase.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_aux_clase.setRequired(true);
	    vau_aux_clase.setFindable(true);
	    vau_aux_clase.setUpdateable(true);
	    vau_aux_codig.setStyleClass("textfield");
	    vau_aux_codig.us$setMultiValued(true);
	    vau_aux_codig.us$setView("text");
	    vau_aux_codig.us$setFieldLength(18);
	    vau_aux_codig.us$setCandidateTargetColumnName("vau_aux_codig");
	    vau_aux_codig.setValueRetrievedDuringFetch(true);
	    vau_aux_codig.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_aux_codig.setRequired(true);
	    vau_aux_codig.setFindable(true);
	    vau_aux_codig.setUpdateable(true);
	    vau_aux_esciv.setStyleClass("dropdown_list");
	    vau_aux_esciv.us$setMultiValued(true);
	    vau_aux_esciv.us$setView("select");
	    vau_aux_esciv.us$setFieldLength(2);
	    vau_aux_esciv.setAutoAccept(true);
	    vau_aux_esciv.us$setCandidateTargetColumnName("vau_aux_esciv");
	    vau_aux_esciv.setValueRetrievedDuringFetch(true);
	    vau_aux_esciv.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_aux_esciv.setRequired(true);
	    vau_aux_esciv.setFindable(true);
	    vau_aux_esciv.setUpdateable(true);
	    vau_aux_esciv.setForegroundColor("Black");
	    vau_aux_esciv.setFontSize("12");
	    vau_manzana.setStyleClass("textfield");
	    vau_manzana.us$setMultiValued(true);
	    vau_manzana.us$setView("text");
	    vau_manzana.us$setFieldLength(3);
	    vau_manzana.us$setCandidateTargetColumnName("vau_manzana");
	    vau_manzana.setValueRetrievedDuringFetch(true);
	    vau_manzana.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_manzana.setRequired(true);
	    vau_manzana.setFindable(true);
	    vau_manzana.setUpdateable(false);
	    vau_manzana.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vau_obra.setStyleClass("textfield");
	    vau_obra.us$setMultiValued(true);
	    vau_obra.us$setView("text");
	    vau_obra.us$setFieldLength(2);
	    vau_obra.us$setCandidateTargetColumnName("vau_obra");
	    vau_obra.setValueRetrievedDuringFetch(true);
	    vau_obra.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_obra.setRequired(true);
	    vau_obra.setFindable(true);
	    vau_obra.setUpdateable(true);
	    vau_obra.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vau_ocupacion.setStyleClass("dropdown_list");
	    vau_ocupacion.us$setMultiValued(true);
	    vau_ocupacion.us$setView("select");
	    vau_ocupacion.us$setFieldLength(30);
	    vau_ocupacion.setAutoAccept(false);
	    vau_ocupacion.us$setCandidateTargetColumnName("vau_ocupacion");
	    vau_ocupacion.setValueRetrievedDuringFetch(true);
	    vau_ocupacion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_ocupacion.setFindable(true);
	    vau_ocupacion.setUpdateable(true);
	    vau_ocupacion.us$setMultiValuedOptions(true);
	    vau_ocupacion.setForegroundColor("Black");
	    vau_ocupacion.setFontSize("12");
	    vau_soc_conyu.setStyleClass("dropdown_list");
	    vau_soc_conyu.us$setMultiValued(true);
	    vau_soc_conyu.us$setView("select");
	    vau_soc_conyu.us$setFieldLength(2);
	    vau_soc_conyu.setAutoAccept(true);
	    vau_soc_conyu.us$setCandidateTargetColumnName("vau_soc_conyu");
	    vau_soc_conyu.setValueRetrievedDuringFetch(true);
	    vau_soc_conyu.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_soc_conyu.setRequired(true);
	    vau_soc_conyu.setFindable(true);
	    vau_soc_conyu.setUpdateable(true);
	    vau_soc_conyu.setForegroundColor("Black");
	    vau_soc_conyu.setFontSize("12");
	    vau_unidad.setStyleClass("textfield");
	    vau_unidad.us$setMultiValued(true);
	    vau_unidad.us$setView("text");
	    vau_unidad.us$setFieldLength(4);
	    vau_unidad.us$setCandidateTargetColumnName("vau_unidad");
	    vau_unidad.setValueRetrievedDuringFetch(true);
	    vau_unidad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_unidad.setRequired(true);
	    vau_unidad.setFindable(true);
	    vau_unidad.setUpdateable(true);
	    vau_unidad.setCaseConversion(NullableField.CaseConversion_UPPER);
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
	us$setTargetTableName("PUBLIC.vau_auxiliares");
	setDeleteAllowed(false);
	setAutoFind(true);
	setStartInAddMode(false);
	setFindCount(10);
	us$setBackgroundColor("#999999");
	us$addTargetMapping("vau_empresa", "vau_empresa");
	us$addTargetMapping("vau_aux_nombre", "vau_aux_nombre");
	us$addTargetMapping("vau_apoderado", "vau_apoderado");
	us$addProxyObject(ModuloCNegocios.IAClientesFRM.class, "clase_cliente", false);
	us$addProxyObject(ModuloCNegocios.IAClientesFRM.class, "tipo_cliente", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "IAClientesFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(ModuloCNegocios.IAClientesFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(ModuloCNegocios.IAClientesFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(ModuloCNegocios.IAClientesFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // IAClientesFRM

