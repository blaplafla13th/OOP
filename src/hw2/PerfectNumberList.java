package hw2;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int UPPER_BOUND;
        int[] perfectNumberList = new int[0];
        int[] perfectNorDeficentNumberList = new int[0];
        double percent;

        System.out.print("Enter the upper bound: ");
        UPPER_BOUND = input.nextInt();

        for (int i = 1; i <= UPPER_BOUND; i++) {
            if (isPerfect(i)) {
                perfectNumberList = copyOf(perfectNumberList,
                        perfectNumberList.length + 1);
                perfectNumberList[perfectNumberList.length - 1] = i;
            } else if (!isDeficient(i)) {
                perfectNorDeficentNumberList = copyOf(perfectNorDeficentNumberList,
                        perfectNorDeficentNumberList.length + 1);
                perfectNorDeficentNumberList[perfectNorDeficentNumberList.length - 1] = i;
            }
        }

        System.out.println("These number are perfect: ");
        for (int i = 0; i < perfectNumberList.length; i++)
            System.out.print(perfectNumberList[i] + " ");
        percent = (double) perfectNumberList.length / UPPER_BOUND * 100;
        System.out.printf("\n[%d perfect numbers found (%2.2f%%)]\n",
                perfectNumberList.length, percent);

        System.out.println("These number are neither deficient or perfect: ");
        for (int i = 0; i < perfectNorDeficentNumberList.length; i++)
            System.out.print(perfectNorDeficentNumberList[i] + " ");
        percent = (double) perfectNorDeficentNumberList.length / UPPER_BOUND * 100;
        System.out.printf("\n[%d perfect numbers found (%2.2f%%)]\n",
                perfectNorDeficentNumberList.length, percent);
    }

    public static boolean isPerfect(int num) {
        if (num<=0) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] cloneOfArray = new int[newLength];
        for (int i = 0; i < array.length; i++)
            cloneOfArray[i] = array[i];
        for (int i = array.length; i < newLength; i++)
            cloneOfArray[i] = 0;
        return cloneOfArray;
    }
}
