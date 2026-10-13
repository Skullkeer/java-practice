package Threads2;

import javax.xml.stream.events.StartDocument;

public class RunnableStyles {

    private final String owner = "the enclosing RunnableStyles object";

    private void demonstrateRunnableStyles() throws InterruptedException {
        Runnable anonymousClass = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous class: " + Thread.currentThread().getName());
                System.out.println("This is " + this.getClass().getName());
            }


        };
        startAndWait("anonymous thread", anonymousClass);

        Runnable lambda = () -> {
            System.out.println("Lambda: " + Thread.currentThread().getName());
            System.out.println("This is " + this);
        };
        startAndWait("lambda thread", lambda);

        Runnable methodRefrence = this::namedTask;
        startAndWait("MR thread", methodRefrence);
    }

    private void namedTask() {
        System.out.println("Method Refrence: " + Thread.currentThread().getName());
        System.out.println("This is an existing named Method");    }

    private static void startAndWait(String name, Runnable task) throws InterruptedException {
        Thread thread = new Thread(task, name);
        thread.start();
        thread.join();
    }

    public static void main() throws InterruptedException {
        new RunnableStyles().demonstrateRunnableStyles();
    }

}
