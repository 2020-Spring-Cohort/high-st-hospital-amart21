import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.Doc;
import java.io.LineNumberReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Hospital testHospital;

    @BeforeEach
    void setup() {
        Doctor doctorUnderTest = new Doctor("Shazam", 90000, "Radiology");
        Nurse nurseTest = new Nurse("Hightower", 50000);
        Receptionist receptionistTest = new Receptionist("Wonder Woman", 45000);
        Janitor janitorTest = new Janitor("Joe Dirt", 40000);
    }

    @Test
    public void shouldBeAbleToMakeDoctor() {
        Doctor doctorUnderTest = new Doctor("Shazam", 90000, "Radiology");
        String result = doctorUnderTest.getSpecialtyArea();
        assertEquals("Radiology", result);
    }
    @Test
    public void shouldBeAbleToMakeNurse(){
        Nurse nurseUnderTest = new Nurse("Hightower",50000);
        String result = nurseUnderTest.getName();
        assertEquals("Hightower",result);
        System.out.println(result);
    }
    @Test
    public void shouldBeAbleToPayEmployee(){
        Doctor doctorUnderTest = new Doctor("Shazam", 90000, "Radiology");
        doctorUnderTest.payEmployee();

    }


}