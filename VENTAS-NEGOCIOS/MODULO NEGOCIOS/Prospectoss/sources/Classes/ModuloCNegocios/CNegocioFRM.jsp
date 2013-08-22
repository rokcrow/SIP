<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS-NEGOCIOS/MODULO NEGOCIOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        binary_variables=""
        bloom_filter="00080000000000000800000000000000"
        class="form"
        commands=""
        displayheight="664"
        displaywidth="1229"
        field_order=""
        form_height="664"
        form_width="1229"
        foundation_type="Classes/Foundation/Form"
        localized="true"
        name="NXJForm"
        uid_prefix="modulocnegocios_form1_1377190351773"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 190px; width:1004px; height:582px">

            <fieldset
                binary_variables=""
                border-width="1"
                class="box"
                commands=""
                displayheight="582"
                displayleft="190"
                displaytop="30"
                displaywidth="1004"
                field_weight="99"
                id="cajagrandeCPago."
                key="cajagrandeCPago."
                original_name="box1"
                uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377190622117"
                view="fieldset"
                style="border-width:1;
                    border-color:transparent;
                    background-color: #cccccc">

                <div
                    view="div"
                    style="position: absolute; top: 208px; left: 80px; width:831px; height:253px">

                    <div
                        aud_on_entry="false"
                        binding_type="connection"
                        border-width="1"
                        class="data_view"
                        commands=""
                        connection="Connection1"
                        displayheight="253"
                        displayleft="80"
                        displaytop="208"
                        displaywidth="831"
                        field_weight="699"
                        id="cajagrandeCPago:PUBLIC_vcn_comproneg."
                        key="cajagrandeCPago:PUBLIC_vcn_comproneg."
                        kind="data_region"
                        original_name="view1"
                        target_table="PUBLIC.vcn_comproneg"
                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191624550"
                        view="data_region"
                        style="border-width:1;
                            border-style:None">

                        <div
                            view="div"
                            style="position: absolute; top: 10px; left: 10px; width:815px; height:233px">

                            <div
                                alternate_row_class="alternate_row"
                                class="repeating_area"
                                displayheight="233"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="815"
                                field_weight="99"
                                horizontal_scroll_width="97%"
                                id="cajagrandeCPago:PUBLIC_vcn_comproneg:RepeatingArea1."
                                key="cajagrandeCPago:PUBLIC_vcn_comproneg:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_cptopago.0:106;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_nom_compr.106:300;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_fec_comp.406:164;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_vlr_compro.570:150"
                                occurrences="10"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939895"
                                view="repeating_area">

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:221px; height:22px">

                                    <input
                                        accell_type="String"
                                        class="textfield"
                                        db_length="3"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="106"
                                        field_length="3"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="vcn_cptopago"
                                        key="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_cptopago."
                                        multi_valued="true"
                                        name="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_cptopago."
                                        retrieve_value="true"
                                        size="17"
                                        target_field="vcn_cptopago"
                                        title="vcn_cptopago"
                                        type="text"
                                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939902"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 221px; width:222px; height:22px">

                                    <input
                                        accell_type="String"
                                        class="textfield"
                                        db_length="50"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="106"
                                        displaytop="0"
                                        displaywidth="326"
                                        field_length="50"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="vcn_nom_compr"
                                        key="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_nom_compr."
                                        multi_valued="true"
                                        name="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_nom_compr."
                                        retrieve_value="true"
                                        size="50"
                                        target_field="vcn_nom_compr"
                                        title="vcn_nom_compr"
                                        type="text"
                                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939905"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 443px; width:132px; height:22px">

                                    <div
                                        accell_type="Date"
                                        class="textfield"
                                        db_length="10"
                                        db_type="Date"
                                        displayheight="22"
                                        displayleft="398"
                                        displaytop="0"
                                        displaywidth="109"
                                        field_type="TEXT"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="vcn_fec_comp"
                                        id="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_fec_comp."
                                        key="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_fec_comp."
                                        kind="date"
                                        multi_valued="true"
                                        original_name="vcn_fec_comp"
                                        retrieve_value="true"
                                        target_field="vcn_fec_comp"
                                        title="vcn_fec_comp"
                                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939911"
                                        updateable="true"
                                        view="text">

                                    </div>

                                </div>

                                <div
                                    view="div"
                                    style="position: absolute; top: 0px; left: 575px; width:221px; height:22px">

                                    <input
                                        accell_type="Amount"
                                        class="textfield"
                                        db_length="15"
                                        db_type="Amount"
                                        display_justify="Right"
                                        displayheight="22"
                                        displayleft="635"
                                        displaytop="0"
                                        displaywidth="412"
                                        field_length="25"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="vcn_vlr_compro"
                                        key="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_vlr_compro."
                                        multi_valued="true"
                                        name="cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_vlr_compro."
                                        retrieve_value="true"
                                        size="25"
                                        target_field="vcn_vlr_compro"
                                        title="vcn_vlr_compro"
                                        type="text"
                                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939915"
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
                    style="position: absolute; top: 530px; left: 2px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="2"
                        displaytop="530"
                        displaywidth="996"
                        field_weight="199"
                        id="cajagrandeCPago:box11."
                        key="cajagrandeCPago:box11."
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
                                id="cajagrandeCPago:box11:image1."
                                key="cajagrandeCPago:box11:image1."
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
                    style="position: absolute; top: 4px; left: 2px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="2"
                        displaytop="4"
                        displaywidth="996"
                        field_weight="99"
                        id="cajagrandeCPago:box111."
                        key="cajagrandeCPago:box111."
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
                                id="cajagrandeCPago:box111:label1."
                                instancewidth="522"
                                key="cajagrandeCPago:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="COMPROMISOSDELNEGOCIO"
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
                                id="cajagrandeCPago:box111:label211."
                                key="cajagrandeCPago:box111:label211."
                                labelalign="left"
                                labeltitle="top10241"
                                original_name="label2"
                                target_field=""
                                uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
                                view="label">
                                <nobr>top10241</nobr>
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
                                key="cajagrandeCPago:box111:textfield1."
                                name="cajagrandeCPago:box111:textfield1."
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
                                key="cajagrandeCPago:box111:textfield11."
                                name="cajagrandeCPago:box111:textfield11."
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
                    style="position: absolute; top: 96px; left: 20px; width:208px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="96"
                        displaywidth="208"
                        id="cajagrandeCPago:label11."
                        key="cajagrandeCPago:label11."
                        labelalign="left"
                        labeltitle="CompromisosDelNegocio"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>CompromisosDelNegocio</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 443px; width:55px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="443"
                        displaytop="127"
                        displaywidth="55"
                        id="cajagrandeCPago:label31."
                        key="cajagrandeCPago:label31."
                        labelalign="left"
                        labeltitle="Escritura"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843117469"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Escritura</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 112px; width:57px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="112"
                        displaytop="127"
                        displaywidth="57"
                        id="cajagrandeCPago:label311."
                        key="cajagrandeCPago:label311."
                        labelalign="left"
                        labeltitle="Manzana"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843131253"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Manzana</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 280px; width:44px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="280"
                        displaytop="127"
                        displaywidth="44"
                        id="cajagrandeCPago:label3111."
                        key="cajagrandeCPago:label3111."
                        labelalign="left"
                        labeltitle="Unidad"
                        original_name="label3"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843138756"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Unidad</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 719px; width:70px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="719"
                        displaytop="127"
                        displaywidth="70"
                        id="cajagrandeCPago:label312."
                        key="cajagrandeCPago:label312."
                        labelalign="left"
                        labeltitle="Separacion"
                        original_name="label3"
                        target_field=""
                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191147941"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Separacion</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 112px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="3"
                        db_type="String"
                        displayheight="22"
                        displayleft="112"
                        displaytop="153"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="3"
                        field_type="text"
                        field_weight="299"
                        findable="true"
                        key="cajagrandeCPago:vau_manzana."
                        multi_valued="true"
                        name="cajagrandeCPago:vau_manzana."
                        original_name="textfield1"
                        required="true"
                        retrieve_value="true"
                        size="7"
                        target_field="vau_manzana"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843766016"
                        updateable="false"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 280px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="4"
                        db_type="String"
                        displayheight="22"
                        displayleft="280"
                        displaytop="153"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="4"
                        field_type="text"
                        field_weight="399"
                        findable="true"
                        key="cajagrandeCPago:vau_unidad."
                        multi_valued="true"
                        name="cajagrandeCPago:vau_unidad."
                        original_name="textfield1"
                        required="true"
                        retrieve_value="true"
                        size="7"
                        target_field="vau_unidad"
                        type="text"
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843766351"
                        updateable="true"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 443px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="date_picker"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="443"
                        displaytop="153"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="10"
                        field_type="TEXT"
                        field_weight="499"
                        findable="true"
                        id="cajagrandeCPago:vmu_f_separacion."
                        key="cajagrandeCPago:vmu_f_separacion."
                        kind="date"
                        multi_valued="true"
                        original_name="date1"
                        required="true"
                        retrieve_value="true"
                        target_field="vmu_f_separacion"
                        uid="itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371845184559"
                        updateable="true"
                        view="text">

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 719px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="date_picker"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="719"
                        displaytop="153"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="10"
                        field_type="TEXT"
                        field_weight="599"
                        findable="true"
                        id="cajagrandeCPago:vmu_f_separacion1."
                        key="cajagrandeCPago:vmu_f_separacion1."
                        kind="date"
                        multi_valued="true"
                        original_name="date1"
                        required="true"
                        retrieve_value="true"
                        target_field=""
                        uid="modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191254662"
                        updateable="true"
                        view="text">

                    </div>

                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
