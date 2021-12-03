package hw4.time;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(1, 2, 3);
        System.out.println(time1);

        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());

        time1.setTime(23, 59, 58);
        System.out.println(time1);

        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());

        System.out.println(time1.nextMinute());
        System.out.println(time1.nextMinute().nextMinute());

        System.out.println(time1.previousMinute());
        System.out.println(time1.previousMinute().previousMinute());

        System.out.println(time1.nextHour());
        System.out.println(time1.nextHour().nextHour());

        System.out.println(time1.previousHour());
        System.out.println(time1.previousHour().previousHour());
        try {
            MyTime testError = new MyTime(25,61,61);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal hw4.time");
        }
    }
}
