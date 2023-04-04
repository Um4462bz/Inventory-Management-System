import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Reporting {
    
    // Method to generate an inventory report
    public static void generateInventoryReport(ArrayList<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter("inventory_report.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Inventory Report");
            printWriter.println("----------------");
            printWriter.println("Product ID\tProduct Name\tPrice\tQuantity");
            for (Product product : products) {
                printWriter.println(product.getProductId() + "\t\t" + product.getName() + "\t\t$" + product.getPrice() + "\t" + product.getQuantity());
            }
            printWriter.close();
            System.out.println("Inventory report generated successfully.");
        } catch (IOException e) {
            System.out.println("Failed to generate inventory report.");
            e.printStackTrace();
        }
    }

    // Method to generate a product report
    public static void generateProductReport(ArrayList<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter("product_report.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Product Report");
            printWriter.println("--------------");
            printWriter.println("Product ID\tProduct Name\tPrice\tQuantity\tDescription");
            for (Product product : products) {
                printWriter.println(product.getProductId() + "\t\t" + product.getName() + "\t\t$" + product.getPrice() + "\t" + product.getQuantity() + "\t\t" + product.getDescription());
            }
            printWriter.close();
            System.out.println("Product report generated successfully.");
        } catch (IOException e) {
            System.out.println("Failed to generate product report.");
            e.printStackTrace();
        }
    }

    // Method to generate a warehouse report
    public static void generateWarehouseReport(ArrayList<Warehouse> warehouses) {
        try {
            FileWriter fileWriter = new FileWriter("warehouse_report.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Warehouse Report");
            printWriter.println("----------------");
            printWriter.println("Warehouse ID\tWarehouse Name\tLocation");
            for (Warehouse warehouse : warehouses) {
                printWriter.println(warehouse.getWarehouseId() + "\t\t" + warehouse.getName() + "\t\t" + warehouse.getLocation());
            }
            printWriter.close();
            System.out.println("Warehouse report generated successfully.");
        } catch (IOException e) {
            System.out.println("Failed to generate warehouse report.");
            e.printStackTrace();
        }
    }

    // Method to generate an order report
    public static void generateOrderReport(ArrayList<Order> orders) {
        try {
            FileWriter fileWriter = new FileWriter("order_report.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Order Report");
            printWriter.println("------------");
            printWriter.println("Order ID\tCustomer ID\tProduct ID\tQuantity\tTotal Price\tOrder Status");
            for (Order order : orders) {
                printWriter.println(order.getOrderId() + "\t\t" + order.getCustomerId() + "\t\t" + order.getProductId() + "\t\t" + order.getQuantity() + "\t\t$" + order.getTotalPrice() + "\t" + order.getOrderStatus());
            }
            printWriter.close();
            System.out.println("Order report generated successfully.");
        } catch (IOException e) {
            System.out.println("Failed to generate order report.");
            e.printStackTrace();
        }
    }
}