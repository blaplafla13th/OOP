package hw2;

public class GCD {
    public static void main(String[] args) {
        int a = 14;
        int b = 11;
        System.out.printf("gcd(%d,%d) is %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
