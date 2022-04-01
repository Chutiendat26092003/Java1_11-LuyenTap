public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i, String fN, String lN, int s) {
        id = i;//  or  this.id = i;
        firstName = fN;
        lastName = lN;
        salary = s;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary; //  or  this.salary = newSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary * (percent/100 + 1);
    }

    public String toString() {
        return "Employee[id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary + "]";
    }
}
