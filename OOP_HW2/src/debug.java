import java.util.*;

class WordGues {
    public static void main(String[] args) {

        String INPUT = "Ldsvbbdvd";
        INPUT=INPUT.toUpperCase();
        final char[] answer = INPUT.toUpperCase().toCharArray();
        int[] status = new int[answer.length];
        int turn = 1;
        String word = "";
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < status.length; i++) {
            status[i] = 0;
        }

        while (!word.equals(INPUT)) {
            System.out.print("Key in one character or your guess word: ");

            word = in.nextLine().toUpperCase();
            if (word.length() == 1) {
                for (int i = 0; i < answer.length; i++)
                    if (word.charAt(0) == answer[i])
                        status[i] = 1;
            } else if (!word.equals(INPUT)) {
                System.out.println("Wrong");
            } else if (word.equals(INPUT) && word.length() > 1) {
                break;
            }

            System.out.printf("Trail %d: ", turn);

            for (int i = 0; i < status.length; i++)
                System.out.printf("%c", (status[i] == 1) ? answer[i] : '_');

            turn++;
            System.out.println();
        }
        System.out.printf("Congratulation!\nYou got in %d trails", turn);
    }
}
