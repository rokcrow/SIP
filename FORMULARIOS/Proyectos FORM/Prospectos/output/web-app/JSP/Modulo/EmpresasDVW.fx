<form 
    binary_variables = ""
    form_height = "603"
    form_width = "1055"
    object_type = "data_view"
    style_class = "form"
    view = "form"
    reuse="true">

    <div 
        background_color = "#cccccc"
        binary_variables = ""
        bloom_filter = "00000000000400042000000000000000"
        commands = ""
        display_name = ".top"
        foundation_type = "Classes/Foundation/Data view"
        key = ".top."
        kind = "data_region"
        style_class = "data_view"
        uid_prefix = "itemsform_dataview1_1368038367945"
        view = "data_region">
    </div>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        binding_type = "connection"
        commands = ""
        connection = "&lt;inherit&gt;"
        detail_keys = "xel_codigo"
        display_name = "PUBLIC_xel_emprelogo"
        field_weight = "299"
        key = ".top:PUBLIC_xel_emprelogo."
        kind = "data_region"
        master_keys = "xem_codigo"
        master_region = "&lt;form&gt;"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_table = "PUBLIC.xel_emprelogo"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777882438"
        view = "data_region">
    </div>
    <control 
        db_type = "Binary"
        display_name = "Image1"
        findable = "true"
        image_height = "33"
        image_width = "213"
        key = ".top:PUBLIC_xel_emprelogo:Image1."
        multi_valued = "true"
        style_class = "image"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957319"
        updateable = "true"
        view = "img">
    </control>
    <control 
        display_name = "Label1"
        font_size = "12"
        key = ".top:PUBLIC_xel_emprelogo:Label1."
        style_class = "label"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957269"
        view = "label">
    </control>
    <control 
        display_name = "Label2"
        font_size = "12"
        key = ".top:PUBLIC_xel_emprelogo:Label2."
        style_class = "label"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957309"
        view = "label">
    </control>
    <control 
        display_name = "chooser1"
        field_type = "file"
        file_target = "xel_codigo"
        key = ".top:PUBLIC_xel_emprelogo:chooser1."
        original_name = "chooser1"
        style_class = "file"
        target_field = ""
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369778118981"
        view = "file">
    </control>
    <field 
        accell_type = "String"
        db_length = "2"
        db_type = "String"
        display_name = "xel_codigo"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = ".top:PUBLIC_xel_emprelogo:xel_codigo."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xel_codigo"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369777957289"
        updateable = "true"
        view = "text">
    </field>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "199"
        key = ".top:RepeatingArea1."
        kind = "repeating_area"
        list_columns = ".top:xem_codigo.0:57;.top:xem_nombre.57:226"
        occurrences = "21"
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
        display_name = "label1"
        font_size = "14"
        font_weight = "bold"
        key = ".top:label1."
        original_name = "label1"
        style_class = "label"
        uid = "itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369585460995"
        view = "label">
    </control>
    <control 
        display_name = "label11"
        font_size = "14"
        font_weight = "bold"
        key = ".top:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369585488958"
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
        key = ".top:xem_codigo."
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
        key = ".top:xem_nombre."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xem_nombre"
        uid = "parametros_form1_1369776323752_a9c2a12981f777d6400ac995efd0c5c8039fef6b_1369776506698"
        updateable = "true"
        view = "text">
    </field>

</form>
