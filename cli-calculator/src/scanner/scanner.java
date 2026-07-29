package scanner;

import java.util.Scanner;

public class scanner {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter Operation: ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                double result = num1 += num2;
                System.out.print(result);
                return;

            case "-":
                result = num1 -= num2;
                System.out.print(result);
                return;

            case "/":
                result = num1 / num2;
                System.out.print(result);
                return;

            case "*":
                result = num1 * num2;
                System.out.print(result);
                return;

        }

        scanner.close();

    }

}
