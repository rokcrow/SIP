<form 
    binary_variables = ""
    form_height = "766"
    form_width = "1131"
    object_type = "data_view"
    style_class = "form"
    view = "form"
    reuse="true">

    <div 
        aud_on_entry = "false"
        background_color = "#cccccc"
        binary_variables = ""
        bloom_filter = "00000000000400042000000000000000"
        commands = ""
        connection = "DataServerCon"
        display_name = ".top"
        foundation_type = "Classes/Foundation/Data view"
        key = ".top."
        kind = "data_region"
        style_class = "data_view"
        target_table = "PUBLIC.vpy_proyectos"
        uid_prefix = "itemsform_dataview1_1368038367945"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "199"
        key = ".top:RepeatingArea1."
        kind = "repeating_area"
        list_columns = ".top:vpy_codigo.0:162;.top:vpy_empresa.162:163;.top:vpy_nombre.325:161;.top:textfield1.486:160"
        occurrences = "17"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241601"
        view = "repeating_area">
    </div>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "299"
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
    <div 
        binary_variables = ""
        display_name = "navigationbar1"
        key = ".top:navigationbar1."
        kind = "navigation_bar"
        style_class = "navigation"
        uid = "parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241680"
        view = "navigation_bar">
    </div>
    <field 
        binary_variables = ""
        display_name = "textfield1"
        field_type = "SELECT"
        field_weight = "399"
        findable = "false"
        key = ".top:textfield1."
        multi_valued = "true"
        options = "Temporal=T;Real=R"
        original_name = "textfield1"
        style_class = "textfield"
        target_field = ""
        uid = "parametros_form1_1369065545580_eb526db1fde058fbe8a932069fe9d13426242512_1369143142505"
        view = "select">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "vpy_codigo"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = ".top:vpy_codigo."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpy_codigo"
        uid = "parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241655"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "vpy_empresa"
        field_length = "2"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = ".top:vpy_empresa."
        multi_valued = "true"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpy_empresa"
        uid = "parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241634"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "30"
        db_type = "String"
        display_name = "vpy_nombre"
        field_length = "30"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = ".top:vpy_nombre."
        multi_valued = "true"
        original_name = "vpy_nombre"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vpy_nombre"
        uid = "parametros_form1_1369065545580_eb526db1fde058fbe8a932069fe9d13426242512_1369142723132"
        updateable = "true"
        view = "text">
    </field>

</form>
