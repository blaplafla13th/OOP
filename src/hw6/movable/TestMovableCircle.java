package hw6.movable;

public class TestMovableCircle {
    public static void main(String[] args) {
        Movable circle = new MovableCircle(7, 2, 3, 4, 8);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
}
