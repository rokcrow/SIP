<form 
    binary_variables = ""
    form_height = "1038"
    form_width = "1059"
    object_type = "data_view"
    style_class = "form"
    view = "form"
    reuse="true">

    <div 
        aud_on_entry = "false"
        auto_find = "true"
        background_color = "#cccccc"
        binary_variables = ""
        bloom_filter = "00000000000400040000000000000000"
        cascade_deletes = "false"
        cascade_updates = "false"
        commands = ""
        connection = "DataServerCon"
        display_name = ".top"
        foundation_type = "Classes/Foundation/Data view"
        key = ".top."
        kind = "data_region"
        master_region = "PUBLIC_vps_prosigue"
        style_class = "data_view"
        target_table = "PUBLIC.vpp_prospectos"
        uid_prefix = "itemsform_dataview1_1368038367945"
        view = "data_region">
    </div>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        binary_variables = ""
        binding_type = "connection"
        commands = ""
        connection = "DataServerCon"
        detail_keys = "vps_proyecto;vps_prospecto"
        display_name = "PUBLIC_vps_prosigue"
        field_weight = "1599"
        key = ".top:PUBLIC_vps_prosigue."
        kind = "data_region"
        master_keys = "vpp_proyecto;vpp_numero"
        master_region = "&lt;form&gt;"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_table = "PUBLIC.vps_prosigue"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317086095"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "99"
        key = ".top:PUBLIC_vps_prosigue:RepeatingArea1."
        kind = "repeating_area"
        list_columns = ".top:PUBLIC_vps_prosigue:vps_consecu.0:74;.top:PUBLIC_vps_prosigue:vps_fecha.74:67;.top:PUBLIC_vps_prosigue:vps_hora.141:61;.top:PUBLIC_vps_prosigue:vps_usuario.202:54;.top:PUBLIC_vps_prosigue:vps_mediocon.256:93;.top:PUBLIC_vps_prosigue:vps_califica.349:74;.top:PUBLIC_vps_prosigue:xpc_nombre.423:237;.top:PUBLIC_vps_prosigue:vps_estado.660:94;.top:PUBLIC_vps_prosigue:vps_f_pcontacto.754:93"
        occurrences = "9"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475602"
        view = "repeating_area">
    </div>
    <control 
        binary_variables = ""
        display_name = "label1"
        font_size = "12"
        key = ".top:PUBLIC_vps_prosigue:label1."
        original_name = "label1"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318715874"
        view = "label">
    </control>
    <field 
        binary_variables = ""
        display_name = "textfield1"
        field_type = "text"
        field_weight = "299"
        findable = "false"
        key = ".top:PUBLIC_vps_prosigue:textfield1."
        original_name = "textfield1"
        style_class = "textfield"
        target_field = ""
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318596397"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "vps_califica"
        field_length = "2"
        field_type = "text"
        field_weight = "599"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_califica."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vps_califica"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475652"
        updateable = "true"
        view = "text"
        zoom_form = "parametros/gradointe">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "120"
        db_type = "String"
        display_name = "vps_comentario1"
        explicit_search_mode = "default"
        field_length = "120"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_comentario1."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vps_comentario1"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318525208"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Numeric"
        binary_variables = ""
        db_length = "4"
        db_type = "Numeric"
        display_name = "vps_consecu"
        field_length = "6"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_consecu."
        multi_valued = "true"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_consecu"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475612"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vps_estado"
        field_length = "2"
        field_type = "SELECT"
        field_weight = "799"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_estado."
        multi_valued = "true"
        options = "Si esta interesado=S;Medianamente Interesado=M;No esta interesado=N"
        original_name = "vps_estado"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_estado"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318201710"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vps_f_pcontacto"
        field_length = "10"
        field_type = "text"
        field_weight = "899"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_f_pcontacto."
        multi_valued = "true"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_f_pcontacto"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475672"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vps_fecha"
        field_length = "10"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_fecha."
        multi_valued = "true"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_fecha"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475622"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Time"
        binary_variables = ""
        db_length = "8"
        db_type = "Time"
        display_name = "vps_hora"
        field_length = "8"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_hora."
        multi_valued = "true"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_hora"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475632"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vps_mediocon"
        field_length = "2"
        field_type = "SELECT"
        field_weight = "499"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_mediocon."
        multi_valued = "true"
        options = "Email=C;Telefono=T;Fax=F;Personal=P"
        original_name = "vps_mediocon"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vps_mediocon"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317808977"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "8"
        db_type = "String"
        display_name = "vps_usuario"
        field_length = "8"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        key = ".top:PUBLIC_vps_prosigue:vps_usuario."
        multi_valued = "true"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "vps_usuario"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369317475632_1"
        updateable = "true"
        view = "text">
    </field>
    <field 
        binary_variables = ""
        display_name = "xpc_nombre"
        field_type = "text"
        field_weight = "699"
        findable = "false"
        key = ".top:PUBLIC_vps_prosigue:xpc_nombre."
        multi_valued = "true"
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369318053658"
        view = "text">
    </field>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "1899"
        key = ".top:box11."
        original_name = "box1"
        style_class = "box"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369343805083"
        view = "fieldset">
    </control>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box111"
        field_weight = "99"
        key = ".top:box111."
        original_name = "box1"
        style_class = "box"
        target_field = ""
        uid = "desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928873884"
        view = "fieldset">
    </control>
    <control 
        base_class = "Classes/ItemsForm/TituloLBL.fx"
        binary_variables = ""
        display_base_class = "ItemsForm.TituloLBL"
        display_name = "label1"
        foundation_type = "Classes/Foundation/Label"
        key = ".top:box111:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = ".top:box111:label211."
        original_name = "label2"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
        view = "label">
    </control>
    <field 
        binary_variables = ""
        display_name = "textfield1"
        field_type = "text"
        field_weight = "99"
        findable = "false"
        immediate = "true"
        key = ".top:box111:textfield1."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929860573"
        view = "text">
    </field>
    <field 
        binary_variables = ""
        display_name = "textfield11"
        field_type = "text"
        field_weight = "199"
        findable = "false"
        immediate = "true"
        key = ".top:box111:textfield11."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929929174"
        view = "text">
    </field>
    <control 
        base_class = "Classes/ItemsForm/Logo.fx"
        binary_variables = ""
        display_base_class = "ItemsForm.Logo"
        display_name = "image1"
        foundation_type = "Classes/Foundation/Image"
        key = ".top:box11:image1."
        kind = "instance"
        original_name = "image1"
        uid = "itemsform_dataview1_1368038367945_c486553ba63e77316f04c86372ffc3ae6f0d73b1_1368040829176"
        uid_to_name = ""
        view = "img">
    </control>
    <control 
        binary_variables = ""
        display_name = "label1"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label1."
        original_name = "label1"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314716670"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label10"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label10."
        original_name = "label10"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314890754"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label11"
        font_family = "Verdana"
        font_size = "14"
        font_weight = "bold"
        foreground_color = "Black"
        key = ".top:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label111"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label111."
        original_name = "label11"
        style_class = "label"
        target_field = ""
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314909226"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label11211"
        font_family = "Verdana"
        font_size = "14"
        font_weight = "bold"
        foreground_color = "Black"
        key = ".top:label11211."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369335393547"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label12"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label12."
        original_name = "label12"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314912297"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label13"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label13."
        original_name = "label13"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314914577"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label14"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label14."
        original_name = "label14"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316397216"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label2"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label2."
        original_name = "label2"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314722561"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label3"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label3."
        original_name = "label3"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314726522"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label4"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label4."
        original_name = "label4"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314729262"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label5"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label5."
        original_name = "label5"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314732523"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label6"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label6."
        original_name = "label6"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314848798"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label7"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label7."
        original_name = "label7"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314851028"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label8"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label8."
        original_name = "label8"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314853819"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label9"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:label9."
        original_name = "label9"
        style_class = "label"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369314856969"
        view = "label">
    </control>
    <control 
        background_color = "Red"
        binary_variables = ""
        display_name = "line112"
        foreground_color = "#ff0033"
        key = ".top:line112."
        original_name = "line1"
        style_class = "horizontal_line"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346473260"
        view = "hr">
    </control>
    <control 
        background_color = "Red"
        binary_variables = ""
        display_name = "line1121"
        foreground_color = "#ff0033"
        key = ".top:line1121."
        original_name = "line1"
        style_class = "horizontal_line"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_8f881d62e4f69ddd223110dc73ed230ca145b37b_1369346640468"
        view = "hr">
    </control>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "vpp_ciudad"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "SELECT"
        field_weight = "1499"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_ciudad."
        multi_valued = "true"
        original_name = "vpp_ciudad"
        query = "select xpa_nombre from xpa_paises order by xpa_nombre;"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_ciudad"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369322696499"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "40"
        db_type = "String"
        display_name = "vpp_correo"
        explicit_search_mode = "default"
        field_length = "40"
        field_type = "text"
        field_weight = "999"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        immediate = "true"
        key = ".top:vpp_correo."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_correo"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316038340"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        display_name = "vpp_cuanta_correo2"
        explicit_search_mode = "default"
        field_length = "100"
        field_type = "text"
        field_weight = "1299"
        findable = "false"
        font_size = "12"
        foreground_color = "Black"
        immediate = "true"
        key = ".top:vpp_cuanta_correo2."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "false"
        style_class = "textfield"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316069934"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "30"
        db_type = "String"
        display_name = "vpp_direccion"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "text"
        field_weight = "799"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_direccion."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_direccion"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315708203"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vpp_estadopro"
        explicit_search_mode = "default"
        field_length = "2"
        field_type = "SELECT"
        field_weight = "299"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_estadopro."
        multi_valued = "true"
        options = "Activo=A;Cliente Provivienda=B;No aplica para comprar=C;Compro a la competencia=D"
        original_name = "select1"
        retrieve_value = "true"
        style_class = "dropdown_list"
        target_field = "vpp_estadopro"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315286105"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vpp_fecha"
        explicit_search_mode = "default"
        field_type = "TEXT"
        field_weight = "599"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_fecha."
        kind = "date"
        multi_valued = "true"
        original_name = "vpp_fecha"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_fecha"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315561473"
        updateable = "true"
        view = "date">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vpp_fechaestado"
        explicit_search_mode = "default"
        field_type = "TEXT"
        field_weight = "899"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_fechaestado."
        kind = "date"
        multi_valued = "true"
        original_name = "vpp_fechaestado"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_fechaestado"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315375818"
        updateable = "true"
        view = "date">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "vpp_nacionalidad"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "SELECT"
        field_weight = "1199"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_nacionalidad."
        multi_valued = "true"
        original_name = "vpp_nacionalidad"
        query = "select xpa_nombre from xpa_paises"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_nacionalidad"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315773143"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "String"
        auto_accept = "false"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "40"
        db_type = "String"
        display_name = "vpp_nombre"
        explicit_search_mode = "default"
        field_length = "40"
        field_type = "text"
        field_weight = "699"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_nombre."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_nombre"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315605568"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Numeric"
        binary_variables = ""
        db_length = "9"
        db_type = "Numeric"
        display_name = "vpp_numero"
        explicit_search_mode = "default"
        field_length = "11"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_numero."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_numero"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315236608"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "2"
        db_type = "String"
        display_name = "vpp_proyecto"
        explicit_search_mode = "default"
        field_length = "2"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        immediate = "true"
        key = ".top:vpp_proyecto."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_proyecto"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315424064"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "vpp_telofi"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "text"
        field_weight = "1099"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_telofi."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_telofi"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315902512"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "vpp_telres"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "text"
        field_weight = "1399"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpp_telres."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_telres"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315958110"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "3"
        db_type = "String"
        display_name = "vpp_vendedor"
        explicit_search_mode = "default"
        field_length = "3"
        field_type = "text"
        field_weight = "1699"
        findable = "true"
        font_size = "12"
        foreground_color = "Black"
        immediate = "true"
        key = ".top:vpp_vendedor."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpp_vendedor"
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316180037"
        updateable = "true"
        view = "text">
    </field>
    <field 
        binary_variables = ""
        display_name = "vpy_nombre"
        field_type = "text"
        field_weight = "499"
        findable = "false"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vpy_nombre."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369315458489"
        view = "text">
    </field>
    <field 
        binary_variables = ""
        display_name = "vve_nombre"
        field_type = "text"
        field_weight = "1799"
        findable = "false"
        font_size = "12"
        foreground_color = "Black"
        key = ".top:vve_nombre."
        original_name = "textfield1"
        style_class = "textfield"
        target_field = ""
        uid = "prospectos_form1_1369314491392_5e6557a2d5dba53f8e9baf11133a067ac7dcdece_1369316251827"
        view = "text">
    </field>

</form>
