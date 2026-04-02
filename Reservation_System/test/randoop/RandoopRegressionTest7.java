package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3501");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f144c862-2e10-416f-ad92-30f5709f9823, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str13 = labManager12.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LabManager" + "'", str13, "LabManager");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3502");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3503");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(equipmentState7);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3504");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=6e7c67fc-b654-44a2-bb2e-8214b1e892f6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=af57cfef-2fb4-49c7-a477-6831ded61edc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3505");
        model.Guest guest3 = new model.Guest("Faculty", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3506");
        model.Researcher researcher3 = new model.Researcher("LabManager", "User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        boolean boolean4 = researcher3.isActive();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3507");
        model.LabManager labManager3 = new model.LabManager("", "INACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.toString();
        java.lang.String str5 = labManager3.getRole();
        java.lang.String str6 = labManager3.getEmail();
        model.Researcher researcher10 = new model.Researcher("", "hi!", "hi!");
        researcher10.setEmail("hi!");
        java.lang.String str13 = researcher10.getRole();
        java.lang.String str14 = researcher10.getIdOrCertNumber();
        double double15 = researcher10.getHourlyRate();
        java.lang.String str16 = researcher10.getRole();
        java.lang.String str17 = researcher10.getStatus();
        java.lang.String str18 = researcher10.getRole();
        model.HeadLabCoordinator headLabCoordinator22 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager24 = headLabCoordinator22.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID25 = null;
        headLabCoordinator22.setUserId(uUID25);
        model.LabManager labManager28 = headLabCoordinator22.autoGenerateManagerAccount("ACTIVE");
        model.Student student32 = new model.Student("", "hi!", "");
        java.lang.String str33 = student32.getEmail();
        java.util.UUID uUID34 = student32.getUserId();
        labManager28.setUserId(uUID34);
        researcher10.setUserId(uUID34);
        labManager3.setUserId(uUID34);
// flaky "1) test3507(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=86acf6a5-48a9-4fb5-8f03-3470b42b6e1b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=86acf6a5-48a9-4fb5-8f03-3470b42b6e1b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ACTIVE" + "'", str17, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(uUID34);
// flaky "1) test3507(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID34.toString(), "84769ba3-3317-424e-a171-acd7294ed940");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3508");
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
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean31 = equipment3.isAvailable(localDateTime28, localDateTime29, "Faculty");
        java.lang.String str32 = equipment3.getDescription();
        equipment3.enable();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean37 = equipment3.isAvailable(localDateTime34, localDateTime35, "User{userId=50c8e534-0cef-4e1f-8015-4eb5b8d5dfed, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3509");
        model.Faculty faculty3 = new model.Faculty("User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=11ff8a89-7998-42ec-8171-2ac3d64b4624, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}", "User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        faculty3.setActive(true);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3510");
        model.LabManager labManager3 = new model.LabManager("User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9e7ce067-9b8a-43c7-bf62-78e8f21ef6d6, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3511");
        model.Student student3 = new model.Student("", "hi!", "");
        java.lang.String str4 = student3.getIdOrCertNumber();
        double double5 = student3.getHourlyRate();
        student3.setActive(false);
        java.lang.String str8 = student3.getStatus();
        java.lang.String str9 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "INACTIVE" + "'", str8, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3512");
        model.Guest guest3 = new model.Guest("Student", "Student", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        model.Student student8 = new model.Student("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.Researcher researcher12 = new model.Researcher("", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        model.Student student16 = new model.Student("", "hi!", "");
        double double17 = student16.getHourlyRate();
        java.lang.String str18 = student16.toString();
        double double19 = student16.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager25 = headLabCoordinator23.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID26 = null;
        headLabCoordinator23.setUserId(uUID26);
        model.LabManager labManager29 = headLabCoordinator23.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager31 = headLabCoordinator23.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID32 = labManager31.getUserId();
        student16.setUserId(uUID32);
        researcher12.setUserId(uUID32);
        student8.setUserId(uUID32);
        guest3.setUserId(uUID32);
        java.lang.String str37 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
// flaky "2) test3512(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=ee55f42b-52db-43a6-9d24-32867c8424a0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str18, "User{userId=ee55f42b-52db-43a6-9d24-32867c8424a0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(uUID32);
// flaky "2) test3512(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID32.toString(), "9148fb10-be44-4fad-97d3-4320c0f7cd1c");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Guest" + "'", str37, "Guest");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3513");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.Guest guest7 = new model.Guest("Guest", "", "Researcher");
        double double8 = guest7.getHourlyRate();
        java.util.UUID uUID9 = guest7.getUserId();
        headLabCoordinator3.setUserId(uUID9);
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str13 = headLabCoordinator3.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "3) test3513(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID9.toString(), "29ed775a-6de1-449c-8ff4-28a107ba4978");
        org.junit.Assert.assertNotNull(labManager12);
// flaky "3) test3513(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User{userId=29ed775a-6de1-449c-8ff4-28a107ba4978, email='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='HeadLabCoordinator'}" + "'", str13, "User{userId=29ed775a-6de1-449c-8ff4-28a107ba4978, email='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3514");
        model.Faculty faculty3 = new model.Faculty("User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        double double4 = faculty3.getHourlyRate();
        faculty3.setEmail("User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3515");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=b7aed6ee-1c32-4982-a775-ce20394d0d35, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}", "User{userId=d2a2f575-917c-42fb-b2ef-f4d031de5738, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=321af3c9-2c62-49f9-9643-94cb3f73b88e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3516");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        labManager13.setEmail("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str16 = labManager13.getStatus();
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.lang.String str21 = equipment20.getDescription();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        model.Reservation reservation25 = null;
        boolean boolean26 = equipment20.isModifyAvailable(localDateTime22, localDateTime23, "hi!", reservation25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment20.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation30);
        java.lang.String str32 = equipment20.toString();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment20.isModifyAvailable(localDateTime33, localDateTime34, "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation36);
        state.EquipmentState equipmentState38 = equipment20.getCurrentState();
        java.lang.String str39 = equipment20.getStatus();
        equipment20.markMaintenance();
        labManager13.markMaintenance(equipment20);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str32, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(equipmentState38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Available" + "'", str39, "Available");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3517");
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
        java.lang.String str16 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "4) test3517(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "eee24178-60f1-4493-a5ae-b7e54109c804");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3518");
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
        model.Equipment equipment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager3.markMaintenance(equipment28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.markMaintenance()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(equipmentState20);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3519");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        equipment3.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setDescription("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        java.lang.String str12 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        model.Reservation reservation16 = null;
        boolean boolean17 = equipment3.isModifyAvailable(localDateTime13, localDateTime14, "User{userId=012a2351-8ad8-4544-a176-5faec0e79d04, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Available" + "'", str12, "Available");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3520");
        model.Faculty faculty3 = new model.Faculty("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "hi!", "");
        double double4 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3521");
        model.Guest guest3 = new model.Guest("", "User{userId=3b48c400-6fdc-4b8c-91bd-56d0e9c363f7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=29c65afa-dc4f-4bb3-8e6c-595f8600585d, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3522");
        model.Guest guest3 = new model.Guest("User{userId=104974fd-7578-4676-983b-6c33a24600ba, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        model.LabManager labManager7 = new model.LabManager("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = labManager7.getIdOrCertNumber();
        java.lang.String str9 = labManager7.toString();
        java.lang.String str10 = labManager7.getRole();
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        labManager16.markMaintenance(equipment20);
        java.lang.String str22 = labManager16.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator26 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager28 = headLabCoordinator26.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment32.isModifyAvailable(localDateTime33, localDateTime34, "Faculty", reservation36);
        equipment32.setLabLocation("Faculty");
        labManager28.setEquipmentStatus(equipment32, "");
        equipment32.notifyObservers();
        labManager16.markMaintenance(equipment32);
        equipment32.disable();
        java.lang.String str45 = equipment32.getDescription();
        labManager7.setEquipmentStatus(equipment32, "User{userId=f276cb30-cc86-449e-af7f-b94d06fa67e7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        strategy.PricingStrategy pricingStrategy50 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation51 = new model.Reservation((model.User) guest3, equipment32, localDateTime48, localDateTime49, pricingStrategy50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str8, "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "5) test3522(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=04d5a87f-68eb-492b-b3ad-dca76753e37d, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str9, "User{userId=04d5a87f-68eb-492b-b3ad-dca76753e37d, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LabManager" + "'", str10, "LabManager");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LM-CERT" + "'", str22, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3523");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        java.lang.String str8 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "6) test3523(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID7.toString(), "bbf27f79-ea87-4864-aece-5af848cb607b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3524");
        model.Faculty faculty3 = new model.Faculty("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=82618f18-6634-4c47-8926-f1e6e8bd7d39, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=59e7abe2-7eea-41cd-857e-9a985971a6ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3525");
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
        equipment3.setDescription("User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver88 = null;
        equipment3.detach(equipmentObserver88);
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
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3526");
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
        equipment13.setStatus("ACTIVE");
        equipment13.setStatus("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3527");
        model.LabManager labManager3 = new model.LabManager("User{userId=ea87c0da-a58d-426a-8ac0-9954b1716b2e, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "HeadLabCoordinator", "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3528");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=cd7ac898-1480-4edb-97b2-820543eab3ad, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=af57cfef-2fb4-49c7-a477-6831ded61edc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3529");
        model.Equipment equipment3 = new model.Equipment("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}");
        equipment3.disable();
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3530");
        model.Faculty faculty3 = new model.Faculty("User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a74c49b8-a5f0-457d-85b2-eb1dddb43fd1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f4f9943b-49cd-49cb-b4e1-b5a12ac82548, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3531");
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
        java.lang.String str18 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3532");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=9ef4c45b-b43c-462d-88df-a443dbf38502, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str15 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3533");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = student3.getUserId();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "7) test3533(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "2edcb92d-0a82-4501-b0b7-e80496f6d3e8");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3534");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        equipment9.setStatus("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment9.attach(equipmentObserver13);
        java.lang.String str15 = equipment9.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment9.markMaintenance();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3535");
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
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3536");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        boolean boolean8 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        equipment16.enable();
        java.lang.String str18 = equipment16.toString();
        labManager12.addEquipment(equipment16);
        model.SensorUpdate sensorUpdate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment16.applySensorUpdate(sensorUpdate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3537");
        model.Faculty faculty3 = new model.Faculty("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "User{userId=6eada9ec-7c0c-4c7f-a1ec-894f2baf7e80, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3538");
        model.Student student3 = new model.Student("User{userId=e4e96d1a-20ea-4a7d-980e-b38492bb3fb6, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=be38d8d0-09bb-46fc-8661-8a5a19b7d1b4, email='Researcher', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=b3559384-c022-4e4f-a432-e89d2db5f9ca, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3539");
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
        equipment3.enable();
        equipment3.setLabLocation("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3540");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        java.util.UUID uUID8 = faculty3.getUserId();
        java.lang.String str9 = faculty3.getPasswordHash();
        faculty3.setActive(false);
        faculty3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "8) test3540(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID8.toString(), "f4c37de4-ed18-4aa7-be9b-8fffc9262c2f");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3541");
        model.Student student3 = new model.Student("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3542");
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
        java.lang.String str19 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean23 = equipment3.isAvailable(localDateTime20, localDateTime21, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3543");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        double double4 = researcher3.getHourlyRate();
        boolean boolean5 = researcher3.isActive();
        java.util.UUID uUID6 = researcher3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(uUID6);
// flaky "9) test3543(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID6.toString(), "653aeba9-24b3-47c0-b4ed-e2d279fa484f");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3544");
        model.Student student3 = new model.Student("Available", "User{userId=29535a0d-9d8c-4304-8892-1bf93b64cc11, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=e198018f-95c6-450a-ad5f-675ecbf69376, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3545");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = guest3.getIdOrCertNumber();
        java.util.UUID uUID11 = guest3.getUserId();
        java.lang.String str12 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "10) test3545(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "d21aa556-26b4-46de-b596-3462c2b9413f");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3546");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        java.util.UUID uUID7 = guest3.getUserId();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "11) test3546(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID7.toString(), "37b255e8-e7d7-4bab-b332-39903101e141");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3547");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setPasswordHash("User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3548");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean23 = equipment3.isAvailable(localDateTime20, localDateTime21, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        observer.EquipmentObserver equipmentObserver24 = null;
        equipment3.attach(equipmentObserver24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3549");
        model.Student student3 = new model.Student("User{userId=452c93a8-2c4b-4a20-b0c8-51949537a949, email='hi!', status='ACTIVE', idOrCertNumber='', role='Faculty'}", "", "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        java.lang.String str4 = student3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3550");
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
        model.Equipment equipment76 = new model.Equipment("", "", "");
        java.lang.String str77 = equipment76.getDescription();
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        model.Reservation reservation81 = null;
        boolean boolean82 = equipment76.isModifyAvailable(localDateTime78, localDateTime79, "hi!", reservation81);
        java.time.LocalDateTime localDateTime83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        model.Reservation reservation86 = null;
        boolean boolean87 = equipment76.isModifyAvailable(localDateTime83, localDateTime84, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation86);
        java.lang.String str88 = equipment76.getStatus();
        java.time.LocalDateTime localDateTime89 = null;
        java.time.LocalDateTime localDateTime90 = null;
        boolean boolean92 = equipment76.isAvailable(localDateTime89, localDateTime90, "User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager5.addEquipment(equipment76);
        java.lang.String str94 = labManager5.getRole();
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
// flaky "12) test3550(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID71.toString(), "bd0b515b-70ff-4d60-8f81-c9034eca2b29");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LM-CERT" + "'", str72, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Available" + "'", str88, "Available");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "LabManager" + "'", str94, "LabManager");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3551");
        model.Guest guest3 = new model.Guest("User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=d736c8c8-7132-400d-b4a0-06004de8f467, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=64f60eb5-310c-477e-9c0e-3658a01ecc5b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3552");
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
        labManager19.markMaintenance(equipment23);
        java.lang.String str25 = labManager19.getRole();
        java.lang.String str26 = labManager19.getRole();
        model.HeadLabCoordinator headLabCoordinator30 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager32 = headLabCoordinator30.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment36 = new model.Equipment("", "", "");
        labManager32.markMaintenance(equipment36);
        double double38 = labManager32.getHourlyRate();
        java.lang.String str39 = labManager32.getRole();
        double double40 = labManager32.getHourlyRate();
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
        labManager32.addEquipment(equipment50);
        labManager19.setEquipmentStatus(equipment50, "Guest");
        observer.EquipmentObserver equipmentObserver64 = null;
        equipment50.attach(equipmentObserver64);
        labManager5.setEquipmentStatus(equipment50, "User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        labManager5.setEmail("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "LabManager" + "'", str39, "LabManager");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3553");
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
        java.lang.String str49 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipmentState37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LabManager" + "'", str49, "LabManager");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3554");
        model.Equipment equipment3 = new model.Equipment("", "", "User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3555");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=9d416907-3a05-44fd-bc51-fc26cdb1078f, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3556");
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
// flaky "13) test3556(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=24edff4a-2e54-429e-801f-950d1af3a3e6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=24edff4a-2e54-429e-801f-950d1af3a3e6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3557");
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
        model.Equipment equipment56 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str57 = equipment56.getStatus();
        equipment56.markMaintenance();
        equipment56.notifyObservers();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        boolean boolean63 = equipment56.isAvailable(localDateTime60, localDateTime61, "User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager9.addEquipment(equipment56);
        model.SensorUpdate sensorUpdate65 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment56.applySensorUpdate(sensorUpdate65);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str50, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ACTIVE" + "'", str52, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Available" + "'", str57, "Available");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3558");
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
        java.lang.String str23 = labManager8.getRole();
        labManager8.setIdOrCertNumber("User{userId=9bbc74b2-f7ec-401d-92df-d7f8f8c59707, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str26 = labManager8.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LabManager" + "'", str23, "LabManager");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LabManager" + "'", str26, "LabManager");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3559");
        model.Student student3 = new model.Student("User{userId=392734b6-8112-44d8-a042-3e62fff3cf5b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4298ef49-152c-48d2-9e46-50dbed5f5f6d, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3560");
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
        equipment38.setDescription("User{userId=37ffc006-9dc0-479a-b401-aaea8c331831, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment38.isAvailable(localDateTime53, localDateTime54, "User{userId=fa6ca985-a0a9-4852-8f63-b01127de2a8a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment38.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3561");
        model.Equipment equipment3 = new model.Equipment("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Faculty");
        java.lang.String str4 = equipment3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime5, localDateTime6, "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}" + "'", str4, "Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3562");
        model.Guest guest3 = new model.Guest("User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=8afbbedf-cfb7-4c3d-ab78-d6e529baf541, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3563");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getRole();
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3564");
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
        observer.EquipmentObserver equipmentObserver37 = null;
        equipment23.attach(equipmentObserver37);
        model.SensorUpdate sensorUpdate39 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment23.applySensorUpdate(sensorUpdate39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
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
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3565");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "User{userId=f276cb30-cc86-449e-af7f-b94d06fa67e7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=f0765721-a687-481f-b6ed-91f0c3fe46a7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3566");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        java.lang.String str7 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3567");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPasswordHash();
        model.LabManager labManager10 = new model.LabManager("Student", "ACTIVE", "Faculty");
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        labManager16.markMaintenance(equipment20);
        java.lang.String str22 = labManager16.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator26 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager28 = headLabCoordinator26.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment32 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        model.Reservation reservation36 = null;
        boolean boolean37 = equipment32.isModifyAvailable(localDateTime33, localDateTime34, "Faculty", reservation36);
        equipment32.setLabLocation("Faculty");
        labManager28.setEquipmentStatus(equipment32, "");
        equipment32.notifyObservers();
        labManager16.markMaintenance(equipment32);
        model.Equipment equipment47 = new model.Equipment("", "", "");
        java.lang.String str48 = equipment47.getDescription();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        model.Reservation reservation52 = null;
        boolean boolean53 = equipment47.isModifyAvailable(localDateTime49, localDateTime50, "hi!", reservation52);
        java.lang.String str54 = equipment47.getEquipmentId();
        java.lang.String str55 = equipment47.getLabLocation();
        labManager16.markMaintenance(equipment47);
        model.Equipment equipment60 = new model.Equipment("", "", "");
        equipment60.enable();
        labManager16.addEquipment(equipment60);
        labManager10.markMaintenance(equipment60);
        java.lang.String str64 = labManager10.getRole();
        model.Researcher researcher68 = new model.Researcher("", "hi!", "hi!");
        researcher68.setEmail("hi!");
        java.lang.String str71 = researcher68.getRole();
        java.lang.String str72 = researcher68.getIdOrCertNumber();
        boolean boolean73 = researcher68.isActive();
        model.Student student77 = new model.Student("", "hi!", "");
        java.lang.String str78 = student77.getEmail();
        java.util.UUID uUID79 = student77.getUserId();
        researcher68.setUserId(uUID79);
        labManager10.setUserId(uUID79);
        student3.setUserId(uUID79);
        java.lang.String str83 = student3.getRole();
        java.lang.String str84 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LM-CERT" + "'", str22, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "LabManager" + "'", str64, "LabManager");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Researcher" + "'", str71, "Researcher");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(uUID79);
// flaky "14) test3567(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID79.toString(), "6ca639aa-6c0b-4055-b1d6-8e4292904893");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Student" + "'", str83, "Student");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str84, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3568");
        model.Student student3 = new model.Student("Disabled", "User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3569");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=38d38a2b-1ae6-4145-8a8b-642e7380dd9e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation21);
        java.lang.String str23 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str23, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3570");
        model.LabManager labManager3 = new model.LabManager("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=6eada9ec-7c0c-4c7f-a1ec-894f2baf7e80, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}");
        model.Equipment equipment7 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment7.setLabLocation("ACTIVE");
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getEquipmentId();
        equipment7.setLabLocation("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setEquipmentStatus(equipment7, "User{userId=9d416907-3a05-44fd-bc51-fc26cdb1078f, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        equipment7.setDescription("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3571");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        double double5 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setEmail("User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str8 = headLabCoordinator3.getStatus();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f3e2e007-c5a9-45ca-82b9-ddadffb7fff5, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        boolean boolean11 = labManager10.isActive();
        boolean boolean12 = labManager10.isActive();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "15) test3571(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "6046a4bb-712e-45af-bd44-e2e8332a6303");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3572");
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
        equipment3.enable();
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(equipmentState18);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3573");
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
        equipment12.markMaintenance();
        model.HeadLabCoordinator headLabCoordinator31 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager33 = headLabCoordinator31.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment37 = new model.Equipment("", "", "");
        labManager33.addEquipment(equipment37);
        equipment37.setLabLocation("hi!");
        equipment37.setDescription("Researcher");
        state.EquipmentState equipmentState43 = equipment37.getCurrentState();
        state.EquipmentState equipmentState44 = equipment37.getCurrentState();
        equipment12.setState(equipmentState44);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNotNull(equipmentState43);
        org.junit.Assert.assertNotNull(equipmentState44);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3574");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3575");
        model.Researcher researcher3 = new model.Researcher("User{userId=74528b82-1e1f-4b63-a40c-ab32ec161ce0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7f761712-0dc2-46f5-a9ab-a40cb2c1208a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3576");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = labManager9.getIdOrCertNumber();
        model.LabManager labManager14 = new model.LabManager("User{userId=702dca9b-8cc1-471e-a3dd-01697b13c23a, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID15 = labManager14.getUserId();
        labManager9.setUserId(uUID15);
        model.Equipment equipment20 = new model.Equipment("User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=8d75b873-f384-4199-8290-a01a4a4e85a1, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager9.addEquipment(equipment20);
        labManager9.setEmail("");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "16) test3576(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID15.toString(), "91d2504e-2d92-4753-abc4-e3c77195ff62");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3577");
        model.Student student3 = new model.Student("LabManager", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Researcher");
        java.lang.String str4 = student3.getStatus();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3578");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=13a53e8c-9f14-498d-8da3-976a52ee21cf, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=7f202e65-5038-4bf8-b4ca-fade3879140d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=69153fdd-cdcc-4e2d-9508-8a37ec56922a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3579");
        model.Student student3 = new model.Student("", "User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5869f97b-9faf-4fe9-b06c-73ec9ce856cc, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3580");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager14 = headLabCoordinator12.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean15 = labManager14.isActive();
        double double16 = labManager14.getHourlyRate();
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
        labManager14.addEquipment(equipment20);
        model.Equipment equipment37 = new model.Equipment("", "", "");
        java.lang.String str38 = equipment37.getDescription();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        model.Reservation reservation42 = null;
        boolean boolean43 = equipment37.isModifyAvailable(localDateTime39, localDateTime40, "hi!", reservation42);
        java.lang.String str44 = equipment37.getDescription();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean48 = equipment37.isAvailable(localDateTime45, localDateTime46, "Faculty");
        model.Equipment equipment52 = new model.Equipment("", "", "");
        java.lang.String str53 = equipment52.getDescription();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        model.Reservation reservation57 = null;
        boolean boolean58 = equipment52.isModifyAvailable(localDateTime54, localDateTime55, "hi!", reservation57);
        java.lang.String str59 = equipment52.getDescription();
        state.EquipmentState equipmentState60 = equipment52.getCurrentState();
        equipment37.setState(equipmentState60);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        boolean boolean65 = equipment37.isAvailable(localDateTime62, localDateTime63, "Faculty");
        java.lang.String str66 = equipment37.getDescription();
        state.EquipmentState equipmentState67 = equipment37.getCurrentState();
        equipment20.setState(equipmentState67);
        model.HeadLabCoordinator headLabCoordinator72 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager74 = headLabCoordinator72.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID75 = null;
        headLabCoordinator72.setUserId(uUID75);
        model.LabManager labManager78 = headLabCoordinator72.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment82 = new model.Equipment("", "", "");
        equipment82.enable();
        labManager78.addEquipment(equipment82);
        equipment82.markMaintenance();
        state.EquipmentState equipmentState86 = equipment82.getCurrentState();
        equipment20.setState(equipmentState86);
        java.lang.String str88 = equipment20.getDescription();
        labManager8.setEquipmentStatus(equipment20, "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.lang.String str91 = labManager8.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(equipmentState60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(equipmentState67);
        org.junit.Assert.assertNotNull(labManager74);
        org.junit.Assert.assertNotNull(labManager78);
        org.junit.Assert.assertNotNull(equipmentState86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "LM-CERT" + "'", str91, "LM-CERT");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3581");
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
        equipment3.enable();
        equipment3.setLabLocation("User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3582");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", reservation19);
        equipment3.notifyObservers();
        java.lang.String str22 = equipment3.toString();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Available'}" + "'", str22, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='Available'}");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3583");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.disable();
        model.HeadLabCoordinator headLabCoordinator14 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager16 = headLabCoordinator14.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment20 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment20.isModifyAvailable(localDateTime21, localDateTime22, "Faculty", reservation24);
        equipment20.setLabLocation("Faculty");
        labManager16.setEquipmentStatus(equipment20, "Guest");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        labManager16.addEquipment(equipment33);
        boolean boolean35 = labManager16.isActive();
        labManager16.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
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
        labManager16.addEquipment(equipment41);
        state.EquipmentState equipmentState55 = equipment41.getCurrentState();
        equipment3.setState(equipmentState55);
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        boolean boolean60 = equipment3.isAvailable(localDateTime57, localDateTime58, "User{userId=3f4ac164-2b86-4b4a-ad40-29db7ade13d2, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str53, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(equipmentState55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3584");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "User{userId=b3bdb630-5cfc-4562-99de-1c8248be80d9, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3585");
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
        java.lang.String str29 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(uUID26);
// flaky "17) test3585(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID26.toString(), "9bb8c8fd-eef5-406f-b988-6ed8273f109c");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3586");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty7 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str8 = faculty7.getRole();
        faculty7.setEmail("hi!");
        boolean boolean11 = faculty7.isActive();
        java.util.UUID uUID12 = faculty7.getUserId();
        headLabCoordinator3.setUserId(uUID12);
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str16 = headLabCoordinator3.getRole();
        headLabCoordinator3.setPasswordHash("User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uUID12);
// flaky "18) test3586(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID12.toString(), "a975468f-aa3e-4122-aa42-bb74239e4c2d");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HeadLabCoordinator" + "'", str16, "HeadLabCoordinator");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3587");
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
        java.lang.String str65 = equipment7.toString();
        java.lang.String str66 = equipment7.getStatus();
        java.lang.String str67 = equipment7.getStatus();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}" + "'", str65, "Equipment{equipmentId='', description='', labLocation='User{userId=cf36655f-9e77-42c9-b4f9-053edc6928fa, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Maintenance'}");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Maintenance" + "'", str66, "Maintenance");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Maintenance" + "'", str67, "Maintenance");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3588");
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
        equipment3.detach(equipmentObserver16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3589");
        model.LabManager labManager3 = new model.LabManager("Researcher", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LabManager" + "'", str5, "LabManager");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3590");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=a861c68a-13b8-4193-85d6-6e1c136fad92, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
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
        java.lang.String str35 = equipment24.getLabLocation();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment24.attach(equipmentObserver36);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        strategy.PricingStrategy pricingStrategy40 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation41 = new model.Reservation((model.User) headLabCoordinator3, equipment24, localDateTime38, localDateTime39, pricingStrategy40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str34, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3591");
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
        java.lang.String str42 = equipment9.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(equipmentState40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3592");
        model.LabManager labManager3 = new model.LabManager("User{userId=fed24419-e732-4903-8c34-e24eaa879c77, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a8ca4fee-afc7-490b-bfb2-ca95c3372a57, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b92a0ddf-9cb7-4f45-916a-88423a5eb6dc, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        equipment53.setDescription("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str58 = equipment53.getDescription();
        labManager3.markMaintenance(equipment53);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}" + "'", str58, "User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3593");
        model.Guest guest3 = new model.Guest("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        boolean boolean4 = guest3.isActive();
        java.lang.String str5 = guest3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str5, "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3594");
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
        java.lang.String str15 = researcher3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3595");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str9 = labManager8.getRole();
        model.Equipment equipment13 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment13.markMaintenance();
        labManager8.addEquipment(equipment13);
        model.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager8.setEquipmentStatus(equipment16, "User{userId=1e0554db-959c-4c51-b309-f0f492d9ab32, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.setStatus(String)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3596");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=60fdec4d-bc2b-4093-b1c3-b2a04814f23b, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "", "User{userId=b35ed0ed-5749-4ff3-9f00-ba253dc19230, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3597");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3330b6c3-2836-4d34-afcb-9a7838ff0f0f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        double double6 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3598");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3599");
        model.Faculty faculty3 = new model.Faculty("User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        faculty3.setEmail("Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3600");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Student");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3601");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        faculty3.setActive(false);
        java.lang.String str7 = faculty3.getRole();
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.toString();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getStatus();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "19) test3601(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "d0ce2389-c0a8-4b30-a04f-03978ad70bc5");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
// flaky "4) test3601(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User{userId=d0ce2389-c0a8-4b30-a04f-03978ad70bc5, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str10, "User{userId=d0ce2389-c0a8-4b30-a04f-03978ad70bc5, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "INACTIVE" + "'", str12, "INACTIVE");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3602");
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
        java.lang.String str25 = equipment9.toString();
        equipment9.setStatus("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        equipment9.disable();
        equipment9.setDescription("User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3603");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setActive(false);
        double double8 = labManager5.getHourlyRate();
        java.lang.String str9 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3604");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        java.lang.String str8 = equipment3.toString();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str12 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3605");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3606");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.util.UUID uUID5 = headLabCoordinator3.getUserId();
        headLabCoordinator3.setEmail("User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=0ba2bcd6-56c9-48f8-8b3d-9c9968a595ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment13 = new model.Equipment("", "", "");
        java.lang.String str14 = equipment13.getDescription();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment13.isModifyAvailable(localDateTime15, localDateTime16, "hi!", reservation18);
        java.lang.String str20 = equipment13.getEquipmentId();
        equipment13.setStatus("");
        java.lang.String str23 = equipment13.getStatus();
        equipment13.setDescription("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        java.lang.String str26 = equipment13.getDescription();
        observer.EquipmentObserver equipmentObserver27 = null;
        equipment13.attach(equipmentObserver27);
        labManager9.setEquipmentStatus(equipment13, "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment13.setDescription("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "20) test3606(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID5.toString(), "a8ce1a3d-621d-445d-adf9-115c54fc75a4");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}" + "'", str26, "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3607");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=6556eda8-032c-4e7d-840e-968011955922, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Student");
        boolean boolean4 = headLabCoordinator3.isActive();
        java.lang.String str5 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3608");
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
        equipment3.markMaintenance();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3609");
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
        java.lang.String str92 = labManager9.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Maintenance" + "'", str22, "Maintenance");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
// flaky "21) test3609(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User{userId=f4fab69b-8a77-49f7-a2d0-b113b941cfa8, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str26, "User{userId=f4fab69b-8a77-49f7-a2d0-b113b941cfa8, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str92, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3610");
        model.Student student3 = new model.Student("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getIdOrCertNumber();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str6, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3611");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3612");
        model.Researcher researcher3 = new model.Researcher("User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d473dca8-1d6b-4ed6-bea4-83139eaef698, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3613");
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
        java.lang.String str48 = labManager8.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LM-CERT" + "'", str48, "LM-CERT");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3614");
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
        equipment3.setDescription("User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.markMaintenance();
        java.lang.String str20 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3615");
        model.Researcher researcher3 = new model.Researcher("", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getStatus();
        java.lang.String str7 = researcher3.getRole();
        java.lang.String str8 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3616");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        double double8 = faculty3.getHourlyRate();
        faculty3.setActive(true);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "22) test3616(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "92ad9662-c6a0-45b6-abd6-884f1187d5f8");
// flaky "5) test3616(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=92ad9662-c6a0-45b6-abd6-884f1187d5f8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=92ad9662-c6a0-45b6-abd6-884f1187d5f8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3617");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "User{userId=39368240-a931-4d84-a2d6-86eeb1f1ea70, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = researcher3.getRole();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3618");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        double double11 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Temp123!");
        boolean boolean14 = labManager13.isActive();
        java.lang.String str15 = labManager13.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LM-CERT" + "'", str15, "LM-CERT");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3619");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        equipment3.setDescription("User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.setDescription("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = equipment3.isAvailable(localDateTime12, localDateTime13, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean19 = equipment3.isAvailable(localDateTime16, localDateTime17, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3620");
        model.Guest guest3 = new model.Guest("User{userId=cfc7b470-9f64-421e-8870-24582162de7b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=65aed29e-0f20-443f-aef7-a7bcb91d1913, email='', status='ACTIVE', idOrCertNumber='', role='Researcher'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3621");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        java.lang.String str11 = researcher3.getStatus();
        double double12 = researcher3.getHourlyRate();
        java.util.UUID uUID13 = researcher3.getUserId();
        double double14 = researcher3.getHourlyRate();
        researcher3.setEmail("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(uUID13);
// flaky "23) test3621(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID13.toString(), "2cb02130-dc40-43d2-9834-01eec603b048");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3622");
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
        java.lang.String str87 = equipment66.getLabLocation();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Faculty" + "'", str87, "Faculty");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3623");
        model.LabManager labManager3 = new model.LabManager("User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=82c80757-b02b-4a2f-8ff0-2f6527599291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=10b8b7d7-0cc3-4706-901d-0e8ea0d6fe73, email='', status='ACTIVE', idOrCertNumber='User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Student'}");
        java.lang.String str4 = labManager3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3624");
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
        labManager8.setIdOrCertNumber("User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Equipment equipment33 = new model.Equipment("", "", "");
        java.lang.String str34 = equipment33.getDescription();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment33.isModifyAvailable(localDateTime35, localDateTime36, "hi!", reservation38);
        java.lang.String str40 = equipment33.getEquipmentId();
        equipment33.setStatus("");
        java.lang.String str43 = equipment33.getEquipmentId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean47 = equipment33.isAvailable(localDateTime44, localDateTime45, "Researcher");
        labManager8.setEquipmentStatus(equipment33, "User{userId=f4385078-d813-412f-9990-d88eb6f51b96, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment33.setDescription("User{userId=cd7ac898-1480-4edb-97b2-820543eab3ad, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str52 = equipment33.getLabLocation();
        model.SensorUpdate sensorUpdate53 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment33.applySensorUpdate(sensorUpdate53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3625");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        java.lang.String str11 = equipment3.getLabLocation();
        java.lang.String str12 = equipment3.getLabLocation();
        equipment3.setLabLocation("User{userId=b88bd2ce-e8f2-46de-ba75-73adb7aef441, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str15 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3626");
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
        state.EquipmentState equipmentState20 = equipment3.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(equipmentState20);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3627");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.Guest guest7 = new model.Guest("", "hi!", "hi!");
        java.lang.String str8 = guest7.getRole();
        double double9 = guest7.getHourlyRate();
        java.lang.String str10 = guest7.getRole();
        java.util.UUID uUID11 = guest7.getUserId();
        headLabCoordinator3.setUserId(uUID11);
        double double13 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager15 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        java.lang.String str16 = headLabCoordinator3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "24) test3627(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "6311c7a1-dad7-42ae-97fc-f1e5c038f52b");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "6) test3627(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=6311c7a1-dad7-42ae-97fc-f1e5c038f52b, email='Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str16, "User{userId=6311c7a1-dad7-42ae-97fc-f1e5c038f52b, email='Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3628");
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
        equipment27.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3629");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment9.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3630");
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
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=403ed86a-c84c-43c1-994f-62f96b195ff7, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3631");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "", "User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3632");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        equipment3.markMaintenance();
        observer.EquipmentObserver equipmentObserver8 = null;
        equipment3.attach(equipmentObserver8);
        java.lang.String str10 = equipment3.getStatus();
        java.lang.String str11 = equipment3.getEquipmentId();
        equipment3.setLabLocation("LM-CERT");
        java.lang.String str14 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Maintenance" + "'", str10, "Maintenance");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment{equipmentId='', description='', labLocation='LM-CERT', status='Maintenance'}" + "'", str14, "Equipment{equipmentId='', description='', labLocation='LM-CERT', status='Maintenance'}");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3633");
        model.Guest guest3 = new model.Guest("Guest", "Available", "Student");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        guest3.setPasswordHash("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        double double8 = guest3.getHourlyRate();
        guest3.setEmail("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3634");
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
        double double49 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
// flaky "25) test3634(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=18803508-6e21-46b3-9bfd-00c3998a922d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str12, "User{userId=18803508-6e21-46b3-9bfd-00c3998a922d, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID13);
// flaky "7) test3634(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID13.toString(), "18803508-6e21-46b3-9bfd-00c3998a922d");
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
// flaky "1) test3634(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID46.toString(), "79bf5f83-5684-4a9b-a8dd-49bb2a2226c6");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3635");
        model.Equipment equipment3 = new model.Equipment("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=a70a11d6-26fd-49bc-8890-79396df517de, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a439f2ca-eba6-4ac1-8170-cc60ce20f2f1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3636");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.addEquipment(equipment9);
        equipment9.setLabLocation("");
        java.lang.String str13 = equipment9.getEquipmentId();
        equipment9.setLabLocation("");
        java.lang.String str16 = equipment9.getLabLocation();
        equipment9.markMaintenance();
        java.lang.String str18 = equipment9.getEquipmentId();
        state.EquipmentState equipmentState19 = equipment9.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3637");
        model.Equipment equipment3 = new model.Equipment("User{userId=d0ce2389-c0a8-4b30-a04f-03978ad70bc5, email='hi!', status='INACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=9e863393-c76d-4499-8ed2-06d466032c33, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3638");
        model.Faculty faculty3 = new model.Faculty("User{userId=106c5b83-7ffa-4815-a617-f9fee4e302ba, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3639");
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
        equipment14.notifyObservers();
        state.EquipmentState equipmentState31 = equipment14.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(equipmentState31);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3640");
        model.Faculty faculty3 = new model.Faculty("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "hi!", "");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3641");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        java.lang.String str8 = guest3.getEmail();
        guest3.setIdOrCertNumber("User{userId=7c489ff6-23de-47df-a63b-4ac4dddbc0bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3642");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean22 = equipment3.isAvailable(localDateTime19, localDateTime20, "User{userId=ae091a0e-c8fc-4ebc-bd95-73e327e4e504, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(equipmentState16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3643");
        model.Equipment equipment3 = new model.Equipment("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}" + "'", str4, "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str5, "User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3644");
        model.Guest guest3 = new model.Guest("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=636c8365-9c21-4781-beaf-373d9f7c2cd7, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3645");
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
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment18.isModifyAvailable(localDateTime23, localDateTime24, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}", reservation26);
        equipment18.disable();
        equipment18.notifyObservers();
        observer.EquipmentObserver equipmentObserver30 = null;
        equipment18.detach(equipmentObserver30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3646");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment3.enable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3647");
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
        equipment3.disable();
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

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3648");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getStatus();
        equipment3.disable();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Available" + "'", str10, "Available");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3649");
        model.LabManager labManager3 = new model.LabManager("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}", "User{userId=ee2e05f0-7020-4832-984c-caa824420891, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3650");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = labManager8.getIdOrCertNumber();
        labManager8.setActive(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3651");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str10 = headLabCoordinator3.getRole();
        boolean boolean11 = headLabCoordinator3.isActive();
        headLabCoordinator3.setEmail("Student");
        double double14 = headLabCoordinator3.getHourlyRate();
        double double15 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager17 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f0765721-a687-481f-b6ed-91f0c3fe46a7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator21 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager23 = headLabCoordinator21.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID24 = null;
        headLabCoordinator21.setUserId(uUID24);
        model.LabManager labManager27 = headLabCoordinator21.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment31 = new model.Equipment("", "", "");
        equipment31.enable();
        labManager27.addEquipment(equipment31);
        java.lang.String str34 = equipment31.toString();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean38 = equipment31.isAvailable(localDateTime35, localDateTime36, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str39 = equipment31.getLabLocation();
        equipment31.disable();
        java.lang.String str41 = equipment31.toString();
        equipment31.disable();
        equipment31.notifyObservers();
        labManager17.markMaintenance(equipment31);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str34, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}" + "'", str41, "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3652");
        model.Faculty faculty3 = new model.Faculty("User{userId=d0b49de6-3041-49bb-ab40-a2aaea2485f8, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=24fef356-e371-4e89-9d24-1ebb8462b5b5, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7b207807-756f-47a8-a859-5fb513cc539b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3653");
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
        java.lang.String str20 = equipment3.getDescription();
        java.lang.String str21 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3654");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getRole();
        java.lang.String str12 = faculty3.getRole();
        java.lang.String str13 = faculty3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "26) test3654(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "040613a4-4ea3-4a84-8f3b-5de14bbb253e");
// flaky "8) test3654(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=040613a4-4ea3-4a84-8f3b-5de14bbb253e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=040613a4-4ea3-4a84-8f3b-5de14bbb253e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3655");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        java.lang.String str8 = faculty3.getRole();
        model.Equipment equipment12 = new model.Equipment("", "", "");
        java.lang.String str13 = equipment12.getDescription();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        model.Reservation reservation17 = null;
        boolean boolean18 = equipment12.isModifyAvailable(localDateTime14, localDateTime15, "hi!", reservation17);
        java.lang.String str19 = equipment12.getEquipmentId();
        java.lang.String str20 = equipment12.getLabLocation();
        java.lang.String str21 = equipment12.getLabLocation();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        strategy.PricingStrategy pricingStrategy24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation25 = new model.Reservation((model.User) faculty3, equipment12, localDateTime22, localDateTime23, pricingStrategy24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uUID4);
// flaky "27) test3655(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "d3024d6d-fbb2-44fa-8bca-4bb7156da815");
// flaky "9) test3655(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=d3024d6d-fbb2-44fa-8bca-4bb7156da815, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=d3024d6d-fbb2-44fa-8bca-4bb7156da815, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3656");
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
        equipment29.setDescription("User{userId=80b4af30-09a6-4d67-a201-43302d391978, email='LM-CERT', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
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
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3657");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3658");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.attach(equipmentObserver5);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3659");
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
        equipment3.disable();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setDescription("User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3660");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str11 = labManager10.toString();
        double double12 = labManager10.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "28) test3660(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=13a6ca08-50a5-439d-b0b2-8d00aa943e79, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=13a6ca08-50a5-439d-b0b2-8d00aa943e79, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3661");
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
        model.Guest guest78 = new model.Guest("", "hi!", "hi!");
        java.lang.String str79 = guest78.getRole();
        double double80 = guest78.getHourlyRate();
        java.lang.String str81 = guest78.getRole();
        java.util.UUID uUID82 = guest78.getUserId();
        labManager3.setUserId(uUID82);
        java.lang.String str84 = labManager3.getRole();
        java.lang.String str85 = labManager3.getRole();
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
// flaky "29) test3661(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID72.toString(), "03ce8e54-102d-4847-b503-77acefc76e54");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Guest" + "'", str79, "Guest");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 25.0d + "'", double80 == 25.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Guest" + "'", str81, "Guest");
        org.junit.Assert.assertNotNull(uUID82);
// flaky "10) test3661(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID82.toString(), "4485b785-8199-451e-95f3-9e72148dd03b");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "LabManager" + "'", str84, "LabManager");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "LabManager" + "'", str85, "LabManager");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3662");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment31.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
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
// flaky "30) test3662(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=e10688bf-31c8-4813-b241-6dbd7e1dfcf8, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str27, "User{userId=e10688bf-31c8-4813-b241-6dbd7e1dfcf8, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3663");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setActive(true);
        java.lang.String str6 = researcher3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3664");
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
        java.lang.String str27 = labManager3.getRole();
        java.lang.String str28 = labManager3.getRole();
        java.lang.String str29 = labManager3.toString();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LabManager" + "'", str27, "LabManager");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LabManager" + "'", str28, "LabManager");
// flaky "31) test3664(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User{userId=83cf4c3a-37fe-4b47-aa81-ae021ca51a54, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str29, "User{userId=83cf4c3a-37fe-4b47-aa81-ae021ca51a54, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3665");
        model.Guest guest3 = new model.Guest("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.toString();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
// flaky "32) test3665(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=d18aa4b9-8c17-4640-a07b-a2d83726c399, email='User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}" + "'", str5, "User{userId=d18aa4b9-8c17-4640-a07b-a2d83726c399, email='User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3666");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        double double4 = guest3.getHourlyRate();
        double double5 = guest3.getHourlyRate();
        guest3.setActive(true);
        java.lang.String str8 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3667");
        model.Student student3 = new model.Student("User{userId=a7781db0-657b-465b-b01a-1214086a5a59, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=8e3fc914-a636-4d18-8479-c4b4b0e25f82, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}", "");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3668");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Faculty", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "Temp123!");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=f16fcc8f-9798-4ac8-adee-5979b4f91a04, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.toString();
        java.lang.String str9 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
// flaky "33) test3668(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=a6afa3ec-ae9e-49e1-8e37-e11decf4aeca, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}" + "'", str8, "User{userId=a6afa3ec-ae9e-49e1-8e37-e11decf4aeca, email='Faculty', status='ACTIVE', idOrCertNumber='Temp123!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3669");
        model.Faculty faculty3 = new model.Faculty("User{userId=2b0358b7-2432-4ca4-aff3-0f948bd195a8, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}", "Available", "User{userId=bf8afcbe-bc2b-43a3-a293-33bbb0658c4d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3670");
        model.Researcher researcher3 = new model.Researcher("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=d16a10f5-6b9c-4013-87da-63d01b05ce60, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        java.lang.String str4 = researcher3.getEmail();
        java.lang.String str5 = researcher3.getRole();
        java.lang.String str6 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3671");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        equipment3.disable();
        java.lang.String str7 = equipment3.getDescription();
        equipment3.markMaintenance();
        java.lang.String str9 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3672");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID9 = headLabCoordinator3.getUserId();
        double double10 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=6c9e7d25-4199-4a06-b0fa-5aaf53b0be4b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(uUID9);
// flaky "34) test3672(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID9.toString(), "2b34c6e5-4054-44fc-a10f-c70d88352779");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3673");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        headLabCoordinator3.setActive(false);
        headLabCoordinator3.setActive(true);
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        java.lang.String str13 = headLabCoordinator3.getRole();
        headLabCoordinator3.setIdOrCertNumber("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3674");
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
        model.HeadLabCoordinator headLabCoordinator56 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager58 = headLabCoordinator56.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID59 = null;
        headLabCoordinator56.setUserId(uUID59);
        model.LabManager labManager62 = headLabCoordinator56.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager64 = headLabCoordinator56.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager66 = headLabCoordinator56.autoGenerateManagerAccount("INACTIVE");
        model.HeadLabCoordinator headLabCoordinator70 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager72 = headLabCoordinator70.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID73 = null;
        headLabCoordinator70.setUserId(uUID73);
        model.LabManager labManager76 = headLabCoordinator70.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment80 = new model.Equipment("", "", "");
        equipment80.enable();
        labManager76.addEquipment(equipment80);
        equipment80.disable();
        labManager66.markMaintenance(equipment80);
        model.Equipment equipment88 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        state.EquipmentState equipmentState89 = equipment88.getCurrentState();
        equipment80.setState(equipmentState89);
        equipment36.setState(equipmentState89);
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
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertNotNull(labManager62);
        org.junit.Assert.assertNotNull(labManager64);
        org.junit.Assert.assertNotNull(labManager66);
        org.junit.Assert.assertNotNull(labManager72);
        org.junit.Assert.assertNotNull(labManager76);
        org.junit.Assert.assertNotNull(equipmentState89);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3675");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.toString();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        model.Equipment equipment13 = new model.Equipment("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager", "Student");
        equipment13.markMaintenance();
        labManager9.addEquipment(equipment13);
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment13.detach(equipmentObserver16);
        java.lang.String str18 = equipment13.getEquipmentId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
// flaky "35) test3675(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=142baae1-3141-41b1-b6d5-2f13b5b41771, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str7, "User{userId=142baae1-3141-41b1-b6d5-2f13b5b41771, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str18, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3676");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3ed68f5f-115d-4f07-9cd1-e8932c32c605, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', description='User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='Faculty', status='Available'}");
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3b48c400-6fdc-4b8c-91bd-56d0e9c363f7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3677");
        model.Researcher researcher3 = new model.Researcher("User{userId=65c3aaaf-5b33-4a88-a1a4-3f659996cbfe, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3678");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        java.lang.String str14 = labManager13.getRole();
        java.lang.String str15 = labManager13.toString();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        java.lang.String str26 = equipment19.getEquipmentId();
        equipment19.setStatus("");
        java.lang.String str29 = equipment19.getEquipmentId();
        observer.EquipmentObserver equipmentObserver30 = null;
        equipment19.detach(equipmentObserver30);
        labManager13.markMaintenance(equipment19);
        model.Equipment equipment36 = new model.Equipment("", "", "");
        java.lang.String str37 = equipment36.getDescription();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        model.Reservation reservation41 = null;
        boolean boolean42 = equipment36.isModifyAvailable(localDateTime38, localDateTime39, "hi!", reservation41);
        java.lang.String str43 = equipment36.getEquipmentId();
        equipment36.setStatus("");
        equipment36.notifyObservers();
        java.lang.String str47 = equipment36.getDescription();
        equipment36.setDescription("User{userId=b3cd3d8a-08cc-48ea-9808-28368a6f2801, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        labManager13.setEquipmentStatus(equipment36, "User{userId=f5e4daec-77a8-4047-84f8-8974a145160c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment36.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
// flaky "36) test3678(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=beae0773-8013-4055-b09e-2e4a8f95ea4f, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str15, "User{userId=beae0773-8013-4055-b09e-2e4a8f95ea4f, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3679");
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
        model.LabManager labManager50 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager50.setPasswordHash("LabManager");
        labManager50.setIdOrCertNumber("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty58 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str59 = faculty58.getStatus();
        boolean boolean60 = faculty58.isActive();
        java.lang.String str61 = faculty58.getRole();
        java.lang.String str62 = faculty58.getRole();
        model.HeadLabCoordinator headLabCoordinator66 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager68 = headLabCoordinator66.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID69 = null;
        headLabCoordinator66.setUserId(uUID69);
        model.LabManager labManager72 = headLabCoordinator66.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager74 = headLabCoordinator66.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager76 = headLabCoordinator66.autoGenerateManagerAccount("User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double77 = labManager76.getHourlyRate();
        model.Guest guest81 = new model.Guest("", "hi!", "hi!");
        java.lang.String str82 = guest81.getRole();
        double double83 = guest81.getHourlyRate();
        double double84 = guest81.getHourlyRate();
        java.lang.String str85 = guest81.getPasswordHash();
        guest81.setActive(false);
        java.lang.String str88 = guest81.getEmail();
        java.util.UUID uUID89 = guest81.getUserId();
        labManager76.setUserId(uUID89);
        faculty58.setUserId(uUID89);
        labManager50.setUserId(uUID89);
        labManager5.setUserId(uUID89);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertNotNull(uUID44);
// flaky "37) test3679(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID44.toString(), "2b0c7c78-daa7-4582-a43e-8843cb34153b");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ACTIVE" + "'", str59, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Faculty" + "'", str61, "Faculty");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Faculty" + "'", str62, "Faculty");
        org.junit.Assert.assertNotNull(labManager68);
        org.junit.Assert.assertNotNull(labManager72);
        org.junit.Assert.assertNotNull(labManager74);
        org.junit.Assert.assertNotNull(labManager76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Guest" + "'", str82, "Guest");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 25.0d + "'", double83 == 25.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 25.0d + "'", double84 == 25.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(uUID89);
// flaky "11) test3679(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID89.toString(), "89b69b6b-79aa-4eb8-a205-9e2f28e859f1");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3680");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.getStatus();
        equipment3.disable();
        equipment3.enable();
        java.lang.String str7 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3681");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Disabled", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
// flaky "38) test3681(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=867874c3-1443-496b-8e15-3f970c85ceb5, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}" + "'", str5, "User{userId=867874c3-1443-496b-8e15-3f970c85ceb5, email='Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3682");
        model.Student student3 = new model.Student("Equipment{equipmentId='Maintenance', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}", "User{userId=a9cae2a0-4b35-4407-8ad4-4be57f236af3, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}'}");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3683");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=7f1b84d1-159a-4211-a3df-b6f9b1a96c0e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = faculty3.getStatus();
        java.lang.String str5 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3684");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='Guest', labLocation='Student', status='Available'}");
        headLabCoordinator3.setEmail("User{userId=ae9cce22-76c2-47ed-810a-e8395a412279, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3685");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getEmail();
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3686");
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
        double double56 = labManager5.getHourlyRate();
        java.lang.String str57 = labManager5.getRole();
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LabManager" + "'", str57, "LabManager");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3687");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='', description='', labLocation='User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='Guest'}", "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3688");
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
        equipment3.setLabLocation("User{userId=fa99b051-7786-45e5-abe7-2f7ccf18a50d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
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
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3689");
        model.Guest guest3 = new model.Guest("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LM-CERT", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = guest3.getHourlyRate();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3690");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setPasswordHash("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3691");
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
        equipment13.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Available" + "'", str26, "Available");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3692");
        model.Researcher researcher3 = new model.Researcher("User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        researcher3.setPasswordHash("Student");
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3693");
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
        model.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager11.addEquipment(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "39) test3693(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=9eb8631f-c384-4a98-845e-98053182b89b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str15, "User{userId=9eb8631f-c384-4a98-845e-98053182b89b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ACTIVE" + "'", str16, "ACTIVE");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3694");
        model.Guest guest3 = new model.Guest("User{userId=ae9cce22-76c2-47ed-810a-e8395a412279, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=2203a4c0-197b-4510-a1ad-f5e4b7215c16, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3695");
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
        java.lang.String str24 = labManager8.toString();
        java.lang.String str25 = labManager8.getRole();
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
        state.EquipmentState equipmentState50 = equipment48.getCurrentState();
        java.lang.String str51 = equipment48.getStatus();
        equipment48.setLabLocation("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        labManager8.setEquipmentStatus(equipment48, "User{userId=a7781db0-657b-465b-b01a-1214086a5a59, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        boolean boolean59 = equipment48.isAvailable(localDateTime56, localDateTime57, "User{userId=c95a48ac-f685-4594-8490-b4cedb669014, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LM-CERT" + "'", str23, "LM-CERT");
// flaky "40) test3695(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User{userId=90ba057e-77e2-414a-b29f-3ebb5ba74c18, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str24, "User{userId=90ba057e-77e2-414a-b29f-3ebb5ba74c18, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(equipmentState50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Available" + "'", str51, "Available");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3696");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isActive();
        java.lang.String str5 = faculty3.getPasswordHash();
        java.lang.String str6 = faculty3.getPasswordHash();
        java.lang.String str7 = faculty3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "41) test3696(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=32af5ae3-2909-49ee-be23-17a2e335fa1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=32af5ae3-2909-49ee-be23-17a2e335fa1a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3697");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        java.lang.String str4 = equipment3.getEquipmentId();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.enable();
        java.lang.String str8 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Available" + "'", str8, "Available");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3698");
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
        observer.EquipmentObserver equipmentObserver18 = null;
        equipment3.attach(equipmentObserver18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertNotNull(equipmentState15);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3699");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getEmail();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        model.Equipment equipment18 = new model.Equipment("User{userId=8a949105-4ca9-4e97-b4b4-8c785ebea85d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=9ef4c45b-b43c-462d-88df-a443dbf38502, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager14.addEquipment(equipment18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3700");
        model.Equipment equipment3 = new model.Equipment("User{userId=ce2d8891-494d-4210-bd6f-09a3f77212de, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=08612780-e04d-442c-968e-9604fd961966, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3701");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setActive(true);
        double double12 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3702");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "", "User{userId=b13705fb-56d0-4e42-b03c-79a2432e2945, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.util.UUID uUID5 = headLabCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "42) test3702(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID5.toString(), "b2554075-a46a-4ac2-8721-de1a6774562e");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3703");
        model.Faculty faculty3 = new model.Faculty("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Researcher");
        java.lang.String str4 = faculty3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3704");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=14041a25-baa9-4569-958f-ac6cc1f02707, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=782c482a-b499-4190-8900-6286323266d0, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3705");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getIdOrCertNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3706");
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
        java.lang.String str53 = labManager9.getRole();
        model.HeadLabCoordinator headLabCoordinator57 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager59 = headLabCoordinator57.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment63 = new model.Equipment("", "", "");
        labManager59.markMaintenance(equipment63);
        java.lang.String str65 = labManager59.getRole();
        java.lang.String str66 = labManager59.getRole();
        java.lang.String str67 = labManager59.getRole();
        model.HeadLabCoordinator headLabCoordinator71 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager73 = headLabCoordinator71.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID74 = null;
        headLabCoordinator71.setUserId(uUID74);
        model.LabManager labManager77 = headLabCoordinator71.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment81 = new model.Equipment("", "", "");
        equipment81.enable();
        labManager77.addEquipment(equipment81);
        equipment81.disable();
        observer.EquipmentObserver equipmentObserver85 = null;
        equipment81.detach(equipmentObserver85);
        equipment81.enable();
        labManager59.setEquipmentStatus(equipment81, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime90 = null;
        java.time.LocalDateTime localDateTime91 = null;
        strategy.PricingStrategy pricingStrategy92 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation93 = new model.Reservation((model.User) labManager9, equipment81, localDateTime90, localDateTime91, pricingStrategy92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str50, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LabManager" + "'", str53, "LabManager");
        org.junit.Assert.assertNotNull(labManager59);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "LabManager" + "'", str65, "LabManager");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "LabManager" + "'", str66, "LabManager");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LabManager" + "'", str67, "LabManager");
        org.junit.Assert.assertNotNull(labManager73);
        org.junit.Assert.assertNotNull(labManager77);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3707");
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
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment3.attach(equipmentObserver43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3708");
        model.Student student3 = new model.Student("", "hi!", "");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isActive();
        java.lang.String str6 = student3.getPasswordHash();
        student3.setActive(false);
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3709");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.lang.String str4 = headLabCoordinator3.getPasswordHash();
        java.lang.String str5 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("LM-CERT");
        model.Equipment equipment11 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment11.notifyObservers();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment11.attach(equipmentObserver13);
        java.lang.String str15 = equipment11.getDescription();
        labManager7.setEquipmentStatus(equipment11, "User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        java.lang.String str18 = equipment11.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str15, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LM-CERT" + "'", str18, "LM-CERT");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3710");
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
        observer.EquipmentObserver equipmentObserver78 = null;
        equipment10.detach(equipmentObserver78);
        equipment10.setDescription("User{userId=ee4c7ae0-0ce9-4925-acb7-814fab1467de, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3711");
        model.Faculty faculty3 = new model.Faculty("User{userId=6a44fc21-3af6-4156-84c2-8e52ab86e60a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=e45af31a-d36a-465e-a397-4703c49db187, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        faculty3.setPasswordHash("User{userId=29ed775a-6de1-449c-8ff4-28a107ba4978, email='User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3712");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        java.util.UUID uUID7 = researcher3.getUserId();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        double double11 = researcher3.getHourlyRate();
        java.lang.String str12 = researcher3.getRole();
        java.lang.String str13 = researcher3.getPasswordHash();
        researcher3.setPasswordHash("User{userId=34519cdf-7689-4bcd-b13d-e63483322364, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(uUID7);
// flaky "43) test3712(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID7.toString(), "cef87337-324e-4fb6-bfc1-909aeddf8e2c");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3713");
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
        java.lang.String str92 = equipment3.getDescription();
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3714");
        model.Equipment equipment3 = new model.Equipment("", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = equipment3.getLabLocation();
        equipment3.enable();
        java.lang.String str6 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3715");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        researcher3.setIdOrCertNumber("");
        boolean boolean8 = researcher3.isActive();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setPasswordHash("User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double12 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3716");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setIdOrCertNumber("User{userId=a66dc658-223f-4bde-9f5d-e36e19a4e9ce, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3717");
        model.LabManager labManager3 = new model.LabManager("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.HeadLabCoordinator headLabCoordinator7 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager9 = headLabCoordinator7.autoGenerateManagerAccount("Guest");
        double double10 = labManager9.getHourlyRate();
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.lang.String str15 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment14.isModifyAvailable(localDateTime16, localDateTime17, "hi!", reservation19);
        java.lang.String str21 = equipment14.getEquipmentId();
        equipment14.setStatus("");
        equipment14.notifyObservers();
        labManager9.addEquipment(equipment14);
        model.Equipment equipment29 = new model.Equipment("", "", "");
        equipment29.enable();
        equipment29.enable();
        java.lang.String str32 = equipment29.getStatus();
        java.lang.String str33 = equipment29.getStatus();
        java.lang.String str34 = equipment29.getDescription();
        equipment29.disable();
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager41 = headLabCoordinator39.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment45.isModifyAvailable(localDateTime46, localDateTime47, "Faculty", reservation49);
        equipment45.setLabLocation("Faculty");
        labManager41.setEquipmentStatus(equipment45, "");
        equipment45.setDescription("");
        model.Equipment equipment60 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        model.Reservation reservation64 = null;
        boolean boolean65 = equipment60.isModifyAvailable(localDateTime61, localDateTime62, "Faculty", reservation64);
        equipment60.setLabLocation("Faculty");
        equipment60.notifyObservers();
        observer.EquipmentObserver equipmentObserver69 = null;
        equipment60.attach(equipmentObserver69);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        model.Reservation reservation74 = null;
        boolean boolean75 = equipment60.isModifyAvailable(localDateTime71, localDateTime72, "Faculty", reservation74);
        state.EquipmentState equipmentState76 = equipment60.getCurrentState();
        equipment45.setState(equipmentState76);
        equipment29.setState(equipmentState76);
        equipment14.setState(equipmentState76);
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        boolean boolean83 = equipment14.isAvailable(localDateTime80, localDateTime81, "Guest");
        equipment14.setDescription("User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        labManager3.markMaintenance(equipment14);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Available" + "'", str32, "Available");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Available" + "'", str33, "Available");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(equipmentState76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3718");
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
        java.lang.String str56 = equipment15.getDescription();
        equipment15.markMaintenance();
        model.SensorUpdate sensorUpdate58 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment15.applySensorUpdate(sensorUpdate58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3719");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=9e7ce067-9b8a-43c7-bf62-78e8f21ef6d6, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=1e0554db-959c-4c51-b309-f0f492d9ab32, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str4, "User{userId=bdab34c0-376a-4eac-bd9b-8167d4201962, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3720");
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
        labManager5.setPasswordHash("User{userId=ec1cdb05-c503-42d6-9c44-e6a5310e091e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str96 = labManager5.getRole();
        labManager5.setIdOrCertNumber("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "LabManager" + "'", str96, "LabManager");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3721");
        model.Equipment equipment3 = new model.Equipment("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3722");
        model.Faculty faculty3 = new model.Faculty("User{userId=a63bf981-b1fe-4c3e-b795-7b7bdf0eee85, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=ca6d2add-c03e-4ac0-942b-fdd35c7cab98, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1e0554db-959c-4c51-b309-f0f492d9ab32, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3723");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}", reservation21);
        equipment3.setStatus("User{userId=b46b0ed3-c6e6-426a-a1c0-f480d4f1afb4, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3724");
        model.LabManager labManager3 = new model.LabManager("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5ba9d95a-cd3a-4291-99e9-9221ce96c724, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=81a1aa84-9400-4eae-94ba-24b390e44a98, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3725");
        model.Researcher researcher3 = new model.Researcher("User{userId=5b777b57-0f4b-4be6-9960-80b3dd667f1c, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}", "User{userId=6fc94979-6904-4b31-9f3d-1af9b3577669, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=59e7abe2-7eea-41cd-857e-9a985971a6ba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3726");
        model.Student student3 = new model.Student("User{userId=c3bb06bf-a390-4727-b549-5375005c6f5d, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=29535a0d-9d8c-4304-8892-1bf93b64cc11, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=1d3df56c-d05a-465d-9f54-8ddc36d67bbb, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3727");
        model.User user0 = null;
        model.Equipment equipment4 = new model.Equipment("", "", "");
        java.lang.String str5 = equipment4.getDescription();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        model.Reservation reservation9 = null;
        boolean boolean10 = equipment4.isModifyAvailable(localDateTime6, localDateTime7, "hi!", reservation9);
        equipment4.markMaintenance();
        state.EquipmentState equipmentState12 = equipment4.getCurrentState();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        strategy.PricingStrategy pricingStrategy15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation16 = new model.Reservation(user0, equipment4, localDateTime13, localDateTime14, pricingStrategy15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(equipmentState12);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3728");
        model.Faculty faculty3 = new model.Faculty("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Maintenance", "User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = faculty3.getRole();
        java.lang.String str5 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3729");
        model.Faculty faculty3 = new model.Faculty("Equipment{equipmentId='', description='', labLocation='', status='Guest'}", "User{userId=376801b9-2981-46c5-b75d-8d1f4444d53f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=70c40993-78e7-422c-bae8-0d552d6c36ef, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
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
        equipment7.disable();
        equipment7.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        strategy.PricingStrategy pricingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation26 = new model.Reservation((model.User) faculty3, equipment7, localDateTime23, localDateTime24, pricingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3730");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("Guest");
        java.util.UUID uUID7 = null;
        guest3.setUserId(uUID7);
        java.lang.String str9 = guest3.getIdOrCertNumber();
        guest3.setPasswordHash("User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str12 = guest3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str12, "User{userId=34a72861-dbb0-43b1-9770-f1868b8220c1, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3731");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        researcher3.setIdOrCertNumber("");
        double double9 = researcher3.getHourlyRate();
        java.lang.String str10 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3732");
        model.Student student3 = new model.Student("INACTIVE", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = student3.getPasswordHash();
        java.lang.String str5 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3733");
        model.Student student3 = new model.Student("ACTIVE", "Student", "LM-CERT");
        student3.setEmail("hi!");
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3734");
        model.Student student3 = new model.Student("User{userId=9e863393-c76d-4499-8ed2-06d466032c33, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}", "User{userId=c3bb06bf-a390-4727-b549-5375005c6f5d, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", "User{userId=777b9370-e1e5-4fd8-a436-2007d0a1d701, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3735");
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
        java.lang.String str18 = researcher3.getPasswordHash();
        researcher3.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(uUID14);
// flaky "44) test3735(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID14.toString(), "b0c195e9-d1d7-40bd-836a-edc7e6deea8f");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3736");
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
        java.lang.String str50 = equipment45.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ACTIVE" + "'", str50, "ACTIVE");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3737");
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
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3738");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3739");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        labManager5.setPasswordHash("Guest");
        java.lang.String str14 = labManager5.getRole();
        labManager5.setPasswordHash("");
        model.HeadLabCoordinator headLabCoordinator20 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager22 = headLabCoordinator20.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment26 = new model.Equipment("", "", "");
        labManager22.markMaintenance(equipment26);
        java.lang.String str28 = labManager22.getRole();
        java.lang.String str29 = labManager22.getRole();
        labManager22.setIdOrCertNumber("User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str32 = labManager22.getRole();
        model.Equipment equipment36 = new model.Equipment("", "", "");
        equipment36.enable();
        equipment36.enable();
        java.lang.String str39 = equipment36.getStatus();
        java.lang.String str40 = equipment36.getStatus();
        java.lang.String str41 = equipment36.getDescription();
        labManager22.addEquipment(equipment36);
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment36.attach(equipmentObserver43);
        labManager5.setEquipmentStatus(equipment36, "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        // The following exception was thrown during execution in test generation
        try {
            equipment36.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LabManager" + "'", str28, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LabManager" + "'", str29, "LabManager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LabManager" + "'", str32, "LabManager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Available" + "'", str39, "Available");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Available" + "'", str40, "Available");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3740");
        model.Student student3 = new model.Student("User{userId=9e5f56d0-477a-4f8f-8b0e-6f5a1037558b, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getIdOrCertNumber();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}" + "'", str5, "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3741");
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
        equipment3.notifyObservers();
        java.lang.String str20 = equipment3.getDescription();
        java.lang.String str21 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(equipmentState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3742");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getIdOrCertNumber();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3743");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        model.HeadLabCoordinator headLabCoordinator11 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator11.autoGenerateManagerAccount("Guest");
        model.Equipment equipment17 = new model.Equipment("INACTIVE", "", "Temp123!");
        labManager13.markMaintenance(equipment17);
        labManager5.setEquipmentStatus(equipment17, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str21 = equipment17.getStatus();
        java.lang.Class<?> wildcardClass22 = equipment17.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str21, "User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3744");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver10 = null;
        equipment3.attach(equipmentObserver10);
        equipment3.setDescription("User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = equipment3.isAvailable(localDateTime14, localDateTime15, "LM-CERT");
        java.lang.String str18 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str18, "User{userId=6f1c3ba8-27b9-404a-bca6-25f01db090ba, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3745");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.setPasswordHash("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = faculty3.getRole();
        faculty3.setIdOrCertNumber("Student");
        faculty3.setPasswordHash("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str11 = faculty3.getStatus();
        boolean boolean12 = faculty3.isActive();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3746");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getStatus();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        headLabCoordinator3.setActive(true);
        java.lang.String str12 = headLabCoordinator3.getRole();
        double double13 = headLabCoordinator3.getHourlyRate();
        model.Student student17 = new model.Student("", "hi!", "");
        double double18 = student17.getHourlyRate();
        java.lang.String str19 = student17.toString();
        java.lang.String str20 = student17.toString();
        java.lang.String str21 = student17.toString();
        double double22 = student17.getHourlyRate();
        model.LabManager labManager26 = new model.LabManager("ACTIVE", "Guest", "LabManager");
        model.Researcher researcher30 = new model.Researcher("", "hi!", "hi!");
        researcher30.setEmail("hi!");
        double double33 = researcher30.getHourlyRate();
        java.util.UUID uUID34 = researcher30.getUserId();
        labManager26.setUserId(uUID34);
        student17.setUserId(uUID34);
        headLabCoordinator3.setUserId(uUID34);
        double double38 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACTIVE" + "'", str5, "ACTIVE");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HeadLabCoordinator" + "'", str12, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
// flaky "45) test3746(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str19, "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "12) test3746(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str20, "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
// flaky "2) test3746(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str21, "User{userId=47043137-3a0e-424e-ac3d-dd7da4f04a9f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 15.0d + "'", double33 == 15.0d);
        org.junit.Assert.assertNotNull(uUID34);
// flaky "1) test3746(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID34.toString(), "a5132b9f-976b-4a63-b8b0-cf56c56c65a5");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3747");
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
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3748");
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
        equipment66.setDescription("User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        observer.EquipmentObserver equipmentObserver81 = null;
        equipment66.attach(equipmentObserver81);
        equipment66.setDescription("User{userId=0deafad1-931e-43ce-826c-2d7ca1a40195, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver85 = null;
        equipment66.attach(equipmentObserver85);
        equipment66.setStatus("Equipment{equipmentId='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "46) test3748(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "5112a356-9e57-4960-b5e2-7f1e08e09ea8");
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
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3749");
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
        boolean boolean63 = labManager5.isActive();
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
// flaky "47) test3749(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID59.toString(), "3da79eff-e333-4d26-9eb5-400b10ba865c");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Faculty" + "'", str62, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3750");
        model.Guest guest3 = new model.Guest("User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID4 = guest3.getUserId();
        java.lang.String str5 = guest3.getRole();
        java.lang.String str6 = guest3.getRole();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "48) test3750(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "a1ead7b1-8aec-43ad-8be1-ef53ef763956");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3751");
        model.LabManager labManager3 = new model.LabManager("User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LM-CERT", "Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        boolean boolean4 = labManager3.isActive();
        java.lang.String str5 = labManager3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "49) test3751(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=a04ab48d-8a0f-472f-a258-2c21c5939187, email='User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Student', status='Available'}', role='LabManager'}" + "'", str5, "User{userId=a04ab48d-8a0f-472f-a258-2c21c5939187, email='User{userId=fa78f07f-8202-4434-9867-45e206fdb9e2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Student', status='Available'}', role='LabManager'}");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3752");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "Faculty");
        boolean boolean4 = headLabCoordinator3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3753");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}", "User{userId=8afbbedf-cfb7-4c3d-ab78-d6e529baf541, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=6577017f-aabe-4cb1-a45c-6e27acaf623c, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3754");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=03994713-dc59-4c8a-8a0a-0369991caab1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3755");
        model.Faculty faculty3 = new model.Faculty("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
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
        observer.EquipmentObserver equipmentObserver43 = null;
        equipment31.attach(equipmentObserver43);
        observer.EquipmentObserver equipmentObserver45 = null;
        equipment31.detach(equipmentObserver45);
        labManager11.setEquipmentStatus(equipment31, "User{userId=7f7bf011-61fc-468a-9dc5-c642879ff85e, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        equipment31.markMaintenance();
        java.lang.String str50 = equipment31.toString();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        model.Reservation reservation54 = null;
        boolean boolean55 = equipment31.isModifyAvailable(localDateTime51, localDateTime52, "", reservation54);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        strategy.PricingStrategy pricingStrategy58 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation59 = new model.Reservation((model.User) faculty3, equipment31, localDateTime56, localDateTime57, pricingStrategy58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str50, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3756");
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
        state.EquipmentState equipmentState40 = equipment37.getCurrentState();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState40);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3757");
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
        equipment63.setDescription("User{userId=2aa38236-773d-4c54-aacb-9b926d015e42, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
// flaky "50) test3757(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=60b9f4fb-669f-43e7-9fdf-82128908b432, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=60b9f4fb-669f-43e7-9fdf-82128908b432, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
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
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3758");
        model.Faculty faculty3 = new model.Faculty("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=d05c480f-688b-42f7-8d2e-8b3ca5550da2, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3759");
        model.Researcher researcher3 = new model.Researcher("User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=af26f200-ffb1-4824-b684-fc4266d3e7da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=09c388c7-fff2-463a-b6e6-73a580ad65eb, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3760");
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
        state.EquipmentState equipmentState55 = equipment36.getCurrentState();
        java.lang.String str56 = equipment36.getEquipmentId();
        state.EquipmentState equipmentState57 = equipment36.getCurrentState();
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
        org.junit.Assert.assertNotNull(equipmentState55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(equipmentState57);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3761");
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3762");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("Available", "User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=ac54e2f8-54ff-4573-ad06-84e1fc233c71, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator16 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager18 = headLabCoordinator16.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean19 = labManager18.isActive();
        labManager18.setPasswordHash("Guest");
        double double22 = labManager18.getHourlyRate();
        model.Researcher researcher26 = new model.Researcher("", "hi!", "hi!");
        researcher26.setEmail("hi!");
        double double29 = researcher26.getHourlyRate();
        java.util.UUID uUID30 = researcher26.getUserId();
        researcher26.setPasswordHash("Faculty");
        double double33 = researcher26.getHourlyRate();
        java.util.UUID uUID34 = researcher26.getUserId();
        labManager18.setUserId(uUID34);
        headLabCoordinator12.setUserId(uUID34);
        labManager8.setUserId(uUID34);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 15.0d + "'", double29 == 15.0d);
        org.junit.Assert.assertNotNull(uUID30);
// flaky "51) test3762(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID30.toString(), "f0056800-a7ed-40d7-90aa-776f58d42ef0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 15.0d + "'", double33 == 15.0d);
        org.junit.Assert.assertNotNull(uUID34);
// flaky "13) test3762(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID34.toString(), "f0056800-a7ed-40d7-90aa-776f58d42ef0");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3763");
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
        observer.EquipmentObserver equipmentObserver37 = null;
        equipment27.attach(equipmentObserver37);
        java.lang.String str39 = equipment27.toString();
        equipment27.setDescription("User{userId=6e8099ef-4680-48ef-8e68-72acbcab8847, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str42 = equipment27.getLabLocation();
        equipment27.setDescription("User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        observer.EquipmentObserver equipmentObserver45 = null;
        equipment27.attach(equipmentObserver45);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Guest'}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3764");
        model.Student student3 = new model.Student("User{userId=a316677c-638d-4d36-8514-24c5a2c43dd9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}", "User{userId=6907ea78-c483-4fc8-ba67-aa194b12b7c2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3765");
        model.Student student3 = new model.Student("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3766");
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
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "User{userId=f276d026-7d16-4815-b09e-c09025fbcb5e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation18);
        observer.EquipmentObserver equipmentObserver20 = null;
        equipment3.attach(equipmentObserver20);
        equipment3.setLabLocation("User{userId=c95a48ac-f685-4594-8490-b4cedb669014, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3767");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPasswordHash();
        java.lang.String str8 = faculty3.getIdOrCertNumber();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Maintenance" + "'", str5, "Maintenance");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "INACTIVE" + "'", str7, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3768");
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
        equipment3.setStatus("Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        observer.EquipmentObserver equipmentObserver21 = null;
        equipment3.detach(equipmentObserver21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Available" + "'", str18, "Available");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3769");
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
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment36.isModifyAvailable(localDateTime50, localDateTime51, "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", reservation53);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        boolean boolean58 = equipment36.isAvailable(localDateTime55, localDateTime56, "User{userId=4d0a85d8-97dd-4f15-9b14-6b8414f28684, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment36.setDescription("User{userId=03d04727-c0b8-41f6-8c22-90315f144551, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3770");
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
        java.lang.String str47 = labManager5.getRole();
        double double48 = labManager5.getHourlyRate();
        labManager5.setEmail("User{userId=7f1b84d1-159a-4211-a3df-b6f9b1a96c0e, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str42, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "LabManager" + "'", str44, "LabManager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "LabManager" + "'", str47, "LabManager");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3771");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str6 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3772");
        model.LabManager labManager3 = new model.LabManager("Faculty", "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=3a7df656-1d50-43e2-a456-4e7ae8775e6c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        double double4 = labManager3.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator8 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager10 = headLabCoordinator8.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID11 = null;
        headLabCoordinator8.setUserId(uUID11);
        model.LabManager labManager14 = headLabCoordinator8.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        equipment18.enable();
        labManager14.addEquipment(equipment18);
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.lang.String str25 = equipment24.getDescription();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment24.isModifyAvailable(localDateTime26, localDateTime27, "hi!", reservation29);
        java.lang.String str31 = equipment24.getDescription();
        state.EquipmentState equipmentState32 = equipment24.getCurrentState();
        equipment24.setLabLocation("Student");
        labManager14.setEquipmentStatus(equipment24, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        equipment40.disable();
        equipment40.enable();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean52 = equipment40.isAvailable(localDateTime49, localDateTime50, "");
        labManager14.addEquipment(equipment40);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean57 = equipment40.isAvailable(localDateTime54, localDateTime55, "Equipment{equipmentId='', description='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', labLocation='Faculty', status='User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        equipment40.markMaintenance();
        java.lang.String str59 = equipment40.getLabLocation();
        labManager3.setEquipmentStatus(equipment40, "User{userId=c231e062-149b-42f9-b324-db8d3a984c3b, email='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='INACTIVE', idOrCertNumber='', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(equipmentState32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3773");
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
        model.HeadLabCoordinator headLabCoordinator55 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager57 = headLabCoordinator55.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment61 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        model.Reservation reservation65 = null;
        boolean boolean66 = equipment61.isModifyAvailable(localDateTime62, localDateTime63, "Faculty", reservation65);
        equipment61.setLabLocation("Faculty");
        labManager57.setEquipmentStatus(equipment61, "");
        java.lang.String str71 = equipment61.getLabLocation();
        equipment61.notifyObservers();
        labManager5.addEquipment(equipment61);
        java.lang.String str74 = equipment61.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(labManager57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Faculty" + "'", str71, "Faculty");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Faculty" + "'", str74, "Faculty");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3774");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7a7b206c-6196-4d12-98ad-6b879772d4c3, email='LM-CERT', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str6 = headLabCoordinator3.getRole();
        headLabCoordinator3.setActive(true);
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3775");
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
        equipment3.setStatus("");
        equipment3.setLabLocation("User{userId=b876134f-c21a-4427-89a4-89e90dc6fd34, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3776");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        labManager5.setActive(false);
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3777");
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
        java.lang.String str36 = equipment27.toString();
        java.lang.String str37 = equipment27.getStatus();
        equipment27.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Guest'}" + "'", str36, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Guest" + "'", str37, "Guest");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3778");
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
        equipment3.setLabLocation("Student");
        java.lang.String str20 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3779");
        model.LabManager labManager3 = new model.LabManager("User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setPasswordHash("User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        labManager11.markMaintenance(equipment15);
        java.lang.String str17 = equipment15.getStatus();
        labManager3.addEquipment(equipment15);
        equipment15.setDescription("User{userId=8d10c7c1-eb42-4cab-9b63-c0617b0e2696, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3780");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        double double9 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=090698b7-4713-4874-b7d9-bb772231c198, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3781");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "");
        java.lang.String str4 = headLabCoordinator3.getRole();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=3bf68180-a67f-4646-9781-d2d0963b2816, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3782");
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
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        model.Reservation reservation38 = null;
        boolean boolean39 = equipment25.isModifyAvailable(localDateTime35, localDateTime36, "User{userId=6c62ee90-5cd8-4a90-a259-919015ac18f0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation38);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HeadLabCoordinator" + "'", str18, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LM-CERT" + "'", str29, "LM-CERT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3783");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=9e863393-c76d-4499-8ed2-06d466032c33, email='Equipment{equipmentId='', description='Equipment{equipmentId='', description='', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}', status='ACTIVE', idOrCertNumber='User{userId=e2172192-23a8-4cc7-be23-1664eaeee0bd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='Researcher'}", "User{userId=aee486ea-115e-4bc7-be81-7d53ce7d50ad, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=1104a47a-3f82-43dd-86c4-308fdaeeab9b, email='HeadLabCoordinator', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3784");
        model.Student student3 = new model.Student("User{userId=adf9b67a-3bea-4298-96f2-77f4f180190d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=629f7fbb-f5fc-468d-9577-c8df2a23b443, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=1eb80822-737f-46e1-a8ee-cbb30b51cdba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3785");
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
        java.lang.String str21 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3786");
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
        equipment22.notifyObservers();
        java.lang.String str47 = equipment22.getLabLocation();
        java.lang.String str48 = equipment22.toString();
        equipment22.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Available" + "'", str25, "Available");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(equipmentState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str48, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3787");
        model.Guest guest3 = new model.Guest("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=c929913b-74df-4940-ad50-a5280460c0ab, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=d9aa6c99-6d48-47fc-8468-c015b7413822, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getStatus();
        java.lang.String str5 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3788");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        double double11 = labManager5.getHourlyRate();
        java.lang.String str12 = labManager5.getIdOrCertNumber();
        java.lang.String str13 = labManager5.getStatus();
        double double14 = labManager5.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator18 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager20 = headLabCoordinator18.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID21 = null;
        headLabCoordinator18.setUserId(uUID21);
        model.LabManager labManager24 = headLabCoordinator18.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment28 = new model.Equipment("", "", "");
        equipment28.enable();
        labManager24.addEquipment(equipment28);
        model.Equipment equipment34 = new model.Equipment("", "", "");
        java.lang.String str35 = equipment34.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        model.Reservation reservation39 = null;
        boolean boolean40 = equipment34.isModifyAvailable(localDateTime36, localDateTime37, "hi!", reservation39);
        java.lang.String str41 = equipment34.getDescription();
        state.EquipmentState equipmentState42 = equipment34.getCurrentState();
        equipment34.setLabLocation("Student");
        labManager24.setEquipmentStatus(equipment34, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment34.notifyObservers();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean51 = equipment34.isAvailable(localDateTime48, localDateTime49, "");
        equipment34.setLabLocation("User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        labManager5.setEquipmentStatus(equipment34, "User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        model.HeadLabCoordinator headLabCoordinator59 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager61 = headLabCoordinator59.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str62 = headLabCoordinator59.getRole();
        model.LabManager labManager64 = headLabCoordinator59.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.LabManager labManager66 = headLabCoordinator59.autoGenerateManagerAccount("ACTIVE");
        java.lang.String str67 = labManager66.toString();
        labManager66.setEmail("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager66.setActive(true);
        model.Equipment equipment75 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        model.Reservation reservation79 = null;
        boolean boolean80 = equipment75.isModifyAvailable(localDateTime76, localDateTime77, "Faculty", reservation79);
        equipment75.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        model.Reservation reservation86 = null;
        boolean boolean87 = equipment75.isModifyAvailable(localDateTime83, localDateTime84, "", reservation86);
        java.lang.String str88 = equipment75.getLabLocation();
        java.lang.String str89 = equipment75.getStatus();
        java.lang.String str90 = equipment75.getDescription();
        labManager66.markMaintenance(equipment75);
        observer.EquipmentObserver equipmentObserver92 = null;
        equipment75.detach(equipmentObserver92);
        labManager5.setEquipmentStatus(equipment75, "User{userId=48fbbdea-b6e5-4faa-a6b9-7d01fe51e96f, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LM-CERT" + "'", str12, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ACTIVE" + "'", str13, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(equipmentState42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(labManager61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "HeadLabCoordinator" + "'", str62, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager64);
        org.junit.Assert.assertNotNull(labManager66);
// flaky "52) test3788(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "User{userId=fb43e73c-5a86-4d1d-8f78-113e7f28ca03, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str67, "User{userId=fb43e73c-5a86-4d1d-8f78-113e7f28ca03, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Faculty" + "'", str88, "Faculty");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Available" + "'", str89, "Available");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3789");
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
        state.EquipmentState equipmentState58 = equipment35.getCurrentState();
        java.lang.String str59 = equipment35.getEquipmentId();
        java.lang.Class<?> wildcardClass60 = equipment35.getClass();
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
        org.junit.Assert.assertNotNull(equipmentState58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3790");
        model.Student student3 = new model.Student("Researcher", "ACTIVE", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = student3.getRole();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3791");
        model.Student student3 = new model.Student("User{userId=3c9d64ed-6485-40ad-b427-3eb1e35f0e63, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
        java.lang.String str4 = student3.getRole();
        java.util.UUID uUID5 = student3.getUserId();
        java.lang.String str6 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "53) test3791(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID5.toString(), "373addc0-0b35-4585-8b07-bc13d67a6679");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3792");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=f2bee4ca-dd08-485d-ba00-a3959ad39bbc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=6e8099ef-4680-48ef-8e68-72acbcab8847, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3793");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        boolean boolean4 = faculty3.isActive();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3794");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        guest3.setActive(true);
        java.lang.String str7 = guest3.getStatus();
        double double8 = guest3.getHourlyRate();
        guest3.setIdOrCertNumber("User{userId=13e5128f-9d9b-4135-9b18-0b90648a4093, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3795");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}", "User{userId=9d416907-3a05-44fd-bc51-fc26cdb1078f, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        headLabCoordinator3.setPasswordHash("User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3796");
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
        java.lang.String str40 = equipment24.getEquipmentId();
        equipment24.enable();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3797");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        java.lang.String str6 = faculty3.getRole();
        java.util.UUID uUID7 = faculty3.getUserId();
        java.lang.String str8 = faculty3.getEmail();
        model.HeadLabCoordinator headLabCoordinator12 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID13 = headLabCoordinator12.getUserId();
        faculty3.setUserId(uUID13);
        double double15 = faculty3.getHourlyRate();
        double double16 = faculty3.getHourlyRate();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "54) test3797(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "29752153-0a16-432b-8efc-f83056ede37e");
// flaky "14) test3797(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=29752153-0a16-432b-8efc-f83056ede37e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=29752153-0a16-432b-8efc-f83056ede37e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "3) test3797(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID7.toString(), "29752153-0a16-432b-8efc-f83056ede37e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(uUID13);
// flaky "2) test3797(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID13.toString(), "55beada5-a5d2-4f03-a555-2f58c1a0d669");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3798");
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
        boolean boolean40 = labManager5.isActive();
        java.lang.String str41 = labManager5.getRole();
        java.lang.String str42 = labManager5.getStatus();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LabManager" + "'", str24, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "LabManager" + "'", str41, "LabManager");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ACTIVE" + "'", str42, "ACTIVE");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3799");
        model.Guest guest3 = new model.Guest("User{userId=a01a188f-c990-43ed-b38c-8ffcde48c038, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=6d11d2d8-000a-4498-88ff-7e3b9b1e820b, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}", "");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3800");
        model.LabManager labManager3 = new model.LabManager("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Temp123!");
        labManager3.setIdOrCertNumber("Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Maintenance'}");
        labManager3.setIdOrCertNumber("User{userId=06511b06-101b-4e3c-8891-7552d15fb9d3, email='', status='ACTIVE', idOrCertNumber='User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}', role='Guest'}");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3801");
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
        model.HeadLabCoordinator headLabCoordinator59 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager61 = headLabCoordinator59.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment65 = new model.Equipment("", "", "");
        labManager61.markMaintenance(equipment65);
        java.lang.String str67 = labManager61.getIdOrCertNumber();
        model.HeadLabCoordinator headLabCoordinator71 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager73 = headLabCoordinator71.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment77 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        model.Reservation reservation81 = null;
        boolean boolean82 = equipment77.isModifyAvailable(localDateTime78, localDateTime79, "Faculty", reservation81);
        equipment77.setLabLocation("Faculty");
        labManager73.setEquipmentStatus(equipment77, "");
        equipment77.notifyObservers();
        labManager61.markMaintenance(equipment77);
        equipment77.disable();
        java.lang.String str90 = equipment77.getDescription();
        equipment77.setLabLocation("User{userId=5c6c6e7d-1ad5-4b59-8412-aa72b05a0c84, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager9.addEquipment(equipment77);
        labManager9.setPasswordHash("User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
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
        org.junit.Assert.assertNotNull(labManager61);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LM-CERT" + "'", str67, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager73);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3802");
        model.Faculty faculty3 = new model.Faculty("", "User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "");
        java.lang.String str4 = faculty3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3803");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        double double10 = researcher3.getHourlyRate();
        double double11 = researcher3.getHourlyRate();
        researcher3.setIdOrCertNumber("User{userId=a861c68a-13b8-4193-85d6-6e1c136fad92, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LabManager', role='HeadLabCoordinator'}");
        java.lang.String str14 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3804");
        model.Researcher researcher3 = new model.Researcher("User{userId=1eb80822-737f-46e1-a8ee-cbb30b51cdba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=4df4900a-2c68-4a0a-9a37-a3ae2ec40786, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3805");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        java.lang.String str11 = labManager5.getRole();
        model.HeadLabCoordinator headLabCoordinator15 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager17 = headLabCoordinator15.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID18 = null;
        headLabCoordinator15.setUserId(uUID18);
        model.LabManager labManager21 = headLabCoordinator15.autoGenerateManagerAccount("ACTIVE");
        labManager21.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment27 = new model.Equipment("", "", "");
        equipment27.enable();
        equipment27.enable();
        java.lang.String str30 = equipment27.getStatus();
        equipment27.markMaintenance();
        observer.EquipmentObserver equipmentObserver32 = null;
        equipment27.attach(equipmentObserver32);
        java.lang.String str34 = equipment27.getStatus();
        java.lang.String str35 = equipment27.getLabLocation();
        labManager21.addEquipment(equipment27);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean40 = equipment27.isAvailable(localDateTime37, localDateTime38, "User{userId=8f851322-9bf6-47dc-a8d9-42408e3f74d9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        strategy.PricingStrategy pricingStrategy43 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation44 = new model.Reservation((model.User) labManager5, equipment27, localDateTime41, localDateTime42, pricingStrategy43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Available" + "'", str30, "Available");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Maintenance" + "'", str34, "Maintenance");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3806");
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
        equipment3.notifyObservers();
        java.lang.String str22 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(equipmentState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str15, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str20, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3807");
        model.LabManager labManager3 = new model.LabManager("User{userId=27a92162-949b-48dc-a1bd-6ed0d25c470a, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=106c5b83-7ffa-4815-a617-f9fee4e302ba, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = labManager3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3808");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double8 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3809");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        boolean boolean7 = headLabCoordinator3.isActive();
        double double8 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3810");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str8 = guest3.getRole();
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getPasswordHash();
        java.lang.String str11 = guest3.getIdOrCertNumber();
        model.LabManager labManager15 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str16 = labManager15.getRole();
        double double17 = labManager15.getHourlyRate();
        double double18 = labManager15.getHourlyRate();
        java.util.UUID uUID19 = labManager15.getUserId();
        guest3.setUserId(uUID19);
        java.lang.String str21 = guest3.getRole();
        boolean boolean22 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LabManager" + "'", str16, "LabManager");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(uUID19);
// flaky "55) test3810(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID19.toString(), "14377a4d-12f5-424d-8bfa-ba1f4023e5ec");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3811");
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
        model.HeadLabCoordinator headLabCoordinator60 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double61 = headLabCoordinator60.getHourlyRate();
        model.LabManager labManager63 = headLabCoordinator60.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator67 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager69 = headLabCoordinator67.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment73 = new model.Equipment("", "", "");
        labManager69.addEquipment(equipment73);
        java.lang.String str75 = labManager69.getRole();
        java.lang.String str76 = labManager69.getStatus();
        java.util.UUID uUID77 = labManager69.getUserId();
        labManager63.setUserId(uUID77);
        java.lang.String str79 = labManager63.getRole();
        labManager63.setPasswordHash("User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student85 = new model.Student("", "hi!", "");
        java.lang.String str86 = student85.getEmail();
        double double87 = student85.getHourlyRate();
        boolean boolean88 = student85.isActive();
        java.lang.String str89 = student85.getRole();
        java.util.UUID uUID90 = student85.getUserId();
        labManager63.setUserId(uUID90);
        labManager3.setUserId(uUID90);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(equipmentState31);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(labManager63);
        org.junit.Assert.assertNotNull(labManager69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "LabManager" + "'", str75, "LabManager");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ACTIVE" + "'", str76, "ACTIVE");
        org.junit.Assert.assertNotNull(uUID77);
// flaky "56) test3811(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID77.toString(), "bbb5dd43-cc11-4df5-a53f-7bb43483f31e");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "LabManager" + "'", str79, "LabManager");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Student" + "'", str89, "Student");
        org.junit.Assert.assertNotNull(uUID90);
// flaky "15) test3811(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID90.toString(), "d996d552-0cec-48d3-a5d2-b60876345523");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3812");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}", "User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}", "User{userId=51a0bff6-a1d1-4a6b-9cbd-18657e1a4093, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3813");
        model.LabManager labManager3 = new model.LabManager("User{userId=f0765721-a687-481f-b6ed-91f0c3fe46a7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3814");
        model.Equipment equipment3 = new model.Equipment("User{userId=cdb40511-4cd0-4327-8a3c-422b0bc82441, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}", "Equipment{equipmentId='', description='', labLocation='', status='Disabled'}");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3815");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        boolean boolean4 = student3.isActive();
        student3.setIdOrCertNumber("User{userId=aba9aea5-5166-46f6-bd18-14b8b26e887d, email='Equipment{equipmentId='', description='', labLocation='HeadLabCoordinator', status='Available'}', status='ACTIVE', idOrCertNumber='User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3816");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=6e7d9ffc-3431-49a6-b0aa-0b3639347979, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Student'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}", "User{userId=2c004688-3bec-419b-94ff-d26c60de202d, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Researcher'}");
        headLabCoordinator3.setIdOrCertNumber("User{userId=f276cb30-cc86-449e-af7f-b94d06fa67e7, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3817");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getStatus();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getIdOrCertNumber();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3818");
        model.Student student3 = new model.Student("", "hi!", "");
        java.util.UUID uUID4 = student3.getUserId();
        student3.setActive(false);
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "57) test3818(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "a0edc50b-3cd5-4d71-a956-31d723dcc0d7");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3819");
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
        equipment36.notifyObservers();
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment36.attach(equipmentObserver57);
        model.HeadLabCoordinator headLabCoordinator62 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager64 = headLabCoordinator62.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment68 = new model.Equipment("", "", "");
        labManager64.addEquipment(equipment68);
        model.Equipment equipment73 = new model.Equipment("", "", "");
        java.lang.String str74 = equipment73.getDescription();
        java.time.LocalDateTime localDateTime75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        model.Reservation reservation78 = null;
        boolean boolean79 = equipment73.isModifyAvailable(localDateTime75, localDateTime76, "hi!", reservation78);
        java.lang.String str80 = equipment73.getDescription();
        equipment73.setStatus("Researcher");
        labManager64.addEquipment(equipment73);
        equipment73.disable();
        state.EquipmentState equipmentState85 = equipment73.getCurrentState();
        state.EquipmentState equipmentState86 = equipment73.getCurrentState();
        // The following exception was thrown during execution in test generation
        try {
            equipment36.setState(equipmentState86);
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
        org.junit.Assert.assertNotNull(labManager64);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(equipmentState85);
        org.junit.Assert.assertNotNull(equipmentState86);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3820");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getRole();
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "58) test3820(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "e4fd66b2-59e2-4a25-8eb1-d822cc9eb630");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3821");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        java.lang.String str10 = equipment3.getEquipmentId();
        equipment3.setStatus("");
        equipment3.enable();
        equipment3.setDescription("User{userId=309a7082-5e78-4ca2-8d7f-fc969df7a3fe, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3822");
        model.Student student3 = new model.Student("User{userId=af9411af-8a27-4c23-b487-33b74e9ca3e4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b638de21-bfbb-4db7-bb3b-0fec69ede207, email='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='HeadLabCoordinator', role='Student'}", "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3823");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str4 = equipment3.toString();
        equipment3.notifyObservers();
        equipment3.setLabLocation("User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str8 = equipment3.toString();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        model.Reservation reservation12 = null;
        boolean boolean13 = equipment3.isModifyAvailable(localDateTime9, localDateTime10, "User{userId=9e3b77e4-ffce-4365-a4ea-5b7aca7b04e9, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}", reservation12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}" + "'", str4, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}" + "'", str8, "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3824");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        researcher3.setPasswordHash("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        java.lang.String str8 = researcher3.getIdOrCertNumber();
        java.lang.String str9 = researcher3.getRole();
        model.HeadLabCoordinator headLabCoordinator13 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager15 = headLabCoordinator13.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean16 = labManager15.isActive();
        labManager15.setPasswordHash("Guest");
        java.lang.String str19 = labManager15.getRole();
        java.lang.String str20 = labManager15.getRole();
        java.util.UUID uUID21 = labManager15.getUserId();
        researcher3.setUserId(uUID21);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LabManager" + "'", str20, "LabManager");
        org.junit.Assert.assertNotNull(uUID21);
// flaky "59) test3824(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID21.toString(), "58a1691a-8b36-4b3e-83c1-3ea7ba1b1922");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3825");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        equipment3.enable();
        state.EquipmentState equipmentState11 = equipment3.getCurrentState();
        state.EquipmentState equipmentState12 = equipment3.getCurrentState();
        equipment3.setDescription("User{userId=d117ba49-c932-4404-9395-4a9f98496768, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertNotNull(equipmentState12);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3826");
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
        state.EquipmentState equipmentState53 = equipment49.getCurrentState();
        equipment49.setStatus("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LM-CERT" + "'", str11, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipmentState53);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3827");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        equipment3.setLabLocation("ACTIVE");
        java.lang.String str6 = equipment3.getEquipmentId();
        equipment3.enable();
        java.lang.String str8 = equipment3.toString();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=379f615b-2365-4bde-8d20-2d952fc12001, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.SensorUpdate sensorUpdate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ACTIVE" + "'", str6, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}" + "'", str8, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3828");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        equipment3.setDescription("User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3829");
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
        labManager9.setEmail("User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager9.setPasswordHash("User{userId=4d3bcd3c-dba1-440d-941b-33ec60c9d0b5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator56 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager58 = headLabCoordinator56.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment62 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        model.Reservation reservation66 = null;
        boolean boolean67 = equipment62.isModifyAvailable(localDateTime63, localDateTime64, "Faculty", reservation66);
        equipment62.setLabLocation("Faculty");
        labManager58.setEquipmentStatus(equipment62, "Guest");
        model.Equipment equipment75 = new model.Equipment("", "", "");
        labManager58.addEquipment(equipment75);
        model.Equipment equipment80 = new model.Equipment("", "", "");
        java.lang.String str81 = equipment80.getDescription();
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        model.Reservation reservation85 = null;
        boolean boolean86 = equipment80.isModifyAvailable(localDateTime82, localDateTime83, "hi!", reservation85);
        labManager58.setEquipmentStatus(equipment80, "Guest");
        java.lang.String str89 = equipment80.getLabLocation();
        observer.EquipmentObserver equipmentObserver90 = null;
        equipment80.attach(equipmentObserver90);
        java.lang.String str92 = equipment80.toString();
        java.time.LocalDateTime localDateTime93 = null;
        java.time.LocalDateTime localDateTime94 = null;
        boolean boolean96 = equipment80.isAvailable(localDateTime93, localDateTime94, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager9.addEquipment(equipment80);
        equipment80.setDescription("User{userId=7d17150c-c48a-4217-8b44-953b09be9a24, email='User{userId=8af137e2-28d3-421a-910a-aa221a97ebf8, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', role='Researcher'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Guest'}" + "'", str92, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3830");
        model.LabManager labManager3 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        double double6 = labManager3.getHourlyRate();
        labManager3.setIdOrCertNumber("User{userId=89547e3f-6042-4d85-b8a0-d44100c23dc9, email='INACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3831");
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
        equipment13.setLabLocation("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver78 = null;
        equipment13.detach(equipmentObserver78);
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
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3832");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=d9b4b0c6-0da3-4b3d-9dc0-787d1f5e5628, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=b92a0ddf-9cb7-4f45-916a-88423a5eb6dc, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3833");
        model.Researcher researcher3 = new model.Researcher("User{userId=93855394-6b6d-4bc9-9fe1-bc52e03c4239, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=0393009a-b3ca-4bd2-927f-8836aa1c5301, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=142baae1-3141-41b1-b6d5-2f13b5b41771, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3834");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        model.HeadLabCoordinator headLabCoordinator10 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager12 = headLabCoordinator10.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment16 = new model.Equipment("", "", "");
        labManager12.addEquipment(equipment16);
        java.lang.String str18 = labManager12.getRole();
        java.lang.String str19 = labManager12.getStatus();
        java.util.UUID uUID20 = labManager12.getUserId();
        labManager6.setUserId(uUID20);
        java.lang.String str22 = labManager6.getRole();
        labManager6.setPasswordHash("User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.Student student28 = new model.Student("", "hi!", "");
        java.lang.String str29 = student28.getEmail();
        double double30 = student28.getHourlyRate();
        boolean boolean31 = student28.isActive();
        java.lang.String str32 = student28.getRole();
        java.util.UUID uUID33 = student28.getUserId();
        labManager6.setUserId(uUID33);
        model.Equipment equipment38 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str39 = equipment38.getLabLocation();
        observer.EquipmentObserver equipmentObserver40 = null;
        equipment38.detach(equipmentObserver40);
        equipment38.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str44 = equipment38.getLabLocation();
        java.lang.String str45 = equipment38.getStatus();
        java.lang.String str46 = equipment38.getLabLocation();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        model.Reservation reservation50 = null;
        boolean boolean51 = equipment38.isModifyAvailable(localDateTime47, localDateTime48, "User{userId=794be47e-3182-40f8-81ec-442c48ec6a11, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation50);
        java.lang.String str52 = equipment38.toString();
        labManager6.setEquipmentStatus(equipment38, "User{userId=2008b236-48cb-4585-b4c6-4cb740e249be, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        equipment38.setLabLocation("User{userId=ec6a6b33-cfd5-4581-b13d-cbf8dd23c44d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ACTIVE" + "'", str19, "ACTIVE");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "60) test3834(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID20.toString(), "aa86a8a5-2292-41c8-a047-59280e40b714");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LabManager" + "'", str22, "LabManager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Student" + "'", str32, "Student");
        org.junit.Assert.assertNotNull(uUID33);
// flaky "16) test3834(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID33.toString(), "dc54274c-4d24-4530-98d0-47a567ef495b");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Available" + "'", str45, "Available");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str52, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3835");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment9 = new model.Equipment("", "", "");
        labManager5.markMaintenance(equipment9);
        equipment9.setStatus("User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment9.attach(equipmentObserver13);
        java.lang.String str15 = equipment9.getDescription();
        observer.EquipmentObserver equipmentObserver16 = null;
        equipment9.detach(equipmentObserver16);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3836");
        model.Equipment equipment3 = new model.Equipment("User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime4, localDateTime5, "User{userId=fa61117b-9132-4369-ae59-9ea1b2194f53, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment3.setDescription("User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3837");
        model.Equipment equipment3 = new model.Equipment("Researcher", "", "Faculty");
        equipment3.setStatus("User{userId=a4451b1b-e46a-429d-9817-c60e09fa7603, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3838");
        model.LabManager labManager3 = new model.LabManager("User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=914e92f3-0c4e-4e0c-9602-ebb48fa78d3e, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        labManager3.setPasswordHash("User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.HeadLabCoordinator headLabCoordinator9 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager11 = headLabCoordinator9.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment15 = new model.Equipment("", "", "");
        labManager11.markMaintenance(equipment15);
        java.lang.String str17 = equipment15.getStatus();
        labManager3.addEquipment(equipment15);
        java.lang.String str19 = equipment15.toString();
        java.lang.Class<?> wildcardClass20 = equipment15.getClass();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}" + "'", str19, "Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3839");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        java.lang.String str13 = equipment3.getDescription();
        equipment3.enable();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        model.Reservation reservation18 = null;
        boolean boolean19 = equipment3.isModifyAvailable(localDateTime15, localDateTime16, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='User{userId=1273d237-f892-420a-a147-38f9a7aa52db, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}'}", reservation18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3840");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.Researcher researcher7 = new model.Researcher("", "hi!", "hi!");
        researcher7.setEmail("hi!");
        double double10 = researcher7.getHourlyRate();
        java.util.UUID uUID11 = researcher7.getUserId();
        headLabCoordinator3.setUserId(uUID11);
        headLabCoordinator3.setPasswordHash("");
        model.Equipment equipment18 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment18.isModifyAvailable(localDateTime19, localDateTime20, "Faculty", reservation22);
        equipment18.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment18.isModifyAvailable(localDateTime26, localDateTime27, "", reservation29);
        java.lang.String str31 = equipment18.getLabLocation();
        java.lang.String str32 = equipment18.getStatus();
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment18.attach(equipmentObserver33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        strategy.PricingStrategy pricingStrategy37 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation38 = new model.Reservation((model.User) headLabCoordinator3, equipment18, localDateTime35, localDateTime36, pricingStrategy37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "61) test3840(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "521597c2-fe1e-4943-bb40-e0f98af508b8");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Faculty" + "'", str31, "Faculty");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Available" + "'", str32, "Available");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3841");
        model.LabManager labManager3 = new model.LabManager("User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=546876a4-7e79-4432-9683-a4cee9cd7816, email='Available', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b3ceae01-7298-4a33-805f-c88d3bec796d, email='Faculty', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='LabManager'}");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3842");
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
        java.lang.String str23 = labManager8.getRole();
        labManager8.setIdOrCertNumber("User{userId=9bbc74b2-f7ec-401d-92df-d7f8f8c59707, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment29 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str30 = equipment29.getLabLocation();
        observer.EquipmentObserver equipmentObserver31 = null;
        equipment29.detach(equipmentObserver31);
        java.lang.String str33 = equipment29.getDescription();
        labManager8.setEquipmentStatus(equipment29, "User{userId=69b5844d-4ce1-4591-b2c2-64e19c73e512, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.HeadLabCoordinator headLabCoordinator39 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "HeadLabCoordinator", "LabManager");
        double double40 = headLabCoordinator39.getHourlyRate();
        model.LabManager labManager42 = headLabCoordinator39.autoGenerateManagerAccount("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        java.util.UUID uUID43 = headLabCoordinator39.getUserId();
        labManager8.setUserId(uUID43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LabManager" + "'", str23, "LabManager");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ACTIVE" + "'", str33, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(uUID43);
// flaky "62) test3842(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID43.toString(), "15adbbf8-10b0-4500-bf96-29f2fd783598");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3843");
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
        model.Equipment equipment24 = new model.Equipment("", "", "");
        java.lang.String str25 = equipment24.getDescription();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        model.Reservation reservation29 = null;
        boolean boolean30 = equipment24.isModifyAvailable(localDateTime26, localDateTime27, "hi!", reservation29);
        java.lang.String str31 = equipment24.getEquipmentId();
        equipment24.setStatus("");
        java.lang.String str34 = equipment24.getEquipmentId();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean38 = equipment24.isAvailable(localDateTime35, localDateTime36, "Researcher");
        equipment24.markMaintenance();
        equipment24.enable();
        observer.EquipmentObserver equipmentObserver41 = null;
        equipment24.detach(equipmentObserver41);
        model.HeadLabCoordinator headLabCoordinator46 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager48 = headLabCoordinator46.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID49 = null;
        headLabCoordinator46.setUserId(uUID49);
        model.LabManager labManager52 = headLabCoordinator46.autoGenerateManagerAccount("ACTIVE");
        model.Equipment equipment56 = new model.Equipment("", "", "");
        equipment56.enable();
        labManager52.addEquipment(equipment56);
        model.Equipment equipment62 = new model.Equipment("", "", "");
        java.lang.String str63 = equipment62.getDescription();
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        model.Reservation reservation67 = null;
        boolean boolean68 = equipment62.isModifyAvailable(localDateTime64, localDateTime65, "hi!", reservation67);
        java.lang.String str69 = equipment62.getDescription();
        state.EquipmentState equipmentState70 = equipment62.getCurrentState();
        equipment62.setLabLocation("Student");
        labManager52.setEquipmentStatus(equipment62, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment78 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        model.Reservation reservation82 = null;
        boolean boolean83 = equipment78.isModifyAvailable(localDateTime79, localDateTime80, "Faculty", reservation82);
        equipment78.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime86 = null;
        java.time.LocalDateTime localDateTime87 = null;
        model.Reservation reservation89 = null;
        boolean boolean90 = equipment78.isModifyAvailable(localDateTime86, localDateTime87, "", reservation89);
        equipment78.disable();
        labManager52.addEquipment(equipment78);
        equipment78.markMaintenance();
        equipment78.enable();
        state.EquipmentState equipmentState95 = equipment78.getCurrentState();
        equipment24.setState(equipmentState95);
        equipment3.setState(equipmentState95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(equipmentState19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(equipmentState70);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(equipmentState95);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3844");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        observer.EquipmentObserver equipmentObserver7 = null;
        equipment3.detach(equipmentObserver7);
        java.lang.String str9 = equipment3.getStatus();
        java.lang.String str10 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Available" + "'", str9, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3845");
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
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment35.attach(equipmentObserver50);
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
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3846");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.util.UUID uUID7 = headLabCoordinator3.getUserId();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=253df967-5cae-4bac-bf03-c7bf463b68f4, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Student'}");
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fbcebe85-4541-4c6e-9d1d-0cba96651fd5, email='User{userId=e499543d-2750-4426-8eb9-3e2cc9a74f75, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Guest'}");
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
        model.Equipment equipment40 = new model.Equipment("", "", "");
        java.lang.String str41 = equipment40.getDescription();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        model.Reservation reservation45 = null;
        boolean boolean46 = equipment40.isModifyAvailable(localDateTime42, localDateTime43, "hi!", reservation45);
        labManager18.setEquipmentStatus(equipment40, "Guest");
        java.lang.String str49 = equipment40.getLabLocation();
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment40.attach(equipmentObserver50);
        java.lang.String str52 = equipment40.toString();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        boolean boolean56 = equipment40.isAvailable(localDateTime53, localDateTime54, "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver57 = null;
        equipment40.attach(equipmentObserver57);
        labManager12.addEquipment(equipment40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(uUID7);
// flaky "63) test3846(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID7.toString(), "6510f810-c755-4ca7-b7dc-1dce6fa1cf0d");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Guest'}" + "'", str52, "Equipment{equipmentId='', description='', labLocation='', status='Guest'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3847");
        model.Equipment equipment3 = new model.Equipment("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=a801c471-dfa3-47d8-9891-872b3c45811f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=c7633b26-cae4-41d4-a260-dce570973a81, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        equipment3.setDescription("");
        equipment3.setDescription("User{userId=c3bb06bf-a390-4727-b549-5375005c6f5d, email='hi!', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', role='Guest'}");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3848");
        model.Student student3 = new model.Student("Disabled", "User{userId=b7db317e-f6d4-4972-9a6f-b568cb8aa0ee, email='User{userId=a8240fb7-c1a5-400a-8faf-2d95ba865834, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=d5c42673-ac95-4cf6-803f-47e31ba78422, email='Temp123!', status='ACTIVE', idOrCertNumber='User{userId=a10776b7-2e49-450d-b57f-90551a239ab5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3849");
        model.Faculty faculty3 = new model.Faculty("Maintenance", "INACTIVE", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getIdOrCertNumber();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = faculty3.getRole();
        java.lang.String str11 = faculty3.getRole();
        faculty3.setActive(false);
        java.lang.String str14 = faculty3.getRole();
        java.lang.String str15 = faculty3.getRole();
        java.lang.String str16 = faculty3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3850");
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
        equipment3.attach(equipmentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
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
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3851");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation8);
        equipment3.setDescription("ACTIVE");
        java.lang.String str12 = equipment3.getLabLocation();
        java.lang.String str13 = equipment3.getStatus();
        equipment3.enable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Available" + "'", str13, "Available");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3852");
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
        equipment14.setStatus("User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment14.setDescription("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3853");
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
        equipment22.disable();
        equipment22.setDescription("User{userId=3666e607-b0ad-4aa5-82b7-53ea22bfdfde, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3854");
        model.Equipment equipment3 = new model.Equipment("User{userId=2ee9a1f0-700a-44b2-992e-8a2357bb9332, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=4b0e88d9-9837-449a-b0e9-366a37c9a9ce, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.detach(equipmentObserver4);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3855");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID4 = headLabCoordinator3.getUserId();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getStatus();
        headLabCoordinator3.setIdOrCertNumber("User{userId=bd34c217-a497-4709-b021-568fc8ef573b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(uUID4);
// flaky "64) test3855(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "b58c51e3-a18b-44ce-b277-68f3e23257f3");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3856");
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
        model.HeadLabCoordinator headLabCoordinator19 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager21 = headLabCoordinator19.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment25 = new model.Equipment("", "", "");
        labManager21.markMaintenance(equipment25);
        java.lang.String str27 = equipment25.getStatus();
        java.lang.String str28 = equipment25.getStatus();
        state.EquipmentState equipmentState29 = equipment25.getCurrentState();
        equipment3.setState(equipmentState29);
        java.lang.String str31 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Maintenance" + "'", str27, "Maintenance");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Maintenance" + "'", str28, "Maintenance");
        org.junit.Assert.assertNotNull(equipmentState29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3857");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.disable();
        java.lang.String str6 = equipment3.getDescription();
        state.EquipmentState equipmentState7 = equipment3.getCurrentState();
        java.lang.String str8 = equipment3.getLabLocation();
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(equipmentState7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3858");
        model.Student student3 = new model.Student("LabManager", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Researcher");
        java.lang.String str4 = student3.getStatus();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3859");
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
        java.lang.String str30 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LabManager" + "'", str30, "LabManager");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3860");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        double double6 = researcher3.getHourlyRate();
        researcher3.setPasswordHash("Available");
        java.lang.String str9 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3861");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        model.LabManager labManager7 = headLabCoordinator3.autoGenerateManagerAccount("Available");
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.toString();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        boolean boolean13 = labManager12.isActive();
        labManager12.setActive(false);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
// flaky "65) test3861(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User{userId=db997688-0c5f-48ea-9189-0e24fa76c3b1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str9, "User{userId=db997688-0c5f-48ea-9189-0e24fa76c3b1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3862");
        model.Faculty faculty3 = new model.Faculty("Guest", "hi!", "Faculty");
        java.lang.String str4 = faculty3.getRole();
        double double5 = faculty3.getHourlyRate();
        faculty3.setActive(false);
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3863");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getPasswordHash();
        double double8 = headLabCoordinator3.getHourlyRate();
        java.lang.String str9 = headLabCoordinator3.getEmail();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3864");
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
        java.lang.String str25 = equipment9.toString();
        equipment9.setStatus("User{userId=33a275c4-fea2-422a-b5f6-9453e52337da, email='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='', status='Available'}', role='Faculty'}");
        equipment9.disable();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment9.isModifyAvailable(localDateTime29, localDateTime30, "HeadLabCoordinator", reservation32);
        java.lang.String str34 = equipment9.getEquipmentId();
        equipment9.markMaintenance();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str25, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3865");
        model.Guest guest3 = new model.Guest("User{userId=71fd9a8d-a737-4a52-9dc2-83c0b54bb559, email='Maintenance', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=4d0a85d8-97dd-4f15-9b14-6b8414f28684, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3866");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        model.SensorUpdate sensorUpdate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3867");
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
        java.lang.String str92 = equipment3.getEquipmentId();
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3868");
        model.Equipment equipment3 = new model.Equipment("User{userId=08f86549-1876-4719-81f7-5cdb920a7157, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}", "User{userId=5a92bc85-85e8-42a0-9a4f-e5802bdd352c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=45055d07-d544-45b1-bff7-7868ab9c80d1, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3869");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getDescription();
        java.lang.String str12 = equipment3.getEquipmentId();
        equipment3.notifyObservers();
        equipment3.setStatus("User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str16 = equipment3.toString();
        java.lang.String str17 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        model.Reservation reservation21 = null;
        boolean boolean22 = equipment3.isModifyAvailable(localDateTime18, localDateTime19, "User{userId=2f20837d-f377-4e6b-89f7-de5eb65667a8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='Faculty', status='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3870");
        model.Student student3 = new model.Student("User{userId=24edff4a-2e54-429e-801f-950d1af3a3e6, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', description='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', labLocation='ACTIVE', status='Maintenance'}");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3871");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        double double8 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str11 = labManager10.getRole();
        model.Equipment equipment15 = new model.Equipment("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LM-CERT", "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment15.enable();
        labManager10.markMaintenance(equipment15);
        model.Equipment equipment21 = new model.Equipment("", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str22 = equipment21.getLabLocation();
        state.EquipmentState equipmentState23 = equipment21.getCurrentState();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        model.Reservation reservation27 = null;
        boolean boolean28 = equipment21.isModifyAvailable(localDateTime24, localDateTime25, "User{userId=c09fe579-c4b3-4fed-af83-f93c29459a65, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", reservation27);
        labManager10.setEquipmentStatus(equipment21, "User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str22, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(equipmentState23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3872");
        model.Equipment equipment3 = new model.Equipment("User{userId=4f9a032c-739b-4de5-83d1-374717cd8209, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=b1053deb-db74-4746-9718-f53e15bb0244, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', role='HeadLabCoordinator'}", "Equipment{equipmentId='ACTIVE', description='User{userId=5cc61ef3-84d2-47f1-9435-a6cdfea0fe52, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}", "User{userId=7906f152-35a8-4772-ba62-f61b510994d3, email='', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3873");
        model.Guest guest3 = new model.Guest("User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", "User{userId=c86fe375-da14-4045-9174-2ae65cb6ee03, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "INACTIVE");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3874");
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
        equipment28.disable();
        java.lang.String str73 = equipment28.getDescription();
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
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3875");
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
        java.lang.String str54 = labManager3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str47, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "LabManager" + "'", str54, "LabManager");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3876");
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
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean39 = equipment19.isAvailable(localDateTime36, localDateTime37, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3877");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("INACTIVE");
        labManager13.setEmail("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str16 = labManager13.getEmail();
        model.Equipment equipment20 = new model.Equipment("", "", "");
        equipment20.enable();
        equipment20.enable();
        java.lang.String str23 = equipment20.getStatus();
        equipment20.markMaintenance();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        model.Reservation reservation28 = null;
        boolean boolean29 = equipment20.isModifyAvailable(localDateTime25, localDateTime26, "User{userId=db42fda7-24ea-4df4-ad49-d2be5b8b8dc3, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation28);
        java.lang.String str30 = equipment20.getEquipmentId();
        labManager13.setEquipmentStatus(equipment20, "User{userId=81bfd33e-4865-4cad-aa37-aa078c491ba8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        labManager13.setPasswordHash("User{userId=ee55f42b-52db-43a6-9d24-32867c8424a0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str16, "User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Available" + "'", str23, "Available");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3878");
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
        headLabCoordinator3.setIdOrCertNumber("User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HeadLabCoordinator" + "'", str13, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HeadLabCoordinator" + "'", str14, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3879");
        model.Equipment equipment3 = new model.Equipment("User{userId=0e00c327-b075-4511-b783-e7f4e1733caa, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=2354adf4-dcbe-4e04-8d08-db4cdb8b3c51, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        observer.EquipmentObserver equipmentObserver4 = null;
        equipment3.attach(equipmentObserver4);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3880");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", reservation19);
        equipment3.notifyObservers();
        java.lang.String str22 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        model.Reservation reservation26 = null;
        boolean boolean27 = equipment3.isModifyAvailable(localDateTime23, localDateTime24, "User{userId=e0766997-6cee-4192-b890-593ae2017fcd, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation26);
        observer.EquipmentObserver equipmentObserver28 = null;
        equipment3.detach(equipmentObserver28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3881");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getRole();
        model.LabManager labManager10 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=302dc424-9f43-4191-8227-37be014081fd, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Equipment equipment14 = new model.Equipment("", "", "");
        java.lang.String str15 = equipment14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment14.isModifyAvailable(localDateTime16, localDateTime17, "hi!", reservation19);
        equipment14.disable();
        equipment14.enable();
        java.lang.String str23 = equipment14.getLabLocation();
        model.Equipment equipment27 = new model.Equipment("", "", "");
        java.lang.String str28 = equipment27.getDescription();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        model.Reservation reservation32 = null;
        boolean boolean33 = equipment27.isModifyAvailable(localDateTime29, localDateTime30, "hi!", reservation32);
        equipment27.disable();
        java.lang.String str35 = equipment27.getEquipmentId();
        equipment27.setDescription("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean41 = equipment27.isAvailable(localDateTime38, localDateTime39, "User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        state.EquipmentState equipmentState42 = equipment27.getCurrentState();
        equipment14.setState(equipmentState42);
        labManager10.addEquipment(equipment14);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean48 = equipment14.isAvailable(localDateTime45, localDateTime46, "User{userId=45a14a13-3386-4421-b0e2-7c228d49e311, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(equipmentState42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3882");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setEmail("hi!");
        java.lang.String str6 = researcher3.getRole();
        java.lang.String str7 = researcher3.getIdOrCertNumber();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getRole();
        researcher3.setActive(true);
        java.lang.String str12 = researcher3.getStatus();
        double double13 = researcher3.getHourlyRate();
        java.lang.String str14 = researcher3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ACTIVE" + "'", str12, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ACTIVE" + "'", str14, "ACTIVE");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3883");
        model.Faculty faculty3 = new model.Faculty("User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}", "User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3884");
        model.Guest guest3 = new model.Guest("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}", "", "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getIdOrCertNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str4, "User{userId=fb9af9c0-3e2e-4587-84ba-e7e7c86634f8, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3885");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = labManager8.getIdOrCertNumber();
        java.lang.String str10 = labManager8.getPasswordHash();
        labManager8.setPasswordHash("User{userId=8a26296e-07d5-4861-b6c5-836d02f65c75, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LM-CERT" + "'", str9, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temp123!" + "'", str10, "Temp123!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3886");
        model.Researcher researcher3 = new model.Researcher("User{userId=5ac0dbf5-80d7-4a2f-aaa8-d493ec816d7e, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3887");
        model.Guest guest3 = new model.Guest("Guest", "Available", "Student");
        java.lang.String str4 = guest3.getRole();
        java.lang.String str5 = guest3.getRole();
        java.lang.String str6 = guest3.getRole();
        java.lang.String str7 = guest3.getRole();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getRole();
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3888");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        java.lang.String str5 = headLabCoordinator3.getEmail();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.getRole();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.lang.String str10 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("User{userId=aeae83d9-c711-40eb-a8e1-73fac6dd528c, email='Faculty', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        headLabCoordinator3.setIdOrCertNumber("User{userId=b3f0e903-0635-4e84-9a2d-37f42777420d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3889");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getRole();
        java.lang.String str9 = headLabCoordinator3.getEmail();
        java.lang.String str10 = headLabCoordinator3.getRole();
        model.LabManager labManager12 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=d4267ddc-976e-41d1-8f6f-982ff02dda3c, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        model.LabManager labManager14 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='Student', status='Available'}");
        java.lang.String str15 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HeadLabCoordinator" + "'", str8, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3890");
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
        double double81 = labManager3.getHourlyRate();
// flaky "66) test3890(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=d5c9e1dc-2c7a-47b7-8cab-a9b41c966096, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=d5c9e1dc-2c7a-47b7-8cab-a9b41c966096, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
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
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3891");
        model.Guest guest3 = new model.Guest("HeadLabCoordinator", "", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = guest3.getStatus();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3892");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.toString();
        double double6 = faculty3.getHourlyRate();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        model.Guest guest15 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double16 = guest15.getHourlyRate();
        java.lang.String str17 = guest15.getRole();
        guest15.setActive(false);
        java.lang.String str20 = guest15.getRole();
        double double21 = guest15.getHourlyRate();
        java.lang.String str22 = guest15.toString();
        model.Faculty faculty26 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str27 = faculty26.getRole();
        faculty26.setEmail("hi!");
        boolean boolean30 = faculty26.isActive();
        java.util.UUID uUID31 = faculty26.getUserId();
        guest15.setUserId(uUID31);
        faculty3.setUserId(uUID31);
        org.junit.Assert.assertNotNull(uUID4);
// flaky "67) test3892(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "3afa27ba-ae22-4ac3-8806-eb80d76b1ab2");
// flaky "17) test3892(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User{userId=3afa27ba-ae22-4ac3-8806-eb80d76b1ab2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str5, "User{userId=3afa27ba-ae22-4ac3-8806-eb80d76b1ab2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 25.0d + "'", double16 == 25.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 25.0d + "'", double21 == 25.0d);
// flaky "4) test3892(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User{userId=01023023-f0c9-4518-ab6d-d7276c6a56a0, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}" + "'", str22, "User{userId=01023023-f0c9-4518-ab6d-d7276c6a56a0, email='Available', status='INACTIVE', idOrCertNumber='Guest', role='Guest'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(uUID31);
// flaky "3) test3892(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID31.toString(), "b6d36c2c-7cf1-48b9-9ae0-b209251e0b8f");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3893");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = labManager8.getRole();
        boolean boolean10 = labManager8.isActive();
        model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            labManager8.addEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3894");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getStatus();
        faculty3.setIdOrCertNumber("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.Faculty faculty10 = new model.Faculty("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Maintenance", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        model.Guest guest14 = new model.Guest("", "hi!", "hi!");
        java.lang.String str15 = guest14.getRole();
        double double16 = guest14.getHourlyRate();
        double double17 = guest14.getHourlyRate();
        java.lang.String str18 = guest14.getRole();
        java.lang.String str19 = guest14.getEmail();
        model.HeadLabCoordinator headLabCoordinator23 = new model.HeadLabCoordinator("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=86784948-c2c7-42e2-b19c-f62984b0444f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}");
        java.util.UUID uUID24 = headLabCoordinator23.getUserId();
        guest14.setUserId(uUID24);
        faculty10.setUserId(uUID24);
        faculty3.setUserId(uUID24);
        faculty3.setIdOrCertNumber("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 25.0d + "'", double16 == 25.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 25.0d + "'", double17 == 25.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(uUID24);
// flaky "68) test3894(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID24.toString(), "bc4eceab-9da7-4a91-9848-f4abe887bde0");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3895");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setEmail("hi!");
        boolean boolean7 = faculty3.isActive();
        faculty3.setPasswordHash("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str10 = faculty3.getRole();
        double double11 = faculty3.getHourlyRate();
        model.Researcher researcher15 = new model.Researcher("", "hi!", "hi!");
        researcher15.setIdOrCertNumber("Guest");
        java.lang.String str18 = researcher15.getRole();
        researcher15.setActive(true);
        java.lang.String str21 = researcher15.getEmail();
        model.Faculty faculty25 = new model.Faculty("hi!", "", "hi!");
        java.util.UUID uUID26 = faculty25.getUserId();
        java.lang.String str27 = faculty25.toString();
        java.lang.String str28 = faculty25.getRole();
        java.util.UUID uUID29 = faculty25.getUserId();
        java.lang.String str30 = faculty25.getEmail();
        model.HeadLabCoordinator headLabCoordinator34 = new model.HeadLabCoordinator("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "LabManager");
        java.util.UUID uUID35 = headLabCoordinator34.getUserId();
        faculty25.setUserId(uUID35);
        researcher15.setUserId(uUID35);
        faculty3.setUserId(uUID35);
        faculty3.setEmail("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.util.UUID uUID41 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(uUID26);
// flaky "69) test3895(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID26.toString(), "632d47ed-f2ef-4350-9fb8-e586acf3669c");
// flaky "18) test3895(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User{userId=632d47ed-f2ef-4350-9fb8-e586acf3669c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str27, "User{userId=632d47ed-f2ef-4350-9fb8-e586acf3669c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
        org.junit.Assert.assertNotNull(uUID29);
// flaky "5) test3895(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID29.toString(), "632d47ed-f2ef-4350-9fb8-e586acf3669c");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(uUID35);
// flaky "4) test3895(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID35.toString(), "7b8e2a53-988b-4524-a6b6-0170c82acc4e");
        org.junit.Assert.assertNotNull(uUID41);
// flaky "1) test3895(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID41.toString(), "7b8e2a53-988b-4524-a6b6-0170c82acc4e");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3896");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        headLabCoordinator3.setActive(true);
        double double6 = headLabCoordinator3.getHourlyRate();
        java.lang.String str7 = headLabCoordinator3.getPasswordHash();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e93f1d07-4ca1-4083-b3e1-14fe6f4a368c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3897");
        model.Guest guest3 = new model.Guest("User{userId=aaadf63f-9439-4f6c-a988-bda2dd3ec6d5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=af1e839c-2fad-40e3-8a3b-6e3c9c6fe042, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}", "User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3898");
        model.Guest guest3 = new model.Guest("User{userId=ec1cdb05-c503-42d6-9c44-e6a5310e091e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=33eb423f-c992-4951-b5df-864c0da4750e, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='Guest', role='Student'}");
        double double4 = guest3.getHourlyRate();
        guest3.setPasswordHash("User{userId=7cd6aa2f-88ba-4a33-8e98-0bd97f07a228, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3899");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.getIdOrCertNumber();
        model.LabManager labManager8 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=8c76c79c-205c-4126-b048-b904b7ec0f17, email='User{userId=b5bb89c0-8a41-46d6-adc8-9ae272a2ca77, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=5b6c98d4-495a-498d-a17b-7b858a977a8c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3900");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        model.Reservation reservation7 = null;
        boolean boolean8 = equipment3.isModifyAvailable(localDateTime4, localDateTime5, "Faculty", reservation7);
        equipment3.setLabLocation("Faculty");
        java.lang.String str11 = equipment3.getStatus();
        java.lang.String str12 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.detach(equipmentObserver13);
        equipment3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Available" + "'", str11, "Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3901");
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
        equipment17.setStatus("User{userId=cde5dc65-36e3-44cc-8321-664f5482bc02, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager10);
// flaky "70) test3901(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User{userId=c9f1e56d-43ae-4a84-94d9-912ed9ad0a3f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str11, "User{userId=c9f1e56d-43ae-4a84-94d9-912ed9ad0a3f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(equipmentState33);
        org.junit.Assert.assertNotNull(equipmentState35);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3902");
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
        double double41 = labManager21.getHourlyRate();
        model.Equipment equipment45 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment45.isModifyAvailable(localDateTime46, localDateTime47, "Faculty", reservation49);
        equipment45.setLabLocation("Faculty");
        java.lang.String str53 = equipment45.getDescription();
        java.lang.String str54 = equipment45.getEquipmentId();
        equipment45.notifyObservers();
        equipment45.setDescription("User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        equipment45.setStatus("User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str60 = equipment45.getDescription();
        observer.EquipmentObserver equipmentObserver61 = null;
        equipment45.detach(equipmentObserver61);
        labManager21.addEquipment(equipment45);
        model.Equipment equipment67 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        model.Reservation reservation71 = null;
        boolean boolean72 = equipment67.isModifyAvailable(localDateTime68, localDateTime69, "Faculty", reservation71);
        equipment67.setLabLocation("Faculty");
        java.lang.String str75 = equipment67.getDescription();
        java.lang.String str76 = equipment67.getEquipmentId();
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment67.isModifyAvailable(localDateTime77, localDateTime78, "INACTIVE", reservation80);
        state.EquipmentState equipmentState82 = equipment67.getCurrentState();
        equipment45.setState(equipmentState82);
        equipment3.setState(equipmentState82);
        state.EquipmentState equipmentState85 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str60, "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(equipmentState82);
        org.junit.Assert.assertNotNull(equipmentState85);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3903");
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
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean31 = equipment3.isAvailable(localDateTime28, localDateTime29, "Faculty");
        model.Equipment equipment35 = new model.Equipment("", "", "");
        java.lang.String str36 = equipment35.getDescription();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        model.Reservation reservation40 = null;
        boolean boolean41 = equipment35.isModifyAvailable(localDateTime37, localDateTime38, "hi!", reservation40);
        java.lang.String str42 = equipment35.getEquipmentId();
        equipment35.setStatus("");
        java.lang.String str45 = equipment35.getEquipmentId();
        java.lang.String str46 = equipment35.getEquipmentId();
        observer.EquipmentObserver equipmentObserver47 = null;
        equipment35.detach(equipmentObserver47);
        java.lang.String str49 = equipment35.getLabLocation();
        model.HeadLabCoordinator headLabCoordinator53 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager55 = headLabCoordinator53.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment59 = new model.Equipment("", "", "");
        labManager55.addEquipment(equipment59);
        equipment59.setLabLocation("hi!");
        equipment59.setDescription("Researcher");
        state.EquipmentState equipmentState65 = equipment59.getCurrentState();
        state.EquipmentState equipmentState66 = equipment59.getCurrentState();
        equipment35.setState(equipmentState66);
        model.LabManager labManager71 = new model.LabManager("", "ACTIVE", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager71.setPasswordHash("LabManager");
        model.HeadLabCoordinator headLabCoordinator77 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager79 = headLabCoordinator77.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment83 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        model.Reservation reservation87 = null;
        boolean boolean88 = equipment83.isModifyAvailable(localDateTime84, localDateTime85, "Faculty", reservation87);
        equipment83.setLabLocation("Faculty");
        labManager79.setEquipmentStatus(equipment83, "");
        equipment83.notifyObservers();
        labManager71.addEquipment(equipment83);
        state.EquipmentState equipmentState95 = equipment83.getCurrentState();
        equipment35.setState(equipmentState95);
        equipment3.setState(equipmentState95);
        java.lang.String str98 = equipment3.toString();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertNotNull(equipmentState65);
        org.junit.Assert.assertNotNull(equipmentState66);
        org.junit.Assert.assertNotNull(labManager79);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(equipmentState95);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str98, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3904");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        double double10 = guest3.getHourlyRate();
        double double11 = guest3.getHourlyRate();
        double double12 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3905");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=b8363d37-f1e7-4f5b-9d38-c609df23795f, email='User{userId=7886861f-05f4-40d8-a171-9743a56ebca9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}', role='HeadLabCoordinator'}");
        labManager5.setEmail("User{userId=307c1565-1f9b-4e77-84b3-a5ca3b65e0cd, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3906");
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
        equipment11.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Available" + "'", str30, "Available");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3907");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Available");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getPasswordHash();
        java.lang.String str7 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str6, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3908");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        java.lang.String str4 = faculty3.getRole();
        faculty3.setIdOrCertNumber("");
        java.lang.String str7 = faculty3.getIdOrCertNumber();
        java.lang.String str8 = faculty3.getRole();
        boolean boolean9 = faculty3.isActive();
        java.lang.String str10 = faculty3.getRole();
        java.lang.String str11 = faculty3.getRole();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3909");
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
        java.lang.String str23 = student3.getRole();
        java.util.UUID uUID24 = student3.getUserId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 25.0d + "'", double14 == 25.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(uUID20);
// flaky "71) test3909(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID20.toString(), "266b71b2-5b51-4edb-8f10-7d02b84fda86");
        org.junit.Assert.assertNotNull(uUID22);
// flaky "19) test3909(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID22.toString(), "266b71b2-5b51-4edb-8f10-7d02b84fda86");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertNotNull(uUID24);
// flaky "6) test3909(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID24.toString(), "266b71b2-5b51-4edb-8f10-7d02b84fda86");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3910");
        model.Researcher researcher3 = new model.Researcher("Faculty", "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Student");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3911");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        model.LabManager labManager13 = headLabCoordinator3.autoGenerateManagerAccount("Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager19.setActive(true);
        java.lang.String str22 = labManager19.getStatus();
        model.Equipment equipment26 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment26.isModifyAvailable(localDateTime27, localDateTime28, "Faculty", reservation30);
        equipment26.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        model.Reservation reservation37 = null;
        boolean boolean38 = equipment26.isModifyAvailable(localDateTime34, localDateTime35, "", reservation37);
        labManager19.markMaintenance(equipment26);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        model.Reservation reservation43 = null;
        boolean boolean44 = equipment26.isModifyAvailable(localDateTime40, localDateTime41, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation43);
        labManager13.markMaintenance(equipment26);
        java.lang.Class<?> wildcardClass46 = equipment26.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ACTIVE" + "'", str22, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3912");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Maintenance'}", "Disabled", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        double double5 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setIdOrCertNumber("Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3913");
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
        model.SensorUpdate sensorUpdate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment9.applySensorUpdate(sensorUpdate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3914");
        model.Guest guest3 = new model.Guest("HeadLabCoordinator", "", "User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = guest3.getStatus();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3915");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        java.lang.String str7 = student3.getRole();
        java.lang.String str8 = student3.getIdOrCertNumber();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3916");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=bf99a2d9-18fd-46ad-b300-c36dcb36145f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = headLabCoordinator3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3917");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "Student", reservation8);
        java.lang.String str10 = equipment3.getLabLocation();
        java.lang.String str11 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}" + "'", str11, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='', status='Available'}");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3918");
        model.Student student3 = new model.Student("User{userId=5edfd4cf-e8e1-4a5c-95db-29c5e3314281, email='hi!', status='ACTIVE', idOrCertNumber='Student', role='Faculty'}", "User{userId=d02ca210-7db7-4e93-af97-546c750d9e24, email='User{userId=e1c375e2-3fde-465c-b109-a426fe8bf10c, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "User{userId=76fe632a-716b-42d9-9e0f-eac433a9f5c0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str4 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACTIVE" + "'", str4, "ACTIVE");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3919");
        model.Faculty faculty3 = new model.Faculty("User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", "User{userId=1813ddce-6094-44d0-956b-8dce405df839, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        java.util.UUID uUID4 = faculty3.getUserId();
        java.lang.String str5 = faculty3.getRole();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertNotNull(uUID4);
// flaky "72) test3919(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID4.toString(), "2b204d67-5090-4c1c-a6c5-fd9e86ce81b8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3920");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        model.Reservation reservation19 = null;
        boolean boolean20 = equipment3.isModifyAvailable(localDateTime16, localDateTime17, "User{userId=13827f75-0e22-4a15-9249-21eeb49387dc, email='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='ACTIVE', idOrCertNumber='User{userId=5b525dc3-79fc-4782-8c2a-a74b4ab6d590, email='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='Faculty', role='Guest'}', role='HeadLabCoordinator'}", reservation19);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean24 = equipment3.isAvailable(localDateTime21, localDateTime22, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3921");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        java.lang.String str4 = headLabCoordinator3.getRole();
        headLabCoordinator3.setEmail("Researcher");
        java.lang.String str7 = headLabCoordinator3.getStatus();
        java.lang.String str8 = headLabCoordinator3.getStatus();
        double double9 = headLabCoordinator3.getHourlyRate();
        java.util.UUID uUID10 = headLabCoordinator3.getUserId();
        double double11 = headLabCoordinator3.getHourlyRate();
        double double12 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HeadLabCoordinator" + "'", str4, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ACTIVE" + "'", str7, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(uUID10);
// flaky "73) test3921(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID10.toString(), "baf335d8-5fdd-43b0-95a1-cf8341677e07");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3922");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("HeadLabCoordinator");
        labManager5.setActive(true);
        labManager5.setEmail("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str10 = labManager5.getIdOrCertNumber();
        double double11 = labManager5.getHourlyRate();
        double double12 = labManager5.getHourlyRate();
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
        observer.EquipmentObserver equipmentObserver86 = null;
        equipment78.attach(equipmentObserver86);
        labManager5.setEquipmentStatus(equipment78, "User{userId=2deeabe3-17c9-4ea7-9d48-68488e07eba7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str90 = labManager5.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LM-CERT" + "'", str10, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HeadLabCoordinator" + "'", str19, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager23);
// flaky "74) test3922(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User{userId=968a9ceb-0f5d-4a5c-9aa4-22c79190dbe4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str24, "User{userId=968a9ceb-0f5d-4a5c-9aa4-22c79190dbe4, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LM-CERT" + "'", str40, "LM-CERT");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "LabManager" + "'", str90, "LabManager");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3923");
        model.Equipment equipment3 = new model.Equipment("Equipment{equipmentId='', description='', labLocation='Faculty', status=''}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str4 = equipment3.getStatus();
        equipment3.markMaintenance();
        equipment3.notifyObservers();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean10 = equipment3.isAvailable(localDateTime7, localDateTime8, "User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3924");
        model.Researcher researcher3 = new model.Researcher("User{userId=f7dae43f-2d64-419a-88ba-777672e87122, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "", "User{userId=919a7522-0a21-44f7-b00c-ad49a3b33712, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3925");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Equipment{equipmentId='', description='', labLocation='', status='Maintenance'}", "hi!", "hi!");
        model.Guest guest7 = new model.Guest("", "hi!", "hi!");
        java.lang.String str8 = guest7.getRole();
        double double9 = guest7.getHourlyRate();
        java.lang.String str10 = guest7.getRole();
        java.util.UUID uUID11 = guest7.getUserId();
        headLabCoordinator3.setUserId(uUID11);
        double double13 = headLabCoordinator3.getHourlyRate();
        java.lang.String str14 = headLabCoordinator3.getIdOrCertNumber();
        double double15 = headLabCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "75) test3925(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "97bec5cd-a518-4f2d-9220-2392bb2ed77b");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3926");
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
        java.lang.String str27 = equipment15.toString();
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3927");
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
        labManager11.setPasswordHash("Equipment{equipmentId='Maintenance', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='User{userId=b863c97c-3ec8-4b45-8b0b-5268fd04a202, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HeadLabCoordinator" + "'", str18, "HeadLabCoordinator");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LabManager" + "'", str21, "LabManager");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3928");
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
        double double32 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ACTIVE" + "'", str28, "ACTIVE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LM-CERT" + "'", str31, "LM-CERT");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3929");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID6 = null;
        headLabCoordinator3.setUserId(uUID6);
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager11 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str12 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setPasswordHash("User{userId=7788a291-e66b-4dd2-ad62-256e4905cfb1, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str15 = headLabCoordinator3.getRole();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HeadLabCoordinator" + "'", str15, "HeadLabCoordinator");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3930");
        model.LabManager labManager3 = new model.LabManager("", "User{userId=a6cd648c-c622-4401-8e3b-22fb077d9dc2, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='Researcher'}", "User{userId=219b32d3-3293-45b0-8148-45ad9652476f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        labManager3.setEmail("User{userId=f4fab69b-8a77-49f7-a2d0-b113b941cfa8, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3931");
        model.LabManager labManager3 = new model.LabManager("User{userId=d320a5d5-a5fe-476a-bdb9-2b444e73d467, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=c36699f9-7919-415f-8097-b53942c6deee, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=bf8779ff-0d4f-4ba9-af7c-8d600832a885, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3932");
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
        equipment35.markMaintenance();
        observer.EquipmentObserver equipmentObserver56 = null;
        equipment35.attach(equipmentObserver56);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3933");
        model.Guest guest3 = new model.Guest("User{userId=def8cb06-30af-45c1-a2c9-25ad4a62f79a, email='User{userId=c82d1152-da14-407d-a2c7-0cc0583063b1, email='Guest', status='ACTIVE', idOrCertNumber='Researcher', role='LabManager'}', status='ACTIVE', idOrCertNumber='User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='LabManager'}", "User{userId=3bf68180-a67f-4646-9781-d2d0963b2816, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=590b9276-4c31-40e5-a9a8-df62372c1b9a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='Available'}");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3934");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment3.isModifyAvailable(localDateTime19, localDateTime20, "User{userId=e2be33b2-c168-4c2c-8ed5-051d4054a45b, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", reservation22);
        java.lang.String str24 = equipment3.getDescription();
        java.lang.String str25 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3935");
        model.Equipment equipment3 = new model.Equipment("User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}", "LabManager", "Available");
        equipment3.setLabLocation("User{userId=3ffd3c8b-3ea9-4074-bf54-37771e8b3bfd, email='User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Student'}");
        java.lang.String str6 = equipment3.getDescription();
        equipment3.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LabManager" + "'", str6, "LabManager");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3936");
        model.Researcher researcher3 = new model.Researcher("Equipment{equipmentId='', description='', labLocation='User{userId=8f9f7d80-49d5-49cb-97cf-ca30b3548ca8, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='Available'}", "", "User{userId=64b09449-cf03-497a-a5f8-14f144ace098, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        researcher3.setActive(true);
        double double6 = researcher3.getHourlyRate();
        double double7 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3937");
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
        boolean boolean72 = labManager3.isActive();
        model.Equipment equipment76 = new model.Equipment("User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=66b5cbbc-ee06-4a17-b32e-9e0bcc5ec151, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        equipment76.setDescription("User{userId=ab4b1e2e-fa32-4571-b1b3-5cc5b537c62d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        labManager3.markMaintenance(equipment76);
        java.lang.String str80 = labManager3.getStatus();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(uUID11);
// flaky "76) test3937(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "f2db2799-d7c8-430e-b072-2d57203e8e33");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(labManager24);
// flaky "20) test3937(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str25, "User{userId=ad3b119e-20a9-433d-a72d-bd5cff358cc0, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(equipmentState66);
// flaky "7) test3937(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "User{userId=f2db2799-d7c8-430e-b072-2d57203e8e33, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}" + "'", str71, "User{userId=f2db2799-d7c8-430e-b072-2d57203e8e33, email='ACTIVE', status='ACTIVE', idOrCertNumber='LabManager', role='LabManager'}");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ACTIVE" + "'", str80, "ACTIVE");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3938");
        model.LabManager labManager3 = new model.LabManager("User{userId=1634b696-5a9a-4f9b-a8a6-32adc37a4078, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Available", "User{userId=07b2763e-3acf-4ef2-a912-ba9905d93cd1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3939");
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
        equipment33.notifyObservers();
        observer.EquipmentObserver equipmentObserver36 = null;
        equipment33.attach(equipmentObserver36);
        equipment33.setDescription("User{userId=6f20ea17-ead3-4281-b632-2bf33b4f2593, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str27, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3940");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        double double4 = headLabCoordinator3.getHourlyRate();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("ACTIVE");
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
        model.Equipment equipment30 = new model.Equipment("", "", "");
        equipment30.enable();
        equipment30.enable();
        java.lang.String str33 = equipment30.getStatus();
        equipment30.markMaintenance();
        equipment30.setStatus("User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str37 = equipment30.getDescription();
        java.lang.String str38 = equipment30.toString();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean42 = equipment30.isAvailable(localDateTime39, localDateTime40, "User{userId=77e8c0d8-634d-4f6a-aa16-6b165bf5df57, email='', status='INACTIVE', idOrCertNumber='hi!', role='Guest'}");
        labManager12.addEquipment(equipment30);
        java.lang.String str44 = equipment30.toString();
        labManager6.markMaintenance(equipment30);
        equipment30.markMaintenance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(uUID26);
// flaky "77) test3940(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID26.toString(), "e1ce3582-a19e-4999-8809-c6a3042abb97");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Available" + "'", str33, "Available");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str38, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}" + "'", str44, "Equipment{equipmentId='', description='', labLocation='', status='User{userId=233083e7-3231-4e25-9227-f345a3fb4269, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}'}");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3941");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        model.Reservation reservation22 = null;
        boolean boolean23 = equipment3.isModifyAvailable(localDateTime19, localDateTime20, "User{userId=0e11b41d-5ea8-4367-bd76-c1b622f10a9b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation22);
        java.lang.String str24 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str18, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3942");
        model.Equipment equipment3 = new model.Equipment("LM-CERT", "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Temp123!");
        equipment3.notifyObservers();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.attach(equipmentObserver5);
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment3.disable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.EquipmentObserver.update(model.Equipment)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str7, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3943");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getRole();
        model.Guest guest12 = new model.Guest("", "hi!", "hi!");
        double double13 = guest12.getHourlyRate();
        model.HeadLabCoordinator headLabCoordinator17 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager19 = headLabCoordinator17.autoGenerateManagerAccount("Faculty");
        java.util.UUID uUID20 = null;
        headLabCoordinator17.setUserId(uUID20);
        model.LabManager labManager23 = headLabCoordinator17.autoGenerateManagerAccount("ACTIVE");
        model.LabManager labManager25 = headLabCoordinator17.autoGenerateManagerAccount("Guest");
        java.util.UUID uUID26 = labManager25.getUserId();
        guest12.setUserId(uUID26);
        student3.setUserId(uUID26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 25.0d + "'", double13 == 25.0d);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNotNull(uUID26);
// flaky "78) test3943(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID26.toString(), "520edc8f-e98d-44c5-b869-93c6c504ec7b");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3944");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getPasswordHash();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3945");
        model.Student student3 = new model.Student("hi!", "Faculty", "hi!");
        java.lang.String str4 = student3.getRole();
        java.lang.String str5 = student3.getRole();
        java.lang.String str6 = student3.getRole();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isActive();
        java.lang.String str9 = student3.getRole();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ACTIVE" + "'", str11, "ACTIVE");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3946");
        model.Faculty faculty3 = new model.Faculty("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "Maintenance", "Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}");
        java.lang.String str4 = faculty3.getPasswordHash();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Maintenance" + "'", str4, "Maintenance");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3947");
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
        java.lang.String str18 = equipment3.getLabLocation();
        equipment3.setStatus("Equipment{equipmentId='', description='', labLocation='Faculty', status='Disabled'}");
        equipment3.disable();
        state.EquipmentState equipmentState22 = equipment3.getCurrentState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(equipmentState11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertNotNull(equipmentState22);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3948");
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
        model.HeadLabCoordinator headLabCoordinator25 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager27 = headLabCoordinator25.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment31 = new model.Equipment("", "", "");
        labManager27.markMaintenance(equipment31);
        java.lang.String str33 = labManager27.getRole();
        java.lang.String str34 = labManager27.getRole();
        model.HeadLabCoordinator headLabCoordinator38 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager40 = headLabCoordinator38.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment44 = new model.Equipment("", "", "");
        labManager40.markMaintenance(equipment44);
        double double46 = labManager40.getHourlyRate();
        java.lang.String str47 = labManager40.getRole();
        double double48 = labManager40.getHourlyRate();
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
        labManager40.addEquipment(equipment58);
        labManager27.setEquipmentStatus(equipment58, "Guest");
        equipment58.setLabLocation("User{userId=84c5ffba-b1d2-4db1-9fef-2fd8ecfc81d3, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        state.EquipmentState equipmentState74 = equipment58.getCurrentState();
        equipment9.setState(equipmentState74);
        java.lang.String str76 = equipment9.getDescription();
        java.time.LocalDateTime localDateTime77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        model.Reservation reservation80 = null;
        boolean boolean81 = equipment9.isModifyAvailable(localDateTime77, localDateTime78, "User{userId=81a1aa84-9400-4eae-94ba-24b390e44a98, email='Faculty', status='INACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation80);
        equipment9.setStatus("User{userId=9dca83a1-a35d-4cad-bec0-49e13972189d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(equipmentState17);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "LabManager" + "'", str33, "LabManager");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "LabManager" + "'", str34, "LabManager");
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "LabManager" + "'", str47, "LabManager");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(equipmentState74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3949");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        model.LabManager labManager5 = headLabCoordinator3.autoGenerateManagerAccount("Guest");
        java.lang.String str6 = headLabCoordinator3.toString();
        double double7 = headLabCoordinator3.getHourlyRate();
        java.lang.String str8 = headLabCoordinator3.getIdOrCertNumber();
        headLabCoordinator3.setIdOrCertNumber("User{userId=231c4042-62bd-4f4a-9305-46a93b8327f0, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        double double11 = headLabCoordinator3.getHourlyRate();
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
        boolean boolean29 = equipment15.isModifyAvailable(localDateTime25, localDateTime26, "User{userId=3d2d1150-100b-4b12-bf1a-db0424ae2ed7, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", reservation28);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean33 = equipment15.isAvailable(localDateTime30, localDateTime31, "User{userId=19419f3e-4ebc-4ffd-805d-fb1ab53af7d0, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        strategy.PricingStrategy pricingStrategy36 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation37 = new model.Reservation((model.User) headLabCoordinator3, equipment15, localDateTime34, localDateTime35, pricingStrategy36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
// flaky "79) test3949(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User{userId=4870d9e1-c4dc-40a3-a26a-aa4e3b96ab9c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}" + "'", str6, "User{userId=4870d9e1-c4dc-40a3-a26a-aa4e3b96ab9c, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str8, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3950");
        model.LabManager labManager3 = new model.LabManager("LabManager", "User{userId=7a3b1119-f2f4-49fc-a404-795e5f0a6539, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}", "Faculty");
        java.lang.String str4 = labManager3.getRole();
        double double5 = labManager3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LabManager" + "'", str4, "LabManager");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3951");
        model.Equipment equipment3 = new model.Equipment("User{userId=ec1cdb05-c503-42d6-9c44-e6a5310e091e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=ad5898d9-0aea-4547-9592-afc0a193e1ed, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=5f8474ee-818b-4263-9f2a-d587d7e69f19, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = equipment3.getStatus();
        model.Equipment equipment8 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str9 = equipment8.getLabLocation();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment8.isModifyAvailable(localDateTime10, localDateTime11, "Student", reservation13);
        java.lang.String str15 = equipment8.getStatus();
        model.Equipment equipment19 = new model.Equipment("", "", "");
        java.lang.String str20 = equipment19.getDescription();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        model.Reservation reservation24 = null;
        boolean boolean25 = equipment19.isModifyAvailable(localDateTime21, localDateTime22, "hi!", reservation24);
        equipment19.disable();
        equipment19.enable();
        state.EquipmentState equipmentState28 = equipment19.getCurrentState();
        model.HeadLabCoordinator headLabCoordinator32 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager34 = headLabCoordinator32.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment38 = new model.Equipment("", "", "");
        labManager34.markMaintenance(equipment38);
        java.lang.String str40 = equipment38.getStatus();
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
        equipment38.setState(equipmentState65);
        equipment19.setState(equipmentState65);
        equipment8.setState(equipmentState65);
        equipment3.setState(equipmentState65);
        equipment3.markMaintenance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Available" + "'", str4, "Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(equipmentState28);
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Maintenance" + "'", str40, "Maintenance");
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(equipmentState65);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3952");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Maintenance", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        java.lang.String str4 = headLabCoordinator3.toString();
        model.LabManager labManager6 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=07c97905-b8e0-4c19-8a65-87b89491eac1, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
// flaky "80) test3952(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=a82bde61-8fab-46f5-bd5f-8272400939be, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}" + "'", str4, "User{userId=a82bde61-8fab-46f5-bd5f-8272400939be, email='Maintenance', status='ACTIVE', idOrCertNumber='User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3953");
        model.Guest guest3 = new model.Guest("Available", "HeadLabCoordinator", "Guest");
        double double4 = guest3.getHourlyRate();
        java.lang.String str5 = guest3.getRole();
        double double6 = guest3.getHourlyRate();
        boolean boolean7 = guest3.isActive();
        java.lang.String str8 = guest3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3954");
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
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        model.Reservation reservation53 = null;
        boolean boolean54 = equipment36.isModifyAvailable(localDateTime50, localDateTime51, "User{userId=be806bab-7b2c-49a8-a512-47e09cd21a45, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", reservation53);
        java.lang.String str55 = equipment36.getLabLocation();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LabManager" + "'", str12, "LabManager");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LabManager" + "'", str25, "LabManager");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Faculty" + "'", str55, "Faculty");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3955");
        model.Faculty faculty3 = new model.Faculty("User{userId=0487e5c3-a4d6-4cbf-955d-77a6aad9c411, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "", "User{userId=de86b685-14d1-470c-9fcc-851a9514b83e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        boolean boolean4 = faculty3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3956");
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
        equipment3.notifyObservers();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str21, "User{userId=dd27a0f6-55a0-4704-a3d4-777c66375329, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3957");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getRole();
        java.lang.String str6 = faculty3.getRole();
        boolean boolean7 = faculty3.isActive();
        java.util.UUID uUID8 = faculty3.getUserId();
        java.lang.String str9 = faculty3.getPasswordHash();
        java.lang.String str10 = faculty3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uUID8);
// flaky "81) test3957(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID8.toString(), "7c1a1a8a-7a96-47d8-97eb-35bc50a31c8e");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3958");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        equipment3.enable();
        equipment3.enable();
        java.lang.String str6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
        equipment3.disable();
        equipment3.setLabLocation("User{userId=15b8b8d8-146b-4354-a167-c900a7347e0e, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='Faculty'}");
        equipment3.setDescription("Equipment{equipmentId='Equipment{equipmentId='', description='', labLocation='Faculty', status=''}', description='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', status='Available'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Available" + "'", str6, "Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Available" + "'", str7, "Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3959");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("User{userId=169b33f9-3cfa-40ed-bffd-26e428b550f2, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=a4c51909-c722-40ed-afa7-a3e6c85c7f5e, email='User{userId=e95ed025-4f8a-46f5-8f4e-7818daca4fd4, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=cced7c38-459b-4502-b5ec-1906a9a3ff48, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3960");
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
        equipment9.disable();
        equipment9.notifyObservers();
// flaky "82) test3960(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=c0d704cb-a0e8-4a87-b475-a9817038e4bf, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}" + "'", str4, "User{userId=c0d704cb-a0e8-4a87-b475-a9817038e4bf, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        org.junit.Assert.assertNotNull(uUID5);
// flaky "21) test3960(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID5.toString(), "c0d704cb-a0e8-4a87-b475-a9817038e4bf");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}" + "'", str24, "Equipment{equipmentId='', description='', labLocation='Faculty', status='Available'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Available" + "'", str27, "Available");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3961");
        model.Researcher researcher3 = new model.Researcher("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}" + "'", str7, "User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3962");
        model.Guest guest3 = new model.Guest("User{userId=b16e6339-b22f-46f5-aeb4-f0bc5b86e4f0, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=9dca83a1-a35d-4cad-bec0-49e13972189d, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}");
        java.lang.String str4 = guest3.getRole();
        guest3.setEmail("User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str7 = guest3.toString();
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
// flaky "83) test3962(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=b245efd3-fdda-47cd-947c-8e18ab990f21, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}" + "'", str7, "User{userId=b245efd3-fdda-47cd-947c-8e18ab990f21, email='User{userId=2cad8b05-4c83-4de7-ba96-9f6d2077eb8f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', status='ACTIVE', idOrCertNumber='User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}', role='Guest'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3963");
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
        equipment3.disable();
        model.SensorUpdate sensorUpdate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment3.applySensorUpdate(sensorUpdate19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3964");
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
        observer.EquipmentObserver equipmentObserver46 = null;
        equipment20.detach(equipmentObserver46);
        equipment20.setDescription("User{userId=07c97905-b8e0-4c19-8a65-87b89491eac1, email='', status='ACTIVE', idOrCertNumber='hi!', role='Guest'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LabManager" + "'", str11, "LabManager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LabManager" + "'", str14, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3965");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.toString();
        model.LabManager labManager9 = headLabCoordinator3.autoGenerateManagerAccount("User{userId=fb12cb8b-14c1-498c-b5d3-3801a4ea705b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        java.lang.String str10 = headLabCoordinator3.getRole();
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
        equipment14.setLabLocation("User{userId=5aa06632-71c9-44f5-91aa-34798d1491e0, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        strategy.PricingStrategy pricingStrategy58 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation59 = new model.Reservation((model.User) headLabCoordinator3, equipment14, localDateTime56, localDateTime57, pricingStrategy58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
// flaky "84) test3965(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User{userId=0239f761-3deb-4553-9bc4-f1770a0a3198, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str7, "User{userId=0239f761-3deb-4553-9bc4-f1770a0a3198, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HeadLabCoordinator" + "'", str10, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(equipmentState51);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3966");
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
        model.Equipment equipment57 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        model.Reservation reservation61 = null;
        boolean boolean62 = equipment57.isModifyAvailable(localDateTime58, localDateTime59, "Faculty", reservation61);
        equipment57.setLabLocation("Faculty");
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        model.Reservation reservation68 = null;
        boolean boolean69 = equipment57.isModifyAvailable(localDateTime65, localDateTime66, "", reservation68);
        equipment57.disable();
        java.lang.String str71 = equipment57.getLabLocation();
        state.EquipmentState equipmentState72 = equipment57.getCurrentState();
        equipment35.setState(equipmentState72);
        observer.EquipmentObserver equipmentObserver74 = null;
        equipment35.detach(equipmentObserver74);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(equipmentState27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Faculty" + "'", str71, "Faculty");
        org.junit.Assert.assertNotNull(equipmentState72);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3967");
        model.Researcher researcher3 = new model.Researcher("User{userId=4b109eaf-c354-4836-992f-006f7342cfa5, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=7df7f431-c881-401d-97c9-ceda251e8f46, email='ACTIVE', status='ACTIVE', idOrCertNumber='ACTIVE', role='HeadLabCoordinator'}", "User{userId=01dd24ae-ca1b-4cf2-b5b0-754aa79157e5, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str4 = researcher3.getRole();
        researcher3.setEmail("User{userId=fed24419-e732-4903-8c34-e24eaa879c77, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getRole();
        java.lang.String str9 = researcher3.getRole();
        java.lang.String str10 = researcher3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3968");
        model.Guest guest3 = new model.Guest("User{userId=0d8f982a-be34-4bd5-b4e2-6d304ae738d5, email='hi!', status='ACTIVE', idOrCertNumber='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', role='HeadLabCoordinator'}", "User{userId=45a14a13-3386-4421-b0e2-7c228d49e311, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3b48c400-6fdc-4b8c-91bd-56d0e9c363f7, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3969");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("Maintenance", "User{userId=19bd8ddc-3dc9-4571-981f-962d64ce12bb, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=97f7d3c8-97d8-40d7-8df4-63297091331d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}");
        double double4 = headLabCoordinator3.getHourlyRate();
        headLabCoordinator3.setPasswordHash("User{userId=bfc196bf-0e5c-4790-b5a9-d4943d1bf144, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}");
        java.lang.String str7 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3970");
        model.Guest guest3 = new model.Guest("User{userId=799ed40e-f41b-4715-a255-bb8ca91e10cc, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "", "User{userId=7dbaba3a-5558-4dc2-9cbd-6ef5d7226c86, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        java.lang.String str4 = guest3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3971");
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
        boolean boolean26 = labManager5.isActive();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ACTIVE" + "'", str8, "ACTIVE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3972");
        model.Researcher researcher3 = new model.Researcher("HeadLabCoordinator", "Equipment{equipmentId='', description='', labLocation='', status='Available'}", "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        java.lang.String str4 = researcher3.getIdOrCertNumber();
        researcher3.setEmail("User{userId=1eb80822-737f-46e1-a8ee-cbb30b51cdba, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str4, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3973");
        model.Guest guest3 = new model.Guest("User{userId=184e30c2-a69c-4f1f-9887-026cbd4ed4bb, email='User{userId=3c678326-7b15-4b16-b392-3796851fcba9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}', status='ACTIVE', idOrCertNumber='User{userId=0954c47d-7782-48bc-8a70-3e84ea3cecb6, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='Faculty'}", "User{userId=4261d41c-ee16-44a8-927e-adce3f3bac9c, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=f8911f10-f70b-4cd8-9f0c-8544648f051f, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3974");
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
        observer.EquipmentObserver equipmentObserver33 = null;
        equipment25.attach(equipmentObserver33);
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
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3975");
        model.Researcher researcher3 = new model.Researcher("", "hi!", "hi!");
        researcher3.setIdOrCertNumber("Guest");
        java.lang.String str6 = researcher3.getRole();
        double double7 = researcher3.getHourlyRate();
        researcher3.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3976");
        model.LabManager labManager3 = new model.LabManager("User{userId=588d105b-490b-4d71-a926-ddab5812e4d2, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=b76e7a77-08eb-48da-87cf-9e196fa2b2cf, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=b889fb42-a009-460a-81cc-e21429c65068, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3977");
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
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean31 = equipment3.isAvailable(localDateTime28, localDateTime29, "Faculty");
        java.lang.String str32 = equipment3.getDescription();
        equipment3.enable();
        observer.EquipmentObserver equipmentObserver34 = null;
        equipment3.attach(equipmentObserver34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(equipmentState26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3978");
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
        equipment36.notifyObservers();
        observer.EquipmentObserver equipmentObserver51 = null;
        equipment36.detach(equipmentObserver51);
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
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3979");
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
        state.EquipmentState equipmentState25 = equipment13.getCurrentState();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean29 = equipment13.isAvailable(localDateTime26, localDateTime27, "User{userId=632d47ed-f2ef-4350-9fb8-e586acf3669c, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment{equipmentId='', description='', labLocation='', status='Available'}" + "'", str16, "Equipment{equipmentId='', description='', labLocation='', status='Available'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(equipmentState25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3980");
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
        observer.EquipmentObserver equipmentObserver50 = null;
        equipment45.detach(equipmentObserver50);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}" + "'", str39, "Equipment{equipmentId='', description='', labLocation='Faculty', status=''}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(equipmentState49);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3981");
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
        equipment22.disable();
        java.lang.Class<?> wildcardClass26 = equipment22.getClass();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(equipmentState24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3982");
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
        model.HeadLabCoordinator headLabCoordinator34 = new model.HeadLabCoordinator("ACTIVE", "", "ACTIVE");
        model.LabManager labManager36 = headLabCoordinator34.autoGenerateManagerAccount("HeadLabCoordinator");
        boolean boolean37 = labManager36.isActive();
        double double38 = labManager36.getHourlyRate();
        double double39 = labManager36.getHourlyRate();
        java.lang.String str40 = labManager36.getIdOrCertNumber();
        model.Equipment equipment44 = new model.Equipment("", "", "");
        java.lang.String str45 = equipment44.getDescription();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        model.Reservation reservation49 = null;
        boolean boolean50 = equipment44.isModifyAvailable(localDateTime46, localDateTime47, "hi!", reservation49);
        java.lang.String str51 = equipment44.getEquipmentId();
        equipment44.setStatus("");
        java.lang.String str54 = equipment44.getStatus();
        labManager36.addEquipment(equipment44);
        equipment44.setLabLocation("LabManager");
        equipment44.setDescription("User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        java.lang.String str60 = equipment44.toString();
        equipment44.notifyObservers();
        labManager3.markMaintenance(equipment44);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LabManager" + "'", str9, "LabManager");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertNotNull(uUID21);
// flaky "85) test3982(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID21.toString(), "7aa2a970-1fea-444d-a592-2ff8d9bb76ac");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "LM-CERT" + "'", str40, "LM-CERT");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}" + "'", str60, "Equipment{equipmentId='', description='User{userId=33df3bbe-39e8-4dc4-85fb-cdb726d3bf9d, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='LabManager', status=''}");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3983");
        model.Equipment equipment3 = new model.Equipment("ACTIVE", "ACTIVE", "");
        java.lang.String str4 = equipment3.getLabLocation();
        observer.EquipmentObserver equipmentObserver5 = null;
        equipment3.detach(equipmentObserver5);
        equipment3.setDescription("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.lang.String str9 = equipment3.getLabLocation();
        java.lang.String str10 = equipment3.toString();
        equipment3.notifyObservers();
        equipment3.setLabLocation("User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        observer.EquipmentObserver equipmentObserver14 = null;
        equipment3.attach(equipmentObserver14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}" + "'", str10, "Equipment{equipmentId='ACTIVE', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='', status='Available'}");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3984");
        model.Guest guest3 = new model.Guest("User{userId=20daa759-4063-4be0-8fbd-7c9ecfb1543e, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Equipment{equipmentId='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', labLocation='Guest', status='Available'}", "User{userId=e2f7f034-e1a9-45dc-9009-b560dc4e017d, email='HeadLabCoordinator', status='ACTIVE', idOrCertNumber='User{userId=651b7916-ebbf-4947-804a-77ebb766ea2c, email='', status='ACTIVE', idOrCertNumber='User{userId=05b6bbc6-10e7-4872-b0a0-74e0cb390bbe, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', role='LabManager'}', role='Guest'}");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3985");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime5, localDateTime6, "Equipment{equipmentId='ACTIVE', description='ACTIVE', labLocation='ACTIVE', status='Available'}");
        equipment3.markMaintenance();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        model.Reservation reservation13 = null;
        boolean boolean14 = equipment3.isModifyAvailable(localDateTime10, localDateTime11, "User{userId=0934495a-fc5c-4e85-b304-b06b52247c32, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Researcher'}", reservation13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}" + "'", str4, "User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3986");
        model.Equipment equipment3 = new model.Equipment("User{userId=debeddd9-d01b-441a-b79c-5ca59a455b5d, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "Guest", "Student");
        equipment3.notifyObservers();
        equipment3.enable();
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3987");
        model.HeadLabCoordinator headLabCoordinator3 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        double double4 = headLabCoordinator3.getHourlyRate();
        java.lang.String str5 = headLabCoordinator3.getRole();
        java.lang.String str6 = headLabCoordinator3.getRole();
        java.lang.String str7 = headLabCoordinator3.getRole();
        java.lang.String str8 = headLabCoordinator3.toString();
        java.lang.String str9 = headLabCoordinator3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HeadLabCoordinator" + "'", str5, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HeadLabCoordinator" + "'", str6, "HeadLabCoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HeadLabCoordinator" + "'", str7, "HeadLabCoordinator");
// flaky "86) test3987(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User{userId=82fbcc46-91ee-4fc6-aaad-fe3c1e73ee2a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}" + "'", str8, "User{userId=82fbcc46-91ee-4fc6-aaad-fe3c1e73ee2a, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HeadLabCoordinator" + "'", str9, "HeadLabCoordinator");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3988");
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
        model.SensorUpdate sensorUpdate26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment10.applySensorUpdate(sensorUpdate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.SensorUpdate.getOperationalStatus()\" because \"update\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3989");
        model.Guest guest3 = new model.Guest("User{userId=639254a4-7d96-48b0-9245-c766a9e821ec, email='User{userId=9c32d61c-dd49-4ec6-be7b-0e6951e507dc, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3cb2c149-62d2-4dd6-8d34-06fafc43f039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='Student'}", "User{userId=5bccdc97-eca9-4150-a2a4-d885f4ec051f, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        guest3.setIdOrCertNumber("User{userId=a439f2ca-eba6-4ac1-8170-cc60ce20f2f1, email='Guest', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3990");
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
        model.Equipment equipment38 = new model.Equipment("User{userId=3d628df8-c94f-4067-8efc-1ee42876c775, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=4666b347-4490-4018-b6ae-6c062ea7af9e, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=23fc1de9-7359-4e14-9053-35f1a9a7e7c9, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        strategy.PricingStrategy pricingStrategy41 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation reservation42 = new model.Reservation((model.User) guest3, equipment38, localDateTime39, localDateTime40, pricingStrategy41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(uUID31);
// flaky "87) test3990(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID31.toString(), "5db444ac-3843-4587-8bf0-b97792185b2e");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3991");
        model.Guest guest3 = new model.Guest("", "hi!", "hi!");
        java.lang.String str4 = guest3.getRole();
        double double5 = guest3.getHourlyRate();
        double double6 = guest3.getHourlyRate();
        java.lang.String str7 = guest3.getPasswordHash();
        guest3.setActive(false);
        java.lang.String str10 = guest3.getEmail();
        java.util.UUID uUID11 = guest3.getUserId();
        java.lang.String str12 = guest3.getIdOrCertNumber();
        java.lang.String str13 = guest3.getStatus();
        java.lang.String str14 = guest3.getRole();
        java.lang.String str15 = guest3.getRole();
        java.lang.String str16 = guest3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(uUID11);
// flaky "88) test3991(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID11.toString(), "80db6e93-f159-4d75-b642-4862c6ea109e");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "INACTIVE" + "'", str13, "INACTIVE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3992");
        model.Faculty faculty3 = new model.Faculty("User{userId=50318a48-bfc4-4948-97c0-f55f3e886f3b, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "", "User{userId=e47813b4-3b7a-4106-acde-94e7f711c987, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3993");
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
        equipment13.setDescription("User{userId=8098a35b-4a01-44f9-8286-f37c369c4939, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}");
        equipment13.notifyObservers();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(equipmentState19);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3994");
        model.Faculty faculty3 = new model.Faculty("User{userId=70c40993-78e7-422c-bae8-0d552d6c36ef, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}", "User{userId=8d10c7c1-eb42-4cab-9b63-c0617b0e2696, email='Equipment{equipmentId='', description='', labLocation='', status='Available'}', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "Equipment{equipmentId='User{userId=2b8aa6c3-aa97-47f5-a1ff-7c2ccf5c5875, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}', description='User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}', labLocation='User{userId=null, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}', status='Available'}");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3995");
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
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean30 = equipment11.isAvailable(localDateTime27, localDateTime28, "User{userId=b25d973d-ad6c-4a37-a416-ec5f76342291, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='HeadLabCoordinator'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3996");
        model.Researcher researcher3 = new model.Researcher("User{userId=56916858-e73a-4b7c-8a7b-02c06888d36f, email='', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=959575bd-d46c-4483-af57-6f8357d08039, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}", "User{userId=3b80ac9c-0056-4486-b69f-f9f9181ce813, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getRole();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3997");
        model.Equipment equipment3 = new model.Equipment("", "", "");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        model.Reservation reservation8 = null;
        boolean boolean9 = equipment3.isModifyAvailable(localDateTime5, localDateTime6, "hi!", reservation8);
        equipment3.markMaintenance();
        equipment3.setStatus("");
        observer.EquipmentObserver equipmentObserver13 = null;
        equipment3.detach(equipmentObserver13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3998");
        model.Faculty faculty3 = new model.Faculty("User{userId=94ce858a-27a8-4c85-8d44-dd0223e03a5f, email='Equipment{equipmentId='', description='', labLocation='hi!', status='Available'}', status='INACTIVE', idOrCertNumber='', role='Student'}", "User{userId=3afa27ba-ae22-4ac3-8806-eb80d76b1ab2, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", "User{userId=066a4429-959c-4e79-828e-47477987f1da, email='', status='INACTIVE', idOrCertNumber='', role='Student'}");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3999");
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
        java.lang.String str39 = labManager5.getIdOrCertNumber();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Available" + "'", str15, "Available");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "LabManager" + "'", str37, "LabManager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LabManager" + "'", str38, "LabManager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "LM-CERT" + "'", str39, "LM-CERT");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test4000");
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
        model.Equipment equipment25 = new model.Equipment("", "", "");
        equipment25.enable();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        model.Reservation reservation30 = null;
        boolean boolean31 = equipment25.isModifyAvailable(localDateTime27, localDateTime28, "User{userId=7580b860-1442-4913-9c80-e868912fe0d1, email='hi!', status='ACTIVE', idOrCertNumber='hi!', role='Faculty'}", reservation30);
        equipment25.setDescription("ACTIVE");
        model.HeadLabCoordinator headLabCoordinator37 = new model.HeadLabCoordinator("hi!", "hi!", "hi!");
        model.LabManager labManager39 = headLabCoordinator37.autoGenerateManagerAccount("Faculty");
        model.Equipment equipment43 = new model.Equipment("", "", "");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        model.Reservation reservation47 = null;
        boolean boolean48 = equipment43.isModifyAvailable(localDateTime44, localDateTime45, "Faculty", reservation47);
        equipment43.setLabLocation("Faculty");
        labManager39.setEquipmentStatus(equipment43, "");
        java.lang.String str53 = equipment43.getDescription();
        state.EquipmentState equipmentState54 = equipment43.getCurrentState();
        equipment25.setState(equipmentState54);
        labManager9.setEquipmentStatus(equipment25, "");
        java.lang.String str58 = equipment25.getLabLocation();
        java.lang.String str59 = equipment25.getDescription();
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(uUID15);
// flaky "89) test4000(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals(uUID15.toString(), "2a6f07b2-be2e-496b-b2c0-545d679309c8");
// flaky "22) test4000(randoop.RandoopRegressionTest7)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User{userId=2a6f07b2-be2e-496b-b2c0-545d679309c8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}" + "'", str17, "User{userId=2a6f07b2-be2e-496b-b2c0-545d679309c8, email='ACTIVE', status='ACTIVE', idOrCertNumber='LM-CERT', role='LabManager'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LabManager" + "'", str18, "LabManager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LabManager" + "'", str19, "LabManager");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(equipmentState54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ACTIVE" + "'", str59, "ACTIVE");
    }
}
