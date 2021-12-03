package hw6.movable;

public class TestMovablePoint {
    public static void main(String[] args) {
        Movable point = new MovablePoint(7, 2, 3, 4);
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
    }
}
