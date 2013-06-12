<%@ include file="/charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	NXJServletError.jsp
 *
 *	ORIGINATOR:	aig
 *	CREATION DATE:	Thu Apr 29 11:09:53 PDT 1999
 *
 *----------------------------------------------------------------------*/

/**
 * This JSP page displays a Unify NXJ Application error.
 *
 * @author	aig
 * @author	$Author: dlf $	$Exp: $
 * @version	$Revision: 38112 $ $Date: 2006-05-24 13:51:54 -0700 (Wed, 24 May 2006) $
 */
-->
  <head>
    <title>Unify NXJ Application Error</title>
    <script language="javascript">

    var		msg = escapeHTML(
                        "<%=AccellManager.getEscapedHTML(request.getAttribute(
			    "javax.servlet.error.message"))%>");



    function escapeHTML(
         msg
	 )
    {

	return msg;

    }

    function doRestart()
    {
    var winParent = window.parent;
    if (winParent.name == "_nxjfirstcommand")
	{
	winParent = winParent.parent;
	}
    var href = winParent.location.href;
    var quest = href.indexOf('?');
    if (quest != -1)
	{
	href = href.substring(0,quest);
	}
    var dotNxj = href.lastIndexOf(".nxj");
    if (dotNxj == href.length -4)
	{
	href = href.substring(0, href.length-4);
	}
    winParent.location.href = href;
    return false;
    }

    function doOnLoad()
    {

	window.parent.clientManager = null;

	if (window.name == "command")
	    {
	    var	    frame = window.parent.document.frames["mainFrame"];

	    var	    snippet = 
		    "<form action=\"UnifyNXJ.jsp\">"
		    + "<table width=\"100%\" height=\"100%\"ALIGN=\"CENTER\">"
		    + "<tr align=\"center\">"
		    + "<td align=\"CENTER\">"
		    + "<table border=\"0\">"
		    + "<tr>"
		    + "<td align=\"center\" colspan=\"2\">"
		    + "<font face=\"Ariel, Helvetica, sans=serif\" >"
		    + "<h1>Unify NXJ Error</h1><br>"
		    + "<h2>"
		    + msg
		    + "</h2>"
		    + "</font>"
		    + "</td>"
		    + "</tr>"
		    + "</td>"
		    + "<tr>"
		    + "<tr> <td align=\"center\">"
		    + "<a href=\"\" onclick=\"window.parent.location = window.parent.location;return false;\" target=\"_parent\">"
		    + "<h3 align=\"center\"><br>"
		    + "<font face=\"Arial, Helvetica, sans-serif\" >"
		    + "Restart"
		    + "</font></b>"
		    + "</h3>"
		    + "</a>"
		    + "</td> </tr>"
		    + "</table>"
		    + "</form>";

	    frame.document.open();
	    frame.document.write(snippet);
	    frame.document.close();
	    }
    }
    </script>
  </head>
  <body onLoad='doOnLoad()' bgcolor='#94AABD'>
    <form action="UnifyNXJ.jsp">
    <table width="100%" height="100%"ALIGN="CENTER">
    <tr align="center">
    <td align="CENTER">
    <table border="0">
	<tr>
	    <td align="center" colspan="2">
	      <font face="Ariel, Helvetica, sans=serif" >
	          <h1>Unify NXJ Error</h1><br>
	          <h2><%=AccellManager.getEscapedHTML(request.getAttribute("javax.servlet.error.message"))%></h2>
              </font>
	    </td>
	</tr>
	<tr> <td align="center">
	    <a href="" onclick="return doRestart()" target="_parent">
		<h3 align="center"><br>
		    <font face="Arial, Helvetica, sans-serif" >
			Restart
		    </font></b>
		</h3>
	    </a>
	</td> </tr>

    </table>
    </td>
    <tr>
    </table>
    </form>
  </body>
</html>
