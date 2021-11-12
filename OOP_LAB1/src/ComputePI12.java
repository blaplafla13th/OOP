public class ComputePI12 {
    public static void main(String args[]){
        int MAX_TERM = 10000;
        double sum = 0.0;
        for(int term = 1; term <= MAX_TERM; term++){
            if(term % 2 == 1){
                sum += (double)1/(term*2 - 1);
            }
            else {
                sum -= (double)1/(term*2 - 1);
            }
        }
        double pi = 4 * sum;
        System.out.println("Pi: " +pi);
        System.out.println("compare the values obtained and the Math.PI, in percents of Math.PI: " +(pi/Math.PI)*100);
    }
}
