package hw3.part2.mypoint;

public class MyCircleTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 3);

        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(point1, 5);
        MyCircle circle3 = new MyCircle(2, 7, 8);

        System.out.println(circle1);

        circle2.setRadius(3);
        System.out.println(circle2.getRadius());

        System.out.println(circle1.getCenter());
        circle1.setCenter(point2);
        System.out.println(circle1.getCenter());

        System.out.println(circle3.getCenterX());
        circle3.setCenterX(8);
        System.out.println(circle3.getCenterX());

        System.out.println(circle2.getCenterY());
        circle2.setCenterY(8);
        System.out.println(circle2.getCenterY());

        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);
        circle1.setCenterXY(8, 6);
        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);

        System.out.println(circle3.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(circle1.distance(circle3));
    }
}
