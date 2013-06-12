<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!-- NXJOptionList.jsp
	This file contains the html and javascript for displaying 
	the prompt dialog for the NXJ Source method session.optionListPrompt().
	The options are presented in a SELECT list.

	This file may be used as a template for creating a custom 
	prompt dialog for use with the NXJ Source method session.optionPrompt().
-->
  <head>
    <title>NXJ Option List</title>

    <LINK TYPE="text/css" REL=StyleSheet HREF="<%=com.unify.nxj.awebServlet.Runtime.getDefaultStyleSheetURL(request)%>">
    
    <script language="javascript">
    var isIE;

    // The up arrow
    var		UP_KEY				= 38;

    // The down arrow
    var		DOWN_KEY			= 40;

    // The enter key
    var		ENTER_KEY			= 13;

    // The escape key
    var		ESCAPE_KEY			= 27;

    var		FUNCTION_KEY_BASE	= 111;
    var		F1			= FUNCTION_KEY_BASE + 1;
    <%AccellManager	    accellManager 
                                = AccellManager.findManager(request);
    %>

   /*-------------------------------------------------------------------*
    *	Constructor:	doOnKeyDown
    *-------------------------------------------------------------------*/
   /**
    * Key down method.  Handles function keys.
    *
    * @param	event	The event (NS6 only)
    */

    function doOnKeyDown(
        event
	)
    {
	// If this is IE then track down the event and set the focus type.

	var		event;
	var		keyCode;
	var		list = document.forms.NXJForm.elements.NXJOptionList;

	if (isIE)
	    {
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
	    }
	else if (keyCode == DOWN_KEY 
		 && list.selectedIndex < list.length - 1)
	    {
	    list.selectedIndex++;
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
	else
	    {
	    if (! isIE)
		event.preventDefault();
	    return false;
	    }
    }

   /*-------------------------------------------------------------------*
    *	METHOD:		populateList
    *-------------------------------------------------------------------*/
   /**
    * Utility method to populate a list.
    *
    * @param	list	The list
    * @param	labels	String containing newline separated values for lisy
    */

    function populateList(
        list,
	labels
	)
    {
	var longestLabel = 0;
	for (var idx = 0; idx < labels.length; idx++)
	    {
	    longestLabel = Math.max(longestLabel, labels[idx].length);
	    list.options[idx] = new Option(labels[idx],"",false, false);
	    }

	var	form = document.forms.NXJForm;
	var	formHeight=form.offsetHeight+40;
	var maxLen = longestLabel * 8 + 40;
	if (window.dialogArguments)
	    {
	    if (parseInt(window.dialogWidth) < maxLen)
		window.dialogWidth = maxLen+"px";
	    window.dialogHeight = formHeight+"px";
	    }
	else
	    {
	    if (window.outerWidth < maxLen)
		{
		window.resizeBy(maxLen-window.outerWidth,
				formHeight-window.outerHeight);
		}
	    else
		{
		window.sizeToContent();
		window.resizeBy(20,40);
		window.scrollTo(0,0);
		}
	    }

     }

   /*-------------------------------------------------------------------*
    *	METHOD:		doOonLoad
    *-------------------------------------------------------------------*/
   /**
    * Called when the page is loaded
    *
    */

    function doOnLoad()
    {
	var	promptObject = getPromptObject();
	var	data = promptObject.options;
	var	form = document.forms.NXJForm;
	var	list = form.elements.NXJOptionList;
	var	msgPrompt = document.getElementById("NXJMessagePrompt");
	var	defOpt = promptObject.defOpt;
	var	timeout=promptObject.timeout;

	if (timeout > 0)
	    {
	    window.setTimeout("doButtonPressed(-2)", timeout*1000);
	    }

	msgPrompt.innerHTML = promptObject.promptStr;

        populateList(list, data);
	if (navigator.appName.indexOf("Microsoft") != -1)
	    {
	    document.onkeydown    = new Function("return doOnKeyDown();");
	    list.onkeydown = new Function("return false;");
	    list.onkeyup = new Function("return false;");
	    list.style.fontSize = "6pt";
	    }
	else
	    {
	    document.onkeypress = new Function("event","return doOnKeyDown(event);");
	    list.style.fontSize = "12px";
	    }
	if (defOpt >= 0)
	    list.selectedIndex = defOpt;
	document.onhelp		  = function() { return false; };
	if (promptObject.title)
		{
		document.title = promptObject.title;
		}
	window.buttonPressed  = false;  
    }
      
   /*-------------------------------------------------------------------*
    *	METHOD:		getPromptObject
    *-------------------------------------------------------------------*/
   /**
    * Get the object containing prompt variables from the calling window.
    *
    */

    function getPromptObject()
    {
	if (navigator.userAgent.indexOf("MSIE") >= 0)
	    isIE = true;

	var	openersWin;
    
	if (isIE)
	    openersWin = window.dialogArguments;
	else
	    openersWin = window.opener;

	return openersWin.promptObject;
    }
   /*-------------------------------------------------------------------*
    *	METHOD:		doOnUnload
    *-------------------------------------------------------------------*/
   /**
    * Called when the page is unloaded
    *
    */

    function doOnUnload()
    {
      
	// If the user hasn't pressed a button then tell the server that
	// the form chooser was cancelled.

	if (!window.buttonPressed)
	    {
	    doButtonPressed(-1);
	    }
	  
    }
          
   /*-------------------------------------------------------------------*
    *	METHOD:		doButtonPressed
    *-------------------------------------------------------------------*/
   /**
    * Called when the user presses OK or Cancel.
    *
    * @param	optionIdx	The index of the selected option
    *				(-1 = cancel, -2 = timeout)
    *
    */

    function doButtonPressed(
        optionIdx
	)
    {
	window.buttonPressed=true;
	if (isIE)
	    window.returnValue=optionIdx;
	else
	    {
	    var cmgr = window.opener.parent.clientManager;
	    if (cmgr && !cmgr.useFrameset)
		{
		window.opener.promptObject = null;
		cmgr.updatePrompt(window.opener.parent.promptCounter, optionIdx);
		}
	    else
		{
		var promptFrame = window.opener.parent.frames["promptFrame"];

		var searchStr = '?managerId=<%=(accellManager!=null)?accellManager.getManagerId():"null"%>';
		searchStr += "&target=prompt";
		searchStr += "&result="+optionIdx;
		var pathname = promptFrame.location.pathname.replace(/prompt(1)?/,"UnifyNXJ");
		var url = promptFrame.location.protocol
			+"//" + promptFrame.location.host
			+pathname
			+searchStr;
		promptFrame.location.replace(url);
		}
	    }
	window.setTimeout('window.close()', 100);
	  
    }
      
   /*-------------------------------------------------------------------*
    *	METHOD:		doOK
    *-------------------------------------------------------------------*/
   /**
    * Called when the user presses OK.
    *
    */

    function doOK()
    {
	var	list =  document.forms.NXJForm.elements.NXJOptionList;
	var	idx = list.selectedIndex;

	doButtonPressed(idx);
    }
      
   /*-------------------------------------------------------------------*
    *	METHOD:		doCancel
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
  
<body text="#000000" 
        onLoad="doOnLoad()" 
	onUnload="doOnUnload()" class="FORM" >
<form name="NXJForm" class="FORM" onSubmit="return false">
      
  <table width="100%" border="0"  rules="none" class="FORM" >
    <tr >
      <td colspan="2" NOWRAP align="center" > 
        <h4 id="NXJMessagePrompt" name="NXJMessagePrompt" align="center"></h4>
	    </td>
    </tr>
    <tr>
            
      <td colspan="2" align="center" > 
        <select name="NXJOptionList" size="6"
		style="font-family: courier; "
		onDblClick="doOK()">
                </select>
      </td>
    </tr>
    <tr>
        <tr>
	    <td align="center"> &nbsp;</td>
        </tr>
      <td align="center"> 
        <table>
	    <tr>
		<td><input type="button" value="OK" id="NXJOk" onClick="doOK()" title="Choose selection" style="width:60px">
		</td>
		<td>&nbsp;</td>
		<td><input type="button" value="Cancel" id="NXJCancel" title="Cancel selection"
			         onClick="doCancel()" style="width:60px"> </td>
	    </tr>
	</table></td>
    </tr>
  </table>
</form>
</body>
</html>        
  		
