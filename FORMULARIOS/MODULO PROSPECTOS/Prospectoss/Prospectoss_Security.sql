DELETE FROM    nxjSecurityMap
WHERE          appPackageName = 'Prospectoss';

DELETE FROM    nxjPackageRoles
WHERE          appPackageName = 'Prospectoss';

DELETE FROM    nxjPackageEnvVars
WHERE          appPackageName = 'Prospectoss';

DELETE FROM    nxjPackages
WHERE          appPackageName = 'Prospectoss';

DELETE FROM    nxjPackageRoleMappingType
WHERE          appPackageName = 'Prospectoss';

INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Servicios.ServAdmin', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:cajagrandeSociedades:PUBLIC_xel_emprelogo1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM:LOGINCMD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:CajaSegui:PUBLIC_vps_prosigue:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM:cajagrandeMenu:CMDSIG', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:view1:REPORTECMD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:CajaSegui:PUBLIC_vps_prosigue:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:cajagrandeSociedades:PUBLIC_xel_emprelogo1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:CajaSegui:PUBLIC_vps_prosigue:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:CajaSegui:PUBLIC_vps_prosigue:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.GradoInteresFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SeguimientoFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:cajagrandeSociedades:PUBLIC_xel_emprelogo1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:cajagrandeSociedades:PUBLIC_xel_emprelogo1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProspectosFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.LoginFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MediospFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.VendedoresFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.CorredoresFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.RepProspectosFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.ProyectosFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'ModuloCNegocios.DUDisponiblesFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.SociedadesFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'classes', 'Modulo.MenuFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'static_content', '/', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectoss', 'reports', '/V', '', '0');

INSERT INTO    nxjPackages (appPackageName)
VALUES         ('Prospectoss');


INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('Prospectoss', 'LookAndFeel', 'String', 'BaseLAF');

INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('Prospectoss', 'TmpDir', 'String', '$TMP');

