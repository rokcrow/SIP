<html>
<head>

</head>
<%=com.unify.nxj.awebServlet.Runtime.generateOnLoad(request, response, application)%>
<body onLoad="initPreview(false, -1, -1, 'file:///C:\Unify\NXJ/web-app/unify/images', 'file:///C:/Users/TI3-Provivienda/Desktop/FORMULARIOS/Menu FORM/Prospectos/sources/Static_Content');window.initInternalJavaScriptComponents();" class="form" >

    <form
        binary_variables=""
        class="form"
        displayheight="871"
        displaywidth="1055"
        form_height="489"
        form_width="1324"
        name="NXJForm"
        object_type="data_view"
        view="form">

        <div
            binary_variables=""
            view="div"
            style="position: absolute; top: 25px; left: 25px; width:1005px; height:439px">

            <div
                aud_on_entry="false"
                binary_variables=""
                bloom_filter="00000000000400040000000000000000"
                border-width="1"
                class="data_view"
                commands=""
                connection="DataServerCon"
                displayheight="439"
                displayleft="25"
                displaytop="25"
                displaywidth="1005"
                fieldheight="439"
                fieldwidth="1005"
                foundation_type="Classes/Foundation/Data view"
                id=".top."
                key=".top."
                kind="data_region"
                name=".top."
                target_table="PUBLIC.xel_emprelogo"
                uid_prefix="itemsform_dataview1_1368038367945"
                view="data_region"
                style="border-width:1;
                    border-style:solid;
                    background-color: #cccccc">

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 169px; left: 365px; width:348px; height:21px">

                    <select
                        binary_variables=""
                        class="listbox"
                        displayheight="21"
                        displayleft="365"
                        displaytop="169"
                        displaywidth="348"
                        field_type="SELECT"
                        field_weight="199"
                        findable="false"
                        immediate="true"
                        key=".top:EMPRESA."
                        name=".top:EMPRESA."
                        original_name="EMPRESA"
                        query="SELECT xem_nombre, xem_codigo FROM xem_empresas ORDER BY xem_nombre ASC&#59;"
                        required="false"
                        size="1"
                        stop_for_input="true"
                        target_field=""
                        uid="form1_1369150692325_662201349dfacfaa961ea1a5268b1d213c4703b3_1369235129983"
                        view="select"
                        style="width:348px; height: 21px">
                    </select>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 281px; left: 365px; width:348px; height:22px">

                    <input
                        binary_variables=""
                        class="textfield"
                        displayheight="22"
                        displayleft="365"
                        displaytop="281"
                        displaywidth="348"
                        field_type="text"
                        field_weight="299"
                        findable="false"
                        key=".top:NombreForma1."
                        name=".top:NombreForma1."
                        original_name="textfield1"
                        size="58"
                        target_field=""
                        type="text"
                        uid="form1_1369150692325_b4877e7ab5bf49a95afbb9c0398f84351d607cdf_1369406376333"
                        view="text">
                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 384px; left: 4px; width:996px; height:50px">

                    <fieldset
                        binary_variables=""
                        border-width="0"
                        class="box"
                        commands=""
                        displayheight="50"
                        displayleft="4"
                        displaytop="384"
                        displaywidth="996"
                        field_weight="399"
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
                                labeltitle="MENU DEL SISTEMA"
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
                    view="div"
                    align="left" 
                    style="position: absolute; top: 143px; left: 365px; width:148px; height:16px">
                    
                    
                    <label
                        class="label"
                        displayheight="16"
                        displayleft="365"
                        displaytop="143"
                        displaywidth="148"
                        id=".top:label1."
                        key=".top:label1."
                        labelalign="left"
                        labeltitle="Sociedades Disponibles"
                        original_name="label1"
                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369580705909"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Sociedades Disponibles</nobr>
                    </label>

                </div>

                <div
                    view="div"
                    align="left" 
                    style="position: absolute; top: 255px; left: 365px; width:142px; height:16px">
                    
                    
                    <label
                        class="label"
                        displayheight="16"
                        displayleft="365"
                        displaytop="255"
                        displaywidth="142"
                        id=".top:label11."
                        key=".top:label11."
                        labelalign="left"
                        labeltitle="Nombre del Formulario"
                        original_name="label1"
                        target_field=""
                        uid="itemsform_dataview1_1368038367945_708bd40661cf4354755bed835ef17ac327fd9ef9_1369580830638"
                        view="label"
                        style="font-size: 12px">
                        <nobr>Nombre del Formulario</nobr>
                    </label>

                </div>

                <div
                    binary_variables=""
                    view="div"
                    style="position: absolute; top: 57px; left: 4px; width:993px; height:28px">

                    <div
                        binary_variables=""
                        class="menu"
                        displayheight="28"
                        displayleft="4"
                        displaytop="57"
                        displaywidth="993"
                        id=".top:menuPri."
                        key=".top:menuPri."
                        kind="menu"
                        menuitems="f	Menubar		<current>			t	0"
                        menustylesheet="silver.css"
                        original_name="menu1"
                        uid="form1_1369150692325_26b881c5c4e192f946d0445da1b929d7e1471d2e_1369327000650"
                        view="menu"
                        style="font-weight: bold;
                            font-style: normal;
                            font-family: Calibri;
                            font-size: 14px">

                    </div>

                </div>

            </div>

        </div>

    </form>
<%=com.unify.nxj.awebServlet.Runtime.getCommandForm(request)%>
</body>

</html>
