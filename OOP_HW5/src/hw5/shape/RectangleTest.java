package hw5.shape;

import java.util.SortedMap;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setWidth(5);
        rectangle.setLength(6);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 3.4, "green", false);
        System.out.println(rectangle);
    }
}
