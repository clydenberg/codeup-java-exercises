import java.util.ArrayList;
import java.util.HashMap;

import person.Person;

public class CollectionWT {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.remove(1);
//        System.out.println(list);
//
//        ArrayList<Person> people = new ArrayList<Person>();
//        people.add(new Person("John"));
//        people.add(new Person("Mary"));
//        people.add(new Person("Mike"));
//
//        System.out.println(people.get(0).getName());
//        System.out.println(people.size());
//
//        people.add(0, new Person("Bob"));
//
//        for (Person person : people) {
//            System.out.println(person.getName());
//        }

        HashMap<String, String> users = new HashMap<>();
        users.put("John", "Doe");
        users.put("Mary", "Jane");

        System.out.println(users.get("John"));
        System.out.println(users.get("Mary"));

        users.replace("John", "Smith");
        System.out.println(users.get("John"));

        users.clear();
        System.out.println(users.isEmpty());

        HashMap<String, Integer> people = new HashMap<>();
        //this is just to point out that you can use different data types for the key value pairs.
    }
}
