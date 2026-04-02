package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1001");
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
        java.lang.String str27 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        guest3.setEmail("User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
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
        researcher3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str19 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "1) test1003(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID14.toString(), "9dbfbbb6-a401-47c4-870a-148e7d087c6f");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = labManager5.getPasswordHash();
        double double7 = labManager5.getHourlyRate();
        labManager5.setIdOrCertNumber("User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str10 = labManager5.getRole();
        java.lang.String str11 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Temp123!" + "'", str6, "Temp123!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
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
        java.lang.String str20 = equipment9.getLabLocation();
        java.lang.String str21 = equipment9.getStatus();
        java.lang.String str22 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str22, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str12 = labManager11.toString();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.lang.String str17 = equipment16.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment16.isModifyAvailable(localDateTime18, localDateTime19, "hi!", reservation21);
        equipment16.disable();
        equipment16.enable();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean28 = equipment16.isAvailable(localDateTime25, localDateTime26, "");
        model.HeadLabCoordinator headLabCoordinator32 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager34 = headLabCoordinator32.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        labManager34.addEquipment(equipment38);
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getEquipmentId();
        equipment43.setStatus("");
        state.EquipmentState equipmentState53 = equipment43.getCurrentState();
        equipment38.setState(equipmentState53);
        equipment16.setState(equipmentState53);
        labManager11.markMaintenance(equipment16);
        equipment16.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "2) test1006(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str12, "User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState53);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
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
        observer.EquipmentObserver equipmentObserver62 = null;
        equipment3.detach(equipmentObserver62);
        equipment3.markMaintenance();
        java.lang.String str65 = equipment3.getDescription();
        java.lang.String str66 = equipment3.getEquipmentId();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ACTIVE" + "'", str65, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ACTIVE" + "'", str66, "ACTIVE");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
        model.Faculty faculty3 = new model.Faculty("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
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
        equipment3.disable();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment27.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        equipment27.setLabLocation("Faculty");
        labManager23.setEquipmentStatus(equipment27, "Guest");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        labManager23.addEquipment(equipment40);
        java.lang.String str42 = labManager23.getRole();
        model.Equipment equipment46 = new model.Equipment("", "", "");
        java.lang.String str47 = equipment46.getDescription();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment46.isModifyAvailable(localDateTime48, localDateTime49, "hi!", reservation51);
        java.lang.String str53 = equipment46.getEquipmentId();
        equipment46.setStatus("");
        state.EquipmentState equipmentState56 = equipment46.getCurrentState();
        equipment46.markMaintenance();
        labManager23.setEquipmentStatus(equipment46, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment63 = new model.Equipment("", "", "");
        java.lang.String str64 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment63.isModifyAvailable(localDateTime65, localDateTime66, "hi!", reservation68);
        java.lang.String str70 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean74 = equipment63.isAvailable(localDateTime71, localDateTime72, "Faculty");
        model.Equipment equipment78 = new model.Equipment("", "", "");
        java.lang.String str79 = equipment78.getDescription();
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment78.isModifyAvailable(localDateTime80, localDateTime81, "hi!", reservation83);
        java.lang.String str85 = equipment78.getDescription();
        state.EquipmentState equipmentState86 = equipment78.getCurrentState();
        equipment63.setState(equipmentState86);
        equipment46.setState(equipmentState86);
        equipment3.setState(equipmentState86);
        observer.EquipmentObserver equipmentObserver90 = null;
        equipment3.attach(equipmentObserver90);
        model.SensorUpdate sensorUpdate92 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LabManager" + "'", str42, "LabManager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(equipmentState56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(equipmentState86);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Student", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.toString();
        researcher3.setPasswordHash("");
// flaky "3) test1012(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=b7aed6ee-1c32-4982-a775-ce20394d0d35, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}" + "'", str4, "User{userId=b7aed6ee-1c32-4982-a775-ce20394d0d35, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = equipment3.getDescription();
        java.lang.String str11 = equipment3.toString();
        java.lang.String str12 = equipment3.getLabLocation();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState17 = equipment16.getCurrentState();
        equipment3.setState(equipmentState17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str11, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(equipmentState17);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        equipment3.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setLabLocation("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
        model.Student student3 = new model.Student("LM-CERT", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.Class<?> wildcardClass12 = labManager11.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}", "User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
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
        state.EquipmentState equipmentState39 = equipment37.getCurrentState();
        model.SensorUpdate sensorUpdate40 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment37.applySensorUpdate(sensorUpdate40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState39);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getRole();
        faculty3.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
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
        java.lang.String str43 = equipment35.getDescription();
        java.lang.String str44 = equipment35.getEquipmentId();
        equipment35.notifyObservers();
        equipment35.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment35.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str50 = equipment35.getDescription();
        labManager9.markMaintenance(equipment35);
        double double52 = labManager9.getHourlyRate();
        double double53 = labManager9.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str50, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1021");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        double double8 = faculty3.getHourlyRate();
        faculty3.setActive(true);
        java.lang.String str11 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "4) test1021(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "9a7f07d5-5f76-4035-b09f-12f12e72c169");
// flaky "1) test1021(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
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
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        java.lang.String str29 = equipment21.getDescription();
        java.lang.String str30 = equipment21.getEquipmentId();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment21.isModifyAvailable(localDateTime31, localDateTime32, "INACTIVE", reservation34);
        state.EquipmentState equipmentState36 = equipment21.getCurrentState();
        model.Equipment equipment40 = new model.Equipment("", "", "");
        equipment40.enable();
        equipment40.enable();
        java.lang.String str43 = equipment40.getStatus();
        java.lang.String str44 = equipment40.getStatus();
        java.lang.String str45 = equipment40.getDescription();
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.lang.String str50 = equipment49.getDescription();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment49.isModifyAvailable(localDateTime51, localDateTime52, "hi!", reservation54);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        model.Reservation reservation59 = null;
        boolean boolean60 = equipment49.isModifyAvailable(localDateTime56, localDateTime57, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation59);
        java.lang.String str61 = equipment49.toString();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        boolean boolean65 = equipment49.isAvailable(localDateTime62, localDateTime63, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState66 = equipment49.getCurrentState();
        equipment40.setState(equipmentState66);
        equipment21.setState(equipmentState66);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(equipmentState36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Available" + "'", str43, "Available");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Available" + "'", str44, "Available");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str61, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(equipmentState66);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
        model.Researcher researcher3 = new model.Researcher("User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
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
        equipment12.notifyObservers();
        equipment12.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
        model.LabManager labManager3 = new model.LabManager("Guest", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher");
        java.lang.String str4 = labManager3.toString();
        labManager3.setActive(true);
// flaky "5) test1025(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=ecc2e2ab-6898-4e8a-9782-e358bc6a80f6, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}" + "'", str4, "User{userId=ecc2e2ab-6898-4e8a-9782-e358bc6a80f6, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.detach(equipmentObserver9);
        java.lang.String str11 = equipment3.getStatus();
        equipment3.setDescription("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str14 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str14, "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        model.Guest guest3 = new model.Guest("User{userId=0f5bd3bf-c7f0-4231-908d-f716526a8951, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=b22ea40b-51ce-4c5d-80b2-df6930d5080e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
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
        java.lang.String str75 = equipment24.getLabLocation();
        state.EquipmentState equipmentState76 = equipment24.getCurrentState();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Faculty" + "'", str75, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState76);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getRole();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "6) test1029(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "93855394-6b6d-4bc9-9fe1-bc52e03c4239");
// flaky "2) test1029(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        java.lang.String str11 = equipment3.getEquipmentId();
        equipment3.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = equipment3.isAvailable(localDateTime14, localDateTime15, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment3.getLabLocation();
        java.lang.String str19 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment9 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment9.markMaintenance();
        observer.EquipmentObserver equipmentObserver11 = null;
        equipment9.attach(equipmentObserver11);
        labManager5.addEquipment(equipment9);
        labManager5.setIdOrCertNumber("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setStatus("LabManager");
        java.lang.String str12 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.attach(equipmentObserver13);
        java.lang.String str15 = equipment3.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
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
        equipment3.setStatus("hi!");
        java.lang.String str19 = equipment3.getLabLocation();
        java.lang.String str20 = equipment3.getLabLocation();
        equipment3.setStatus("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        equipment3.setLabLocation("User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID6 = headLabCoordinator3.getUserId();
        java.lang.String str7 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "7) test1034(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID6.toString(), "f71c6cc7-5497-4800-8b6d-e31675f67038");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getStatus();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "Faculty", reservation18);
        equipment14.setLabLocation("Faculty");
        labManager10.setEquipmentStatus(equipment14, "");
        java.lang.String str24 = equipment14.toString();
        java.lang.String str25 = equipment14.getLabLocation();
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment35.isModifyAvailable(localDateTime36, localDateTime37, "Faculty", reservation39);
        equipment35.setLabLocation("Faculty");
        labManager31.setEquipmentStatus(equipment35, "");
        java.lang.String str45 = equipment35.getDescription();
        state.EquipmentState equipmentState46 = equipment35.getCurrentState();
        equipment14.setState(equipmentState46);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        strategy.PricingStrategy pricingStrategy50 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation51 = new model.Reservation((model.User) headLabCoordinator3, equipment14, localDateTime48, localDateTime49, pricingStrategy50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(equipmentState46);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
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
        equipment3.disable();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment27.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        equipment27.setLabLocation("Faculty");
        labManager23.setEquipmentStatus(equipment27, "Guest");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        labManager23.addEquipment(equipment40);
        java.lang.String str42 = labManager23.getRole();
        model.Equipment equipment46 = new model.Equipment("", "", "");
        java.lang.String str47 = equipment46.getDescription();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment46.isModifyAvailable(localDateTime48, localDateTime49, "hi!", reservation51);
        java.lang.String str53 = equipment46.getEquipmentId();
        equipment46.setStatus("");
        state.EquipmentState equipmentState56 = equipment46.getCurrentState();
        equipment46.markMaintenance();
        labManager23.setEquipmentStatus(equipment46, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment63 = new model.Equipment("", "", "");
        java.lang.String str64 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment63.isModifyAvailable(localDateTime65, localDateTime66, "hi!", reservation68);
        java.lang.String str70 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean74 = equipment63.isAvailable(localDateTime71, localDateTime72, "Faculty");
        model.Equipment equipment78 = new model.Equipment("", "", "");
        java.lang.String str79 = equipment78.getDescription();
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment78.isModifyAvailable(localDateTime80, localDateTime81, "hi!", reservation83);
        java.lang.String str85 = equipment78.getDescription();
        state.EquipmentState equipmentState86 = equipment78.getCurrentState();
        equipment63.setState(equipmentState86);
        equipment46.setState(equipmentState86);
        equipment3.setState(equipmentState86);
        observer.EquipmentObserver equipmentObserver90 = null;
        equipment3.attach(equipmentObserver90);
        observer.EquipmentObserver equipmentObserver92 = null;
        equipment3.attach(equipmentObserver92);
        java.time.LocalDateTime localDateTime94 = null;
        java.time.LocalDateTime localDateTime95 = null;
        model.Reservation reservation97 = null;
        boolean boolean98 = equipment3.isModifyAvailable(localDateTime94, localDateTime95, "User{userId=43d45941-45ea-42c1-9f67-2e88448539f4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", reservation97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LabManager" + "'", str42, "LabManager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(equipmentState56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(equipmentState86);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Temp123!");
        double double4 = guest3.getHourlyRate();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        java.lang.String str9 = equipment8.getDescription();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment8.isModifyAvailable(localDateTime10, localDateTime11, "hi!", reservation13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment8.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation18);
        java.lang.String str20 = equipment8.toString();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment8.isAvailable(localDateTime21, localDateTime22, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment8.disable();
        equipment8.setLabLocation("User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        strategy.PricingStrategy pricingStrategy30 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation31 = new model.Reservation((model.User) guest3, equipment8, localDateTime28, localDateTime29, pricingStrategy30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getPasswordHash();
        double double8 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str11 = student3.getStatus();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "INACTIVE" + "'", str11, "INACTIVE");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        model.Student student3 = new model.Student("User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setPasswordHash("");
        double double8 = labManager5.getHourlyRate();
        boolean boolean9 = labManager5.isActive();
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        java.lang.String str11 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
// flaky "8) test1040(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1041");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        faculty3.setPasswordHash("ACTIVE");
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        model.Guest guest3 = new model.Guest("User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6f3c3700-9cf7-4c67-84ed-9a21ccf02f91, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = labManager5.getPasswordHash();
        double double7 = labManager5.getHourlyRate();
        java.util.UUID uUID8 = labManager5.getUserId();
        java.lang.String str9 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Temp123!" + "'", str6, "Temp123!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "9) test1044(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID8.toString(), "2f719e41-5ff5-4b77-8916-05204b6bd777");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
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
        java.lang.String str35 = labManager5.getPasswordHash();
        model.Equipment equipment39 = new model.Equipment("", "", "");
        equipment39.enable();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean44 = equipment39.isAvailable(localDateTime41, localDateTime42, "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager5.markMaintenance(equipment39);
        double double46 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Temp123!" + "'", str35, "Temp123!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
        model.Researcher researcher3 = new model.Researcher("User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
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
        java.lang.String str32 = labManager5.toString();
        double double33 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
// flaky "10) test1047(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "User{userId=1104a47a-3f82-43dd-86c4-308fdaeeab9b, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str32, "User{userId=1104a47a-3f82-43dd-86c4-308fdaeeab9b, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1048");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("INACTIVE", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str8 = equipment7.getLabLocation();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment7.detach(equipmentObserver9);
        observer.EquipmentObserver equipmentObserver11 = null;
        equipment7.detach(equipmentObserver11);
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.addEquipment(equipment22);
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        java.lang.String str34 = equipment27.getDescription();
        equipment27.setStatus("Researcher");
        labManager18.addEquipment(equipment27);
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
        java.lang.String str59 = equipment52.getEquipmentId();
        equipment52.setStatus("");
        state.EquipmentState equipmentState62 = equipment52.getCurrentState();
        equipment47.setState(equipmentState62);
        equipment27.setState(equipmentState62);
        equipment7.setState(equipmentState62);
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        strategy.PricingStrategy pricingStrategy68 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation69 = new model.Reservation((model.User) headLabCoordinator3, equipment7, localDateTime66, localDateTime67, pricingStrategy68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(equipmentState62);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getIdOrCertNumber();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getPasswordHash();
        java.lang.String str10 = student3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
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
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment35.isModifyAvailable(localDateTime50, localDateTime51, "Temp123!", reservation53);
        observer.EquipmentObserver equipmentObserver55 = null;
        equipment35.attach(equipmentObserver55);
        java.lang.String str57 = equipment35.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            equipment35.disable();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Disabled" + "'", str57, "Disabled");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        java.util.UUID uUID5 = null;
        guest3.setUserId(uUID5);
        guest3.setActive(false);
        java.lang.String str9 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.toString();
        model.LabManager labManager11 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str12 = labManager11.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str19 = headLabCoordinator16.getRole();
        model.LabManager labManager21 = headLabCoordinator16.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager23 = headLabCoordinator16.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str24 = labManager23.toString();
        model.LabManager labManager28 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator32 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager34 = headLabCoordinator32.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        labManager34.markMaintenance(equipment38);
        java.lang.String str40 = labManager34.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager46 = headLabCoordinator44.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment50.isModifyAvailable(localDateTime51, localDateTime52, "Faculty", reservation54);
        equipment50.setLabLocation("Faculty");
        labManager46.setEquipmentStatus(equipment50, "");
        equipment50.notifyObservers();
        labManager34.markMaintenance(equipment50);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        java.lang.String str66 = equipment65.getDescription();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment65.isModifyAvailable(localDateTime67, localDateTime68, "hi!", reservation70);
        java.lang.String str72 = equipment65.getEquipmentId();
        java.lang.String str73 = equipment65.getLabLocation();
        labManager34.markMaintenance(equipment65);
        model.Equipment equipment78 = new model.Equipment("", "", "");
        equipment78.enable();
        labManager34.addEquipment(equipment78);
        labManager28.markMaintenance(equipment78);
        observer.EquipmentObserver equipmentObserver82 = null;
        equipment78.attach(equipmentObserver82);
        labManager23.setEquipmentStatus(equipment78, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager11.setEquipmentStatus(equipment78, "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str88 = equipment78.getLabLocation();
        java.time.LocalDateTime localDateTime89 = null;
        java.time.LocalDateTime localDateTime90 = null;
        strategy.PricingStrategy pricingStrategy91 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation92 = new model.Reservation((model.User) faculty3, equipment78, localDateTime89, localDateTime90, pricingStrategy91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
// flaky "11) test1052(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=6354c497-42b7-4ca5-bc86-705793e0e97d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=6354c497-42b7-4ca5-bc86-705793e0e97d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HeadLabCoordinator" + "'", str19, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
// flaky "3) test1052(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User{userId=78622cc2-5f8a-4a3c-a4de-07514c83e9c8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str24, "User{userId=78622cc2-5f8a-4a3c-a4de-07514c83e9c8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LM-CERT" + "'", str40, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
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
        java.lang.String str20 = equipment9.getLabLocation();
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment9.attach(equipmentObserver21);
        java.lang.String str23 = equipment9.toString();
        java.lang.String str24 = equipment9.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
        model.LabManager labManager3 = new model.LabManager("LabManager", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Faculty");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment7.isModifyAvailable(localDateTime8, localDateTime9, "Faculty", reservation11);
        equipment7.setLabLocation("Faculty");
        java.lang.String str15 = equipment7.getEquipmentId();
        java.lang.String str16 = equipment7.toString();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment7.detach(equipmentObserver17);
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment7.attach(equipmentObserver19);
        labManager3.addEquipment(equipment7);
        labManager3.setIdOrCertNumber("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        labManager29.markMaintenance(equipment33);
        java.lang.String str35 = labManager29.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        labManager41.setActive(false);
        model.Equipment equipment47 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment47.isModifyAvailable(localDateTime48, localDateTime49, "Faculty", reservation51);
        equipment47.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment47.isModifyAvailable(localDateTime55, localDateTime56, "", reservation58);
        labManager41.addEquipment(equipment47);
        labManager29.setEquipmentStatus(equipment47, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver63 = null;
        equipment47.attach(equipmentObserver63);
        labManager3.addEquipment(equipment47);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LM-CERT" + "'", str35, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
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
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment36.attach(equipmentObserver46);
        state.EquipmentState equipmentState48 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment36.setState(equipmentState48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1056");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        equipment15.enable();
        equipment15.enable();
        java.lang.String str18 = equipment15.getStatus();
        equipment15.markMaintenance();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment15.attach(equipmentObserver20);
        java.lang.String str22 = equipment15.getStatus();
        java.lang.String str23 = equipment15.getLabLocation();
        labManager9.addEquipment(equipment15);
        java.lang.Class<?> wildcardClass25 = equipment15.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        java.lang.String str11 = equipment3.getLabLocation();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.setLabLocation("User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        double double6 = student3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID13 = null;
        headLabCoordinator10.setUserId(uUID13);
        model.LabManager labManager16 = headLabCoordinator10.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager18 = headLabCoordinator10.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID19 = labManager18.getUserId();
        student3.setUserId(uUID19);
        java.lang.String str21 = student3.getRole();
        java.lang.String str22 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "12) test1058(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=45055d07-d544-45b1-bff7-7868ab9c80d1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=45055d07-d544-45b1-bff7-7868ab9c80d1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "4) test1058(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID19.toString(), "4db8e333-0564-4747-9870-f97cb720c72b");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Student" + "'", str22, "Student");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        labManager9.setEquipmentStatus(equipment13, "Guest");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        labManager9.addEquipment(equipment26);
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment31.isModifyAvailable(localDateTime33, localDateTime34, "hi!", reservation36);
        labManager9.setEquipmentStatus(equipment31, "Guest");
        java.lang.String str40 = equipment31.getLabLocation();
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment31.attach(equipmentObserver41);
        java.lang.String str43 = equipment31.toString();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        strategy.PricingStrategy pricingStrategy46 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation47 = new model.Reservation((model.User) researcher3, equipment31, localDateTime44, localDateTime45, pricingStrategy46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Guest'}" + "'", str43, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
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
        state.EquipmentState equipmentState52 = equipment36.getCurrentState();
        equipment36.disable();
        equipment36.setDescription("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        boolean boolean59 = equipment36.isAvailable(localDateTime56, localDateTime57, "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        observer.EquipmentObserver equipmentObserver60 = null;
        equipment36.attach(equipmentObserver60);
        // The following exception was thrown during execution in test generation
        try {
            equipment36.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(equipmentState52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
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
        equipment3.setStatus("hi!");
        equipment3.markMaintenance();
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
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
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment19.detach(equipmentObserver32);
        equipment19.enable();
        equipment19.enable();
        equipment19.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double13 = headLabCoordinator3.getHourlyRate();
        java.lang.String str14 = headLabCoordinator3.getPasswordHash();
        boolean boolean15 = headLabCoordinator3.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "LM-CERT", reservation7);
        equipment3.markMaintenance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
        model.Faculty faculty3 = new model.Faculty("User{userId=9259ab1e-99ff-4fc7-a7c5-e086350ee87d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Guest', status=''}", "User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.util.UUID uUID5 = headLabCoordinator3.getUserId();
        headLabCoordinator3.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double10 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "13) test1066(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID5.toString(), "f69c79df-cab8-4894-8d8a-d3c6f2ecc04e");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1067");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double11 = headLabCoordinator10.getHourlyRate();
        model.LabManager labManager13 = headLabCoordinator10.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.lang.String str18 = equipment17.getDescription();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment17.isModifyAvailable(localDateTime19, localDateTime20, "hi!", reservation22);
        java.lang.String str24 = equipment17.getEquipmentId();
        equipment17.setStatus("");
        java.lang.String str27 = equipment17.getEquipmentId();
        java.lang.String str28 = equipment17.getEquipmentId();
        java.lang.String str29 = equipment17.getStatus();
        labManager13.addEquipment(equipment17);
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.lang.String str35 = equipment34.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment34.isModifyAvailable(localDateTime36, localDateTime37, "hi!", reservation39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment34.isModifyAvailable(localDateTime41, localDateTime42, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation44);
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment34.attach(equipmentObserver46);
        observer.EquipmentObserver equipmentObserver48 = null;
        equipment34.detach(equipmentObserver48);
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment34.detach(equipmentObserver50);
        labManager13.setEquipmentStatus(equipment34, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager6.addEquipment(equipment34);
        model.Student student58 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double59 = student58.getHourlyRate();
        java.lang.String str60 = student58.getRole();
        java.util.UUID uUID61 = student58.getUserId();
        labManager6.setUserId(uUID61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Student" + "'", str60, "Student");
        org.junit.Assert.assertNotNull(uUID61);
// flaky "14) test1067(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID61.toString(), "cc7df3c6-d943-4e00-8c54-5ef2f016918d");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1068");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getStatus();
        student3.setIdOrCertNumber("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1069");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1070");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1071");
        model.LabManager labManager3 = new model.LabManager("User{userId=a693b3e2-b7b8-430b-b807-e312f84458bf, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='INACTIVE', role='HeadLabCoordinator'}", "User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1072");
        model.Researcher researcher3 = new model.Researcher("User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1073");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID10 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "15) test1073(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID10.toString(), "a12d0eb2-ad1e-4a02-b002-1640dfff684a");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1074");
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
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        boolean boolean76 = equipment9.isAvailable(localDateTime73, localDateTime74, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment9.notifyObservers();
        java.lang.String str78 = equipment9.getEquipmentId();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1075");
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
        equipment3.notifyObservers();
        java.lang.String str16 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Available" + "'", str16, "Available");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1076");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("");
        double double6 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1077");
        model.Faculty faculty3 = new model.Faculty("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "INACTIVE");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "INACTIVE" + "'", str4, "INACTIVE");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1078");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=bf52e736-2be8-4178-a794-276836acc82a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double13 = labManager12.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "16) test1078(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1079");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("hi!");
        equipment9.setDescription("Researcher");
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment9.detach(equipmentObserver15);
        equipment9.setDescription("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1080");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        equipment7.enable();
        equipment7.enable();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.markMaintenance();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment7.attach(equipmentObserver12);
        java.lang.String str14 = equipment7.getStatus();
        java.lang.String str15 = equipment7.getLabLocation();
        equipment7.setLabLocation("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment7.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation21);
        java.lang.String str23 = equipment7.toString();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        strategy.PricingStrategy pricingStrategy26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation27 = new model.Reservation((model.User) labManager3, equipment7, localDateTime24, localDateTime25, pricingStrategy26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Maintenance" + "'", str14, "Maintenance");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1081");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1082");
        model.Guest guest3 = new model.Guest("User{userId=e66add75-7741-400c-88d2-105d5e18ca95, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1083");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getPasswordHash();
        double double10 = faculty3.getHourlyRate();
        java.util.UUID uUID11 = faculty3.getUserId();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID22 = null;
        headLabCoordinator19.setUserId(uUID22);
        model.LabManager labManager25 = headLabCoordinator19.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager27 = headLabCoordinator19.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID28 = labManager27.getUserId();
        headLabCoordinator15.setUserId(uUID28);
        faculty3.setUserId(uUID28);
        java.lang.String str31 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "17) test1083(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID11.toString(), "80bc7871-b808-4447-85b5-4ca1550392ac");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(uUID28);
// flaky "5) test1083(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID28.toString(), "f8dba452-8745-4199-9fef-38a0264aa127");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1084");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getStatus();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1085");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        double double7 = researcher3.getHourlyRate();
        model.Student student11 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean12 = student11.isActive();
        java.lang.String str13 = student11.getEmail();
        java.lang.String str14 = student11.getIdOrCertNumber();
        double double15 = student11.getHourlyRate();
        java.lang.String str16 = student11.getRole();
        student11.setActive(false);
        java.util.UUID uUID19 = student11.getUserId();
        researcher3.setUserId(uUID19);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(uUID19);
// flaky "18) test1085(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID19.toString(), "9c09afe6-143c-4786-8626-cd7980a57717");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1086");
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
        equipment3.setStatus("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1087");
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
        java.lang.String str21 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Maintenance" + "'", str21, "Maintenance");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1088");
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
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment19.detach(equipmentObserver32);
        java.lang.String str34 = equipment19.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Student" + "'", str34, "Student");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1089");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.Class<?> wildcardClass5 = headLabCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1090");
        model.Researcher researcher3 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.lang.String str4 = researcher3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1091");
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
        equipment49.notifyObservers();
        java.lang.String str54 = equipment49.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1092");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=e198018f-95c6-450a-ad5f-675ecbf69376, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b22ea40b-51ce-4c5d-80b2-df6930d5080e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1093");
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
        equipment3.setDescription("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment3.isModifyAvailable(localDateTime17, localDateTime18, "", reservation20);
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1094");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.lang.String str12 = equipment11.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment11.isModifyAvailable(localDateTime13, localDateTime14, "hi!", reservation16);
        java.lang.String str18 = equipment11.getDescription();
        state.EquipmentState equipmentState19 = equipment11.getCurrentState();
        equipment11.setLabLocation("Student");
        equipment11.notifyObservers();
        labManager7.addEquipment(equipment11);
        java.lang.String str24 = equipment11.getStatus();
        model.SensorUpdate sensorUpdate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment11.applySensorUpdate(sensorUpdate25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1095");
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
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getEquipmentId();
        equipment23.setStatus("");
        java.lang.String str33 = equipment23.getStatus();
        java.lang.String str34 = equipment23.getLabLocation();
        equipment23.enable();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        strategy.PricingStrategy pricingStrategy38 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation39 = new model.Reservation((model.User) labManager5, equipment23, localDateTime36, localDateTime37, pricingStrategy38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "19) test1095(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID19.toString(), "d758b32b-c0a1-4f01-8e0e-dacd5489a55f");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1096");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Temp123!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=3f90cc24-55c4-47d6-9aae-68a68336d563, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1097");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getStatus();
        student3.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.Guest guest11 = new model.Guest("", "hi!", "hi!");
        java.lang.String str12 = guest11.getRole();
        guest11.setEmail("Guest");
        double double15 = guest11.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID22 = null;
        headLabCoordinator19.setUserId(uUID22);
        model.LabManager labManager25 = headLabCoordinator19.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager27 = headLabCoordinator19.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager29 = headLabCoordinator19.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty33 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str34 = faculty33.getStatus();
        boolean boolean35 = faculty33.isActive();
        model.Faculty faculty39 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID40 = faculty39.getUserId();
        faculty33.setUserId(uUID40);
        labManager29.setUserId(uUID40);
        guest11.setUserId(uUID40);
        student3.setUserId(uUID40);
        java.lang.String str45 = student3.toString();
        java.util.UUID uUID46 = student3.getUserId();
        double double47 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "INACTIVE" + "'", str5, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ACTIVE" + "'", str34, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(uUID40);
// flaky "20) test1097(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID40.toString(), "7b8dee7f-07c7-4251-8ad6-f865b94d4b4f");
// flaky "6) test1097(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "User{userId=7b8dee7f-07c7-4251-8ad6-f865b94d4b4f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str45, "User{userId=7b8dee7f-07c7-4251-8ad6-f865b94d4b4f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(uUID46);
// flaky "1) test1097(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID46.toString(), "7b8dee7f-07c7-4251-8ad6-f865b94d4b4f");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1098");
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
        java.lang.String str53 = equipment35.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str53, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1099");
        model.Researcher researcher3 = new model.Researcher("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1100");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        researcher3.setPasswordHash("Faculty");
        double double10 = researcher3.getHourlyRate();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.lang.String str15 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment14.isModifyAvailable(localDateTime16, localDateTime17, "hi!", reservation19);
        java.lang.String str21 = equipment14.getEquipmentId();
        equipment14.setStatus("");
        java.lang.String str24 = equipment14.getStatus();
        java.lang.String str25 = equipment14.getLabLocation();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment14.isAvailable(localDateTime26, localDateTime27, "User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        strategy.PricingStrategy pricingStrategy32 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation33 = new model.Reservation((model.User) researcher3, equipment14, localDateTime30, localDateTime31, pricingStrategy32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "21) test1100(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "5be8a916-c115-40ac-9c3c-57dacd2b35f5");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1101");
        model.LabManager labManager3 = new model.LabManager("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=7c8bec6d-719e-4756-aeec-1def59afc3f2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1102");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1103");
        model.Researcher researcher3 = new model.Researcher("LabManager", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean4 = researcher3.isActive();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1104");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        java.lang.String str10 = labManager5.getRole();
        double double11 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1105");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
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
        // The following exception was thrown during execution in test generation
        try {
            labManager7.markMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1106");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isActive();
        faculty3.setPasswordHash("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str7 = faculty3.toString();
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "22) test1106(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1107");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getStatus();
        model.Equipment equipment9 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        java.lang.String str21 = equipment13.getDescription();
        java.lang.String str22 = equipment13.getEquipmentId();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment13.isModifyAvailable(localDateTime23, localDateTime24, "INACTIVE", reservation26);
        state.EquipmentState equipmentState28 = equipment13.getCurrentState();
        model.Equipment equipment32 = new model.Equipment("", "", "");
        equipment32.enable();
        equipment32.enable();
        java.lang.String str35 = equipment32.getStatus();
        java.lang.String str36 = equipment32.getStatus();
        java.lang.String str37 = equipment32.getDescription();
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment41.isModifyAvailable(localDateTime43, localDateTime44, "hi!", reservation46);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment41.isModifyAvailable(localDateTime48, localDateTime49, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation51);
        java.lang.String str53 = equipment41.toString();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment41.isAvailable(localDateTime54, localDateTime55, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState58 = equipment41.getCurrentState();
        equipment32.setState(equipmentState58);
        equipment13.setState(equipmentState58);
        equipment9.setState(equipmentState58);
        equipment9.disable();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        strategy.PricingStrategy pricingStrategy65 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation66 = new model.Reservation((model.User) labManager3, equipment9, localDateTime63, localDateTime64, pricingStrategy65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Available" + "'", str35, "Available");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Available" + "'", str36, "Available");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str53, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(equipmentState58);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1108");
        model.Faculty faculty3 = new model.Faculty("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1109");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7c8bec6d-719e-4756-aeec-1def59afc3f2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1110");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1111");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str11 = headLabCoordinator8.getRole();
        model.LabManager labManager13 = headLabCoordinator8.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager15 = headLabCoordinator8.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str16 = labManager15.toString();
        model.LabManager labManager20 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager26.markMaintenance(equipment30);
        java.lang.String str32 = labManager26.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator36 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager38 = headLabCoordinator36.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment42.isModifyAvailable(localDateTime43, localDateTime44, "Faculty", reservation46);
        equipment42.setLabLocation("Faculty");
        labManager38.setEquipmentStatus(equipment42, "");
        equipment42.notifyObservers();
        labManager26.markMaintenance(equipment42);
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.lang.String str58 = equipment57.getDescription();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment57.isModifyAvailable(localDateTime59, localDateTime60, "hi!", reservation62);
        java.lang.String str64 = equipment57.getEquipmentId();
        java.lang.String str65 = equipment57.getLabLocation();
        labManager26.markMaintenance(equipment57);
        model.Equipment equipment70 = new model.Equipment("", "", "");
        equipment70.enable();
        labManager26.addEquipment(equipment70);
        labManager20.markMaintenance(equipment70);
        observer.EquipmentObserver equipmentObserver74 = null;
        equipment70.attach(equipmentObserver74);
        labManager15.setEquipmentStatus(equipment70, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment70, "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str80 = equipment70.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment70.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "23) test1111(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=47c96e2f-17ec-493d-a853-b01314f03539, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str16, "User{userId=47c96e2f-17ec-493d-a853-b01314f03539, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LM-CERT" + "'", str32, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1112");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1113");
        model.Researcher researcher3 = new model.Researcher("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getRole();
        double double7 = researcher3.getHourlyRate();
        double double8 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1114");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = student3.toString();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getPasswordHash();
// flaky "24) test1114(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=f724b6e8-da94-4ecb-ab0f-99c8597e0b65, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=f724b6e8-da94-4ecb-ab0f-99c8597e0b65, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1115");
        model.Equipment equipment3 = new model.Equipment("User{userId=1e541c39-bf7e-4c63-8bd9-2613fe09554b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1116");
        model.LabManager labManager3 = new model.LabManager("User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean18 = equipment7.isAvailable(localDateTime15, localDateTime16, "Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        java.lang.String str23 = equipment22.getDescription();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment22.isModifyAvailable(localDateTime24, localDateTime25, "hi!", reservation27);
        java.lang.String str29 = equipment22.getDescription();
        state.EquipmentState equipmentState30 = equipment22.getCurrentState();
        equipment7.setState(equipmentState30);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment7.isAvailable(localDateTime32, localDateTime33, "Faculty");
        java.lang.String str36 = equipment7.getDescription();
        state.EquipmentState equipmentState37 = equipment7.getCurrentState();
        equipment7.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        equipment7.setDescription("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str42 = equipment7.getDescription();
        labManager3.setEquipmentStatus(equipment7, "User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str42, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1117");
        model.Student student3 = new model.Student("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1118");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        boolean boolean6 = student3.isActive();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        model.Faculty faculty12 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID13 = faculty12.getUserId();
        java.lang.String str14 = faculty12.toString();
        java.lang.String str15 = faculty12.getRole();
        java.util.UUID uUID16 = faculty12.getUserId();
        student3.setUserId(uUID16);
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(uUID13);
// flaky "25) test1118(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID13.toString(), "ae09477e-9e55-4b1d-bad4-bb6eb3c0bced");
// flaky "7) test1118(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=ae09477e-9e55-4b1d-bad4-bb6eb3c0bced, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str14, "User{userId=ae09477e-9e55-4b1d-bad4-bb6eb3c0bced, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(uUID16);
// flaky "2) test1118(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID16.toString(), "ae09477e-9e55-4b1d-bad4-bb6eb3c0bced");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1119");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1120");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getStatus();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setActive(true);
        double double12 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1121");
        model.LabManager labManager3 = new model.LabManager("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=85029e47-3c9d-47ae-86ec-5e5306fd4423, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.Class<?> wildcardClass4 = labManager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1122");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setEmail("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1123");
        model.Equipment equipment3 = new model.Equipment("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1124");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setStatus("LabManager");
        equipment3.notifyObservers();
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        model.SensorUpdate sensorUpdate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1125");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment15.isModifyAvailable(localDateTime16, localDateTime17, "Faculty", reservation19);
        equipment15.setLabLocation("Faculty");
        labManager11.setEquipmentStatus(equipment15, "");
        equipment15.notifyObservers();
        labManager3.addEquipment(equipment15);
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
        java.lang.String str54 = equipment39.getLabLocation();
        labManager3.setEquipmentStatus(equipment39, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        equipment39.notifyObservers();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ACTIVE" + "'", str35, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Faculty" + "'", str54, "Faculty");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1126");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getIdOrCertNumber();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1127");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.addEquipment(equipment17);
        model.Equipment equipment22 = new model.Equipment("", "", "");
        java.lang.String str23 = equipment22.getDescription();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment22.isModifyAvailable(localDateTime24, localDateTime25, "hi!", reservation27);
        java.lang.String str29 = equipment22.getDescription();
        equipment22.setStatus("Researcher");
        labManager13.addEquipment(equipment22);
        double double33 = labManager13.getHourlyRate();
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        java.lang.String str45 = equipment37.getDescription();
        java.lang.String str46 = equipment37.getEquipmentId();
        equipment37.notifyObservers();
        equipment37.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment37.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str52 = equipment37.getDescription();
        observer.EquipmentObserver equipmentObserver53 = null;
        equipment37.detach(equipmentObserver53);
        labManager13.addEquipment(equipment37);
        model.Equipment equipment59 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment59.isModifyAvailable(localDateTime60, localDateTime61, "Faculty", reservation63);
        equipment59.setLabLocation("Faculty");
        java.lang.String str67 = equipment59.getDescription();
        java.lang.String str68 = equipment59.getEquipmentId();
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        model.Reservation reservation72 = null;
        boolean boolean73 = equipment59.isModifyAvailable(localDateTime69, localDateTime70, "INACTIVE", reservation72);
        state.EquipmentState equipmentState74 = equipment59.getCurrentState();
        equipment37.setState(equipmentState74);
        equipment3.setState(equipmentState74);
        java.lang.Class<?> wildcardClass77 = equipmentState74.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str52, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(equipmentState74);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1128");
        model.Faculty faculty3 = new model.Faculty("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=cfb38917-719c-4738-97fe-9e4f9cfc6988, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1129");
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
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        equipment3.notifyObservers();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1130");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getLabLocation();
        equipment3.setLabLocation("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = equipment3.getDescription();
        model.SensorUpdate sensorUpdate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1131");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1132");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = equipment9.getEquipmentId();
        state.EquipmentState equipmentState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.setState(equipmentState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "INACTIVE" + "'", str11, "INACTIVE");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1133");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1134");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str12 = labManager11.toString();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.lang.String str17 = equipment16.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment16.isModifyAvailable(localDateTime18, localDateTime19, "hi!", reservation21);
        equipment16.disable();
        equipment16.enable();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean28 = equipment16.isAvailable(localDateTime25, localDateTime26, "");
        model.HeadLabCoordinator headLabCoordinator32 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager34 = headLabCoordinator32.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        labManager34.addEquipment(equipment38);
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getEquipmentId();
        equipment43.setStatus("");
        state.EquipmentState equipmentState53 = equipment43.getCurrentState();
        equipment38.setState(equipmentState53);
        equipment16.setState(equipmentState53);
        labManager11.markMaintenance(equipment16);
        java.lang.String str57 = labManager11.getRole();
        java.lang.String str58 = labManager11.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "26) test1134(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=f14e415a-0e7a-490c-b5e3-54d137f0e6ac, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str12, "User{userId=f14e415a-0e7a-490c-b5e3-54d137f0e6ac, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LabManager" + "'", str57, "LabManager");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "LabManager" + "'", str58, "LabManager");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1135");
        model.Student student3 = new model.Student("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        student3.setEmail("User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1136");
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
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager46 = headLabCoordinator44.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        labManager46.markMaintenance(equipment50);
        java.lang.String str52 = equipment50.getStatus();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        strategy.PricingStrategy pricingStrategy55 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation56 = new model.Reservation((model.User) labManager5, equipment50, localDateTime53, localDateTime54, pricingStrategy55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Maintenance" + "'", str52, "Maintenance");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1137");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        observer.EquipmentObserver equipmentObserver10 = null;
        equipment3.attach(equipmentObserver10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1138");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager8.setActive(true);
        java.lang.String str11 = labManager8.getPasswordHash();
        model.Equipment equipment15 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str16 = equipment15.getLabLocation();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment15.detach(equipmentObserver17);
        equipment15.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment15.getLabLocation();
        java.lang.String str22 = equipment15.getStatus();
        java.lang.String str23 = equipment15.getDescription();
        labManager8.markMaintenance(equipment15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Temp123!" + "'", str11, "Temp123!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str23, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1139");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        double double6 = researcher3.getHourlyRate();
        researcher3.setActive(true);
        researcher3.setIdOrCertNumber("User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1140");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.setActive(true);
        double double14 = labManager11.getHourlyRate();
        labManager11.setActive(true);
        java.util.UUID uUID17 = labManager11.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(uUID17);
// flaky "27) test1140(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID17.toString(), "04d3c66f-d5f1-4bd3-9a02-db394bba736d");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1141");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.lang.String str12 = equipment11.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment11.isModifyAvailable(localDateTime13, localDateTime14, "hi!", reservation16);
        java.lang.String str18 = equipment11.getDescription();
        state.EquipmentState equipmentState19 = equipment11.getCurrentState();
        equipment11.setLabLocation("Student");
        equipment11.notifyObservers();
        labManager7.addEquipment(equipment11);
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
        labManager7.setEquipmentStatus(equipment27, "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment27.isModifyAvailable(localDateTime45, localDateTime46, "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", reservation48);
        java.lang.String str50 = equipment27.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1142");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager5.setEquipmentStatus(equipment9, "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1143");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setActive(true);
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1144");
        model.Equipment equipment3 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment3.notifyObservers();
        equipment3.enable();
        model.SensorUpdate sensorUpdate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1145");
        model.LabManager labManager3 = new model.LabManager("Student", "ACTIVE", "Faculty");
        java.lang.String str4 = labManager3.getRole();
        boolean boolean5 = labManager3.isActive();
        java.lang.String str6 = labManager3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1146");
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
        model.Equipment equipment26 = new model.Equipment("", "", "");
        equipment26.enable();
        equipment26.enable();
        java.lang.String str29 = equipment26.getStatus();
        equipment26.markMaintenance();
        equipment26.setLabLocation("Researcher");
        java.lang.String str33 = equipment26.getEquipmentId();
        equipment26.setLabLocation("LM-CERT");
        state.EquipmentState equipmentState36 = equipment26.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Available" + "'", str29, "Available");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(equipmentState36);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1147");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.notifyObservers();
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1148");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.setLabLocation("User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.notifyObservers();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1149");
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
        java.lang.String str31 = labManager5.getIdOrCertNumber();
        java.lang.Class<?> wildcardClass32 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LM-CERT" + "'", str31, "LM-CERT");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1150");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=cf9c4f14-c47f-48ba-90a8-19e3efbb33fb, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "INACTIVE", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1151");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str8 = guest3.getRole();
        guest3.setActive(true);
        java.lang.Class<?> wildcardClass11 = guest3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1152");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getDescription();
        equipment3.notifyObservers();
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1153");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        java.lang.String str8 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertNotNull(equipmentState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Available" + "'", str8, "Available");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1154");
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
        java.lang.String str85 = equipment20.toString();
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}" + "'", str85, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1155");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double11 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Temp123!");
        double double14 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1156");
        model.Equipment equipment3 = new model.Equipment("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1157");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = equipment9.getStatus();
        state.EquipmentState equipmentState12 = equipment9.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Maintenance" + "'", str11, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1158");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        labManager5.setIdOrCertNumber("HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1159");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        headLabCoordinator3.setIdOrCertNumber("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        double double14 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1160");
        model.Guest guest3 = new model.Guest("User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1161");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1162");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double10 = labManager5.getHourlyRate();
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        boolean boolean12 = labManager5.isActive();
        java.lang.String str13 = labManager5.getPasswordHash();
        java.lang.String str14 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Temp123!" + "'", str13, "Temp123!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str14, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1163");
        model.Researcher researcher3 = new model.Researcher("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1164");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID32 = null;
        headLabCoordinator29.setUserId(uUID32);
        model.LabManager labManager35 = headLabCoordinator29.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        equipment39.enable();
        labManager35.addEquipment(equipment39);
        java.lang.String str42 = equipment39.toString();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment39.isAvailable(localDateTime43, localDateTime44, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str47 = equipment39.getLabLocation();
        equipment39.disable();
        observer.EquipmentObserver equipmentObserver49 = null;
        equipment39.detach(equipmentObserver49);
        labManager5.setEquipmentStatus(equipment39, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str53 = labManager5.getIdOrCertNumber();
        java.lang.String str54 = labManager5.getPasswordHash();
        boolean boolean55 = labManager5.isActive();
        double double56 = labManager5.getHourlyRate();
        java.lang.String str57 = labManager5.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LM-CERT" + "'", str53, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Temp123!" + "'", str54, "Temp123!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LM-CERT" + "'", str57, "LM-CERT");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1165");
        model.Student student3 = new model.Student("Researcher", "Available", "HeadLabCoordinator");
        double double4 = student3.getHourlyRate();
        student3.setPasswordHash("Faculty");
        double double7 = student3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        labManager13.setEquipmentStatus(equipment17, "Guest");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager13.addEquipment(equipment30);
        java.lang.String str32 = labManager13.getRole();
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.lang.String str37 = equipment36.getDescription();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment36.isModifyAvailable(localDateTime38, localDateTime39, "hi!", reservation41);
        java.lang.String str43 = equipment36.getEquipmentId();
        equipment36.setStatus("");
        state.EquipmentState equipmentState46 = equipment36.getCurrentState();
        equipment36.markMaintenance();
        labManager13.setEquipmentStatus(equipment36, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        java.lang.String str54 = equipment53.getDescription();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment53.isModifyAvailable(localDateTime55, localDateTime56, "hi!", reservation58);
        java.lang.String str60 = equipment53.getDescription();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean64 = equipment53.isAvailable(localDateTime61, localDateTime62, "Faculty");
        model.Equipment equipment68 = new model.Equipment("", "", "");
        java.lang.String str69 = equipment68.getDescription();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        model.Reservation reservation73 = null;
        boolean boolean74 = equipment68.isModifyAvailable(localDateTime70, localDateTime71, "hi!", reservation73);
        java.lang.String str75 = equipment68.getDescription();
        state.EquipmentState equipmentState76 = equipment68.getCurrentState();
        equipment53.setState(equipmentState76);
        equipment36.setState(equipmentState76);
        equipment36.notifyObservers();
        equipment36.disable();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        strategy.PricingStrategy pricingStrategy83 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation84 = new model.Reservation((model.User) student3, equipment36, localDateTime81, localDateTime82, pricingStrategy83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LabManager" + "'", str32, "LabManager");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(equipmentState46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(equipmentState76);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1166");
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
        java.lang.String str93 = equipment78.getLabLocation();
        equipment78.markMaintenance();
        equipment78.setDescription("Temp123!");
        observer.EquipmentObserver equipmentObserver97 = null;
        equipment78.detach(equipmentObserver97);
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
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1167");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        double double12 = headLabCoordinator3.getHourlyRate();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment16.isModifyAvailable(localDateTime17, localDateTime18, "Faculty", reservation20);
        equipment16.setLabLocation("Faculty");
        java.lang.String str24 = equipment16.getDescription();
        java.lang.String str25 = equipment16.getEquipmentId();
        equipment16.notifyObservers();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment16.attach(equipmentObserver27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        strategy.PricingStrategy pricingStrategy31 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation32 = new model.Reservation((model.User) headLabCoordinator3, equipment16, localDateTime29, localDateTime30, pricingStrategy31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1168");
        model.Equipment equipment3 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "ACTIVE");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setStatus("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        equipment20.enable();
        equipment20.enable();
        java.lang.String str23 = equipment20.getStatus();
        java.lang.String str24 = equipment20.getDescription();
        model.Equipment equipment28 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str29 = equipment28.getEquipmentId();
        java.lang.String str30 = equipment28.getEquipmentId();
        equipment28.enable();
        state.EquipmentState equipmentState32 = equipment28.getCurrentState();
        equipment20.setState(equipmentState32);
        equipment7.setState(equipmentState32);
        equipment3.setState(equipmentState32);
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState32);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1169");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getRole();
        double double12 = faculty3.getHourlyRate();
        model.Equipment equipment16 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment16.markMaintenance();
        equipment16.enable();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment16.isAvailable(localDateTime19, localDateTime20, "ACTIVE");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        strategy.PricingStrategy pricingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation26 = new model.Reservation((model.User) faculty3, equipment16, localDateTime23, localDateTime24, pricingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uUID4);
// flaky "28) test1169(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "04a98505-28ea-40f5-bbe0-affe8876dc0a");
// flaky "8) test1169(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=04a98505-28ea-40f5-bbe0-affe8876dc0a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=04a98505-28ea-40f5-bbe0-affe8876dc0a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1170");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver10 = null;
        equipment3.attach(equipmentObserver10);
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.Class<?> wildcardClass13 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1171");
        model.Student student3 = new model.Student("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1172");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        model.HeadLabCoordinator headLabCoordinator13 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager15 = headLabCoordinator13.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment19.isModifyAvailable(localDateTime20, localDateTime21, "Faculty", reservation23);
        equipment19.setLabLocation("Faculty");
        labManager15.setEquipmentStatus(equipment19, "");
        equipment19.setDescription("");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment34.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        equipment34.setLabLocation("Faculty");
        equipment34.notifyObservers();
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment34.attach(equipmentObserver43);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment34.isModifyAvailable(localDateTime45, localDateTime46, "Faculty", reservation48);
        state.EquipmentState equipmentState50 = equipment34.getCurrentState();
        equipment19.setState(equipmentState50);
        equipment3.setState(equipmentState50);
        java.lang.String str53 = equipment3.getLabLocation();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1173");
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
        java.lang.String str19 = equipment3.toString();
        java.lang.String str20 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=85029e47-3c9d-47ae-86ec-5e5306fd4423, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str19, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str20, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1174");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment9 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment9.setLabLocation("ACTIVE");
        java.lang.String str12 = equipment9.getEquipmentId();
        equipment9.enable();
        java.lang.String str14 = equipment9.toString();
        labManager5.markMaintenance(equipment9);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str14, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1175");
        model.Guest guest3 = new model.Guest("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        guest3.setPasswordHash("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID6 = guest3.getUserId();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertNotNull(uUID6);
// flaky "29) test1175(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID6.toString(), "aeda3d16-1a11-46a7-9e2d-6a77814fde5d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1176");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        java.lang.String str14 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1177");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setPasswordHash("Maintenance");
        model.Equipment equipment15 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str16 = equipment15.getLabLocation();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment15.detach(equipmentObserver17);
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment15.detach(equipmentObserver19);
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager26.addEquipment(equipment30);
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        java.lang.String str42 = equipment35.getDescription();
        equipment35.setStatus("Researcher");
        labManager26.addEquipment(equipment35);
        model.HeadLabCoordinator headLabCoordinator49 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager51 = headLabCoordinator49.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment55 = new model.Equipment("", "", "");
        labManager51.addEquipment(equipment55);
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.lang.String str61 = equipment60.getDescription();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment60.isModifyAvailable(localDateTime62, localDateTime63, "hi!", reservation65);
        java.lang.String str67 = equipment60.getEquipmentId();
        equipment60.setStatus("");
        state.EquipmentState equipmentState70 = equipment60.getCurrentState();
        equipment55.setState(equipmentState70);
        equipment35.setState(equipmentState70);
        equipment15.setState(equipmentState70);
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        boolean boolean77 = equipment15.isAvailable(localDateTime74, localDateTime75, "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment15.disable();
        labManager9.addEquipment(equipment15);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(labManager51);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(equipmentState70);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1178");
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
        java.lang.Class<?> wildcardClass24 = equipment14.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1179");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getPasswordHash();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1180");
        model.Equipment equipment3 = new model.Equipment("User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1181");
        model.LabManager labManager3 = new model.LabManager("User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=321af3c9-2c62-49f9-9643-94cb3f73b88e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1182");
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
        labManager9.setPasswordHash("User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.Class<?> wildcardClass22 = labManager9.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "30) test1182(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID15.toString(), "34519cdf-7689-4bcd-b13d-e63483322364");
// flaky "9) test1182(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1183");
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
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        equipment3.setDescription("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        equipment3.setLabLocation("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment3.setDescription("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment3.isModifyAvailable(localDateTime25, localDateTime26, "", reservation28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1184");
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
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        java.lang.String str44 = equipment36.getDescription();
        equipment36.enable();
        java.lang.String str46 = equipment36.getDescription();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        strategy.PricingStrategy pricingStrategy49 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation50 = new model.Reservation((model.User) labManager5, equipment36, localDateTime47, localDateTime48, pricingStrategy49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HeadLabCoordinator" + "'", str32, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1185");
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
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        java.lang.String str35 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment28.isAvailable(localDateTime36, localDateTime37, "Faculty");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getDescription();
        state.EquipmentState equipmentState51 = equipment43.getCurrentState();
        equipment28.setState(equipmentState51);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment28.isAvailable(localDateTime53, localDateTime54, "Faculty");
        java.lang.String str57 = equipment28.getDescription();
        state.EquipmentState equipmentState58 = equipment28.getCurrentState();
        equipment11.setState(equipmentState58);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        boolean boolean63 = equipment11.isAvailable(localDateTime60, localDateTime61, "User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        model.Reservation reservation67 = null;
        boolean boolean68 = equipment11.isModifyAvailable(localDateTime64, localDateTime65, "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation67);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(equipmentState58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1186");
        model.Guest guest3 = new model.Guest("Guest", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Guest");
        java.lang.String str4 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1187");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1188");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str12 = labManager11.toString();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.lang.String str17 = equipment16.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment16.isModifyAvailable(localDateTime18, localDateTime19, "hi!", reservation21);
        equipment16.disable();
        equipment16.enable();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean28 = equipment16.isAvailable(localDateTime25, localDateTime26, "");
        model.HeadLabCoordinator headLabCoordinator32 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager34 = headLabCoordinator32.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        labManager34.addEquipment(equipment38);
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getEquipmentId();
        equipment43.setStatus("");
        state.EquipmentState equipmentState53 = equipment43.getCurrentState();
        equipment38.setState(equipmentState53);
        equipment16.setState(equipmentState53);
        labManager11.markMaintenance(equipment16);
        model.HeadLabCoordinator headLabCoordinator60 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager62 = headLabCoordinator60.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment66 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment66.isModifyAvailable(localDateTime67, localDateTime68, "Faculty", reservation70);
        equipment66.setLabLocation("Faculty");
        labManager62.setEquipmentStatus(equipment66, "");
        java.lang.String str76 = equipment66.toString();
        java.lang.String str77 = equipment66.getLabLocation();
        java.lang.String str78 = equipment66.getStatus();
        labManager11.markMaintenance(equipment66);
        equipment66.setDescription("hi!");
        equipment66.setLabLocation("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "31) test1188(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str12, "User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertNotNull(labManager62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str76, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Faculty" + "'", str77, "Faculty");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1189");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        model.Researcher researcher17 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.util.UUID uUID18 = researcher17.getUserId();
        labManager5.setUserId(uUID18);
        java.lang.String str20 = labManager5.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(uUID18);
// flaky "32) test1189(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID18.toString(), "f049f503-bf28-4e89-846b-47a7e9a1a552");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Temp123!" + "'", str20, "Temp123!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1190");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str11 = headLabCoordinator8.getRole();
        model.LabManager labManager13 = headLabCoordinator8.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager15 = headLabCoordinator8.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str16 = labManager15.toString();
        model.LabManager labManager20 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager26.markMaintenance(equipment30);
        java.lang.String str32 = labManager26.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator36 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager38 = headLabCoordinator36.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment42.isModifyAvailable(localDateTime43, localDateTime44, "Faculty", reservation46);
        equipment42.setLabLocation("Faculty");
        labManager38.setEquipmentStatus(equipment42, "");
        equipment42.notifyObservers();
        labManager26.markMaintenance(equipment42);
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.lang.String str58 = equipment57.getDescription();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment57.isModifyAvailable(localDateTime59, localDateTime60, "hi!", reservation62);
        java.lang.String str64 = equipment57.getEquipmentId();
        java.lang.String str65 = equipment57.getLabLocation();
        labManager26.markMaintenance(equipment57);
        model.Equipment equipment70 = new model.Equipment("", "", "");
        equipment70.enable();
        labManager26.addEquipment(equipment70);
        labManager20.markMaintenance(equipment70);
        observer.EquipmentObserver equipmentObserver74 = null;
        equipment70.attach(equipmentObserver74);
        labManager15.setEquipmentStatus(equipment70, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment70, "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str80 = equipment70.getLabLocation();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        boolean boolean84 = equipment70.isAvailable(localDateTime81, localDateTime82, "User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "33) test1190(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=2e7e1dc2-6685-4a72-b4e8-5efd4be34564, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str16, "User{userId=2e7e1dc2-6685-4a72-b4e8-5efd4be34564, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LM-CERT" + "'", str32, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1191");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        labManager5.markMaintenance(equipment17);
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment17.attach(equipmentObserver20);
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment17.detach(equipmentObserver22);
        java.lang.Class<?> wildcardClass24 = equipment17.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1192");
        model.Student student3 = new model.Student("Disabled", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1193");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getPasswordHash();
        java.lang.String str10 = guest3.getPasswordHash();
        double double11 = guest3.getHourlyRate();
        java.lang.String str12 = guest3.getEmail();
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1194");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = labManager8.getHourlyRate();
        java.lang.String str10 = labManager8.getPasswordHash();
        labManager8.setIdOrCertNumber("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str13 = labManager8.getRole();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID20 = null;
        headLabCoordinator17.setUserId(uUID20);
        model.LabManager labManager23 = headLabCoordinator17.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        equipment27.enable();
        labManager23.addEquipment(equipment27);
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.lang.String str34 = equipment33.getDescription();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment33.isModifyAvailable(localDateTime35, localDateTime36, "hi!", reservation38);
        java.lang.String str40 = equipment33.getDescription();
        state.EquipmentState equipmentState41 = equipment33.getCurrentState();
        equipment33.setLabLocation("Student");
        labManager23.setEquipmentStatus(equipment33, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.lang.String str50 = equipment49.getDescription();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment49.isModifyAvailable(localDateTime51, localDateTime52, "hi!", reservation54);
        equipment49.disable();
        equipment49.enable();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        boolean boolean61 = equipment49.isAvailable(localDateTime58, localDateTime59, "");
        labManager23.addEquipment(equipment49);
        observer.EquipmentObserver equipmentObserver63 = null;
        equipment49.attach(equipmentObserver63);
        equipment49.setStatus("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment49.setDescription("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        labManager8.addEquipment(equipment49);
        java.lang.String str70 = equipment49.getEquipmentId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1195");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        double double8 = labManager7.getHourlyRate();
        java.lang.String str9 = labManager7.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1196");
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
        java.lang.String str19 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.detach(equipmentObserver20);
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.lang.String str26 = equipment25.getDescription();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment25.isModifyAvailable(localDateTime27, localDateTime28, "hi!", reservation30);
        equipment25.disable();
        java.lang.String str33 = equipment25.getEquipmentId();
        equipment25.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment25.isAvailable(localDateTime36, localDateTime37, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState40 = equipment25.getCurrentState();
        equipment3.setState(equipmentState40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1197");
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
        equipment3.setDescription("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setDescription("User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.SensorUpdate sensorUpdate23 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1198");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.util.UUID uUID11 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "34) test1198(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID11.toString(), "0b6afe22-d928-4294-83a0-da964c726649");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1199");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1200");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.disable();
        labManager3.addEquipment(equipment7);
        java.lang.String str11 = equipment7.getLabLocation();
        equipment7.disable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1201");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        student3.setActive(false);
        student3.setActive(false);
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1202");
        model.Guest guest3 = new model.Guest("Guest", "Available", "Student");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        guest3.setPasswordHash("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        boolean boolean8 = guest3.isActive();
        guest3.setActive(false);
        guest3.setIdOrCertNumber("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1203");
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
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment22.attach(equipmentObserver26);
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment22.attach(equipmentObserver28);
        observer.EquipmentObserver equipmentObserver30 = null;
        equipment22.detach(equipmentObserver30);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1204");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        java.util.UUID uUID7 = faculty3.getUserId();
        faculty3.setPasswordHash("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "35) test1204(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "de86b685-14d1-470c-9fcc-851a9514b83e");
// flaky "10) test1204(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "3) test1204(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "de86b685-14d1-470c-9fcc-851a9514b83e");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1205");
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
        java.lang.String str22 = equipment21.getDescription();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment21.isModifyAvailable(localDateTime23, localDateTime24, "hi!", reservation26);
        java.lang.String str28 = equipment21.getEquipmentId();
        equipment21.setStatus("");
        java.lang.String str31 = equipment21.getEquipmentId();
        labManager5.setEquipmentStatus(equipment21, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.Class<?> wildcardClass34 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1206");
        model.Guest guest3 = new model.Guest("HeadLabCoordinator", "", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = guest3.getStatus();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1207");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        double double7 = guest3.getHourlyRate();
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1208");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=4d0a85d8-97dd-4f15-9b14-6b8414f28684, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1209");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getIdOrCertNumber();
        guest3.setIdOrCertNumber("User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1210");
        model.Student student3 = new model.Student("User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1211");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean18 = equipment7.isAvailable(localDateTime15, localDateTime16, "Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        java.lang.String str23 = equipment22.getDescription();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment22.isModifyAvailable(localDateTime24, localDateTime25, "hi!", reservation27);
        java.lang.String str29 = equipment22.getDescription();
        state.EquipmentState equipmentState30 = equipment22.getCurrentState();
        equipment7.setState(equipmentState30);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment7.isAvailable(localDateTime32, localDateTime33, "Faculty");
        java.lang.String str36 = equipment7.getDescription();
        state.EquipmentState equipmentState37 = equipment7.getCurrentState();
        equipment7.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        equipment7.setDescription("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str42 = equipment7.getDescription();
        state.EquipmentState equipmentState43 = equipment7.getCurrentState();
        equipment3.setState(equipmentState43);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str42, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(equipmentState43);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1212");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        double double16 = labManager9.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = labManager9.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1213");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=0487e5c3-a4d6-4cbf-955d-77a6aad9c411, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1214");
        model.Equipment equipment3 = new model.Equipment("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        equipment3.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str6 = equipment3.toString();
        equipment3.setLabLocation("User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}" + "'", str6, "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1215");
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
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment36.attach(equipmentObserver50);
        // The following exception was thrown during execution in test generation
        try {
            equipment36.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1216");
        model.Equipment equipment3 = new model.Equipment("User{userId=f6909f80-0a53-4885-b35e-a5995f6cbaf6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=64d5d52d-6558-4bc9-918f-05c3c1a5493c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1217");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment22.isModifyAvailable(localDateTime23, localDateTime24, "Faculty", reservation26);
        equipment22.setLabLocation("Faculty");
        labManager18.setEquipmentStatus(equipment22, "Guest");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        labManager18.addEquipment(equipment35);
        state.EquipmentState equipmentState37 = equipment35.getCurrentState();
        java.lang.String str38 = equipment35.toString();
        state.EquipmentState equipmentState39 = equipment35.getCurrentState();
        equipment35.enable();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        strategy.PricingStrategy pricingStrategy43 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation44 = new model.Reservation((model.User) labManager12, equipment35, localDateTime41, localDateTime42, pricingStrategy43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str38, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState39);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1218");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment3.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1219");
        model.LabManager labManager3 = new model.LabManager("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.setActive(false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1220");
        model.Researcher researcher3 = new model.Researcher("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1221");
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
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1222");
        model.LabManager labManager3 = new model.LabManager("User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1223");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        researcher3.setEmail("Researcher");
        researcher3.setActive(false);
        java.lang.String str11 = researcher3.getEmail();
        researcher3.setPasswordHash("User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1224");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getLabLocation();
        java.lang.String str20 = equipment9.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment9.isAvailable(localDateTime21, localDateTime22, "User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1225");
        model.Researcher researcher3 = new model.Researcher("User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1226");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.setPasswordHash("User{userId=8868c252-060b-4413-9d0a-228b729ecd67, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Maintenance" + "'", str5, "Maintenance");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1227");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getIdOrCertNumber();
        java.lang.String str13 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LM-CERT" + "'", str12, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass24 = equipment18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1229");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        java.lang.String str8 = equipment3.toString();
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1230");
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
        java.lang.String str19 = equipment3.getDescription();
        model.SensorUpdate sensorUpdate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1231");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        headLabCoordinator3.setEmail("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        double double16 = labManager15.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1232");
        model.LabManager labManager3 = new model.LabManager("User{userId=7f1b84d1-159a-4211-a3df-b6f9b1a96c0e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1233");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        boolean boolean8 = researcher3.isActive();
        double double9 = researcher3.getHourlyRate();
        researcher3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str12 = researcher3.getStatus();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment16.isModifyAvailable(localDateTime17, localDateTime18, "Faculty", reservation20);
        equipment16.setLabLocation("Faculty");
        java.lang.String str24 = equipment16.getDescription();
        java.lang.String str25 = equipment16.getEquipmentId();
        java.lang.String str26 = equipment16.getDescription();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment16.detach(equipmentObserver27);
        java.lang.String str29 = equipment16.getLabLocation();
        equipment16.disable();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        strategy.PricingStrategy pricingStrategy33 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation34 = new model.Reservation((model.User) researcher3, equipment16, localDateTime31, localDateTime32, pricingStrategy33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "36) test1233(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "9dc504ba-04ed-4b5e-8050-2e4da546318c");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1234");
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
        java.lang.String str29 = equipment22.getEquipmentId();
        equipment22.setLabLocation("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.SensorUpdate sensorUpdate32 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment22.applySensorUpdate(sensorUpdate32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1235");
        model.Researcher researcher3 = new model.Researcher("User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d473dca8-1d6b-4ed6-bea4-83139eaef698, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1236");
        model.Guest guest3 = new model.Guest("", "Equipment{equipmentId='', description='', labLocation='Guest', status=''}", "Equipment{equipmentId='', description='', labLocation='Guest', status=''}");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1237");
        model.LabManager labManager3 = new model.LabManager("INACTIVE", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        equipment7.enable();
        equipment7.enable();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.markMaintenance();
        equipment7.setLabLocation("Researcher");
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setLabLocation("LM-CERT");
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment7.detach(equipmentObserver17);
        labManager3.addEquipment(equipment7);
        equipment7.notifyObservers();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1238");
        model.Faculty faculty3 = new model.Faculty("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1239");
        model.Faculty faculty3 = new model.Faculty("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1240");
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
        java.lang.String str18 = equipment3.getStatus();
        model.SensorUpdate sensorUpdate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str18, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1241");
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
        labManager3.setIdOrCertNumber("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
// flaky "37) test1241(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID72.toString(), "544fb5be-0663-400a-b234-c51a7d73fcd1");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1242");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}", "User{userId=4c74cc16-3a26-4216-a2a4-2054adbeaff2, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ae09477e-9e55-4b1d-bad4-bb6eb3c0bced, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1243");
        model.LabManager labManager3 = new model.LabManager("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = labManager3.toString();
// flaky "38) test1243(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}" + "'", str4, "User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1244");
        model.LabManager labManager3 = new model.LabManager("User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1245");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = equipment9.getStatus();
        java.lang.String str12 = equipment9.getStatus();
        state.EquipmentState equipmentState13 = equipment9.getCurrentState();
        model.SensorUpdate sensorUpdate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Maintenance" + "'", str11, "Maintenance");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Maintenance" + "'", str12, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1246");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getPasswordHash();
        java.lang.String str10 = guest3.getPasswordHash();
        guest3.setEmail("LM-CERT");
        java.lang.String str13 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LM-CERT" + "'", str13, "LM-CERT");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1247");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        model.Faculty faculty9 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID10 = faculty9.getUserId();
        faculty3.setUserId(uUID10);
        java.lang.String str12 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "39) test1247(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID10.toString(), "11ab7d67-2b61-4d60-9c1e-267f3204bb5c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1248");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getStatus();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1249");
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
        java.lang.String str67 = labManager5.getRole();
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LabManager" + "'", str67, "LabManager");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1250");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("", "User{userId=eb6fc337-1003-47b7-b3f1-2ceb2830d470, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1251");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        labManager5.setActive(false);
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.lang.String str17 = equipment16.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment16.isModifyAvailable(localDateTime18, localDateTime19, "hi!", reservation21);
        equipment16.markMaintenance();
        equipment16.setLabLocation("HeadLabCoordinator");
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment16.detach(equipmentObserver26);
        java.lang.String str28 = equipment16.getStatus();
        java.lang.String str29 = equipment16.getEquipmentId();
        observer.EquipmentObserver equipmentObserver30 = null;
        equipment16.attach(equipmentObserver30);
        // The following exception was thrown during execution in test generation
        try {
            labManager5.markMaintenance(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Maintenance" + "'", str28, "Maintenance");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1252");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setPasswordHash("");
        java.lang.String str8 = labManager5.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1253");
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
        equipment3.disable();
        java.lang.String str17 = equipment3.getLabLocation();
        state.EquipmentState equipmentState18 = equipment3.getCurrentState();
        equipment3.markMaintenance();
        java.lang.String str20 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1254");
        model.Faculty faculty3 = new model.Faculty("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a316677c-638d-4d36-8514-24c5a2c43dd9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1255");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setLabLocation("HeadLabCoordinator");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "hi!", reservation16);
        equipment3.setLabLocation("User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        java.lang.String str20 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Maintenance" + "'", str20, "Maintenance");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1256");
        model.LabManager labManager3 = new model.LabManager("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str10 = headLabCoordinator7.getRole();
        model.LabManager labManager12 = headLabCoordinator7.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str13 = labManager12.getRole();
        model.Equipment equipment17 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment17.markMaintenance();
        labManager12.addEquipment(equipment17);
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        labManager25.setEquipmentStatus(equipment29, "");
        java.lang.String str39 = equipment29.getLabLocation();
        equipment29.notifyObservers();
        java.lang.String str41 = equipment29.getLabLocation();
        labManager12.setEquipmentStatus(equipment29, "Disabled");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment47.isModifyAvailable(localDateTime48, localDateTime49, "Faculty", reservation51);
        equipment47.setLabLocation("Faculty");
        java.lang.String str55 = equipment47.getDescription();
        java.lang.String str56 = equipment47.getEquipmentId();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment47.isModifyAvailable(localDateTime57, localDateTime58, "INACTIVE", reservation60);
        java.lang.String str62 = equipment47.getEquipmentId();
        labManager12.setEquipmentStatus(equipment47, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        labManager3.addEquipment(equipment47);
        model.Equipment equipment69 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        model.Reservation reservation73 = null;
        boolean boolean74 = equipment69.isModifyAvailable(localDateTime70, localDateTime71, "Faculty", reservation73);
        equipment69.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment69.isModifyAvailable(localDateTime77, localDateTime78, "", reservation80);
        java.lang.String str82 = equipment69.getLabLocation();
        observer.EquipmentObserver equipmentObserver83 = null;
        equipment69.detach(equipmentObserver83);
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        boolean boolean88 = equipment69.isAvailable(localDateTime85, localDateTime86, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        labManager3.markMaintenance(equipment69);
        equipment69.enable();
        equipment69.setLabLocation("");
        java.time.LocalDateTime localDateTime93 = null;
        java.time.LocalDateTime localDateTime94 = null;
        boolean boolean96 = equipment69.isAvailable(localDateTime93, localDateTime94, "");
        java.lang.Class<?> wildcardClass97 = equipment69.getClass();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Faculty" + "'", str41, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Faculty" + "'", str82, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1257");
        model.Student student3 = new model.Student("", "User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1258");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isActive();
        faculty3.setPasswordHash("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1259");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager8.setEmail("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = labManager8.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Temp123!" + "'", str11, "Temp123!");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1260");
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
        state.EquipmentState equipmentState52 = equipment36.getCurrentState();
        equipment36.disable();
        equipment36.setDescription("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.SensorUpdate sensorUpdate56 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment36.applySensorUpdate(sensorUpdate56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(equipmentState52);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1261");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        labManager8.setEquipmentStatus(equipment18, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double22 = labManager8.getHourlyRate();
        model.Equipment equipment26 = new model.Equipment("", "", "");
        java.lang.String str27 = equipment26.getDescription();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment26.isModifyAvailable(localDateTime28, localDateTime29, "hi!", reservation31);
        java.lang.String str33 = equipment26.getDescription();
        state.EquipmentState equipmentState34 = equipment26.getCurrentState();
        equipment26.setLabLocation("Student");
        java.lang.String str37 = equipment26.getStatus();
        equipment26.setStatus("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment26.disable();
        labManager8.markMaintenance(equipment26);
        java.lang.String str42 = labManager8.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(equipmentState34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Available" + "'", str37, "Available");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LabManager" + "'", str42, "LabManager");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1262");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        java.lang.String str4 = researcher3.getRole();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1263");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getStatus();
        labManager3.setIdOrCertNumber("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment11.isModifyAvailable(localDateTime12, localDateTime13, "Faculty", reservation15);
        equipment11.setLabLocation("Faculty");
        java.lang.String str19 = equipment11.getDescription();
        java.lang.String str20 = equipment11.getEquipmentId();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment11.isModifyAvailable(localDateTime21, localDateTime22, "INACTIVE", reservation24);
        java.lang.String str26 = equipment11.toString();
        equipment11.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment11.markMaintenance();
        equipment11.setDescription("HeadLabCoordinator");
        labManager3.markMaintenance(equipment11);
        model.HeadLabCoordinator headLabCoordinator36 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager38 = headLabCoordinator36.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment42.isModifyAvailable(localDateTime43, localDateTime44, "Faculty", reservation46);
        equipment42.setLabLocation("Faculty");
        labManager38.setEquipmentStatus(equipment42, "Guest");
        model.Equipment equipment55 = new model.Equipment("", "", "");
        labManager38.addEquipment(equipment55);
        state.EquipmentState equipmentState57 = equipment55.getCurrentState();
        equipment11.setState(equipmentState57);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str26, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(equipmentState57);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1264");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = headLabCoordinator3.getIdOrCertNumber();
        boolean boolean15 = headLabCoordinator3.isActive();
        java.lang.String str16 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1265");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        equipment3.setStatus("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.detach(equipmentObserver12);
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1266");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setActive(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1267");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        java.lang.String str6 = student3.toString();
        java.lang.String str7 = student3.toString();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "40) test1267(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "11) test1267(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str6, "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "4) test1267(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str7, "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1268");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID32 = null;
        headLabCoordinator29.setUserId(uUID32);
        model.LabManager labManager35 = headLabCoordinator29.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        equipment39.enable();
        labManager35.addEquipment(equipment39);
        java.lang.String str42 = equipment39.toString();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment39.isAvailable(localDateTime43, localDateTime44, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str47 = equipment39.getLabLocation();
        equipment39.disable();
        observer.EquipmentObserver equipmentObserver49 = null;
        equipment39.detach(equipmentObserver49);
        labManager5.setEquipmentStatus(equipment39, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        equipment56.markMaintenance();
        equipment56.setLabLocation("HeadLabCoordinator");
        labManager5.setEquipmentStatus(equipment56, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        model.Equipment equipment68 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager5.setEquipmentStatus(equipment68, "User{userId=10b8b7d7-0cc3-4706-901d-0e8ea0d6fe73, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1269");
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
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID30 = null;
        headLabCoordinator27.setUserId(uUID30);
        model.LabManager labManager33 = headLabCoordinator27.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        equipment37.enable();
        labManager33.addEquipment(equipment37);
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getDescription();
        state.EquipmentState equipmentState51 = equipment43.getCurrentState();
        equipment43.setLabLocation("Student");
        labManager33.setEquipmentStatus(equipment43, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment59 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment59.isModifyAvailable(localDateTime60, localDateTime61, "Faculty", reservation63);
        equipment59.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment59.isModifyAvailable(localDateTime67, localDateTime68, "", reservation70);
        equipment59.disable();
        labManager33.addEquipment(equipment59);
        equipment59.markMaintenance();
        labManager5.addEquipment(equipment59);
        java.lang.String str76 = labManager5.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState51);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Temp123!" + "'", str76, "Temp123!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1270");
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
        equipment12.notifyObservers();
        model.Equipment equipment30 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str31 = equipment30.getLabLocation();
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment30.detach(equipmentObserver32);
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment30.detach(equipmentObserver34);
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment45 = new model.Equipment("", "", "");
        labManager41.addEquipment(equipment45);
        model.Equipment equipment50 = new model.Equipment("", "", "");
        java.lang.String str51 = equipment50.getDescription();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        model.Reservation reservation55 = null;
        boolean boolean56 = equipment50.isModifyAvailable(localDateTime52, localDateTime53, "hi!", reservation55);
        java.lang.String str57 = equipment50.getDescription();
        equipment50.setStatus("Researcher");
        labManager41.addEquipment(equipment50);
        model.HeadLabCoordinator headLabCoordinator64 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager66 = headLabCoordinator64.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment70 = new model.Equipment("", "", "");
        labManager66.addEquipment(equipment70);
        model.Equipment equipment75 = new model.Equipment("", "", "");
        java.lang.String str76 = equipment75.getDescription();
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment75.isModifyAvailable(localDateTime77, localDateTime78, "hi!", reservation80);
        java.lang.String str82 = equipment75.getEquipmentId();
        equipment75.setStatus("");
        state.EquipmentState equipmentState85 = equipment75.getCurrentState();
        equipment70.setState(equipmentState85);
        equipment50.setState(equipmentState85);
        equipment30.setState(equipmentState85);
        equipment12.setState(equipmentState85);
        equipment12.disable();
        equipment12.setDescription("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str93 = equipment12.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(labManager66);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(equipmentState85);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str93, "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1271");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setPasswordHash("");
        double double8 = labManager5.getHourlyRate();
        boolean boolean9 = labManager5.isActive();
        java.lang.String str10 = labManager5.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1272");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "LM-CERT", "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1273");
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
        java.lang.String str20 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str20, "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1274");
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
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment25.detach(equipmentObserver34);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1275");
        model.Guest guest3 = new model.Guest("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        boolean boolean4 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1276");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        student3.setActive(false);
        student3.setActive(false);
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1277");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        equipment3.markMaintenance();
        java.lang.String str13 = equipment3.getStatus();
        java.lang.String str14 = equipment3.getLabLocation();
        model.SensorUpdate sensorUpdate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Maintenance" + "'", str13, "Maintenance");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1278");
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
        java.lang.String str21 = equipment14.getDescription();
        equipment14.setStatus("Researcher");
        labManager5.addEquipment(equipment14);
        double double25 = labManager5.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        java.lang.String str37 = equipment29.getDescription();
        java.lang.String str38 = equipment29.getEquipmentId();
        equipment29.notifyObservers();
        equipment29.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment29.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str44 = equipment29.getDescription();
        observer.EquipmentObserver equipmentObserver45 = null;
        equipment29.detach(equipmentObserver45);
        labManager5.addEquipment(equipment29);
        model.Equipment equipment51 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        model.Reservation reservation55 = null;
        boolean boolean56 = equipment51.isModifyAvailable(localDateTime52, localDateTime53, "Faculty", reservation55);
        equipment51.setLabLocation("Faculty");
        java.lang.String str59 = equipment51.getDescription();
        java.lang.String str60 = equipment51.getEquipmentId();
        equipment51.notifyObservers();
        equipment51.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment51.setDescription("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        labManager5.markMaintenance(equipment51);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str44, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1279");
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
        java.lang.String str21 = equipment14.getDescription();
        equipment14.setStatus("Researcher");
        labManager5.addEquipment(equipment14);
        double double25 = labManager5.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        java.lang.String str37 = equipment29.getDescription();
        java.lang.String str38 = equipment29.getEquipmentId();
        equipment29.notifyObservers();
        equipment29.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment29.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str44 = equipment29.getDescription();
        observer.EquipmentObserver equipmentObserver45 = null;
        equipment29.detach(equipmentObserver45);
        labManager5.addEquipment(equipment29);
        state.EquipmentState equipmentState48 = equipment29.getCurrentState();
        equipment29.setLabLocation("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str44, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState48);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1280");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        researcher3.setEmail("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1281");
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
        model.HeadLabCoordinator headLabCoordinator43 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager45 = headLabCoordinator43.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID46 = null;
        headLabCoordinator43.setUserId(uUID46);
        model.LabManager labManager49 = headLabCoordinator43.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager51 = headLabCoordinator43.autoGenerateManagerAccount("Guest");
        model.LabManager labManager53 = headLabCoordinator43.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.HeadLabCoordinator headLabCoordinator57 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager59 = headLabCoordinator57.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager59.setActive(true);
        java.lang.String str62 = labManager59.getStatus();
        model.Equipment equipment66 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment66.isModifyAvailable(localDateTime67, localDateTime68, "Faculty", reservation70);
        equipment66.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment66.isModifyAvailable(localDateTime74, localDateTime75, "", reservation77);
        labManager59.markMaintenance(equipment66);
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment66.isModifyAvailable(localDateTime80, localDateTime81, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation83);
        labManager53.markMaintenance(equipment66);
        labManager5.markMaintenance(equipment66);
        observer.EquipmentObserver equipmentObserver87 = null;
        equipment66.attach(equipmentObserver87);
        // The following exception was thrown during execution in test generation
        try {
            equipment66.enable();
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
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertNotNull(labManager51);
        org.junit.Assert.assertNotNull(labManager53);
        org.junit.Assert.assertNotNull(labManager59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ACTIVE" + "'", str62, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1282");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1283");
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
        equipment3.setDescription("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment3.isModifyAvailable(localDateTime17, localDateTime18, "", reservation20);
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment3.attach(equipmentObserver22);
        equipment3.setDescription("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1284");
        model.Researcher researcher3 = new model.Researcher("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "ACTIVE", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean4 = researcher3.isActive();
        model.Guest guest8 = new model.Guest("HeadLabCoordinator", "", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str9 = guest8.getStatus();
        double double10 = guest8.getHourlyRate();
        double double11 = guest8.getHourlyRate();
        java.util.UUID uUID12 = guest8.getUserId();
        researcher3.setUserId(uUID12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertNotNull(uUID12);
// flaky "41) test1284(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID12.toString(), "71e72d5d-933f-4b36-87c5-6792ca881c01");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1285");
        model.Researcher researcher3 = new model.Researcher("HeadLabCoordinator", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = researcher3.getRole();
        double double5 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1286");
        model.Equipment equipment3 = new model.Equipment("User{userId=9f4644ed-2d37-4a6b-9fd1-0563c3568bcf, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=e6619bcc-60c9-4e1c-ad88-aa1b2934fea7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1287");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getEquipmentId();
        equipment3.enable();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        java.lang.String str8 = equipment3.getDescription();
        model.SensorUpdate sensorUpdate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1288");
        model.LabManager labManager3 = new model.LabManager("User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Maintenance", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1289");
        model.Guest guest3 = new model.Guest("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1290");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        java.util.UUID uUID7 = faculty3.getUserId();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "42) test1290(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "39a443b4-b27d-4121-bc6b-58bf19ff7501");
// flaky "12) test1290(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=39a443b4-b27d-4121-bc6b-58bf19ff7501, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=39a443b4-b27d-4121-bc6b-58bf19ff7501, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "5) test1290(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "39a443b4-b27d-4121-bc6b-58bf19ff7501");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1291");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager17.setActive(true);
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        labManager25.setEquipmentStatus(equipment29, "");
        java.lang.String str39 = equipment29.toString();
        java.lang.String str40 = equipment29.getDescription();
        labManager17.addEquipment(equipment29);
        model.Equipment equipment45 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "ACTIVE");
        labManager17.markMaintenance(equipment45);
        labManager9.addEquipment(equipment45);
        java.lang.String str48 = equipment45.getLabLocation();
        equipment45.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ACTIVE" + "'", str48, "ACTIVE");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1292");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getStatus();
        java.lang.String str8 = student3.getIdOrCertNumber();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1293");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "LabManager", "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.toString();
// flaky "43) test1293(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=4f9a032c-739b-4de5-83d1-374717cd8209, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=4f9a032c-739b-4de5-83d1-374717cd8209, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1294");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getPasswordHash();
        double double10 = faculty3.getHourlyRate();
        java.util.UUID uUID11 = faculty3.getUserId();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID22 = null;
        headLabCoordinator19.setUserId(uUID22);
        model.LabManager labManager25 = headLabCoordinator19.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager27 = headLabCoordinator19.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID28 = labManager27.getUserId();
        headLabCoordinator15.setUserId(uUID28);
        faculty3.setUserId(uUID28);
        faculty3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "44) test1294(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID11.toString(), "53ea3749-eb9d-42d3-8fb0-d36064bf4678");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(uUID28);
// flaky "13) test1294(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID28.toString(), "2878d83f-fb8c-4595-b7e7-11a6eb1c9599");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1295");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        double double15 = labManager5.getHourlyRate();
        double double16 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1296");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        model.SensorUpdate sensorUpdate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1297");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getStatus();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "INACTIVE" + "'", str5, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1298");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.toString();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment10 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment10.notifyObservers();
        equipment10.disable();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        strategy.PricingStrategy pricingStrategy15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation16 = new model.Reservation((model.User) labManager6, equipment10, localDateTime13, localDateTime14, pricingStrategy15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "45) test1298(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=63187968-99c1-45ea-b896-24a17c2bbcfa, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=63187968-99c1-45ea-b896-24a17c2bbcfa, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1299");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1300");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}", "User{userId=5bccdc97-eca9-4150-a2a4-d885f4ec051f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1301");
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
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.attach(equipmentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1302");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Guest");
        java.lang.String str4 = faculty3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1303");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.disable();
        labManager3.addEquipment(equipment7);
        boolean boolean11 = labManager3.isActive();
        labManager3.setPasswordHash("Guest");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        equipment17.enable();
        labManager3.setEquipmentStatus(equipment17, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str21 = equipment17.getEquipmentId();
        equipment17.setLabLocation("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment17.enable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1304");
        model.Researcher researcher3 = new model.Researcher("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1305");
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
        java.lang.String str24 = equipment18.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1306");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "46) test1306(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "3bf68180-a67f-4646-9781-d2d0963b2816");
// flaky "14) test1306(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=3bf68180-a67f-4646-9781-d2d0963b2816, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=3bf68180-a67f-4646-9781-d2d0963b2816, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1307");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double4 = headLabCoordinator3.getHourlyRate();
        double double5 = headLabCoordinator3.getHourlyRate();
        java.lang.String str6 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1308");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1309");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        java.util.UUID uUID4 = student3.getUserId();
        java.lang.String str5 = student3.getRole();
        student3.setIdOrCertNumber("User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID4);
// flaky "47) test1309(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "23772c64-71ff-4607-9563-83934656217d");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1310");
        model.Equipment equipment3 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.attach(equipmentObserver5);
        java.lang.String str7 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Maintenance" + "'", str7, "Maintenance");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1311");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPasswordHash();
        boolean boolean9 = faculty3.isActive();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "48) test1311(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "625d16be-7efc-4905-9939-63da2af3f56a");
// flaky "15) test1311(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=625d16be-7efc-4905-9939-63da2af3f56a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=625d16be-7efc-4905-9939-63da2af3f56a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1312");
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
        java.lang.String str22 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "49) test1312(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID14.toString(), "ad75dae2-d8c9-4891-8a90-73af6886a8d5");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Researcher" + "'", str22, "Researcher");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1313");
        model.Researcher researcher3 = new model.Researcher("User{userId=26f4380a-41a6-46a9-b770-09540d1b80d3, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1314");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        boolean boolean8 = faculty3.isActive();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1315");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        double double11 = guest3.getHourlyRate();
        java.lang.String str12 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1316");
        model.Faculty faculty3 = new model.Faculty("Student", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1317");
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
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        java.lang.String str35 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment28.isAvailable(localDateTime36, localDateTime37, "Faculty");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.lang.String str50 = equipment43.getDescription();
        state.EquipmentState equipmentState51 = equipment43.getCurrentState();
        equipment28.setState(equipmentState51);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment28.isAvailable(localDateTime53, localDateTime54, "Faculty");
        java.lang.String str57 = equipment28.getDescription();
        state.EquipmentState equipmentState58 = equipment28.getCurrentState();
        equipment11.setState(equipmentState58);
        equipment11.disable();
        model.SensorUpdate sensorUpdate61 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment11.applySensorUpdate(sensorUpdate61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(equipmentState58);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1318");
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
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment35.isModifyAvailable(localDateTime50, localDateTime51, "Temp123!", reservation53);
        observer.EquipmentObserver equipmentObserver55 = null;
        equipment35.attach(equipmentObserver55);
        java.lang.String str57 = equipment35.getStatus();
        java.lang.String str58 = equipment35.getEquipmentId();
        equipment35.setLabLocation("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Disabled" + "'", str57, "Disabled");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1319");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setPasswordHash("");
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1320");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getStatus();
        double double12 = researcher3.getHourlyRate();
        java.lang.String str13 = researcher3.getRole();
        model.Guest guest17 = new model.Guest("", "hi!", "hi!");
        java.lang.String str18 = guest17.getRole();
        double double19 = guest17.getHourlyRate();
        guest17.setPasswordHash("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str22 = guest17.toString();
        java.util.UUID uUID23 = guest17.getUserId();
        researcher3.setUserId(uUID23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 25.0d + "'", double19 == 25.0d);
// flaky "50) test1320(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str22, "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(uUID23);
// flaky "16) test1320(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID23.toString(), "61a9406c-0105-404f-816e-79520e3e5f8d");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1321");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = headLabCoordinator3.toString();
        java.lang.String str5 = headLabCoordinator3.getStatus();
// flaky "51) test1321(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1322");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getRole();
        double double11 = guest3.getHourlyRate();
        double double12 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1323");
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
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment15.isModifyAvailable(localDateTime22, localDateTime23, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation25);
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment15.attach(equipmentObserver27);
        java.lang.String str29 = equipment15.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            labManager5.markMaintenance(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1324");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        equipment7.disable();
        equipment7.setDescription("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        strategy.PricingStrategy pricingStrategy19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation20 = new model.Reservation((model.User) student3, equipment7, localDateTime17, localDateTime18, pricingStrategy19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1325");
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
        java.lang.String str81 = equipment68.getLabLocation();
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        boolean boolean85 = equipment68.isAvailable(localDateTime82, localDateTime83, "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1326");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getRole();
        java.lang.String str12 = researcher3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "52) test1326(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "efbe2b65-2cd8-4c42-83c7-3ab5b5bb6e9a");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1327");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1328");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=294af086-17eb-46ec-ace5-868738e46f3d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str8 = equipment7.getLabLocation();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment7.detach(equipmentObserver9);
        java.lang.String str11 = equipment7.getDescription();
        equipment7.notifyObservers();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        strategy.PricingStrategy pricingStrategy15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation16 = new model.Reservation((model.User) labManager3, equipment7, localDateTime13, localDateTime14, pricingStrategy15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1329");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getPasswordHash();
        java.lang.String str7 = student3.getPasswordHash();
        java.lang.String str8 = student3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "INACTIVE" + "'", str8, "INACTIVE");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1330");
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
        labManager5.setActive(true);
        boolean boolean48 = labManager5.isActive();
        java.lang.String str49 = labManager5.getPasswordHash();
        double double50 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Temp123!" + "'", str49, "Temp123!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1331");
        model.LabManager labManager3 = new model.LabManager("User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c709a753-175d-4244-a4d1-809d72ae7cc0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        model.Equipment equipment7 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment7.markMaintenance();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment7.attach(equipmentObserver9);
        java.lang.String str11 = equipment7.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1332");
        model.Equipment equipment3 = new model.Equipment("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1333");
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
        double double30 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1334");
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
        model.Equipment equipment38 = new model.Equipment("", "", "");
        java.lang.String str39 = equipment38.getDescription();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment38.isModifyAvailable(localDateTime40, localDateTime41, "hi!", reservation43);
        java.lang.String str45 = equipment38.getEquipmentId();
        equipment38.setStatus("");
        java.lang.String str48 = equipment38.getStatus();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean52 = equipment38.isAvailable(localDateTime49, localDateTime50, "hi!");
        labManager5.markMaintenance(equipment38);
        model.LabManager labManager57 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.lang.String str62 = equipment61.getDescription();
        equipment61.disable();
        labManager57.addEquipment(equipment61);
        java.lang.String str65 = equipment61.getLabLocation();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        strategy.PricingStrategy pricingStrategy68 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation69 = new model.Reservation((model.User) labManager5, equipment61, localDateTime66, localDateTime67, pricingStrategy68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1335");
        model.Student student3 = new model.Student("Researcher", "ACTIVE", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        model.LabManager labManager8 = new model.LabManager("Student", "Researcher", "Guest");
        model.Equipment equipment12 = new model.Equipment("", "", "");
        equipment12.enable();
        equipment12.enable();
        java.lang.String str15 = equipment12.getStatus();
        equipment12.markMaintenance();
        equipment12.setDescription("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager8.addEquipment(equipment12);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        strategy.PricingStrategy pricingStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation23 = new model.Reservation((model.User) student3, equipment12, localDateTime20, localDateTime21, pricingStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1336");
        model.Researcher researcher3 = new model.Researcher("User{userId=9ef4c45b-b43c-462d-88df-a443dbf38502, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=81a1aa84-9400-4eae-94ba-24b390e44a98, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1337");
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
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation19);
        state.EquipmentState equipmentState21 = equipment3.getCurrentState();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment3.isAvailable(localDateTime22, localDateTime23, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        model.SensorUpdate sensorUpdate26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1338");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        faculty3.setPasswordHash("ACTIVE");
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1339");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setPasswordHash("");
        faculty3.setPasswordHash("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getIdOrCertNumber();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1340");
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
        labManager5.setActive(false);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1341");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1342");
        model.Faculty faculty3 = new model.Faculty("Guest", "hi!", "Faculty");
        java.lang.String str4 = faculty3.getRole();
        boolean boolean5 = faculty3.isActive();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1343");
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
        researcher3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str19 = researcher3.toString();
        researcher3.setPasswordHash("User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        researcher3.setPasswordHash("User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "53) test1343(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID14.toString(), "150dca6f-8210-45c8-b018-a916b1419a4d");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
// flaky "17) test1343(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=150dca6f-8210-45c8-b018-a916b1419a4d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str19, "User{userId=150dca6f-8210-45c8-b018-a916b1419a4d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1344");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.toString();
        java.lang.String str12 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.attach(equipmentObserver13);
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.detach(equipmentObserver15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str11, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Maintenance" + "'", str12, "Maintenance");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1345");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=eed3056d-5c45-40da-9dc1-7e60fb03b87c, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1346");
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
        state.EquipmentState equipmentState15 = equipment3.getCurrentState();
        java.lang.String str16 = equipment3.getStatus();
        equipment3.setStatus("User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
        org.junit.Assert.assertNotNull(equipmentState15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Available" + "'", str16, "Available");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1347");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1348");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        guest3.setEmail("Maintenance");
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1349");
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
        equipment3.markMaintenance();
        equipment3.setDescription("HeadLabCoordinator");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment3.isModifyAvailable(localDateTime24, localDateTime25, "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", reservation27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1350");
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
        java.lang.String str32 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment3.detach(equipmentObserver33);
        model.SensorUpdate sensorUpdate35 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1351");
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
        model.Equipment equipment80 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        model.Reservation reservation84 = null;
        boolean boolean85 = equipment80.isModifyAvailable(localDateTime81, localDateTime82, "Faculty", reservation84);
        equipment80.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        model.Reservation reservation91 = null;
        boolean boolean92 = equipment80.isModifyAvailable(localDateTime88, localDateTime89, "", reservation91);
        java.lang.String str93 = equipment80.getLabLocation();
        observer.EquipmentObserver equipmentObserver94 = null;
        equipment80.detach(equipmentObserver94);
        state.EquipmentState equipmentState96 = equipment80.getCurrentState();
        state.EquipmentState equipmentState97 = equipment80.getCurrentState();
        equipment10.setState(equipmentState97);
        java.lang.String str99 = equipment10.getEquipmentId();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Faculty" + "'", str93, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState96);
        org.junit.Assert.assertNotNull(equipmentState97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1352");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver11 = null;
        equipment3.detach(equipmentObserver11);
        equipment3.notifyObservers();
        model.SensorUpdate sensorUpdate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1353");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1354");
        model.Student student3 = new model.Student("User{userId=452c93a8-2c4b-4a20-b0c8-51949537a949, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=6f3c3700-9cf7-4c67-84ed-9a21ccf02f91, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1355");
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
        java.lang.String str46 = equipment36.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1356");
        model.Equipment equipment3 = new model.Equipment("User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=e198018f-95c6-450a-ad5f-675ecbf69376, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "Disabled");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1357");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1358");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.toString();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment13 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment13.markMaintenance();
        labManager9.addEquipment(equipment13);
        state.EquipmentState equipmentState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment13.setState(equipmentState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
// flaky "54) test1358(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=ee7a31a7-95fa-4c9c-ad55-d6de87422caf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str7, "User{userId=ee7a31a7-95fa-4c9c-ad55-d6de87422caf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1359");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.disable();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}", reservation19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1360");
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
        java.lang.String str19 = equipment3.getLabLocation();
        equipment3.enable();
        equipment3.setLabLocation("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str19, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1361");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        equipment3.disable();
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        model.Reservation reservation10 = null;
        boolean boolean11 = equipment3.isModifyAvailable(localDateTime7, localDateTime8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}", reservation10);
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1362");
        model.Faculty faculty3 = new model.Faculty("User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=321af3c9-2c62-49f9-9643-94cb3f73b88e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1363");
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
        equipment3.setStatus("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1364");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        labManager8.setEquipmentStatus(equipment18, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double22 = labManager8.getHourlyRate();
        java.lang.String str23 = labManager8.getEmail();
        java.lang.String str24 = labManager8.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LM-CERT" + "'", str23, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LM-CERT" + "'", str24, "LM-CERT");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1365");
        model.Faculty faculty3 = new model.Faculty("User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1366");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        equipment13.disable();
        equipment13.setLabLocation("HeadLabCoordinator");
        state.EquipmentState equipmentState19 = equipment13.getCurrentState();
        java.lang.String str20 = equipment13.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1367");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        boolean boolean7 = faculty3.isActive();
        java.util.UUID uUID8 = faculty3.getUserId();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment12.isModifyAvailable(localDateTime13, localDateTime14, "Faculty", reservation16);
        equipment12.setLabLocation("Faculty");
        java.lang.String str20 = equipment12.getDescription();
        java.lang.String str21 = equipment12.getEquipmentId();
        java.lang.String str22 = equipment12.getDescription();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment12.detach(equipmentObserver23);
        java.lang.String str25 = equipment12.getLabLocation();
        equipment12.setDescription("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment12.enable();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        strategy.PricingStrategy pricingStrategy31 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation32 = new model.Reservation((model.User) faculty3, equipment12, localDateTime29, localDateTime30, pricingStrategy31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "55) test1367(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID8.toString(), "4d7e97ae-eeb4-4d20-bae2-15c7b70df7b3");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1368");
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
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.lang.String str18 = equipment3.getStatus();
        java.lang.String str19 = equipment3.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1369");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Maintenance");
        java.util.UUID uUID4 = labManager3.getUserId();
        boolean boolean5 = labManager3.isActive();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "56) test1369(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "56136f2a-2706-4aff-8522-a7b004c70551");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1370");
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
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        equipment3.setDescription("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        equipment3.setLabLocation("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment3.setDescription("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str25 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str25, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1371");
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
        java.lang.String str40 = labManager5.getRole();
        java.lang.String str41 = labManager5.getPasswordHash();
        labManager5.setEmail("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment47 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment47.markMaintenance();
        observer.EquipmentObserver equipmentObserver49 = null;
        equipment47.attach(equipmentObserver49);
        java.lang.String str51 = equipment47.getEquipmentId();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        model.Reservation reservation55 = null;
        boolean boolean56 = equipment47.isModifyAvailable(localDateTime52, localDateTime53, "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation55);
        labManager5.setEquipmentStatus(equipment47, "User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Temp123!" + "'", str41, "Temp123!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "LM-CERT" + "'", str51, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1372");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getRole();
        guest3.setPasswordHash("User{userId=c0e8c15f-39a0-4df9-893a-6ee3a23f42a5, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1373");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        double double10 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1374");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "", "Student");
        java.lang.String str4 = headLabCoordinator3.toString();
        double double5 = headLabCoordinator3.getHourlyRate();
// flaky "57) test1374(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=47645e5a-27f2-4a0e-8f64-16e02a77f5e4, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}" + "'", str4, "User{userId=47645e5a-27f2-4a0e-8f64-16e02a77f5e4, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1375");
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
        equipment3.setStatus("User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1376");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ecc2e2ab-6898-4e8a-9782-e358bc6a80f6, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1377");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setLabLocation("Researcher");
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setLabLocation("LM-CERT");
        equipment3.setLabLocation("User{userId=e6619bcc-60c9-4e1c-ad88-aa1b2934fea7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1378");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        double double9 = guest3.getHourlyRate();
        guest3.setEmail("User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean12 = guest3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1379");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1380");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "User{userId=6b7d0607-07ac-4d05-a5fc-bde0b0292564, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1381");
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
        labManager5.setIdOrCertNumber("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID48 = labManager5.getUserId();
        model.HeadLabCoordinator headLabCoordinator52 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager54 = headLabCoordinator52.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID55 = null;
        headLabCoordinator52.setUserId(uUID55);
        model.LabManager labManager58 = headLabCoordinator52.autoGenerateManagerAccount("ACTIVE");
        double double59 = labManager58.getHourlyRate();
        model.Equipment equipment63 = new model.Equipment("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        labManager58.markMaintenance(equipment63);
        labManager5.markMaintenance(equipment63);
        java.lang.String str66 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "58) test1381(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID48.toString(), "f05035b7-2cce-4e3a-9241-ba26bb961ca6");
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "LabManager" + "'", str66, "LabManager");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1382");
        model.Student student3 = new model.Student("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "", "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setActive(true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1383");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1384");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getPasswordHash();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1385");
        model.LabManager labManager3 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher7 = new model.Researcher("", "hi!", "hi!");
        researcher7.setEmail("hi!");
        double double10 = researcher7.getHourlyRate();
        java.util.UUID uUID11 = researcher7.getUserId();
        labManager3.setUserId(uUID11);
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID19 = null;
        headLabCoordinator16.setUserId(uUID19);
        model.LabManager labManager22 = headLabCoordinator16.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager24 = headLabCoordinator16.autoGenerateManagerAccount("Guest");
        java.lang.String str25 = labManager24.toString();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.lang.String str30 = equipment29.getDescription();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment29.isModifyAvailable(localDateTime31, localDateTime32, "hi!", reservation34);
        equipment29.disable();
        equipment29.enable();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean41 = equipment29.isAvailable(localDateTime38, localDateTime39, "");
        model.HeadLabCoordinator headLabCoordinator45 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager47 = headLabCoordinator45.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment51 = new model.Equipment("", "", "");
        labManager47.addEquipment(equipment51);
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        java.lang.String str63 = equipment56.getEquipmentId();
        equipment56.setStatus("");
        state.EquipmentState equipmentState66 = equipment56.getCurrentState();
        equipment51.setState(equipmentState66);
        equipment29.setState(equipmentState66);
        labManager24.markMaintenance(equipment29);
        labManager3.addEquipment(equipment29);
        model.SensorUpdate sensorUpdate71 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment29.applySensorUpdate(sensorUpdate71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "59) test1385(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID11.toString(), "8552bd76-f22b-4f16-ad1d-06abe9f9e5b7");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(labManager24);
// flaky "18) test1385(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User{userId=17550ae5-e69b-4dba-ad79-50de0bac0c56, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str25, "User{userId=17550ae5-e69b-4dba-ad79-50de0bac0c56, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState66);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1386");
        model.Student student3 = new model.Student("LM-CERT", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1387");
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
        labManager5.setActive(true);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "LabManager" + "'", str44, "LabManager");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1388");
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
        model.Equipment equipment19 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str20 = equipment19.getEquipmentId();
        java.lang.String str21 = equipment19.getEquipmentId();
        equipment19.enable();
        state.EquipmentState equipmentState23 = equipment19.getCurrentState();
        equipment3.setState(equipmentState23);
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1389");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1390");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1391");
        model.Guest guest3 = new model.Guest("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1392");
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
        java.lang.String str25 = labManager5.getIdOrCertNumber();
        double double26 = labManager5.getHourlyRate();
        labManager5.setEmail("User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LM-CERT" + "'", str25, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1393");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1394");
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
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        java.lang.String str37 = equipment29.getDescription();
        java.lang.String str38 = equipment29.getEquipmentId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment29.isModifyAvailable(localDateTime39, localDateTime40, "INACTIVE", reservation42);
        state.EquipmentState equipmentState44 = equipment29.getCurrentState();
        equipment22.setState(equipmentState44);
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment22.attach(equipmentObserver46);
        equipment22.setLabLocation("User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment22.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1395");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setLabLocation("HeadLabCoordinator");
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.detach(equipmentObserver13);
        java.lang.String str15 = equipment3.getStatus();
        java.lang.String str16 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setLabLocation("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Maintenance" + "'", str15, "Maintenance");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1396");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getIdOrCertNumber();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment16.isModifyAvailable(localDateTime17, localDateTime18, "Faculty", reservation20);
        equipment16.setLabLocation("Faculty");
        java.lang.String str24 = equipment16.getDescription();
        java.lang.String str25 = equipment16.getEquipmentId();
        equipment16.notifyObservers();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment16.attach(equipmentObserver27);
        java.lang.String str29 = equipment16.getLabLocation();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment16.isAvailable(localDateTime30, localDateTime31, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager5.setEquipmentStatus(equipment16, "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LM-CERT" + "'", str12, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1397");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Maintenance" + "'", str7, "Maintenance");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1398");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getPasswordHash();
        student3.setEmail("User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1399");
        model.Student student3 = new model.Student("Researcher", "Available", "HeadLabCoordinator");
        student3.setEmail("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        student3.setIdOrCertNumber("User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1400");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        faculty3.setPasswordHash("User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setPasswordHash("User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1401");
        model.LabManager labManager3 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        labManager9.setEquipmentStatus(equipment13, "");
        equipment13.setDescription("");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        equipment28.notifyObservers();
        observer.EquipmentObserver equipmentObserver37 = null;
        equipment28.attach(equipmentObserver37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment28.isModifyAvailable(localDateTime39, localDateTime40, "Faculty", reservation42);
        state.EquipmentState equipmentState44 = equipment28.getCurrentState();
        equipment13.setState(equipmentState44);
        labManager3.setEquipmentStatus(equipment13, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver48 = null;
        equipment13.detach(equipmentObserver48);
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment13.attach(equipmentObserver50);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1402");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        boolean boolean7 = faculty3.isActive();
        java.lang.String str8 = faculty3.getRole();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1403");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        equipment3.disable();
        equipment3.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1404");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = labManager9.getIdOrCertNumber();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        equipment14.enable();
        equipment14.enable();
        java.lang.String str17 = equipment14.getStatus();
        java.lang.String str18 = equipment14.getDescription();
        equipment14.setDescription("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment14.attach(equipmentObserver21);
        labManager9.setEquipmentStatus(equipment14, "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment28.isAvailable(localDateTime36, localDateTime37, "");
        java.lang.String str40 = equipment28.getDescription();
        labManager9.markMaintenance(equipment28);
        model.SensorUpdate sensorUpdate42 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment28.applySensorUpdate(sensorUpdate42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1405");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        equipment15.enable();
        equipment15.enable();
        java.lang.String str18 = equipment15.getStatus();
        equipment15.markMaintenance();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment15.attach(equipmentObserver20);
        java.lang.String str22 = equipment15.getStatus();
        java.lang.String str23 = equipment15.getLabLocation();
        labManager9.addEquipment(equipment15);
        double double25 = labManager9.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.lang.String str30 = equipment29.getDescription();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment29.isModifyAvailable(localDateTime31, localDateTime32, "hi!", reservation34);
        equipment29.disable();
        java.lang.String str37 = equipment29.getEquipmentId();
        java.lang.String str38 = equipment29.getDescription();
        equipment29.notifyObservers();
        labManager9.addEquipment(equipment29);
        boolean boolean41 = labManager9.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1406");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1407");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        student3.setActive(false);
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1408");
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
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment36.isModifyAvailable(localDateTime46, localDateTime47, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation49);
        observer.EquipmentObserver equipmentObserver51 = null;
        equipment36.attach(equipmentObserver51);
        equipment36.setLabLocation("User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.SensorUpdate sensorUpdate55 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment36.applySensorUpdate(sensorUpdate55);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1409");
        model.Faculty faculty3 = new model.Faculty("", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1410");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        model.Equipment equipment8 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment8.disable();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        strategy.PricingStrategy pricingStrategy12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation13 = new model.Reservation((model.User) guest3, equipment8, localDateTime10, localDateTime11, pricingStrategy12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1411");
        model.Student student3 = new model.Student("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1412");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1413");
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
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.attach(equipmentObserver15);
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.detach(equipmentObserver17);
        equipment3.setStatus("");
        equipment3.setLabLocation("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1414");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.setStatus("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1415");
        model.Guest guest3 = new model.Guest("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1416");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getRole();
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1417");
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
        java.lang.String str22 = equipment9.getLabLocation();
        equipment9.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1418");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        faculty3.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.lang.String str10 = faculty3.getPasswordHash();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "60) test1418(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "7c489ff6-23de-47df-a63b-4ac4dddbc0bb");
// flaky "19) test1418(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1419");
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
        java.lang.String str19 = equipment3.getLabLocation();
        equipment3.enable();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str19, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1420");
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
        researcher3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str19 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "61) test1420(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID14.toString(), "13951707-6ba9-43fb-9071-58982003f533");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1421");
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
        model.Equipment equipment65 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager5.markMaintenance(equipment65);
        java.lang.String str67 = equipment65.getStatus();
        java.lang.String str68 = equipment65.toString();
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
// flaky "62) test1421(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID59.toString(), "9f245414-8028-4da8-b4be-1b0ac09a423c");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Maintenance" + "'", str67, "Maintenance");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Maintenance'}" + "'", str68, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Maintenance'}");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1422");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment3.disable();
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1423");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        java.lang.String str6 = labManager3.getRole();
        model.Equipment equipment10 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str11 = equipment10.getLabLocation();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment10.detach(equipmentObserver12);
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment10.detach(equipmentObserver14);
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
        java.lang.String str37 = equipment30.getDescription();
        equipment30.setStatus("Researcher");
        labManager21.addEquipment(equipment30);
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager46 = headLabCoordinator44.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        labManager46.addEquipment(equipment50);
        model.Equipment equipment55 = new model.Equipment("", "", "");
        java.lang.String str56 = equipment55.getDescription();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment55.isModifyAvailable(localDateTime57, localDateTime58, "hi!", reservation60);
        java.lang.String str62 = equipment55.getEquipmentId();
        equipment55.setStatus("");
        state.EquipmentState equipmentState65 = equipment55.getCurrentState();
        equipment50.setState(equipmentState65);
        equipment30.setState(equipmentState65);
        equipment10.setState(equipmentState65);
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        boolean boolean72 = equipment10.isAvailable(localDateTime69, localDateTime70, "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str73 = equipment10.getLabLocation();
        labManager3.addEquipment(equipment10);
        observer.EquipmentObserver equipmentObserver75 = null;
        equipment10.attach(equipmentObserver75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(equipmentState65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1424");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1425");
        model.LabManager labManager3 = new model.LabManager("Researcher", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Temp123!");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getStatus();
        model.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1426");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        equipment9.setDescription("");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        equipment24.notifyObservers();
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment24.attach(equipmentObserver33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment24.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        state.EquipmentState equipmentState40 = equipment24.getCurrentState();
        equipment9.setState(equipmentState40);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment9.isModifyAvailable(localDateTime42, localDateTime43, "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation45);
        java.lang.String str47 = equipment9.getEquipmentId();
        equipment9.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1427");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = headLabCoordinator3.toString();
        double double5 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = labManager7.getPasswordHash();
// flaky "63) test1427(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=ac16180e-c994-4226-96ba-7796ddfa0394, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=ac16180e-c994-4226-96ba-7796ddfa0394, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Temp123!" + "'", str8, "Temp123!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1428");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.toString();
        java.lang.String str5 = labManager3.getRole();
        model.Equipment equipment9 = new model.Equipment("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.setEquipmentStatus(equipment9, "User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
// flaky "64) test1428(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=bfc196bf-0e5c-4790-b5a9-d4943d1bf144, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=bfc196bf-0e5c-4790-b5a9-d4943d1bf144, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1429");
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
        equipment35.setDescription("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment35.disable();
        model.SensorUpdate sensorUpdate53 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment35.applySensorUpdate(sensorUpdate53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1430");
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
        java.lang.Class<?> wildcardClass32 = labManager13.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1431");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        researcher3.setActive(false);
        java.lang.String str11 = researcher3.getStatus();
        java.lang.String str12 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "INACTIVE" + "'", str11, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1432");
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
        java.lang.String str19 = equipment3.toString();
        equipment3.setDescription("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(equipmentState18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1433");
        model.Faculty faculty3 = new model.Faculty("HeadLabCoordinator", "", "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1434");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        java.lang.String str11 = equipment3.getLabLocation();
        java.lang.String str12 = equipment3.getLabLocation();
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1435");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str5, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1436");
        model.LabManager labManager3 = new model.LabManager("User{userId=29535a0d-9d8c-4304-8892-1bf93b64cc11, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1437");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        boolean boolean9 = headLabCoordinator3.isActive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1438");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getPasswordHash();
        model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager5.setEquipmentStatus(equipment12, "User{userId=f684201a-a2db-4655-9227-3d99fb64e0eb, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Temp123!" + "'", str11, "Temp123!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1439");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        boolean boolean6 = faculty3.isActive();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1440");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager9.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        equipment15.enable();
        equipment15.enable();
        java.lang.String str18 = equipment15.getStatus();
        equipment15.markMaintenance();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment15.attach(equipmentObserver20);
        java.lang.String str22 = equipment15.getStatus();
        java.lang.String str23 = equipment15.getLabLocation();
        labManager9.addEquipment(equipment15);
        double double25 = labManager9.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        java.lang.String str37 = equipment29.getDescription();
        java.lang.String str38 = equipment29.getEquipmentId();
        java.lang.String str39 = equipment29.getDescription();
        observer.EquipmentObserver equipmentObserver40 = null;
        equipment29.detach(equipmentObserver40);
        java.lang.String str42 = equipment29.getLabLocation();
        equipment29.setStatus("hi!");
        equipment29.markMaintenance();
        java.lang.String str46 = equipment29.getDescription();
        labManager9.setEquipmentStatus(equipment29, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1441");
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
        java.lang.String str53 = equipment49.getLabLocation();
        java.lang.String str54 = equipment49.toString();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str54, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1442");
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
        model.Equipment equipment23 = new model.Equipment("", "", "");
        equipment23.enable();
        equipment23.enable();
        java.lang.String str26 = equipment23.getStatus();
        equipment23.markMaintenance();
        equipment23.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str30 = equipment23.getDescription();
        java.lang.String str31 = equipment23.toString();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment23.isAvailable(localDateTime32, localDateTime33, "User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        labManager5.addEquipment(equipment23);
        java.lang.String str37 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "65) test1442(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID19.toString(), "5353cc4b-638c-4895-b314-a51cea96fb70");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1443");
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
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.lang.String str21 = equipment20.getDescription();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment20.isModifyAvailable(localDateTime22, localDateTime23, "hi!", reservation25);
        java.lang.String str27 = equipment20.getEquipmentId();
        equipment20.setStatus("");
        java.lang.String str30 = equipment20.getEquipmentId();
        java.lang.String str31 = equipment20.getEquipmentId();
        equipment20.setLabLocation("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment20.detach(equipmentObserver34);
        java.lang.String str36 = equipment20.getEquipmentId();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        strategy.PricingStrategy pricingStrategy39 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation40 = new model.Reservation((model.User) guest3, equipment20, localDateTime37, localDateTime38, pricingStrategy39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1444");
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
        java.lang.String str36 = labManager5.getRole();
        model.Equipment equipment40 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str41 = equipment40.getLabLocation();
        observer.EquipmentObserver equipmentObserver42 = null;
        equipment40.detach(equipmentObserver42);
        java.lang.String str44 = equipment40.getDescription();
        equipment40.notifyObservers();
        equipment40.enable();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean50 = equipment40.isAvailable(localDateTime47, localDateTime48, "Guest");
        labManager5.setEquipmentStatus(equipment40, "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment56.isModifyAvailable(localDateTime57, localDateTime58, "Faculty", reservation60);
        equipment56.setLabLocation("Faculty");
        java.lang.String str64 = equipment56.getDescription();
        java.lang.String str65 = equipment56.getEquipmentId();
        equipment56.notifyObservers();
        observer.EquipmentObserver equipmentObserver67 = null;
        equipment56.attach(equipmentObserver67);
        java.lang.String str69 = equipment56.getLabLocation();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        boolean boolean73 = equipment56.isAvailable(localDateTime70, localDateTime71, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        // The following exception was thrown during execution in test generation
        try {
            labManager5.markMaintenance(equipment56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ACTIVE" + "'", str44, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Faculty" + "'", str69, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1445");
        model.Student student3 = new model.Student("", "User{userId=5edfd4cf-e8e1-4a5c-95db-29c5e3314281, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1446");
        model.User user0 = null;
        model.HeadLabCoordinator headLabCoordinator4 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager6 = headLabCoordinator4.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment10.isModifyAvailable(localDateTime11, localDateTime12, "Faculty", reservation14);
        equipment10.setLabLocation("Faculty");
        labManager6.setEquipmentStatus(equipment10, "Guest");
        model.Equipment equipment23 = new model.Equipment("", "", "");
        labManager6.addEquipment(equipment23);
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID31 = null;
        headLabCoordinator28.setUserId(uUID31);
        model.LabManager labManager34 = headLabCoordinator28.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        equipment38.enable();
        labManager34.addEquipment(equipment38);
        model.Equipment equipment44 = new model.Equipment("", "", "");
        java.lang.String str45 = equipment44.getDescription();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment44.isModifyAvailable(localDateTime46, localDateTime47, "hi!", reservation49);
        java.lang.String str51 = equipment44.getDescription();
        state.EquipmentState equipmentState52 = equipment44.getCurrentState();
        equipment44.setLabLocation("Student");
        labManager34.setEquipmentStatus(equipment44, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment60.isModifyAvailable(localDateTime61, localDateTime62, "Faculty", reservation64);
        equipment60.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        model.Reservation reservation71 = null;
        boolean boolean72 = equipment60.isModifyAvailable(localDateTime68, localDateTime69, "", reservation71);
        equipment60.disable();
        labManager34.addEquipment(equipment60);
        equipment60.markMaintenance();
        labManager6.addEquipment(equipment60);
        equipment60.setLabLocation("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        strategy.PricingStrategy pricingStrategy81 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation82 = new model.Reservation(user0, equipment60, localDateTime79, localDateTime80, pricingStrategy81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(equipmentState52);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1447");
        model.Guest guest3 = new model.Guest("User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1448");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1449");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getIdOrCertNumber();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        java.lang.String str9 = equipment8.getDescription();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment8.isModifyAvailable(localDateTime10, localDateTime11, "hi!", reservation13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment8.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation18);
        java.lang.String str20 = equipment8.getStatus();
        equipment8.markMaintenance();
        java.lang.String str22 = equipment8.getDescription();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        strategy.PricingStrategy pricingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation26 = new model.Reservation((model.User) headLabCoordinator3, equipment8, localDateTime23, localDateTime24, pricingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Available" + "'", str20, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1450");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=81a1aa84-9400-4eae-94ba-24b390e44a98, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1451");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment15.isModifyAvailable(localDateTime16, localDateTime17, "Faculty", reservation19);
        equipment15.setLabLocation("Faculty");
        labManager11.setEquipmentStatus(equipment15, "");
        equipment15.notifyObservers();
        labManager3.addEquipment(equipment15);
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment15.detach(equipmentObserver27);
        equipment15.setLabLocation("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        equipment15.setDescription("User{userId=164f5fb5-b442-464a-a5af-09c0e9a37d7c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1452");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        java.lang.String str6 = student3.getStatus();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "66) test1452(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "INACTIVE" + "'", str6, "INACTIVE");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1453");
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
        equipment12.enable();
        equipment12.setLabLocation("");
        equipment12.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1454");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        equipment3.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        model.SensorUpdate sensorUpdate16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1455");
        model.Student student3 = new model.Student("User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=9259ab1e-99ff-4fc7-a7c5-e086350ee87d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1456");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getIdOrCertNumber();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = faculty3.getRole();
        java.lang.String str11 = faculty3.getRole();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1457");
        model.Researcher researcher3 = new model.Researcher("LM-CERT", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "INACTIVE");
        double double4 = researcher3.getHourlyRate();
        model.LabManager labManager8 = new model.LabManager("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str15 = headLabCoordinator12.getRole();
        model.LabManager labManager17 = headLabCoordinator12.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str18 = labManager17.getRole();
        model.Equipment equipment22 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment22.markMaintenance();
        labManager17.addEquipment(equipment22);
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment34.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        equipment34.setLabLocation("Faculty");
        labManager30.setEquipmentStatus(equipment34, "");
        java.lang.String str44 = equipment34.getLabLocation();
        equipment34.notifyObservers();
        java.lang.String str46 = equipment34.getLabLocation();
        labManager17.setEquipmentStatus(equipment34, "Disabled");
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment52.isModifyAvailable(localDateTime53, localDateTime54, "Faculty", reservation56);
        equipment52.setLabLocation("Faculty");
        java.lang.String str60 = equipment52.getDescription();
        java.lang.String str61 = equipment52.getEquipmentId();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment52.isModifyAvailable(localDateTime62, localDateTime63, "INACTIVE", reservation65);
        java.lang.String str67 = equipment52.getEquipmentId();
        labManager17.setEquipmentStatus(equipment52, "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        labManager8.addEquipment(equipment52);
        model.Equipment equipment74 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        model.Reservation reservation78 = null;
        boolean boolean79 = equipment74.isModifyAvailable(localDateTime75, localDateTime76, "Faculty", reservation78);
        equipment74.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        model.Reservation reservation85 = null;
        boolean boolean86 = equipment74.isModifyAvailable(localDateTime82, localDateTime83, "", reservation85);
        java.lang.String str87 = equipment74.getLabLocation();
        observer.EquipmentObserver equipmentObserver88 = null;
        equipment74.detach(equipmentObserver88);
        java.time.LocalDateTime localDateTime90 = null;
        java.time.LocalDateTime localDateTime91 = null;
        boolean boolean93 = equipment74.isAvailable(localDateTime90, localDateTime91, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        labManager8.markMaintenance(equipment74);
        java.time.LocalDateTime localDateTime95 = null;
        java.time.LocalDateTime localDateTime96 = null;
        strategy.PricingStrategy pricingStrategy97 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation98 = new model.Reservation((model.User) researcher3, equipment74, localDateTime95, localDateTime96, pricingStrategy97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Faculty" + "'", str44, "Faculty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Faculty" + "'", str46, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Faculty" + "'", str87, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1458");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getRole();
        java.util.UUID uUID7 = student3.getUserId();
        model.Guest guest11 = new model.Guest("", "hi!", "hi!");
        java.lang.String str12 = guest11.getRole();
        double double13 = guest11.getHourlyRate();
        double double14 = guest11.getHourlyRate();
        java.lang.String str15 = guest11.getRole();
        java.lang.String str16 = guest11.getEmail();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID21 = headLabCoordinator20.getUserId();
        guest11.setUserId(uUID21);
        student3.setUserId(uUID21);
        java.lang.String str24 = student3.getIdOrCertNumber();
        java.lang.String str25 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(uUID21);
// flaky "67) test1458(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID21.toString(), "a3bed70b-280a-4f43-b09c-e1c779bff56a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1459");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        java.lang.String str14 = equipment3.getStatus();
        equipment3.setLabLocation("User{userId=294af086-17eb-46ec-ace5-868738e46f3d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1460");
        model.Student student3 = new model.Student("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "Researcher");
        java.lang.String str4 = student3.getPasswordHash();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str4, "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1461");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        boolean boolean9 = guest3.isActive();
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1462");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        double double11 = researcher3.getHourlyRate();
        java.lang.String str12 = researcher3.getRole();
        researcher3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1463");
        model.Equipment equipment3 = new model.Equipment("User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1464");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        double double7 = researcher3.getHourlyRate();
        double double8 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1465");
        model.Guest guest3 = new model.Guest("User{userId=85029e47-3c9d-47ae-86ec-5e5306fd4423, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1466");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPasswordHash();
        java.lang.String str9 = faculty3.getRole();
        java.lang.String str10 = faculty3.toString();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "68) test1466(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "bd34c217-a497-4709-b021-568fc8ef573b");
// flaky "20) test1466(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
// flaky "6) test1466(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1467");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        double double11 = researcher3.getHourlyRate();
        java.lang.String str12 = researcher3.getEmail();
        model.Faculty faculty16 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID17 = faculty16.getUserId();
        java.lang.String str18 = faculty16.toString();
        java.lang.String str19 = faculty16.getRole();
        java.util.UUID uUID20 = faculty16.getUserId();
        java.lang.String str21 = faculty16.getEmail();
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID26 = headLabCoordinator25.getUserId();
        faculty16.setUserId(uUID26);
        researcher3.setUserId(uUID26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(uUID17);
// flaky "69) test1467(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID17.toString(), "28bd928a-ecb0-459b-9a1f-26a50bb3f723");
// flaky "21) test1467(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=28bd928a-ecb0-459b-9a1f-26a50bb3f723, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str18, "User{userId=28bd928a-ecb0-459b-9a1f-26a50bb3f723, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "7) test1467(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID20.toString(), "28bd928a-ecb0-459b-9a1f-26a50bb3f723");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(uUID26);
// flaky "1) test1467(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID26.toString(), "24476b32-a679-4e81-92a3-d8248f0bae3e");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1468");
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
        java.lang.Class<?> wildcardClass22 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1469");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=294af086-17eb-46ec-ace5-868738e46f3d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1470");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation14);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        java.lang.Class<?> wildcardClass18 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1471");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        java.lang.String str9 = headLabCoordinator3.getRole();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1472");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1473");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        researcher3.setPasswordHash("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1474");
        model.Student student3 = new model.Student("ACTIVE", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Maintenance");
        java.lang.String str4 = student3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Maintenance" + "'", str4, "Maintenance");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1475");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        java.lang.String str19 = equipment9.getLabLocation();
        equipment9.notifyObservers();
        model.SensorUpdate sensorUpdate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1476");
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
        java.lang.String str43 = equipment35.getDescription();
        java.lang.String str44 = equipment35.getEquipmentId();
        equipment35.notifyObservers();
        equipment35.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment35.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str50 = equipment35.getDescription();
        labManager9.markMaintenance(equipment35);
        java.lang.String str52 = labManager9.getEmail();
        model.Equipment equipment56 = new model.Equipment("", "", "");
        equipment56.enable();
        equipment56.setStatus("ACTIVE");
        equipment56.notifyObservers();
        java.lang.String str61 = equipment56.getEquipmentId();
        labManager9.addEquipment(equipment56);
        double double63 = labManager9.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str50, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ACTIVE" + "'", str52, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1477");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getStatus();
        student3.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        java.lang.String str8 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "INACTIVE" + "'", str5, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}" + "'", str8, "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1478");
        model.Guest guest3 = new model.Guest("HeadLabCoordinator", "", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = guest3.getStatus();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
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
        equipment21.disable();
        equipment21.setStatus("");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        strategy.PricingStrategy pricingStrategy37 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation38 = new model.Reservation((model.User) guest3, equipment21, localDateTime35, localDateTime36, pricingStrategy37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1479");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}", reservation19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1480");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Temp123!");
        double double4 = guest3.getHourlyRate();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getRole();
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
        model.Equipment equipment34 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment34.setLabLocation("ACTIVE");
        java.lang.String str37 = equipment34.getEquipmentId();
        labManager14.setEquipmentStatus(equipment34, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str40 = equipment34.toString();
        java.lang.String str41 = equipment34.getEquipmentId();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        strategy.PricingStrategy pricingStrategy44 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation45 = new model.Reservation((model.User) guest3, equipment34, localDateTime42, localDateTime43, pricingStrategy44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ACTIVE" + "'", str37, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str40, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ACTIVE" + "'", str41, "ACTIVE");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1481");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        java.util.UUID uUID4 = researcher3.getUserId();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getStatus();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "70) test1481(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID4.toString(), "46ce0e12-cb47-4b69-94cb-524cafc91ef8");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1482");
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
        java.lang.String str25 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1483");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str13 = headLabCoordinator3.getRole();
        boolean boolean14 = headLabCoordinator3.isActive();
        java.lang.String str15 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1484");
        model.Student student3 = new model.Student("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment7.isModifyAvailable(localDateTime8, localDateTime9, "Faculty", reservation11);
        java.lang.String str13 = equipment7.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        strategy.PricingStrategy pricingStrategy16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation17 = new model.Reservation((model.User) student3, equipment7, localDateTime14, localDateTime15, pricingStrategy16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Available" + "'", str13, "Available");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1485");
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
        model.Equipment equipment77 = new model.Equipment("", "", "");
        java.lang.String str78 = equipment77.getDescription();
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment77.isModifyAvailable(localDateTime79, localDateTime80, "hi!", reservation82);
        java.lang.String str84 = equipment77.getEquipmentId();
        equipment77.setStatus("");
        java.lang.String str87 = equipment77.getEquipmentId();
        java.lang.String str88 = equipment77.getEquipmentId();
        equipment77.setLabLocation("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment77.setStatus("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment77.enable();
        labManager5.addEquipment(equipment77);
        java.lang.String str95 = equipment77.getStatus();
        equipment77.markMaintenance();
        equipment77.enable();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Available" + "'", str95, "Available");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1486");
        model.Student student3 = new model.Student("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager9.setActive(true);
        java.lang.String str12 = labManager9.getStatus();
        labManager9.setActive(false);
        model.Equipment equipment18 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str19 = equipment18.getLabLocation();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment18.detach(equipmentObserver20);
        equipment18.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str24 = equipment18.getLabLocation();
        java.lang.String str25 = equipment18.toString();
        labManager9.setEquipmentStatus(equipment18, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str28 = equipment18.getEquipmentId();
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment18.attach(equipmentObserver29);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        strategy.PricingStrategy pricingStrategy33 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation34 = new model.Reservation((model.User) student3, equipment18, localDateTime31, localDateTime32, pricingStrategy33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1487");
        model.Researcher researcher3 = new model.Researcher("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getPasswordHash();
        java.lang.String str8 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1488");
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
        model.Equipment equipment77 = new model.Equipment("", "", "");
        java.lang.String str78 = equipment77.getDescription();
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment77.isModifyAvailable(localDateTime79, localDateTime80, "hi!", reservation82);
        java.lang.String str84 = equipment77.getEquipmentId();
        equipment77.setStatus("");
        java.lang.String str87 = equipment77.getEquipmentId();
        java.lang.String str88 = equipment77.getEquipmentId();
        equipment77.setLabLocation("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment77.setStatus("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment77.enable();
        labManager5.addEquipment(equipment77);
        java.lang.String str95 = equipment77.getStatus();
        model.SensorUpdate sensorUpdate96 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment77.applySensorUpdate(sensorUpdate96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Available" + "'", str95, "Available");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1489");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        researcher3.setPasswordHash("Faculty");
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getPasswordHash();
        java.lang.String str12 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "71) test1489(randoop.RandoopRegressionTest2)":         org.junit.Assert.assertEquals(uUID7.toString(), "b23e60fb-2cf7-4578-bf14-eec676d7916c");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1490");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("hi!");
        equipment9.setDescription("Researcher");
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment9.detach(equipmentObserver15);
        model.Equipment equipment20 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.lang.String str32 = equipment24.getDescription();
        java.lang.String str33 = equipment24.getEquipmentId();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment24.isModifyAvailable(localDateTime34, localDateTime35, "INACTIVE", reservation37);
        state.EquipmentState equipmentState39 = equipment24.getCurrentState();
        model.Equipment equipment43 = new model.Equipment("", "", "");
        equipment43.enable();
        equipment43.enable();
        java.lang.String str46 = equipment43.getStatus();
        java.lang.String str47 = equipment43.getStatus();
        java.lang.String str48 = equipment43.getDescription();
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment52.isModifyAvailable(localDateTime59, localDateTime60, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation62);
        java.lang.String str64 = equipment52.toString();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        boolean boolean68 = equipment52.isAvailable(localDateTime65, localDateTime66, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState69 = equipment52.getCurrentState();
        equipment43.setState(equipmentState69);
        equipment24.setState(equipmentState69);
        equipment20.setState(equipmentState69);
        equipment9.setState(equipmentState69);
        java.lang.String str74 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(equipmentState39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Available" + "'", str46, "Available");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Available" + "'", str47, "Available");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str64, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(equipmentState69);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}" + "'", str74, "Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1491");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=750f3d96-95ea-461d-8549-46ae00a8624f, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1492");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        java.lang.String str9 = equipment8.getDescription();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment8.isModifyAvailable(localDateTime10, localDateTime11, "hi!", reservation13);
        equipment8.disable();
        equipment8.enable();
        state.EquipmentState equipmentState17 = equipment8.getCurrentState();
        equipment3.setState(equipmentState17);
        equipment3.markMaintenance();
        java.lang.String str20 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Maintenance" + "'", str20, "Maintenance");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1493");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        boolean boolean7 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1494");
        model.Student student3 = new model.Student("User{userId=0393009a-b3ca-4bd2-927f-8836aa1c5301, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1495");
        model.Researcher researcher3 = new model.Researcher("User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=6ceb8732-d6d4-4ca4-9e9a-18e9851c2f1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1496");
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
        double double75 = labManager5.getHourlyRate();
        labManager5.setEmail("User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double78 = labManager5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1497");
        model.Researcher researcher3 = new model.Researcher("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1498");
        model.Student student3 = new model.Student("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1499");
        model.Guest guest3 = new model.Guest("User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1500");
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
}
