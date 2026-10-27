class Diddy implements Runnable {
    double a = 1.100023465;

    @Override
    public void run() {
        for (int i = 0; i < 500000000; i++) {
            double exponent = Math.min(a, 5.0);
            a = Math.PI * Math.pow(Math.E, exponent) * a;
            System.out.printf("!@#$^&*327645 %f", a);
            System.out.printf("!@29877b5 %f", a);
            System.out.printf("!@#$^&jshdv945 %f", a);
        }
    }
}

public class Runnables {
    public static void main(String[] args) throws InterruptedException {
        double b = 1.10000243654;


        Runnable task = new Diddy();
        Thread thread = new Thread(task);

        thread.start();
        for (int i = 0; i < 500000000; i++) {
            double exponent = Math.min(b, 5.0);
            b = Math.PI * Math.pow(Math.E, exponent) * b;
            System.out.printf("!@#$^&*327645 %f", b);
            System.out.printf("!@29877b5 %f", b);
            System.out.printf("!@#$^&jshdv945 %f", b);

        }
        thread.join();
        System.out.println("Both tasks have been finished!");



    }
}
