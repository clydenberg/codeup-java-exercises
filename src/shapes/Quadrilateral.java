package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double width;
    protected double height;
    public Quadrilateral(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    void setWidth(double width){
        this.width = width;
    };
    void setHeight(double height){
        this.height = height;
    };
    public double getArea() {
        System.out.println("Quadrilateral.getArea()");
        return width * height;
    }
    public double getPerimeter() {
        System.out.println("Quadrilateral.getPerimeter()");
        return 2 * (width + height);
    }
}
