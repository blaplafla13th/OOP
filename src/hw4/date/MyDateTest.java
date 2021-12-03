package hw4.date;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate(2020, 2, 28);
        System.out.println(date);
        System.out.println(date.nextDay());
        System.out.println(date.nextDay().nextDay());
        System.out.println(date.previousDay());
        System.out.println(date.nextMonth());
        System.out.println(date.nextMonth().nextMonth());
        System.out.println(date.previousMonth());
        date.setDate(2020, 2, 29);
        System.out.println(date.nextYear());
        System.out.println(date.previousYear());
        System.out.println();

        date.setDate(2020, 12, 30);
        System.out.println(date);
        System.out.println(date.nextDay());
        System.out.println(date.nextDay());
        System.out.println(date.previousDay());
        System.out.println(date.nextMonth());
        System.out.println(date.nextMonth().nextMonth());
        System.out.println(date.previousMonth());
        System.out.println(date.nextYear());
        System.out.println(date.previousYear());

        try {
            MyDate testError = new MyDate(25,61,61);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal hw4.date");
        }
    }
}
