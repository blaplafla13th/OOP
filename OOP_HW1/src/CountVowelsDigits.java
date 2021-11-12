import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        int vowels=0;
        double percentsOfVowels=0;
        int digits=0;
        double percentsOfDigits=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a String:");

        inStr=input.next().toLowerCase();
        input.nextLine();
        inStrLen=inStr.length();

        for (int charIdx=inStrLen-1; charIdx>=0; --charIdx){
            char temp=inStr.charAt(charIdx);
            if (temp=='u'||temp=='e'||temp=='o'||temp=='a'||temp=='i'){
                vowels++;
                percentsOfVowels+=100.0/inStrLen;
            }
            else if (temp>='0'&&temp<='9'){
                digits++;
                percentsOfDigits+=100.0/inStrLen;
            }
        }
        System.out.printf("Number of Vowels: %d (%2.2f%%)\nNumber of Digits: %d (%2.2f%%)",vowels,percentsOfVowels,digits,percentsOfDigits);
    }
}
