<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/FORMULARIOS/Login FORM PRI/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="949"
        displaywidth="1055"
        form_height="1038"
        form_width="1059"
        name="NXJForm"
        object_type="data_view"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 25px; left: 25px; width:1005px; height:987px">

            <div
                add_allowed="false"
                aud_on_entry="false"
                auto_find="false"
                binary_variables=""
                bloom_filter="00000000000400040000000000000000"
                border-width="1"
                cascade_deletes="false"
                cascade_updates="false"
                class="data_view"
                clear_after_au="false"
                commands=""
                connection="Connection1"
                delete_allowed="false"
                displayheight="987"
                displayleft="25"
                displaytop="25"
                displaywidth="1005"
                fieldheight="987"
                fieldwidth="1005"
                find_count="20"
                foundation_type="Classes/Foundation/Data view"
                id=".top."
                key=".top."
                kind="data_region"
                master_region="PUBLIC_vps_prosigue"
                name=".top."
                target_table="PUBLIC.vpp_prospectos"
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 434px; left: 56px; width:880px; height:258px">

                    <div
                        aud_on_entry="false"
                        auto_find="true"
                        binary_variables=""
                        binding_type="connection"
                        border-width="1"
                        cascade_deletes="false"
                        cascade_updates="false"
                        class="data_view"
                        clear_after_au="false"
                        commands=""
                        connection="Connection1"
                        detail_keys="vps_proyecto;vps_prospecto"
                        displayheight="258"
                        displayleft="56"
                        displaytop="434"
                        displaywidth="880"
                        field_weight="1599"
                        id=".top:PUBLIC_vps_prosigue."
                        key=".top:PUBLIC_vps_prosigue."
                        kind="data_region"
                        master_keys="vpp_proyecto;vpp_numero"
                        master_region="SeguimientoDVW"
                        original_name="view1"
                        relationship_method=""
                        target_table="PUBLIC.vps_prosigue"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317086095"
                        view="data_region"
                        style="border-width:1;
                            border-style:solid">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 10px; left: 10px; width:866px; height:205px">

                            <div
                                alternate_row_class="alternate_row"
                                binary_variables=""
                                class="repeating_area"
                                displayheight="205"
                                displayleft="10"
                                displaytop="10"
                                displaywidth="866"
                                field_weight="99"
                                id=".top:PUBLIC_vps_prosigue:RepeatingArea1."
                                key=".top:PUBLIC_vps_prosigue:RepeatingArea1."
                                kind="repeating_area"
                                list_columns=".top:PUBLIC_vps_prosigue:vps_consecu.0:74;.top:PUBLIC_vps_prosigue:vps_fecha.74:67;.top:PUBLIC_vps_prosigue:vps_hora.141:61;.top:PUBLIC_vps_prosigue:vps_usuario.202:54;.top:PUBLIC_vps_prosigue:vps_mediocon.256:93;.top:PUBLIC_vps_prosigue:vps_califica.349:74;.top:PUBLIC_vps_prosigue:xpc_nombre.423:237;.top:PUBLIC_vps_prosigue:vps_estado.660:94;.top:PUBLIC_vps_prosigue:vps_f_pcontacto.754:93"
                                occurrences="9"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475602"
                                view="repeating_area">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:74px; height:22px">

                                    <input
                                        accell_type="Numeric"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="4"
                                        db_type="Numeric"
                                        displayheight="22"
                                        displayleft="0"
                                        displaytop="0"
                                        displaywidth="74"
                                        field_length="6"
                                        field_type="text"
                                        field_weight="99"
                                        findable="true"
                                        headertitle="Consecutivo"
                                        key=".top:PUBLIC_vps_prosigue:vps_consecu."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_consecu."
                                        retrieve_value="true"
                                        size="12"
                                        stop_for_input="false"
                                        target_field="vps_consecu"
                                        title="vps_consecu"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475612"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 74px; width:67px; height:22px">

                                    <input
                                        accell_type="Date"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="10"
                                        db_type="Date"
                                        displayheight="22"
                                        displayleft="97"
                                        displaytop="0"
                                        displaywidth="67"
                                        field_length="10"
                                        field_type="text"
                                        field_weight="199"
                                        findable="true"
                                        headertitle="Fecha"
                                        key=".top:PUBLIC_vps_prosigue:vps_fecha."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_fecha."
                                        retrieve_value="true"
                                        size="11"
                                        stop_for_input="false"
                                        target_field="vps_fecha"
                                        title="vps_fecha"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475622"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 141px; width:61px; height:22px">

                                    <input
                                        accell_type="Time"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="8"
                                        db_type="Time"
                                        displayheight="22"
                                        displayleft="174"
                                        displaytop="0"
                                        displaywidth="61"
                                        field_length="8"
                                        field_type="text"
                                        field_weight="299"
                                        findable="true"
                                        headertitle="Hora"
                                        key=".top:PUBLIC_vps_prosigue:vps_hora."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_hora."
                                        retrieve_value="true"
                                        size="10"
                                        stop_for_input="false"
                                        target_field="vps_hora"
                                        title="vps_hora"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475632"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 202px; width:54px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="8"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="244"
                                        displaytop="0"
                                        displaywidth="54"
                                        field_length="8"
                                        field_type="text"
                                        field_weight="399"
                                        findable="true"
                                        headertitle="Usuario"
                                        key=".top:PUBLIC_vps_prosigue:vps_usuario."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_usuario."
                                        retrieve_value="true"
                                        size="9"
                                        stop_for_input="false"
                                        target_field="vps_usuario"
                                        title="vps_usuario"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475632_1"
                                        updateable="true"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 256px; width:93px; height:21px">

                                    <select
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="21"
                                        displayleft="424"
                                        displaytop="0"
                                        displaywidth="93"
                                        field_length="2"
                                        field_type="SELECT"
                                        field_weight="499"
                                        findable="true"
                                        headertitle="Medio Contacto"
                                        key=".top:PUBLIC_vps_prosigue:vps_mediocon."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_mediocon."
                                        options="Email=C&#59;Telefono=T&#59;Fax=F&#59;Personal=P"
                                        original_name="vps_mediocon"
                                        retrieve_value="true"
                                        size="1"
                                        target_field="vps_mediocon"
                                        title="vps_mediocon"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317808977"
                                        updateable="true"
                                        view="select"
                                        style="width:93px; height: 21px">
                                    </select>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 349px; width:74px; height:22px">

                                    <input
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="2"
                                        db_type="String"
                                        displayheight="22"
                                        displayleft="445"
                                        displaytop="0"
                                        displaywidth="74"
                                        field_length="2"
                                        field_type="text"
                                        field_weight="599"
                                        findable="true"
                                        headertitle="Seguimiento"
                                        key=".top:PUBLIC_vps_prosigue:vps_califica."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_califica."
                                        retrieve_value="true"
                                        size="12"
                                        target_field="vps_califica"
                                        title="vps_califica"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475652"
                                        updateable="true"
                                        view="text"
                                        zoom_form="parametros/gradointe">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 423px; width:237px; height:22px">

                                    <input
                                        binary_variables=""
                                        class="textfield"
                                        displayheight="22"
                                        displayleft="658"
                                        displaytop="0"
                                        displaywidth="237"
                                        field_type="text"
                                        field_weight="699"
                                        findable="false"
                                        headertitle="Descripcion"
                                        key=".top:PUBLIC_vps_prosigue:xpc_nombre."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:xpc_nombre."
                                        original_name="textfield1"
                                        size="39"
                                        stop_for_input="false"
                                        target_field=""
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318053658"
                                        view="text">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 660px; width:94px; height:21px">

                                    <select
                                        accell_type="String"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="1"
                                        db_type="String"
                                        displayheight="21"
                                        displayleft="658"
                                        displaytop="0"
                                        displaywidth="94"
                                        field_length="2"
                                        field_type="SELECT"
                                        field_weight="799"
                                        findable="true"
                                        headertitle="Estado"
                                        key=".top:PUBLIC_vps_prosigue:vps_estado."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_estado."
                                        options="Si esta interesado=S&#59;Medianamente Interesado=M&#59;No esta interesado=N"
                                        original_name="vps_estado"
                                        retrieve_value="true"
                                        size="1"
                                        stop_for_input="false"
                                        target_field="vps_estado"
                                        title="vps_estado"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318201710"
                                        updateable="true"
                                        view="select"
                                        style="width:94px; height: 21px">
                                    </select>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 754px; width:93px; height:22px">

                                    <input
                                        accell_type="Date"
                                        binary_variables=""
                                        class="textfield"
                                        db_length="10"
                                        db_type="Date"
                                        displayheight="22"
                                        displayleft="621"
                                        displaytop="0"
                                        displaywidth="93"
                                        field_length="10"
                                        field_type="text"
                                        field_weight="899"
                                        findable="true"
                                        headertitle="Fecha Contacto"
                                        key=".top:PUBLIC_vps_prosigue:vps_f_pcontacto."
                                        multi_valued="true"
                                        name=".top:PUBLIC_vps_prosigue:vps_f_pcontacto."
                                        retrieve_value="true"
                                        size="15"
                                        stop_for_input="false"
                                        target_field="vps_f_pcontacto"
                                        title="vps_f_pcontacto"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475672"
                                        updateable="true"
                                        view="text">
                                </div>

                            </div>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 224px; left: 16px; width:73px; height:16px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="16"
                                displayleft="16"
                                displaytop="224"
                                displaywidth="73"
                                id=".top:PUBLIC_vps_prosigue:label1."
                                key=".top:PUBLIC_vps_prosigue:label1."
                                labelalign="left"
                                labeltitle="Comentario"
                                original_name="label1"
                                uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318715874"
                                view="label"
                                style="font-size: 12px">
                                <nobr>Comentario</nobr>
                            </label>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 224px; left: 480px; width:370px; height:22px">

                            <input
                                binary_variables=""
                                class="textfield"
                                displayheight="22"
                                displayleft="480"
                                displaytop="224"
                                displaywidth="370"
                                field_type="text"
                                field_weight="299"
                                findable="false"
                                key=".top:PUBLIC_vps_prosigue:textfield1."
                                name=".top:PUBLIC_vps_prosigue:textfield1."
                                original_name="textfield1"
                                size="61"
                                target_field=""
                                type="text"
                                uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318596397"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 224px; left: 96px; width:370px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="120"
                                db_type="String"
                                displayheight="22"
                                displayleft="96"
                                displaytop="224"
                                displaywidth="370"
                                explicit_search_mode="default"
                                field_length="120"
                                field_type="text"
                                field_weight="199"
                                findable="true"
                                key=".top:PUBLIC_vps_prosigue:vps_comentario1."
                                multi_valued="true"
                                name=".top:PUBLIC_vps_prosigue:vps_comentario1."
                                original_name="textfield1"
                                retrieve_value="true"
                                size="61"
                                target_field="vps_comentario1"
                                type="text"
                                uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318525208"
                                updateable="true"
                                view="text">
                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 931px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="931"
                        displaywidth="996"
                        field_weight="1899"
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
                            style="position: absolute; top: 2px; left: 416px; width:164px; height:46px">

                            <div
                                base_class="Classes/ItemsForm/Logo.fx"
                                binary_variables=""
                                displayheight="46"
                                displayleft="416"
                                displaytop="2"
                                displaywidth="164"
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
                            style="position: absolute; top: 14px; left: 241px; width:318px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="318"
                                foundation_type="Classes/Foundation/Label"
                                id=".top:box111:label1."
                                key=".top:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="SEGUIMIENTO DE PROSPECTOS"
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
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 110px; width:50px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="110"
                        displaytop="127"
                        displaywidth="50"
                        id=".top:label1."
                        key=".top:label1."
                        labelalign="left"
                        labeltitle="Número"
                        original_name="label1"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314716670"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>N&uacute;mero</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 239px; left: 447px; width:100px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="447"
                        displaytop="239"
                        displaywidth="100"
                        id=".top:label10."
                        key=".top:label10."
                        labelalign="left"
                        labeltitle="Teléfono Oficina"
                        original_name="label10"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314890754"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Tel&eacute;fono Oficina</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 20px; width:155px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="96"
                        displaywidth="155"
                        id=".top:label11."
                        key=".top:label11."
                        labelalign="left"
                        labeltitle="Datos del Prospecto"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Datos del Prospecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 295px; left: 447px; width:89px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="447"
                        displaytop="295"
                        displaywidth="89"
                        id=".top:label111."
                        key=".top:label111."
                        labelalign="left"
                        labeltitle="Celular"
                        original_name="label11"
                        target_field=""
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314909226"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Celular</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 805px; left: 20px; width:135px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="805"
                        displaywidth="135"
                        id=".top:label11211."
                        key=".top:label11211."
                        labelalign="left"
                        labeltitle="Asesor de Ventas"
                        original_name="label1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369335393547"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Asesor de Ventas</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 239px; left: 110px; width:33px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="110"
                        displaytop="239"
                        displaywidth="33"
                        id=".top:label12."
                        key=".top:label12."
                        labelalign="left"
                        labeltitle="Email"
                        original_name="label12"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314912297"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Email</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 295px; left: 110px; width:45px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="110"
                        displaytop="295"
                        displaywidth="45"
                        id=".top:label13."
                        key=".top:label13."
                        labelalign="left"
                        labeltitle="Email 2"
                        original_name="label13"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314914577"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Email 2</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 836px; left: 112px; width:192px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="112"
                        displaytop="836"
                        displaywidth="192"
                        id=".top:label14."
                        key=".top:label14."
                        labelalign="left"
                        labeltitle="Vendedor(a) / Demostrador(a)"
                        original_name="label14"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316397216"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Vendedor(a) / Demostrador(a)</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 227px; width:111px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="227"
                        displaytop="127"
                        displaywidth="111"
                        id=".top:label2."
                        key=".top:label2."
                        labelalign="left"
                        labeltitle="Estado Prospecto"
                        original_name="label2"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314722561"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Estado Prospecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 753px; width:85px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="753"
                        displaytop="183"
                        displaywidth="85"
                        id=".top:label3."
                        key=".top:label3."
                        labelalign="left"
                        labeltitle="Fecha Estado"
                        original_name="label3"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314726522"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Fecha Estado</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 445px; width:55px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="445"
                        displaytop="127"
                        displaywidth="55"
                        id=".top:label4."
                        key=".top:label4."
                        labelalign="left"
                        labeltitle="Proyecto"
                        original_name="label4"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314729262"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Proyecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 753px; width:93px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="753"
                        displaytop="127"
                        displaywidth="93"
                        id=".top:label5."
                        key=".top:label5."
                        labelalign="left"
                        labeltitle="Fecha Registro"
                        original_name="label5"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314732523"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Fecha Registro</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 110px; width:49px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="110"
                        displaytop="183"
                        displaywidth="49"
                        id=".top:label6."
                        key=".top:label6."
                        labelalign="left"
                        labeltitle="Nombre"
                        original_name="label6"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314848798"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Nombre</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 445px; width:56px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="445"
                        displaytop="183"
                        displaywidth="56"
                        id=".top:label7."
                        key=".top:label7."
                        labelalign="left"
                        labeltitle="Dirección"
                        original_name="label7"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314851028"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Direcci&oacute;n</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 295px; left: 755px; width:26px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="755"
                        displaytop="295"
                        displaywidth="26"
                        id=".top:label8."
                        key=".top:label8."
                        labelalign="left"
                        labeltitle="País"
                        original_name="label8"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314853819"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Pa&iacute;s</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 239px; left: 753px; width:80px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="753"
                        displaytop="239"
                        displaywidth="80"
                        id=".top:label9."
                        key=".top:label9."
                        labelalign="left"
                        labeltitle="Nacionalidad"
                        original_name="label9"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314856969"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Nacionalidad</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 390px; left: 7px; width:988px; height:1px">

                    <hr
                        binary_variables=""
                        class="horizontal_line"
                        displayheight="1"
                        displayleft="7"
                        displaytop="390"
                        displaywidth="988"
                        id=".top:line112."
                        key=".top:line112."
                        original_name="line1"
                        size="1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346473260"
                        view="hr"
                        width="988"
                        style="border-color:transparent;
                            font-size: 1pt;
                            background-color: Red;
                            color: #ff0033">

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 761px; left: 7px; width:988px; height:1px">

                    <hr
                        binary_variables=""
                        class="horizontal_line"
                        displayheight="1"
                        displayleft="7"
                        displaytop="761"
                        displaywidth="988"
                        id=".top:line1121."
                        key=".top:line1121."
                        original_name="line1"
                        size="1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346640468"
                        view="hr"
                        width="988"
                        style="border-color:transparent;
                            font-size: 1pt;
                            background-color: Red;
                            color: #ff0033">

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 321px; left: 755px; width:165px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="21"
                        displayleft="755"
                        displaytop="321"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="SELECT"
                        field_weight="1499"
                        findable="true"
                        key=".top:vpp_ciudad."
                        multi_valued="true"
                        name=".top:vpp_ciudad."
                        original_name="vpp_ciudad"
                        query="select xpa_nombre from xpa_paises order by xpa_nombre&#59;"
                        retrieve_value="true"
                        size="1"
                        target_field="vpp_ciudad"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369322696499"
                        updateable="true"
                        view="select"
                        style="width:165px; height: 21px;
                            font-size: 12px;
                            color: Black">
                    </select>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 265px; left: 110px; width:250px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="40"
                        db_type="String"
                        displayheight="22"
                        displayleft="110"
                        displaytop="265"
                        displaywidth="250"
                        explicit_search_mode="default"
                        field_length="40"
                        field_type="text"
                        field_weight="999"
                        findable="true"
                        immediate="true"
                        key=".top:vpp_correo."
                        multi_valued="true"
                        name=".top:vpp_correo."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="41"
                        target_field="vpp_correo"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316038340"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 321px; left: 110px; width:250px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="110"
                        displaytop="321"
                        displaywidth="250"
                        explicit_search_mode="default"
                        field_length="100"
                        field_type="text"
                        field_weight="1299"
                        findable="false"
                        immediate="true"
                        key=".top:vpp_cuanta_correo2."
                        multi_valued="true"
                        name=".top:vpp_cuanta_correo2."
                        original_name="textfield1"
                        retrieve_value="false"
                        size="41"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316069934"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 209px; left: 445px; width:250px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="445"
                        displaytop="209"
                        displaywidth="250"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="799"
                        findable="true"
                        key=".top:vpp_direccion."
                        multi_valued="true"
                        name=".top:vpp_direccion."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="41"
                        target_field="vpp_direccion"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315708203"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 227px; width:180px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="dropdown_list"
                        db_length="1"
                        db_type="String"
                        displayheight="21"
                        displayleft="227"
                        displaytop="153"
                        displaywidth="180"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="SELECT"
                        field_weight="299"
                        findable="true"
                        key=".top:vpp_estadopro."
                        multi_valued="true"
                        name=".top:vpp_estadopro."
                        options="Activo=A&#59;Cliente Provivienda=B&#59;No aplica para comprar=C&#59;Compro a la competencia=D"
                        original_name="select1"
                        retrieve_value="true"
                        size="1"
                        target_field="vpp_estadopro"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315286105"
                        updateable="true"
                        view="select"
                        style="width:180px; height: 21px;
                            font-size: 12px;
                            color: Black">
                    </select>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 753px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="textfield"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="753"
                        displaytop="153"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_type="TEXT"
                        field_weight="599"
                        findable="true"
                        id=".top:vpp_fecha."
                        key=".top:vpp_fecha."
                        kind="date"
                        multi_valued="true"
                        original_name="vpp_fecha"
                        retrieve_value="true"
                        target_field="vpp_fecha"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315561473"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 209px; left: 753px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="textfield"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="753"
                        displaytop="209"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_type="TEXT"
                        field_weight="899"
                        findable="true"
                        id=".top:vpp_fechaestado."
                        key=".top:vpp_fechaestado."
                        kind="date"
                        multi_valued="true"
                        original_name="vpp_fechaestado"
                        retrieve_value="true"
                        target_field="vpp_fechaestado"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315375818"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 265px; left: 753px; width:165px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="21"
                        displayleft="753"
                        displaytop="265"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="SELECT"
                        field_weight="1199"
                        findable="true"
                        key=".top:vpp_nacionalidad."
                        multi_valued="true"
                        name=".top:vpp_nacionalidad."
                        original_name="vpp_nacionalidad"
                        query="select xpa_nombre from xpa_paises"
                        retrieve_value="true"
                        size="1"
                        target_field="vpp_nacionalidad"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315773143"
                        updateable="true"
                        view="select"
                        style="width:165px; height: 21px;
                            font-size: 12px;
                            color: Black">
                    </select>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 209px; left: 110px; width:250px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="false"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="40"
                        db_type="String"
                        displayheight="22"
                        displayleft="110"
                        displaytop="209"
                        displaywidth="250"
                        explicit_search_mode="default"
                        field_length="40"
                        field_type="text"
                        field_weight="699"
                        findable="true"
                        key=".top:vpp_nombre."
                        multi_valued="true"
                        name=".top:vpp_nombre."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="41"
                        target_field="vpp_nombre"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315605568"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 110px; width:80px; height:22px">

                    <input
                        accell_type="Numeric"
                        binary_variables=""
                        class="textfield"
                        db_length="9"
                        db_type="Numeric"
                        displayheight="22"
                        displayleft="110"
                        displaytop="153"
                        displaywidth="80"
                        explicit_search_mode="default"
                        field_length="11"
                        field_type="text"
                        field_weight="199"
                        findable="true"
                        key=".top:vpp_numero."
                        multi_valued="true"
                        name=".top:vpp_numero."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="13"
                        target_field="vpp_numero"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315236608"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 445px; width:25px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="445"
                        displaytop="153"
                        displaywidth="25"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="399"
                        findable="true"
                        immediate="true"
                        key=".top:vpp_proyecto."
                        multi_valued="true"
                        name=".top:vpp_proyecto."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="4"
                        target_field="vpp_proyecto"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315424064"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 265px; left: 447px; width:120px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="447"
                        displaytop="265"
                        displaywidth="120"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="1099"
                        findable="true"
                        key=".top:vpp_telofi."
                        multi_valued="true"
                        name=".top:vpp_telofi."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="20"
                        target_field="vpp_telofi"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315902512"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 321px; left: 447px; width:120px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="447"
                        displaytop="321"
                        displaywidth="120"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="1399"
                        findable="true"
                        key=".top:vpp_telres."
                        multi_valued="true"
                        name=".top:vpp_telres."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="20"
                        target_field="vpp_telres"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315958110"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 862px; left: 112px; width:25px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="3"
                        db_type="String"
                        displayheight="22"
                        displayleft="112"
                        displaytop="862"
                        displaywidth="25"
                        explicit_search_mode="default"
                        field_length="3"
                        field_type="text"
                        field_weight="1699"
                        findable="true"
                        immediate="true"
                        key=".top:vpp_vendedor."
                        multi_valued="true"
                        name=".top:vpp_vendedor."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="4"
                        target_field="vpp_vendedor"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316180037"
                        updateable="true"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 153px; left: 477px; width:250px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="477"
                        displaytop="153"
                        displaywidth="250"
                        field_type="text"
                        field_weight="499"
                        findable="false"
                        key=".top:vpy_nombre."
                        name=".top:vpy_nombre."
                        original_name="textfield1"
                        size="41"
                        stop_for_input="false"
                        target_field=""
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315458489"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 862px; left: 160px; width:250px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="160"
                        displaytop="862"
                        displaywidth="250"
                        field_type="text"
                        field_weight="1799"
                        findable="false"
                        key=".top:vve_nombre."
                        name=".top:vve_nombre."
                        original_name="textfield1"
                        size="41"
                        target_field=""
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316251827"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
