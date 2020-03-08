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
        public void showAllMedicalStaff(){
            for (Employee name: HospitalEmployees.values()){
                if (name instanceof CanTreatPatients){
                    System.out.printf(name.getName(),
                            name.getDuty(),
                            name.getSalary(),
                            name.hasBeenPaid);
                };
            }
        }
        public void showAllPatientStats(){
            for (Patient patientShow: HospitalPatients.values()){
                System.out.printf(patientShow.getPatientName(),
                        patientShow.vitalsGood(),
                        patientShow.getHEALTH_LEVEL(),
                        patientShow.getBLOOD_LEVEL());
            }
        }
        public void payAllEmployees() {
            for (Employee name: HospitalEmployees.values()){
                System.out.println(name.getName() + " " + name.getDuty() + " " + name.getEmployeeNumber() + " was paid $" + name.getSalary());
                name.hasBeenPaid = true;
            }
        }
        public boolean treatPatient(int employeeNumber, String patientName) {
            boolean answer = false;
            Employee type = HospitalEmployees.get(employeeNumber);
            if (type instanceof CanTreatPatients){
                Patient patient = HospitalPatients.get(patientName);
                ((CanTreatPatients) type).treatPatient(1);
                patient.setBLOOD_LEVEL(type.getBloodAmount());
                patient.setHEALTH_LEVEL(type.getHealthAmount());
                System.out.println(type.getDuty() + " " + type.getName() + " treated " + patient.getPatientName());
                System.out.println("Blood Treatment Amount: " + type.getBloodAmount());
                System.out.println("Health Treatment Amount: " + type.getHealthAmount());
                patient.vitalsGood();
                answer = true;
                if (patient.vitalsGood() == true){
                    System.out.println("This patient is doing well.");
                }
            } else {
                System.out.println("This employee is not authorized...");
                answer = false;
            }
            return answer;
        }
        public void checkPatient(String patientName){
            Patient patient = HospitalPatients.get(patientName);
            if(patient.vitalsGood() == true) {
                System.out.println(patientName + " doesnt' need anything at this moment.");
                HospitalPatients.remove(patientName);
            } else {
                System.out.println(patientName + " needs medical attention STAT!");
            }
        }


    }