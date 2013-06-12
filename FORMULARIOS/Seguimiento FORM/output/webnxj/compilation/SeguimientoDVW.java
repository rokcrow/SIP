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
import org.systinet.wasp.webservice.ServiceClient;

public class SeguimientoDVW
    extends com.unify.nxj.mgr.NXJDataView
{

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
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, <form>.vpp_proyecto, null)
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
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, <form>.vpp_numero, null)
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
		    return <form>.vpp_proyecto;
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
		    return <form>.vpp_numero;
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
	    super(SeguimientoDVW.this, "vpp_ciudad", true, true, 30);
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
    public /*multi_valued*/ NullableStringField vpp_correo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_correo", true, true, 40);
    public /*multi_valued*/ NullableStringField vpp_cuanta_correo2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_cuanta_correo2", true, true, 100);
    public /*multi_valued*/ NullableStringField vpp_direccion = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_direccion", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_estadopro = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_estadopro", true, true, 2);
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
	    super(SeguimientoDVW.this, "vpp_nacionalidad", true, true, 30);
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
    public /*multi_valued*/ NullableStringField vpp_proyecto = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_proyecto", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_telofi = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telofi", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_telres = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telres", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_vendedor = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_vendedor", true, true, 3);
    public NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", false, true, 100);
    public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
    public class PUBLIC_vps_prosigue
	extends com.unify.nxj.mgr.NXJDataView
    {
	public NXJLabelControl label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label1", false);
	public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	public /*multi_valued*/ NullableStringField vps_califica = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vps_califica", true, true, 2);
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
	    us$setConnectionName("DataServerCon");
	    us$setTargetTableName("PUBLIC.vps_prosigue");
	    setAutoFind(true);
	    setStartInAddMode(false);
	    us$setBindingType("connection");
	    label1.setStyleClass("label");
	    label1.setFontSize("12");
	    textfield1.setStyleClass("textfield");
	    textfield1.us$setView("text");
	    textfield1.setFindable(false);
	    vps_califica.setStyleClass("textfield");
	    vps_califica.us$setMultiValued(true);
	    vps_califica.us$setView("text");
	    vps_califica.us$setFieldLength(2);
	    vps_califica.us$setCandidateTargetColumnName("vps_califica");
	    vps_califica.setValueRetrievedDuringFetch(true);
	    vps_califica.setFindable(true);
	    vps_califica.setUpdateable(true);
	    vps_califica.setZoomFormName("parametros/gradointe");
	    vps_califica.setZoomEnabled(true);
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
		super(SeguimientoDVW.box11.this, "image1", false);
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
		super(SeguimientoDVW.box111.this, "label1", false);
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
	us$setConnectionName("DataServerCon");
	us$setTargetTableName("PUBLIC.vpp_prospectos");
	setAutoFind(true);
	setStartInAddMode(false);
	SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterDataView(SeguimientoDVW.this);
	SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterRelationshipCriteria(SeguimientoDVW.this.us$getPUBLIC_vps_prosigue_1_FindExpressions());
	SeguimientoDVW.this.PUBLIC_vps_prosigue.us$setMasterRelationshipAddExpr(SeguimientoDVW.this.us$getPUBLIC_vps_prosigue_1_AddExpressions());
	SeguimientoDVW.this.us$setMasterDataView(SeguimientoDVW.this.PUBLIC_vps_prosigue);
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
	vpp_correo.setStyleClass("textfield");
	vpp_correo.us$setMultiValued(true);
	vpp_correo.us$setView("text");
	vpp_correo.us$setFieldLength(40);
	vpp_correo.us$setCandidateTargetColumnName("vpp_correo");
	vpp_correo.setValueRetrievedDuringFetch(true);
	vpp_correo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_correo.setFindable(true);
	vpp_correo.setUpdateable(true);
	vpp_correo.setForegroundColor("Black");
	vpp_correo.setFontSize("12");
	vpp_cuanta_correo2.setStyleClass("textfield");
	vpp_cuanta_correo2.us$setMultiValued(true);
	vpp_cuanta_correo2.us$setView("text");
	vpp_cuanta_correo2.us$setFieldLength(100);
	vpp_cuanta_correo2.setValueRetrievedDuringFetch(false);
	vpp_cuanta_correo2.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_cuanta_correo2.setFindable(false);
	vpp_cuanta_correo2.setUpdateable(true);
	vpp_cuanta_correo2.setForegroundColor("Black");
	vpp_cuanta_correo2.setFontSize("12");
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
	vpp_estadopro.setStyleClass("dropdown_list");
	vpp_estadopro.us$setMultiValued(true);
	vpp_estadopro.us$setView("select");
	vpp_estadopro.us$setFieldLength(2);
	vpp_estadopro.us$setCandidateTargetColumnName("vpp_estadopro");
	vpp_estadopro.setValueRetrievedDuringFetch(true);
	vpp_estadopro.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_estadopro.setFindable(true);
	vpp_estadopro.setUpdateable(true);
	vpp_estadopro.setForegroundColor("Black");
	vpp_estadopro.setFontSize("12");
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
	vpp_proyecto.setStyleClass("textfield");
	vpp_proyecto.us$setMultiValued(true);
	vpp_proyecto.us$setView("text");
	vpp_proyecto.us$setFieldLength(2);
	vpp_proyecto.us$setCandidateTargetColumnName("vpp_proyecto");
	vpp_proyecto.setValueRetrievedDuringFetch(true);
	vpp_proyecto.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_proyecto.setFindable(true);
	vpp_proyecto.setUpdateable(true);
	vpp_proyecto.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_proyecto.setForegroundColor("Black");
	vpp_proyecto.setFontSize("12");
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
	vpp_vendedor.setStyleClass("textfield");
	vpp_vendedor.us$setMultiValued(true);
	vpp_vendedor.us$setView("text");
	vpp_vendedor.us$setFieldLength(3);
	vpp_vendedor.us$setCandidateTargetColumnName("vpp_vendedor");
	vpp_vendedor.setValueRetrievedDuringFetch(true);
	vpp_vendedor.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_vendedor.setFindable(true);
	vpp_vendedor.setUpdateable(true);
	vpp_vendedor.setForegroundColor("Black");
	vpp_vendedor.setFontSize("12");
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
    } // <init>
} // SeguimientoDVW

