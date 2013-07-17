<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        aud_on_entry="false"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00000000000000000000000000000000"
        class="form"
        commands=""
        connection="Connection1"
        displayheight="600"
        displaywidth="700"
        field_order=""
        form_height="600"
        form_width="700"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        stop_without_fields="true"
        target_table="PUBLIC.vpp_prospectos"
        uid_prefix="modulocnegocios_form1_1374095694419"
        view="form">

        <div
            view="div"
            style="position: absolute; top: 264px; left: 86px; width:303px; height:22px">

            <input
                accell_type="String"
                class="textfield"
                db_length="1"
                db_type="String"
                displayheight="22"
                displayleft="86"
                displaytop="264"
                displaywidth="303"
                explicit_search_mode="default"
                field_length="2"
                field_type="text"
                field_weight="99"
                findable="true"
                key="vpp_actividad."
                multi_valued="true"
                name="vpp_actividad."
                original_name="textfield1"
                retrieve_value="true"
                size="50"
                target_field="vpp_estado"
                type="text"
                uid="modulocnegocios_form1_1374095694419_9e2fbad8bead24457759d32fb4301242bb3b1074_1374096408001"
                updateable="true"
                view="text">
        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
