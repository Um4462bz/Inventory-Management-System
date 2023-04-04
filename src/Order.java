import java.util.ArrayList;

public class Order {
    private int orderId;
    private int customerId;
    private ArrayList<Product> orderedProducts;
    private String orderStatus;

    // Constructor
    public Order(int orderId, int customerId, ArrayList<Product> orderedProducts, String orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderedProducts = orderedProducts;
        this.orderStatus = orderStatus;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // Method to add a product to the order's ordered products list
    public void addOrderedProduct(Product product) {
        orderedProducts.add(product);
    }

    // Method to remove a product from the order's ordered products list
    public void removeOrderedProduct(Product product) {
        orderedProducts.remove(product);
    }

    // Method to modify the order's information
    public void modifyOrder(int orderId, int customerId, ArrayList<Product> orderedProducts, String orderStatus) {
        setOrderId(orderId);
        setCustomerId(customerId);
        setOrderedProducts(orderedProducts);
        setOrderStatus(orderStatus);
    }
}