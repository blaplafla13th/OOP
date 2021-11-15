package hw2;

import java.util.Scanner;

public class NumberGuest {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random()*100);
        int inputNumber;
        int trailsCount=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Key in your guess:");
        inputNumber=input.nextInt();
        while (inputNumber!=SECRET_NUMBER){
            System.out.println((inputNumber>SECRET_NUMBER)?"Try Lower":"Try Higher");
            trailsCount++;
            inputNumber=input.nextInt();
        }
        System.out.printf("You got it in %d trails!",trailsCount);
    }
}
