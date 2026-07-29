public class Counter {

    public static void main() {
        System.out.println("While Loop (+1):");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("For Loop (+1): ");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("For Loop (+4): ");
        for (int i = 1, j = 4; i <= 20; i += j) {
            if (i > 10) {
                break;
            }
            System.out.println("Count: " + i);
        }

    }

}
