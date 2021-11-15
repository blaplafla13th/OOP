package hw2;

public class TribonacciIntHandlingOverflow {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third = 1;
        int i;
        for (i = 3; Integer.MAX_VALUE - third > second; i++) {
            int current = first + second + third;
            first = second;
            second = third;
            third = current;
            System.out.printf("f(%d) = %d\n", (i - 3), first);
        }
        System.out.printf("f(%d) = %d\n", (i - 2), second);
        System.out.printf("f(%d) is out of range", (i - 1));
    }
}
