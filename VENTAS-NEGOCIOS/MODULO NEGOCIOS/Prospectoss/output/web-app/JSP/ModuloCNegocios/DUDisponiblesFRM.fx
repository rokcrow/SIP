<form 
    aud_on_entry = "false"
    background_color = "#999999"
    binary_variables = ""
    binding_type = "connection"
    bloom_filter = "00000000000400042000000000000000"
    commands = ""
    connection = "Connection1"
    field_order = ""
    footer = "none"
    form_height = "751"
    form_width = "1199"
    foundation_type = "Classes/Foundation/Form"
    localized = "true"
    style_class = "form"
    target_table = "PUBLIC.xob_obras"
    uid_prefix = "modulo_form1_1372970373750"
    view = "form"
    reuse="true">

    <control 
        background_color = "#cccccc"
        binary_variables = ""
        commands = ""
        display_name = "cajagrandeDUDisponibles"
        field_weight = "99"
        key = "cajagrandeDUDisponibles."
        original_name = "box1"
        style_class = "box"
        uid = "modulo_form1_1372970373750_71ea30ee24e0516900bb98ebbe219e914a80211d_1372970386149"
        view = "fieldset">
    </control>
    <div 
        aud_on_entry = "false"
        auto_find = "true"
        auto_refresh = "true"
        binary_variables = ""
        binding_type = "connection"
        cascade_deletes = "false"
        cascade_updates = "false"
        commands = ""
        connection = "Connection1"
        detail_keys = "vuu_obra;vuu_empresa"
        display_name = "PUBLIC_vuu_unidades"
        field_weight = "599"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades."
        kind = "data_region"
        master_keys = "xob_obra;xob_empresa"
        master_region = "&lt;form&gt;"
        original_name = "view1"
        relationship_method = ""
        style_class = "data_view"
        target_table = "PUBLIC.vuu_unidades"
        uid = "modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373295060761"
        view = "data_region">
    </div>
    <div 
        alternate_row_class = "alternate_row"
        background_color = "transparent"
        binary_variables = ""
        display_name = "RepeatingArea1"
        field_weight = "99"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:RepeatingArea1."
        kind = "repeating_area"
        list_columns = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana.0:72;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad.72:72;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo.144:66;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote.210:74;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const.284:73;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina.357:73;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1.430:79;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2.509:64;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque.573:116;cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni.689:144"
        occurrences = "12"
        selected_row_class = "selected_row"
        style_class = "repeating_area"
        uid = "modulo_form1_1372970373750_5d9cc06362763e2710595e24e8275a96a24247e3_1373296629957"
        view = "repeating_area">
    </div>
    <field 
        accell_type = "Float"
        background_color = "#999999"
        binary_variables = ""
        db_length = "9"
        db_type = "Amount"
        display_justify = "Left"
        display_name = "vuu_area_const"
        field_length = "16"
        field_type = "text"
        field_weight = "499"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_const."
        multi_valued = "true"
        original_name = "vuu_area_const"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_area_const"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533229"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Float"
        background_color = "#999999"
        binary_variables = ""
        db_length = "9"
        db_type = "Amount"
        display_justify = "Left"
        display_name = "vuu_area_lote"
        field_length = "16"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_area_lote."
        multi_valued = "true"
        original_name = "vuu_area_lote"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_area_lote"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533219"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vuu_esquina"
        field_length = "2"
        field_type = "text"
        field_weight = "599"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_esquina."
        multi_valued = "true"
        original_name = "vuu_esquina"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_esquina"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533240"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "3"
        db_type = "String"
        display_name = "vuu_manzana"
        field_length = "3"
        field_type = "text"
        field_weight = "99"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_manzana."
        multi_valued = "true"
        original_name = "vuu_manzana"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_manzana"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533188"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "3"
        db_type = "String"
        display_name = "vuu_modelo"
        field_length = "3"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_modelo."
        multi_valued = "true"
        original_name = "vuu_modelo"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_modelo"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533208"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vuu_muro1"
        field_length = "2"
        field_type = "text"
        field_weight = "699"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro1."
        multi_valued = "true"
        original_name = "vuu_muro1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_muro1"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533250"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vuu_muro2"
        field_length = "2"
        field_type = "text"
        field_weight = "799"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_muro2."
        multi_valued = "true"
        original_name = "vuu_muro2"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_muro2"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533260"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "1"
        db_type = "String"
        display_name = "vuu_parque"
        field_length = "2"
        field_type = "text"
        field_weight = "899"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_parque."
        multi_valued = "true"
        original_name = "vuu_parque"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_parque"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533271"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Amount"
        background_color = "#999999"
        binary_variables = ""
        db_length = "15"
        db_type = "Amount"
        display_justify = "Right"
        display_name = "vuu_precio_uni"
        field_length = "25"
        field_type = "text"
        field_weight = "999"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_precio_uni."
        multi_valued = "true"
        original_name = "vuu_precio_uni"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_precio_uni"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533282"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        background_color = "#999999"
        binary_variables = ""
        db_length = "4"
        db_type = "String"
        display_name = "vuu_unidad"
        field_length = "4"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        key = "cajagrandeDUDisponibles:PUBLIC_vuu_unidades:vuu_unidad."
        multi_valued = "true"
        original_name = "vuu_unidad"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "vuu_unidad"
        uid = "modulo_form1_1372970373750_1858763a9413fe5108b969996a94508d545ee73b_1373467533191"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "Amount"
        binary_variables = ""
        display_justify = "Right"
        display_name = "TPrecioFLD"
        field_type = "text"
        field_weight = "699"
        findable = "false"
        immediate = "false"
        key = "cajagrandeDUDisponibles:TPrecioFLD."
        multi_valued = "false"
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "modulo_form1_1372970373750_0bf148f2cf21e1869eda9c88db18c5008d647d1a_1373550746608"
        updateable = "false"
        view = "text">
    </field>
    <field 
        accell_type = "Numeric"
        binary_variables = ""
        display_justify = "Right"
        display_name = "TUnidadesFLD"
        field_type = "text"
        field_weight = "799"
        findable = "false"
        key = "cajagrandeDUDisponibles:TUnidadesFLD."
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371746675999"
        updateable = "false"
        view = "text">
    </field>
    <control 
        background_color = "#e30000"
        binary_variables = ""
        commands = ""
        display_name = "box11"
        field_weight = "899"
        key = "cajagrandeDUDisponibles:box11."
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
        key = "cajagrandeDUDisponibles:box11:image1."
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
        display_name = "cajaarribaDUDisponibles"
        field_weight = "99"
        key = "cajagrandeDUDisponibles:cajaarribaDUDisponibles."
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
        key = "cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualempresa."
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
        key = "cajagrandeDUDisponibles:cajaarribaDUDisponibles:actualusuario."
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
        key = "cajagrandeDUDisponibles:cajaarribaDUDisponibles:label1."
        kind = "instance"
        original_name = "label1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
        uid_to_name = ""
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label211"
        key = "cajagrandeDUDisponibles:cajaarribaDUDisponibles:label211."
        original_name = "label2"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
        view = "label">
    </control>
    <control 
        base_class = "Classes/ItemsForm/Boton.fx"
        binary_variables = ""
        display_base_class = "ItemsForm.Boton"
        display_name = "imprimirbtn"
        field_type = "button"
        foundation_type = "Classes/Foundation/Button"
        key = "cajagrandeDUDisponibles:imprimirbtn."
        kind = "instance"
        original_name = "button1"
        uid = "form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368028211102"
        uid_to_name = ""
        view = "button">
    </control>
    <control 
        binary_variables = ""
        display_name = "label11"
        font_family = "Verdana"
        font_size = "14"
        font_weight = "bold"
        foreground_color = "Black"
        key = "cajagrandeDUDisponibles:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label3"
        font_size = "12"
        key = "cajagrandeDUDisponibles:label3."
        original_name = "label3"
        style_class = "label"
        uid = "desing_form1_1369342922091_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767264011"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label31"
        font_size = "12"
        key = "cajagrandeDUDisponibles:label31."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098070485"
        view = "label">
    </control>
    <control 
        binary_variables = ""
        display_name = "label311"
        font_size = "12"
        key = "cajagrandeDUDisponibles:label311."
        original_name = "label3"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371746701531"
        view = "label">
    </control>
    <control 
        base_class = "Classes/ItemsForm/Boton.fx"
        binary_variables = ""
        command = "Previous Form"
        display_base_class = "ItemsForm.Boton"
        display_name = "regresarbtn"
        field_type = "button"
        foundation_type = "Classes/Foundation/Button"
        key = "cajagrandeDUDisponibles:regresarbtn."
        kind = "instance"
        original_name = "button1"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371749444506"
        uid_to_name = ""
        view = "button">
    </control>
    <field 
        auto_accept = "true"
        binary_variables = ""
        case_conversion = "Upper"
        display_name = "vpy_nombre"
        field_type = "text"
        field_weight = "299"
        findable = "true"
        key = "cajagrandeDUDisponibles:vpy_nombre."
        multi_valued = "true"
        original_name = "textfield1"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = ""
        uid = "desing_form1_1369342922091_9aa357ed538e2cd1180f71a52d2b666790b6d2f4_1369767260538"
        updateable = "false"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "30"
        db_type = "String"
        display_name = "xob_nombre"
        explicit_search_mode = "default"
        field_length = "30"
        field_type = "text"
        field_weight = "499"
        findable = "true"
        key = "cajagrandeDUDisponibles:xob_nombre."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        stop_for_input = "false"
        style_class = "textfield"
        target_field = "xob_nombre"
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1370098123122"
        updateable = "false"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        auto_accept = "true"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "2"
        db_type = "String"
        display_name = "xob_obra"
        explicit_search_mode = "default"
        field_length = "2"
        field_type = "text"
        field_weight = "399"
        findable = "true"
        immediate = "true"
        key = "cajagrandeDUDisponibles:xob_obra."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        style_class = "textfield"
        target_field = "xob_obra"
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371740691367"
        updateable = "true"
        view = "text">
    </field>
    <field 
        accell_type = "String"
        auto_accept = "true"
        binary_variables = ""
        case_conversion = "Upper"
        db_length = "2"
        db_type = "String"
        display_name = "xob_proyecto"
        explicit_search_mode = "default"
        field_length = "2"
        field_type = "text"
        field_weight = "199"
        findable = "true"
        immediate = "true"
        key = "cajagrandeDUDisponibles:xob_proyecto."
        multi_valued = "true"
        original_name = "textfield1"
        retrieve_value = "true"
        return_values_into = "xob_proyecto"
        style_class = "textfield"
        target_field = "xob_proyecto"
        uid = "itemsform_dataview1_1368038367945_6729c9e91460ea25dbf3cad34f5a7d0e5d37936e_1371740682449"
        updateable = "true"
        view = "text"
        zoom_form = "Modulo/ProyectosFRM">
    </field>

</form>
