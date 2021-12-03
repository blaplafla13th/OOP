package hw4.time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        if (!check(hour,minute,second)) throw new IllegalArgumentException("Wrong hw4.time");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (!check(hour,minute,second)) throw new IllegalArgumentException("Wrong hour");
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (!check(hour,minute,second)) throw new IllegalArgumentException("Wrong minute");
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (!check(hour,minute,second)) throw new IllegalArgumentException("Wrong second");
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (!check(hour,minute,second)) throw new IllegalArgumentException("Wrong hw4.time");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public MyTime nextSecond() {
        second++;
        reTime();
        return this;
    }

    public MyTime previousSecond() {
        second--;
        reTime();
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        reTime();
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        reTime();
        return this;
    }

    public MyTime nextHour() {
        hour++;
        reTime();
        return this;
    }

    public MyTime previousHour() {
        hour--;
        reTime();
        return this;
    }

    public boolean check(int hour, int minute, int second) {
        if ((hour >= 24 && 0 < hour) || (minute >= 60 && minute < 0) || (second >= 60 && second < 0))
            return false;
        return true;
    }
}
