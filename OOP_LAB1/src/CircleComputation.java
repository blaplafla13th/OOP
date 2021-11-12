import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius;
        double diameter;
        double circumference;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ") ;
        radius = input.nextDouble();
        diameter = 2.0*radius;
        area = Math.PI*radius*radius;
        circumference = 2.0*Math.PI*radius;
        System.out.printf("Radius: %.2f\nDiameter: %.2f\nArea: %.2f\nCircumference: %.2f",radius,diameter,circumference,area);
    }
}
