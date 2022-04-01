import java.sql.SQLOutput;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("\nThe length is: " + r1.getLength() + " and the width is: " + r1.getWidth());
        System.out.println(r1.toString());
        System.out.printf("The Area is %.2f%n", r1.getArea());
        System.out.printf("The Perimeter is %.2f%n", r1.getPerimeter());


        Rectangle r2 = new Rectangle(2.0f , 5.0f);
        System.out.println("\nThe length is: " + r2.getLength() + " and the width is: " + r2.getWidth());
        System.out.println(r2.toString());
        System.out.printf("The Area is %.2f%n", r2.getArea());
        System.out.printf("The Perimeter is %.2f%n", r2.getPerimeter());

        Rectangle r3 = new Rectangle();
        r3.setLength(2.2f);
        r3.setWidth(2.55f);
        System.out.println("\nThe length is: " + r3.getLength() + " and the width is: " + r3.getWidth());
        System.out.println(r3.toString());
        System.out.printf("The Area is %.2f%n", r3.getArea());
        System.out.printf("The Perimeter is %.2f%n", r3.getPerimeter());

    }
}
