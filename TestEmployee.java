public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(10001, "Quach", "Thanh", 2000);
        System.out.println("id: " + e1.getId());
        System.out.println("First Name: " + e1.getFirstName() + ", Last Name: " + e1.getLastName() + ", Full Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());
        System.out.println("Raise Salary: " + e1.raiseSalary(20));
        System.out.println(e1.toString());

        System.out.println("\n");

        Employee e2 = new Employee(10002, "Nguyen", "Phat", 2000);
        System.out.println("id: " + e2.getId());
        System.out.println("First Name: " + e2.getFirstName() + ", Last Name: " + e2.getLastName() + ", Full Name: " + e2.getName());
        e2.setSalary(3000);
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Annual Salary: " + e2.getAnnualSalary());
        System.out.println("Raise Salary: " + e2.raiseSalary(50));
        System.out.println(e2.toString());

    }
}
