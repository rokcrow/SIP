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

public class SeguimientoDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    NullableDate fing_obra = NullableFactory.createNullableDate("fing_obra");
    NullableDate fret_obra = NullableFactory.createNullableDate("fret_obra");
    NullableDate fecha_mini = NullableFactory.createNullableDate("fecha_mini");
    NullableNumeric consecutivo = NullableFactory.createNullableNumeric("consecutivo");
    NullableNumeric xpc_dias_pvt = NullableFactory.createNullableNumeric("xpc_dias_pvt");
    NullableNumeric xpc_dias_pac = NullableFactory.createNullableNumeric("xpc_dias_pac");
    NullableString vendedora = NullableFactory.createNullableString("vendedora");
    NullableString estadopro_ant = NullableFactory.createNullableString("estadopro_ant");
    NullableString xpc_califica = NullableFactory.createNullableString("xpc_califica");
    NullableString xpr_usuario = NullableFactory.createNullableString("xpr_usuario");
    NullableString vpy_tipo = NullableFactory.createNullableString("vpy_tipo");
    NullableTime hora = NullableFactory.createNullableTime("hora");

    public void initDataView()
	throws Exception
    {
	vpp_estadopro.setClearFindExp(new NXJClearToFindExpression()
	{

	    public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		throws Exception
	    {
		return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
		    {
		    new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, new com.unify.nxj.mgr.datatypes.Register().load("A"), null)
		    };
	    } // evaluate
	});
    } // initDataView

    public com.unify.nxj.mgr.NXJMasterRelationshipExpression[] us$getPUBLIC_vps_prosigue_1_FindExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterRelationshipExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vps_proyecto";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, SeguimientoDVW.vpp_proyecto, null)
			};
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vps_prospecto";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, SeguimientoDVW.vpp_numero, null)
			};
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vps_prosigue_1_FindExpressions

    public com.unify.nxj.mgr.NXJMasterAddExpression[] us$getPUBLIC_vps_prosigue_1_AddExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterAddExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vps_proyecto";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return SeguimientoDVW.vpp_proyecto;
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vps_prospecto";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return SeguimientoDVW.vpp_numero;
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vps_prosigue_1_AddExpressions
    private SeguimientoDVW SeguimientoDVW = this;
    public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
    public NXJLabelControl label10 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label10", false);
    public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
    public NXJLabelControl label111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label111", false);
    public NXJLabelControl label11211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11211", false);
    public NXJLabelControl label12 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label12", false);
    public NXJLabelControl label13 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label13", false);
    public NXJLabelControl label14 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label14", false);
    public NXJLabelControl label2 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label2", false);
    public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
    public NXJLabelControl label4 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label4", false);
    public NXJLabelControl label5 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label5", false);
    public NXJLabelControl label6 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label6", false);
    public NXJLabelControl label7 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label7", false);
    public NXJLabelControl label8 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label8", false);
    public NXJLabelControl label9 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label9", false);
    public NXJLineControl line112 = new com.unify.nxj.mgr.datatypes.NXJLineImpl(this, "line112", false);
    public NXJLineControl line1121 = new com.unify.nxj.mgr.datatypes.NXJLineImpl(this, "line1121", false);
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
		NXJDataConnection us$conn1 = getConnection();
		java.sql.PreparedStatement us$stmt1 = null;
		ResultSet us$rs1 = null;
		try
		    {
		    us$stmt1 = us$conn1.prepareStatement("select xpa_nombre from xpa_paises order by xpa_nombre");
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
			while (us$getter1.next())
			    {
			    ++us$rowsTouched1;
			    us$proj1 = us$getter1.getString(1);

				{
				if (us$rowCount++ == 200)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_ciudad()
	{
	    super(Modulo.SeguimientoDVW.this, "vpp_ciudad", true, true, 30);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(30);
	    us$setCandidateTargetColumnName("vpp_ciudad");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_ciudad

    public /*multi_valued*/ vpp_ciudad vpp_ciudad = new vpp_ciudad();
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

	public vpp_correo()
	{
	    super(Modulo.SeguimientoDVW.this, "vpp_correo", true, true, 40);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(40);
	    us$setCandidateTargetColumnName("vpp_correo");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
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
	    super(Modulo.SeguimientoDVW.this, "vpp_cuanta_correo2", true, true, 100);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(100);
	    setValueRetrievedDuringFetch(false);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(false);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_cuanta_correo2

    public /*multi_valued*/ vpp_cuanta_correo2 vpp_cuanta_correo2 = new vpp_cuanta_correo2();
    public /*multi_valued*/ NullableStringField vpp_direccion = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_direccion", true, true, 30);
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
	    super(Modulo.SeguimientoDVW.this, "vpp_estadopro", true, true, 2);
	    setStyleClass("dropdown_list");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(2);
	    us$setCandidateTargetColumnName("vpp_estadopro");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesCodeBeforeInput = true;
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_estadopro

    public /*multi_valued*/ vpp_estadopro vpp_estadopro = new vpp_estadopro();
    public /*multi_valued*/ NullableDateField vpp_fecha = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fecha", true, true, 100);
    public /*multi_valued*/ NullableDateField vpp_fechaestado = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fechaestado", true, true, 100);
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
		NXJDataConnection us$conn2 = getConnection();
		java.sql.PreparedStatement us$stmt2 = null;
		ResultSet us$rs2 = null;
		try
		    {
		    us$stmt2 = us$conn2.prepareStatement("select xpa_nombre from xpa_paises");
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
			while (us$getter2.next())
			    {
			    ++us$rowsTouched2;
			    us$proj1 = us$getter2.getString(1);

				{
				if (us$rowCount++ == 200)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
	    return us$list;
	} // us$evaluateListboxQuery

	public vpp_nacionalidad()
	{
	    super(Modulo.SeguimientoDVW.this, "vpp_nacionalidad", true, true, 30);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("select");
	    us$setFieldLength(30);
	    us$setCandidateTargetColumnName("vpp_nacionalidad");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	} // <init>
    } // vpp_nacionalidad

    public /*multi_valued*/ vpp_nacionalidad vpp_nacionalidad = new vpp_nacionalidad();
    public /*multi_valued*/ NullableStringField vpp_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_nombre", true, true, 40);
    public /*multi_valued*/ NullableNumericField vpp_numero = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "vpp_numero", true, true, 11);
    public class vpp_proyecto
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn3 = getConnection();
		java.sql.PreparedStatement us$stmt3 = null;
		ResultSet us$rs3 = null;
		try
		    {
		    us$stmt3 = us$conn3.prepareStatement("SELECT vpy_nombre, vpy_tipo FROM vpy_proyectos WHERE vpy_codigo =  ?");
		    vpp_proyecto.us$setSqlParameterValue(us$stmt3, 1);
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
			if (us$getter3.next())
			    {
			    ++us$rowsTouched3;
			    us$getter3.assignValueToVariable(vpy_nombre, 1);
			    us$getter3.assignValueToVariable(vpy_tipo, 2);
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
	} // whenValueChanges

	public vpp_proyecto()
	{
	    super(Modulo.SeguimientoDVW.this, "vpp_proyecto", true, true, 2);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(2);
	    us$setCandidateTargetColumnName("vpp_proyecto");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setCaseConversion(NullableField.CaseConversion_UPPER);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_proyecto

    public /*multi_valued*/ vpp_proyecto vpp_proyecto = new vpp_proyecto();
    public /*multi_valued*/ NullableStringField vpp_telofi = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telofi", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_telres = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telres", true, true, 30);
    public class vpp_vendedor
	extends com.unify.nxj.mgr.datatypes.NXJStringField
    {

	public void onDataAccept()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn4 = getConnection();
		java.sql.PreparedStatement us$stmt4 = null;
		ResultSet us$rs4 = null;
		try
		    {
		    us$stmt4 = us$conn4.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
		    vpp_vendedor.us$setSqlParameterValue(us$stmt4, 1);
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
			    us$getter4.assignValueToVariable(vve_nombre, 1);
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("No existe el vendedor seleccionado en el maestro de vendedores");
		rejectOperation();
		}

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn5 = getConnection();
		java.sql.PreparedStatement us$stmt5 = null;
		ResultSet us$rs5 = null;
		try
		    {
		    us$stmt5 = us$conn5.prepareStatement("SELECT vvh_vendedora,vvh_fret_obra, vvh_fing_obra from vvh_venobras where vvh_empresa =  ?  and vvh_proyecto =  ?  and vvh_vendedora =  ?  order by vvh_fing_obra DESC");
		    ((Modulo.MenuFRM)us$findForm(Modulo.MenuFRM.class)).cajagrandeMenu.EMPRESA.us$setSqlParameterValue(us$stmt5, 1);
		    vpp_proyecto.us$setSqlParameterValue(us$stmt5, 2);
		    vpp_vendedor.us$setSqlParameterValue(us$stmt5, 3);
		    us$rs5 = us$stmt5.executeQuery();
		    int us$rowsTouched5 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd5 = us$rs5.getMetaData();
			if (us$rsmd5.getColumnCount() != 3)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd5.getColumnCount()), "3"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter5 = us$conn5.createDataIterator(us$rs5);
			if (us$getter5.next())
			    {
			    ++us$rowsTouched5;
			    us$getter5.assignValueToVariable(vendedora, 1);
			    us$getter5.assignValueToVariable(fret_obra, 2);
			    us$getter5.assignValueToVariable(fing_obra, 3);
			    }
			}
		    finally
			{
			if (us$rowsTouched5 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs5 != null)
			    us$rs5.close();
			}
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
	    if (getSession().getStatus() == StatusCode.SS_NOREC)
		{
		getSession().displayToMessageBox("La vendedora no pertenece al proyecto en cuestion");
		rejectOperation();
		}
	    if (!fret_obra.isNull() && fret_obra.toString() != "01/01/01")
		{
		if (us$registerPool.allocateRegister().load(fret_obra).ltOp(us$registerPool.allocateRegister().load(vpp_fecha)).getBooleanValueNullOk())
		    {
		    getSession().displayToMessageBox("La vendedora ya fue retirada del Proyecto");
		    rejectOperation();
		    }
		}
	} // onDataAccept

	public void whenValueChanges()
	    throws Exception
	{

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn6 = getConnection();
		java.sql.PreparedStatement us$stmt6 = null;
		ResultSet us$rs6 = null;
		try
		    {
		    us$stmt6 = us$conn6.prepareStatement("SELECT vve_nombre FROM vve_vendedora WHERE vve_codigo =  ?");
		    vpp_vendedor.us$setSqlParameterValue(us$stmt6, 1);
		    us$rs6 = us$stmt6.executeQuery();
		    int us$rowsTouched6 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd6 = us$rs6.getMetaData();
			if (us$rsmd6.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd6.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter6 = us$conn6.createDataIterator(us$rs6);
			if (us$getter6.next())
			    {
			    ++us$rowsTouched6;
			    us$getter6.assignValueToVariable(vve_nombre, 1);
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
	} // whenValueChanges

	public vpp_vendedor()
	{
	    super(Modulo.SeguimientoDVW.this, "vpp_vendedor", true, true, 3);
	    setStyleClass("textfield");
	    us$setMultiValued(true);
	    us$setView("text");
	    us$setFieldLength(3);
	    us$setCandidateTargetColumnName("vpp_vendedor");
	    setValueRetrievedDuringFetch(true);
	    setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    setFindable(true);
	    setUpdateable(true);
	    setForegroundColor("Black");
	    setFontSize("12");
	    us$executesDataAcceptValueChanges = true;
	} // <init>
    } // vpp_vendedor

    public /*multi_valued*/ vpp_vendedor vpp_vendedor = new vpp_vendedor();
    public NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", false, true, 100);
    public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
    public class PUBLIC_vps_prosigue
	extends com.unify.nxj.mgr.NXJDataView
    {
	/*multi_valued*/ NullableStringVariable vps_proyecto = NullableFactory.createNullableStringVariable(this, "vps_proyecto", true, false);
	/*multi_valued*/ NullableNumericVariable vps_prospecto = NullableFactory.createNullableNumericVariable(this, "vps_prospecto", true, false);

	public void onClearToAdd()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    vps_fecha.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	    vps_hora.assign(us$registerPool.allocateRegister().load(getSession().getCurrentTime()));
	    vps_usuario.assign(us$registerPool.allocateRegister().load(((Modulo.LoginFRM22)us$findForm(Modulo.LoginFRM22.class)).cajagrandeLogin.xpr_usuario));

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn7 = getConnection();
		java.sql.PreparedStatement us$stmt7 = null;
		ResultSet us$rs7 = null;
		try
		    {
		    us$stmt7 = us$conn7.prepareStatement("SELECT vps_consecu FROM vps_prosigue WHERE vps_proyecto =  ?  AND vps_prospecto =  ?  order by vps_consecu desc");
		    vpp_proyecto.us$setSqlParameterValue(us$stmt7, 1);
		    vpp_numero.us$setSqlParameterValue(us$stmt7, 2);
		    us$rs7 = us$stmt7.executeQuery();
		    int us$rowsTouched7 = 0;
		    try
			{
			java.sql.ResultSetMetaData us$rsmd7 = us$rs7.getMetaData();
			if (us$rsmd7.getColumnCount() != 1)
			    throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				{
				Integer.toString(us$rsmd7.getColumnCount()), "1"
				}));
			com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter7 = us$conn7.createDataIterator(us$rs7);
			if (us$getter7.next())
			    {
			    ++us$rowsTouched7;
			    us$getter7.assignValueToVariable(consecutivo, 1);
			    }
			}
		    finally
			{
			if (us$rowsTouched7 == 0)
			    getSession().us$setStatus(StatusCode.SS_NOREC);
			if (us$rs7 != null)
			    us$rs7.close();
			}
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
		if (getSession().getStatus() == StatusCode.SS_NOREC)
		    vps_consecu.assign(us$registerPool.allocateRegister().load(1));
		else
		    {
		    getSession().displayToMessageBox("El consecutivo esta ocupado por otro usuario");
		    getSession().queueCommand("CLEAR_TO_FIND");
		    }
		}
	    else
		vps_consecu.assign(us$registerPool.allocateRegister().load(consecutivo).plusOp(1));
	} // onClearToAdd

	public void beforeAdd()
	    throws Exception
	{
	    final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	    if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("I").getBooleanValueNullOk())
		vps_estado.assign(us$registerPool.allocateRegister().load("S"));
	    else
		if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("M").getBooleanValueNullOk())
		    vps_estado.assign(us$registerPool.allocateRegister().load("M"));
		else
		    if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("P").getBooleanValueNullOk())
			vps_estado.assign(us$registerPool.allocateRegister().load("N"));
	    NullableDate f_pcontacto = NullableFactory.createNullableDate("f_pcontacto");
	    f_pcontacto.assign(us$registerPool.allocateRegister().load(getSession().getCurrentDate()));
	    if (us$registerPool.allocateRegister().load(vpy_tipo).eqOp("A").getBooleanValueNullOk())
		vps_f_pcontacto.assign(us$registerPool.allocateRegister().load(f_pcontacto).plusOp(us$registerPool.allocateRegister().load(xpc_dias_pac)));
	    else
		vps_f_pcontacto.assign(us$registerPool.allocateRegister().load(f_pcontacto).plusOp(us$registerPool.allocateRegister().load(xpc_dias_pvt)));
	} // beforeAdd
	public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
	public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	public class vps_califica
	    extends com.unify.nxj.mgr.datatypes.NXJStringField
	{

	    public void onDataAccept()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn8 = getConnection();
		    java.sql.PreparedStatement us$stmt8 = null;
		    ResultSet us$rs8 = null;
		    try
			{
			us$stmt8 = us$conn8.prepareStatement("SELECT xpc_nombre, xpc_califica, xpc_dias_pac, xpc_dias_pvt FROM xpc_proscalif WHERE xpc_codigo =  ?");
			vps_califica.us$setSqlParameterValue(us$stmt8, 1);
			us$rs8 = us$stmt8.executeQuery();
			int us$rowsTouched8 = 0;
			try
			    {
			    java.sql.ResultSetMetaData us$rsmd8 = us$rs8.getMetaData();
			    if (us$rsmd8.getColumnCount() != 4)
				throw new SQLException(getSession().us$getMessage("EXPECTED_VS_ACTUAL_COLUMN_COUNT", new Object[]
				    {
				    Integer.toString(us$rsmd8.getColumnCount()), "4"
				    }));
			    com.unify.nxj.mgr.dataConnection.NXJDataIterator us$getter8 = us$conn8.createDataIterator(us$rs8);
			    if (us$getter8.next())
				{
				++us$rowsTouched8;
				us$getter8.assignValueToVariable(xpc_nombre, 1);
				us$getter8.assignValueToVariable(xpc_califica, 2);
				us$getter8.assignValueToVariable(xpc_dias_pac, 3);
				us$getter8.assignValueToVariable(xpc_dias_pvt, 4);
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
		if (getSession().getStatus() == StatusCode.SS_NOREC)
		    {
		    getSession().displayToMessageBox("No existe la calificacion seleccionado en el maestro");
		    rejectOperation();
		    }
		else
		    {
		    if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("I").getBooleanValueNullOk())
			vps_estado.assign(us$registerPool.allocateRegister().load("S"));
		    else
			if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("M").getBooleanValueNullOk())
			    vps_estado.assign(us$registerPool.allocateRegister().load("M"));
			else
			    if (us$registerPool.allocateRegister().load(xpc_califica).eqOp("P").getBooleanValueNullOk())
				vps_estado.assign(us$registerPool.allocateRegister().load("N"));
		    }
	    } // onDataAccept

	    public void whenValueChanges()
		throws Exception
	    {

		    {
		    getSession().us$setStatus(StatusCode.SS_NORM);
		    NXJDataConnection us$conn9 = getConnection();
		    java.sql.PreparedStatement us$stmt9 = null;
		    ResultSet us$rs9 = null;
		    try
			{
			us$stmt9 = us$conn9.prepareStatement("SELECT xpc_nombre, xpc_califica, xpc_dias_pac, xpc_dias_pvt FROM xpc_proscalif WHERE xpc_codigo =  ?");
			vps_califica.us$setSqlParameterValue(us$stmt9, 1);
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
	    } // whenValueChanges

	    public vps_califica()
	    {
		super(Modulo.SeguimientoDVW.PUBLIC_vps_prosigue.this, "vps_califica", true, true, 2);
		setStyleClass("textfield");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(2);
		us$setCandidateTargetColumnName("vps_califica");
		setValueRetrievedDuringFetch(true);
		setFindable(true);
		setUpdateable(true);
		setZoomFormName("parametros/gradointe");
		setZoomEnabled(true);
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vps_califica

	public /*multi_valued*/ vps_califica vps_califica = new vps_califica();
	public /*multi_valued*/ NullableStringField vps_comentario1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vps_comentario1", true, true, 120);
	public /*multi_valued*/ NullableNumericField vps_consecu = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "vps_consecu", true, true, 6);
	public /*multi_valued*/ NullableStringField vps_estado = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vps_estado", true, true, 2);
	public /*multi_valued*/ NullableDateField vps_f_pcontacto = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vps_f_pcontacto", true, true, 10);
	public /*multi_valued*/ NullableDateField vps_fecha = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vps_fecha", true, true, 10);
	public /*multi_valued*/ NullableTimeField vps_hora = new com.unify.nxj.mgr.datatypes.NXJTimeField(this, "vps_hora", true, true, 8);
	public /*multi_valued*/ NullableStringField vps_mediocon = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vps_mediocon", true, true, 2);
	public /*multi_valued*/ NullableStringField vps_usuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vps_usuario", true, true, 8);
	public /*multi_valued*/ NullableStringField xpc_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_nombre", true, true, 100);

	public PUBLIC_vps_prosigue(com.unify.nxj.mgr.NXJContainer container)
	{
	    super("PUBLIC_vps_prosigue", container);
	    us$setConnectionName("Connection1");
	    us$setTargetTableName("PUBLIC.vps_prosigue");
	    setAutoFind(true);
	    setStartInAddMode(false);
	    us$setBindingType("connection");
	    label1.setStyleClass("label");
	    label1.setFontSize("12");
	    textfield1.setStyleClass("textfield");
	    textfield1.us$setView("text");
	    textfield1.setFindable(false);
	    vps_comentario1.setStyleClass("textfield");
	    vps_comentario1.us$setMultiValued(true);
	    vps_comentario1.us$setView("text");
	    vps_comentario1.us$setFieldLength(120);
	    vps_comentario1.us$setCandidateTargetColumnName("vps_comentario1");
	    vps_comentario1.setValueRetrievedDuringFetch(true);
	    vps_comentario1.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vps_comentario1.setFindable(true);
	    vps_comentario1.setUpdateable(true);
	    vps_consecu.setStyleClass("textfield");
	    vps_consecu.us$setMultiValued(true);
	    vps_consecu.us$setView("text");
	    vps_consecu.us$setFieldLength(6);
	    vps_consecu.us$setCandidateTargetColumnName("vps_consecu");
	    vps_consecu.setValueRetrievedDuringFetch(true);
	    vps_consecu.setFindable(true);
	    vps_consecu.setUpdateable(true);
	    vps_consecu.setStopForInput(false);
	    vps_estado.setStyleClass("textfield");
	    vps_estado.us$setMultiValued(true);
	    vps_estado.us$setView("select");
	    vps_estado.us$setFieldLength(2);
	    vps_estado.us$setCandidateTargetColumnName("vps_estado");
	    vps_estado.setValueRetrievedDuringFetch(true);
	    vps_estado.setFindable(true);
	    vps_estado.setUpdateable(true);
	    vps_estado.setStopForInput(false);
	    vps_f_pcontacto.setStyleClass("textfield");
	    vps_f_pcontacto.us$setMultiValued(true);
	    vps_f_pcontacto.us$setView("text");
	    vps_f_pcontacto.us$setFieldLength(10);
	    vps_f_pcontacto.us$setCandidateTargetColumnName("vps_f_pcontacto");
	    vps_f_pcontacto.setValueRetrievedDuringFetch(true);
	    vps_f_pcontacto.setFindable(true);
	    vps_f_pcontacto.setUpdateable(true);
	    vps_f_pcontacto.setStopForInput(false);
	    vps_fecha.setStyleClass("textfield");
	    vps_fecha.us$setMultiValued(true);
	    vps_fecha.us$setView("text");
	    vps_fecha.us$setFieldLength(10);
	    vps_fecha.us$setCandidateTargetColumnName("vps_fecha");
	    vps_fecha.setValueRetrievedDuringFetch(true);
	    vps_fecha.setFindable(true);
	    vps_fecha.setUpdateable(true);
	    vps_fecha.setStopForInput(false);
	    vps_hora.setStyleClass("textfield");
	    vps_hora.us$setMultiValued(true);
	    vps_hora.us$setView("text");
	    vps_hora.us$setFieldLength(8);
	    vps_hora.us$setCandidateTargetColumnName("vps_hora");
	    vps_hora.setValueRetrievedDuringFetch(true);
	    vps_hora.setFindable(true);
	    vps_hora.setUpdateable(true);
	    vps_hora.setStopForInput(false);
	    vps_mediocon.setStyleClass("textfield");
	    vps_mediocon.us$setMultiValued(true);
	    vps_mediocon.us$setView("select");
	    vps_mediocon.us$setFieldLength(2);
	    vps_mediocon.us$setCandidateTargetColumnName("vps_mediocon");
	    vps_mediocon.setValueRetrievedDuringFetch(true);
	    vps_mediocon.setFindable(true);
	    vps_mediocon.setUpdateable(true);
	    vps_usuario.setStyleClass("textfield");
	    vps_usuario.us$setMultiValued(true);
	    vps_usuario.us$setView("text");
	    vps_usuario.us$setFieldLength(8);
	    vps_usuario.us$setCandidateTargetColumnName("vps_usuario");
	    vps_usuario.setValueRetrievedDuringFetch(true);
	    vps_usuario.setFindable(true);
	    vps_usuario.setUpdateable(true);
	    vps_usuario.setStopForInput(false);
	    xpc_nombre.setStyleClass("textfield");
	    xpc_nombre.us$setMultiValued(true);
	    xpc_nombre.us$setView("text");
	    xpc_nombre.setFindable(false);
	    xpc_nombre.setStopForInput(false);
	    us$addTargetMapping("vps_proyecto", "vps_proyecto");
	    us$addTargetMapping("vps_prospecto", "vps_prospecto");
	} // <init>
    } // PUBLIC_vps_prosigue

    public final PUBLIC_vps_prosigue PUBLIC_vps_prosigue = new PUBLIC_vps_prosigue(this);
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.SeguimientoDVW.box11.this, "image1", false);
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
		super(Modulo.SeguimientoDVW.box111.this, "label1", false);
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

    public SeguimientoDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.vpp_prospectos");
	setAutoFind(false);
	setStartInAddMode(false);
	us$setBindingType("connection");
	Modulo.SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterDataView(Modulo.SeguimientoDVW.this);
	Modulo.SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterRelationshipCriteria(Modulo.SeguimientoDVW.this.us$getPUBLIC_vps_prosigue_1_FindExpressions());
	Modulo.SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterRelationshipAddExpr(Modulo.SeguimientoDVW.this.us$getPUBLIC_vps_prosigue_1_AddExpressions());
	Modulo.SeguimientoDVW.this.us$setMasterDataView(Modulo.SeguimientoDVW.this.PUBLIC_vps_prosigue);
	us$setBackgroundColor("#cccccc");
	label1.setStyleClass("label");
	label1.setForegroundColor("Black");
	label1.setFontSize("12");
	label10.setStyleClass("label");
	label10.setForegroundColor("Black");
	label10.setFontSize("12");
	label11.setStyleClass("label");
	label11.setForegroundColor("Black");
	label11.setFontFamily("Verdana");
	label11.setFontSize("14");
	label11.us$setFontWeight("bold");
	label111.setStyleClass("label");
	label111.setForegroundColor("Black");
	label111.setFontSize("12");
	label11211.setStyleClass("label");
	label11211.setForegroundColor("Black");
	label11211.setFontFamily("Verdana");
	label11211.setFontSize("14");
	label11211.us$setFontWeight("bold");
	label12.setStyleClass("label");
	label12.setForegroundColor("Black");
	label12.setFontSize("12");
	label13.setStyleClass("label");
	label13.setForegroundColor("Black");
	label13.setFontSize("12");
	label14.setStyleClass("label");
	label14.setForegroundColor("Black");
	label14.setFontSize("12");
	label2.setStyleClass("label");
	label2.setForegroundColor("Black");
	label2.setFontSize("12");
	label3.setStyleClass("label");
	label3.setForegroundColor("Black");
	label3.setFontSize("12");
	label4.setStyleClass("label");
	label4.setForegroundColor("Black");
	label4.setFontSize("12");
	label5.setStyleClass("label");
	label5.setForegroundColor("Black");
	label5.setFontSize("12");
	label6.setStyleClass("label");
	label6.setForegroundColor("Black");
	label6.setFontSize("12");
	label7.setStyleClass("label");
	label7.setForegroundColor("Black");
	label7.setFontSize("12");
	label8.setStyleClass("label");
	label8.setForegroundColor("Black");
	label8.setFontSize("12");
	label9.setStyleClass("label");
	label9.setForegroundColor("Black");
	label9.setFontSize("12");
	line112.setStyleClass("horizontal_line");
	line112.setForegroundColor("#ff0033");
	line1121.setStyleClass("horizontal_line");
	line1121.setForegroundColor("#ff0033");
	vpp_direccion.setStyleClass("textfield");
	vpp_direccion.us$setMultiValued(true);
	vpp_direccion.us$setView("text");
	vpp_direccion.us$setFieldLength(30);
	vpp_direccion.us$setCandidateTargetColumnName("vpp_direccion");
	vpp_direccion.setValueRetrievedDuringFetch(true);
	vpp_direccion.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_direccion.setFindable(true);
	vpp_direccion.setUpdateable(true);
	vpp_direccion.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_direccion.setForegroundColor("Black");
	vpp_direccion.setFontSize("12");
	vpp_fecha.setStyleClass("textfield");
	vpp_fecha.us$setMultiValued(true);
	vpp_fecha.us$setView("date");
	vpp_fecha.us$setCandidateTargetColumnName("vpp_fecha");
	vpp_fecha.setValueRetrievedDuringFetch(true);
	vpp_fecha.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_fecha.setFindable(true);
	vpp_fecha.setUpdateable(true);
	vpp_fecha.setForegroundColor("Black");
	vpp_fecha.setFontSize("12");
	vpp_fechaestado.setStyleClass("textfield");
	vpp_fechaestado.us$setMultiValued(true);
	vpp_fechaestado.us$setView("date");
	vpp_fechaestado.us$setCandidateTargetColumnName("vpp_fechaestado");
	vpp_fechaestado.setValueRetrievedDuringFetch(true);
	vpp_fechaestado.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_fechaestado.setFindable(true);
	vpp_fechaestado.setUpdateable(true);
	vpp_fechaestado.setForegroundColor("Black");
	vpp_fechaestado.setFontSize("12");
	vpp_nombre.setStyleClass("textfield");
	vpp_nombre.us$setMultiValued(true);
	vpp_nombre.us$setView("text");
	vpp_nombre.us$setFieldLength(40);
	vpp_nombre.setAutoAccept(false);
	vpp_nombre.us$setCandidateTargetColumnName("vpp_nombre");
	vpp_nombre.setValueRetrievedDuringFetch(true);
	vpp_nombre.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_nombre.setFindable(true);
	vpp_nombre.setUpdateable(true);
	vpp_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_nombre.setForegroundColor("Black");
	vpp_nombre.setFontSize("12");
	vpp_numero.setStyleClass("textfield");
	vpp_numero.us$setMultiValued(true);
	vpp_numero.us$setView("text");
	vpp_numero.us$setFieldLength(11);
	vpp_numero.us$setCandidateTargetColumnName("vpp_numero");
	vpp_numero.setValueRetrievedDuringFetch(true);
	vpp_numero.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_numero.setFindable(true);
	vpp_numero.setUpdateable(true);
	vpp_numero.setForegroundColor("Black");
	vpp_numero.setFontSize("12");
	vpp_telofi.setStyleClass("textfield");
	vpp_telofi.us$setMultiValued(true);
	vpp_telofi.us$setView("text");
	vpp_telofi.us$setFieldLength(30);
	vpp_telofi.us$setCandidateTargetColumnName("vpp_telofi");
	vpp_telofi.setValueRetrievedDuringFetch(true);
	vpp_telofi.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
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
	vpp_telres.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_telres.setFindable(true);
	vpp_telres.setUpdateable(true);
	vpp_telres.setForegroundColor("Black");
	vpp_telres.setFontSize("12");
	vpy_nombre.setStyleClass("textfield");
	vpy_nombre.us$setView("text");
	vpy_nombre.setFindable(false);
	vpy_nombre.setStopForInput(false);
	vpy_nombre.setForegroundColor("Black");
	vpy_nombre.setFontSize("12");
	vve_nombre.setStyleClass("textfield");
	vve_nombre.us$setView("text");
	vve_nombre.setFindable(false);
	vve_nombre.setForegroundColor("Black");
	vve_nombre.setFontSize("12");
	us$addProxyObject(Modulo.SeguimientoDVW.class, "hora", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "vpy_tipo", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "xpr_usuario", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "xpc_califica", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "estadopro_ant", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "vendedora", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "xpc_dias_pac", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "xpc_dias_pvt", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "consecutivo", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "fecha_mini", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "fret_obra", false);
	us$addProxyObject(Modulo.SeguimientoDVW.class, "fing_obra", false);
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
	    super(Modulo.SeguimientoDVW.this, fld, multiValued);
	} // <init>

	protected Nullable getValue()
	    throws IllegalAccessException
	{
	    return (Nullable)fld.get(Modulo.SeguimientoDVW.this);
	} // getValue

	protected void setValue(Nullable newValue)
	    throws IllegalAccessException
	{
	    fld.set(Modulo.SeguimientoDVW.this, newValue);
	} // setValue
    } // NXJProxyNullableImpl

} // SeguimientoDVW

