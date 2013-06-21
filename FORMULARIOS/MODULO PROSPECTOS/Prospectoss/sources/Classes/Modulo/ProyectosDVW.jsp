<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/VENTAS- PROSPECTOS/MODULO PROSPECTOS/Prospectoss/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="761"
        displaywidth="1131"
        field_order=""
        form_height="616"
        form_width="1052"
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
                sql_order_by_clause="vpy_empresa, vpy_codigo"
                target_table="PUBLIC.vpy_proyectos"
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 163px; left: -68px; width:718px; height:277px">

                    <div
                        alternate_row_class="alternate_row"
                        binary_variables=""
                        class="repeating_area"
                        displayheight="277"
                        displayleft="112"
                        displaytop="165"
                        displaywidth="718"
                        field_weight="199"
                        id=".top:RepeatingArea1."
                        key=".top:RepeatingArea1."
                        kind="repeating_area"
                        list_columns=".top:vpy_empresa.0:158;.top:vpy_codigo.158:172;.top:vpy_nombre.330:259;.top:vpy_estado.589:110"
                        occurrences="11"
                        repeat_style="Grid"
                        row_class="ROW"
                        selected_row_class="selected_row"
                        uid="parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241601"
                        view="repeating_area">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 0px; width:158px; height:22px">

                            <input
                                accell_type="String"
                                auto_accept="true"
                                binary_variables=""
                                case_conversion="Upper"
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="0"
                                displaytop="0"
                                displaywidth="158"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                headertitle="Codigo de Empresa"
                                key=".top:vpy_empresa."
                                multi_valued="true"
                                name=".top:vpy_empresa."
                                retrieve_value="true"
                                size="26"
                                target_field="vpy_empresa"
                                title="vpy_empresa"
                                type="text"
                                uid="parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241634"
                                updateable="false"
                                view="text"
                                zoom_active_mode="both">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 158px; width:172px; height:22px">

                            <input
                                accell_type="String"
                                auto_accept="true"
                                binary_variables=""
                                case_conversion="Upper"
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="104"
                                displaytop="0"
                                displaywidth="172"
                                field_length="2"
                                field_type="text"
                                field_weight="199"
                                findable="true"
                                headertitle="Codigo de Proyecto"
                                key=".top:vpy_codigo."
                                multi_valued="true"
                                name=".top:vpy_codigo."
                                retrieve_value="true"
                                size="28"
                                target_field="vpy_codigo"
                                title="vpy_codigo"
                                type="text"
                                uid="parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241655"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 330px; width:259px; height:22px">

                            <input
                                accell_type="String"
                                auto_complete="true"
                                binary_variables=""
                                class="textfield"
                                db_length="30"
                                db_type="String"
                                displayheight="22"
                                displayleft="234"
                                displaytop="0"
                                displaywidth="259"
                                field_length="30"
                                field_type="text"
                                field_weight="299"
                                findable="true"
                                headertitle="Nombre de Proyecto"
                                key=".top:vpy_nombre."
                                multi_valued="true"
                                name=".top:vpy_nombre."
                                original_name="vpy_nombre"
                                retrieve_value="true"
                                size="43"
                                target_field="vpy_nombre"
                                title="vpy_nombre"
                                type="text"
                                uid="parametros_form1_1369065545580_eb526db1fde058fbe8a932069fe9d13426242512_1369142723132"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 589px; width:110px; height:21px">

                            <select
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="1"
                                db_type="String"
                                displayheight="21"
                                displayleft="351"
                                displaytop="0"
                                displaywidth="110"
                                explicit_search_mode="default"
                                field_length="2"
                                field_type="SELECT"
                                field_weight="399"
                                findable="true"
                                headertitle="Estado"
                                key=".top:vpy_estado."
                                multi_valued="true"
                                name=".top:vpy_estado."
                                options="Temporal=T&#59;Real=R"
                                original_name="textfield1"
                                retrieve_value="true"
                                size="1"
                                target_field="vpy_estado"
                                uid="parametros_form1_1369065545580_eb526db1fde058fbe8a932069fe9d13426242512_1369143142505"
                                updateable="true"
                                view="select"
                                style="width:110px; height: 21px">
                            </select>

                        </div>

                        <div
                            binary_variables=""
                            navbarcontainer="true"
                            view="div"
                            style="position: absolute; top: 243px; left: 20px; width:340px; height:25px">

                            <div
                                binary_variables=""
                                class="navigation"
                                displayheight="25"
                                displayleft="20"
                                displaytop="243"
                                displaywidth="340"
                                id=".top:navigationbar1."
                                key=".top:navigationbar1."
                                kind="navigation_bar"
                                linkinrement="1"
                                navigationtype="pages"
                                uid="parametros_form1_1369065545580_754d79e9bc04dd30d4c1dd87c63d1b15820937db_1369071241680"
                                vertical_anchor="top"
                                view="navigation_bar">

                            </div>

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
                            style="position: absolute; top: 14px; left: 241px; width:522px; height:23px">

                            <div
                                base_class="Classes/ItemsForm/TituloLBL.fx"
                                binary_variables=""
                                displayheight="23"
                                displayleft="241"
                                displaytop="14"
                                displaywidth="522"
                                foundation_type="Classes/Foundation/Label"
                                id=".top:box111:label1."
                                key=".top:box111:label1."
                                kind="instance"
                                labelalign="left"
                                labeltitle="PROYECTOS EN VENTA"
                                original_name="label1"
                                uid="form1_1368027451429_8629d4ae9fc6123c2d53fffd3417127658a7059f_1368038107157"
                                uid_to_name=""
                                view="label">

                            </div>

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
                    style="position: absolute; top: 96px; left: 20px; width:149px; height:18px">
                    
                    
                    <label
                        binary_variables=""
                        class="label"
                        displayheight="18"
                        displayleft="20"
                        displaytop="96"
                        displaywidth="149"
                        id=".top:label11."
                        key=".top:label11."
                        labelalign="left"
                        labeltitle="Proyectos en venta"
                        original_name="label1"
                        target_field=""
                        uid="desing_form1_1369342922091_cc686538039687f3fe174c6a9b0b99bb9936753e_1369345220656"
                        view="label"
                        style="font-weight: bold;
                            font-family: Verdana;
                            font-size: 14px;
                            color: Black">
                        <nobr>Proyectos en venta</nobr>
                    </label>

                </div>

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
