import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {
    private Patient testPatient;
    private Hospital testHospital;

    @BeforeEach
    void setUp(){
    testPatient = new Patient("Jacktdup");
    Patient testPatient2 = new Patient("Wrektd");
    testHospital = new Hospital();

    testHospital.patientAdd(testPatient);
    testHospital.patientAdd(testPatient2);

    }
    @Test
    public void shouldBeAbleToShowPatient(){
        Patient testPatient = new Patient("Jacktdup");
        String result = testPatient.getPatientName();
        assertEquals("Jacktdup",result);
    }
    @Test
    public void shouldBeAbleToShowAllPatients(){
        int result = testHospital.getPatients().size();
        assertEquals(2,result);
    }
}
