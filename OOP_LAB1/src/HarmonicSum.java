public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR=50000;
        double sumL2R=0.0;
        double sumR2L=0.0;
        double absDiff;
        for (double denominator=1;denominator<=MAX_DENOMINATOR; ++denominator){
            sumL2R+=1/denominator;
        }System.out.println("The sum from left to right is "+sumL2R);
        for (double denominator=MAX_DENOMINATOR;denominator>0; --denominator){
            sumR2L+=1/denominator;
        }System.out.println("The sum from right to left is "+sumR2L);
        if (sumL2R>sumR2L){
            System.out.println("The sum from left to right is bigger than The sum from right to left");
        }
        else if (sumL2R<sumR2L) {
            System.out.println("The sum from right to left is bigger than The sum from left to right");
        }
        else System.out.println("The sum from right to left is equal The sum from left to right");
    }
}
