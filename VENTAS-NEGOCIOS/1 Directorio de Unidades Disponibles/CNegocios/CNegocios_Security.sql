DELETE FROM    nxjSecurityMap
WHERE          appPackageName = 'CNegocios';

DELETE FROM    nxjPackageRoles
WHERE          appPackageName = 'CNegocios';

DELETE FROM    nxjPackageEnvVars
WHERE          appPackageName = 'CNegocios';

DELETE FROM    nxjPackages
WHERE          appPackageName = 'CNegocios';

DELETE FROM    nxjPackageRoleMappingType
WHERE          appPackageName = 'CNegocios';

INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:cajagrandeDUDisponibles:PUBLIC_vuu_unidades:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'classes', 'Modulo.DUDisponiblesFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'static_content', '/', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('CNegocios', 'reports', '/V', '', '0');

INSERT INTO    nxjPackages (appPackageName)
VALUES         ('CNegocios');


INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('CNegocios', 'LookAndFeel', 'String', 'BaseLAF');

INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('CNegocios', 'TmpDir', 'String', '$TMP');

