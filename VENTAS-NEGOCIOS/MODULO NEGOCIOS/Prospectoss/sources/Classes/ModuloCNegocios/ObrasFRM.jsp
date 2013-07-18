<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        aud_on_entry="false"
        auto_find="true"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00000000000400040000000000000000"
        class="form"
        clear_after_au="false"
        commands=""
        connection="Connection1"
        displayheight="496"
        displaywidth="1193"
        field_order=""
        footer="none"
        form_height="499"
        form_width="1199"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        target_table="PUBLIC.xob_obras"
        uid_prefix="modulocnegocios_form1_1373643877543"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 190px; width:1004px; height:464px">

            <fieldset
                binary_variables=""
                border-width="0"
                class="box"
                commands=""
                displayheight="464"
                displayleft="190"
                displaytop="30"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeObrasFRM."
                key="cajagrandeObrasFRM."
                original_name="box1"
                uid="modulo_form1_1372970373750_71ea30ee24e0516900bb98ebbe219e914a80211d_1372970386149"
                view="fieldset"
                style="border-width:0;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 159px; left: 303px; width:425px; height:194px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binary_variables=""
                        binding_type="connection"
                        border-width="0"
                        class="data_view"
                        commands=""
                        connection="Connection1"
                        detail_keys=""
                        displayheight="194"
                        displayleft="303"
                        displaytop="159"
                        displaywidth="425"
                        field_weight="199"
                        id="cajagrandeObrasFRM:PUBLIC_xob_obras."
                        key="cajagrandeObrasFRM:PUBLIC_xob_obras."
                        kind="data_region"
                        master_keys=""
                        master_region="<form>"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.xob_obras"
                        uid="modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647885012"
                        view="data_region"
                        style="border-width:0;
                            border-style:None">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 10px; left: 10px; width:387px; height:168px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                columns_sortable="true"
                                displayheight="168"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="387"
                                field_weight="99"
                                horizontal_scroll_width="400"
                                id="cajagrandeObrasFRM:PUBLIC_xob_obras:RepeatingArea1."
                                key="cajagrandeObrasFRM:PUBLIC_xob_obras:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto.0:105;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra.105:72;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre.177:191"
                                occurrences="10"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952695"
                                view="repeating_area">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:105px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="2"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="105"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="Proyecto"
                                        key="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto."
                                        multi_valued="true"
                                        name="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto."
                                        retrieve_value="true"
                                        size="17"
                                        target_field="xob_proyecto"
                                        title="xob_proyecto"
                                        type="text"
                                        uid="modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952701"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 105px; width:72px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="2"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="105"
                                        displaytop="0"
                                        displaywidth="72"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Obra"
                                        key="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra."
                                        multi_valued="true"
                                        name="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra."
                                        retrieve_value="true"
                                        size="12"
                                        target_field="xob_obra"
                                        title="xob_obra"
                                        type="text"
                                        uid="modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952704"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 177px; width:191px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="30"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="177"
                                        displaytop="0"
                                        displaywidth="191"
                                        field_length="30"
                                        field_type="text"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Nombre"
                                        key="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre."
                                        multi_valued="true"
                                        name="cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre."
                                        retrieve_value="true"
                                        size="31"
                                        target_field="xob_nombre"
                                        title="xob_nombre"
                                        type="text"
                                        uid="modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952707"
                                        updateable="true"
                                        view="text">
                                </div>

                            </div>

                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 414px; left: 3px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="3"
                        displaytop="414"
                        displaywidth="996"
                        field_weight="299"
                        id="cajagrandeObrasFRM:box11."
                        key="cajagrandeObrasFRM:box11."
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
                                id="cajagrandeObrasFRM:box11:image1."
                                key="cajagrandeObrasFRM:box11:image1."
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
                        id="cajagrandeObrasFRM:cajaarribaObrasFRM."
                        key="cajagrandeObrasFRM:cajaarribaObrasFRM."
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
                                immediate="false"
                                key="cajagrandeObrasFRM:cajaarribaObrasFRM:actualempresa."
                                name="cajagrandeObrasFRM:cajaarribaObrasFRM:actualempresa."
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
                                immediate="false"
                                key="cajagrandeObrasFRM:cajaarribaObrasFRM:actualusuario."
                                name="cajagrandeObrasFRM:cajaarribaObrasFRM:actualusuario."
                                original_name="textfield1"
                                size="18"
                                stop_for_input="false"
                                target_field=""
                                type="text"
                                uid="desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929929174"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 14px; left: 241px; width:194px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="194"
                                foundation_type="Classes/Foundation/Label"
                                id="cajagrandeObrasFRM:cajaarribaObrasFRM:label1."
                                instancewidth="194"
                                key="cajagrandeObrasFRM:cajaarribaObrasFRM:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="Consulta de Obras"
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
                            style="position: absolute; top: 65px; left: 778px; width:46px; height:14px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="21"
                                displayleft="778"
                                displaytop="65"
                                displaywidth="46"
                                id="cajagrandeObrasFRM:cajaarribaObrasFRM:label211."
                                key="cajagrandeObrasFRM:cajaarribaObrasFRM:label211."
                                labelalign="left"
                                labeltitle="top1024"
                                original_name="label2"
                                target_field=""
                                uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
                                view="label">
                                <nobr>top1024</nobr>
                            </label>

                        </div>

                    </fieldset>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 19px; width:143px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="19"
                        displaytop="96"
                        displaywidth="143"
                        id="cajagrandeObrasFRM:label11."
                        key="cajagrandeObrasFRM:label11."
                        labelalign="left"
                        labeltitle="Consulta de Obras"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Consulta de Obras</nobr>
                    </label>

                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
