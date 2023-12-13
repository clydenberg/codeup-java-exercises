package person;

public class Employee extends Person {
    private int salary;
    public String employeeId;
    public Employee(String name, int age) {
        super(name);
        this.employeeId = "1" + name;
    }
    public void doWork() {
        System.out.println("Work, work...");
    }
}
