import org.junit.jupiter.api.BeforeEach;

public class HospitalTest {

        private Hospital testHospital;
        private Patient testPatient1;
        private Patient testPatient2;

    @BeforeEach
    void setUp() {
        testHospital = new Hospital();
        Doctor doctorUnderTest = new Doctor("david",20, "foot");
        Nurse nurseTest = new Nurse("Fred", 20000);
        Janitor janitorTest = new Janitor("Gerald",20000);
        Receptionist receptionistTest = new Receptionist("janet", 50000);
        testPatient1 = new Patient("Jaime");
        testPatient2 = new Patient("Jackson");
        testHospital.employeeAdd(doctorUnderTest);
        testHospital.employeeAdd(nurseTest);
        testHospital.employeeAdd(janitorTest);
        testHospital.employeeAdd(receptionistTest);
        testHospital.patientAdd(testPatient1);
        testHospital.patientAdd(testPatient2);
}
