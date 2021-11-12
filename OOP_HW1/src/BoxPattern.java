import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        printBoxPatternA(size);
        printBoxPatternB(size);
        printBoxPatternC(size);
        printBoxPatternD(size);
    }

    public static void printBoxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || col == 1 || col == size || row == size)
                    System.out.print("# ");
                else System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printBoxPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || col == row || row == size)
                    System.out.print("# ");
                else System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printBoxPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || col - 1 == size - row || row == size)
                    System.out.print("# ");
                else System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }

    public static void printBoxPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || col - 1 == size - row || row == size || col == row)
                    System.out.print("# ");
                else System.out.print("  ");
            System.out.println();
        }
        System.out.println();
    }
}
