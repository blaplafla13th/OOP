package hw1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String inStr;
        int inStrLen;
        StringBuilder outStr= new StringBuilder();

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a String:");

        inStr=input.next();
        input.nextLine();
        inStrLen=inStr.length();

        for (int charIdx=inStrLen-1; charIdx>=0; --charIdx){
            outStr.append(inStr.charAt(charIdx));
        }

        System.out.println("The reverse of string \""+inStr+"\""+" is \""+outStr+"\".");
    }
}
