package abstractInterface;

public class Square extends Rectangle
        implements Pointy, CanTalk {

    public Square(String name, int length) {
        super(name, length, length);
    }

    @Override
    public int getNumPoints() {
        return 4;
    }

    @Override
    public void speak() {
        System.out.println("Hey its me the sqaure!");
    }

    public static void main() {
        Circle c = new Circle("Circle", 1);
        Rectangle r = new Rectangle("Rectangle", 2, 3);
        Square s = new Square("Square", 5);

        System.out.printf("Area of %s is %f u^2\n", c.getName(), c.getArea());
        System.out.printf("Area of %s is %f u^2\n", r.getName(), r.getArea());
        System.out.printf("Area of %s is %f u^2\n", s.getName(), s.getArea());

    CanTalk[] arr = {s, c};
    for (CanTalk t: arr) {
        t.speak();
    }

    }



}
