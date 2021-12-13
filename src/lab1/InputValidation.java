package lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int numberIn;
            boolean isValid;
            isValid = false;
            do {
                System.out.print("Enter the number between 0−10 or 90−100: ");
                numberIn = input.nextInt();
                if (!(numberIn > 0 && numberIn < 10) && !(numberIn < 100 && numberIn>90)){
                    System.out.println("Invalid input , try again ...");
                }
                else isValid=true;
            }while (!isValid);
        System.out.println("You have entered :"+numberIn);
    }
}

