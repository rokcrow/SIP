<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        aud_on_entry="false"
        binary_variables=""
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
        target_table="PUBLIC.vev_etapaven"
        uid_prefix="modulocnegocios_form2_1374153203129"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 58px; left: 114px; width:510px; height:22px">

            <input
                binary_variables=""
                class="textfield"
                displayheight="22"
                displayleft="114"
                displaytop="58"
                displaywidth="510"
                field_type="text"
                field_weight="99"
                findable="false"
                key="textfield1."
                name="textfield1."
                original_name="textfield1"
                size="85"
                target_field=""
                type="text"
                uid="modulocnegocios_form2_1374153203129_b79797a5bf49a1c367bc34a6d4970cb3ca617368_1374153220575"
                view="text">
        </div>

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 198px; left: 82px; width:189px; height:22px">

            <input
                accell_type="String"
                binary_variables=""
                class="textfield"
                db_length="2"
                db_type="String"
                displayheight="22"
                displayleft="82"
                displaytop="198"
                displaywidth="189"
                explicit_search_mode="default"
                field_length="2"
                field_type="text"
                field_weight="199"
                findable="true"
                key="vev_etapactu."
                multi_valued="true"
                name="vev_etapactu."
                original_name="textfield2"
                retrieve_value="true"
                size="31"
                target_field="vev_estado"
                type="text"
                uid="modulocnegocios_form2_1374153203129_819e3f00d03b348105d34088bce4b61d5970a86e_1375458350144"
                updateable="true"
                view="text">
        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
