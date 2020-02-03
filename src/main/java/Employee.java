
public abstract class Employee {
    public int payRate;
    public String employeeName;
    public int employeeNumber;
    public String position;
    public String department;
    public int checkUp = 10;
    public String positionType;
    public int drawBlood = 10;

    // create constructor
//    public Employee(String name, int payRate, int employeeNumber, String position, String department) {
//        super();
//
//        this.employeeName = name;
//        this.payRate = payRate;
//        this.employeeNumber = employeeNumber;
//        this.position = positionType;
//        this.department = department;



    public Employee(String positionType) {
        this.position = positionType;
    }

    public String getName() {

        return employeeName;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public int getPayRate(){
        return payRate;
    }
    public String getPositionType(){
        return position;
    }
    public String getDepartment(){
        return department;
    }

    public abstract int drawBlood();

        @Override
        public String toString () {
            return ("Employee" + "payRate $" + payRate + ", name = " + employeeName + '\'' +
                    ", employeeNumber = " + employeeNumber + " Position " + position);
        }

}




