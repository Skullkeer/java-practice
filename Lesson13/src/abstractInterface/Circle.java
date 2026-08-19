package abstractInterface;

import java.math.RoundingMode;

public class Circle extends Shape implements CanTalk {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public void speak() {
        System.out.println("Im a Circle!");
    }
}
