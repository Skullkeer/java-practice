package Threads2;

public class CounterComparison {

    static class Counter {
        int count;

        public void increment() {
            count ++;
        }

        public synchronized void safeIncrement() {
            count ++;
        }
    }

    public static final int INCREMENTS_PER_THREAD = 1_000_000;

    static class SafeCountingThread extends Thread {
        private final Counter counter;

        SafeCountingThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < INCREMENTS_PER_THREAD; i++) {
                counter.safeIncrement();
            }
        }


    }

    public static void main() throws InterruptedException {
        Counter safe = new Counter();
        Thread safe1 = new SafeCountingThread(safe);
        Thread safe2 = new SafeCountingThread(safe);

        safe1.start();
        safe2.start();
        safe1.join();
        safe2.join();

        System.out.println("Expected: " + 2 * (INCREMENTS_PER_THREAD));
        System.out.println("With Unsafe Thread: " + safe.count);
    }

}
