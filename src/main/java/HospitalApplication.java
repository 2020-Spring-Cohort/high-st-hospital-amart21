import java.util.Scanner;
import java.util.ArrayList;

public class HospitalApplication {

    public static Hospital hospital = new Hospital();
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
// start hospital employee & patient status
        System.out.println("Welcome to the High Street Hospital");
        System.out.println("Please press 1 for a list of all medical staff and patients. To exit, please" +
                "press 9.");
        int menuInput = userInput(input);

        while(menuInput != 0) {
            System.out.println("Main menu (press **** for options");
            int menu = userInput(input);
        }
        //exit
        if (menu == 9) {
            System.out.println("Thank you for visiting the High Street Hospital");
            menuInput = 0;
        }
        while (menu !=9){
            if(menu ==2 || menu==3 || menu==4){
                hospital.tickAll();
            }
            switch (menu){
                case 1:
                    System.out.println("View all medical staff.");
                    employeeList();
}
            switch (menu){
                case 2:
                    System.out.println("View all Patients.");
                    patientList();
            }
    }}}



