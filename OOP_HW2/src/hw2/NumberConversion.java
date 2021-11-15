package hw2;

import java.util.Scanner;

public class NumberConversion {
    public static final String HEX_STRING = "0123456789abcdef";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inStr;
        int inRadix = 0;
        int outRadix = 0;

        System.out.print("Enter a number and radix:");
        inStr = input.nextLine();

        System.out.print("Enter the input radix:");
        inRadix = input.nextInt();
        while (inRadix > 16 || inRadix < 2) {
            System.out.print("Invalid.Enter the radix: ");
            inRadix = input.nextInt();
        }

        if (!radixCheck(inStr, inRadix)) {
            System.out.print("Wrong radix");
            System.exit(0);
        }

        System.out.print("Enter the output radix:");
        outRadix = input.nextInt();
        while (inRadix > 16 || inRadix < 2) {
            System.out.print("Invalid.Enter the radix: ");
            outRadix = input.nextInt();
        }

        System.out.print("\"" + inStr + "\" in radix " + inRadix + " is \""
                + toRadix(inStr, inRadix, outRadix) + "\" in radix " + outRadix + ".");
    }

    public static boolean radixCheck(String inStr, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
            if (HEX_STRING.indexOf(inStr.charAt(i)) >= radix || HEX_STRING.indexOf(inStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String toRadix(String inStr, int inRadix, int outRadix) {
        int number = radixN2Dec(inStr, inRadix);
        String result = "";
        while (number > 0) {
            char radix = HEX_STRING.charAt(number % outRadix);
            result = radix + result;
            number /= outRadix;
        }
        return result;
    }

    public static int radixN2Dec(String inStr, int radix) {
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            int digit = HEX_STRING.indexOf(inStr.charAt(i));
            result += digit * Math.pow(radix, (inStr.length() - 1 - i));
        }
        return result;
    }
}
