<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        aud_on_entry="false"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00080000000000000800000000000000"
        class="form"
        commands=""
        connection="Connection1"
        displayheight="600"
        displaywidth="1136"
        field_order=""
        form_height="600"
        form_width="1136"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        target_table="PUBLIC.vuu_unidades"
        uid_prefix="modulocnegocios_form1_1374153200053"
        view="form"
        style="background-color: #999999">

        <div
            view="div"
            style="position: absolute; top: 40px; left: 69px; width:1004px; height:371px">

            <fieldset
                border-width="1"
                class="box"
                commands=""
                displayheight="371"
                displayleft="69"
                displaytop="40"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeICompradores."
                key="cajagrandeICompradores."
                original_name="box1"
                uid="modulocnegocios_form1_1374153200053_23397cc2878e5546fa07a5e2d5df77774e0ff1af_1377101504612"
                view="fieldset"
                style="border-width:1;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 146px; left: 120px; width:783px; height:127px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binary_variables=""
                        binding_type="connection"
                        border-width="0"
                        cascade_deletes="false"
                        cascade_updates="false"
                        class="data_view"
                        commands=""
                        connection="Connection1"
                        displayheight="127"
                        displayleft="120"
                        displaytop="146"
                        displaywidth="783"
                        field_weight="199"
                        find_count="10"
                        id="cajagrandeICompradores:PUBLIC_tcl_tipclien."
                        key="cajagrandeICompradores:PUBLIC_tcl_tipclien."
                        kind="data_region"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.tcl_tipclien"
                        uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007075976"
                        update_allowed="false"
                        view="data_region"
                        style="border-width:0;
                            border-style:None">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 10px; left: 10px; width:749px; height:109px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                displayheight="109"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="749"
                                field_weight="99"
                                id="cajagrandeICompradores:PUBLIC_tcl_tipclien:RepeatingArea1."
                                key="cajagrandeICompradores:PUBLIC_tcl_tipclien:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit.0:159;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase.159:122;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo.281:121;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre.402:328"
                                occurrences="10"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201649"
                                view="repeating_area">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:159px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="18"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="159"
                                        field_length="18"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="NIT"
                                        key="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit."
                                        multi_valued="true"
                                        name="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit."
                                        required="true"
                                        retrieve_value="true"
                                        size="26"
                                        target_field="tcl_nit"
                                        title="tcl_nit"
                                        type="text"
                                        uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201673"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 159px; width:122px; height:21px">

                                    <select
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="21"
                                        displayleft="183"
                                        displaytop="0"
                                        displaywidth="122"
                                        field_length="2"
                                        field_type="SELECT"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Clase"
                                        key="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase."
                                        multi_valued="true"
                                        name="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase."
                                        options="Otro=O&#59;Titular=T"
                                        original_name="tcl_clase"
                                        retrieve_value="true"
                                        size="1"
                                        target_field="tcl_clase"
                                        title="tcl_clase"
                                        uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007237849"
                                        updateable="true"
                                        view="select"
                                        style="width:122px; height: 21px">
                                    </select>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 281px; width:121px; height:21px">

                                    <select
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="21"
                                        displayleft="365"
                                        displaytop="0"
                                        displaywidth="121"
                                        field_length="2"
                                        field_type="SELECT"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Tipo"
                                        key="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo."
                                        multi_valued="true"
                                        name="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo."
                                        options="Persona=P&#59;Sociedad=S"
                                        original_name="tcl_tipo"
                                        retrieve_value="true"
                                        size="1"
                                        target_field="tcl_tipo"
                                        title="tcl_tipo"
                                        uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007221014"
                                        updateable="true"
                                        view="select"
                                        style="width:121px; height: 21px">
                                    </select>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 402px; width:328px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="80"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="231"
                                        displaytop="0"
                                        displaywidth="328"
                                        field_length="80"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="Nombre"
                                        key="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre."
                                        multi_valued="true"
                                        name="cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre."
                                        required="true"
                                        retrieve_value="true"
                                        size="54"
                                        target_field="tcl_nombre"
                                        title="tcl_nombre"
                                        type="text"
                                        uid="itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201712"
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
                    style="position: absolute; top: 320px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="320"
                        displaywidth="996"
                        field_weight="399"
                        id="cajagrandeICompradores:box11."
                        key="cajagrandeICompradores:box11."
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
                                id="cajagrandeICompradores:box11:image1."
                                key="cajagrandeICompradores:box11:image1."
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
                        id="cajagrandeICompradores:box111."
                        key="cajagrandeICompradores:box111."
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
                            style="position: absolute; top: 14px; left: 241px; width:370px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="370"
                                foundation_type="Classes/Foundation/Label"
                                id="cajagrandeICompradores:box111:label1."
                                instancewidth="522"
                                key="cajagrandeICompradores:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="IDENTIFICACIÓN DE COMPRADORES"
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
                                id="cajagrandeICompradores:box111:label211."
                                key="cajagrandeICompradores:box111:label211."
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
                                key="cajagrandeICompradores:box111:textfield1."
                                name="cajagrandeICompradores:box111:textfield1."
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
                                key="cajagrandeICompradores:box111:textfield11."
                                name="cajagrandeICompradores:box111:textfield11."
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
                    style="position: absolute; top: 99px; left: 21px; width:240px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="21"
                        displaytop="99"
                        displaywidth="240"
                        id="cajagrandeICompradores:label11."
                        key="cajagrandeICompradores:label11."
                        labelalign="left"
                        labeltitle="Identificación de Compradores"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Identificaci&oacute;n de Compradores</nobr>
                    </label>

                </div>

                <div
                    view="div"
                    style="position: absolute; top: 280px; left: 19px; width:30px; height:22px">

                    <input
                        class="textfield"
                        displayheight="22"
                        displayleft="19"
                        displaytop="280"
                        displaywidth="30"
                        field_type="text"
                        field_weight="299"
                        findable="false"
                        key="cajagrandeICompradores:varadhiere."
                        name="cajagrandeICompradores:varadhiere."
                        original_name="textfield1"
                        size="5"
                        target_field=""
                        type="text"
                        uid="modulocnegocios_form1_1374153200053_23397cc2878e5546fa07a5e2d5df77774e0ff1af_1377117163523"
                        view="text">
                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
