package hw5.part2.point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
}
