<form 
    aud_on_entry = "false"
    auto_find = "true"
    background_color = "#999999"
    binary_variables = ""
    binding_type = "connection"
    bloom_filter = "00000000000400040000000000000000"
    click_on_field = "true"
    commands = ""
    connection = "Connection1"
    field_order = ""
    footer = "none"
    form_height = "753"
    form_width = "1328"
    foundation_type = "Classes/Foundation/Form"
    style_class = "form"
    target_table = "PUBLIC.xem_empresas"
    uid_prefix = "modulo_form1_1371763543771"
    view = "form"
    reuse="true">

    <control 
        background_color = "#cccccc"
        binary_variables = ""
        commands = ""
        display_name = "cajagrandeSociedades"
        field_weight = "99"
        key = "cajagrandeSociedades."
        original_name = "box1"
        style_class = "box"
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371763613650"
        view = "fieldset">
    </control>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        background_color = "#ccccff"
        binary_variables = ""
        binding_type = "connection"
        cascade_deletes = "false"
        cascade_updates = "false"
        commands = ""
        connection = "Connection1"
        detail_keys = "xel_codigo"
        display_name = "PUBLIC_xel_emprelogo1"
        field_weight = "199"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1."
        kind = "data_region"
        master_keys = "xem_codigo"
        master_region = "&lt;form&gt;"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_field = ""
        target_table = "PUBLIC.xel_emprelogo"
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750449"
        view = "data_region">
    </div>
    <control 
        binary_variables = "Source=xel_logo"
        db_type = "Binary"
        display_name = "Image1"
        findable = "true"
        image_height = "33"
        image_width = "255"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1:Image1."
        multi_valued = "true"
        style_class = "image"
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750471"
        updateable = "true"
        view = "img">
    </control>
    <control 
        binary_variables = "Storage Variable=xel_logo"
        display_name = "chooser1"
        field_type = "file"
        file_target = "xel_logo"
        immediate = "false"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1:chooser1."
        original_name = "chooser1"
        style_class = "file"
        target_field = ""
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750477"
        view = "file">
    </control>
    <control 
        binary_variables = ""
        display_name = "label3"
        font_size = "12"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1:label3."
        original_name = "label3"
        style_class = "label"
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764775611"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label31"
        font_size = "12"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1:label31."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764775616"
        view = "label">
    </control>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "xel_codigo"
        explicit_search_mode = "default"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeSociedades:PUBLIC_xel_emprelogo1:xel_codigo."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xel_codigo"
        uid = "modulo_form1_1371763543771_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371764750479"
        updateable = "true"
        view = "text">
    </field>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "299"
        key = "cajagrandeSociedades:RepeatingArea1."
        kind = "repeating_area"
        list_columns = "cajagrandeSociedades:xem_codigo.0:57;cajagrandeSociedades:xem_nombre.57:226"
        occurrences = "15"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506668"
        view = "repeating_area">
    </div>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "399"
        key = "cajagrandeSociedades:box11."
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
        key = "cajagrandeSociedades:box111."
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
        key = "cajagrandeSociedades:box111:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <field 
        binary_variables = ""
        display_name = "textfield1"
        field_type = "text"
        field_weight = "99"
        findable = "false"
        immediate = "true"
        key = "cajagrandeSociedades:box111:textfield1."
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
        key = "cajagrandeSociedades:box111:textfield11."
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
        key = "cajagrandeSociedades:box11:image1."
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
        key = "cajagrandeSociedades:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "xem_codigo"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeSociedades:xem_codigo."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xem_codigo"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506688"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "xem_nombre"
        field_length = "30"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = "cajagrandeSociedades:xem_nombre."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xem_nombre"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506698"
        updateable = "true"
        view = "text">
    </field>

</form>
