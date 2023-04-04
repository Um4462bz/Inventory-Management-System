import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

public class InventoryGUI extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTabbedPane tabbedPane;
    private JPanel productPanel;
    private JPanel warehousePanel;
    private JPanel orderPanel;
    private JButton addProductButton;
    private JButton updateProductButton;
    private JButton deleteProductButton;
    private JButton addWarehouseButton;
    private JButton updateWarehouseButton;
    private JButton deleteWarehouseButton;
    private JButton addOrderButton;
    private JButton updateOrderButton;
    private JButton deleteOrderButton;
    private JTable productTable;
    private JTable warehouseTable;
    private JTable orderTable;
    private JScrollPane productScrollPane;
    private JScrollPane warehouseScrollPane;
    private JScrollPane orderScrollPane;

    public InventoryGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setTitle("Inventory Management System");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        tabbedPane = new JTabbedPane();
        contentPane.add(tabbedPane, BorderLayout.CENTER);

        productPanel = new JPanel();
        productPanel.setLayout(new BorderLayout());

        addProductButton = new JButton("Add Product");
        addProductButton.addActionListener(this);

        updateProductButton = new JButton("Update Product");
        updateProductButton.addActionListener(this);

        deleteProductButton = new JButton("Delete Product");
        deleteProductButton.addActionListener(this);

        JPanel productButtonPanel = new JPanel();
        productButtonPanel.add(addProductButton);
        productButtonPanel.add(updateProductButton);
        productButtonPanel.add(deleteProductButton);

        productPanel.add(productButtonPanel, BorderLayout.NORTH);

        productTable = new JTable();
        productTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productScrollPane = new JScrollPane(productTable);

        productPanel.add(productScrollPane, BorderLayout.CENTER);

        tabbedPane.addTab("Products", productPanel);

        warehousePanel = new JPanel();
        warehousePanel.setLayout(new BorderLayout());

        addWarehouseButton = new JButton("Add Warehouse");
        addWarehouseButton.addActionListener(this);

        updateWarehouseButton = new JButton("Update Warehouse");
        updateWarehouseButton.addActionListener(this);

        deleteWarehouseButton = new JButton("Delete Warehouse");
        deleteWarehouseButton.addActionListener(this);

        JPanel warehouseButtonPanel = new JPanel();
        warehouseButtonPanel.add(addWarehouseButton);
        warehouseButtonPanel.add(updateWarehouseButton);
        warehouseButtonPanel.add(deleteWarehouseButton);

        warehousePanel.add(warehouseButtonPanel, BorderLayout.NORTH);

        warehouseTable = new JTable();
        warehouseTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        warehouseScrollPane = new JScrollPane(warehouseTable);

        warehousePanel.add(warehouseScrollPane, BorderLayout.CENTER);

        tabbedPane.addTab("Warehouses", warehousePanel);

        orderPanel = new JPanel();
        orderPanel.setLayout(new BorderLayout());

        addOrderButton = new JButton("Add Order");
        addOrderButton.addActionListener(this);

        updateOrderButton = new JButton("Update Order");
        updateOrderButton.addActionListener(this);

        deleteOrderButton = new JButton("Delete Order");
        deleteOrderButton.addActionListener(this);

        JPanel orderButtonPanel = new JPanel();
        orderButtonPanel.add(addOrderButton);
        orderButtonPanel.add(updateOrderButton);
        orderButtonPanel.add(deleteOrderButton);

        orderPanel.add(orderButtonPanel, BorderLayout.NORTH);

        orderTable = new

JTable();
orderTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
orderScrollPane = new JScrollPane(orderTable);

    orderPanel.add(orderScrollPane, BorderLayout.CENTER);

    tabbedPane.addTab("Orders", orderPanel);
}

@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addProductButton) {
        // Code to add a product
    } else if (e.getSource() == updateProductButton) {
        // Code to update a product
    } else if (e.getSource() == deleteProductButton) {
        // Code to delete a product
    } else if (e.getSource() == addWarehouseButton) {
        // Code to add a warehouse
    } else if (e.getSource() == updateWarehouseButton) {
        // Code to update a warehouse
    } else if (e.getSource() == deleteWarehouseButton) {
        // Code to delete a warehouse
    } else if (e.getSource() == addOrderButton) {
        // Code to add an order
    } else if (e.getSource() == updateOrderButton) {
        // Code to update an order
    } else if (e.getSource() == deleteOrderButton) {
        // Code to delete an order
    }
}

public static void main(String[] args) {
    InventoryManagementSystem frame = new InventoryManagementSystem();
    frame.setVisible(true);
}
}
