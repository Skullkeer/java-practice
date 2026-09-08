/*
 * Java submission file
 *
 * ITEM 2 (PRACTICE - TERTIARY) - QUESTION 2
 *
 * Provide your responses for Q2 here.
 * Unless otherwise indicated, no other files will be assessed for this question.
 *
 * If you delete a file or it is otherwise missing from your submission,
 * you will automatically score 0 for the question.
 * If you think you are missing a file, ask your teacher for help.
 *
 * Test your code! Read any errors reported by the compiler or runtime and fix them.
 * ** Code which does not compile or throws unhandled exceptions will be heavily penalized! **
 *
 * Avoid the use of any imports/libraries which were not covered in our lesson notes.
 * When in doubt about whether you can include something, ask your teacher.
 *
 * Comment your code if it helps you, but only working code will earn marks.
 * Do your best to write a functional program, even if it is not perfect.
 *
 * When writing your Java program, prioritize:
 * 1. Correctness - the program should do what is required by the question
 * 2. Simplicity - do not use a more complex technique when a simpler one will do
 * 3. Style - natural naming for variables and methods, appropriate indentation, etc.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2a {

    static int readPriority(Scanner input) {
        while (true) {
            try {
                System.out.print("Enter Priority: ");
                int priority = input.nextInt();
                if (priority > 0 && priority < 6) {
                    System.out.println("Succesful Input!");
                    return priority;
                } else {
                    System.out.print("Invalid Priority (Input Int 1 - 5)\n");
                    continue;
                }

            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Enter a Integer!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readPriority(scanner);
    }
}
