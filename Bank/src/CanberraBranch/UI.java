package CanberraBranch;

import java.util.Scanner;

public class UI {
    static void checkBalance(Account acc) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String s = scanner.nextLine();
        System.out.printf("Your Balance ($): %.2f\n", acc.getBalance(s));
    }

    static void depositFunds(Account acc) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deposit Amount ($): ");
        int c = scanner.nextInt();
        acc.depositMoney(c);
    }

}
