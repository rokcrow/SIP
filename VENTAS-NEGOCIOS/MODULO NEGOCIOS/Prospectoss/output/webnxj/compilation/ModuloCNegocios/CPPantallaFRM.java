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

public class CPPantallaFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable xob_empresa = NullableFactory.createNullableStringVariable(this, "xob_empresa", true, false);
    NullableString etapa_activa = NullableFactory.createNullableString("etapa_activa");

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
	cajagrandeCPPantalla.xxx.assign(us$registerPool.allocateRegister().load("31"));
    } // beforeForm

    public com.unify.nxj.mgr.NXJMasterRelationshipExpression[] us$getPUBLIC_vlp_listapre_1_FindExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterRelationshipExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vlp_empresa";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, CPPantallaFRM.xob_empresa, null)
			};
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vlp_obra";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, cajagrandeCPPantalla.xob_obra, null)
			};
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vlp_listapre_1_FindExpressions

    public com.unify.nxj.mgr.NXJMasterAddExpression[] us$getPUBLIC_vlp_listapre_1_AddExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterAddExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vlp_empresa";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return CPPantallaFRM.xob_empresa;
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vlp_obra";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return cajagrandeCPPantalla.xob_obra;
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vlp_listapre_1_AddExpressions
    private CPPantallaFRM CPPantallaFRM = this;
    public class cajagrandeCPPantalla
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label33 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label33", false);
	public /*multi_valued*/ NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", true, true, 100);
	public /*multi_valued*/ NullableStringField xob_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_nombre", true, true, 30);
	public class xob_obra
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

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
			us$stmt1 = us$conn1.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_empresa =  ?  AND vev_obra =  ?  AND vev_estado = \'A\'");
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt1, 1);
			xob_obra.us$setSqlParameterValue(us$stmt1, 2);
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
				us$getter1.assignValueToVariable(etapa_activa, 1);
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
		    getSession().displayToMessageBox("No hay etapas de ventas activas para al obra.");
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
			us$stmt2 = us$conn2.prepareStatement("SELECT vev_etapactu FROM vev_etapaven WHERE vev_empresa =  ?  AND vev_obra =  ?  AND vev_estado = \'A\'");
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt2, 1);
			xob_obra.us$setSqlParameterValue(us$stmt2, 2);
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
				us$getter2.assignValueToVariable(etapa_activa, 1);
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

	    public xob_obra()
	    {
		super(ModuloCNegocios.CPPantallaFRM.cajagrandeCPPantalla.this, "xob_obra", true, true, 2);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(2);
		setAutoAccept(true);
		us$setCandidateTargetColumnName("xob_obra");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setFindable(true);
		setUpdateable(true);
		setCaseConversion(NullableField.CaseConversion_UPPER);
		setZoomFormName("ModuloCNegocios/ObrasFRM");
		setZoomEnabled(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // xob_obra

	public /*multi_valued*/ xob_obra xob_obra = new xob_obra();
	public class xob_proyecto
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn3 = getConnection();
		    java.sql.PreparedStatement us$stmt3 = null;
		    ResultSet us$rs3 = null;
		    try
			{
			us$stmt3 = us$conn3.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?  ORDER BY vpy_codigo ASC");
			xob_proyecto.us$setSqlParameterValue(us$stmt3, 1);
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt3, 2);
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
				us$getter3.assignValueToVariable(vpy_nombre, 1);
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
		    NXJDataConnection us$conn4 = getConnection();
		    java.sql.PreparedStatement us$stmt4 = null;
		    ResultSet us$rs4 = null;
		    try
			{
			us$stmt4 = us$conn4.prepareStatement("SELECT vpy_nombre FROM vpy_proyectos WHERE vpy_codigo =  ?  AND vpy_empresa =  ?");
			xob_proyecto.us$setSqlParameterValue(us$stmt4, 1);
			((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt4, 2);
			us$rs4 = us$stmt4.executeQuery();
			int us$rowsTouched4 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd4 = us$rs4.getMetaData();
			    if (us$rsmd4.getColumnCount() != 1)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd4.getColumnCount()), "1"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter4 = us$conn4.createDataIterator(us$rs4);
			    if (us$getter4.next())
				{
				++us$rowsTouched4;
				us$getter4.assignValueToVariable(vpy_nombre, 1);
				}
			    }
			finally
			    {
			    if (us$rowsTouched4 == 0)
				getSession().us$setStatus(StatusCode.SS_NOREC);
			    if (us$rs4 != null)
				us$rs4.close();
			    }
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
	    } // whenValueChanges

	    public xob_proyecto()
	    {
		super(ModuloCNegocios.CPPantallaFRM.cajagrandeCPPantalla.this, "xob_proyecto", true, true, 2);
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
	public NullableStringField xxx = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xxx", false, true, 100);
	public class PUBLIC_vlp_listapre
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    /*multi_valued*/ NullableStringVariable vlp_obra = NullableFactory.createNullableStringVariable(this, "vlp_obra", true, false);
	    /*multi_valued*/ NullableStringVariable vlp_empresa = NullableFactory.createNullableStringVariable(this, "vlp_empresa", true, false);
	    public /*multi_valued*/ NullableDateField vlp_f_final = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vlp_f_final", true, true, 10);
	    public /*multi_valued*/ NullableDateField vlp_f_inicial = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vlp_f_inicial", true, true, 10);
	    public /*multi_valued*/ NullableStringField vlp_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vlp_manzana", true, true, 3);
	    public /*multi_valued*/ NullableAmountField vlp_precio_uni = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vlp_precio_uni", true, true, 25);
	    public /*multi_valued*/ NullableStringField vlp_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vlp_unidad", true, true, 4);
	    public /*multi_valued*/ NullableStringField vlp_usuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vlp_usuario", true, true, 8);

	    public PUBLIC_vlp_listapre(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_vlp_listapre", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.vlp_listapre");
		setAutoFind(true);
		setStartInAddMode(false);
		us$setBindingType("connection");
		vlp_f_final.setStyleClass("textfield");
		vlp_f_final.us$setMultiValued(true);
		vlp_f_final.us$setView("text");
		vlp_f_final.us$setFieldLength(10);
		vlp_f_final.us$setCandidateTargetColumnName("vlp_f_final");
		vlp_f_final.setValueRetrievedDuringFetch(true);
		vlp_f_final.setFindable(true);
		vlp_f_final.setUpdateable(true);
		vlp_f_inicial.setStyleClass("textfield");
		vlp_f_inicial.us$setMultiValued(true);
		vlp_f_inicial.us$setView("text");
		vlp_f_inicial.us$setFieldLength(10);
		vlp_f_inicial.us$setCandidateTargetColumnName("vlp_f_inicial");
		vlp_f_inicial.setValueRetrievedDuringFetch(true);
		vlp_f_inicial.setFindable(true);
		vlp_f_inicial.setUpdateable(true);
		vlp_manzana.setStyleClass("textfield");
		vlp_manzana.us$setMultiValued(true);
		vlp_manzana.us$setView("text");
		vlp_manzana.us$setFieldLength(3);
		vlp_manzana.us$setCandidateTargetColumnName("vlp_manzana");
		vlp_manzana.setValueRetrievedDuringFetch(true);
		vlp_manzana.setFindable(true);
		vlp_manzana.setUpdateable(true);
		vlp_precio_uni.setStyleClass("textfield");
		vlp_precio_uni.us$setMultiValued(true);
		vlp_precio_uni.us$setView("text");
		vlp_precio_uni.us$setFieldLength(25);
		vlp_precio_uni.us$setCandidateTargetColumnName("vlp_precio_uni");
		vlp_precio_uni.setValueRetrievedDuringFetch(true);
		vlp_precio_uni.setFindable(true);
		vlp_precio_uni.setUpdateable(true);
		vlp_precio_uni.setDisplayJustify(NullableField.DisplayJustify_RIGHT);
		vlp_unidad.setStyleClass("textfield");
		vlp_unidad.us$setMultiValued(true);
		vlp_unidad.us$setView("text");
		vlp_unidad.us$setFieldLength(4);
		vlp_unidad.us$setCandidateTargetColumnName("vlp_unidad");
		vlp_unidad.setValueRetrievedDuringFetch(true);
		vlp_unidad.setFindable(true);
		vlp_unidad.setUpdateable(true);
		vlp_usuario.setStyleClass("textfield");
		vlp_usuario.us$setMultiValued(true);
		vlp_usuario.us$setView("text");
		vlp_usuario.us$setFieldLength(8);
		vlp_usuario.us$setCandidateTargetColumnName("vlp_usuario");
		vlp_usuario.setValueRetrievedDuringFetch(true);
		vlp_usuario.setFindable(true);
		vlp_usuario.setUpdateable(true);
		us$addTargetMapping("vlp_empresa", "vlp_empresa");
		us$addTargetMapping("vlp_obra", "vlp_obra");
	    } // <init>
	} // PUBLIC_vlp_listapre

	public final PUBLIC_vlp_listapre PUBLIC_vlp_listapre = new PUBLIC_vlp_listapre(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.CPPantallaFRM.cajagrandeCPPantalla.box11.this, "image1", false);
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
	public class cajaarribaCPPantalla
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(ModuloCNegocios.CPPantallaFRM.cajagrandeCPPantalla.cajaarribaCPPantalla.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);
	    public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	    public NullableStringField textfield11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield11", false, true, 100);

	    public cajaarribaCPPantalla(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaCPPantalla", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaCPPantallapropertySetter_0();
	    } // <init>

	    private void cajaarribaCPPantallapropertySetter_0()
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
	    } // cajaarribaCPPantallapropertySetter_0
	} // cajaarribaCPPantalla

	public final cajaarribaCPPantalla cajaarribaCPPantalla = new cajaarribaCPPantalla(this);

	public cajagrandeCPPantalla(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeCPPantalla", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    xob_obra.setZoomReturnValuesInto(new NXJZoomReturnValuesInto()
	    {

		public void assignValues(com.unify.nxj.mgr.datatypes.Register[] values)
		    throws Exception
		{
		    if (values.length != 1)
			throw new Exception("TODO: handle value array size mismatch");
		    xob_obra.us$assignZoomValue(values[0]);
		} // assignValues
	    });
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
	    cajagrandeCPPantallapropertySetter_0();
	} // <init>

	private void cajagrandeCPPantallapropertySetter_0()
	{
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	    label311.setStyleClass("label");
	    label311.setFontSize("12");
	    label33.setStyleClass("label");
	    label33.setFontSize("12");
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
	    xxx.setVisible(false);
	    xxx.setStyleClass("textfield");
	    xxx.us$setView("text");
	    xxx.setFindable(false);
	} // cajagrandeCPPantallapropertySetter_0
    } // cajagrandeCPPantalla

    public final cajagrandeCPPantalla cajagrandeCPPantalla = new cajagrandeCPPantalla(this);

    public CPPantallaFRM(NXJSession session, NXJForm prevForm)
    {
	super("CPPantallaFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected CPPantallaFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.xob_obras");
	setAutoFind(false);
	setStartInAddMode(false);
	us$setBindingType("connection");
	ModuloCNegocios.CPPantallaFRM.this.cajagrandeCPPantalla.PUBLIC_vlp_listapre.us$setMasterDataView(ModuloCNegocios.CPPantallaFRM.this);
	ModuloCNegocios.CPPantallaFRM.this.cajagrandeCPPantalla.PUBLIC_vlp_listapre.us$setMasterRelationshipCriteria(ModuloCNegocios.CPPantallaFRM.this.us$getPUBLIC_vlp_listapre_1_FindExpressions());
	ModuloCNegocios.CPPantallaFRM.this.cajagrandeCPPantalla.PUBLIC_vlp_listapre.us$setMasterRelationshipAddExpr(ModuloCNegocios.CPPantallaFRM.this.us$getPUBLIC_vlp_listapre_1_AddExpressions());
	us$setBackgroundColor("#999999");
	us$addTargetMapping("xob_empresa", "xob_empresa");
	us$addProxyObject(ModuloCNegocios.CPPantallaFRM.class, "etapa_activa", false);
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "CPPantallaFRM";

    protected com.unify.nxj.mgr.NXJProxyNullable us$createProxyNullable(java.lang.reflect.Field targetField, boolean multiValued)
    {
	return new NXJProxyNullableImpl(targetField, multiValued);
    } // us$createProxyNullable
    protected final class NXJProxyNullableImpl
	extends com.unify.nxj.mgr.NXJProxyNullable
    {

	public NXJProxyNullableImpl(java.lang.reflect.Field fld, boolean multiValued)
	{
	    super(ModuloCNegocios.CPPantallaFRM.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(ModuloCNegocios.CPPantallaFRM.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(ModuloCNegocios.CPPantallaFRM.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // CPPantallaFRM

