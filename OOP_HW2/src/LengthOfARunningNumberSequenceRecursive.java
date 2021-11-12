public class LengthOfARunningNumberSequenceRecursive {
    public static void main(String[] args) {
        int n = 100;
        System.out.printf("f(%d) length: %d", n, len(n));
    }

    public static int len(int n) {
        return (n == 1) ? 1 : (len(n - 1) + numOfDigits(n));
    }

    public static int numOfDigits(int n) {
        int num = 1;
        while (n / 10 > 0) {
            n /= 10;
            num++;
        }
        return num;
    }
}
