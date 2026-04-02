package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2501");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getPasswordHash();
        faculty3.setEmail("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID9 = faculty3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Maintenance" + "'", str5, "Maintenance");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "INACTIVE" + "'", str6, "INACTIVE");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "1) test2501(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "c87f7e63-64c6-46a5-a365-33994fd84a8d");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2502");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment12.isModifyAvailable(localDateTime13, localDateTime14, "Faculty", reservation16);
        equipment12.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment12.isModifyAvailable(localDateTime20, localDateTime21, "", reservation23);
        labManager5.markMaintenance(equipment12);
        double double26 = labManager5.getHourlyRate();
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.lang.String str37 = equipment30.getEquipmentId();
        equipment30.setStatus("");
        java.lang.String str40 = equipment30.getEquipmentId();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean44 = equipment30.isAvailable(localDateTime41, localDateTime42, "Researcher");
        labManager5.addEquipment(equipment30);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2503");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setPasswordHash("Maintenance");
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        java.lang.String str31 = equipment21.toString();
        equipment21.disable();
        labManager9.setEquipmentStatus(equipment21, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment21.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2504");
        model.LabManager labManager3 = new model.LabManager("Researcher", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Temp123!");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getStatus();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        java.lang.String str17 = equipment9.getDescription();
        java.lang.String str18 = equipment9.getEquipmentId();
        equipment9.notifyObservers();
        equipment9.markMaintenance();
        equipment9.setDescription("");
        labManager3.setEquipmentStatus(equipment9, "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        equipment28.disable();
        equipment28.enable();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean40 = equipment28.isAvailable(localDateTime37, localDateTime38, "");
        equipment28.disable();
        java.lang.String str42 = equipment28.getStatus();
        java.lang.String str43 = equipment28.getDescription();
        labManager3.markMaintenance(equipment28);
        java.lang.String str45 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Disabled" + "'", str42, "Disabled");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "LabManager" + "'", str45, "LabManager");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2505");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double11 = guest3.getHourlyRate();
        java.lang.String str12 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2506");
        model.LabManager labManager3 = new model.LabManager("User{userId=9d416907-3a05-44fd-bc51-fc26cdb1078f, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=902105d2-35c6-47ce-b94e-ed720e6c42d9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2507");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID11 = labManager10.getUserId();
        java.lang.Class<?> wildcardClass12 = labManager10.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "2) test2507(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "669501c9-f45c-43a8-9ee2-01473203704a");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2508");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getEquipmentId();
        java.lang.String str14 = equipment3.getEquipmentId();
        equipment3.setLabLocation("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        java.lang.String str19 = equipment3.getEquipmentId();
        equipment3.setDescription("User{userId=f724b6e8-da94-4ecb-ab0f-99c8597e0b65, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        equipment3.setLabLocation("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2509");
        model.Researcher researcher3 = new model.Researcher("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LM-CERT");
        java.lang.String str4 = researcher3.getPasswordHash();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
// flaky "3) test2509(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=a6cd648c-c622-4401-8e3b-22fb077d9dc2, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='Researcher'}" + "'", str8, "User{userId=a6cd648c-c622-4401-8e3b-22fb077d9dc2, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='Researcher'}");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2510");
        model.Researcher researcher3 = new model.Researcher("User{userId=e1992ee2-b83b-4993-a977-2c69c5c2df62, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=07c97905-b8e0-4c19-8a65-87b89491eac1, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2511");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        double double24 = labManager18.getHourlyRate();
        java.lang.String str25 = labManager18.getRole();
        double double26 = labManager18.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        labManager32.setEquipmentStatus(equipment36, "");
        equipment36.notifyObservers();
        labManager18.addEquipment(equipment36);
        labManager5.setEquipmentStatus(equipment36, "Guest");
        equipment36.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator55 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager57 = headLabCoordinator55.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        labManager57.markMaintenance(equipment61);
        equipment61.setStatus("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment68 = new model.Equipment("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState69 = equipment68.getCurrentState();
        equipment61.setState(equipmentState69);
        equipment36.setState(equipmentState69);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(labManager57);
        org.junit.Assert.assertNotNull(equipmentState69);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2512");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        faculty3.setActive(true);
        java.lang.String str12 = faculty3.getRole();
        java.lang.String str13 = faculty3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2513");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "INACTIVE", reservation16);
        java.lang.String str18 = equipment3.toString();
        equipment3.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment3.attach(equipmentObserver25);
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment3.detach(equipmentObserver27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2514");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = headLabCoordinator3.toString();
// flaky "4) test2514(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c6cccca0-8adc-406b-a117-45bcf62acaa3, email='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=c6cccca0-8adc-406b-a117-45bcf62acaa3, email='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2515");
        model.Student student3 = new model.Student("LabManager", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Researcher");
        student3.setIdOrCertNumber("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2516");
        model.Student student3 = new model.Student("Researcher", "Available", "HeadLabCoordinator");
        student3.setEmail("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2517");
        model.Guest guest3 = new model.Guest("Faculty", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        boolean boolean5 = guest3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2518");
        model.LabManager labManager3 = new model.LabManager("User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LM-CERT");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2519");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        labManager5.setPasswordHash("Guest");
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.lang.String str13 = equipment12.getDescription();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment12.isModifyAvailable(localDateTime14, localDateTime15, "hi!", reservation17);
        java.lang.String str19 = equipment12.getEquipmentId();
        equipment12.setStatus("");
        java.lang.String str22 = equipment12.getEquipmentId();
        java.lang.String str23 = equipment12.getEquipmentId();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment12.detach(equipmentObserver24);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment12.isModifyAvailable(localDateTime26, localDateTime27, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation29);
        java.lang.String str31 = equipment12.getDescription();
        labManager5.setEquipmentStatus(equipment12, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str40 = headLabCoordinator37.getRole();
        model.LabManager labManager42 = headLabCoordinator37.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager42.setEmail("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator48 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager50 = headLabCoordinator48.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment54 = new model.Equipment("", "", "");
        labManager50.addEquipment(equipment54);
        equipment54.setLabLocation("");
        java.lang.String str58 = equipment54.getEquipmentId();
        labManager42.addEquipment(equipment54);
        labManager5.markMaintenance(equipment54);
        model.Equipment equipment64 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment64.isModifyAvailable(localDateTime65, localDateTime66, "Faculty", reservation68);
        equipment64.setLabLocation("Faculty");
        java.lang.String str72 = equipment64.getDescription();
        java.lang.String str73 = equipment64.getEquipmentId();
        equipment64.notifyObservers();
        equipment64.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        strategy.PricingStrategy pricingStrategy79 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation80 = new model.Reservation((model.User) labManager5, equipment64, localDateTime77, localDateTime78, pricingStrategy79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HeadLabCoordinator" + "'", str40, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2520");
        model.LabManager labManager3 = new model.LabManager("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.lang.String str4 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2521");
        model.Equipment equipment3 = new model.Equipment("User{userId=7f202e65-5038-4bf8-b4ca-fade3879140d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2522");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getPasswordHash();
        java.lang.String str12 = researcher3.getRole();
        double double13 = researcher3.getHourlyRate();
        java.lang.String str14 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "5) test2522(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID7.toString(), "528b8735-5354-4f16-92a2-434f3ed7e9ba");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2523");
        model.Faculty faculty3 = new model.Faculty("User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=12314481-f96e-4666-8de9-0288b82ecee3, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2524");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        java.lang.String str16 = equipment13.toString();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean20 = equipment13.isAvailable(localDateTime17, localDateTime18, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment13.getLabLocation();
        equipment13.disable();
        equipment13.setLabLocation("User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment13.isModifyAvailable(localDateTime25, localDateTime26, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", reservation28);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2525");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.getRole();
        model.Equipment equipment13 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment13.markMaintenance();
        labManager8.addEquipment(equipment13);
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment25.isModifyAvailable(localDateTime26, localDateTime27, "Faculty", reservation29);
        equipment25.setLabLocation("Faculty");
        labManager21.setEquipmentStatus(equipment25, "");
        java.lang.String str35 = equipment25.getLabLocation();
        equipment25.notifyObservers();
        java.lang.String str37 = equipment25.getLabLocation();
        labManager8.setEquipmentStatus(equipment25, "Disabled");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment43.isModifyAvailable(localDateTime44, localDateTime45, "Faculty", reservation47);
        equipment43.setLabLocation("Faculty");
        java.lang.String str51 = equipment43.getDescription();
        java.lang.String str52 = equipment43.getEquipmentId();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment43.isModifyAvailable(localDateTime53, localDateTime54, "INACTIVE", reservation56);
        java.lang.String str58 = equipment43.getEquipmentId();
        labManager8.setEquipmentStatus(equipment43, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Faculty faculty64 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str65 = faculty64.getEmail();
        java.lang.String str66 = faculty64.getRole();
        java.util.UUID uUID67 = faculty64.getUserId();
        labManager8.setUserId(uUID67);
        model.Equipment equipment72 = new model.Equipment("", "", "");
        java.lang.String str73 = equipment72.getDescription();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment72.isModifyAvailable(localDateTime74, localDateTime75, "hi!", reservation77);
        equipment72.disable();
        equipment72.enable();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        boolean boolean84 = equipment72.isAvailable(localDateTime81, localDateTime82, "");
        state.EquipmentState equipmentState85 = equipment72.getCurrentState();
        equipment72.notifyObservers();
        observer.EquipmentObserver equipmentObserver87 = null;
        equipment72.attach(equipmentObserver87);
        labManager8.addEquipment(equipment72);
        java.lang.String str90 = labManager8.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Faculty" + "'", str66, "Faculty");
        org.junit.Assert.assertNotNull(uUID67);
// flaky "6) test2525(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID67.toString(), "cad80c32-5ab6-4e24-88bb-2cdf66434787");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(equipmentState85);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "LabManager" + "'", str90, "LabManager");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2526");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        java.lang.String str5 = headLabCoordinator3.getPasswordHash();
        java.lang.String str6 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2527");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean19 = labManager18.isActive();
        double double20 = labManager18.getHourlyRate();
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment24.isModifyAvailable(localDateTime32, localDateTime33, "", reservation35);
        labManager18.addEquipment(equipment24);
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment41.isModifyAvailable(localDateTime43, localDateTime44, "hi!", reservation46);
        java.lang.String str48 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean52 = equipment41.isAvailable(localDateTime49, localDateTime50, "Faculty");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        java.lang.String str63 = equipment56.getDescription();
        state.EquipmentState equipmentState64 = equipment56.getCurrentState();
        equipment41.setState(equipmentState64);
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        boolean boolean69 = equipment41.isAvailable(localDateTime66, localDateTime67, "Faculty");
        java.lang.String str70 = equipment41.getDescription();
        state.EquipmentState equipmentState71 = equipment41.getCurrentState();
        equipment24.setState(equipmentState71);
        labManager5.setEquipmentStatus(equipment24, "HeadLabCoordinator");
        java.lang.Class<?> wildcardClass75 = equipment24.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(equipmentState71);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2528");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2529");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.lang.String str19 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "hi!", reservation23);
        java.lang.String str25 = equipment18.getDescription();
        state.EquipmentState equipmentState26 = equipment18.getCurrentState();
        equipment18.setLabLocation("Student");
        labManager14.setEquipmentStatus(equipment18, "");
        model.HeadLabCoordinator headLabCoordinator34 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager36 = headLabCoordinator34.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        labManager36.markMaintenance(equipment40);
        java.lang.String str42 = labManager36.getRole();
        java.lang.String str43 = labManager36.getRole();
        model.HeadLabCoordinator headLabCoordinator47 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager49 = headLabCoordinator47.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        labManager49.markMaintenance(equipment53);
        double double55 = labManager49.getHourlyRate();
        java.lang.String str56 = labManager49.getRole();
        double double57 = labManager49.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator61 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager63 = headLabCoordinator61.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment67 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        model.Reservation reservation71 = null;
        boolean boolean72 = equipment67.isModifyAvailable(localDateTime68, localDateTime69, "Faculty", reservation71);
        equipment67.setLabLocation("Faculty");
        labManager63.setEquipmentStatus(equipment67, "");
        equipment67.notifyObservers();
        labManager49.addEquipment(equipment67);
        labManager36.setEquipmentStatus(equipment67, "Guest");
        equipment67.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        state.EquipmentState equipmentState83 = equipment67.getCurrentState();
        equipment18.setState(equipmentState83);
        labManager8.markMaintenance(equipment18);
        java.lang.String str86 = equipment18.getStatus();
        java.lang.Class<?> wildcardClass87 = equipment18.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LabManager" + "'", str42, "LabManager");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "LabManager" + "'", str43, "LabManager");
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "LabManager" + "'", str56, "LabManager");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(labManager63);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(equipmentState83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Maintenance" + "'", str86, "Maintenance");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2530");
        model.Faculty faculty3 = new model.Faculty("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ec0deee8-7bc2-4708-b44e-d2d061b51121, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2531");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setStatus("");
        equipment3.notifyObservers();
        java.lang.String str14 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status=''}" + "'", str14, "Equipment{equipmentId='', description='', labLocation='', status=''}");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2532");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setEmail("Faculty");
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2533");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "INACTIVE", reservation16);
        state.EquipmentState equipmentState18 = equipment3.getCurrentState();
        model.Equipment equipment22 = new model.Equipment("", "", "");
        equipment22.enable();
        equipment22.enable();
        java.lang.String str25 = equipment22.getStatus();
        java.lang.String str26 = equipment22.getStatus();
        java.lang.String str27 = equipment22.getDescription();
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment31.isModifyAvailable(localDateTime33, localDateTime34, "hi!", reservation36);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment31.isModifyAvailable(localDateTime38, localDateTime39, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation41);
        java.lang.String str43 = equipment31.toString();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment31.isAvailable(localDateTime44, localDateTime45, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState48 = equipment31.getCurrentState();
        equipment22.setState(equipmentState48);
        equipment3.setState(equipmentState48);
        equipment3.disable();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean55 = equipment3.isAvailable(localDateTime52, localDateTime53, "User{userId=43d45941-45ea-42c1-9f67-2e88448539f4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(equipmentState18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str43, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(equipmentState48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2534");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setEmail("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2535");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        double double14 = headLabCoordinator3.getHourlyRate();
        java.lang.String str15 = headLabCoordinator3.getRole();
        java.lang.String str16 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2536");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation16);
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        labManager25.setEquipmentStatus(equipment29, "Guest");
        equipment29.setLabLocation("User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState41 = equipment29.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(equipmentState41);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2537");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        java.lang.String str11 = equipment3.getEquipmentId();
        java.lang.String str12 = equipment3.getDescription();
        equipment3.setLabLocation("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2538");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        labManager13.setEquipmentStatus(equipment17, "");
        java.lang.String str27 = equipment17.toString();
        java.lang.String str28 = equipment17.getDescription();
        labManager5.addEquipment(equipment17);
        equipment17.setDescription("User{userId=e4cdb642-10d9-49aa-b004-30e3cd17cd5c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2539");
        model.Faculty faculty3 = new model.Faculty("User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "User{userId=f2bee4ca-dd08-485d-ba00-a3959ad39bbc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2540");
        model.Guest guest3 = new model.Guest("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        guest3.setActive(false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2541");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        model.Equipment equipment12 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment12.notifyObservers();
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment12.attach(equipmentObserver14);
        java.lang.String str16 = equipment12.getDescription();
        labManager5.addEquipment(equipment12);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str16, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2542");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        java.lang.String str16 = labManager9.getRole();
        java.lang.String str17 = labManager9.getEmail();
        double double18 = labManager9.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str23 = headLabCoordinator22.getRole();
        headLabCoordinator22.setEmail("Researcher");
        model.LabManager labManager27 = headLabCoordinator22.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager33.addEquipment(equipment37);
        labManager27.setEquipmentStatus(equipment37, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment37.markMaintenance();
        equipment37.enable();
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment37.detach(equipmentObserver43);
        labManager9.markMaintenance(equipment37);
        equipment37.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ACTIVE" + "'", str17, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HeadLabCoordinator" + "'", str23, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager33);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2543");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        headLabCoordinator3.setEmail("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str16 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str16, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2544");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2545");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2546");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        labManager8.setEquipmentStatus(equipment18, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager27 = headLabCoordinator25.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID28 = null;
        headLabCoordinator25.setUserId(uUID28);
        model.LabManager labManager31 = headLabCoordinator25.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager33 = headLabCoordinator25.autoGenerateManagerAccount("Guest");
        java.lang.String str34 = labManager33.toString();
        model.Equipment equipment38 = new model.Equipment("", "", "");
        java.lang.String str39 = equipment38.getDescription();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment38.isModifyAvailable(localDateTime40, localDateTime41, "hi!", reservation43);
        equipment38.disable();
        equipment38.enable();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean50 = equipment38.isAvailable(localDateTime47, localDateTime48, "");
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        labManager56.addEquipment(equipment60);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        java.lang.String str66 = equipment65.getDescription();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment65.isModifyAvailable(localDateTime67, localDateTime68, "hi!", reservation70);
        java.lang.String str72 = equipment65.getEquipmentId();
        equipment65.setStatus("");
        state.EquipmentState equipmentState75 = equipment65.getCurrentState();
        equipment60.setState(equipmentState75);
        equipment38.setState(equipmentState75);
        labManager33.markMaintenance(equipment38);
        java.lang.String str79 = equipment38.getEquipmentId();
        labManager8.setEquipmentStatus(equipment38, "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager8.setEmail("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager33);
// flaky "7) test2546(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "User{userId=3266a39d-bde4-44be-af89-8ac2f31c15ab, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str34, "User{userId=3266a39d-bde4-44be-af89-8ac2f31c15ab, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(equipmentState75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2547");
        model.Researcher researcher3 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.lang.String str4 = researcher3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "Faculty", reservation18);
        equipment14.setLabLocation("Faculty");
        labManager10.setEquipmentStatus(equipment14, "Guest");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        labManager10.addEquipment(equipment27);
        boolean boolean29 = labManager10.isActive();
        java.lang.String str30 = labManager10.getIdOrCertNumber();
        model.Faculty faculty34 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str35 = faculty34.getRole();
        faculty34.setIdOrCertNumber("");
        java.lang.String str38 = faculty34.getIdOrCertNumber();
        java.lang.String str39 = faculty34.getRole();
        java.lang.String str40 = faculty34.getPasswordHash();
        double double41 = faculty34.getHourlyRate();
        java.util.UUID uUID42 = faculty34.getUserId();
        labManager10.setUserId(uUID42);
        researcher3.setUserId(uUID42);
        java.lang.String str45 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LM-CERT" + "'", str30, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertNotNull(uUID42);
// flaky "8) test2547(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID42.toString(), "be0e323a-a806-4760-8bf9-243ed51af49b");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Researcher" + "'", str45, "Researcher");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2548");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = guest3.getPasswordHash();
        java.lang.Class<?> wildcardClass5 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2549");
        model.Student student3 = new model.Student("", "User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        java.lang.String str4 = student3.toString();
// flaky "9) test2549(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=99a8ca33-e50f-4503-8911-c2770f4db9c4, email='', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Student'}" + "'", str4, "User{userId=99a8ca33-e50f-4503-8911-c2770f4db9c4, email='', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Student'}");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2550");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        labManager5.setEquipmentStatus(equipment27, "Guest");
        java.lang.String str36 = equipment27.getLabLocation();
        equipment27.markMaintenance();
        equipment27.enable();
        equipment27.enable();
        java.lang.String str40 = equipment27.getLabLocation();
        java.lang.String str41 = equipment27.getStatus();
        java.lang.String str42 = equipment27.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Available" + "'", str41, "Available");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2551");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getDescription();
        equipment3.notifyObservers();
        equipment3.enable();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean13 = equipment3.isAvailable(localDateTime10, localDateTime11, "Guest");
        java.lang.String str14 = equipment3.toString();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}" + "'", str14, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2552");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2553");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        boolean boolean24 = labManager5.isActive();
        labManager5.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment30.isModifyAvailable(localDateTime37, localDateTime38, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation40);
        java.lang.String str42 = equipment30.toString();
        labManager5.addEquipment(equipment30);
        java.lang.String str44 = labManager5.getPasswordHash();
        java.lang.String str45 = labManager5.getPasswordHash();
        java.lang.String str46 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Temp123!" + "'", str44, "Temp123!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Temp123!" + "'", str45, "Temp123!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ACTIVE" + "'", str46, "ACTIVE");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2554");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation16);
        model.SensorUpdate sensorUpdate18 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2555");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setEmail("");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        java.lang.String str8 = labManager7.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LM-CERT" + "'", str8, "LM-CERT");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2556");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.getRole();
        model.Equipment equipment13 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment13.markMaintenance();
        labManager8.addEquipment(equipment13);
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment25.isModifyAvailable(localDateTime26, localDateTime27, "Faculty", reservation29);
        equipment25.setLabLocation("Faculty");
        labManager21.setEquipmentStatus(equipment25, "");
        java.lang.String str35 = equipment25.getLabLocation();
        equipment25.notifyObservers();
        java.lang.String str37 = equipment25.getLabLocation();
        labManager8.setEquipmentStatus(equipment25, "Disabled");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment43.isModifyAvailable(localDateTime44, localDateTime45, "Faculty", reservation47);
        equipment43.setLabLocation("Faculty");
        java.lang.String str51 = equipment43.getDescription();
        java.lang.String str52 = equipment43.getEquipmentId();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment43.isModifyAvailable(localDateTime53, localDateTime54, "INACTIVE", reservation56);
        java.lang.String str58 = equipment43.getEquipmentId();
        labManager8.setEquipmentStatus(equipment43, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Faculty faculty64 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str65 = faculty64.getEmail();
        java.lang.String str66 = faculty64.getRole();
        java.util.UUID uUID67 = faculty64.getUserId();
        labManager8.setUserId(uUID67);
        model.Equipment equipment72 = new model.Equipment("", "", "");
        java.lang.String str73 = equipment72.getDescription();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment72.isModifyAvailable(localDateTime74, localDateTime75, "hi!", reservation77);
        equipment72.markMaintenance();
        equipment72.setLabLocation("HeadLabCoordinator");
        java.lang.String str82 = equipment72.getDescription();
        labManager8.setEquipmentStatus(equipment72, "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str85 = labManager8.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Faculty" + "'", str66, "Faculty");
        org.junit.Assert.assertNotNull(uUID67);
// flaky "10) test2556(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID67.toString(), "a69e78d6-1205-4f69-bafa-cc1ae2462a45");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "LM-CERT" + "'", str85, "LM-CERT");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2557");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getPasswordHash();
        java.util.UUID uUID9 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "11) test2557(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "138537ab-2782-4bc3-8a97-99aa1553aa4c");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2558");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        student3.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2559");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        researcher3.setIdOrCertNumber("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str8 = researcher3.getRole();
        java.lang.String str9 = researcher3.toString();
        java.lang.Class<?> wildcardClass10 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
// flaky "12) test2559(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=ee5fd7dd-6809-40a3-b93c-b75c97a80800, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}" + "'", str9, "User{userId=ee5fd7dd-6809-40a3-b93c-b75c97a80800, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2560");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "13) test2560(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "74639b42-b7f5-4247-a515-bbba276cf4d8");
// flaky "1) test2560(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=74639b42-b7f5-4247-a515-bbba276cf4d8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=74639b42-b7f5-4247-a515-bbba276cf4d8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2561");
        model.LabManager labManager3 = new model.LabManager("User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "HeadLabCoordinator", "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getIdOrCertNumber();
        java.lang.String str5 = labManager3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2562");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.toString();
        java.lang.String str5 = labManager3.getRole();
        java.lang.String str6 = labManager3.getEmail();
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        labManager12.addEquipment(equipment16);
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.lang.String str22 = equipment21.getDescription();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment21.isModifyAvailable(localDateTime23, localDateTime24, "hi!", reservation26);
        java.lang.String str28 = equipment21.getDescription();
        equipment21.setStatus("Researcher");
        labManager12.addEquipment(equipment21);
        double double32 = labManager12.getHourlyRate();
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        java.lang.String str44 = equipment36.getDescription();
        java.lang.String str45 = equipment36.getEquipmentId();
        equipment36.notifyObservers();
        equipment36.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment36.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str51 = equipment36.getDescription();
        observer.EquipmentObserver equipmentObserver52 = null;
        equipment36.detach(equipmentObserver52);
        labManager12.addEquipment(equipment36);
        state.EquipmentState equipmentState55 = equipment36.getCurrentState();
        observer.EquipmentObserver equipmentObserver56 = null;
        equipment36.detach(equipmentObserver56);
        equipment36.setStatus("User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str60 = equipment36.getStatus();
        labManager3.markMaintenance(equipment36);
// flaky "14) test2562(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=629f7fbb-f5fc-468d-9577-c8df2a23b443, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=629f7fbb-f5fc-468d-9577-c8df2a23b443, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str51, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str60, "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2563");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("");
        double double12 = headLabCoordinator3.getHourlyRate();
        java.lang.String str13 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2564");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        java.lang.String str15 = equipment3.getStatus();
        equipment3.setLabLocation("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        java.lang.String str18 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2565");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.util.UUID uUID9 = headLabCoordinator3.getUserId();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "15) test2565(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "67eb4d0d-2d66-4ec8-90b2-9b836879d273");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2566");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double4 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setPasswordHash("User{userId=efa030bc-fac4-447a-ba4b-a90dab22147d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2567");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        java.lang.String str21 = equipment3.getEquipmentId();
        java.lang.String str22 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment3.attach(equipmentObserver23);
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment3.attach(equipmentObserver25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str22, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2568");
        model.LabManager labManager3 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        labManager9.markMaintenance(equipment13);
        java.lang.String str15 = labManager9.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment25.isModifyAvailable(localDateTime26, localDateTime27, "Faculty", reservation29);
        equipment25.setLabLocation("Faculty");
        labManager21.setEquipmentStatus(equipment25, "");
        equipment25.notifyObservers();
        labManager9.markMaintenance(equipment25);
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        java.lang.String str47 = equipment40.getEquipmentId();
        java.lang.String str48 = equipment40.getLabLocation();
        labManager9.markMaintenance(equipment40);
        model.Equipment equipment53 = new model.Equipment("", "", "");
        equipment53.enable();
        labManager9.addEquipment(equipment53);
        labManager3.markMaintenance(equipment53);
        java.lang.String str57 = labManager3.getRole();
        model.Researcher researcher61 = new model.Researcher("", "hi!", "hi!");
        researcher61.setEmail("hi!");
        java.lang.String str64 = researcher61.getRole();
        java.lang.String str65 = researcher61.getIdOrCertNumber();
        boolean boolean66 = researcher61.isActive();
        model.Student student70 = new model.Student("", "hi!", "");
        java.lang.String str71 = student70.getEmail();
        java.util.UUID uUID72 = student70.getUserId();
        researcher61.setUserId(uUID72);
        labManager3.setUserId(uUID72);
        model.Equipment equipment78 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str79 = equipment78.getLabLocation();
        observer.EquipmentObserver equipmentObserver80 = null;
        equipment78.detach(equipmentObserver80);
        observer.EquipmentObserver equipmentObserver82 = null;
        equipment78.detach(equipmentObserver82);
        labManager3.markMaintenance(equipment78);
        java.lang.String str85 = equipment78.getDescription();
        java.time.LocalDateTime localDateTime86 = null;
        java.time.LocalDateTime localDateTime87 = null;
        model.Reservation reservation89 = null;
        boolean boolean90 = equipment78.isModifyAvailable(localDateTime86, localDateTime87, "hi!", reservation89);
        observer.EquipmentObserver equipmentObserver91 = null;
        equipment78.attach(equipmentObserver91);
        // The following exception was thrown during execution in test generation
        try {
            equipment78.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LabManager" + "'", str57, "LabManager");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Researcher" + "'", str64, "Researcher");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(uUID72);
// flaky "16) test2568(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID72.toString(), "495833e1-3201-4f2b-8b3a-7ec4d09c3d52");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ACTIVE" + "'", str85, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2569");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "", reservation14);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = equipment3.isAvailable(localDateTime18, localDateTime19, "Maintenance");
        java.lang.String str22 = equipment3.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2570");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.lang.String str13 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment3.detach(equipmentObserver14);
        java.lang.String str16 = equipment3.getLabLocation();
        equipment3.setDescription("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.enable();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.detach(equipmentObserver20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2571");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        model.Equipment equipment14 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str15 = equipment14.getLabLocation();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment14.detach(equipmentObserver16);
        equipment14.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment14.getLabLocation();
        java.lang.String str21 = equipment14.toString();
        labManager5.setEquipmentStatus(equipment14, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str24 = equipment14.getEquipmentId();
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment14.attach(equipmentObserver25);
        java.lang.String str27 = equipment14.toString();
        equipment14.setDescription("User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str30 = equipment14.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ACTIVE" + "'", str24, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}" + "'", str27, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}" + "'", str30, "Equipment{equipmentId='ACTIVE', description='User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2572");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty17 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str18 = faculty17.getStatus();
        boolean boolean19 = faculty17.isActive();
        model.Faculty faculty23 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID24 = faculty23.getUserId();
        faculty17.setUserId(uUID24);
        labManager13.setUserId(uUID24);
        model.Equipment equipment30 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str31 = equipment30.toString();
        equipment30.notifyObservers();
        equipment30.setLabLocation("User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        labManager13.markMaintenance(equipment30);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ACTIVE" + "'", str18, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(uUID24);
// flaky "17) test2572(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID24.toString(), "32c4ccc8-382a-46fd-8ce5-cba94dcf544e");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}" + "'", str31, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2573");
        model.Guest guest3 = new model.Guest("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        guest3.setEmail("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2574");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getStatus();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        equipment3.enable();
        equipment3.notifyObservers();
        state.EquipmentState equipmentState8 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(equipmentState5);
        org.junit.Assert.assertNotNull(equipmentState8);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2575");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getPasswordHash();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double13 = headLabCoordinator12.getHourlyRate();
        java.lang.String str14 = headLabCoordinator12.getRole();
        java.lang.String str15 = headLabCoordinator12.getRole();
        model.LabManager labManager17 = headLabCoordinator12.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double18 = labManager17.getHourlyRate();
        model.Student student22 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Faculty faculty26 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID27 = faculty26.getUserId();
        java.lang.String str28 = faculty26.toString();
        java.lang.String str29 = faculty26.getRole();
        java.util.UUID uUID30 = faculty26.getUserId();
        java.lang.String str31 = faculty26.getEmail();
        java.util.UUID uUID32 = faculty26.getUserId();
        student22.setUserId(uUID32);
        labManager17.setUserId(uUID32);
        headLabCoordinator3.setUserId(uUID32);
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID42 = null;
        headLabCoordinator39.setUserId(uUID42);
        model.LabManager labManager45 = headLabCoordinator39.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        equipment49.enable();
        labManager45.addEquipment(equipment49);
        equipment49.disable();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        strategy.PricingStrategy pricingStrategy55 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation56 = new model.Reservation((model.User) headLabCoordinator3, equipment49, localDateTime53, localDateTime54, pricingStrategy55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(uUID27);
// flaky "18) test2575(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID27.toString(), "c3bedef3-55fd-41a4-a1bb-46957f3fb476");
// flaky "2) test2575(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "User{userId=c3bedef3-55fd-41a4-a1bb-46957f3fb476, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str28, "User{userId=c3bedef3-55fd-41a4-a1bb-46957f3fb476, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
        org.junit.Assert.assertNotNull(uUID30);
// flaky "1) test2575(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID30.toString(), "c3bedef3-55fd-41a4-a1bb-46957f3fb476");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(uUID32);
// flaky "1) test2575(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID32.toString(), "c3bedef3-55fd-41a4-a1bb-46957f3fb476");
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertNotNull(labManager45);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2576");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        boolean boolean6 = faculty3.isActive();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2577");
        model.Faculty faculty3 = new model.Faculty("User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2578");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        java.util.UUID uUID11 = labManager5.getUserId();
        java.lang.String str12 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "19) test2578(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "d589fcf2-0cd0-4746-b914-4689f728ff82");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2579");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        java.lang.String str10 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2580");
        model.Guest guest3 = new model.Guest("User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2581");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getIdOrCertNumber();
        double double8 = guest3.getHourlyRate();
        guest3.setIdOrCertNumber("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2582");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment12.isModifyAvailable(localDateTime13, localDateTime14, "Faculty", reservation16);
        equipment12.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment12.isModifyAvailable(localDateTime20, localDateTime21, "", reservation23);
        labManager5.markMaintenance(equipment12);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment12.isModifyAvailable(localDateTime26, localDateTime27, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation29);
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment12.detach(equipmentObserver31);
        equipment12.markMaintenance();
        java.lang.String str34 = equipment12.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2583");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        java.lang.String str5 = headLabCoordinator3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
// flaky "20) test2583(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=0748f4eb-c687-4292-9a20-44a804e1827c, email='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='HeadLabCoordinator'}" + "'", str5, "User{userId=0748f4eb-c687-4292-9a20-44a804e1827c, email='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2584");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        model.Equipment equipment10 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str11 = equipment10.getLabLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "Student", reservation15);
        java.lang.String str17 = equipment10.getStatus();
        equipment10.disable();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment10.isAvailable(localDateTime19, localDateTime20, "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        strategy.PricingStrategy pricingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation26 = new model.Reservation((model.User) researcher3, equipment10, localDateTime23, localDateTime24, pricingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2585");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        labManager5.setEmail("LM-CERT");
        model.Equipment equipment14 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str15 = equipment14.getStatus();
        equipment14.markMaintenance();
        labManager5.addEquipment(equipment14);
        java.lang.String str18 = equipment14.getStatus();
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment14.attach(equipmentObserver19);
        java.lang.String str21 = equipment14.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Maintenance" + "'", str18, "Maintenance");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Maintenance'}" + "'", str21, "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Maintenance'}");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2586");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}', labLocation='', status='Disabled'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        researcher3.setActive(true);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2587");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        labManager5.setUserId(uUID6);
        labManager5.setIdOrCertNumber("Available");
        java.lang.String str10 = labManager5.getRole();
        model.Equipment equipment14 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", reservation18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean23 = equipment14.isAvailable(localDateTime20, localDateTime21, "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager5.setEquipmentStatus(equipment14, "User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        double double26 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2588");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean14 = equipment3.isAvailable(localDateTime11, localDateTime12, "Faculty");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "Researcher", reservation18);
        equipment3.setLabLocation("Student");
        equipment3.setDescription("User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment3.attach(equipmentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2589");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.Guest guest7 = new model.Guest("Guest", "", "Researcher");
        double double8 = guest7.getHourlyRate();
        java.util.UUID uUID9 = guest7.getUserId();
        headLabCoordinator3.setUserId(uUID9);
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str13 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "21) test2589(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "efa1f70f-8e40-4bbb-bdfd-75b85a84fc11");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2590");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("");
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setPasswordHash("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "22) test2590(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2591");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        java.lang.String str5 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("HeadLabCoordinator");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        java.lang.String str25 = equipment17.getEquipmentId();
        labManager13.markMaintenance(equipment17);
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment17.attach(equipmentObserver27);
        // The following exception was thrown during execution in test generation
        try {
            labManager7.markMaintenance(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2592");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.attach(equipmentObserver12);
        java.lang.String str14 = equipment3.getEquipmentId();
        java.lang.String str15 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment3.isAvailable(localDateTime16, localDateTime17, "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.setLabLocation("User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2593");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=11ff8a89-7998-42ec-8171-2ac3d64b4624, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2594");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment22.isModifyAvailable(localDateTime25, localDateTime26, "Temp123!", reservation28);
        equipment22.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment22.enable();
        equipment22.setLabLocation("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2595");
        model.Guest guest3 = new model.Guest("User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=2d4255cd-ee33-490e-a7b6-43f4f624113d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=013c1752-e417-49a0-809c-87122bf6dfd2, email='User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2596");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setEmail("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str12 = guest3.getIdOrCertNumber();
        boolean boolean13 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2597");
        model.Guest guest3 = new model.Guest("User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        guest3.setEmail("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2598");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getStatus();
        java.lang.String str12 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2599");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        boolean boolean8 = researcher3.isActive();
        model.Student student12 = new model.Student("", "hi!", "");
        java.lang.String str13 = student12.getEmail();
        java.util.UUID uUID14 = student12.getUserId();
        researcher3.setUserId(uUID14);
        java.lang.String str16 = researcher3.getRole();
        double double17 = researcher3.getHourlyRate();
        java.lang.String str18 = researcher3.getIdOrCertNumber();
        double double19 = researcher3.getHourlyRate();
        researcher3.setPasswordHash("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double22 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "23) test2599(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID14.toString(), "b1a5e7fb-0e9c-447b-931c-9b9c98b99873");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2600");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment19.isAvailable(localDateTime32, localDateTime33, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.lang.String str40 = equipment39.getDescription();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment39.isModifyAvailable(localDateTime41, localDateTime42, "hi!", reservation44);
        java.lang.String str46 = equipment39.getEquipmentId();
        equipment39.setStatus("");
        state.EquipmentState equipmentState49 = equipment39.getCurrentState();
        equipment19.setState(equipmentState49);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        boolean boolean54 = equipment19.isAvailable(localDateTime51, localDateTime52, "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2601");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        equipment3.notifyObservers();
        model.SensorUpdate sensorUpdate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentState4);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2602");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        java.lang.String str4 = researcher3.getRole();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        researcher3.setIdOrCertNumber("LM-CERT");
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2603");
        model.Student student3 = new model.Student("User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        java.lang.String str4 = student3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        labManager10.markMaintenance(equipment14);
        java.lang.String str16 = labManager10.getRole();
        java.lang.String str17 = labManager10.getRole();
        java.lang.String str18 = labManager10.getRole();
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID25 = null;
        headLabCoordinator22.setUserId(uUID25);
        model.LabManager labManager28 = headLabCoordinator22.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment32 = new model.Equipment("", "", "");
        equipment32.enable();
        labManager28.addEquipment(equipment32);
        equipment32.disable();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment32.detach(equipmentObserver36);
        equipment32.enable();
        labManager10.setEquipmentStatus(equipment32, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        strategy.PricingStrategy pricingStrategy43 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation44 = new model.Reservation((model.User) student3, equipment32, localDateTime41, localDateTime42, pricingStrategy43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LabManager" + "'", str17, "LabManager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertNotNull(labManager28);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2604");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', labLocation='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}", "User{userId=d9b4b0c6-0da3-4b3d-9dc0-787d1f5e5628, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2605");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getEmail();
        java.util.UUID uUID7 = student3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "24) test2605(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID7.toString(), "92026046-7645-41b6-895d-8de735f0118f");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2606");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getIdOrCertNumber();
        double double8 = guest3.getHourlyRate();
        guest3.setEmail("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2607");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation14);
        java.lang.String str16 = equipment3.toString();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2608");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "User{userId=03d04727-c0b8-41f6-8c22-90315f144551, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean4 = guest3.isActive();
        guest3.setPasswordHash("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2609");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        labManager5.setPasswordHash("Guest");
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.lang.String str13 = equipment12.getDescription();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment12.isModifyAvailable(localDateTime14, localDateTime15, "hi!", reservation17);
        java.lang.String str19 = equipment12.getEquipmentId();
        equipment12.setStatus("");
        java.lang.String str22 = equipment12.getEquipmentId();
        java.lang.String str23 = equipment12.getEquipmentId();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment12.detach(equipmentObserver24);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment12.isModifyAvailable(localDateTime26, localDateTime27, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation29);
        java.lang.String str31 = equipment12.getDescription();
        labManager5.setEquipmentStatus(equipment12, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str40 = headLabCoordinator37.getRole();
        model.LabManager labManager42 = headLabCoordinator37.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager42.setEmail("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator48 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager50 = headLabCoordinator48.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment54 = new model.Equipment("", "", "");
        labManager50.addEquipment(equipment54);
        equipment54.setLabLocation("");
        java.lang.String str58 = equipment54.getEquipmentId();
        labManager42.addEquipment(equipment54);
        labManager5.markMaintenance(equipment54);
        model.Equipment equipment64 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment64.isModifyAvailable(localDateTime65, localDateTime66, "Faculty", reservation68);
        equipment64.setLabLocation("Faculty");
        java.lang.String str72 = equipment64.getDescription();
        java.lang.String str73 = equipment64.getEquipmentId();
        equipment64.notifyObservers();
        equipment64.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment64.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str79 = equipment64.getDescription();
        observer.EquipmentObserver equipmentObserver80 = null;
        equipment64.detach(equipmentObserver80);
        java.lang.String str82 = equipment64.getEquipmentId();
        java.lang.String str83 = equipment64.getEquipmentId();
        equipment64.setStatus("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        labManager5.addEquipment(equipment64);
        equipment64.setDescription("User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HeadLabCoordinator" + "'", str40, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str79, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2610");
        model.LabManager labManager3 = new model.LabManager("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setStatus("");
        java.lang.String str17 = equipment7.getStatus();
        labManager3.addEquipment(equipment7);
        labManager3.setIdOrCertNumber("User{userId=d473dca8-1d6b-4ed6-bea4-83139eaef698, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment24.isModifyAvailable(localDateTime32, localDateTime33, "", reservation35);
        observer.EquipmentObserver equipmentObserver37 = null;
        equipment24.attach(equipmentObserver37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean42 = equipment24.isAvailable(localDateTime39, localDateTime40, "Maintenance");
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2611");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getPasswordHash();
        java.lang.String str10 = guest3.getPasswordHash();
        guest3.setEmail("LM-CERT");
        java.lang.String str13 = guest3.getStatus();
        guest3.setPasswordHash("");
        java.lang.String str16 = guest3.getRole();
        java.lang.String str17 = guest3.toString();
        double double18 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
// flaky "25) test2611(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str17, "User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 25.0d + "'", double18 == 25.0d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2612");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.getPasswordHash();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2613");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        double double15 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        labManager21.setPasswordHash("");
        double double24 = labManager21.getHourlyRate();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        java.lang.String str36 = equipment28.getDescription();
        java.lang.String str37 = equipment28.getEquipmentId();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment28.isModifyAvailable(localDateTime38, localDateTime39, "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation41);
        labManager21.setEquipmentStatus(equipment28, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Researcher researcher48 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "LM-CERT", "hi!");
        model.Guest guest52 = new model.Guest("", "hi!", "hi!");
        java.lang.String str53 = guest52.getRole();
        double double54 = guest52.getHourlyRate();
        java.util.UUID uUID55 = guest52.getUserId();
        researcher48.setUserId(uUID55);
        labManager21.setUserId(uUID55);
        labManager5.setUserId(uUID55);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Guest" + "'", str53, "Guest");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 25.0d + "'", double54 == 25.0d);
        org.junit.Assert.assertNotNull(uUID55);
// flaky "26) test2613(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID55.toString(), "f417ae06-df2c-47c8-a2b8-a68e17f97cb0");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2614");
        model.Faculty faculty3 = new model.Faculty("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!", "User{userId=12314481-f96e-4666-8de9-0288b82ecee3, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2615");
        model.Faculty faculty3 = new model.Faculty("User{userId=164f5fb5-b442-464a-a5af-09c0e9a37d7c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2616");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "INACTIVE", reservation16);
        java.lang.String str18 = equipment3.toString();
        equipment3.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment3.getStatus();
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Available" + "'", str21, "Available");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2617");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        labManager5.setEmail("LM-CERT");
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment16.isModifyAvailable(localDateTime17, localDateTime18, "Faculty", reservation20);
        equipment16.setLabLocation("Faculty");
        java.lang.String str24 = equipment16.getDescription();
        java.lang.String str25 = equipment16.getEquipmentId();
        labManager5.markMaintenance(equipment16);
        java.lang.String str27 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2618");
        model.Student student3 = new model.Student("User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2619");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double6 = labManager5.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        equipment10.notifyObservers();
        labManager5.addEquipment(equipment10);
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        equipment25.enable();
        java.lang.String str28 = equipment25.getStatus();
        java.lang.String str29 = equipment25.getStatus();
        java.lang.String str30 = equipment25.getDescription();
        equipment25.disable();
        model.HeadLabCoordinator headLabCoordinator35 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager37 = headLabCoordinator35.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment41.isModifyAvailable(localDateTime42, localDateTime43, "Faculty", reservation45);
        equipment41.setLabLocation("Faculty");
        labManager37.setEquipmentStatus(equipment41, "");
        equipment41.setDescription("");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment56.isModifyAvailable(localDateTime57, localDateTime58, "Faculty", reservation60);
        equipment56.setLabLocation("Faculty");
        equipment56.notifyObservers();
        observer.EquipmentObserver equipmentObserver65 = null;
        equipment56.attach(equipmentObserver65);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment56.isModifyAvailable(localDateTime67, localDateTime68, "Faculty", reservation70);
        state.EquipmentState equipmentState72 = equipment56.getCurrentState();
        equipment41.setState(equipmentState72);
        equipment25.setState(equipmentState72);
        equipment10.setState(equipmentState72);
        java.lang.String str76 = equipment10.getEquipmentId();
        equipment10.enable();
        equipment10.disable();
        state.EquipmentState equipmentState79 = equipment10.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Available" + "'", str29, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(labManager37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(equipmentState72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(equipmentState79);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2620");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        java.lang.String str13 = headLabCoordinator3.getRole();
        java.lang.String str14 = headLabCoordinator3.getRole();
        double double15 = headLabCoordinator3.getHourlyRate();
        java.lang.String str16 = headLabCoordinator3.getPasswordHash();
        java.lang.String str17 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager19 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str20 = labManager19.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str20, "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2621");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        java.lang.String str14 = labManager13.getRole();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        labManager20.markMaintenance(equipment24);
        java.lang.String str26 = labManager20.getRole();
        java.lang.String str27 = labManager20.getRole();
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager33.markMaintenance(equipment37);
        double double39 = labManager33.getHourlyRate();
        java.lang.String str40 = labManager33.getRole();
        double double41 = labManager33.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator45 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager47 = headLabCoordinator45.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment51 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        model.Reservation reservation55 = null;
        boolean boolean56 = equipment51.isModifyAvailable(localDateTime52, localDateTime53, "Faculty", reservation55);
        equipment51.setLabLocation("Faculty");
        labManager47.setEquipmentStatus(equipment51, "");
        equipment51.notifyObservers();
        labManager33.addEquipment(equipment51);
        labManager20.setEquipmentStatus(equipment51, "Guest");
        model.Equipment equipment68 = new model.Equipment("", "", "");
        equipment68.enable();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        model.Reservation reservation73 = null;
        boolean boolean74 = equipment68.isModifyAvailable(localDateTime70, localDateTime71, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation73);
        equipment68.setDescription("ACTIVE");
        labManager20.setEquipmentStatus(equipment68, "Researcher");
        labManager13.addEquipment(equipment68);
        equipment68.enable();
        observer.EquipmentObserver equipmentObserver81 = null;
        equipment68.attach(equipmentObserver81);
        observer.EquipmentObserver equipmentObserver83 = null;
        equipment68.attach(equipmentObserver83);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2622");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        labManager13.setEquipmentStatus(equipment17, "");
        java.lang.String str27 = equipment17.toString();
        java.lang.String str28 = equipment17.getDescription();
        labManager5.addEquipment(equipment17);
        model.Equipment equipment33 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "ACTIVE");
        labManager5.markMaintenance(equipment33);
        java.lang.String str35 = equipment33.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}" + "'", str35, "Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2623");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        researcher3.setIdOrCertNumber("User{userId=d607e3b3-dd2e-44bc-8828-df14db97ac31, email='User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='INACTIVE', idOrCertNumber='', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2624");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "HeadLabCoordinator");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2625");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.toString();
        java.lang.String str12 = researcher3.getEmail();
        java.lang.String str13 = researcher3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
// flaky "27) test2625(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=6c28064e-3ff2-4d31-82ad-6b6d36bdf03f, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}" + "'", str11, "User{userId=6c28064e-3ff2-4d31-82ad-6b6d36bdf03f, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2626");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime5, localDateTime6, "Guest");
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.attach(equipmentObserver9);
        java.lang.String str11 = equipment3.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2627");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2628");
        model.Faculty faculty3 = new model.Faculty("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=090698b7-4713-4874-b7d9-bb772231c198, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setIdOrCertNumber("User{userId=bc4dc9e1-1ce1-4768-971e-1c5f8e37c798, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2629");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID20 = null;
        headLabCoordinator17.setUserId(uUID20);
        model.LabManager labManager23 = headLabCoordinator17.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        equipment27.enable();
        labManager23.addEquipment(equipment27);
        equipment27.disable();
        labManager13.markMaintenance(equipment27);
        model.Equipment equipment35 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        state.EquipmentState equipmentState36 = equipment35.getCurrentState();
        equipment27.setState(equipmentState36);
        java.lang.String str38 = equipment27.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(equipmentState36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str38, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2630");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        labManager5.markMaintenance(equipment17);
        java.lang.String str20 = labManager5.getRole();
        model.LabManager labManager24 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager24.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        labManager32.setEquipmentStatus(equipment36, "");
        equipment36.notifyObservers();
        labManager24.addEquipment(equipment36);
        labManager5.addEquipment(equipment36);
        equipment36.notifyObservers();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment36.isModifyAvailable(localDateTime50, localDateTime51, "User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation53);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LabManager" + "'", str20, "LabManager");
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2631");
        model.Researcher researcher3 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        boolean boolean4 = researcher3.isActive();
        double double5 = researcher3.getHourlyRate();
        researcher3.setEmail("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        researcher3.setIdOrCertNumber("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2632");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        faculty3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getRole();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str14 = headLabCoordinator11.getRole();
        model.LabManager labManager16 = headLabCoordinator11.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str17 = labManager16.getRole();
        model.Equipment equipment21 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment21.markMaintenance();
        labManager16.addEquipment(equipment21);
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment33.isModifyAvailable(localDateTime34, localDateTime35, "Faculty", reservation37);
        equipment33.setLabLocation("Faculty");
        labManager29.setEquipmentStatus(equipment33, "");
        java.lang.String str43 = equipment33.getLabLocation();
        equipment33.notifyObservers();
        java.lang.String str45 = equipment33.getLabLocation();
        labManager16.setEquipmentStatus(equipment33, "Disabled");
        equipment33.setStatus("User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        strategy.PricingStrategy pricingStrategy52 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation53 = new model.Reservation((model.User) faculty3, equipment33, localDateTime50, localDateTime51, pricingStrategy52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str6, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LabManager" + "'", str17, "LabManager");
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Faculty" + "'", str43, "Faculty");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Faculty" + "'", str45, "Faculty");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2633");
        model.Equipment equipment3 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment3.notifyObservers();
        equipment3.disable();
        equipment3.notifyObservers();
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2634");
        model.Guest guest3 = new model.Guest("User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=21941c67-eca4-48cb-a788-201493d8e754, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=21ec2b50-3736-473a-8d9d-ad02101846a9, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2635");
        model.Equipment equipment3 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment3.markMaintenance();
        model.SensorUpdate sensorUpdate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2636");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        equipment3.disable();
        equipment3.enable();
        java.lang.String str15 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2637");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        java.lang.String str20 = equipment10.getEquipmentId();
        java.lang.String str21 = equipment10.getEquipmentId();
        java.lang.String str22 = equipment10.getStatus();
        labManager6.addEquipment(equipment10);
        model.Equipment equipment27 = new model.Equipment("Disabled", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment27.disable();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        strategy.PricingStrategy pricingStrategy31 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation32 = new model.Reservation((model.User) labManager6, equipment27, localDateTime29, localDateTime30, pricingStrategy31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2638");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str6 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2639");
        model.Student student3 = new model.Student("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        student3.setEmail("User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2640");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getIdOrCertNumber();
        java.util.UUID uUID11 = guest3.getUserId();
        double double12 = guest3.getHourlyRate();
        double double13 = guest3.getHourlyRate();
        double double14 = guest3.getHourlyRate();
        java.lang.String str15 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "28) test2640(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "f8eda05c-c263-49b6-b700-17eb6bbb49e7");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2641");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getIdOrCertNumber();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2642");
        model.Guest guest3 = new model.Guest("", "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=76e32f3e-f1ee-4862-b4f7-5802c4764841, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2643");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getDescription();
        equipment23.setStatus("Researcher");
        labManager14.addEquipment(equipment23);
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        labManager39.addEquipment(equipment43);
        model.Equipment equipment48 = new model.Equipment("", "", "");
        java.lang.String str49 = equipment48.getDescription();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment48.isModifyAvailable(localDateTime50, localDateTime51, "hi!", reservation53);
        java.lang.String str55 = equipment48.getEquipmentId();
        equipment48.setStatus("");
        state.EquipmentState equipmentState58 = equipment48.getCurrentState();
        equipment43.setState(equipmentState58);
        equipment23.setState(equipmentState58);
        equipment3.setState(equipmentState58);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        boolean boolean65 = equipment3.isAvailable(localDateTime62, localDateTime63, "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str66 = equipment3.getLabLocation();
        java.lang.String str67 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(equipmentState58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}" + "'", str67, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2644");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        boolean boolean4 = student3.isActive();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2645");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getStatus();
        labManager3.setIdOrCertNumber("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double8 = labManager3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2646");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment11.isModifyAvailable(localDateTime12, localDateTime13, "Faculty", reservation15);
        equipment11.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment11.isModifyAvailable(localDateTime19, localDateTime20, "", reservation22);
        labManager5.addEquipment(equipment11);
        double double25 = labManager5.getHourlyRate();
        java.lang.String str26 = labManager5.getPasswordHash();
        double double27 = labManager5.getHourlyRate();
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment31.isModifyAvailable(localDateTime33, localDateTime34, "hi!", reservation36);
        equipment31.disable();
        equipment31.enable();
        java.lang.String str40 = equipment31.getEquipmentId();
        java.lang.String str41 = equipment31.getStatus();
        labManager5.setEquipmentStatus(equipment31, "User{userId=902105d2-35c6-47ce-b94e-ed720e6c42d9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator47 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager49 = headLabCoordinator47.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        labManager49.addEquipment(equipment53);
        model.Equipment equipment58 = new model.Equipment("", "", "");
        java.lang.String str59 = equipment58.getDescription();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment58.isModifyAvailable(localDateTime60, localDateTime61, "hi!", reservation63);
        java.lang.String str65 = equipment58.getDescription();
        equipment58.setStatus("Researcher");
        labManager49.addEquipment(equipment58);
        model.HeadLabCoordinator headLabCoordinator72 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager74 = headLabCoordinator72.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment78 = new model.Equipment("", "", "");
        labManager74.addEquipment(equipment78);
        model.Equipment equipment83 = new model.Equipment("", "", "");
        java.lang.String str84 = equipment83.getDescription();
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        model.Reservation reservation88 = null;
        boolean boolean89 = equipment83.isModifyAvailable(localDateTime85, localDateTime86, "hi!", reservation88);
        java.lang.String str90 = equipment83.getEquipmentId();
        equipment83.setStatus("");
        state.EquipmentState equipmentState93 = equipment83.getCurrentState();
        equipment78.setState(equipmentState93);
        equipment58.setState(equipmentState93);
        observer.EquipmentObserver equipmentObserver96 = null;
        equipment58.attach(equipmentObserver96);
        labManager5.setEquipmentStatus(equipment58, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Temp123!" + "'", str26, "Temp123!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Available" + "'", str41, "Available");
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(labManager74);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(equipmentState93);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2647");
        model.Researcher researcher3 = new model.Researcher("LM-CERT", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "INACTIVE");
        double double4 = researcher3.getHourlyRate();
        researcher3.setIdOrCertNumber("");
        double double7 = researcher3.getHourlyRate();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2648");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setEmail("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str12 = guest3.getIdOrCertNumber();
        java.lang.String str13 = guest3.getRole();
        java.lang.String str14 = guest3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
// flaky "29) test2648(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=d02ca210-7db7-4e93-af97-546c750d9e24, email='User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str14, "User{userId=d02ca210-7db7-4e93-af97-546c750d9e24, email='User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2649");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        double double6 = headLabCoordinator3.getHourlyRate();
        double double7 = headLabCoordinator3.getHourlyRate();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}', description='User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2650");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.lang.String str25 = equipment22.toString();
        state.EquipmentState equipmentState26 = equipment22.getCurrentState();
        equipment22.enable();
        java.lang.String str28 = equipment22.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2651");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.markMaintenance();
        equipment3.disable();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2652");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        faculty3.setActive(false);
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "30) test2652(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "5908a881-1a86-4082-9a1c-5cab11917948");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2653");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
// flaky "31) test2653(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=f99176bc-94d4-472f-8592-8ab5be9dc75a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str7, "User{userId=f99176bc-94d4-472f-8592-8ab5be9dc75a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2654");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        java.lang.String str24 = equipment22.getStatus();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        labManager30.addEquipment(equipment34);
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.lang.String str40 = equipment39.getDescription();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment39.isModifyAvailable(localDateTime41, localDateTime42, "hi!", reservation44);
        java.lang.String str46 = equipment39.getEquipmentId();
        equipment39.setStatus("");
        state.EquipmentState equipmentState49 = equipment39.getCurrentState();
        equipment34.setState(equipmentState49);
        equipment22.setState(equipmentState49);
        equipment3.setState(equipmentState49);
        model.HeadLabCoordinator headLabCoordinator56 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager58 = headLabCoordinator56.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment62 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment62.isModifyAvailable(localDateTime63, localDateTime64, "Faculty", reservation66);
        equipment62.setLabLocation("Faculty");
        labManager58.setEquipmentStatus(equipment62, "");
        java.lang.String str72 = equipment62.toString();
        equipment62.disable();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment62.isModifyAvailable(localDateTime74, localDateTime75, "hi!", reservation77);
        model.Equipment equipment82 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState83 = equipment82.getCurrentState();
        equipment62.setState(equipmentState83);
        equipment3.setState(equipmentState83);
        state.EquipmentState equipmentState86 = equipment3.getCurrentState();
        java.lang.String str87 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Maintenance" + "'", str24, "Maintenance");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str72, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(equipmentState83);
        org.junit.Assert.assertNotNull(equipmentState86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2655");
        model.LabManager labManager3 = new model.LabManager("LabManager", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Faculty");
        java.util.UUID uUID4 = labManager3.getUserId();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "Faculty", reservation18);
        equipment14.setLabLocation("Faculty");
        labManager10.setEquipmentStatus(equipment14, "Guest");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        labManager10.addEquipment(equipment27);
        boolean boolean29 = labManager10.isActive();
        java.lang.String str30 = labManager10.getIdOrCertNumber();
        model.Faculty faculty34 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str35 = faculty34.getRole();
        faculty34.setIdOrCertNumber("");
        java.lang.String str38 = faculty34.getIdOrCertNumber();
        java.lang.String str39 = faculty34.getRole();
        java.lang.String str40 = faculty34.getPasswordHash();
        double double41 = faculty34.getHourlyRate();
        java.util.UUID uUID42 = faculty34.getUserId();
        labManager10.setUserId(uUID42);
        model.Equipment equipment47 = new model.Equipment("", "", "");
        equipment47.enable();
        equipment47.enable();
        java.lang.String str50 = equipment47.getStatus();
        equipment47.markMaintenance();
        observer.EquipmentObserver equipmentObserver52 = null;
        equipment47.attach(equipmentObserver52);
        java.lang.String str54 = equipment47.getStatus();
        java.lang.String str55 = equipment47.getEquipmentId();
        equipment47.setLabLocation("LM-CERT");
        labManager10.addEquipment(equipment47);
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uUID4);
// flaky "32) test2655(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "7b7df832-e96a-497d-a1ed-3a0956d1795d");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LM-CERT" + "'", str30, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertNotNull(uUID42);
// flaky "3) test2655(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID42.toString(), "a684fcf9-f498-4f7e-b0fc-48161bde64de");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Available" + "'", str50, "Available");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Maintenance" + "'", str54, "Maintenance");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2656");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7b207807-756f-47a8-a859-5fb513cc539b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2657");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        java.lang.String str10 = labManager5.getRole();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.lang.String str15 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment14.isModifyAvailable(localDateTime16, localDateTime17, "hi!", reservation19);
        equipment14.disable();
        equipment14.enable();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean26 = equipment14.isAvailable(localDateTime23, localDateTime24, "");
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        labManager32.addEquipment(equipment36);
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment41.isModifyAvailable(localDateTime43, localDateTime44, "hi!", reservation46);
        java.lang.String str48 = equipment41.getEquipmentId();
        equipment41.setStatus("");
        state.EquipmentState equipmentState51 = equipment41.getCurrentState();
        equipment36.setState(equipmentState51);
        equipment14.setState(equipmentState51);
        labManager5.setEquipmentStatus(equipment14, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Equipment equipment59 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment59.notifyObservers();
        labManager5.setEquipmentStatus(equipment59, "");
        model.Equipment equipment66 = new model.Equipment("", "", "");
        java.lang.String str67 = equipment66.getDescription();
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        model.Reservation reservation71 = null;
        boolean boolean72 = equipment66.isModifyAvailable(localDateTime68, localDateTime69, "hi!", reservation71);
        equipment66.markMaintenance();
        equipment66.setStatus("");
        equipment66.notifyObservers();
        labManager5.addEquipment(equipment66);
        equipment66.markMaintenance();
        equipment66.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(equipmentState51);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2658");
        model.Student student3 = new model.Student("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=53b0c4ac-bd8e-464d-a4d5-ad66634f4c53, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2659");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        model.Equipment equipment14 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str15 = equipment14.getLabLocation();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment14.detach(equipmentObserver16);
        equipment14.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment14.getLabLocation();
        java.lang.String str21 = equipment14.toString();
        labManager5.setEquipmentStatus(equipment14, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str24 = labManager5.getRole();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment28.detach(equipmentObserver29);
        labManager5.addEquipment(equipment28);
        java.lang.String str32 = labManager5.getEmail();
        java.util.UUID uUID33 = labManager5.getUserId();
        boolean boolean34 = labManager5.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HeadLabCoordinator" + "'", str32, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID33);
// flaky "33) test2659(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID33.toString(), "d1cf0a95-f9dd-486c-bb92-4117c99e845f");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2660");
        model.Faculty faculty3 = new model.Faculty("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LabManager");
        model.Student student7 = new model.Student("", "hi!", "");
        double double8 = student7.getHourlyRate();
        java.lang.String str9 = student7.getStatus();
        student7.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.Guest guest15 = new model.Guest("", "hi!", "hi!");
        java.lang.String str16 = guest15.getRole();
        guest15.setEmail("Guest");
        double double19 = guest15.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID26 = null;
        headLabCoordinator23.setUserId(uUID26);
        model.LabManager labManager29 = headLabCoordinator23.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager31 = headLabCoordinator23.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager33 = headLabCoordinator23.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty37 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str38 = faculty37.getStatus();
        boolean boolean39 = faculty37.isActive();
        model.Faculty faculty43 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID44 = faculty43.getUserId();
        faculty37.setUserId(uUID44);
        labManager33.setUserId(uUID44);
        guest15.setUserId(uUID44);
        student7.setUserId(uUID44);
        java.lang.String str49 = student7.getIdOrCertNumber();
        model.Guest guest53 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID54 = guest53.getUserId();
        student7.setUserId(uUID54);
        faculty3.setUserId(uUID54);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "INACTIVE" + "'", str9, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 25.0d + "'", double19 == 25.0d);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ACTIVE" + "'", str38, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(uUID44);
// flaky "34) test2660(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID44.toString(), "2394625f-0b70-4e5a-b0d1-a7fab0645f2b");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(uUID54);
// flaky "4) test2660(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID54.toString(), "7a50a31f-ed20-4b8c-b0ab-c424b995c641");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2661");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID12 = null;
        headLabCoordinator9.setUserId(uUID12);
        model.LabManager labManager15 = headLabCoordinator9.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        equipment19.enable();
        labManager15.addEquipment(equipment19);
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.lang.String str26 = equipment25.getDescription();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment25.isModifyAvailable(localDateTime27, localDateTime28, "hi!", reservation30);
        java.lang.String str32 = equipment25.getDescription();
        state.EquipmentState equipmentState33 = equipment25.getCurrentState();
        equipment25.setLabLocation("Student");
        labManager15.setEquipmentStatus(equipment25, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean41 = equipment25.isAvailable(localDateTime38, localDateTime39, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        state.EquipmentState equipmentState42 = equipment25.getCurrentState();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        strategy.PricingStrategy pricingStrategy45 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation46 = new model.Reservation((model.User) headLabCoordinator3, equipment25, localDateTime43, localDateTime44, pricingStrategy45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str5, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(equipmentState42);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2662");
        model.Guest guest3 = new model.Guest("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2663");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.util.UUID uUID7 = guest3.getUserId();
        guest3.setPasswordHash("User{userId=b7aed6ee-1c32-4982-a775-ce20394d0d35, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
        java.lang.String str10 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "35) test2663(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID7.toString(), "7bebe0c1-6c77-4992-a07a-d13ac81761b2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2664");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        faculty3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}" + "'", str8, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2665");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        java.util.UUID uUID5 = student3.getUserId();
        java.lang.String str6 = student3.getIdOrCertNumber();
        student3.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(uUID5);
// flaky "36) test2665(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID5.toString(), "41d34bf3-3005-4350-870c-43acc6279ec2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str6, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2666");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getDescription();
        equipment3.setStatus("User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}" + "'", str5, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2667");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        equipment3.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        equipment3.enable();
        java.lang.String str17 = equipment3.getLabLocation();
        model.SensorUpdate sensorUpdate18 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2668");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2669");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        java.util.UUID uUID11 = guest3.getUserId();
        java.lang.String str12 = guest3.getRole();
        guest3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "37) test2669(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "b1ff3740-a5e9-4960-a324-9d25d2e3864c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2670");
        model.Equipment equipment3 = new model.Equipment("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=45055d07-d544-45b1-bff7-7868ab9c80d1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}");
        java.lang.String str6 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2671");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment13.detach(equipmentObserver16);
        equipment13.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2672");
        model.Student student3 = new model.Student("", "Researcher", "HeadLabCoordinator");
        double double4 = student3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID11 = null;
        headLabCoordinator8.setUserId(uUID11);
        model.LabManager labManager14 = headLabCoordinator8.autoGenerateManagerAccount("ACTIVE");
        model.Student student18 = new model.Student("", "hi!", "");
        java.lang.String str19 = student18.getEmail();
        java.util.UUID uUID20 = student18.getUserId();
        labManager14.setUserId(uUID20);
        student3.setUserId(uUID20);
        java.lang.String str23 = student3.getRole();
        java.lang.String str24 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "38) test2672(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID20.toString(), "2ab344b1-ae8a-4717-b089-e16775462bfd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2673");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Student student13 = new model.Student("", "hi!", "");
        java.lang.String str14 = student13.getEmail();
        java.util.UUID uUID15 = student13.getUserId();
        labManager9.setUserId(uUID15);
        java.lang.String str17 = labManager9.toString();
        java.lang.String str18 = labManager9.getRole();
        java.lang.String str19 = labManager9.getRole();
        double double20 = labManager9.getHourlyRate();
        java.lang.String str21 = labManager9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "39) test2673(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID15.toString(), "53ed7879-01ce-4e5e-95c3-e18c66ff8094");
// flaky "5) test2673(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=53ed7879-01ce-4e5e-95c3-e18c66ff8094, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=53ed7879-01ce-4e5e-95c3-e18c66ff8094, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
// flaky "2) test2673(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=53ed7879-01ce-4e5e-95c3-e18c66ff8094, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str21, "User{userId=53ed7879-01ce-4e5e-95c3-e18c66ff8094, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2674");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        java.util.UUID uUID7 = faculty3.getUserId();
        java.lang.String str8 = faculty3.getEmail();
        java.util.UUID uUID9 = faculty3.getUserId();
        java.util.UUID uUID10 = faculty3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "40) test2674(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "85261967-4352-4a6b-ad73-5ad4eccae10c");
// flaky "6) test2674(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=85261967-4352-4a6b-ad73-5ad4eccae10c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=85261967-4352-4a6b-ad73-5ad4eccae10c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "3) test2674(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID7.toString(), "85261967-4352-4a6b-ad73-5ad4eccae10c");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "2) test2674(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "85261967-4352-4a6b-ad73-5ad4eccae10c");
        org.junit.Assert.assertNotNull(uUID10);
// flaky "1) test2674(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID10.toString(), "85261967-4352-4a6b-ad73-5ad4eccae10c");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2675");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "INACTIVE", reservation16);
        java.lang.String str18 = equipment3.toString();
        equipment3.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment3.toString();
        equipment3.setLabLocation("User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.SensorUpdate sensorUpdate24 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2676");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        java.lang.String str8 = researcher3.getStatus();
        researcher3.setEmail("");
        researcher3.setPasswordHash("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double13 = researcher3.getHourlyRate();
        java.lang.String str14 = researcher3.getRole();
        researcher3.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2677");
        model.Researcher researcher3 = new model.Researcher("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = researcher3.getHourlyRate();
        researcher3.setEmail("User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2678");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        equipment3.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.lang.String str16 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2679");
        model.Guest guest3 = new model.Guest("User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2680");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        java.lang.String str5 = equipment3.getLabLocation();
        equipment3.setStatus("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.detach(equipmentObserver8);
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2681");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2682");
        model.Guest guest3 = new model.Guest("User{userId=3ea24dc7-f640-44c6-99b2-10e76d3f61dc, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fb93504f-90fa-4dc1-9559-13b7130dfd84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2683");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        equipment3.notifyObservers();
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2684");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double6 = labManager5.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        equipment10.notifyObservers();
        labManager5.addEquipment(equipment10);
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        equipment25.enable();
        java.lang.String str28 = equipment25.getStatus();
        java.lang.String str29 = equipment25.getStatus();
        java.lang.String str30 = equipment25.getDescription();
        equipment25.disable();
        model.HeadLabCoordinator headLabCoordinator35 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager37 = headLabCoordinator35.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment41.isModifyAvailable(localDateTime42, localDateTime43, "Faculty", reservation45);
        equipment41.setLabLocation("Faculty");
        labManager37.setEquipmentStatus(equipment41, "");
        equipment41.setDescription("");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment56.isModifyAvailable(localDateTime57, localDateTime58, "Faculty", reservation60);
        equipment56.setLabLocation("Faculty");
        equipment56.notifyObservers();
        observer.EquipmentObserver equipmentObserver65 = null;
        equipment56.attach(equipmentObserver65);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment56.isModifyAvailable(localDateTime67, localDateTime68, "Faculty", reservation70);
        state.EquipmentState equipmentState72 = equipment56.getCurrentState();
        equipment41.setState(equipmentState72);
        equipment25.setState(equipmentState72);
        equipment10.setState(equipmentState72);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        boolean boolean79 = equipment10.isAvailable(localDateTime76, localDateTime77, "Guest");
        model.SensorUpdate sensorUpdate80 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment10.applySensorUpdate(sensorUpdate80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Available" + "'", str29, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(labManager37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(equipmentState72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2685");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "LabManager", reservation14);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = equipment3.isAvailable(localDateTime18, localDateTime19, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment3.isAvailable(localDateTime22, localDateTime23, "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}");
        java.lang.String str26 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2686");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2687");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='', status='User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2688");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        labManager10.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID14 = labManager10.getUserId();
        double double15 = labManager10.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "41) test2688(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "7) test2688(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID14.toString(), "2deeabe3-17c9-4ea7-9d48-68488e07eba7");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2689");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment11.isModifyAvailable(localDateTime12, localDateTime13, "Faculty", reservation15);
        equipment11.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment11.isModifyAvailable(localDateTime19, localDateTime20, "", reservation22);
        labManager5.addEquipment(equipment11);
        labManager5.setActive(true);
        java.lang.String str27 = labManager5.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2690");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID15 = null;
        headLabCoordinator12.setUserId(uUID15);
        model.LabManager labManager18 = headLabCoordinator12.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager20 = headLabCoordinator12.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager22 = headLabCoordinator12.autoGenerateManagerAccount("INACTIVE");
        java.lang.String str23 = labManager22.getRole();
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        labManager29.markMaintenance(equipment33);
        java.lang.String str35 = labManager29.getRole();
        java.lang.String str36 = labManager29.getRole();
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        labManager42.markMaintenance(equipment46);
        double double48 = labManager42.getHourlyRate();
        java.lang.String str49 = labManager42.getRole();
        double double50 = labManager42.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment60.isModifyAvailable(localDateTime61, localDateTime62, "Faculty", reservation64);
        equipment60.setLabLocation("Faculty");
        labManager56.setEquipmentStatus(equipment60, "");
        equipment60.notifyObservers();
        labManager42.addEquipment(equipment60);
        labManager29.setEquipmentStatus(equipment60, "Guest");
        model.Equipment equipment77 = new model.Equipment("", "", "");
        equipment77.enable();
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment77.isModifyAvailable(localDateTime79, localDateTime80, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation82);
        equipment77.setDescription("ACTIVE");
        labManager29.setEquipmentStatus(equipment77, "Researcher");
        labManager22.addEquipment(equipment77);
        equipment77.enable();
        equipment77.markMaintenance();
        labManager8.setEquipmentStatus(equipment77, "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str93 = equipment77.getStatus();
        java.time.LocalDateTime localDateTime94 = null;
        java.time.LocalDateTime localDateTime95 = null;
        model.Reservation reservation97 = null;
        boolean boolean98 = equipment77.isModifyAvailable(localDateTime94, localDateTime95, "User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LabManager" + "'", str23, "LabManager");
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LabManager" + "'", str35, "LabManager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LabManager" + "'", str49, "LabManager");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str93, "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2691");
        model.LabManager labManager3 = new model.LabManager("User{userId=9259ab1e-99ff-4fc7-a7c5-e086350ee87d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2692");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        equipment35.disable();
        equipment35.enable();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment35.isAvailable(localDateTime44, localDateTime45, "");
        labManager9.addEquipment(equipment35);
        java.lang.String str49 = equipment35.getLabLocation();
        java.lang.String str50 = equipment35.getDescription();
        equipment35.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2693");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double12 = headLabCoordinator3.getHourlyRate();
        java.lang.String str13 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2694");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.lang.String str15 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment14.isModifyAvailable(localDateTime16, localDateTime17, "hi!", reservation19);
        java.lang.String str21 = equipment14.getEquipmentId();
        equipment14.setStatus("");
        state.EquipmentState equipmentState24 = equipment14.getCurrentState();
        equipment9.setState(equipmentState24);
        equipment9.setLabLocation("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment9.attach(equipmentObserver28);
        java.lang.String str30 = equipment9.getLabLocation();
        state.EquipmentState equipmentState31 = equipment9.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str30, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2695");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        equipment21.notifyObservers();
        labManager5.markMaintenance(equipment21);
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.lang.String str37 = equipment36.getDescription();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment36.isModifyAvailable(localDateTime38, localDateTime39, "hi!", reservation41);
        java.lang.String str43 = equipment36.getEquipmentId();
        java.lang.String str44 = equipment36.getLabLocation();
        labManager5.markMaintenance(equipment36);
        model.Equipment equipment49 = new model.Equipment("", "", "");
        equipment49.enable();
        labManager5.addEquipment(equipment49);
        java.lang.String str52 = equipment49.getEquipmentId();
        java.lang.String str53 = equipment49.getDescription();
        model.SensorUpdate sensorUpdate54 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment49.applySensorUpdate(sensorUpdate54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2696");
        model.Faculty faculty3 = new model.Faculty("User{userId=4b98986f-3b04-4397-a461-2c6477e10e09, email='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}", "User{userId=fed24419-e732-4903-8c34-e24eaa879c77, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2697");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        java.lang.String str6 = faculty3.getRole();
        faculty3.setEmail("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str9 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2698");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        boolean boolean9 = researcher3.isActive();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2699");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        labManager5.setPasswordHash("");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment20.isModifyAvailable(localDateTime21, localDateTime22, "Faculty", reservation24);
        equipment20.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment20.isModifyAvailable(localDateTime28, localDateTime29, "", reservation31);
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment20.attach(equipmentObserver33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean38 = equipment20.isAvailable(localDateTime35, localDateTime36, "Maintenance");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean42 = equipment20.isAvailable(localDateTime39, localDateTime40, "HeadLabCoordinator");
        java.lang.String str43 = equipment20.getDescription();
        labManager5.setEquipmentStatus(equipment20, "Student");
        model.Guest guest49 = new model.Guest("", "hi!", "hi!");
        java.lang.String str50 = guest49.getRole();
        double double51 = guest49.getHourlyRate();
        double double52 = guest49.getHourlyRate();
        java.lang.String str53 = guest49.getRole();
        java.lang.String str54 = guest49.getEmail();
        model.HeadLabCoordinator headLabCoordinator58 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID59 = headLabCoordinator58.getUserId();
        guest49.setUserId(uUID59);
        labManager5.setUserId(uUID59);
        java.lang.String str62 = labManager5.getEmail();
        model.LabManager labManager66 = new model.LabManager("Available", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        labManager66.setActive(false);
        java.lang.String str69 = labManager66.getRole();
        model.HeadLabCoordinator headLabCoordinator73 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager75 = headLabCoordinator73.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean76 = labManager75.isActive();
        double double77 = labManager75.getHourlyRate();
        double double78 = labManager75.getHourlyRate();
        model.Equipment equipment82 = new model.Equipment("", "", "");
        java.lang.String str83 = equipment82.getDescription();
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        model.Reservation reservation87 = null;
        boolean boolean88 = equipment82.isModifyAvailable(localDateTime84, localDateTime85, "hi!", reservation87);
        java.lang.String str89 = equipment82.getEquipmentId();
        equipment82.setStatus("");
        state.EquipmentState equipmentState92 = equipment82.getCurrentState();
        equipment82.disable();
        labManager75.addEquipment(equipment82);
        labManager66.markMaintenance(equipment82);
        labManager5.setEquipmentStatus(equipment82, "User{userId=46c48ad0-8e1d-4dda-b9d8-dc5453268c34, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Guest" + "'", str50, "Guest");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 25.0d + "'", double51 == 25.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 25.0d + "'", double52 == 25.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Guest" + "'", str53, "Guest");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(uUID59);
// flaky "42) test2699(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID59.toString(), "c9100686-21a4-4653-bd80-8af0ecb655e9");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Faculty" + "'", str62, "Faculty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "LabManager" + "'", str69, "LabManager");
        org.junit.Assert.assertNotNull(labManager75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(equipmentState92);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2700");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        labManager8.setEquipmentStatus(equipment18, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment18.markMaintenance();
        equipment18.enable();
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment33.isModifyAvailable(localDateTime34, localDateTime35, "Faculty", reservation37);
        equipment33.setLabLocation("Faculty");
        labManager29.setEquipmentStatus(equipment33, "");
        equipment33.setDescription("");
        model.Equipment equipment48 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment48.isModifyAvailable(localDateTime49, localDateTime50, "Faculty", reservation52);
        equipment48.setLabLocation("Faculty");
        equipment48.notifyObservers();
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment48.attach(equipmentObserver57);
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment48.isModifyAvailable(localDateTime59, localDateTime60, "Faculty", reservation62);
        state.EquipmentState equipmentState64 = equipment48.getCurrentState();
        equipment33.setState(equipmentState64);
        equipment18.setState(equipmentState64);
        equipment18.setLabLocation("User{userId=e66add75-7741-400c-88d2-105d5e18ca95, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(equipmentState64);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2701");
        model.Student student3 = new model.Student("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2702");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.toString();
        equipment9.disable();
        equipment9.setLabLocation("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str23 = equipment9.getEquipmentId();
        equipment9.setLabLocation("User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2703");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='Student', status='Available'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2704");
        model.Student student3 = new model.Student("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "ACTIVE", "Available");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2705");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = labManager8.getHourlyRate();
        java.lang.String str10 = labManager8.getPasswordHash();
        labManager8.setIdOrCertNumber("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        labManager8.setActive(true);
        java.lang.String str15 = labManager8.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str15, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2706");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        boolean boolean4 = faculty3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2707");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        java.lang.String str16 = equipment13.toString();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean20 = equipment13.isAvailable(localDateTime17, localDateTime18, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment13.getLabLocation();
        equipment13.disable();
        java.lang.String str23 = equipment13.toString();
        java.lang.String str24 = equipment13.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2708");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment19.notifyObservers();
        java.lang.String str33 = equipment19.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2709");
        model.Student student3 = new model.Student("User{userId=f724b6e8-da94-4ecb-ab0f-99c8597e0b65, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2710");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        equipment3.disable();
        model.SensorUpdate sensorUpdate16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2711");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.addEquipment(equipment25);
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.lang.String str37 = equipment30.getEquipmentId();
        equipment30.setStatus("");
        state.EquipmentState equipmentState40 = equipment30.getCurrentState();
        equipment25.setState(equipmentState40);
        equipment3.setState(equipmentState40);
        state.EquipmentState equipmentState43 = equipment3.getCurrentState();
        equipment3.setDescription("User{userId=e2b4af35-e35a-4a60-9c5f-2d508b3c3588, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertNotNull(equipmentState43);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2712");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.lang.String str25 = equipment22.toString();
        state.EquipmentState equipmentState26 = equipment22.getCurrentState();
        equipment22.enable();
        equipment22.markMaintenance();
        java.lang.String str29 = equipment22.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Maintenance" + "'", str29, "Maintenance");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2713");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getStatus();
        boolean boolean7 = faculty3.isActive();
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "43) test2713(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "41169782-a37a-4943-8a8b-2b2ed644c9fd");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2714");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        equipment35.disable();
        equipment35.enable();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment35.isAvailable(localDateTime44, localDateTime45, "");
        labManager9.addEquipment(equipment35);
        equipment35.disable();
        equipment35.setStatus("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment35.markMaintenance();
        equipment35.setStatus("User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str55 = equipment35.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2715");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.attach(equipmentObserver12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment3.isModifyAvailable(localDateTime14, localDateTime15, "Maintenance", reservation17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2716");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.toString();
        equipment9.disable();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment9.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        model.Equipment equipment29 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState30 = equipment29.getCurrentState();
        equipment9.setState(equipmentState30);
        equipment9.markMaintenance();
        equipment9.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(equipmentState30);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2717");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = faculty3.getPasswordHash();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}" + "'", str4, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2718");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2719");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Disabled" + "'", str7, "Disabled");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2720");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        double double6 = labManager5.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        java.lang.String str20 = equipment10.getEquipmentId();
        java.lang.String str21 = equipment10.getEquipmentId();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment10.detach(equipmentObserver22);
        java.lang.String str24 = equipment10.getLabLocation();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        labManager30.addEquipment(equipment34);
        equipment34.setLabLocation("hi!");
        equipment34.setDescription("Researcher");
        state.EquipmentState equipmentState40 = equipment34.getCurrentState();
        state.EquipmentState equipmentState41 = equipment34.getCurrentState();
        equipment10.setState(equipmentState41);
        model.LabManager labManager46 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager46.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator52 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager54 = headLabCoordinator52.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment58 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment58.isModifyAvailable(localDateTime59, localDateTime60, "Faculty", reservation62);
        equipment58.setLabLocation("Faculty");
        labManager54.setEquipmentStatus(equipment58, "");
        equipment58.notifyObservers();
        labManager46.addEquipment(equipment58);
        state.EquipmentState equipmentState70 = equipment58.getCurrentState();
        equipment10.setState(equipmentState70);
        labManager5.markMaintenance(equipment10);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertNotNull(equipmentState41);
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(equipmentState70);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2721");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager8.setEmail("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        labManager16.addEquipment(equipment20);
        equipment20.setLabLocation("");
        java.lang.String str24 = equipment20.getEquipmentId();
        labManager8.addEquipment(equipment20);
        model.SensorUpdate sensorUpdate26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment20.applySensorUpdate(sensorUpdate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2722");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getEmail();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("");
        labManager13.setEmail("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2723");
        model.LabManager labManager3 = new model.LabManager("hi!", "User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = labManager3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2724");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        researcher3.setPasswordHash("Faculty");
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getRole();
        java.lang.String str12 = researcher3.getIdOrCertNumber();
        double double13 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "44) test2724(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID7.toString(), "6cc74acd-47f3-43c6-a3a1-74dad2b7af2a");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2725");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setPasswordHash("LabManager");
        labManager3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment11.isModifyAvailable(localDateTime12, localDateTime13, "Faculty", reservation15);
        equipment11.setLabLocation("Faculty");
        java.lang.String str19 = equipment11.getDescription();
        java.lang.String str20 = equipment11.getEquipmentId();
        equipment11.notifyObservers();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment11.attach(equipmentObserver22);
        java.lang.String str24 = equipment11.getLabLocation();
        labManager3.setEquipmentStatus(equipment11, "User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        java.lang.String str27 = equipment11.getDescription();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2726");
        model.Student student3 = new model.Student("User{userId=d0b49de6-3041-49bb-ab40-a2aaea2485f8, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=9f4644ed-2d37-4a6b-9fd1-0563c3568bcf, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2727");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        java.lang.String str15 = equipment3.toString();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment3.isAvailable(localDateTime16, localDateTime17, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str20 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.detach(equipmentObserver21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2728");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "", reservation14);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = equipment3.isAvailable(localDateTime18, localDateTime19, "Maintenance");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment3.isAvailable(localDateTime22, localDateTime23, "HeadLabCoordinator");
        java.lang.String str26 = equipment3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2729");
        model.Researcher researcher3 = new model.Researcher("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2730");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setPasswordHash("Maintenance");
        labManager9.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='Guest', status=''}");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.lang.String str18 = equipment17.getDescription();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment17.isModifyAvailable(localDateTime19, localDateTime20, "hi!", reservation22);
        java.lang.String str24 = equipment17.getEquipmentId();
        equipment17.setStatus("");
        state.EquipmentState equipmentState27 = equipment17.getCurrentState();
        equipment17.disable();
        equipment17.notifyObservers();
        equipment17.setLabLocation("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        labManager9.setEquipmentStatus(equipment17, "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean37 = equipment17.isAvailable(localDateTime34, localDateTime35, "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2731");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.toString();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
// flaky "45) test2731(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=20daa759-4063-4be0-8fbd-7c9ecfb1543e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=20daa759-4063-4be0-8fbd-7c9ecfb1543e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2732");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setDescription("ACTIVE");
        equipment3.notifyObservers();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment3.isAvailable(localDateTime13, localDateTime14, "User{userId=74c1da88-3641-4d4c-87ef-ff7c77d2e098, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2733");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment19.notifyObservers();
        equipment19.notifyObservers();
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment19.detach(equipmentObserver34);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2734");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        double double14 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2735");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str8 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2736");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getStatus();
        java.lang.String str12 = researcher3.getIdOrCertNumber();
        double double13 = researcher3.getHourlyRate();
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        equipment17.notifyObservers();
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment17.attach(equipmentObserver26);
        java.lang.String str28 = equipment17.getEquipmentId();
        java.lang.String str29 = equipment17.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        strategy.PricingStrategy pricingStrategy32 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation33 = new model.Reservation((model.User) researcher3, equipment17, localDateTime30, localDateTime31, pricingStrategy32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2737");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = labManager3.getHourlyRate();
        java.util.UUID uUID5 = labManager3.getUserId();
        labManager3.setEmail("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(uUID5);
// flaky "46) test2737(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID5.toString(), "8e2eb130-2400-476e-b706-b6e3ab6b8a17");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2738");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        boolean boolean9 = researcher3.isActive();
        java.lang.String str10 = researcher3.getRole();
        double double11 = researcher3.getHourlyRate();
        double double12 = researcher3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2739");
        model.Student student3 = new model.Student("User{userId=8fb7250f-99b4-45ac-9104-fc1d190a24b3, email='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}', role='Guest'}", "User{userId=8868c252-060b-4413-9d0a-228b729ecd67, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=c27432a0-c619-4671-81f6-1270a2c6539c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2740");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "47) test2740(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "d62c0614-e302-4eee-94d2-5aa7b4144e53");
// flaky "8) test2740(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=d62c0614-e302-4eee-94d2-5aa7b4144e53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=d62c0614-e302-4eee-94d2-5aa7b4144e53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2741");
        model.Researcher researcher3 = new model.Researcher("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "ACTIVE");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2742");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.markMaintenance();
        java.lang.String str15 = equipment3.getEquipmentId();
        equipment3.markMaintenance();
        java.lang.String str17 = equipment3.getEquipmentId();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment27.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        equipment27.setLabLocation("Faculty");
        labManager23.setEquipmentStatus(equipment27, "");
        java.lang.String str37 = equipment27.getDescription();
        model.HeadLabCoordinator headLabCoordinator41 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager43 = headLabCoordinator41.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        labManager43.addEquipment(equipment47);
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getDescription();
        equipment52.setStatus("Researcher");
        labManager43.addEquipment(equipment52);
        model.HeadLabCoordinator headLabCoordinator66 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager68 = headLabCoordinator66.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment72 = new model.Equipment("", "", "");
        labManager68.addEquipment(equipment72);
        model.Equipment equipment77 = new model.Equipment("", "", "");
        java.lang.String str78 = equipment77.getDescription();
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment77.isModifyAvailable(localDateTime79, localDateTime80, "hi!", reservation82);
        java.lang.String str84 = equipment77.getEquipmentId();
        equipment77.setStatus("");
        state.EquipmentState equipmentState87 = equipment77.getCurrentState();
        equipment72.setState(equipmentState87);
        equipment52.setState(equipmentState87);
        equipment27.setState(equipmentState87);
        equipment3.setState(equipmentState87);
        equipment3.setDescription("User{userId=90f04ada-49ae-450e-9ab3-57e1d440eb38, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(labManager68);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(equipmentState87);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2743");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("User{userId=aba9aea5-5166-46f6-bd18-14b8b26e887d, email='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2744");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getRole();
        double double12 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "48) test2744(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=55859998-7fb2-492b-af42-9cb87ba76d25, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=55859998-7fb2-492b-af42-9cb87ba76d25, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2745");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        model.Equipment equipment10 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment10.markMaintenance();
        equipment10.enable();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment10.isAvailable(localDateTime13, localDateTime14, "ACTIVE");
        java.lang.String str17 = equipment10.getStatus();
        labManager5.addEquipment(equipment10);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2746");
        model.LabManager labManager3 = new model.LabManager("Disabled", "User{userId=adce0ca0-d11b-438d-9dc0-cbb2ae94ebeb, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}", "User{userId=d736c8c8-7132-400d-b4a0-06004de8f467, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2747");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        double double11 = labManager5.getHourlyRate();
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.lang.String str16 = equipment15.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment15.isModifyAvailable(localDateTime17, localDateTime18, "hi!", reservation20);
        equipment15.markMaintenance();
        equipment15.setLabLocation("HeadLabCoordinator");
        java.lang.String str25 = equipment15.getDescription();
        java.lang.String str26 = equipment15.getEquipmentId();
        labManager5.setEquipmentStatus(equipment15, "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str29 = equipment15.getStatus();
        java.lang.String str30 = equipment15.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str29, "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2748");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.getRole();
        model.Equipment equipment13 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str14 = equipment13.getLabLocation();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment13.isModifyAvailable(localDateTime15, localDateTime16, "Student", reservation18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment13.isModifyAvailable(localDateTime20, localDateTime21, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation23);
        labManager8.addEquipment(equipment13);
        labManager8.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
        java.lang.String str28 = labManager8.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LabManager" + "'", str28, "LabManager");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2749");
        model.Student student3 = new model.Student("HeadLabCoordinator", "hi!", "Guest");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2750");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str6 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str6, "User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2751");
        model.Equipment equipment3 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment3.markMaintenance();
        equipment3.disable();
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2752");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean14 = equipment3.isAvailable(localDateTime11, localDateTime12, "Faculty");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "Researcher", reservation18);
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2753");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getEquipmentId();
        equipment3.enable();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        java.lang.String str8 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment3.isModifyAvailable(localDateTime9, localDateTime10, "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", reservation12);
        java.lang.String str14 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2754");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        guest3.setPasswordHash("");
        java.lang.String str9 = guest3.getRole();
        guest3.setPasswordHash("User{userId=40e37e2b-d3c1-449e-a17e-f6d320c89b84, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2755");
        model.Faculty faculty3 = new model.Faculty("Guest", "hi!", "Faculty");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2756");
        model.Equipment equipment3 = new model.Equipment("User{userId=2eba5902-b086-4be6-86d0-a278fe1d92be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1e0554db-959c-4c51-b309-f0f492d9ab32, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=43d45941-45ea-42c1-9f67-2e88448539f4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2757");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        equipment35.disable();
        equipment35.enable();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment35.isAvailable(localDateTime44, localDateTime45, "");
        labManager9.addEquipment(equipment35);
        equipment35.disable();
        equipment35.setStatus("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment35.markMaintenance();
        equipment35.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        boolean boolean58 = equipment35.isAvailable(localDateTime55, localDateTime56, "Maintenance");
        state.EquipmentState equipmentState59 = equipment35.getCurrentState();
        equipment35.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(equipmentState59);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2758");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean19 = labManager18.isActive();
        double double20 = labManager18.getHourlyRate();
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment24.isModifyAvailable(localDateTime32, localDateTime33, "", reservation35);
        labManager18.addEquipment(equipment24);
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment41.isModifyAvailable(localDateTime43, localDateTime44, "hi!", reservation46);
        java.lang.String str48 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean52 = equipment41.isAvailable(localDateTime49, localDateTime50, "Faculty");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        java.lang.String str63 = equipment56.getDescription();
        state.EquipmentState equipmentState64 = equipment56.getCurrentState();
        equipment41.setState(equipmentState64);
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        boolean boolean69 = equipment41.isAvailable(localDateTime66, localDateTime67, "Faculty");
        java.lang.String str70 = equipment41.getDescription();
        state.EquipmentState equipmentState71 = equipment41.getCurrentState();
        equipment24.setState(equipmentState71);
        labManager5.setEquipmentStatus(equipment24, "HeadLabCoordinator");
        java.lang.String str75 = equipment24.getDescription();
        java.lang.String str76 = equipment24.getStatus();
        observer.EquipmentObserver equipmentObserver77 = null;
        equipment24.detach(equipmentObserver77);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(equipmentState71);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "HeadLabCoordinator" + "'", str76, "HeadLabCoordinator");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2759");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2760");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double10 = labManager9.getHourlyRate();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        equipment14.enable();
        equipment14.enable();
        java.lang.String str17 = equipment14.getStatus();
        equipment14.markMaintenance();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment14.isModifyAvailable(localDateTime19, localDateTime20, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation22);
        java.lang.String str24 = equipment14.getDescription();
        java.lang.String str25 = equipment14.toString();
        equipment14.markMaintenance();
        labManager9.markMaintenance(equipment14);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2761");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        java.lang.String str13 = headLabCoordinator3.getRole();
        java.lang.String str14 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str17 = headLabCoordinator3.getPasswordHash();
        java.lang.String str18 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2762");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "49) test2762(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=d6c1a18c-4fc7-4476-9542-336280232aef, email='User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', role='Student'}" + "'", str5, "User{userId=d6c1a18c-4fc7-4476-9542-336280232aef, email='User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', role='Student'}");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2763");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getDescription();
        state.EquipmentState equipmentState20 = equipment9.getCurrentState();
        equipment9.markMaintenance();
        java.lang.String str22 = equipment9.getLabLocation();
        java.lang.String str23 = equipment9.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(equipmentState20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2764");
        model.Guest guest3 = new model.Guest("hi!", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2765");
        model.Equipment equipment3 = new model.Equipment("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=eb6fc337-1003-47b7-b3f1-2ceb2830d470, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=d62c0614-e302-4eee-94d2-5aa7b4144e53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2766");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = faculty3.getPasswordHash();
        java.lang.String str5 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}" + "'", str4, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str5, "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2767");
        model.Guest guest3 = new model.Guest("User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        guest3.setIdOrCertNumber("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2768");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        java.lang.String str8 = researcher3.getStatus();
        researcher3.setEmail("");
        researcher3.setPasswordHash("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double13 = researcher3.getHourlyRate();
        double double14 = researcher3.getHourlyRate();
        java.lang.String str15 = researcher3.getRole();
        java.lang.String str16 = researcher3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
// flaky "50) test2768(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=edaf5b3a-38fd-4a81-a98d-320a37b65124, email='', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}" + "'", str16, "User{userId=edaf5b3a-38fd-4a81-a98d-320a37b65124, email='', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2769");
        model.Faculty faculty3 = new model.Faculty("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3d340c34-0a6d-40a5-9c3d-28a6eb92e486, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2770");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        java.lang.String str13 = headLabCoordinator3.getRole();
        java.lang.String str14 = headLabCoordinator3.getRole();
        double double15 = headLabCoordinator3.getHourlyRate();
        double double16 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID17 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2771");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getPasswordHash();
        student3.setEmail("User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        student3.setPasswordHash("User{userId=c231e062-149b-42f9-b324-db8d3a984c3b, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2772");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "", "User{userId=1f3e23d9-8541-4eff-84fd-73beafe7ecd3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2773");
        model.Student student3 = new model.Student("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=e198018f-95c6-450a-ad5f-675ecbf69376, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2774");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getStatus();
        model.LabManager labManager11 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str12 = labManager11.toString();
        java.util.UUID uUID13 = labManager11.getUserId();
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        java.lang.String str25 = equipment17.getDescription();
        java.lang.String str26 = equipment17.getEquipmentId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment17.isModifyAvailable(localDateTime27, localDateTime28, "INACTIVE", reservation30);
        java.lang.String str32 = equipment17.toString();
        equipment17.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str35 = equipment17.getStatus();
        labManager11.addEquipment(equipment17);
        model.Guest guest40 = new model.Guest("", "hi!", "hi!");
        java.lang.String str41 = guest40.getRole();
        double double42 = guest40.getHourlyRate();
        double double43 = guest40.getHourlyRate();
        java.lang.String str44 = guest40.getPasswordHash();
        double double45 = guest40.getHourlyRate();
        java.util.UUID uUID46 = guest40.getUserId();
        labManager11.setUserId(uUID46);
        student3.setUserId(uUID46);
        java.lang.String str49 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
// flaky "51) test2774(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=2ddc2f37-2559-4c08-81ff-b9d476a99ad6, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str12, "User{userId=2ddc2f37-2559-4c08-81ff-b9d476a99ad6, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID13);
// flaky "9) test2774(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID13.toString(), "2ddc2f37-2559-4c08-81ff-b9d476a99ad6");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str32, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Available" + "'", str35, "Available");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Guest" + "'", str41, "Guest");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 25.0d + "'", double42 == 25.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 25.0d + "'", double43 == 25.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 25.0d + "'", double45 == 25.0d);
        org.junit.Assert.assertNotNull(uUID46);
// flaky "4) test2774(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID46.toString(), "4399c9b2-1220-4bf4-9097-ca719321090e");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2775");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        model.Equipment equipment14 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str15 = equipment14.getLabLocation();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment14.detach(equipmentObserver16);
        equipment14.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment14.getLabLocation();
        java.lang.String str21 = equipment14.toString();
        labManager5.setEquipmentStatus(equipment14, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str24 = labManager5.getRole();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment28.detach(equipmentObserver29);
        labManager5.addEquipment(equipment28);
        model.Equipment equipment35 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.markMaintenance(equipment35);
        equipment35.setStatus("User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str39 = equipment35.getDescription();
        java.lang.String str40 = equipment35.toString();
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment35.attach(equipmentObserver41);
        java.lang.String str43 = equipment35.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', labLocation='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}" + "'", str40, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', labLocation='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str43, "User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2776");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setPasswordHash("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        boolean boolean12 = researcher3.isActive();
        double double13 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2777");
        model.Researcher researcher3 = new model.Researcher("User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "INACTIVE", "User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2778");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.setStatus("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2779");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment35.isModifyAvailable(localDateTime36, localDateTime37, "Faculty", reservation39);
        equipment35.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment35.isModifyAvailable(localDateTime43, localDateTime44, "", reservation46);
        equipment35.disable();
        labManager9.addEquipment(equipment35);
        double double50 = labManager9.getHourlyRate();
        java.lang.String str51 = labManager9.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "LM-CERT" + "'", str51, "LM-CERT");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2780");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setEmail("User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2781");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        labManager12.markMaintenance(equipment16);
        java.lang.String str18 = labManager12.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        labManager24.setEquipmentStatus(equipment28, "");
        equipment28.notifyObservers();
        labManager12.markMaintenance(equipment28);
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getEquipmentId();
        java.lang.String str51 = equipment43.getLabLocation();
        labManager12.markMaintenance(equipment43);
        labManager12.setIdOrCertNumber("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID55 = labManager12.getUserId();
        faculty3.setUserId(uUID55);
        boolean boolean57 = faculty3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LM-CERT" + "'", str18, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(uUID55);
// flaky "52) test2781(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID55.toString(), "655d9f7d-8e3a-463b-ae76-e537a0941b1d");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2782");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.lang.String str6 = labManager5.getRole();
        labManager5.setEmail("User{userId=40e37e2b-d3c1-449e-a17e-f6d320c89b84, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.lang.String str13 = equipment12.getDescription();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment12.isModifyAvailable(localDateTime14, localDateTime15, "hi!", reservation17);
        java.lang.String str19 = equipment12.getEquipmentId();
        equipment12.setStatus("");
        java.lang.String str22 = equipment12.getStatus();
        equipment12.setDescription("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        equipment12.disable();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        strategy.PricingStrategy pricingStrategy28 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation29 = new model.Reservation((model.User) labManager5, equipment12, localDateTime26, localDateTime27, pricingStrategy28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2783");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2784");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setPasswordHash("");
        faculty3.setPasswordHash("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str8 = faculty3.getRole();
        faculty3.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2785");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getStatus();
        java.lang.String str5 = student3.getRole();
        java.util.UUID uUID6 = student3.getUserId();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "53) test2785(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID6.toString(), "4f68bcfe-4970-4971-8530-9d462787d184");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2786");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getDescription();
        equipment9.notifyObservers();
        java.lang.String str21 = equipment9.toString();
        java.lang.String str22 = equipment9.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2787");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        labManager5.setEquipmentStatus(equipment27, "Guest");
        java.lang.String str36 = equipment27.getLabLocation();
        equipment27.markMaintenance();
        state.EquipmentState equipmentState38 = equipment27.getCurrentState();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment27.isModifyAvailable(localDateTime39, localDateTime40, "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation42);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2788");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        java.lang.String str15 = equipment3.toString();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment3.isAvailable(localDateTime16, localDateTime17, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str20 = equipment3.getDescription();
        model.SensorUpdate sensorUpdate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2789");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        labManager5.setUserId(uUID6);
        labManager5.setIdOrCertNumber("Available");
        model.Equipment equipment13 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str14 = equipment13.getLabLocation();
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment13.detach(equipmentObserver15);
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment13.detach(equipmentObserver17);
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        labManager24.addEquipment(equipment28);
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.lang.String str34 = equipment33.getDescription();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment33.isModifyAvailable(localDateTime35, localDateTime36, "hi!", reservation38);
        java.lang.String str40 = equipment33.getDescription();
        equipment33.setStatus("Researcher");
        labManager24.addEquipment(equipment33);
        model.HeadLabCoordinator headLabCoordinator47 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager49 = headLabCoordinator47.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        labManager49.addEquipment(equipment53);
        model.Equipment equipment58 = new model.Equipment("", "", "");
        java.lang.String str59 = equipment58.getDescription();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment58.isModifyAvailable(localDateTime60, localDateTime61, "hi!", reservation63);
        java.lang.String str65 = equipment58.getEquipmentId();
        equipment58.setStatus("");
        state.EquipmentState equipmentState68 = equipment58.getCurrentState();
        equipment53.setState(equipmentState68);
        equipment33.setState(equipmentState68);
        equipment13.setState(equipmentState68);
        labManager5.setEquipmentStatus(equipment13, "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double74 = labManager5.getHourlyRate();
        labManager5.setEmail("User{userId=9bbc74b2-f7ec-401d-92df-d7f8f8c59707, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(equipmentState68);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2790");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Student student13 = new model.Student("", "hi!", "");
        java.lang.String str14 = student13.getEmail();
        java.util.UUID uUID15 = student13.getUserId();
        labManager9.setUserId(uUID15);
        java.lang.String str17 = labManager9.toString();
        java.lang.String str18 = labManager9.getRole();
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        labManager24.setEquipmentStatus(equipment28, "Guest");
        java.lang.String str38 = labManager24.getStatus();
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.lang.String str43 = equipment42.getDescription();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment42.isModifyAvailable(localDateTime44, localDateTime45, "hi!", reservation47);
        java.lang.String str49 = equipment42.getDescription();
        state.EquipmentState equipmentState50 = equipment42.getCurrentState();
        labManager24.markMaintenance(equipment42);
        equipment42.setLabLocation("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.setEquipmentStatus(equipment42, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str56 = labManager9.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "54) test2790(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID15.toString(), "6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b");
// flaky "10) test2790(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ACTIVE" + "'", str38, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ACTIVE" + "'", str56, "ACTIVE");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2791");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.addEquipment(equipment25);
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.lang.String str37 = equipment30.getEquipmentId();
        equipment30.setStatus("");
        state.EquipmentState equipmentState40 = equipment30.getCurrentState();
        equipment25.setState(equipmentState40);
        equipment3.setState(equipmentState40);
        equipment3.setDescription("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean48 = equipment3.isAvailable(localDateTime45, localDateTime46, "User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str49 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment3.detach(equipmentObserver50);
        java.lang.Class<?> wildcardClass52 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str49, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2792");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getIdOrCertNumber();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getStatus();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getRole();
        java.lang.String str14 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2793");
        model.Guest guest3 = new model.Guest("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        guest3.setActive(true);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2794");
        model.Faculty faculty3 = new model.Faculty("User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2795");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        model.Equipment equipment14 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str15 = equipment14.getLabLocation();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment14.detach(equipmentObserver16);
        equipment14.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment14.getLabLocation();
        java.lang.String str21 = equipment14.toString();
        labManager5.setEquipmentStatus(equipment14, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str24 = labManager5.getRole();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment28.detach(equipmentObserver29);
        labManager5.addEquipment(equipment28);
        model.Equipment equipment35 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.markMaintenance(equipment35);
        equipment35.setStatus("User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment35.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2796");
        model.Faculty faculty3 = new model.Faculty("User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d607e3b3-dd2e-44bc-8828-df14db97ac31, email='User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='INACTIVE', idOrCertNumber='', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2797");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double12 = headLabCoordinator3.getHourlyRate();
        java.lang.String str13 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2798");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        equipment21.notifyObservers();
        labManager5.markMaintenance(equipment21);
        double double33 = labManager5.getHourlyRate();
        double double34 = labManager5.getHourlyRate();
        double double35 = labManager5.getHourlyRate();
        double double36 = labManager5.getHourlyRate();
        model.Equipment equipment40 = new model.Equipment("", "", "");
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment40.detach(equipmentObserver41);
        equipment40.enable();
        labManager5.addEquipment(equipment40);
        equipment40.setStatus("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2799");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=376801b9-2981-46c5-b75d-8d1f4444d53f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.Researcher researcher8 = new model.Researcher("Faculty", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID9 = researcher8.getUserId();
        headLabCoordinator3.setUserId(uUID9);
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1d9bd833-1411-4ea6-9795-0d8168f502c8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "55) test2799(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "c4b90b05-3517-4cfb-b1e5-7fd83750442c");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2800");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        java.lang.String str24 = equipment22.getStatus();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        labManager30.addEquipment(equipment34);
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.lang.String str40 = equipment39.getDescription();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment39.isModifyAvailable(localDateTime41, localDateTime42, "hi!", reservation44);
        java.lang.String str46 = equipment39.getEquipmentId();
        equipment39.setStatus("");
        state.EquipmentState equipmentState49 = equipment39.getCurrentState();
        equipment34.setState(equipmentState49);
        equipment22.setState(equipmentState49);
        equipment3.setState(equipmentState49);
        model.HeadLabCoordinator headLabCoordinator56 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager58 = headLabCoordinator56.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment62 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment62.isModifyAvailable(localDateTime63, localDateTime64, "Faculty", reservation66);
        equipment62.setLabLocation("Faculty");
        labManager58.setEquipmentStatus(equipment62, "");
        java.lang.String str72 = equipment62.toString();
        equipment62.disable();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment62.isModifyAvailable(localDateTime74, localDateTime75, "hi!", reservation77);
        model.Equipment equipment82 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState83 = equipment82.getCurrentState();
        equipment62.setState(equipmentState83);
        equipment3.setState(equipmentState83);
        observer.EquipmentObserver equipmentObserver86 = null;
        equipment3.attach(equipmentObserver86);
        equipment3.setDescription("User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Maintenance" + "'", str24, "Maintenance");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str72, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(equipmentState83);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2801");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment3.isAvailable(localDateTime13, localDateTime14, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.markMaintenance();
        equipment3.setDescription("User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setDescription("User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2802");
        model.LabManager labManager3 = new model.LabManager("", "", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean4 = labManager3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2803");
        model.Equipment equipment3 = new model.Equipment("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e2b4af35-e35a-4a60-9c5f-2d508b3c3588, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2804");
        model.Researcher researcher3 = new model.Researcher("User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2805");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=4d57768e-7424-43ed-a8cf-888154c018c2, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=184e30c2-a69c-4f1f-9887-026cbd4ed4bb, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2806");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.setActive(true);
        double double14 = labManager11.getHourlyRate();
        labManager11.setActive(true);
        model.Equipment equipment20 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str21 = equipment20.getLabLocation();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment20.detach(equipmentObserver22);
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment20.detach(equipmentObserver24);
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        labManager31.addEquipment(equipment35);
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        java.lang.String str47 = equipment40.getDescription();
        equipment40.setStatus("Researcher");
        labManager31.addEquipment(equipment40);
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        labManager56.addEquipment(equipment60);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        java.lang.String str66 = equipment65.getDescription();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment65.isModifyAvailable(localDateTime67, localDateTime68, "hi!", reservation70);
        java.lang.String str72 = equipment65.getEquipmentId();
        equipment65.setStatus("");
        state.EquipmentState equipmentState75 = equipment65.getCurrentState();
        equipment60.setState(equipmentState75);
        equipment40.setState(equipmentState75);
        equipment20.setState(equipmentState75);
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        boolean boolean82 = equipment20.isAvailable(localDateTime79, localDateTime80, "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.addEquipment(equipment20);
        java.lang.String str84 = equipment20.getEquipmentId();
        observer.EquipmentObserver equipmentObserver85 = null;
        equipment20.detach(equipmentObserver85);
        java.lang.String str87 = equipment20.getLabLocation();
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        boolean boolean91 = equipment20.isAvailable(localDateTime88, localDateTime89, "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime92 = null;
        java.time.LocalDateTime localDateTime93 = null;
        boolean boolean95 = equipment20.isAvailable(localDateTime92, localDateTime93, "User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(equipmentState75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ACTIVE" + "'", str84, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2807");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.attach(equipmentObserver12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment3.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        state.EquipmentState equipmentState19 = equipment3.getCurrentState();
        java.lang.String str20 = equipment3.getStatus();
        java.lang.String str21 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment3.attach(equipmentObserver22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Available" + "'", str20, "Available");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2808");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getEquipmentId();
        java.lang.String str14 = equipment3.getEquipmentId();
        equipment3.setLabLocation("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.attach(equipmentObserver19);
        equipment3.setDescription("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2809");
        model.Faculty faculty3 = new model.Faculty("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        labManager10.addEquipment(equipment14);
        equipment14.setLabLocation("hi!");
        equipment14.setDescription("Researcher");
        equipment14.notifyObservers();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        strategy.PricingStrategy pricingStrategy23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation24 = new model.Reservation((model.User) faculty3, equipment14, localDateTime21, localDateTime22, pricingStrategy23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2810");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getEquipmentId();
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.String str13 = equipment3.getStatus();
        model.SensorUpdate sensorUpdate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Maintenance" + "'", str13, "Maintenance");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2811");
        model.Faculty faculty3 = new model.Faculty("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9f8a7cb7-ec03-4354-aac7-a2aa3455fb18, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2812");
        model.LabManager labManager3 = new model.LabManager("User{userId=629f7fbb-f5fc-468d-9577-c8df2a23b443, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=eb321398-f17f-4482-bf1c-db03bfde9278, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2813");
        model.Student student3 = new model.Student("User{userId=a74c49b8-a5f0-457d-85b2-eb1dddb43fd1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2814");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getRole();
        java.lang.String str8 = labManager5.getRole();
        java.lang.String str9 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LabManager" + "'", str8, "LabManager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2815");
        model.Guest guest3 = new model.Guest("Guest", "Available", "Student");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        guest3.setPasswordHash("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        double double8 = guest3.getHourlyRate();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment12.isModifyAvailable(localDateTime13, localDateTime14, "Faculty", reservation16);
        equipment12.setLabLocation("Faculty");
        java.lang.String str20 = equipment12.getDescription();
        java.lang.String str21 = equipment12.getEquipmentId();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment12.isModifyAvailable(localDateTime22, localDateTime23, "INACTIVE", reservation25);
        state.EquipmentState equipmentState27 = equipment12.getCurrentState();
        model.Equipment equipment31 = new model.Equipment("", "", "");
        equipment31.enable();
        equipment31.enable();
        java.lang.String str34 = equipment31.getStatus();
        java.lang.String str35 = equipment31.getStatus();
        java.lang.String str36 = equipment31.getDescription();
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment40.isModifyAvailable(localDateTime47, localDateTime48, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation50);
        java.lang.String str52 = equipment40.toString();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment40.isAvailable(localDateTime53, localDateTime54, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState57 = equipment40.getCurrentState();
        equipment31.setState(equipmentState57);
        equipment12.setState(equipmentState57);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        strategy.PricingStrategy pricingStrategy62 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation63 = new model.Reservation((model.User) guest3, equipment12, localDateTime60, localDateTime61, pricingStrategy62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Available" + "'", str34, "Available");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Available" + "'", str35, "Available");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str52, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(equipmentState57);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2816");
        model.LabManager labManager3 = new model.LabManager("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = labManager3.getEmail();
        java.lang.String str5 = labManager3.toString();
        labManager3.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        java.lang.String str19 = labManager13.getRole();
        java.lang.String str20 = labManager13.getRole();
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager26.markMaintenance(equipment30);
        double double32 = labManager26.getHourlyRate();
        java.lang.String str33 = labManager26.getRole();
        double double34 = labManager26.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator38 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager40 = headLabCoordinator38.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment44 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment44.isModifyAvailable(localDateTime45, localDateTime46, "Faculty", reservation48);
        equipment44.setLabLocation("Faculty");
        labManager40.setEquipmentStatus(equipment44, "");
        equipment44.notifyObservers();
        labManager26.addEquipment(equipment44);
        labManager13.setEquipmentStatus(equipment44, "Guest");
        java.lang.String str58 = equipment44.getDescription();
        equipment44.notifyObservers();
        labManager3.addEquipment(equipment44);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}" + "'", str4, "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
// flaky "56) test2816(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=51cbbb47-5180-4f76-aa2c-4d505de22e42, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}" + "'", str5, "User{userId=51cbbb47-5180-4f76-aa2c-4d505de22e42, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LabManager" + "'", str20, "LabManager");
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "LabManager" + "'", str33, "LabManager");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2817");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        equipment21.notifyObservers();
        labManager5.markMaintenance(equipment21);
        java.lang.String str33 = labManager5.getEmail();
        model.Equipment equipment37 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "LM-CERT");
        labManager5.markMaintenance(equipment37);
        model.SensorUpdate sensorUpdate39 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment37.applySensorUpdate(sensorUpdate39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2818");
        model.Researcher researcher3 = new model.Researcher("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "");
        boolean boolean4 = researcher3.isActive();
        boolean boolean5 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2819");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.lang.String str25 = equipment22.getStatus();
        equipment22.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        equipment22.enable();
        equipment22.setLabLocation("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str31 = equipment22.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str31, "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2820");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        java.util.UUID uUID4 = researcher3.getUserId();
        researcher3.setActive(false);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "57) test2820(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "d5a83bf5-ea93-4478-ae8f-3f5fb27b17d6");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2821");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = labManager10.getRole();
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment15.isModifyAvailable(localDateTime16, localDateTime17, "Faculty", reservation19);
        equipment15.setLabLocation("Faculty");
        java.lang.String str23 = equipment15.getDescription();
        java.lang.String str24 = equipment15.getEquipmentId();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment15.isModifyAvailable(localDateTime25, localDateTime26, "INACTIVE", reservation28);
        state.EquipmentState equipmentState30 = equipment15.getCurrentState();
        java.lang.String str31 = equipment15.toString();
        labManager10.addEquipment(equipment15);
        double double33 = labManager10.getHourlyRate();
        java.lang.String str34 = labManager10.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Temp123!" + "'", str34, "Temp123!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2822");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager12 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        java.lang.String str24 = labManager18.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment34.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        equipment34.setLabLocation("Faculty");
        labManager30.setEquipmentStatus(equipment34, "");
        equipment34.notifyObservers();
        labManager18.markMaintenance(equipment34);
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.lang.String str50 = equipment49.getDescription();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment49.isModifyAvailable(localDateTime51, localDateTime52, "hi!", reservation54);
        java.lang.String str56 = equipment49.getEquipmentId();
        java.lang.String str57 = equipment49.getLabLocation();
        labManager18.markMaintenance(equipment49);
        model.Equipment equipment62 = new model.Equipment("", "", "");
        equipment62.enable();
        labManager18.addEquipment(equipment62);
        labManager12.markMaintenance(equipment62);
        java.lang.String str66 = labManager12.getRole();
        model.Researcher researcher70 = new model.Researcher("", "hi!", "hi!");
        researcher70.setEmail("hi!");
        java.lang.String str73 = researcher70.getRole();
        java.lang.String str74 = researcher70.getIdOrCertNumber();
        boolean boolean75 = researcher70.isActive();
        model.Student student79 = new model.Student("", "hi!", "");
        java.lang.String str80 = student79.getEmail();
        java.util.UUID uUID81 = student79.getUserId();
        researcher70.setUserId(uUID81);
        labManager12.setUserId(uUID81);
        model.Guest guest87 = new model.Guest("", "hi!", "hi!");
        java.lang.String str88 = guest87.getRole();
        double double89 = guest87.getHourlyRate();
        java.lang.String str90 = guest87.getRole();
        java.util.UUID uUID91 = guest87.getUserId();
        labManager12.setUserId(uUID91);
        headLabCoordinator3.setUserId(uUID91);
        double double94 = headLabCoordinator3.getHourlyRate();
        java.lang.String str95 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LM-CERT" + "'", str24, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "LabManager" + "'", str66, "LabManager");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Researcher" + "'", str73, "Researcher");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(uUID81);
// flaky "58) test2822(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID81.toString(), "0b720db8-90fb-4c11-93cf-dd761fdc29f5");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Guest" + "'", str88, "Guest");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 25.0d + "'", double89 == 25.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Guest" + "'", str90, "Guest");
        org.junit.Assert.assertNotNull(uUID91);
// flaky "11) test2822(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID91.toString(), "a13c88d0-2440-4c6c-8998-17c704c2fcfa");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "ACTIVE" + "'", str95, "ACTIVE");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2823");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment16.isModifyAvailable(localDateTime17, localDateTime18, "Faculty", reservation20);
        equipment16.setLabLocation("Faculty");
        labManager12.setEquipmentStatus(equipment16, "Guest");
        java.util.UUID uUID26 = labManager12.getUserId();
        faculty3.setUserId(uUID26);
        double double28 = faculty3.getHourlyRate();
        faculty3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(uUID26);
// flaky "59) test2823(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID26.toString(), "40b3ed70-f2d1-40f3-b4e2-7509dad1218e");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 20.0d + "'", double28 == 20.0d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2824");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        equipment3.setLabLocation("User{userId=6d11d2d8-000a-4498-88ff-7e3b9b1e820b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertNotNull(equipmentState4);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2825");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2826");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        labManager5.setEmail("LM-CERT");
        model.Equipment equipment14 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str15 = equipment14.getStatus();
        equipment14.markMaintenance();
        labManager5.addEquipment(equipment14);
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment21.isModifyAvailable(localDateTime29, localDateTime30, "", reservation32);
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment21.detach(equipmentObserver34);
        labManager5.addEquipment(equipment21);
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID43 = null;
        headLabCoordinator40.setUserId(uUID43);
        model.LabManager labManager46 = headLabCoordinator40.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        equipment50.enable();
        labManager46.addEquipment(equipment50);
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        java.lang.String str63 = equipment56.getDescription();
        state.EquipmentState equipmentState64 = equipment56.getCurrentState();
        equipment56.setLabLocation("Student");
        labManager46.setEquipmentStatus(equipment56, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager5.setEquipmentStatus(equipment56, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID71 = labManager5.getUserId();
        java.lang.String str72 = labManager5.getIdOrCertNumber();
        java.util.UUID uUID73 = labManager5.getUserId();
        java.lang.String str74 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState64);
        org.junit.Assert.assertNotNull(uUID71);
// flaky "60) test2826(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID71.toString(), "321c82f6-0b4a-4156-a81f-389c8ed9e05e");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LM-CERT" + "'", str72, "LM-CERT");
        org.junit.Assert.assertNotNull(uUID73);
// flaky "12) test2826(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID73.toString(), "321c82f6-0b4a-4156-a81f-389c8ed9e05e");
// flaky "5) test2826(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "User{userId=321c82f6-0b4a-4156-a81f-389c8ed9e05e, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str74, "User{userId=321c82f6-0b4a-4156-a81f-389c8ed9e05e, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2827");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        java.lang.String str20 = equipment10.getEquipmentId();
        java.lang.String str21 = equipment10.getEquipmentId();
        java.lang.String str22 = equipment10.getStatus();
        labManager6.addEquipment(equipment10);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment27.isModifyAvailable(localDateTime34, localDateTime35, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation37);
        observer.EquipmentObserver equipmentObserver39 = null;
        equipment27.attach(equipmentObserver39);
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment27.detach(equipmentObserver41);
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment27.detach(equipmentObserver43);
        labManager6.setEquipmentStatus(equipment27, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        equipment50.enable();
        equipment50.enable();
        java.lang.String str53 = equipment50.getStatus();
        java.lang.String str54 = equipment50.getDescription();
        equipment50.setDescription("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment50.attach(equipmentObserver57);
        state.EquipmentState equipmentState59 = equipment50.getCurrentState();
        state.EquipmentState equipmentState60 = equipment50.getCurrentState();
        equipment27.setState(equipmentState60);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Available" + "'", str53, "Available");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(equipmentState59);
        org.junit.Assert.assertNotNull(equipmentState60);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2828");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = headLabCoordinator3.getRole();
        java.lang.String str10 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2829");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        guest3.setEmail("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str11 = guest3.getIdOrCertNumber();
        java.lang.String str12 = guest3.getRole();
        java.lang.String str13 = guest3.getRole();
        java.lang.String str14 = guest3.getIdOrCertNumber();
        java.lang.String str15 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2830");
        model.Student student3 = new model.Student("User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2831");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        boolean boolean8 = researcher3.isActive();
        model.Student student12 = new model.Student("", "hi!", "");
        java.lang.String str13 = student12.getEmail();
        java.util.UUID uUID14 = student12.getUserId();
        researcher3.setUserId(uUID14);
        double double16 = researcher3.getHourlyRate();
        double double17 = researcher3.getHourlyRate();
        double double18 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "61) test2831(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID14.toString(), "45fe0d57-6120-4e89-be76-bd9d8a95405a");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2832");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getEquipmentId();
        java.lang.String str12 = equipment3.getStatus();
        equipment3.setLabLocation("Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Available" + "'", str12, "Available");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2833");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        double double11 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2834");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        model.Equipment equipment14 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str15 = equipment14.getLabLocation();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment14.detach(equipmentObserver16);
        equipment14.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment14.getLabLocation();
        java.lang.String str21 = equipment14.toString();
        labManager5.setEquipmentStatus(equipment14, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str24 = equipment14.getEquipmentId();
        equipment14.enable();
        equipment14.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ACTIVE" + "'", str24, "ACTIVE");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2835");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        model.Faculty faculty9 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str10 = faculty9.getRole();
        faculty9.setIdOrCertNumber("");
        java.lang.String str13 = faculty9.getIdOrCertNumber();
        java.lang.String str14 = faculty9.getRole();
        java.lang.String str15 = faculty9.getPasswordHash();
        double double16 = faculty9.getHourlyRate();
        java.util.UUID uUID17 = faculty9.getUserId();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager27 = headLabCoordinator25.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID28 = null;
        headLabCoordinator25.setUserId(uUID28);
        model.LabManager labManager31 = headLabCoordinator25.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager33 = headLabCoordinator25.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID34 = labManager33.getUserId();
        headLabCoordinator21.setUserId(uUID34);
        faculty9.setUserId(uUID34);
        researcher3.setUserId(uUID34);
        double double38 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(uUID17);
// flaky "62) test2835(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID17.toString(), "db297ab8-1959-4dc8-b2df-0a284158f232");
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNotNull(uUID34);
// flaky "13) test2835(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID34.toString(), "6d66bdec-095c-4f17-b27f-4a2c56311932");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 15.0d + "'", double38 == 15.0d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2836");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "", "Student");
        double double4 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setPasswordHash("User{userId=43056773-f0a0-4320-8fee-cfa0076f413d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2837");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7b8dee7f-07c7-4251-8ad6-f865b94d4b4f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=307c1565-1f9b-4e77-84b3-a5ca3b65e0cd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2838");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.toString();
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
// flaky "63) test2838(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=29c65afa-dc4f-4bb3-8e6c-595f8600585d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str7, "User{userId=29c65afa-dc4f-4bb3-8e6c-595f8600585d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2839");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        labManager5.addEquipment(equipment9);
        java.lang.String str11 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2840");
        model.Guest guest3 = new model.Guest("User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2841");
        model.Researcher researcher3 = new model.Researcher("User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=f7c16be4-86ab-427d-b1a2-cdf03b470e00, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2842");
        model.Faculty faculty3 = new model.Faculty("", "User{userId=af26f200-ffb1-4824-b684-fc4266d3e7da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Guest', status=''}");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2843");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2844");
        model.Faculty faculty3 = new model.Faculty("User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "User{userId=184e30c2-a69c-4f1f-9887-026cbd4ed4bb, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2845");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState11);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2846");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2847");
        model.Guest guest3 = new model.Guest("User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2848");
        model.Guest guest3 = new model.Guest("User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2849");
        model.Faculty faculty3 = new model.Faculty("User{userId=ec0deee8-7bc2-4708-b44e-d2d061b51121, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "Equipment{equipmentId='ACTIVE', description='User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2850");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.disable();
        labManager3.addEquipment(equipment7);
        equipment7.setStatus("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2851");
        model.Student student3 = new model.Student("User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7f1b84d1-159a-4211-a3df-b6f9b1a96c0e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2852");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        java.lang.String str21 = equipment3.getEquipmentId();
        java.lang.String str22 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment3.isModifyAvailable(localDateTime23, localDateTime24, "User{userId=9f4644ed-2d37-4a6b-9fd1-0563c3568bcf, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", reservation26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str22, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2853");
        model.LabManager labManager3 = new model.LabManager("User{userId=37ffc006-9dc0-479a-b401-aaea8c331831, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2854");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.util.UUID uUID6 = guest3.getUserId();
        boolean boolean7 = guest3.isActive();
        java.lang.String str8 = guest3.getPasswordHash();
        java.lang.String str9 = guest3.getEmail();
        java.lang.String str10 = guest3.getPasswordHash();
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "64) test2854(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID6.toString(), "bb821617-6045-4890-8922-9b27c6de822f");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2855");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.lang.String str14 = equipment13.getDescription();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment13.isModifyAvailable(localDateTime15, localDateTime16, "hi!", reservation18);
        java.lang.String str20 = equipment13.getEquipmentId();
        equipment13.setStatus("");
        java.lang.String str23 = equipment13.getStatus();
        labManager5.addEquipment(equipment13);
        equipment13.setLabLocation("LabManager");
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment13.attach(equipmentObserver27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean32 = equipment13.isAvailable(localDateTime29, localDateTime30, "User{userId=085f7048-a388-4934-b99b-b7ad4fbf0cf9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2856");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getStatus();
        java.lang.String str8 = faculty3.getIdOrCertNumber();
        java.lang.String str9 = faculty3.getRole();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2857");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getRole();
        java.util.UUID uUID11 = guest3.getUserId();
        java.lang.String str12 = guest3.getRole();
        java.lang.String str13 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "65) test2857(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "7ad022f7-4c63-497b-8d2d-8dfddd9445cd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2858");
        model.Student student3 = new model.Student("User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student7 = new model.Student("", "hi!", "");
        java.lang.String str8 = student7.getEmail();
        double double9 = student7.getHourlyRate();
        boolean boolean10 = student7.isActive();
        java.util.UUID uUID11 = student7.getUserId();
        student3.setUserId(uUID11);
        java.lang.String str13 = student3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "66) test2858(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID11.toString(), "755abd3c-9ba4-416c-bf65-430b75c880f7");
// flaky "14) test2858(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=755abd3c-9ba4-416c-bf65-430b75c880f7, email='User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}" + "'", str13, "User{userId=755abd3c-9ba4-416c-bf65-430b75c880f7, email='User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2859");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.getPasswordHash();
        java.lang.String str5 = researcher3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2860");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator13 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager15 = headLabCoordinator13.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID16 = null;
        headLabCoordinator13.setUserId(uUID16);
        model.LabManager labManager19 = headLabCoordinator13.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager21 = headLabCoordinator13.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager23 = headLabCoordinator13.autoGenerateManagerAccount("INACTIVE");
        java.lang.String str24 = labManager23.getRole();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        labManager30.markMaintenance(equipment34);
        java.lang.String str36 = labManager30.getRole();
        java.lang.String str37 = labManager30.getRole();
        model.HeadLabCoordinator headLabCoordinator41 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager43 = headLabCoordinator41.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        labManager43.markMaintenance(equipment47);
        double double49 = labManager43.getHourlyRate();
        java.lang.String str50 = labManager43.getRole();
        double double51 = labManager43.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator55 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager57 = headLabCoordinator55.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment61.isModifyAvailable(localDateTime62, localDateTime63, "Faculty", reservation65);
        equipment61.setLabLocation("Faculty");
        labManager57.setEquipmentStatus(equipment61, "");
        equipment61.notifyObservers();
        labManager43.addEquipment(equipment61);
        labManager30.setEquipmentStatus(equipment61, "Guest");
        model.Equipment equipment78 = new model.Equipment("", "", "");
        equipment78.enable();
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment78.isModifyAvailable(localDateTime80, localDateTime81, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation83);
        equipment78.setDescription("ACTIVE");
        labManager30.setEquipmentStatus(equipment78, "Researcher");
        labManager23.addEquipment(equipment78);
        state.EquipmentState equipmentState90 = equipment78.getCurrentState();
        labManager5.setEquipmentStatus(equipment78, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        java.lang.String str93 = labManager5.getRole();
        java.lang.String str94 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "LabManager" + "'", str50, "LabManager");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(labManager57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(equipmentState90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "LabManager" + "'", str93, "LabManager");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "LabManager" + "'", str94, "LabManager");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2861");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        labManager5.setEquipmentStatus(equipment27, "Guest");
        labManager5.setPasswordHash("");
        java.lang.String str38 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ACTIVE" + "'", str38, "ACTIVE");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2862");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.addEquipment(equipment25);
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.lang.String str37 = equipment30.getEquipmentId();
        equipment30.setStatus("");
        state.EquipmentState equipmentState40 = equipment30.getCurrentState();
        equipment25.setState(equipmentState40);
        equipment3.setState(equipmentState40);
        equipment3.setDescription("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean48 = equipment3.isAvailable(localDateTime45, localDateTime46, "User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str49 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment3.detach(equipmentObserver50);
        equipment3.setLabLocation("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment3.isAvailable(localDateTime54, localDateTime55, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str49, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2863");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "LabManager", reservation14);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.lang.String str18 = equipment3.toString();
        java.lang.String str19 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.attach(equipmentObserver20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Available" + "'", str19, "Available");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2864");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d28aad2a-1471-4722-b1f1-bb9f785de1a8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2865");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("hi!");
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getRole();
        guest3.setActive(true);
        java.lang.String str11 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2866");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=090698b7-4713-4874-b7d9-bb772231c198, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean15 = headLabCoordinator3.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2867");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double10 = headLabCoordinator3.getHourlyRate();
        java.lang.String str11 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2868");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2869");
        model.Student student3 = new model.Student("", "Researcher", "hi!");
        student3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2870");
        model.Faculty faculty3 = new model.Faculty("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=eb321398-f17f-4482-bf1c-db03bfde9278, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "INACTIVE");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2871");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        java.lang.String str24 = labManager18.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment34.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        equipment34.setLabLocation("Faculty");
        labManager30.setEquipmentStatus(equipment34, "");
        equipment34.notifyObservers();
        labManager18.markMaintenance(equipment34);
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment34.attach(equipmentObserver46);
        // The following exception was thrown during execution in test generation
        try {
            labManager5.markMaintenance(equipment34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LM-CERT" + "'", str24, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2872");
        model.Equipment equipment3 = new model.Equipment("User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=939a1235-014f-498a-be6b-747f2c3aa659, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2873");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "Guest");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2874");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment12.isModifyAvailable(localDateTime13, localDateTime14, "Faculty", reservation16);
        equipment12.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment12.isModifyAvailable(localDateTime20, localDateTime21, "", reservation23);
        labManager5.markMaintenance(equipment12);
        double double26 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager32.setActive(true);
        java.lang.String str35 = labManager32.getStatus();
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment39.isModifyAvailable(localDateTime40, localDateTime41, "Faculty", reservation43);
        equipment39.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment39.isModifyAvailable(localDateTime47, localDateTime48, "", reservation50);
        labManager32.markMaintenance(equipment39);
        equipment39.notifyObservers();
        equipment39.markMaintenance();
        labManager5.markMaintenance(equipment39);
        state.EquipmentState equipmentState56 = equipment39.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ACTIVE" + "'", str35, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(equipmentState56);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2875");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "", "");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2876");
        model.Guest guest3 = new model.Guest("User{userId=d62c0614-e302-4eee-94d2-5aa7b4144e53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2877");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        boolean boolean12 = headLabCoordinator3.isActive();
        java.lang.String str13 = headLabCoordinator3.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "67) test2877(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=239ccd65-d159-47fa-88ed-c8f7e4af40e3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str13, "User{userId=239ccd65-d159-47fa-88ed-c8f7e4af40e3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2878");
        model.Student student3 = new model.Student("User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f6909f80-0a53-4885-b35e-a5995f6cbaf6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.Researcher researcher7 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.lang.String str8 = researcher7.getRole();
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment18.isModifyAvailable(localDateTime19, localDateTime20, "Faculty", reservation22);
        equipment18.setLabLocation("Faculty");
        labManager14.setEquipmentStatus(equipment18, "Guest");
        model.Equipment equipment31 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment31);
        boolean boolean33 = labManager14.isActive();
        java.lang.String str34 = labManager14.getIdOrCertNumber();
        model.Faculty faculty38 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str39 = faculty38.getRole();
        faculty38.setIdOrCertNumber("");
        java.lang.String str42 = faculty38.getIdOrCertNumber();
        java.lang.String str43 = faculty38.getRole();
        java.lang.String str44 = faculty38.getPasswordHash();
        double double45 = faculty38.getHourlyRate();
        java.util.UUID uUID46 = faculty38.getUserId();
        labManager14.setUserId(uUID46);
        researcher7.setUserId(uUID46);
        student3.setUserId(uUID46);
        double double50 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "LM-CERT" + "'", str34, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Faculty" + "'", str43, "Faculty");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertNotNull(uUID46);
// flaky "68) test2878(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID46.toString(), "be9172b8-05fd-4dd6-a5f9-893a1b1644d1");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2879");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.lang.String str25 = equipment22.getLabLocation();
        equipment22.enable();
        java.lang.String str27 = equipment22.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Available" + "'", str27, "Available");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2880");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        equipment3.disable();
        equipment3.notifyObservers();
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        java.lang.String str17 = equipment3.toString();
        state.EquipmentState equipmentState18 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.attach(equipmentObserver19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}" + "'", str17, "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
        org.junit.Assert.assertNotNull(equipmentState18);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2881");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        labManager5.markMaintenance(equipment17);
        double double20 = labManager5.getHourlyRate();
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.lang.String str32 = equipment24.getDescription();
        java.lang.String str33 = equipment24.getEquipmentId();
        java.lang.String str34 = equipment24.getDescription();
        observer.EquipmentObserver equipmentObserver35 = null;
        equipment24.detach(equipmentObserver35);
        java.lang.String str37 = equipment24.getLabLocation();
        equipment24.disable();
        labManager5.markMaintenance(equipment24);
        java.lang.String str40 = labManager5.getRole();
        double double41 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2882");
        model.Guest guest3 = new model.Guest("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        guest3.setPasswordHash("User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2883");
        model.Student student3 = new model.Student("User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2884");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "", reservation14);
        java.lang.String str16 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment3.isModifyAvailable(localDateTime19, localDateTime20, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation22);
        equipment3.setStatus("User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2885");
        model.LabManager labManager3 = new model.LabManager("User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c709a753-175d-4244-a4d1-809d72ae7cc0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.Class<?> wildcardClass4 = labManager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2886");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setActive(false);
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment11.isModifyAvailable(localDateTime12, localDateTime13, "Faculty", reservation15);
        equipment11.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment11.isModifyAvailable(localDateTime19, localDateTime20, "", reservation22);
        labManager5.addEquipment(equipment11);
        double double25 = labManager5.getHourlyRate();
        java.lang.String str26 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2887");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.toString();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment13 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment13.markMaintenance();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment19.isModifyAvailable(localDateTime20, localDateTime21, "Faculty", reservation23);
        equipment19.setLabLocation("Faculty");
        java.lang.String str27 = equipment19.getDescription();
        java.lang.String str28 = equipment19.getEquipmentId();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment19.isModifyAvailable(localDateTime29, localDateTime30, "INACTIVE", reservation32);
        java.lang.String str34 = equipment19.getEquipmentId();
        labManager9.addEquipment(equipment19);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
// flaky "69) test2887(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=f722108d-cd3a-47c7-9185-78959f57e1a0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str7, "User{userId=f722108d-cd3a-47c7-9185-78959f57e1a0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2888");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        faculty3.setIdOrCertNumber("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "70) test2888(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "da2916b8-f778-4c25-a00a-b2e61aa63507");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2889");
        model.Faculty faculty3 = new model.Faculty("User{userId=251d8690-b3fc-4d86-b2b4-64e468b4dbfc, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2890");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2891");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2892");
        model.Guest guest3 = new model.Guest("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6d11d2d8-000a-4498-88ff-7e3b9b1e820b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "");
        java.lang.String str4 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2893");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e66add75-7741-400c-88d2-105d5e18ca95, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2894");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        boolean boolean24 = labManager5.isActive();
        labManager5.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment30.isModifyAvailable(localDateTime37, localDateTime38, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation40);
        java.lang.String str42 = equipment30.toString();
        labManager5.addEquipment(equipment30);
        equipment30.setLabLocation("Faculty");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment49.isModifyAvailable(localDateTime50, localDateTime51, "Faculty", reservation53);
        equipment49.setLabLocation("Faculty");
        java.lang.String str57 = equipment49.getDescription();
        java.lang.String str58 = equipment49.getEquipmentId();
        equipment49.notifyObservers();
        equipment49.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState62 = equipment49.getCurrentState();
        equipment30.setState(equipmentState62);
        observer.EquipmentObserver equipmentObserver64 = null;
        equipment30.attach(equipmentObserver64);
        equipment30.setStatus("User{userId=3435c72d-d18c-4cd4-887f-647055afd156, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(equipmentState62);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2895");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.setActive(true);
        double double14 = labManager11.getHourlyRate();
        labManager11.setActive(true);
        model.Equipment equipment20 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str21 = equipment20.getLabLocation();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment20.detach(equipmentObserver22);
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment20.detach(equipmentObserver24);
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        labManager31.addEquipment(equipment35);
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        java.lang.String str47 = equipment40.getDescription();
        equipment40.setStatus("Researcher");
        labManager31.addEquipment(equipment40);
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        labManager56.addEquipment(equipment60);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        java.lang.String str66 = equipment65.getDescription();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment65.isModifyAvailable(localDateTime67, localDateTime68, "hi!", reservation70);
        java.lang.String str72 = equipment65.getEquipmentId();
        equipment65.setStatus("");
        state.EquipmentState equipmentState75 = equipment65.getCurrentState();
        equipment60.setState(equipmentState75);
        equipment40.setState(equipmentState75);
        equipment20.setState(equipmentState75);
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        boolean boolean82 = equipment20.isAvailable(localDateTime79, localDateTime80, "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.addEquipment(equipment20);
        java.lang.String str84 = equipment20.getEquipmentId();
        observer.EquipmentObserver equipmentObserver85 = null;
        equipment20.detach(equipmentObserver85);
        java.lang.String str87 = equipment20.toString();
        java.lang.String str88 = equipment20.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(equipmentState75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ACTIVE" + "'", str84, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}" + "'", str87, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2896");
        model.Faculty faculty3 = new model.Faculty("User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2897");
        model.LabManager labManager3 = new model.LabManager("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a439f2ca-eba6-4ac1-8170-cc60ce20f2f1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID10 = null;
        headLabCoordinator7.setUserId(uUID10);
        model.LabManager labManager13 = headLabCoordinator7.autoGenerateManagerAccount("ACTIVE");
        labManager13.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        equipment19.enable();
        equipment19.enable();
        java.lang.String str22 = equipment19.getStatus();
        equipment19.markMaintenance();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment19.attach(equipmentObserver24);
        java.lang.String str26 = equipment19.getStatus();
        java.lang.String str27 = equipment19.getLabLocation();
        labManager13.addEquipment(equipment19);
        double double29 = labManager13.getHourlyRate();
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.lang.String str34 = equipment33.getDescription();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment33.isModifyAvailable(localDateTime35, localDateTime36, "hi!", reservation38);
        equipment33.disable();
        java.lang.String str41 = equipment33.getEquipmentId();
        java.lang.String str42 = equipment33.getDescription();
        equipment33.notifyObservers();
        labManager13.addEquipment(equipment33);
        equipment33.setStatus("User{userId=9c2a6913-41cb-415b-928c-a5ec33d3400d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        labManager3.markMaintenance(equipment33);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Maintenance" + "'", str26, "Maintenance");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2898");
        model.Student student3 = new model.Student("User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2899");
        model.Student student3 = new model.Student("User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d1f0e6e1-3c32-4a1e-8def-0331f056a9ec, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2900");
        model.Student student3 = new model.Student("User{userId=2203a4c0-197b-4510-a1ad-f5e4b7215c16, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2901");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        labManager9.setEquipmentStatus(equipment19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        equipment35.disable();
        equipment35.enable();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment35.isAvailable(localDateTime44, localDateTime45, "");
        labManager9.addEquipment(equipment35);
        observer.EquipmentObserver equipmentObserver49 = null;
        equipment35.attach(equipmentObserver49);
        equipment35.setStatus("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment35.setDescription("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment35.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2902");
        model.Guest guest3 = new model.Guest("User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "INACTIVE");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2903");
        model.Equipment equipment3 = new model.Equipment("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=24fef356-e371-4e89-9d24-1ebb8462b5b5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2904");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        labManager5.setEquipmentStatus(equipment27, "Guest");
        equipment27.notifyObservers();
        java.lang.String str37 = equipment27.getStatus();
        java.lang.String str38 = equipment27.getLabLocation();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean42 = equipment27.isAvailable(localDateTime39, localDateTime40, "User{userId=eb6fc337-1003-47b7-b3f1-2ceb2830d470, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
        model.SensorUpdate sensorUpdate43 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment27.applySensorUpdate(sensorUpdate43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Guest" + "'", str37, "Guest");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2905");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        java.util.UUID uUID19 = labManager5.getUserId();
        java.lang.String str20 = labManager5.getIdOrCertNumber();
        double double21 = labManager5.getHourlyRate();
        model.Equipment equipment25 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.lang.String str30 = equipment29.getStatus();
        state.EquipmentState equipmentState31 = equipment29.getCurrentState();
        equipment25.setState(equipmentState31);
        labManager5.setEquipmentStatus(equipment25, "User{userId=d62c0614-e302-4eee-94d2-5aa7b4144e53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "71) test2905(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID19.toString(), "71ec94ff-fbf9-4193-bc8e-46cc641c96a6");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LM-CERT" + "'", str20, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Available" + "'", str30, "Available");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2906");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        java.lang.String str24 = labManager5.getRole();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        java.lang.String str35 = equipment28.getEquipmentId();
        equipment28.setStatus("");
        labManager5.addEquipment(equipment28);
        java.lang.String str39 = labManager5.getEmail();
        model.Equipment equipment43 = new model.Equipment("", "", "");
        observer.EquipmentObserver equipmentObserver44 = null;
        equipment43.detach(equipmentObserver44);
        labManager5.setEquipmentStatus(equipment43, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str48 = labManager5.getRole();
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment52.isModifyAvailable(localDateTime53, localDateTime54, "Faculty", reservation56);
        equipment52.setLabLocation("Faculty");
        equipment52.notifyObservers();
        observer.EquipmentObserver equipmentObserver61 = null;
        equipment52.attach(equipmentObserver61);
        java.lang.String str63 = equipment52.getEquipmentId();
        java.lang.String str64 = equipment52.getLabLocation();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        boolean boolean68 = equipment52.isAvailable(localDateTime65, localDateTime66, "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment52.setLabLocation("User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        // The following exception was thrown during execution in test generation
        try {
            labManager5.markMaintenance(equipment52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LabManager" + "'", str48, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Faculty" + "'", str64, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2907");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
        boolean boolean4 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2908");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Student student13 = new model.Student("", "hi!", "");
        java.lang.String str14 = student13.getEmail();
        java.util.UUID uUID15 = student13.getUserId();
        labManager9.setUserId(uUID15);
        java.lang.String str17 = labManager9.getRole();
        labManager9.setPasswordHash("User{userId=085f7048-a388-4934-b99b-b7ad4fbf0cf9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "72) test2908(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID15.toString(), "c765fa9e-ad0c-40cc-b889-70b5ed62826d");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LabManager" + "'", str17, "LabManager");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2909");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str21 = labManager5.getRole();
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.lang.String str26 = equipment25.getDescription();
        equipment25.disable();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment25.isModifyAvailable(localDateTime28, localDateTime29, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", reservation31);
        labManager5.addEquipment(equipment25);
        double double34 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2910");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        equipment3.notifyObservers();
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Disabled" + "'", str8, "Disabled");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2911");
        model.Equipment equipment3 = new model.Equipment("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2912");
        model.Equipment equipment3 = new model.Equipment("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.SensorUpdate sensorUpdate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2913");
        model.Guest guest3 = new model.Guest("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2914");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        java.lang.String str17 = equipment9.getEquipmentId();
        labManager5.markMaintenance(equipment9);
        equipment9.setDescription("User{userId=74c1da88-3641-4d4c-87ef-ff7c77d2e098, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2915");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        double double11 = headLabCoordinator3.getHourlyRate();
        java.lang.String str12 = headLabCoordinator3.getPasswordHash();
        double double13 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2916");
        model.Researcher researcher3 = new model.Researcher("User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.util.UUID uUID4 = researcher3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "73) test2916(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "57aaf7e8-a2b1-4ab1-b804-39dc38d13aea");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2917");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "hi!", "");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager11 = headLabCoordinator7.autoGenerateManagerAccount("Available");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.lang.String str16 = equipment15.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment15.isModifyAvailable(localDateTime17, localDateTime18, "hi!", reservation20);
        java.lang.String str22 = equipment15.getDescription();
        state.EquipmentState equipmentState23 = equipment15.getCurrentState();
        equipment15.setLabLocation("Student");
        equipment15.notifyObservers();
        labManager11.addEquipment(equipment15);
        labManager3.addEquipment(equipment15);
        double double29 = labManager3.getHourlyRate();
        labManager3.setPasswordHash("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        double double32 = labManager3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2918");
        model.Researcher researcher3 = new model.Researcher("User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2919");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Maintenance", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2920");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.setActive(true);
        double double14 = labManager11.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        labManager20.setEquipmentStatus(equipment24, "Guest");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager20.addEquipment(equipment37);
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.lang.String str43 = equipment42.getDescription();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment42.isModifyAvailable(localDateTime44, localDateTime45, "hi!", reservation47);
        labManager20.setEquipmentStatus(equipment42, "Guest");
        equipment42.notifyObservers();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean55 = equipment42.isAvailable(localDateTime52, localDateTime53, "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str56 = equipment42.getStatus();
        labManager11.markMaintenance(equipment42);
        model.Equipment equipment61 = new model.Equipment("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        labManager11.addEquipment(equipment61);
        state.EquipmentState equipmentState63 = equipment61.getCurrentState();
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        boolean boolean67 = equipment61.isAvailable(localDateTime64, localDateTime65, "User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Guest" + "'", str56, "Guest");
        org.junit.Assert.assertNotNull(equipmentState63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2921");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ee5fd7dd-6809-40a3-b93c-b75c97a80800, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=50c8e534-0cef-4e1f-8015-4eb5b8d5dfed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2922");
        model.Guest guest3 = new model.Guest("User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2923");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment3.attach(equipmentObserver14);
        java.lang.String str16 = equipment3.getEquipmentId();
        state.EquipmentState equipmentState17 = equipment3.getCurrentState();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2924");
        model.LabManager labManager3 = new model.LabManager("User{userId=3ce5e614-0f76-40d6-809d-db284841ebd4, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3099ec61-f676-4eb7-8ba4-739d3f7f05ea, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2925");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("");
        java.lang.String str12 = labManager11.getRole();
        java.lang.String str13 = labManager11.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2926");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        double double10 = headLabCoordinator3.getHourlyRate();
        java.lang.String str11 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2927");
        model.Faculty faculty3 = new model.Faculty("User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=21ec2b50-3736-473a-8d9d-ad02101846a9, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2928");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        java.lang.String str21 = equipment3.getEquipmentId();
        java.lang.String str22 = equipment3.getEquipmentId();
        equipment3.setStatus("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        state.EquipmentState equipmentState25 = equipment3.getCurrentState();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState25);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2929");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        boolean boolean24 = labManager5.isActive();
        labManager5.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment30.isModifyAvailable(localDateTime37, localDateTime38, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation40);
        java.lang.String str42 = equipment30.toString();
        labManager5.addEquipment(equipment30);
        java.lang.String str44 = labManager5.getRole();
        labManager5.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment50.isModifyAvailable(localDateTime51, localDateTime52, "Faculty", reservation54);
        equipment50.setLabLocation("Faculty");
        java.lang.String str58 = equipment50.getDescription();
        java.lang.String str59 = equipment50.getEquipmentId();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment50.isModifyAvailable(localDateTime60, localDateTime61, "INACTIVE", reservation63);
        java.lang.String str65 = equipment50.getEquipmentId();
        labManager5.markMaintenance(equipment50);
        java.lang.String str67 = labManager5.getIdOrCertNumber();
        labManager5.setEmail("User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID70 = labManager5.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "LabManager" + "'", str44, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str67, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(uUID70);
// flaky "74) test2929(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID70.toString(), "882a2189-c200-423d-81b0-37b00dd46d27");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2930");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        equipment3.notifyObservers();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        labManager21.addEquipment(equipment25);
        equipment25.disable();
        state.EquipmentState equipmentState29 = equipment25.getCurrentState();
        equipment3.setState(equipmentState29);
        model.SensorUpdate sensorUpdate31 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(equipmentState29);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2931");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getEmail();
        student3.setIdOrCertNumber("User{userId=fb93504f-90fa-4dc1-9559-13b7130dfd84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2932");
        model.Researcher researcher3 = new model.Researcher("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2933");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        java.lang.String str6 = faculty3.getRole();
        faculty3.setEmail("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        faculty3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2934");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "", reservation14);
        java.lang.String str16 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        state.EquipmentState equipmentState19 = equipment3.getCurrentState();
        equipment3.disable();
        model.SensorUpdate sensorUpdate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState19);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2935");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getStatus();
        java.lang.String str11 = researcher3.getRole();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        model.Student student25 = new model.Student("", "hi!", "");
        java.lang.String str26 = student25.getEmail();
        java.util.UUID uUID27 = student25.getUserId();
        labManager21.setUserId(uUID27);
        researcher3.setUserId(uUID27);
        java.lang.String str30 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(uUID27);
// flaky "75) test2935(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID27.toString(), "103e77a7-9887-4cf1-8b6e-a98211fdd93e");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2936");
        model.Researcher researcher3 = new model.Researcher("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        boolean boolean4 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2937");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2938");
        model.Student student3 = new model.Student("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.util.UUID uUID4 = student3.getUserId();
        student3.setPasswordHash("User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID4);
// flaky "76) test2938(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID4.toString(), "f09ed11e-80f7-4733-a4de-6428e25ddb98");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2939");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.toString();
        java.lang.String str8 = headLabCoordinator3.getEmail();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
// flaky "77) test2939(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=75ec5999-a291-483c-8e2e-53181e8e373f, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}" + "'", str7, "User{userId=75ec5999-a291-483c-8e2e-53181e8e373f, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2940");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        equipment3.setLabLocation("Student");
        java.lang.String str14 = equipment3.getStatus();
        equipment3.setStatus("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("Equipment{equipmentId='', description='', labLocation='', status='User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2941");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setActive(true);
        double double12 = researcher3.getHourlyRate();
        java.lang.String str13 = researcher3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2942");
        model.Student student3 = new model.Student("User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=1970ee77-5538-497c-88d3-ddfe5131557f, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}", "User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2943");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        java.lang.String str14 = labManager5.toString();
        java.lang.String str15 = labManager5.getRole();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean30 = equipment19.isAvailable(localDateTime27, localDateTime28, "Faculty");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment19.isModifyAvailable(localDateTime31, localDateTime32, "Researcher", reservation34);
        equipment19.setLabLocation("Student");
        equipment19.setDescription("User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment19.setLabLocation("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        labManager5.addEquipment(equipment19);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky "78) test2943(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=82e3b00f-8911-45e6-a155-359671222a4d, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str14, "User{userId=82e3b00f-8911-45e6-a155-359671222a4d, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2944");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Student student13 = new model.Student("", "hi!", "");
        java.lang.String str14 = student13.getEmail();
        java.util.UUID uUID15 = student13.getUserId();
        labManager9.setUserId(uUID15);
        java.lang.String str17 = labManager9.toString();
        java.lang.String str18 = labManager9.getRole();
        java.lang.String str19 = labManager9.getRole();
        model.Student student23 = new model.Student("", "hi!", "");
        double double24 = student23.getHourlyRate();
        java.lang.String str25 = student23.getStatus();
        student23.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.Guest guest31 = new model.Guest("", "hi!", "hi!");
        java.lang.String str32 = guest31.getRole();
        guest31.setEmail("Guest");
        double double35 = guest31.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID42 = null;
        headLabCoordinator39.setUserId(uUID42);
        model.LabManager labManager45 = headLabCoordinator39.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager47 = headLabCoordinator39.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager49 = headLabCoordinator39.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty53 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str54 = faculty53.getStatus();
        boolean boolean55 = faculty53.isActive();
        model.Faculty faculty59 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID60 = faculty59.getUserId();
        faculty53.setUserId(uUID60);
        labManager49.setUserId(uUID60);
        guest31.setUserId(uUID60);
        student23.setUserId(uUID60);
        labManager9.setUserId(uUID60);
        java.lang.Class<?> wildcardClass66 = uUID60.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "79) test2944(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID15.toString(), "e496af55-f55f-4ee1-b25f-0ff04c9c91d7");
// flaky "15) test2944(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=e496af55-f55f-4ee1-b25f-0ff04c9c91d7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=e496af55-f55f-4ee1-b25f-0ff04c9c91d7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "INACTIVE" + "'", str25, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Guest" + "'", str32, "Guest");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 25.0d + "'", double35 == 25.0d);
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ACTIVE" + "'", str54, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(uUID60);
// flaky "6) test2944(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID60.toString(), "5204b5f2-0603-4868-a719-7a377fea31ec");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2945");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID10 = null;
        headLabCoordinator7.setUserId(uUID10);
        model.LabManager labManager13 = headLabCoordinator7.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        equipment17.enable();
        labManager13.addEquipment(equipment17);
        equipment17.disable();
        equipment17.setLabLocation("HeadLabCoordinator");
        equipment17.enable();
        labManager3.addEquipment(equipment17);
        model.SensorUpdate sensorUpdate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment17.applySensorUpdate(sensorUpdate25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2946");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getEmail();
        student3.setPasswordHash("User{userId=89547e3f-6042-4d85-b8a0-d44100c23dc9, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2947");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}" + "'", str5, "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2948");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        labManager17.markMaintenance(equipment21);
        java.lang.String str23 = equipment21.getStatus();
        labManager5.markMaintenance(equipment21);
        boolean boolean25 = labManager5.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Maintenance" + "'", str23, "Maintenance");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2949");
        model.Faculty faculty3 = new model.Faculty("User{userId=0f5bd3bf-c7f0-4231-908d-f716526a8951, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=085f7048-a388-4934-b99b-b7ad4fbf0cf9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2950");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        researcher3.setPasswordHash("User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2951");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment3.getDescription();
        equipment3.setLabLocation("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment3.attach(equipmentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2952");
        model.Researcher researcher3 = new model.Researcher("User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=106c5b83-7ffa-4815-a617-f9fee4e302ba, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2953");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getLabLocation();
        equipment3.setStatus("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2954");
        model.Guest guest3 = new model.Guest("User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "hi!");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2955");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c95a48ac-f685-4594-8490-b4cedb669014, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2956");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getDescription();
        equipment9.notifyObservers();
        java.lang.String str21 = equipment9.getDescription();
        java.lang.Class<?> wildcardClass22 = equipment9.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2957");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double6 = labManager5.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        equipment10.notifyObservers();
        labManager5.addEquipment(equipment10);
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        equipment25.enable();
        java.lang.String str28 = equipment25.getStatus();
        java.lang.String str29 = equipment25.getStatus();
        java.lang.String str30 = equipment25.getDescription();
        equipment25.disable();
        model.HeadLabCoordinator headLabCoordinator35 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager37 = headLabCoordinator35.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment41.isModifyAvailable(localDateTime42, localDateTime43, "Faculty", reservation45);
        equipment41.setLabLocation("Faculty");
        labManager37.setEquipmentStatus(equipment41, "");
        equipment41.setDescription("");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment56.isModifyAvailable(localDateTime57, localDateTime58, "Faculty", reservation60);
        equipment56.setLabLocation("Faculty");
        equipment56.notifyObservers();
        observer.EquipmentObserver equipmentObserver65 = null;
        equipment56.attach(equipmentObserver65);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment56.isModifyAvailable(localDateTime67, localDateTime68, "Faculty", reservation70);
        state.EquipmentState equipmentState72 = equipment56.getCurrentState();
        equipment41.setState(equipmentState72);
        equipment25.setState(equipmentState72);
        equipment10.setState(equipmentState72);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        boolean boolean79 = equipment10.isAvailable(localDateTime76, localDateTime77, "Guest");
        java.lang.String str80 = equipment10.getDescription();
        equipment10.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Available" + "'", str29, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(labManager37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(equipmentState72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2958");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setLabLocation("Researcher");
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment3.isAvailable(localDateTime13, localDateTime14, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2959");
        model.Student student3 = new model.Student("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2960");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setStatus("LabManager");
        java.lang.String str12 = equipment3.getDescription();
        java.lang.String str13 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2961");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getDescription();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        labManager25.addEquipment(equipment29);
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.lang.String str35 = equipment34.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment34.isModifyAvailable(localDateTime36, localDateTime37, "hi!", reservation39);
        java.lang.String str41 = equipment34.getDescription();
        equipment34.setStatus("Researcher");
        labManager25.addEquipment(equipment34);
        model.HeadLabCoordinator headLabCoordinator48 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager50 = headLabCoordinator48.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment54 = new model.Equipment("", "", "");
        labManager50.addEquipment(equipment54);
        model.Equipment equipment59 = new model.Equipment("", "", "");
        java.lang.String str60 = equipment59.getDescription();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment59.isModifyAvailable(localDateTime61, localDateTime62, "hi!", reservation64);
        java.lang.String str66 = equipment59.getEquipmentId();
        equipment59.setStatus("");
        state.EquipmentState equipmentState69 = equipment59.getCurrentState();
        equipment54.setState(equipmentState69);
        equipment34.setState(equipmentState69);
        equipment9.setState(equipmentState69);
        equipment9.disable();
        java.lang.String str74 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(equipmentState69);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}" + "'", str74, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2962");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID15 = null;
        headLabCoordinator12.setUserId(uUID15);
        model.LabManager labManager18 = headLabCoordinator12.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager20 = headLabCoordinator12.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager22 = headLabCoordinator12.autoGenerateManagerAccount("INACTIVE");
        java.lang.String str23 = labManager22.getRole();
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        labManager29.markMaintenance(equipment33);
        java.lang.String str35 = labManager29.getRole();
        java.lang.String str36 = labManager29.getRole();
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        labManager42.markMaintenance(equipment46);
        double double48 = labManager42.getHourlyRate();
        java.lang.String str49 = labManager42.getRole();
        double double50 = labManager42.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment60.isModifyAvailable(localDateTime61, localDateTime62, "Faculty", reservation64);
        equipment60.setLabLocation("Faculty");
        labManager56.setEquipmentStatus(equipment60, "");
        equipment60.notifyObservers();
        labManager42.addEquipment(equipment60);
        labManager29.setEquipmentStatus(equipment60, "Guest");
        model.Equipment equipment77 = new model.Equipment("", "", "");
        equipment77.enable();
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment77.isModifyAvailable(localDateTime79, localDateTime80, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation82);
        equipment77.setDescription("ACTIVE");
        labManager29.setEquipmentStatus(equipment77, "Researcher");
        labManager22.addEquipment(equipment77);
        equipment77.enable();
        equipment77.markMaintenance();
        labManager8.setEquipmentStatus(equipment77, "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver93 = null;
        equipment77.attach(equipmentObserver93);
        // The following exception was thrown during execution in test generation
        try {
            equipment77.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LabManager" + "'", str23, "LabManager");
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LabManager" + "'", str35, "LabManager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LabManager" + "'", str49, "LabManager");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2963");
        model.LabManager labManager3 = new model.LabManager("Student", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID10 = null;
        headLabCoordinator7.setUserId(uUID10);
        model.LabManager labManager13 = headLabCoordinator7.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        equipment17.enable();
        labManager13.addEquipment(equipment17);
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getDescription();
        state.EquipmentState equipmentState31 = equipment23.getCurrentState();
        equipment23.setLabLocation("Student");
        labManager13.setEquipmentStatus(equipment23, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment39.isModifyAvailable(localDateTime40, localDateTime41, "Faculty", reservation43);
        equipment39.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment39.isModifyAvailable(localDateTime47, localDateTime48, "", reservation50);
        equipment39.disable();
        labManager13.addEquipment(equipment39);
        equipment39.disable();
        labManager3.markMaintenance(equipment39);
        double double56 = labManager3.getHourlyRate();
        java.lang.String str57 = labManager3.getPasswordHash();
        labManager3.setIdOrCertNumber("User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str57, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2964");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2965");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment22);
        state.EquipmentState equipmentState24 = equipment22.getCurrentState();
        java.lang.String str25 = equipment22.getStatus();
        equipment22.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        equipment22.enable();
        equipment22.setLabLocation("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str31 = equipment22.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2966");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = headLabCoordinator3.getIdOrCertNumber();
        boolean boolean15 = headLabCoordinator3.isActive();
        headLabCoordinator3.setPasswordHash("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2967");
        model.LabManager labManager3 = new model.LabManager("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=43d45941-45ea-42c1-9f67-2e88448539f4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2968");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setPasswordHash("Maintenance");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.lang.String str16 = equipment15.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment15.isModifyAvailable(localDateTime17, localDateTime18, "hi!", reservation20);
        equipment15.disable();
        equipment15.enable();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean27 = equipment15.isAvailable(localDateTime24, localDateTime25, "");
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager33.addEquipment(equipment37);
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.lang.String str43 = equipment42.getDescription();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment42.isModifyAvailable(localDateTime44, localDateTime45, "hi!", reservation47);
        java.lang.String str49 = equipment42.getEquipmentId();
        equipment42.setStatus("");
        state.EquipmentState equipmentState52 = equipment42.getCurrentState();
        equipment37.setState(equipmentState52);
        equipment15.setState(equipmentState52);
        labManager9.addEquipment(equipment15);
        labManager9.setIdOrCertNumber("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator61 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager63 = headLabCoordinator61.autoGenerateManagerAccount("Guest");
        model.Equipment equipment67 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager63.markMaintenance(equipment67);
        java.lang.String str69 = equipment67.getEquipmentId();
        equipment67.setDescription("INACTIVE");
        observer.EquipmentObserver equipmentObserver72 = null;
        equipment67.detach(equipmentObserver72);
        labManager9.addEquipment(equipment67);
        equipment67.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(equipmentState52);
        org.junit.Assert.assertNotNull(labManager63);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "INACTIVE" + "'", str69, "INACTIVE");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2969");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Student student13 = new model.Student("", "hi!", "");
        java.lang.String str14 = student13.getEmail();
        java.util.UUID uUID15 = student13.getUserId();
        labManager9.setUserId(uUID15);
        java.lang.String str17 = labManager9.toString();
        java.lang.String str18 = labManager9.getRole();
        java.lang.String str19 = labManager9.getRole();
        model.Equipment equipment23 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment23.setLabLocation("ACTIVE");
        java.lang.String str26 = equipment23.getDescription();
        equipment23.markMaintenance();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        strategy.PricingStrategy pricingStrategy30 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation31 = new model.Reservation((model.User) labManager9, equipment23, localDateTime28, localDateTime29, pricingStrategy30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "80) test2969(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID15.toString(), "152727bb-e0c0-4cd6-a2fa-9f09f0166466");
// flaky "16) test2969(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=152727bb-e0c0-4cd6-a2fa-9f09f0166466, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=152727bb-e0c0-4cd6-a2fa-9f09f0166466, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ACTIVE" + "'", str26, "ACTIVE");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2970");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2971");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        java.util.UUID uUID6 = guest3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "81) test2971(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID6.toString(), "46a5c93f-51b0-41e6-bc28-2256683ec641");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2972");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2973");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID9 = headLabCoordinator3.getUserId();
        double double10 = headLabCoordinator3.getHourlyRate();
        java.lang.String str11 = headLabCoordinator3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "82) test2973(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID9.toString(), "be38d8d0-09bb-46fc-8661-8a5a19b7d1b4");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "17) test2973(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=be38d8d0-09bb-46fc-8661-8a5a19b7d1b4, email='Researcher', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str11, "User{userId=be38d8d0-09bb-46fc-8661-8a5a19b7d1b4, email='Researcher', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2974");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str21 = labManager5.getRole();
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.lang.String str26 = equipment25.getDescription();
        equipment25.disable();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment25.isModifyAvailable(localDateTime28, localDateTime29, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", reservation31);
        labManager5.addEquipment(equipment25);
        java.lang.Class<?> wildcardClass34 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2975");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        java.lang.String str13 = headLabCoordinator3.getRole();
        java.lang.String str14 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str17 = headLabCoordinator3.getPasswordHash();
        double double18 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2976");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getDescription();
        model.Equipment equipment11 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str12 = equipment11.getEquipmentId();
        java.lang.String str13 = equipment11.getEquipmentId();
        equipment11.enable();
        state.EquipmentState equipmentState15 = equipment11.getCurrentState();
        equipment3.setState(equipmentState15);
        equipment3.enable();
        equipment3.setLabLocation("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str20 = equipment3.getEquipmentId();
        java.lang.String str21 = equipment3.getEquipmentId();
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2977");
        model.Guest guest3 = new model.Guest("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}", "User{userId=6eada9ec-7c0c-4c7f-a1ec-894f2baf7e80, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2978");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = equipment9.getEquipmentId();
        equipment9.setDescription("INACTIVE");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = equipment9.isAvailable(localDateTime14, localDateTime15, "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "INACTIVE" + "'", str11, "INACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2979");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        double double14 = headLabCoordinator3.getHourlyRate();
        java.lang.String str15 = headLabCoordinator3.getRole();
        model.LabManager labManager17 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8fb7250f-99b4-45ac-9104-fc1d190a24b3, email='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2980");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        equipment3.disable();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        model.Reservation reservation9 = null;
        boolean boolean10 = equipment3.isModifyAvailable(localDateTime6, localDateTime7, "HeadLabCoordinator", reservation9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean14 = equipment3.isAvailable(localDateTime11, localDateTime12, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean18 = equipment3.isAvailable(localDateTime15, localDateTime16, "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2981");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = equipment3.isAvailable(localDateTime14, localDateTime15, "Researcher");
        java.lang.String str18 = equipment3.getStatus();
        equipment3.enable();
        java.lang.Class<?> wildcardClass20 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2982");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        double double24 = labManager18.getHourlyRate();
        java.lang.String str25 = labManager18.getRole();
        double double26 = labManager18.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        labManager32.setEquipmentStatus(equipment36, "");
        equipment36.notifyObservers();
        labManager18.addEquipment(equipment36);
        labManager5.setEquipmentStatus(equipment36, "Guest");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        equipment53.enable();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment53.isModifyAvailable(localDateTime55, localDateTime56, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation58);
        equipment53.setDescription("ACTIVE");
        labManager5.setEquipmentStatus(equipment53, "Researcher");
        java.lang.String str64 = labManager5.getRole();
        double double65 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "LabManager" + "'", str64, "LabManager");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2983");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
        double double6 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2984");
        model.LabManager labManager3 = new model.LabManager("User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "User{userId=f314487c-0f1d-4db6-bc8d-61154327bc96, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2985");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        java.lang.String str9 = faculty3.getRole();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2986");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment9.isModifyAvailable(localDateTime11, localDateTime12, "hi!", reservation14);
        java.lang.String str16 = equipment9.getDescription();
        state.EquipmentState equipmentState17 = equipment9.getCurrentState();
        equipment9.setLabLocation("Student");
        labManager5.setEquipmentStatus(equipment9, "");
        model.Equipment equipment25 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment25.setLabLocation("ACTIVE");
        java.lang.String str28 = equipment25.getEquipmentId();
        labManager5.setEquipmentStatus(equipment25, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str31 = equipment25.toString();
        equipment25.setStatus("User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2987");
        model.Student student3 = new model.Student("User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f6909f80-0a53-4885-b35e-a5995f6cbaf6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        student3.setEmail("User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2988");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        equipment21.notifyObservers();
        labManager5.markMaintenance(equipment21);
        double double33 = labManager5.getHourlyRate();
        labManager5.setIdOrCertNumber("User{userId=777b9370-e1e5-4fd8-a436-2007d0a1d701, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str36 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2989");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "");
        equipment21.notifyObservers();
        labManager5.markMaintenance(equipment21);
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.lang.String str37 = equipment36.getDescription();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment36.isModifyAvailable(localDateTime38, localDateTime39, "hi!", reservation41);
        java.lang.String str43 = equipment36.getEquipmentId();
        java.lang.String str44 = equipment36.getLabLocation();
        labManager5.markMaintenance(equipment36);
        model.Equipment equipment49 = new model.Equipment("", "", "");
        equipment49.enable();
        labManager5.addEquipment(equipment49);
        equipment49.setDescription("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        observer.EquipmentObserver equipmentObserver54 = null;
        equipment49.attach(equipmentObserver54);
        // The following exception was thrown during execution in test generation
        try {
            equipment49.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2990");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getEquipmentId();
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.String str13 = equipment3.getStatus();
        java.lang.String str14 = equipment3.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Maintenance" + "'", str13, "Maintenance");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2991");
        model.Researcher researcher3 = new model.Researcher("LM-CERT", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=11ff8a89-7998-42ec-8171-2ac3d64b4624, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2992");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        equipment3.setStatus("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2993");
        model.Researcher researcher3 = new model.Researcher("User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=e1992ee2-b83b-4993-a977-2c69c5c2df62, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2994");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        java.lang.String str15 = equipment3.toString();
        java.lang.String str16 = equipment3.getDescription();
        java.lang.String str17 = equipment3.getEquipmentId();
        equipment3.setLabLocation("User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2995");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double7 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double10 = labManager9.getHourlyRate();
        model.LabManager labManager14 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager14.setPasswordHash("LabManager");
        model.Equipment equipment20 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str21 = equipment20.getEquipmentId();
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment20.detach(equipmentObserver22);
        labManager14.setEquipmentStatus(equipment20, "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str26 = labManager14.getPasswordHash();
        java.util.UUID uUID27 = labManager14.getUserId();
        labManager9.setUserId(uUID27);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
        org.junit.Assert.assertNotNull(uUID27);
// flaky "83) test2995(randoop.RandoopRegressionTest5)":         org.junit.Assert.assertEquals(uUID27.toString(), "96717aaa-8665-4560-ad3d-d427fc9b70da");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2996");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        java.lang.String str20 = equipment10.getEquipmentId();
        java.lang.String str21 = equipment10.getEquipmentId();
        java.lang.String str22 = equipment10.getStatus();
        labManager6.addEquipment(equipment10);
        java.lang.String str24 = equipment10.getEquipmentId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2997");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=c1f2e0ce-a6d8-4d0d-9256-477e11277a45, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=cf9c4f14-c47f-48ba-90a8-19e3efbb33fb, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2998");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=452c93a8-2c4b-4a20-b0c8-51949537a949, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=bfc196bf-0e5c-4790-b5a9-d4943d1bf144, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=f0765721-a687-481f-b6ed-91f0c3fe46a7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2999");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getRole();
        java.lang.String str11 = guest3.getIdOrCertNumber();
        java.lang.String str12 = guest3.getEmail();
        model.LabManager labManager16 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager16.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        labManager24.setEquipmentStatus(equipment28, "");
        equipment28.notifyObservers();
        labManager16.addEquipment(equipment28);
        equipment28.setLabLocation("Guest");
        equipment28.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment28.setLabLocation("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        strategy.PricingStrategy pricingStrategy48 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation49 = new model.Reservation((model.User) guest3, equipment28, localDateTime46, localDateTime47, pricingStrategy48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test3000");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation13);
        java.lang.String str15 = equipment3.toString();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getEquipmentId();
        equipment19.setStatus("");
        state.EquipmentState equipmentState29 = equipment19.getCurrentState();
        equipment3.setState(equipmentState29);
        java.lang.String str31 = equipment3.getLabLocation();
        java.lang.String str32 = equipment3.getLabLocation();
        java.lang.String str33 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }
}
