package hw5.circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: "
                + "radius=" + cylinder1.getRadius()
                + ", height=" + cylinder1.getHeight()
                + ", base area=" + cylinder1.getBaseArea()
                + ", volume=" + cylinder1.getVolume()
                + ", surface area=" + cylinder1.getArea());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder: "
                + "radius=" + cylinder2.getRadius()
                + ", height=" + cylinder2.getHeight()
                + ", base area=" + cylinder2.getBaseArea()
                + ", volume=" + cylinder2.getVolume()
                + ", surface area=" + cylinder2.getArea());
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: "
                + "radius=" + cylinder3.getRadius()
                + ", height=" + cylinder3.getHeight()
                + ", base area=" + cylinder3.getBaseArea()
                + ", volume=" + cylinder3.getVolume()
                + ", surface area=" + cylinder3.getArea());

    }
}
