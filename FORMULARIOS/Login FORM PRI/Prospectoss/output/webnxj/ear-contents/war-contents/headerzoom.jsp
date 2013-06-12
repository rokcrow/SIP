<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	Zoom header for Unify NXJ
 *
 *	ORIGINATOR:	meh
 *	CREATION DATE:	Mon Nov 12 15:04:11 PST 2001
 *
 *----------------------------------------------------------------------*/

/**
 * This JSP page displays the Unify NXJ Application header.
 *
 * @author	meh
 * @author	$Author: dlf $	$State$
 * @version	$Revision: 34755 $ $Date: 2005-07-13 15:45:42 -0700 (Wed, 13 Jul 2005) $
 */
-->

    <%AccellManager	    accellManager 
                                = AccellManager.
				    findOrCreateManager(request, application);
      HttpServletResponse   httpResponse 
                                = (HttpServletResponse)response;

      httpResponse.setHeader("Expires", "Thu, 07 Jun 2001 00:00:00 PST");
     %>
  <head>
    <title>Unify NXJ Application Header</title>
	<style TYPE="TEXT/CSS">
	<!--
	.MAINHEADER
	    { font-family: Verdana, Helvetica, Arial, sans-serif;
	      font-size: 8pt; border-style: none;
	      background-color: transparent; color:white }
	-->
	</style>
	<script src="adjustMenuHeight.js"> </script>
	<script language="JavaScript">
    var		PREFERRED_HEIGHT		= "22";

    function doOnLoad()
    {
	// adjust the header frame height
	adjustHeaderHeight(PREFERRED_HEIGHT);
	var mgr = window.parent.clientManager;
	if (mgr 
	    && mgr.eventsOK 
	    && !mgr.doingCommand
	    && !document.forms.header_form.elements["form_mode."].value)
	    {
	    mgr.updateSystemFields(window);
	    }
	}
	</script>
  </head>

<body onLoad=doOnLoad() topmargin="0" bottommargin="0" leftmargin="0" rightmargin="0" marginwidth="0" marginheight="0">
<form name="header_form">

    <table width="100%" border=0 cellspacing=0 cellpadding=0 rowpadding=0 rowspacing=0 bgcolor="#033864">
    <tr valign="top" align="center" >
	<td width="209" CLASS="MAINHEADER">
		&nbsp;</td>
	<td width="40">
	    <%=accellManager.systemField("form_mode.", "7", "56", "CLASS=\"MAINHEADER\"")%></td>
	<td width=10 CLASS="MAINHEADER">
		&nbsp;
		&nbsp;</td>
	<td width="50">
            <%=accellManager.systemField("record_number.", "12", "96", "CLASS=\"MAINHEADER\"")%></td>
	<td width=2 CLASS="MAINHEADER">
		&nbsp;
		&nbsp;</td>
	<td width="80">
	    <%=accellManager.systemField("record_count.", "15", "120", "CLASS=\"MAINHEADER\"")%></td>
	<td width="209" CLASS="MAINHEADER">&nbsp;</td>
    </tr>
  </table>
  </form>

</body>

</html>

