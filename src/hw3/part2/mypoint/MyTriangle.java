package hw3.part2.mypoint;

public class MyTriangle {
    private MyPoint vertex1;
    private MyPoint vertex2;
    private MyPoint vertex3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        vertex1 = new MyPoint(x1, y1);
        vertex2 = new MyPoint(x2, y2);
        vertex3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint vertex1, MyPoint vertex2, MyPoint vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public String toString() {
        return "MyTriangle[v1=" + vertex1 + ", v2=" + vertex2 + ", v3=" + vertex3 + "]";
    }

    public double getPerimeter() {
        return vertex1.distance(vertex2) + vertex2.distance(vertex3) + vertex3.distance(vertex1);
    }

    public String getType() {
        double a = vertex1.distance(vertex2);
        double b = vertex2.distance(vertex3);
        double c = vertex3.distance(vertex1);

        if (a == b && b == c && c == a) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
