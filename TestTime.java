public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(11, 30, 59);
        System.out.println("hour: " + t1.getHour());
        System.out.println("minute: " + t1.getMinute());
        System.out.println("second: " + t1.getSecond());
        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());

        System.out.println("\n");

        Time t2 = new Time(11, 30, 50);
        t2.setHour(12);
        System.out.println("day: " + t2.getHour());
        t2.setMinute(9);
        System.out.println("month: " + t2.getMinute());
        t2.setSecond(0);
        System.out.println("year: " + t2.getSecond());
        System.out.println(t2.toString());
        System.out.println(t2.previousSecond());

        System.out.println("\n");

        Time t3 = new Time(11, 30, 50);
        t3.setTime(3,8,30);
        System.out.println("day: " + t3.getHour());
        System.out.println("month: " + t3.getMinute());
        System.out.println("year: " + t3.getSecond());
        System.out.println(t3.toString());
    }
}
