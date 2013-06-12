<%@ include file="charset.jsp" %>
<%@ page import="com.unify.nxj.awebServlet.AccellManager" isThreadSafe="true"%>
<html>
<!--
/*----------------------------------------------------------------------*
 *	CLASS:	 	trim.jsp
 *
 *	ORIGINATOR:	aig
 *	CREATION DATE:	Thu Apr 29 11:09:53 PDT 1999
 *
 *----------------------------------------------------------------------*/

/**
 * This JSP page displays an ACCELL/Web Application trim window.
 *
 * @author	aig
 * @author	$Author: meh $	$Exp: $
 * @version	$Revision: 30370 $ $Date: 2004-08-11 08:00:59 -0700 (Wed, 11 Aug 2004) $
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
    <title>trim.jsp</title>

  </head>

  <body>     
   <font face="Arial, Helvetica, sans-serif" size="2" color="#C79800">
   <%=accellManager.getTrimHTML(request.getParameter("name"))%>
   </font>
  </body>
</html>
  	
