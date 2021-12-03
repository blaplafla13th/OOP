package hw3.part2.mypoint;

public class MyLineTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);

        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(1, 2, 5, 6);

        System.out.println(line1);
        System.out.println(line2);

        System.out.println(line1.getBegin());
        System.out.println(line1.getEnd());

        line2.setBegin(point2);
        line2.setEnd(point1);
        System.out.println(line2);

        System.out.println(line2.getBeginX());
        System.out.println(line2.getBeginY());
        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());

        line2.setBeginX(5);
        line2.setBeginY(3);
        line2.setEndX(4);
        line2.setEndY(2);
        System.out.println(line2);

        System.out.println(line1.getBeginXY()[0]);
        System.out.println(line1.getBeginXY()[1]);
        System.out.println(line2.getEndXY()[0]);
        System.out.println(line2.getEndXY()[1]);

        line1.setBeginXY(3, 8);
        line1.setEndXY(4, 2);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }

}
