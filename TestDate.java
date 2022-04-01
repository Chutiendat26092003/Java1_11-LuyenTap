public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(20, 5, 2010);
        System.out.println("day: " + d1.getDay());
        System.out.println("month: " + d1.getMonth());
        System.out.println("year: " + d1.getYear());
        System.out.println(d1.toString());

        System.out.println("\n");

        Date d2 = new Date(20, 5, 2010);
        d2.setDay(26);
        System.out.println("day: " + d2.getDay());
        d2.setMonth(9);
        System.out.println("month: " + d2.getMonth());
        d2.setYear(2003);
        System.out.println("year: " + d2.getYear());
        System.out.println(d2.toString());

        System.out.println("\n");

        Date d3 = new Date(20, 5, 2010);
        d3.setDate(3,8,2003);
        System.out.println("day: " + d3.getDay());
        System.out.println("month: " + d3.getMonth());
        System.out.println("year: " + d3.getYear());
        System.out.println(d3.toString());
    }
}
