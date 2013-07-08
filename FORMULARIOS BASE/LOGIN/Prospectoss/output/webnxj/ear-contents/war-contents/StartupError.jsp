<%@ include file="/charset.jsp" %>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	StartupError.jsp
 *
 *	ORIGINATOR:	aig
 *	CREATION DATE:	Thu Apr 29 11:09:53 PDT 1999
 *
 *----------------------------------------------------------------------*/

/**
 * This JSP page displays an Unify NXJ Application Startup error.
 *
 * @author	aig
 * @author	$Author: dlf $	$Exp: $
 * @version	$Revision: 31440 $ $Date: 2004-09-29 10:56:01 -0700 (Wed, 29 Sep 2004) $
 */
-->
  <head>
    <title>Unify NXJ Application Startup Error</title>
  </head>
  <body text="#000000" bgcolor="#94AABD" 
    link="#0000EE" vlink="#551A8B" alink="#FF0000">
    <form>
    <table width="100%" height="100%"ALIGN="CENTER">
    <tr align="center">
    <td align="CENTER">
    <table border="0">
	<tr>
	    <td align="center" colspan="2">
	      <font face="Ariel, Helvetica, sans=serif" >
	          <h1>The Unify NXJ Application could not be started.</h1><b>
	          <h2><%=request.getAttribute("javax.servlet.error.message")%></h2>
              </font>
	    </td>
	</tr>

    </table>
    </td>
    <tr>
    </table>
    </form>
  </body>
</html>
