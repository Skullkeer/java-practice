package Lesson15;

public class Static {

    public static int counter = 0;

    public Static() {
        Static.counter += 1;
    }

    public static void voidShowCounter() {
        System.out.printf("You have %d counters in play\n", counter);
    }

    public void declare() {
        System.out.println("This is an instance method");
    }

    public static void eat() {

    }

    public static void main() {
        eat();
        Static.eat();

        Static.voidShowCounter();

        Static sd = new Static();
        sd.declare();

        Static.voidShowCounter();

        System.out.println(Math.pow(3, 3));
    }

}
