<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/1 Directorio de Unidades Disponibles/CNegocios/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        aud_on_entry="false"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00000000000400042000000000000000"
        class="form"
        commands=""
        connection="Connection1"
        displayheight="748"
        displaywidth="1194"
        field_order=""
        footer="none"
        form_height="748"
        form_width="1194"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        target_table="PUBLIC.xob_obras"
        uid_prefix="modulo_form1_1372970373750"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 190px; width:1004px; height:716px">

            <fieldset
                binary_variables=""
                border-width="0"
                class="box"
                commands=""
                displayheight="716"
                displayleft="190"
                displaytop="30"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeDUDisponibles."
                key="cajagrandeDUDisponibles."
                original_name="box1"
                uid="modulo_form1_1372970373750_71ea30ee24e0516900bb98ebbe219e914a80211d_1372970386149"
                view="fieldset"
                style="border-width:0;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 277px; left: 79px; width:831px; height:203px">

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
                        detail_keys="vuu_obra;vuu_empresa"
                        displayheight="203"
                        displayleft="79"
                        displaytop="277"
                        displaywidth="831"
                        field_weight="699"
                        id="cajagrandeDUDisponibles:PUBLIC_vuu_unidades."
                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades."
                        kind="data_region"
                        master_keys="xob_obra;xob_empresa"
                        master_region="<form>"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.vuu_unidades"
                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373295060761"
                        view="data_region"
                        style="border-width:1;
                            border-style:solid">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 8px; left: 10px; width:815px; height:193px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                displayheight="193"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="815"
                                field_weight="99"
                                horizontal_scroll_width="82%"
                                id="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1."
                                key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.0:104;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.104:101;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.205:95;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.300:98;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.398:98;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.496:89;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.585:84;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.669:81;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.750:76;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.826:105"
                                occurrences="12"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629957"
                                view="repeating_area">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:99px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="104"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="Manzana"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana."
                                        retrieve_value="true"
                                        size="17"
                                        target_field="vuu_manzana"
                                        title="vuu_manzana"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629963"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 99px; width:95px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="4"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="106"
                                        displaytop="0"
                                        displaywidth="101"
                                        field_length="4"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Unidad"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad."
                                        retrieve_value="true"
                                        size="16"
                                        target_field="vuu_unidad"
                                        title="vuu_unidad"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629967"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 194px; width:89px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="194"
                                        displaytop="0"
                                        displaywidth="95"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Modelo"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo."
                                        retrieve_value="true"
                                        size="15"
                                        target_field="vuu_modelo"
                                        title="vuu_modelo"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629971"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 283px; width:93px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="9"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="287"
                                        displaytop="0"
                                        displaywidth="98"
                                        field_length="16"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="Área Lote"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote."
                                        retrieve_value="true"
                                        size="16"
                                        target_field="vuu_area_lote"
                                        title="vuu_area_lote"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629975"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 376px; width:93px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="9"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="397"
                                        displaytop="0"
                                        displaywidth="98"
                                        field_length="16"
                                        field_type="text"
                                        field_weight="499"
                                        findable="true"
                                        headertitle="Área Const."
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const."
                                        retrieve_value="true"
                                        size="16"
                                        target_field="vuu_area_const"
                                        title="vuu_area_const"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629980"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 469px; width:84px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="519"
                                        displaytop="0"
                                        displaywidth="89"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="599"
                                        findable="true"
                                        headertitle="ESQ"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina."
                                        retrieve_value="true"
                                        size="14"
                                        target_field="vuu_esquina"
                                        title="vuu_esquina"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629985"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 553px; width:80px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="615"
                                        displaytop="0"
                                        displaywidth="84"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="699"
                                        findable="true"
                                        headertitle="MTC"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1."
                                        retrieve_value="true"
                                        size="14"
                                        target_field="vuu_muro1"
                                        title="vuu_muro1"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629990"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 633px; width:76px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="701"
                                        displaytop="0"
                                        displaywidth="81"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="799"
                                        findable="true"
                                        headertitle="MLA"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2."
                                        retrieve_value="true"
                                        size="13"
                                        target_field="vuu_muro2"
                                        title="vuu_muro2"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629995"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 709px; width:72px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="787"
                                        displaytop="0"
                                        displaywidth="76"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="899"
                                        findable="true"
                                        headertitle="PARQ"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque."
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vuu_parque"
                                        title="vuu_parque"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296630000"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 781px; width:15px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="15"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="877"
                                        displaytop="0"
                                        displaywidth="105"
                                        field_length="25"
                                        field_type="text"
                                        field_weight="999"
                                        findable="true"
                                        headertitle="Precio Unidad"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni."
                                        retrieve_value="true"
                                        size="17"
                                        target_field="vuu_precio_uni"
                                        title="vuu_precio_uni"
                                        type="text"
                                        uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296630006"
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
                    style="position: absolute; top: 666px; left: 3px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="3"
                        displaytop="666"
                        displaywidth="996"
                        field_weight="899"
                        id="cajagrandeDUDisponibles:box11."
                        key="cajagrandeDUDisponibles:box11."
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
                                id="cajagrandeDUDisponibles:box11:image1."
                                key="cajagrandeDUDisponibles:box11:image1."
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
                        id="cajagrandeDUDisponibles:cajaarribaDUDisponibles."
                        key="cajagrandeDUDisponibles:cajaarribaDUDisponibles."
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
                                key="cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualempresa."
                                name="cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualempresa."
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
                                key="cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualusuario."
                                name="cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualusuario."
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
                            style="position: absolute; top: 14px; left: 241px; width:522px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="522"
                                foundation_type="Classes/Foundation/Label"
                                id="cajagrandeDUDisponibles:cajaarribaDUDisponibles:label1."
                                instancewidth="522"
                                key="cajagrandeDUDisponibles:cajaarribaDUDisponibles:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="DIRECTORIO DE UNIDADES DISPONIBLES"
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
                                id="cajagrandeDUDisponibles:cajaarribaDUDisponibles:label211."
                                key="cajagrandeDUDisponibles:cajaarribaDUDisponibles:label211."
                                labelalign="left"
                                labeltitle="top: 1024"
                                original_name="label2"
                                target_field=""
                                uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
                                view="label">
                                <nobr>top: 1024</nobr>
                            </label>

                        </div>

                    </fieldset>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 549px; left: 204px; width:138px; height:48px">

                    <div
                        base_class="Classes/ItemsForm/Boton.fx"
                        binary_variables=""
                        displayleft="204"
                        displaytop="549"
                        field_type="button"
                        foundation_type="Classes/Foundation/Button"
                        id="cajagrandeDUDisponibles:imprimirbtn."
                        key="cajagrandeDUDisponibles:imprimirbtn."
                        kind="instance"
                        original_name="button1"
                        uid="form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368028211102"
                        uid_to_name=""
                        value="IMPRIMIR"
                        view="button">

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 19px; width:269px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="19"
                        displaytop="96"
                        displaywidth="269"
                        id="cajagrandeDUDisponibles:label11."
                        key="cajagrandeDUDisponibles:label11."
                        labelalign="left"
                        labeltitle="Directorio de Unidades Disponibles"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Directorio de Unidades Disponibles</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 347px; width:55px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="347"
                        displaytop="127"
                        displaywidth="55"
                        id="cajagrandeDUDisponibles:label3."
                        key="cajagrandeDUDisponibles:label3."
                        labelalign="left"
                        labeltitle="Proyecto"
                        original_name="label3"
                        uid="desing_form1_1369342922091_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767264011"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Proyecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 347px; width:31px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="347"
                        displaytop="183"
                        displaywidth="31"
                        id="cajagrandeDUDisponibles:label31."
                        key="cajagrandeDUDisponibles:label31."
                        labelalign="left"
                        labeltitle="Obra"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098070485"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Obra</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 538px; left: 716px; width:31px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="716"
                        displaytop="538"
                        displaywidth="31"
                        id="cajagrandeDUDisponibles:label311."
                        key="cajagrandeDUDisponibles:label311."
                        labelalign="left"
                        labeltitle="Total"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371746701531"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Total</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 55px; width:57px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="55"
                        displaytop="250"
                        displaywidth="57"
                        id="cajagrandeDUDisponibles:label32."
                        key="cajagrandeDUDisponibles:label32."
                        labelalign="left"
                        labeltitle="Manzana"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098191251"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Manzana</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 132px; width:44px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="132"
                        displaytop="250"
                        displaywidth="44"
                        id="cajagrandeDUDisponibles:label321."
                        key="cajagrandeDUDisponibles:label321."
                        labelalign="left"
                        labeltitle="Unidad"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098203003"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Unidad</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 212px; width:45px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="212"
                        displaytop="250"
                        displaywidth="45"
                        id="cajagrandeDUDisponibles:label3211."
                        key="cajagrandeDUDisponibles:label3211."
                        labelalign="left"
                        labeltitle="Modelo"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098204386"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Modelo</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 523px; width:26px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="523"
                        displaytop="250"
                        displaywidth="26"
                        id="cajagrandeDUDisponibles:label32111."
                        key="cajagrandeDUDisponibles:label32111."
                        labelalign="left"
                        labeltitle="ESQ"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098217076"
                        view="label"
                        style="font-size: 12px">
                        <nobr>ESQ</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 835px; width:86px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="835"
                        displaytop="250"
                        displaywidth="86"
                        id="cajagrandeDUDisponibles:label321111."
                        key="cajagrandeDUDisponibles:label321111."
                        labelalign="left"
                        labeltitle="Precio Unidad"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098222173"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Precio Unidad</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 600px; width:26px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="600"
                        displaytop="250"
                        displaywidth="26"
                        id="cajagrandeDUDisponibles:label32112."
                        key="cajagrandeDUDisponibles:label32112."
                        labelalign="left"
                        labeltitle="MTC"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098222163"
                        view="label"
                        style="font-size: 12px">
                        <nobr>MTC</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 380px; width:114px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="380"
                        displaytop="250"
                        displaywidth="114"
                        id="cajagrandeDUDisponibles:label3212."
                        key="cajagrandeDUDisponibles:label3212."
                        labelalign="left"
                        labeltitle="Área Construcción"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098217087"
                        view="label"
                        style="font-size: 12px">
                        <nobr>&Aacute;rea Construcci&oacute;n</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 755px; width:34px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="755"
                        displaytop="250"
                        displaywidth="34"
                        id="cajagrandeDUDisponibles:label32121."
                        key="cajagrandeDUDisponibles:label32121."
                        labelalign="left"
                        labeltitle="PARQ"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098222188"
                        view="label"
                        style="font-size: 12px">
                        <nobr>PARQ</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 290px; width:61px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="290"
                        displaytop="250"
                        displaywidth="61"
                        id="cajagrandeDUDisponibles:label322."
                        key="cajagrandeDUDisponibles:label322."
                        labelalign="left"
                        labeltitle="Área Lote"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098217094"
                        view="label"
                        style="font-size: 12px">
                        <nobr>&Aacute;rea Lote</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 250px; left: 678px; width:25px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="678"
                        displaytop="250"
                        displaywidth="25"
                        id="cajagrandeDUDisponibles:label3221."
                        key="cajagrandeDUDisponibles:label3221."
                        labelalign="left"
                        labeltitle="MLA"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098222180"
                        view="label"
                        style="font-size: 12px">
                        <nobr>MLA</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 549px; left: 365px; width:138px; height:48px">

                    <div
                        base_class="Classes/ItemsForm/Boton.fx"
                        binary_variables=""
                        displayleft="365"
                        displaytop="549"
                        field_type="button"
                        foundation_type="Classes/Foundation/Button"
                        id="cajagrandeDUDisponibles:regresarbtn."
                        key="cajagrandeDUDisponibles:regresarbtn."
                        kind="instance"
                        original_name="button1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371749444506"
                        uid_to_name=""
                        value="REGRESAR"
                        view="button">

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 394px; width:204px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="394"
                        displaytop="153"
                        displaywidth="204"
                        field_type="text"
                        field_weight="299"
                        findable="false"
                        key="cajagrandeDUDisponibles:textfield1."
                        name="cajagrandeDUDisponibles:textfield1."
                        original_name="textfield1"
                        size="34"
                        target_field=""
                        type="text"
                        uid="desing_form1_1369342922091_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767260538"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 208px; left: 394px; width:204px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="394"
                        displaytop="208"
                        displaywidth="204"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="499"
                        findable="true"
                        key="cajagrandeDUDisponibles:textfield11."
                        multi_valued="true"
                        name="cajagrandeDUDisponibles:textfield11."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="34"
                        target_field="xob_nombre"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098123122"
                        updateable="true"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 558px; left: 716px; width:188px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="716"
                        displaytop="558"
                        displaywidth="188"
                        field_type="text"
                        field_weight="599"
                        findable="false"
                        key="cajagrandeDUDisponibles:total1."
                        name="cajagrandeDUDisponibles:total1."
                        original_name="textfield1"
                        size="31"
                        target_field=""
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371746659557"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 590px; left: 792px; width:112px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="792"
                        displaytop="590"
                        displaywidth="112"
                        field_type="text"
                        field_weight="799"
                        findable="false"
                        key="cajagrandeDUDisponibles:total2."
                        name="cajagrandeDUDisponibles:total2."
                        original_name="textfield1"
                        size="18"
                        target_field=""
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371746675999"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 208px; left: 347px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="347"
                        displaytop="208"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="399"
                        findable="true"
                        key="cajagrandeDUDisponibles:xob_obra."
                        multi_valued="true"
                        name="cajagrandeDUDisponibles:xob_obra."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="7"
                        target_field="xob_obra"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371740691367"
                        updateable="true"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 347px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="true"
                        binary_variables=""
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="347"
                        displaytop="153"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="199"
                        findable="true"
                        key="cajagrandeDUDisponibles:xob_proyecto."
                        multi_valued="true"
                        name="cajagrandeDUDisponibles:xob_proyecto."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="7"
                        target_field="xob_proyecto"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371740682449"
                        updateable="true"
                        view="text">
                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>