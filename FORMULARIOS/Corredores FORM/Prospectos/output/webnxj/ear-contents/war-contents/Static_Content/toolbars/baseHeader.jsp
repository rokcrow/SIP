<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <link href=<%=com.unify.nxj.awebServlet.Runtime.getDefaultStyleSheetURL(request)%> rel="stylesheet" type="text/css">
<STYLE TYPE="text/css">
.disabledImage { -moz-opacity:0.50;filter: progid:DXImageTransform.Microsoft.Alpha(Opacity=50) ;cursor: default }
.UNIFY_DEFAULT_SELECTED_ROW{background-color:blue;color:white}
</STYLE>
<script language="JavaScript">
window.initInternalJavaScriptComponents=function()
{
if (window.namesToComponents == null)
   window.namesToComponents = new Object();
    try{
;firefoxResize();   }catch(e){}
var mgr= window.parent.clientManager;
var e;try{
if(mgr)mgr.setComponentStates(window);
}catch(e){}
}
</script>

<%=com.unify.nxj.awebServlet.Runtime.generateToolbarOnLoad(request, 800,32)%>
</head>

<body onLoad="nxjOnLoad(); window.initInternalJavaScriptComponents();" class="form" >

    <form
        bloom_filter="00000000000000000000000000000000"
        class="form"
        displayheight="32"
        displaywidth="800"
        form_height="32"
        form_width="800"
        name="NXJForm"
        uid_prefix="ontent_toolbars_toolbar1_1260138123462"
        view="form"
        style="position:absolute; top:0px; left:0px; width:800px; height:32px">

    </form>
</body>

</html>
<!--====================================================================*
* BEGIN MODIFICATION HISTORY
*
* Revision #      Date      Time    Changes By
* ============  ========  ========  ==========
* $Log$*
* END MODIFICATION HISTORY
*====================================================================-->