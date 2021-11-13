package hw5.part2.circle;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getBase().getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getBase().getColor()
                + ", Base area is " + cy1.getBase().getArea()
                + ", Volume is " + cy1.getVolume()
                + ", surface area=" + cy1.getArea());

        Circle circle = new Circle(3);
        cy1.setBase(circle);
        System.out.println("Radius is " + cy1.getBase().getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getBase().getColor()
                + ", Base area is " + cy1.getBase().getArea()
                + ", Volume is " + cy1.getVolume()
                + ", surface area=" + cy1.getArea());

        Cylinder cy2 = new Cylinder(circle,5);
        System.out.println("Radius is " + cy2.getBase().getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getBase().getColor()
                + ", Base area is " + cy2.getBase().getArea()
                + ", Volume is " + cy2.getVolume()
                + ", surface area=" + cy2.getArea());

        Cylinder cy3 = new Cylinder(2,5);
        System.out.println("Radius is " + cy3.getBase().getRadius()
                + ", Height is " + cy3.getHeight()
                + ", Color is " + cy3.getBase().getColor()
                + ", Base area is " + cy3.getBase().getArea()
                + ", Volume is " + cy3.getVolume()
                + ", surface area=" + cy3.getArea());
    }
}
