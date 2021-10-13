class Product {
    // Attributes//
    private int pid;
    String Name;
    int price;

    // Construcutor//
    Product() {
        System.out.println(">> Product Details");
    }

    // Method//
    // To Write Data in Product Object we have this Method//
    void setProductDetails(int pid, String Name, int price) {
        this.pid = pid;
        this.Name = Name;
        this.price = price;
    }

    // To Read Data From Product Details//
    void showProductDetails() {
        System.out.println("Product ID " + pid);
        System.out.println("Product Name " + Name);
        System.out.println("Product Price " + price);
    }

    // Setter//
    void setPid(int pid) {
        this.pid = pid;
    }

    // Getter//
    int getPid() {
        return pid;
    }
}

public class OOPS {

    public static void main(String[] args) {
        // Create Object Product : Prodcut
        Product product1 = new Product();
        // product1 is a ref variable which holds hashCode in HexaDecimal Notation
        System.out.println("Product is : " + product1);
        // Writing the Details
        product1.setProductDetails(101, "iphone 13", 100000);
        // Reading Data from Object
        

        // Creating a 2nd Product
        Product product2 = new Product();
        System.out.println("Product is : " + product2);
        product2.setProductDetails(201, "Nike Shoes", 50000);
        product2.showProductDetails();

    }
}