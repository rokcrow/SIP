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
        displayheight="751"
        displaywidth="1199"
        field_order=""
        footer="none"
        form_height="751"
        form_width="1199"
        foundation_type="Classes/Foundation/Form"
        localized="true"
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
                    style="position: absolute; top: 277px; left: 32px; width:903px; height:203px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        auto_refresh="true"
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
                        displayleft="32"
                        displaytop="277"
                        displaywidth="903"
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
                            style="position: absolute; top: 8px; left: 10px; width:858px; height:193px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                displayheight="193"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="858"
                                field_weight="99"
                                horizontal_scroll_width="82%"
                                id="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1."
                                key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.0:72;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.72:73;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.145:66;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.211:75;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.286:83;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.369:69;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.438:76;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.514:61;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.575:114;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.689:150"
                                occurrences="12"
                                repeat_style="View"
                                selected_row_class="selected_row"
                                uid="modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629957"
                                view="repeating_area">

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:72px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="10"
                                        displaytop="161"
                                        displaywidth="72"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="Manzana"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana."
                                        original_name="vuu_manzana"
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vuu_manzana"
                                        title="vuu_manzana"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312756"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 72px; width:73px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="4"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="82"
                                        displaytop="161"
                                        displaywidth="73"
                                        field_length="4"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Unidad"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad."
                                        original_name="vuu_unidad"
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vuu_unidad"
                                        title="vuu_unidad"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312801"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 145px; width:66px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="155"
                                        displaytop="161"
                                        displaywidth="66"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Modelo"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo."
                                        original_name="vuu_modelo"
                                        retrieve_value="true"
                                        size="11"
                                        target_field="vuu_modelo"
                                        title="vuu_modelo"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312840"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 211px; width:75px; height:22px">

                                    <input
                                        accell_type="Float"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="9"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="221"
                                        displaytop="161"
                                        displaywidth="75"
                                        field_length="16"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="AreaLote"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote."
                                        original_name="vuu_area_lote"
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vuu_area_lote"
                                        title="vuu_area_lote"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312856"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 286px; width:83px; height:22px">

                                    <input
                                        accell_type="Float"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="9"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="296"
                                        displaytop="161"
                                        displaywidth="83"
                                        field_length="16"
                                        field_type="text"
                                        field_weight="499"
                                        findable="true"
                                        headertitle="AreaConst"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const."
                                        original_name="vuu_area_const"
                                        retrieve_value="true"
                                        size="13"
                                        target_field="vuu_area_const"
                                        title="vuu_area_const"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312871"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 369px; width:69px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="379"
                                        displaytop="161"
                                        displaywidth="69"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="599"
                                        findable="true"
                                        headertitle="ESQ"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina."
                                        original_name="vuu_esquina"
                                        retrieve_value="true"
                                        size="11"
                                        target_field="vuu_esquina"
                                        title="vuu_esquina"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312887"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 438px; width:76px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="448"
                                        displaytop="161"
                                        displaywidth="76"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="699"
                                        findable="true"
                                        headertitle="MTC"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1."
                                        original_name="vuu_muro1"
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vuu_muro1"
                                        title="vuu_muro1"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312901"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 514px; width:61px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="524"
                                        displaytop="161"
                                        displaywidth="61"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="799"
                                        findable="true"
                                        headertitle="MLA"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2."
                                        original_name="vuu_muro2"
                                        retrieve_value="true"
                                        size="10"
                                        target_field="vuu_muro2"
                                        title="vuu_muro2"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312913"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 575px; width:114px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="585"
                                        displaytop="161"
                                        displaywidth="114"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="899"
                                        findable="true"
                                        headertitle="PARQ"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque."
                                        original_name="vuu_parque"
                                        retrieve_value="true"
                                        size="19"
                                        target_field="vuu_parque"
                                        title="vuu_parque"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312925"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 689px; width:150px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="15"
                                        db_type="Amount"
                                        display_justify="Left"
                                        displayheight="22"
                                        displayleft="699"
                                        displaytop="161"
                                        displaywidth="150"
                                        field_length="25"
                                        field_type="text"
                                        field_weight="999"
                                        findable="true"
                                        headertitle="Precio Unidad"
                                        key="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni."
                                        multi_valued="true"
                                        name="cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni."
                                        original_name="vuu_precio_uni"
                                        retrieve_value="true"
                                        size="25"
                                        target_field="vuu_precio_uni"
                                        title="vuu_precio_uni"
                                        type="text"
                                        uid="modulo_form1_1372970373750_bf4dcede5606128abd8337d42986c25c6566fc71_1373467312938"
                                        updateable="true"
                                        view="text"
                                        style="background-color: #999999">
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
                                labeltitle="dudisponibles"
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
                        labeltitle="ddudisponibles"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>ddudisponibles</nobr>
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
                    style="position: absolute; top: 549px; left: 365px; width:138px; height:48px">

                    <div
                        base_class="Classes/ItemsForm/Boton.fx"
                        binary_variables=""
                        command="Previous Form"
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
                    style="position: absolute; top: 208px; left: 394px; width:204px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
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
                    style="position: absolute; top: 153px; left: 394px; width:204px; height:22px">

                    <input
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        displayheight="22"
                        displayleft="394"
                        displaytop="153"
                        displaywidth="204"
                        field_type="text"
                        field_weight="299"
                        findable="true"
                        key="cajagrandeDUDisponibles:vpy_nombre."
                        multi_valued="true"
                        name="cajagrandeDUDisponibles:vpy_nombre."
                        original_name="textfield1"
                        size="34"
                        stop_for_input="false"
                        target_field=""
                        type="text"
                        uid="desing_form1_1369342922091_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767260538"
                        updateable="false"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 208px; left: 347px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="true"
                        binary_variables=""
                        case_conversion="Upper"
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
                        immediate="true"
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
                        case_conversion="Upper"
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
                        immediate="true"
                        key="cajagrandeDUDisponibles:xob_proyecto."
                        multi_valued="true"
                        name="cajagrandeDUDisponibles:xob_proyecto."
                        original_name="textfield1"
                        retrieve_value="true"
                        return_values_into="xob_proyecto"
                        size="7"
                        target_field="xob_proyecto"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371740682449"
                        updateable="true"
                        view="text"
                        zoom_form="Modulo/ProyectosFRM">
                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
