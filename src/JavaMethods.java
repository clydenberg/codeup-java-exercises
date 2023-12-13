import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        printName(firstName, lastName);
        printName(firstName);
    }
    public static void printName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
    public static void printName(String name) {
        System.out.println(name);
    }

}
