package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a string: ");
        System.out.println(input.getString());
        System.out.println("Enter yes or no: ");
        System.out.println(input.yesNo());
        System.out.println("Enter a number between 1 and 10: ");
        System.out.println(input.getInt(1, 10));
        System.out.println("Enter a number: ");
        System.out.println(input.getInt());
        System.out.println("Enter a number between 1 and 10: ");
        System.out.println(input.getDouble(1, 10));
        System.out.println("Enter a number: ");
        System.out.println(input.getDouble());
    }
}
