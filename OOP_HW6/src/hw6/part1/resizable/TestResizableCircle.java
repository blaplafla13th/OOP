package hw6.part1.resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject resizableCircle = new ResizableCircle(5);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        ((ResizableCircle) resizableCircle).resize(8);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
    }
}
