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

public class ObrasFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable xob_empresa = NullableFactory.createNullableStringVariable(this, "xob_empresa", true, false);

    public void beforeForm()
	throws Exception
    {
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
    } // beforeForm
    private ObrasFRM ObrasFRM = this;
    public class cajagrandeObrasFRM
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public class PUBLIC_xob_obras
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    public /*multi_valued*/ NullableStringField xob_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_nombre", true, true, 30);
	    public /*multi_valued*/ NullableStringField xob_obra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_obra", true, true, 2);
	    public /*multi_valued*/ NullableStringField xob_proyecto = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_proyecto", true, true, 2);

	    public PUBLIC_xob_obras(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_xob_obras", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.xob_obras");
		setAutoFind(true);
		setStartInAddMode(false);
		us$setBindingType("connection");
		xob_nombre.setStyleClass("textfield");
		xob_nombre.us$setMultiValued(true);
		xob_nombre.us$setView("text");
		xob_nombre.us$setFieldLength(30);
		xob_nombre.us$setCandidateTargetColumnName("xob_nombre");
		xob_nombre.setValueRetrievedDuringFetch(true);
		xob_nombre.setFindable(true);
		xob_nombre.setUpdateable(true);
		xob_obra.setStyleClass("textfield");
		xob_obra.us$setMultiValued(true);
		xob_obra.us$setView("text");
		xob_obra.us$setFieldLength(2);
		xob_obra.us$setCandidateTargetColumnName("xob_obra");
		xob_obra.setValueRetrievedDuringFetch(true);
		xob_obra.setFindable(true);
		xob_obra.setUpdateable(true);
		xob_proyecto.setStyleClass("textfield");
		xob_proyecto.us$setMultiValued(true);
		xob_proyecto.us$setView("text");
		xob_proyecto.us$setFieldLength(2);
		xob_proyecto.us$setCandidateTargetColumnName("xob_proyecto");
		xob_proyecto.setValueRetrievedDuringFetch(true);
		xob_proyecto.setFindable(true);
		xob_proyecto.setUpdateable(true);
	    } // <init>
	} // PUBLIC_xob_obras

	public final PUBLIC_xob_obras PUBLIC_xob_obras = new PUBLIC_xob_obras(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.ObrasFRM.cajagrandeObrasFRM.box11.this, "image1", false);
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
	public class cajaarribaObrasFRM
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(ModuloCNegocios.ObrasFRM.cajagrandeObrasFRM.cajaarribaObrasFRM.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	    public cajaarribaObrasFRM(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaObrasFRM", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaObrasFRMpropertySetter_0();
	    } // <init>

	    private void cajaarribaObrasFRMpropertySetter_0()
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
	    } // cajaarribaObrasFRMpropertySetter_0
	} // cajaarribaObrasFRM

	public final cajaarribaObrasFRM cajaarribaObrasFRM = new cajaarribaObrasFRM(this);

	public cajagrandeObrasFRM(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeObrasFRM", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeObrasFRMpropertySetter_0();
	} // <init>

	private void cajagrandeObrasFRMpropertySetter_0()
	{
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	} // cajagrandeObrasFRMpropertySetter_0
    } // cajagrandeObrasFRM

    public final cajagrandeObrasFRM cajagrandeObrasFRM = new cajagrandeObrasFRM(this);

    public ObrasFRM(NXJSession session, NXJForm prevForm)
    {
	super("ObrasFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected ObrasFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.xob_obras");
	setAutoFind(true);
	setStartInAddMode(false);
	setClearAfterAdd(false);
	us$setBindingType("connection");
	ModuloCNegocios.ObrasFRM.this.cajagrandeObrasFRM.PUBLIC_xob_obras.us$setMasterDataView(ModuloCNegocios.ObrasFRM.this);
	us$setBackgroundColor("#999999");
	us$addTargetMapping("xob_empresa", "xob_empresa");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "ObrasFRM";
} // ObrasFRM

