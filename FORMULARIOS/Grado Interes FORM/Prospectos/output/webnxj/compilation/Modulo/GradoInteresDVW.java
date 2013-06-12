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

public class GradoInteresDVW
    extends com.unify.nxj.mgr.NXJDataView
{
    private GradoInteresDVW GradoInteresDVW = this;
    public NXJNavigationBarControl navigationbar1 = new com.unify.nxj.mgr.datatypes.NXJNavigationBarControlImpl(this, "navigationbar1", false);
    public /*multi_valued*/ NullableStringField xpc_califica = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_califica", true, true, 2);
    public /*multi_valued*/ NullableStringField xpc_clase = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_clase", true, true, 2);
    public /*multi_valued*/ NullableStringField xpc_codigo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_codigo", true, true, 2);
    public /*multi_valued*/ NullableNumericField xpc_dias_pac = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "xpc_dias_pac", true, true, 6);
    public /*multi_valued*/ NullableNumericField xpc_dias_pvt = new com.unify.nxj.mgr.datatypes.NXJNumericField(this, "xpc_dias_pvt", true, true, 6);
    public /*multi_valued*/ NullableStringField xpc_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xpc_nombre", true, true, 100);
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(Modulo.GradoInteresDVW.box11.this, "image1", false);
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
		super(Modulo.GradoInteresDVW.box111.this, "label1", false);
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

    public GradoInteresDVW(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setBackgroundColor("#cccccc");
	navigationbar1.setStyleClass("navigation");
	xpc_califica.setStyleClass("textfield");
	xpc_califica.us$setMultiValued(true);
	xpc_califica.us$setView("select");
	xpc_califica.us$setFieldLength(2);
	xpc_califica.us$setCandidateTargetColumnName("xpc_califica");
	xpc_califica.setValueRetrievedDuringFetch(true);
	xpc_califica.setFindable(true);
	xpc_califica.setUpdateable(true);
	xpc_clase.setStyleClass("textfield");
	xpc_clase.us$setMultiValued(true);
	xpc_clase.us$setView("select");
	xpc_clase.us$setFieldLength(2);
	xpc_clase.us$setCandidateTargetColumnName("xpc_clase");
	xpc_clase.setValueRetrievedDuringFetch(true);
	xpc_clase.setFindable(true);
	xpc_clase.setUpdateable(true);
	xpc_codigo.setStyleClass("textfield");
	xpc_codigo.us$setMultiValued(true);
	xpc_codigo.us$setView("text");
	xpc_codigo.us$setFieldLength(2);
	xpc_codigo.us$setCandidateTargetColumnName("xpc_codigo");
	xpc_codigo.setValueRetrievedDuringFetch(true);
	xpc_codigo.setFindable(true);
	xpc_codigo.setUpdateable(true);
	xpc_dias_pac.setStyleClass("textfield");
	xpc_dias_pac.us$setMultiValued(true);
	xpc_dias_pac.us$setView("text");
	xpc_dias_pac.us$setFieldLength(6);
	xpc_dias_pac.us$setCandidateTargetColumnName("xpc_dias_pac");
	xpc_dias_pac.setValueRetrievedDuringFetch(true);
	xpc_dias_pac.setFindable(true);
	xpc_dias_pac.setUpdateable(true);
	xpc_dias_pvt.setStyleClass("textfield");
	xpc_dias_pvt.us$setMultiValued(true);
	xpc_dias_pvt.us$setView("text");
	xpc_dias_pvt.us$setFieldLength(6);
	xpc_dias_pvt.us$setCandidateTargetColumnName("xpc_dias_pvt");
	xpc_dias_pvt.setValueRetrievedDuringFetch(true);
	xpc_dias_pvt.setFindable(true);
	xpc_dias_pvt.setUpdateable(true);
	xpc_nombre.setStyleClass("textfield");
	xpc_nombre.us$setMultiValued(true);
	xpc_nombre.us$setView("text");
	xpc_nombre.us$setFieldLength(100);
	xpc_nombre.us$setCandidateTargetColumnName("xpc_nombre");
	xpc_nombre.setValueRetrievedDuringFetch(true);
	xpc_nombre.setFindable(true);
	xpc_nombre.setUpdateable(true);
    } // <init>
} // GradoInteresDVW

