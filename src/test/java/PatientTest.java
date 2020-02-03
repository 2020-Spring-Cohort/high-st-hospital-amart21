//import org.junit.jupiter.api.BeforeEach;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
//
//public class PatientTest {
//    private Patient underTest;
//
//    @BeforeEach
//    void setUp() {
//
//        underTest = new Patient("TestPatient", 10, 20);
//    }
//
//    @Test
//    public void shouldHavePatientName() {
//        String result = underTest.getPatientName();
//        System.out.println(underTest.getPatientName());
//        assertEquals("TestPatient", result);
//    }
//
//    @Test
//    public void shouldHaveAnotherName() {
//        Patient underTest = new Patient("Mike", 10, 20);
//        String result = underTest.getPatientName();
//        System.out.println(underTest.getPatientName());
//        assertEquals("Mike", result);
//    }
//
//    @Test
//    public void shouldHaveHealthLevel() {
//        int result = underTest.getHEALTH_LEVEL();
//        System.out.println(underTest.getHEALTH_LEVEL());
//        assertEquals(10, result);
//    }
//
//    @Test
//    public void shouldHaveBloodLevel() {
//        int result = underTest.getBLOOD_LEVEL();
//        System.out.println(underTest.getBLOOD_LEVEL());
//        assertEquals(10, result);
//    }
//
//    @Test
//    public void patientShouldHaveDefaultBloodLevel() {
//        int result = underTest.getBLOOD_LEVEL();
//        assertEquals(20, result);
//    }
//
//    @Test
//    public void patientShouldHaveHealthLevel() {
//        int result = underTest.getHEALTH_LEVEL();
//        assertEquals(10, result);
//
//    }
//    @Test
//    public void shouldTickBloodLevel(){
//        int initialBloodLevel = underTest.getBLOOD_LEVEL();
//        underTest.tick();
//        int newBloodLevel = underTest.getBLOOD_LEVEL();
//        assertEquals(initialBloodLevel - 2, newBloodLevel);
//    }
//    @Test
//    public void shouldTickHealthLevel(){
//        int intialHealthLevel = underTest.getHEALTH_LEVEL();
//        underTest.tick();
//        int newHealthLevel = underTest.getHEALTH_LEVEL();
//        assertEquals(intialHealthLevel -3, newHealthLevel );
//    }
//}
