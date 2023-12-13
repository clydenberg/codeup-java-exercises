package util;
import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.nextLine();
    }
    public boolean yesNo() {
        String input = sc.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input = sc.nextInt();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        return sc.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = sc.nextDouble();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        return sc.nextDouble();
    }


}
