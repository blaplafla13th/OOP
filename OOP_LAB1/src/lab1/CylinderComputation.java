package lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ") ;
        radius = input.nextDouble();
        System.out.print("Enter the height: ") ;
        height = input.nextDouble();
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
        double volume = baseArea * height;
        System.out.printf("Base Area: %.2f\nSurface Area: %.2f\nVolume: %.2f",baseArea,surfaceArea,volume);
    }
}
