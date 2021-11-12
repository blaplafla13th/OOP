public class Factorial {
    public static void main(String[] args) {
        int n=20;
        long factorial=1;
        //with factorial use int type max n=13
        //with factorial use max type max n=20
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }

        System.out.println("The Factorial of "+n+" is "+factorial);
    }
}
