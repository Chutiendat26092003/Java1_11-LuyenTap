public class Time {
    private int hour;
    private  int minute;
    private  int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public  int getSecond() {
        return second;
    }

    public  void setHour(int newHour) {
        hour = newHour;
    }

    public  void setMinute(int newMinute) {
        minute = newMinute;
    }

    public  void setSecond(int newSecond) {
        second = newSecond;
    }

    public  void setTime(int newHour, int newMinute, int newSecond) {
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }

    public String toString() {
        return "Date[hh:mm:ss - " + hour + ":" + minute + ":"+ second + "]";
    }

    public Time nextSecond()  {
        second++;
        if (second == 60)
        {
            minute++;
            second = 0;
        }
        if (minute == 60)
        {
            hour++;
            minute = 0;
        }
        if (hour == 24)
        {
            //increases the day
            hour = 0;
        }
        return(this);
    }
    public Time previousSecond() {
        second--;
        if (second == -1)
        {
            minute--;
            second = 59;
        }
        if (minute == -1)
        {
            hour--;
            minute = 59;
        }
        if (hour == -1)
        {
            hour = 23;
        }
        return(this);
    }
}
