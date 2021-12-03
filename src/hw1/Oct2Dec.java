package hw1;

import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {

		String inStr;
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Octal string: ");
		inStr = input.next();
		
		for(int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
			char c = inStr.charAt(charIdx); 
			num = num*8 + Character.getNumericValue(c);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d",inStr ,num);
	}

}
