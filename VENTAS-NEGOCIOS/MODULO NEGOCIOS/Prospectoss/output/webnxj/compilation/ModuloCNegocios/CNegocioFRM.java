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

public class CNegocioFRM
    extends com.unify.nxj.mgr.NXJForm
{
    private CNegocioFRM CNegocioFRM = this;
    public class cajagrandeCPago
	extends com.unify.nxj.mgr.NXJBox
    {
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label3111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3111", false);
	public NXJLabelControl label312 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label312", false);
	public /*multi_valued*/ NullableStringField vau_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_manzana", true, true, 3);
	public /*multi_valued*/ NullableStringField vau_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vau_unidad", true, true, 4);
	public class vmu_f_separacion
	    extends com.unify.nxj.mgr.datatypes.NXJDateField
	{

	    public void beforeField()
		throws Exception
	    {
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (vmu_f_separacion.isNull() || vmu_f_separacion.isUndefined() == true)
		    {
		    vmu_f_separacion.assign(scr_fecha);
		    fecha_separa = us$registerPool.allocateRegister().load(vmu_f_separacion).getStringValue();
		    }
		else
		    fecha_separa = us$registerPool.allocateRegister().load(vmu_f_separacion).getStringValue();
	    } // beforeField

	    public void onDataAccept()
		throws Exception
	    {
		com.unify.nxj.mgr.datatypes.Register us$R3;
		com.unify.nxj.mgr.datatypes.Register us$R1;
		final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
		if (us$registerPool.allocateRegister().load(vmu_f_separacion).neqOp(fecha_separa).getBooleanValueNullOk())
		    {
		    if (us$registerPool.allocateRegister().load(vmu_f_separacion).ltOp(fecha_separa).getBooleanValueNullOk())
			{
			if (((us$R1 = us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).eqOp("ADMVEN")).isLogicalOrDecided() ? us$R1 : us$R1.logicalOrOp(us$registerPool.allocateRegister().load(((Modulo.LoginFRM)us$findForm(Modulo.LoginFRM.class)).cajagrandeLogin.xpr_grupo).eqOp("CUSEZAR"))).getBooleanValueNullOk())
			    {

				{
				getSession().us$setStatus(StatusCode.SS_NORM);
				NXJDataConnection us$conn2 = getConnection();
				java.sql.PreparedStatement us$stmt2 = null;
				ResultSet us$rs2 = null;
				try
				    {
				    us$stmt2 = us$conn2.prepareStatement("SELECT vlp_precio_uni FROM vlp_listapre WHERE vlp_empresa =  ?  AND vlp_obra =  ?  AND vlp_manzana =  ?  AND vlp_unidad =  ?  AND vlp_f_inicial <=  ?  AND (vlp_f_final >=  ?  OR vlp_f_final is NULL)");
				    us$stmt2.setString(1, vmu_empresa.getStringValue());
				    us$stmt2.setString(2, vmu_obra.getStringValue());
				    us$stmt2.setString(3, vmu_manzana.getStringValue());
				    us$stmt2.setString(4, vmu_unidad.getStringValue());
				    vmu_f_separacion.us$setSqlParameterValue(us$stmt2, 5);
				    vmu_f_separacion.us$setSqlParameterValue(us$stmt2, 6);
				    us$rs2 = us$stmt2.executeQuery();
				    x_precio_uni = new com.unify.nxj.mgr.dataConnection.jdbc.JdbcResultSetWrapper(us$conn2, us$stmt2, us$rs2);
				    us$stmt2 = null;
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
			    if (getSession().getStatus() != StatusCode.SS_NORM)
				{
				if (getSession().getStatus() != StatusCode.SS_NOREC)
				    {
				    getSession().displayToMessageBox("La unidad no puede acceder la lista para esta fecha, verifique por favor. ");
				    vmu_f_separacion.assign(fecha_separa);
				    vmu_f_separacion.setNextField("vmu_f_separacion");
				    }
				else
				    {
				    getSession().displayToMessageBox("No hay lista de precios para la unidad, se conserva el precio actual.");
				    }
				}
			    else
				{
				vmu_precio_uni = x_precio_uni.getStringValue();
				}
			    }
			else
			    {
			    getSession().displayToMessageBox("No puede modificar la fecha de separaci\u00F3n, requiere autorizaci\u00F3n.");
			    vmu_f_separacion.assign(fecha_separa);
			    vmu_f_separacion.setNextField("vmu_f_separacion");
			    }
			}
		    else
			{
			getSession().displayToMessageBox("No puede crear la fecha de separaci\u00F3n mayor a la fecha del d\u00EDa. Verifique por favor. ");
			vmu_f_separacion.assign(fecha_separa);
			vmu_f_separacion.setNextField("vmu_f_separacion");
			}
		    }
		if (((us$R3 = us$registerPool.allocateRegister().load(vmu_f_separacion).gtOp(f_escritura)).isLogicalAndDecided() ? us$R3 : us$R3.logicalAndOp(adicionando.eqOp(1))).getBooleanValueNullOk())
		    {
		    vmu_f_ent_pacta = us$registerPool.allocateRegister().load(vmu_f_separacion).plusOp(60).getStringValue();
		    vmu_f_escritura = us$registerPool.allocateRegister().load(vmu_f_separacion).plusOp(30).getStringValue();
		    }
	    } // onDataAccept

	    public vmu_f_separacion()
	    {
		super(ModuloCNegocios.CNegocioFRM.cajagrandeCPago.this, "vmu_f_separacion", true, true, 10);
		setStyleClass("date_picker");
		us$setMultiValued(true);
		us$setView("text");
		us$setFieldLength(10);
		us$setCandidateTargetColumnName("vmu_f_separacion");
		setValueRetrievedDuringFetch(true);
		setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
		setRequired(true);
		setFindable(true);
		setUpdateable(true);
		us$executesCodeBeforeInput = true;
		us$executesDataAcceptValueChanges = true;
	    } // <init>
	} // vmu_f_separacion

	public /*multi_valued*/ vmu_f_separacion vmu_f_separacion = new vmu_f_separacion();
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(ModuloCNegocios.CNegocioFRM.cajagrandeCPago.box11.this, "image1", false);
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
		    super(ModuloCNegocios.CNegocioFRM.cajagrandeCPago.box111.this, "label1", false);
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

	public cajagrandeCPago(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeCPago", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeCPagopropertySetter_0();
	} // <init>

	private void cajagrandeCPagopropertySetter_0()
	{
	    label31.setStyleClass("label");
	    label31.setFontSize("12");
	    label311.setStyleClass("label");
	    label311.setFontSize("12");
	    label3111.setStyleClass("label");
	    label3111.setFontSize("12");
	    label312.setStyleClass("label");
	    label312.setFontSize("12");
	    vau_manzana.setStyleClass("textfield");
	    vau_manzana.us$setMultiValued(true);
	    vau_manzana.us$setView("text");
	    vau_manzana.us$setFieldLength(3);
	    vau_manzana.us$setCandidateTargetColumnName("vau_manzana");
	    vau_manzana.setValueRetrievedDuringFetch(true);
	    vau_manzana.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_manzana.setRequired(true);
	    vau_manzana.setFindable(true);
	    vau_manzana.setUpdateable(false);
	    vau_manzana.setCaseConversion(NullableField.CaseConversion_UPPER);
	    vau_unidad.setStyleClass("textfield");
	    vau_unidad.us$setMultiValued(true);
	    vau_unidad.us$setView("text");
	    vau_unidad.us$setFieldLength(4);
	    vau_unidad.us$setCandidateTargetColumnName("vau_unidad");
	    vau_unidad.setValueRetrievedDuringFetch(true);
	    vau_unidad.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    vau_unidad.setRequired(true);
	    vau_unidad.setFindable(true);
	    vau_unidad.setUpdateable(true);
	    vau_unidad.setCaseConversion(NullableField.CaseConversion_UPPER);
	} // cajagrandeCPagopropertySetter_0
    } // cajagrandeCPago

    public final cajagrandeCPago cajagrandeCPago = new cajagrandeCPago(this);

    public CNegocioFRM(NXJSession session, NXJForm prevForm)
    {
	super("CNegocioFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected CNegocioFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setBackgroundColor("#999999");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "CNegocioFRM";
} // CNegocioFRM

