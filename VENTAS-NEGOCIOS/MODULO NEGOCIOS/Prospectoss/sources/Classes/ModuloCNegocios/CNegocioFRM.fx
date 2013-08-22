<form 
    background_color = "#999999"
    binary_variables = ""
    bloom_filter = "00080000000000000800000000000000"
    commands = ""
    field_order = ""
    form_height = "664"
    form_width = "1229"
    foundation_type = "Classes/Foundation/Form"
    localized = "true"
    style_class = "form"
    uid_prefix = "modulocnegocios_form1_1377190351773"
    view = "form"
    reuse="true">

    <control 
        background_color = "#cccccc"
        binary_variables = ""
        commands = ""
        display_name = "cajagrandeCPago"
        field_weight = "99"
        key = "cajagrandeCPago."
        original_name = "box1"
        style_class = "box"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377190622117"
        view = "fieldset">
    </control>
    <div 
        aud_on_entry = "false"
        binding_type = "connection"
        commands = ""
        connection = "Connection1"
        display_name = "PUBLIC_vcn_comproneg"
        field_weight = "699"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg."
        kind = "data_region"
        original_name = "view1"
        style_class = "data_view"
        target_table = "PUBLIC.vcn_comproneg"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191624550"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        display_name = "RepeatingArea1"
        field_weight = "99"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg:RepeatingArea1."
        kind = "repeating_area"
        list_columns = "cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_cptopago.0:106;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_nom_compr.106:300;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_fec_comp.406:164;cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_vlr_compro.570:150"
        occurrences = "10"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939895"
        view = "repeating_area">
    </div>
    <field 
        accell_type = "String"
        db_length = "3"
        db_type = "String"
        display_name = "vcn_cptopago"
        field_length = "3"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_cptopago."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vcn_cptopago"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939902"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Date"
        db_length = "10"
        db_type = "Date"
        display_name = "vcn_fec_comp"
        field_type = "TEXT"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_fec_comp."
        kind = "date"
        multi_valued = "true"
        original_name = "vcn_fec_comp"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vcn_fec_comp"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939911"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        db_length = "50"
        db_type = "String"
        display_name = "vcn_nom_compr"
        field_length = "50"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_nom_compr."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vcn_nom_compr"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939905"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Amount"
        db_length = "15"
        db_type = "Amount"
        display_justify = "Right"
        display_name = "vcn_vlr_compro"
        field_length = "25"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        key = "cajagrandeCPago:PUBLIC_vcn_comproneg:vcn_vlr_compro."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vcn_vlr_compro"
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191939915"
        updateable = "true"
        view = "text">
    </field>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "199"
        key = "cajagrandeCPago:box11."
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
        key = "cajagrandeCPago:box111."
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
        key = "cajagrandeCPago:box111:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = "cajagrandeCPago:box111:label211."
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
        key = "cajagrandeCPago:box111:textfield1."
        original_name = "textfield1"
        script = "{
}"
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
        key = "cajagrandeCPago:box111:textfield11."
        original_name = "textfield1"
        script = "{
}"
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
        key = "cajagrandeCPago:box11:image1."
        kind = "instance"
        original_name = "image1"
        uid = "itemsform_dataview1_1368038367945_c486553ba63e77316f04c86372ffc3ae6f0d73b1_1368040829176"
        uid_to_name = ""
        view = "img">
    </control>
    <control 
        binary_variables = ""
        display_name = "label11"
        font_family = "Verdana"
        font_size = "14"
        font_weight = "bold"
        foreground_color = "Black"
        key = "cajagrandeCPago:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label31"
        font_size = "12"
        key = "cajagrandeCPago:label31."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843117469"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label311"
        font_size = "12"
        key = "cajagrandeCPago:label311."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843131253"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label3111"
        font_size = "12"
        key = "cajagrandeCPago:label3111."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843138756"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label312"
        font_size = "12"
        key = "cajagrandeCPago:label312."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191147941"
        view = "label">
    </control>
    <field 
        accell_type = "String"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "3"
        db_type = "String"
        display_name = "vau_manzana"
        explicit_search_mode = "default"
        field_length = "3"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeCPago:vau_manzana."
        multi_valued = "true"
        original_name = "textfield1"
        required = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vau_manzana"
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843766016"
        updateable = "false"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "4"
        db_type = "String"
        display_name = "vau_unidad"
        explicit_search_mode = "default"
        field_length = "4"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        key = "cajagrandeCPago:vau_unidad."
        multi_valued = "true"
        original_name = "textfield1"
        required = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vau_unidad"
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371843766351"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vmu_f_separacion"
        explicit_search_mode = "default"
        field_length = "10"
        field_type = "TEXT"
        field_weight = "499"
        findable = "true"
        key = "cajagrandeCPago:vmu_f_separacion."
        kind = "date"
        multi_valued = "true"
        original_name = "date1"
        required = "true"
        retrieve_value = "true"
        style_class = "date_picker"
        target_field = "vmu_f_separacion"
        uid = "itemsform_dataview1_1368038367945_c84c975a292178664c47efc72ac1037d0dc9e23a_1371845184559"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Date"
        binary_variables = ""
        db_length = "10"
        db_type = "Date"
        display_name = "vmu_f_separacion1"
        explicit_search_mode = "default"
        field_length = "10"
        field_type = "TEXT"
        field_weight = "599"
        findable = "true"
        key = "cajagrandeCPago:vmu_f_separacion1."
        kind = "date"
        multi_valued = "true"
        original_name = "date1"
        required = "true"
        retrieve_value = "true"
        style_class = "date_picker"
        target_field = ""
        uid = "modulocnegocios_form1_1377190351773_53ae16acd06537082749d94f668d21164dd6f1cc_1377191254662"
        updateable = "true"
        view = "text">
    </field>

</form>
