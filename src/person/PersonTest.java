package person;

public class PersonTest {
    public static void main(String[] args) {
        Employee person1 = new Employee("John", 21);
        person1.sayHello();
        person1.doWork();

        Manager person2 = new Manager("Jane", 21);
        person2.fireEmployee(person1);
        try{
            person2.fireEmployee(person1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
