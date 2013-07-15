<form 
    aud_on_entry = "false"
    auto_find = "true"
    background_color = "#999999"
    binary_variables = ""
    binding_type = "connection"
    bloom_filter = "00000000000400040000000000000000"
    clear_after_au = "false"
    commands = ""
    connection = "Connection1"
    field_order = ""
    footer = "none"
    form_height = "499"
    form_width = "1199"
    foundation_type = "Classes/Foundation/Form"
    style_class = "form"
    target_table = "PUBLIC.xob_obras"
    uid_prefix = "modulocnegocios_form1_1373643877543"
    view = "form"
    reuse="true">

    <control 
        background_color = "#cccccc"
        binary_variables = ""
        commands = ""
        display_name = "cajagrandeObrasFRM"
        field_weight = "99"
        key = "cajagrandeObrasFRM."
        original_name = "box1"
        style_class = "box"
        uid = "modulo_form1_1372970373750_71ea30ee24e0516900bb98ebbe219e914a80211d_1372970386149"
        view = "fieldset">
    </control>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        binary_variables = ""
        binding_type = "connection"
        commands = ""
        connection = "Connection1"
        detail_keys = ""
        display_name = "PUBLIC_xob_obras"
        field_weight = "199"
        key = "cajagrandeObrasFRM:PUBLIC_xob_obras."
        kind = "data_region"
        master_keys = ""
        master_region = "&lt;form&gt;"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_table = "PUBLIC.xob_obras"
        uid = "modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647885012"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        columns_sortable = "true"
        display_name = "RepeatingArea1"
        field_weight = "99"
        key = "cajagrandeObrasFRM:PUBLIC_xob_obras:RepeatingArea1."
        kind = "repeating_area"
        list_columns = "cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto.0:105;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra.105:72;cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre.177:191"
        occurrences = "10"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952695"
        view = "repeating_area">
    </div>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "xob_nombre"
        field_length = "30"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeObrasFRM:PUBLIC_xob_obras:xob_nombre."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xob_nombre"
        uid = "modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952707"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "xob_obra"
        field_length = "2"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = "cajagrandeObrasFRM:PUBLIC_xob_obras:xob_obra."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xob_obra"
        uid = "modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952704"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "xob_proyecto"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeObrasFRM:PUBLIC_xob_obras:xob_proyecto."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xob_proyecto"
        uid = "modulocnegocios_form1_1373643877543_5362947c4597aa0d46a8554628cefc5793e23a5b_1373647952701"
        updateable = "true"
        view = "text">
    </field>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "299"
        key = "cajagrandeObrasFRM:box11."
        original_name = "box1"
        style_class = "box"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369343805083"
        view = "fieldset">
    </control>
    <control 
        base_class = "Classes/ItemsForm/Logo.fx"
        binary_variables = ""
        display_base_class = "ItemsForm.Logo"
        display_name = "image1"
        foundation_type = "Classes/Foundation/Image"
        key = "cajagrandeObrasFRM:box11:image1."
        kind = "instance"
        original_name = "image1"
        uid = "itemsform_dataview1_1368038367945_c486553ba63e77316f04c86372ffc3ae6f0d73b1_1368040829176"
        uid_to_name = ""
        view = "img">
    </control>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "cajaarribaObrasFRM"
        field_weight = "99"
        key = "cajagrandeObrasFRM:cajaarribaObrasFRM."
        original_name = "box1"
        style_class = "box"
        target_field = ""
        uid = "desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928873884"
        view = "fieldset">
    </control>
    <field 
        binary_variables = ""
        display_name = "actualempresa"
        field_type = "text"
        field_weight = "99"
        findable = "false"
        immediate = "false"
        key = "cajagrandeObrasFRM:cajaarribaObrasFRM:actualempresa."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929860573"
        view = "text">
    </field>
    <field 
        binary_variables = ""
        display_name = "actualusuario"
        field_type = "text"
        field_weight = "199"
        findable = "false"
        immediate = "false"
        key = "cajagrandeObrasFRM:cajaarribaObrasFRM:actualusuario."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929929174"
        view = "text">
    </field>
    <control 
        base_class = "Classes/ItemsForm/TituloLBL.fx"
        binary_variables = ""
        display_base_class = "ItemsForm.TituloLBL"
        display_name = "label1"
        foundation_type = "Classes/Foundation/Label"
        key = "cajagrandeObrasFRM:cajaarribaObrasFRM:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = "cajagrandeObrasFRM:cajaarribaObrasFRM:label211."
        original_name = "label2"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label11"
        font_family = "Verdana"
        font_size = "14"
        font_weight = "bold"
        foreground_color = "Black"
        key = "cajagrandeObrasFRM:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>

</form>
