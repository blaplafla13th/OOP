package lab2;

import java.util.Scanner;

public class GradesStatistics2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numStudents;
        int minimum = 101;
        int maximum = -1;
        double sum = 0;
        double average;
        double median;
        double standardDeviation;
        int[] grades;

        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        grades = new int[numStudents];

        if (numStudents > 0) {
            for (int i = 0; i < numStudents; ++i) {
                System.out.printf("Enter the grade for students %d: ", (i + 1));
                grades[i] = input.nextInt();
                while (grades[i] > 100 && grades[i] < 0) {
                    System.out.print("Invalid. Reinput: ");
                    grades[i] = input.nextInt();
                }
                if (grades[i] > maximum)
                    maximum = grades[i];
                if (grades[i] < minimum)
                    minimum = grades[i];
            }
            average = calcAvg(grades);
            median = calcMedian(grades);
            standardDeviation = calcStandardDeviatation(grades);
            System.out.print("The grades are: ");
            print(grades);
            System.out.println();
            System.out.printf("The average is: %2.2f\nThe median is: %2.2f\n" +
                            "The minimum is: %d\nThe maximum is: %d" +
                            "\nThe standard deviatation is: %.2f",
                    average, median, minimum, maximum, standardDeviation);
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
    }

    public static double calcMedian(int[] array) {
        int n = array.length;
        sortArray(array);
        if (n % 2 != 0)
            return array[n / 2];
        return (double) (array[(n - 1) / 2] + array[n / 2]) / 2.0;
    }

    public static double calcAvg(int[] array) {
        if (array.length == 0) return 0;
        double sum = 0.0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        return sum / array.length;
    }

    public static double calcStandardDeviatation(int[] array) {
        int n = array.length;
        double avg = calcAvg(array);
        double standardDeviation=0.0;
        for (int i = 0; i < n; i++) {
            standardDeviation = standardDeviation + Math.pow((array[i] - avg), 2);
        }
        standardDeviation = Math.sqrt(standardDeviation / n);
        return standardDeviation;
    }

    static void print(int[] array) {
        if (array.length == 1) System.out.print("[" + array[0] + "]");
        else
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else if (i == array.length - 1) {
                    System.out.print(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
    }
}
