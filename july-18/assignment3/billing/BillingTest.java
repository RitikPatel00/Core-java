package assignment3.billing;

public class BillingTest {
	public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer(1001, "John Doe", 10);
        System.out.println("Customer: " + customer);

        // Create an invoice for the customer
        Invoice invoice = new Invoice(101, customer, 100.0);
        System.out.println("Invoice: " + invoice);

        // Test getters
        System.out.println("Customer ID: " + invoice.getCustomerID());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Customer Discount: " + invoice.getCustomerDiscount() + "%");
        System.out.println("Amount After Discount: " + invoice.getAmountAfterDiscount());

        // Test setters
        customer.setDiscount(15);
        invoice.setAmount(200.0);
        System.out.println("Updated Invoice: " + invoice);
        System.out.println("Amount After Discount: " + invoice.getAmountAfterDiscount());

        // Test changing the customer
        Customer newCustomer = new Customer(1002, "Jane Smith", 20);
        invoice.setCustomer(newCustomer);
        System.out.println("Invoice with New Customer: " + invoice);
        System.out.println("Amount After Discount: " + invoice.getAmountAfterDiscount());
    }
}
