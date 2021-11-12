import java.util.Scanner;

public class CeasarCode {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner input = new Scanner(System.in);
        String outStr="";
        System.out.print("Enter a plain text String: ");

        inStr = input.next().toUpperCase();
        input.nextLine();
        inStrLen = inStr.length();

        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            char temp = (char) (inStr.charAt(charIdx)+3);
            if ((int) temp>88) temp= (char) ( (int) temp -(int)'Z' +(int)'A');
            outStr+=temp;

        }
        System.out.println("The ciphertext string is: "+outStr);
    }
}
