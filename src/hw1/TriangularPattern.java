package hw1;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        printTriangularPatternA(size);
        printTriangularPatternB(size);
        printTriangularPatternC(size);
        printTriangularPatternD(size);
    }

    public static void printTriangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row + col >= size + 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row <= col)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row + col <= size + 1)
                    System.out.print("# ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row >= col)
                    System.out.print("# ");
            System.out.println();
        }
        System.out.println();
    }
}
