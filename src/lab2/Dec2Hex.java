package lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int number = input.nextInt();
        System.out.print("The equivalent hexadecimal number is:" + d2h(number));

    }

    public static String d2h(int n) {
        StringBuilder hexString = new StringBuilder();

        int i = 0;
        while (n != 0) {
            int temp;
            temp = n % 16;
            if (temp < 10) {
                hexString.append((char) (temp + 48));
            } else {
                hexString.append((char) (temp + 55));
            }
            i++;
            n = n / 16;
        }
        return hexString.toString();
    }
}
