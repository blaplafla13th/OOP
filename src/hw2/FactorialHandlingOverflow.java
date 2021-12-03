package hw2;

public class FactorialHandlingOverflow {
    public static void main(String[] args) {
        factorialInt();
        factorialLong();
    }

    public static void factorialLong() {
        long i = 0;
        long factorial = 1;
        while (Long.MAX_VALUE / factorial > (i + 1)) {
            i++;
            factorial *= i;
            System.out.printf("The factorial of %d is %d\n", i, factorial);
        }
        System.out.printf("The factorial of %d is out of range\n\n", (i + 1));
    }

    public static void factorialInt() {
        int i = 0;
        int factorial = 1;
        while (Integer.MAX_VALUE / factorial > (i + 1)) {
            i++;
            factorial *= i;
            System.out.printf("The factorial of %d is %d\n", i, factorial);
        }
        System.out.printf("The factorial of %d is out of range\n\n", (i + 1));
    }
}
