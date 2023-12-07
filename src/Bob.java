import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continueTalkingToBob;
        do {
            System.out.println("Say something to Bob: ");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                String bobReply1 = "Sure";
                System.out.println(bobReply1);
            } else if (userInput.endsWith("!")) {
                String bobReply2 = "Whoa, chill out!";
                System.out.println(bobReply2);
            } else if (userInput.isEmpty()) {
                String bobReply3 = "Fine. Be that way!";
                System.out.println(bobReply3);
            } else {
                String bobDefault = "Whatever";
                System.out.println(bobDefault);
            }
            System.out.println("Do you want to continue talking to Bob? (y/n)");
            continueTalkingToBob = sc.nextLine();
        } while (continueTalkingToBob.equalsIgnoreCase("y"));
    }
}
