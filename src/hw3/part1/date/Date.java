package hw3.part1.date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String day;
        String month;

        if (this.day < 10)
            day = '0' + String.valueOf(this.day);
        else day = String.valueOf(this.day);

        if (this.month < 10)
            month = '0' + String.valueOf(this.month);
        else month = String.valueOf(this.month);

        return day + '/' + month + '/' + String.valueOf(year);
    }
}
