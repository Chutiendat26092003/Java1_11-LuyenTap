public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(1000, 5, 2010);
        System.out.println(d1.toString());

        System.out.println("\n");

        Date d2 = new Date(20, 5, 2010);
        d2.setDay(26);
        d2.setMonth(9);
        d2.setYear(2003);
        System.out.println(d2.toString());

        System.out.println("\n");

        Date d3 = new Date(20, 5, 2010);
        d3.setDate(3,8,2003);
        System.out.println(d3.toString());
    }
}
