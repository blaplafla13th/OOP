package lab1;

public class ComputerPI {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 100000000;
        double sum = 0.0;
        for(double denominator = 1;denominator<=MAX_DENOMINATOR;denominator+=2){
            if(denominator%4 == 1){
                sum += 1/denominator;
            }
            else if(denominator%4 == 3){
                sum -= 1/denominator;
            }
            else{
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("Pi: " +(4*sum));
    }
}
