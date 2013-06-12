<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/FORMULARIOS/Login FORM PRI/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="871"
        displaywidth="1055"
        form_height="616"
        form_width="1055"
        name="NXJForm"
        object_type="data_view"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 25px; left: 25px; width:1005px; height:566px">

            <div
                aud_on_entry="false"
                auto_find="true"
                binary_variables=""
                binding_type="connection"
                bloom_filter="00000000000400040000000000000000"
                border-width="1"
                class="data_view"
                commands=""
                connection="Connection1"
                displayheight="566"
                displayleft="25"
                displaytop="25"
                displaywidth="1005"
                fieldheight="566"
                fieldwidth="1005"
                foundation_type="Classes/Foundation/Data view"
                id=".top."
                key=".top."
                kind="data_region"
                name=".top."
                sql_order_by_clause="vmp_codigo"
                target_table="PUBLIC.vmp_mediosp"
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 152px; left: -128px; width:536px; height:263px">

                    <div
                        alternate_row_class="alternate_row"
                        binary_variables=""
                        class="repeating_area"
                        displayheight="263"
                        displayleft="250"
                        displaytop="165"
                        displaywidth="536"
                        field_weight="199"
                        id=".top:RepeatingArea1."
                        key=".top:RepeatingArea1."
                        kind="repeating_area"
                        list_columns="vmp_codigo.0:92;vmp_descripcion.92:300;vmp_categoria.392:114"
                        occurrences="10"
                        repeat_style="Fields"
                        row_class="ROW"
                        selected_row_class="selected_row"
                        uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369254961254"
                        view="repeating_area"
                        style="color: Black">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 10px; width:536px; height:14px">

                            <fieldset
                                binary_variables=""
                                class="header"
                                commands=""
                                displayheight="14"
                                displayleft="10"
                                displaytop="0"
                                displaywidth="536"
                                id=".top:Box."
                                key=".top:Box."
                                original_name="Box"
                                uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369255025915"
                                view="fieldset"
                                style="border-style:none">

                                <div
                                    binary_variables=""
                                    view="div"
                                    align="center" 
                                    style="position: absolute; top: 0px; left: 437px; width:55px; height:14px">
                                    
                                    
                                    <label
                                        binary_variables=""
                                        displayheight="14"
                                        displayleft="402"
                                        displaytop="0"
                                        displaywidth="55"
                                        id=".top:Box:Label."
                                        key=".top:Box:Label."
                                        labelalign="center"
                                        labeltitle="Categoria"
                                        original_name="Label"
                                        uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369255026235"
                                        view="label"
                                        style="font-weight: bold;
                                            color: Black">
                                        <nobr>Categoria</nobr>
                                    </label>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    align="center" 
                                    style="position: absolute; top: 0px; left: 219px; width:65px; height:14px">
                                    
                                    
                                    <label
                                        binary_variables=""
                                        displayheight="14"
                                        displayleft="102"
                                        displaytop="0"
                                        displaywidth="65"
                                        id=".top:Box:Label1."
                                        key="Box:Label."
                                        labelalign="center"
                                        labeltitle="Descripcion"
                                        original_name="Label"
                                        target_field=""
                                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369583090171"
                                        view="label"
                                        style="font-weight: bold;
                                            color: Black">
                                        <nobr>Descripcion</nobr>
                                    </label>

                                </div>

                                <div
                                    binary_variables=""
                                    view="div"
                                    align="center" 
                                    style="position: absolute; top: 0px; left: 37px; width:38px; height:14px">
                                    
                                    
                                    <label
                                        binary_variables=""
                                        displayheight="14"
                                        displayleft="10"
                                        displaytop="0"
                                        displaywidth="38"
                                        id=".top:Box:Label1."
                                        key="Box:Label."
                                        labelalign="center"
                                        labeltitle="Codigo"
                                        original_name="Label"
                                        target_field=""
                                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369583090171"
                                        view="label"
                                        style="font-weight: bold;
                                            color: Black">
                                        <nobr>Codigo</nobr>
                                    </label>

                                </div>

                            </fieldset>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 20px; left: 402px; width:125px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="402"
                                displaytop="20"
                                displaywidth="125"
                                field_length="2"
                                field_type="text"
                                field_weight="299"
                                findable="true"
                                headertitle="vmp_categoria"
                                key=".top:vmp_categoria."
                                multi_valued="true"
                                name=".top:vmp_categoria."
                                original_name="vmp_categoria"
                                retrieve_value="true"
                                size="20"
                                target_field="vmp_categoria"
                                title="vmp_categoria"
                                type="text"
                                uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369255026244"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 20px; left: 10px; width:92px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="10"
                                displaytop="20"
                                displaywidth="92"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                headertitle="vmp_codigo"
                                key=".top:vmp_codigo."
                                multi_valued="true"
                                name=".top:vmp_codigo."
                                original_name="vmp_codigo"
                                retrieve_value="true"
                                size="15"
                                target_field="vmp_codigo"
                                title="vmp_codigo"
                                type="text"
                                uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369255026004"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 20px; left: 102px; width:300px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="50"
                                db_type="String"
                                displayheight="22"
                                displayleft="102"
                                displaytop="20"
                                displaywidth="300"
                                field_length="50"
                                field_type="text"
                                field_weight="199"
                                findable="true"
                                headertitle="vmp_descripcion"
                                key=".top:vmp_descripcion."
                                multi_valued="true"
                                name=".top:vmp_descripcion."
                                original_name="vmp_descripcion"
                                retrieve_value="true"
                                size="50"
                                target_field="vmp_descripcion"
                                title="vmp_descripcion"
                                type="text"
                                uid="parametros_form1_1369254869826_647d3cfa19944ebba64c7194ad7d74d6de70b8f2_1369255026018"
                                updateable="true"
                                view="text">
                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 511px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="511"
                        displaywidth="996"
                        field_weight="299"
                        id=".top:box11."
                        key=".top:box11."
                        original_name="box1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369343805083"
                        view="fieldset"
                        style="border-width:0;
                            border-style:None;
                            border-color:transparent;
                            background-color: #e30000">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 2px; left: 416px; width:164px; height:46px">

                            <div
                                base_class="Classes/ItemsForm/Logo.fx"
                                binary_variables=""
                                displayheight="46"
                                displayleft="416"
                                displaytop="2"
                                displaywidth="164"
                                foundation_type="Classes/Foundation/Image"
                                id=".top:box11:image1."
                                key=".top:box11:image1."
                                kind="instance"
                                original_name="image1"
                                uid="itemsform_dataview1_1368038367945_c486553ba63e77316f04c86372ffc3ae6f0d73b1_1368040829176"
                                uid_to_name=""
                                view="img">

                            </div>

                        </div>

                    </fieldset>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 2px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="2"
                        displaywidth="996"
                        field_weight="99"
                        id=".top:box111."
                        key=".top:box111."
                        original_name="box1"
                        target_field=""
                        uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928873884"
                        view="fieldset"
                        style="border-width:0;
                            border-style:None;
                            border-color:transparent;
                            background-color: #e30000">

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 14px; left: 241px; width:252px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="252"
                                foundation_type="Classes/Foundation/Label"
                                id=".top:box111:label1."
                                key=".top:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="MEDIOS PUBLICITARIOS"
                                original_name="label1"
                                uid="form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
                                uid_to_name=""
                                view="label">

                            </div>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            align="left" 
                            style="position: absolute; top: 65px; left: 778px; width:55px; height:14px">
                            
                            
                            <label
                                binary_variables=""
                                class="label"
                                displayheight="21"
                                displayleft="778"
                                displaytop="65"
                                displaywidth="55"
                                id=".top:box111:label211."
                                key=".top:box111:label211."
                                labelalign="left"
                                labeltitle="top: 1024"
                                original_name="label2"
                                target_field=""
                                uid="desing_form1_1369342922091_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369928874041"
                                view="label">
                                <nobr>top: 1024</nobr>
                            </label>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 14px; left: 16px; width:197px; height:22px">

                            <input
                                binary_variables=""
                                class="textfield"
                                displayheight="22"
                                displayleft="16"
                                displaytop="14"
                                displaywidth="197"
                                field_type="text"
                                field_weight="99"
                                findable="false"
                                immediate="true"
                                key=".top:box111:textfield1."
                                name=".top:box111:textfield1."
                                original_name="textfield1"
                                size="32"
                                stop_for_input="false"
                                target_field=""
                                type="text"
                                uid="desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929860573"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 14px; left: 800px; width:110px; height:22px">

                            <input
                                binary_variables=""
                                class="textfield"
                                displayheight="22"
                                displayleft="800"
                                displaytop="14"
                                displaywidth="110"
                                field_type="text"
                                field_weight="199"
                                findable="false"
                                immediate="true"
                                key=".top:box111:textfield11."
                                name=".top:box111:textfield11."
                                original_name="textfield1"
                                size="18"
                                stop_for_input="false"
                                target_field=""
                                type="text"
                                uid="desing_dataview1_1369927531049_9f88a2785a5cdfa515e6420db6f725558bb0dafc_1369929929174"
                                view="text">
                        </div>

                    </fieldset>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    align="left" 
                    style="position: absolute; top: 96px; left: 20px; width:153px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="96"
                        displaywidth="153"
                        id=".top:label11."
                        key=".top:label11."
                        labelalign="left"
                        labeltitle="Medios Publicitarios"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Medios Publicitarios</nobr>
                    </label>

                </div>

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
