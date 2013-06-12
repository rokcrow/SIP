<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/Otros FORMS/Prospectos/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="871"
        displaywidth="1055"
        form_height="871"
        form_width="1134"
        name="NXJForm"
        object_type="data_view"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 25px; left: 25px; width:1005px; height:821px">

            <div
                binary_variables=""
                bloom_filter="00000000000400040000000000000000"
                border-width="1"
                class="data_view"
                commands=""
                displayheight="821"
                displayleft="25"
                displaytop="25"
                displaywidth="1005"
                fieldheight="821"
                fieldwidth="1005"
                foundation_type="Classes/Foundation/Data view"
                id=".top."
                key=".top."
                kind="data_region"
                name=".top."
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: -3px; left: 8px; width:650px; height:464px">

                    <div
                        alternate_row_class="alternate_row"
                        binary_variables=""
                        class="repeating_area"
                        disable_wrap="false"
                        displayheight="464"
                        displayleft="351"
                        displaytop="259"
                        displaywidth="650"
                        field_weight="199"
                        horizontal_scroll_width="82%"
                        id=".top:RepeatingArea1."
                        key=".top:RepeatingArea1."
                        kind="repeating_area"
                        list_columns=".top:xpc_codigo.0:111;.top:xpc_clase.111:111;.top:xpc_nombre.222:99;.top:xpc_califica.321:78;.top:xpc_dias_pac.399:116;.top:xpc_dias_pvt.515:116"
                        occurrences="19"
                        repeat_style="Grid"
                        row_class="ROW"
                        selected_row_class="selected_row"
                        uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156584932"
                        view="repeating_area">

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 0px; width:111px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="2"
                                db_type="String"
                                displayheight="22"
                                displayleft="162"
                                displaytop="0"
                                displaywidth="111"
                                field_length="2"
                                field_type="text"
                                field_weight="99"
                                findable="true"
                                headertitle="Codigo"
                                key=".top:xpc_codigo."
                                multi_valued="true"
                                name=".top:xpc_codigo."
                                retrieve_value="true"
                                size="18"
                                target_field="xpc_codigo"
                                title="xpc_codigo"
                                type="text"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156584993"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 111px; width:111px; height:21px">

                            <select
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="1"
                                db_type="String"
                                displayheight="21"
                                displayleft="137"
                                displaytop="0"
                                displaywidth="111"
                                field_length="2"
                                field_type="SELECT"
                                field_weight="199"
                                findable="true"
                                headertitle="Clase"
                                key=".top:xpc_clase."
                                multi_valued="true"
                                name=".top:xpc_clase."
                                options="Primer Contacto=P&#59;Seguimiento=S"
                                original_name="xpc_clase"
                                retrieve_value="true"
                                size="1"
                                target_field="xpc_clase"
                                title="xpc_clase"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156672374"
                                updateable="true"
                                view="select"
                                style="width:111px; height: 21px">
                            </select>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 222px; width:99px; height:22px">

                            <input
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="100"
                                db_type="String"
                                displayheight="22"
                                displayleft="450"
                                displaytop="0"
                                displaywidth="99"
                                field_length="100"
                                field_type="text"
                                field_weight="299"
                                findable="true"
                                headertitle="Nombre"
                                key=".top:xpc_nombre."
                                multi_valued="true"
                                name=".top:xpc_nombre."
                                retrieve_value="true"
                                size="16"
                                target_field="xpc_nombre"
                                title="xpc_nombre"
                                type="text"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156585031"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 321px; width:78px; height:21px">

                            <select
                                accell_type="String"
                                binary_variables=""
                                class="textfield"
                                db_length="1"
                                db_type="String"
                                displayheight="21"
                                displayleft="411"
                                displaytop="0"
                                displaywidth="78"
                                field_length="2"
                                field_type="SELECT"
                                field_weight="399"
                                findable="true"
                                headertitle="Calificacion"
                                key=".top:xpc_califica."
                                multi_valued="true"
                                name=".top:xpc_califica."
                                options="Interesado=I&#59;Medianamente Interesado=M&#59;Poco Interesado=P"
                                original_name="xpc_califica"
                                retrieve_value="true"
                                size="1"
                                target_field="xpc_califica"
                                title="xpc_califica"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156677036"
                                updateable="true"
                                view="select"
                                style="width:78px; height: 21px">
                            </select>

                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 399px; width:116px; height:22px">

                            <input
                                accell_type="Numeric"
                                binary_variables=""
                                class="textfield"
                                db_length="4"
                                db_type="Numeric"
                                displayheight="22"
                                displayleft="247"
                                displaytop="0"
                                displaywidth="116"
                                field_length="6"
                                field_type="text"
                                field_weight="499"
                                findable="true"
                                headertitle="Dias Alto Costo"
                                key=".top:xpc_dias_pac."
                                multi_valued="true"
                                name=".top:xpc_dias_pac."
                                retrieve_value="true"
                                size="19"
                                target_field="xpc_dias_pac"
                                title="xpc_dias_pac"
                                type="text"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156585005"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            view="div"
                            style="position: absolute; top: 0px; left: 515px; width:116px; height:22px">

                            <input
                                accell_type="Numeric"
                                binary_variables=""
                                class="textfield"
                                db_length="4"
                                db_type="Numeric"
                                displayheight="22"
                                displayleft="349"
                                displaytop="0"
                                displaywidth="116"
                                field_length="6"
                                field_type="text"
                                field_weight="599"
                                findable="true"
                                headertitle="Dias VTradicional"
                                key=".top:xpc_dias_pvt."
                                multi_valued="true"
                                name=".top:xpc_dias_pvt."
                                retrieve_value="true"
                                size="19"
                                target_field="xpc_dias_pvt"
                                title="xpc_dias_pvt"
                                type="text"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156585018"
                                updateable="true"
                                view="text">
                        </div>

                        <div
                            binary_variables=""
                            navbarcontainer="true"
                            view="div"
                            style="position: absolute; top: 430px; left: 20px; width:780px; height:24px">

                            <div
                                binary_variables=""
                                class="navigation"
                                displayheight="24"
                                displayleft="20"
                                displaytop="430"
                                displaywidth="780"
                                id=".top:navigationbar1."
                                key=".top:navigationbar1."
                                kind="navigation_bar"
                                linkinrement="22"
                                navigationtype="rows"
                                uid="parametros_form1_1369156385845_213d57eca34f40d2c96700d0aab5cea0e79da9f6_1369156585044"
                                view="navigation_bar">

                            </div>

                        </div>

                    </div>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 766px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="766"
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
                            style="position: absolute; top: -6px; left: 391px; width:222px; height:62px">

                            <div
                                base_class="Classes/ItemsForm/Logo.fx"
                                binary_variables=""
                                displayleft="391"
                                displaytop="-6"
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
                                labeltitle="GRADO DE INTERES"
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

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
