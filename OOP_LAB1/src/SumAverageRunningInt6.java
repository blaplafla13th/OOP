public class SumAverageRunningInt6 {
    public static void main(String[] arg) {

        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
        System.out.println("Sum even= " + sumEven);
        System.out.println("Sum odd= " + sumOdd);
        System.out.println("Absolute difference= " + absDiff);
    }
}
