public class invoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public invoiceItem(String i, String d, int q, double uP) {
        id = i;//  or  this.id = i;
        desc = d;
        qty = q;
        unitPrice = uP;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int newQty) {
        qty = newQty; //  or  this.salary = newSalary;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice; //  or  this.salary = newSalary;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "InvoiceItem[id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice + "]";
    }
}
