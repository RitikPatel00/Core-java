package assignment3.invoice;

public class Tester {
	public class Main {
	    public static void main(String[] args) {
	        // Created an InvoiceItem
	        InvoiceItem item = new InvoiceItem("I001", "Pen", 10, 1.99);
	        System.out.println("Invoice Item: " + item);
	        System.out.println("Total: $" + item.getTotal());
	        System.out.println();

	        // Update the quantity and unit price
	        item.setQty(15);
	        item.setUnitPrice(2.49);
	        System.out.println("Updated Invoice Item: " + item);
	        System.out.println("New Total: $" + item.getTotal());
	        System.out.println();

	        // Create another InvoiceItem
	        InvoiceItem anotherItem = new InvoiceItem("I002", "Notebook", 5, 3.99);
	        System.out.println("Another Invoice Item: " + anotherItem);
	        System.out.println("Total: $" + anotherItem.getTotal());
	    }
	}
}
