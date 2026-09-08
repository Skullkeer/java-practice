package q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String grade = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        int score = scanner.nextInt();

        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                grade = "A";
            }
            else if (score >= 80) {
                grade = "B";
            }
            else if (score >= 70) {
                grade = "C";
            }
            else if (score >= 50) {
                grade = "D";
            }
            else {
                grade = "E";
            }

            System.out.println("Grade: " + grade);

        }
        else {
            System.out.println("Invalid Score!");
        }

    }
}
