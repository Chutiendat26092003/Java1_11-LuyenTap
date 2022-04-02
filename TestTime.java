public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(11, 30, 59);
        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());

        System.out.println("\n");

        Time t2 = new Time(11, 30, 50);
        t2.setHour(12);
        t2.setMinute(9);
        t2.setSecond(0);
        System.out.println(t2.toString());
        System.out.println(t2.previousSecond());

        System.out.println("\n");

        Time t3 = new Time(11, 30, 50);
        t3.setTime(3,8,30);
        System.out.println(t3.toString());
    }
}
