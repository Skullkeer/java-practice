import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Your Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Your Name: " + name);
//
//        System.out.print("Enter Your Num: ");
//        int num = scanner.nextInt();
//        System.out.println("Your Num: " + num);
//
//        scanner.nextLine();
//
//        System.out.print("Enter Your day: ");
//        String day = scanner.nextLine();
//        System.out.println("Your Day: " + day);

        System.out.println("This is a \nnew line\nthis is a\t tab");

        String name = "Alice";
        int age = 25;
        double balance = 12345.74325;

        System.out.printf("\nName: %s\n", name);
        System.out.printf("Age: %d\n", age);

        System.out.printf("Balance: (2dp) %.2f\n", balance);

        System.out.println("Table of Fruit: ");

        System.out.printf("%-10s %5s %10s\n", "Fruit", "Qty", "Price");
        System.out.printf("%-10s %5s %10.2f\n", "Apple", "5", 10.32);
        System.out.printf("%-10s %5s %10.2f\n", "Banana", "3", 11.5);
        System.out.printf("%-10s %5s %10.2f\n", "Mango", "200", 0.63);

        String filename = "testFile.txt";

        try {
            FileWriter writer = new FileWriter(filename);
            System.out.println("Enter 3 Lines to Save");
            for (int i = 0; i < 3; i++) {
                String line = scanner.nextLine();
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }


    }

}
