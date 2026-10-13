package Lesson;

public class Factory {

    interface Animal {
        void speak();
    }

    static class Dog implements Animal {

        @Override
        public void speak() {
            System.out.println("Woof!");
        }
    }

    static class Cat implements Animal {

        @Override
        public void speak() {
            System.out.println("Meow!");
        }
    }

//    public void gameLoop(String type) {
//
//
//        Animal a;
//        if (type.equals("dog")) {
//            a = new Dog();
//            a.speak();
//        } else if (type.equals("cat")) {
//            a = new Cat();
//            a.speak();
//        } else {
//        }
//
//
//        System.out.println("Logging animals...");
//    }

    static abstract class Creator {
        public abstract Animal facoryMethod();
        public void expensiveProcess() {
            System.out.println("Initialising Game...");

            Animal a = facoryMethod();
            a.speak();

            System.out.println("Error! Choose a dog or a cat.");
        }
    }

    static class DogCreator extends Creator {
        @Override
        public Animal facoryMethod() {
            return new Dog();
        }
    }

    static class CatCreator extends Creator {
        @Override
        public Animal facoryMethod() {
            return new Cat();
        }
    }

    public static void main() {

        for (Creator c : new Creator[] {new DogCreator(), new CatCreator()}) {
            c.expensiveProcess();
        }
    }

}
