import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.concurrent.LinkedTransferQueue;

abstract class Doctor extends Employee  {
//

    public Doctor(String positionType ) {
        super(positionType);
        super.positionType = "Doctor";
        payRate = 90000;
        checkUp = 10;
        drawBlood = -10;
}

}
   //     public Doctor (String employeeName){
    //public Doctor(String name, int payRate, int employeeNumber, String position, String department) {
//        super(employeeName);
//        super.positionType = "Doctor";
//
//    }

//    public Doctor(String specialityArea, int payRate, int employeeNumber) {
//        super(specialityArea, payRate) ;
//        this.specialityArea = specialityArea;

//    public String Area;
//    public int payRate;
//    public String workDuties;
//    public void drawBlood(Patient testPatient){
//        testPatient.giveBlood();
//    }










