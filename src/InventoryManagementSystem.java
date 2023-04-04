import java.sql.*;
import java.util.ArrayList;

public class InventoryManagementSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_management_system";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    // Method to get a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Method to add a product to the database
    public static void addProduct(Product product) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("INSERT INTO product (name, description, price, quantity) VALUES (?, ?, ?, ?)");
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setBigDecimal(3, product.getPrice());
            statement.setInt(4, product.getQuantity());
            statement.executeUpdate();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    // Method to update a product in the database
    public static void updateProduct(Product product) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("UPDATE product SET name=?, description=?, price=?, quantity=? WHERE product_id=?");
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setBigDecimal(3, product.getPrice());
            statement.setInt(4, product.getQuantity());
            statement.setInt(5, product.getProductId());
            statement.executeUpdate();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    // Method to delete a product from the database
    public static void deleteProduct(int productId) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("DELETE FROM product WHERE product_id=?");
            statement.setInt(1, productId);
            statement.executeUpdate();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    // Method to get a list of all products from the database
    public static ArrayList<Product> getAllProducts() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Product> products = new ArrayList<>();
        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM product");
            while (resultSet.next()) {
                Product product = new Product(
                    resultSet.getInt("product_id"),
                    resultSet.getString("name"),
                    resultSet.getString("description"),
                    resultSet.getBigDecimal("price"),
                    resultSet.getInt("quantity")
                );
                products.add(product);
            }
        } finally {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return products;
    }

    // Method to add a warehouse to the database
    public static void addWarehouse(Warehouse warehouse) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("INSERT INTO warehouse (name, location) VALUES (?, ?)");
            statement.setString(1, warehouse.getName());
            statement.setString(2, warehouse.getLocation
            		());
            statement.executeUpdate();
            } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
            
            public static void updateWarehouse(Warehouse warehouse) throws SQLException {
            	Connection connection = null;
            	PreparedStatement statement = null;
            	try {
            	connection = getConnection();
            	statement = connection.prepareStatement("UPDATE warehouse SET name=?, location=? WHERE warehouse_id=?");
            	statement.setString(1, warehouse.getName());
            	statement.setString(2, warehouse.getLocation());
            	statement.setInt(3, warehouse.getWarehouseId());
            	statement.executeUpdate();
            	} finally {
            	if (statement != null) statement.close();
            	if (connection != null) connection.close();
            	}
            	}
            	// Method to delete a warehouse from the database
            	public static void deleteWarehouse(int warehouseId) throws SQLException {
            	    Connection connection = null;
            	    PreparedStatement statement = null;
            	    try {
            	        connection = getConnection();
            	        statement = connection.prepareStatement("DELETE FROM warehouse WHERE warehouse_id=?");
            	        statement.setInt(1, warehouseId);
            	        statement.executeUpdate();
            	    } finally {
            	        if (statement != null) statement.close();
            	        if (connection != null) connection.close();
            	    }
            	}

            	// Method to get a list of all warehouses from the database
            	public static ArrayList<Warehouse> getAllWarehouses() throws SQLException {
            	    Connection connection = null;
            	    Statement statement = null;
            	    ResultSet resultSet = null;
            	    ArrayList<Warehouse> warehouses = new ArrayList<>();
            	    try {
            	        connection = getConnection();
            	        statement = connection.createStatement();
            	        resultSet = statement.executeQuery("SELECT * FROM warehouse");
            	        while (resultSet.next()) {
            	            Warehouse warehouse = new Warehouse(
            	                resultSet.getInt("warehouse_id"),
            	                resultSet.getString("name"),
            	                resultSet.getString("location")
            	            );
            	            warehouses.add(warehouse);
            	        }
            	    } finally {
            	        if (resultSet != null) resultSet.close();
            	        if (statement != null) statement.close();
            	        if (connection != null) connection.close();
            	    }
            	    return warehouses;
            	}

				public void setVisible(boolean b) {
					// TODO Auto-generated method stub
					
				}
            }