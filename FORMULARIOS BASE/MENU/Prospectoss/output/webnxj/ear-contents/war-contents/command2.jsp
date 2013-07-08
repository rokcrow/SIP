<%@ include file="charset.jsp" %>
<html>
  <head>
    <title>command2</title>

    <script language="javascript">
    function doOnLoad()
    {
	var	mgr = window.parent.clientManager;
	if (mgr != null
		&& ! mgr.isZoom
		&& !mgr.refreshedFrameset)
	    {
	    mgr.doingCommand=false;
	    mgr.eventsOK=true;
	    if (!mgr.firstFrame && mgr.windowCounter==0)
		{
		mgr.firstFrame=true;
		if (mgr.fieldDescriptors && mgr.fieldDescriptors.length)
		    {
		    mgr.focusType=window.parent.NATURAL_ORDER_TAB;
		    var curDesc = mgr.fieldDescriptors[mgr.currentFieldId];
		    if (curDesc && (curDesc.flags & 32) != 0)
			mgr.setFocus(curDesc.field);
		    }
		}
	    else if (mgr.firstFrame && mgr.windowCounter==0)
		{
		var curRow = 0;
		var curDesc = mgr.fieldDescriptors[mgr.currentFieldId];
		if (curDesc)
		    {
		    var curDv = mgr.getDataView(curDesc.dataViewName);
		    if (curDv)
			{
			curRow = curDv.currentRow;
			}
		    }
		if (mgr.commandStates["PREVIOUS_FORM"])
		    {
		    try {
			mgr.doCommandInternal("PREVIOUS_FORM", mgr.currentFieldId, curRow);
			} catch (e) {}
		    }
		else
		    {
		    mgr.messageHandler.alert("PrevFormDisabled");
		    }
		}
	    else
		{
		mgr.eventsOK = false;
		window.parent.history.forward();
		}
	    }
    }	    
    </script>
  </head>

  <body onLoad="doOnLoad()" >
       <%=com.unify.nxj.awebServlet.Runtime.getCommandForm()%>
  </body>
</html>
  	
