package Lesson;

public class Nested {

    class MemberInner {
        void show() {
            System.out.println("Inside Member Inner Class");
        }
    }

    static class StaticInner {
        void show() {
            System.out.println("Inside Static Inner Class");
        }
    }

    void method() {
        String st = "String";

        class LocalInner {
            void show() {
                System.out.printf("Local Inner Class can see %s\n", st);
            }
        }
        new LocalInner().show();
    }

    void useAnonymous() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the Anonymous inner class");
            }
        };
        r.run();
    }

    public static void main() {
        Nested n = new Nested();
        MemberInner m = n.new MemberInner();
        m.show();

        Nested.StaticInner s = new StaticInner();
        s.show();

        n.method();

        n.useAnonymous();


    }

}
