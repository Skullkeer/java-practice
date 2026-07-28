package scanner;

import java.util.Scanner;

public class scanner {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter Second Number: ");
        String num2 = scanner.nextLine();
        System.out.print("Enter Operation");
        System.out.println(num1);
        scanner.close();

    }

}
