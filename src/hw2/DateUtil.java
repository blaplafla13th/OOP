package hw2;

public class DateUtil {
    static final String[] STR_MONTH = {"Jan", "Feb", "Mar", "April", "May",
            "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final String[] STR_WEEKDAY = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final int[] MAX_DAY_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        int year = 2020;
        int month = 2;
        int day = 29;
        toString(year, month, day);
    }

    public static void toString(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            System.out.print(STR_WEEKDAY[getDayofWeek(year, month, day)] + " " +
                    day + " " + STR_MONTH[month - 1] + " " + year);
        } else
            System.out.print("Invalid Day");
    }

    public static int getDayofWeek(int year, int month, int day) {
        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3) year -= 1;
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public static boolean isValidDate(int year, int month, int day) {
        int maxDay;
        if (year < 1 || year > 9999) return false;
        if (month < 1 || month > 12) return false;
        if (month == 2 && isLeapYear(year)) maxDay = MAX_DAY_OF_MONTH[1] + 1;
        else maxDay = MAX_DAY_OF_MONTH[month - 1];
        return day >= 1 && day <= maxDay;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        else return year % 4 == 0 && year % 100 != 0;
    }

}
