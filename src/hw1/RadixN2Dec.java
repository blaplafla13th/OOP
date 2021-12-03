package hw1;

import java.util.Scanner;

public class RadixN2Dec {

	public static void main(String[] args) {
		int radix;
		String inStr;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radix: ");
		radix = input.nextInt();
		System.out.print("Enter the string: ");
		inStr = input.next().toLowerCase();
		input.nextLine();
		if(radix == 2) {
			Bin2Dec(inStr);
		}
		else if(radix == 8) {
			Oct2Dec(inStr);
		}
		else if(radix == 16) {
			Hex2Dex(inStr);
		}else {
			System.out.print("Not the radix");
		}
	}

	public static void Bin2Dec(String inStr) {
		int num = 0;
		boolean tag = true;

		for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
			char inChar = inStr.charAt(charIdx);
			if (inChar == '1') {
				num =  num + (int) Math.pow(2, inStr.length() - charIdx - 1);
			} else if (inChar == '0') {
			} else if (inChar != 0 || inChar != 1) {
				tag = false;
				break;
			}
		}

		if (tag) {
			System.out.printf("The equivalent decimail number for binary \"%s\" is: %d", inStr, num);
		} else {
			System.out.printf("erroi: invalid binary string \"%s\"\n", inStr);
		}
	}

	public static void Oct2Dec(String inStr) {
		int num = 0;

		for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
			char c = inStr.charAt(charIdx);
			num = num * 8 + Character.getNumericValue(c);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d", inStr, num);
	}
	
	public static void Hex2Dex(String inStr) {
		String hexCode = "0123456789ABCDEF";
		int num = 0;
		boolean tag = true;
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			int n = hexCode.indexOf(inStr.charAt(charIdx));
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 16 + n;
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, num);
		} else {
			System.out.printf("error: invalid hexadecimal string \"%s\"",inStr);
		}
	}

}
