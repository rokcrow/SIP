<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/Otros FORMS/Prospectos/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="871"
        displaywidth="1055"
        form_height="603"
        form_width="1055"
        name="NXJForm"
        object_type="data_view"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 25px; left: 25px; width:1005px; height:553px">

            <div
                binary_variables=""
                bloom_filter="00000000000400042000000000000000"
                border-width="1"
                class="data_view"
                commands=""
                displayheight="553"
                displayleft="25"
                displaytop="25"
                displaywidth="1005"
                fieldheight="553"
                fieldwidth="1005"
                foundation_type="Classes/Foundation/Data view"
                id=".top."
                key=".top."
                kind="data_region"
                name=".top."
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    view="div"
                    style="position: absolute; top: 127px; left: 646px; width:322px; height:206px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binding_type="connection"
                        border-width="1"
                        class="data_view"
                        commands=""
                        connection="&lt;inherit&gt;"
                        detail_keys="xel_codigo"
                        displayheight="206"
                        displayleft="646"
                        displaytop="127"
                        displaywidth="322"
                        field_weight="299"
                        id=".top:PUBLIC_xel_emprelogo."
                        key=".top:PUBLIC_xel_emprelogo."
                        kind="data_region"
                        master_keys="xem_codigo"
                        master_region="<form>"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.xel_emprelogo"
                        uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777882438"
                        view="data_region"
                        style="border-width:1;
                            border-style:solid">

                        <div
                            view="div"
                            style="position: absolute; top: 96px; left: 80px; width:213px; height:33px">

                            <img
                                class="image"
                                db_type="Binary"
                                displayheight="33"
                                displayleft="80"
                                displaytop="96"
                                displaywidth="213"
                                findable="true"
                                height="33"
                                id=".top:PUBLIC_xel_emprelogo:Image1."
                                image_height="33"
                                image_width="213"
                                key=".top:PUBLIC_xel_emprelogo:Image1."
                                multi_valued="true"
                                src="=&amp;xel_logo"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957319"
                                updateable="true"
                                view="img"
                                width="213">

                        </div>

                        <div
                            view="div"
                            align="left" 
                            style="position: absolute; top: 30px; left: 16px; width:55px; height:16px">
                            
                            
                            <label
                                class="label"
                                displayheight="16"
                                displayleft="16"
                                displaytop="30"
                                displaywidth="55"
                                id=".top:PUBLIC_xel_emprelogo:Label1."
                                key=".top:PUBLIC_xel_emprelogo:Label1."
                                labelalign="left"
                                labeltitle="Empresa"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957269"
                                view="label"
                                style="font-size: 12px">
                                <nobr>Empresa</nobr>
                            </label>

                        </div>

                        <div
                            view="div"
                            align="left" 
                            style="position: absolute; top: 114px; left: 16px; width:31px; height:16px">
                            
                            
                            <label
                                class="label"
                                displayheight="16"
                                displayleft="16"
                                displaytop="114"
                                displaywidth="31"
                                id=".top:PUBLIC_xel_emprelogo:Label2."
                                key=".top:PUBLIC_xel_emprelogo:Label2."
                                labelalign="left"
                                labeltitle="Logo"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957309"
                                view="label"
                                style="font-size: 12px">
                                <nobr>Logo</nobr>
                            </label>

                        </div>

                        <div
                            view="div"
                            style="position: absolute; top: 160px; left: 50px; width:234px; height:24px">

                            <input
                                class="file"
                                displayheight="27"
                                displayleft="50"
                                displaytop="160"
                                displaywidth="234"
                                field_type="file"
                                file_target="xel_codigo"
                                key=".top:PUBLIC_xel_emprelogo:chooser1."
                                name=".top:PUBLIC_xel_emprelogo:chooser1."
                                original_name="chooser1"
                                target_field=""
                                type="file"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369778118981"
                                view="file">
                        </div>

                        <div
                            view="div"
                            style="position: absolute; top: 30px; left: 107px; width:44px; height:22px">

                            <input
                                accell_type="String"
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="107"
                                displaytop="30"
                                displaywidth="44"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                key=".top:PUBLIC_xel_emprelogo:xel_codigo."
                                multi_valued="true"
                                name=".top:PUBLIC_xel_emprelogo:xel_codigo."
                                retrieve_value="true"
                                size="7"
                                target_field="xel_codigo"
                                type="text"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957289"
                                updateable="true"
                                view="text">
                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 127px; left: 157px; width:302px; height:344px">

                    <div
                        alternate_row_class="alternate_row"
                        binary_variables=""
                        class="repeating_area"
                        displayheight="344"
                        displayleft="251"
                        displaytop="127"
                        displaywidth="302"
                        field_weight="199"
                        id=".top:RepeatingArea1."
                        key=".top:RepeatingArea1."
                        kind="repeating_area"
                        list_columns=".top:xem_codigo.0:57;.top:xem_nombre.57:226"
                        occurrences="21"
                        repeat_style="Grid"
                        row_class="ROW"
                        selected_row_class="selected_row"
                        uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506668"
                        view="repeating_area">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 0px; width:57px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="0"
                                displaytop="0"
                                displaywidth="57"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                headertitle="Codigo"
                                key=".top:xem_codigo."
                                multi_valued="true"
                                name=".top:xem_codigo."
                                retrieve_value="true"
                                size="9"
                                target_field="xem_codigo"
                                title="xem_codigo"
                                type="text"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506688"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 57px; width:226px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="30"
                                db_type="String"
                                displayheight="22"
                                displayleft="92"
                                displaytop="0"
                                displaywidth="226"
                                field_length="30"
                                field_type="text"
                                field_weight="199"
                                findable="true"
                                headertitle="Nombre"
                                key=".top:xem_nombre."
                                multi_valued="true"
                                name=".top:xem_nombre."
                                retrieve_value="true"
                                size="37"
                                target_field="xem_nombre"
                                title="xem_nombre"
                                type="text"
                                uid="parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506698"
                                updateable="true"
                                view="text">
                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 498px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="498"
                        displaywidth="996"
                        field_weight="399"
                        id=".top:box11."
                        key=".top:box11."
                        original_name="box1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369343805083"
                        view="fieldset"
                        style="border-width:0;
                            border-style:None;
                            border-color:transparent;
                            background-color: #e30000">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: -6px; left: 391px; width:222px; height:62px">

                            <div
                                base_class="Classes/ItemsForm/Logo.fx"
                                binary_variables=""
                                displayleft="391"
                                displaytop="-6"
                                foundation_type="Classes/Foundation/Image"
                                id=".top:box11:image1."
                                key=".top:box11:image1."
                                kind="instance"
                                original_name="image1"
                                uid="itemsform_dataview1_1368038367945_c486553ba63e77316f04c86372ffc3ae6f0d73b1_1368040829176"
                                uid_to_name=""
                                view="img">

                            </div>

                        </div>

                    </fieldset>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 2px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="2"
                        displaywidth="996"
                        field_weight="99"
                        id=".top:box111."
                        key=".top:box111."
                        original_name="box1"
                        target_field=""
                        uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928873884"
                        view="fieldset"
                        style="border-width:0;
                            border-style:None;
                            border-color:transparent;
                            background-color: #e30000">

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 14px; left: 241px; width:108px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="108"
                                foundation_type="Classes/Foundation/Label"
                                id=".top:box111:label1."
                                key=".top:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="EMPRESAS"
                                original_name="label1"
                                uid="form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
                                uid_to_name=""
                                view="label">

                            </div>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 65px; left: 778px; width:55px; height:14px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="21"
                                displayleft="778"
                                displaytop="65"
                                displaywidth="55"
                                id=".top:box111:label211."
                                key=".top:box111:label211."
                                labelalign="left"
                                labeltitle="top: 1024"
                                original_name="label2"
                                target_field=""
                                uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
                                view="label">
                                <nobr>top: 1024</nobr>
                            </label>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 14px; left: 16px; width:197px; height:22px">

                            <input
                                binary_variables=""
                                class="textfield"
                                displayheight="22"
                                displayleft="16"
                                displaytop="14"
                                displaywidth="197"
                                field_type="text"
                                field_weight="99"
                                findable="false"
                                immediate="true"
                                key=".top:box111:textfield1."
                                name=".top:box111:textfield1."
                                original_name="textfield1"
                                size="32"
                                stop_for_input="false"
                                target_field=""
                                type="text"
                                uid="desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929860573"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 14px; left: 800px; width:110px; height:22px">

                            <input
                                binary_variables=""
                                class="textfield"
                                displayheight="22"
                                displayleft="800"
                                displaytop="14"
                                displaywidth="110"
                                field_type="text"
                                field_weight="199"
                                findable="false"
                                immediate="true"
                                key=".top:box111:textfield11."
                                name=".top:box111:textfield11."
                                original_name="textfield1"
                                size="18"
                                stop_for_input="false"
                                target_field=""
                                type="text"
                                uid="desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929929174"
                                view="text">
                        </div>

                    </fieldset>

                </div>

                <div
                    view="div"
                    align="Left" 
                    style="position: absolute; top: 96px; left: 646px; width:214px; height:18px">
                    
                    
                    <label
                        class="label"
                        displayheight="18"
                        displayleft="646"
                        displaytop="96"
                        displaywidth="214"
                        id=".top:label1."
                        key=".top:label1."
                        labeltitle="Cargar Imagen de Empresa"
                        original_name="label1"
                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369585460995"
                        view="label"
                        style="font-weight: bold;
                            font-size: 14px">
                        <nobr>Cargar Imagen de Empresa</nobr>
                    </label>

                </div>

                <div
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 112px; width:140px; height:18px">
                    
                    
                    <label
                        class="label"
                        displayheight="18"
                        displayleft="112"
                        displaytop="96"
                        displaywidth="140"
                        id=".top:label11."
                        key=".top:label11."
                        labelalign="left"
                        labeltitle="Lista de Empresas"
                        original_name="label1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369585488958"
                        view="label"
                        style="font-weight: bold;
                            font-size: 14px">
                        <nobr>Lista de Empresas</nobr>
                    </label>

                </div>

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
