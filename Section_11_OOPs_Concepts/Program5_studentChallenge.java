package Section_11_OOPs_Concepts;

class Product {

    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product(String itemNo) {

        this.itemNo = itemNo;
    }
    public Product(String itemNo, String name) {

        this.itemNo = itemNo;
        this.name = name;
    }
    public Product (String name, String itemNo, double price, short qty) {

        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(short qty) {
        this.qty = qty;
    }

    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public short getQty() {
        return qty;
    }
}

class Customer {
    
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {

        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
}
public class Program5_studentChallenge {
    public static void main(String[] args) {
        
        Product product1 = new Product("P001", "Laptop", 45000.00, (short) 10);
        System.out.println(product1);

        Customer customer1 = new Customer("John", "xsouravkumar357@gmail.com", "1234567890");
        System.out.println(customer1);
    }
}
