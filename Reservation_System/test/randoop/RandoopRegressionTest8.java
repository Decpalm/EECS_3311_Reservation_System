package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4001");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
        headLabCoordinator3.setIdOrCertNumber("User{userId=2c004688-3bec-419b-94ff-d26c60de202d, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4002");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getDescription();
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4003");
        model.Faculty faculty3 = new model.Faculty("User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str4, "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4004");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        faculty3.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        model.Student student13 = new model.Student("hi!", "Faculty", "hi!");
        student13.setIdOrCertNumber("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str16 = student13.getIdOrCertNumber();
        java.util.UUID uUID17 = student13.getUserId();
        faculty3.setUserId(uUID17);
        java.lang.Class<?> wildcardClass19 = uUID17.getClass();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "1) test4004(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "6448ab71-112f-4381-907f-49e52948358f");
// flaky "1) test4004(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=6448ab71-112f-4381-907f-49e52948358f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=6448ab71-112f-4381-907f-49e52948358f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str16, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID17);
// flaky "1) test4004(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID17.toString(), "f9d110b4-47c0-438c-bb2c-c79d1e490d7f");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4005");
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
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.attach(equipmentObserver20);
        java.lang.String str22 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4006");
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
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4007");
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
        java.lang.String str87 = equipment3.toString();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str87, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4008");
        model.Equipment equipment3 = new model.Equipment("User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
        java.lang.String str4 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}', status='Available'}" + "'", str4, "Equipment{equipmentId='User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}', status='Available'}");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4009");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        model.Researcher researcher9 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.util.UUID uUID10 = researcher9.getUserId();
        student3.setUserId(uUID10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "2) test4009(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "947a86be-9ade-4401-ae77-35468bf57d58");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4010");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        labManager5.markMaintenance(equipment17);
        equipment17.notifyObservers();
        java.lang.String str21 = equipment17.getDescription();
        model.SensorUpdate sensorUpdate22 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment17.applySensorUpdate(sensorUpdate22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4011");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        double double6 = headLabCoordinator3.getHourlyRate();
        java.lang.String str7 = headLabCoordinator3.getIdOrCertNumber();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getStatus();
        headLabCoordinator3.setIdOrCertNumber("User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=a74d711c-039a-4d95-9b60-940c6024f455, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4012");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        researcher3.setPasswordHash("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        java.lang.String str8 = researcher3.getIdOrCertNumber();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4013");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        headLabCoordinator3.setActive(false);
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4014");
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
        state.EquipmentState equipmentState22 = equipment3.getCurrentState();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState22);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4015");
        model.LabManager labManager3 = new model.LabManager("Guest", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher");
        java.lang.String str4 = labManager3.toString();
        labManager3.setIdOrCertNumber("User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean13 = labManager12.isActive();
        labManager12.setPasswordHash("Guest");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getEquipmentId();
        equipment19.setStatus("");
        java.lang.String str29 = equipment19.getEquipmentId();
        java.lang.String str30 = equipment19.getEquipmentId();
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment19.detach(equipmentObserver31);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment19.isModifyAvailable(localDateTime33, localDateTime34, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation36);
        java.lang.String str38 = equipment19.getDescription();
        labManager12.setEquipmentStatus(equipment19, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager46 = headLabCoordinator44.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager48 = headLabCoordinator44.autoGenerateManagerAccount("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        equipment52.disable();
        java.lang.String str60 = equipment52.getEquipmentId();
        equipment52.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        boolean boolean66 = equipment52.isAvailable(localDateTime63, localDateTime64, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState67 = equipment52.getCurrentState();
        equipment52.notifyObservers();
        labManager48.markMaintenance(equipment52);
        java.lang.String str70 = equipment52.toString();
        labManager12.markMaintenance(equipment52);
        labManager3.setEquipmentStatus(equipment52, "User{userId=d1f0e6e1-3c32-4a1e-8def-0331f056a9ec, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
// flaky "3) test4015(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c1c98b2b-f723-460b-b4bd-177682f7e901, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}" + "'", str4, "User{userId=c1c98b2b-f723-460b-b4bd-177682f7e901, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(equipmentState67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Equipment{equipmentId='', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Maintenance'}" + "'", str70, "Equipment{equipmentId='', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4016");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double10 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4017");
        model.Equipment equipment3 = new model.Equipment("User{userId=13e5128f-9d9b-4135-9b18-0b90648a4093, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=eb6fc337-1003-47b7-b3f1-2ceb2830d470, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=6907ea78-c483-4fc8-ba67-aa194b12b7c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4018");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("");
        java.lang.String str13 = equipment9.getEquipmentId();
        java.lang.String str14 = equipment9.getEquipmentId();
        equipment9.markMaintenance();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        equipment19.enable();
        equipment19.enable();
        java.lang.String str22 = equipment19.getStatus();
        java.lang.String str23 = equipment19.getDescription();
        equipment19.setDescription("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment19.attach(equipmentObserver26);
        state.EquipmentState equipmentState28 = equipment19.getCurrentState();
        state.EquipmentState equipmentState29 = equipment19.getCurrentState();
        equipment9.setState(equipmentState29);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertNotNull(equipmentState29);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4019");
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
        equipment15.setLabLocation("Guest");
        equipment15.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment15.setLabLocation("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment15.enable();
        java.lang.String str34 = equipment15.getEquipmentId();
        java.lang.String str35 = equipment15.getLabLocation();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str35, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4020");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager10.setIdOrCertNumber("User{userId=9dca83a1-a35d-4cad-bec0-49e13972189d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.Class<?> wildcardClass13 = labManager10.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4021");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        java.lang.String str9 = guest3.getRole();
        java.lang.String str10 = guest3.getIdOrCertNumber();
        guest3.setIdOrCertNumber("User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str13 = guest3.getRole();
        java.lang.String str14 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4022");
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
        equipment37.markMaintenance();
        java.lang.String str40 = equipment37.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}" + "'", str40, "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4023");
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
        equipment18.enable();
        equipment18.setLabLocation("User{userId=01023023-f0c9-4518-ab6d-d7276c6a56a0, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
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
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4024");
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
        java.lang.String str35 = labManager5.getRole();
        model.Equipment equipment39 = new model.Equipment("User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager5.markMaintenance(equipment39);
        equipment39.setStatus("User{userId=413fab29-c6ad-49bb-b0c3-c0e877b47292, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LabManager" + "'", str35, "LabManager");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4025");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str8 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4026");
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
        java.lang.String str20 = equipment3.toString();
        java.lang.String str21 = equipment3.toString();
        java.lang.String str22 = equipment3.getDescription();
        java.lang.String str23 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4027");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        faculty3.setActive(false);
        faculty3.setPasswordHash("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double12 = faculty3.getHourlyRate();
        java.util.UUID uUID13 = faculty3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "4) test4027(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "6ca42b27-2716-40de-bb64-578c5e2dcc40");
// flaky "2) test4027(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=6ca42b27-2716-40de-bb64-578c5e2dcc40, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=6ca42b27-2716-40de-bb64-578c5e2dcc40, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(uUID13);
// flaky "2) test4027(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID13.toString(), "6ca42b27-2716-40de-bb64-578c5e2dcc40");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4028");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment23.isModifyAvailable(localDateTime24, localDateTime25, "Faculty", reservation27);
        equipment23.setLabLocation("Faculty");
        labManager19.setEquipmentStatus(equipment23, "");
        equipment23.notifyObservers();
        labManager5.addEquipment(equipment23);
        java.lang.String str35 = equipment23.getLabLocation();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment23.isAvailable(localDateTime36, localDateTime37, "User{userId=0748f4eb-c687-4292-9a20-44a804e1827c, email='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4029");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        faculty3.setPasswordHash("User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4030");
        model.Equipment equipment3 = new model.Equipment("User{userId=6f3c3700-9cf7-4c67-84ed-9a21ccf02f91, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "ACTIVE");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.attach(equipmentObserver4);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4031");
        model.Equipment equipment3 = new model.Equipment("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9f8a7cb7-ec03-4354-aac7-a2aa3455fb18, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4032");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getStatus();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        equipment3.enable();
        equipment3.setStatus("Equipment{equipmentId='', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(equipmentState5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4033");
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
        equipment13.enable();
        java.lang.String str20 = equipment13.toString();
        model.SensorUpdate sensorUpdate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment13.applySensorUpdate(sensorUpdate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4034");
        model.Researcher researcher3 = new model.Researcher("User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9ab58983-a902-46d5-8e51-bd2d1bf002f2, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4035");
        model.Faculty faculty3 = new model.Faculty("User{userId=10c8e959-96bc-4405-a3d7-54eae4e25c62, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b0be294f-1eb5-4947-8ede-f53669a64426, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a70a11d6-26fd-49bc-8890-79396df517de, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4036");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        java.lang.String str6 = student3.toString();
        java.lang.String str7 = student3.getRole();
        java.util.UUID uUID8 = student3.getUserId();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "5) test4036(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=0f96235d-27f1-40fd-98af-c179148a0401, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=0f96235d-27f1-40fd-98af-c179148a0401, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "3) test4036(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=0f96235d-27f1-40fd-98af-c179148a0401, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str6, "User{userId=0f96235d-27f1-40fd-98af-c179148a0401, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(uUID8);
// flaky "3) test4036(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID8.toString(), "0f96235d-27f1-40fd-98af-c179148a0401");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4037");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Guest', status=''}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double7 = labManager6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4038");
        model.LabManager labManager3 = new model.LabManager("User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ebdc402e-ae5a-4238-9334-c4490a251952, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4039");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getStatus();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getPasswordHash();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str9, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4040");
        model.Faculty faculty3 = new model.Faculty("User{userId=19dc99f8-7563-4b00-a083-24493a26ea9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e4e96d1a-20ea-4a7d-980e-b38492bb3fb6, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4041");
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
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment25.isModifyAvailable(localDateTime26, localDateTime27, "Faculty", reservation29);
        equipment25.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment25.isModifyAvailable(localDateTime33, localDateTime34, "", reservation36);
        equipment25.disable();
        java.lang.String str39 = equipment25.getLabLocation();
        state.EquipmentState equipmentState40 = equipment25.getCurrentState();
        equipment3.setState(equipmentState40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4042");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        java.lang.String str5 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4043");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str12 = labManager11.getRole();
        model.LabManager labManager16 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str17 = labManager16.toString();
        java.util.UUID uUID18 = labManager16.getUserId();
        model.Equipment equipment22 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment22.isModifyAvailable(localDateTime23, localDateTime24, "Faculty", reservation26);
        equipment22.setLabLocation("Faculty");
        java.lang.String str30 = equipment22.getDescription();
        java.lang.String str31 = equipment22.getEquipmentId();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment22.isModifyAvailable(localDateTime32, localDateTime33, "INACTIVE", reservation35);
        java.lang.String str37 = equipment22.toString();
        equipment22.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str40 = equipment22.getStatus();
        labManager16.addEquipment(equipment22);
        equipment22.disable();
        labManager11.markMaintenance(equipment22);
        state.EquipmentState equipmentState44 = equipment22.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
// flaky "6) test4043(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=95c7c73b-30aa-41e7-b2f2-1fedf00c10af, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str17, "User{userId=95c7c73b-30aa-41e7-b2f2-1fedf00c10af, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID18);
// flaky "4) test4043(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID18.toString(), "95c7c73b-30aa-41e7-b2f2-1fedf00c10af");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str37, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Available" + "'", str40, "Available");
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4044");
        model.Faculty faculty3 = new model.Faculty("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4045");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        java.lang.String str13 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID20 = null;
        headLabCoordinator17.setUserId(uUID20);
        model.LabManager labManager23 = headLabCoordinator17.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        equipment27.enable();
        labManager23.addEquipment(equipment27);
        equipment27.disable();
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment27.detach(equipmentObserver31);
        equipment27.enable();
        labManager5.setEquipmentStatus(equipment27, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment27.markMaintenance();
        java.lang.String str37 = equipment27.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4046");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.setDescription("User{userId=e6619bcc-60c9-4e1c-ad88-aa1b2934fea7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4047");
        model.Guest guest3 = new model.Guest("User{userId=c0e8c15f-39a0-4df9-893a-6ee3a23f42a5, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f684201a-a2db-4655-9227-3d99fb64e0eb, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4048");
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
        java.lang.String str26 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str26, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4049");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getRole();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2d4255cd-ee33-490e-a7b6-43f4f624113d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str14 = headLabCoordinator3.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "7) test4049(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=8a490f77-f921-4d41-aace-c5bcc0641642, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=8a490f77-f921-4d41-aace-c5bcc0641642, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager13);
// flaky "5) test4049(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=8a490f77-f921-4d41-aace-c5bcc0641642, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str14, "User{userId=8a490f77-f921-4d41-aace-c5bcc0641642, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4050");
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
        java.lang.String str63 = equipment56.getDescription();
        java.lang.String str64 = equipment56.toString();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='ACTIVE'}" + "'", str64, "Equipment{equipmentId='', description='', labLocation='', status='ACTIVE'}");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4051");
        model.Researcher researcher3 = new model.Researcher("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=625d16be-7efc-4905-9939-63da2af3f56a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4052");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        java.lang.String str10 = equipment3.toString();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "Available", reservation14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4053");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        equipment3.markMaintenance();
        java.lang.String str13 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4054");
        model.LabManager labManager3 = new model.LabManager("User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='', status=''}", "User{userId=6f3c3700-9cf7-4c67-84ed-9a21ccf02f91, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4055");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='', status='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}'}", "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=c4552bd2-e848-4b9d-a1e3-02c81ea5755f, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4056");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.lang.String str12 = equipment11.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment11.isModifyAvailable(localDateTime13, localDateTime14, "hi!", reservation16);
        equipment11.disable();
        java.lang.String str19 = equipment11.getEquipmentId();
        equipment11.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment11.isAvailable(localDateTime22, localDateTime23, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState26 = equipment11.getCurrentState();
        equipment11.notifyObservers();
        labManager7.markMaintenance(equipment11);
        equipment11.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(equipmentState26);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4057");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        java.lang.String str9 = equipment3.getStatus();
        java.lang.String str10 = equipment3.toString();
        equipment3.setStatus("User{userId=413fab29-c6ad-49bb-b0c3-c0e877b47292, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4058");
        model.Guest guest3 = new model.Guest("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Maintenance", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4059");
        model.Researcher researcher3 = new model.Researcher("User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=862f6943-66ba-448f-9d6b-f46e755dd01c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4060");
        model.Student student3 = new model.Student("User{userId=b825f33f-3488-4cd5-a72f-cd0633a6ba4b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=867874c3-1443-496b-8e15-3f970c85ceb5, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}", "User{userId=c4552bd2-e848-4b9d-a1e3-02c81ea5755f, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4061");
        model.Faculty faculty3 = new model.Faculty("User{userId=86107460-d934-4688-9184-59edad30b1e2, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0bed3626-dbde-4a71-af21-9c375d954793, email='Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}", "User{userId=28bd928a-ecb0-459b-9a1f-26a50bb3f723, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4062");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double9 = labManager8.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4063");
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
        model.HeadLabCoordinator headLabCoordinator61 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str62 = headLabCoordinator61.getRole();
        headLabCoordinator61.setEmail("Researcher");
        model.LabManager labManager66 = headLabCoordinator61.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator70 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager72 = headLabCoordinator70.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment76 = new model.Equipment("", "", "");
        labManager72.addEquipment(equipment76);
        labManager66.setEquipmentStatus(equipment76, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment76.markMaintenance();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        model.Reservation reservation84 = null;
        boolean boolean85 = equipment76.isModifyAvailable(localDateTime81, localDateTime82, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", reservation84);
        equipment76.setDescription("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment76, "User{userId=6b7d0607-07ac-4d05-a5fc-bde0b0292564, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.setActive(false);
        model.LabManager labManager95 = new model.LabManager("User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID96 = labManager95.getUserId();
        labManager3.setUserId(uUID96);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LabManager" + "'", str57, "LabManager");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "HeadLabCoordinator" + "'", str62, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager66);
        org.junit.Assert.assertNotNull(labManager72);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(uUID96);
// flaky "8) test4063(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID96.toString(), "311aea2c-d9f1-4ff6-ada4-564984612623");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4064");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        java.lang.String str15 = equipment3.toString();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.attach(equipmentObserver16);
        equipment3.setLabLocation("User{userId=c3bb06bf-a390-4727-b549-5375005c6f5d, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4065");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str6 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4066");
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
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment23.isModifyAvailable(localDateTime24, localDateTime25, "Faculty", reservation27);
        equipment23.setLabLocation("Faculty");
        java.lang.String str31 = equipment23.getDescription();
        java.lang.String str32 = equipment23.getEquipmentId();
        java.lang.String str33 = equipment23.getDescription();
        labManager3.setEquipmentStatus(equipment23, "User{userId=76e32f3e-f1ee-4862-b4f7-5802c4764841, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment23.enable();
        equipment23.enable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4067");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("hi!");
        model.Equipment equipment10 = new model.Equipment("Disabled", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment10.disable();
        java.lang.String str12 = equipment10.getEquipmentId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        strategy.PricingStrategy pricingStrategy15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation16 = new model.Reservation((model.User) guest3, equipment10, localDateTime13, localDateTime14, pricingStrategy15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Disabled" + "'", str12, "Disabled");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4068");
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
        state.EquipmentState equipmentState40 = equipment24.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4069");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=755abd3c-9ba4-416c-bf65-430b75c880f7, email='User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        java.lang.String str6 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4070");
        model.Equipment equipment3 = new model.Equipment("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "");
        java.lang.String str4 = equipment3.getLabLocation();
        equipment3.setDescription("User{userId=1cea9a01-cc07-4a4a-af12-895caffc9c7e, email='User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}");
        java.lang.String str7 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str7, "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4071");
        model.Researcher researcher3 = new model.Researcher("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LM-CERT");
        java.lang.String str4 = researcher3.getPasswordHash();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getRole();
        java.lang.String str9 = researcher3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}" + "'", str9, "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4072");
        model.LabManager labManager3 = new model.LabManager("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID11 = null;
        headLabCoordinator8.setUserId(uUID11);
        model.LabManager labManager14 = headLabCoordinator8.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager16 = headLabCoordinator8.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID17 = labManager16.getUserId();
        labManager3.setUserId(uUID17);
        java.lang.String str19 = labManager3.getStatus();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        labManager25.setEquipmentStatus(equipment29, "");
        equipment29.setDescription("");
        model.Equipment equipment44 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment44.isModifyAvailable(localDateTime45, localDateTime46, "Faculty", reservation48);
        equipment44.setLabLocation("Faculty");
        equipment44.notifyObservers();
        observer.EquipmentObserver equipmentObserver53 = null;
        equipment44.attach(equipmentObserver53);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment44.isModifyAvailable(localDateTime55, localDateTime56, "Faculty", reservation58);
        state.EquipmentState equipmentState60 = equipment44.getCurrentState();
        equipment29.setState(equipmentState60);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment29.isModifyAvailable(localDateTime62, localDateTime63, "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation65);
        java.lang.String str67 = equipment29.getEquipmentId();
        labManager3.markMaintenance(equipment29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(uUID17);
// flaky "9) test4072(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID17.toString(), "1384a519-bc84-48d0-8345-180754a3c0c3");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ACTIVE" + "'", str19, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(equipmentState60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4073");
        model.Researcher researcher3 = new model.Researcher("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7f202e65-5038-4bf8-b4ca-fade3879140d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = researcher3.getHourlyRate();
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
        equipment14.disable();
        java.lang.String str26 = equipment14.getStatus();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean30 = equipment14.isAvailable(localDateTime27, localDateTime28, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str31 = equipment14.getDescription();
        model.Equipment equipment35 = new model.Equipment("", "", "");
        equipment35.enable();
        equipment35.enable();
        java.lang.String str38 = equipment35.getStatus();
        java.lang.String str39 = equipment35.getStatus();
        java.lang.String str40 = equipment35.getDescription();
        equipment35.disable();
        equipment35.setLabLocation("User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        state.EquipmentState equipmentState44 = equipment35.getCurrentState();
        equipment14.setState(equipmentState44);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        strategy.PricingStrategy pricingStrategy48 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation49 = new model.Reservation((model.User) researcher3, equipment14, localDateTime46, localDateTime47, pricingStrategy48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Disabled" + "'", str26, "Disabled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Available" + "'", str38, "Available");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Available" + "'", str39, "Available");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4074");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        headLabCoordinator3.setIdOrCertNumber("User{userId=a6f08cf7-412b-47d4-a994-0c81501f765a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4075");
        model.Researcher researcher3 = new model.Researcher("User{userId=3583d5fa-af62-4b4c-8323-53583710d891, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=99a8ca33-e50f-4503-8911-c2770f4db9c4, email='', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Student'}");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4076");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b76e7a77-08eb-48da-87cf-9e196fa2b2cf, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4077");
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
        java.lang.String str16 = equipment3.getDescription();
        java.lang.String str17 = equipment3.getDescription();
        equipment3.setDescription("User{userId=a6afa3ec-ae9e-49e1-8e37-e11decf4aeca, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4078");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getEmail();
        java.lang.String str12 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HeadLabCoordinator" + "'", str12, "HeadLabCoordinator");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4079");
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
        equipment30.notifyObservers();
        state.EquipmentState equipmentState47 = equipment30.getCurrentState();
        java.lang.String str48 = equipment30.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Available" + "'", str48, "Available");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4080");
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
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment14.isModifyAvailable(localDateTime25, localDateTime26, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", reservation28);
        equipment14.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4081");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4082");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        model.LabManager labManager15 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.markMaintenance(equipment25);
        java.lang.String str27 = labManager21.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        labManager33.setEquipmentStatus(equipment37, "");
        equipment37.notifyObservers();
        labManager21.markMaintenance(equipment37);
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getEquipmentId();
        java.lang.String str60 = equipment52.getLabLocation();
        labManager21.markMaintenance(equipment52);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        equipment65.enable();
        labManager21.addEquipment(equipment65);
        labManager15.markMaintenance(equipment65);
        observer.EquipmentObserver equipmentObserver69 = null;
        equipment65.attach(equipmentObserver69);
        labManager10.setEquipmentStatus(equipment65, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment65.setLabLocation("User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str75 = equipment65.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment65.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "10) test4082(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=0a62c533-ed8e-4653-b27d-724996d41413, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=0a62c533-ed8e-4653-b27d-724996d41413, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4083");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        labManager10.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment17.isModifyAvailable(localDateTime18, localDateTime19, "Faculty", reservation21);
        equipment17.setLabLocation("Faculty");
        equipment17.notifyObservers();
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment17.attach(equipmentObserver26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment17.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        state.EquipmentState equipmentState33 = equipment17.getCurrentState();
        labManager10.addEquipment(equipment17);
        java.lang.String str35 = equipment17.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "11) test4083(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=a8388649-5375-459a-8009-671f58ab2150, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=a8388649-5375-459a-8009-671f58ab2150, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4084");
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
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment29.isModifyAvailable(localDateTime48, localDateTime49, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation51);
        equipment29.disable();
        model.SensorUpdate sensorUpdate54 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment29.applySensorUpdate(sensorUpdate54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str44, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4085");
        model.Researcher researcher3 = new model.Researcher("User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4086");
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
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment53.attach(equipmentObserver57);
        equipment53.setDescription("");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4087");
        model.Equipment equipment3 = new model.Equipment("User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}", "User{userId=5b777b57-0f4b-4be6-9960-80b3dd667f1c, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}", "User{userId=a8ca4fee-afc7-490b-bfb2-ca95c3372a57, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.notifyObservers();
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4088");
        model.Faculty faculty3 = new model.Faculty("User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f1ea51e9-55fc-4e71-acfb-85dac53d0a33, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4089");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        boolean boolean9 = researcher3.isActive();
        java.lang.String str10 = researcher3.getRole();
        double double11 = researcher3.getHourlyRate();
        java.lang.String str12 = researcher3.getRole();
        researcher3.setEmail("User{userId=10b8b7d7-0cc3-4706-901d-0e8ea0d6fe73, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4090");
        model.Equipment equipment3 = new model.Equipment("User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
        equipment3.enable();
        equipment3.disable();
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4091");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Temp123!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getEmail();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4092");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator13 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager15 = headLabCoordinator13.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID16 = null;
        headLabCoordinator13.setUserId(uUID16);
        model.LabManager labManager19 = headLabCoordinator13.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment23 = new model.Equipment("", "", "");
        equipment23.enable();
        labManager19.addEquipment(equipment23);
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.lang.String str30 = equipment29.getDescription();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment29.isModifyAvailable(localDateTime31, localDateTime32, "hi!", reservation34);
        java.lang.String str36 = equipment29.getDescription();
        state.EquipmentState equipmentState37 = equipment29.getCurrentState();
        equipment29.setLabLocation("Student");
        labManager19.setEquipmentStatus(equipment29, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment29.notifyObservers();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment29.isAvailable(localDateTime43, localDateTime44, "");
        labManager5.setEquipmentStatus(equipment29, "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator52 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager54 = headLabCoordinator52.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID55 = null;
        headLabCoordinator52.setUserId(uUID55);
        model.LabManager labManager58 = headLabCoordinator52.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment62 = new model.Equipment("", "", "");
        equipment62.enable();
        labManager58.addEquipment(equipment62);
        equipment62.disable();
        equipment62.setLabLocation("HeadLabCoordinator");
        equipment62.enable();
        labManager5.markMaintenance(equipment62);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertNotNull(labManager58);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4093");
        model.Faculty faculty3 = new model.Faculty("User{userId=5c6b49c8-7e30-4e44-910f-1f9fa746c115, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=4298ef49-152c-48d2-9e46-50dbed5f5f6d, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4094");
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
        java.lang.String str21 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4095");
        model.Equipment equipment3 = new model.Equipment("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4096");
        model.Equipment equipment3 = new model.Equipment("User{userId=782c482a-b499-4190-8900-6286323266d0, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4097");
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
        equipment3.setLabLocation("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', labLocation='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4098");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        researcher3.setIdOrCertNumber("");
        double double8 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4099");
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
        double double25 = labManager3.getHourlyRate();
        double double26 = labManager3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4100");
        model.Guest guest3 = new model.Guest("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4101");
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
        equipment27.markMaintenance();
        equipment27.setLabLocation("User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str42 = equipment27.getDescription();
        equipment27.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4102");
        model.LabManager labManager3 = new model.LabManager("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        equipment7.enable();
        equipment7.setStatus("ACTIVE");
        labManager3.markMaintenance(equipment7);
        equipment7.setDescription("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment7.notifyObservers();
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4103");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4104");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        labManager5.setIdOrCertNumber("User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str15 = labManager5.getRole();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        equipment19.enable();
        equipment19.enable();
        java.lang.String str22 = equipment19.getStatus();
        java.lang.String str23 = equipment19.getStatus();
        java.lang.String str24 = equipment19.getDescription();
        labManager5.addEquipment(equipment19);
        java.lang.String str26 = equipment19.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str26, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4105");
        model.Student student3 = new model.Student("User{userId=652f1007-c938-4c4e-ba77-6213cb65023a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9e29ffe6-8fcc-44ce-8ec0-071be909d4f1, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4106");
        model.Faculty faculty3 = new model.Faculty("User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6a1384b8-4da8-48fc-80c0-cdc10e9839cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4107");
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
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4108");
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
        java.lang.String str17 = equipment3.getEquipmentId();
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
        org.junit.Assert.assertNotNull(equipmentState15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Available" + "'", str16, "Available");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4109");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getRole();
        double double7 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4110");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getEmail();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment17 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment17.notifyObservers();
        labManager13.setEquipmentStatus(equipment17, "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        equipment17.setLabLocation("User{userId=cf9c4f14-c47f-48ba-90a8-19e3efbb33fb, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str23 = equipment17.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str23, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4111");
        model.Faculty faculty3 = new model.Faculty("User{userId=777b9370-e1e5-4fd8-a436-2007d0a1d701, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bffa7436-366f-4280-aeb6-9a4c2f075740, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4112");
        model.Guest guest3 = new model.Guest("Student", "Student", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str8 = faculty7.getStatus();
        boolean boolean9 = faculty7.isActive();
        java.lang.String str10 = faculty7.getRole();
        java.lang.String str11 = faculty7.getRole();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager23 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager25 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double26 = labManager25.getHourlyRate();
        model.Guest guest30 = new model.Guest("", "hi!", "hi!");
        java.lang.String str31 = guest30.getRole();
        double double32 = guest30.getHourlyRate();
        double double33 = guest30.getHourlyRate();
        java.lang.String str34 = guest30.getPasswordHash();
        guest30.setActive(false);
        java.lang.String str37 = guest30.getEmail();
        java.util.UUID uUID38 = guest30.getUserId();
        labManager25.setUserId(uUID38);
        faculty7.setUserId(uUID38);
        guest3.setUserId(uUID38);
        double double42 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 25.0d + "'", double32 == 25.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 25.0d + "'", double33 == 25.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(uUID38);
// flaky "12) test4112(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID38.toString(), "71295d24-a3d6-414d-a797-aad18fdb3edb");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 25.0d + "'", double42 == 25.0d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4113");
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
        equipment3.markMaintenance();
        java.lang.String str17 = equipment3.getDescription();
        java.lang.String str18 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4114");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4115");
        model.Guest guest3 = new model.Guest("User{userId=d1f0e6e1-3c32-4a1e-8def-0331f056a9ec, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        guest3.setPasswordHash("");
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4116");
        model.Faculty faculty3 = new model.Faculty("User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4117");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment3.isModifyAvailable(localDateTime8, localDateTime9, "User{userId=d7bc9384-6ade-408c-9968-fc13e6e29ad4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4118");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.util.UUID uUID5 = headLabCoordinator3.getUserId();
        headLabCoordinator3.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        boolean boolean10 = headLabCoordinator3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "13) test4118(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID5.toString(), "10c799a4-961a-40c7-b751-7fc91bc92f0e");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4119");
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
        java.lang.String str20 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}" + "'", str20, "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4120");
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
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID40 = null;
        headLabCoordinator37.setUserId(uUID40);
        model.LabManager labManager43 = headLabCoordinator37.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        equipment47.enable();
        labManager43.addEquipment(equipment47);
        equipment47.disable();
        equipment47.setLabLocation("HeadLabCoordinator");
        equipment47.setLabLocation("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        labManager5.setEquipmentStatus(equipment47, "User{userId=f99176bc-94d4-472f-8592-8ab5be9dc75a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertNotNull(labManager43);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4121");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str10 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Disabled" + "'", str10, "Disabled");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4122");
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
        java.lang.String str30 = equipment14.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ACTIVE" + "'", str24, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}" + "'", str27, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4123");
        model.Guest guest3 = new model.Guest("", "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = guest3.toString();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean11 = labManager10.isActive();
        labManager10.setPasswordHash("Guest");
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
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment17.detach(equipmentObserver29);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment17.isModifyAvailable(localDateTime31, localDateTime32, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation34);
        java.lang.String str36 = equipment17.getDescription();
        labManager10.setEquipmentStatus(equipment17, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        strategy.PricingStrategy pricingStrategy41 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation42 = new model.Reservation((model.User) guest3, equipment17, localDateTime39, localDateTime40, pricingStrategy41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "14) test4123(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c2280dd6-8def-4e0a-b309-ceea7ec5bda2, email='', status='ACTIVE', idOrCertNumber='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', role='Guest'}" + "'", str4, "User{userId=c2280dd6-8def-4e0a-b309-ceea7ec5bda2, email='', status='ACTIVE', idOrCertNumber='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4124");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.util.UUID uUID6 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "15) test4124(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID6.toString(), "4ad7db18-4868-4288-a46c-0c9b17053d95");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4125");
        model.Student student3 = new model.Student("", "Researcher", "HeadLabCoordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4126");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=376801b9-2981-46c5-b75d-8d1f4444d53f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.toString();
// flaky "16) test4126(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=f9b7c6e3-d208-4cb4-98f9-2bb7ceae7d2c, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=f9b7c6e3-d208-4cb4-98f9-2bb7ceae7d2c, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4127");
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
        java.lang.String str26 = labManager5.getRole();
        java.lang.String str27 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4128");
        model.LabManager labManager3 = new model.LabManager("Disabled", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment7.setLabLocation("ACTIVE");
        java.lang.String str10 = equipment7.getEquipmentId();
        labManager3.setEquipmentStatus(equipment7, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean19 = labManager18.isActive();
        double double20 = labManager18.getHourlyRate();
        double double21 = labManager18.getHourlyRate();
        labManager18.setEmail("LM-CERT");
        model.Equipment equipment27 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str28 = equipment27.getStatus();
        equipment27.markMaintenance();
        labManager18.addEquipment(equipment27);
        java.lang.String str31 = equipment27.getStatus();
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment27.attach(equipmentObserver32);
        labManager3.addEquipment(equipment27);
        // The following exception was thrown during execution in test generation
        try {
            equipment27.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Maintenance" + "'", str31, "Maintenance");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4129");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='', labLocation='', status='User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4130");
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
        java.util.UUID uUID24 = labManager5.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(uUID24);
// flaky "17) test4130(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID24.toString(), "a7a28868-94f5-4ed7-8629-ccbbbbbbd519");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4131");
        model.Equipment equipment3 = new model.Equipment("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4132");
        model.Equipment equipment3 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "", reservation7);
        equipment3.enable();
        model.SensorUpdate sensorUpdate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4133");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        double double10 = headLabCoordinator3.getHourlyRate();
        java.lang.String str11 = headLabCoordinator3.getEmail();
        double double12 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4134");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID32 = null;
        headLabCoordinator29.setUserId(uUID32);
        model.LabManager labManager35 = headLabCoordinator29.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        equipment39.enable();
        labManager35.addEquipment(equipment39);
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.lang.String str46 = equipment45.getDescription();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment45.isModifyAvailable(localDateTime47, localDateTime48, "hi!", reservation50);
        java.lang.String str52 = equipment45.getDescription();
        state.EquipmentState equipmentState53 = equipment45.getCurrentState();
        equipment45.setLabLocation("Student");
        labManager35.setEquipmentStatus(equipment45, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.lang.String str62 = equipment61.getDescription();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment61.isModifyAvailable(localDateTime63, localDateTime64, "hi!", reservation66);
        equipment61.disable();
        equipment61.enable();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        boolean boolean73 = equipment61.isAvailable(localDateTime70, localDateTime71, "");
        labManager35.addEquipment(equipment61);
        java.lang.String str75 = equipment61.getLabLocation();
        model.Equipment equipment79 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment79.isModifyAvailable(localDateTime80, localDateTime81, "Faculty", reservation83);
        equipment79.setLabLocation("Faculty");
        java.lang.String str87 = equipment79.getDescription();
        java.lang.String str88 = equipment79.getEquipmentId();
        equipment79.notifyObservers();
        equipment79.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState92 = equipment79.getCurrentState();
        equipment61.setState(equipmentState92);
        labManager8.addEquipment(equipment61);
        observer.EquipmentObserver equipmentObserver95 = null;
        equipment61.attach(equipmentObserver95);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(equipmentState92);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4135");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        double double14 = headLabCoordinator3.getHourlyRate();
        java.lang.String str15 = headLabCoordinator3.getRole();
        java.lang.String str16 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HeadLabCoordinator" + "'", str16, "HeadLabCoordinator");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4136");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        java.lang.String str5 = equipment3.getLabLocation();
        equipment3.setStatus("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.notifyObservers();
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4137");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        java.lang.String str9 = faculty3.getRole();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4138");
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
        equipment15.setLabLocation("Guest");
        equipment15.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str31 = equipment15.getLabLocation();
        java.lang.String str32 = equipment15.getStatus();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str32, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4139");
        model.Student student3 = new model.Student("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager7 = new model.LabManager("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "hi!", "");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager15 = headLabCoordinator11.autoGenerateManagerAccount("Available");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        state.EquipmentState equipmentState27 = equipment19.getCurrentState();
        equipment19.setLabLocation("Student");
        equipment19.notifyObservers();
        labManager15.addEquipment(equipment19);
        labManager7.addEquipment(equipment19);
        equipment19.setDescription("User{userId=2eba5902-b086-4be6-86d0-a278fe1d92be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        strategy.PricingStrategy pricingStrategy37 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation38 = new model.Reservation((model.User) student3, equipment19, localDateTime35, localDateTime36, pricingStrategy37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4140");
        model.Student student3 = new model.Student("User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d1f0e6e1-3c32-4a1e-8def-0331f056a9ec, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4141");
        model.Equipment equipment3 = new model.Equipment("Student", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setLabLocation("Available");
        equipment3.setLabLocation("");
        equipment3.enable();
        equipment3.disable();
        equipment3.enable();
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4142");
        model.LabManager labManager3 = new model.LabManager("User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Guest", "");
        java.lang.String str4 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4143");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPasswordHash();
        student3.setIdOrCertNumber("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4144");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        equipment11.enable();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment11.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation16);
        equipment11.setDescription("ACTIVE");
        java.lang.String str20 = equipment11.getLabLocation();
        labManager7.setEquipmentStatus(equipment11, "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        equipment11.setLabLocation("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4145");
        model.Guest guest3 = new model.Guest("User{userId=45a14a13-3386-4421-b0e2-7c228d49e311, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=64d5d52d-6558-4bc9-918f-05c3c1a5493c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setIdOrCertNumber("User{userId=314fdddc-6f3c-486c-8e49-c451df821db9, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4146");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        java.lang.String str11 = headLabCoordinator3.getEmail();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment17 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment17.notifyObservers();
        labManager13.setEquipmentStatus(equipment17, "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.lang.String str25 = equipment24.getDescription();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment24.isModifyAvailable(localDateTime26, localDateTime27, "hi!", reservation29);
        equipment24.markMaintenance();
        equipment24.setStatus("");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment24.isModifyAvailable(localDateTime34, localDateTime35, "User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", reservation37);
        equipment24.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        labManager13.markMaintenance(equipment24);
        java.lang.Class<?> wildcardClass42 = equipment24.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4147");
        model.Equipment equipment3 = new model.Equipment("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Faculty");
        equipment3.setDescription("User{userId=1e0554db-959c-4c51-b309-f0f492d9ab32, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.enable();
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4148");
        model.Equipment equipment3 = new model.Equipment("User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}", "User{userId=b245efd3-fdda-47cd-947c-8e18ab990f21, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}", "User{userId=68d5639f-a3ac-4ba8-ad5b-a12ec5840871, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4149");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment3.isModifyAvailable(localDateTime8, localDateTime9, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation11);
        java.lang.String str13 = equipment3.getEquipmentId();
        java.lang.String str14 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.attach(equipmentObserver15);
        java.lang.String str17 = equipment3.getStatus();
        java.lang.String str18 = equipment3.getEquipmentId();
        java.lang.String str19 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4150");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        double double10 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4151");
        model.Guest guest3 = new model.Guest("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Faculty", "Faculty");
        double double4 = guest3.getHourlyRate();
        java.util.UUID uUID5 = guest3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertNotNull(uUID5);
// flaky "18) test4151(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID5.toString(), "c3893fdf-d39c-4634-aa82-efeaa95457c1");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4152");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4153");
        model.LabManager labManager3 = new model.LabManager("User{userId=7f761712-0dc2-46f5-a9ab-a40cb2c1208a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01a5437c-ae82-4c1f-b60e-31c15974b4de, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4154");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.lang.String str6 = labManager5.getRole();
        model.LabManager labManager10 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment20.isModifyAvailable(localDateTime21, localDateTime22, "Faculty", reservation24);
        equipment20.setLabLocation("Faculty");
        labManager16.setEquipmentStatus(equipment20, "");
        equipment20.setDescription("");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment35.isModifyAvailable(localDateTime36, localDateTime37, "Faculty", reservation39);
        equipment35.setLabLocation("Faculty");
        equipment35.notifyObservers();
        observer.EquipmentObserver equipmentObserver44 = null;
        equipment35.attach(equipmentObserver44);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment35.isModifyAvailable(localDateTime46, localDateTime47, "Faculty", reservation49);
        state.EquipmentState equipmentState51 = equipment35.getCurrentState();
        equipment20.setState(equipmentState51);
        labManager10.setEquipmentStatus(equipment20, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        equipment20.markMaintenance();
        labManager5.setEquipmentStatus(equipment20, "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment20.markMaintenance();
        model.SensorUpdate sensorUpdate59 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment20.applySensorUpdate(sensorUpdate59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(equipmentState51);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4155");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        researcher3.setPasswordHash("Available");
        java.lang.String str9 = researcher3.getPasswordHash();
        java.lang.String str10 = researcher3.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
// flaky "19) test4155(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=a898ff7d-e85d-4a9f-8b42-d1f7b9dac49b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str10, "User{userId=a898ff7d-e85d-4a9f-8b42-d1f7b9dac49b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4156");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        model.LabManager labManager15 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.markMaintenance(equipment25);
        java.lang.String str27 = labManager21.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        labManager33.setEquipmentStatus(equipment37, "");
        equipment37.notifyObservers();
        labManager21.markMaintenance(equipment37);
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getEquipmentId();
        java.lang.String str60 = equipment52.getLabLocation();
        labManager21.markMaintenance(equipment52);
        model.Equipment equipment65 = new model.Equipment("", "", "");
        equipment65.enable();
        labManager21.addEquipment(equipment65);
        labManager15.markMaintenance(equipment65);
        observer.EquipmentObserver equipmentObserver69 = null;
        equipment65.attach(equipmentObserver69);
        labManager10.setEquipmentStatus(equipment65, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str73 = equipment65.getLabLocation();
        java.lang.String str74 = equipment65.getDescription();
        observer.EquipmentObserver equipmentObserver75 = null;
        equipment65.detach(equipmentObserver75);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "20) test4156(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=c80048dc-d405-4a06-aedc-822df5de10b3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=c80048dc-d405-4a06-aedc-822df5de10b3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4157");
        model.LabManager labManager3 = new model.LabManager("User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "User{userId=f314487c-0f1d-4db6-bc8d-61154327bc96, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        boolean boolean28 = labManager9.isActive();
        labManager9.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
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
        java.lang.String str46 = equipment34.toString();
        labManager9.addEquipment(equipment34);
        labManager9.setEmail("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment53 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        labManager9.setEquipmentStatus(equipment53, "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.markMaintenance(equipment53);
        java.lang.Class<?> wildcardClass57 = labManager3.getClass();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str46, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4158");
        model.Faculty faculty3 = new model.Faculty("User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str4 = faculty3.getStatus();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "Faculty", reservation18);
        equipment14.setLabLocation("Faculty");
        labManager10.setEquipmentStatus(equipment14, "");
        java.lang.String str24 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment14.isModifyAvailable(localDateTime25, localDateTime26, "Maintenance", reservation28);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment14.isAvailable(localDateTime30, localDateTime31, "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        strategy.PricingStrategy pricingStrategy36 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation37 = new model.Reservation((model.User) faculty3, equipment14, localDateTime34, localDateTime35, pricingStrategy36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4159");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        double double6 = headLabCoordinator3.getHourlyRate();
        double double7 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4160");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        boolean boolean11 = guest3.isActive();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment21.isModifyAvailable(localDateTime22, localDateTime23, "Faculty", reservation25);
        equipment21.setLabLocation("Faculty");
        labManager17.setEquipmentStatus(equipment21, "Guest");
        java.util.UUID uUID31 = labManager17.getUserId();
        guest3.setUserId(uUID31);
        guest3.setEmail("User{userId=49cddc2a-6578-4a70-bd04-cafcce4927da, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str35 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(uUID31);
// flaky "21) test4160(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID31.toString(), "535c742b-c508-493d-9713-e0aeaa6e2cd6");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Guest" + "'", str35, "Guest");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4161");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        faculty3.setActive(false);
        java.lang.String str7 = faculty3.getRole();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "22) test4161(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "79723720-483e-41c0-85ea-ebf72ddc7231");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4162");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        java.lang.String str10 = labManager5.getRole();
        labManager5.setIdOrCertNumber("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4163");
        model.LabManager labManager3 = new model.LabManager("LM-CERT", "User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4164");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        equipment3.setStatus("Researcher");
        equipment3.setStatus("User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str15 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4165");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        faculty3.setActive(false);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "23) test4165(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "f6bfbdd3-89a5-4fab-b9e2-ea654a7bf8c2");
// flaky "6) test4165(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=f6bfbdd3-89a5-4fab-b9e2-ea654a7bf8c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=f6bfbdd3-89a5-4fab-b9e2-ea654a7bf8c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4166");
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
        boolean boolean50 = labManager9.isActive();
        java.lang.String str51 = labManager9.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ACTIVE" + "'", str51, "ACTIVE");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4167");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        boolean boolean14 = labManager5.isActive();
        labManager5.setActive(false);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4168");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        double double10 = guest3.getHourlyRate();
        guest3.setEmail("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str13 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4169");
        model.LabManager labManager3 = new model.LabManager("Student", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setIdOrCertNumber("User{userId=4208ccf0-c1aa-4bbe-8020-ce7f05f6c819, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double6 = labManager3.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment10.isModifyAvailable(localDateTime11, localDateTime12, "Faculty", reservation14);
        equipment10.setLabLocation("Faculty");
        java.lang.String str18 = equipment10.getDescription();
        java.lang.String str19 = equipment10.getEquipmentId();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment10.isModifyAvailable(localDateTime20, localDateTime21, "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation23);
        java.lang.String str25 = equipment10.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        strategy.PricingStrategy pricingStrategy28 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation29 = new model.Reservation((model.User) labManager3, equipment10, localDateTime26, localDateTime27, pricingStrategy28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4170");
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
        equipment37.attach(equipmentObserver53);
        labManager5.addEquipment(equipment37);
        // The following exception was thrown during execution in test generation
        try {
            equipment37.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str52, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4171");
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
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment9.detach(equipmentObserver21);
        equipment9.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4172");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        equipment9.setStatus("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = equipment9.getLabLocation();
        state.EquipmentState equipmentState15 = equipment9.getCurrentState();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment9.detach(equipmentObserver16);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(equipmentState15);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4173");
        model.Student student3 = new model.Student("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        double double4 = student3.getHourlyRate();
        student3.setIdOrCertNumber("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4174");
        model.Student student3 = new model.Student("User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=37ffc006-9dc0-479a-b401-aaea8c331831, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a63bf981-b1fe-4c3e-b795-7b7bdf0eee85, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setStatus("");
        java.lang.String str17 = equipment7.getEquipmentId();
        java.lang.String str18 = equipment7.getEquipmentId();
        java.lang.String str19 = equipment7.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        strategy.PricingStrategy pricingStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation23 = new model.Reservation((model.User) student3, equipment7, localDateTime20, localDateTime21, pricingStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4175");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        equipment9.setStatus("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = equipment9.getLabLocation();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment9.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=1554ca21-73b0-4404-bb69-3359b1ad427d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation18);
        java.lang.String str20 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4176");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID6 = headLabCoordinator3.getUserId();
        double double7 = headLabCoordinator3.getHourlyRate();
        double double8 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "24) test4176(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID6.toString(), "f0d1fba7-e48a-47bb-835e-072f7c52002b");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4177");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4178");
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
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double45 = headLabCoordinator44.getHourlyRate();
        java.lang.String str46 = headLabCoordinator44.getRole();
        java.lang.String str47 = headLabCoordinator44.getRole();
        java.lang.String str48 = headLabCoordinator44.toString();
        model.LabManager labManager50 = headLabCoordinator44.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment54 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment54.markMaintenance();
        labManager50.addEquipment(equipment54);
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment54.detach(equipmentObserver57);
        labManager9.setEquipmentStatus(equipment54, "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.SensorUpdate sensorUpdate61 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment54.applySensorUpdate(sensorUpdate61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HeadLabCoordinator" + "'", str46, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HeadLabCoordinator" + "'", str47, "HeadLabCoordinator");
// flaky "25) test4178(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "User{userId=445105b7-e087-4ca4-ab8b-141c2b39c415, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str48, "User{userId=445105b7-e087-4ca4-ab8b-141c2b39c415, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager50);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4179");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getRole();
        double double12 = researcher3.getHourlyRate();
        double double13 = researcher3.getHourlyRate();
        double double14 = researcher3.getHourlyRate();
        java.lang.String str15 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "26) test4179(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID7.toString(), "bbb67ecb-43a6-486a-9ab5-42f147d0a39c");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4180");
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
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment53.attach(equipmentObserver57);
        observer.EquipmentObserver equipmentObserver59 = null;
        equipment53.attach(equipmentObserver59);
        java.lang.String str61 = equipment53.toString();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str61, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4181");
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
        java.lang.String str20 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "27) test4181(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID14.toString(), "e76ae2c6-3bd4-452d-9373-98ee8a9479ad");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
// flaky "7) test4181(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=e76ae2c6-3bd4-452d-9373-98ee8a9479ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str19, "User{userId=e76ae2c6-3bd4-452d-9373-98ee8a9479ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4182");
        model.Equipment equipment3 = new model.Equipment("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        java.lang.String str28 = labManager9.getRole();
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.lang.String str33 = equipment32.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment32.isModifyAvailable(localDateTime34, localDateTime35, "hi!", reservation37);
        java.lang.String str39 = equipment32.getDescription();
        state.EquipmentState equipmentState40 = equipment32.getCurrentState();
        equipment32.setLabLocation("Student");
        java.lang.String str43 = equipment32.getStatus();
        equipment32.setStatus("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.addEquipment(equipment32);
        model.Equipment equipment50 = new model.Equipment("", "", "");
        java.lang.String str51 = equipment50.getDescription();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        model.Reservation reservation55 = null;
        boolean boolean56 = equipment50.isModifyAvailable(localDateTime52, localDateTime53, "hi!", reservation55);
        equipment50.disable();
        equipment50.enable();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        boolean boolean62 = equipment50.isAvailable(localDateTime59, localDateTime60, "");
        observer.EquipmentObserver equipmentObserver63 = null;
        equipment50.attach(equipmentObserver63);
        java.lang.String str65 = equipment50.getEquipmentId();
        state.EquipmentState equipmentState66 = equipment50.getCurrentState();
        equipment32.setState(equipmentState66);
        equipment3.setState(equipmentState66);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LabManager" + "'", str28, "LabManager");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Available" + "'", str43, "Available");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(equipmentState66);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4183");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        equipment16.enable();
        equipment16.enable();
        java.lang.String str19 = equipment16.getStatus();
        java.lang.String str20 = equipment16.getDescription();
        model.Equipment equipment24 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str25 = equipment24.getEquipmentId();
        java.lang.String str26 = equipment24.getEquipmentId();
        equipment24.enable();
        state.EquipmentState equipmentState28 = equipment24.getCurrentState();
        equipment16.setState(equipmentState28);
        equipment3.setState(equipmentState28);
        java.lang.Class<?> wildcardClass31 = equipmentState28.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Available" + "'", str19, "Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4184");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4185");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=60627567-2a83-4f74-a66c-201a8785c013, email='User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', role='Faculty'}", "User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4186");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        boolean boolean6 = researcher3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4187");
        model.Researcher researcher3 = new model.Researcher("User{userId=74639b42-b7f5-4247-a515-bbba276cf4d8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=968a9ceb-0f5d-4a5c-9aa4-22c79190dbe4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4188");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        java.lang.String str7 = guest3.getStatus();
        guest3.setIdOrCertNumber("");
        java.lang.String str10 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4189");
        model.Equipment equipment3 = new model.Equipment("User{userId=08f86549-1876-4719-81f7-5cdb920a7157, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=87a39470-b8fd-4913-93c2-61629bd7c020, email='User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}', role='Faculty'}", "User{userId=1449d290-7826-48f2-b708-6de8109eb44a, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4190");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        double double10 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4191");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setActive(true);
        researcher3.setActive(true);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4192");
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
        java.lang.String str22 = equipment9.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(equipmentState20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4193");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "Maintenance", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        faculty3.setEmail("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str6 = faculty3.toString();
        java.lang.String str7 = faculty3.getRole();
// flaky "28) test4193(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=ddc5f445-7d90-4af4-a3ae-8f2c6d7f3698, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}" + "'", str6, "User{userId=ddc5f445-7d90-4af4-a3ae-8f2c6d7f3698, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4194");
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
        model.Equipment equipment74 = new model.Equipment("", "", "");
        java.lang.String str75 = equipment74.getDescription();
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        model.Reservation reservation79 = null;
        boolean boolean80 = equipment74.isModifyAvailable(localDateTime76, localDateTime77, "hi!", reservation79);
        equipment74.disable();
        equipment74.enable();
        state.EquipmentState equipmentState83 = equipment74.getCurrentState();
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        boolean boolean87 = equipment74.isAvailable(localDateTime84, localDateTime85, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment74.markMaintenance();
        labManager5.addEquipment(equipment74);
        observer.EquipmentObserver equipmentObserver90 = null;
        equipment74.attach(equipmentObserver90);
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(equipmentState83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4195");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        equipment13.markMaintenance();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment13.attach(equipmentObserver17);
        java.lang.Class<?> wildcardClass19 = equipment13.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4196");
        model.Researcher researcher3 = new model.Researcher("User{userId=a04ab48d-8a0f-472f-a258-2c21c5939187, email='User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Student', status='Available'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status=''}", "");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4197");
        model.LabManager labManager3 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher7 = new model.Researcher("", "hi!", "hi!");
        researcher7.setEmail("hi!");
        double double10 = researcher7.getHourlyRate();
        java.util.UUID uUID11 = researcher7.getUserId();
        labManager3.setUserId(uUID11);
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment22 = new model.Equipment("", "", "");
        labManager18.markMaintenance(equipment22);
        java.lang.String str24 = labManager18.getRole();
        java.lang.String str25 = labManager18.getRole();
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        labManager31.markMaintenance(equipment35);
        double double37 = labManager31.getHourlyRate();
        java.lang.String str38 = labManager31.getRole();
        double double39 = labManager31.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator43 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager45 = headLabCoordinator43.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment49.isModifyAvailable(localDateTime50, localDateTime51, "Faculty", reservation53);
        equipment49.setLabLocation("Faculty");
        labManager45.setEquipmentStatus(equipment49, "");
        equipment49.notifyObservers();
        labManager31.addEquipment(equipment49);
        labManager18.setEquipmentStatus(equipment49, "Guest");
        model.Equipment equipment66 = new model.Equipment("", "", "");
        equipment66.enable();
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        model.Reservation reservation71 = null;
        boolean boolean72 = equipment66.isModifyAvailable(localDateTime68, localDateTime69, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation71);
        equipment66.setDescription("ACTIVE");
        labManager18.setEquipmentStatus(equipment66, "Researcher");
        labManager3.setEquipmentStatus(equipment66, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str79 = labManager3.getIdOrCertNumber();
        labManager3.setIdOrCertNumber("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str82 = labManager3.getEmail();
        java.lang.String str83 = labManager3.getRole();
        java.lang.String str84 = labManager3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "29) test4197(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID11.toString(), "37482458-4f8a-4f28-bb5b-563458c302c6");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LabManager" + "'", str38, "LabManager");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "LabManager" + "'", str79, "LabManager");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "ACTIVE" + "'", str82, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "LabManager" + "'", str83, "LabManager");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str84, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4198");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager18.setActive(true);
        java.lang.String str21 = labManager18.getStatus();
        labManager18.setActive(false);
        model.Equipment equipment27 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str28 = equipment27.getLabLocation();
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment27.detach(equipmentObserver29);
        equipment27.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str33 = equipment27.getLabLocation();
        java.lang.String str34 = equipment27.toString();
        labManager18.setEquipmentStatus(equipment27, "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        labManager12.addEquipment(equipment27);
        model.HeadLabCoordinator headLabCoordinator41 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager43 = headLabCoordinator41.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID44 = null;
        headLabCoordinator41.setUserId(uUID44);
        model.LabManager labManager47 = headLabCoordinator41.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment51 = new model.Equipment("", "", "");
        equipment51.enable();
        labManager47.addEquipment(equipment51);
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.lang.String str58 = equipment57.getDescription();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment57.isModifyAvailable(localDateTime59, localDateTime60, "hi!", reservation62);
        java.lang.String str64 = equipment57.getDescription();
        state.EquipmentState equipmentState65 = equipment57.getCurrentState();
        equipment57.setLabLocation("Student");
        labManager47.setEquipmentStatus(equipment57, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment57.notifyObservers();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean74 = equipment57.isAvailable(localDateTime71, localDateTime72, "");
        java.lang.String str75 = equipment57.getEquipmentId();
        labManager12.markMaintenance(equipment57);
        double double77 = labManager12.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ACTIVE" + "'", str21, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str34, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(equipmentState65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4199");
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
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean52 = equipment35.isAvailable(localDateTime49, localDateTime50, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment35.markMaintenance();
        java.lang.String str54 = equipment35.getLabLocation();
        equipment35.enable();
        equipment35.setDescription("User{userId=321c82f6-0b4a-4156-a81f-389c8ed9e05e, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4200");
        model.Researcher researcher3 = new model.Researcher("User{userId=b9fdd275-807e-425d-8a8f-31d8564c3fd5, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4201");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        java.util.UUID uUID7 = faculty3.getUserId();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "30) test4201(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID7.toString(), "2e03c81e-dfba-4ef0-aafe-d952ca66dae3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4202");
        model.Guest guest3 = new model.Guest("User{userId=d8859b82-6f4d-4999-9299-000db8f32de9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7b0716eb-4fd0-4689-a9a3-203b542115c0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4203");
        model.Researcher researcher3 = new model.Researcher("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        java.lang.String str4 = researcher3.getEmail();
        java.util.UUID uUID5 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "31) test4203(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID5.toString(), "19936e58-494b-4068-8a38-739b8a97ca10");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4204");
        model.Guest guest3 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4205");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        java.lang.String str9 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "", reservation13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", reservation18);
        java.lang.String str20 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ACTIVE" + "'", str20, "ACTIVE");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4206");
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
        java.lang.String str20 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4207");
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
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        java.lang.String str32 = equipment24.getDescription();
        java.lang.String str33 = equipment24.getEquipmentId();
        equipment24.notifyObservers();
        equipment24.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState37 = equipment24.getCurrentState();
        equipment13.setState(equipmentState37);
        model.SensorUpdate sensorUpdate39 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment13.applySensorUpdate(sensorUpdate39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(equipmentState37);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4208");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime5, localDateTime6, "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str9, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4209");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        equipment3.setDescription("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation14);
        java.lang.String str16 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str16, "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4210");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getStatus();
        java.lang.String str8 = faculty3.getIdOrCertNumber();
        java.lang.String str9 = faculty3.getRole();
        faculty3.setActive(false);
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4211");
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
        equipment13.enable();
        equipment13.setStatus("User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str22 = equipment13.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4212");
        model.Researcher researcher3 = new model.Researcher("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=0748f4eb-c687-4292-9a20-44a804e1827c, email='User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4213");
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
        java.lang.String str30 = equipment22.toString();
        equipment22.markMaintenance();
        equipment22.setStatus("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str30, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4214");
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
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.attach(equipmentObserver19);
        java.lang.String str21 = equipment3.getStatus();
        java.lang.String str22 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Available" + "'", str21, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4215");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getDescription();
        model.Equipment equipment11 = new model.Equipment("", "", "");
        equipment11.enable();
        equipment11.enable();
        java.lang.String str14 = equipment11.getStatus();
        equipment11.markMaintenance();
        equipment11.setLabLocation("Researcher");
        java.lang.String str18 = equipment11.getEquipmentId();
        equipment11.setLabLocation("LM-CERT");
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment11.detach(equipmentObserver21);
        state.EquipmentState equipmentState23 = equipment11.getCurrentState();
        equipment3.setState(equipmentState23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Available" + "'", str14, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4216");
        model.Researcher researcher3 = new model.Researcher("Temp123!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setEmail("User{userId=74639b42-b7f5-4247-a515-bbba276cf4d8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4217");
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
        equipment25.markMaintenance();
        equipment25.setStatus("Student");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4218");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        double double7 = guest3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID14 = null;
        headLabCoordinator11.setUserId(uUID14);
        model.LabManager labManager17 = headLabCoordinator11.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager19 = headLabCoordinator11.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager21 = headLabCoordinator11.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty25 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str26 = faculty25.getStatus();
        boolean boolean27 = faculty25.isActive();
        model.Faculty faculty31 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID32 = faculty31.getUserId();
        faculty25.setUserId(uUID32);
        labManager21.setUserId(uUID32);
        guest3.setUserId(uUID32);
        double double36 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ACTIVE" + "'", str26, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(uUID32);
// flaky "32) test4218(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID32.toString(), "524c837d-d994-43f0-89ac-f3d86bd3cdf3");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 25.0d + "'", double36 == 25.0d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4219");
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
        labManager5.setActive(true);
        boolean boolean27 = labManager5.isActive();
        java.lang.String str28 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "33) test4219(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "User{userId=cca31dc5-ff7d-4721-b420-6ecdef9ae504, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str28, "User{userId=cca31dc5-ff7d-4721-b420-6ecdef9ae504, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4220");
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
        equipment45.disable();
        state.EquipmentState equipmentState49 = equipment45.getCurrentState();
        java.lang.String str50 = equipment45.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str50, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4221");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        double double16 = labManager9.getHourlyRate();
        labManager9.setPasswordHash("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Equipment equipment22 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment22.isModifyAvailable(localDateTime23, localDateTime24, "", reservation26);
        labManager9.markMaintenance(equipment22);
        equipment22.setDescription("User{userId=7cd6aa2f-88ba-4a33-8e98-0bd97f07a228, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4222");
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
        java.lang.String str50 = equipment22.getEquipmentId();
        java.lang.String str51 = equipment22.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4223");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        double double11 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        double double14 = headLabCoordinator3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean21 = labManager20.isActive();
        double double22 = labManager20.getHourlyRate();
        double double23 = labManager20.getHourlyRate();
        labManager20.setEmail("LM-CERT");
        model.Equipment equipment29 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str30 = equipment29.getStatus();
        equipment29.markMaintenance();
        labManager20.addEquipment(equipment29);
        equipment29.setDescription("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        equipment29.markMaintenance();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        strategy.PricingStrategy pricingStrategy38 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation39 = new model.Reservation((model.User) headLabCoordinator3, equipment29, localDateTime36, localDateTime37, pricingStrategy38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Available" + "'", str30, "Available");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4224");
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
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment51.isModifyAvailable(localDateTime61, localDateTime62, "INACTIVE", reservation64);
        state.EquipmentState equipmentState66 = equipment51.getCurrentState();
        equipment29.setState(equipmentState66);
        java.lang.String str68 = equipment29.getDescription();
        java.lang.String str69 = equipment29.getEquipmentId();
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(equipmentState66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str68, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4225");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "LM-CERT", "hi!");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4226");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=66ae9f7c-69d0-459a-b119-650a666a420d, email='', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4227");
        model.Equipment equipment3 = new model.Equipment("User{userId=1554ca21-73b0-4404-bb69-3359b1ad427d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c22c0d72-4bad-4b17-96e3-212098016720, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4228");
        model.Guest guest3 = new model.Guest("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=26f4380a-41a6-46a9-b770-09540d1b80d3, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4229");
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
        java.lang.String str29 = equipment22.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4230");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
        java.lang.String str6 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "34) test4230(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=c64fabb7-f613-459c-b569-6e6b49571f71, email='User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str6, "User{userId=c64fabb7-f613-459c-b569-6e6b49571f71, email='User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4231");
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
        state.EquipmentState equipmentState38 = equipment28.getCurrentState();
        equipment28.markMaintenance();
        labManager5.setEquipmentStatus(equipment28, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.lang.String str46 = equipment45.getDescription();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment45.isModifyAvailable(localDateTime47, localDateTime48, "hi!", reservation50);
        java.lang.String str52 = equipment45.getDescription();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment45.isAvailable(localDateTime53, localDateTime54, "Faculty");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.lang.String str61 = equipment60.getDescription();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment60.isModifyAvailable(localDateTime62, localDateTime63, "hi!", reservation65);
        java.lang.String str67 = equipment60.getDescription();
        state.EquipmentState equipmentState68 = equipment60.getCurrentState();
        equipment45.setState(equipmentState68);
        equipment28.setState(equipmentState68);
        equipment28.notifyObservers();
        java.lang.String str72 = equipment28.toString();
        java.lang.String str73 = equipment28.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(equipmentState68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str72, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Available" + "'", str73, "Available");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4232");
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
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4233");
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
        double double37 = labManager5.getHourlyRate();
        double double38 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4234");
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
        labManager9.setEmail("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID40 = null;
        headLabCoordinator37.setUserId(uUID40);
        model.LabManager labManager43 = headLabCoordinator37.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        equipment47.enable();
        labManager43.addEquipment(equipment47);
        model.Equipment equipment53 = new model.Equipment("", "", "");
        java.lang.String str54 = equipment53.getDescription();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment53.isModifyAvailable(localDateTime55, localDateTime56, "hi!", reservation58);
        java.lang.String str60 = equipment53.getDescription();
        state.EquipmentState equipmentState61 = equipment53.getCurrentState();
        equipment53.setLabLocation("Student");
        labManager43.setEquipmentStatus(equipment53, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment69 = new model.Equipment("", "", "");
        java.lang.String str70 = equipment69.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment69.isModifyAvailable(localDateTime71, localDateTime72, "hi!", reservation74);
        equipment69.disable();
        equipment69.enable();
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        boolean boolean81 = equipment69.isAvailable(localDateTime78, localDateTime79, "");
        labManager43.addEquipment(equipment69);
        equipment69.disable();
        equipment69.setStatus("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment69.markMaintenance();
        equipment69.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.addEquipment(equipment69);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(equipmentState61);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4235");
        model.Faculty faculty3 = new model.Faculty("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=e5acc2b1-3477-47e8-b42f-91f5b564f408, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4236");
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
        boolean boolean43 = equipment29.isModifyAvailable(localDateTime39, localDateTime40, "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation42);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment29.isAvailable(localDateTime44, localDateTime45, "User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager5.setEquipmentStatus(equipment29, "User{userId=7b0716eb-4fd0-4689-a9a3-203b542115c0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4237");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        labManager10.setEmail("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager10.setActive(true);
        model.Equipment equipment19 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment19.notifyObservers();
        java.lang.String str21 = equipment19.getDescription();
        java.lang.String str22 = equipment19.toString();
        labManager10.addEquipment(equipment19);
        java.lang.String str24 = labManager10.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "35) test4237(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=f4cca0a4-caa9-4643-8e06-2af6f8209431, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=f4cca0a4-caa9-4643-8e06-2af6f8209431, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}" + "'", str22, "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4238");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        labManager17.addEquipment(equipment21);
        state.EquipmentState equipmentState23 = equipment21.getCurrentState();
        state.EquipmentState equipmentState24 = equipment21.getCurrentState();
        labManager11.addEquipment(equipment21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4239");
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
        equipment3.markMaintenance();
        model.Equipment equipment23 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        state.EquipmentState equipmentState24 = equipment23.getCurrentState();
        equipment3.setState(equipmentState24);
        equipment3.setStatus("User{userId=64f60eb5-310c-477e-9c0e-3658a01ecc5b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str18, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4240");
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
        java.lang.String str36 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4241");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.disable();
        labManager3.addEquipment(equipment7);
        java.lang.String str11 = equipment7.getDescription();
        equipment7.setDescription("User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4242");
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
        double double35 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment45.isModifyAvailable(localDateTime46, localDateTime47, "Faculty", reservation49);
        equipment45.setLabLocation("Faculty");
        labManager41.setEquipmentStatus(equipment45, "");
        java.lang.String str55 = equipment45.toString();
        equipment45.disable();
        equipment45.setLabLocation("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager5.addEquipment(equipment45);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str55, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4243");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        faculty3.setPasswordHash("ACTIVE");
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.toString();
        java.lang.String str9 = faculty3.getRole();
        java.util.UUID uUID10 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
// flaky "36) test4243(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=7c981876-7b76-45d0-8748-7a0b8e1d94f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=7c981876-7b76-45d0-8748-7a0b8e1d94f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(uUID10);
// flaky "8) test4243(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "7c981876-7b76-45d0-8748-7a0b8e1d94f6");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4244");
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
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.detach(equipmentObserver16);
        java.lang.String str18 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4245");
        model.User user0 = null;
        model.Equipment equipment4 = new model.Equipment("", "", "");
        java.lang.String str5 = equipment4.getDescription();
        equipment4.enable();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        strategy.PricingStrategy pricingStrategy9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation10 = new model.Reservation(user0, equipment4, localDateTime7, localDateTime8, pricingStrategy9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4246");
        model.Faculty faculty3 = new model.Faculty("User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4247");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager18.setActive(true);
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Guest");
        model.Equipment equipment30 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager26.markMaintenance(equipment30);
        labManager18.setEquipmentStatus(equipment30, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager5.setEquipmentStatus(equipment30, "User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str36 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID43 = null;
        headLabCoordinator40.setUserId(uUID43);
        model.LabManager labManager46 = headLabCoordinator40.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        equipment50.enable();
        labManager46.addEquipment(equipment50);
        java.lang.String str53 = equipment50.toString();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment50.isAvailable(localDateTime54, localDateTime55, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str58 = equipment50.getLabLocation();
        equipment50.disable();
        labManager5.markMaintenance(equipment50);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str53, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4248");
        model.Student student3 = new model.Student("User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7c8bec6d-719e-4756-aeec-1def59afc3f2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4249");
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
        java.lang.String str20 = equipment3.toString();
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.attach(equipmentObserver21);
        java.lang.String str23 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}', status='Maintenance'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}', status='Maintenance'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}" + "'", str23, "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4250");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID32 = null;
        headLabCoordinator29.setUserId(uUID32);
        model.LabManager labManager35 = headLabCoordinator29.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        equipment39.enable();
        labManager35.addEquipment(equipment39);
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.lang.String str46 = equipment45.getDescription();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment45.isModifyAvailable(localDateTime47, localDateTime48, "hi!", reservation50);
        java.lang.String str52 = equipment45.getDescription();
        state.EquipmentState equipmentState53 = equipment45.getCurrentState();
        equipment45.setLabLocation("Student");
        labManager35.setEquipmentStatus(equipment45, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.lang.String str62 = equipment61.getDescription();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment61.isModifyAvailable(localDateTime63, localDateTime64, "hi!", reservation66);
        equipment61.disable();
        equipment61.enable();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        boolean boolean73 = equipment61.isAvailable(localDateTime70, localDateTime71, "");
        labManager35.addEquipment(equipment61);
        java.lang.String str75 = equipment61.getLabLocation();
        model.Equipment equipment79 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment79.isModifyAvailable(localDateTime80, localDateTime81, "Faculty", reservation83);
        equipment79.setLabLocation("Faculty");
        java.lang.String str87 = equipment79.getDescription();
        java.lang.String str88 = equipment79.getEquipmentId();
        equipment79.notifyObservers();
        equipment79.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState92 = equipment79.getCurrentState();
        equipment61.setState(equipmentState92);
        labManager8.addEquipment(equipment61);
        java.time.LocalDateTime localDateTime95 = null;
        java.time.LocalDateTime localDateTime96 = null;
        model.Reservation reservation98 = null;
        boolean boolean99 = equipment61.isModifyAvailable(localDateTime95, localDateTime96, "Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}", reservation98);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(equipmentState92);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4251");
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
        java.lang.String str46 = equipment36.getLabLocation();
        java.lang.String str47 = equipment36.getEquipmentId();
        java.lang.Class<?> wildcardClass48 = equipment36.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4252");
        model.Guest guest3 = new model.Guest("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6d11d2d8-000a-4498-88ff-7e3b9b1e820b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4253");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        researcher3.setPasswordHash("User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str12 = researcher3.getStatus();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4254");
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
        model.Equipment equipment27 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str28 = equipment27.getStatus();
        java.lang.String str29 = equipment27.toString();
        java.lang.String str30 = equipment27.getLabLocation();
        labManager7.setEquipmentStatus(equipment27, "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.Class<?> wildcardClass33 = equipment27.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}" + "'", str29, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str30, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4255");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        java.lang.String str13 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID20 = null;
        headLabCoordinator17.setUserId(uUID20);
        model.LabManager labManager23 = headLabCoordinator17.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        equipment27.enable();
        labManager23.addEquipment(equipment27);
        equipment27.disable();
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment27.detach(equipmentObserver31);
        equipment27.enable();
        labManager5.setEquipmentStatus(equipment27, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState36 = equipment27.getCurrentState();
        equipment27.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(equipmentState36);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4256");
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
        equipment13.enable();
        equipment13.disable();
        equipment13.setStatus("User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4257");
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
        equipment3.notifyObservers();
        java.lang.String str16 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4258");
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
        equipment3.setLabLocation("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4259");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        faculty3.setIdOrCertNumber("User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4260");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        java.util.UUID uUID11 = guest3.getUserId();
        java.lang.String str12 = guest3.getRole();
        java.lang.String str13 = guest3.getRole();
        double double14 = guest3.getHourlyRate();
        java.lang.String str15 = guest3.getStatus();
        java.lang.Class<?> wildcardClass16 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "37) test4260(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID11.toString(), "0b4dd9af-a652-499a-b6f3-3412d6f66912");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "INACTIVE" + "'", str15, "INACTIVE");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4261");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        equipment13.disable();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment13.detach(equipmentObserver17);
        equipment13.enable();
        equipment13.setDescription("User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4262");
        model.LabManager labManager3 = new model.LabManager("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
        double double5 = labManager3.getHourlyRate();
        java.lang.String str6 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4263");
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
        java.lang.String str23 = equipment9.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4264");
        model.LabManager labManager3 = new model.LabManager("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher", "Guest");
        java.lang.String str4 = labManager3.toString();
        java.lang.String str5 = labManager3.getEmail();
// flaky "38) test4264(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=f8aa71e6-a81e-4a9f-8834-1ba1d50b8d55, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}" + "'", str4, "User{userId=f8aa71e6-a81e-4a9f-8834-1ba1d50b8d55, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4265");
        model.LabManager labManager3 = new model.LabManager("hi!", "User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState8 = equipment7.getCurrentState();
        java.lang.String str9 = equipment7.getLabLocation();
        equipment7.setStatus("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.setEquipmentStatus(equipment7, "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID14 = labManager3.getUserId();
        org.junit.Assert.assertNotNull(equipmentState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "39) test4265(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID14.toString(), "1bb37adf-761d-47a0-9b9c-0ea93e8d9568");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4266");
        model.Student student3 = new model.Student("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=3435c72d-d18c-4cd4-887f-647055afd156, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4267");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=a861c68a-13b8-4193-85d6-6e1c136fad92, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
        java.lang.String str15 = headLabCoordinator3.getRole();
        java.lang.String str16 = headLabCoordinator3.getPasswordHash();
        headLabCoordinator3.setEmail("User{userId=39a443b4-b27d-4121-bc6b-58bf19ff7501, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4268");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
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
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4269");
        model.Student student3 = new model.Student("User{userId=1d3df56c-d05a-465d-9f54-8ddc36d67bbb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cfb38917-719c-4738-97fe-9e4f9cfc6988, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        boolean boolean4 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4270");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        java.lang.String str19 = labManager5.getStatus();
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getDescription();
        state.EquipmentState equipmentState31 = equipment23.getCurrentState();
        labManager5.markMaintenance(equipment23);
        equipment23.setLabLocation("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver35 = null;
        equipment23.attach(equipmentObserver35);
        equipment23.setStatus("HeadLabCoordinator");
        equipment23.setStatus("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment23.setLabLocation("User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ACTIVE" + "'", str19, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4271");
        model.Equipment equipment3 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.lang.String str4 = equipment3.getLabLocation();
        equipment3.setLabLocation("User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4272");
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
        double double56 = labManager9.getHourlyRate();
        java.lang.String str57 = labManager9.getRole();
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LabManager" + "'", str57, "LabManager");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4273");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        researcher3.setIdOrCertNumber("User{userId=5b8ae0c2-83eb-42da-96a5-085fe8164d7f, email='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4274");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=e4cdb642-10d9-49aa-b004-30e3cd17cd5c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4275");
        model.Equipment equipment3 = new model.Equipment("User{userId=b46b0ed3-c6e6-426a-a1c0-f480d4f1afb4, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}", "User{userId=6f8bc8f8-6ed6-4508-ab97-4a82054f299d, email='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2203a4c0-197b-4510-a1ad-f5e4b7215c16, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4276");
        model.Faculty faculty3 = new model.Faculty("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        java.lang.String str4 = faculty3.getStatus();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str9 = headLabCoordinator8.getPasswordHash();
        double double10 = headLabCoordinator8.getHourlyRate();
        model.LabManager labManager14 = new model.LabManager("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID15 = labManager14.getUserId();
        headLabCoordinator8.setUserId(uUID15);
        faculty3.setUserId(uUID15);
        java.lang.String str18 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str9, "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(uUID15);
// flaky "40) test4276(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID15.toString(), "c31eab43-864c-4544-8c9f-2620955cb71f");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4277");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        labManager6.setEmail("User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double9 = labManager6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4278");
        model.LabManager labManager3 = new model.LabManager("User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "User{userId=f314487c-0f1d-4db6-bc8d-61154327bc96, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        boolean boolean28 = labManager9.isActive();
        labManager9.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
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
        java.lang.String str46 = equipment34.toString();
        labManager9.addEquipment(equipment34);
        labManager9.setEmail("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment53 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        labManager9.setEquipmentStatus(equipment53, "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.markMaintenance(equipment53);
        java.lang.String str57 = equipment53.getStatus();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str46, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Maintenance" + "'", str57, "Maintenance");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4279");
        model.Student student3 = new model.Student("LM-CERT", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str10 = headLabCoordinator9.getRole();
        java.lang.String str11 = headLabCoordinator9.getEmail();
        java.lang.String str12 = headLabCoordinator9.getRole();
        java.lang.String str13 = headLabCoordinator9.getRole();
        headLabCoordinator9.setPasswordHash("User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double16 = headLabCoordinator9.getHourlyRate();
        model.Guest guest20 = new model.Guest("", "hi!", "hi!");
        java.lang.String str21 = guest20.getRole();
        double double22 = guest20.getHourlyRate();
        java.lang.String str23 = guest20.getRole();
        java.util.UUID uUID24 = guest20.getUserId();
        headLabCoordinator9.setUserId(uUID24);
        student3.setUserId(uUID24);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HeadLabCoordinator" + "'", str12, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 25.0d + "'", double22 == 25.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Guest" + "'", str23, "Guest");
        org.junit.Assert.assertNotNull(uUID24);
// flaky "41) test4279(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID24.toString(), "cadfb1a7-5ff3-4203-9727-55829af04a2a");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4280");
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
        java.lang.String str82 = labManager8.getRole();
        boolean boolean83 = labManager8.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager33);
// flaky "42) test4280(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "User{userId=5ba60eb4-cb5e-4eeb-a0c3-a17e8b79f805, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str34, "User{userId=5ba60eb4-cb5e-4eeb-a0c3-a17e8b79f805, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(equipmentState75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "LabManager" + "'", str82, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4281");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4282");
        model.Student student3 = new model.Student("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        student3.setEmail("User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        student3.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4283");
        model.Guest guest3 = new model.Guest("User{userId=777b9370-e1e5-4fd8-a436-2007d0a1d701, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID8 = headLabCoordinator7.getUserId();
        guest3.setUserId(uUID8);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "43) test4283(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID8.toString(), "31c74a5f-68fa-4747-aee4-00dda2b4a321");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4284");
        model.LabManager labManager3 = new model.LabManager("User{userId=3968022a-32a8-4fb2-a372-e7c7650b12ae, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4285");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.util.UUID uUID6 = student3.getUserId();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        model.Guest guest12 = new model.Guest("", "hi!", "hi!");
        java.lang.String str13 = guest12.getRole();
        double double14 = guest12.getHourlyRate();
        double double15 = guest12.getHourlyRate();
        java.lang.String str16 = guest12.getPasswordHash();
        guest12.setActive(false);
        java.lang.String str19 = guest12.getEmail();
        java.util.UUID uUID20 = guest12.getUserId();
        student3.setUserId(uUID20);
        java.util.UUID uUID22 = student3.getUserId();
        model.HeadLabCoordinator headLabCoordinator26 = new model.HeadLabCoordinator("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str27 = headLabCoordinator26.getPasswordHash();
        double double28 = headLabCoordinator26.getHourlyRate();
        model.LabManager labManager32 = new model.LabManager("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID33 = labManager32.getUserId();
        headLabCoordinator26.setUserId(uUID33);
        student3.setUserId(uUID33);
        student3.setPasswordHash("User{userId=3ea24dc7-f640-44c6-99b2-10e76d3f61dc, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "44) test4285(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID20.toString(), "741a14f9-9247-4fa7-b238-d87d4ca551fa");
        org.junit.Assert.assertNotNull(uUID22);
// flaky "9) test4285(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID22.toString(), "741a14f9-9247-4fa7-b238-d87d4ca551fa");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(uUID33);
// flaky "4) test4285(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID33.toString(), "7384ffc4-73dc-49f9-bf1e-771d51394ac7");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4286");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=150dca6f-8210-45c8-b018-a916b1419a4d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.Equipment equipment11 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.lang.String str12 = equipment11.getLabLocation();
        labManager7.markMaintenance(equipment11);
        equipment11.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Available" + "'", str12, "Available");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4287");
        model.Student student3 = new model.Student("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Guest", "INACTIVE");
        student3.setPasswordHash("User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4288");
        model.LabManager labManager3 = new model.LabManager("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager3.setEmail("User{userId=a66dc658-223f-4bde-9f5d-e36e19a4e9ce, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4289");
        model.LabManager labManager3 = new model.LabManager("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
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
        java.lang.String str32 = equipment7.getStatus();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean36 = equipment7.isAvailable(localDateTime33, localDateTime34, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        observer.EquipmentObserver equipmentObserver37 = null;
        equipment7.detach(equipmentObserver37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment7.isModifyAvailable(localDateTime39, localDateTime40, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation42);
        labManager3.addEquipment(equipment7);
        java.lang.String str45 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Available" + "'", str32, "Available");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "LabManager" + "'", str45, "LabManager");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4290");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        researcher3.setPasswordHash("Faculty");
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getRole();
        double double12 = researcher3.getHourlyRate();
        researcher3.setEmail("User{userId=6907ea78-c483-4fc8-ba67-aa194b12b7c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "45) test4290(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID7.toString(), "dff8c348-aa7c-4654-bf4c-62f5ab15c7f4");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4291");
        model.Researcher researcher3 = new model.Researcher("User{userId=9e863393-c76d-4499-8ed2-06d466032c33, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}", "User{userId=939a1235-014f-498a-be6b-747f2c3aa659, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}", "User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4292");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = student3.toString();
        java.lang.String str5 = student3.getRole();
        student3.setPasswordHash("User{userId=60fdec4d-bc2b-4093-b1c3-b2a04814f23b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getRole();
// flaky "46) test4292(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=fd275276-f91f-4453-a1ff-57db6d8071c7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=fd275276-f91f-4453-a1ff-57db6d8071c7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4293");
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
        java.lang.String str88 = equipment20.getStatus();
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Available" + "'", str88, "Available");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4294");
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
        java.lang.String str21 = equipment3.getDescription();
        equipment3.setStatus("User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4295");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getEmail();
        boolean boolean5 = researcher3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4296");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setPasswordHash("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str8 = researcher3.getPasswordHash();
        java.util.UUID uUID9 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str8, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "47) test4296(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID9.toString(), "abeb3b69-3803-4168-9df4-9b4447e87b14");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4297");
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
        java.lang.String str70 = equipment49.getLabLocation();
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4298");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=27dfb710-3768-4014-a4e5-59c71fca2092, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=24fef356-e371-4e89-9d24-1ebb8462b5b5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4299");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getPasswordHash();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        java.lang.String str9 = equipment8.getDescription();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment8.isModifyAvailable(localDateTime10, localDateTime11, "hi!", reservation13);
        java.lang.String str15 = equipment8.getEquipmentId();
        equipment8.setStatus("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        labManager3.addEquipment(equipment8);
        java.lang.String str19 = labManager3.getEmail();
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getEquipmentId();
        equipment23.setStatus("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment23.isModifyAvailable(localDateTime33, localDateTime34, "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation36);
        labManager3.markMaintenance(equipment23);
        java.lang.String str39 = equipment23.getDescription();
        equipment23.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4300");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a589f573-319a-4723-a067-0220546441f7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4301");
        model.Student student3 = new model.Student("User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        model.Student student8 = new model.Student("", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str9 = student8.getRole();
        java.util.UUID uUID10 = student8.getUserId();
        student3.setUserId(uUID10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(uUID10);
// flaky "48) test4301(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "db8a831e-d4ed-46ac-9138-ca4d0ee00135");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4302");
        model.LabManager labManager3 = new model.LabManager("Researcher", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Temp123!");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getStatus();
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str10 = headLabCoordinator9.getRole();
        headLabCoordinator9.setEmail("Researcher");
        model.LabManager labManager14 = headLabCoordinator9.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        labManager20.addEquipment(equipment24);
        labManager14.setEquipmentStatus(equipment24, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double28 = labManager14.getHourlyRate();
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.lang.String str33 = equipment32.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment32.isModifyAvailable(localDateTime34, localDateTime35, "hi!", reservation37);
        java.lang.String str39 = equipment32.getEquipmentId();
        equipment32.setStatus("");
        java.lang.String str42 = equipment32.getEquipmentId();
        java.lang.String str43 = equipment32.getLabLocation();
        labManager14.setEquipmentStatus(equipment32, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment49 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str50 = equipment49.getLabLocation();
        observer.EquipmentObserver equipmentObserver51 = null;
        equipment49.detach(equipmentObserver51);
        equipment49.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str55 = equipment49.getLabLocation();
        java.lang.String str56 = equipment49.getStatus();
        state.EquipmentState equipmentState57 = equipment49.getCurrentState();
        labManager14.addEquipment(equipment49);
        labManager3.setEquipmentStatus(equipment49, "User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Available" + "'", str56, "Available");
        org.junit.Assert.assertNotNull(equipmentState57);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4303");
        model.Guest guest3 = new model.Guest("User{userId=a6afa3ec-ae9e-49e1-8e37-e11decf4aeca, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}", "User{userId=a74d711c-039a-4d95-9b60-940c6024f455, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=203c9f50-3d84-4386-95b1-bcf0179abfb1, email='User{userId=e2f7f034-e1a9-45dc-9009-b560dc4e017d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=123c5586-5011-4a61-a2cd-4690544c999e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4304");
        model.LabManager labManager3 = new model.LabManager("User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2203a4c0-197b-4510-a1ad-f5e4b7215c16, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = labManager3.toString();
// flaky "49) test4304(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=ceec0be2-c5b3-4457-9f83-0ad2959c0d8c, email='User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}" + "'", str4, "User{userId=ceec0be2-c5b3-4457-9f83-0ad2959c0d8c, email='User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4305");
        model.Guest guest3 = new model.Guest("User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4306");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        boolean boolean7 = faculty3.isActive();
        java.util.UUID uUID8 = faculty3.getUserId();
        java.lang.String str9 = faculty3.toString();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        java.util.UUID uUID12 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "50) test4306(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID8.toString(), "a271cbe8-3a7f-442a-8745-0782c8b46372");
// flaky "10) test4306(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=a271cbe8-3a7f-442a-8745-0782c8b46372, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str9, "User{userId=a271cbe8-3a7f-442a-8745-0782c8b46372, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(uUID12);
// flaky "5) test4306(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID12.toString(), "a271cbe8-3a7f-442a-8745-0782c8b46372");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4307");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double6 = labManager5.getHourlyRate();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment10.isModifyAvailable(localDateTime11, localDateTime12, "Faculty", reservation14);
        equipment10.setLabLocation("Faculty");
        java.lang.String str18 = equipment10.getDescription();
        java.lang.String str19 = equipment10.toString();
        labManager5.setEquipmentStatus(equipment10, "Equipment{equipmentId='', description='', labLocation='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Available'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4308");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=a63bf981-b1fe-4c3e-b795-7b7bdf0eee85, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=9ef4c45b-b43c-462d-88df-a443dbf38502, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4309");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.util.UUID uUID5 = student3.getUserId();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "51) test4309(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID5.toString(), "b5565dfb-9d75-41f3-bddf-47816e77a119");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4310");
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
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment29.isModifyAvailable(localDateTime48, localDateTime49, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation51);
        observer.EquipmentObserver equipmentObserver53 = null;
        equipment29.detach(equipmentObserver53);
        java.lang.String str55 = equipment29.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str44, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str55, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4311");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4312");
        model.Guest guest3 = new model.Guest("User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=66ae9f7c-69d0-459a-b119-650a666a420d, email='', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4313");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        equipment9.setStatus("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState14 = equipment9.getCurrentState();
        java.lang.Class<?> wildcardClass15 = equipment9.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertNotNull(equipmentState14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4314");
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
        equipment15.setLabLocation("Guest");
        equipment15.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str31 = equipment15.getLabLocation();
        equipment15.enable();
        java.lang.String str33 = equipment15.getLabLocation();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Guest" + "'", str33, "Guest");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4315");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getRole();
        guest3.setEmail("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        java.lang.String str13 = guest3.getRole();
        java.lang.String str14 = guest3.getIdOrCertNumber();
        double double15 = guest3.getHourlyRate();
        model.Guest guest19 = new model.Guest("", "hi!", "hi!");
        java.lang.String str20 = guest19.getRole();
        double double21 = guest19.getHourlyRate();
        double double22 = guest19.getHourlyRate();
        java.lang.String str23 = guest19.getPasswordHash();
        guest19.setActive(false);
        java.lang.String str26 = guest19.getEmail();
        java.lang.String str27 = guest19.getRole();
        java.util.UUID uUID28 = guest19.getUserId();
        guest3.setUserId(uUID28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 25.0d + "'", double21 == 25.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 25.0d + "'", double22 == 25.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Guest" + "'", str27, "Guest");
        org.junit.Assert.assertNotNull(uUID28);
// flaky "52) test4315(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID28.toString(), "2163d42c-eeb8-4a2b-ac51-a3e397f72746");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4316");
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
        equipment45.disable();
        equipment45.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4317");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        java.lang.String str7 = guest3.getStatus();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4318");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment9.isModifyAvailable(localDateTime20, localDateTime21, "Maintenance", reservation23);
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment9.attach(equipmentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            equipment9.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4319");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", reservation7);
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.detach(equipmentObserver9);
        equipment3.enable();
        model.LabManager labManager15 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager15.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment27.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        equipment27.setLabLocation("Faculty");
        labManager23.setEquipmentStatus(equipment27, "");
        equipment27.notifyObservers();
        labManager15.addEquipment(equipment27);
        state.EquipmentState equipmentState39 = equipment27.getCurrentState();
        equipment3.setState(equipmentState39);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(equipmentState39);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4320");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=be38d8d0-09bb-46fc-8661-8a5a19b7d1b4, email='Researcher', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4321");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        java.lang.String str5 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime6, localDateTime7, "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation13);
        java.lang.String str15 = equipment3.toString();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment3.isAvailable(localDateTime16, localDateTime17, "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str20 = equipment3.toString();
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.detach(equipmentObserver21);
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4322");
        model.Equipment equipment3 = new model.Equipment("User{userId=29535a0d-9d8c-4304-8892-1bf93b64cc11, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=85029e47-3c9d-47ae-86ec-5e5306fd4423, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4323");
        model.Guest guest3 = new model.Guest("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "Student", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setPasswordHash("Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
        guest3.setPasswordHash("User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setIdOrCertNumber("User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4324");
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
        equipment37.markMaintenance();
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
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4325");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        guest3.setEmail("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str11 = guest3.getIdOrCertNumber();
        java.lang.String str12 = guest3.getRole();
        guest3.setIdOrCertNumber("User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean21 = labManager20.isActive();
        double double22 = labManager20.getHourlyRate();
        double double23 = labManager20.getHourlyRate();
        java.lang.String str24 = labManager20.getIdOrCertNumber();
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        java.lang.String str35 = equipment28.getEquipmentId();
        equipment28.setStatus("");
        java.lang.String str38 = equipment28.getStatus();
        labManager20.addEquipment(equipment28);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        strategy.PricingStrategy pricingStrategy42 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation43 = new model.Reservation((model.User) guest3, equipment28, localDateTime40, localDateTime41, pricingStrategy42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LM-CERT" + "'", str24, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4326");
        model.Researcher researcher3 = new model.Researcher("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean4 = researcher3.isActive();
        researcher3.setPasswordHash("User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str7 = researcher3.getStatus();
        researcher3.setIdOrCertNumber("User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        double double10 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4327");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.lang.String str13 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Available" + "'", str13, "Available");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4328");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4329");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4330");
        model.Guest guest3 = new model.Guest("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        boolean boolean4 = guest3.isActive();
        java.lang.String str5 = guest3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "53) test4330(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=9261b0d4-4eef-4eab-aab4-10cc33440a70, email='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Guest'}" + "'", str5, "User{userId=9261b0d4-4eef-4eab-aab4-10cc33440a70, email='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Guest'}");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4331");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getStatus();
        equipment3.markMaintenance();
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean15 = labManager14.isActive();
        double double16 = labManager14.getHourlyRate();
        double double17 = labManager14.getHourlyRate();
        labManager14.setEmail("LM-CERT");
        double double20 = labManager14.getHourlyRate();
        java.lang.String str21 = labManager14.getRole();
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager27 = headLabCoordinator25.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean28 = labManager27.isActive();
        double double29 = labManager27.getHourlyRate();
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment33.isModifyAvailable(localDateTime34, localDateTime35, "Faculty", reservation37);
        equipment33.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment33.isModifyAvailable(localDateTime41, localDateTime42, "", reservation44);
        labManager27.addEquipment(equipment33);
        labManager14.markMaintenance(equipment33);
        equipment33.setDescription("User{userId=c84cff95-dacf-46bc-8719-06097ef1de9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str50 = equipment33.getStatus();
        state.EquipmentState equipmentState51 = equipment33.getCurrentState();
        equipment3.setState(equipmentState51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Maintenance" + "'", str50, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState51);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4332");
        model.Guest guest3 = new model.Guest("User{userId=74528b82-1e1f-4b63-a40c-ab32ec161ce0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b46b0ed3-c6e6-426a-a1c0-f480d4f1afb4, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}", "User{userId=eb321398-f17f-4482-bf1c-db03bfde9278, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4333");
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
        equipment43.enable();
        equipment43.setStatus("ACTIVE");
        labManager8.markMaintenance(equipment43);
        java.lang.String str48 = equipment43.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Maintenance" + "'", str48, "Maintenance");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4334");
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
        equipment56.setLabLocation("User{userId=680b24c7-a074-41c4-b09d-b9041e3818ba, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        boolean boolean73 = equipment56.isAvailable(localDateTime70, localDateTime71, "User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment56.disable();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4335");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Maintenance'}", "User{userId=c3bb06bf-a390-4727-b549-5375005c6f5d, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=7c981876-7b76-45d0-8748-7a0b8e1d94f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4336");
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
        equipment3.disable();
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
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4337");
        model.Researcher researcher3 = new model.Researcher("User{userId=d7bc9384-6ade-408c-9968-fc13e6e29ad4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=5080e319-ce49-4c55-9fb3-3dae58d6a9ac, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4338");
        model.Researcher researcher3 = new model.Researcher("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        researcher3.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Available'}");
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4339");
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
        labManager9.setEmail("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        labManager9.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4340");
        model.Guest guest3 = new model.Guest("User{userId=10b8b7d7-0cc3-4706-901d-0e8ea0d6fe73, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "User{userId=ee55f42b-52db-43a6-9d24-32867c8424a0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=968a9ceb-0f5d-4a5c-9aa4-22c79190dbe4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4341");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        equipment3.disable();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        model.Reservation reservation9 = null;
        boolean boolean10 = equipment3.isModifyAvailable(localDateTime6, localDateTime7, "HeadLabCoordinator", reservation9);
        equipment3.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        java.lang.String str13 = equipment3.getLabLocation();
        java.lang.String str14 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str13, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4342");
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
        equipment11.setDescription("User{userId=ac16180e-c994-4226-96ba-7796ddfa0394, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str29 = equipment11.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4343");
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
        equipment13.setStatus("User{userId=7f202e65-5038-4bf8-b4ca-fade3879140d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment13.attach(equipmentObserver25);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4344");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getRole();
        labManager3.setIdOrCertNumber("User{userId=a74d711c-039a-4d95-9b60-940c6024f455, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4345");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double11 = headLabCoordinator3.getHourlyRate();
        double double12 = headLabCoordinator3.getHourlyRate();
        double double13 = headLabCoordinator3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator3.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4346");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = headLabCoordinator3.getIdOrCertNumber();
        java.lang.String str14 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str13, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4347");
        model.LabManager labManager3 = new model.LabManager("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        equipment7.disable();
        equipment7.enable();
        state.EquipmentState equipmentState16 = equipment7.getCurrentState();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        labManager22.markMaintenance(equipment26);
        java.lang.String str28 = equipment26.getStatus();
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
        equipment26.setState(equipmentState53);
        equipment7.setState(equipmentState53);
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment7.isModifyAvailable(localDateTime57, localDateTime58, "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation60);
        equipment7.setLabLocation("User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.markMaintenance(equipment7);
        double double65 = labManager3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Maintenance" + "'", str28, "Maintenance");
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4348");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "Equipment{equipmentId='ACTIVE', description='User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        headLabCoordinator3.setEmail("User{userId=68d5639f-a3ac-4ba8-ad5b-a12ec5840871, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4349");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.lang.String str10 = faculty3.getRole();
        faculty3.setPasswordHash("User{userId=d473dca8-1d6b-4ed6-bea4-83139eaef698, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = faculty3.getRole();
        model.Guest guest17 = new model.Guest("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Researcher researcher21 = new model.Researcher("", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        boolean boolean22 = researcher21.isActive();
        model.HeadLabCoordinator headLabCoordinator26 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double27 = headLabCoordinator26.getHourlyRate();
        model.LabManager labManager29 = headLabCoordinator26.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.util.UUID uUID30 = headLabCoordinator26.getUserId();
        researcher21.setUserId(uUID30);
        guest17.setUserId(uUID30);
        faculty3.setUserId(uUID30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertNotNull(uUID30);
// flaky "54) test4349(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID30.toString(), "3d289a30-ab77-4323-9631-0a0d6ef387e5");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4350");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getRole();
        double double7 = labManager5.getHourlyRate();
        java.lang.String str8 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LabManager" + "'", str8, "LabManager");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4351");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getPasswordHash();
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        faculty3.setIdOrCertNumber("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        faculty3.setPasswordHash("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}");
        java.lang.String str12 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Maintenance" + "'", str5, "Maintenance");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "INACTIVE" + "'", str6, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4352");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4353");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        java.lang.String str12 = equipment9.getEquipmentId();
        state.EquipmentState equipmentState13 = equipment9.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4354");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getRole();
        double double8 = student3.getHourlyRate();
        student3.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = student3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4355");
        model.Equipment equipment3 = new model.Equipment("User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=8b391cfd-512c-4e5b-8e89-720e61f3e49e, email='Available', status='ACTIVE', idOrCertNumber='Guest', role='Guest'}", reservation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4356");
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
        java.lang.String str17 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.detach(equipmentObserver18);
        java.lang.String str20 = equipment3.getStatus();
        equipment3.setLabLocation("User{userId=eed3056d-5c45-40da-9dc1-7e60fb03b87c, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Available" + "'", str20, "Available");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4357");
        model.Student student3 = new model.Student("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        student3.setPasswordHash("User{userId=46c48ad0-8e1d-4dda-b9d8-dc5453268c34, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setPasswordHash("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4358");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=eed3056d-5c45-40da-9dc1-7e60fb03b87c, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4359");
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
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.lang.String str19 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "hi!", reservation23);
        java.lang.String str25 = equipment18.getDescription();
        state.EquipmentState equipmentState26 = equipment18.getCurrentState();
        equipment3.setState(equipmentState26);
        java.lang.String str28 = equipment3.getStatus();
        java.lang.String str29 = equipment3.toString();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment3.isAvailable(localDateTime30, localDateTime31, "User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str29, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4360");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        model.Faculty faculty9 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID10 = faculty9.getUserId();
        faculty3.setUserId(uUID10);
        faculty3.setEmail("User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "55) test4360(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "46873a75-836c-4917-9ea7-43aba353e1c4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4361");
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
        state.EquipmentState equipmentState95 = equipment77.getCurrentState();
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
        org.junit.Assert.assertNotNull(equipmentState95);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4362");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID27 = null;
        headLabCoordinator24.setUserId(uUID27);
        model.LabManager labManager30 = headLabCoordinator24.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        equipment34.enable();
        labManager30.addEquipment(equipment34);
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        java.lang.String str47 = equipment40.getDescription();
        state.EquipmentState equipmentState48 = equipment40.getCurrentState();
        equipment40.setLabLocation("Student");
        labManager30.setEquipmentStatus(equipment40, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment56.isModifyAvailable(localDateTime57, localDateTime58, "Faculty", reservation60);
        equipment56.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        model.Reservation reservation67 = null;
        boolean boolean68 = equipment56.isModifyAvailable(localDateTime64, localDateTime65, "", reservation67);
        equipment56.disable();
        labManager30.addEquipment(equipment56);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment56.isModifyAvailable(localDateTime71, localDateTime72, "Temp123!", reservation74);
        observer.EquipmentObserver equipmentObserver76 = null;
        equipment56.attach(equipmentObserver76);
        java.lang.String str78 = equipment56.getEquipmentId();
        labManager5.setEquipmentStatus(equipment56, "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.SensorUpdate sensorUpdate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment56.applySensorUpdate(sensorUpdate81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(equipmentState48);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4363");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4364");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        double double5 = headLabCoordinator3.getHourlyRate();
        java.lang.String str6 = headLabCoordinator3.getEmail();
        java.lang.String str7 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "56) test4364(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "8106955e-76f0-42e6-a825-83ebd4a0f506");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4365");
        model.LabManager labManager3 = new model.LabManager("Researcher", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Temp123!");
        double double4 = labManager3.getHourlyRate();
        model.LabManager labManager8 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str9 = labManager8.getRole();
        model.LabManager labManager13 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher17 = new model.Researcher("", "hi!", "hi!");
        researcher17.setEmail("hi!");
        double double20 = researcher17.getHourlyRate();
        java.util.UUID uUID21 = researcher17.getUserId();
        labManager13.setUserId(uUID21);
        labManager8.setUserId(uUID21);
        labManager3.setUserId(uUID21);
        double double25 = labManager3.getHourlyRate();
        double double26 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertNotNull(uUID21);
// flaky "57) test4365(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID21.toString(), "04d5faf1-1450-4f27-9ef3-93ef9950059e");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4366");
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
        java.lang.String str30 = equipment22.toString();
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment22.attach(equipmentObserver31);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str30, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4367");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        java.util.UUID uUID10 = headLabCoordinator3.getUserId();
        java.lang.Class<?> wildcardClass11 = uUID10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID10);
// flaky "58) test4367(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "d0c0acac-079d-4643-b99f-a1bbfe6c99ee");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4368");
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
        model.Equipment equipment47 = new model.Equipment("User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        labManager5.setEquipmentStatus(equipment47, "User{userId=d46daa34-b224-4bbc-a6c0-f43df8694e79, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str50 = labManager5.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str50, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4369");
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
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment13.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation30);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment13.isAvailable(localDateTime32, localDateTime33, "User{userId=d5c9e1dc-2c7a-47b7-8cab-a9b41c966096, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4370");
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
        java.lang.String str90 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime91 = null;
        java.time.LocalDateTime localDateTime92 = null;
        model.Reservation reservation94 = null;
        boolean boolean95 = equipment3.isModifyAvailable(localDateTime91, localDateTime92, "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation94);
        equipment3.setStatus("User{userId=a70a11d6-26fd-49bc-8890-79396df517de, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Available" + "'", str90, "Available");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4371");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=2d4255cd-ee33-490e-a7b6-43f4f624113d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4372");
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
        state.EquipmentState equipmentState45 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertNotNull(equipmentState45);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4373");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.Faculty faculty10 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID11 = faculty10.getUserId();
        java.lang.String str12 = faculty10.toString();
        java.lang.String str13 = faculty10.getRole();
        boolean boolean14 = faculty10.isActive();
        faculty10.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        model.Student student20 = new model.Student("hi!", "Faculty", "hi!");
        student20.setIdOrCertNumber("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str23 = student20.getIdOrCertNumber();
        java.util.UUID uUID24 = student20.getUserId();
        faculty10.setUserId(uUID24);
        labManager6.setUserId(uUID24);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "59) test4373(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "de8c5079-bbd4-4f9b-9f1d-ff263c1638c4");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "11) test4373(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID11.toString(), "773a84c0-5f54-4c67-a3db-2ba507ea2a52");
// flaky "6) test4373(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=773a84c0-5f54-4c67-a3db-2ba507ea2a52, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str12, "User{userId=773a84c0-5f54-4c67-a3db-2ba507ea2a52, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str23, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID24);
// flaky "1) test4373(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID24.toString(), "2e061b25-0e35-4bf2-8b8d-5acbbbe76394");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4374");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.toString();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        labManager10.markMaintenance(equipment14);
        java.lang.String str16 = labManager10.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment26.isModifyAvailable(localDateTime27, localDateTime28, "Faculty", reservation30);
        equipment26.setLabLocation("Faculty");
        labManager22.setEquipmentStatus(equipment26, "");
        equipment26.notifyObservers();
        labManager10.markMaintenance(equipment26);
        model.Equipment equipment41 = new model.Equipment("", "", "");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment41.isModifyAvailable(localDateTime43, localDateTime44, "hi!", reservation46);
        java.lang.String str48 = equipment41.getEquipmentId();
        java.lang.String str49 = equipment41.getLabLocation();
        labManager10.markMaintenance(equipment41);
        model.Equipment equipment54 = new model.Equipment("", "", "");
        equipment54.enable();
        labManager10.addEquipment(equipment54);
        java.lang.String str57 = equipment54.getEquipmentId();
        java.lang.String str58 = equipment54.getDescription();
        labManager3.markMaintenance(equipment54);
        model.LabManager labManager63 = new model.LabManager("User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='Guest'}", "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment67 = new model.Equipment("", "", "");
        java.lang.String str68 = equipment67.getDescription();
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        model.Reservation reservation72 = null;
        boolean boolean73 = equipment67.isModifyAvailable(localDateTime69, localDateTime70, "hi!", reservation72);
        java.lang.String str74 = equipment67.getEquipmentId();
        observer.EquipmentObserver equipmentObserver75 = null;
        equipment67.detach(equipmentObserver75);
        equipment67.notifyObservers();
        labManager63.addEquipment(equipment67);
        labManager3.setEquipmentStatus(equipment67, "User{userId=376801b9-2981-46c5-b75d-8d1f4444d53f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str81 = equipment67.getEquipmentId();
// flaky "60) test4374(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=dc04c41d-6d44-4a5c-a585-7712564ca982, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=dc04c41d-6d44-4a5c-a585-7712564ca982, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LM-CERT" + "'", str16, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4375");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getStatus();
        headLabCoordinator3.setPasswordHash("User{userId=a76b7946-3c9c-4dbd-9b87-4ababc28694b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4376");
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
        java.lang.String str85 = equipment78.getLabLocation();
        observer.EquipmentObserver equipmentObserver86 = null;
        equipment78.attach(equipmentObserver86);
        java.lang.String str88 = equipment78.getStatus();
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
// flaky "61) test4376(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID72.toString(), "6f5e8d5b-b43f-4c13-94a1-bfa72cb3a998");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Maintenance" + "'", str88, "Maintenance");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4377");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getRole();
        java.lang.String str8 = labManager5.getRole();
        labManager5.setEmail("User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LabManager" + "'", str8, "LabManager");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4378");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        model.Reservation reservation15 = null;
        boolean boolean16 = equipment10.isModifyAvailable(localDateTime12, localDateTime13, "hi!", reservation15);
        java.lang.String str17 = equipment10.getEquipmentId();
        equipment10.setStatus("");
        java.lang.String str20 = equipment10.getEquipmentId();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment10.isAvailable(localDateTime21, localDateTime22, "Researcher");
        java.lang.String str25 = equipment10.getStatus();
        equipment10.enable();
        labManager5.markMaintenance(equipment10);
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment10.attach(equipmentObserver28);
        // The following exception was thrown during execution in test generation
        try {
            equipment10.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4379");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        java.lang.String str10 = headLabCoordinator3.getPasswordHash();
        double double11 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4380");
        model.Equipment equipment3 = new model.Equipment("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=29752153-0a16-432b-8efc-f83056ede37e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4381");
        model.Researcher researcher3 = new model.Researcher("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4382");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=4e2bf97b-2231-43ed-b46f-ea04514eea46, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4383");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Student", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean4 = researcher3.isActive();
        double double5 = researcher3.getHourlyRate();
        researcher3.setPasswordHash("User{userId=090698b7-4713-4874-b7d9-bb772231c198, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = researcher3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4384");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        labManager6.setPasswordHash("User{userId=7b8dee7f-07c7-4251-8ad6-f865b94d4b4f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4385");
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
        java.util.UUID uUID31 = labManager5.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(uUID31);
// flaky "62) test4385(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID31.toString(), "9a76a78d-f6fb-4654-b6d0-06a6ee35849d");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4386");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("");
        java.lang.String str13 = equipment9.getEquipmentId();
        equipment9.setLabLocation("");
        java.lang.String str16 = equipment9.getLabLocation();
        equipment9.setStatus("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str19 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4387");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        java.lang.String str10 = researcher3.getStatus();
        java.lang.String str11 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4388");
        model.LabManager labManager3 = new model.LabManager("User{userId=4096a927-87e0-4962-9c7b-a4c2fb50539f, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=27ff32d8-72a9-419e-98bc-8d9a3011f9d5, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='Researcher'}");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4389");
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
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment13.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation30);
        model.SensorUpdate sensorUpdate32 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment13.applySensorUpdate(sensorUpdate32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4390");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        boolean boolean7 = headLabCoordinator3.isActive();
        headLabCoordinator3.setIdOrCertNumber("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double10 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4391");
        model.Student student3 = new model.Student("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}'}", "Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='Available'}");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4392");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "Guest");
        state.EquipmentState equipmentState19 = equipment9.getCurrentState();
        java.lang.String str20 = equipment9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Guest'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Guest'}");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4393");
        model.Equipment equipment3 = new model.Equipment("User{userId=3f12543e-d94e-482c-8700-3d1617c1ef1e, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "User{userId=b05d50e5-8921-4417-a2c5-cc348fda0850, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4394");
        model.Guest guest3 = new model.Guest("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean4 = guest3.isActive();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4395");
        model.LabManager labManager3 = new model.LabManager("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Student", "hi!");
        boolean boolean4 = labManager3.isActive();
        java.lang.String str5 = labManager3.getPasswordHash();
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.lang.String str16 = equipment15.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment15.isModifyAvailable(localDateTime17, localDateTime18, "hi!", reservation20);
        java.lang.String str22 = equipment15.getDescription();
        state.EquipmentState equipmentState23 = equipment15.getCurrentState();
        equipment15.setLabLocation("Student");
        labManager11.setEquipmentStatus(equipment15, "");
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager33.markMaintenance(equipment37);
        java.lang.String str39 = labManager33.getRole();
        java.lang.String str40 = labManager33.getRole();
        model.HeadLabCoordinator headLabCoordinator44 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager46 = headLabCoordinator44.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment50 = new model.Equipment("", "", "");
        labManager46.markMaintenance(equipment50);
        double double52 = labManager46.getHourlyRate();
        java.lang.String str53 = labManager46.getRole();
        double double54 = labManager46.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator58 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager60 = headLabCoordinator58.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment64 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment64.isModifyAvailable(localDateTime65, localDateTime66, "Faculty", reservation68);
        equipment64.setLabLocation("Faculty");
        labManager60.setEquipmentStatus(equipment64, "");
        equipment64.notifyObservers();
        labManager46.addEquipment(equipment64);
        labManager33.setEquipmentStatus(equipment64, "Guest");
        equipment64.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        state.EquipmentState equipmentState80 = equipment64.getCurrentState();
        equipment15.setState(equipmentState80);
        java.lang.String str82 = equipment15.getDescription();
        java.time.LocalDateTime localDateTime83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        model.Reservation reservation86 = null;
        boolean boolean87 = equipment15.isModifyAvailable(localDateTime83, localDateTime84, "User{userId=6f3c3700-9cf7-4c67-84ed-9a21ccf02f91, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation86);
        labManager3.setEquipmentStatus(equipment15, "User{userId=13e5128f-9d9b-4135-9b18-0b90648a4093, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "LabManager" + "'", str39, "LabManager");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LabManager" + "'", str53, "LabManager");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(labManager60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(equipmentState80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4396");
        model.Researcher researcher3 = new model.Researcher("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setActive(false);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4397");
        model.Researcher researcher3 = new model.Researcher("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Student", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.toString();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getRole();
        boolean boolean7 = researcher3.isActive();
// flaky "63) test4397(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=25df772f-0934-466e-a93d-e69ecc4529a5, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}" + "'", str4, "User{userId=25df772f-0934-466e-a93d-e69ecc4529a5, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4398");
        model.Equipment equipment3 = new model.Equipment("User{userId=632d47ed-f2ef-4350-9fb8-e586acf3669c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}", "User{userId=dfc52ea8-ef4f-4a59-8eb1-712fa3fe6d02, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4399");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        double double7 = guest3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID14 = null;
        headLabCoordinator11.setUserId(uUID14);
        model.LabManager labManager17 = headLabCoordinator11.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager19 = headLabCoordinator11.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager21 = headLabCoordinator11.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty25 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str26 = faculty25.getStatus();
        boolean boolean27 = faculty25.isActive();
        model.Faculty faculty31 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID32 = faculty31.getUserId();
        faculty25.setUserId(uUID32);
        labManager21.setUserId(uUID32);
        guest3.setUserId(uUID32);
        double double36 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ACTIVE" + "'", str26, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(uUID32);
// flaky "64) test4399(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID32.toString(), "b8aab92b-ea67-481b-ab77-cc3165b64b84");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 25.0d + "'", double36 == 25.0d);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4400");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        labManager10.setEmail("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager10.setActive(true);
        java.lang.String str16 = labManager10.getRole();
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
        java.lang.String str35 = equipment20.toString();
        equipment20.setDescription("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager10.setEquipmentStatus(equipment20, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "65) test4400(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=08bfea2f-ff4a-467e-8f45-0a3465249c17, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=08bfea2f-ff4a-467e-8f45-0a3465249c17, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str35, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4401");
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
        model.LabManager labManager21 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str22 = labManager21.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Temp123!" + "'", str22, "Temp123!");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4402");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        java.lang.String str16 = equipment13.toString();
        equipment13.notifyObservers();
        java.lang.String str18 = equipment13.getStatus();
        equipment13.setStatus("");
        equipment13.disable();
        equipment13.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4403");
        model.Researcher researcher3 = new model.Researcher("User{userId=55859998-7fb2-492b-af42-9cb87ba76d25, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4404");
        model.Student student3 = new model.Student("Equipment{equipmentId='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=40e37e2b-d3c1-449e-a17e-f6d320c89b84, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=74a98125-c99a-4fcf-8fbb-76ed851e235c, email='Researcher', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4405");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        labManager10.setEmail("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager10.setActive(true);
        java.lang.String str16 = labManager10.getRole();
        java.lang.String str17 = labManager10.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "66) test4405(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=913514b9-3273-4507-8a79-da8926ab3d59, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=913514b9-3273-4507-8a79-da8926ab3d59, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str17, "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4406");
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
        java.lang.String str33 = equipment15.getDescription();
        equipment15.notifyObservers();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4407");
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
        java.lang.String str22 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4408");
        model.Student student3 = new model.Student("User{userId=c84cff95-dacf-46bc-8719-06097ef1de9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=939a1235-014f-498a-be6b-747f2c3aa659, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4409");
        model.Student student3 = new model.Student("Researcher", "ACTIVE", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4410");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.getEquipmentId();
        java.lang.String str8 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4411");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=ec1cdb05-c503-42d6-9c44-e6a5310e091e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getEquipmentId();
        equipment3.setStatus("User{userId=64f60eb5-310c-477e-9c0e-3658a01ecc5b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4412");
        model.Student student3 = new model.Student("User{userId=90546085-616d-46b3-aa3c-51088dcdd1b9, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "User{userId=82fbcc46-91ee-4fc6-aaad-fe3c1e73ee2a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=e90bb683-822f-419c-8d33-7a74a7f19a20, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4413");
        model.Equipment equipment3 = new model.Equipment("User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        equipment3.setDescription("User{userId=ac16180e-c994-4226-96ba-7796ddfa0394, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime6, localDateTime7, "User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4414");
        model.Guest guest3 = new model.Guest("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c46fe03e-a249-4d38-9af9-d45a19ef82c4, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0f5bd3bf-c7f0-4231-908d-f716526a8951, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4415");
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
        java.lang.String str20 = equipment3.getLabLocation();
        equipment3.setStatus("User{userId=239ccd65-d159-47fa-88ed-c8f7e4af40e3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4416");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setPasswordHash("User{userId=bf52e736-2be8-4178-a794-276836acc82a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.Class<?> wildcardClass12 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4417");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "INACTIVE");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4418");
        model.Student student3 = new model.Student("HeadLabCoordinator", "hi!", "Guest");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4419");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getRole();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment9.isModifyAvailable(localDateTime11, localDateTime12, "hi!", reservation14);
        java.lang.String str16 = equipment9.getEquipmentId();
        equipment9.setStatus("");
        state.EquipmentState equipmentState19 = equipment9.getCurrentState();
        equipment9.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        labManager3.markMaintenance(equipment9);
        equipment9.setLabLocation("Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='Available'}', labLocation='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}', status='Available'}");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment9.isModifyAvailable(localDateTime25, localDateTime26, "User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", reservation28);
        equipment9.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4420");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=68d5639f-a3ac-4ba8-ad5b-a12ec5840871, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ee4c7ae0-0ce9-4925-acb7-814fab1467de, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}', status='Maintenance'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "67) test4420(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID4.toString(), "e3653e86-a9f3-460f-a9b5-7cfe4d99a421");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4421");
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
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "Guest", reservation16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation21);
        java.lang.String str23 = equipment3.getStatus();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Maintenance" + "'", str23, "Maintenance");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4422");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4423");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.lang.String str4 = headLabCoordinator3.getStatus();
        headLabCoordinator3.setActive(false);
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e5748df7-d43c-42b9-ac30-a8584ce44b12, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4424");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.toString();
        java.lang.String str10 = labManager8.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
// flaky "68) test4424(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=193d5c38-907a-4d81-a228-6961960af389, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str9, "User{userId=193d5c38-907a-4d81-a228-6961960af389, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4425");
        model.Guest guest3 = new model.Guest("Student", "Student", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str8 = faculty7.getStatus();
        boolean boolean9 = faculty7.isActive();
        java.lang.String str10 = faculty7.getRole();
        java.lang.String str11 = faculty7.getRole();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager23 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager25 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double26 = labManager25.getHourlyRate();
        model.Guest guest30 = new model.Guest("", "hi!", "hi!");
        java.lang.String str31 = guest30.getRole();
        double double32 = guest30.getHourlyRate();
        double double33 = guest30.getHourlyRate();
        java.lang.String str34 = guest30.getPasswordHash();
        guest30.setActive(false);
        java.lang.String str37 = guest30.getEmail();
        java.util.UUID uUID38 = guest30.getUserId();
        labManager25.setUserId(uUID38);
        faculty7.setUserId(uUID38);
        guest3.setUserId(uUID38);
        java.lang.String str42 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 25.0d + "'", double32 == 25.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 25.0d + "'", double33 == 25.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(uUID38);
// flaky "69) test4425(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID38.toString(), "438c0ceb-6aff-4c9d-87a4-f7eeccddeae0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Student" + "'", str42, "Student");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4426");
        model.Faculty faculty3 = new model.Faculty("User{userId=99a8ca33-e50f-4503-8911-c2770f4db9c4, email='', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Student'}", "User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5bccdc97-eca9-4150-a2a4-d885f4ec051f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4427");
        model.Guest guest3 = new model.Guest("User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c95a48ac-f685-4594-8490-b4cedb669014, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}'}");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4428");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        faculty3.setPasswordHash("User{userId=5080e319-ce49-4c55-9fb3-3dae58d6a9ac, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4429");
        model.Faculty faculty3 = new model.Faculty("User{userId=adce0ca0-d11b-438d-9dc0-cbb2ae94ebeb, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4430");
        model.Researcher researcher3 = new model.Researcher("", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        boolean boolean4 = researcher3.isActive();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double9 = headLabCoordinator8.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator8.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.util.UUID uUID12 = headLabCoordinator8.getUserId();
        researcher3.setUserId(uUID12);
        double double14 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(uUID12);
// flaky "70) test4430(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID12.toString(), "3be352cf-f70e-4920-be6a-1ab43b012ed3");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4431");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getEmail();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID13 = labManager12.getUserId();
        boolean boolean14 = labManager12.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(uUID13);
// flaky "71) test4431(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID13.toString(), "f6c979dc-9163-489d-9098-d9737ce191d0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4432");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5bccdc97-eca9-4150-a2a4-d885f4ec051f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4433");
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
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment14.isModifyAvailable(localDateTime25, localDateTime26, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", reservation28);
        observer.EquipmentObserver equipmentObserver30 = null;
        equipment14.attach(equipmentObserver30);
        equipment14.setLabLocation("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4434");
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
        java.lang.String str90 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime91 = null;
        java.time.LocalDateTime localDateTime92 = null;
        model.Reservation reservation94 = null;
        boolean boolean95 = equipment3.isModifyAvailable(localDateTime91, localDateTime92, "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation94);
        java.lang.String str96 = equipment3.getDescription();
        model.SensorUpdate sensorUpdate97 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate97);
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Available" + "'", str90, "Available");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4435");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4436");
        model.Student student3 = new model.Student("User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=37d200c1-afdf-4f16-92b6-99089b123c0e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=669916d8-19a8-4584-a86c-eeda55195398, email='User{userId=0f5bd3bf-c7f0-4231-908d-f716526a8951, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', status='INACTIVE', idOrCertNumber='', role='HeadLabCoordinator'}");
        student3.setIdOrCertNumber("User{userId=bf3b4982-9a8f-43e2-8897-1a88c06b4469, email='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4437");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=6bf97430-c88a-45ad-a746-fc83d9a228b9, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Researcher'}", "User{userId=403ed86a-c84c-43c1-994f-62f96b195ff7, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment7.isModifyAvailable(localDateTime8, localDateTime9, "Faculty", reservation11);
        equipment7.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment7.isModifyAvailable(localDateTime15, localDateTime16, "", reservation18);
        state.EquipmentState equipmentState20 = equipment7.getCurrentState();
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment7.detach(equipmentObserver21);
        equipment7.setDescription("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        equipment7.setLabLocation("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        labManager3.markMaintenance(equipment7);
        java.lang.String str28 = labManager3.getEmail();
        labManager3.setIdOrCertNumber("User{userId=3c339932-08ce-42f6-a2ef-8ced53d31437, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(equipmentState20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}" + "'", str28, "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4438");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}", "User{userId=03d04727-c0b8-41f6-8c22-90315f144551, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}" + "'", str4, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4439");
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
        model.Equipment equipment30 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.markMaintenance()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4440");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        equipment3.enable();
        model.SensorUpdate sensorUpdate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4441");
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
        java.lang.String str52 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ACTIVE" + "'", str52, "ACTIVE");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4442");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        double double10 = labManager9.getHourlyRate();
        model.Student student14 = new model.Student("", "hi!", "");
        double double15 = student14.getHourlyRate();
        java.lang.String str16 = student14.getStatus();
        student14.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.Guest guest22 = new model.Guest("", "hi!", "hi!");
        java.lang.String str23 = guest22.getRole();
        guest22.setEmail("Guest");
        double double26 = guest22.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID33 = null;
        headLabCoordinator30.setUserId(uUID33);
        model.LabManager labManager36 = headLabCoordinator30.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager38 = headLabCoordinator30.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager40 = headLabCoordinator30.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty44 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str45 = faculty44.getStatus();
        boolean boolean46 = faculty44.isActive();
        model.Faculty faculty50 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID51 = faculty50.getUserId();
        faculty44.setUserId(uUID51);
        labManager40.setUserId(uUID51);
        guest22.setUserId(uUID51);
        student14.setUserId(uUID51);
        java.lang.String str56 = student14.getIdOrCertNumber();
        model.Guest guest60 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID61 = guest60.getUserId();
        student14.setUserId(uUID61);
        labManager9.setUserId(uUID61);
        model.Equipment equipment64 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager9.addEquipment(equipment64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "INACTIVE" + "'", str16, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Guest" + "'", str23, "Guest");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 25.0d + "'", double26 == 25.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ACTIVE" + "'", str45, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(uUID51);
// flaky "72) test4442(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID51.toString(), "07fd6cc8-6c1e-4572-b5c6-acc81be1386a");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(uUID61);
// flaky "12) test4442(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID61.toString(), "6318b628-e240-4b5f-9a9b-ded6918baa40");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4443");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        faculty3.setPasswordHash("ACTIVE");
        faculty3.setActive(true);
        faculty3.setPasswordHash("User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4444");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = null;
        headLabCoordinator3.setUserId(uUID4);
        java.lang.String str6 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4445");
        model.Researcher researcher3 = new model.Researcher("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=c1f2e0ce-a6d8-4d0d-9256-477e11277a45, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3e27d8b8-e194-4de9-ab82-045aa14c9125, email='Faculty', status='ACTIVE', idOrCertNumber='Available', role='Researcher'}");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4446");
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
        java.lang.String str21 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment3.isAvailable(localDateTime22, localDateTime23, "User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str26 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment3.detach(equipmentObserver27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str21, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4447");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getPasswordHash();
        student3.setActive(false);
        java.lang.String str9 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4448");
        model.Researcher researcher3 = new model.Researcher("User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7f1b84d1-159a-4211-a3df-b6f9b1a96c0e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=9c6242e6-d1a8-4386-bfc3-731c4f64fc86, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4449");
        model.Equipment equipment3 = new model.Equipment("User{userId=ecc2e2ab-6898-4e8a-9782-e358bc6a80f6, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=294af086-17eb-46ec-ace5-868738e46f3d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4450");
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
        equipment3.notifyObservers();
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
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4451");
        model.Researcher researcher3 = new model.Researcher("User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4452");
        model.Guest guest3 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4453");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("Maintenance");
        labManager9.setPasswordHash("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Researcher researcher15 = new model.Researcher("Faculty", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID16 = researcher15.getUserId();
        labManager9.setUserId(uUID16);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(uUID16);
// flaky "73) test4453(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID16.toString(), "b11b4609-581e-42b1-85c4-db1f0e284393");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4454");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        faculty3.setPasswordHash("User{userId=fd275276-f91f-4453-a1ff-57db6d8071c7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4455");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4456");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "LM-CERT", "hi!");
        java.lang.String str4 = researcher3.getRole();
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4457");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        labManager17.setActive(false);
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment23.isModifyAvailable(localDateTime24, localDateTime25, "Faculty", reservation27);
        equipment23.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment23.isModifyAvailable(localDateTime31, localDateTime32, "", reservation34);
        labManager17.addEquipment(equipment23);
        labManager5.setEquipmentStatus(equipment23, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.lang.String str43 = equipment42.getDescription();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment42.isModifyAvailable(localDateTime44, localDateTime45, "hi!", reservation47);
        java.lang.String str49 = equipment42.getDescription();
        state.EquipmentState equipmentState50 = equipment42.getCurrentState();
        labManager5.addEquipment(equipment42);
        labManager5.setEmail("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment57.isModifyAvailable(localDateTime58, localDateTime59, "Faculty", reservation61);
        equipment57.setLabLocation("Faculty");
        java.lang.String str65 = equipment57.getDescription();
        java.lang.String str66 = equipment57.getEquipmentId();
        equipment57.notifyObservers();
        equipment57.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment57.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str72 = equipment57.getDescription();
        observer.EquipmentObserver equipmentObserver73 = null;
        equipment57.detach(equipmentObserver73);
        java.lang.String str75 = equipment57.getDescription();
        labManager5.addEquipment(equipment57);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str72, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str75, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4458");
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
        equipment13.enable();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment13.detach(equipmentObserver24);
        java.lang.String str26 = equipment13.getStatus();
        java.lang.String str27 = equipment13.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4459");
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
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment27.isModifyAvailable(localDateTime37, localDateTime38, "User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation40);
        java.lang.String str42 = equipment27.getLabLocation();
        equipment27.setLabLocation("User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4460");
        model.Faculty faculty3 = new model.Faculty("User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c4552bd2-e848-4b9d-a1e3-02c81ea5755f, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=12314481-f96e-4666-8de9-0288b82ecee3, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4461");
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
        java.lang.String str63 = equipment56.getDescription();
        equipment56.setDescription("User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4462");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setActive(false);
        double double8 = labManager5.getHourlyRate();
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
        java.lang.String str33 = labManager14.getRole();
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.lang.String str38 = equipment37.getDescription();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment37.isModifyAvailable(localDateTime39, localDateTime40, "hi!", reservation42);
        java.lang.String str44 = equipment37.getEquipmentId();
        equipment37.setStatus("");
        state.EquipmentState equipmentState47 = equipment37.getCurrentState();
        equipment37.markMaintenance();
        labManager14.setEquipmentStatus(equipment37, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment54 = new model.Equipment("", "", "");
        java.lang.String str55 = equipment54.getDescription();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        model.Reservation reservation59 = null;
        boolean boolean60 = equipment54.isModifyAvailable(localDateTime56, localDateTime57, "hi!", reservation59);
        java.lang.String str61 = equipment54.getDescription();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        boolean boolean65 = equipment54.isAvailable(localDateTime62, localDateTime63, "Faculty");
        model.Equipment equipment69 = new model.Equipment("", "", "");
        java.lang.String str70 = equipment69.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment69.isModifyAvailable(localDateTime71, localDateTime72, "hi!", reservation74);
        java.lang.String str76 = equipment69.getDescription();
        state.EquipmentState equipmentState77 = equipment69.getCurrentState();
        equipment54.setState(equipmentState77);
        equipment37.setState(equipmentState77);
        equipment37.notifyObservers();
        equipment37.disable();
        labManager5.markMaintenance(equipment37);
        state.EquipmentState equipmentState83 = equipment37.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "LabManager" + "'", str33, "LabManager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(equipmentState47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(equipmentState77);
        org.junit.Assert.assertNotNull(equipmentState83);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4463");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = labManager5.getPasswordHash();
        model.Equipment equipment10 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str11 = equipment10.getLabLocation();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment10.detach(equipmentObserver12);
        equipment10.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str16 = equipment10.getLabLocation();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment10.attach(equipmentObserver17);
        equipment10.setDescription("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment10.isAvailable(localDateTime21, localDateTime22, "LM-CERT");
        labManager5.setEquipmentStatus(equipment10, "User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Temp123!" + "'", str6, "Temp123!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4464");
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
        equipment3.setLabLocation("Equipment{equipmentId='', description='', labLocation='Faculty', status='Student'}");
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
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4465");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        java.lang.String str6 = faculty3.getRole();
        faculty3.setEmail("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4466");
        model.Student student3 = new model.Student("User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Guest", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4467");
        model.Researcher researcher3 = new model.Researcher("User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4468");
        model.Researcher researcher3 = new model.Researcher("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=50c8e534-0cef-4e1f-8015-4eb5b8d5dfed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4469");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        java.lang.String str10 = equipment3.toString();
        equipment3.setStatus("User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment3.detach(equipmentObserver14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4470");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = equipment3.getDescription();
        java.lang.String str11 = equipment3.toString();
        equipment3.setDescription("User{userId=d0549d53-a938-4323-a796-a5a121fa8811, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str11, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4471");
        model.Faculty faculty3 = new model.Faculty("", "User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=184e30c2-a69c-4f1f-9887-026cbd4ed4bb, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4472");
        model.Faculty faculty3 = new model.Faculty("User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4473");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setEmail("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        double double12 = guest3.getHourlyRate();
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4474");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getPasswordHash();
        java.lang.String str12 = researcher3.getPasswordHash();
        researcher3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "74) test4474(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID7.toString(), "45a05600-4590-44d4-9172-1b48711ff084");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4475");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        researcher3.setActive(false);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4476");
        model.Equipment equipment3 = new model.Equipment("User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4477");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        labManager5.setEquipmentStatus(equipment9, "");
        labManager5.setEmail("User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4478");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        equipment3.setLabLocation("Student");
        equipment3.notifyObservers();
        java.lang.String str15 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4479");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        model.Equipment equipment16 = new model.Equipment("", "", "");
        java.lang.String str17 = equipment16.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment16.isModifyAvailable(localDateTime18, localDateTime19, "hi!", reservation21);
        equipment16.disable();
        equipment16.enable();
        state.EquipmentState equipmentState25 = equipment16.getCurrentState();
        equipment3.setState(equipmentState25);
        java.lang.String str27 = equipment3.toString();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(equipmentState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4480");
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
        java.lang.String str27 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment3.detach(equipmentObserver28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4481");
        model.Equipment equipment3 = new model.Equipment("User{userId=f314487c-0f1d-4db6-bc8d-61154327bc96, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c6cccca0-8adc-406b-a117-45bcf62acaa3, email='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}", "User{userId=82fbcc46-91ee-4fc6-aaad-fe3c1e73ee2a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4482");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        student3.setIdOrCertNumber("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.util.UUID uUID7 = student3.getUserId();
        java.lang.String str8 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str6, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "75) test4482(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID7.toString(), "3a9d6bdf-b8f1-4f66-a353-17a4deaf5785");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4483");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getStatus();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4484");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager33 = headLabCoordinator29.autoGenerateManagerAccount("Available");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.lang.String str38 = equipment37.getDescription();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment37.isModifyAvailable(localDateTime39, localDateTime40, "hi!", reservation42);
        java.lang.String str44 = equipment37.getDescription();
        state.EquipmentState equipmentState45 = equipment37.getCurrentState();
        equipment37.setLabLocation("Student");
        equipment37.notifyObservers();
        labManager33.addEquipment(equipment37);
        equipment37.notifyObservers();
        labManager9.markMaintenance(equipment37);
        equipment37.markMaintenance();
        java.lang.String str53 = equipment37.getLabLocation();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment37.isAvailable(localDateTime54, localDateTime55, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(equipmentState45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Student" + "'", str53, "Student");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4485");
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
        labManager5.setEmail("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment49.isModifyAvailable(localDateTime50, localDateTime51, "Faculty", reservation53);
        equipment49.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment49.isModifyAvailable(localDateTime57, localDateTime58, "", reservation60);
        java.lang.String str62 = equipment49.getLabLocation();
        labManager5.setEquipmentStatus(equipment49, "User{userId=ec8c63f1-3ca5-46e7-9144-3f7a90a5c572, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Faculty" + "'", str62, "Faculty");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4486");
        model.Guest guest3 = new model.Guest("Guest", "", "Researcher");
        double double4 = guest3.getHourlyRate();
        java.util.UUID uUID5 = guest3.getUserId();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertNotNull(uUID5);
// flaky "76) test4486(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID5.toString(), "1abe57e1-7c23-4d8c-8c01-42124057d50f");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4487");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getIdOrCertNumber();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4488");
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
        java.lang.String str67 = labManager5.getStatus();
        model.Equipment equipment68 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager5.addEquipment(equipment68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ACTIVE" + "'", str67, "ACTIVE");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4489");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "INACTIVE");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4490");
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
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.lang.String str19 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "hi!", reservation23);
        java.lang.String str25 = equipment18.getDescription();
        state.EquipmentState equipmentState26 = equipment18.getCurrentState();
        equipment3.setState(equipmentState26);
        java.lang.String str28 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean32 = equipment3.isAvailable(localDateTime29, localDateTime30, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment3.detach(equipmentObserver33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment3.isModifyAvailable(localDateTime35, localDateTime36, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation38);
        java.lang.String str40 = equipment3.getEquipmentId();
        model.SensorUpdate sensorUpdate41 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4491");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}", "User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}");
        java.lang.String str4 = student3.toString();
// flaky "77) test4491(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=b8820fe4-4beb-4ec4-8510-73fc1f827dd1, email='Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', role='Student'}" + "'", str4, "User{userId=b8820fe4-4beb-4ec4-8510-73fc1f827dd1, email='Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', role='Student'}");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4492");
        model.Student student3 = new model.Student("User{userId=7cd6aa2f-88ba-4a33-8e98-0bd97f07a228, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=9f4644ed-2d37-4a6b-9fd1-0563c3568bcf, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=bf52e736-2be8-4178-a794-276836acc82a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4493");
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
        equipment3.setStatus("");
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4494");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.attach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4495");
        model.LabManager labManager3 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.Equipment equipment7 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str8 = equipment7.getEquipmentId();
        java.lang.String str9 = equipment7.getEquipmentId();
        equipment7.enable();
        labManager3.addEquipment(equipment7);
        model.Equipment equipment15 = new model.Equipment("User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.markMaintenance(equipment15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4496");
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
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean24 = labManager23.isActive();
        double double25 = labManager23.getHourlyRate();
        double double26 = labManager23.getHourlyRate();
        java.lang.String str27 = labManager23.getIdOrCertNumber();
        java.lang.String str28 = labManager23.getRole();
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.lang.String str33 = equipment32.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment32.isModifyAvailable(localDateTime34, localDateTime35, "hi!", reservation37);
        equipment32.disable();
        equipment32.enable();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean44 = equipment32.isAvailable(localDateTime41, localDateTime42, "");
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
        equipment32.setState(equipmentState69);
        labManager23.setEquipmentStatus(equipment32, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        labManager9.setEquipmentStatus(equipment32, "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment32.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "78) test4496(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID15.toString(), "645a9cf9-1800-407b-b218-37a32c688bf1");
// flaky "13) test4496(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=645a9cf9-1800-407b-b218-37a32c688bf1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=645a9cf9-1800-407b-b218-37a32c688bf1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LabManager" + "'", str28, "LabManager");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(equipmentState69);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4497");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=08612780-e04d-442c-968e-9604fd961966, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        labManager9.addEquipment(equipment13);
        equipment13.setLabLocation("hi!");
        labManager3.addEquipment(equipment13);
        java.lang.String str18 = equipment13.getDescription();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4498");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "LM-CERT", "hi!");
        model.Guest guest7 = new model.Guest("", "hi!", "hi!");
        java.lang.String str8 = guest7.getRole();
        double double9 = guest7.getHourlyRate();
        java.util.UUID uUID10 = guest7.getUserId();
        researcher3.setUserId(uUID10);
        java.lang.String str12 = researcher3.getRole();
        double double13 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "79) test4498(randoop.RandoopRegressionTest8)":         org.junit.Assert.assertEquals(uUID10.toString(), "b5f73cfe-18e9-4847-a302-fd88a651690a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4499");
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
        java.lang.String str60 = equipment36.getLabLocation();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str60, "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4500");
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
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=251d8690-b3fc-4d86-b2b4-64e468b4dbfc, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation16);
        equipment3.setStatus("User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID26 = null;
        headLabCoordinator23.setUserId(uUID26);
        model.LabManager labManager29 = headLabCoordinator23.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        equipment33.enable();
        labManager29.addEquipment(equipment33);
        model.Equipment equipment39 = new model.Equipment("", "", "");
        java.lang.String str40 = equipment39.getDescription();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment39.isModifyAvailable(localDateTime41, localDateTime42, "hi!", reservation44);
        java.lang.String str46 = equipment39.getDescription();
        state.EquipmentState equipmentState47 = equipment39.getCurrentState();
        equipment39.setLabLocation("Student");
        labManager29.setEquipmentStatus(equipment39, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment55 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        model.Reservation reservation59 = null;
        boolean boolean60 = equipment55.isModifyAvailable(localDateTime56, localDateTime57, "Faculty", reservation59);
        equipment55.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment55.isModifyAvailable(localDateTime63, localDateTime64, "", reservation66);
        equipment55.disable();
        labManager29.addEquipment(equipment55);
        equipment55.markMaintenance();
        equipment55.enable();
        state.EquipmentState equipmentState72 = equipment55.getCurrentState();
        state.EquipmentState equipmentState73 = equipment55.getCurrentState();
        equipment3.setState(equipmentState73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(equipmentState47);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(equipmentState72);
        org.junit.Assert.assertNotNull(equipmentState73);
    }
}
