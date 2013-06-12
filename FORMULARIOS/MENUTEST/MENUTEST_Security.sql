DELETE FROM    nxjSecurityMap
WHERE          appPackageName = 'MENUTEST';

DELETE FROM    nxjPackageRoles
WHERE          appPackageName = 'MENUTEST';

DELETE FROM    nxjPackageEnvVars
WHERE          appPackageName = 'MENUTEST';

DELETE FROM    nxjPackages
WHERE          appPackageName = 'MENUTEST';

DELETE FROM    nxjPackageRoleMappingType
WHERE          appPackageName = 'MENUTEST';

INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'classes', 'Form1:INTERACTIVE-UPDATE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'classes', 'Form1', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'classes', 'Form1:INTERACTIVE-ADD', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'classes', 'Form1:FIND', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'classes', 'Form1:DELETE', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'static_content', '/', '', '0');
INSERT INTO    nxjSecurityMap (appPackageName, moduleName, resourceName, roleList, lastUpdate)
VALUES         ('MENUTEST', 'reports', '/V', '', '0');

INSERT INTO    nxjPackages (appPackageName)
VALUES         ('MENUTEST');


INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('MENUTEST', 'LookAndFeel', 'String', 'BaseLAF');

INSERT INTO    nxjPackageEnvVars (appPackageName, envVarName, dataType, defaultValue)
VALUES         ('MENUTEST', 'TmpDir', 'String', '$TMP');

