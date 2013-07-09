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

public class DUDisponiblesFRM
    extends com.unify.nxj.mgr.NXJForm
{
    /*multi_valued*/ NullableStringVariable xob_empresa = NullableFactory.createNullableStringVariable(this, "xob_empresa", true, false);

    public com.unify.nxj.mgr.NXJMasterRelationshipExpression[] us$getPUBLIC_vuu_unidades_1_FindExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterRelationshipExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_obra";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, cajagrandeDUDisponibles.xob_obra, null)
			};
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterRelationshipExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_empresa";
		} // getColumnName

		public com.unify.nxj.mgr.datatypes.NXJSearchRange[] evaluate()
		    throws Exception
		{
		    return new com.unify.nxj.mgr.datatypes.NXJSearchRange[]
			{
			new com.unify.nxj.mgr.datatypes.NXJSearchRange(com.unify.nxj.mgr.datatypes.NXJSearchRange.EqualOP, DUDisponiblesFRM.xob_empresa, null)
			};
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vuu_unidades_1_FindExpressions

    public com.unify.nxj.mgr.NXJMasterAddExpression[] us$getPUBLIC_vuu_unidades_1_AddExpressions()
    {
	return new com.unify.nxj.mgr.NXJMasterAddExpression[]
	    {
	    new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_obra";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return cajagrandeDUDisponibles.xob_obra;
		} // evaluate
	    }, new com.unify.nxj.mgr.NXJMasterAddExpression()
	    {

		public String getColumnName()
		{
		    return "vuu_empresa";
		} // getColumnName

		public Nullable evaluate()
		    throws Exception
		{
		    return DUDisponiblesFRM.xob_empresa;
		} // evaluate
	    }
	    };
    } // us$getPUBLIC_vuu_unidades_1_AddExpressions
    private DUDisponiblesFRM DUDisponiblesFRM = this;
    public class cajagrandeDUDisponibles
	extends com.unify.nxj.mgr.NXJBox
    {
	public class imprimirbtn
	    extends ItemsForm.Boton
	{

	    public imprimirbtn()
	    {
		super(Modulo.DUDisponiblesFRM.cajagrandeDUDisponibles.this, "imprimirbtn", false);
	    } // <init>
	} // imprimirbtn

	public imprimirbtn imprimirbtn = new imprimirbtn();
	public NXJLabelControl label11 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label11", false);
	public NXJLabelControl label3 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3", false);
	public NXJLabelControl label31 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label31", false);
	public NXJLabelControl label311 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label311", false);
	public NXJLabelControl label32 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label32", false);
	public NXJLabelControl label321 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label321", false);
	public NXJLabelControl label3211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3211", false);
	public NXJLabelControl label32111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label32111", false);
	public NXJLabelControl label321111 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label321111", false);
	public NXJLabelControl label32112 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label32112", false);
	public NXJLabelControl label3212 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3212", false);
	public NXJLabelControl label32121 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label32121", false);
	public NXJLabelControl label322 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label322", false);
	public NXJLabelControl label3221 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label3221", false);
	public class regresarbtn
	    extends ItemsForm.Boton
	{

	    public regresarbtn()
	    {
		super(Modulo.DUDisponiblesFRM.cajagrandeDUDisponibles.this, "regresarbtn", false);
	    } // <init>
	} // regresarbtn

	public regresarbtn regresarbtn = new regresarbtn();
	public NullableStringField textfield1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield1", false, true, 100);
	public /*multi_valued*/ NullableStringField textfield11 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "textfield11", true, true, 30);
	public NullableStringField total1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "total1", false, true, 100);
	public NullableStringField total2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "total2", false, true, 100);
	public /*multi_valued*/ NullableStringField xob_obra = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_obra", true, true, 2);
	public /*multi_valued*/ NullableStringField xob_proyecto = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "xob_proyecto", true, true, 2);
	public class PUBLIC_vuu_unidades
	    extends com.unify.nxj.mgr.NXJDataView
	{
	    /*multi_valued*/ NullableStringVariable vuu_empresa = NullableFactory.createNullableStringVariable(this, "vuu_empresa", true, false);
	    /*multi_valued*/ NullableStringVariable vuu_obra = NullableFactory.createNullableStringVariable(this, "vuu_obra", true, false);
	    public /*multi_valued*/ NullableAmountField vuu_area_const = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vuu_area_const", true, true, 16);
	    public /*multi_valued*/ NullableAmountField vuu_area_lote = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vuu_area_lote", true, true, 16);
	    public /*multi_valued*/ NullableStringField vuu_esquina = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_esquina", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_manzana = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_manzana", true, true, 3);
	    public /*multi_valued*/ NullableStringField vuu_modelo = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_modelo", true, true, 3);
	    public /*multi_valued*/ NullableStringField vuu_muro1 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_muro1", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_muro2 = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_muro2", true, true, 2);
	    public /*multi_valued*/ NullableStringField vuu_parque = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_parque", true, true, 2);
	    public /*multi_valued*/ NullableAmountField vuu_precio_uni = new com.unify.nxj.mgr.datatypes.NXJAmountField(this, "vuu_precio_uni", true, true, 25);
	    public /*multi_valued*/ NullableStringField vuu_unidad = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "vuu_unidad", true, true, 4);

	    public PUBLIC_vuu_unidades(com.unify.nxj.mgr.NXJContainer container)
	    {
		super("PUBLIC_vuu_unidades", container);
		us$setConnectionName("Connection1");
		us$setTargetTableName("PUBLIC.vuu_unidades");
		setAutoFind(true);
		setStartInAddMode(false);
		us$setBindingType("connection");
		vuu_area_const.setStyleClass("textfield");
		vuu_area_const.us$setMultiValued(true);
		vuu_area_const.us$setView("text");
		vuu_area_const.us$setFieldLength(16);
		vuu_area_const.us$setCandidateTargetColumnName("vuu_area_const");
		vuu_area_const.setValueRetrievedDuringFetch(true);
		vuu_area_const.setFindable(true);
		vuu_area_const.setUpdateable(true);
		vuu_area_const.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_area_lote.setStyleClass("textfield");
		vuu_area_lote.us$setMultiValued(true);
		vuu_area_lote.us$setView("text");
		vuu_area_lote.us$setFieldLength(16);
		vuu_area_lote.us$setCandidateTargetColumnName("vuu_area_lote");
		vuu_area_lote.setValueRetrievedDuringFetch(true);
		vuu_area_lote.setFindable(true);
		vuu_area_lote.setUpdateable(true);
		vuu_area_lote.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_esquina.setStyleClass("textfield");
		vuu_esquina.us$setMultiValued(true);
		vuu_esquina.us$setView("text");
		vuu_esquina.us$setFieldLength(2);
		vuu_esquina.us$setCandidateTargetColumnName("vuu_esquina");
		vuu_esquina.setValueRetrievedDuringFetch(true);
		vuu_esquina.setFindable(true);
		vuu_esquina.setUpdateable(true);
		vuu_manzana.setStyleClass("textfield");
		vuu_manzana.us$setMultiValued(true);
		vuu_manzana.us$setView("text");
		vuu_manzana.us$setFieldLength(3);
		vuu_manzana.us$setCandidateTargetColumnName("vuu_manzana");
		vuu_manzana.setValueRetrievedDuringFetch(true);
		vuu_manzana.setFindable(true);
		vuu_manzana.setUpdateable(true);
		vuu_modelo.setStyleClass("textfield");
		vuu_modelo.us$setMultiValued(true);
		vuu_modelo.us$setView("text");
		vuu_modelo.us$setFieldLength(3);
		vuu_modelo.us$setCandidateTargetColumnName("vuu_modelo");
		vuu_modelo.setValueRetrievedDuringFetch(true);
		vuu_modelo.setFindable(true);
		vuu_modelo.setUpdateable(true);
		vuu_muro1.setStyleClass("textfield");
		vuu_muro1.us$setMultiValued(true);
		vuu_muro1.us$setView("text");
		vuu_muro1.us$setFieldLength(2);
		vuu_muro1.us$setCandidateTargetColumnName("vuu_muro1");
		vuu_muro1.setValueRetrievedDuringFetch(true);
		vuu_muro1.setFindable(true);
		vuu_muro1.setUpdateable(true);
		vuu_muro2.setStyleClass("textfield");
		vuu_muro2.us$setMultiValued(true);
		vuu_muro2.us$setView("text");
		vuu_muro2.us$setFieldLength(2);
		vuu_muro2.us$setCandidateTargetColumnName("vuu_muro2");
		vuu_muro2.setValueRetrievedDuringFetch(true);
		vuu_muro2.setFindable(true);
		vuu_muro2.setUpdateable(true);
		vuu_parque.setStyleClass("textfield");
		vuu_parque.us$setMultiValued(true);
		vuu_parque.us$setView("text");
		vuu_parque.us$setFieldLength(2);
		vuu_parque.us$setCandidateTargetColumnName("vuu_parque");
		vuu_parque.setValueRetrievedDuringFetch(true);
		vuu_parque.setFindable(true);
		vuu_parque.setUpdateable(true);
		vuu_precio_uni.setStyleClass("textfield");
		vuu_precio_uni.us$setMultiValued(true);
		vuu_precio_uni.us$setView("text");
		vuu_precio_uni.us$setFieldLength(25);
		vuu_precio_uni.us$setCandidateTargetColumnName("vuu_precio_uni");
		vuu_precio_uni.setValueRetrievedDuringFetch(true);
		vuu_precio_uni.setFindable(true);
		vuu_precio_uni.setUpdateable(true);
		vuu_precio_uni.setDisplayJustify(NullableField.DisplayJustify_LEFT);
		vuu_unidad.setStyleClass("textfield");
		vuu_unidad.us$setMultiValued(true);
		vuu_unidad.us$setView("text");
		vuu_unidad.us$setFieldLength(4);
		vuu_unidad.us$setCandidateTargetColumnName("vuu_unidad");
		vuu_unidad.setValueRetrievedDuringFetch(true);
		vuu_unidad.setFindable(true);
		vuu_unidad.setUpdateable(true);
		us$addTargetMapping("vuu_empresa", "vuu_empresa");
		us$addTargetMapping("vuu_obra", "vuu_obra");
	    } // <init>
	} // PUBLIC_vuu_unidades

	public final PUBLIC_vuu_unidades PUBLIC_vuu_unidades = new PUBLIC_vuu_unidades(this);
	public class box11
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public class image1
		extends ItemsForm.Logo
	    {

		public image1()
		{
		    super(Modulo.DUDisponiblesFRM.cajagrandeDUDisponibles.box11.this, "image1", false);
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
	public class cajaarribaDUDisponibles
	    extends com.unify.nxj.mgr.NXJBox
	{
	    public NullableStringField actualempresa = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualempresa", false, true, 100);
	    public NullableStringField actualusuario = new com.unify.nxj.mgr.datatypes.NXJStringField(this, "actualusuario", false, true, 100);
	    public class label1
		extends ItemsForm.TituloLBL
	    {

		public label1()
		{
		    super(Modulo.DUDisponiblesFRM.cajagrandeDUDisponibles.cajaarribaDUDisponibles.this, "label1", false);
		} // <init>
	    } // label1

	    public label1 label1 = new label1();
	    public NXJLabelControl label211 = new com.unify.nxj.mgr.datatypes.NXJLabelImpl(this, "label211", false);

	    public cajaarribaDUDisponibles(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	    {
		super("cajaarribaDUDisponibles", enclosingContainer);
		us$setBackgroundColor("#e30000");
		cajaarribaDUDisponiblespropertySetter_0();
	    } // <init>

	    private void cajaarribaDUDisponiblespropertySetter_0()
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
	    } // cajaarribaDUDisponiblespropertySetter_0
	} // cajaarribaDUDisponibles

	public final cajaarribaDUDisponibles cajaarribaDUDisponibles = new cajaarribaDUDisponibles(this);

	public cajagrandeDUDisponibles(com.unify.nxj.mgr.NXJContainer enclosingContainer)
	{
	    super("cajagrandeDUDisponibles", enclosingContainer);
	    us$setBackgroundColor("#cccccc");
	    cajagrandeDUDisponiblespropertySetter_0();
	} // <init>

	private void cajagrandeDUDisponiblespropertySetter_0()
	{
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
	    label32.setStyleClass("label");
	    label32.setFontSize("12");
	    label321.setStyleClass("label");
	    label321.setFontSize("12");
	    label3211.setStyleClass("label");
	    label3211.setFontSize("12");
	    label32111.setStyleClass("label");
	    label32111.setFontSize("12");
	    label321111.setStyleClass("label");
	    label321111.setFontSize("12");
	    label32112.setStyleClass("label");
	    label32112.setFontSize("12");
	    label3212.setStyleClass("label");
	    label3212.setFontSize("12");
	    label32121.setStyleClass("label");
	    label32121.setFontSize("12");
	    label322.setStyleClass("label");
	    label322.setFontSize("12");
	    label3221.setStyleClass("label");
	    label3221.setFontSize("12");
	    textfield1.setStyleClass("textfield");
	    textfield1.us$setView("text");
	    textfield1.setFindable(false);
	    textfield11.setStyleClass("textfield");
	    textfield11.us$setMultiValued(true);
	    textfield11.us$setView("text");
	    textfield11.us$setFieldLength(30);
	    textfield11.us$setCandidateTargetColumnName("xob_nombre");
	    textfield11.setValueRetrievedDuringFetch(true);
	    textfield11.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    textfield11.setFindable(true);
	    textfield11.setUpdateable(true);
	    total1.setStyleClass("textfield");
	    total1.us$setView("text");
	    total1.setFindable(false);
	    total2.setStyleClass("textfield");
	    total2.us$setView("text");
	    total2.setFindable(false);
	    xob_obra.setStyleClass("textfield");
	    xob_obra.us$setMultiValued(true);
	    xob_obra.us$setView("text");
	    xob_obra.us$setFieldLength(2);
	    xob_obra.us$setCandidateTargetColumnName("xob_obra");
	    xob_obra.setValueRetrievedDuringFetch(true);
	    xob_obra.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    xob_obra.setFindable(true);
	    xob_obra.setUpdateable(true);
	    xob_proyecto.setStyleClass("textfield");
	    xob_proyecto.us$setMultiValued(true);
	    xob_proyecto.us$setView("text");
	    xob_proyecto.us$setFieldLength(2);
	    xob_proyecto.setAutoAccept(true);
	    xob_proyecto.us$setCandidateTargetColumnName("xob_proyecto");
	    xob_proyecto.setValueRetrievedDuringFetch(true);
	    xob_proyecto.setExplicitSearchMode(NullableVariable.ExplicitSearchMode_DEFAULT);
	    xob_proyecto.setFindable(true);
	    xob_proyecto.setUpdateable(true);
	} // cajagrandeDUDisponiblespropertySetter_0
    } // cajagrandeDUDisponibles

    public final cajagrandeDUDisponibles cajagrandeDUDisponibles = new cajagrandeDUDisponibles(this);

    public DUDisponiblesFRM(NXJSession session, NXJForm prevForm)
    {
	super("DUDisponiblesFRM", session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    protected DUDisponiblesFRM(String formName, NXJSession session, NXJForm prevForm)
    {
	super(formName, session, prevForm);
	us$initializeFormSpecificProperties();
    } // <init>

    private void us$initializeFormSpecificProperties()
    {
	us$setConnectionName("Connection1");
	us$setTargetTableName("PUBLIC.xob_obras");
	setStartInAddMode(false);
	us$setBindingType("connection");
	Modulo.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterDataView(Modulo.DUDisponiblesFRM.this);
	Modulo.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterRelationshipCriteria(Modulo.DUDisponiblesFRM.this.us$getPUBLIC_vuu_unidades_1_FindExpressions());
	Modulo.DUDisponiblesFRM.this.cajagrandeDUDisponibles.PUBLIC_vuu_unidades.us$setMasterRelationshipAddExpr(Modulo.DUDisponiblesFRM.this.us$getPUBLIC_vuu_unidades_1_AddExpressions());
	us$setBackgroundColor("#999999");
	us$addTargetMapping("xob_empresa", "xob_empresa");
    } // us$initializeFormSpecificProperties
    public static final String menuLabel = "DUDisponiblesFRM";
} // DUDisponiblesFRM
