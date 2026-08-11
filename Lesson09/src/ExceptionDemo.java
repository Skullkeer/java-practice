import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {
    public static class FunnyNameException extends java.lang.Exception {
        public FunnyNameException(String message) {
            super(message);
        }
    }

    public static void nameCheck(String name) throws FunnyNameException {
        if (name.isEmpty()) {
            System.out.println("Hey! You needa put a name");
            throw new ExceptionDemo.FunnyNameException("Empty Name");
        }

        if (name.equals("Willow")) {
            System.out.println("Wow... youre reallyyy called willow");
            throw new ExceptionDemo.FunnyNameException("Thats MY Name");
        }
    }


    public static void main() {
        int[] nums = {1, 0};
        int new_divisor = 0;
        double result = 0;
        try {
            result = (double) nums[0] / nums[1];
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage() );
            System.out.println("Dont Divide by 0 >:(");
            new_divisor = 1;
        } finally {
            System.out.println("Phew! We're Safe.");
        }
        if (new_divisor == 1) {
            result = nums[0] / new_divisor;
        }
        System.out.println("Result: " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        try {
            nameCheck(name);
        } catch (ExceptionDemo.FunnyNameException e) {
            System.out.println("Error: " + e.getMessage() );
        }


    }
}
