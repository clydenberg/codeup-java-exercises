package person;

public class Manager extends Employee{
    public Manager(String name, int age){
        super(name, age);
    }
    public Person fireEmployee(Employee employee){
        if(employeeId.equals(employee.employeeId)){
            System.out.println("Go home " + employee.getName() + " your Drunk!");
            throw new IllegalArgumentException("You can't fire yourself " + employee.getName() + "!");
        }
        System.out.println("You're fired, " + employee.getName() + "!");
        return new Person(employee.getName());
    }

    public void sayHello(){
        System.out.println("Can I help you?");
    }
}
