package hw5.part2.circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(Circle circle, double height) {
        base = circle;
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + base.toString() + " height=" + height;
    }
}
