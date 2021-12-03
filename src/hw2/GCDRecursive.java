package hw2;

public class GCDRecursive {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        System.out.printf("gcd(%d,%d) is %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a == 0) return a;
        else if (b == 0) return b;
        else if (a == b) return a;
        else return (a > b) ? gcd((a - b), b) : gcd(a, (b - a));
    }
}
