<form 
    aud_on_entry = "false"
    background_color = "#999999"
    binary_variables = ""
    binding_type = "connection"
    bloom_filter = "00080000000000000800000000000000"
    commands = ""
    connection = "Connection1"
    field_order = ""
    form_height = "600"
    form_width = "1136"
    foundation_type = "Classes/Foundation/Form"
    style_class = "form"
    target_table = "PUBLIC.vuu_unidades"
    uid_prefix = "modulocnegocios_form1_1374153200053"
    view = "form"
    reuse="true">

    <control 
        background_color = "#cccccc"
        commands = ""
        display_name = "cajagrandeICompradores"
        field_weight = "99"
        key = "cajagrandeICompradores."
        original_name = "box1"
        style_class = "box"
        uid = "modulocnegocios_form1_1374153200053_23397cc2878e5546fa07a5e2d5df77774e0ff1af_1377101504612"
        view = "fieldset">
    </control>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        binary_variables = ""
        binding_type = "connection"
        cascade_deletes = "false"
        cascade_updates = "false"
        commands = ""
        connection = "Connection1"
        display_name = "PUBLIC_tcl_tipclien"
        field_weight = "199"
        find_count = "10"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien."
        kind = "data_region"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_table = "PUBLIC.tcl_tipclien"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007075976"
        update_allowed = "false"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "99"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien:RepeatingArea1."
        kind = "repeating_area"
        list_columns = "cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit.0:159;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase.159:122;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo.281:121;cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre.402:328"
        occurrences = "10"
        row_class = "ROW"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201649"
        view = "repeating_area">
    </div>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "tcl_clase"
        field_length = "2"
        field_type = "SELECT"
        field_weight = "199"
        findable = "true"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_clase."
        multi_valued = "true"
        options = "Otro=O;Titular=T"
        original_name = "tcl_clase"
        retrieve_value = "true"
        script = "{
}"
        style_class = "textfield"
        target_field = "tcl_clase"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007237849"
        updateable = "true"
        view = "select">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "18"
        db_type = "String"
        display_name = "tcl_nit"
        field_length = "18"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nit."
        multi_valued = "true"
        required = "true"
        retrieve_value = "true"
        script = "{
}"
        style_class = "textfield"
        target_field = "tcl_nit"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201673"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "80"
        db_type = "String"
        display_name = "tcl_nombre"
        field_length = "80"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_nombre."
        multi_valued = "true"
        required = "true"
        retrieve_value = "true"
        script = "{
}"
        style_class = "textfield"
        target_field = "tcl_nombre"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007201712"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "tcl_tipo"
        field_length = "2"
        field_type = "SELECT"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeICompradores:PUBLIC_tcl_tipclien:tcl_tipo."
        multi_valued = "true"
        options = "Persona=P;Sociedad=S"
        original_name = "tcl_tipo"
        retrieve_value = "true"
        script = "{
}"
        style_class = "textfield"
        target_field = "tcl_tipo"
        uid = "itemsform_dataview1_1368038367945_73db533e4ca4d6d97123a8e885f5051258f57032_1374007221014"
        updateable = "true"
        view = "select">
    </field>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "399"
        key = "cajagrandeICompradores:box11."
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
        key = "cajagrandeICompradores:box111."
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
        key = "cajagrandeICompradores:box111:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = "cajagrandeICompradores:box111:label211."
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
        key = "cajagrandeICompradores:box111:textfield1."
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
        key = "cajagrandeICompradores:box111:textfield11."
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
        key = "cajagrandeICompradores:box11:image1."
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
        key = "cajagrandeICompradores:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>
    <field 
        display_name = "varadhiere"
        field_type = "text"
        field_weight = "299"
        findable = "false"
        key = "cajagrandeICompradores:varadhiere."
        original_name = "textfield1"
        style_class = "textfield"
        target_field = ""
        uid = "modulocnegocios_form1_1374153200053_23397cc2878e5546fa07a5e2d5df77774e0ff1af_1377117163523"
        view = "text">
    </field>

</form>
