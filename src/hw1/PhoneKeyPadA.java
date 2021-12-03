package hw1;

import java.util.Scanner;

public class PhoneKeyPadA {
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
            if (temp == 'a' || temp == 'b' || temp == 'c')
                System.out.print(2);
            else if (temp == 'd' || temp == 'e' || temp == 'f')
                System.out.print(3);
            else if (temp == 'g' || temp == 'h' || temp == 'i')
                System.out.print(4);
            else if (temp == 'j' || temp == 'k' || temp == 'l')
                System.out.print(5);
            else if (temp == 'm' || temp == 'n' || temp == 'o')
                System.out.print(6);
            else if (temp == 'p' || temp == 'q' || temp == 'r' || temp == 's')
                System.out.print(7);
            else if (temp == 't' || temp == 'u' || temp == 'v')
                System.out.print(8);
            else if (temp == 'w' || temp == 'x' || temp == 'y' || temp == 'z')
                System.out.print(9);
            else if (temp <= '0' && temp >= '9')
                System.out.print(temp);
            else
                System.out.print(1);
        }
    }
}
