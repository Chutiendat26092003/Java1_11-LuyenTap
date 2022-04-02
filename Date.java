public class Date {
    private int day;
    private  int month;
    private  int year;

    public Date(int d, int m, int y) {
        if ((1 <= d && d <= 31) && (1 <= m && m <= 12) && (1900 <= y && y <= 9000)) {
            day = d;
            month = m;
            year = y;
        } else {
            System.out.println("No input validation needed");
        }
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public  int getYear() {
        return year;
    }

    public  void setDay(int newDay) {
        if (1 <= newDay && newDay <= 31) {
            day = newDay;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setMonth(int newMonth) {
        if (1 <= newMonth && newMonth <= 12) {
            month = newMonth;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setYear(int newYear) {
        if (1900 <= newYear && newYear <= 9999) {
            year = newYear;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public  void setDate(int newDay, int newMonth, int newYear) {
        if ((1 <= newDay && newDay <= 31) && (1 <= newMonth && newMonth <= 12) && (1900 <= newYear && newYear <= 9000)) {
            day = newDay;
            month = newMonth;
            year = newYear;
        } else {
            System.out.println("No input validation needed");
        }
    }

    public String toString() {
        String zero = "0";
        if (day < 10) {
            zero = zero + day;
        } else {
            zero = "" + day;
        }
        zero = zero + "/";
        if (month < 10)
        {
            zero = zero + "0" + month;
        } else {
            zero = zero + month;
        }
        zero = zero + "/" + year;
        return "Date[dd/mm/yyyy - " + zero + "]";
    }
}
