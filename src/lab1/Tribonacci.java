package lab1;

public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        System.out.print("The first "+nMax+ " lab1.Tribonacci number are: 1 1 2 ");
        while(n <= nMax){
            fn=fnMinus1+fnMinus2+fnMinus3;
            ++n;
            System.out.print(fn+" ");
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }
    }
}

