package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        do {
            Input input = new Input();
            System.out.println("Enter the radius of a circle: ");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of the circle is: " + circle.getArea());
            System.out.println("The circumference of the circle is: " + circle.getCircumference());
            System.out.println("Would you like to enter another radius? [y/n]");
        } while (new Input().yesNo());
    }
}
