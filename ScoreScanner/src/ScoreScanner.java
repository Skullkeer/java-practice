import java.util.Scanner;

public class ScoreScanner {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score > 100) {
            System.out.println("Invalid Score");
        }

        else if (score < 0) {
            System.out.println("Invalid Score");
        }

        else if (score >= 90) {
            System.out.println("Grade: A");
        }

        else if (score >= 80) {
            System.out.println("Grade: B");
        }

        else if (score >= 70) {
            System.out.println("Grade: C");
        }

        else if (score >= 60) {
            System.out.println("Grade: D");
        }

        else if (score >= 50) {
            System.out.println("Grade: E");
        }

        else {
            System.out.println("Grade: F");
        }

        System.out.println("Enter Your Subject: ");
        System.out.println("1. Science");
        System.out.println("2. Maths");
        System.out.println("3. English");
        System.out.print("> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("You Chose Science");
                break;
            case 2:
                System.out.println("You Chose Maths");
                break;
            case 3:
                System.out.println("You Chose English");
                break;
            default:
                System.out.println("Invalid Subject");
        }

        if (option == 1 && score >= 50) {
            System.out.println("You are a Great Scientist!");
        }

        if (option == 2 && score >= 50) {
            System.out.println("You are a Great Mathematician!");
        }

        if (option == 3 && score >= 50) {
            System.out.println("You are a Great Writer!");
        }

        if (score < 50) {
            System.out.println("Keep Studying!");
        }


        scanner.close();

    }

}
