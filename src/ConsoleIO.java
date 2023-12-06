import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
//        String name = "Codeup";
//        String role = "student";
//        System.out.println(name);
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = sc.nextLine();
        System.out.println("whats your phone number?");
        long phoneNumber = sc.nextLong();

        System.out.printf("Hello you entered the name, %s!\n", userName);
        System.out.printf("Hello you entered the phone number, %s!\n", phoneNumber);
    }
}
