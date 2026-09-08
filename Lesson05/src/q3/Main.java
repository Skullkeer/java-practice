package q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Counter Number: ");
        int n = scanner.nextInt();

        while (counter < n) {
            counter++;
            System.out.println("Counter: " + counter);
        }
    }
}
