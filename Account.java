public class Account {
    private String id;
    private  String name;
    private  int balance = 0;

    public Account(String i, String n) {
        id = i;
        name = n;
    }

    public Account(String i, String n, int b) {
        id = i;
        name = n;
        balance = b;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public  int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance + amount;
    }

    public int debit(int amount) {
        if(amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public  int transferTo(Account another, int amount) {
        if(amount <= balance) {
            another.balance += amount;
            balance = balance - amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public String toString() {
        return "Account[id = " + id + ", name = " + name + ", balance = " + balance + "]";
    }

}
