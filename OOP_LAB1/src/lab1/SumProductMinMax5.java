package lab1;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int num1= input.nextInt();
        System.out.println("Enter 2nd integer");
        int num2= input.nextInt();
        System.out.println("Enter 3rd integer");
        int num3= input.nextInt();
        System.out.println("Enter 4th integer");
        int num4= input.nextInt();
        System.out.println("Enter 5th integer");
        int num5= input.nextInt();
        input.close();
        int sum=num1+num2+num3+num4+num5;
        int product=num1*num2*num3*num4*num5;
        //min
        int min=num1;
        if (min>num2){
            min=num2;
        }
        if (min>num3){
            min=num3;
        }
        if (min>num4){
            min=num4;
        }
        if (min>num5){
            min=num5;
        }
        //max
        int max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        if (max<num4){
            max=num4;
        }
        if (max<num5){
            max=num5;
        }

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
