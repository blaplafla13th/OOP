package hw4.date;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public static final String[] MONTHS = {"", "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] MAX_DAYS_IN_MONTH = {29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid year, month, or day!");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid day!");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid month!");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid year!");
        this.year = year;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid year, month, or day!");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year > 9999 || year < 1) {
            return false;
        }
        if (month > 12 || month < 1) {
            return false;
        }
        int maxDay = MAX_DAYS_IN_MONTH[month];
        if (isLeapYear(year) && month == 2) {
            maxDay = MAX_DAYS_IN_MONTH[0];
        }
        if (day < 0 || day > maxDay) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) return 0;
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) year -= 1;
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month] + " " + year;
    }

    public MyDate nextDay() {
        int maxDay = (12 == month) ? MAX_DAYS_IN_MONTH[1] : (isLeapYear(year) && month == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month];

        if (maxDay == day && 12 == month && 9999 == year) {
            return this;
        }

        if (maxDay == day && 12 == month) {
            setDate(year++, 1, 1);
            return this;
        }

        if (maxDay == day) {
            month++;
            day = 1;
            return this;
        }

        day++;
        return this;
    }

    public MyDate nextMonth() {
        if (12 == month && 9999 == year) {
            return this;
        }

        int maxDay = (12 == month) ? MAX_DAYS_IN_MONTH[1] : (isLeapYear(year) && month + 1 == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month + 1];


        day = (day >= maxDay) ? maxDay : day;

        if (12 == month) {
            setDate(year + 1, 1, day);
            return this;
        }

        setDate(year, month + 1, day);
        return this;
    }

    public MyDate nextYear() {
        if (9999 == year) {
            return this;
        }

        int maxDay = (12 == month) ? MAX_DAYS_IN_MONTH[1] : (isLeapYear(year + 1) && month == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month];

        day = (maxDay <= day) ? maxDay : day;

        setDate(year + 1, month, day);
        return this;
    }

    public MyDate previousDay() {
        int maxDay = (1 == month) ? MAX_DAYS_IN_MONTH[12] : (isLeapYear(year) && month - 1 == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month - 1];

        if (day == 1 && month == 1 && year == 1) {
            return this;
        }

        if (day == 1 && 1 == month) {
            setDate(year--, 12, 31);
            return this;
        }

        if (day == 1) {
            month--;
            day = maxDay;
            return this;
        }

        day--;
        return this;
    }

    public MyDate previousMonth() {
        if (1 == month && 1 == year) {
            return this;
        }

        int maxDay = (1 == month) ? MAX_DAYS_IN_MONTH[12] : (isLeapYear(year) && month - 1 == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month - 1];


        day = (day >= maxDay) ? maxDay : day;

        if (12 == month) {
            setDate(year - 1, 1, day);
            return this;
        }

        setDate(year, month - 1, day);
        return this;
    }

    public MyDate previousYear() {
        if (1 == year) {
            return this;
        }

        int maxDay = (1 == month) ? MAX_DAYS_IN_MONTH[12] : (isLeapYear(year - 1) && month == 2)
                ? MAX_DAYS_IN_MONTH[0] : MAX_DAYS_IN_MONTH[month];

        day = (maxDay <= day) ? maxDay : day;

        setDate(year - 1, month, day);
        return this;
    }
}
