import person.Person;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Paul");
        people[2] = new Person("Ringo");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person("George"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}
