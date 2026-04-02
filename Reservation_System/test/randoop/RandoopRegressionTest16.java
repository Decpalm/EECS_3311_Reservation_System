package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest16 {

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
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8001");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=294af086-17eb-46ec-ace5-868738e46f3d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = labManager3.getStatus();
        java.util.UUID uUID5 = labManager3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "1) test8001(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID5.toString(), "d0396fbb-0f3c-4e76-9543-9965a1a3174a");
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8002");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment3.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Available" + "'", str20, "Available");
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8003");
        model.Researcher researcher3 = new model.Researcher("User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = researcher3.getRole();
        boolean boolean5 = researcher3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8004");
        model.Researcher researcher3 = new model.Researcher("LM-CERT", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Disabled");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8005");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=dcf86005-6932-4733-be5c-0434fc186c69, email='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8006");
        model.Faculty faculty3 = new model.Faculty("User{userId=e84447d0-7ce1-40a8-bab6-99ad0a0e832d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d19485e7-e031-4dc0-9b4d-a192bbdf55a6, email='Faculty', status='ACTIVE', idOrCertNumber='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8007");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "2) test8007(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=5b996504-89ba-4115-96ba-c0afee20f214, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=5b996504-89ba-4115-96ba-c0afee20f214, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8008");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8009");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = headLabCoordinator3.getRole();
        double double10 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID11 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "3) test8009(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "e4261bd8-a251-4b8b-9849-29d648a43a84");
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8010");
        model.Guest guest3 = new model.Guest("User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=82d5dbc4-958e-431a-8795-06bee0cbdfa3, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        java.util.UUID uUID4 = guest3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "4) test8010(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "a88b7aad-df7d-4b94-a560-92b322927e25");
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8011");
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
        equipment3.setLabLocation("User{userId=8fc4ab73-f64b-474e-b994-1cad3c37775a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState21);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8012");
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
        java.lang.String str15 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Student', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8013");
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
        java.lang.String str42 = labManager5.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator46 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double47 = headLabCoordinator46.getHourlyRate();
        model.LabManager labManager49 = headLabCoordinator46.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator53 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager55 = headLabCoordinator53.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment59 = new model.Equipment("", "", "");
        labManager55.addEquipment(equipment59);
        java.lang.String str61 = labManager55.getRole();
        java.lang.String str62 = labManager55.getStatus();
        java.util.UUID uUID63 = labManager55.getUserId();
        labManager49.setUserId(uUID63);
        labManager5.setUserId(uUID63);
        labManager5.setActive(false);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LM-CERT" + "'", str42, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "LabManager" + "'", str61, "LabManager");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ACTIVE" + "'", str62, "ACTIVE");
        org.junit.Assert.assertNotNull(uUID63);
// flaky "5) test8013(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID63.toString(), "404985b1-d5fe-4b82-9db3-fe2dc6c957de");
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8014");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8015");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        student3.setIdOrCertNumber("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8016");
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
        java.lang.String str32 = equipment25.getEquipmentId();
        equipment25.setLabLocation("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.lang.String str35 = equipment25.getStatus();
        equipment25.setStatus("User{userId=c28b0f3a-aa6e-4112-a3e9-98d56c4ce4af, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ACTIVE" + "'", str32, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str35, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8017");
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
        equipment13.setLabLocation("User{userId=e6619bcc-60c9-4e1c-ad88-aa1b2934fea7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment13.notifyObservers();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8018");
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
        java.lang.String str64 = labManager5.getPasswordHash();
        double double65 = labManager5.getHourlyRate();
        java.lang.String str66 = labManager5.getPasswordHash();
        java.lang.String str67 = labManager5.toString();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Temp123!" + "'", str64, "Temp123!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Temp123!" + "'", str66, "Temp123!");
// flaky "6) test8018(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "User{userId=3c10c4d5-f325-45b2-93fa-01e8fdb38bdd, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str67, "User{userId=3c10c4d5-f325-45b2-93fa-01e8fdb38bdd, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8019");
        model.Researcher researcher3 = new model.Researcher("User{userId=a74c49b8-a5f0-457d-85b2-eb1dddb43fd1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a439f2ca-eba6-4ac1-8170-cc60ce20f2f1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8020");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("User{userId=a693b3e2-b7b8-430b-b807-e312f84458bf, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='INACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str8 = labManager5.getPasswordHash();
        java.lang.String str9 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=a693b3e2-b7b8-430b-b807-e312f84458bf, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='INACTIVE', role='HeadLabCoordinator'}" + "'", str8, "User{userId=a693b3e2-b7b8-430b-b807-e312f84458bf, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='INACTIVE', role='HeadLabCoordinator'}");
// flaky "7) test8020(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=02609768-9b3a-40eb-a58d-80d7be3c3e11, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str9, "User{userId=02609768-9b3a-40eb-a58d-80d7be3c3e11, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8021");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.getEmail();
        java.lang.String str7 = headLabCoordinator3.getRole();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double10 = labManager9.getHourlyRate();
        double double11 = labManager9.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8022");
        model.Guest guest3 = new model.Guest("", "User{userId=47645e5a-27f2-4a0e-8f64-16e02a77f5e4, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8023");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        double double7 = labManager6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8024");
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
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.attach(equipmentObserver21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState19);
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8025");
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
        java.lang.String str34 = equipment19.getDescription();
        state.EquipmentState equipmentState35 = equipment19.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(equipmentState35);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8026");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Temp123!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8027");
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
        equipment3.setStatus("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.lang.String str25 = equipment3.getLabLocation();
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        labManager31.markMaintenance(equipment35);
        double double37 = labManager31.getHourlyRate();
        java.lang.String str38 = labManager31.getRole();
        model.HeadLabCoordinator headLabCoordinator42 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager44 = headLabCoordinator42.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager44.setActive(true);
        model.HeadLabCoordinator headLabCoordinator50 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager52 = headLabCoordinator50.autoGenerateManagerAccount("Guest");
        model.Equipment equipment56 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager52.markMaintenance(equipment56);
        labManager44.setEquipmentStatus(equipment56, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager31.setEquipmentStatus(equipment56, "User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str62 = equipment56.getDescription();
        equipment56.setStatus("Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}");
        java.lang.String str65 = equipment56.getStatus();
        state.EquipmentState equipmentState66 = equipment56.getCurrentState();
        equipment3.setState(equipmentState66);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LabManager" + "'", str38, "LabManager");
        org.junit.Assert.assertNotNull(labManager44);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}" + "'", str65, "Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState66);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8028");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=b86bd081-7817-42d6-bc17-2d0a15ac6d1d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=71d0856a-da40-4437-a41e-17f61a3a6069, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=452c93a8-2c4b-4a20-b0c8-51949537a949, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8029");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = headLabCoordinator3.toString();
        double double15 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager17 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3583d5fa-af62-4b4c-8323-53583710d891, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str14, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8030");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1d3df56c-d05a-465d-9f54-8ddc36d67bbb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3ea24dc7-f640-44c6-99b2-10e76d3f61dc, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str6 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8031");
        model.Student student3 = new model.Student("User{userId=e90bb683-822f-419c-8d33-7a74a7f19a20, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6e8079dd-4e40-4d49-8a26-b776ee03c912, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setIdOrCertNumber("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8032");
        model.LabManager labManager3 = new model.LabManager("User{userId=68c26747-48df-4a23-8617-4275a1018532, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=203c9f50-3d84-4386-95b1-bcf0179abfb1, email='User{userId=e2f7f034-e1a9-45dc-9009-b560dc4e017d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=123c5586-5011-4a61-a2cd-4690544c999e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}", "User{userId=fbe6996f-a623-4523-a279-3ceca61a37d7, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID10 = null;
        headLabCoordinator7.setUserId(uUID10);
        model.LabManager labManager13 = headLabCoordinator7.autoGenerateManagerAccount("ACTIVE");
        labManager13.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager21.setActive(true);
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment33.isModifyAvailable(localDateTime34, localDateTime35, "Faculty", reservation37);
        equipment33.setLabLocation("Faculty");
        labManager29.setEquipmentStatus(equipment33, "");
        java.lang.String str43 = equipment33.toString();
        java.lang.String str44 = equipment33.getDescription();
        labManager21.addEquipment(equipment33);
        model.Equipment equipment49 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "ACTIVE");
        labManager21.markMaintenance(equipment49);
        labManager13.addEquipment(equipment49);
        equipment49.disable();
        labManager3.markMaintenance(equipment49);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str43, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8033");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        state.EquipmentState equipmentState10 = equipment3.getCurrentState();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean14 = equipment3.isAvailable(localDateTime11, localDateTime12, "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.markMaintenance();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8034");
        model.Faculty faculty3 = new model.Faculty("User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8035");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.util.UUID uUID11 = labManager5.getUserId();
        labManager5.setActive(true);
        java.lang.String str14 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "8) test8035(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "76956d0f-ad7d-4e06-a771-602313f1064c");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8036");
        model.LabManager labManager3 = new model.LabManager("User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=85261967-4352-4a6b-ad73-5ad4eccae10c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setPasswordHash("User{userId=321af3c9-2c62-49f9-9643-94cb3f73b88e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8037");
        model.Student student3 = new model.Student("User{userId=736a7578-ab25-431d-a585-d8ac1ca95220, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        student3.setIdOrCertNumber("User{userId=14470214-b69a-44b9-aaf4-91c433da6980, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8038");
        model.LabManager labManager3 = new model.LabManager("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Maintenance", "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        labManager9.setEquipmentStatus(equipment13, "");
        java.lang.String str23 = equipment13.toString();
        equipment13.setDescription("User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.addEquipment(equipment13);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8039");
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
        labManager9.setIdOrCertNumber("User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        double double36 = labManager9.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8040");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8041");
        model.Faculty faculty3 = new model.Faculty("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8042");
        model.LabManager labManager3 = new model.LabManager("User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0d10178f-8166-4a46-b163-5e508226be00, email='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}", "User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8043");
        model.Student student3 = new model.Student("User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Researcher");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8044");
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
        equipment35.disable();
        equipment35.notifyObservers();
        equipment35.setLabLocation("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment35.markMaintenance();
        java.lang.String str55 = equipment35.getStatus();
        equipment35.notifyObservers();
        java.lang.String str57 = equipment35.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Maintenance" + "'", str55, "Maintenance");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str57, "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8045");
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
        double double36 = labManager5.getHourlyRate();
        java.lang.String str37 = labManager5.getRole();
        model.Equipment equipment41 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment41.isAvailable(localDateTime43, localDateTime44, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        equipment41.notifyObservers();
        labManager5.markMaintenance(equipment41);
        java.lang.String str49 = equipment41.toString();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        boolean boolean53 = equipment41.isAvailable(localDateTime50, localDateTime51, "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str42, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Maintenance'}" + "'", str49, "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Maintenance'}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8046");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime5, localDateTime6, "User{userId=02656e59-cbad-4485-95e9-8ddbf900f03d, email='User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8047");
        model.User user0 = null;
        model.HeadLabCoordinator headLabCoordinator4 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager6 = headLabCoordinator4.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment10 = new model.Equipment("", "", "");
        labManager6.markMaintenance(equipment10);
        java.lang.String str12 = labManager6.getRole();
        labManager6.setPasswordHash("Guest");
        java.lang.String str15 = labManager6.getRole();
        model.Equipment equipment19 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager6.markMaintenance(equipment19);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", reservation24);
        java.lang.String str26 = equipment19.getDescription();
        equipment19.enable();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        strategy.PricingStrategy pricingStrategy30 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation31 = new model.Reservation(user0, equipment19, localDateTime28, localDateTime29, pricingStrategy30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str26, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8048");
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
        state.EquipmentState equipmentState81 = equipment70.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "9) test8048(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=b15ad4f7-ed50-46b9-a388-077b1a8fb760, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str16, "User{userId=b15ad4f7-ed50-46b9-a388-077b1a8fb760, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LM-CERT" + "'", str32, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(equipmentState81);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8049");
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
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment19.isAvailable(localDateTime26, localDateTime27, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment19.disable();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        model.Reservation reservation34 = null;
        boolean boolean35 = equipment19.isModifyAvailable(localDateTime31, localDateTime32, "User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", reservation34);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8050");
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
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        labManager42.markMaintenance(equipment46);
        java.lang.String str48 = labManager42.getRole();
        java.lang.String str49 = labManager42.getRole();
        model.HeadLabCoordinator headLabCoordinator53 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager55 = headLabCoordinator53.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment59 = new model.Equipment("", "", "");
        labManager55.markMaintenance(equipment59);
        double double61 = labManager55.getHourlyRate();
        java.lang.String str62 = labManager55.getRole();
        double double63 = labManager55.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator67 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager69 = headLabCoordinator67.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment73 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment73.isModifyAvailable(localDateTime74, localDateTime75, "Faculty", reservation77);
        equipment73.setLabLocation("Faculty");
        labManager69.setEquipmentStatus(equipment73, "");
        equipment73.notifyObservers();
        labManager55.addEquipment(equipment73);
        labManager42.setEquipmentStatus(equipment73, "Guest");
        equipment73.notifyObservers();
        labManager5.setEquipmentStatus(equipment73, "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str90 = labManager5.getRole();
        labManager5.setActive(false);
        java.lang.String str93 = labManager5.getRole();
        java.lang.String str94 = labManager5.getRole();
        java.lang.String str95 = labManager5.getEmail();
        java.lang.String str96 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "10) test8050(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID19.toString(), "e55b81f2-3020-4bcf-b26d-296efaf49b8d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LabManager" + "'", str48, "LabManager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LabManager" + "'", str49, "LabManager");
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "LabManager" + "'", str62, "LabManager");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(labManager69);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "LabManager" + "'", str90, "LabManager");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "LabManager" + "'", str93, "LabManager");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "LabManager" + "'", str94, "LabManager");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Faculty" + "'", str95, "Faculty");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "LabManager" + "'", str96, "LabManager");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8051");
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
        java.lang.String str21 = equipment3.toString();
        java.lang.String str22 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment3.attach(equipmentObserver23);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean28 = equipment3.isAvailable(localDateTime25, localDateTime26, "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.Class<?> wildcardClass29 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str21, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str22, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8052");
        model.LabManager labManager3 = new model.LabManager("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment7.isModifyAvailable(localDateTime8, localDateTime9, "Faculty", reservation11);
        equipment7.setLabLocation("Faculty");
        java.lang.String str15 = equipment7.getDescription();
        java.lang.String str16 = equipment7.getEquipmentId();
        equipment7.notifyObservers();
        equipment7.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment7.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str22 = equipment7.getDescription();
        equipment7.setLabLocation("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        labManager3.addEquipment(equipment7);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment7.isAvailable(localDateTime26, localDateTime27, "User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.SensorUpdate sensorUpdate30 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment7.applySensorUpdate(sensorUpdate30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str22, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8053");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getRole();
        model.Equipment equipment11 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment11.notifyObservers();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment11.attach(equipmentObserver13);
        java.lang.String str15 = equipment11.getDescription();
        java.lang.String str16 = equipment11.getDescription();
        java.lang.String str17 = equipment11.toString();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = equipment11.isAvailable(localDateTime18, localDateTime19, "User{userId=e025cb51-9f6f-4f13-9211-1043655106d5, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        strategy.PricingStrategy pricingStrategy24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation25 = new model.Reservation((model.User) faculty3, equipment11, localDateTime22, localDateTime23, pricingStrategy24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str15, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str16, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment{equipmentId='LM-CERT', description='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Temp123!', status='Available'}" + "'", str17, "Equipment{equipmentId='LM-CERT', description='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Temp123!', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8054");
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
        double double71 = labManager5.getHourlyRate();
        labManager5.setIdOrCertNumber("Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}");
        double double74 = labManager5.getHourlyRate();
        java.util.UUID uUID75 = labManager5.getUserId();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(uUID75);
// flaky "11) test8054(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID75.toString(), "02a32ff8-8dc9-485b-b29c-17754c051631");
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8055");
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
        equipment3.setLabLocation("User{userId=6448ab71-112f-4381-907f-49e52948358f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8056");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager11.setActive(true);
        double double14 = labManager11.getHourlyRate();
        java.lang.String str15 = labManager11.toString();
        java.lang.String str16 = labManager11.getStatus();
        java.lang.String str17 = labManager11.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "12) test8056(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=2b01c1d4-63a2-4e36-8438-ae26d0255641, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str15, "User{userId=2b01c1d4-63a2-4e36-8438-ae26d0255641, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
// flaky "1) test8056(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=2b01c1d4-63a2-4e36-8438-ae26d0255641, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=2b01c1d4-63a2-4e36-8438-ae26d0255641, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8057");
        model.Guest guest3 = new model.Guest("User{userId=5c6b49c8-7e30-4e44-910f-1f9fa746c115, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=150dca6f-8210-45c8-b018-a916b1419a4d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8058");
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
        java.lang.String str50 = equipment35.toString();
        model.SensorUpdate sensorUpdate51 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment35.applySensorUpdate(sensorUpdate51);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}" + "'", str50, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8059");
        model.Researcher researcher3 = new model.Researcher("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        researcher3.setPasswordHash("");
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8060");
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
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        equipment19.disable();
        equipment19.enable();
        java.lang.String str28 = equipment19.getLabLocation();
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.lang.String str33 = equipment32.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment32.isModifyAvailable(localDateTime34, localDateTime35, "hi!", reservation37);
        equipment32.disable();
        java.lang.String str40 = equipment32.getEquipmentId();
        equipment32.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment32.isAvailable(localDateTime43, localDateTime44, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState47 = equipment32.getCurrentState();
        equipment19.setState(equipmentState47);
        equipment3.setState(equipmentState47);
        java.lang.String str50 = equipment3.getStatus();
        java.lang.String str51 = equipment3.getEquipmentId();
        model.SensorUpdate sensorUpdate52 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(equipmentState47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Disabled" + "'", str50, "Disabled");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8061");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setEmail("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str12 = guest3.getStatus();
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8062");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment9.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str30, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8063");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("");
        java.lang.String str13 = equipment9.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment9.isModifyAvailable(localDateTime14, localDateTime15, "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation17);
        java.lang.String str19 = equipment9.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Available" + "'", str19, "Available");
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8064");
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
        model.Equipment equipment17 = new model.Equipment("", "", "");
        java.lang.String str18 = equipment17.getDescription();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment17.isModifyAvailable(localDateTime19, localDateTime20, "hi!", reservation22);
        java.lang.String str24 = equipment17.getEquipmentId();
        equipment17.setStatus("");
        equipment17.enable();
        equipment17.setDescription("User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment17.setStatus("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        labManager13.setEquipmentStatus(equipment17, "User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        java.lang.String str45 = equipment37.getEquipmentId();
        java.lang.String str46 = equipment37.getStatus();
        equipment37.setLabLocation("User{userId=5edfd4cf-e8e1-4a5c-95db-29c5e3314281, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
        labManager13.addEquipment(equipment37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Available" + "'", str46, "Available");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8065");
        model.LabManager labManager3 = new model.LabManager("User{userId=cc7becac-dd11-42a8-91aa-1c1835065fae, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status=''}", "User{userId=e0596f65-c89d-4937-9191-d215414f5a8e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8066");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        java.lang.String str21 = equipment13.getDescription();
        java.lang.String str22 = equipment13.getEquipmentId();
        java.lang.String str23 = equipment13.getDescription();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment13.detach(equipmentObserver24);
        java.lang.String str26 = equipment13.getLabLocation();
        equipment13.setDescription("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment13.setDescription("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.addEquipment(equipment13);
        model.Equipment equipment35 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}", "LabManager", "User{userId=c709a753-175d-4244-a4d1-809d72ae7cc0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment35.setStatus("User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager9.setEquipmentStatus(equipment35, "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment35.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8067");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        labManager8.setEquipmentStatus(equipment18, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment18.setStatus("User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment27 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str28 = equipment27.getLabLocation();
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment27.detach(equipmentObserver29);
        equipment27.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str33 = equipment27.getLabLocation();
        equipment27.enable();
        state.EquipmentState equipmentState35 = equipment27.getCurrentState();
        state.EquipmentState equipmentState36 = equipment27.getCurrentState();
        equipment18.setState(equipmentState36);
        java.lang.String str38 = equipment18.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(equipmentState35);
        org.junit.Assert.assertNotNull(equipmentState36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Available" + "'", str38, "Available");
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8068");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID12 = null;
        headLabCoordinator9.setUserId(uUID12);
        model.LabManager labManager15 = headLabCoordinator9.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        equipment19.enable();
        labManager15.addEquipment(equipment19);
        equipment19.disable();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment19.detach(equipmentObserver23);
        equipment19.enable();
        equipment19.markMaintenance();
        labManager5.addEquipment(equipment19);
        java.lang.String str28 = equipment19.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8069");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        java.lang.String str9 = guest3.getRole();
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        java.lang.String str21 = equipment13.getDescription();
        java.lang.String str22 = equipment13.getEquipmentId();
        equipment13.notifyObservers();
        state.EquipmentState equipmentState24 = equipment13.getCurrentState();
        equipment13.setLabLocation("User{userId=24fef356-e371-4e89-9d24-1ebb8462b5b5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        strategy.PricingStrategy pricingStrategy29 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation30 = new model.Reservation((model.User) guest3, equipment13, localDateTime27, localDateTime28, pricingStrategy29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8070");
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
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        java.lang.String str21 = equipment3.toString();
        equipment3.markMaintenance();
        state.EquipmentState equipmentState23 = equipment3.getCurrentState();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(equipmentState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8071");
        model.Guest guest3 = new model.Guest("Guest", "Available", "Student");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        java.lang.String str7 = guest3.getRole();
        guest3.setIdOrCertNumber("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8072");
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
        state.EquipmentState equipmentState23 = equipment3.getCurrentState();
        equipment3.setStatus("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        equipment3.setLabLocation("User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState28 = equipment3.getCurrentState();
        java.lang.String str29 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}'}" + "'", str29, "Equipment{equipmentId='', description='', labLocation='User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}'}");
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8073");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double13 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8074");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        java.lang.String str11 = equipment9.getEquipmentId();
        equipment9.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8075");
        model.Faculty faculty3 = new model.Faculty("User{userId=7b0716eb-4fd0-4689-a9a3-203b542115c0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Faculty', status='Available'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8076");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Disabled", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("User{userId=013c1752-e417-49a0-809c-87122bf6dfd2, email='User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8077");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d473dca8-1d6b-4ed6-bea4-83139eaef698, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8078");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        equipment3.setLabLocation("Student");
        equipment3.enable();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8079");
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
        state.EquipmentState equipmentState50 = equipment35.getCurrentState();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        boolean boolean54 = equipment35.isAvailable(localDateTime51, localDateTime52, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8080");
        model.Guest guest3 = new model.Guest("User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.toString();
        double double5 = guest3.getHourlyRate();
// flaky "13) test8080(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=0339e116-af52-4aef-bd2a-2b16f7d9b446, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}" + "'", str4, "User{userId=0339e116-af52-4aef-bd2a-2b16f7d9b446, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8081");
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
        java.lang.String str20 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LabManager" + "'", str20, "LabManager");
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8082");
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
        java.lang.String str27 = equipment22.toString();
        java.lang.String str28 = equipment22.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8083");
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
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        equipment28.markMaintenance();
        equipment28.setStatus("");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment28.isModifyAvailable(localDateTime38, localDateTime39, "User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", reservation41);
        equipment28.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        observer.EquipmentObserver equipmentObserver45 = null;
        equipment28.attach(equipmentObserver45);
        labManager3.setEquipmentStatus(equipment28, "User{userId=680b24c7-a074-41c4-b09d-b9041e3818ba, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        labManager3.setIdOrCertNumber("User{userId=ad716673-a02d-4fc5-a2ef-58ea8d5ce350, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8084");
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
        boolean boolean26 = labManager5.isActive();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment36.isModifyAvailable(localDateTime37, localDateTime38, "Faculty", reservation40);
        equipment36.setLabLocation("Faculty");
        labManager32.setEquipmentStatus(equipment36, "Guest");
        model.Equipment equipment49 = new model.Equipment("", "", "");
        labManager32.addEquipment(equipment49);
        java.lang.String str51 = labManager32.getRole();
        model.Equipment equipment55 = new model.Equipment("", "", "");
        java.lang.String str56 = equipment55.getDescription();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment55.isModifyAvailable(localDateTime57, localDateTime58, "hi!", reservation60);
        java.lang.String str62 = equipment55.getEquipmentId();
        equipment55.setStatus("");
        labManager32.addEquipment(equipment55);
        java.lang.String str66 = labManager32.getEmail();
        model.Equipment equipment70 = new model.Equipment("", "", "");
        java.lang.String str71 = equipment70.getDescription();
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        model.Reservation reservation75 = null;
        boolean boolean76 = equipment70.isModifyAvailable(localDateTime72, localDateTime73, "hi!", reservation75);
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment70.isModifyAvailable(localDateTime77, localDateTime78, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation80);
        java.lang.String str82 = equipment70.getDescription();
        labManager32.markMaintenance(equipment70);
        java.lang.String str84 = equipment70.getLabLocation();
        labManager5.addEquipment(equipment70);
        equipment70.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "LabManager" + "'", str51, "LabManager");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Faculty" + "'", str66, "Faculty");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8085");
        model.LabManager labManager3 = new model.LabManager("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01a5437c-ae82-4c1f-b60e-31c15974b4de, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=eca1c219-d9b9-4fd7-bd30-892fc0645cd6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8086");
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
        equipment13.setLabLocation("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        equipment13.markMaintenance();
        equipment13.setDescription("User{userId=60b6fc6b-2bf7-4a98-9286-997d48fb7d92, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8087");
        model.Student student3 = new model.Student("User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8088");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getIdOrCertNumber();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getPasswordHash();
        java.lang.String str10 = student3.getRole();
        double double11 = student3.getHourlyRate();
        student3.setEmail("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getRole();
        student3.setEmail("User{userId=7dcaf5b2-d38d-435d-b313-59e636717203, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8089");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=77cc3685-3339-4cd2-a67f-4b5b858af6b6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d7bc9384-6ade-408c-9968-fc13e6e29ad4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8090");
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
        equipment39.disable();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ACTIVE" + "'", str35, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Faculty" + "'", str54, "Faculty");
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8091");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getIdOrCertNumber();
        double double10 = guest3.getHourlyRate();
        java.lang.String str11 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8092");
        model.Guest guest3 = new model.Guest("", "User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        java.lang.String str4 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8093");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment3.isAvailable(localDateTime13, localDateTime14, "User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str17 = equipment3.toString();
        equipment3.notifyObservers();
        java.lang.String str19 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}" + "'", str17, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}" + "'", str19, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8094");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getStatus();
        java.lang.String str12 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Available" + "'", str12, "Available");
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8095");
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
        java.lang.String str38 = labManager5.toString();
        double double39 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
// flaky "14) test8095(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "User{userId=2a7ac689-352c-4d18-ae53-b7aff89f1e5d, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str38, "User{userId=2a7ac689-352c-4d18-ae53-b7aff89f1e5d, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8096");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        faculty3.setActive(false);
        faculty3.setPasswordHash("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double12 = faculty3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        model.Faculty faculty22 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str23 = faculty22.getRole();
        faculty22.setEmail("hi!");
        java.lang.String str26 = faculty22.getRole();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Guest");
        labManager32.setPasswordHash("LM-CERT");
        java.util.UUID uUID35 = labManager32.getUserId();
        faculty22.setUserId(uUID35);
        labManager18.setUserId(uUID35);
        faculty3.setUserId(uUID35);
        java.lang.String str39 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "15) test8096(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "98b78b20-2645-4aaf-84ea-a7e690498916");
// flaky "2) test8096(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=98b78b20-2645-4aaf-84ea-a7e690498916, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=98b78b20-2645-4aaf-84ea-a7e690498916, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertNotNull(uUID35);
// flaky "1) test8096(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID35.toString(), "67e1387f-6f4e-4866-8da1-71902a812082");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8097");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.lang.String str19 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "hi!", reservation23);
        java.lang.String str25 = equipment18.getEquipmentId();
        equipment18.setStatus("");
        java.lang.String str28 = equipment18.getEquipmentId();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean32 = equipment18.isAvailable(localDateTime29, localDateTime30, "Researcher");
        equipment18.markMaintenance();
        equipment18.enable();
        observer.EquipmentObserver equipmentObserver35 = null;
        equipment18.detach(equipmentObserver35);
        labManager5.addEquipment(equipment18);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8098");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        double double10 = headLabCoordinator3.getHourlyRate();
        double double11 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8099");
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
        double double36 = student3.getHourlyRate();
        java.lang.String str37 = student3.getRole();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "16) test8099(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID20.toString(), "526a4b59-2c8b-441f-8568-185f512fb104");
        org.junit.Assert.assertNotNull(uUID22);
// flaky "3) test8099(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID22.toString(), "526a4b59-2c8b-441f-8568-185f512fb104");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(uUID33);
// flaky "2) test8099(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID33.toString(), "d195d440-90d5-41d1-a881-dd2a1249b5b6");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Student" + "'", str37, "Student");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8100");
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
        equipment3.setStatus("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver22 = null;
        equipment3.detach(equipmentObserver22);
        equipment3.markMaintenance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str19, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8101");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='', labLocation='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', status='User{userId=2aa38236-773d-4c54-aacb-9b926d015e42, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}'}", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=0504c199-7a85-4b1b-9d00-af828968cfe9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8102");
        model.Student student3 = new model.Student("User{userId=d2a6010a-9c92-4a8b-8dbc-bd64ac94181e, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = student3.getPasswordHash();
        model.Guest guest8 = new model.Guest("", "hi!", "hi!");
        java.lang.String str9 = guest8.getRole();
        guest8.setEmail("Guest");
        java.lang.String str12 = guest8.getRole();
        double double13 = guest8.getHourlyRate();
        double double14 = guest8.getHourlyRate();
        double double15 = guest8.getHourlyRate();
        guest8.setEmail("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str18 = guest8.getRole();
        model.Researcher researcher22 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.lang.String str23 = researcher22.getRole();
        model.HeadLabCoordinator headLabCoordinator27 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager29 = headLabCoordinator27.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment33.isModifyAvailable(localDateTime34, localDateTime35, "Faculty", reservation37);
        equipment33.setLabLocation("Faculty");
        labManager29.setEquipmentStatus(equipment33, "Guest");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        labManager29.addEquipment(equipment46);
        boolean boolean48 = labManager29.isActive();
        java.lang.String str49 = labManager29.getIdOrCertNumber();
        model.Faculty faculty53 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str54 = faculty53.getRole();
        faculty53.setIdOrCertNumber("");
        java.lang.String str57 = faculty53.getIdOrCertNumber();
        java.lang.String str58 = faculty53.getRole();
        java.lang.String str59 = faculty53.getPasswordHash();
        double double60 = faculty53.getHourlyRate();
        java.util.UUID uUID61 = faculty53.getUserId();
        labManager29.setUserId(uUID61);
        researcher22.setUserId(uUID61);
        guest8.setUserId(uUID61);
        student3.setUserId(uUID61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Researcher" + "'", str23, "Researcher");
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LM-CERT" + "'", str49, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Faculty" + "'", str54, "Faculty");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 20.0d + "'", double60 == 20.0d);
        org.junit.Assert.assertNotNull(uUID61);
// flaky "17) test8102(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID61.toString(), "e71611fa-b294-41c7-be6c-a9a490b31624");
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8103");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.toString();
        java.lang.String str8 = student3.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str7, "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str8, "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8104");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        labManager5.setActive(false);
        labManager5.setActive(false);
        labManager5.setIdOrCertNumber("User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double15 = labManager5.getHourlyRate();
        java.lang.String str16 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "INACTIVE" + "'", str16, "INACTIVE");
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8105");
        model.Guest guest3 = new model.Guest("User{userId=c1c98b2b-f723-460b-b4bd-177682f7e901, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=3ea24dc7-f640-44c6-99b2-10e76d3f61dc, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        double double4 = guest3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = guest3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8106");
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
        equipment3.disable();
        java.lang.String str19 = equipment3.getLabLocation();
        equipment3.enable();
        equipment3.setStatus("User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        equipment3.enable();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment3.attach(equipmentObserver24);
        java.lang.String str26 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment3.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=9a9d2684-c7f0-4c55-8daa-62b1a803ef94, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8107");
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
        equipment20.setStatus("User{userId=3f90cc24-55c4-47d6-9aae-68a68336d563, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str89 = equipment20.getLabLocation();
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
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8108");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "18) test8108(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=90370dd1-d342-4abe-8026-8496a8040fc5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=90370dd1-d342-4abe-8026-8496a8040fc5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8109");
        model.LabManager labManager3 = new model.LabManager("User{userId=c624e3b2-94c4-453f-a2a8-f53a46493ae3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f2bee4ca-dd08-485d-ba00-a3959ad39bbc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=efa030bc-fac4-447a-ba4b-a90dab22147d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8110");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        equipment3.markMaintenance();
        equipment3.setDescription("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8111");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        labManager13.setEmail("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean16 = labManager13.isActive();
        java.lang.String str17 = labManager13.getRole();
        labManager13.setEmail("User{userId=3c10c4d5-f325-45b2-93fa-01e8fdb38bdd, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LabManager" + "'", str17, "LabManager");
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8112");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getLabLocation();
        equipment3.disable();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment3.isModifyAvailable(localDateTime9, localDateTime10, "HeadLabCoordinator", reservation12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8113");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d28aad2a-1471-4722-b1f1-bb9f785de1a8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3ce5e614-0f76-40d6-809d-db284841ebd4, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8114");
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
        java.lang.String str15 = equipment3.getStatus();
        equipment3.setLabLocation("User{userId=26f4380a-41a6-46a9-b770-09540d1b80d3, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Disabled" + "'", str15, "Disabled");
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8115");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        java.lang.String str10 = equipment3.toString();
        equipment3.notifyObservers();
        equipment3.disable();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "Equipment{equipmentId='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', description='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', labLocation='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', status='Maintenance'}", reservation16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8116");
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
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.detach(equipmentObserver15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment3.isModifyAvailable(localDateTime17, localDateTime18, "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation20);
        equipment3.disable();
        equipment3.setDescription("User{userId=5855f606-092f-424c-9bcc-50190a627bc9, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8117");
        model.Researcher researcher3 = new model.Researcher("ACTIVE", "HeadLabCoordinator", "Researcher");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
// flaky "19) test8117(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=56236891-72eb-428d-85ae-276c2a5326f2, email='ACTIVE', status='ACTIVE', idOrCertNumber='Researcher', role='Researcher'}" + "'", str5, "User{userId=56236891-72eb-428d-85ae-276c2a5326f2, email='ACTIVE', status='ACTIVE', idOrCertNumber='Researcher', role='Researcher'}");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8118");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='', status='Maintenance'}", "", "User{userId=494283fd-f007-4914-98db-b5bca55ef399, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        researcher3.setActive(true);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8119");
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
        java.lang.String str52 = equipment35.getLabLocation();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment35.isAvailable(localDateTime53, localDateTime54, "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        state.EquipmentState equipmentState57 = equipment35.getCurrentState();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        boolean boolean61 = equipment35.isAvailable(localDateTime58, localDateTime59, "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Faculty" + "'", str52, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(equipmentState57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8120");
        model.Researcher researcher3 = new model.Researcher("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        researcher3.setIdOrCertNumber("User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str6 = researcher3.getRole();
        researcher3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8121");
        model.LabManager labManager3 = new model.LabManager("User{userId=cf9c4f14-c47f-48ba-90a8-19e3efbb33fb, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8122");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        boolean boolean7 = headLabCoordinator3.isActive();
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager10.setEquipmentStatus(equipment11, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8123");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getPasswordHash();
        student3.setActive(false);
        java.lang.String str9 = student3.getRole();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8124");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='', status='User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "User{userId=98cf70b4-332c-4934-bb84-6e70a43bd4b6, email='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=68d5639f-a3ac-4ba8-ad5b-a12ec5840871, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8125");
        model.LabManager labManager3 = new model.LabManager("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment8.isModifyAvailable(localDateTime9, localDateTime10, "Faculty", reservation12);
        equipment8.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment8.isModifyAvailable(localDateTime16, localDateTime17, "", reservation19);
        java.lang.String str21 = equipment8.getLabLocation();
        java.lang.String str22 = equipment8.getStatus();
        java.lang.String str23 = equipment8.getDescription();
        labManager3.markMaintenance(equipment8);
        model.SensorUpdate sensorUpdate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment8.applySensorUpdate(sensorUpdate25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8126");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        headLabCoordinator3.setIdOrCertNumber("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setActive(false);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = labManager9.getStatus();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8127");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.disable();
        labManager3.addEquipment(equipment7);
        double double11 = labManager3.getHourlyRate();
        model.Student student15 = new model.Student("", "hi!", "");
        java.util.UUID uUID16 = null;
        student15.setUserId(uUID16);
        java.lang.String str18 = student15.getRole();
        java.lang.String str19 = student15.getStatus();
        model.Guest guest23 = new model.Guest("", "hi!", "hi!");
        java.lang.String str24 = guest23.getRole();
        guest23.setEmail("Guest");
        double double27 = guest23.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID34 = null;
        headLabCoordinator31.setUserId(uUID34);
        model.LabManager labManager37 = headLabCoordinator31.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager39 = headLabCoordinator31.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager41 = headLabCoordinator31.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty45 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str46 = faculty45.getStatus();
        boolean boolean47 = faculty45.isActive();
        model.Faculty faculty51 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID52 = faculty51.getUserId();
        faculty45.setUserId(uUID52);
        labManager41.setUserId(uUID52);
        guest23.setUserId(uUID52);
        student15.setUserId(uUID52);
        labManager3.setUserId(uUID52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "INACTIVE" + "'", str19, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Guest" + "'", str24, "Guest");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 25.0d + "'", double27 == 25.0d);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNotNull(labManager37);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ACTIVE" + "'", str46, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(uUID52);
// flaky "20) test8127(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID52.toString(), "ea93c26a-90a2-4009-99e4-4744349d2230");
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8128");
        model.Researcher researcher3 = new model.Researcher("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=24fef356-e371-4e89-9d24-1ebb8462b5b5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7c981876-7b76-45d0-8748-7a0b8e1d94f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8129");
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
        java.lang.String str21 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str21, "User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8130");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        model.Equipment equipment18 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.markMaintenance(equipment18);
        labManager5.setEmail("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        java.lang.String str26 = equipment25.getDescription();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment25.isModifyAvailable(localDateTime27, localDateTime28, "hi!", reservation30);
        equipment25.markMaintenance();
        labManager5.addEquipment(equipment25);
        java.lang.String str34 = labManager5.getRole();
        java.lang.String str35 = labManager5.getRole();
        labManager5.setPasswordHash("User{userId=39fbc62d-39c6-43cd-b10a-c0de850918be, email='hi!', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "LabManager" + "'", str34, "LabManager");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LabManager" + "'", str35, "LabManager");
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8131");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        guest3.setEmail("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment20.isModifyAvailable(localDateTime21, localDateTime22, "Faculty", reservation24);
        equipment20.setLabLocation("Faculty");
        labManager16.setEquipmentStatus(equipment20, "Guest");
        java.lang.String str30 = labManager16.getStatus();
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.lang.String str35 = equipment34.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment34.isModifyAvailable(localDateTime36, localDateTime37, "hi!", reservation39);
        java.lang.String str41 = equipment34.getDescription();
        state.EquipmentState equipmentState42 = equipment34.getCurrentState();
        labManager16.markMaintenance(equipment34);
        equipment34.setLabLocation("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment34.attach(equipmentObserver46);
        equipment34.setStatus("HeadLabCoordinator");
        equipment34.setStatus("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str52 = equipment34.getDescription();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        strategy.PricingStrategy pricingStrategy55 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation56 = new model.Reservation((model.User) guest3, equipment34, localDateTime53, localDateTime54, pricingStrategy55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ACTIVE" + "'", str30, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(equipmentState42);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8132");
        model.Guest guest3 = new model.Guest("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fed24419-e732-4903-8c34-e24eaa879c77, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = guest3.getUserId();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "21) test8132(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "bc394847-47d4-44d7-a66b-0c21935efccb");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8133");
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
        java.lang.String str26 = equipment12.getDescription();
        java.lang.String str27 = equipment12.getDescription();
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment12.detach(equipmentObserver28);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8134");
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
        boolean boolean45 = equipment9.isAvailable(localDateTime42, localDateTime43, "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8135");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.setStatus("ACTIVE");
        equipment3.notifyObservers();
        java.lang.String str8 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean12 = equipment3.isAvailable(localDateTime9, localDateTime10, "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        equipment3.setDescription("User{userId=83777a27-abb1-45f6-84a7-bdf2e4858895, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", reservation18);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8136");
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
        java.lang.String str15 = equipment3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8137");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        double double12 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setIdOrCertNumber("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str15 = headLabCoordinator3.getStatus();
        model.LabManager labManager17 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.lang.String str22 = equipment21.getDescription();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment21.isModifyAvailable(localDateTime23, localDateTime24, "hi!", reservation26);
        equipment21.disable();
        equipment21.enable();
        state.EquipmentState equipmentState30 = equipment21.getCurrentState();
        model.HeadLabCoordinator headLabCoordinator34 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager36 = headLabCoordinator34.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        labManager36.markMaintenance(equipment40);
        java.lang.String str42 = equipment40.getStatus();
        model.HeadLabCoordinator headLabCoordinator46 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager48 = headLabCoordinator46.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment52 = new model.Equipment("", "", "");
        labManager48.addEquipment(equipment52);
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.lang.String str58 = equipment57.getDescription();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment57.isModifyAvailable(localDateTime59, localDateTime60, "hi!", reservation62);
        java.lang.String str64 = equipment57.getEquipmentId();
        equipment57.setStatus("");
        state.EquipmentState equipmentState67 = equipment57.getCurrentState();
        equipment52.setState(equipmentState67);
        equipment40.setState(equipmentState67);
        equipment21.setState(equipmentState67);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment21.isModifyAvailable(localDateTime71, localDateTime72, "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation74);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        boolean boolean79 = equipment21.isAvailable(localDateTime76, localDateTime77, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        labManager17.setEquipmentStatus(equipment21, "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment85 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str86 = equipment85.getEquipmentId();
        observer.EquipmentObserver equipmentObserver87 = null;
        equipment85.detach(equipmentObserver87);
        java.lang.String str89 = equipment85.getEquipmentId();
        labManager17.addEquipment(equipment85);
        equipment85.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ACTIVE" + "'", str15, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Maintenance" + "'", str42, "Maintenance");
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(equipmentState67);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Researcher" + "'", str86, "Researcher");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Researcher" + "'", str89, "Researcher");
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8138");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("", "User{userId=d48def6c-4fec-478e-a393-cacc8653679f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=37ffc006-9dc0-479a-b401-aaea8c331831, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8139");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=03c20517-4229-422d-9c51-ebe44aa7093b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean4 = headLabCoordinator3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8140");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        model.Equipment equipment18 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.markMaintenance(equipment18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", reservation23);
        state.EquipmentState equipmentState25 = equipment18.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentState25);
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8141");
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
        java.lang.String str71 = labManager3.toString();
        java.lang.String str72 = labManager3.getRole();
        java.lang.String str73 = labManager3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "22) test8141(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "65173cab-fdf9-4fe1-9965-479857a4843e");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(labManager24);
// flaky "4) test8141(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User{userId=803a3e67-9e5d-45de-9251-24b89bbbe987, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str25, "User{userId=803a3e67-9e5d-45de-9251-24b89bbbe987, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState66);
// flaky "3) test8141(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "User{userId=65173cab-fdf9-4fe1-9965-479857a4843e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}" + "'", str71, "User{userId=65173cab-fdf9-4fe1-9965-479857a4843e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LabManager" + "'", str72, "LabManager");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Guest" + "'", str73, "Guest");
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8142");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        model.Equipment equipment18 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.markMaintenance(equipment18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", reservation23);
        java.lang.String str25 = equipment18.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8143");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "LM-CERT", reservation7);
        equipment3.setDescription("User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}");
        java.lang.String str11 = equipment3.toString();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        labManager21.addEquipment(equipment25);
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment31.isModifyAvailable(localDateTime33, localDateTime34, "hi!", reservation36);
        java.lang.String str38 = equipment31.getDescription();
        state.EquipmentState equipmentState39 = equipment31.getCurrentState();
        equipment31.setLabLocation("Student");
        labManager21.setEquipmentStatus(equipment31, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        java.lang.String str48 = equipment47.getDescription();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment47.isModifyAvailable(localDateTime49, localDateTime50, "hi!", reservation52);
        equipment47.disable();
        equipment47.enable();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        boolean boolean59 = equipment47.isAvailable(localDateTime56, localDateTime57, "");
        labManager21.addEquipment(equipment47);
        equipment47.disable();
        equipment47.setStatus("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment47.markMaintenance();
        equipment47.setStatus("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        boolean boolean70 = equipment47.isAvailable(localDateTime67, localDateTime68, "Maintenance");
        state.EquipmentState equipmentState71 = equipment47.getCurrentState();
        equipment3.setState(equipmentState71);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}" + "'", str11, "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(equipmentState39);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(equipmentState71);
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8144");
        model.Faculty faculty3 = new model.Faculty("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        faculty3.setActive(true);
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8145");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        double double16 = labManager9.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment26.isModifyAvailable(localDateTime27, localDateTime28, "Faculty", reservation30);
        equipment26.setLabLocation("Faculty");
        labManager22.setEquipmentStatus(equipment26, "");
        java.lang.String str36 = equipment26.getDescription();
        model.HeadLabCoordinator headLabCoordinator40 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager42 = headLabCoordinator40.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        labManager42.addEquipment(equipment46);
        model.Equipment equipment51 = new model.Equipment("", "", "");
        java.lang.String str52 = equipment51.getDescription();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment51.isModifyAvailable(localDateTime53, localDateTime54, "hi!", reservation56);
        java.lang.String str58 = equipment51.getDescription();
        equipment51.setStatus("Researcher");
        labManager42.addEquipment(equipment51);
        model.HeadLabCoordinator headLabCoordinator65 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager67 = headLabCoordinator65.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment71 = new model.Equipment("", "", "");
        labManager67.addEquipment(equipment71);
        model.Equipment equipment76 = new model.Equipment("", "", "");
        java.lang.String str77 = equipment76.getDescription();
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        model.Reservation reservation81 = null;
        boolean boolean82 = equipment76.isModifyAvailable(localDateTime78, localDateTime79, "hi!", reservation81);
        java.lang.String str83 = equipment76.getEquipmentId();
        equipment76.setStatus("");
        state.EquipmentState equipmentState86 = equipment76.getCurrentState();
        equipment71.setState(equipmentState86);
        equipment51.setState(equipmentState86);
        equipment26.setState(equipmentState86);
        labManager9.setEquipmentStatus(equipment26, "User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str92 = labManager9.getEmail();
        boolean boolean93 = labManager9.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(labManager67);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(equipmentState86);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ACTIVE" + "'", str92, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8146");
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
        observer.EquipmentObserver equipmentObserver70 = null;
        equipment56.attach(equipmentObserver70);
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        model.Reservation reservation75 = null;
        boolean boolean76 = equipment56.isModifyAvailable(localDateTime72, localDateTime73, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", reservation75);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8147");
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
        equipment9.setDescription("User{userId=b7aed6ee-1c32-4982-a775-ce20394d0d35, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8148");
        model.Faculty faculty3 = new model.Faculty("", "User{userId=9f8a7cb7-ec03-4354-aac7-a2aa3455fb18, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=77cc3685-3339-4cd2-a67f-4b5b858af6b6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8149");
        model.Faculty faculty3 = new model.Faculty("User{userId=fed24419-e732-4903-8c34-e24eaa879c77, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8150");
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
        model.HeadLabCoordinator headLabCoordinator36 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager38 = headLabCoordinator36.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID39 = null;
        headLabCoordinator36.setUserId(uUID39);
        model.LabManager labManager42 = headLabCoordinator36.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        equipment46.enable();
        labManager42.addEquipment(equipment46);
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getDescription();
        state.EquipmentState equipmentState60 = equipment52.getCurrentState();
        equipment52.setLabLocation("Student");
        labManager42.setEquipmentStatus(equipment52, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment68 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        model.Reservation reservation72 = null;
        boolean boolean73 = equipment68.isModifyAvailable(localDateTime69, localDateTime70, "Faculty", reservation72);
        equipment68.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        model.Reservation reservation79 = null;
        boolean boolean80 = equipment68.isModifyAvailable(localDateTime76, localDateTime77, "", reservation79);
        equipment68.disable();
        labManager42.addEquipment(equipment68);
        equipment68.disable();
        equipment68.notifyObservers();
        equipment68.setLabLocation("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.setEquipmentStatus(equipment68, "User{userId=4913b4e9-485f-4947-b678-8330b18b2251, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment68.setLabLocation("User{userId=f6bfbdd3-89a5-4fab-b9e2-ea654a7bf8c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str91 = equipment68.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(equipmentState60);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8151");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=bb8910bf-ed88-4c5d-9679-9d9a26159be6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=b05d50e5-8921-4417-a2c5-cc348fda0850, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8152");
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
        java.lang.String str67 = labManager5.getRole();
        model.LabManager labManager71 = new model.LabManager("Student", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment75 = new model.Equipment("", "", "");
        java.lang.String str76 = equipment75.getDescription();
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment75.isModifyAvailable(localDateTime77, localDateTime78, "hi!", reservation80);
        java.lang.String str82 = equipment75.getEquipmentId();
        equipment75.setStatus("");
        state.EquipmentState equipmentState85 = equipment75.getCurrentState();
        equipment75.markMaintenance();
        equipment75.disable();
        equipment75.setLabLocation("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager71.setEquipmentStatus(equipment75, "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment75.enable();
        labManager5.markMaintenance(equipment75);
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
// flaky "23) test8152(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID59.toString(), "5327a948-31f7-4cb9-8a3b-4f4504db1084");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LabManager" + "'", str67, "LabManager");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(equipmentState85);
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8153");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("hi!");
        equipment9.setDescription("Researcher");
        state.EquipmentState equipmentState15 = equipment9.getCurrentState();
        state.EquipmentState equipmentState16 = equipment9.getCurrentState();
        equipment9.markMaintenance();
        model.Equipment equipment21 = new model.Equipment("", "", "");
        java.lang.String str22 = equipment21.getDescription();
        equipment21.disable();
        java.lang.String str24 = equipment21.getDescription();
        state.EquipmentState equipmentState25 = equipment21.getCurrentState();
        equipment9.setState(equipmentState25);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState15);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(equipmentState25);
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8154");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        java.lang.String str8 = guest3.toString();
        java.lang.String str9 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "24) test8154(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=f0aa1caa-e614-42a3-bad0-efeff2a7302d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str8, "User{userId=f0aa1caa-e614-42a3-bad0-efeff2a7302d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8155");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        equipment3.enable();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8156");
        model.Faculty faculty3 = new model.Faculty("User{userId=f0aa1caa-e614-42a3-bad0-efeff2a7302d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=35b83f94-3cbf-40e0-97e0-8289b19cddd0, email='User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8157");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.toString();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.util.UUID uUID10 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
// flaky "25) test8157(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=1c54cb16-2ae5-4161-8928-9349d8583a6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=1c54cb16-2ae5-4161-8928-9349d8583a6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "5) test8157(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID10.toString(), "1c54cb16-2ae5-4161-8928-9349d8583a6c");
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8158");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "Maintenance", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        faculty3.setEmail("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        faculty3.setActive(true);
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8159");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getRole();
        java.lang.String str10 = faculty3.getRole();
        faculty3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8160");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getStatus();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8161");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        java.lang.String str9 = guest3.getRole();
        java.lang.String str10 = guest3.getIdOrCertNumber();
        double double11 = guest3.getHourlyRate();
        double double12 = guest3.getHourlyRate();
        guest3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8162");
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
        state.EquipmentState equipmentState27 = equipment15.getCurrentState();
        java.lang.String str28 = equipment15.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8163");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.markMaintenance();
        java.lang.String str11 = equipment3.getDescription();
        equipment3.disable();
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8164");
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
        java.lang.String str26 = labManager9.toString();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        labManager32.markMaintenance(equipment36);
        java.lang.String str38 = labManager32.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator42 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager44 = headLabCoordinator42.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment48 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment48.isModifyAvailable(localDateTime49, localDateTime50, "Faculty", reservation52);
        equipment48.setLabLocation("Faculty");
        labManager44.setEquipmentStatus(equipment48, "");
        equipment48.notifyObservers();
        labManager32.markMaintenance(equipment48);
        model.Equipment equipment63 = new model.Equipment("", "", "");
        java.lang.String str64 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment63.isModifyAvailable(localDateTime65, localDateTime66, "hi!", reservation68);
        java.lang.String str70 = equipment63.getEquipmentId();
        java.lang.String str71 = equipment63.getLabLocation();
        labManager32.markMaintenance(equipment63);
        labManager32.setActive(true);
        java.lang.String str75 = labManager32.getEmail();
        model.Equipment equipment79 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        model.Reservation reservation83 = null;
        boolean boolean84 = equipment79.isModifyAvailable(localDateTime80, localDateTime81, "Faculty", reservation83);
        equipment79.setLabLocation("Faculty");
        equipment79.notifyObservers();
        equipment79.disable();
        labManager32.setEquipmentStatus(equipment79, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        labManager9.markMaintenance(equipment79);
        java.lang.String str92 = labManager9.getPasswordHash();
        boolean boolean93 = labManager9.isActive();
        java.lang.String str94 = labManager9.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
// flaky "26) test8164(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User{userId=63af491d-8c63-45c9-b9f1-c62ec2078743, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str26, "User{userId=63af491d-8c63-45c9-b9f1-c62ec2078743, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LM-CERT" + "'", str38, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Faculty" + "'", str75, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Temp123!" + "'", str92, "Temp123!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "LabManager" + "'", str94, "LabManager");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8165");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=3583d5fa-af62-4b4c-8323-53583710d891, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8166");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getDescription();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8167");
        model.Guest guest3 = new model.Guest("Disabled", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = guest3.getIdOrCertNumber();
        java.lang.String str5 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str4, "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8168");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        state.EquipmentState equipmentState10 = equipment3.getCurrentState();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean14 = equipment3.isAvailable(localDateTime11, localDateTime12, "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.markMaintenance();
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8169");
        model.LabManager labManager3 = new model.LabManager("User{userId=4afdb422-143d-4053-9215-bb429269663e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=0c7162d5-b2b4-496d-a4db-bb2f67e77c09, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ef8430cf-5e36-47ce-83ac-24c93e2e13b2, email='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8170");
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
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment22.detach(equipmentObserver24);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8171");
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
        java.lang.String str22 = equipment15.getDescription();
        state.EquipmentState equipmentState23 = equipment15.getCurrentState();
        equipment15.setLabLocation("Student");
        equipment15.enable();
        equipment15.disable();
        equipment15.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.addEquipment(equipment15);
        java.lang.String str31 = labManager9.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ACTIVE" + "'", str31, "ACTIVE");
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8172");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.String str13 = equipment3.getEquipmentId();
        equipment3.disable();
        state.EquipmentState equipmentState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8173");
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
        equipment3.setLabLocation("User{userId=25665545-77bc-45a7-9951-2144641462af, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8174");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getIdOrCertNumber();
        java.lang.String str13 = labManager5.toString();
        java.lang.String str14 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LM-CERT" + "'", str12, "LM-CERT");
// flaky "27) test8174(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=9d2b3db0-887f-42a5-9054-c7af7a8415b7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str13, "User{userId=9d2b3db0-887f-42a5-9054-c7af7a8415b7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8175");
        model.Guest guest3 = new model.Guest("User{userId=c10800bb-9432-46b9-8b3d-4b305a99ee97, email='Faculty', status='ACTIVE', idOrCertNumber='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "User{userId=03d04727-c0b8-41f6-8c22-90315f144551, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8176");
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
        java.lang.String str56 = equipment37.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str52, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Faculty" + "'", str56, "Faculty");
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8177");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        equipment3.setDescription("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        equipment3.disable();
        state.EquipmentState equipmentState17 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(equipmentState17);
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8178");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2b0358b7-2432-4ca4-aff3-0f948bd195a8, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=49a9859a-803e-4ebb-980e-71bb79a4aaa0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "");
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8179");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str14 = labManager13.getRole();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment24.isModifyAvailable(localDateTime25, localDateTime26, "Faculty", reservation28);
        equipment24.setLabLocation("Faculty");
        labManager20.setEquipmentStatus(equipment24, "");
        java.lang.String str34 = equipment24.toString();
        equipment24.disable();
        equipment24.setLabLocation("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str38 = equipment24.getEquipmentId();
        java.lang.String str39 = equipment24.getLabLocation();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment24.isModifyAvailable(localDateTime40, localDateTime41, "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", reservation43);
        java.lang.String str45 = equipment24.getLabLocation();
        labManager13.markMaintenance(equipment24);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str34, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str39, "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str45, "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8180");
        model.Student student3 = new model.Student("User{userId=ec8c63f1-3ca5-46e7-9144-3f7a90a5c572, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4b16f8f6-5a9b-4489-8734-590690801362, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8181");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager8.setEmail("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = labManager8.getIdOrCertNumber();
        java.lang.Class<?> wildcardClass12 = labManager8.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8182");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8183");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double10 = headLabCoordinator3.getHourlyRate();
        model.Guest guest14 = new model.Guest("", "hi!", "hi!");
        java.lang.String str15 = guest14.getRole();
        double double16 = guest14.getHourlyRate();
        java.lang.String str17 = guest14.getRole();
        java.util.UUID uUID18 = guest14.getUserId();
        headLabCoordinator3.setUserId(uUID18);
        double double20 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 25.0d + "'", double16 == 25.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertNotNull(uUID18);
// flaky "28) test8183(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID18.toString(), "30b3faa6-8476-4ebd-92e4-27d278ee0946");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8184");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8185");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setEmail("");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        java.lang.Class<?> wildcardClass8 = labManager7.getClass();
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8186");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getIdOrCertNumber();
        double double5 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8187");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        java.util.UUID uUID11 = labManager5.getUserId();
        java.lang.String str12 = labManager5.getStatus();
        java.lang.String str13 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "29) test8187(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "c7b5ef73-5c77-411f-9a38-dadc4028de80");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str13, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8188");
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
        equipment74.markMaintenance();
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
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8189");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        labManager7.setEmail("Temp123!");
        java.lang.String str10 = labManager7.getRole();
        java.lang.String str11 = labManager7.getEmail();
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
        java.lang.String str69 = labManager15.getRole();
        model.Equipment equipment73 = new model.Equipment("", "", "");
        equipment73.enable();
        equipment73.enable();
        java.lang.String str76 = equipment73.getStatus();
        equipment73.markMaintenance();
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        model.Reservation reservation81 = null;
        boolean boolean82 = equipment73.isModifyAvailable(localDateTime78, localDateTime79, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation81);
        java.lang.String str83 = equipment73.getDescription();
        java.lang.String str84 = equipment73.toString();
        equipment73.markMaintenance();
        labManager15.addEquipment(equipment73);
        labManager7.addEquipment(equipment73);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Temp123!" + "'", str11, "Temp123!");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "LabManager" + "'", str69, "LabManager");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Available" + "'", str76, "Available");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str84, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8190");
        model.Student student3 = new model.Student("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}", "User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5f08fcff-c939-4193-9640-3d0ae1869dd4, email='', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8191");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=fd493e3b-12c0-4142-a25c-2e03ee61b55f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bbf2141c-118f-4f16-a298-b2b3f07f8a07, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8192");
        model.Researcher researcher3 = new model.Researcher("User{userId=e551d50c-9f23-4ef0-b7b7-0b9879ca7bbc, email='Guest', status='ACTIVE', idOrCertNumber='Student', role='Guest'}", "User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7b8dee7f-07c7-4251-8ad6-f865b94d4b4f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8193");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.toString();
        boolean boolean8 = faculty3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
// flaky "30) test8193(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=1e61b59b-bc4f-460e-8d60-cd34932767ba, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}" + "'", str7, "User{userId=1e61b59b-bc4f-460e-8d60-cd34932767ba, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8194");
        model.Researcher researcher3 = new model.Researcher("User{userId=76e32f3e-f1ee-4862-b4f7-5802c4764841, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ad0bebd6-9d5c-424e-99fd-c6cffb2ed466, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2258e629-c867-47c7-9110-2688458c3e47, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8195");
        model.Student student3 = new model.Student("User{userId=c0b86429-442e-46c9-8f93-60ee7f0f7d69, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b825f33f-3488-4cd5-a72f-cd0633a6ba4b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8196");
        model.Faculty faculty3 = new model.Faculty("User{userId=285f75ab-fb57-485a-addf-f9fa1aea97ef, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=f8aa71e6-a81e-4a9f-8834-1ba1d50b8d55, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}", "User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8197");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.toString();
        java.lang.String str5 = researcher3.getRole();
// flaky "31) test8197(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=45baa29d-a359-4fa3-9c08-e67eaf3498ca, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}" + "'", str4, "User{userId=45baa29d-a359-4fa3-9c08-e67eaf3498ca, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8198");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str14 = labManager13.getRole();
        labManager13.setPasswordHash("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str17 = labManager13.getRole();
        labManager13.setPasswordHash("User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.lang.String str20 = labManager13.getPasswordHash();
        java.lang.String str21 = labManager13.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LabManager" + "'", str17, "LabManager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}" + "'", str20, "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8199");
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
        equipment13.markMaintenance();
        observer.EquipmentObserver equipmentObserver49 = null;
        equipment13.detach(equipmentObserver49);
        equipment13.setLabLocation("User{userId=ee9fb03e-9123-454e-88e1-bba49d920a26, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment13.isModifyAvailable(localDateTime53, localDateTime54, "User{userId=c382f7fb-3062-4c31-b297-e231a9a49396, email='User{userId=49f0bef8-3324-412e-bb38-8f2cfd2618f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3fa3b88c-ea5e-43da-8d99-79c6bc975636, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}", reservation56);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8200");
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
        equipment3.notifyObservers();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment3.isAvailable(localDateTime19, localDateTime20, "User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8201");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getPasswordHash();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8202");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        equipment3.setDescription("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        equipment3.disable();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8203");
        model.Guest guest3 = new model.Guest("User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getIdOrCertNumber();
        java.lang.String str6 = guest3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
// flaky "32) test8203(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=67118ce2-eb42-4a25-80aa-8a515a3133be, email='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}" + "'", str6, "User{userId=67118ce2-eb42-4a25-80aa-8a515a3133be, email='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8204");
        model.Equipment equipment3 = new model.Equipment("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8205");
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
        observer.EquipmentObserver equipmentObserver53 = null;
        equipment36.attach(equipmentObserver53);
        observer.EquipmentObserver equipmentObserver55 = null;
        equipment36.detach(equipmentObserver55);
        equipment36.setDescription("User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment36.enable();
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
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8206");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        double double10 = faculty3.getHourlyRate();
        java.util.UUID uUID11 = faculty3.getUserId();
        faculty3.setPasswordHash("User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "33) test8206(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "c399ff9d-a868-4c67-a4fa-594594d39304");
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8207");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        java.lang.String str19 = labManager13.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        labManager25.setActive(false);
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment31.isModifyAvailable(localDateTime32, localDateTime33, "Faculty", reservation35);
        equipment31.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment31.isModifyAvailable(localDateTime39, localDateTime40, "", reservation42);
        labManager25.addEquipment(equipment31);
        labManager13.setEquipmentStatus(equipment31, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver47 = null;
        equipment31.attach(equipmentObserver47);
        state.EquipmentState equipmentState49 = equipment31.getCurrentState();
        equipment3.setState(equipmentState49);
        java.lang.String str51 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LM-CERT" + "'", str19, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Available" + "'", str51, "Available");
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8208");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=41f31af6-4f99-4647-80cd-55b847f8ea0c, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Maintenance'}", "User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8209");
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
        equipment9.setStatus("User{userId=9e7ce067-9b8a-43c7-bf62-78e8f21ef6d6, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str79 = equipment9.getLabLocation();
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
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Faculty" + "'", str79, "Faculty");
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8210");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=4b98986f-3b04-4397-a461-2c6477e10e09, email='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}", "User{userId=ae09477e-9e55-4b1d-bad4-bb6eb3c0bced, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=76fe632a-716b-42d9-9e0f-eac433a9f5c0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=89547e3f-6042-4d85-b8a0-d44100c23dc9, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double8 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8211");
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
        equipment19.disable();
        java.lang.String str37 = equipment19.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8212");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str7 = labManager6.getRole();
        java.lang.String str8 = labManager6.getStatus();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "34) test8212(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "4022b86e-e91f-410c-9a44-2f34bab85a95");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8213");
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
        equipment3.setLabLocation("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setLabLocation("User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str22 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment3.detach(equipmentObserver23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8214");
        model.Faculty faculty3 = new model.Faculty("User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8215");
        model.Student student3 = new model.Student("User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=51cbbb47-5180-4f76-aa2c-4d505de22e42, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}");
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8216");
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
        equipment20.markMaintenance();
        equipment20.setStatus("Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        java.lang.String str29 = equipment20.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}" + "'", str29, "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8217");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getPasswordHash();
        double double8 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str11 = student3.getRole();
        java.lang.String str12 = student3.getStatus();
        java.lang.String str13 = student3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "INACTIVE" + "'", str12, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str13, "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8218");
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
        java.lang.String str36 = equipment3.getLabLocation();
        java.lang.Class<?> wildcardClass37 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ACTIVE" + "'", str36, "ACTIVE");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8219");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        java.lang.String str11 = equipment3.getLabLocation();
        equipment3.setStatus("User{userId=9f4644ed-2d37-4a6b-9fd1-0563c3568bcf, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8220");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', labLocation='User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}', status='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}", "", "User{userId=45a14a13-3386-4421-b0e2-7c228d49e311, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8221");
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
        java.lang.String str66 = equipment30.getEquipmentId();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment30.isModifyAvailable(localDateTime67, localDateTime68, "User{userId=60b6fc6b-2bf7-4a98-9286-997d48fb7d92, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='Guest'}", reservation70);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8222");
        model.Faculty faculty3 = new model.Faculty("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LabManager");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        java.util.UUID uUID6 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "35) test8222(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "e2ee0293-8ab4-40ea-a6d7-ad9edca82340");
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8223");
        model.Faculty faculty3 = new model.Faculty("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Disabled");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8224");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        equipment3.enable();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.detach(equipmentObserver12);
        java.lang.String str14 = equipment3.toString();
        model.Equipment equipment18 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment18.markMaintenance();
        state.EquipmentState equipmentState20 = equipment18.getCurrentState();
        state.EquipmentState equipmentState21 = equipment18.getCurrentState();
        equipment3.setState(equipmentState21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str14, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState20);
        org.junit.Assert.assertNotNull(equipmentState21);
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8225");
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
        equipment22.markMaintenance();
        equipment22.setLabLocation("");
        equipment22.setStatus("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
        java.lang.String str29 = equipment22.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}" + "'", str29, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8226");
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
        observer.EquipmentObserver equipmentObserver54 = null;
        equipment49.detach(equipmentObserver54);
        observer.EquipmentObserver equipmentObserver56 = null;
        equipment49.attach(equipmentObserver56);
        java.lang.String str58 = equipment49.getDescription();
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8227");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2eba5902-b086-4be6-86d0-a278fe1d92be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}");
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8228");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getRole();
        java.lang.String str11 = guest3.getPasswordHash();
        model.LabManager labManager15 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        equipment19.disable();
        labManager15.addEquipment(equipment19);
        boolean boolean23 = labManager15.isActive();
        labManager15.setPasswordHash("Guest");
        model.Equipment equipment29 = new model.Equipment("", "", "");
        equipment29.enable();
        labManager15.setEquipmentStatus(equipment29, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str33 = equipment29.getEquipmentId();
        java.lang.String str34 = equipment29.getDescription();
        equipment29.setLabLocation("User{userId=bfc196bf-0e5c-4790-b5a9-d4943d1bf144, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment29.setDescription("Equipment{equipmentId='', description='User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}', labLocation='', status='Disabled'}");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        strategy.PricingStrategy pricingStrategy41 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation42 = new model.Reservation((model.User) guest3, equipment29, localDateTime39, localDateTime40, pricingStrategy41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8229");
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
        java.lang.String str48 = labManager5.getEmail();
        java.lang.String str49 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Faculty" + "'", str48, "Faculty");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Faculty" + "'", str49, "Faculty");
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8230");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "36) test8230(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "db206434-b9d6-4e55-95c2-4b8ddeb8e260");
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8231");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        java.lang.String str6 = guest3.getRole();
        guest3.setEmail("User{userId=5b777b57-0f4b-4be6-9960-80b3dd667f1c, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8232");
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
        equipment23.setStatus("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean44 = equipment23.isAvailable(localDateTime41, localDateTime42, "User{userId=f7c16be4-86ab-427d-b1a2-cdf03b470e00, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState45 = equipment23.getCurrentState();
        state.EquipmentState equipmentState46 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment23.setState(equipmentState46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ACTIVE" + "'", str19, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(equipmentState45);
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8233");
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
        observer.EquipmentObserver equipmentObserver55 = null;
        equipment29.detach(equipmentObserver55);
        state.EquipmentState equipmentState57 = equipment29.getCurrentState();
        equipment29.markMaintenance();
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
        org.junit.Assert.assertNotNull(equipmentState57);
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8234");
        model.Student student3 = new model.Student("Disabled", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8235");
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
        equipment3.detach(equipmentObserver16);
        equipment3.setLabLocation("User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean23 = equipment3.isAvailable(localDateTime20, localDateTime21, "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str24 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8236");
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
        equipment13.setDescription("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str29 = equipment13.toString();
        equipment13.notifyObservers();
        equipment13.setStatus("User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}" + "'", str29, "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}");
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8237");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean13 = equipment3.isAvailable(localDateTime10, localDateTime11, "User{userId=0f5bd3bf-c7f0-4231-908d-f716526a8951, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment3.detach(equipmentObserver14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8238");
        model.Student student3 = new model.Student("Researcher", "ACTIVE", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        student3.setEmail("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        student3.setPasswordHash("User{userId=0e204372-0f95-42af-872c-0472b2b9dc97, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8239");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID13 = null;
        headLabCoordinator10.setUserId(uUID13);
        model.LabManager labManager16 = headLabCoordinator10.autoGenerateManagerAccount("ACTIVE");
        labManager16.setPasswordHash("Maintenance");
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        labManager24.setEquipmentStatus(equipment28, "");
        java.lang.String str38 = equipment28.toString();
        equipment28.disable();
        labManager16.setEquipmentStatus(equipment28, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager6.markMaintenance(equipment28);
        model.HeadLabCoordinator headLabCoordinator46 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager48 = headLabCoordinator46.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager48.setActive(true);
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager56 = headLabCoordinator54.autoGenerateManagerAccount("Guest");
        model.Equipment equipment60 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager56.markMaintenance(equipment60);
        labManager48.setEquipmentStatus(equipment60, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str64 = labManager48.getRole();
        model.Equipment equipment68 = new model.Equipment("", "", "");
        java.lang.String str69 = equipment68.getDescription();
        equipment68.disable();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment68.isModifyAvailable(localDateTime71, localDateTime72, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", reservation74);
        labManager48.addEquipment(equipment68);
        model.Equipment equipment80 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        model.Reservation reservation84 = null;
        boolean boolean85 = equipment80.isModifyAvailable(localDateTime81, localDateTime82, "Faculty", reservation84);
        equipment80.setLabLocation("Faculty");
        java.lang.String str88 = equipment80.getDescription();
        java.lang.String str89 = equipment80.getEquipmentId();
        equipment80.notifyObservers();
        equipment80.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment80.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str95 = equipment80.getDescription();
        observer.EquipmentObserver equipmentObserver96 = null;
        equipment80.attach(equipmentObserver96);
        labManager48.addEquipment(equipment80);
        labManager6.addEquipment(equipment80);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str38, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "LabManager" + "'", str64, "LabManager");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str95, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8240");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        model.Reservation reservation10 = null;
        boolean boolean11 = equipment3.isModifyAvailable(localDateTime7, localDateTime8, "Equipment{equipmentId='User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}', status='Available'}", reservation10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8241");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        equipment3.enable();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
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
        java.lang.String str33 = equipment21.getStatus();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean37 = equipment21.isAvailable(localDateTime34, localDateTime35, "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str38 = equipment21.getDescription();
        model.Equipment equipment42 = new model.Equipment("", "", "");
        equipment42.enable();
        equipment42.enable();
        java.lang.String str45 = equipment42.getStatus();
        java.lang.String str46 = equipment42.getStatus();
        java.lang.String str47 = equipment42.getDescription();
        equipment42.disable();
        equipment42.setLabLocation("User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        state.EquipmentState equipmentState51 = equipment42.getCurrentState();
        equipment21.setState(equipmentState51);
        equipment3.setState(equipmentState51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Disabled" + "'", str33, "Disabled");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Available" + "'", str45, "Available");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Available" + "'", str46, "Available");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(equipmentState51);
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8242");
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
        equipment19.setLabLocation("User{userId=680b24c7-a074-41c4-b09d-b9041e3818ba, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str35 = equipment19.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str35, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8243");
        model.Equipment equipment3 = new model.Equipment("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "");
        equipment3.markMaintenance();
        equipment3.setLabLocation("User{userId=1a384fd9-4cb9-4370-adef-6002126b8a75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8244");
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
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment28.isModifyAvailable(localDateTime42, localDateTime43, "User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation45);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8245");
        model.LabManager labManager3 = new model.LabManager("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LM-CERT", "LM-CERT");
        java.lang.String str4 = labManager3.getRole();
        labManager3.setPasswordHash("User{userId=f7c16be4-86ab-427d-b1a2-cdf03b470e00, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment10 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str11 = equipment10.getLabLocation();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment10.detach(equipmentObserver12);
        equipment10.setStatus("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment10.setStatus("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment10.setDescription("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment10.detach(equipmentObserver20);
        labManager3.markMaintenance(equipment10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8246");
        model.LabManager labManager3 = new model.LabManager("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID8 = faculty7.getUserId();
        boolean boolean9 = faculty7.isActive();
        faculty7.setEmail("");
        java.lang.String str12 = faculty7.getRole();
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
        boolean boolean37 = labManager18.isActive();
        java.lang.String str38 = labManager18.getIdOrCertNumber();
        labManager18.setActive(true);
        java.util.UUID uUID41 = labManager18.getUserId();
        faculty7.setUserId(uUID41);
        labManager3.setUserId(uUID41);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "37) test8246(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID8.toString(), "7e856924-4559-4f1b-b371-80ed319d2191");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LM-CERT" + "'", str38, "LM-CERT");
        org.junit.Assert.assertNotNull(uUID41);
// flaky "6) test8246(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID41.toString(), "b094b9c1-46e4-4634-9e78-78503125f80d");
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8247");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getPasswordHash();
        double double8 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str11 = student3.getRole();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8248");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8249");
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
        equipment12.disable();
        state.EquipmentState equipmentState34 = equipment12.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(equipmentState34);
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8250");
        model.Guest guest3 = new model.Guest("User{userId=2d4255cd-ee33-490e-a7b6-43f4f624113d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        java.lang.String str4 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str4, "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8251");
        model.Guest guest3 = new model.Guest("User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8252");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.util.UUID uUID6 = student3.getUserId();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        student3.setIdOrCertNumber("User{userId=3fa3b88c-ea5e-43da-8d99-79c6bc975636, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = student3.getRole();
        java.lang.String str12 = student3.getRole();
        java.lang.String str13 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "38) test8252(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "fffa83ae-c3f2-4546-b1e6-c7b402949ab5");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8253");
        model.LabManager labManager3 = new model.LabManager("User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=3099ec61-f676-4eb7-8ba4-739d3f7f05ea, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        labManager3.setActive(false);
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8254");
        model.Student student3 = new model.Student("User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.util.UUID uUID4 = student3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "39) test8254(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "48806f34-f07d-4637-9d77-828655c17a3f");
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8255");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        java.lang.String str7 = headLabCoordinator3.getPasswordHash();
        headLabCoordinator3.setActive(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8256");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0bed3626-dbde-4a71-af21-9c375d954793, email='Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=6ca42b27-2716-40de-bb64-578c5e2dcc40, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8257");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.lang.String str10 = faculty3.getRole();
        java.util.UUID uUID11 = faculty3.getUserId();
        boolean boolean12 = faculty3.isActive();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "40) test8257(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "96e68bdd-f2e9-4076-b51a-ff1bb6936021");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8258");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getIdOrCertNumber();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8259");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8260");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("", "User{userId=c46fe03e-a249-4d38-9af9-d45a19ef82c4, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3bffa567-9c33-4dee-a8af-306812c3ab27, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8261");
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
        equipment3.setStatus("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState30 = equipment3.getCurrentState();
        java.lang.String str31 = equipment3.getDescription();
        equipment3.setStatus("User{userId=bbf2141c-118f-4f16-a298-b2b3f07f8a07, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        java.lang.String str45 = equipment37.getDescription();
        java.lang.String str46 = equipment37.getEquipmentId();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment37.isModifyAvailable(localDateTime47, localDateTime48, "INACTIVE", reservation50);
        java.lang.String str52 = equipment37.toString();
        equipment37.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment37.markMaintenance();
        state.EquipmentState equipmentState56 = equipment37.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState56);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(equipmentState30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str52, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState56);
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8262");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        headLabCoordinator3.setIdOrCertNumber("User{userId=9bbc74b2-f7ec-401d-92df-d7f8f8c59707, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        boolean boolean10 = headLabCoordinator3.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8263");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        boolean boolean5 = faculty3.isActive();
        java.lang.String str6 = faculty3.getRole();
        faculty3.setEmail("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        faculty3.setPasswordHash("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = faculty3.getRole();
        double double12 = faculty3.getHourlyRate();
        faculty3.setPasswordHash("User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID15 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(uUID15);
// flaky "41) test8263(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID15.toString(), "5a8c534f-7728-4ebe-86bc-a94950ccaa89");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8264");
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
        state.EquipmentState equipmentState35 = equipment17.getCurrentState();
        java.lang.String str36 = equipment17.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "42) test8264(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=89e8aa61-62f5-4a5b-880f-9178c58cf0cb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=89e8aa61-62f5-4a5b-880f-9178c58cf0cb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertNotNull(equipmentState35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8265");
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
        java.lang.String str21 = equipment9.getLabLocation();
        equipment9.enable();
        state.EquipmentState equipmentState23 = equipment9.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8266");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getIdOrCertNumber();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8267");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        equipment3.markMaintenance();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment3.isAvailable(localDateTime19, localDateTime20, "User{userId=680b24c7-a074-41c4-b09d-b9041e3818ba, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean26 = equipment3.isAvailable(localDateTime23, localDateTime24, "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("User{userId=ec0deee8-7bc2-4708-b44e-d2d061b51121, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8268");
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
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getEquipmentId();
        equipment52.setStatus("");
        java.lang.String str62 = equipment52.getStatus();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        boolean boolean66 = equipment52.isAvailable(localDateTime63, localDateTime64, "hi!");
        java.lang.String str67 = equipment52.toString();
        labManager5.addEquipment(equipment52);
        java.lang.String str69 = equipment52.getDescription();
        java.lang.Class<?> wildcardClass70 = equipment52.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "43) test8268(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID48.toString(), "0313575c-22de-4e67-8e82-70c8ba5aa1b3");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status=''}" + "'", str67, "Equipment{equipmentId='', description='', labLocation='', status=''}");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8269");
        model.LabManager labManager3 = new model.LabManager("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        boolean boolean4 = labManager3.isActive();
        double double5 = labManager3.getHourlyRate();
        double double6 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8270");
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
        equipment3.setDescription("User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.detach(equipmentObserver18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8271");
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
        double double36 = labManager5.getHourlyRate();
        java.lang.String str37 = labManager5.getRole();
        model.Equipment equipment41 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        java.lang.String str42 = equipment41.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment41.isAvailable(localDateTime43, localDateTime44, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        equipment41.notifyObservers();
        labManager5.markMaintenance(equipment41);
        java.lang.String str49 = labManager5.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str42, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Temp123!" + "'", str49, "Temp123!");
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8272");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getRole();
        java.lang.String str11 = faculty3.getRole();
        java.lang.String str12 = faculty3.getRole();
        java.lang.String str13 = faculty3.getRole();
        java.lang.String str14 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8273");
        model.LabManager labManager3 = new model.LabManager("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "ACTIVE", "User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8274");
        model.Researcher researcher3 = new model.Researcher("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "ACTIVE");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8275");
        model.Equipment equipment3 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "", reservation7);
        equipment3.setDescription("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8276");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getEquipmentId();
        java.lang.String str12 = equipment3.toString();
        java.lang.String str13 = equipment3.getEquipmentId();
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str12, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8277");
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
        state.EquipmentState equipmentState18 = equipment3.getCurrentState();
        model.SensorUpdate sensorUpdate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertNotNull(equipmentState18);
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8278");
        model.Student student3 = new model.Student("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = student3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "44) test8278(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "895fad26-4b3f-4bce-b09f-b42dbc03b016");
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8279");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8280");
        model.Faculty faculty3 = new model.Faculty("User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c231e062-149b-42f9-b324-db8d3a984c3b, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=3f580973-8fe2-47c2-9fc7-b582905b46d8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Student'}");
        faculty3.setActive(true);
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8281");
        model.Student student3 = new model.Student("User{userId=6e8079dd-4e40-4d49-8a26-b776ee03c912, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setActive(true);
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8282");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.util.UUID uUID7 = faculty3.getUserId();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "45) test8282(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "27ee78b2-4e00-4d05-8683-43e16e8a4972");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8283");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=47645e5a-27f2-4a0e-8f64-16e02a77f5e4, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=a4451b1b-e46a-429d-9817-c60e09fa7603, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8284");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.util.UUID uUID6 = headLabCoordinator3.getUserId();
        java.util.UUID uUID7 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "46) test8284(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "6a243213-fdf6-4624-b84c-728e0b010e0f");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "7) test8284(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "6a243213-fdf6-4624-b84c-728e0b010e0f");
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8285");
        model.Faculty faculty3 = new model.Faculty("User{userId=f2db2799-d7c8-430e-b072-2d57203e8e33, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "User{userId=55b9d433-8545-4279-9f8f-6b5a87f98489, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=20dfded5-3d57-458f-a28d-496d8438eab4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8286");
        model.Student student3 = new model.Student("User{userId=5f08fcff-c939-4193-9640-3d0ae1869dd4, email='', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8287");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver10 = null;
        equipment3.attach(equipmentObserver10);
        java.lang.String str12 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str12, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8288");
        model.Guest guest3 = new model.Guest("User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.util.UUID uUID4 = guest3.getUserId();
        java.lang.String str5 = guest3.getEmail();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "47) test8288(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "737d327c-d32e-4e98-91e5-41e641dda45f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8289");
        model.Student student3 = new model.Student("User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student7 = new model.Student("", "hi!", "");
        java.lang.String str8 = student7.getEmail();
        double double9 = student7.getHourlyRate();
        boolean boolean10 = student7.isActive();
        java.util.UUID uUID11 = student7.getUserId();
        student3.setUserId(uUID11);
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "48) test8289(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "b10ee220-35c0-4185-82f8-2a36eb5eef7f");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8290");
        model.Equipment equipment3 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment3.notifyObservers();
        equipment3.disable();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        model.Reservation reservation9 = null;
        boolean boolean10 = equipment3.isModifyAvailable(localDateTime6, localDateTime7, "User{userId=862f6943-66ba-448f-9d6b-f46e755dd01c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation9);
        equipment3.markMaintenance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8291");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = headLabCoordinator3.getEmail();
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=eca1c219-d9b9-4fd7-bd30-892fc0645cd6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8292");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9a7f07d5-5f76-4035-b09f-12f12e72c169, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8293");
        model.Researcher researcher3 = new model.Researcher("User{userId=b76e7a77-08eb-48da-87cf-9e196fa2b2cf, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c80048dc-d405-4a06-aedc-822df5de10b3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8294");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        java.lang.String str5 = labManager3.getEmail();
        java.lang.String str6 = labManager3.getRole();
        java.lang.String str7 = labManager3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8295");
        model.Guest guest3 = new model.Guest("User{userId=7bdf43db-47db-4b9f-b3c4-0e0c38549bb3, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=40e37e2b-d3c1-449e-a17e-f6d320c89b84, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8296");
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
        state.EquipmentState equipmentState35 = equipment17.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment17.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "49) test8296(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=2d09c44a-30c3-43d6-8716-ad1adf52082a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=2d09c44a-30c3-43d6-8716-ad1adf52082a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertNotNull(equipmentState35);
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8297");
        model.Equipment equipment3 = new model.Equipment("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("HeadLabCoordinator", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
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
        state.EquipmentState equipmentState56 = equipment37.getCurrentState();
        equipment7.setState(equipmentState56);
        equipment3.setState(equipmentState56);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str52, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState56);
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8298");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8299");
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
        model.LabManager labManager18 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str19 = labManager18.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8300");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8301");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        equipment3.disable();
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8302");
        model.Student student3 = new model.Student("User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2a573d04-ab71-4e77-a1ea-9cdde92fb870, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "Equipment{equipmentId='User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', labLocation='User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}', status='User{userId=d46daa34-b224-4bbc-a6c0-f43df8694e79, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}'}");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8303");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        java.lang.String str10 = labManager5.getRole();
        labManager5.setIdOrCertNumber("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str13 = labManager5.getRole();
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
        java.lang.String str29 = equipment17.toString();
        labManager5.setEquipmentStatus(equipment17, "User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str32 = equipment17.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str29, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str32, "User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8304");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        double double5 = headLabCoordinator3.getHourlyRate();
        java.lang.String str6 = headLabCoordinator3.getEmail();
        java.lang.String str7 = headLabCoordinator3.getIdOrCertNumber();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("");
        model.HeadLabCoordinator headLabCoordinator13 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager15 = headLabCoordinator13.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment19.isModifyAvailable(localDateTime20, localDateTime21, "Faculty", reservation23);
        equipment19.setLabLocation("Faculty");
        labManager15.setEquipmentStatus(equipment19, "");
        java.lang.String str29 = equipment19.getDescription();
        model.HeadLabCoordinator headLabCoordinator33 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager35 = headLabCoordinator33.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment39 = new model.Equipment("", "", "");
        labManager35.addEquipment(equipment39);
        model.Equipment equipment44 = new model.Equipment("", "", "");
        java.lang.String str45 = equipment44.getDescription();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment44.isModifyAvailable(localDateTime46, localDateTime47, "hi!", reservation49);
        java.lang.String str51 = equipment44.getDescription();
        equipment44.setStatus("Researcher");
        labManager35.addEquipment(equipment44);
        model.HeadLabCoordinator headLabCoordinator58 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager60 = headLabCoordinator58.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment64 = new model.Equipment("", "", "");
        labManager60.addEquipment(equipment64);
        model.Equipment equipment69 = new model.Equipment("", "", "");
        java.lang.String str70 = equipment69.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment69.isModifyAvailable(localDateTime71, localDateTime72, "hi!", reservation74);
        java.lang.String str76 = equipment69.getEquipmentId();
        equipment69.setStatus("");
        state.EquipmentState equipmentState79 = equipment69.getCurrentState();
        equipment64.setState(equipmentState79);
        equipment44.setState(equipmentState79);
        equipment19.setState(equipmentState79);
        java.time.LocalDateTime localDateTime83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        boolean boolean86 = equipment19.isAvailable(localDateTime83, localDateTime84, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment19.notifyObservers();
        java.lang.String str88 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime89 = null;
        java.time.LocalDateTime localDateTime90 = null;
        strategy.PricingStrategy pricingStrategy91 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation92 = new model.Reservation((model.User) labManager9, equipment19, localDateTime89, localDateTime90, pricingStrategy91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uUID4);
// flaky "50) test8304(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "70842a7d-9fbd-43aa-86e5-076af8d78f94");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(labManager60);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(equipmentState79);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8305");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.util.UUID uUID7 = headLabCoordinator3.getUserId();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=26d13418-4eb3-4342-b492-a817c59bc059, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "51) test8305(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "f32d586f-3da3-4da6-9f37-ae30d09655dc");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8306");
        model.Guest guest3 = new model.Guest("User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3968022a-32a8-4fb2-a372-e7c7650b12ae, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8307");
        model.Researcher researcher3 = new model.Researcher("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Guest', status=''}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8308");
        model.LabManager labManager3 = new model.LabManager("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=262110c7-68ea-45e7-b72b-b93196a318f0, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=43d45941-45ea-42c1-9f67-2e88448539f4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8309");
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
        equipment3.enable();
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8310");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.getRole();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "52) test8310(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "f02fa282-c458-4127-b6ee-6cb5391d74f6");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8311");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Guest', status=''}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        double double5 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8312");
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
        double double26 = labManager5.getHourlyRate();
        model.Equipment equipment30 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment30.setLabLocation("ACTIVE");
        java.lang.String str33 = equipment30.getEquipmentId();
        equipment30.enable();
        equipment30.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment30.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        observer.EquipmentObserver equipmentObserver39 = null;
        equipment30.attach(equipmentObserver39);
        labManager5.addEquipment(equipment30);
        model.HeadLabCoordinator headLabCoordinator45 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager47 = headLabCoordinator45.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment51 = new model.Equipment("", "", "");
        labManager47.markMaintenance(equipment51);
        java.lang.String str53 = labManager47.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator57 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager59 = headLabCoordinator57.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment63 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        model.Reservation reservation67 = null;
        boolean boolean68 = equipment63.isModifyAvailable(localDateTime64, localDateTime65, "Faculty", reservation67);
        equipment63.setLabLocation("Faculty");
        labManager59.setEquipmentStatus(equipment63, "");
        equipment63.notifyObservers();
        labManager47.markMaintenance(equipment63);
        equipment63.disable();
        equipment63.markMaintenance();
        observer.EquipmentObserver equipmentObserver77 = null;
        equipment63.attach(equipmentObserver77);
        labManager5.addEquipment(equipment63);
        // The following exception was thrown during execution in test generation
        try {
            equipment63.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ACTIVE" + "'", str33, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LM-CERT" + "'", str53, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager59);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8313");
        model.LabManager labManager3 = new model.LabManager("User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager9.setActive(true);
        labManager9.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = labManager9.getIdOrCertNumber();
        double double15 = labManager9.getHourlyRate();
        double double16 = labManager9.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str23 = headLabCoordinator20.getRole();
        model.LabManager labManager25 = headLabCoordinator20.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager27 = headLabCoordinator20.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str28 = labManager27.toString();
        model.LabManager labManager32 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator36 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager38 = headLabCoordinator36.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment42 = new model.Equipment("", "", "");
        labManager38.markMaintenance(equipment42);
        java.lang.String str44 = labManager38.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator48 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager50 = headLabCoordinator48.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment54 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        model.Reservation reservation58 = null;
        boolean boolean59 = equipment54.isModifyAvailable(localDateTime55, localDateTime56, "Faculty", reservation58);
        equipment54.setLabLocation("Faculty");
        labManager50.setEquipmentStatus(equipment54, "");
        equipment54.notifyObservers();
        labManager38.markMaintenance(equipment54);
        model.Equipment equipment69 = new model.Equipment("", "", "");
        java.lang.String str70 = equipment69.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment69.isModifyAvailable(localDateTime71, localDateTime72, "hi!", reservation74);
        java.lang.String str76 = equipment69.getEquipmentId();
        java.lang.String str77 = equipment69.getLabLocation();
        labManager38.markMaintenance(equipment69);
        model.Equipment equipment82 = new model.Equipment("", "", "");
        equipment82.enable();
        labManager38.addEquipment(equipment82);
        labManager32.markMaintenance(equipment82);
        observer.EquipmentObserver equipmentObserver86 = null;
        equipment82.attach(equipmentObserver86);
        labManager27.setEquipmentStatus(equipment82, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver90 = null;
        equipment82.attach(equipmentObserver90);
        labManager9.setEquipmentStatus(equipment82, "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment82, "User{userId=974bc507-4222-41d9-b4b5-3ca25f281030, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LM-CERT" + "'", str14, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HeadLabCoordinator" + "'", str23, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager27);
// flaky "53) test8313(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "User{userId=0a26abc1-0b16-4fd8-92af-ab5e635cd02a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str28, "User{userId=0a26abc1-0b16-4fd8-92af-ab5e635cd02a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "LM-CERT" + "'", str44, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8314");
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
        java.lang.String str36 = equipment30.getDescription();
        equipment30.setStatus("Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}");
        java.lang.String str39 = equipment30.getStatus();
        java.lang.String str40 = equipment30.getLabLocation();
        equipment30.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}" + "'", str39, "Equipment{equipmentId='User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}', description='Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}', labLocation='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Temp123!" + "'", str40, "Temp123!");
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8315");
        model.Student student3 = new model.Student("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8316");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        researcher3.setIdOrCertNumber("User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "54) test8316(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "bff38f9d-5752-40cb-8083-663f5a3631a7");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8317");
        model.LabManager labManager3 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = labManager3.getRole();
        model.LabManager labManager8 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher12 = new model.Researcher("", "hi!", "hi!");
        researcher12.setEmail("hi!");
        double double15 = researcher12.getHourlyRate();
        java.util.UUID uUID16 = researcher12.getUserId();
        labManager8.setUserId(uUID16);
        labManager3.setUserId(uUID16);
        double double19 = labManager3.getHourlyRate();
        double double20 = labManager3.getHourlyRate();
        model.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.markMaintenance()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertNotNull(uUID16);
// flaky "55) test8317(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID16.toString(), "6368fbfc-8df7-48ea-a9af-ca21ce03c808");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8318");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        equipment3.setLabLocation("Student");
        equipment3.enable();
        equipment3.disable();
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = equipment3.isAvailable(localDateTime18, localDateTime19, "Maintenance");
        java.lang.String str22 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Student" + "'", str22, "Student");
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8319");
        model.Researcher researcher3 = new model.Researcher("User{userId=9e9b89db-002a-4bc7-b247-bea826fdec0c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=43aecc1b-360d-447e-84b4-3cc2e279b9d3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8320");
        model.Student student3 = new model.Student("Researcher", "ACTIVE", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager7 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str8 = labManager7.getRole();
        model.LabManager labManager12 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher16 = new model.Researcher("", "hi!", "hi!");
        researcher16.setEmail("hi!");
        double double19 = researcher16.getHourlyRate();
        java.util.UUID uUID20 = researcher16.getUserId();
        labManager12.setUserId(uUID20);
        labManager7.setUserId(uUID20);
        student3.setUserId(uUID20);
        java.lang.String str24 = student3.getRole();
        double double25 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LabManager" + "'", str8, "LabManager");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertNotNull(uUID20);
// flaky "56) test8320(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID20.toString(), "5ec72c25-de49-48a5-9acc-41489f86a735");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8321");
        model.Guest guest3 = new model.Guest("User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f722108d-cd3a-47c7-9185-78959f57e1a0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = guest3.getUserId();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "57) test8321(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "d4946dc4-5c39-49f9-bb26-3fb290f9bc26");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8322");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "", "");
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8323");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "hi!", "");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8324");
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
        java.lang.String str44 = equipment43.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment43.isModifyAvailable(localDateTime45, localDateTime46, "hi!", reservation48);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment43.isModifyAvailable(localDateTime50, localDateTime51, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation53);
        java.lang.String str55 = equipment43.getDescription();
        labManager5.markMaintenance(equipment43);
        equipment43.setStatus("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment43.setDescription("Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}");
        java.lang.String str61 = equipment43.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8325");
        model.Student student3 = new model.Student("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "HeadLabCoordinator");
        student3.setPasswordHash("User{userId=8da3923f-a44c-4a6f-8cfc-818dcf6eeea1, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str6 = student3.toString();
// flaky "58) test8325(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=8f14aa32-03a5-40bb-811f-2469e6eb0e64, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}" + "'", str6, "User{userId=8f14aa32-03a5-40bb-811f-2469e6eb0e64, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}");
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8326");
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
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8327");
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
        java.lang.String str52 = equipment35.getLabLocation();
        java.lang.String str53 = equipment35.getLabLocation();
        equipment35.setStatus("Equipment{equipmentId='', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Faculty" + "'", str52, "Faculty");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Faculty" + "'", str53, "Faculty");
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8328");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("hi!");
        java.lang.String str13 = equipment9.getLabLocation();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment9.isModifyAvailable(localDateTime14, localDateTime15, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Disabled'}", reservation17);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8329");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8330");
        model.Equipment equipment3 = new model.Equipment("User{userId=a8ca4fee-afc7-490b-bfb2-ca95c3372a57, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c64fabb7-f613-459c-b569-6e6b49571f71, email='User{userId=c421ae2c-60b7-4609-b942-e33d937d8035, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8331");
        model.Equipment equipment3 = new model.Equipment("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Faculty");
        equipment3.setDescription("User{userId=3bffa567-9c33-4dee-a8af-306812c3ab27, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8332");
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
        java.lang.String str31 = equipment15.getDescription();
        equipment15.setStatus("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        java.lang.String str34 = equipment15.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8333");
        model.Guest guest3 = new model.Guest("User{userId=736a7578-ab25-431d-a585-d8ac1ca95220, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "User{userId=1f3e23d9-8541-4eff-84fd-73beafe7ecd3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=736a7578-ab25-431d-a585-d8ac1ca95220, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=736a7578-ab25-431d-a585-d8ac1ca95220, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8334");
        model.Researcher researcher3 = new model.Researcher("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8335");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getStatus();
        java.lang.String str13 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8336");
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
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment13.detach(equipmentObserver23);
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        labManager30.addEquipment(equipment34);
        state.EquipmentState equipmentState36 = equipment34.getCurrentState();
        equipment13.setState(equipmentState36);
        java.lang.String str38 = equipment13.getStatus();
        equipment13.setStatus("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(equipmentState36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Available" + "'", str38, "Available");
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8337");
        model.Equipment equipment3 = new model.Equipment("User{userId=21941c67-eca4-48cb-a788-201493d8e754, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8338");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        equipment3.setDescription("User{userId=ec8c63f1-3ca5-46e7-9144-3f7a90a5c572, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(equipmentState12);
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8339");
        model.Student student3 = new model.Student("User{userId=db997688-0c5f-48ea-9189-0e24fa76c3b1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=eef65af6-8dc2-457e-b6f9-b147a33a8fa0, email='User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}", "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8340");
        model.Student student3 = new model.Student("Equipment{equipmentId='', description='ACTIVE', labLocation='', status='Researcher'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=420ec692-54c0-45f3-9123-55999bd86fbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8341");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        guest3.setEmail("User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8342");
        model.Equipment equipment3 = new model.Equipment("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        equipment7.enable();
        equipment7.enable();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.markMaintenance();
        equipment7.setLabLocation("Researcher");
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setLabLocation("LM-CERT");
        equipment7.markMaintenance();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean24 = labManager23.isActive();
        double double25 = labManager23.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment29.isModifyAvailable(localDateTime30, localDateTime31, "Faculty", reservation33);
        equipment29.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment29.isModifyAvailable(localDateTime37, localDateTime38, "", reservation40);
        labManager23.addEquipment(equipment29);
        model.Equipment equipment46 = new model.Equipment("", "", "");
        java.lang.String str47 = equipment46.getDescription();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment46.isModifyAvailable(localDateTime48, localDateTime49, "hi!", reservation51);
        java.lang.String str53 = equipment46.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment46.isAvailable(localDateTime54, localDateTime55, "Faculty");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.lang.String str62 = equipment61.getDescription();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment61.isModifyAvailable(localDateTime63, localDateTime64, "hi!", reservation66);
        java.lang.String str68 = equipment61.getDescription();
        state.EquipmentState equipmentState69 = equipment61.getCurrentState();
        equipment46.setState(equipmentState69);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean74 = equipment46.isAvailable(localDateTime71, localDateTime72, "Faculty");
        java.lang.String str75 = equipment46.getDescription();
        state.EquipmentState equipmentState76 = equipment46.getCurrentState();
        equipment29.setState(equipmentState76);
        model.HeadLabCoordinator headLabCoordinator81 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager83 = headLabCoordinator81.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID84 = null;
        headLabCoordinator81.setUserId(uUID84);
        model.LabManager labManager87 = headLabCoordinator81.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment91 = new model.Equipment("", "", "");
        equipment91.enable();
        labManager87.addEquipment(equipment91);
        equipment91.markMaintenance();
        state.EquipmentState equipmentState95 = equipment91.getCurrentState();
        equipment29.setState(equipmentState95);
        equipment7.setState(equipmentState95);
        equipment3.setState(equipmentState95);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(equipmentState69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(equipmentState76);
        org.junit.Assert.assertNotNull(labManager83);
        org.junit.Assert.assertNotNull(labManager87);
        org.junit.Assert.assertNotNull(equipmentState95);
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8343");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getRole();
        double double10 = student3.getHourlyRate();
        java.util.UUID uUID11 = student3.getUserId();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "59) test8343(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "3842bbef-1eee-4793-ab44-3e5976fa66f3");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8344");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getIdOrCertNumber();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getRole();
        student3.setPasswordHash("User{userId=9c6242e6-d1a8-4386-bfc3-731c4f64fc86, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8345");
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
        state.EquipmentState equipmentState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.setState(equipmentState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"state.EquipmentState.getStateName()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8346");
        model.Student student3 = new model.Student("Disabled", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        double double6 = student3.getHourlyRate();
        model.Faculty faculty10 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "", "");
        faculty10.setIdOrCertNumber("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.Faculty faculty16 = new model.Faculty("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Maintenance", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Guest guest20 = new model.Guest("", "hi!", "hi!");
        java.lang.String str21 = guest20.getRole();
        double double22 = guest20.getHourlyRate();
        double double23 = guest20.getHourlyRate();
        java.lang.String str24 = guest20.getRole();
        java.lang.String str25 = guest20.getEmail();
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID30 = headLabCoordinator29.getUserId();
        guest20.setUserId(uUID30);
        faculty16.setUserId(uUID30);
        faculty10.setUserId(uUID30);
        student3.setUserId(uUID30);
        java.lang.String str35 = student3.getRole();
        java.lang.String str36 = student3.toString();
        student3.setIdOrCertNumber("User{userId=bffa7436-366f-4280-aeb6-9a4c2f075740, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Faculty faculty42 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str43 = faculty42.getRole();
        faculty42.setIdOrCertNumber("");
        java.lang.String str46 = faculty42.getIdOrCertNumber();
        java.lang.String str47 = faculty42.getRole();
        double double48 = faculty42.getHourlyRate();
        java.lang.String str49 = faculty42.getRole();
        java.lang.String str50 = faculty42.getRole();
        java.lang.String str51 = faculty42.getRole();
        double double52 = faculty42.getHourlyRate();
        double double53 = faculty42.getHourlyRate();
        model.Guest guest57 = new model.Guest("", "hi!", "hi!");
        java.lang.String str58 = guest57.getRole();
        double double59 = guest57.getHourlyRate();
        java.lang.String str60 = guest57.getRole();
        java.lang.String str61 = guest57.getEmail();
        guest57.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str64 = guest57.getIdOrCertNumber();
        java.util.UUID uUID65 = guest57.getUserId();
        faculty42.setUserId(uUID65);
        student3.setUserId(uUID65);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 25.0d + "'", double22 == 25.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 25.0d + "'", double23 == 25.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Guest" + "'", str24, "Guest");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(uUID30);
// flaky "60) test8346(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID30.toString(), "219dfcbe-69c6-4543-9dc2-2a227736971d");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Student" + "'", str35, "Student");
// flaky "8) test8346(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User{userId=219dfcbe-69c6-4543-9dc2-2a227736971d, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}" + "'", str36, "User{userId=219dfcbe-69c6-4543-9dc2-2a227736971d, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Faculty" + "'", str43, "Faculty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Faculty" + "'", str47, "Faculty");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 20.0d + "'", double48 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Faculty" + "'", str49, "Faculty");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Faculty" + "'", str50, "Faculty");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 20.0d + "'", double53 == 20.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Guest" + "'", str58, "Guest");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 25.0d + "'", double59 == 25.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Guest" + "'", str60, "Guest");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str64, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID65);
// flaky "4) test8346(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID65.toString(), "48af78f1-ba4b-4c3b-b48d-336d25a1d35e");
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8347");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID11 = labManager10.getUserId();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment21 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str22 = equipment21.getLabLocation();
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment21.detach(equipmentObserver23);
        equipment21.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str27 = equipment21.getLabLocation();
        java.lang.String str28 = equipment21.getStatus();
        java.lang.String str29 = equipment21.getLabLocation();
        equipment21.setStatus("User{userId=142baae1-3141-41b1-b6d5-2f13b5b41771, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager17.markMaintenance(equipment21);
        labManager10.setEquipmentStatus(equipment21, "User{userId=a76b7946-3c9c-4dbd-9b87-4ababc28694b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager10.setIdOrCertNumber("User{userId=2dd759ac-1044-421a-a90b-db316dc3f356, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "61) test8347(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "431ebad5-6790-4217-a79e-baee44a323e4");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8348");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double11 = headLabCoordinator3.getHourlyRate();
        java.lang.String str12 = headLabCoordinator3.getRole();
        java.lang.String str13 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "62) test8348(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=8ee5abdd-b60f-4bf2-90ef-d7b3423e5ed0, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=8ee5abdd-b60f-4bf2-90ef-d7b3423e5ed0, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HeadLabCoordinator" + "'", str12, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8349");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        java.lang.String str12 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.attach(equipmentObserver13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8350");
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
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.lang.String str43 = equipment42.getDescription();
        equipment42.disable();
        java.lang.String str45 = equipment42.getDescription();
        java.lang.String str46 = equipment42.getEquipmentId();
        labManager3.addEquipment(equipment42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8351");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        equipment14.enable();
        equipment14.enable();
        java.lang.String str17 = equipment14.getStatus();
        java.lang.String str18 = equipment14.getDescription();
        model.Equipment equipment22 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str23 = equipment22.getEquipmentId();
        java.lang.String str24 = equipment22.getEquipmentId();
        equipment22.enable();
        state.EquipmentState equipmentState26 = equipment22.getCurrentState();
        equipment14.setState(equipmentState26);
        equipment3.setState(equipmentState26);
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Researcher" + "'", str23, "Researcher");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState26);
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8352");
        model.Student student3 = new model.Student("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
// flaky "63) test8352(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=f664756e-25c1-4103-a852-5ddc121e52a1, email='User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}" + "'", str5, "User{userId=f664756e-25c1-4103-a852-5ddc121e52a1, email='User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8353");
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
        java.lang.String str41 = labManager5.toString();
        java.lang.String str42 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
// flaky "64) test8353(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "User{userId=e20785e9-f7bb-4d1d-89bb-3615cf9bb108, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str41, "User{userId=e20785e9-f7bb-4d1d-89bb-3615cf9bb108, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
// flaky "9) test8353(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User{userId=e20785e9-f7bb-4d1d-89bb-3615cf9bb108, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str42, "User{userId=e20785e9-f7bb-4d1d-89bb-3615cf9bb108, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8354");
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
        observer.EquipmentObserver equipmentObserver87 = null;
        equipment20.attach(equipmentObserver87);
        equipment20.setStatus("User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str91 = equipment20.getDescription();
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "ACTIVE" + "'", str91, "ACTIVE");
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8355");
        model.Equipment equipment3 = new model.Equipment("User{userId=83f30493-e931-4103-a994-eca68574be34, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7bdf43db-47db-4b9f-b3c4-0e0c38549bb3, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=2d4255cd-ee33-490e-a7b6-43f4f624113d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8356");
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
        labManager9.setActive(false);
        model.HeadLabCoordinator headLabCoordinator54 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double55 = headLabCoordinator54.getHourlyRate();
        java.lang.String str56 = headLabCoordinator54.getRole();
        java.lang.String str57 = headLabCoordinator54.getRole();
        java.lang.String str58 = headLabCoordinator54.toString();
        model.LabManager labManager60 = headLabCoordinator54.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment64 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment64.markMaintenance();
        labManager60.addEquipment(equipment64);
        observer.EquipmentObserver equipmentObserver67 = null;
        equipment64.detach(equipmentObserver67);
        labManager9.setEquipmentStatus(equipment64, "User{userId=efa030bc-fac4-447a-ba4b-a90dab22147d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        model.Equipment equipment71 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager9.setEquipmentStatus(equipment71, "User{userId=50c8e534-0cef-4e1f-8015-4eb5b8d5dfed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "HeadLabCoordinator" + "'", str56, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "HeadLabCoordinator" + "'", str57, "HeadLabCoordinator");
// flaky "65) test8356(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "User{userId=ada57a93-7498-42fe-b73b-c6c681e3af2d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str58, "User{userId=ada57a93-7498-42fe-b73b-c6c681e3af2d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager60);
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8357");
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
        java.lang.String str46 = labManager9.getPasswordHash();
        double double47 = labManager9.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ACTIVE" + "'", str17, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HeadLabCoordinator" + "'", str23, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Temp123!" + "'", str46, "Temp123!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8358");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str8 = faculty7.getRole();
        faculty7.setEmail("hi!");
        boolean boolean11 = faculty7.isActive();
        java.util.UUID uUID12 = faculty7.getUserId();
        headLabCoordinator3.setUserId(uUID12);
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double16 = labManager15.getHourlyRate();
        model.Equipment equipment20 = new model.Equipment("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        state.EquipmentState equipmentState21 = equipment20.getCurrentState();
        equipment20.disable();
        java.lang.String str23 = equipment20.getStatus();
        labManager15.addEquipment(equipment20);
        observer.EquipmentObserver equipmentObserver25 = null;
        equipment20.detach(equipmentObserver25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uUID12);
// flaky "66) test8358(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID12.toString(), "d2bebbba-7c79-4286-9e41-c1375c7b3285");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(equipmentState21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Disabled" + "'", str23, "Disabled");
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8359");
        model.Faculty faculty3 = new model.Faculty("User{userId=5ba60eb4-cb5e-4eeb-a0c3-a17e8b79f805, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e6975901-36a8-4bc9-84c5-d7a31f6240ea, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=638e5c31-d234-4098-8232-9970859f447a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8360");
        model.Faculty faculty3 = new model.Faculty("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=eb321398-f17f-4482-bf1c-db03bfde9278, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "INACTIVE");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8361");
        model.Guest guest3 = new model.Guest("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        boolean boolean4 = guest3.isActive();
        boolean boolean5 = guest3.isActive();
        java.util.UUID uUID6 = guest3.getUserId();
        double double7 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "67) test8361(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "4dfe8c6f-a2c4-4135-b77c-8478ccc8baa3");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8362");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getStatus();
        java.lang.String str11 = researcher3.getRole();
        researcher3.setEmail("User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = researcher3.getRole();
        double double15 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8363");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2da23391-048d-4b92-a256-ed5d7cc85586, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ffd6501e-a169-4d91-abe7-25847fe08b15, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}", "User{userId=27dfb710-3768-4014-a4e5-59c71fca2092, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8364");
        model.Student student3 = new model.Student("", "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}", "User{userId=a76b7946-3c9c-4dbd-9b87-4ababc28694b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8365");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b889fb42-a009-460a-81cc-e21429c65068, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8366");
        model.Researcher researcher3 = new model.Researcher("User{userId=f4cca0a4-caa9-4643-8e06-2af6f8209431, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', description='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}', status='Maintenance'}");
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8367");
        model.LabManager labManager3 = new model.LabManager("User{userId=4b16f8f6-5a9b-4489-8734-590690801362, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7f03ff20-807d-429d-9cc0-a0fdb8690537, email='Guest', status='ACTIVE', idOrCertNumber='Student', role='Guest'}", "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8368");
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
        state.EquipmentState equipmentState19 = equipment3.getCurrentState();
        equipment3.disable();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment3.isModifyAvailable(localDateTime21, localDateTime22, "User{userId=3bffa567-9c33-4dee-a8af-306812c3ab27, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}", reservation24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8369");
        model.Equipment equipment3 = new model.Equipment("User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=392734b6-8112-44d8-a042-3e62fff3cf5b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment3.disable();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8370");
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
        model.Equipment equipment29 = new model.Equipment("User{userId=45a14a13-3386-4421-b0e2-7c228d49e311, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Disabled", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.addEquipment(equipment29);
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
        java.lang.String str51 = equipment34.getStatus();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean55 = equipment34.isAvailable(localDateTime52, localDateTime53, "User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str56 = equipment34.toString();
        labManager3.addEquipment(equipment34);
        java.util.UUID uUID58 = labManager3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertNotNull(uUID21);
// flaky "68) test8370(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID21.toString(), "46e8bdb6-b5db-418f-a112-c174349969a7");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Available" + "'", str51, "Available");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str56, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(uUID58);
// flaky "10) test8370(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID58.toString(), "46e8bdb6-b5db-418f-a112-c174349969a7");
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8371");
        model.Student student3 = new model.Student("User{userId=b8aa8494-2a46-46c6-a643-5adba65c942a, email='User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=4c74cc16-3a26-4216-a2a4-2054adbeaff2, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=26428e71-8337-4788-b9fa-f61ed1ac4f2f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8372");
        model.Guest guest3 = new model.Guest("User{userId=b3559384-c022-4e4f-a432-e89d2db5f9ca, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=d7071c1a-6ed5-4728-8738-e26b63850480, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=968a9ceb-0f5d-4a5c-9aa4-22c79190dbe4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8373");
        model.Student student3 = new model.Student("User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}", "User{userId=f314487c-0f1d-4db6-bc8d-61154327bc96, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ebdc402e-ae5a-4238-9334-c4490a251952, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8374");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        guest3.setActive(true);
        model.Guest guest14 = new model.Guest("", "hi!", "hi!");
        java.lang.String str15 = guest14.getRole();
        double double16 = guest14.getHourlyRate();
        java.util.UUID uUID17 = guest14.getUserId();
        guest3.setUserId(uUID17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 25.0d + "'", double16 == 25.0d);
        org.junit.Assert.assertNotNull(uUID17);
// flaky "69) test8374(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID17.toString(), "0670836c-7c0f-48ec-83ea-9ccdfa2e74e0");
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8375");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment9.isAvailable(localDateTime12, localDateTime13, "User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str16 = equipment9.getEquipmentId();
        state.EquipmentState equipmentState17 = equipment9.getCurrentState();
        java.lang.Class<?> wildcardClass18 = equipment9.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8376");
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
        equipment13.detach(equipmentObserver50);
        model.SensorUpdate sensorUpdate52 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment13.applySensorUpdate(sensorUpdate52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8377");
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
        java.lang.String str25 = equipment11.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment11.isAvailable(localDateTime26, localDateTime27, "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8378");
        model.Faculty faculty3 = new model.Faculty("", "", "Equipment{equipmentId='', description='', labLocation='', status=''}");
        faculty3.setEmail("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setEmail("User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = faculty3.toString();
// flaky "70) test8378(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=9fcbaf46-dbec-44c7-8e69-bb1e4bb4d3b3, email='User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status=''}', role='Faculty'}" + "'", str8, "User{userId=9fcbaf46-dbec-44c7-8e69-bb1e4bb4d3b3, email='User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status=''}', role='Faculty'}");
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8379");
        model.Student student3 = new model.Student("User{userId=e2f7f034-e1a9-45dc-9009-b560dc4e017d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='Guest'}", "User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setPasswordHash("User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8380");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = labManager8.getHourlyRate();
        java.lang.String str10 = labManager8.getPasswordHash();
        labManager8.setIdOrCertNumber("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double13 = labManager8.getHourlyRate();
        model.LabManager labManager17 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID24 = null;
        headLabCoordinator21.setUserId(uUID24);
        model.LabManager labManager27 = headLabCoordinator21.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment31 = new model.Equipment("", "", "");
        equipment31.enable();
        labManager27.addEquipment(equipment31);
        equipment31.disable();
        equipment31.setLabLocation("HeadLabCoordinator");
        equipment31.enable();
        labManager17.addEquipment(equipment31);
        observer.EquipmentObserver equipmentObserver39 = null;
        equipment31.detach(equipmentObserver39);
        labManager8.addEquipment(equipment31);
        java.lang.String str42 = equipment31.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Available" + "'", str42, "Available");
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8381");
        model.LabManager labManager3 = new model.LabManager("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "LabManager");
        java.lang.String str4 = labManager3.getStatus();
        labManager3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8382");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = labManager9.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager9);
// flaky "71) test8382(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=5dec4938-bcc5-4e09-ace3-480e8f31305f, email='User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str10, "User{userId=5dec4938-bcc5-4e09-ace3-480e8f31305f, email='User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8383");
        model.Equipment equipment3 = new model.Equipment("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str8 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.attach(equipmentObserver9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str8, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8384");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getStatus();
        double double9 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7bdf43db-47db-4b9f-b3c4-0e0c38549bb3, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8385");
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
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment15.attach(equipmentObserver29);
        equipment15.setStatus("User{userId=4340576e-c9a5-4ff1-904a-99702d1b38cb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8386");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getPasswordHash();
        double double10 = guest3.getHourlyRate();
        java.lang.String str11 = guest3.getRole();
        java.lang.String str12 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8387");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        double double10 = headLabCoordinator3.getHourlyRate();
        double double11 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "72) test8387(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=c9a7e61d-6c98-4e57-92ca-b07ca85ca7fa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=c9a7e61d-6c98-4e57-92ca-b07ca85ca7fa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8388");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        equipment3.setDescription("User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8389");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        java.util.UUID uUID7 = student3.getUserId();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "73) test8389(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "db2c3ee2-e1de-4bdc-b87f-fc3f12a31224");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8390");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getRole();
        java.lang.String str11 = guest3.getIdOrCertNumber();
        java.lang.String str12 = guest3.getEmail();
        guest3.setPasswordHash("User{userId=0c1af44c-8e5b-4c4f-99c1-9b4317ed4270, email='User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8391");
        model.LabManager labManager3 = new model.LabManager("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "User{userId=4e2bf97b-2231-43ed-b46f-ea04514eea46, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8392");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double11 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setEmail("User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=4f9a032c-739b-4de5-83d1-374717cd8209, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
// flaky "74) test8392(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=60a02c57-2620-4c24-ae03-6da2a573fb3e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=60a02c57-2620-4c24-ae03-6da2a573fb3e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8393");
        model.Student student3 = new model.Student("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = student3.getPasswordHash();
        student3.setPasswordHash("User{userId=20dfded5-3d57-458f-a28d-496d8438eab4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}" + "'", str4, "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8394");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "User{userId=3c339932-08ce-42f6-a2ef-8ced53d31437, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8395");
        model.LabManager labManager3 = new model.LabManager("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Student", "hi!");
        boolean boolean4 = labManager3.isActive();
        java.lang.String str5 = labManager3.getPasswordHash();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getStatus();
        state.EquipmentState equipmentState11 = equipment9.getCurrentState();
        labManager3.setEquipmentStatus(equipment9, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str14 = equipment9.getDescription();
        equipment9.setLabLocation("User{userId=ae9cce22-76c2-47ed-810a-e8395a412279, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8396");
        model.LabManager labManager3 = new model.LabManager("Student", "Researcher", "Guest");
        model.Equipment equipment7 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str8 = equipment7.getEquipmentId();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment7.detach(equipmentObserver9);
        labManager3.addEquipment(equipment7);
        labManager3.setIdOrCertNumber("User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8397");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID9 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "75) test8397(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=48cb3747-7fe5-4280-9eb4-31f5231b96a5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=48cb3747-7fe5-4280-9eb4-31f5231b96a5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "11) test8397(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID9.toString(), "48cb3747-7fe5-4280-9eb4-31f5231b96a5");
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8398");
        model.Equipment equipment3 = new model.Equipment("User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f1ea51e9-55fc-4e71-acfb-85dac53d0a33, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=90ba057e-77e2-414a-b29f-3ebb5ba74c18, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8399");
        model.Student student3 = new model.Student("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "Researcher", "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8400");
        model.Student student3 = new model.Student("User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}", "User{userId=e198018f-95c6-450a-ad5f-675ecbf69376, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        boolean boolean4 = student3.isActive();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8401");
        model.Guest guest3 = new model.Guest("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8402");
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
        java.lang.String str22 = equipment3.getDescription();
        java.lang.String str23 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8403");
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
        observer.EquipmentObserver equipmentObserver39 = null;
        equipment23.attach(equipmentObserver39);
        state.EquipmentState equipmentState41 = equipment23.getCurrentState();
        equipment23.setStatus("User{userId=2b4c9a26-1064-4981-a41f-2dfde4fda27e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(equipmentState41);
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8404");
        model.Guest guest3 = new model.Guest("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        boolean boolean4 = guest3.isActive();
        boolean boolean5 = guest3.isActive();
        java.util.UUID uUID6 = guest3.getUserId();
        boolean boolean7 = guest3.isActive();
        double double8 = guest3.getHourlyRate();
        java.util.UUID uUID9 = guest3.getUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "76) test8404(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "7203ef3d-1469-4340-8db3-fa5ecbfcf6e0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "12) test8404(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID9.toString(), "7203ef3d-1469-4340-8db3-fa5ecbfcf6e0");
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8405");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        labManager5.setEmail("LM-CERT");
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID19 = null;
        headLabCoordinator16.setUserId(uUID19);
        model.LabManager labManager22 = headLabCoordinator16.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        equipment26.enable();
        labManager22.addEquipment(equipment26);
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.lang.String str33 = equipment32.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment32.isModifyAvailable(localDateTime34, localDateTime35, "hi!", reservation37);
        java.lang.String str39 = equipment32.getDescription();
        state.EquipmentState equipmentState40 = equipment32.getCurrentState();
        equipment32.setLabLocation("Student");
        labManager22.setEquipmentStatus(equipment32, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment48 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment48.isModifyAvailable(localDateTime49, localDateTime50, "Faculty", reservation52);
        equipment48.setLabLocation("Faculty");
        java.lang.String str56 = equipment48.getDescription();
        java.lang.String str57 = equipment48.getEquipmentId();
        equipment48.notifyObservers();
        equipment48.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment48.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str63 = equipment48.getDescription();
        labManager22.markMaintenance(equipment48);
        java.lang.String str65 = labManager22.getEmail();
        model.Equipment equipment69 = new model.Equipment("", "", "");
        equipment69.enable();
        equipment69.setStatus("ACTIVE");
        equipment69.notifyObservers();
        java.lang.String str74 = equipment69.getEquipmentId();
        labManager22.addEquipment(equipment69);
        observer.EquipmentObserver equipmentObserver76 = null;
        equipment69.attach(equipmentObserver76);
        labManager5.setEquipmentStatus(equipment69, "User{userId=9b1af404-0cfd-4fdc-8ae6-20ec614069ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str63, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ACTIVE" + "'", str65, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8406");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=8d10c7c1-eb42-4cab-9b63-c0617b0e2696, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=51cbbb47-5180-4f76-aa2c-4d505de22e42, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8407");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.lang.String str14 = equipment13.getDescription();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment13.isModifyAvailable(localDateTime15, localDateTime16, "hi!", reservation18);
        java.lang.String str20 = equipment13.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment13.isAvailable(localDateTime21, localDateTime22, "Faculty");
        equipment13.notifyObservers();
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment13.attach(equipmentObserver26);
        labManager5.addEquipment(equipment13);
        double double29 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator33 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager35 = headLabCoordinator33.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager35.setActive(true);
        java.lang.String str38 = labManager35.getStatus();
        model.Equipment equipment42 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        model.Reservation reservation46 = null;
        boolean boolean47 = equipment42.isModifyAvailable(localDateTime43, localDateTime44, "Faculty", reservation46);
        equipment42.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment42.isModifyAvailable(localDateTime50, localDateTime51, "", reservation53);
        labManager35.markMaintenance(equipment42);
        equipment42.enable();
        java.lang.String str57 = equipment42.getLabLocation();
        observer.EquipmentObserver equipmentObserver58 = null;
        equipment42.attach(equipmentObserver58);
        labManager5.addEquipment(equipment42);
        state.EquipmentState equipmentState61 = equipment42.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment42.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ACTIVE" + "'", str38, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Faculty" + "'", str57, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState61);
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8408");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        java.lang.String str8 = equipment3.toString();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.attach(equipmentObserver12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8409");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=eaef1127-8fef-4b05-b547-3f67fc622521, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8410");
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
        equipment37.disable();
        java.lang.String str54 = equipment37.toString();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Student', status='Disabled'}" + "'", str54, "Equipment{equipmentId='', description='', labLocation='Student', status='Disabled'}");
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8411");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getIdOrCertNumber();
        java.lang.String str10 = labManager5.getRole();
        labManager5.setIdOrCertNumber("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID21 = null;
        headLabCoordinator18.setUserId(uUID21);
        model.LabManager labManager24 = headLabCoordinator18.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        equipment28.enable();
        labManager24.addEquipment(equipment28);
        java.lang.String str31 = equipment28.toString();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean35 = equipment28.isAvailable(localDateTime32, localDateTime33, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str36 = equipment28.getLabLocation();
        equipment28.disable();
        equipment28.enable();
        observer.EquipmentObserver equipmentObserver39 = null;
        equipment28.detach(equipmentObserver39);
        labManager5.setEquipmentStatus(equipment28, "Equipment{equipmentId='', description='', labLocation='Guest', status=''}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str31, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8412");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        equipment3.setDescription("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        java.lang.String str16 = equipment3.getDescription();
        java.lang.String str17 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}" + "'", str16, "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}" + "'", str17, "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8413");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getPasswordHash();
        java.lang.String str7 = student3.getIdOrCertNumber();
        java.lang.String str8 = student3.getRole();
        model.Guest guest12 = new model.Guest("", "hi!", "hi!");
        java.lang.String str13 = guest12.getRole();
        double double14 = guest12.getHourlyRate();
        double double15 = guest12.getHourlyRate();
        java.lang.String str16 = guest12.getRole();
        java.lang.String str17 = guest12.getRole();
        guest12.setEmail("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str20 = guest12.getIdOrCertNumber();
        java.lang.String str21 = guest12.getRole();
        guest12.setPasswordHash("User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        double double24 = guest12.getHourlyRate();
        java.util.UUID uUID25 = guest12.getUserId();
        student3.setUserId(uUID25);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 25.0d + "'", double24 == 25.0d);
        org.junit.Assert.assertNotNull(uUID25);
// flaky "77) test8413(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID25.toString(), "f3fe9270-c735-4ce6-84b5-8b33db910144");
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8414");
        model.Researcher researcher3 = new model.Researcher("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getStatus();
        java.lang.String str7 = researcher3.getPasswordHash();
        java.lang.String str8 = researcher3.getEmail();
        java.lang.String str9 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str7, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str8, "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8415");
        model.Faculty faculty3 = new model.Faculty("User{userId=d48def6c-4fec-478e-a393-cacc8653679f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=49a9859a-803e-4ebb-980e-71bb79a4aaa0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7815e200-41e2-4279-b043-ecc7071b94e4, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8416");
        model.Faculty faculty3 = new model.Faculty("User{userId=ccf87e28-a49b-4770-9130-f74518c41952, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=ad0bebd6-9d5c-424e-99fd-c6cffb2ed466, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}'}");
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8417");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPasswordHash();
        java.lang.String str7 = student3.getRole();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8418");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.attach(equipmentObserver15);
        equipment3.setLabLocation("User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8419");
        model.LabManager labManager3 = new model.LabManager("User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        labManager9.markMaintenance(equipment13);
        java.lang.String str15 = equipment13.getStatus();
        java.lang.String str16 = equipment13.getStatus();
        state.EquipmentState equipmentState17 = equipment13.getCurrentState();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment13.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=06511b06-101b-4e3c-8891-7552d15fb9d3, email='', status='ACTIVE', idOrCertNumber='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', role='Guest'}", reservation21);
        labManager3.setEquipmentStatus(equipment13, "User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student28 = new model.Student("", "hi!", "");
        java.lang.String str29 = student28.getEmail();
        double double30 = student28.getHourlyRate();
        boolean boolean31 = student28.isActive();
        java.util.UUID uUID32 = student28.getUserId();
        labManager3.setUserId(uUID32);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Maintenance" + "'", str15, "Maintenance");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Maintenance" + "'", str16, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(uUID32);
// flaky "78) test8419(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID32.toString(), "05ee3d6b-dddd-4689-ab1c-6ac35b1ea26b");
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8420");
        model.Researcher researcher3 = new model.Researcher("User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.lang.String str4 = researcher3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8421");
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
        labManager5.setEmail("User{userId=8dcd7ace-f4ee-456e-8526-9782c8d05652, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double38 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8422");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getDescription();
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.detach(equipmentObserver8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8423");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("");
        java.lang.String str13 = equipment9.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = equipment9.isAvailable(localDateTime14, localDateTime15, "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = equipment9.toString();
        model.SensorUpdate sensorUpdate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8424");
        model.Researcher researcher3 = new model.Researcher("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        boolean boolean7 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8425");
        model.Faculty faculty3 = new model.Faculty("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        faculty3.setActive(false);
        faculty3.setIdOrCertNumber("User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8426");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setPasswordHash("");
        java.lang.String str6 = faculty3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8427");
        model.Student student3 = new model.Student("", "Temp123!", "User{userId=03d04727-c0b8-41f6-8c22-90315f144551, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        student3.setIdOrCertNumber("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8428");
        model.Student student3 = new model.Student("User{userId=243669df-4a1b-4f9d-93e3-020d0702a30e, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=36ec8a69-be7f-40d4-8140-360eb3dd24e9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8429");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8430");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getPasswordHash();
        java.lang.String str12 = researcher3.getStatus();
        java.lang.String str13 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "79) test8430(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "105fe493-f0fd-422a-ba04-edb7f456ab36");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8431");
        model.Equipment equipment3 = new model.Equipment("User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=184e30c2-a69c-4f1f-9887-026cbd4ed4bb, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}", "User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        equipment3.markMaintenance();
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8432");
        model.Equipment equipment3 = new model.Equipment("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = equipment3.getStatus();
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
        equipment14.setLabLocation("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str28 = equipment14.getEquipmentId();
        java.lang.String str29 = equipment14.getStatus();
        state.EquipmentState equipmentState30 = equipment14.getCurrentState();
        equipment3.setState(equipmentState30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Disabled" + "'", str29, "Disabled");
        org.junit.Assert.assertNotNull(equipmentState30);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8433");
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
        java.lang.String str24 = equipment13.getStatus();
        equipment13.setLabLocation("User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str27 = equipment13.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8434");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.setStatus("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean16 = equipment3.isAvailable(localDateTime13, localDateTime14, "User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.setLabLocation("User{userId=7788a291-e66b-4dd2-ad62-256e4905cfb1, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment3.isAvailable(localDateTime19, localDateTime20, "User{userId=6f8bc8f8-6ed6-4508-ab97-4a82054f299d, email='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8435");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getStatus();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = labManager10.getStatus();
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment15.isModifyAvailable(localDateTime16, localDateTime17, "Faculty", reservation19);
        equipment15.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment15.isModifyAvailable(localDateTime23, localDateTime24, "", reservation26);
        state.EquipmentState equipmentState28 = equipment15.getCurrentState();
        observer.EquipmentObserver equipmentObserver29 = null;
        equipment15.detach(equipmentObserver29);
        equipment15.setDescription("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        equipment15.setLabLocation("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.lang.String str35 = equipment15.toString();
        labManager10.addEquipment(equipment15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment{equipmentId='', description='User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', labLocation='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}', status='Available'}" + "'", str35, "Equipment{equipmentId='', description='User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', labLocation='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}', status='Available'}");
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8436");
        model.Guest guest3 = new model.Guest("User{userId=233374d3-fa1f-4da7-8012-7434b8b7554e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=0737034a-748f-4b0f-bd8e-8c87ca1eb4b0, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=35b83f94-3cbf-40e0-97e0-8289b19cddd0, email='User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.lang.String str14 = equipment7.getEquipmentId();
        equipment7.setStatus("");
        state.EquipmentState equipmentState17 = equipment7.getCurrentState();
        equipment7.disable();
        equipment7.notifyObservers();
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment7.detach(equipmentObserver20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        strategy.PricingStrategy pricingStrategy24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation25 = new model.Reservation((model.User) guest3, equipment7, localDateTime22, localDateTime23, pricingStrategy24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(equipmentState17);
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8437");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getIdOrCertNumber();
        java.lang.String str12 = researcher3.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "80) test8437(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID7.toString(), "d03ee68f-39dd-4853-a04c-9bb43e3c34f4");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8438");
        model.LabManager labManager3 = new model.LabManager("User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=2ed6452a-1630-4bcb-9315-2b0c135a3a9e, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8439");
        model.Faculty faculty3 = new model.Faculty("User{userId=e90bb683-822f-419c-8d33-7a74a7f19a20, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8440");
        model.Equipment equipment3 = new model.Equipment("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Maintenance");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=b46b0ed3-c6e6-426a-a1c0-f480d4f1afb4, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}", reservation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8441");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='Guest'}", "User{userId=9259ab1e-99ff-4fc7-a7c5-e086350ee87d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8442");
        model.Faculty faculty3 = new model.Faculty("User{userId=1d9bd833-1411-4ea6-9795-0d8168f502c8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Disabled'}", "Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8443");
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
        java.lang.String str65 = equipment62.toString();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        boolean boolean69 = equipment62.isAvailable(localDateTime66, localDateTime67, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str70 = equipment62.getLabLocation();
        equipment62.disable();
        java.lang.String str72 = equipment62.toString();
        labManager5.addEquipment(equipment62);
        equipment62.markMaintenance();
        java.lang.String str75 = equipment62.getDescription();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str65, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}" + "'", str72, "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8444");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8445");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str13 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8446");
        model.Equipment equipment3 = new model.Equipment("User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation7);
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        labManager14.addEquipment(equipment18);
        equipment18.setLabLocation("hi!");
        equipment18.setDescription("Researcher");
        state.EquipmentState equipmentState24 = equipment18.getCurrentState();
        state.EquipmentState equipmentState25 = equipment18.getCurrentState();
        equipment3.setState(equipmentState25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertNotNull(equipmentState25);
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8447");
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
        java.lang.String str64 = labManager5.getPasswordHash();
        double double65 = labManager5.getHourlyRate();
        java.lang.String str66 = labManager5.getPasswordHash();
        java.lang.String str67 = labManager5.getRole();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Temp123!" + "'", str64, "Temp123!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Temp123!" + "'", str66, "Temp123!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LabManager" + "'", str67, "LabManager");
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8448");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getStatus();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=df665be6-8191-4ff6-a262-989922f4d8d3, email='User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID4);
// flaky "81) test8448(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "a93aa080-9397-4081-917d-5cd802392bfd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8449");
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
        state.EquipmentState equipmentState18 = equipment3.getCurrentState();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertNotNull(equipmentState18);
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8450");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8451");
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
        equipment51.setLabLocation("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver70 = null;
        equipment51.attach(equipmentObserver70);
        labManager5.setEquipmentStatus(equipment51, "INACTIVE");
        observer.EquipmentObserver equipmentObserver74 = null;
        equipment51.attach(equipmentObserver74);
        // The following exception was thrown during execution in test generation
        try {
            equipment51.notifyObservers();
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
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState66);
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8452");
        model.Faculty faculty3 = new model.Faculty("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getStatus();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
// flaky "82) test8452(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=72578501-b487-428e-9228-8b5267849abd, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}" + "'", str7, "User{userId=72578501-b487-428e-9228-8b5267849abd, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8453");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.isActive();
        java.lang.String str8 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8454");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getPasswordHash();
        double double8 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str11 = student3.getRole();
        student3.setPasswordHash("User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setPasswordHash("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean16 = student3.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8455");
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
        equipment14.notifyObservers();
        java.lang.String str19 = equipment14.getStatus();
        java.lang.String str20 = equipment14.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Maintenance" + "'", str19, "Maintenance");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8456");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.util.UUID uUID6 = student3.getUserId();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(uUID6);
// flaky "83) test8456(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "173375bf-7167-443d-ae27-61ab417ab3c0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8457");
        model.Guest guest3 = new model.Guest("User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=5bccdc97-eca9-4150-a2a4-d885f4ec051f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8458");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Faculty faculty9 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str10 = faculty9.getRole();
        faculty9.setEmail("hi!");
        java.lang.String str13 = faculty9.getRole();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Guest");
        labManager19.setPasswordHash("LM-CERT");
        java.util.UUID uUID22 = labManager19.getUserId();
        faculty9.setUserId(uUID22);
        labManager5.setUserId(uUID22);
        double double25 = labManager5.getHourlyRate();
        model.Equipment equipment29 = new model.Equipment("", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str30 = equipment29.getLabLocation();
        state.EquipmentState equipmentState31 = equipment29.getCurrentState();
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment29.detach(equipmentObserver32);
        labManager5.setEquipmentStatus(equipment29, "User{userId=0f96235d-27f1-40fd-98af-c179148a0401, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(uUID22);
// flaky "84) test8458(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID22.toString(), "dea58620-562b-47ca-bfc0-5896a653c4b3");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str30, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8459");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Temp123!", "User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "85) test8459(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "bcfce17a-1b92-4fe8-817a-3ee3226d6908");
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8460");
        model.Equipment equipment3 = new model.Equipment("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setStatus("User{userId=21ec2b50-3736-473a-8d9d-ad02101846a9, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        java.lang.String str9 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}" + "'", str9, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8461");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        java.lang.String str9 = equipment3.getStatus();
        java.lang.String str10 = equipment3.toString();
        java.lang.String str11 = equipment3.getEquipmentId();
        equipment3.disable();
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8462");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getRole();
        double double12 = researcher3.getHourlyRate();
        double double13 = researcher3.getHourlyRate();
        double double14 = researcher3.getHourlyRate();
        double double15 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8463");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "86) test8463(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID4.toString(), "c85ace09-0cd8-4d81-b4ec-187ae71f2805");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8464");
        model.Equipment equipment3 = new model.Equipment("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9f8a7cb7-ec03-4354-aac7-a2aa3455fb18, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        equipment7.enable();
        equipment7.enable();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.markMaintenance();
        equipment7.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment7.markMaintenance();
        equipment7.notifyObservers();
        equipment7.setStatus("User{userId=7f202e65-5038-4bf8-b4ca-fade3879140d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager23.setActive(true);
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment35.isModifyAvailable(localDateTime36, localDateTime37, "Faculty", reservation39);
        equipment35.setLabLocation("Faculty");
        labManager31.setEquipmentStatus(equipment35, "");
        java.lang.String str45 = equipment35.toString();
        java.lang.String str46 = equipment35.getDescription();
        labManager23.addEquipment(equipment35);
        model.Equipment equipment51 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "ACTIVE");
        labManager23.markMaintenance(equipment51);
        model.Equipment equipment56 = new model.Equipment("", "", "");
        java.lang.String str57 = equipment56.getDescription();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment56.isModifyAvailable(localDateTime58, localDateTime59, "hi!", reservation61);
        java.lang.String str63 = equipment56.getEquipmentId();
        equipment56.setStatus("");
        java.lang.String str66 = equipment56.getStatus();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        boolean boolean70 = equipment56.isAvailable(localDateTime67, localDateTime68, "hi!");
        labManager23.markMaintenance(equipment56);
        model.HeadLabCoordinator headLabCoordinator75 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager77 = headLabCoordinator75.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment81 = new model.Equipment("", "", "");
        labManager77.addEquipment(equipment81);
        equipment81.setLabLocation("hi!");
        equipment81.setDescription("Researcher");
        state.EquipmentState equipmentState87 = equipment81.getCurrentState();
        state.EquipmentState equipmentState88 = equipment81.getCurrentState();
        equipment56.setState(equipmentState88);
        equipment7.setState(equipmentState88);
        equipment3.setState(equipmentState88);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str45, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(labManager77);
        org.junit.Assert.assertNotNull(equipmentState87);
        org.junit.Assert.assertNotNull(equipmentState88);
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8465");
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
        java.lang.String str27 = equipment12.getLabLocation();
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment12.attach(equipmentObserver28);
        // The following exception was thrown during execution in test generation
        try {
            equipment12.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8466");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a589f573-319a-4723-a067-0220546441f7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8467");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=0339e116-af52-4aef-bd2a-2b16f7d9b446, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}", "User{userId=559cd54d-34d9-4afb-8ee9-adb79e1935a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}");
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8468");
        model.Faculty faculty3 = new model.Faculty("User{userId=d117ba49-c932-4404-9395-4a9f98496768, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3583d5fa-af62-4b4c-8323-53583710d891, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str4 = faculty3.getStatus();
        java.util.UUID uUID5 = faculty3.getUserId();
        java.lang.String str6 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "87) test8468(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID5.toString(), "7713e999-8fc7-4052-9944-d0536a225f9b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8469");
        model.Guest guest3 = new model.Guest("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=9c6242e6-d1a8-4386-bfc3-731c4f64fc86, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c6cccca0-8adc-406b-a117-45bcf62acaa3, email='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8470");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.lang.String str10 = faculty3.getRole();
        java.util.UUID uUID11 = faculty3.getUserId();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        double double16 = headLabCoordinator15.getHourlyRate();
        java.lang.String str17 = headLabCoordinator15.getRole();
        model.LabManager labManager19 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        double double22 = labManager21.getHourlyRate();
        model.Student student26 = new model.Student("", "hi!", "");
        double double27 = student26.getHourlyRate();
        java.lang.String str28 = student26.getStatus();
        student26.setEmail("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.Guest guest34 = new model.Guest("", "hi!", "hi!");
        java.lang.String str35 = guest34.getRole();
        guest34.setEmail("Guest");
        double double38 = guest34.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator42 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager44 = headLabCoordinator42.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID45 = null;
        headLabCoordinator42.setUserId(uUID45);
        model.LabManager labManager48 = headLabCoordinator42.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager50 = headLabCoordinator42.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager52 = headLabCoordinator42.autoGenerateManagerAccount("INACTIVE");
        model.Faculty faculty56 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str57 = faculty56.getStatus();
        boolean boolean58 = faculty56.isActive();
        model.Faculty faculty62 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID63 = faculty62.getUserId();
        faculty56.setUserId(uUID63);
        labManager52.setUserId(uUID63);
        guest34.setUserId(uUID63);
        student26.setUserId(uUID63);
        java.lang.String str68 = student26.getIdOrCertNumber();
        model.Guest guest72 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID73 = guest72.getUserId();
        student26.setUserId(uUID73);
        labManager21.setUserId(uUID73);
        faculty3.setUserId(uUID73);
        java.lang.String str77 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "88) test8470(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "df0d6447-c062-4206-8c18-dd4f74156b14");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HeadLabCoordinator" + "'", str17, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "INACTIVE" + "'", str28, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Guest" + "'", str35, "Guest");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 25.0d + "'", double38 == 25.0d);
        org.junit.Assert.assertNotNull(labManager44);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ACTIVE" + "'", str57, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(uUID63);
// flaky "13) test8470(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID63.toString(), "dabaf7eb-230e-4136-ac44-0097f33cd463");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(uUID73);
// flaky "5) test8470(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID73.toString(), "694ffed7-5e55-4ecd-a5e6-55c8f4d6a86a");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Faculty" + "'", str77, "Faculty");
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8471");
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
        java.lang.String str32 = equipment25.getEquipmentId();
        equipment25.setStatus("User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        java.lang.String str35 = equipment25.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ACTIVE" + "'", str32, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}" + "'", str35, "User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8472");
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
        equipment65.setDescription("User{userId=4b16f8f6-5a9b-4489-8734-590690801362, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str77 = equipment65.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "89) test8472(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=85c029e1-28a3-4d45-9001-c454d88d29a3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=85c029e1-28a3-4d45-9001-c454d88d29a3, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str77, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8473");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str8 = faculty7.getRole();
        faculty7.setEmail("hi!");
        boolean boolean11 = faculty7.isActive();
        java.util.UUID uUID12 = faculty7.getUserId();
        headLabCoordinator3.setUserId(uUID12);
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        equipment19.markMaintenance();
        equipment19.setLabLocation("HeadLabCoordinator");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment19.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        equipment19.setLabLocation("User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        labManager15.setEquipmentStatus(equipment19, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str38 = labManager15.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uUID12);
// flaky "90) test8473(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID12.toString(), "c1b721cb-e747-47e6-830f-a54e0f9bd7ce");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LM-CERT" + "'", str38, "LM-CERT");
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8474");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = labManager5.getPasswordHash();
        java.lang.String str7 = labManager5.getRole();
        double double8 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Temp123!" + "'", str6, "Temp123!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8475");
        model.LabManager labManager3 = new model.LabManager("User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=efa030bc-fac4-447a-ba4b-a90dab22147d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = labManager3.getEmail();
        java.lang.String str5 = labManager3.toString();
        java.lang.String str6 = labManager3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "91) test8475(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=3e08624a-9292-49be-864c-723efd9bba9b, email='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}" + "'", str5, "User{userId=3e08624a-9292-49be-864c-723efd9bba9b, email='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}");
// flaky "14) test8475(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=3e08624a-9292-49be-864c-723efd9bba9b, email='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}" + "'", str6, "User{userId=3e08624a-9292-49be-864c-723efd9bba9b, email='User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}");
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8476");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        boolean boolean4 = headLabCoordinator3.isActive();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8477");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=30909529-ca32-407a-b96c-ed20436c9982, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8478");
        model.Guest guest3 = new model.Guest("User{userId=401951d3-1ad3-47aa-aff0-9770cc616221, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
    }

    @Test
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8479");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        labManager7.setEmail("Temp123!");
        java.lang.String str10 = labManager7.getRole();
        java.lang.String str11 = labManager7.getRole();
        model.LabManager labManager15 = new model.LabManager("Researcher", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Temp123!");
        double double16 = labManager15.getHourlyRate();
        model.LabManager labManager20 = new model.LabManager("hi!", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str21 = labManager20.getRole();
        model.LabManager labManager25 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher29 = new model.Researcher("", "hi!", "hi!");
        researcher29.setEmail("hi!");
        double double32 = researcher29.getHourlyRate();
        java.util.UUID uUID33 = researcher29.getUserId();
        labManager25.setUserId(uUID33);
        labManager20.setUserId(uUID33);
        labManager15.setUserId(uUID33);
        labManager7.setUserId(uUID33);
        double double38 = labManager7.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
        org.junit.Assert.assertNotNull(uUID33);
// flaky "92) test8479(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID33.toString(), "f755fa78-c048-45f9-b9ec-08dec525c766");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8480");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        model.SensorUpdate sensorUpdate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8481");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.getEquipmentId();
        equipment3.setDescription("Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Maintenance'}");
        java.lang.String str7 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Maintenance'}" + "'", str7, "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Maintenance'}");
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8482");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.util.UUID uUID5 = student3.getUserId();
        java.lang.String str6 = student3.getRole();
        student3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "93) test8482(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID5.toString(), "d335b570-aa28-423c-a089-e47e8d12b491");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8483");
        model.Faculty faculty3 = new model.Faculty("User{userId=901b5ec9-8859-437f-a95c-35eee87abbf9, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=807e43fb-e2d0-43d6-bb69-45857fcd3238, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8484");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=239ccd65-d159-47fa-88ed-c8f7e4af40e3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3e27d8b8-e194-4de9-ab82-045aa14c9125, email='Faculty', status='ACTIVE', idOrCertNumber='Available', role='Researcher'}", "User{userId=8e3fc914-a636-4d18-8479-c4b4b0e25f82, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        headLabCoordinator3.setPasswordHash("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8485");
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
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8486");
        model.Equipment equipment3 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str4 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8487");
        model.Equipment equipment3 = new model.Equipment("User{userId=fc1a163e-218d-4dc0-bddc-5b12fe14e227, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "Equipment{equipmentId='', description='ACTIVE', labLocation='', status='Researcher'}");
    }

    @Test
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8488");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8489");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getPasswordHash();
        java.lang.String str10 = guest3.getPasswordHash();
        double double11 = guest3.getHourlyRate();
        double double12 = guest3.getHourlyRate();
        double double13 = guest3.getHourlyRate();
        java.lang.String str14 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8490");
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
        double double15 = guest3.getHourlyRate();
        java.lang.String str16 = guest3.getStatus();
        java.lang.String str17 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "94) test8490(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID11.toString(), "406b6533-0168-4f77-90df-34bcda403266");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str17, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8491");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = labManager8.getIdOrCertNumber();
        java.lang.String str10 = labManager8.getPasswordHash();
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID17 = null;
        headLabCoordinator14.setUserId(uUID17);
        model.LabManager labManager20 = headLabCoordinator14.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment24 = new model.Equipment("", "", "");
        equipment24.enable();
        labManager20.addEquipment(equipment24);
        model.Equipment equipment30 = new model.Equipment("", "", "");
        java.lang.String str31 = equipment30.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment30.isModifyAvailable(localDateTime32, localDateTime33, "hi!", reservation35);
        java.lang.String str37 = equipment30.getDescription();
        state.EquipmentState equipmentState38 = equipment30.getCurrentState();
        equipment30.setLabLocation("Student");
        labManager20.setEquipmentStatus(equipment30, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment46 = new model.Equipment("", "", "");
        java.lang.String str47 = equipment46.getDescription();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment46.isModifyAvailable(localDateTime48, localDateTime49, "hi!", reservation51);
        equipment46.disable();
        equipment46.enable();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        boolean boolean58 = equipment46.isAvailable(localDateTime55, localDateTime56, "");
        labManager20.addEquipment(equipment46);
        labManager20.setActive(false);
        model.HeadLabCoordinator headLabCoordinator65 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double66 = headLabCoordinator65.getHourlyRate();
        java.lang.String str67 = headLabCoordinator65.getRole();
        java.lang.String str68 = headLabCoordinator65.getRole();
        java.lang.String str69 = headLabCoordinator65.toString();
        model.LabManager labManager71 = headLabCoordinator65.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment75 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment75.markMaintenance();
        labManager71.addEquipment(equipment75);
        observer.EquipmentObserver equipmentObserver78 = null;
        equipment75.detach(equipmentObserver78);
        labManager20.setEquipmentStatus(equipment75, "User{userId=efa030bc-fac4-447a-ba4b-a90dab22147d, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        labManager8.setEquipmentStatus(equipment75, "User{userId=b46b0ed3-c6e6-426a-a1c0-f480d4f1afb4, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver84 = null;
        equipment75.attach(equipmentObserver84);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "HeadLabCoordinator" + "'", str67, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "HeadLabCoordinator" + "'", str68, "HeadLabCoordinator");
// flaky "95) test8491(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "User{userId=16ca1057-f43e-40d3-9c05-7abdb65727ed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str69, "User{userId=16ca1057-f43e-40d3-9c05-7abdb65727ed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager71);
    }

    @Test
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8492");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setEmail("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        double double12 = guest3.getHourlyRate();
        java.lang.String str13 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8493");
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
        java.lang.String str95 = headLabCoordinator3.getStatus();
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
// flaky "96) test8493(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID81.toString(), "619d4c86-8288-4c2f-9426-040c8101f5e6");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Guest" + "'", str88, "Guest");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 25.0d + "'", double89 == 25.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Guest" + "'", str90, "Guest");
        org.junit.Assert.assertNotNull(uUID91);
// flaky "15) test8493(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID91.toString(), "4c226ad5-c5b4-4a41-a50a-137924d07c0d");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "ACTIVE" + "'", str95, "ACTIVE");
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8494");
        model.Guest guest3 = new model.Guest("Disabled", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = guest3.getIdOrCertNumber();
        boolean boolean5 = guest3.isActive();
        java.util.UUID uUID6 = guest3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str4, "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "97) test8494(randoop.RandoopRegressionTest16)":         org.junit.Assert.assertEquals(uUID6.toString(), "158cd7e9-fd03-441e-ba87-73a9d209b3b8");
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8495");
        model.Equipment equipment3 = new model.Equipment("User{userId=c01b9c68-ef1d-4c27-9322-2396a48f9ab7, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=f722108d-cd3a-47c7-9185-78959f57e1a0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a66dc658-223f-4bde-9f5d-e36e19a4e9ce, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8496");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double10 = labManager5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8497");
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
        java.lang.String str38 = equipment37.getStatus();
        equipment37.setLabLocation("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment37.setLabLocation("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str43 = equipment37.getLabLocation();
        labManager5.markMaintenance(equipment37);
        equipment37.markMaintenance();
        model.HeadLabCoordinator headLabCoordinator49 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager51 = headLabCoordinator49.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment55 = new model.Equipment("", "", "");
        labManager51.addEquipment(equipment55);
        state.EquipmentState equipmentState57 = equipment55.getCurrentState();
        equipment55.setStatus("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str60 = equipment55.getLabLocation();
        state.EquipmentState equipmentState61 = equipment55.getCurrentState();
        equipment37.setState(equipmentState61);
        java.lang.String str63 = equipment37.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Available" + "'", str38, "Available");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str43, "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager51);
        org.junit.Assert.assertNotNull(equipmentState57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(equipmentState61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Available" + "'", str63, "Available");
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test8498");
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
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver92 = null;
        equipment3.detach(equipmentObserver92);
        model.SensorUpdate sensorUpdate94 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate94);
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
    }
}
