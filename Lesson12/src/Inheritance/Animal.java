package Inheritance;

public class Animal {

    private String name = "";

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.printf("%s: Noises!\n", this.name);
    }

    public static void eat() {
        System.out.println("Yum Yum!");
    }

}
