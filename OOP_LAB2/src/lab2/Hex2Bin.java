package lab2;

import java.util.Scanner;

public class Hex2Bin {

    static final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111", ""};
    static final String HEX_CHAR = "0123456789ABCDEF ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String inHex = input.nextLine().toUpperCase();

        if (!isValidHex(inHex)) {
            System.out.print("Invalid Input");
        } else {
            System.out.print("The equivalent binary for hexadecimal " + inHex + " is:");
            for (int i = 0; i < inHex.length(); ++i) {
                char hexChar = inHex.charAt(i);
                int binStIndex = HEX_CHAR.indexOf(hexChar);
                System.out.print(" " + HEX_BITS[binStIndex]);
            }
        }
    }

    static boolean isValidHex(String inHex) {
        if (inHex.length() == 0)
            return false;

        int lengthInHex = inHex.length();
        for (int i = 0; i < lengthInHex; ++i) {
            int binStIndex = HEX_CHAR.indexOf(inHex.charAt(i));
            if (binStIndex == -1) {
                return false;
            }
        }
        return true;
    }
}

