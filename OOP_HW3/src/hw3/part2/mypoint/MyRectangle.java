package hw3.part2.mypoint;

public class MyRectangle {
    private MyPoint topLeftVertex;
    private MyPoint topRightVertex;
    private MyPoint botLeftVertex;
    private MyPoint botRightVertex;

    public MyRectangle(MyPoint topLeftVertex, MyPoint botRightVertex) {
        this.topLeftVertex = topLeftVertex;
        this.botRightVertex = botRightVertex;
        completeRectangle();
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeftVertex = new MyPoint(x1, y1);
        botRightVertex = new MyPoint(x2, y2);
        completeRectangle();
    }

    public void completeRectangle() {
        topRightVertex = new MyPoint(botRightVertex.getX(), topLeftVertex.getY());
        botLeftVertex = new MyPoint(topLeftVertex.getX(), botRightVertex.getY());
    }

    public String toString() {
        return "MyRectangle[topLeftVertex=" + topLeftVertex + ", topRightVertex=" + topRightVertex
                + ", botRightVertex=" + botRightVertex + ", botLeftVertex=" + botLeftVertex;
    }

    public double getArea() {
        double a = topLeftVertex.distance(topRightVertex);
        double b = topLeftVertex.distance(botLeftVertex);
        return a * b;
    }

    public double getPerimeter() {
        double a = topLeftVertex.distance(topRightVertex);
        double b = topLeftVertex.distance(botLeftVertex);
        return 2 * (a + b);
    }
}
