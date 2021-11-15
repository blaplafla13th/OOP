package hw1;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int numRows = input.nextInt();
        printHillPatternA(numRows);
        printHillPatternB(numRows);
        printHillPatternC(numRows);
        printHillPatternD(numRows);
    }

    public static void printHillPatternA(int numRows) {
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternB(int numRows) {
        for (int row = 0; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if (col <= 2 * numRows - 1 - row && col > row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternC(int numRows) {

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if (col <= 2 * numRows - 1 - row && col > row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternD(int numRows) {

        for (int col = 1; col <= 2 * numRows - 1; col++)
            System.out.print("# ");

        System.out.println();

        for (int row = 1; row < numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1))
                    System.out.print("  ");
                else
                    System.out.print("# ");
            System.out.println();
        }

        for (int row = 2; row < numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++)
                if (col <= 2 * numRows - 1 - row && col > row)
                    System.out.print("  ");
                else
                    System.out.print("# ");
            System.out.println();
        }

        for (int col = 1; col <= 2 * numRows - 1; col++)
            System.out.print("# ");

        System.out.println();
    }
}
