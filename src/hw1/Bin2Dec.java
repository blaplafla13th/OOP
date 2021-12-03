package hw1;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {

		String inStr;
		int result = 0;
		boolean tag = true;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Binary string: ");
		inStr = input.next();


		for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
			char inChar = inStr.charAt(charIdx);
			if (inChar == '1') {
				result =  result + (int) Math.pow(2, inStr.length() - charIdx - 1);
			} else if (inChar == '0') {
			} else if (inChar != 0 || inChar != 1) {
				tag = false;
				break;
			}
		}

		if (tag) {
			System.out.printf("The equivalent decimal number for binary \"%s\" is: %d", inStr, result);
		} else {
			System.out.printf("error: invalid binary string \"%s\"\n", inStr);
		}
	}

}
