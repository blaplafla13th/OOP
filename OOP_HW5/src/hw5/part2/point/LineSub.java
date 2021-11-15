package hw5.part2.point;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        return this;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public int[] getBeginXY() {
        return super.getXY();
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        return super.distance(end);
    }

    public double getGradient() {
        int yDiff = end.getY() - super.getY();
        int xDiff = end.getX() - super.getX();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Line[begin=" + super.toString() + ", end=" + end + "]";
    }
}
