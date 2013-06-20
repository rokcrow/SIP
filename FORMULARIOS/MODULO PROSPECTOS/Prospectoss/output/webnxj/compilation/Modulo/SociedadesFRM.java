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

public class SociedadesFRM
    extends com.unify.nxj.mgr.NXJForm
{

    public com.unify.nxj.mgr.NXJMasterRelationshipExpression[] us$getPUBLIC_xel_emprelogo1_1_FindExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterRelationshipExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "xel_codigo";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, cajagrandeSociedades.xem_codigo, null)
			};
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_xel_emprelogo1_1_FindExpressions

    public com.unify.nxj.mgr.NXJMasterAddExpression[] us$getPUBLIC_xel_emprelogo1_1_AddExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterAddExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "xel_codigo";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return cajagrandeSociedades.xem_codigo;
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_xel_emprelogo1_1_AddExpressions
    private SociedadesFRM SociedadesFRM = this;
    public class cajagrandeSociedades
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public /*multi_valued*/ NullableStringField xem_codigo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xem_codigo", true, true, 2);
	public /*multi_valued*/ NullableStringField xem_nombre = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xem_nombre", true, true, 30);
	public class PUBLIC_xel_emprelogo1
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    public /*multi_valued*/ NXJImageControl Image1 = new com.unify.nxj.mgr.datatypes.NXJImageImpl(this, "Image1", true);
	    public NXJFileChooserControl chooser1 = new com.unify.nxj.mgr.datatypes.NXJFileChooserImpl(this, "chooser1", false);
	    public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	    public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	    public /*multi_valued*/ NullableStringField xel_codigo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xel_codigo", true, true, 2);
	    public /*multi_valued*/ NullableBinaryVariable xel_logo = NullableFactory.createNullableBinaryVariable(this, "xel_logo", true, true);

	    public PUBLIC_xel_emprelogo1(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_xel_emprelogo1", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.xel_emprelogo");
		setAutoFind(true);
		setStartInAddMode(false);
		us$setBindingType("connection");
		us$setBackgroundColor("#ccccff");
		Image1.setStyleClass("image");
		Image1.us$setMultiValued(true);
		Image1.setWidth(255);
		Image1.setHeight(33);
		chooser1.setStyleClass("file");
		chooser1.setStorageVariable("xel_codigo");
		label3.setStyleClass("label");
		label3.setFontSize("12");
		label31.setStyleClass("label");
		label31.setFontSize("12");
		xel_codigo.setStyleClass("textfield");
		xel_codigo.us$setMultiValued(true);
		xel_codigo.us$setView("text");
		xel_codigo.us$setFieldLength(2);
		xel_codigo.us$setCandidateTargetColumnName("xel_codigo");
		xel_codigo.setValueRetrievedDuringFetch(true);
		xel_codigo.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		xel_codigo.setFindable(true);
		xel_codigo.setUpdateable(true);
		us$addTargetMapping("xel_logo", "xel_logo");
	    } // <init>
	} // PUBLIC_xel_emprelogo1

	public final PUBLIC_xel_emprelogo1 PUBLIC_xel_emprelogo1 = new PUBLIC_xel_emprelogo1(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(Modulo.SociedadesFRM.cajagrandeSociedades.box11.this, "image1", false);
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
		    super(Modulo.SociedadesFRM.cajagrandeSociedades.box111.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
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

	public cajagrandeSociedades(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeSociedades", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeSociedadespropertySetter_0();
	} // <init>

	private void cajagrandeSociedadespropertySetter_0()
	{
	    label11.setStyleClass("label");
	    label11.setForegroundColor("Black");
	    label11.setFontFamily("Verdana");
	    label11.setFontSize("14");
	    label11.us$setFontWeight("bold");
	    xem_codigo.setStyleClass("textfield");
	    xem_codigo.us$setMultiValued(true);
	    xem_codigo.us$setView("text");
	    xem_codigo.us$setFieldLength(2);
	    xem_codigo.us$setCandidateTargetColumnName("xem_codigo");
	    xem_codigo.setValueRetrievedDuringFetch(true);
	    xem_codigo.setFindable(true);
	    xem_codigo.setUpdateable(true);
	    xem_nombre.setStyleClass("textfield");
	    xem_nombre.us$setMultiValued(true);
	    xem_nombre.us$setView("text");
	    xem_nombre.us$setFieldLength(30);
	    xem_nombre.us$setCandidateTargetColumnName("xem_nombre");
	    xem_nombre.setValueRetrievedDuringFetch(true);
	    xem_nombre.setFindable(true);
	    xem_nombre.setUpdateable(true);
	} // cajagrandeSociedadespropertySetter_0
    } // cajagrandeSociedades

    public final cajagrandeSociedades cajagrandeSociedades = new cajagrandeSociedades(this);

    public SociedadesFRM(NXJSession session, NXJForm prevForm)
    {
	super("SociedadesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected SociedadesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.xem_empresas");
	setStartInAddMode(false);
	us$setBindingType("connection");
	Modulo.SociedadesFRM.this.cajagrandeSociedades.PUBLIC_xel_emprelogo1.us$setMasterDataView(Modulo.SociedadesFRM.this);
	Modulo.SociedadesFRM.this.cajagrandeSociedades.PUBLIC_xel_emprelogo1.us$setMasterRelationshipCriteria(Modulo.SociedadesFRM.this.us$getPUBLIC_xel_emprelogo1_1_FindExpressions());
	Modulo.SociedadesFRM.this.cajagrandeSociedades.PUBLIC_xel_emprelogo1.us$setMasterRelationshipAddExpr(Modulo.SociedadesFRM.this.us$getPUBLIC_xel_emprelogo1_1_AddExpressions());
	us$setBackgroundColor("#999999");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "SociedadesFRM";
} // SociedadesFRM

