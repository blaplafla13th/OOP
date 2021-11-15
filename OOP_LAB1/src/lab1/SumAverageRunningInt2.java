package lab1;

public class SumAverageRunningInt2 {
    public static void main (String[] arg) {

        int sum = 0 ;
        double average ;
        final int LOWERBOUND = 1 ;
        final int UPPERBOUND = 100;
        int number=LOWERBOUND;
        do{
            sum += number;
            number++;
        }while(number<=UPPERBOUND);
        average=sum/UPPERBOUND;
        System.out.println("The sum of 1 to 100 is "+sum);
        System.out.println("The average is "+average);
    }
}
