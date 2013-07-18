<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        aud_on_entry="false"
        auto_find="false"
        binary_variables=""
        binding_type="connection"
        bloom_filter="00000000000400040000000000000000"
        class="form"
        commands=""
        connection="Connection1"
        displayheight="632"
        displaywidth="700"
        field_order=""
        footer="none"
        form_height="637"
        form_width="1201"
        foundation_type="Classes/Foundation/Form"
        name="NXJForm"
        target_table="PUBLIC.xob_obras"
        uid_prefix="modulo_form1_1370116094841"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 192px; width:1004px; height:602px">

            <fieldset
                binary_variables=""
                border-width="0"
                class="box"
                commands=""
                displayheight="602"
                displayleft="192"
                displaytop="30"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeCPPantalla."
                key="cajagrandeCPPantalla."
                original_name="box1"
                uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1370116137614"
                view="fieldset"
                style="border-width:0;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 278px; left: 175px; width:713px; height:204px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binary_variables=""
                        binding_type="connection"
                        border-width="0"
                        class="data_view"
                        commands=""
                        connection="Connection1"
                        detail_keys="vlp_empresa;vlp_obra"
                        displayheight="204"
                        displayleft="175"
                        displaytop="278"
                        displaywidth="713"
                        field_weight="699"
                        id="cajagrandeCPPantalla:PUBLIC_vlp_listapre."
                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre."
                        kind="data_region"
                        master_keys="xob_empresa;xob_obra"
                        master_region="<form>"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.vlp_listapre"
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578210562"
                        view="data_region"
                        style="border-width:0;
                            border-style:None">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 10px; left: 32px; width:618px; height:193px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                displayheight="193"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="618"
                                field_weight="99"
                                id="cajagrandeCPPantalla:PUBLIC_vlp_listapre:RepeatingArea1."
                                key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana.0:101;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad.101:82;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial.183:89;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final.272:78;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni.350:150;cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario.500:99"
                                occurrences="12"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504549"
                                view="repeating_area">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:101px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="101"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="Manzana"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_manzana."
                                        retrieve_value="true"
                                        size="16"
                                        target_field="vlp_manzana"
                                        title="vlp_manzana"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504586"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 101px; width:82px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="4"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="101"
                                        displaytop="0"
                                        displaywidth="82"
                                        field_length="4"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Unidad"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_unidad."
                                        retrieve_value="true"
                                        size="13"
                                        target_field="vlp_unidad"
                                        title="vlp_unidad"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504613"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 183px; width:89px; height:22px">

                                    <input
                                        accell_type="Date"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="10"
                                        db_type="Date"
                                        displayheight="22"
                                        displayleft="183"
                                        displaytop="0"
                                        displaywidth="89"
                                        field_length="10"
                                        field_type="text"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Fecha Inicial"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_inicial."
                                        retrieve_value="true"
                                        size="14"
                                        target_field="vlp_f_inicial"
                                        title="vlp_f_inicial"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504616"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 272px; width:78px; height:22px">

                                    <input
                                        accell_type="Date"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="10"
                                        db_type="Date"
                                        displayheight="22"
                                        displayleft="272"
                                        displaytop="0"
                                        displaywidth="78"
                                        field_length="10"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="Fecha Final"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_f_final."
                                        retrieve_value="true"
                                        size="13"
                                        target_field="vlp_f_final"
                                        title="vlp_f_final"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504620"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 350px; width:150px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="15"
                                        db_type="Amount"
                                        display_justify="Right"
                                        displayheight="22"
                                        displayleft="350"
                                        displaytop="0"
                                        displaywidth="150"
                                        field_length="25"
                                        field_type="text"
                                        field_weight="499"
                                        findable="true"
                                        headertitle="Precio Unidad"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_precio_uni."
                                        retrieve_value="true"
                                        size="25"
                                        target_field="vlp_precio_uni"
                                        title="vlp_precio_uni"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504624"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 500px; width:99px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="8"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="500"
                                        displaytop="0"
                                        displaywidth="99"
                                        field_length="8"
                                        field_type="text"
                                        field_weight="599"
                                        findable="true"
                                        headertitle="Usuario"
                                        key="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario."
                                        multi_valued="true"
                                        name="cajagrandeCPPantalla:PUBLIC_vlp_listapre:vlp_usuario."
                                        retrieve_value="true"
                                        size="16"
                                        target_field="vlp_usuario"
                                        title="vlp_usuario"
                                        type="text"
                                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373578504628"
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
                    style="position: absolute; top: 551px; left: 2px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="2"
                        displaytop="551"
                        displaywidth="996"
                        field_weight="799"
                        id="cajagrandeCPPantalla:box11."
                        key="cajagrandeCPPantalla:box11."
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
                                id="cajagrandeCPPantalla:box11:image1."
                                key="cajagrandeCPPantalla:box11:image1."
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
                        field_weight="199"
                        id="cajagrandeCPPantalla:cajaarribaCPPantalla."
                        key="cajagrandeCPPantalla:cajaarribaCPPantalla."
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
                            style="position: absolute; top: 14px; left: 241px; width:522px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="522"
                                foundation_type="Classes/Foundation/Label"
                                id="cajagrandeCPPantalla:cajaarribaCPPantalla:label1."
                                instancewidth="522"
                                key="cajagrandeCPPantalla:cajaarribaCPPantalla:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="CONSULTA PRECIOS EN PANTALLA"
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
                                id="cajagrandeCPPantalla:cajaarribaCPPantalla:label211."
                                key="cajagrandeCPPantalla:cajaarribaCPPantalla:label211."
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
                                key="cajagrandeCPPantalla:cajaarribaCPPantalla:textfield1."
                                name="cajagrandeCPPantalla:cajaarribaCPPantalla:textfield1."
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
                                key="cajagrandeCPPantalla:cajaarribaCPPantalla:textfield11."
                                name="cajagrandeCPPantalla:cajaarribaCPPantalla:textfield11."
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
                    style="position: absolute; top: 96px; left: 18px; width:129px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="18"
                        displaytop="96"
                        displaywidth="129"
                        id="cajagrandeCPPantalla:label11."
                        key="cajagrandeCPPantalla:label11."
                        labelalign="left"
                        labeltitle="Listas de Precios"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Listas de Precios</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 345px; width:31px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="345"
                        displaytop="183"
                        displaywidth="31"
                        id="cajagrandeCPPantalla:label311."
                        key="cajagrandeCPPantalla:label311."
                        labelalign="left"
                        labeltitle="Obra"
                        original_name="label3"
                        target_field=""
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199137"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Obra</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 345px; width:55px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="345"
                        displaytop="127"
                        displaywidth="55"
                        id="cajagrandeCPPantalla:label33."
                        key="cajagrandeCPPantalla:label33."
                        labelalign="left"
                        labeltitle="Proyecto"
                        original_name="label3"
                        target_field=""
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199194"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Proyecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 395px; width:274px; height:22px">

                    <input
                        auto_accept="true"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        displayheight="22"
                        displayleft="395"
                        displaytop="153"
                        displaywidth="274"
                        field_type="text"
                        field_weight="399"
                        findable="true"
                        key="cajagrandeCPPantalla:vpy_nombre."
                        multi_valued="true"
                        name="cajagrandeCPPantalla:vpy_nombre."
                        original_name="textfield1"
                        size="45"
                        stop_for_input="false"
                        target_field=""
                        type="text"
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199114"
                        updateable="false"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 209px; left: 395px; width:274px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="395"
                        displaytop="209"
                        displaywidth="274"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="599"
                        findable="true"
                        key="cajagrandeCPPantalla:xob_nombre."
                        multi_valued="true"
                        name="cajagrandeCPPantalla:xob_nombre."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="45"
                        stop_for_input="false"
                        target_field="xob_nombre"
                        type="text"
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199141"
                        updateable="false"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 209px; left: 345px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="true"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="345"
                        displaytop="209"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="499"
                        findable="true"
                        immediate="true"
                        key="cajagrandeCPPantalla:xob_obra."
                        multi_valued="true"
                        name="cajagrandeCPPantalla:xob_obra."
                        original_name="textfield1"
                        retrieve_value="true"
                        return_values_into="xob_obra"
                        size="7"
                        target_field="xob_obra"
                        type="text"
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199180"
                        updateable="true"
                        view="text"
                        zoom_form="ModuloCNegocios/ObrasFRM">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 345px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="true"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="345"
                        displaytop="153"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="299"
                        findable="true"
                        immediate="true"
                        key="cajagrandeCPPantalla:xob_proyecto."
                        multi_valued="true"
                        name="cajagrandeCPPantalla:xob_proyecto."
                        original_name="textfield1"
                        retrieve_value="true"
                        return_values_into="xob_proyecto"
                        size="7"
                        target_field="xob_proyecto"
                        type="text"
                        uid="modulo_form1_1370116094841_78da72979176fe75f7d37b9d8c9c658040e52e54_1373576199154"
                        updateable="true"
                        view="text"
                        zoom_form="Modulo/ProyectosFRM">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 192px; left: 69px; width:38px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="69"
                        displaytop="192"
                        displaywidth="38"
                        field_type="text"
                        field_weight="99"
                        findable="false"
                        key="cajagrandeCPPantalla:xxx."
                        name="cajagrandeCPPantalla:xxx."
                        original_name="textfield1"
                        size="6"
                        target_field=""
                        type="text"
                        uid="modulocnegocios_form3_1374153206470_b79797a5bf49a1c367bc34a6d4970cb3ca617368_1374153226895"
                        view="text"
                        style="visibility:hidden">
                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
