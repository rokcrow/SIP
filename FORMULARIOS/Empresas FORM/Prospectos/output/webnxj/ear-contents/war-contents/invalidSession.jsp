<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	Unify NXJ Application Invalid Session error page.
 *
 *	ORIGINATOR:	meh
 *	CREATION DATE:	Tue Dec  3 10:48:24 PST 2002
 *
 *----------------------------------------------------------------------*/

/**
 * This JSP page displays a Unify NXJ Application Invalid Session Error.
 *
 * @author	meh
 * @author	$Author: meh $	$Exp: $
 * @version	$Revision: 30370 $ $Date: 2004-08-11 08:00:59 -0700 (Wed, 11 Aug 2004) $
 */
-->

  <head>
    <title>Unify NXJ Application Invalid Session</title>

    <script language="javascript">

    function doOnLoad()
    {

	window.parent.clientManager = null;

	if (window.name == "command")
	    {
	    var		form = document.forms["redisplay"];
	    form.submit();
	    }
    }

    function doRestart()
    {
	window.parent.location = window.parent.location;
	return false;
    }

    </script>

  </head>

  
<body onLoad="doOnLoad()" bgcolor="#94AABD" >
    <table>
	<tr> <td align="center">
	    <h1 align="center"><b>
		<font face="Arial, Helvetica, sans-serif">
		    Your Browser session is no longer valid.
		</font></b>
	    </h1>
	</td> </tr>
	<tr> <td align="center">
	    <a href="" onclick="return doRestart()" target="_top">
		<h3 align="center"><b>
		    <font face="Arial, Helvetica, sans-serif" >
			Restart
		    </font></b>
		</h3>
	    </a>
	</td> </tr>
    </table>

    <form name="redisplay" target="mainFrame" action="invalidSession.jsp">
    </form>
</body>
</html>
