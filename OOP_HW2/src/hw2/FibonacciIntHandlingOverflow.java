package hw2;

public class FibonacciIntHandlingOverflow {
    public static void main(String[] args) {
        int first =0;
        int second =1;
        int i;
        for(i = 2; Integer.MAX_VALUE- second > first ; i++)
        {
            int c = first + second;
            first = second;
            second = c;
            System.out.printf("f(%d) = %d\n",(i-2), first);
        }
        System.out.printf("f(%d) = %d \n",(i-2), second);
        System.out.printf("f(%d) is out of range",(i-1));
    }
}
