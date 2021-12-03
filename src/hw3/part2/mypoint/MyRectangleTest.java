package hw3.part2.mypoint;

public class MyRectangleTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 3);
        MyPoint point2 = new MyPoint(5, 8);
        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        System.out.println(rectangle1);

        MyRectangle rectangle2 = new MyRectangle(1, 5, 8, 3);
        System.out.println(rectangle2);

        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle2.getArea());
    }
}
