public class SumAverageRunningInt4 {
    public static void main (String[] arg) {

        int sum = 0 ;
        double average ;
        final int LOWERBOUND = 111 ;
        final int UPPERBOUND = 8899;
        int count=0;
        for ( int number = LOWERBOUND; number <= UPPERBOUND; ++ number ) {
            sum += number ;
            count++;
        }
        average=sum/count;
        System.out.println("The sum of 111 to 8899 is "+sum);
        System.out.println("The average is "+average);
    }
}
