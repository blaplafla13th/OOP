package hw1;

import java.util.Scanner;

public class PhoneKeyPadB {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a String:");

        inStr=input.next().toLowerCase();
        input.nextLine();
        inStrLen=inStr.length();

        for (int charIdx=0; charIdx<inStrLen; ++charIdx) {
            char temp = inStr.charAt(charIdx);
            switch (temp) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'r', 'q', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
                default -> System.out.print(1);
            }
        }
    }
}
