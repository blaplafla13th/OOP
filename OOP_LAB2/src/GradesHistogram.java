import java.util.Scanner;

public class GradesHistogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numStudents;
        int[] grades;
        int[] countGrade = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        grades = new int[numStudents];

        if (numStudents > 0) {
            for (int i = 0; i < numStudents; ++i) {
                System.out.printf("Enter the grade for students %d: ", (i + 1));
                grades[i] = input.nextInt();
                while (i > 100 && i < 0) {
                    System.out.print("Invalid. Reinput");
                    grades[i] = input.nextInt();
                }
                countGrade[(grades[i] / 10 == 10) ? 9 : grades[i] / 10]++;
            }
        }

        System.out.println();
        for(int i = 0; i < countGrade.length; i++)
        {
            int delta = (i == countGrade.length - 1) ? 10 : 9;
            System.out.printf("%2d -%3d:", (i*10), (i*10+delta));
            for(int j = 0; j < countGrade[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int mod = -1;
        for (int i = 0; i < countGrade.length; i++)
            mod = (countGrade[i] > mod) ? countGrade[i] : mod;

        for (int i = mod; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < countGrade.length; j++) {
                    int delta = (j == countGrade.length - 1) ? 10 : 9;
                    System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
                }
            } else {
                for (int j = 0; j < countGrade.length; j++) {
                    String str = (countGrade[j] < i) ? " " : "*";
                    System.out.printf("%3s%-2s ", str, " ");
                }
            }
            System.out.println();
        }
    }
}
