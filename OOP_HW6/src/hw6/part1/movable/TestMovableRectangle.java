package hw6.part1.movable;

public class TestMovableRectangle {
    public static void main(String[] args) {
        Movable rectangle = new MovableRectangle(7, 2, 3, 4, 2, 5);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
