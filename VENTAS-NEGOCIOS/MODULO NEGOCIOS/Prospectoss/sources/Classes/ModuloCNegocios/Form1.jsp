<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

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
        target_table="PUBLIC.vuu_unidades"
        uid_prefix="modulocnegocios_form1_1374153200053"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 71px; left: 169px; width:194px; height:22px">

            <input
                binary_variables=""
                class="textfield"
                displayheight="22"
                displayleft="169"
                displaytop="71"
                displaywidth="194"
                field_type="text"
                field_weight="99"
                findable="false"
                key="textfield1."
                name="textfield1."
                original_name="textfield1"
                size="32"
                target_field=""
                type="text"
                uid="modulocnegocios_form1_1374153200053_b79797a5bf49a1c367bc34a6d4970cb3ca617368_1374153214407"
                view="text">
        </div>

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 248px; left: 50px; width:199px; height:22px">

            <input
                accell_type="String"
                binary_variables=""
                class="textfield"
                db_length="4"
                db_type="String"
                displayheight="22"
                displayleft="50"
                displaytop="248"
                displaywidth="199"
                explicit_search_mode="default"
                field_length="3"
                field_type="text"
                field_weight="199"
                findable="true"
                key="vmu_garage1."
                multi_valued="true"
                name="vmu_garage1."
                original_name="textfield2"
                retrieve_value="true"
                size="33"
                target_field="vuu_unidad"
                type="text"
                uid="modulocnegocios_form1_1374153200053_6546af96706303913107b41a1c6783362f76e870_1375713690994"
                updateable="true"
                view="text">
        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
