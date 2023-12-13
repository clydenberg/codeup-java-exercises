package person;

public class Person {
    private String name;
    private int age;

    public static void main(String[] args) {
//        person.Person person1 = new person.Person("John", 21);
//        person.Person person2 = new person.Person("John", 21);
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        person.Person person1 = new person.Person("John", 21);
//        person.Person person2 = person1;
//        System.out.println(person1 == person2);

//        person.Person person1 = new person.Person("John", 21);
//        person.Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
    public Person(String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
