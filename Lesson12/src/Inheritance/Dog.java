package Inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // Method *Override*
    public void makeSound() {
        System.out.println("Woof");
//        super.makeSound();
    }

    public static void eat() {
        System.out.println("Dog: Yum Yum!");
    }

    public static void main() {
        Dog milo = new Dog("Milo");
//        milo.makeSound();
//      superclasses vers
        Cat c = new Cat("Kitty");
//        c.makeSound();

        Animal[] arr = {milo, c};

        for (Animal a: arr) {
            a.makeSound();
        }

//        eat();
//        milo.super.eat();
        ((Animal) milo).eat();
        Animal.eat();
    }

}
