public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 3;
        System.out.printf("f(%d) is %d", n, fibonacci(n));
    }

    public static int fibonacci(int n) {
        return (n == 0) ? 0 : (n == 1) ? 1 : (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

