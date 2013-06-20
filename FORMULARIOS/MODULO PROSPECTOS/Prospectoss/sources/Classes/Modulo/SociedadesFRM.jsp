<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        aud_on_entry="false"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00000000000400040000000000000000"
        class="form"
        click_on_field="true"
        commands=""
        connection="Connection1"
        displayheight="753"
        displaywidth="1139"
        field_order=""
        footer="none"
        form_height="753"
        form_width="1328"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        target_table="PUBLIC.xem_empresas"
        uid_prefix="modulo_form1_1371763543771"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 190px; width:1004px; height:714px">

            <fieldset
                binary_variables=""
                border-width="0"
                class="box"
                commands=""
                displayheight="714"
                displayleft="190"
                displaytop="30"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeSociedades."
                key="cajagrandeSociedades."
                original_name="box1"
                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371763613650"
                view="fieldset"
                style="border-width:0;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 441px; left: 302px; width:407px; height:154px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binary_variables=""
                        binding_type="connection"
                        border-width="1"
                        cascade_deletes="false"
                        cascade_updates="false"
                        class="data_view"
                        commands=""
                        connection="Connection1"
                        detail_keys="xel_codigo"
                        displayheight="154"
                        displayleft="302"
                        displaytop="441"
                        displaywidth="407"
                        field_weight="199"
                        id="cajagrandeSociedades:PUBLIC_xel_emprelogo1."
                        key="cajagrandeSociedades:PUBLIC_xel_emprelogo1."
                        kind="data_region"
                        master_keys="xem_codigo"
                        master_region="<form>"
                        original_name="view1"
                        relationship_method=""
                        target_field=""
                        target_table="PUBLIC.xel_emprelogo"
                        uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750449"
                        view="data_region"
                        style="border-width:1;
                            border-style:Solid;
                            border-color:Black;
                            background-color: #ccccff">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 44px; left: 123px; width:255px; height:33px">

                            <img
                                binary_variables="Source=xel_logo"
                                class="image"
                                db_type="Binary"
                                displayheight="33"
                                displayleft="123"
                                displaytop="44"
                                displaywidth="255"
                                findable="true"
                                height="33"
                                id="cajagrandeSociedades:PUBLIC_xel_emprelogo1:Image1."
                                image_height="33"
                                image_width="255"
                                key="cajagrandeSociedades:PUBLIC_xel_emprelogo1:Image1."
                                multi_valued="true"
                                src="=&amp;xel_logo"
                                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750471"
                                updateable="true"
                                view="img"
                                width="255">

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 114px; left: 66px; width:234px; height:24px">

                            <input
                                binary_variables="Storage Variable=xel_codigo"
                                class="file"
                                displayheight="27"
                                displayleft="66"
                                displaytop="114"
                                displaywidth="234"
                                field_type="file"
                                file_target="xel_codigo"
                                key="cajagrandeSociedades:PUBLIC_xel_emprelogo1:chooser1."
                                name="cajagrandeSociedades:PUBLIC_xel_emprelogo1:chooser1."
                                original_name="chooser1"
                                target_field=""
                                type="file"
                                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750477"
                                view="file">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 20px; left: 36px; width:55px; height:16px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="16"
                                displayleft="36"
                                displaytop="20"
                                displaywidth="55"
                                id="cajagrandeSociedades:PUBLIC_xel_emprelogo1:label3."
                                key="cajagrandeSociedades:PUBLIC_xel_emprelogo1:label3."
                                labelalign="left"
                                labeltitle="Empresa"
                                original_name="label3"
                                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764775611"
                                view="label"
                                style="font-size: 12px">
                                <nobr>Empresa</nobr>
                            </label>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 20px; left: 139px; width:31px; height:16px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="16"
                                displayleft="139"
                                displaytop="20"
                                displaywidth="31"
                                id="cajagrandeSociedades:PUBLIC_xel_emprelogo1:label31."
                                key="cajagrandeSociedades:PUBLIC_xel_emprelogo1:label31."
                                labelalign="left"
                                labeltitle="Logo"
                                original_name="label3"
                                target_field=""
                                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764775616"
                                view="label"
                                style="font-size: 12px">
                                <nobr>Logo</nobr>
                            </label>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 44px; left: 36px; width:45px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="36"
                                displaytop="44"
                                displaywidth="45"
                                explicit_search_mode="default"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                key="cajagrandeSociedades:PUBLIC_xel_emprelogo1:xel_codigo."
                                multi_valued="true"
                                name="cajagrandeSociedades:PUBLIC_xel_emprelogo1:xel_codigo."
                                retrieve_value="true"
                                size="7"
                                target_field="xel_codigo"
                                type="text"
                                uid="modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750479"
                                updateable="true"
                                view="text">
                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 123px; left: 346px; width:302px; height:245px">

                    <div
                        alternate_row_class="alternate_row"
                        binary_variables=""
                        class="repeating_area"
                        displayheight="245"
                        displayleft="350"
                        displaytop="127"
                        displaywidth="302"
                        field_weight="299"
                        id="cajagrandeSociedades:RepeatingArea1."
                        key="cajagrandeSociedades:RepeatingArea1."
                        kind="repeating_area"
                        list_columns="cajagrandeSociedades:xem_codigo.0:57;cajagrandeSociedades:xem_nombre.57:226"
                        occurrences="15"
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
                                key="cajagrandeSociedades:xem_codigo."
                                multi_valued="true"
                                name="cajagrandeSociedades:xem_codigo."
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
                                key="cajagrandeSociedades:xem_nombre."
                                multi_valued="true"
                                name="cajagrandeSociedades:xem_nombre."
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
                    style="position: absolute; top: 664px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="664"
                        displaywidth="996"
                        field_weight="399"
                        id="cajagrandeSociedades:box11."
                        key="cajagrandeSociedades:box11."
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
                            style="position: absolute; top: 2px; left: 416px; width:164px; height:46px">

                            <div
                                base_class="Classes/ItemsForm/Logo.fx"
                                binary_variables=""
                                displayheight="46"
                                displayleft="416"
                                displaytop="2"
                                displaywidth="164"
                                foundation_type="Classes/Foundation/Image"
                                id="cajagrandeSociedades:box11:image1."
                                key="cajagrandeSociedades:box11:image1."
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
                        id="cajagrandeSociedades:box111."
                        key="cajagrandeSociedades:box111."
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
                            style="position: absolute; top: 14px; left: 241px; width:132px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="132"
                                foundation_type="Classes/Foundation/Label"
                                id="cajagrandeSociedades:box111:label1."
                                instancewidth="522"
                                key="cajagrandeSociedades:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="SOCIEDADES"
                                original_name="label1"
                                uid="form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
                                uid_to_name=""
                                view="label">

                            </div>

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
                                key="cajagrandeSociedades:box111:textfield1."
                                name="cajagrandeSociedades:box111:textfield1."
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
                                key="cajagrandeSociedades:box111:textfield11."
                                name="cajagrandeSociedades:box111:textfield11."
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
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 20px; width:87px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="96"
                        displaywidth="87"
                        id="cajagrandeSociedades:label11."
                        key="cajagrandeSociedades:label11."
                        labelalign="left"
                        labeltitle="Sociedades"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Sociedades</nobr>
                    </label>

                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
