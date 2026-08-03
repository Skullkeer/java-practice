import java.util.Scanner;

public class MenuLoop {

    public static void main() {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" Choose option 1 or 2 (Choose 3 to exit): ");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("You chose option 1");
                    break;
                case 2:
                    System.out.println("You chose option 2");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    counter++;
                    break;
            }


        }
        while (counter == 0);
    }

}
