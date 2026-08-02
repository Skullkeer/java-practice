import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter Number 3: ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Largest Number: " + num1);
        }

        else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("Largest Number: " + num2);
        }

        else if ((num3 > num2) && (num3 > num1)) {
            System.out.println("Largest Number: " + num3);
        }

    }
}
