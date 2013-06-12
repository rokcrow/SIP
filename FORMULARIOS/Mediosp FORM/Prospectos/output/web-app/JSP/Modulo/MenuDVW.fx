<form 
    binary_variables = ""
    form_height = "489"
    form_width = "1324"
    object_type = "data_view"
    style_class = "form"
    view = "form"
    reuse="true">

    <div 
        aud_on_entry = "false"
        background_color = "#cccccc"
        binary_variables = ""
        bloom_filter = "00000000000400040000000000000000"
        commands = ""
        connection = "DataServerCon"
        display_name = ".top"
        foundation_type = "Classes/Foundation/Data view"
        key = ".top."
        kind = "data_region"
        style_class = "data_view"
        target_table = "PUBLIC.xel_emprelogo"
        uid_prefix = "itemsform_dataview1_1368038367945"
        view = "data_region">
    </div>
    <field 
        binary_variables = ""
        display_name = "EMPRESA"
        field_type = "SELECT"
        field_weight = "199"
        findable = "false"
        immediate = "true"
        key = ".top:EMPRESA."
        original_name = "EMPRESA"
        query = "SELECT xem_nombre, xem_codigo FROM xem_empresas ORDER BY xem_nombre ASC;"
        required = "false"
        stop_for_input = "true"
        style_class = "listbox"
        target_field = ""
        uid = "form1_1369150692325_662201349dfacfaa961ea1a5268b1d213c4703b3_1369235129983"
        view = "select">
    </field>
    <field 
        binary_variables = ""
        display_name = "NombreForma1"
        field_type = "text"
        field_weight = "299"
        findable = "false"
        key = ".top:NombreForma1."
        original_name = "textfield1"
        style_class = "textfield"
        target_field = ""
        uid = "form1_1369150692325_b4877e7ab5bf49a95afbb9c0398f84351d607cdf_1369406376333"
        view = "text">
    </field>
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
        font_size = "12"
        key = ".top:label1."
        original_name = "label1"
        style_class = "label"
        uid = "itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369580705909"
        view = "label">
    </control>
    <control 
        display_name = "label11"
        font_size = "12"
        key = ".top:label11."
        original_name = "label1"
        style_class = "label"
        target_field = ""
        uid = "itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369580830638"
        view = "label">
    </control>
    <div 
        binary_variables = ""
        display_name = "menuPri"
        font_family = "Calibri"
        font_size = "14"
        font_style = "normal"
        font_weight = "bold"
        key = ".top:menuPri."
        kind = "menu"
        menuitems = "f&#09;Menubar&#09;&#09;&lt;current&gt;&#09;&#09;&#09;t&#09;0"
        original_name = "menu1"
        style_class = "menu"
        uid = "form1_1369150692325_26b881c5c4e192f946d0445da1b929d7e1471d2e_1369327000650"
        view = "menu">
    </div>

</form>
