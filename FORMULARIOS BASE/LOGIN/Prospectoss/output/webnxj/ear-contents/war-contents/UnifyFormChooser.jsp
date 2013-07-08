<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	UnifyFormChooser.jsp
 *
 *	ORIGINATOR:	aig
 *	CREATION DATE:	Thu Apr 29 11:09:53 PDT 1999
 *
 *----------------------------------------------------------------------*/


/**
 * This JSP page displays the next form chooser.
 *
 * @author	aig
 * @author	$Author: dlf $	$Exp: $
 * @version	$Revision: 39442 $ $Date: 2006-10-30 10:06:12 -0800 (Mon, 30 Oct 2006) $
 */
-->

<%AccellManager accellManager = AccellManager.
                                    findOrCreateManager(request,
				                        application);%>
  <head>
    <title>Choose Next Form</title>
    
    <link href="<%=com.unify.nxj.awebServlet.Runtime.getDefaultStyleSheetURL(request)%>" rel="stylesheet" type="text/css">

    <script language="javascript">
    
    // Suffix for normal image

    var		NORMAL_SUFFIX		= "Off.gif";

    // Suffix for the rollover image

    var		ROLLOVER_SUFFIX		= "On.gif";


    // The up arrow

    var		UP_KEY				= 38;

    // The down arrow

    var		DOWN_KEY			= 40;

    // The enter key

    var		ENTER_KEY			= 13;

    // The escape key

    var		ESCAPE_KEY			= 27;

	var		FUNCTION_KEY_BASE	= 111;

	var		F1					= FUNCTION_KEY_BASE + 1;

    /*-------------------------------------------------------------------*
    *	METHOD:		doOnListChange
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Mon Oct 1 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * onChange method for listbox
    *
    */

    
    function doOnListChange()
    {
      
	  
	var	list = document.forms["form1"].elements["nextForm"];
	var	text = document.forms["form1"].elements["text"];

	text.value       = list.selectedIndex + 1;

    }
      
   
   /*-------------------------------------------------------------------*
    *	Constructor:	doOnKeyDown
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Key down method.  Handles function keys.
    *
    * @param	event	The event (MS6 only)
    */


    function doOnKeyDown(
        event
	)
    {

	// If this is IE then track down the event and set the focus type.

	var		event;
	var		keyCode;
	var		list = document.forms["form1"].elements["nextForm"];
	var		isIE = false;

	if (navigator.appName.indexOf("Microsoft") != -1)
	    {
		isIE = true;
	    event = window.event;

	    if (event == null)
		{
		return;
		}
	    }

	keyCode = event.keyCode;

	if (keyCode == UP_KEY && list.selectedIndex != 0)
	    {
	    list.selectedIndex--;
	    doOnListChange();
	    }
	else if (keyCode == DOWN_KEY 
		 && list.selectedIndex < list.length - 1)
	    {
	    list.selectedIndex++;
	    doOnListChange();
	    }
	else if (keyCode == ENTER_KEY)
	    {
	    doOK();
	    }
	else if (keyCode == ESCAPE_KEY || keyCode == F1)
		{
		doCancel();
		if (! isIE)
			event.preventDefault();
		return false;
		}

    }

   /*-------------------------------------------------------------------*
    *	METHOD:		populateList
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Utility method to populate a list.
    *
    * @param	list	The list
    * @param	string	String containing newline separated values for lisy
    */

    
    
    function populateList(
        list,
	string
	)
    {
      
	
	string = string.replace(/\\\\n/g, "\n");
	var	labels = string.split("\n");
	var	ndigits = labels.length < 10 
			  ? 1
			  : (labels.length < 100 ? 2 : 3);
	
	for (var idx = 0; idx < labels.length; idx++)
	    {
	    var		selected = idx == 0;
	    var		index = (idx + 1) + "";	// Index as string

	    while (index.length < ndigits)
		{
		index = " " + index;
		}

	    list.options[idx] = new Option(index + ". " + labels[idx],
	                                   "",
					   selected,
					   selected);
	    }

	if (labels.length != 0)
	    {
	    list.selectedIndex = 0;
	    }
	
     }

      

    function doMouseOver(
    	image
	)
    {

	// If the current image ends with the "normal" suffix then
	// change the current image to the rollver image.

	var	suffix = image.src.indexOf(NORMAL_SUFFIX);

	if (suffix != -1)
	    {
	    image.src = image.src.substring(0, suffix) + ROLLOVER_SUFFIX;
	    }

    }

    function doMouseOut(
    	image
	)
    {

	// If the current image ends with the "rollover" suffix then
	// change the current image to the wnormal image.

	var	suffix = image.src.indexOf(ROLLOVER_SUFFIX);

	if (suffix != -1)
	    {
	    image.src = image.src.substring(0, suffix) + NORMAL_SUFFIX;
	    }

	}

   /*-------------------------------------------------------------------*
    *	METHOD:		doOonLoad
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Called when the page is loaded
    *
    */

    
    function doOnLoad()
    {
      
	var	data = "<%=accellManager.getClientMessage()%>";
	var	form = document.forms["form1"];
	var	list = form.elements["nextForm"];
	var	text = form.elements["text"];

        populateList(list, data);
	if (navigator.appName.indexOf("Microsoft") != -1)
		{
		document.onkeydown    = new Function("return doOnKeyDown();");
		list.onkeydown = new Function("return false;");
		list.onkeyup = new Function("return false;");
		}
	else
		{
		document.onkeypress = new Function("event","return doOnKeyDown(event);");
		}
	document.onhelp		  = function() { return false; };
	window.buttonPressed  = false;
	window.selection      = 1;
	window.savedTextValue = "";
	text.value            = "1";
	text.focus();
	  
    }
      
    function getManager()
    {
	var isIE = false;
	if (navigator.userAgent.indexOf("MSIE") >= 0)
	    isIE = true;

	var	openersManager;
    
	if (isIE)
	    openersManager = window.dialogArguments;
	else
	    openersManager = window.top.opener.parent.clientManager;

	return openersManager;
    }
    /*-------------------------------------------------------------------*
    *	METHOD:		doOnUnload
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Called when the page is unloaded
    *
    */

    
    function doOnUnload()
    {
      
	// If the user hasn't pressed a button then tell the server that
	// the form chooser was cancelled.

	if (!window.buttonPressed && !window.top.parentUnloaded)
	    {
	    var	openersManager = getManager();

	    openersManager.childWindow = null;
		if (window.dialogArguments)
			{
			openersManager.setControlStates(true);
			openersManager.doCommandInternal("unify.formChosen", -1, 0);
			}
		else
			{
			window.top.opener.setTimeout(
				"var mgr=window.parent.clientManager;"+
				"mgr.setControlStates(true);"+
				"mgr.doCommandInternal('unify.formChosen', -1, 0);",0);
			}
	    }
	  
    }
      
      	  
   

      	  
      
   /*-------------------------------------------------------------------*
    *	METHOD:		doButtonPressed
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Called when the user presses OK or Cancel.
    *
    * @param	formNo	The index of the selected form (-1 = cancel)
    *
    */

    function doButtonPressed(
        formNo
	)
    {
	var	openersManager = getManager();

	openersManager.childWindow = null;
	window.buttonPressed       = true;
	openersManager.setControlStates(true);
	openersManager.doCommandInternal("unify.formChosen", formNo, 0);

	if (window.dialogArguments)
		{
		window.close();
		}
	else
		{
		window.saveMgr = openersManager;
		checkClose();
		}
    }
      
    function checkClose()
	{
	if (window.saveMgr.doingCommand)
		{
		window.setTimeout("window.close();",500);
		}
	else
		{
		window.setTimeout('checkClose()', 100);
		}
	}
      
   /*-------------------------------------------------------------------*
    *	METHOD:		doOK
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Called when the user presses OK.
    *
    */

    function doOK()
    {
      
	var	form = document.forms["form1"];
	var	list = form.elements["nextForm"];
	var	text = form.elements["text"];
	var	idx;

	if (text.value.length == 0)
	    {
	    idx = list.selectedIndex;
	    }
	else
	    {
	    idx = Math.floor(text.value - 1);

	    if (isNaN(idx) || idx < 0 || idx > list.length - 1 + ".")
		{
		alert("The selection must be between 1 and " + list.length);
		return;
		}
	    }

	doButtonPressed(idx);

	  
    }
      
      	  
      
   /*-------------------------------------------------------------------*
    *	METHOD:		doCancel
    *	ORIGINATOR:	aig
    *	CREATION DATE:	Thu Apr 29 11:14:58 PDT 1999
    *-------------------------------------------------------------------*/
   /**
    * Called when the user presses Cancel
    *
    */

    function doCancel()
    {
	doButtonPressed(-1);
	  
    }
      
	    
    </script>
  </head>
  
  <body 
        onLoad="doOnLoad()" 
	onUnload="doOnUnload()" class="FRAMESET FORM">
    <form name="form1" onSubmit="return false" class="FRAMESET FORM">
      
  <table width="100%" border="0"  rules="none"  >
    <tr >
            
      <td colspan="2" NOWRAP align="center" > 
        <h4 align="center">
		    <font face="Arial, Helvetica, sans-serif" >
		        Choose Next Form
		    </font>
		</h4>
	    </td>
        </tr>
        <tr>
            
      <td colspan="2" align="center" > 
        <select name="nextForm" size="6"
		style="font-family: courier; font-size:
		      <%=accellManager.getFormChooserFontSize()%>"
		onDblClick="doOK()"
		onChange="doOnListChange()">
                </select>
            </td>
        </tr>
        <tr>
	    
        <tr>
	    
      <td align="center"> 
        <table>
		    <tr valign="top">
			<td>
			    <h5 align="center">
				<font face="Arial, Helvetica, sans-serif">Enter Selection:</font></h5></td>
			<td><input type="text" size="3" maxlength="3" name="text"></td>
			</tr>
		</table>
	    </td>
        </tr>
      <td align="center"> 
        <table>
		    <tr>
			<td>
			   <a id="ok" onClick="doOK()" title="Choose selected form">
			     <img src="images/OkOff.gif"
				    onMouseOut="doMouseOut(this)" 
				    onMouseOver="doMouseOver(this)"></a></td>
			<td> <a id="cancel" title="Cancel Next Form selection"
			         onClick="doCancel()"> <img src="images/cancelOff.gif"
				    onMouseOut="doMouseOut(this)" 
				    onMouseOver="doMouseOver(this)"></a></td>
		    </tr>
		</table>
	    </td>
        </tr>
      </table>
      <input type="hidden" 
             name="commandName" 
	     value="unify.formChosen">
       <input type="hidden" 
             name="formIndex" 
	     value="unify.formChosen">
   </form>
  </body>
</html>        
  		
