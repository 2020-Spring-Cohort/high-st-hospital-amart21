
public class Patient {
    private int BLOOD_LEVEL = 20;

    private int HEALTH_LEVEL = 10;

    private String patientName;

    private boolean statsGood;

    public Patient(String name) {
        this.patientName = name;
    }
    public String getPatientName() {
        return patientName;
    }
    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }
    public boolean vitalsGood(){
        boolean answer = false;
        if ((this.HEALTH_LEVEL > 30 ) && (this.BLOOD_LEVEL > 30)){
            answer = true;
        }
        statsGood(answer);
        return answer;
    }
    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }
     public void statsGood(boolean e) {
        this.statsGood = e;
    }
    public void setBLOOD_LEVEL(int bloodAmount){
        this.BLOOD_LEVEL += bloodAmount;
    }
    public void setHEALTH_LEVEL(int healthAmount){
        this.HEALTH_LEVEL += healthAmount;
    }
    public void printPatientStats(){
        System.out.println("Name         :  "+ patientName);
        System.out.println("Stats Good:  " + statsGood);
        System.out.println("Health Level :  " + HEALTH_LEVEL);
        System.out.println("Blood Level  :  "+ BLOOD_LEVEL);


    }
}

