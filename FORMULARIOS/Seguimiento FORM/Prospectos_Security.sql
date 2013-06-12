DELETE FROM    nxjSecurityMap
WHERE          appPackageName = 'Prospectos';

DELETE FROM    nxjPackageRoles
WHERE          appPackageName = 'Prospectos';

DELETE FROM    nxjPackageEnvVars
WHERE          appPackageName = 'Prospectos';

DELETE FROM    nxjPackages
WHERE          appPackageName = 'Prospectos';

DELETE FROM    nxjPackageRoleMappingType
WHERE          appPackageName = 'Prospectos';

INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:view1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:view1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:PUBLIC_vps_prosigue:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:PUBLIC_vps_prosigue:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:PUBLIC_vps_prosigue:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:PUBLIC_vps_prosigue:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.ProspectosFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:view1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'classes', 'Modulo.SeguimientoFRM:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'static_content', '/', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('Prospectos', 'reports', '/V', '', '0');

INSERT INTO    nxjPackages (appPackageName)
VALUES         ('Prospectos');


INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('Prospectos', 'LookAndFeel', 'String', 'BaseLAF');

INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('Prospectos', 'TmpDir', 'String', '$TMP');

