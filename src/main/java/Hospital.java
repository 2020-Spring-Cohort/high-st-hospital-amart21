import java.util.HashMap;
import java.util.ArrayList;


    public class Hospital {
        HashMap<Integer, Employee> HospitalEmployees = new HashMap <Integer, Employee>();
        HashMap<String, Patient> HospitalPatients = new HashMap<>();

        public void employeeAdd(Employee employee){
            HospitalEmployees.put(employee.getEmployeeNumber(), employee);
        }
        public void patientAdd(Patient patient){
            HospitalPatients.put(patient.getPatientName(), patient);
        }
        private int patientCount = HospitalPatients.size();

        public int getPatientCount(){
            int count = HospitalPatients.size();
            return count;
        }
        public ArrayList<Patient> getPatients(){
            return new ArrayList<>(HospitalPatients.values());
        }
        public ArrayList<Employee>  getEmployees(){
            return new ArrayList<>(HospitalEmployees.values());
        }
        public void showAllEmployees(){
            for (Employee name: HospitalEmployees.values()){
                System.out.printf(name.getName(),
                        name.getDuty(),
                        name.getEmployeeNumber(),
                        name.getSalary(),
                        name.hasBeenPaid);
            }
        }

    }