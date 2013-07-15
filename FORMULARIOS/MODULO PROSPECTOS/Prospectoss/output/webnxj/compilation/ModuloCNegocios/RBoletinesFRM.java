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

public class RBoletinesFRM
    extends com.unify.nxj.mgr.NXJForm
{
    private RBoletinesFRM RBoletinesFRM = this;
    public class box1
	extends com.unify.nxj.mgr.NXJBox
    {
	public NullableStringField date1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date1", false, true, 100);
	public NullableStringField date11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date11", false, true, 100);
	public NullableStringField date111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date111", false, true, 100);
	public NullableStringField date2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date2", false, true, 100);
	public NullableStringField date21 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date21", false, true, 100);
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public NXJLabelControl label31111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111", false);
	public NXJLabelControl label311111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311111", false);
	public NXJLabelControl label3111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111111", false);
	public NXJLabelControl label31111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111111", false);
	public NXJLabelControl label311111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311111111", false);
	public NXJLabelControl label31111112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31111112", false);
	public NXJLabelControl label312 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label312", false);
	public NXJLabelControl label3121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3121", false);
	public NXJLabelControl label313 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313", false);
	public NXJLabelControl label3131 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131", false);
	public NXJLabelControl label31311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311", false);
	public NXJLabelControl label313111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111", false);
	public NXJLabelControl label3131111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111", false);
	public NXJLabelControl label313111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111", false);
	public NXJLabelControl label3131111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111", false);
	public NXJLabelControl label31311111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111", false);
	public NXJLabelControl label313111111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111111", false);
	public NXJLabelControl label3131111111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111111", false);
	public NXJLabelControl label313111111112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112", false);
	public NXJLabelControl label3131111111121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121", false);
	public NXJLabelControl label31311111111211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211", false);
	public NXJLabelControl label313111111112111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111", false);
	public NXJLabelControl label3131111111121111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121111", false);
	public NXJLabelControl label31311111111211111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211111", false);
	public NXJLabelControl label313111111112111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111111", false);
	public NXJLabelControl label3131111111121112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3131111111121112", false);
	public NXJLabelControl label31311111111211121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31311111111211121", false);
	public NXJLabelControl label313111111112111211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label313111111112111211", false);
	public NullableStringField select1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select1", false, true, 100);
	public NullableStringField select11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select11", false, true, 100);
	public NullableStringField select111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select111", false, true, 100);
	public NullableStringField select2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select2", false, true, 100);
	public NullableStringField select21 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select21", false, true, 100);
	public NullableStringField select211 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "select211", false, true, 100);
	public NullableStringField textarea1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textarea1", false, true, 0);
	public NullableStringField textfield12 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12", false, true, 100);
	public NullableStringField textfield121 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield121", false, true, 100);
	public NullableStringField textfield122 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield122", false, true, 100);
	public NullableStringField textfield123 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield123", false, true, 100);
	public NullableStringField textfield1231 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231", false, true, 100);
	public NullableStringField textfield12311 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12311", false, true, 100);
	public NullableStringField textfield123111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield123111", false, true, 100);
	public NullableStringField textfield1231111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231111", false, true, 100);
	public NullableStringField textfield12311111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12311111", false, true, 100);
	public NullableStringField textfield123111111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield123111111", false, true, 100);
	public NullableStringField textfield12311112 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12311112", false, true, 100);
	public NullableStringField textfield12312 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12312", false, true, 100);
	public NullableStringField textfield123121 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield123121", false, true, 100);
	public NullableStringField textfield1231211 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231211", false, true, 100);
	public NullableStringField textfield12312111 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12312111", false, true, 100);
	public NullableStringField textfield12312112 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12312112", false, true, 100);
	public NullableStringField textfield123122 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield123122", false, true, 100);
	public NullableStringField textfield1231221 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231221", false, true, 100);
	public NullableStringField textfield1231222 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231222", false, true, 100);
	public NullableStringField textfield12312221 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12312221", false, true, 100);
	public NullableStringField textfield12312222 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield12312222", false, true, 100);
	public NullableStringField textfield1231223 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1231223", false, true, 100);
	public NullableStringField textfield1232 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1232", false, true, 100);
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
		    NXJDataConnection us$conn1 = getConnection();
		    java.sql.PreparedStatement us$stmt1 = null;
		    ResultSet us$rs1 = null;
		    try
			{
			us$stmt1 = us$conn1.prepareStatement("select xzo_nombre from xzo_zonas");
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
				    if (us$rowCount++ == 300)
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

	    public vpp_direccion()
	    {
		super(ModuloCNegocios.RBoletinesFRM.box1.this, "vpp_direccion", true, true, 30);
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
	public /*multi_valued*/ NullableStringField vpp_vendedor = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vpp_vendedor", true, true, 3);
	public NullableStringField vve_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vve_nombre", false, true, 100);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.RBoletinesFRM.box1.box11.this, "image1", false);
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
		    super(ModuloCNegocios.RBoletinesFRM.box1.box111.this, "label1", false);
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

	public box1(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("box1", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
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
	    box1propertySetter_0();
	    box1propertySetter_1();
	    box1propertySetter_2();
	    box1propertySetter_3();
	} // <init>

	private void box1propertySetter_0()
	{
	    date1.setStyleClass("date_picker");
	    date1.us$setView("date");
	    date11.setStyleClass("date_picker");
	    date11.us$setView("date");
	    date111.setStyleClass("date_picker");
	    date111.us$setView("date");
	    date2.setStyleClass("date_picker");
	    date2.us$setView("date");
	    date21.setStyleClass("date_picker");
	    date21.us$setView("date");
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
	    label3111.setStyleClass("label");
	    label3111.setFontSize("12");
	    label31111.setStyleClass("label");
	    label31111.setFontSize("12");
	    label311111.setStyleClass("label");
	    label311111.setFontSize("12");
	    label3111111.setStyleClass("label");
	    label3111111.setFontSize("12");
	    label31111111.setStyleClass("label");
	    label31111111.setFontSize("12");
	    label311111111.setStyleClass("label");
	    label311111111.setFontSize("12");
	    label31111112.setStyleClass("label");
	    label31111112.setFontSize("12");
	    label312.setStyleClass("label");
	    label312.setFontSize("12");
	    label3121.setStyleClass("label");
	    label3121.setFontSize("12");
	    label313.setStyleClass("label");
	    label313.setFontSize("12");
	    label3131.setStyleClass("label");
	    label3131.setFontSize("12");
	} // box1propertySetter_0

	private void box1propertySetter_1()
	{
	    label31311.setStyleClass("label");
	    label31311.setFontSize("12");
	    label313111.setStyleClass("label");
	    label313111.setFontSize("12");
	    label3131111.setStyleClass("label");
	    label3131111.setFontSize("12");
	    label313111111.setStyleClass("label");
	    label313111111.setFontSize("12");
	    label3131111111.setStyleClass("label");
	    label3131111111.setFontSize("12");
	    label31311111111.setStyleClass("label");
	    label31311111111.setFontSize("12");
	    label313111111111.setStyleClass("label");
	    label313111111111.setFontSize("12");
	    label3131111111111.setStyleClass("label");
	    label3131111111111.setFontSize("12");
	    label313111111112.setStyleClass("label");
	    label313111111112.setFontSize("12");
	    label3131111111121.setStyleClass("label");
	    label3131111111121.setFontSize("12");
	    label31311111111211.setStyleClass("label");
	    label31311111111211.setFontSize("12");
	    label313111111112111.setStyleClass("label");
	    label313111111112111.setFontSize("12");
	    label3131111111121111.setStyleClass("label");
	    label3131111111121111.setFontSize("12");
	    label31311111111211111.setStyleClass("label");
	    label31311111111211111.setFontSize("12");
	    label313111111112111111.setStyleClass("label");
	    label313111111112111111.setFontSize("12");
	    label3131111111121112.setStyleClass("label");
	    label3131111111121112.setFontSize("12");
	    label31311111111211121.setStyleClass("label");
	    label31311111111211121.setFontSize("12");
	    label313111111112111211.setStyleClass("label");
	    label313111111112111211.setFontSize("12");
	    select1.setStyleClass("dropdown_list");
	    select1.us$setView("select");
	    select1.setFindable(false);
	    select11.setStyleClass("dropdown_list");
	    select11.us$setView("select");
	    select11.setFindable(false);
	} // box1propertySetter_1

	private void box1propertySetter_2()
	{
	    select111.setStyleClass("dropdown_list");
	    select111.us$setView("select");
	    select111.setFindable(false);
	    select2.setStyleClass("dropdown_list");
	    select2.us$setView("select");
	    select2.setFindable(false);
	    select21.setVisible(true);
	    select21.setStyleClass("dropdown_list");
	    select21.us$setView("select");
	    select21.setFindable(false);
	    select211.setStyleClass("dropdown_list");
	    select211.us$setView("select");
	    select211.setFindable(false);
	    textarea1.setStyleClass("textarea");
	    textarea1.us$setView("textarea");
	    textarea1.us$setFieldLength(0);
	    textarea1.setFindable(false);
	    textfield12.setStyleClass("textfield");
	    textfield12.us$setView("text");
	    textfield12.setFindable(false);
	    textfield121.setStyleClass("textfield");
	    textfield121.us$setView("text");
	    textfield121.setFindable(false);
	    textfield122.setStyleClass("textfield");
	    textfield122.us$setView("text");
	    textfield122.setFindable(false);
	    textfield123.setStyleClass("textfield");
	    textfield123.us$setView("text");
	    textfield123.setFindable(false);
	    textfield1231.setStyleClass("textfield");
	    textfield1231.us$setView("text");
	    textfield1231.setFindable(false);
	    textfield12311.setStyleClass("textfield");
	    textfield12311.us$setView("text");
	    textfield12311.setFindable(false);
	    textfield123111.setStyleClass("textfield");
	    textfield123111.us$setView("text");
	    textfield123111.setFindable(false);
	    textfield1231111.setStyleClass("textfield");
	    textfield1231111.us$setView("text");
	    textfield1231111.setFindable(false);
	    textfield12311111.setStyleClass("textfield");
	    textfield12311111.us$setView("text");
	    textfield12311111.setFindable(false);
	    textfield123111111.setStyleClass("textfield");
	    textfield123111111.us$setView("text");
	    textfield123111111.setFindable(false);
	    textfield12311112.setStyleClass("textfield");
	    textfield12311112.us$setView("text");
	    textfield12311112.setFindable(false);
	    textfield12312.setStyleClass("textfield");
	    textfield12312.us$setView("text");
	    textfield12312.setFindable(false);
	    textfield123121.setStyleClass("textfield");
	    textfield123121.us$setView("text");
	    textfield123121.setFindable(false);
	    textfield1231211.setStyleClass("textfield");
	    textfield1231211.us$setView("text");
	    textfield1231211.setFindable(false);
	    textfield12312111.setStyleClass("textfield");
	    textfield12312111.us$setView("text");
	    textfield12312111.setFindable(false);
	} // box1propertySetter_2

	private void box1propertySetter_3()
	{
	    textfield12312112.setStyleClass("textfield");
	    textfield12312112.us$setView("text");
	    textfield12312112.setFindable(false);
	    textfield123122.setStyleClass("textfield");
	    textfield123122.us$setView("text");
	    textfield123122.setFindable(false);
	    textfield1231221.setStyleClass("textfield");
	    textfield1231221.us$setView("text");
	    textfield1231221.setFindable(false);
	    textfield1231222.setStyleClass("textfield");
	    textfield1231222.us$setView("text");
	    textfield1231222.setFindable(false);
	    textfield12312221.setStyleClass("textfield");
	    textfield12312221.us$setView("text");
	    textfield12312221.setFindable(false);
	    textfield12312222.setStyleClass("textfield");
	    textfield12312222.us$setView("text");
	    textfield12312222.setFindable(false);
	    textfield1231223.setStyleClass("textfield");
	    textfield1231223.us$setView("text");
	    textfield1231223.setFindable(false);
	    textfield1232.setStyleClass("textfield");
	    textfield1232.us$setView("text");
	    textfield1232.setFindable(false);
	    vpp_vendedor.setStyleClass("textfield");
	    vpp_vendedor.us$setMultiValued(true);
	    vpp_vendedor.us$setView("text");
	    vpp_vendedor.us$setFieldLength(3);
	    vpp_vendedor.setAutoAccept(true);
	    vpp_vendedor.us$setCandidateTargetColumnName("vpp_vendedor");
	    vpp_vendedor.setValueRetrievedDuringFetch(true);
	    vpp_vendedor.setFindable(true);
	    vpp_vendedor.setUpdateable(true);
	    vpp_vendedor.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vpp_vendedor.setZoomFormName("Modulo/VendedoresFRM");
	    vpp_vendedor.setZoomEnabled(true);
	    vpp_vendedor.setZoomActiveMode(NXJCommand.ActiveMode_BOTH);
	    vpp_vendedor.setForegroundColor("Black");
	    vpp_vendedor.setFontSize("12");
	    vve_nombre.setStyleClass("textfield");
	    vve_nombre.us$setView("text");
	    vve_nombre.setFindable(false);
	    vve_nombre.setUpdateable(false);
	    vve_nombre.setStopForInput(false);
	    vve_nombre.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vve_nombre.setForegroundColor("Black");
	    vve_nombre.setFontSize("12");
	} // box1propertySetter_3
    } // box1

    public final box1 box1 = new box1(this);

    public RBoletinesFRM(NXJSession session, NXJForm prevForm)
    {
	super("RBoletinesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected RBoletinesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setBindingType("connection");
	us$setBackgroundColor("#999999");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "RBoletinesFRM";
} // RBoletinesFRM

