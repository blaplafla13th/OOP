package hw5.part2.point;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        System.out.println(l1);
        LineSub l2 = new LineSub(new Point(5,6), new Point(7,8));
        System.out.println(l2);

        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);
        System.out.println(l1.getBegin());
        System.out.println(l1.getEnd());

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1);
        System.out.println(l1.getBeginXY()[0]);
        System.out.println(l1.getBeginXY()[1]);
        System.out.println(l1.getEndXY()[0]);
        System.out.println(l1.getEndXY()[1]);

        System.out.println(l1.getLength());
    }
}
