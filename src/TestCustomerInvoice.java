public class TestCustomerInvoice {
    public static void main(String[] args) {
        // Test Customer class
        Customer customer1 = new Customer(101, "John Doe", 15);
        System.out.println(customer1);  // Customer's toString()

        customer1.setDiscount(10);
        System.out.println(customer1);
        System.out.println("ID is: " + customer1.getId());
        System.out.println("Name is: " + customer1.getName());
        System.out.println("Discount is: " + customer1.getDiscount());

        // Test Invoice class
        Invoice invoice1 = new Invoice(201, customer1, 1500.0);
        System.out.println(invoice1);

        invoice1.setAmount(2000.0);
        System.out.println(invoice1);
        System.out.println("ID is: " + invoice1.getId());
        System.out.println("Customer is: " + invoice1.getCustomer());  // Customer's toString()
        System.out.println("Amount is: " + invoice1.getAmount());
        System.out.println("Customer's ID is: " + invoice1.getCustomerId());
        System.out.println("Customer's name is: " + invoice1.getCustomerName());
        System.out.println("Customer's discount is: " + invoice1.getCustomerDiscount());
        System.out.printf("Amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
    }
}
