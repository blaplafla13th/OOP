package hw2;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int UPPER_BOUND;
        int count=0;
        double percent;

        System.out.print("Enter the upper bound: ");
        UPPER_BOUND = input.nextInt();

        System.out.println("These number are prime: ");
        for (int i = 1; i <= UPPER_BOUND; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        percent = (double) count / UPPER_BOUND * 100;
        System.out.printf("\n[%d perfect numbers found (%2.2f%%)]\n",
                count, percent);
    }

    public static boolean isPrime(int num) {
        if (num<=1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
