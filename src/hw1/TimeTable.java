package hw1;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=input.nextInt();
        System.out.printf("   * |\t ");
        for(int col=1;col<=size;col++){
            System.out.printf("%4d \t",col);
        }
        System.out.printf("\n");
        for(int col=1;col<=3*size;col++){
            System.out.printf("-- ");
        }
        System.out.printf("\n");
        for (int row=1;row<=size;row++){
            System.out.printf("%4d |\t ",row);
            for(int col=1;col<=size;col++){
                int product=row*col;
                System.out.printf("%4d \t",product);
            }
            System.out.printf("\n");
        }
    }
}
