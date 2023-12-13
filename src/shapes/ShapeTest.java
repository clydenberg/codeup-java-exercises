package shapes;

public class ShapeTest {
    public static Measurable myShape;
    public static void main(String[] args) {
        myShape = new Rectangles(5, 4);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        myShape = new Squares(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
    }
}
