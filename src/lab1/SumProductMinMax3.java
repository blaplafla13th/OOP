package lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int num1= input.nextInt();
        System.out.println("Enter 2nd integer");
        int num2= input.nextInt();
        System.out.println("Enter 3rd integer");
        int num3= input.nextInt();
        input.close();
        int sum=num1+num2+num3;
        int product=num1*num2*num3;
        int min=num1;
        if (min>num2){
            min=num2;
        }
        if (min>num3){
            min=num3;
        }
        int max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
