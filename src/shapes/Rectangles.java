package shapes;

public class Rectangles extends Quadrilateral {

    public Rectangles(double width, double height) {
        super(width, height);
    }
    public double getArea() {
        System.out.println("Rectangles.getArea()");
        return width * height;
    }
    public double getPerimeter() {
        System.out.println("Rectangles.getPerimeter()");
        return 2 * (width + height);
    }

}
