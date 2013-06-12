<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!-- NXJOptionButtons.jsp
	This file contains the html and javascript for displaying 
	the prompt dialog for the NXJ Source method 
	session.optionButtonPrompt().  The options are presented as 
	buttons on the page.

	This file may be used as a template for creating a custom 
	prompt dialog for use with the NXJ Source method session.optionPrompt().
-->
  <head>
    <title>NXJ Option Buttons</title>

    <LINK TYPE="text/css" REL=StyleSheet HREF="<%=com.unify.nxj.awebServlet.Runtime.getDefaultStyleSheetURL(request)%>">
    
    <script language="javascript">
    var isIE;

    // The enter key
    var		ENTER_KEY			= 13;

    // The escape key
    var		ESCAPE_KEY			= 27;
    var		TAB_KEY				= 9;
    var		SPACEBAR			= 32;


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
    * @param	event	The event (MS6 only)
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

	if (keyCode == ESCAPE_KEY || keyCode == F1)
	    {
	    doCancel();
	    if (! isIE)
		event.preventDefault();
	    return false;
	    }
	else if (keyCode == TAB_KEY
	    || keyCode == ENTER_KEY
	    || keyCode == SPACEBAR)
	    {
	    }
	else
	    {
	    if (! isIE)
		event.preventDefault();
	    return false;
	    }
    }

   /*-------------------------------------------------------------------*
    *	METHOD:	addTableRow
    *-------------------------------------------------------------------*/
   /**
    * Add a row that contains a table, and return a row within that table
    *
    * @param	table	table to which row should be added.
    */
    function addTableRow(table)
    {	  
	var buttonTableRow;  
	if (isIE) 
	    {
	    buttonTableRow = table.insertRow();
	    }
	else 
	    {
	    buttonTableRow = document.createElement('tr');
	    table.appendChild(buttonTableRow);
	    }

	var tableCell = this.document.createElement('TD');
	tableCell.align="center";
	buttonTableRow.appendChild(tableCell);
	var subtable = document.createElement("TABLE");
	subtable.cellSpacing=4;
	tableCell.appendChild(subtable);

	if (isIE) 
	    {
	    buttonTableRow = subtable.insertRow();
	    }
	else 
	    {
	    buttonTableRow = document.createElement('tr');
	    subtable.appendChild(buttonTableRow);
	    }
	return buttonTableRow;
    }

   /*-------------------------------------------------------------------*
    *	METHOD:		populateButtons
    *-------------------------------------------------------------------*/
   /**
    * Called to populate the buttons on the form
    *
    */
    function populateButtons(data, defOpt)
    {
	var	form = document.forms.NXJForm;

	var windowWidth;
	if (window.dialogArguments)
	    {
	    windowWidth = parseInt(window.dialogWidth);
	    }
	else
	    {
	    windowWidth = window.outerWidth;
	    }

	// populate existing buttons
	var buttons = form.getElementsByTagName('INPUT');
	var msgId=0;
	for (var idx=0; idx<buttons.length; idx++)
	    {
	    if (buttons[idx].type=="button" || buttons[idx].type=="image")
		{
		if (msgId <data.length)
		    {
		    buttons[idx].value=data[msgId];
		    buttons[idx].onclick=new Function("doButtonPressed("+msgId+");");
		    buttons[idx].tabIndex=msgId;
		    if (msgId == defOpt)
			buttons[idx].focus();
		    msgId++;
		    }
		else	// hide buttons that don't have messages
		    {
		    buttons[idx].style.visibility="hidden";
		    }
		}
	    }
	// add buttons for remaining messages
	if (msgId < data.length)
	    {
	    var table = document.createElement("TABLE");
	    table.cellSpacing=4;
	    table.align="center";
	    form.appendChild(table);

	    var buttonTableRow = addTableRow(table);

	    var runningWidth=0;
	    while(msgId < data.length)
		{
		var button = this.document.createElement('INPUT');
		button.type="button";
		button.value=data[msgId];
		button.onclick=new Function("doButtonPressed("+msgId+");");
		button.tabIndex=msgId;

		var td=this.document.createElement('TD');
		td.align="center";
		td.appendChild(button);

		buttonTableRow.appendChild(td);

		if (button.offsetWidth+runningWidth > windowWidth)
		    {
		    buttonTableRow.removeChild(td);

		    buttonTableRow = addTableRow(table);
		    buttonTableRow.appendChild(td);

		    runningWidth = 0;
		    }
		runningWidth += button.offsetWidth;

		if (msgId == defOpt)
		    button.focus();

		msgId++;
		}
	    // resize window
	    if (window.dialogArguments)
		{
		window.dialogWidth = (form.offsetWidth+20)+"px";
		window.dialogHeight = (form.offsetHeight+40)+"px";
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
	var	msgPrompt = document.getElementById("NXJMessagePrompt");
	var	timeout=promptObject.timeout;

	if (timeout > 0)
	    {
	    window.setTimeout("doButtonPressed(-2)", timeout*1000);
	    }

	if (msgPrompt)
	    msgPrompt.innerHTML = promptObject.promptStr;

	populateButtons(promptObject.options, promptObject.defOpt);

	if (isIE)
	    {
	    document.onkeydown    = new Function("return doOnKeyDown();");
	    }
	else
	    {
	    document.onkeypress = new Function("event","return doOnKeyDown(event);");
	    }
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
	else
	    isIE = false;

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
<tr>&nbsp;</tr>
    <tr >
      <td colspan="2" NOWRAP align="center" > 
        <h4 id="NXJMessagePrompt" name="NXJMessagePrompt" align="center"></h4>
	    </td>
    </tr>
  </table> 
</form>
</body>
</html>        
  		
