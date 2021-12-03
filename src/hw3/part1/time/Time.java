package hw3.part1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        reTime();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        reTime();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        reTime();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        reTime();
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        reTime();
    }

    public String toString() {
        String hour;
        String minute;
        String second;

        if (this.hour < 10)
            hour = '0' + String.valueOf(this.hour);
        else hour = String.valueOf(this.hour);

        if (this.minute < 10)
            minute = '0' + String.valueOf(this.minute);
        else minute = String.valueOf(this.minute);

        if (this.second < 10)
            second = '0' + String.valueOf(this.second);
        else second = String.valueOf(this.second);

        return hour + ':' + minute + ':' + second;
    }

    public void reTime() {
        while (second >= 60) {
            second -= 60;
            minute += 1;
        }
        while (minute >= 60) {
            minute -= 60;
            hour += 1;
        }
        while (hour >= 24) {
            hour -= 24;
        }

        while (second < 0) {
            second = 59;
            minute -= 1;
        }
        while (minute < 0) {
            minute = 59;
            hour -= 1;
        }
        while (hour < 0) {
            hour = 23;
        }
    }

    public Time nextSecond() {
        second++;
        reTime();
        return this;
    }

    public Time previousSecond() {
        second--;
        reTime();
        return this;
    }

}
