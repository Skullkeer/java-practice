package Demo;

import java.util.Scanner;

public class UnmodularProgram {

    public static void grades(int[] marks1, String student) {
        int total1 = marks1[0] + marks1[1] + marks1[2];
        double average1 = total1 / 3.0;
        System.out.println(student + "'s total: " + total1);
        System.out.println(student + "'s average: " + average1);
        if (average1 >= 90) {
            System.out.println("Grade: A");
        } else if (average1 >= 80) {
            System.out.println("Grade: B");
        } else if (average1 >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose Student: ");
        String student = scanner.next();

        // Simulate entering 3 students
        String student1 = "Alice";
        int[] marks1 = {85, 90, 78};

        String student2 = "Bob";
        int[] marks2 = {70, 65, 72};

        String student3 = "Charlie";
        int[] marks3 = {88, 92, 95};

        if (student.equals("Alice")) {
            grades(marks1, student);
        }

        else if (student.equals("Bob")) {
            grades(marks2, student);
        }

        else if (student.equals("Charlie")) {
            grades(marks2, student);
        }
        else {
            System.out.println("No Such Student");

        }
    }
}
