package q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String day = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day of Week Number: ");
        int dayNum = scanner.nextInt();

        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a Valid Day of the Week! Choose a Number 1 - 7.";

        }
        System.out.println(day);
    }
}
