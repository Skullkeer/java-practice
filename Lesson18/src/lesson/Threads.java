package lesson;

public class Threads {

    private static class CountingTask implements Runnable {

        private String taskname = "";
        public int delayMilliseconds = 0;

        private CountingTask(String taskname, int delayMilliseconds) {
            this.taskname = taskname;
            this.delayMilliseconds = delayMilliseconds;
        }

        @Override
        public void run() {
            for (int count = 1; count <= 31; count++) {
                System.out.printf("%s: count=%d, running on %s\n", taskname, count, Thread.currentThread().getName());

            }
            try {
                Thread.sleep(delayMilliseconds);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                System.out.println(taskname + " interrupted");

            }
        }
    }

    public static void main() {
        System.out.println("Main begins on: " + Thread.currentThread().getName());

        Runnable fastTask = new CountingTask("FAST", 10000);
        Runnable slowTask = new CountingTask("SLOW", 160);

//        fastTask.run();
//        slowTask.run();

        Thread fastThread = new Thread(fastTask, "fast-worker");
        Thread slowThread = new Thread(slowTask, "slow-worker");

        fastThread.start();
        slowThread.start();

        try {
            fastThread.join();
            slowThread.join();
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main Knows Both Workers Have Finished");
    }

}
