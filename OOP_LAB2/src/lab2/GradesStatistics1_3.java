package lab2;

import java.util.Scanner;

public class GradesStatistics1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int numStudents;
        int minimum = 101;
        int maximum = -1;
        double sum = 0;
        double average = 0.0;
        int[] grades;

        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        grades = new int[numStudents];

        if (numStudents > 0) {
            for (int i = 0; i < numStudents; ++i) {
                System.out.printf("Enter the grade for students %d: ", (i+1));
                grades[i] = input.nextInt();
                while (i > 100 && i < 0) {
                    System.out.print("Invalid. Reinput: ");
                    grades[i] = input.nextInt();
                }
                if (grades[i] > maximum)
                    maximum = grades[i];
                if (grades[i] < minimum)
                    minimum = grades[i];
                sum += grades[i];
            }

            average = sum / numStudents;

            System.out.printf("The average is: %2.2f\nThe minimum is: %d\nThe maximum is: %d", average, minimum, maximum);
        }
    }
}
