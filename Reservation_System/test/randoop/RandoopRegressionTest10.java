package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5001");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getPasswordHash();
        student3.setEmail("User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        student3.setEmail("User{userId=e90bb683-822f-419c-8d33-7a74a7f19a20, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5002");
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
        model.HeadLabCoordinator headLabCoordinator63 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager65 = headLabCoordinator63.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID66 = null;
        headLabCoordinator63.setUserId(uUID66);
        model.LabManager labManager69 = headLabCoordinator63.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment73 = new model.Equipment("", "", "");
        equipment73.enable();
        labManager69.addEquipment(equipment73);
        equipment73.markMaintenance();
        state.EquipmentState equipmentState77 = equipment73.getCurrentState();
        equipment11.setState(equipmentState77);
        java.lang.String str79 = equipment11.getDescription();
        java.lang.String str80 = equipment11.getStatus();
        java.lang.String str81 = equipment11.getEquipmentId();
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
        org.junit.Assert.assertNotNull(labManager65);
        org.junit.Assert.assertNotNull(labManager69);
        org.junit.Assert.assertNotNull(equipmentState77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Maintenance" + "'", str80, "Maintenance");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5003");
        model.Equipment equipment3 = new model.Equipment("User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        equipment3.enable();
        java.lang.String str5 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5004");
        model.Guest guest3 = new model.Guest("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        guest3.setPasswordHash("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = guest3.getPasswordHash();
        java.lang.String str7 = guest3.getStatus();
        java.lang.String str8 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5005");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5006");
        model.LabManager labManager3 = new model.LabManager("User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID4 = labManager3.getUserId();
        java.lang.String str5 = labManager3.getEmail();
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager11.setActive(true);
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Guest");
        model.Equipment equipment23 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager19.markMaintenance(equipment23);
        labManager11.setEquipmentStatus(equipment23, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str27 = labManager11.getRole();
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        equipment31.disable();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment31.isModifyAvailable(localDateTime34, localDateTime35, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", reservation37);
        labManager11.addEquipment(equipment31);
        equipment31.setDescription("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment31, "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID4);
// flaky "1) test5006(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "99cfea15-af84-4ac7-8feb-cc580d114c63");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5007");
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
        java.lang.String str66 = equipment63.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "2) test5007(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID48.toString(), "aec55327-38ed-4c94-8f6a-0eb5cc4c630b");
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Equipment{equipmentId='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', description='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', labLocation='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', status='Maintenance'}" + "'", str66, "Equipment{equipmentId='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', description='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', labLocation='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', status='Maintenance'}");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5008");
        model.Equipment equipment3 = new model.Equipment("User{userId=a898ff7d-e85d-4a9f-8b42-d1f7b9dac49b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8b391cfd-512c-4e5b-8e89-720e61f3e49e, email='Available', status='ACTIVE', idOrCertNumber='Guest', role='Guest'}");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5009");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        java.lang.String str8 = labManager5.getStatus();
        double double9 = labManager5.getHourlyRate();
        model.Equipment equipment13 = new model.Equipment("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager5.markMaintenance(equipment13);
        model.Equipment equipment18 = new model.Equipment("", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment18.attach(equipmentObserver19);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        strategy.PricingStrategy pricingStrategy23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation24 = new model.Reservation((model.User) labManager5, equipment18, localDateTime21, localDateTime22, pricingStrategy23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5010");
        model.Researcher researcher3 = new model.Researcher("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5011");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getStatus();
        java.lang.String str8 = student3.getIdOrCertNumber();
        java.lang.String str9 = student3.getPasswordHash();
        student3.setEmail("User{userId=7e801a1f-c4a6-4388-9f4d-9ea12b274a0b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID12 = student3.getUserId();
        java.lang.String str13 = student3.getRole();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(uUID12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5012");
        model.Faculty faculty3 = new model.Faculty("User{userId=924395fa-7400-405d-a0d6-1fdaf774d9f3, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f0702ab6-26bb-4b90-b6f8-e3ceb27bde7e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5013");
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
        labManager8.setEmail("User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
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
        java.lang.String str43 = equipment31.getStatus();
        equipment31.markMaintenance();
        java.lang.String str45 = equipment31.getDescription();
        equipment31.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment51 = new model.Equipment("", "", "");
        java.lang.String str52 = equipment51.getDescription();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment51.isModifyAvailable(localDateTime53, localDateTime54, "hi!", reservation56);
        java.lang.String str58 = equipment51.getEquipmentId();
        equipment51.setStatus("");
        java.lang.String str61 = equipment51.getEquipmentId();
        state.EquipmentState equipmentState62 = equipment51.getCurrentState();
        equipment31.setState(equipmentState62);
        labManager8.setEquipmentStatus(equipment31, "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment31.setDescription("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Available" + "'", str43, "Available");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(equipmentState62);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5014");
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
        java.lang.String str40 = equipment24.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Maintenance" + "'", str40, "Maintenance");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5015");
        model.Researcher researcher3 = new model.Researcher("User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5016");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1d3df56c-d05a-465d-9f54-8ddc36d67bbb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e1a1932a-9bca-482d-a0b8-4adecd5fcfa5, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5017");
        model.Equipment equipment3 = new model.Equipment("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=d8859b82-6f4d-4999-9299-000db8f32de9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5018");
        model.Faculty faculty3 = new model.Faculty("User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=dc04c41d-6d44-4a5c-a585-7712564ca982, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5019");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = equipment9.getStatus();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        labManager17.addEquipment(equipment21);
        model.Equipment equipment26 = new model.Equipment("", "", "");
        java.lang.String str27 = equipment26.getDescription();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment26.isModifyAvailable(localDateTime28, localDateTime29, "hi!", reservation31);
        java.lang.String str33 = equipment26.getEquipmentId();
        equipment26.setStatus("");
        state.EquipmentState equipmentState36 = equipment26.getCurrentState();
        equipment21.setState(equipmentState36);
        equipment9.setState(equipmentState36);
        equipment9.setLabLocation("User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment9.setDescription("User{userId=c27432a0-c619-4671-81f6-1270a2c6539c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.SensorUpdate sensorUpdate43 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Maintenance" + "'", str11, "Maintenance");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(equipmentState36);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5020");
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
            equipment3.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState11);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5021");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        faculty3.setPasswordHash("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double11 = faculty3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        java.lang.String str16 = headLabCoordinator15.getRole();
        double double17 = headLabCoordinator15.getHourlyRate();
        java.util.UUID uUID18 = headLabCoordinator15.getUserId();
        faculty3.setUserId(uUID18);
        faculty3.setActive(false);
        faculty3.setPasswordHash("User{userId=9cdfc055-f384-46d6-a1e6-7af12c19a612, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HeadLabCoordinator" + "'", str16, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(uUID18);
// flaky "3) test5021(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID18.toString(), "c188cf59-da75-440c-afab-7d2d4d10e610");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5022");
        model.Faculty faculty3 = new model.Faculty("User{userId=a3f67ffb-7bc0-4eeb-aeac-9e62355a4f3a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5023");
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
        model.Equipment equipment71 = new model.Equipment("", "", "");
        java.lang.String str72 = equipment71.getDescription();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        model.Reservation reservation76 = null;
        boolean boolean77 = equipment71.isModifyAvailable(localDateTime73, localDateTime74, "hi!", reservation76);
        java.lang.String str78 = equipment71.getEquipmentId();
        equipment71.setStatus("");
        state.EquipmentState equipmentState81 = equipment71.getCurrentState();
        equipment71.disable();
        labManager5.markMaintenance(equipment71);
        equipment71.setDescription("User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str86 = equipment71.toString();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(equipmentState81);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Equipment{equipmentId='', description='User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='', status='Maintenance'}" + "'", str86, "Equipment{equipmentId='', description='User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='', status='Maintenance'}");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5024");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getPasswordHash();
        java.lang.String str11 = guest3.toString();
        java.lang.String str12 = guest3.getRole();
        guest3.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
// flaky "4) test5024(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=2ed6452a-1630-4bcb-9315-2b0c135a3a9e, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}" + "'", str11, "User{userId=2ed6452a-1630-4bcb-9315-2b0c135a3a9e, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5025");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getStatus();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        equipment3.enable();
        equipment3.setStatus("Equipment{equipmentId='', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
        equipment3.disable();
        model.SensorUpdate sensorUpdate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(equipmentState5);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5026");
        model.LabManager labManager3 = new model.LabManager("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=106c5b83-7ffa-4815-a617-f9fee4e302ba, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5027");
        model.Guest guest3 = new model.Guest("LM-CERT", "User{userId=26b81413-06a8-4c64-8597-7a07b2a5d441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5028");
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
        equipment40.setLabLocation("User{userId=eed3056d-5c45-40da-9dc1-7e60fb03b87c, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LabManager" + "'", str36, "LabManager");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ACTIVE" + "'", str44, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5029");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}", "User{userId=1554ca21-73b0-4404-bb69-3359b1ad427d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5030");
        model.Student student3 = new model.Student("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5031");
        model.LabManager labManager3 = new model.LabManager("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Student", "hi!");
        boolean boolean4 = labManager3.isActive();
        java.lang.String str5 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5032");
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
        equipment13.setStatus("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment13.notifyObservers();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment13.isAvailable(localDateTime26, localDateTime27, "INACTIVE");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment13.isAvailable(localDateTime30, localDateTime31, "User{userId=2ed6452a-1630-4bcb-9315-2b0c135a3a9e, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5033");
        model.Guest guest3 = new model.Guest("User{userId=f8d7b963-4b8c-4abe-889e-96b0d5f23b77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b76dad93-a9a6-436e-8a34-3b2cd667ae4c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5034");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isActive();
        java.lang.String str5 = faculty3.getPasswordHash();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5035");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setStatus("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", reservation16);
        equipment3.setDescription("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.attach(equipmentObserver20);
        java.lang.String str22 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5036");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.enable();
        java.lang.String str12 = equipment3.getEquipmentId();
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
        equipment3.setState(equipmentState71);
        equipment3.disable();
        equipment3.markMaintenance();
        java.lang.Class<?> wildcardClass76 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5037");
        model.Researcher researcher3 = new model.Researcher("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        researcher3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status='Maintenance'}");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5038");
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
        java.lang.String str15 = researcher3.getRole();
        researcher3.setIdOrCertNumber("User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str18 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5039");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = headLabCoordinator3.toString();
        double double15 = headLabCoordinator3.getHourlyRate();
        double double16 = headLabCoordinator3.getHourlyRate();
        java.lang.String str17 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(true);
        java.lang.String str20 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str14, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HeadLabCoordinator" + "'", str17, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HeadLabCoordinator" + "'", str20, "HeadLabCoordinator");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5040");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        equipment3.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5041");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.toString();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
// flaky "5) test5041(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=4340576e-c9a5-4ff1-904a-99702d1b38cb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=4340576e-c9a5-4ff1-904a-99702d1b38cb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5042");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        equipment3.enable();
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5043");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        equipment13.enable();
        labManager9.addEquipment(equipment13);
        equipment13.markMaintenance();
        state.EquipmentState equipmentState17 = equipment13.getCurrentState();
        java.lang.String str18 = equipment13.getLabLocation();
        equipment13.setStatus("User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment13.setDescription("User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5044");
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
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.detach(equipmentObserver20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5045");
        model.LabManager labManager3 = new model.LabManager("User{userId=f2350c2f-667b-4302-9224-356120937b5a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Guest", "User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5046");
        model.Guest guest3 = new model.Guest("", "User{userId=68d5639f-a3ac-4ba8-ad5b-a12ec5840871, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a316677c-638d-4d36-8514-24c5a2c43dd9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5047");
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
        equipment3.enable();
        equipment3.markMaintenance();
        java.lang.String str47 = equipment3.getStatus();
        java.lang.String str48 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Maintenance" + "'", str47, "Maintenance");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5048");
        model.Guest guest3 = new model.Guest("User{userId=750f3d96-95ea-461d-8549-46ae00a8624f, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=2b61a116-bb18-41f5-936e-b64e28c425ad, email='', status='INACTIVE', idOrCertNumber='', role='Student'}'}", "User{userId=d28aad2a-1471-4722-b1f1-bb9f785de1a8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5049");
        model.LabManager labManager3 = new model.LabManager("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        double double4 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5050");
        model.LabManager labManager3 = new model.LabManager("User{userId=085f7048-a388-4934-b99b-b7ad4fbf0cf9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Researcher", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5051");
        model.LabManager labManager3 = new model.LabManager("User{userId=862f6943-66ba-448f-9d6b-f46e755dd01c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=e47813b4-3b7a-4106-acde-94e7f711c987, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5052");
        model.Guest guest3 = new model.Guest("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5053");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        double double6 = headLabCoordinator3.getHourlyRate();
        model.Student student10 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str11 = student10.getRole();
        java.lang.String str12 = student10.getRole();
        java.lang.String str13 = student10.getRole();
        double double14 = student10.getHourlyRate();
        java.lang.String str15 = student10.getRole();
        java.lang.String str16 = student10.getRole();
        double double17 = student10.getHourlyRate();
        java.util.UUID uUID18 = student10.getUserId();
        headLabCoordinator3.setUserId(uUID18);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(uUID18);
// flaky "6) test5053(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID18.toString(), "62ab11a4-59c1-4506-a9b6-43e76384dd7c");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5054");
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
        java.lang.String str20 = equipment14.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Maintenance" + "'", str19, "Maintenance");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str20, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5055");
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
        double double58 = labManager11.getHourlyRate();
        java.lang.String str59 = labManager11.getPasswordHash();
        labManager11.setPasswordHash("User{userId=1104a47a-3f82-43dd-86c4-308fdaeeab9b, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str62 = labManager11.getRole();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Temp123!" + "'", str59, "Temp123!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "LabManager" + "'", str62, "LabManager");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5056");
        model.Researcher researcher3 = new model.Researcher("User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f14e415a-0e7a-490c-b5e3-54d137f0e6ac, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b0be294f-1eb5-4947-8ede-f53669a64426, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5057");
        model.Guest guest3 = new model.Guest("User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5058");
        model.LabManager labManager3 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment13.isModifyAvailable(localDateTime14, localDateTime15, "Faculty", reservation17);
        equipment13.setLabLocation("Faculty");
        labManager9.setEquipmentStatus(equipment13, "Guest");
        equipment13.setLabLocation("User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setEquipmentStatus(equipment13, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5059");
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
        state.EquipmentState equipmentState43 = equipment42.getCurrentState();
        equipment42.disable();
        equipment42.markMaintenance();
        labManager5.setEquipmentStatus(equipment42, "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment42.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(equipmentState43);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5060");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getIdOrCertNumber();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5061");
        model.LabManager labManager3 = new model.LabManager("User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=41f31af6-4f99-4647-80cd-55b847f8ea0c, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5062");
        model.Faculty faculty3 = new model.Faculty("User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7ecc4aa8-8078-4902-af88-377c904ab47a, email='hi!', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=7c8bec6d-719e-4756-aeec-1def59afc3f2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5063");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        equipment3.setStatus("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.detach(equipmentObserver13);
        java.lang.Class<?> wildcardClass15 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5064");
        model.Equipment equipment3 = new model.Equipment("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.setStatus("User{userId=a316677c-638d-4d36-8514-24c5a2c43dd9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5065");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5066");
        model.Researcher researcher3 = new model.Researcher("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5067");
        model.Equipment equipment3 = new model.Equipment("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setDescription("");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5068");
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
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment3.isModifyAvailable(localDateTime14, localDateTime15, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation17);
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.attach(equipmentObserver19);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=8868c252-060b-4413-9d0a-228b729ecd67, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5069");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        java.lang.String str9 = guest3.getRole();
        java.lang.String str10 = guest3.getIdOrCertNumber();
        double double11 = guest3.getHourlyRate();
        java.lang.String str12 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5070");
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
        model.HeadLabCoordinator headLabCoordinator29 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager31 = headLabCoordinator29.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment35.isModifyAvailable(localDateTime36, localDateTime37, "Faculty", reservation39);
        equipment35.setLabLocation("Faculty");
        labManager31.setEquipmentStatus(equipment35, "Guest");
        model.Equipment equipment48 = new model.Equipment("", "", "");
        labManager31.addEquipment(equipment48);
        equipment48.markMaintenance();
        labManager5.addEquipment(equipment48);
        equipment48.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5071");
        model.Guest guest3 = new model.Guest("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        java.lang.String str4 = guest3.getPasswordHash();
        java.util.UUID uUID5 = guest3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "7) test5071(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID5.toString(), "f93a57ee-a505-426f-8496-a33abc3fe374");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5072");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5073");
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
        double double14 = guest3.getHourlyRate();
        double double15 = guest3.getHourlyRate();
        java.lang.String str16 = guest3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5074");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=29c65afa-dc4f-4bb3-8e6c-595f8600585d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=b22ea40b-51ce-4c5d-80b2-df6930d5080e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5075");
        model.Equipment equipment3 = new model.Equipment("User{userId=b22ea40b-51ce-4c5d-80b2-df6930d5080e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
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
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5076");
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
        equipment3.enable();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=8cf4cad8-ad1b-4e8a-aa8c-bb54f44ad6f7, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", reservation19);
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5077");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=d8859b82-6f4d-4999-9299-000db8f32de9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=939a1235-014f-498a-be6b-747f2c3aa659, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5078");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=48857d9a-c43e-46dd-b863-1b39d64f980c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=559cd54d-34d9-4afb-8ee9-adb79e1935a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5079");
        model.Researcher researcher3 = new model.Researcher("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=090698b7-4713-4874-b7d9-bb772231c198, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5080");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=aba9aea5-5166-46f6-bd18-14b8b26e887d, email='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Available'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=df5ee050-a29d-4f6d-82fc-cf73ff972527, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment9.isModifyAvailable(localDateTime11, localDateTime12, "hi!", reservation14);
        java.lang.String str16 = equipment9.getEquipmentId();
        java.lang.String str17 = equipment9.getLabLocation();
        java.lang.String str18 = equipment9.getLabLocation();
        java.lang.String str19 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        strategy.PricingStrategy pricingStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation23 = new model.Reservation((model.User) headLabCoordinator3, equipment9, localDateTime20, localDateTime21, pricingStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5081");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        boolean boolean6 = labManager5.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5082");
        model.Researcher researcher3 = new model.Researcher("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        boolean boolean6 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5083");
        model.Faculty faculty3 = new model.Faculty("User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=42cc93a1-ad1b-47fe-916f-73f08d2eed3f, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5084");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double11 = headLabCoordinator3.getHourlyRate();
        java.lang.String str12 = headLabCoordinator3.getRole();
        java.lang.String str13 = headLabCoordinator3.getEmail();
        java.lang.String str14 = headLabCoordinator3.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "8) test5084(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7e43a81f-04ec-4138-becf-2c7d96c33af6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=7e43a81f-04ec-4138-becf-2c7d96c33af6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HeadLabCoordinator" + "'", str12, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ACTIVE" + "'", str14, "ACTIVE");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5085");
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
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        model.Reservation reservation56 = null;
        boolean boolean57 = equipment3.isModifyAvailable(localDateTime53, localDateTime54, "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation56);
        equipment3.setLabLocation("User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str60 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment3.isModifyAvailable(localDateTime61, localDateTime62, "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", reservation64);
        equipment3.setStatus("User{userId=21941c67-eca4-48cb-a788-201493d8e754, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver68 = null;
        equipment3.attach(equipmentObserver68);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5086");
        model.Faculty faculty3 = new model.Faculty("User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID4 = faculty3.getUserId();
        faculty3.setActive(false);
        java.lang.String str7 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "9) test5086(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "843a701b-33ab-47e4-a2f3-6dbb21f788fb");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5087");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        boolean boolean4 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5088");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.util.UUID uUID6 = guest3.getUserId();
        boolean boolean7 = guest3.isActive();
        double double8 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "10) test5088(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID6.toString(), "5bbb3d06-6f74-4bbe-98be-40d6a79dcd29");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5089");
        model.Faculty faculty3 = new model.Faculty("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Available", "LM-CERT");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5090");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID4 = labManager3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "11) test5090(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "b3ccb1d4-9ac6-41f9-ab0d-96d35fc59303");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5091");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        headLabCoordinator3.setEmail("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        double double16 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5092");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
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
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        model.Reservation reservation51 = null;
        boolean boolean52 = equipment47.isModifyAvailable(localDateTime48, localDateTime49, "Faculty", reservation51);
        equipment47.setLabLocation("Faculty");
        java.lang.String str55 = equipment47.getDescription();
        java.lang.String str56 = equipment47.getEquipmentId();
        equipment47.notifyObservers();
        equipment47.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment47.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str62 = equipment47.getDescription();
        labManager21.markMaintenance(equipment47);
        java.lang.String str64 = equipment47.getLabLocation();
        java.lang.String str65 = equipment47.getLabLocation();
        labManager5.markMaintenance(equipment47);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(equipmentState39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str62, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Faculty" + "'", str64, "Faculty");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Faculty" + "'", str65, "Faculty");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5093");
        model.Student student3 = new model.Student("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=79240c15-d213-437b-ba78-c6a463dfb265, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5094");
        model.Equipment equipment3 = new model.Equipment("Student", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setLabLocation("Available");
        equipment3.setDescription("User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='Student', description='User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='Available', status='Available'}" + "'", str8, "Equipment{equipmentId='Student', description='User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='Available', status='Available'}");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5095");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=6eada9ec-7c0c-4c7f-a1ec-894f2baf7e80, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "");
        headLabCoordinator3.setEmail("User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5096");
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
        model.Equipment equipment38 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str39 = equipment38.getLabLocation();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment38.isModifyAvailable(localDateTime40, localDateTime41, "Student", reservation43);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        model.Reservation reservation48 = null;
        boolean boolean49 = equipment38.isModifyAvailable(localDateTime45, localDateTime46, "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation48);
        labManager5.addEquipment(equipment38);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment38.isModifyAvailable(localDateTime51, localDateTime52, "User{userId=b8820fe4-4beb-4ec4-8510-73fc1f827dd1, email='Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', role='Student'}", reservation54);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5097");
        model.Guest guest3 = new model.Guest("User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}", "User{userId=a4dcf346-91fd-4ccf-9777-5b02050a272a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5098");
        model.Guest guest3 = new model.Guest("Disabled", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5099");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getPasswordHash();
        java.lang.String str11 = guest3.toString();
        double double12 = guest3.getHourlyRate();
        double double13 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
// flaky "12) test5099(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=68c26747-48df-4a23-8617-4275a1018532, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}" + "'", str11, "User{userId=68c26747-48df-4a23-8617-4275a1018532, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5100");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        student3.setActive(true);
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str11 = headLabCoordinator10.getRole();
        headLabCoordinator10.setEmail("Researcher");
        java.lang.String str14 = headLabCoordinator10.getStatus();
        double double15 = headLabCoordinator10.getHourlyRate();
        java.util.UUID uUID16 = headLabCoordinator10.getUserId();
        student3.setUserId(uUID16);
        boolean boolean18 = student3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ACTIVE" + "'", str14, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(uUID16);
// flaky "13) test5100(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID16.toString(), "db041215-cfe8-44e4-be8c-d9ba4b106aaa");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5101");
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
        java.lang.String str16 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver17 = null;
        equipment3.attach(equipmentObserver17);
        equipment3.setStatus("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5102");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("hi!");
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.toString();
        java.lang.String str9 = guest3.getStatus();
        java.lang.String str10 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
// flaky "14) test5102(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=44a4ebfb-d1d7-4c9a-9b38-2a5b50cdac1c, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}" + "'", str8, "User{userId=44a4ebfb-d1d7-4c9a-9b38-2a5b50cdac1c, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5103");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getRole();
        java.lang.String str8 = labManager5.getRole();
        java.lang.String str9 = labManager5.toString();
        model.Equipment equipment13 = new model.Equipment("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = equipment13.getDescription();
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment13.attach(equipmentObserver15);
        java.lang.String str17 = equipment13.getEquipmentId();
        labManager5.setEquipmentStatus(equipment13, "User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LabManager" + "'", str8, "LabManager");
// flaky "15) test5103(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=d01b17fd-faee-4bb6-bf9c-4246ff98e433, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str9, "User{userId=d01b17fd-faee-4bb6-bf9c-4246ff98e433, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str14, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}" + "'", str17, "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5104");
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
        java.lang.Class<?> wildcardClass27 = labManager3.getClass();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5105");
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
        java.lang.String str23 = equipment3.getLabLocation();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5106");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=3583d5fa-af62-4b4c-8323-53583710d891, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setActive(false);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "16) test5106(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "7dcaf5b2-d38d-435d-b313-59e636717203");
// flaky "1) test5106(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=7dcaf5b2-d38d-435d-b313-59e636717203, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=7dcaf5b2-d38d-435d-b313-59e636717203, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5107");
        model.Equipment equipment3 = new model.Equipment("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getStatus();
        equipment3.setDescription("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5108");
        model.Guest guest3 = new model.Guest("User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=ae2b59e4-1fff-4992-a436-d56566425098, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5109");
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
        boolean boolean18 = researcher3.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "17) test5109(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID14.toString(), "0cecc049-e137-4f69-ac07-7ab55890e7ab");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5110");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=e47813b4-3b7a-4106-acde-94e7f711c987, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=d48def6c-4fec-478e-a393-cacc8653679f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5111");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        headLabCoordinator3.setIdOrCertNumber("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setActive(false);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5112");
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
        guest3.setEmail("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5113");
        model.Researcher researcher3 = new model.Researcher("LM-CERT", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "INACTIVE");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5114");
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
        model.Equipment equipment63 = new model.Equipment("", "", "");
        java.lang.String str64 = equipment63.getDescription();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment63.isModifyAvailable(localDateTime65, localDateTime66, "hi!", reservation68);
        java.lang.String str70 = equipment63.getDescription();
        state.EquipmentState equipmentState71 = equipment63.getCurrentState();
        equipment63.setLabLocation("Student");
        equipment63.enable();
        equipment63.disable();
        equipment63.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str78 = equipment63.getLabLocation();
        equipment63.setStatus("Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        model.Reservation reservation84 = null;
        boolean boolean85 = equipment63.isModifyAvailable(localDateTime81, localDateTime82, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", reservation84);
        labManager3.addEquipment(equipment63);
        equipment63.setStatus("User{userId=64d5d52d-6558-4bc9-918f-05c3c1a5493c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
// flaky "18) test5114(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=e638fbc7-fbdc-4c67-9673-c505fd36c9fb, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=e638fbc7-fbdc-4c67-9673-c505fd36c9fb, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(equipmentState71);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Student" + "'", str78, "Student");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5115");
        model.Equipment equipment3 = new model.Equipment("User{userId=f6909f80-0a53-4885-b35e-a5995f6cbaf6, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5116");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getRole();
        java.lang.String str11 = faculty3.getRole();
        java.lang.String str12 = faculty3.toString();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
// flaky "19) test5116(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=8cc97d23-546a-454b-beec-c3df5ab728f3, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}" + "'", str12, "User{userId=8cc97d23-546a-454b-beec-c3df5ab728f3, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5117");
        model.Researcher researcher3 = new model.Researcher("User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str5, "User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5118");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "Equipment{equipmentId='', description='', labLocation='', status=''}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double6 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5119");
        model.Researcher researcher3 = new model.Researcher("User{userId=6d11d2d8-000a-4498-88ff-7e3b9b1e820b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=71fd9a8d-a737-4a52-9dc2-83c0b54bb559, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e638fbc7-fbdc-4c67-9673-c505fd36c9fb, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5120");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5121");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment3.enable();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5122");
        model.Researcher researcher3 = new model.Researcher("User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID4 = researcher3.getUserId();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "20) test5122(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "05c70a54-1502-4eba-b4cc-5444101182f8");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5123");
        model.Equipment equipment3 = new model.Equipment("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5124");
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
        model.Equipment equipment50 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str51 = equipment50.getEquipmentId();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean55 = equipment50.isAvailable(localDateTime52, localDateTime53, "Guest");
        observer.EquipmentObserver equipmentObserver56 = null;
        equipment50.attach(equipmentObserver56);
        java.lang.String str58 = equipment50.getEquipmentId();
        state.EquipmentState equipmentState59 = equipment50.getCurrentState();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        model.Reservation reservation63 = null;
        boolean boolean64 = equipment50.isModifyAvailable(localDateTime60, localDateTime61, "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation63);
        labManager6.setEquipmentStatus(equipment50, "");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Researcher" + "'", str51, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Researcher" + "'", str58, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5125");
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
        java.lang.String str34 = labManager5.getPasswordHash();
        labManager5.setActive(true);
        double double37 = labManager5.getHourlyRate();
        java.lang.String str38 = labManager5.getRole();
        java.lang.String str39 = labManager5.getPasswordHash();
        model.HeadLabCoordinator headLabCoordinator43 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager45 = headLabCoordinator43.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID46 = null;
        headLabCoordinator43.setUserId(uUID46);
        model.LabManager labManager49 = headLabCoordinator43.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment53 = new model.Equipment("", "", "");
        equipment53.enable();
        labManager49.addEquipment(equipment53);
        model.Equipment equipment59 = new model.Equipment("", "", "");
        java.lang.String str60 = equipment59.getDescription();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment59.isModifyAvailable(localDateTime61, localDateTime62, "hi!", reservation64);
        java.lang.String str66 = equipment59.getDescription();
        state.EquipmentState equipmentState67 = equipment59.getCurrentState();
        equipment59.setLabLocation("Student");
        labManager49.setEquipmentStatus(equipment59, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment59.notifyObservers();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        boolean boolean76 = equipment59.isAvailable(localDateTime73, localDateTime74, "");
        java.lang.String str77 = equipment59.getEquipmentId();
        labManager5.setEquipmentStatus(equipment59, "User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double80 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Temp123!" + "'", str34, "Temp123!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LabManager" + "'", str38, "LabManager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Temp123!" + "'", str39, "Temp123!");
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(equipmentState67);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5126");
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
        java.lang.String str54 = equipment29.toString();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Disabled'}" + "'", str54, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Disabled'}");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5127");
        model.Faculty faculty3 = new model.Faculty("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a6cd648c-c622-4401-8e3b-22fb077d9dc2, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='Researcher'}", "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
        java.lang.String str4 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}" + "'", str4, "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5128");
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
        java.lang.String str22 = equipment3.getStatus();
        java.lang.String str23 = equipment3.getStatus();
        state.EquipmentState equipmentState24 = equipment3.getCurrentState();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5129");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.toString();
        java.util.UUID uUID10 = labManager8.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
// flaky "21) test5129(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=ad716673-a02d-4fc5-a2ef-58ea8d5ce350, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str9, "User{userId=ad716673-a02d-4fc5-a2ef-58ea8d5ce350, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID10);
// flaky "2) test5129(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID10.toString(), "ad716673-a02d-4fc5-a2ef-58ea8d5ce350");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5130");
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
        java.util.UUID uUID44 = labManager5.getUserId();
        labManager5.setPasswordHash("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double47 = labManager5.getHourlyRate();
        double double48 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(uUID44);
// flaky "22) test5130(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID44.toString(), "b3565596-a476-430b-9c9f-6f4e7a6c1d55");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5131");
        model.Researcher researcher3 = new model.Researcher("User{userId=07c97905-b8e0-4c19-8a65-87b89491eac1, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=ff9a0819-1bdc-421a-9a3e-e5c538afdf42, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='LabManager'}", "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student7 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str8 = student7.getRole();
        java.lang.String str9 = student7.getRole();
        java.lang.String str10 = student7.getRole();
        double double11 = student7.getHourlyRate();
        double double12 = student7.getHourlyRate();
        double double13 = student7.getHourlyRate();
        java.util.UUID uUID14 = student7.getUserId();
        researcher3.setUserId(uUID14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(uUID14);
// flaky "23) test5131(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID14.toString(), "1223cfb0-4251-466b-82af-67658b58c1c3");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5132");
        model.Guest guest3 = new model.Guest("User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5133");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getStatus();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5134");
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
        java.lang.String str28 = faculty3.getEmail();
        faculty3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(uUID26);
// flaky "24) test5134(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID26.toString(), "049702ba-e088-407b-961a-850fdbf07f42");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5135");
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
        equipment36.disable();
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
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5136");
        model.LabManager labManager3 = new model.LabManager("LabManager", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Faculty");
        java.lang.String str4 = labManager3.getRole();
        model.Equipment equipment8 = new model.Equipment("", "", "");
        equipment8.enable();
        equipment8.enable();
        java.lang.String str11 = equipment8.getStatus();
        java.lang.String str12 = equipment8.getDescription();
        model.Equipment equipment16 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str17 = equipment16.getEquipmentId();
        java.lang.String str18 = equipment16.getEquipmentId();
        equipment16.enable();
        state.EquipmentState equipmentState20 = equipment16.getCurrentState();
        equipment8.setState(equipmentState20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment8.isModifyAvailable(localDateTime22, localDateTime23, "User{userId=8fb7250f-99b4-45ac-9104-fc1d190a24b3, email='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}', role='Guest'}", reservation25);
        labManager3.addEquipment(equipment8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5137");
        model.Researcher researcher3 = new model.Researcher("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LM-CERT");
        java.lang.String str4 = researcher3.getPasswordHash();
        researcher3.setActive(true);
        java.lang.String str7 = researcher3.getRole();
        java.lang.String str8 = researcher3.getRole();
        java.util.UUID uUID9 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertNotNull(uUID9);
// flaky "25) test5137(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID9.toString(), "5eafd0f2-b718-402f-9172-a52614408da9");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5138");
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
        model.HeadLabCoordinator headLabCoordinator50 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager52 = headLabCoordinator50.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID53 = null;
        headLabCoordinator50.setUserId(uUID53);
        model.LabManager labManager56 = headLabCoordinator50.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        equipment60.enable();
        labManager56.addEquipment(equipment60);
        observer.EquipmentObserver equipmentObserver63 = null;
        equipment60.detach(equipmentObserver63);
        state.EquipmentState equipmentState65 = equipment60.getCurrentState();
        equipment27.setState(equipmentState65);
        equipment27.setLabLocation("User{userId=0bed3626-dbde-4a71-af21-9c375d954793, email='Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        equipment27.disable();
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
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertNotNull(equipmentState65);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5139");
        model.Researcher researcher3 = new model.Researcher("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        researcher3.setEmail("User{userId=37ebb5ca-d470-461d-91c3-edceca8f8d4a, email='Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}', status='ACTIVE', idOrCertNumber='User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5140");
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
        equipment9.attach(equipmentObserver21);
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment9.attach(equipmentObserver23);
        model.HeadLabCoordinator headLabCoordinator28 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager30 = headLabCoordinator28.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment34.isModifyAvailable(localDateTime35, localDateTime36, "Faculty", reservation38);
        equipment34.setLabLocation("Faculty");
        labManager30.setEquipmentStatus(equipment34, "Guest");
        model.Equipment equipment47 = new model.Equipment("", "", "");
        labManager30.addEquipment(equipment47);
        boolean boolean49 = labManager30.isActive();
        labManager30.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment55 = new model.Equipment("", "", "");
        java.lang.String str56 = equipment55.getDescription();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment55.isModifyAvailable(localDateTime57, localDateTime58, "hi!", reservation60);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment55.isModifyAvailable(localDateTime62, localDateTime63, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation65);
        java.lang.String str67 = equipment55.toString();
        labManager30.addEquipment(equipment55);
        state.EquipmentState equipmentState69 = equipment55.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment9.setState(equipmentState69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str67, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState69);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5141");
        model.LabManager labManager3 = new model.LabManager("User{userId=f82982c6-37c2-47c1-b53a-5713bdd742d9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=8b391cfd-512c-4e5b-8e89-720e61f3e49e, email='Available', status='ACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5142");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = labManager5.toString();
        org.junit.Assert.assertNotNull(labManager5);
// flaky "26) test5142(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=46435d59-ef62-4806-ae22-0147e82a4319, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str6, "User{userId=46435d59-ef62-4806-ae22-0147e82a4319, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5143");
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
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment22.detach(equipmentObserver26);
        equipment22.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5144");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.toString();
        java.util.UUID uUID5 = labManager3.getUserId();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment9.isModifyAvailable(localDateTime10, localDateTime11, "Faculty", reservation13);
        equipment9.setLabLocation("Faculty");
        java.lang.String str17 = equipment9.getDescription();
        java.lang.String str18 = equipment9.getEquipmentId();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment9.isModifyAvailable(localDateTime19, localDateTime20, "INACTIVE", reservation22);
        java.lang.String str24 = equipment9.toString();
        equipment9.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str27 = equipment9.getStatus();
        labManager3.addEquipment(equipment9);
        equipment9.setDescription("User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment9.setDescription("User{userId=fb43e73c-5a86-4d1d-8f78-113e7f28ca03, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
// flaky "27) test5144(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=8c7cf43b-55d4-449e-baa4-513823dad99b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=8c7cf43b-55d4-449e-baa4-513823dad99b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "3) test5144(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID5.toString(), "8c7cf43b-55d4-449e-baa4-513823dad99b");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Available" + "'", str27, "Available");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5145");
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
        equipment9.setLabLocation("User{userId=7788a291-e66b-4dd2-ad62-256e4905cfb1, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str27 = equipment9.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5146");
        model.Equipment equipment3 = new model.Equipment("User{userId=74c1da88-3641-4d4c-87ef-ff7c77d2e098, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=974bc507-4222-41d9-b4b5-3ca25f281030, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        equipment7.disable();
        equipment7.enable();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment7.isAvailable(localDateTime16, localDateTime17, "");
        state.EquipmentState equipmentState20 = equipment7.getCurrentState();
        equipment3.setState(equipmentState20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(equipmentState20);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5147");
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
        java.lang.String str89 = equipment20.getDescription();
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
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "ACTIVE" + "'", str89, "ACTIVE");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5148");
        model.Equipment equipment3 = new model.Equipment("User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=c7366231-eb4a-4224-829a-c65d22971738, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.toString();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=c7366231-eb4a-4224-829a-c65d22971738, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}" + "'", str4, "Equipment{equipmentId='User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=c7366231-eb4a-4224-829a-c65d22971738, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState5);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5149");
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
        java.lang.String str42 = labManager5.getRole();
        model.Equipment equipment46 = new model.Equipment("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        equipment46.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str49 = equipment46.toString();
        labManager5.markMaintenance(equipment46);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LabManager" + "'", str40, "LabManager");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Temp123!" + "'", str41, "Temp123!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LabManager" + "'", str42, "LabManager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}" + "'", str49, "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5150");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPasswordHash();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5151");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        java.util.UUID uUID8 = faculty3.getUserId();
        java.lang.String str9 = faculty3.getRole();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "28) test5151(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID8.toString(), "ce7be3de-e41b-4208-a7a6-4885ab90b783");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5152");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = headLabCoordinator3.getEmail();
        java.lang.String str14 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=01385c35-4138-4f04-8b23-5a699771d1f4, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5153");
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
        equipment23.setStatus("");
        equipment23.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ACTIVE" + "'", str19, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5154");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str7, "User{userId=null, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5155");
        model.Equipment equipment3 = new model.Equipment("User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5156");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        boolean boolean7 = headLabCoordinator3.isActive();
        headLabCoordinator3.setIdOrCertNumber("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double10 = headLabCoordinator3.getHourlyRate();
        double double11 = headLabCoordinator3.getHourlyRate();
        double double12 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c27432a0-c619-4671-81f6-1270a2c6539c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.lang.String str19 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment18.isModifyAvailable(localDateTime20, localDateTime21, "hi!", reservation23);
        java.lang.String str25 = equipment18.getDescription();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment18.isAvailable(localDateTime26, localDateTime27, "Faculty");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.lang.String str34 = equipment33.getDescription();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment33.isModifyAvailable(localDateTime35, localDateTime36, "hi!", reservation38);
        java.lang.String str40 = equipment33.getDescription();
        state.EquipmentState equipmentState41 = equipment33.getCurrentState();
        equipment18.setState(equipmentState41);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment18.isAvailable(localDateTime43, localDateTime44, "Faculty");
        java.lang.String str47 = equipment18.getDescription();
        state.EquipmentState equipmentState48 = equipment18.getCurrentState();
        labManager14.setEquipmentStatus(equipment18, "User{userId=adce0ca0-d11b-438d-9dc0-cbb2ae94ebeb, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}");
        model.Equipment equipment51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        strategy.PricingStrategy pricingStrategy54 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation55 = new model.Reservation((model.User) labManager14, equipment51, localDateTime52, localDateTime53, pricingStrategy54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(equipmentState48);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5157");
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
        equipment35.disable();
        equipment35.setLabLocation("User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str49 = equipment35.getEquipmentId();
        java.lang.String str50 = equipment35.getLabLocation();
        labManager5.addEquipment(equipment35);
        model.HeadLabCoordinator headLabCoordinator55 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty59 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str60 = faculty59.getRole();
        faculty59.setEmail("hi!");
        boolean boolean63 = faculty59.isActive();
        java.util.UUID uUID64 = faculty59.getUserId();
        headLabCoordinator55.setUserId(uUID64);
        model.LabManager labManager67 = headLabCoordinator55.autoGenerateManagerAccount("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment71 = new model.Equipment("", "", "");
        java.lang.String str72 = equipment71.getDescription();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        model.Reservation reservation76 = null;
        boolean boolean77 = equipment71.isModifyAvailable(localDateTime73, localDateTime74, "hi!", reservation76);
        equipment71.markMaintenance();
        equipment71.setLabLocation("HeadLabCoordinator");
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        model.Reservation reservation84 = null;
        boolean boolean85 = equipment71.isModifyAvailable(localDateTime81, localDateTime82, "hi!", reservation84);
        equipment71.setLabLocation("User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
        labManager67.setEquipmentStatus(equipment71, "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager5.setEquipmentStatus(equipment71, "User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment71.setStatus("User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment71.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LM-CERT" + "'", str25, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str45, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str50, "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Faculty" + "'", str60, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(uUID64);
// flaky "29) test5157(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID64.toString(), "41136ec7-2851-4ff5-bfaa-af64b84edcd8");
        org.junit.Assert.assertNotNull(labManager67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5158");
        model.Student student3 = new model.Student("Faculty", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setEmail("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = student3.toString();
// flaky "30) test5158(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=c42ffe42-282d-43d0-8d65-3a5125880974, email='User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}" + "'", str6, "User{userId=c42ffe42-282d-43d0-8d65-3a5125880974, email='User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5159");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        java.util.UUID uUID7 = null;
        guest3.setUserId(uUID7);
        java.lang.String str9 = guest3.getIdOrCertNumber();
        java.lang.String str10 = guest3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5160");
        model.Faculty faculty3 = new model.Faculty("User{userId=f276cb30-cc86-449e-af7f-b94d06fa67e7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7ecc4aa8-8078-4902-af88-377c904ab47a, email='hi!', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5161");
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
        double double15 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5162");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        double double10 = headLabCoordinator3.getHourlyRate();
        java.lang.String str11 = headLabCoordinator3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5163");
        model.Faculty faculty3 = new model.Faculty("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Available", "LM-CERT");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5164");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=285f75ab-fb57-485a-addf-f9fa1aea97ef, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5165");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ec1cdb05-c503-42d6-9c44-e6a5310e091e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=7f761712-0dc2-46f5-a9ab-a40cb2c1208a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5166");
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
        java.lang.String str52 = equipment49.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5167");
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
        java.lang.String str65 = labManager3.getRole();
        double double66 = labManager3.getHourlyRate();
        labManager3.setPasswordHash("User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "LabManager" + "'", str65, "LabManager");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5168");
        model.Faculty faculty3 = new model.Faculty("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=d117ba49-c932-4404-9395-4a9f98496768, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5169");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str7 = labManager6.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "31) test5169(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "86f69ad1-566f-49b1-b9bb-be450358e409");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LabManager" + "'", str7, "LabManager");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5170");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.util.UUID uUID10 = labManager9.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "32) test5170(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID10.toString(), "c2637d32-5ea1-41d6-a0ad-ef560c9cc888");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5171");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}");
        equipment3.enable();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5172");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=edaf5b3a-38fd-4a81-a98d-320a37b65124, email='', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}", "User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5173");
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
        java.lang.String str23 = equipment11.getEquipmentId();
        equipment11.markMaintenance();
        equipment11.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5174");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        labManager5.setPasswordHash("Guest");
        java.lang.String str9 = labManager5.getRole();
        java.lang.String str10 = labManager5.getRole();
        model.Equipment equipment14 = new model.Equipment("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=10b8b7d7-0cc3-4706-901d-0e8ea0d6fe73, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        labManager5.setEquipmentStatus(equipment14, "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment14.setDescription("User{userId=08612780-e04d-442c-968e-9604fd961966, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str19 = equipment14.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str19, "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5175");
        model.LabManager labManager3 = new model.LabManager("User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3bede56e-e5bd-4d01-a847-d057cbb34b88, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=51a0bff6-a1d1-4a6b-9cbd-18657e1a4093, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5176");
        model.Guest guest3 = new model.Guest("User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=9dca83a1-a35d-4cad-bec0-49e13972189d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5177");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5178");
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
        java.lang.Class<?> wildcardClass61 = equipment54.getClass();
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
// flaky "33) test5178(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "User{userId=4bee53aa-fd84-4dea-8852-584977e648da, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str48, "User{userId=4bee53aa-fd84-4dea-8852-584977e648da, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5179");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getPasswordHash();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5180");
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
        java.lang.String str75 = labManager5.getEmail();
        model.Equipment equipment79 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment79.setLabLocation("ACTIVE");
        java.lang.String str82 = equipment79.getEquipmentId();
        equipment79.enable();
        equipment79.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment79.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        labManager5.addEquipment(equipment79);
        java.lang.String str89 = labManager5.getRole();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Faculty" + "'", str75, "Faculty");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "ACTIVE" + "'", str82, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "LabManager" + "'", str89, "LabManager");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5181");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        java.lang.String str6 = labManager3.getRole();
        double double7 = labManager3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5182");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        java.util.UUID uUID7 = student3.getUserId();
        java.lang.Class<?> wildcardClass8 = uUID7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "34) test5182(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID7.toString(), "2ffa9a32-b60f-4c55-a6a2-d29a16a04cd8");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5183");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e6619bcc-60c9-4e1c-ad88-aa1b2934fea7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str11 = labManager10.getRole();
        java.lang.String str12 = labManager10.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5184");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.getEmail();
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        boolean boolean9 = headLabCoordinator3.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5185");
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
        observer.EquipmentObserver equipmentObserver63 = null;
        equipment56.attach(equipmentObserver63);
        java.lang.Class<?> wildcardClass65 = equipment56.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5186");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=1104a47a-3f82-43dd-86c4-308fdaeeab9b, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4e2bf97b-2231-43ed-b46f-ea04514eea46, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f8911f10-f70b-4cd8-9f0c-8544648f051f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5187");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        boolean boolean6 = student3.isActive();
        java.lang.String str7 = student3.getRole();
        java.util.UUID uUID8 = student3.getUserId();
        boolean boolean9 = student3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(uUID8);
// flaky "35) test5187(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID8.toString(), "71272af2-3cff-443f-972c-1a0f651be924");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5188");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getIdOrCertNumber();
        java.lang.String str11 = guest3.getRole();
        boolean boolean12 = guest3.isActive();
        double double13 = guest3.getHourlyRate();
        double double14 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5189");
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
        state.EquipmentState equipmentState28 = equipment10.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState28);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5190");
        model.Researcher researcher3 = new model.Researcher("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getPasswordHash();
        researcher3.setPasswordHash("User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5191");
        model.Faculty faculty3 = new model.Faculty("User{userId=ac16180e-c994-4226-96ba-7796ddfa0394, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ebdc402e-ae5a-4238-9334-c4490a251952, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5192");
        model.Equipment equipment3 = new model.Equipment("User{userId=0a67e5a4-131c-4b0a-a6a3-f221d12cf100, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=d1f0e6e1-3c32-4a1e-8def-0331f056a9ec, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5193");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=7ae11a56-04fa-4a00-87a1-5fb47e9a81ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5194");
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
        equipment29.setDescription("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        model.SensorUpdate sensorUpdate59 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment29.applySensorUpdate(sensorUpdate59);
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
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5195");
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
        java.util.UUID uUID33 = labManager7.getUserId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Available" + "'", str28, "Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}" + "'", str29, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str30, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(uUID33);
// flaky "36) test5195(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID33.toString(), "d93725e9-4222-46d9-a1c8-bf48ebb35e93");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5196");
        model.Equipment equipment3 = new model.Equipment("User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.disable();
        equipment3.disable();
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
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5197");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        double double12 = headLabCoordinator3.getHourlyRate();
        java.lang.String str13 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5198");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        java.lang.String str7 = faculty3.getRole();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getPasswordHash();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5199");
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
        equipment3.markMaintenance();
        equipment3.setLabLocation("User{userId=6b7d0607-07ac-4d05-a5fc-bde0b0292564, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5200");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double12 = headLabCoordinator3.getHourlyRate();
        boolean boolean13 = headLabCoordinator3.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5201");
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
        state.EquipmentState equipmentState35 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment3.detach(equipmentObserver36);
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
        org.junit.Assert.assertNotNull(equipmentState35);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5202");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.getEquipmentId();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime6, localDateTime7, "User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        java.lang.String str28 = equipment13.toString();
        equipment13.setLabLocation("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean34 = equipment13.isAvailable(localDateTime31, localDateTime32, "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver35 = null;
        equipment13.attach(equipmentObserver35);
        state.EquipmentState equipmentState37 = equipment13.getCurrentState();
        equipment3.setState(equipmentState37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertNotNull(equipmentState5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str28, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(equipmentState37);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5203");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        headLabCoordinator3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5204");
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
        labManager10.setIdOrCertNumber("User{userId=511fb691-c5ed-4e18-bf1c-2bf1abb85810, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment75 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager10.addEquipment(equipment75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "37) test5204(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=f0af88da-6d08-4412-b2c3-202c3a81ec9f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=f0af88da-6d08-4412-b2c3-202c3a81ec9f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5205");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}', status='Maintenance'}", "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5206");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getStatus();
        java.lang.String str11 = researcher3.toString();
        java.lang.String str12 = researcher3.getIdOrCertNumber();
        double double13 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
// flaky "38) test5206(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=c0b86429-442e-46c9-8f93-60ee7f0f7d69, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str11, "User{userId=c0b86429-442e-46c9-8f93-60ee7f0f7d69, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5207");
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
        java.lang.String str57 = labManager9.getPasswordHash();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Maintenance" + "'", str57, "Maintenance");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5208");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getDescription();
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
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        labManager13.setEquipmentStatus(equipment35, "Guest");
        java.lang.String str44 = equipment35.getLabLocation();
        equipment35.markMaintenance();
        state.EquipmentState equipmentState46 = equipment35.getCurrentState();
        equipment3.setState(equipmentState46);
        equipment3.setLabLocation("User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(equipmentState46);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5209");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setStatus("LabManager");
        equipment3.notifyObservers();
        equipment3.enable();
        java.lang.String str14 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5210");
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
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.detach(equipmentObserver21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5211");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double10 = labManager5.getHourlyRate();
        java.lang.String str11 = labManager5.getIdOrCertNumber();
        boolean boolean12 = labManager5.isActive();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Guest");
        labManager18.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment30 = new model.Equipment("", "", "");
        labManager26.markMaintenance(equipment30);
        labManager18.markMaintenance(equipment30);
        double double33 = labManager18.getHourlyRate();
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment37.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        equipment37.setLabLocation("Faculty");
        java.lang.String str45 = equipment37.getDescription();
        java.lang.String str46 = equipment37.getEquipmentId();
        java.lang.String str47 = equipment37.getDescription();
        observer.EquipmentObserver equipmentObserver48 = null;
        equipment37.detach(equipmentObserver48);
        java.lang.String str50 = equipment37.getLabLocation();
        equipment37.disable();
        labManager18.markMaintenance(equipment37);
        labManager5.setEquipmentStatus(equipment37, "User{userId=9c2a6913-41cb-415b-928c-a5ec33d3400d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str55 = equipment37.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Faculty" + "'", str50, "Faculty");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Faculty" + "'", str55, "Faculty");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5212");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.setStatus("ACTIVE");
        java.lang.String str7 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5213");
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
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment11.attach(equipmentObserver26);
        // The following exception was thrown during execution in test generation
        try {
            equipment11.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5214");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.util.UUID uUID4 = null;
        headLabCoordinator3.setUserId(uUID4);
        boolean boolean6 = headLabCoordinator3.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5215");
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
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        model.Reservation reservation31 = null;
        boolean boolean32 = equipment27.isModifyAvailable(localDateTime28, localDateTime29, "Faculty", reservation31);
        equipment27.setLabLocation("Faculty");
        equipment27.notifyObservers();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment27.attach(equipmentObserver36);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment27.isModifyAvailable(localDateTime38, localDateTime39, "Faculty", reservation41);
        labManager7.setEquipmentStatus(equipment27, "User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean45 = labManager7.isActive();
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.lang.String str50 = equipment49.getDescription();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment49.isModifyAvailable(localDateTime51, localDateTime52, "hi!", reservation54);
        equipment49.disable();
        equipment49.enable();
        java.lang.String str58 = equipment49.getEquipmentId();
        java.lang.String str59 = equipment49.getStatus();
        labManager7.markMaintenance(equipment49);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Available" + "'", str59, "Available");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5216");
        model.Equipment equipment3 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        java.lang.String str4 = equipment3.getLabLocation();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(equipmentState5);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5217");
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
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment19.detach(equipmentObserver36);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5218");
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
        equipment14.setDescription("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        equipment14.markMaintenance();
        java.lang.String str21 = equipment14.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}" + "'", str21, "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5219");
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
        equipment3.enable();
        java.lang.String str16 = equipment3.getDescription();
        equipment3.setLabLocation("User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.disable();
        equipment3.notifyObservers();
        java.lang.String str21 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str21, "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5220");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        java.lang.String str11 = equipment3.getEquipmentId();
        equipment3.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str14 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5221");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setEmail("");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5222");
        model.Researcher researcher3 = new model.Researcher("User{userId=a589f573-319a-4723-a067-0220546441f7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=5f08fcff-c939-4193-9640-3d0ae1869dd4, email='', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5223");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5224");
        model.Guest guest3 = new model.Guest("User{userId=f8911f10-f70b-4cd8-9f0c-8544648f051f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bffa7436-366f-4280-aeb6-9a4c2f075740, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5657bea6-a83f-47dc-967e-4cd8ce83af03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5225");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getDescription();
        equipment3.setStatus("Researcher");
        equipment3.disable();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment3.isModifyAvailable(localDateTime14, localDateTime15, "User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation17);
        observer.EquipmentObserver equipmentObserver19 = null;
        equipment3.detach(equipmentObserver19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5226");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=973302bd-8017-4358-a99d-0a5fbb80d625, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=924395fa-7400-405d-a0d6-1fdaf774d9f3, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5227");
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
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment19.attach(equipmentObserver26);
        model.SensorUpdate sensorUpdate28 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment19.applySensorUpdate(sensorUpdate28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Available" + "'", str22, "Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5228");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setLabLocation("Researcher");
        java.lang.Class<?> wildcardClass10 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5229");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        labManager7.setEmail("Temp123!");
        java.lang.String str10 = labManager7.getRole();
        double double11 = labManager7.getHourlyRate();
        double double12 = labManager7.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5230");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        java.lang.String str8 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.detach(equipmentObserver9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(equipmentState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5231");
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
        equipment19.setLabLocation("User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5232");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=43aecc1b-360d-447e-84b4-3cc2e279b9d3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5233");
        model.Equipment equipment3 = new model.Equipment("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=645a9cf9-1800-407b-b218-37a32c688bf1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f7dae43f-2d64-419a-88ba-777672e87122, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5234");
        model.Student student3 = new model.Student("User{userId=530be193-bc81-4264-80de-0704ed046af8, email='Disabled', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "", "User{userId=ec28cbec-2339-4bfc-aeb3-88df32c6f2a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5235");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', description='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', labLocation='Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}', status='Maintenance'}", "User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ee5fd7dd-6809-40a3-b93c-b75c97a80800, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5236");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment3.notifyObservers();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.String str6 = equipment3.toString();
        equipment3.setDescription("User{userId=a8ca4fee-afc7-490b-bfb2-ca95c3372a57, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}" + "'", str6, "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5237");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        state.EquipmentState equipmentState4 = equipment3.getCurrentState();
        java.lang.Class<?> wildcardClass5 = equipmentState4.getClass();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5238");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5239");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}", "User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5240");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getRole();
        java.lang.String str9 = guest3.getRole();
        double double10 = guest3.getHourlyRate();
        java.lang.String str11 = guest3.getStatus();
        model.LabManager labManager15 = new model.LabManager("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str16 = labManager15.getRole();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID23 = null;
        headLabCoordinator20.setUserId(uUID23);
        model.LabManager labManager26 = headLabCoordinator20.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager28 = headLabCoordinator20.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID29 = labManager28.getUserId();
        labManager15.setUserId(uUID29);
        guest3.setUserId(uUID29);
        java.lang.Class<?> wildcardClass32 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertNotNull(uUID29);
// flaky "39) test5240(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID29.toString(), "90022a81-6265-44a4-a800-c3f02d249c1c");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5241");
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
        model.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.addEquipment(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str26, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5242");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        equipment3.enable();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment3.isModifyAvailable(localDateTime11, localDateTime12, "User{userId=3bffa567-9c33-4dee-a8af-306812c3ab27, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}", reservation14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5243");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        headLabCoordinator3.setPasswordHash("Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        double double6 = headLabCoordinator3.getHourlyRate();
        java.lang.String str7 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5244");
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
        equipment13.disable();
        equipment13.disable();
        equipment13.disable();
        java.lang.String str77 = equipment13.toString();
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}" + "'", str77, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5245");
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
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.lang.String str61 = equipment60.getDescription();
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment60.isModifyAvailable(localDateTime62, localDateTime63, "hi!", reservation65);
        equipment60.disable();
        java.lang.String str68 = equipment60.getEquipmentId();
        equipment60.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean74 = equipment60.isAvailable(localDateTime71, localDateTime72, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment60.setLabLocation("User{userId=0bed3626-dbde-4a71-af21-9c375d954793, email='Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        labManager3.setEquipmentStatus(equipment60, "User{userId=f0765721-a687-481f-b6ed-91f0c3fe46a7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment60.enable();
        state.EquipmentState equipmentState80 = equipment60.getCurrentState();
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(equipmentState80);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5246");
        model.Student student3 = new model.Student("Researcher", "Available", "HeadLabCoordinator");
        student3.setEmail("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        student3.setIdOrCertNumber("User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = student3.getRole();
        java.lang.String str9 = student3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str9, "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5247");
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
        equipment10.setDescription("Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=8e5c0d53-dd61-4764-b97b-3fb87f2ca325, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        equipment10.setStatus("User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment10.setStatus("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5248");
        model.Researcher researcher3 = new model.Researcher("User{userId=5cd00e3e-29b7-4edb-98e6-c533d0a71e47, email='Faculty', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='LabManager'}", "User{userId=ff54ef39-4114-47a0-87a0-13fd0553d42a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5249");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getRole();
        java.lang.String str9 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5250");
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
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        model.Reservation reservation23 = null;
        boolean boolean24 = equipment19.isModifyAvailable(localDateTime20, localDateTime21, "Faculty", reservation23);
        equipment19.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment19.isModifyAvailable(localDateTime27, localDateTime28, "", reservation30);
        java.lang.String str32 = equipment19.getLabLocation();
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment19.detach(equipmentObserver33);
        state.EquipmentState equipmentState35 = equipment19.getCurrentState();
        state.EquipmentState equipmentState36 = equipment19.getCurrentState();
        equipment3.setState(equipmentState36);
        equipment3.setStatus("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Faculty" + "'", str32, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState35);
        org.junit.Assert.assertNotNull(equipmentState36);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5251");
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
        equipment49.enable();
        equipment49.enable();
        equipment49.disable();
        model.Equipment equipment56 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str57 = equipment56.getEquipmentId();
        state.EquipmentState equipmentState58 = equipment56.getCurrentState();
        equipment49.setState(equipmentState58);
        labManager5.addEquipment(equipment49);
        equipment49.setLabLocation("User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str63 = equipment49.toString();
        equipment49.disable();
        observer.EquipmentObserver equipmentObserver65 = null;
        equipment49.detach(equipmentObserver65);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str57, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(equipmentState58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Available'}" + "'", str63, "Equipment{equipmentId='', description='', labLocation='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Available'}");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5252");
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
        state.EquipmentState equipmentState20 = equipment3.getCurrentState();
        equipment3.setLabLocation("User{userId=27fcacd8-eeb1-4ef6-bee9-7bbb075cb403, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(equipmentState20);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5253");
        model.Faculty faculty3 = new model.Faculty("User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.getRole();
        faculty3.setPasswordHash("User{userId=0487e5c3-a4d6-4cbf-955d-77a6aad9c411, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "40) test5253(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "4f2777b0-937e-4bc3-acee-d5c914701acc");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5254");
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
        java.lang.String str15 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment3.detach(equipmentObserver16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5255");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        guest3.setEmail("User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str11 = guest3.getIdOrCertNumber();
        java.lang.String str12 = guest3.getRole();
        java.lang.String str13 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str13, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5256");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "41) test5256(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=8051f86d-3547-4239-97e3-faaf968ac0cd, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}" + "'", str8, "User{userId=8051f86d-3547-4239-97e3-faaf968ac0cd, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5257");
        model.LabManager labManager3 = new model.LabManager("User{userId=922b2b27-aebb-482f-9c9d-a09956c68f17, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=68c26747-48df-4a23-8617-4275a1018532, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5258");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setPasswordHash("");
        labManager5.setActive(false);
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        labManager5.setEmail("Faculty");
        labManager5.setEmail("User{userId=27fcacd8-eeb1-4ef6-bee9-7bbb075cb403, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5259");
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
        equipment3.markMaintenance();
        equipment3.setStatus("User{userId=82fbcc46-91ee-4fc6-aaad-fe3c1e73ee2a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5260");
        model.Guest guest3 = new model.Guest("User{userId=8868c252-060b-4413-9d0a-228b729ecd67, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=2ee35a15-338d-48b9-a107-a8dfd73a6022, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        boolean boolean4 = guest3.isActive();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5261");
        model.Student student3 = new model.Student("User{userId=827bbe32-7efa-41c9-b3b0-1fda6c51b6b9, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student7 = new model.Student("", "hi!", "");
        java.lang.String str8 = student7.getEmail();
        double double9 = student7.getHourlyRate();
        boolean boolean10 = student7.isActive();
        java.util.UUID uUID11 = student7.getUserId();
        student3.setUserId(uUID11);
        double double13 = student3.getHourlyRate();
        student3.setIdOrCertNumber("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "42) test5261(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID11.toString(), "f0ea2626-3e8e-4290-80f2-f571a5522960");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5262");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        java.lang.String str10 = labManager9.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5263");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        model.Reservation reservation10 = null;
        boolean boolean11 = equipment3.isModifyAvailable(localDateTime7, localDateTime8, "User{userId=5cd00e3e-29b7-4edb-98e6-c533d0a71e47, email='Faculty', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='LabManager'}", reservation10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5264");
        model.Faculty faculty3 = new model.Faculty("User{userId=e47813b4-3b7a-4106-acde-94e7f711c987, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5265");
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
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment11.isModifyAvailable(localDateTime25, localDateTime26, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", reservation28);
        java.lang.String str30 = equipment11.getStatus();
        equipment11.setStatus("User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment11.isModifyAvailable(localDateTime33, localDateTime34, "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation36);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Available" + "'", str30, "Available");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5266");
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
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment49.isAvailable(localDateTime54, localDateTime55, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5267");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='Available'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=c231e062-149b-42f9-b324-db8d3a984c3b, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5268");
        model.Guest guest3 = new model.Guest("User{userId=e4e96d1a-20ea-4a7d-980e-b38492bb3fb6, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=9261b0d4-4eef-4eab-aab4-10cc33440a70, email='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}', role='Guest'}", "User{userId=6a1384b8-4da8-48fc-80c0-cdc10e9839cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5269");
        model.Equipment equipment3 = new model.Equipment("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=abce3e85-d6c1-4824-a71f-62be07d9efca, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5270");
        model.Researcher researcher3 = new model.Researcher("User{userId=7c8bec6d-719e-4756-aeec-1def59afc3f2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=df5ee050-a29d-4f6d-82fc-cf73ff972527, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=9dca83a1-a35d-4cad-bec0-49e13972189d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5271");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status=''}", "User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        headLabCoordinator3.setActive(true);
        java.lang.String str6 = headLabCoordinator3.getStatus();
        java.lang.String str7 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5272");
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
        equipment17.disable();
        model.SensorUpdate sensorUpdate26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment17.applySensorUpdate(sensorUpdate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5273");
        model.Guest guest3 = new model.Guest("User{userId=6f8d2b14-bf02-4ac9-9385-2fee3d6411f7, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=08bfea2f-ff4a-467e-8f45-0a3465249c17, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5274");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        double double7 = researcher3.getHourlyRate();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5275");
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
        equipment24.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5276");
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
        java.lang.String str17 = equipment3.getStatus();
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        model.SensorUpdate sensorUpdate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5277");
        model.Faculty faculty3 = new model.Faculty("User{userId=b245efd3-fdda-47cd-947c-8e18ab990f21, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}", "User{userId=1970ee77-5538-497c-88d3-ddfe5131557f, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}", "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5278");
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
        java.lang.String str17 = equipment3.getLabLocation();
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        labManager23.addEquipment(equipment27);
        equipment27.setLabLocation("hi!");
        equipment27.setDescription("Researcher");
        state.EquipmentState equipmentState33 = equipment27.getCurrentState();
        state.EquipmentState equipmentState34 = equipment27.getCurrentState();
        equipment3.setState(equipmentState34);
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment3.attach(equipmentObserver36);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertNotNull(equipmentState34);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5279");
        model.Faculty faculty3 = new model.Faculty("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getPasswordHash();
        java.lang.String str5 = faculty3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}" + "'", str4, "Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
// flaky "43) test5279(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=ef232df0-8533-4bb6-874a-b4dca63b2c3d, email='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}" + "'", str5, "User{userId=ef232df0-8533-4bb6-874a-b4dca63b2c3d, email='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5280");
        model.LabManager labManager3 = new model.LabManager("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0d044a5e-b270-40c8-a213-e4769c17ed99, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = labManager3.getHourlyRate();
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
        labManager10.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment35.isModifyAvailable(localDateTime42, localDateTime43, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation45);
        java.lang.String str47 = equipment35.toString();
        labManager10.addEquipment(equipment35);
        equipment35.setLabLocation("Faculty");
        equipment35.markMaintenance();
        labManager3.setEquipmentStatus(equipment35, "User{userId=bc4dc9e1-1ce1-4768-971e-1c5f8e37c798, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double54 = labManager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str47, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5281");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        java.lang.String str6 = labManager3.getEmail();
        model.Equipment equipment10 = new model.Equipment("", "", "");
        java.lang.String str11 = equipment10.getDescription();
        equipment10.disable();
        java.lang.String str13 = equipment10.getEquipmentId();
        labManager3.markMaintenance(equipment10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5282");
        model.Equipment equipment3 = new model.Equipment("User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.enable();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager10.setActive(true);
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("Guest");
        model.Equipment equipment22 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager18.markMaintenance(equipment22);
        labManager10.setEquipmentStatus(equipment22, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment22.detach(equipmentObserver26);
        equipment22.setStatus("User{userId=728e80a2-e9fc-4d56-b078-664e2d9793e1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator33 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager35 = headLabCoordinator33.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID36 = null;
        headLabCoordinator33.setUserId(uUID36);
        model.LabManager labManager39 = headLabCoordinator33.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        equipment43.enable();
        labManager39.addEquipment(equipment43);
        model.Equipment equipment49 = new model.Equipment("", "", "");
        java.lang.String str50 = equipment49.getDescription();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment49.isModifyAvailable(localDateTime51, localDateTime52, "hi!", reservation54);
        java.lang.String str56 = equipment49.getDescription();
        state.EquipmentState equipmentState57 = equipment49.getCurrentState();
        equipment49.setLabLocation("Student");
        labManager39.setEquipmentStatus(equipment49, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment65 = new model.Equipment("", "", "");
        java.lang.String str66 = equipment65.getDescription();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        model.Reservation reservation70 = null;
        boolean boolean71 = equipment65.isModifyAvailable(localDateTime67, localDateTime68, "hi!", reservation70);
        equipment65.disable();
        equipment65.enable();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        boolean boolean77 = equipment65.isAvailable(localDateTime74, localDateTime75, "");
        labManager39.addEquipment(equipment65);
        java.lang.String str79 = equipment65.getLabLocation();
        model.Equipment equipment83 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        model.Reservation reservation87 = null;
        boolean boolean88 = equipment83.isModifyAvailable(localDateTime84, localDateTime85, "Faculty", reservation87);
        equipment83.setLabLocation("Faculty");
        java.lang.String str91 = equipment83.getDescription();
        java.lang.String str92 = equipment83.getEquipmentId();
        equipment83.notifyObservers();
        equipment83.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState96 = equipment83.getCurrentState();
        equipment65.setState(equipmentState96);
        equipment22.setState(equipmentState96);
        equipment3.setState(equipmentState96);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(equipmentState57);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(equipmentState96);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5283");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str18 = headLabCoordinator15.getRole();
        model.LabManager labManager20 = headLabCoordinator15.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str21 = labManager20.getRole();
        model.Equipment equipment25 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment25.markMaintenance();
        labManager20.addEquipment(equipment25);
        labManager11.addEquipment(equipment25);
        java.lang.String str29 = equipment25.getEquipmentId();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment25.isModifyAvailable(localDateTime30, localDateTime31, "User{userId=d0549d53-a938-4323-a796-a5a121fa8811, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation33);
        java.lang.String str35 = equipment25.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HeadLabCoordinator" + "'", str18, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LM-CERT" + "'", str29, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Maintenance" + "'", str35, "Maintenance");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5284");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment17.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5285");
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
        equipment3.setStatus("Equipment{equipmentId='', description='User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=a589f573-319a-4723-a067-0220546441f7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5286");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.toString();
        model.LabManager labManager12 = new model.LabManager("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID13 = labManager12.getUserId();
        java.util.UUID uUID14 = labManager12.getUserId();
        headLabCoordinator3.setUserId(uUID14);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
// flaky "44) test5286(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=c1e2ed84-a19b-4aaf-bd3a-2d201d625cee, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}" + "'", str8, "User{userId=c1e2ed84-a19b-4aaf-bd3a-2d201d625cee, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(uUID13);
// flaky "4) test5286(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID13.toString(), "e657bb33-6ccf-498a-9765-5c6752f3601c");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "1) test5286(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID14.toString(), "e657bb33-6ccf-498a-9765-5c6752f3601c");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5287");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment3.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5288");
        model.Student student3 = new model.Student("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=d2991980-49a0-4716-8bcb-7c2b51bdb501, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8cc97d23-546a-454b-beec-c3df5ab728f3, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5289");
        model.Researcher researcher3 = new model.Researcher("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str4 = researcher3.toString();
// flaky "45) test5289(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=3e9391a2-81c4-4b37-9c3e-22b1303935ce, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}" + "'", str4, "User{userId=3e9391a2-81c4-4b37-9c3e-22b1303935ce, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5290");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getLabLocation();
        java.lang.String str8 = equipment3.getStatus();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Available" + "'", str8, "Available");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5291");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getRole();
        double double12 = researcher3.getHourlyRate();
        java.lang.String str13 = researcher3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5292");
        model.Researcher researcher3 = new model.Researcher("User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=aaac467a-33c2-4ec9-977a-37a231196fb5, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5293");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.lang.String str10 = faculty3.getRole();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5294");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getIdOrCertNumber();
        java.lang.String str11 = guest3.getRole();
        boolean boolean12 = guest3.isActive();
        guest3.setEmail("User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        boolean boolean15 = guest3.isActive();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5295");
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
        equipment3.markMaintenance();
        equipment3.setStatus("Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        state.EquipmentState equipmentState23 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(equipmentState23);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5296");
        model.Guest guest3 = new model.Guest("User{userId=cf3b1b02-bdb5-46dc-b406-0fe9f32cb391, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getPasswordHash();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str5, "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5297");
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
        model.Equipment equipment78 = new model.Equipment("", "", "");
        equipment78.enable();
        equipment78.enable();
        java.lang.String str81 = equipment78.getStatus();
        java.lang.String str82 = equipment78.getDescription();
        equipment78.setDescription("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        model.Reservation reservation88 = null;
        boolean boolean89 = equipment78.isModifyAvailable(localDateTime85, localDateTime86, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Guest'}", reservation88);
        labManager3.setEquipmentStatus(equipment78, "User{userId=e90bb683-822f-419c-8d33-7a74a7f19a20, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double92 = labManager3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Available" + "'", str81, "Available");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5298");
        model.Guest guest3 = new model.Guest("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c6cccca0-8adc-406b-a117-45bcf62acaa3, email='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}", "User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5299");
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
        java.lang.String str48 = equipment43.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5300");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        faculty3.setEmail("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        double double9 = faculty3.getHourlyRate();
        java.util.UUID uUID10 = faculty3.getUserId();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "46) test5300(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID10.toString(), "59c0494a-eb38-47b2-a057-64f2c9c95422");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5301");
        model.LabManager labManager3 = new model.LabManager("User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5558ba3a-34e8-479b-bd41-7499cfd13bcd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "Equipment{equipmentId='Student', description='User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='Available', status='Available'}");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5302");
        model.Equipment equipment3 = new model.Equipment("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        equipment3.disable();
        equipment3.setDescription("User{userId=64d5d52d-6558-4bc9-918f-05c3c1a5493c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5303");
        model.Faculty faculty3 = new model.Faculty("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=55b9d433-8545-4279-9f8f-6b5a87f98489, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5304");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        java.lang.String str13 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5305");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='User{userId=ddd64f84-6b68-434b-9cef-83c08ef65127, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=a589f573-319a-4723-a067-0220546441f7, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}', status='Available'}", "User{userId=5018344a-d943-41c8-ba66-5c313cbe9262, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5306");
        model.Faculty faculty3 = new model.Faculty("User{userId=652f1007-c938-4c4e-ba77-6213cb65023a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "User{userId=b9673e98-e3d9-4acc-936e-bbb26e08dea7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5307");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5308");
        model.Guest guest3 = new model.Guest("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5309");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double7 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double10 = labManager9.getHourlyRate();
        double double11 = labManager9.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5310");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5311");
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
        java.lang.String str38 = labManager5.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LM-CERT" + "'", str38, "LM-CERT");
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5312");
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
        java.lang.String str46 = equipment30.getLabLocation();
        equipment30.markMaintenance();
        equipment30.setStatus("User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment30.setDescription("User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Faculty" + "'", str46, "Faculty");
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5313");
        model.Student student3 = new model.Student("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty11 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str12 = faculty11.getRole();
        faculty11.setEmail("hi!");
        boolean boolean15 = faculty11.isActive();
        java.util.UUID uUID16 = faculty11.getUserId();
        headLabCoordinator7.setUserId(uUID16);
        student3.setUserId(uUID16);
        java.util.UUID uUID19 = student3.getUserId();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(uUID16);
// flaky "47) test5313(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID16.toString(), "2249c84f-c005-4b66-8207-be398ba39ca4");
        org.junit.Assert.assertNotNull(uUID19);
// flaky "5) test5313(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID19.toString(), "2249c84f-c005-4b66-8207-be398ba39ca4");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5314");
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
        java.lang.Class<?> wildcardClass42 = equipment27.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5315");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}", "User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=0393009a-b3ca-4bd2-927f-8836aa1c5301, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.getStatus();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5316");
        model.LabManager labManager3 = new model.LabManager("LM-CERT", "User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.lang.String str8 = equipment7.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment7.isModifyAvailable(localDateTime9, localDateTime10, "hi!", reservation12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment7.isModifyAvailable(localDateTime14, localDateTime15, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation17);
        java.lang.String str19 = equipment7.toString();
        model.Equipment equipment23 = new model.Equipment("", "", "");
        java.lang.String str24 = equipment23.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment23.isModifyAvailable(localDateTime25, localDateTime26, "hi!", reservation28);
        java.lang.String str30 = equipment23.getEquipmentId();
        equipment23.setStatus("");
        state.EquipmentState equipmentState33 = equipment23.getCurrentState();
        equipment7.setState(equipmentState33);
        equipment7.enable();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment7.isAvailable(localDateTime36, localDateTime37, "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.markMaintenance(equipment7);
        java.lang.String str41 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5317");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment9.isModifyAvailable(localDateTime11, localDateTime12, "hi!", reservation14);
        java.lang.String str16 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean20 = equipment9.isAvailable(localDateTime17, localDateTime18, "Faculty");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment9.isModifyAvailable(localDateTime21, localDateTime22, "Researcher", reservation24);
        labManager3.addEquipment(equipment9);
        java.lang.String str27 = labManager3.toString();
        model.Equipment equipment31 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment31.markMaintenance();
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment31.attach(equipmentObserver33);
        labManager3.setEquipmentStatus(equipment31, "User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.addEquipment(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "48) test5317(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=b82f66ae-2039-4a72-b752-259a6283d417, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str27, "User{userId=b82f66ae-2039-4a72-b752-259a6283d417, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5318");
        model.Student student3 = new model.Student("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=0bed3626-dbde-4a71-af21-9c375d954793, email='Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}', status='ACTIVE', idOrCertNumber='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        student3.setIdOrCertNumber("User{userId=2da23391-048d-4b92-a256-ed5d7cc85586, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5319");
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
        java.lang.String str25 = labManager5.getStatus();
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
        equipment29.setLabLocation("User{userId=b9fdd275-807e-425d-8a8f-31d8564c3fd5, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager5.addEquipment(equipment29);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Maintenance" + "'", str23, "Maintenance");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ACTIVE" + "'", str25, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5320");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=50c8e534-0cef-4e1f-8015-4eb5b8d5dfed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5321");
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
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(equipmentState25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5322");
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
        java.lang.Class<?> wildcardClass66 = equipment63.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "49) test5322(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID48.toString(), "a2d9775e-688a-48f2-b9ee-d5f18c10891c");
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5323");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isActive();
        java.lang.String str5 = faculty3.getPasswordHash();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRole();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5324");
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
        equipment29.enable();
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
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5325");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        guest3.setEmail("Maintenance");
        double double13 = guest3.getHourlyRate();
        guest3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5326");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setEmail("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5327");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        double double11 = labManager5.getHourlyRate();
        labManager5.setPasswordHash("User{userId=e4e96d1a-20ea-4a7d-980e-b38492bb3fb6, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str14 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ACTIVE" + "'", str14, "ACTIVE");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5328");
        model.Faculty faculty3 = new model.Faculty("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        java.lang.String str4 = faculty3.getStatus();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5329");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=de462c4b-ba44-4966-8187-ff40729486dd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=013c1752-e417-49a0-809c-87122bf6dfd2, email='User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}", "User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5330");
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
        observer.EquipmentObserver equipmentObserver78 = null;
        equipment9.attach(equipmentObserver78);
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
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5331");
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
        equipment78.notifyObservers();
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
// flaky "50) test5331(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID72.toString(), "5262c073-ae1e-4230-8264-0fccc28342d3");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5332");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getIdOrCertNumber();
        java.lang.String str10 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5333");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.toString();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky "51) test5333(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=03c20517-4229-422d-9c51-ebe44aa7093b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str6, "User{userId=03c20517-4229-422d-9c51-ebe44aa7093b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "INACTIVE" + "'", str8, "INACTIVE");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5334");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getEmail();
        java.lang.String str8 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5335");
        model.Researcher researcher3 = new model.Researcher("User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "LM-CERT");
        java.lang.String str4 = researcher3.getPasswordHash();
        researcher3.setActive(true);
        java.lang.String str7 = researcher3.getRole();
        java.lang.String str8 = researcher3.getRole();
        researcher3.setEmail("User{userId=d66e313c-bdcb-42e8-89ea-6f52667d049d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5336");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}", "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        labManager9.markMaintenance(equipment13);
        double double15 = labManager9.getHourlyRate();
        java.lang.String str16 = labManager9.getRole();
        double double17 = labManager9.getHourlyRate();
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
        labManager9.addEquipment(equipment27);
        labManager3.setEquipmentStatus(equipment27, "User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment27.detach(equipmentObserver41);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5337");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='User{userId=b20fea18-fec6-4210-b1a0-bbab19473ab8, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}', description='User{userId=c7366231-eb4a-4224-829a-c65d22971738, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "Equipment{equipmentId='', description='Researcher', labLocation='hi!', status='Available'}", "User{userId=0a67e5a4-131c-4b0a-a6a3-f221d12cf100, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5338");
        model.Researcher researcher3 = new model.Researcher("User{userId=df5ee050-a29d-4f6d-82fc-cf73ff972527, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5339");
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
        java.lang.String str20 = labManager9.getPasswordHash();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "52) test5339(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID15.toString(), "53112752-aff4-4513-aa4e-5da40843f43b");
// flaky "6) test5339(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=53112752-aff4-4513-aa4e-5da40843f43b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=53112752-aff4-4513-aa4e-5da40843f43b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Temp123!" + "'", str20, "Temp123!");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5340");
        model.Faculty faculty3 = new model.Faculty("User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=53b0c4ac-bd8e-464d-a4d5-ad66634f4c53, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=f6bfbdd3-89a5-4fab-b9e2-ea654a7bf8c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5341");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("", "User{userId=d95ea4b1-f738-45f6-9cae-fec705cfe6f1, email='User{userId=777b9370-e1e5-4fd8-a436-2007d0a1d701, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Guest'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5342");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        java.lang.String str11 = labManager5.getRole();
        java.lang.String str12 = labManager5.getRole();
        double double13 = labManager5.getHourlyRate();
        boolean boolean14 = labManager5.isActive();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID21 = null;
        headLabCoordinator18.setUserId(uUID21);
        model.LabManager labManager24 = headLabCoordinator18.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager26 = headLabCoordinator18.autoGenerateManagerAccount("Guest");
        java.lang.String str27 = labManager26.toString();
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.lang.String str32 = equipment31.getDescription();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment31.isModifyAvailable(localDateTime33, localDateTime34, "hi!", reservation36);
        equipment31.disable();
        equipment31.enable();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean43 = equipment31.isAvailable(localDateTime40, localDateTime41, "");
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
        equipment31.setState(equipmentState68);
        labManager26.markMaintenance(equipment31);
        equipment31.notifyObservers();
        java.lang.String str73 = equipment31.getDescription();
        labManager5.addEquipment(equipment31);
        labManager5.setEmail("User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertNotNull(labManager26);
// flaky "53) test5342(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=505874af-f9f6-4b69-b634-ed91fe25cf8b, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str27, "User{userId=505874af-f9f6-4b69-b634-ed91fe25cf8b, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(equipmentState68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5343");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getPasswordHash();
        java.lang.String str11 = guest3.getIdOrCertNumber();
        boolean boolean12 = guest3.isActive();
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5344");
        model.Researcher researcher3 = new model.Researcher("", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Disabled'}", "User{userId=43056773-f0a0-4320-8fee-cfa0076f413d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5345");
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
        labManager3.setIdOrCertNumber("User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment32 = new model.Equipment("", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        labManager3.markMaintenance(equipment32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5346");
        model.Guest guest3 = new model.Guest("User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Maintenance", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5347");
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
        equipment3.setLabLocation("User{userId=91a02374-2f71-4c59-b000-953515d451bf, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str20 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5348");
        model.Student student3 = new model.Student("User{userId=a6f08cf7-412b-47d4-a994-0c81501f765a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5349");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str14 = labManager13.getRole();
        double double15 = labManager13.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5350");
        model.Student student3 = new model.Student("HeadLabCoordinator", "hi!", "Guest");
        boolean boolean4 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5351");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("hi!");
        equipment9.setStatus("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment9.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=9ff06a1d-d300-4033-9f9d-3c6f6089dd31, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation18);
        equipment9.disable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5352");
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
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment30.isModifyAvailable(localDateTime42, localDateTime43, "User{userId=53ed7879-01ce-4e5e-95c3-e18c66ff8094, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation45);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ACTIVE" + "'", str33, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5353");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "INACTIVE");
        java.lang.String str4 = headLabCoordinator3.getStatus();
        double double5 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5354");
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
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5355");
        model.Guest guest3 = new model.Guest("hi!", "Available", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("hi!");
        model.Faculty faculty10 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str11 = faculty10.getStatus();
        faculty10.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty17 = new model.Faculty("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Maintenance", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Guest guest21 = new model.Guest("", "hi!", "hi!");
        java.lang.String str22 = guest21.getRole();
        double double23 = guest21.getHourlyRate();
        double double24 = guest21.getHourlyRate();
        java.lang.String str25 = guest21.getRole();
        java.lang.String str26 = guest21.getEmail();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID31 = headLabCoordinator30.getUserId();
        guest21.setUserId(uUID31);
        faculty17.setUserId(uUID31);
        faculty10.setUserId(uUID31);
        guest3.setUserId(uUID31);
        java.lang.String str36 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 25.0d + "'", double23 == 25.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 25.0d + "'", double24 == 25.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Guest" + "'", str25, "Guest");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(uUID31);
// flaky "54) test5355(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID31.toString(), "fa488177-cfd3-4151-b75a-08150ae717e0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5356");
        model.Researcher researcher3 = new model.Researcher("HeadLabCoordinator", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        researcher3.setPasswordHash("Available");
        java.lang.String str6 = researcher3.getPasswordHash();
        java.lang.String str7 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5357");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=632d47ed-f2ef-4350-9fb8-e586acf3669c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e84447d0-7ce1-40a8-bab6-99ad0a0e832d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=66961dc9-0b3d-456a-84d1-aea8dc10fab6, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5358");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        headLabCoordinator3.setIdOrCertNumber("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5359");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getStatus();
        equipment3.notifyObservers();
        equipment3.setStatus("User{userId=f14e415a-0e7a-490c-b5e3-54d137f0e6ac, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment20.isModifyAvailable(localDateTime21, localDateTime22, "Faculty", reservation24);
        equipment20.setLabLocation("Faculty");
        java.lang.String str28 = equipment20.getDescription();
        java.lang.String str29 = equipment20.getEquipmentId();
        equipment20.notifyObservers();
        state.EquipmentState equipmentState31 = equipment20.getCurrentState();
        equipment3.setState(equipmentState31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5360");
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
        java.lang.String str81 = equipment10.getDescription();
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5361");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = student3.getUserId();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "55) test5361(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "1ff79d1e-f4ee-4480-bde2-8c28478ce3fa");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5362");
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
        java.lang.String str18 = equipment3.getEquipmentId();
        state.EquipmentState equipmentState19 = equipment3.getCurrentState();
        equipment3.setDescription("User{userId=098b734d-6a11-40fa-9614-78c022e12dfd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment3.isModifyAvailable(localDateTime22, localDateTime23, "User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5363");
        model.Student student3 = new model.Student("User{userId=81a1aa84-9400-4eae-94ba-24b390e44a98, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
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
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment23.isAvailable(localDateTime36, localDateTime37, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        state.EquipmentState equipmentState40 = equipment23.getCurrentState();
        equipment23.markMaintenance();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        strategy.PricingStrategy pricingStrategy44 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation45 = new model.Reservation((model.User) student3, equipment23, localDateTime42, localDateTime43, pricingStrategy44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5364");
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
        java.lang.String str25 = labManager9.toString();
        model.LabManager labManager29 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str30 = labManager29.getRole();
        double double31 = labManager29.getHourlyRate();
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        java.lang.String str42 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean46 = equipment35.isAvailable(localDateTime43, localDateTime44, "Faculty");
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment35.isModifyAvailable(localDateTime47, localDateTime48, "Researcher", reservation50);
        labManager29.addEquipment(equipment35);
        labManager9.addEquipment(equipment35);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment35.isModifyAvailable(localDateTime54, localDateTime55, "User{userId=29752153-0a16-432b-8efc-f83056ede37e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation57);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Available" + "'", str17, "Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "56) test5364(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User{userId=2ed3aa72-7366-4592-be4e-598deb42957a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str25, "User{userId=2ed3aa72-7366-4592-be4e-598deb42957a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LabManager" + "'", str30, "LabManager");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5365");
        model.Student student3 = new model.Student("User{userId=5a6a2c7c-5750-47c0-bcc6-af35ffc3d970, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", "User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5366");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        java.lang.String str4 = guest3.toString();
        java.lang.String str5 = guest3.getStatus();
// flaky "57) test5366(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=fa56174f-102d-4253-aeb9-2450da2e7dca, email='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}', role='Guest'}" + "'", str4, "User{userId=fa56174f-102d-4253-aeb9-2450da2e7dca, email='Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5367");
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
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment12.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation30);
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment12.detach(equipmentObserver32);
        equipment12.setLabLocation("");
        equipment12.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5368");
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
        equipment22.setLabLocation("User{userId=d117ba49-c932-4404-9395-4a9f98496768, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5369");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        java.util.UUID uUID5 = null;
        guest3.setUserId(uUID5);
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5370");
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
        java.util.UUID uUID22 = student3.getUserId();
        double double23 = student3.getHourlyRate();
        boolean boolean24 = student3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "58) test5370(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=8dcd7ace-f4ee-456e-8526-9782c8d05652, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=8dcd7ace-f4ee-456e-8526-9782c8d05652, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "7) test5370(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID19.toString(), "4b6c3144-4d73-45dd-8a20-e2cc11a04ddf");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertNotNull(uUID22);
// flaky "2) test5370(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID22.toString(), "4b6c3144-4d73-45dd-8a20-e2cc11a04ddf");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5371");
        model.Researcher researcher3 = new model.Researcher("User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ee4c7ae0-0ce9-4925-acb7-814fab1467de, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0da4b887-5299-4e0a-8d26-b5eaff2b4cae, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5372");
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
        java.lang.String str20 = equipment3.getEquipmentId();
        equipment3.setDescription("User{userId=e2f7f034-e1a9-45dc-9009-b560dc4e017d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5373");
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
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean55 = equipment3.isAvailable(localDateTime52, localDateTime53, "User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5374");
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
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Guest");
        double double23 = labManager22.getHourlyRate();
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        java.lang.String str34 = equipment27.getEquipmentId();
        equipment27.setStatus("");
        equipment27.notifyObservers();
        labManager22.addEquipment(equipment27);
        model.Equipment equipment42 = new model.Equipment("", "", "");
        equipment42.enable();
        equipment42.enable();
        java.lang.String str45 = equipment42.getStatus();
        java.lang.String str46 = equipment42.getStatus();
        java.lang.String str47 = equipment42.getDescription();
        equipment42.disable();
        model.HeadLabCoordinator headLabCoordinator52 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager54 = headLabCoordinator52.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment58 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        model.Reservation reservation62 = null;
        boolean boolean63 = equipment58.isModifyAvailable(localDateTime59, localDateTime60, "Faculty", reservation62);
        equipment58.setLabLocation("Faculty");
        labManager54.setEquipmentStatus(equipment58, "");
        equipment58.setDescription("");
        model.Equipment equipment73 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        model.Reservation reservation77 = null;
        boolean boolean78 = equipment73.isModifyAvailable(localDateTime74, localDateTime75, "Faculty", reservation77);
        equipment73.setLabLocation("Faculty");
        equipment73.notifyObservers();
        observer.EquipmentObserver equipmentObserver82 = null;
        equipment73.attach(equipmentObserver82);
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        model.Reservation reservation87 = null;
        boolean boolean88 = equipment73.isModifyAvailable(localDateTime84, localDateTime85, "Faculty", reservation87);
        state.EquipmentState equipmentState89 = equipment73.getCurrentState();
        equipment58.setState(equipmentState89);
        equipment42.setState(equipmentState89);
        equipment27.setState(equipmentState89);
        java.lang.String str93 = equipment27.getEquipmentId();
        equipment27.enable();
        equipment27.disable();
        equipment27.notifyObservers();
        labManager11.setEquipmentStatus(equipment27, "User{userId=902105d2-35c6-47ce-b94e-ed720e6c42d9, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "59) test5374(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=dc6325d0-ef57-4dfd-839a-991ec5de316e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str15, "User{userId=dc6325d0-ef57-4dfd-839a-991ec5de316e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Available" + "'", str45, "Available");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Available" + "'", str46, "Available");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(equipmentState89);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5375");
        model.Faculty faculty3 = new model.Faculty("User{userId=c4552bd2-e848-4b9d-a1e3-02c81ea5755f, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=adce0ca0-d11b-438d-9dc0-cbb2ae94ebeb, email='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Guest', role='LabManager'}", "User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5376");
        model.Guest guest3 = new model.Guest("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        double double4 = guest3.getHourlyRate();
        double double5 = guest3.getHourlyRate();
        model.Student student9 = new model.Student("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Researcher researcher13 = new model.Researcher("", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        model.Student student17 = new model.Student("", "hi!", "");
        double double18 = student17.getHourlyRate();
        java.lang.String str19 = student17.toString();
        double double20 = student17.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator24 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager26 = headLabCoordinator24.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID27 = null;
        headLabCoordinator24.setUserId(uUID27);
        model.LabManager labManager30 = headLabCoordinator24.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager32 = headLabCoordinator24.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID33 = labManager32.getUserId();
        student17.setUserId(uUID33);
        researcher13.setUserId(uUID33);
        student9.setUserId(uUID33);
        guest3.setUserId(uUID33);
        double double38 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
// flaky "60) test5376(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=bd07a403-d512-4172-9760-c52e730294e5, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str19, "User{userId=bd07a403-d512-4172-9760-c52e730294e5, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertNotNull(uUID33);
// flaky "8) test5376(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID33.toString(), "0c532380-e4ff-420e-a2f3-8207882c4010");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 25.0d + "'", double38 == 25.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5377");
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
        observer.EquipmentObserver equipmentObserver47 = null;
        equipment9.detach(equipmentObserver47);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment9.isModifyAvailable(localDateTime49, localDateTime50, "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation52);
        java.lang.String str54 = equipment9.getStatus();
        java.lang.String str55 = equipment9.getDescription();
        equipment9.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Available" + "'", str54, "Available");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5378");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        java.lang.String str7 = equipment3.getLabLocation();
        equipment3.disable();
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5379");
        model.Equipment equipment3 = new model.Equipment("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', status='User{userId=2aa38236-773d-4c54-aacb-9b926d015e42, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}'}", "User{userId=a04ab48d-8a0f-472f-a258-2c21c5939187, email='User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Student', status='Available'}', role='LabManager'}");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5380");
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
        equipment65.setLabLocation("User{userId=3b48c400-6fdc-4b8c-91bd-56d0e9c363f7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment65.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "61) test5380(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=16e435ae-ac0c-42df-8491-85a9e815d06b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=16e435ae-ac0c-42df-8491-85a9e815d06b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LM-CERT" + "'", str27, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5381");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        java.lang.String str7 = headLabCoordinator3.getStatus();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        boolean boolean10 = headLabCoordinator3.isActive();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5382");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5383");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.toString();
        equipment3.markMaintenance();
        java.lang.String str14 = equipment3.getEquipmentId();
        java.lang.String str15 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str12, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5384");
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
        java.lang.String str45 = student3.getIdOrCertNumber();
        model.Guest guest49 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID50 = guest49.getUserId();
        student3.setUserId(uUID50);
        double double52 = student3.getHourlyRate();
        java.lang.String str53 = student3.getRole();
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
// flaky "62) test5384(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID40.toString(), "e5450f1c-1e8b-45fb-b414-757bfc0beeac");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(uUID50);
// flaky "9) test5384(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID50.toString(), "53cce65c-4ebf-4d10-9c7f-bf77878cc73c");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Student" + "'", str53, "Student");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5385");
        model.Student student3 = new model.Student("User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        student3.setEmail("User{userId=66961dc9-0b3d-456a-84d1-aea8dc10fab6, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str6 = student3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str6, "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5386");
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
        equipment63.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "63) test5386(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID48.toString(), "505a5dfb-d246-4a02-9af6-770ca4eafc18");
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5387");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.util.UUID uUID7 = headLabCoordinator3.getUserId();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        headLabCoordinator3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "64) test5387(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID7.toString(), "655418d0-463f-4a78-a122-71c381e96c33");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5388");
        model.Guest guest3 = new model.Guest("User{userId=1cea9a01-cc07-4a4a-af12-895caffc9c7e, email='User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='LabManager'}", "", "User{userId=bd07a403-d512-4172-9760-c52e730294e5, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5389");
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
        model.Equipment equipment67 = new model.Equipment("", "", "");
        java.lang.String str68 = equipment67.getDescription();
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        model.Reservation reservation72 = null;
        boolean boolean73 = equipment67.isModifyAvailable(localDateTime69, localDateTime70, "hi!", reservation72);
        equipment67.markMaintenance();
        equipment67.setLabLocation("HeadLabCoordinator");
        java.lang.String str77 = equipment67.getDescription();
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        boolean boolean81 = equipment67.isAvailable(localDateTime78, localDateTime79, "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        labManager5.addEquipment(equipment67);
        boolean boolean83 = labManager5.isActive();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5390");
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
        java.lang.String str85 = labManager8.getStatus();
        labManager8.setIdOrCertNumber("User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
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
// flaky "65) test5390(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID67.toString(), "8068d32f-558c-4a43-9702-d42a5a04ee03");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ACTIVE" + "'", str85, "ACTIVE");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5391");
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
        state.EquipmentState equipmentState32 = equipment25.getCurrentState();
        equipment25.setLabLocation("User{userId=25df772f-0934-466e-a93d-e69ecc4529a5, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str31, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertNotNull(equipmentState32);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5392");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        java.lang.String str13 = equipment3.getEquipmentId();
        java.lang.String str14 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver15 = null;
        equipment3.attach(equipmentObserver15);
        java.lang.String str17 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5393");
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
        java.lang.String str20 = equipment3.getEquipmentId();
        java.lang.String str21 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str18, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str19, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5394");
        model.Faculty faculty3 = new model.Faculty("User{userId=eb6fc337-1003-47b7-b3f1-2ceb2830d470, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5395");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=262110c7-68ea-45e7-b72b-b93196a318f0, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        headLabCoordinator3.setActive(false);
        java.lang.String str6 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5396");
        model.LabManager labManager3 = new model.LabManager("User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Guest", "");
        labManager3.setIdOrCertNumber("User{userId=d9b4b0c6-0da3-4b3d-9dc0-787d1f5e5628, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5397");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getRole();
        java.lang.String str12 = researcher3.getRole();
        java.lang.String str13 = researcher3.getRole();
        double double14 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "66) test5397(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID7.toString(), "16a39dc4-8cdf-4d05-a863-6674a68f1f2a");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5398");
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
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        labManager6.setEquipmentStatus(equipment28, "Guest");
        java.lang.String str37 = equipment28.getLabLocation();
        equipment28.markMaintenance();
        equipment28.enable();
        equipment28.enable();
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment28.detach(equipmentObserver41);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        strategy.PricingStrategy pricingStrategy45 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation46 = new model.Reservation(user0, equipment28, localDateTime43, localDateTime44, pricingStrategy45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5399");
        model.Guest guest3 = new model.Guest("User{userId=8868c252-060b-4413-9d0a-228b729ecd67, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=d8859b82-6f4d-4999-9299-000db8f32de9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5400");
        model.LabManager labManager3 = new model.LabManager("User{userId=b825f33f-3488-4cd5-a72f-cd0633a6ba4b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Student'}", "User{userId=a737b82e-ea36-4a0b-a4c2-1418c17dcde7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5401");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean11 = equipment3.isAvailable(localDateTime8, localDateTime9, "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.String str13 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Available" + "'", str13, "Available");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5402");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = student3.toString();
        model.Guest guest8 = new model.Guest("", "hi!", "hi!");
        java.lang.String str9 = guest8.getRole();
        double double10 = guest8.getHourlyRate();
        java.lang.String str11 = guest8.getRole();
        java.lang.String str12 = guest8.getEmail();
        guest8.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str15 = guest8.getIdOrCertNumber();
        java.util.UUID uUID16 = guest8.getUserId();
        double double17 = guest8.getHourlyRate();
        java.util.UUID uUID18 = guest8.getUserId();
        student3.setUserId(uUID18);
// flaky "67) test5402(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=448a8e9f-791d-4d06-b641-482af916fab5, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=448a8e9f-791d-4d06-b641-482af916fab5, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str15, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID16);
// flaky "10) test5402(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID16.toString(), "7d73b96b-14c4-44b5-85f0-d1b1aa4c87a0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 25.0d + "'", double17 == 25.0d);
        org.junit.Assert.assertNotNull(uUID18);
// flaky "3) test5402(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID18.toString(), "7d73b96b-14c4-44b5-85f0-d1b1aa4c87a0");
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5403");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getStatus();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertNotNull(equipmentState5);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5404");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}", "", "User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.toString();
// flaky "68) test5404(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c1433388-538b-4b2a-a1d0-6d1ba27f17bf, email='Equipment{equipmentId='', description='', labLocation='', status='Disabled'}', status='ACTIVE', idOrCertNumber='User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}" + "'", str4, "User{userId=c1433388-538b-4b2a-a1d0-6d1ba27f17bf, email='Equipment{equipmentId='', description='', labLocation='', status='Disabled'}', status='ACTIVE', idOrCertNumber='User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5405");
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
        java.lang.String str26 = labManager5.getRole();
        boolean boolean27 = labManager5.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(uUID22);
// flaky "69) test5405(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID22.toString(), "15b3e5f0-e69d-4ca2-9484-afd5e38cc5b5");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5406");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Researcher", "Faculty");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=69073508-b3b1-4a73-b33e-6ec0867532fc, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        double double10 = labManager9.getHourlyRate();
        double double11 = labManager9.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5407");
        model.Faculty faculty3 = new model.Faculty("User{userId=6a39d570-b439-4012-8d0f-1880954d31d3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1c4a375c-341f-42e5-82a6-b5250e5e62c3, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Researcher'}", "User{userId=50318a48-bfc4-4948-97c0-f55f3e886f3b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5408");
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
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        model.Reservation reservation60 = null;
        boolean boolean61 = equipment16.isModifyAvailable(localDateTime57, localDateTime58, "Equipment{equipmentId='', description='', labLocation='', status='Available'}", reservation60);
        state.EquipmentState equipmentState62 = equipment16.getCurrentState();
        java.lang.Class<?> wildcardClass63 = equipment16.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "70) test5408(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=b86bd081-7817-42d6-bc17-2d0a15ac6d1d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str12, "User{userId=b86bd081-7817-42d6-bc17-2d0a15ac6d1d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(equipmentState62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5409");
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
        java.lang.String str21 = labManager9.getEmail();
        java.lang.String str22 = labManager9.toString();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "71) test5409(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID15.toString(), "dabfdbc2-d651-4ae3-bd56-8be659ea8be9");
// flaky "11) test5409(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=dabfdbc2-d651-4ae3-bd56-8be659ea8be9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=dabfdbc2-d651-4ae3-bd56-8be659ea8be9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ACTIVE" + "'", str21, "ACTIVE");
// flaky "4) test5409(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=dabfdbc2-d651-4ae3-bd56-8be659ea8be9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str22, "User{userId=dabfdbc2-d651-4ae3-bd56-8be659ea8be9, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5410");
        model.Student student3 = new model.Student("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=862f6943-66ba-448f-9d6b-f46e755dd01c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5411");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getPasswordHash();
        double double12 = researcher3.getHourlyRate();
        boolean boolean13 = researcher3.isActive();
        java.lang.String str14 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "72) test5411(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID7.toString(), "be7cba56-a984-483f-b964-e6292c10a9ea");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5412");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getEmail();
        java.lang.String str12 = researcher3.getRole();
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str19 = headLabCoordinator16.getRole();
        model.LabManager labManager21 = headLabCoordinator16.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager23 = headLabCoordinator16.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str24 = labManager23.toString();
        labManager23.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID27 = labManager23.getUserId();
        researcher3.setUserId(uUID27);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HeadLabCoordinator" + "'", str19, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
// flaky "73) test5412(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User{userId=df9911f8-08ce-4e1a-bb42-0c54c40e568b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str24, "User{userId=df9911f8-08ce-4e1a-bb42-0c54c40e568b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID27);
// flaky "12) test5412(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID27.toString(), "df9911f8-08ce-4e1a-bb42-0c54c40e568b");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5413");
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
        equipment35.setStatus("User{userId=a693b3e2-b7b8-430b-b807-e312f84458bf, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='INACTIVE', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver53 = null;
        equipment35.attach(equipmentObserver53);
        equipment35.setDescription("User{userId=bf3b4982-9a8f-43e2-8897-1a88c06b4469, email='User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=ce032a52-ab65-4185-9aec-0552b9158049, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
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
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5414");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = labManager8.getHourlyRate();
        java.lang.String str10 = labManager8.getPasswordHash();
        labManager8.setIdOrCertNumber("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        labManager8.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5415");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setEmail("User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager14.setIdOrCertNumber("User{userId=b535fd22-4e05-4b15-be53-a3cc1ed32de5, email='ACTIVE', status='ACTIVE', idOrCertNumber='Researcher', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5416");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean6 = labManager5.isActive();
        double double7 = labManager5.getHourlyRate();
        double double8 = labManager5.getHourlyRate();
        labManager5.setEmail("LM-CERT");
        boolean boolean11 = labManager5.isActive();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment21 = new model.Equipment("", "", "");
        equipment21.enable();
        equipment21.enable();
        java.lang.String str24 = equipment21.getStatus();
        equipment21.markMaintenance();
        observer.EquipmentObserver equipmentObserver26 = null;
        equipment21.attach(equipmentObserver26);
        java.lang.String str28 = equipment21.getStatus();
        java.lang.String str29 = equipment21.getEquipmentId();
        java.lang.String str30 = equipment21.getLabLocation();
        equipment21.setStatus("ACTIVE");
        labManager17.setEquipmentStatus(equipment21, "User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState35 = equipment21.getCurrentState();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment21.attach(equipmentObserver36);
        labManager5.setEquipmentStatus(equipment21, "User{userId=452c93a8-2c4b-4a20-b0c8-51949537a949, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Available" + "'", str24, "Available");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Maintenance" + "'", str28, "Maintenance");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState35);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5417");
        model.Equipment equipment3 = new model.Equipment("LabManager", "Available", "hi!");
        equipment3.enable();
        state.EquipmentState equipmentState5 = equipment3.getCurrentState();
        equipment3.disable();
        equipment3.setStatus("User{userId=ef8f36b0-7347-4b80-9f24-1063f2165a80, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}");
        org.junit.Assert.assertNotNull(equipmentState5);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5418");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = null;
        student3.setUserId(uUID4);
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getStatus();
        java.lang.String str8 = student3.getIdOrCertNumber();
        student3.setEmail("User{userId=db997688-0c5f-48ea-9189-0e24fa76c3b1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5419");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        faculty3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "74) test5419(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "5e8972a5-84f5-416e-a9c4-1dca26e4fbe0");
// flaky "13) test5419(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=5e8972a5-84f5-416e-a9c4-1dca26e4fbe0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=5e8972a5-84f5-416e-a9c4-1dca26e4fbe0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5420");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.setPasswordHash("LabManager");
        labManager3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment11 = new model.Equipment("", "", "");
        java.lang.String str12 = equipment11.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment11.isModifyAvailable(localDateTime13, localDateTime14, "hi!", reservation16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment11.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation21);
        java.lang.String str23 = equipment11.toString();
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        java.lang.String str34 = equipment27.getEquipmentId();
        equipment27.setStatus("");
        state.EquipmentState equipmentState37 = equipment27.getCurrentState();
        equipment11.setState(equipmentState37);
        equipment11.enable();
        labManager3.setEquipmentStatus(equipment11, "User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment11.setLabLocation("Equipment{equipmentId='', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='Available'}");
        equipment11.enable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str23, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(equipmentState37);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5421");
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
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager27 = headLabCoordinator25.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment31 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        model.Reservation reservation35 = null;
        boolean boolean36 = equipment31.isModifyAvailable(localDateTime32, localDateTime33, "Faculty", reservation35);
        equipment31.setLabLocation("Faculty");
        labManager27.setEquipmentStatus(equipment31, "Guest");
        java.lang.String str41 = labManager27.getStatus();
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.lang.String str46 = equipment45.getDescription();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment45.isModifyAvailable(localDateTime47, localDateTime48, "hi!", reservation50);
        java.lang.String str52 = equipment45.getDescription();
        state.EquipmentState equipmentState53 = equipment45.getCurrentState();
        labManager27.markMaintenance(equipment45);
        equipment45.setLabLocation("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment45.disable();
        model.HeadLabCoordinator headLabCoordinator61 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager63 = headLabCoordinator61.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID64 = null;
        headLabCoordinator61.setUserId(uUID64);
        model.LabManager labManager67 = headLabCoordinator61.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment71 = new model.Equipment("", "", "");
        equipment71.enable();
        labManager67.addEquipment(equipment71);
        java.lang.String str74 = equipment71.toString();
        java.time.LocalDateTime localDateTime75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        boolean boolean78 = equipment71.isAvailable(localDateTime75, localDateTime76, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment82 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        model.Reservation reservation86 = null;
        boolean boolean87 = equipment82.isModifyAvailable(localDateTime83, localDateTime84, "Faculty", reservation86);
        equipment82.setLabLocation("Faculty");
        java.lang.String str90 = equipment82.getDescription();
        java.lang.String str91 = equipment82.getEquipmentId();
        equipment82.notifyObservers();
        equipment82.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        state.EquipmentState equipmentState95 = equipment82.getCurrentState();
        equipment71.setState(equipmentState95);
        equipment45.setState(equipmentState95);
        equipment3.setState(equipmentState95);
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(equipmentState21);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ACTIVE" + "'", str41, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipmentState53);
        org.junit.Assert.assertNotNull(labManager63);
        org.junit.Assert.assertNotNull(labManager67);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str74, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(equipmentState95);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5422");
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
        java.lang.String str50 = labManager5.getRole();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "LabManager" + "'", str50, "LabManager");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5423");
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
        model.Equipment equipment72 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        model.Reservation reservation76 = null;
        boolean boolean77 = equipment72.isModifyAvailable(localDateTime73, localDateTime74, "Faculty", reservation76);
        equipment72.setLabLocation("Faculty");
        java.lang.String str80 = equipment72.getDescription();
        java.lang.String str81 = equipment72.getEquipmentId();
        java.lang.String str82 = equipment72.getDescription();
        observer.EquipmentObserver equipmentObserver83 = null;
        equipment72.detach(equipmentObserver83);
        java.lang.String str85 = equipment72.getLabLocation();
        equipment72.setStatus("hi!");
        equipment72.markMaintenance();
        equipment72.setStatus("");
        labManager5.addEquipment(equipment72);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(uUID48);
// flaky "75) test5423(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID48.toString(), "db5eb4c6-2517-4199-8d7b-98093dcd02db");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status=''}" + "'", str67, "Equipment{equipmentId='', description='', labLocation='', status=''}");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Faculty" + "'", str85, "Faculty");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5424");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        equipment3.notifyObservers();
        java.lang.String str14 = equipment3.getDescription();
        java.lang.String str15 = equipment3.getEquipmentId();
        state.EquipmentState equipmentState16 = equipment3.getCurrentState();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(equipmentState16);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5425");
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
        equipment3.setStatus("User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Available" + "'", str19, "Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState28);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5426");
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
        labManager11.setActive(false);
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
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5427");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}", "User{userId=5b777b57-0f4b-4be6-9960-80b3dd667f1c, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}", "User{userId=aba9aea5-5166-46f6-bd18-14b8b26e887d, email='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5428");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str14 = headLabCoordinator3.toString();
        java.lang.String str15 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str14, "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5429");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        boolean boolean7 = faculty3.isActive();
        faculty3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str10 = faculty3.getRole();
        double double11 = faculty3.getHourlyRate();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5430");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.toString();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
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
        observer.EquipmentObserver equipmentObserver42 = null;
        equipment29.detach(equipmentObserver42);
        equipment29.enable();
        equipment29.enable();
        labManager9.addEquipment(equipment29);
        java.lang.String str47 = equipment29.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
// flaky "76) test5430(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=f79bb112-454a-4808-a71b-e9af875b8eb4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str7, "User{userId=f79bb112-454a-4808-a71b-e9af875b8eb4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Available" + "'", str47, "Available");
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5431");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "User{userId=74c1da88-3641-4d4c-87ef-ff7c77d2e098, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}", "User{userId=3ea24dc7-f640-44c6-99b2-10e76d3f61dc, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5432");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment14.isModifyAvailable(localDateTime15, localDateTime16, "Faculty", reservation18);
        equipment14.setLabLocation("Faculty");
        java.lang.String str22 = equipment14.getDescription();
        java.lang.String str23 = equipment14.getEquipmentId();
        equipment14.notifyObservers();
        equipment14.setStatus("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment14.detach(equipmentObserver27);
        labManager5.addEquipment(equipment14);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment14.isAvailable(localDateTime30, localDateTime31, "User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str34 = equipment14.getDescription();
        java.lang.String str35 = equipment14.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5433");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        observer.EquipmentObserver equipmentObserver9 = null;
        equipment3.detach(equipmentObserver9);
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5434");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.setLabLocation("Researcher");
        equipment3.setDescription("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        equipment3.setDescription("User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5435");
        model.Researcher researcher3 = new model.Researcher("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        double double5 = researcher3.getHourlyRate();
        researcher3.setActive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5436");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5437");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5438");
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
        java.lang.String str39 = faculty3.getEmail();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "77) test5438(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "8bb73f7f-4a70-4c53-a53a-05ceec3cb5af");
// flaky "14) test5438(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=8bb73f7f-4a70-4c53-a53a-05ceec3cb5af, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=8bb73f7f-4a70-4c53-a53a-05ceec3cb5af, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertNotNull(uUID35);
// flaky "5) test5438(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID35.toString(), "e9daf368-9d4b-45c9-810c-515edd627e14");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5439");
        model.Faculty faculty3 = new model.Faculty("User{userId=4b98986f-3b04-4397-a461-2c6477e10e09, email='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', status='ACTIVE', idOrCertNumber='Guest', role='Researcher'}", "User{userId=2a6f07b2-be2e-496b-b2c0-545d679309c8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=61a9406c-0105-404f-816e-79520e3e5f8d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.util.UUID uUID4 = faculty3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "78) test5439(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "ec9d1e73-bdf5-490a-814d-a22f05101834");
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5440");
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
        state.EquipmentState equipmentState94 = equipment3.getCurrentState();
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
        org.junit.Assert.assertNotNull(equipmentState94);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5441");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        labManager5.setPasswordHash("LM-CERT");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment17 = new model.Equipment("", "", "");
        labManager13.markMaintenance(equipment17);
        labManager5.markMaintenance(equipment17);
        java.lang.String str20 = equipment17.getEquipmentId();
        equipment17.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5442");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=54dfb277-111d-4b66-9c47-2c3c2e178972, email='Faculty', status='ACTIVE', idOrCertNumber='Student', role='HeadLabCoordinator'}");
        headLabCoordinator3.setPasswordHash("User{userId=4d0a85d8-97dd-4f15-9b14-6b8414f28684, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setPasswordHash("User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5443");
        model.Guest guest3 = new model.Guest("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID8 = headLabCoordinator7.getUserId();
        guest3.setUserId(uUID8);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "79) test5443(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID8.toString(), "bba48427-d915-46d9-83bb-cd8429bc035a");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5444");
        model.Faculty faculty3 = new model.Faculty("User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}'}", "User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5445");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str11 = headLabCoordinator3.getRole();
        double double12 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HeadLabCoordinator" + "'", str11, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5446");
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
        java.lang.String str30 = equipment13.getLabLocation();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LabManager" + "'", str30, "LabManager");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5447");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getIdOrCertNumber();
        java.util.UUID uUID11 = guest3.getUserId();
        double double12 = guest3.getHourlyRate();
        java.util.UUID uUID13 = guest3.getUserId();
        java.lang.String str14 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "80) test5447(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID11.toString(), "8d5cbf7c-4d9c-4bb7-8b2b-83d36717ebc3");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertNotNull(uUID13);
// flaky "15) test5447(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID13.toString(), "8d5cbf7c-4d9c-4bb7-8b2b-83d36717ebc3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5448");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5449");
        model.LabManager labManager3 = new model.LabManager("User{userId=a6f08cf7-412b-47d4-a994-0c81501f765a, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        labManager9.markMaintenance(equipment13);
        java.lang.String str15 = labManager9.getRole();
        java.lang.String str16 = labManager9.getRole();
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        labManager22.markMaintenance(equipment26);
        double double28 = labManager22.getHourlyRate();
        java.lang.String str29 = labManager22.getRole();
        double double30 = labManager22.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator34 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager36 = headLabCoordinator34.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        model.Reservation reservation44 = null;
        boolean boolean45 = equipment40.isModifyAvailable(localDateTime41, localDateTime42, "Faculty", reservation44);
        equipment40.setLabLocation("Faculty");
        labManager36.setEquipmentStatus(equipment40, "");
        equipment40.notifyObservers();
        labManager22.addEquipment(equipment40);
        labManager9.setEquipmentStatus(equipment40, "Guest");
        equipment40.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        state.EquipmentState equipmentState56 = equipment40.getCurrentState();
        equipment40.disable();
        equipment40.setDescription("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager3.setEquipmentStatus(equipment40, "Equipment{equipmentId='', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LabManager" + "'", str29, "LabManager");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(equipmentState56);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5450");
        model.LabManager labManager3 = new model.LabManager("User{userId=55859998-7fb2-492b-af42-9cb87ba76d25, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=aaac467a-33c2-4ec9-977a-37a231196fb5, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=625d16be-7efc-4905-9939-63da2af3f56a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5451");
        model.LabManager labManager3 = new model.LabManager("User{userId=b05d50e5-8921-4417-a2c5-cc348fda0850, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=54de9478-03f9-4ce1-8bfd-5f4ef29f192d, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5452");
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
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean25 = equipment3.isAvailable(localDateTime22, localDateTime23, "User{userId=448a8e9f-791d-4d06-b641-482af916fab5, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5453");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getIdOrCertNumber();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=ae9cce22-76c2-47ed-810a-e8395a412279, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5454");
        model.Researcher researcher3 = new model.Researcher("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5455");
        model.Researcher researcher3 = new model.Researcher("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getRole();
        researcher3.setActive(true);
        double double9 = researcher3.getHourlyRate();
        java.lang.String str10 = researcher3.getRole();
        java.lang.Class<?> wildcardClass11 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5456");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getRole();
        java.lang.String str9 = guest3.getRole();
        double double10 = guest3.getHourlyRate();
        java.lang.String str11 = guest3.getStatus();
        java.lang.String str12 = guest3.getRole();
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5457");
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
        labManager9.setPasswordHash("User{userId=314fdddc-6f3c-486c-8e49-c451df821db9, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str33 = labManager9.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ACTIVE" + "'", str33, "ACTIVE");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5458");
        model.Researcher researcher3 = new model.Researcher("User{userId=a74c49b8-a5f0-457d-85b2-eb1dddb43fd1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a439f2ca-eba6-4ac1-8170-cc60ce20f2f1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        researcher3.setIdOrCertNumber("Equipment{equipmentId='', description='ACTIVE', labLocation='', status='Disabled'}");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5459");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        double double11 = labManager5.getHourlyRate();
        model.Equipment equipment15 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment15.isModifyAvailable(localDateTime16, localDateTime17, "Faculty", reservation19);
        equipment15.setLabLocation("Faculty");
        equipment15.notifyObservers();
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment15.attach(equipmentObserver24);
        java.lang.String str26 = equipment15.getEquipmentId();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment15.attach(equipmentObserver27);
        labManager5.addEquipment(equipment15);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5460");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.disable();
        java.lang.String str12 = equipment3.getDescription();
        state.EquipmentState equipmentState13 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5461");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.Equipment equipment9 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager5.setEquipmentStatus(equipment12, "User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5462");
        model.LabManager labManager3 = new model.LabManager("User{userId=ae9978ff-f517-4155-953f-ce8b5fb68225, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Faculty", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        java.util.UUID uUID4 = labManager3.getUserId();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "81) test5462(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "e5dc14a2-7f30-4b59-9dda-c630ffa7ba71");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5463");
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
        state.EquipmentState equipmentState59 = equipment36.getCurrentState();
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
        org.junit.Assert.assertNotNull(equipmentState59);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5464");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.getEmail();
        java.lang.String str7 = headLabCoordinator3.getRole();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3abb3773-2143-448b-b915-57a30a3458b2, email='hi!', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5465");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        faculty3.setPasswordHash("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        faculty3.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5466");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setPasswordHash("User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getRole();
        guest3.setEmail("User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5467");
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
        java.lang.String str76 = equipment10.getDescription();
        java.lang.String str77 = equipment10.toString();
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str77, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5468");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        java.lang.String str8 = guest3.getStatus();
        java.lang.String str9 = guest3.getRole();
        java.lang.String str10 = guest3.getIdOrCertNumber();
        boolean boolean11 = guest3.isActive();
        java.lang.Class<?> wildcardClass12 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5469");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='INACTIVE', description='', labLocation='Temp123!', status='Available'}", "User{userId=6cb50588-0b93-43c9-81cf-3668e8bfa593, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cf812831-8496-4e38-8c13-8c86d27d90c5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5470");
        model.Faculty faculty3 = new model.Faculty("User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5471");
        model.Equipment equipment3 = new model.Equipment("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=be0cd301-1915-4be2-a55d-7bf2f3afec68, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment3.setLabLocation("User{userId=6eada9ec-7c0c-4c7f-a1ec-894f2baf7e80, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        equipment3.setState(equipmentState28);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(equipmentState28);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5472");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.setLabLocation("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5473");
        model.Student student3 = new model.Student("User{userId=beae0773-8013-4055-b09e-2e4a8f95ea4f, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4f9a032c-739b-4de5-83d1-374717cd8209, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}", "User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        model.Equipment equipment7 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        model.Reservation reservation11 = null;
        boolean boolean12 = equipment7.isModifyAvailable(localDateTime8, localDateTime9, "Faculty", reservation11);
        equipment7.setLabLocation("Faculty");
        java.lang.String str15 = equipment7.getDescription();
        java.lang.String str16 = equipment7.getEquipmentId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        model.Reservation reservation20 = null;
        boolean boolean21 = equipment7.isModifyAvailable(localDateTime17, localDateTime18, "INACTIVE", reservation20);
        equipment7.disable();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        strategy.PricingStrategy pricingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation26 = new model.Reservation((model.User) student3, equipment7, localDateTime23, localDateTime24, pricingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5474");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        researcher3.setActive(true);
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5475");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver12 = null;
        equipment3.detach(equipmentObserver12);
        java.lang.String str14 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Maintenance" + "'", str14, "Maintenance");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5476");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        faculty3.setIdOrCertNumber("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str10 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "82) test5476(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "a0864da8-ee8f-4263-ad7f-a53467c83eb0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5477");
        model.Equipment equipment3 = new model.Equipment("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str8 = equipment3.getLabLocation();
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5478");
        model.Student student3 = new model.Student("User{userId=8e6b7906-cc87-4451-b1b0-3b0ef7c40cb1, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}");
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5479");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        java.util.UUID uUID5 = null;
        guest3.setUserId(uUID5);
        double double7 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5480");
        model.Faculty faculty3 = new model.Faculty("", "Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}", "User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5481");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment17.detach(equipmentObserver21);
        observer.EquipmentObserver equipmentObserver23 = null;
        equipment17.attach(equipmentObserver23);
        java.lang.String str25 = equipment17.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Temp123!" + "'", str25, "Temp123!");
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5482");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        java.lang.String str11 = equipment3.getEquipmentId();
        equipment3.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.enable();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5483");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Disabled'}", "", "User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5484");
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
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment35.isModifyAvailable(localDateTime51, localDateTime52, "User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation54);
        equipment35.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5485");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=cc579358-bb9e-487a-a8ff-7b8f27fb2b8c, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=11cd90bf-4681-4dba-90fc-fc25f3b4a6ff, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5486");
        model.Student student3 = new model.Student("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5487");
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
        java.lang.Class<?> wildcardClass37 = equipment27.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5488");
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
        java.lang.String str37 = labManager5.getRole();
        java.lang.String str38 = labManager5.getRole();
        java.lang.String str39 = labManager5.getRole();
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment43.isModifyAvailable(localDateTime44, localDateTime45, "Faculty", reservation47);
        equipment43.setLabLocation("Faculty");
        java.lang.String str51 = equipment43.getDescription();
        java.lang.String str52 = equipment43.getEquipmentId();
        equipment43.notifyObservers();
        equipment43.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment43.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str58 = equipment43.getDescription();
        observer.EquipmentObserver equipmentObserver59 = null;
        equipment43.detach(equipmentObserver59);
        java.lang.String str61 = equipment43.getEquipmentId();
        equipment43.enable();
        java.lang.String str63 = equipment43.getEquipmentId();
        labManager5.markMaintenance(equipment43);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LabManager" + "'", str38, "LabManager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "LabManager" + "'", str39, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str58, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5489");
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
        java.lang.String str29 = equipment28.getDescription();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        model.Reservation reservation33 = null;
        boolean boolean34 = equipment28.isModifyAvailable(localDateTime30, localDateTime31, "hi!", reservation33);
        java.lang.String str35 = equipment28.getDescription();
        state.EquipmentState equipmentState36 = equipment28.getCurrentState();
        equipment28.setLabLocation("Student");
        java.lang.String str39 = equipment28.getStatus();
        equipment28.setStatus("User{userId=4c195be8-25b8-4ea7-a5d4-a4c9946fd84c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager5.addEquipment(equipment28);
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment28.detach(equipmentObserver43);
        java.lang.String str45 = equipment28.getEquipmentId();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str21, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(equipmentState36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Available" + "'", str39, "Available");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5490");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getStatus();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Faculty");
        java.lang.String str14 = labManager13.getRole();
        model.LabManager labManager18 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment28.isModifyAvailable(localDateTime29, localDateTime30, "Faculty", reservation32);
        equipment28.setLabLocation("Faculty");
        labManager24.setEquipmentStatus(equipment28, "");
        equipment28.setDescription("");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment43.isModifyAvailable(localDateTime44, localDateTime45, "Faculty", reservation47);
        equipment43.setLabLocation("Faculty");
        equipment43.notifyObservers();
        observer.EquipmentObserver equipmentObserver52 = null;
        equipment43.attach(equipmentObserver52);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment43.isModifyAvailable(localDateTime54, localDateTime55, "Faculty", reservation57);
        state.EquipmentState equipmentState59 = equipment43.getCurrentState();
        equipment28.setState(equipmentState59);
        labManager18.setEquipmentStatus(equipment28, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        equipment28.markMaintenance();
        labManager13.setEquipmentStatus(equipment28, "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager7.addEquipment(equipment28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(equipmentState59);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5491");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        double double8 = guest3.getHourlyRate();
        double double9 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5492");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.toString();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.toString();
        student3.setActive(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky "83) test5492(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=494283fd-f007-4914-98db-b5bca55ef399, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str5, "User{userId=494283fd-f007-4914-98db-b5bca55ef399, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
// flaky "16) test5492(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=494283fd-f007-4914-98db-b5bca55ef399, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str8, "User{userId=494283fd-f007-4914-98db-b5bca55ef399, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5493");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=559cd54d-34d9-4afb-8ee9-adb79e1935a0, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "");
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5494");
        model.Researcher researcher3 = new model.Researcher("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5495");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setStatus("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setStatus("User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment3.setDescription("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5496");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("HeadLabCoordinator", "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        headLabCoordinator3.setEmail("User{userId=9735b12d-2c56-4206-a6dd-ddf9af83d75e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5497");
        model.LabManager labManager3 = new model.LabManager("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID4 = labManager3.getUserId();
        java.util.UUID uUID5 = labManager3.getUserId();
        model.Equipment equipment9 = new model.Equipment("", "", "");
        java.lang.String str10 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        model.Reservation reservation14 = null;
        boolean boolean15 = equipment9.isModifyAvailable(localDateTime11, localDateTime12, "hi!", reservation14);
        java.lang.String str16 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean20 = equipment9.isAvailable(localDateTime17, localDateTime18, "Faculty");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment9.isModifyAvailable(localDateTime21, localDateTime22, "Researcher", reservation24);
        equipment9.markMaintenance();
        equipment9.disable();
        labManager3.addEquipment(equipment9);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "84) test5497(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID4.toString(), "a74a08fe-f421-4260-a137-9677a5c76c1f");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "17) test5497(randoop.RandoopRegressionTest10)":         org.junit.Assert.assertEquals(uUID5.toString(), "a74a08fe-f421-4260-a137-9677a5c76c1f");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5498");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getPasswordHash();
        student3.setPasswordHash("User{userId=08612780-e04d-442c-968e-9604fd961966, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5499");
        model.LabManager labManager3 = new model.LabManager("User{userId=a316677c-638d-4d36-8514-24c5a2c43dd9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "");
        java.lang.String str4 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test5500");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(false);
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9e29ffe6-8fcc-44ce-8ec0-071be909d4f1, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        java.lang.String str15 = labManager14.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LabManager" + "'", str15, "LabManager");
    }
}
