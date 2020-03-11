import java.util.Scanner;



public class HospitalApplication {

    private static Hospital hospital = new Hospital();
    private static Patient patient1 = new Patient("Barney");
    private static Patient patient2 = new Patient("Wilma");
    private static Employee doctor1 = new Doctor("Zivago", 90000, "Endochronologist");
    private static Employee doctor2 = new Doctor("Jones", 90000, "Neurologist");
    private static Employee nurse1 = new Nurse("Betty", 50000);
    private static Employee nurse2 = new Nurse("Alice", 50000);
    private static Employee receptionist1 = new Receptionist("Janet", 45000);
    private static Employee janitor1 = new Janitor("Joker", 40000);

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        initialize( hospital);

        System.out.println("Welcome to High Street Hospital");
        int menuChoice = 0;

        while (menuChoice==0){
            System.out.println("Main Menu -- 9 for options");
            int hospitalChoice = input.nextInt();
            switch (hospitalChoice){
                case 0:
                    menuChoice = 1;
                    System.out.println("Thanks for playing!");
                    break;
                case 1:
                    input.nextLine();
                    hospital.showAllEmployees();
                    menuChoice=0;
                    break;
                case 2:
                    input.nextLine();
                    showAllPatients();
                    break;
                case 3:
                    input.nextLine();
                    hospital.showAllMedicalStaff();
                    break;
                case 4:
                    input.nextLine();
                    treatPatient();
                    break;
                case 5:
                    input.nextLine();
                    checkPatient();
                    break;
                case 6:
                    input.nextLine();
                    hospital.payAllEmployees();
                    break;
                case 7:
                    input.nextLine();
                    addEmployee();
                    break;

                case 9:
                    printMenuOptions();
            }
        }
    }
    public static void printMenuOptions(){
        System.out.println("1: Print All Employees");
        System.out.println("2: Print All Patients");
        System.out.println("3: Print Medical Staff Only");
        System.out.println("4: Treat a Patient");
        System.out.println("5: Check on a Patient");
        System.out.println("6: Pay Staff ");
        System.out.println("7: Add Employee ");
        System.out.println("0: EXIT");
    }
    public static void initialize(Hospital hospital){
        hospital.patientAdd(patient1);
        hospital.patientAdd(patient2);
        hospital.employeeAdd(doctor1);
        hospital.employeeAdd(doctor2);
        hospital.employeeAdd(nurse1);
        hospital.employeeAdd(nurse2);
        hospital.employeeAdd(janitor1);
        hospital.employeeAdd(receptionist1);
    }

    public static void showAllPatients(){
        System.out.println("We have: " + hospital.getPatientCount() + " patient(s): ");
        hospital.showAllPatientStats();
    }

    public static void treatPatient() {
        System.out.println("Which patient do you want to treat? (Select by typing name)");
        hospital.showAllPatientStats();
        String patientChoice = input.nextLine();
        System.out.println("You chose: " + patientChoice);

        boolean pickEmployee = false;

        while (pickEmployee == false) {
            System.out.println("Who should treat them? (Pick by Employee Number) ");
//            hospital.showAllEmployees();
            hospital.showAllMedicalStaff();
            int choice = input.nextInt();
            input.nextLine();
            pickEmployee = hospital.treatPatient(choice,patientChoice);
        }
    }

    public static void checkPatient(){
        System.out.println("Pick the patient to treat. (type the name)");
        showAllPatients();
        String choice = input.nextLine();
        hospital.checkPatient(choice);
    }

    public static void addEmployee(){
        System.out.println("Press 1 to add doctor press 2 to add nurse...");
        int choice = input.nextInt();
        input.nextLine();

        while (choice!=0) {
            if (choice == 1) {
                System.out.println("Enter doctor name: ");
                String name = input.nextLine();
                System.out.println("Enter doctor specialty: ");
                String specialty = input.nextLine();
                Employee newEmp = new Doctor(name, 90000, specialty);
                hospital.employeeAdd(newEmp);
                System.out.println("Added new doctor " + newEmp.getName());
                choice = 0;

            } else if (choice == 2) {
                System.out.println("Enter nurse name: ");
                String name = input.nextLine();
                Employee newEmp = new Nurse(name, 20000);
                hospital.employeeAdd(newEmp);
                System.out.println("Added new nurse " + newEmp.getName());
                choice = 0;
            } else {
                System.out.println("Invalid, back to menu...");
                choice = 0;
            }
        }
    }
}
