package hw3.part2.mypoint;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint();
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point1.distance(1, 3));
        System.out.println(point1.distance());
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        point1.setX(6);
        point1.setY(7);
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        point2.setXY(3, 7);
        System.out.println(point2);
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
    }
}
