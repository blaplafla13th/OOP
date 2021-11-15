package hw1;

import java.util.Scanner;

public class RadixN2DecRewrite {
    public static final String HEX_STRING = "0123456789abcdef";

    public static void main(String[] args) {
        int radix = 0;
        String inStr;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        radix = input.nextInt();
        while (radix > 16 || radix < 2 || radix == 10) {
            System.out.print("Invalid.Enter the radix: ");
            radix = input.nextInt();
        }

        System.out.print("Enter the string: ");
        inStr = input.next().toLowerCase();
        input.nextLine();
        while (!radixCheck(inStr, radix)) {
            System.out.print("Invalid.Enter the string: ");
            inStr = input.next().toLowerCase();
            input.nextLine();
        }
        int out = radixN2Dec(inStr, radix);
        System.out.printf("The equivalent decimail number for binary \"%s\" is: %d", inStr, out);
    }

    public static boolean radixCheck(String inStr, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
            if (HEX_STRING.indexOf(inStr.charAt(i)) >= radix || HEX_STRING.indexOf(inStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
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
