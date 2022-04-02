public class Time {
    private int hour;
    private  int minute;
    private  int second;

    public Time(int h, int m, int s) {
        if ((0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59)) {
            hour = h;
            minute = m;
            second = s;
        } else {
            System.out.println("No input validation needed");
        }
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
        if (0 <= newHour && newHour <= 23) {
            hour = newHour;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setMinute(int newMinute) {
        if (0 <= newMinute && newMinute <= 59) {
            minute = newMinute;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setSecond(int newSecond) {
        if (0 <= newSecond && newSecond <= 59) {
            second = newSecond;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setTime(int newHour, int newMinute, int newSecond) {
        if ((0 <= newHour && newHour <= 23) && (0 <= newMinute && newMinute <= 59) && (0 <= newSecond && newSecond <= 59)) {
            hour = newHour;
            minute = newMinute;
            second = newSecond;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public String toString() {
        String zero = "0";
        if (hour < 10) {
            zero = zero + hour;
        } else {
            zero = "" + hour;
        }
        zero = zero + ":";
        if (minute < 10)
        {
            zero = zero + "0" + minute;
        } else {
            zero = zero + minute;
        }
        zero = zero + ":";
        if (second < 10) {
            zero = zero + "0" + second;
        } else {
            zero = zero + second;
        }
        return "Time[hh:mm:ss - " + zero + "]";
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
        return this;
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
        return this;
    }
}
