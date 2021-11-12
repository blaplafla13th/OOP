import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {
		String inStr;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		inStr = input.next().toUpperCase();
		if (checkHex(inStr)) {
			System.out.printf("\"%s\" is a hex String", inStr);
		} else {
			System.out.printf("\"%s\" is NOT a hex String", inStr);
		}
	}

	public static boolean checkHex(String inStr) {
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
				return false;
			}
		}
		return true;
	}

}
