package ItemsForm;

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

public class Standar
    extends com.unify.nxj.mgr.NXJDataView
{
    private Standar Standar = this;
    public NullableStringField date1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "date1", false, true, 100);
    public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
    public NXJLabelControl label111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label111", false);
    public NXJLabelControl label2111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label2111", false);
    public NXJLabelControl label21111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label21111", false);
    public NXJLabelControl label211111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211111", false);
    public NXJLabelControl label2111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label2111111", false);
    public NXJLabelControl label21111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label21111111", false);
    public NXJLabelControl label211111111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211111111", false);
    public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
    public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
    public NXJLineControl line11 = new com.unify.nxj.mgr.datatypes.NXJLineImpl(this, "line11", false);
    public NullableStringField radio1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "radio1", false, true, 100);
    public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
    public class box11
	extends com.unify.nxj.mgr.NXJBox
    {
	public class image1
	    extends ItemsForm.Logo
	{

	    public image1()
	    {
		super(ItemsForm.Standar.box11.this, "image1", false);
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
		super(ItemsForm.Standar.box111.this, "label1", false);
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
    public class tabset1
	extends com.unify.nxj.mgr.NXJTabSet
    {
	public class button1
	    extends ItemsForm.Boton
	{

	    public button1()
	    {
		super(ItemsForm.Standar.tabset1.this, "button1", false);
	    } // <init>
	} // button1

	public button1 button1 = new button1();
	public class button2
	    extends ItemsForm.Boton
	{

	    public button2()
	    {
		super(ItemsForm.Standar.tabset1.this, "button2", false);
	    } // <init>
	} // button2

	public button2 button2 = new button2();
	public class button3
	    extends ItemsForm.Boton
	{

	    public button3()
	    {
		super(ItemsForm.Standar.tabset1.this, "button3", false);
	    } // <init>
	} // button3

	public button3 button3 = new button3();

	public tabset1(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("tabset1", enclosingContainer);
	} // <init>
    } // tabset1

    public final tabset1 tabset1 = new tabset1(this);

    public Standar(String dataViewName, com.unify.nxj.mgr.NXJContainer container)
    {
	super(dataViewName, container);
	us$setBackgroundColor("#cccccc");
	date1.setStyleClass("date_picker");
	date1.us$setView("date");
	label11.setStyleClass("label");
	label11.setForegroundColor("Black");
	label11.setFontFamily("Verdana");
	label11.setFontSize("14");
	label11.us$setFontWeight("bold");
	label111.setStyleClass("label");
	label111.setForegroundColor("Black");
	label111.setFontFamily("Verdana");
	label111.setFontSize("14");
	label111.us$setFontWeight("bold");
	label2111.setStyleClass("label");
	label2111.setForegroundColor("#0033ff");
	label2111.setFontSize("12");
	label2111.us$setFontWeight("bold");
	label21111.setStyleClass("label");
	label21111.setForegroundColor("#0033ff");
	label21111.setFontSize("10");
	label21111.us$setFontWeight("bold");
	label211111.setStyleClass("label");
	label211111.setForegroundColor("#0033ff");
	label211111.setFontSize("10");
	label211111.us$setFontWeight("bold");
	label2111111.setStyleClass("label");
	label2111111.setForegroundColor("#0033ff");
	label2111111.setFontSize("10");
	label2111111.us$setFontWeight("bold");
	label21111111.setStyleClass("label");
	label21111111.setForegroundColor("#0033ff");
	label21111111.setFontSize("10");
	label21111111.us$setFontWeight("bold");
	label211111111.setStyleClass("label");
	label211111111.setForegroundColor("#0033ff");
	label211111111.setFontSize("10");
	label211111111.us$setFontWeight("bold");
	label3.setStyleClass("label");
	label3.setFontSize("12");
	label31.setStyleClass("label");
	label31.setFontSize("12");
	line11.setStyleClass("horizontal_line");
	line11.setForegroundColor("#ff0033");
	radio1.setStyleClass("radio_group");
	radio1.us$setView("radio_group");
	radio1.us$setReadersField(false);
	radio1.setFindable(false);
	radio1.setBackgroundColor("transparent");
	textfield1.setStyleClass("textfield");
	textfield1.us$setView("text");
	textfield1.setFindable(false);
    } // <init>
} // Standar

