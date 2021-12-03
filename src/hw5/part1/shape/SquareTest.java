package hw5.part1.shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.setWidth(3);
        System.out.println(square);
        square.setLength(5);
        System.out.println(square.getSide());
        square.setSide(7);
        System.out.println(square.getLength());
        square = new Square(8);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square = new Square(5, "cyan", true);
        System.out.println(square);
    }
}
