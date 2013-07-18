<form 
    binary_variables = ""
    field_order = ""
    form_height = "616"
    form_width = "1055"
    object_type = "data_view"
    style_class = "form"
    view = "form"
    reuse="true">

    <div 
        aud_on_entry = "false"
        auto_find = "true"
        background_color = "#cccccc"
        binary_variables = ""
        binding_type = "connection"
        bloom_filter = "00000000000400040000000000000000"
        commands = ""
        connection = "Connection1"
        display_name = ".top"
        foundation_type = "Classes/Foundation/Data view"
        key = ".top."
        kind = "data_region"
        sql_order_by_clause = "vmp_codigo"
        style_class = "data_view"
        target_table = "PUBLIC.vmp_mediosp"
        uid_prefix = "itemsform_dataview1_1368038367945"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "199"
        foreground_color = "Black"
        key = ".top:RepeatingArea1."
        kind = "repeating_area"
        list_columns = ".top:vmp_codigo.0:92;.top:vmp_descripcion.92:300;.top:vmp_categoria.392:125"
        occurrences = "16"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369254961254"
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
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "cajaarribaMPublicitarios"
        field_weight = "99"
        key = ".top:cajaarribaMPublicitarios."
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
        key = ".top:cajaarribaMPublicitarios:actualempresa."
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
        key = ".top:cajaarribaMPublicitarios:actualusuario."
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
        key = ".top:cajaarribaMPublicitarios:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = ".top:cajaarribaMPublicitarios:label211."
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
        key = ".top:label11."
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
        display_name = "vmp_categoria"
        field_length = "2"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = ".top:vmp_categoria."
        multi_valued = "true"
        original_name = "vmp_categoria"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vmp_categoria"
        uid = "itemsform_dataview1_1368038367945_38c45a09c5d3bfcc3bead76604e3d13b040ef94b_1371819277096"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "2"
        db_type = "String"
        display_name = "vmp_codigo"
        field_length = "2"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = ".top:vmp_codigo."
        multi_valued = "true"
        original_name = "vmp_codigo"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vmp_codigo"
        uid = "itemsform_dataview1_1368038367945_38c45a09c5d3bfcc3bead76604e3d13b040ef94b_1371819277072"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "50"
        db_type = "String"
        display_name = "vmp_descripcion"
        field_length = "50"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = ".top:vmp_descripcion."
        multi_valued = "true"
        original_name = "vmp_descripcion"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vmp_descripcion"
        uid = "itemsform_dataview1_1368038367945_38c45a09c5d3bfcc3bead76604e3d13b040ef94b_1371819277084"
        updateable = "true"
        view = "text">
    </field>

</form>
