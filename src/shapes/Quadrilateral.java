package shapes;

public class Quadrilateral extends Shape implements Measurable{
    public Quadrilateral(double width, double height) {
        super(width, height);
    }
    public double getArea() {
        System.out.println("Quadrilateral.getArea()");
        return width * height;
    }
    public double getPerimeter() {
        System.out.println("Quadrilateral.getPerimeter()");
        return 2 * (width + height);
    }
}
