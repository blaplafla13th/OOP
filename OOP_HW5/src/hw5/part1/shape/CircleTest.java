package hw5.part1.shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3);
        System.out.println(circle);
        circle = new Circle(3, "blue", false);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
