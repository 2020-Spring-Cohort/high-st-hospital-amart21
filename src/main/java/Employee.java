public abstract class Employee {
    protected String name;

    public boolean hasBeenPaid = false;
    private static int count = 10;
    private int employeeNumber;
    private int salary;
    private int income;
    protected String duty;

    public int getBloodAmount() {
        return 0;
    }
    public int getHealthAmount() {
        return 0;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        setEmployeeNumber(++count);
    }
    public String getName(){
        return name;
    }
    public String getDuty() {
        return duty;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public int getSalary() {
        return salary;
    }
    public boolean hasBeenPaid() {
        return hasBeenPaid;
    }
    public void setEmployeeNumber(int count) {
        this.employeeNumber = count;
    }
    public void payEmployee(){
        income =+ salary;
        hasBeenPaid = true;
        System.out.println(name + " was paid");
    }

}


