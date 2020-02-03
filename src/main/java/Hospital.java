
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;


    public class Hospital {

        private HashMap<String,Employee> employeeList = new HashMap<>();


        public HashMap<String,Employee> getEmployeeList(){ return employeeList;}
        public ArrayList<Employee> retrieveEmployees(){ return new ArrayList<>(employeeList.values());}

        private HashMap<String,Patient> patientList = new HashMap<>();
        public HashMap<String,Patient> getPatientList(){ return patientList;}
        public ArrayList<Patient>retrievePatients(){ return new ArrayList<>(patientList.values());}

        public void Patient( int patientHealth, int bloodHealth){

            this.patientHealth =patientHealth;
            this.bloodHealth = bloodHealth;
        }
        public Hospital(int bloodHealth, int physicalHealth){
            this.bloodHealth = bloodHealth;
            this.physicalHealth = physicalHealth;
        }
        public void bleedAllPatients(){
            for (Patient patientToBeChecked: patientList.values()){
                patientToBeChecked.patientWellBeing();
                if (patientToBeChecked instanceof Patient){
                    patientToBeChecked.patientWellBeing();
                }
            }
        }
        public void addPatient(Patient underTest) {
        }
    public static int patientStatus() {
        int bloodHealth = 10, int physicalHealth = 20;
        int patientStatus = bloodHealth + physicalHealth;
        int result = patientStatus();
        System.out.println(result);
    }
  patientStatus = new patientHealth();
    int result= patientHealth;

        public void tick() {
            bloodHealth -= 5;
            if (bloodHealth > 10) {
                bloodHealth = 10;
            }
            if (patientStatus < 30) {
                System.out.println(patientName + " needs a checkup.");
            }
            if (patientStatus > 40) {
                System.out.println(patientName + " needs to have blood drawn");
            }

                     public void health () {
                physicalHealth -= 5;
                if (physicalHealth < 15) {
                    physicalHealth = 15;
                }
            }
            public Employee retrieveEmployee(String employee) {
                return allEmployees.get(employee);
            }
            public void getPatient() {
                for (Patient patientBloodLevel : getPatient().values()) {
                    patientBloodLevel.getBLOOD_LEVEL();
                }
                public void payEmployee() {
                    for (Employee employeeToBePaid : allEmployees.values()) {
                        employeeToBePaid.getPayRate();
                    }
                }
            }}

        private static String patientName = "mike";
        public int patientHealth;
        //    public String patientStatus;
        public int bloodHealth;
        //    public String patientName;
        public int physicalHealth;
        public int bleedAmount = 5;
        public int wellness = 5;
    }

        }