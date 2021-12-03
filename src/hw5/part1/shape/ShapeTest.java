package hw5.part1.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("purple");
        System.out.println(shape.getColor());
        shape.setFilled(false);
        System.out.println(shape.isFilled());
        Shape shape1 = new Shape("green", false);
        System.out.println(shape1);
    }
}
