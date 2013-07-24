<html title="SeguimientodeProspectos1">
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" style="background-color: #999999" >

    <form
        add_allowed="true"
        aud_on_entry="true"
        binary_variables=""
        bloom_filter="00000000000400040000000000000000"
        class="form"
        commands=""
        connection="Connection1"
        delete_allowed="false"
        displayheight="1025"
        displaywidth="1209"
        field_order="CajaSegui.?CajaSegui:cajaarribaSProspectos.?CajaSegui:cajaarribaSProspectos:actualempresa.?CajaSegui:cajaarribaSProspectos:actualusuario.?CajaSegui:vpp_numero.?CajaSegui:vpp_estadopro.?CajaSegui:vpp_proyecto.?CajaSegui:vpy_nombre.?CajaSegui:vpp_fecha.?CajaSegui:vpp_nombre.?CajaSegui:vpp_direccion.?CajaSegui:vpp_fechaestado.?CajaSegui:vpp_correo.?CajaSegui:vpp_telofi.?CajaSegui:vpp_nacionalidad.?CajaSegui:vpp_cuanta_correo2.?CajaSegui:vpp_telres.?CajaSegui:vpp_ciudad.?CajaSegui:PUBLIC_vps_prosigue.?CajaSegui:PUBLIC_vps_prosigue:RepeatingArea1.?CajaSegui:PUBLIC_vps_prosigue:vps_consecu.?CajaSegui:PUBLIC_vps_prosigue:vps_fecha.?CajaSegui:PUBLIC_vps_prosigue:vps_hora.?CajaSegui:PUBLIC_vps_prosigue:vps_usuario.?CajaSegui:PUBLIC_vps_prosigue:vps_mediocon.?CajaSegui:PUBLIC_vps_prosigue:vps_califica.?CajaSegui:PUBLIC_vps_prosigue:xpc_nombre.?CajaSegui:PUBLIC_vps_prosigue:vps_estado.?CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto.?CajaSegui:PUBLIC_vps_prosigue:vps_comentario1.?CajaSegui:PUBLIC_vps_prosigue:textfield1.?CajaSegui:vpp_vendedor.?CajaSegui:vve_nombre.?CajaSegui:box11."
        footer="none"
        form_height="1025"
        form_width="1209"
        foundation_type="Classes/Foundation/Form"
        localized="true"
        name="NXJForm"
        target_table="PUBLIC.vpp_prospectos"
        uid_prefix="form1_1371588526491"
        view="form"
        style="background-color: #999999">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 30px; left: 195px; width:1005px; height:981px">

            <fieldset
                binary_variables=""
                border-width="0"
                class="box"
                commands=""
                displayheight="981"
                displayleft="195"
                displaytop="30"
                displaywidth="1005"
                field_weight="99"
                id="CajaSegui."
                key="CajaSegui."
                original_name="box1"
                uid="form1_1371588526491_624e34f928f8586fb84ca3c2412c191af5f96f12_1371589358805"
                view="fieldset"
                style="border-width:0;
                    border-color:transparent;
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
                        id="CajaSegui:PUBLIC_vps_prosigue."
                        key="CajaSegui:PUBLIC_vps_prosigue."
                        kind="data_region"
                        master_keys="vpp_proyecto;vpp_numero"
                        master_region="<form>"
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
                                id="CajaSegui:PUBLIC_vps_prosigue:RepeatingArea1."
                                key="CajaSegui:PUBLIC_vps_prosigue:RepeatingArea1."
                                kind="repeating_area"
                                list_columns="CajaSegui:PUBLIC_vps_prosigue:vps_consecu.0:74;CajaSegui:PUBLIC_vps_prosigue:vps_fecha.74:67;CajaSegui:PUBLIC_vps_prosigue:vps_hora.141:61;CajaSegui:PUBLIC_vps_prosigue:vps_usuario.202:54;CajaSegui:PUBLIC_vps_prosigue:vps_mediocon.256:93;CajaSegui:PUBLIC_vps_prosigue:vps_califica.349:74;CajaSegui:PUBLIC_vps_prosigue:xpc_nombre.423:237;CajaSegui:PUBLIC_vps_prosigue:vps_estado.660:94;CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto.754:93"
                                occurrences="9"
                                repeat_style="Grid"
                                row_class="ROW"
                                selected_row_class="selected_row"
                                uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475602"
                                view="repeating_area"
                                style="font-size: 10px">

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 0px; width:78px; height:22px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_consecu."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_consecu."
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
                                    style="position: absolute; top: 0px; left: 78px; width:67px; height:22px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_fecha."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_fecha."
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
                                    style="position: absolute; top: 0px; left: 145px; width:53px; height:22px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_hora."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_hora."
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
                                    style="position: absolute; top: 0px; left: 198px; width:54px; height:22px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_usuario."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_usuario."
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
                                    style="position: absolute; top: 0px; left: 252px; width:103px; height:21px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_mediocon."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_mediocon."
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
                                    style="position: absolute; top: 0px; left: 355px; width:85px; height:22px">

                                    <input
                                        accell_type="String"
                                        auto_accept="true"
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
                                        immediate="true"
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_califica."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_califica."
                                        retrieve_value="true"
                                        return_values_into="vps_califica"
                                        size="12"
                                        target_field="vps_califica"
                                        title="vps_califica"
                                        type="text"
                                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475652"
                                        updateable="true"
                                        view="text"
                                        zoom_form="Modulo/GradoInteresFRM">
                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    style="position: absolute; top: 0px; left: 440px; width:221px; height:22px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:xpc_nombre."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:xpc_nombre."
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
                                    style="position: absolute; top: 0px; left: 661px; width:76px; height:21px">

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
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_estado."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_estado."
                                        options="Siestainteresado=S&#59;MedianamenteInteresado=M&#59;Noestainteresado=N"
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
                                    style="position: absolute; top: 0px; left: 737px; width:110px; height:22px">

                                    <input
                                        accell_type="Date"
                                        auto_accept="false"
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
                                        immediate="false"
                                        key="CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto."
                                        multi_valued="true"
                                        name="CajaSegui:PUBLIC_vps_prosigue:vps_f_pcontacto."
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
                                id="CajaSegui:PUBLIC_vps_prosigue:label1."
                                key="CajaSegui:PUBLIC_vps_prosigue:label1."
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
                                key="CajaSegui:PUBLIC_vps_prosigue:textfield1."
                                name="CajaSegui:PUBLIC_vps_prosigue:textfield1."
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
                                key="CajaSegui:PUBLIC_vps_prosigue:vps_comentario1."
                                multi_valued="true"
                                name="CajaSegui:PUBLIC_vps_prosigue:vps_comentario1."
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
                        id="CajaSegui:box11."
                        key="CajaSegui:box11."
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
                                displayleft="416"
                                displaytop="2"
                                foundation_type="Classes/Foundation/Image"
                                height="46"
                                id="CajaSegui:box11:image1."
                                image_height="46"
                                image_width="164"
                                key="CajaSegui:box11:image1."
                                kind="instance"
                                original_name="image1"
                                uid="form1_1371588526491_624e34f928f8586fb84ca3c2412c191af5f96f12_1371589168779"
                                uid_to_name=""
                                view="img"
                                width="164">

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
                        id="CajaSegui:cajaarribaSProspectos."
                        key="CajaSegui:cajaarribaSProspectos."
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
                                key="CajaSegui:cajaarribaSProspectos:actualempresa."
                                name="CajaSegui:cajaarribaSProspectos:actualempresa."
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
                                key="CajaSegui:cajaarribaSProspectos:actualusuario."
                                name="CajaSegui:cajaarribaSProspectos:actualusuario."
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
                            style="position: absolute; top: 15px; left: 242px; width:323px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="242"
                                displaytop="15"
                                displaywidth="323"
                                foundation_type="Classes/Foundation/Label"
                                id="CajaSegui:cajaarribaSProspectos:label1."
                                instancewidth="323"
                                key="CajaSegui:cajaarribaSProspectos:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="SEGUIMIENTODEPROSPECTOS"
                                original_name="label1"
                                uid="form1_1371588526491_624e34f928f8586fb84ca3c2412c191af5f96f12_1371589158625"
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
                                id="CajaSegui:cajaarribaSProspectos:label211."
                                key="CajaSegui:cajaarribaSProspectos:label211."
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
                    style="position: absolute; top: 127px; left: 110px; width:49px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="110"
                        displaytop="127"
                        displaywidth="49"
                        id="CajaSegui:label1."
                        key="CajaSegui:label1."
                        labelalign="left"
                        labeltitle="Numero"
                        original_name="label1"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314716670"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Numero</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 239px; left: 454px; width:100px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="454"
                        displaytop="239"
                        displaywidth="100"
                        id="CajaSegui:label10."
                        key="CajaSegui:label10."
                        labelalign="left"
                        labeltitle="TelefonoOficina"
                        original_name="label10"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314890754"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>TelefonoOficina</nobr>
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
                        id="CajaSegui:label11."
                        key="CajaSegui:label11."
                        labelalign="left"
                        labeltitle="DatosdelProspecto"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>DatosdelProspecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 295px; left: 454px; width:44px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="454"
                        displaytop="295"
                        displaywidth="44"
                        id="CajaSegui:label111."
                        key="CajaSegui:label111."
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
                        id="CajaSegui:label11211."
                        key="CajaSegui:label11211."
                        labelalign="left"
                        labeltitle="AsesordeVentas"
                        original_name="label1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369335393547"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>AsesordeVentas</nobr>
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
                        id="CajaSegui:label12."
                        key="CajaSegui:label12."
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
                        id="CajaSegui:label13."
                        key="CajaSegui:label13."
                        labelalign="left"
                        labeltitle="Email2"
                        original_name="label13"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314914577"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Email2</nobr>
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
                        id="CajaSegui:label14."
                        key="CajaSegui:label14."
                        labelalign="left"
                        labeltitle="VendedoraDemostradora"
                        original_name="label14"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316397216"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>VendedoraDemostradora</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 234px; width:111px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="234"
                        displaytop="127"
                        displaywidth="111"
                        id="CajaSegui:label2."
                        key="CajaSegui:label2."
                        labelalign="left"
                        labeltitle="EstadoProspecto"
                        original_name="label2"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314722561"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>EstadoProspecto</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 183px; left: 760px; width:85px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="760"
                        displaytop="183"
                        displaywidth="85"
                        id="CajaSegui:label3."
                        key="CajaSegui:label3."
                        labelalign="left"
                        labeltitle="FechaEstado"
                        original_name="label3"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314726522"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>FechaEstado</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 127px; left: 452px; width:55px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="452"
                        displaytop="127"
                        displaywidth="55"
                        id="CajaSegui:label4."
                        key="CajaSegui:label4."
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
                    style="position: absolute; top: 127px; left: 760px; width:93px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="760"
                        displaytop="127"
                        displaywidth="93"
                        id="CajaSegui:label5."
                        key="CajaSegui:label5."
                        labelalign="left"
                        labeltitle="FechaRegistro"
                        original_name="label5"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314732523"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>FechaRegistro</nobr>
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
                        id="CajaSegui:label6."
                        key="CajaSegui:label6."
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
                    style="position: absolute; top: 183px; left: 452px; width:56px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="452"
                        displaytop="183"
                        displaywidth="56"
                        id="CajaSegui:label7."
                        key="CajaSegui:label7."
                        labelalign="left"
                        labeltitle="Direccion"
                        original_name="label7"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314851028"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Direccion</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 295px; left: 762px; width:26px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="762"
                        displaytop="295"
                        displaywidth="26"
                        id="CajaSegui:label8."
                        key="CajaSegui:label8."
                        labelalign="left"
                        labeltitle="Pais"
                        original_name="label8"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314853819"
                        view="label"
                        style="font-size: 12px;
                            color: Black">
                        <nobr>Pais</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 239px; left: 760px; width:80px; height:16px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="16"
                        displayleft="760"
                        displaytop="239"
                        displaywidth="80"
                        id="CajaSegui:label9."
                        key="CajaSegui:label9."
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
                        id="CajaSegui:line112."
                        key="CajaSegui:line112."
                        original_name="line1"
                        size="1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346473260"
                        view="hr"
                        width="988"
                        style="border-color:Red;
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
                        id="CajaSegui:line1121."
                        key="CajaSegui:line1121."
                        original_name="line1"
                        size="1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346640468"
                        view="hr"
                        width="988"
                        style="border-color:Red;
                            font-size: 1pt;
                            background-color: Red;
                            color: #ff0033">

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 321px; left: 762px; width:165px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="21"
                        displayleft="762"
                        displaytop="321"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="SELECT"
                        field_weight="1499"
                        findable="true"
                        key="CajaSegui:vpp_ciudad."
                        multi_valued="true"
                        name="CajaSegui:vpp_ciudad."
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
                        field_length="100"
                        field_type="text"
                        field_weight="999"
                        findable="true"
                        immediate="true"
                        key="CajaSegui:vpp_correo."
                        multi_valued="true"
                        name="CajaSegui:vpp_correo."
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
                        key="CajaSegui:vpp_cuanta_correo2."
                        multi_valued="true"
                        name="CajaSegui:vpp_cuanta_correo2."
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
                    style="position: absolute; top: 209px; left: 452px; width:250px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="452"
                        displaytop="209"
                        displaywidth="250"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="799"
                        findable="true"
                        key="CajaSegui:vpp_direccion."
                        multi_valued="true"
                        name="CajaSegui:vpp_direccion."
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
                    style="position: absolute; top: 153px; left: 234px; width:180px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="dropdown_list"
                        db_length="1"
                        db_type="String"
                        displayheight="21"
                        displayleft="234"
                        displaytop="153"
                        displaywidth="180"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="SELECT"
                        field_weight="299"
                        findable="true"
                        key="CajaSegui:vpp_estadopro."
                        multi_valued="true"
                        name="CajaSegui:vpp_estadopro."
                        options="Activo=A&#59;Cliente Provivienda=B&#59;No aplica para comprar=C&#59;Comproalacompetencia=D"
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
                    style="position: absolute; top: 153px; left: 760px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="textfield"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="760"
                        displaytop="153"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_type="TEXT"
                        field_weight="599"
                        findable="true"
                        id="CajaSegui:vpp_fecha."
                        key="CajaSegui:vpp_fecha."
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
                    style="position: absolute; top: 209px; left: 760px; width:165px; height:22px">

                    <div
                        accell_type="Date"
                        binary_variables=""
                        class="textfield"
                        db_length="10"
                        db_type="Date"
                        displayheight="22"
                        displayleft="760"
                        displaytop="209"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_type="TEXT"
                        field_weight="899"
                        findable="true"
                        id="CajaSegui:vpp_fechaestado."
                        key="CajaSegui:vpp_fechaestado."
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
                    style="position: absolute; top: 265px; left: 760px; width:165px; height:21px">

                    <select
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="21"
                        displayleft="760"
                        displaytop="265"
                        displaywidth="165"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="SELECT"
                        field_weight="1199"
                        findable="true"
                        key="CajaSegui:vpp_nacionalidad."
                        multi_valued="true"
                        name="CajaSegui:vpp_nacionalidad."
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
                        key="CajaSegui:vpp_nombre."
                        multi_valued="true"
                        name="CajaSegui:vpp_nombre."
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
                        key="CajaSegui:vpp_numero."
                        multi_valued="true"
                        name="CajaSegui:vpp_numero."
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
                    style="position: absolute; top: 153px; left: 452px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        auto_accept="true"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        db_length="2"
                        db_type="String"
                        displayheight="22"
                        displayleft="452"
                        displaytop="153"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="2"
                        field_type="text"
                        field_weight="399"
                        findable="true"
                        immediate="true"
                        key="CajaSegui:vpp_proyecto."
                        multi_valued="true"
                        name="CajaSegui:vpp_proyecto."
                        original_name="textfield1"
                        retrieve_value="true"
                        return_values_into="vpp_proyecto"
                        size="7"
                        target_field="vpp_proyecto"
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315424064"
                        updateable="true"
                        view="text"
                        zoom_form="Modulo/ProyectosFRM"
                        style="font-size: 12px;
                            color: Black">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 265px; left: 454px; width:120px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="454"
                        displaytop="265"
                        displaywidth="120"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="1099"
                        findable="true"
                        key="CajaSegui:vpp_telofi."
                        multi_valued="true"
                        name="CajaSegui:vpp_telofi."
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
                    style="position: absolute; top: 321px; left: 454px; width:120px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="30"
                        db_type="String"
                        displayheight="22"
                        displayleft="454"
                        displaytop="321"
                        displaywidth="120"
                        explicit_search_mode="default"
                        field_length="30"
                        field_type="text"
                        field_weight="1399"
                        findable="true"
                        key="CajaSegui:vpp_telres."
                        multi_valued="true"
                        name="CajaSegui:vpp_telres."
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
                    style="position: absolute; top: 862px; left: 112px; width:45px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        class="textfield"
                        db_length="3"
                        db_type="String"
                        displayheight="22"
                        displayleft="112"
                        displaytop="862"
                        displaywidth="45"
                        explicit_search_mode="default"
                        field_length="3"
                        field_type="text"
                        field_weight="1699"
                        findable="true"
                        immediate="true"
                        key="CajaSegui:vpp_vendedor."
                        multi_valued="true"
                        name="CajaSegui:vpp_vendedor."
                        original_name="textfield1"
                        retrieve_value="true"
                        size="7"
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
                    style="position: absolute; top: 153px; left: 499px; width:201px; height:22px">

                    <input
                        accell_type="String"
                        binary_variables=""
                        case_conversion="Upper"
                        class="textfield"
                        displayheight="22"
                        displayleft="499"
                        displaytop="153"
                        displaywidth="201"
                        field_type="text"
                        field_weight="499"
                        findable="true"
                        key="CajaSegui:vpy_nombre."
                        multi_valued="true"
                        name="CajaSegui:vpy_nombre."
                        original_name="textfield1"
                        size="33"
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
                        key="CajaSegui:vve_nombre."
                        name="CajaSegui:vve_nombre."
                        original_name="textfield1"
                        size="41"
                        target_field=""
                        type="text"
                        uid="prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316251827"
                        view="text"
                        style="font-size: 12px;
                            color: Black">
                </div>

            </fieldset>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
