package q1;

public class Dog {

    String name = "";
    int age = 0;

    Dog() {
        this.name = "Milo";
        this.age = 4;
    }

    public void bark() {
        IO.println("Woof Woof!");
    }

    public static void main() {
        Dog milo = new Dog();
        milo.bark();
    }

}
