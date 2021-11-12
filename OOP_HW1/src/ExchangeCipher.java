import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		Scanner input = new Scanner(System.in);
		String outStr="";
		System.out.print("Enter a plaintext string: ");

		inStr = input.next().toUpperCase();
		input.nextLine();
		inStrLen = inStr.length();

		for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
			char temp = (char) ('A'+'Z'-inStr.charAt(charIdx));
			outStr+=temp;
		}
		System.out.println("The plain text String is: "+outStr);
	}

}
