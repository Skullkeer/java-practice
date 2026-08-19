package abstractInterface;

public class Rectangle extends Shape {

    private final double width;
    private final double length;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }

}
