package shapes;

public class Squares extends Quadrilateral implements Measurable{
    public Squares(double side) {
        super(side, side);
    }
    public double getArea() {
        System.out.println("Squares.getArea()");
        return Math.pow(width, 2);
    }
    public double getPerimeter() {
        System.out.println("Squares.getPerimeter()");
        return 4 * width;
    }
    public void setSide(double side){
        this.width = side;
        this.height = side;
    }
}
