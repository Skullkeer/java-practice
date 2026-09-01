package Lesson2;

public class Car {

    class Engine {
        void start() {
            System.out.println("The engine has started");
        }
    }

    void run() {
        Engine e = new Engine();
        e.start();
    }

    public static void main() {
        Car c = new Car();
        c.run();
    }

}
