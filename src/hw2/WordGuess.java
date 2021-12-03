package hw2;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        //args=new String[1];
        //args[0]="Lorem Ipsum";
        final String SECRET=args[0].toUpperCase();
        final char[] answer = SECRET.toUpperCase().toCharArray();
        int[] status = new int[answer.length];
        int turn = 1;
        String guest = "";
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < status.length; i++) {
            status[i] = 0;
        }

        while (!guest.equals(SECRET)) {
            System.out.print("Key in one character or your guess word: ");

            guest = input.nextLine().toUpperCase();
            if (guest.length() == 1) {
                for (int i = 0; i < answer.length; i++)
                    if (guest.charAt(0) == answer[i])
                        status[i] = 1;
            } else if (guest.equals(SECRET))
                break;
            else if (!guest.equals(SECRET))
                System.out.println("Wrong");

            System.out.printf("Trail %d: ", turn);

            for (int i = 0; i < status.length; i++)
                System.out.printf("%c", (status[i] == 1) ? answer[i] : '_');

            System.out.println();
            turn++;
        }
        System.out.printf("Congratulation!\nYou got in %d trails", turn);
    }
}
