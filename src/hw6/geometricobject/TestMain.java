package hw6.geometricobject;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(3);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject rectangle = new Rectangle(3, 6);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

}
