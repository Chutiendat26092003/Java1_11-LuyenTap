public class TestInvoiceItem {
    public static void main(String[] args) {
        invoiceItem iI1 = new invoiceItem("H5002", "Bia", 10, 0.5);
        System.out.println("id: " + iI1.getId());
        System.out.println("desc: " + iI1.getDesc());
        System.out.println("Qty: " + iI1.getQty());
        System.out.println("Unit Price: " + iI1.getUnitPrice());
        System.out.println("Total: " + iI1.getTotal());
        System.out.println(iI1.toString());

        System.out.println("\n");

        invoiceItem iI2 = new invoiceItem("H5055", "Mi tom", 3, 4.8);
        System.out.println("id: " + iI2.getId());
        System.out.println("desc: " + iI2.getDesc());
        System.out.println("Qty: " + iI2.getQty());
        System.out.println("Unit Price: " + iI2.getUnitPrice());
        System.out.println("Total: " + iI2.getTotal());
        System.out.println(iI2.toString());

    }
}
