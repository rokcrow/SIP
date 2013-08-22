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

public class ICompradoresFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable tcl_unidad = NullableFactory.createNullableStringVariable(this, "tcl_unidad", true, false);
    /*multi_valued*/ NullableStringVariable tcl_manzana = NullableFactory.createNullableStringVariable(this, "tcl_manzana", true, false);
    /*multi_valued*/ NullableStringVariable tcl_obra = NullableFactory.createNullableStringVariable(this, "tcl_obra", true, false);
    /*multi_valued*/ NullableStringVariable tcl_empresa = NullableFactory.createNullableStringVariable(this, "tcl_empresa", true, false);
    NullableString tcl_clase = NullableFactory.createNullableString("tcl_clase");

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	tcl_empresa.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA;
	    } // evaluate
	});
	tcl_empresa.setClearFindExp(new NXJClearToFindExpression()
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
	tcl_obra.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_obra;
	    } // evaluate
	});
	tcl_obra.setClearFindExp(new NXJClearToFindExpression()
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
	tcl_manzana.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_manzana;
	    } // evaluate
	});
	tcl_manzana.setClearFindExp(new NXJClearToFindExpression()
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
	tcl_unidad.setClearAddExp(new NXJClearToAddExpression()
	{

	    public Nullable evaluate()
		throws Exception
	    {
		return ((ModuloCNegocios.RBoletinesFRM)us$findForm(ModuloCNegocios.RBoletinesFRM.class)).cajagrandeRBoletines.vmu_unidad;
	    } // evaluate
	});
	tcl_unidad.setClearFindExp(new NXJClearToFindExpression()
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

	    {
	    getSession().us$setStatus(StatusCode.SS_NORM);
	    NXJDataConnection us$conn1 = getConnection();
	    java.sql.PreparedStatement us$stmt1 = null;
	    ResultSet us$rs1 = null;
	    try
		{
		us$stmt1 = us$conn1.prepareStatement("SELECT tcl_clase FROM tcl_tipclien WHERE tcl_empresa =  ?  AND tcl_obra =  ?  AND tcl_manzana =  ?  AND tcl_unidad =  ?");
		tcl_empresa.us$setSqlParameterValue(us$stmt1, 1);
		tcl_obra.us$setSqlParameterValue(us$stmt1, 2);
		tcl_manzana.us$setSqlParameterValue(us$stmt1, 3);
		tcl_unidad.us$setSqlParameterValue(us$stmt1, 4);
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
			us$getter1.assignValueToVariable(tcl_clase, 1);
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
	if (getSession().getStatus() == StatusCode.SS_NORM)
	    {
	    tcl_clase.assign(us$registerPool.allocateRegister().load("A"));
	    }
	else
	    {
	    tcl_clase.assign(us$registerPool.allocateRegister().load("T"));
	    }
    } // beforeForm

    public void onClearToAdd()
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
		us$stmt2 = us$conn2.prepareStatement("SELECT tcl_clase FROM tcl_tipclien WHERE tcl_empresa =  ?  AND tcl_obra =  ?  AND tcl_manzana =  ?  AND tcl_unidad =  ?");
		tcl_empresa.us$setSqlParameterValue(us$stmt2, 1);
		tcl_obra.us$setSqlParameterValue(us$stmt2, 2);
		tcl_manzana.us$setSqlParameterValue(us$stmt2, 3);
		tcl_unidad.us$setSqlParameterValue(us$stmt2, 4);
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
			us$getter2.assignValueToVariable(tcl_clase, 1);
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
	if (getSession().getStatus() == StatusCode.SS_NORM)
	    {
	    tcl_clase.assign(us$registerPool.allocateRegister().load("O"));
	    }
	else
	    {
	    tcl_clase.assign(us$registerPool.allocateRegister().load("T"));
	    }
    } // onClearToAdd

    public void onPreviousForm()
	throws Exception
    {
    } // onPreviousForm

    public void afterAdd()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	if (isCurrentRecordStored() == false)
	    {
	    getSession().displayToMessageBox("No est\u00E1 toda la informaci\u00F3n requerida para grabar.");
	    }
	else
	    getSession().queueCommand("PREVIOUS_FORM");
	cajagrandeICompradores.varadhiere.assign(us$registerPool.allocateRegister().load("1"));
    } // afterAdd
    private ICompradoresFRM ICompradoresFRM = this;
    public class cajagrandeICompradores
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NullableStringField varadhiere = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "varadhiere", false, true, 100);
	public class PUBLIC_tcl_tipclien
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    public /*multi_valued*/ NullableStringField tcl_clase = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "tcl_clase", true, true, 2);
	    public /*multi_valued*/ NullableStringField tcl_nit = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "tcl_nit", true, true, 18);
	    public /*multi_valued*/ NullableStringField tcl_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "tcl_nombre", true, true, 80);
	    public /*multi_valued*/ NullableStringField tcl_tipo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "tcl_tipo", true, true, 2);

	    public PUBLIC_tcl_tipclien(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_tcl_tipclien", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.tcl_tipclien");
		setUpdateAllowed(false);
		setAutoFind(true);
		setStartInAddMode(false);
		setFindCount(10);
		us$setBindingType("connection");
		tcl_clase.setStyleClass("textfield");
		tcl_clase.us$setMultiValued(true);
		tcl_clase.us$setView("select");
		tcl_clase.us$setFieldLength(2);
		tcl_clase.us$setCandidateTargetColumnName("tcl_clase");
		tcl_clase.setValueRetrievedDuringFetch(true);
		tcl_clase.setFindable(true);
		tcl_clase.setUpdateable(true);
		tcl_nit.setStyleClass("textfield");
		tcl_nit.us$setMultiValued(true);
		tcl_nit.us$setView("text");
		tcl_nit.us$setFieldLength(18);
		tcl_nit.us$setCandidateTargetColumnName("tcl_nit");
		tcl_nit.setValueRetrievedDuringFetch(true);
		tcl_nit.setRequired(true);
		tcl_nit.setFindable(true);
		tcl_nit.setUpdateable(true);
		tcl_nombre.setStyleClass("textfield");
		tcl_nombre.us$setMultiValued(true);
		tcl_nombre.us$setView("text");
		tcl_nombre.us$setFieldLength(80);
		tcl_nombre.us$setCandidateTargetColumnName("tcl_nombre");
		tcl_nombre.setValueRetrievedDuringFetch(true);
		tcl_nombre.setRequired(true);
		tcl_nombre.setFindable(true);
		tcl_nombre.setUpdateable(true);
		tcl_tipo.setStyleClass("textfield");
		tcl_tipo.us$setMultiValued(true);
		tcl_tipo.us$setView("select");
		tcl_tipo.us$setFieldLength(2);
		tcl_tipo.us$setCandidateTargetColumnName("tcl_tipo");
		tcl_tipo.setValueRetrievedDuringFetch(true);
		tcl_tipo.setFindable(true);
		tcl_tipo.setUpdateable(true);
	    } // <init>
	} // PUBLIC_tcl_tipclien

	public final PUBLIC_tcl_tipclien PUBLIC_tcl_tipclien = new PUBLIC_tcl_tipclien(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.ICompradoresFRM.cajagrandeICompradores.box11.this, "image1", false);
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
		    super(ModuloCNegocios.ICompradoresFRM.cajagrandeICompradores.box111.this, "label1", false);
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

	public cajagrandeICompradores(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeICompradores", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeICompradorespropertySetter_0();
	} // <init>

	private void cajagrandeICompradorespropertySetter_0()
	{
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	    varadhiere.setStyleClass("textfield");
	    varadhiere.us$setView("text");
	    varadhiere.setFindable(false);
	} // cajagrandeICompradorespropertySetter_0
    } // cajagrandeICompradores

    public final cajagrandeICompradores cajagrandeICompradores = new cajagrandeICompradores(this);

    public ICompradoresFRM(NXJSession session, NXJForm prevForm)
    {
	super("ICompradoresFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected ICompradoresFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vuu_unidades");
	setStartInAddMode(false);
	us$setBindingType("connection");
	us$setBackgroundColor("#999999");
	us$addProxyObject(ModuloCNegocios.ICompradoresFRM.class, "tcl_clase", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "ICompradoresFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(ModuloCNegocios.ICompradoresFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(ModuloCNegocios.ICompradoresFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(ModuloCNegocios.ICompradoresFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // ICompradoresFRM

