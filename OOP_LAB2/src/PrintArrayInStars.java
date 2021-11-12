import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS=input.nextInt();
        items=new int[NUM_ITEMS];

        if (items.length>0) {
            System.out.print("Enter the value of all items (seperated by space): ");
            for (int i=0;i< items.length;++i){
                items[i]= input.nextInt();
            }
            System.out.println();
        }

        for (int i=0;i< items.length;++i){
            System.out.print(i+": ");
            for (int j=1;j<=items[i];++j){
                System.out.print(" *");
            }
            System.out.print(" ("+items[i]+")");
            System.out.println();
        }
    }
}

