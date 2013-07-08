package Servicios;

import java.sql.SQLException;
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

public class ServAdmin
    extends com.unify.nxj.mgr.datatypes.NXJService
{

    public NullableBoolean tieneacceso(NullableString varGrupo, NullableString varUsuario, NullableString varForma)
	throws com.unify.nxj.mgr.dataConnection.NXJDataConnectionException
    {
	((com.unify.nxj.mgr.datatypes.Register)varForma).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)varUsuario).freezeType();
	((com.unify.nxj.mgr.datatypes.Register)varGrupo).freezeType();
	final com.unify.nxj.mgr.datatypes.RegisterPool us$registerPool = getSession().us$getRegisterPool();
	NullableBoolean varRetorno = (NullableBoolean)NullableFactory.createNullableBoolean("varRetorno").assign(us$registerPool.allocateRegister().load(false));
	NullableString x_pro1 = NullableFactory.createNullableString("x_pro1");
	NullableString x_pro2 = NullableFactory.createNullableString("x_pro2");
	try
	    {

		{
		getSession().us$setStatus(StatusCode.SS_NORM);
		NXJDataConnection us$conn1 = getSession().us$findOrCreateConnection("Connection1");
		java.sql.PreparedStatement us$stmt1 = null;
		ResultSet us$rs1 = null;
		try
		    {
		    us$stmt1 = us$conn1.prepareStatement("SELECT xac_programa FROM xac_accesos WHERE xac_grupo =  ?  AND xac_programa =  ?");
		    varGrupo.us$setSqlParameterValue(us$stmt1, 1);
		    varForma.us$setSqlParameterValue(us$stmt1, 2);
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
			if (us$getter1.next())
			    {
			    ++us$rowsTouched1;
			    us$getter1.assignValueToVariable(x_pro1, 1);
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
	    if (getSession().getStatus() == StatusCode.SS_NORM)
		{
		varRetorno.assign(us$registerPool.allocateRegister().load(true));
		}
	    else
		{
		try
		    {

			{
			getSession().us$setStatus(StatusCode.SS_NORM);
			NXJDataConnection us$conn2 = getSession().us$findOrCreateConnection("Connection1");
			java.sql.PreparedStatement us$stmt2 = null;
			ResultSet us$rs2 = null;
			try
			    {
			    us$stmt2 = us$conn2.prepareStatement("SELECT xpu_programa FROM xpu_prog_user WHERE xpu_usuario =  ?  AND xpu_programa =  ?");
			    varUsuario.us$setSqlParameterValue(us$stmt2, 1);
			    varForma.us$setSqlParameterValue(us$stmt2, 2);
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
				if (us$getter2.next())
				    {
				    ++us$rowsTouched2;
				    us$getter2.assignValueToVariable(x_pro2, 1);
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
		    if (getSession().getStatus() == StatusCode.SS_NORM)
			varRetorno.assign(us$registerPool.allocateRegister().load(true));
		    else
			varRetorno.assign(us$registerPool.allocateRegister().load(false));
		    }
		catch (Exception aa)
		    {
		    varRetorno.assign(us$registerPool.allocateRegister().load(false));
		    }
		}
	    }
	catch (Exception aa)
	    {
	    varRetorno.assign(us$registerPool.allocateRegister().load(false));
	    }
	return varRetorno;
    } // tieneacceso
    private ServAdmin ServAdmin = this;

    public ServAdmin()
    {
	super();
    } // <init>
} // ServAdmin

