import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int exp;

        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the exponent: ");
        exp = input.nextInt();

        System.out.printf("%d raises to the power of %d: %d", base, exp, exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product=1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
