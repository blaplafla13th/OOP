package lab1;

public class SumAverageRunningInt5 {
    public static void main(String[] arg) {

        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number * number;
        }
        System.out.println("The sum of the squres of all numbers from 1 to 100 is " + sum);
    }
}
