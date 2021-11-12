import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=input.nextInt();
        for (int row=1;row<2*size;row++){
            for (int col=1;col<2*size;col++){
                if ((col+row)%2==0){
                    System.out.print("# ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
