package hw6.part1.resizable;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(8);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
