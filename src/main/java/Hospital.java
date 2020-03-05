
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;


    public class Hospital {
        HashMap<Integer, Employee> HospitalEmployees = new HashMap <Integer, Employee>();
        HashMap<String, Patient> HospitalPatients = new HashMap<>();

        public void employeeAdd(Employee employee){
            HospitalEmployees.put(employee.getEmpNumber(), employee);
        }
        public void patientAdd(Patient patient){
            HospitalPatients.put(patient.getPatientName(), patient);
        }


    }