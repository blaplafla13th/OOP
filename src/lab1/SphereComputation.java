package lab1;

import java.util.Scanner;
public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ") ;
        radius = input.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
        System.out.printf("Surface Area: %.2f\nVolume: %.2f",surfaceArea,volume);
    }
}
