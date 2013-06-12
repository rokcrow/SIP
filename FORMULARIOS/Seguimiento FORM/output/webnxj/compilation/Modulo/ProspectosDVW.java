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
import org.systinet.wasp.webservice.ServiceClient;

public class ProspectosDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    private ProspectosDVW ProspectosDVW = this;
    public NXJLabelControl Label1 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label1", false);
    public NXJLabelControl Label10 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label10", false);
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
    public NXJLabelControl Label43 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "Label43", false);
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
		NXJDataConnection us$conn1 = getConnection();
		java.sql.PreparedStatement us$stmt1 = null;
		ResultSet us$rs1 = null;
		try
		    {
		    us$stmt1 = us$conn1.prepareStatement("select vpy_nombre from vpy_proyectos order by vpy_nombre");
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
    public /*multi_valued*/ NullableStringField vpp_actitiempo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_actitiempo", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_actividad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_actividad", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_califica = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_califica", true, true, 2);
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
				if (us$rowCount++ == 300)
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
    public /*multi_valued*/ NullableStringField vpp_corredor = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_corredor", true, true, 3);
    public /*multi_valued*/ NullableStringField vpp_correo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_correo", true, true, 40);
    public /*multi_valued*/ NullableStringField vpp_cuanta_correo2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_cuanta_correo2", true, true, 40);
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
		NXJDataConnection us$conn3 = getConnection();
		java.sql.PreparedStatement us$stmt3 = null;
		ResultSet us$rs3 = null;
		try
		    {
		    us$stmt3 = us$conn3.prepareStatement("select xzo_nombre from xzo_zonas");
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
			while (us$getter3.next())
			    {
			    ++us$rowsTouched3;
			    us$proj1 = us$getter3.getString(1);

				{
				if (us$rowCount++ == 300)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
    public /*multi_valued*/ NullableStringField vpp_estadopro = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_estadopro", true, true, 2);
    public /*multi_valued*/ NullableDateField vpp_fecha = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fecha", true, true, 100);
    public /*multi_valued*/ NullableDateField vpp_fecha_nacio = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fecha_nacio", true, true, 100);
    public /*multi_valued*/ NullableDateField vpp_fecha_visita = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fecha_visita", true, true, 100);
    public /*multi_valued*/ NullableDateField vpp_fechaestado = new com.unify.nxj.mgr.datatypes.NXJDateField(this, "vpp_fechaestado", true, true, 100);
    public /*multi_valued*/ NullableStringField vpp_genero = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_genero", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_ingreso = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_ingreso", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_mediodes = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_mediodes", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_mediopub = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_mediopub", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_motivo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_motivo", true, true, 2);
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
		NXJDataConnection us$conn4 = getConnection();
		java.sql.PreparedStatement us$stmt4 = null;
		ResultSet us$rs4 = null;
		try
		    {
		    us$stmt4 = us$conn4.prepareStatement("select xpa_nombre from xpa_paises");
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
			while (us$getter4.next())
			    {
			    ++us$rowsTouched4;
			    us$proj1 = us$getter4.getString(1);

				{
				if (us$rowCount++ == 300)
				    break;
				us$list.add(new com.unify.pub.NameValuePair(us$proj1, us$proj1));
				}
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
    public /*multi_valued*/ NullableStringField vpp_proyecto = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_proyecto", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_referido_celular = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_celular", true, true, 20);
    public /*multi_valued*/ NullableStringField vpp_referido_correo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_correo", true, true, 40);
    public /*multi_valued*/ NullableStringField vpp_referido_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_nombre", true, true, 80);
    public /*multi_valued*/ NullableStringField vpp_referido_sn = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_sn", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_referido_telefono = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_referido_telefono", true, true, 20);
    public /*multi_valued*/ NullableStringField vpp_tcompra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_tcompra", true, true, 2);
    public /*multi_valued*/ NullableStringField vpp_telofi = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telofi", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_telres = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_telres", true, true, 30);
    public /*multi_valued*/ NullableStringField vpp_vendedor = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_vendedor", true, true, 3);
    public /*multi_valued*/ NullableStringField vpp_viviactual = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_viviactual", true, true, 2);
    public /*multi_valued*/ NullableStringField vpy_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpy_nombre", true, true, 100);
    public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
    public NullableStringField xpc_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_nombre", false, true, 100);
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.ProspectosDVW.box11.this, "image1", false);
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
		super(Modulo.ProspectosDVW.box111.this, "label1", false);
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

    public ProspectosDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setConnectionName("DataServerCon");
	us$setTargetTableName("PUBLIC.vpp_prospectos");
	setAutoFind(true);
	setStartInAddMode(false);
	us$setBackgroundColor("#cccccc");
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
	Label43.setStyleClass("label");
	Label43.setForegroundColor("Black");
	Label43.setFontSize("12");
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
	vmp_descripcion.setFindable(false);
	vmp_descripcion.setUpdateable(false);
	vmp_descripcion.setStopForInput(false);
	vmp_descripcion.setCaseConversion(NullableField.CaseConversion_UPPER);
	vmp_descripcion.setForegroundColor("Black");
	vmp_descripcion.setFontSize("12");
	vpp_actitiempo.setStyleClass("dropdown_list");
	vpp_actitiempo.us$setMultiValued(true);
	vpp_actitiempo.us$setView("select");
	vpp_actitiempo.us$setFieldLength(2);
	vpp_actitiempo.setAutoAccept(true);
	vpp_actitiempo.us$setCandidateTargetColumnName("vpp_actitiempo");
	vpp_actitiempo.setValueRetrievedDuringFetch(true);
	vpp_actitiempo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_actitiempo.setFindable(true);
	vpp_actitiempo.setUpdateable(true);
	vpp_actitiempo.setForegroundColor("Black");
	vpp_actitiempo.setFontSize("12");
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
	vpp_califica.setStyleClass("textfield");
	vpp_califica.us$setMultiValued(true);
	vpp_califica.us$setView("text");
	vpp_califica.us$setFieldLength(2);
	vpp_califica.us$setCandidateTargetColumnName("vpp_califica");
	vpp_califica.setValueRetrievedDuringFetch(true);
	vpp_califica.setFindable(true);
	vpp_califica.setUpdateable(true);
	vpp_califica.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_califica.setZoomFormName("parametros/gradointe");
	vpp_califica.setZoomEnabled(true);
	vpp_califica.setForegroundColor("Black");
	vpp_califica.setFontSize("12");
	vpp_corredor.setStyleClass("textfield");
	vpp_corredor.us$setMultiValued(true);
	vpp_corredor.us$setView("text");
	vpp_corredor.us$setFieldLength(3);
	vpp_corredor.us$setCandidateTargetColumnName("vpp_corredor");
	vpp_corredor.setValueRetrievedDuringFetch(true);
	vpp_corredor.setFindable(true);
	vpp_corredor.setUpdateable(true);
	vpp_corredor.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_corredor.setZoomFormName("parametros/corredores");
	vpp_corredor.setZoomEnabled(true);
	vpp_corredor.setForegroundColor("Black");
	vpp_corredor.setFontSize("12");
	vpp_correo.setStyleClass("textfield");
	vpp_correo.us$setMultiValued(true);
	vpp_correo.us$setView("text");
	vpp_correo.us$setFieldLength(40);
	vpp_correo.us$setCandidateTargetColumnName("vpp_correo");
	vpp_correo.setValueRetrievedDuringFetch(true);
	vpp_correo.setFindable(true);
	vpp_correo.setUpdateable(true);
	vpp_correo.setForegroundColor("Black");
	vpp_correo.setFontSize("12");
	vpp_cuanta_correo2.setStyleClass("textfield");
	vpp_cuanta_correo2.us$setMultiValued(true);
	vpp_cuanta_correo2.us$setView("text");
	vpp_cuanta_correo2.us$setFieldLength(40);
	vpp_cuanta_correo2.us$setCandidateTargetColumnName("vpp_cuanta_correo2");
	vpp_cuanta_correo2.setValueRetrievedDuringFetch(true);
	vpp_cuanta_correo2.setFindable(true);
	vpp_cuanta_correo2.setUpdateable(true);
	vpp_cuanta_correo2.setForegroundColor("Black");
	vpp_cuanta_correo2.setFontSize("12");
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
	vpp_estadopro.setStyleClass("dropdown_list");
	vpp_estadopro.us$setMultiValued(true);
	vpp_estadopro.us$setView("select");
	vpp_estadopro.us$setFieldLength(2);
	vpp_estadopro.setAutoAccept(true);
	vpp_estadopro.us$setCandidateTargetColumnName("vpp_estadopro");
	vpp_estadopro.setValueRetrievedDuringFetch(true);
	vpp_estadopro.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_estadopro.setRequired(true);
	vpp_estadopro.setFindable(true);
	vpp_estadopro.setUpdateable(true);
	vpp_estadopro.us$setMultiValuedOptions(false);
	vpp_estadopro.setFontSize("12");
	vpp_fecha.setStyleClass("textfield");
	vpp_fecha.us$setMultiValued(true);
	vpp_fecha.us$setView("date");
	vpp_fecha.us$setCandidateTargetColumnName("vpp_fecha");
	vpp_fecha.setValueRetrievedDuringFetch(true);
	vpp_fecha.setRequired(true);
	vpp_fecha.setFindable(true);
	vpp_fecha.setUpdateable(true);
	vpp_fecha_nacio.setStyleClass("textfield");
	vpp_fecha_nacio.us$setMultiValued(true);
	vpp_fecha_nacio.us$setView("date");
	vpp_fecha_nacio.us$setCandidateTargetColumnName("vpp_fecha_nacio");
	vpp_fecha_nacio.setValueRetrievedDuringFetch(true);
	vpp_fecha_nacio.setFindable(true);
	vpp_fecha_nacio.setUpdateable(true);
	vpp_fecha_nacio.setForegroundColor("Black");
	vpp_fecha_nacio.setFontSize("12");
	vpp_fecha_visita.setStyleClass("textfield");
	vpp_fecha_visita.us$setMultiValued(true);
	vpp_fecha_visita.us$setView("date");
	vpp_fecha_visita.us$setCandidateTargetColumnName("vpp_fecha_visita");
	vpp_fecha_visita.setValueRetrievedDuringFetch(true);
	vpp_fecha_visita.setRequired(true);
	vpp_fecha_visita.setFindable(true);
	vpp_fecha_visita.setUpdateable(true);
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
	vpp_mediodes.setFindable(true);
	vpp_mediodes.setUpdateable(true);
	vpp_mediodes.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_mediodes.setForegroundColor("Black");
	vpp_mediodes.setFontSize("12");
	vpp_mediopub.setStyleClass("textfield");
	vpp_mediopub.us$setMultiValued(true);
	vpp_mediopub.us$setView("text");
	vpp_mediopub.us$setFieldLength(2);
	vpp_mediopub.us$setCandidateTargetColumnName("vpp_mediopub");
	vpp_mediopub.setValueRetrievedDuringFetch(true);
	vpp_mediopub.setFindable(true);
	vpp_mediopub.setUpdateable(true);
	vpp_mediopub.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_mediopub.setForegroundColor("Black");
	vpp_mediopub.setFontSize("12");
	vpp_motivo.setStyleClass("dropdown_list");
	vpp_motivo.us$setMultiValued(true);
	vpp_motivo.us$setView("select");
	vpp_motivo.us$setFieldLength(2);
	vpp_motivo.setAutoAccept(true);
	vpp_motivo.us$setCandidateTargetColumnName("vpp_motivo");
	vpp_motivo.setValueRetrievedDuringFetch(true);
	vpp_motivo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_motivo.setFindable(true);
	vpp_motivo.setUpdateable(true);
	vpp_motivo.setForegroundColor("Black");
	vpp_motivo.setFontSize("12");
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
	vpp_proyecto.setStyleClass("textfield");
	vpp_proyecto.us$setMultiValued(true);
	vpp_proyecto.us$setView("text");
	vpp_proyecto.us$setFieldLength(2);
	vpp_proyecto.setAutoAccept(true);
	vpp_proyecto.us$setCandidateTargetColumnName("vpp_proyecto");
	vpp_proyecto.setValueRetrievedDuringFetch(true);
	vpp_proyecto.setRequired(true);
	vpp_proyecto.setFindable(true);
	vpp_proyecto.setUpdateable(true);
	vpp_proyecto.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_proyecto.setZoomFormName("parametros/proyectos");
	vpp_proyecto.setZoomEnabled(true);
	vpp_proyecto.setForegroundColor("Black");
	vpp_proyecto.setFontSize("12");
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
	vpp_referido_correo.setStyleClass("textfield");
	vpp_referido_correo.us$setMultiValued(true);
	vpp_referido_correo.us$setView("text");
	vpp_referido_correo.us$setFieldLength(40);
	vpp_referido_correo.us$setCandidateTargetColumnName("vpp_referido_correo");
	vpp_referido_correo.setValueRetrievedDuringFetch(true);
	vpp_referido_correo.setFindable(true);
	vpp_referido_correo.setUpdateable(true);
	vpp_referido_correo.setForegroundColor("Black");
	vpp_referido_correo.setFontSize("12");
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
	vpp_referido_sn.setStyleClass("dropdown_list");
	vpp_referido_sn.us$setMultiValued(true);
	vpp_referido_sn.us$setView("select");
	vpp_referido_sn.us$setFieldLength(2);
	vpp_referido_sn.setAutoAccept(true);
	vpp_referido_sn.us$setCandidateTargetColumnName("vpp_referido_sn");
	vpp_referido_sn.setValueRetrievedDuringFetch(true);
	vpp_referido_sn.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	vpp_referido_sn.setFindable(true);
	vpp_referido_sn.setUpdateable(true);
	vpp_referido_sn.setForegroundColor("Black");
	vpp_referido_sn.setFontSize("12");
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
	vpp_vendedor.setStyleClass("textfield");
	vpp_vendedor.us$setMultiValued(true);
	vpp_vendedor.us$setView("text");
	vpp_vendedor.us$setFieldLength(3);
	vpp_vendedor.us$setCandidateTargetColumnName("vpp_vendedor");
	vpp_vendedor.setValueRetrievedDuringFetch(true);
	vpp_vendedor.setFindable(true);
	vpp_vendedor.setUpdateable(true);
	vpp_vendedor.setCaseConversion(NullableField.CaseConversion_UPPER);
	vpp_vendedor.setZoomFormName("parametros/vendedor");
	vpp_vendedor.setZoomEnabled(true);
	vpp_vendedor.setZoomActiveMode(NXJCommand.ActiveMode_BOTH);
	vpp_vendedor.setForegroundColor("Black");
	vpp_vendedor.setFontSize("12");
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
	vpy_nombre.setFindable(false);
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
    } // <init>
} // ProspectosDVW

