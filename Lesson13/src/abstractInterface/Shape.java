package abstractInterface;

public abstract class Shape {

    protected String name = this.name;

    public Shape(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("Name: " + this.name);
    }

    public abstract double getArea();

    public String getName() {
        return this.name;
    }

    public abstract double getPerimeter();

}
