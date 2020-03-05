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


    }
}
