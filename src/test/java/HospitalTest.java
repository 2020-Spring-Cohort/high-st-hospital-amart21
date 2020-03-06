import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    private Hospital testHospital;
    private Patient testPatient1;
    private Patient testPatient2;

    @BeforeEach
    void setUp() {
        testHospital = new Hospital();
        Doctor doctorUnderTest = new Doctor("Fred", 90000, "heart");
        Nurse nurseTest = new Nurse("Sally", 50000);
        Receptionist receptionistTest = new Receptionist("Cher", 45000);
        Janitor janitorTest = new Janitor("Bob", 40000);
        testPatient1 = new Patient("Barney");
        testPatient2 = new Patient("Wilma");
        testHospital.employeeAdd(doctorUnderTest);
        testHospital.employeeAdd(nurseTest);
        testHospital.employeeAdd(receptionistTest);
        testHospital.employeeAdd(janitorTest);
        testHospital.patientAdd(testPatient1);
        testHospital.patientAdd(testPatient2);
    }
    @Test
    public void shouldBeAbleToShowNumberOfEmployees(){
        ArrayList<Employee> list = testHospital.getEmployees();
        int result = list.size();
        assertEquals(4, result);
        System.out.println(result);

    }
    @Test
    public void shouldBeAbleToShowEmployees(){
        ArrayList<Employee> printList = testHospital.getEmployees();
        testHospital.showAllEmployees();
    }
    @Test
    public void shouldBeAbleToPayEmployees(){
        testHospital.showAllEmployees();
        testHospital.payAllEmployees();
        testHospital.showAllEmployees();

    }
    @Test
    public void showNumberOfPatients(){
        int count = testHospital.getPatientCount();
        assertEquals(2, count);
    }

}