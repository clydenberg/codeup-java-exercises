package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable rec1 = new Rectangles(4, 5);
        System.out.println("box1.getArea() = " + rec1.getArea());
        System.out.println("box1.getPerimeter() = " + rec1.getPerimeter());
        Measurable sqr1 = new Squares(5);
        System.out.println("box2.getArea() = " + sqr1.getArea());
        System.out.println("box2.getPerimeter() = " + sqr1.getPerimeter());
    }
}
