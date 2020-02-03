
 public class Patient  {
    public int HEALTH_LEVEL = 10;
    public String patientName = "Mike";
    public int BLOOD_LEVEL = 20;
    public int patientWellBeing;
    public int patientStatus = HEALTH_LEVEL + BLOOD_LEVEL;



    public Patient(String patientName, int HEALTH_LEVEL, int BLOOD_LEVEL, String patientStatus) {
        this.HEALTH_LEVEL= HEALTH_LEVEL;
        this.BLOOD_LEVEL = BLOOD_LEVEL;
        this.patientStatus = patientStatus;
//            super(patientName);
//            super.patientName = "Patient";
//            bleedAmount = 5;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }

    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }
    public int getPatientStatus(){
        return patientStatus; }

    public void patientWellBeing() {
        if (BLOOD_LEVEL <= 10 && HEALTH_LEVEL <= 15) {
            System.out.println(patientName + " is in BAD SHAPE!");
        } else
            System.out.println(patientName + " is doing good.");
    }
     public void tick() {
         BLOOD_LEVEL -= 2;
         if (BLOOD_LEVEL > 20) {
             BLOOD_LEVEL = 20;
         }
         if (BLOOD_LEVEL < 10) {
             System.out.println("" + patientName + " needs medical attention.");

         }
         HEALTH_LEVEL -= 3;
         if (HEALTH_LEVEL > 10) {
             HEALTH_LEVEL = 10;
             System.out.println(""+ patientName + " needs blood drawn.");
         }
     }
         public String toString() {
             return ("Patient" + "named" + patientName + "has stats of " + "Blood Level:" + BLOOD_LEVEL + " and " +
                     "Health Level:" + HEALTH_LEVEL);
         }
         public int patientStatus(){
         if(patientStatus ( HEALTH_LEVEL + BLOOD_LEVEL ==30){
             patientStatus = 30;
                 System.out.println("Patient" + patientName + " is doing well. And they have a Blood Level of" + BLOOD_LEVEL +
                         BLOOD_LEVEL + " and a Health Level of" + HEALTH_LEVEL + ".");
             }else
                 if(patientStatus(HEALTH_LEVEL + BLOOD_LEVEL <30)) {
                     System.out.println("Patient" + patientName + " needs a checkup - STAT!");
                 }
         }
         }


