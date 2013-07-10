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

public class DUDisponiblesFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable xob_empresa = NullableFactory.createNullableStringVariable(this, "xob_empresa", true, false);
    NullableAmount TPrecioVAR = NullableFactory.createNullableAmount("TPrecioVAR");
    NullableNumeric TUnidades = NullableFactory.createNullableNumeric("TUnidades");

    public void beforeForm()
	throws Exception
    {
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	xob_empresa.setClearFindExp(new NXJClearToFindExpression()
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
	TPrecioVAR.assign(us$registerPool.allocateRegister().load(0.0));
	TUnidades.assign(us$registerPool.allocateRegister().load(0));
	cajagrandeDUDisponibles.TPrecioFLD.assign(us$registerPool.allocateRegister().load(TPrecioVAR));
	cajagrandeDUDisponibles.TUnidades.assign(us$registerPool.allocateRegister().load(TUnidades));
    } // beforeForm

    public com.unify.nxj.mgr.NXJMasterRelationshipExpression[] us$getPUBLIC_vuu_unidades_1_FindExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterRelationshipExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_obra";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, cajagrandeDUDisponibles.xob_obra, null)
			};
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_empresa";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, DUDisponiblesFRM.xob_empresa, null)
			};
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vuu_unidades_1_FindExpressions

    public com.unify.nxj.mgr.NXJMasterAddExpression[] us$getPUBLIC_vuu_unidades_1_AddExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterAddExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_obra";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return cajagrandeDUDisponibles.xob_obra;
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_empresa";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return DUDisponiblesFRM.xob_empresa;
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vuu_unidades_1_AddExpressions
    private DUDisponiblesFRM DUDisponiblesFRM = this;
    public class cajagrandeDUDisponibles
	extends com.unify.nxj.mgr.NXJBox
    {
	public NullableAmountField TPrecioFLD = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "TPrecioFLD", false, true, 100);
	public NullableNumericField TUnidades = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "TUnidades", false, true, 100);
	public class imprimirbtn
	    extends ItemsForm.Boton
	{

	    public imprimirbtn()
	    {
		super(ModuloCNegocios.DUDisponiblesFRM.cajagrandeDUDisponibles.this, "imprimirbtn", false);
	    } // <init>
	} // imprimirbtn

	public imprimirbtn imprimirbtn = new imprimirbtn();
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public class regresarbtn
	    extends ItemsForm.Boton
	{

	    public regresarbtn()
	    {
		super(ModuloCNegocios.DUDisponiblesFRM.cajagrandeDUDisponibles.this, "regresarbtn", false);
	    } // <init>
	} // regresarbtn

	public regresarbtn regresarbtn = new regresarbtn();
	public /*multi_valued*/ NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", true, true, 100);
	public /*multi_valued*/ NullableStringField xob_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_nombre", true, true, 30);
	public /*multi_valued*/ NullableStringField xob_obra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_obra", true, true, 2);
	public class xob_proyecto
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
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
			us$stmt1 = us$conn1.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?");
			xob_proyecto.us$setSqlParameterValue(us$stmt1, 1);
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt1, 2);
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
				us$getter1.assignValueToVariable(vpy_nombre, 1);
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
		    getSession().displayToMessageBox("No existe el proyecto seleccionado en el maestro de proyectos");
		    xob_proyecto.assign(us$registerPool.allocateRegister().load(" "));
		    rejectOperation();
		    }
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn2 = getConnection();
		    java.sql.PreparedStatement us$stmt2 = null;
		    ResultSet us$rs2 = null;
		    try
			{
			us$stmt2 = us$conn2.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?");
			xob_proyecto.us$setSqlParameterValue(us$stmt2, 1);
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt2, 2);
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
				us$getter2.assignValueToVariable(vpy_nombre, 1);
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
	    } // whenValueChanges

	    public xob_proyecto()
	    {
		super(ModuloCNegocios.DUDisponiblesFRM.cajagrandeDUDisponibles.this, "xob_proyecto", true, true, 2);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(2);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("xob_proyecto");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		setZoomFormName("Modulo/ProyectosFRM");
		setZoomEnabled(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // xob_proyecto

	public /*multi_valued*/ xob_proyecto xob_proyecto = new xob_proyecto();
	public class PUBLIC_vuu_unidades
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    /*multi_valued*/ NullableStringVariable vuu_estado = NullableFactory.createNullableStringVariable(this, "vuu_estado", true, false);
	    /*multi_valued*/ NullableStringVariable vuu_empresa = NullableFactory.createNullableStringVariable(this, "vuu_empresa", true, false);
	    /*multi_valued*/ NullableStringVariable vuu_obra = NullableFactory.createNullableStringVariable(this, "vuu_obra", true, false);

	    public void onFind()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R3;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (((us$R3 = us$registerPool.allocateRegister().load(vuu_manzana).eqOp("ZZZ")).isLogicalOrDecided() ? us$R3 : us$R3.logicalOrOp(us$registerPool.allocateRegister().load(vuu_manzana).eqOp("UUU"))).getBooleanValueNullOk())
		    rejectRecord();
		TPrecioVAR.assign(us$registerPool.allocateRegister().load(TPrecioVAR).plusOp(us$registerPool.allocateRegister().load(vuu_precio_uni)));
		getSession().displayToMessageBox(us$registerPool.allocateRegister().load(TPrecioVAR).getStringValue());
	    } // onFind

	    public void afterFind()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		cajagrandeDUDisponibles.TPrecioFLD.assign(us$registerPool.allocateRegister().load(TPrecioVAR));
	    } // afterFind
	    public /*multi_valued*/ NullableFloatField vuu_area_const = new com.unify.nxj.mgr.datatypes.NXJFloatField(this, "vuu_area_const", true, true, 16);
	    public /*multi_valued*/ NullableFloatField vuu_area_lote = new com.unify.nxj.mgr.datatypes.NXJFloatField(this, "vuu_area_lote", true, true, 16);
	    public /*multi_valued*/ NullableStringField vuu_esquina = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_esquina", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_manzana", true, true, 3);
	    public /*multi_valued*/ NullableStringField vuu_modelo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_modelo", true, true, 3);
	    public /*multi_valued*/ NullableStringField vuu_muro1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_muro1", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_muro2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_muro2", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_parque = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_parque", true, true, 2);
	    public /*multi_valued*/ NullableAmountField vuu_precio_uni = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vuu_precio_uni", true, true, 25);
	    public /*multi_valued*/ NullableStringField vuu_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_unidad", true, true, 4);

	    public PUBLIC_vuu_unidades(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_vuu_unidades", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.vuu_unidades");
		setAutoFind(true);
		us$setAutoRefresh(true);
		setStartInAddMode(false);
		us$setBindingType("connection");
		vuu_area_const.setStyleClass("textfield");
		vuu_area_const.us$setMultiValued(true);
		vuu_area_const.us$setView("text");
		vuu_area_const.us$setFieldLength(16);
		vuu_area_const.us$setCandidateTargetColumnName("vuu_area_const");
		vuu_area_const.setValueRetrievedDuringFetch(true);
		vuu_area_const.setFindable(true);
		vuu_area_const.setUpdateable(true);
		vuu_area_const.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_area_const.setBackgroundColor("#999999");
		vuu_area_lote.setStyleClass("textfield");
		vuu_area_lote.us$setMultiValued(true);
		vuu_area_lote.us$setView("text");
		vuu_area_lote.us$setFieldLength(16);
		vuu_area_lote.us$setCandidateTargetColumnName("vuu_area_lote");
		vuu_area_lote.setValueRetrievedDuringFetch(true);
		vuu_area_lote.setFindable(true);
		vuu_area_lote.setUpdateable(true);
		vuu_area_lote.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_area_lote.setBackgroundColor("#999999");
		vuu_esquina.setStyleClass("textfield");
		vuu_esquina.us$setMultiValued(true);
		vuu_esquina.us$setView("text");
		vuu_esquina.us$setFieldLength(2);
		vuu_esquina.us$setCandidateTargetColumnName("vuu_esquina");
		vuu_esquina.setValueRetrievedDuringFetch(true);
		vuu_esquina.setFindable(true);
		vuu_esquina.setUpdateable(true);
		vuu_esquina.setBackgroundColor("#999999");
		vuu_manzana.setStyleClass("textfield");
		vuu_manzana.us$setMultiValued(true);
		vuu_manzana.us$setView("text");
		vuu_manzana.us$setFieldLength(3);
		vuu_manzana.us$setCandidateTargetColumnName("vuu_manzana");
		vuu_manzana.setValueRetrievedDuringFetch(true);
		vuu_manzana.setFindable(true);
		vuu_manzana.setUpdateable(true);
		vuu_manzana.setBackgroundColor("#999999");
		vuu_modelo.setStyleClass("textfield");
		vuu_modelo.us$setMultiValued(true);
		vuu_modelo.us$setView("text");
		vuu_modelo.us$setFieldLength(3);
		vuu_modelo.us$setCandidateTargetColumnName("vuu_modelo");
		vuu_modelo.setValueRetrievedDuringFetch(true);
		vuu_modelo.setFindable(true);
		vuu_modelo.setUpdateable(true);
		vuu_modelo.setBackgroundColor("#999999");
		vuu_muro1.setStyleClass("textfield");
		vuu_muro1.us$setMultiValued(true);
		vuu_muro1.us$setView("text");
		vuu_muro1.us$setFieldLength(2);
		vuu_muro1.us$setCandidateTargetColumnName("vuu_muro1");
		vuu_muro1.setValueRetrievedDuringFetch(true);
		vuu_muro1.setFindable(true);
		vuu_muro1.setUpdateable(true);
		vuu_muro1.setBackgroundColor("#999999");
		vuu_muro2.setStyleClass("textfield");
		vuu_muro2.us$setMultiValued(true);
		vuu_muro2.us$setView("text");
		vuu_muro2.us$setFieldLength(2);
		vuu_muro2.us$setCandidateTargetColumnName("vuu_muro2");
		vuu_muro2.setValueRetrievedDuringFetch(true);
		vuu_muro2.setFindable(true);
		vuu_muro2.setUpdateable(true);
		vuu_muro2.setBackgroundColor("#999999");
		vuu_parque.setStyleClass("textfield");
		vuu_parque.us$setMultiValued(true);
		vuu_parque.us$setView("text");
		vuu_parque.us$setFieldLength(2);
		vuu_parque.us$setCandidateTargetColumnName("vuu_parque");
		vuu_parque.setValueRetrievedDuringFetch(true);
		vuu_parque.setFindable(true);
		vuu_parque.setUpdateable(true);
		vuu_parque.setBackgroundColor("#999999");
		vuu_precio_uni.setStyleClass("textfield");
		vuu_precio_uni.us$setMultiValued(true);
		vuu_precio_uni.us$setView("text");
		vuu_precio_uni.us$setFieldLength(25);
		vuu_precio_uni.us$setCandidateTargetColumnName("vuu_precio_uni");
		vuu_precio_uni.setValueRetrievedDuringFetch(true);
		vuu_precio_uni.setFindable(true);
		vuu_precio_uni.setUpdateable(true);
		vuu_precio_uni.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_precio_uni.setBackgroundColor("#999999");
		vuu_unidad.setStyleClass("textfield");
		vuu_unidad.us$setMultiValued(true);
		vuu_unidad.us$setView("text");
		vuu_unidad.us$setFieldLength(4);
		vuu_unidad.us$setCandidateTargetColumnName("vuu_unidad");
		vuu_unidad.setValueRetrievedDuringFetch(true);
		vuu_unidad.setFindable(true);
		vuu_unidad.setUpdateable(true);
		vuu_unidad.setBackgroundColor("#999999");
		us$addTargetMapping("vuu_empresa", "vuu_empresa");
		us$addTargetMapping("vuu_obra", "vuu_obra");
		us$addTargetMapping("vuu_estado", "vuu_estado");
	    } // <init>
	} // PUBLIC_vuu_unidades

	public final PUBLIC_vuu_unidades PUBLIC_vuu_unidades = new PUBLIC_vuu_unidades(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.DUDisponiblesFRM.cajagrandeDUDisponibles.box11.this, "image1", false);
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
	public class cajaarribaDUDisponibles
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(ModuloCNegocios.DUDisponiblesFRM.cajagrandeDUDisponibles.cajaarribaDUDisponibles.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	    public cajaarribaDUDisponibles(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaDUDisponibles", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaDUDisponiblespropertySetter_0();
	    } // <init>

	    private void cajaarribaDUDisponiblespropertySetter_0()
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
	    } // cajaarribaDUDisponiblespropertySetter_0
	} // cajaarribaDUDisponibles

	public final cajaarribaDUDisponibles cajaarribaDUDisponibles = new cajaarribaDUDisponibles(this);

	public cajagrandeDUDisponibles(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeDUDisponibles", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    xob_proyecto.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	    {

		public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		    throws Exception
		{
		    if (values.length != 1)
			throw new Exception("TODO: handle value array size mismatch");
		    xob_proyecto.us$assignZoomValue(values[0]);
		} // assignValues
	    });
	    cajagrandeDUDisponiblespropertySetter_0();
	} // <init>

	private void cajagrandeDUDisponiblespropertySetter_0()
	{
	    TPrecioFLD.setStyleClass("textfield");
	    TPrecioFLD.us$setMultiValued(false);
	    TPrecioFLD.us$setView("text");
	    TPrecioFLD.setAutoAccept(false);
	    TPrecioFLD.setFindable(false);
	    TPrecioFLD.setUpdateable(false);
	    TPrecioFLD.setStopForInput(false);
	    TUnidades.setStyleClass("textfield");
	    TUnidades.us$setView("text");
	    TUnidades.setFindable(false);
	    TUnidades.setUpdateable(false);
	    TUnidades.setStopForInput(false);
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
	    vpy_nombre.setStyleClass("textfield");
	    vpy_nombre.us$setMultiValued(true);
	    vpy_nombre.us$setView("text");
	    vpy_nombre.setAutoAccept(true);
	    vpy_nombre.setFindable(true);
	    vpy_nombre.setUpdateable(false);
	    vpy_nombre.setStopForInput(false);
	    vpy_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	    xob_nombre.setStyleClass("textfield");
	    xob_nombre.us$setMultiValued(true);
	    xob_nombre.us$setView("text");
	    xob_nombre.us$setFieldLength(30);
	    xob_nombre.us$setCandidateTargetColumnName("xob_nombre");
	    xob_nombre.setValueRetrievedDuringFetch(true);
	    xob_nombre.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    xob_nombre.setFindable(true);
	    xob_nombre.setUpdateable(false);
	    xob_nombre.setStopForInput(false);
	    xob_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	    xob_obra.setStyleClass("textfield");
	    xob_obra.us$setMultiValued(true);
	    xob_obra.us$setView("text");
	    xob_obra.us$setFieldLength(2);
	    xob_obra.setAutoAccept(true);
	    xob_obra.us$setCandidateTargetColumnName("xob_obra");
	    xob_obra.setValueRetrievedDuringFetch(true);
	    xob_obra.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    xob_obra.setFindable(true);
	    xob_obra.setUpdateable(true);
	    xob_obra.setCaseConversion(NullableField.CaseConversion_UPPER);
	} // cajagrandeDUDisponiblespropertySetter_0
    } // cajagrandeDUDisponibles

    public final cajagrandeDUDisponibles cajagrandeDUDisponibles = new cajagrandeDUDisponibles(this);

    public DUDisponiblesFRM(NXJSession session, NXJForm prevForm)
    {
	super("DUDisponiblesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected DUDisponiblesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.xob_obras");
	setStartInAddMode(false);
	us$setBindingType("connection");
	ModuloCNegocios.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterDataView(ModuloCNegocios.DUDisponiblesFRM.this);
	ModuloCNegocios.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterRelationshipCriteria(ModuloCNegocios.DUDisponiblesFRM.this.us$getPUBLIC_vuu_unidades_1_FindExpressions());
	ModuloCNegocios.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterRelationshipAddExpr(ModuloCNegocios.DUDisponiblesFRM.this.us$getPUBLIC_vuu_unidades_1_AddExpressions());
	us$setBackgroundColor("#999999");
	us$addTargetMapping("xob_empresa", "xob_empresa");
	us$addProxyObject(ModuloCNegocios.DUDisponiblesFRM.class, "TUnidades", false);
	us$addProxyObject(ModuloCNegocios.DUDisponiblesFRM.class, "TPrecioVAR", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "DUDisponiblesFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(ModuloCNegocios.DUDisponiblesFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(ModuloCNegocios.DUDisponiblesFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(ModuloCNegocios.DUDisponiblesFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // DUDisponiblesFRM

