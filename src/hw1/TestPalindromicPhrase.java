package hw1;

import java.util.Scanner;

public class TestPalindromicPhrase {

	public static void main(String[] args) {
		String inStr;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Word or Phrase: ");
		inStr = input.nextLine();

		if (testPalindromicWord(inStr)) {
			System.out.printf("\"%s\" is a palindrome", inStr);
		}else {
			System.out.printf("\"%s\" is not a palindrome", inStr);
		}
	}
	public static boolean testPalindromicWord(String inStr) {
		inStr = inStr.toLowerCase();
		inStr = inStr.trim();
		inStr = inStr.replaceAll("[^a-z]","");
		int fldx = 0;
		int bldx = inStr.length() - 1;
		while (fldx < bldx) {
			char forwardChar = inStr.charAt(fldx);
			char backwarChar = inStr.charAt(bldx);
			if (forwardChar != backwarChar) {
				return false;
			}
			fldx++;
			bldx--;
		}
		return true;
	}

}
