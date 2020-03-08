public class Janitor extends Employee {

    private static String duty = "Janitor";

    public Janitor(String name, int salary) {
        super(name, salary);
        super.duty = this.duty;
    }
    public boolean isCleaning = false;


}
