public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
        System.out.printf("The Circumference is: %.2f%n", c1.getCircumference());
        System.out.println(c1.toString());

        System.out.println("\n");

        Circle c2 = new Circle(3.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());
        System.out.printf("The Circumference is: %.2f%n", c2.getCircumference());
        System.out.println(c2.toString());

        System.out.println("\n");

        Circle c3 = new Circle();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
        System.out.printf("The Circumference is: %.2f%n", c3.getCircumference());
        System.out.println(c3.toString());

        System.out.println("\n");

        Circle c4 = new Circle();
        c4.setRadius(4.2);
        c4.setColor("pink");
        System.out.println("The radius is: " + c4.getRadius());
        System.out.println("The color is: " + c4.getColor());
        System.out.printf("The area is: %.2f%n", c4.getArea());
        System.out.printf("The Circumference is: %.2f%n", c4.getCircumference());
        System.out.println(c4.toString());

    }
}
