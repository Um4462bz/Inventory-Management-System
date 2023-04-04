import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to add a user to the database
    public void addUser() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = InventoryManagementSystem.getConnection();
            statement = connection.prepareStatement("INSERT INTO user (name, email, password) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, getName());
            statement.setString(2, getEmail());
            statement.setString(3, getPassword());
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                setUserId(resultSet.getInt(1));
            }
        } finally {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    // Method to update a user in the database
    public void updateUser() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = InventoryManagementSystem.getConnection();
            statement = connection.prepareStatement("UPDATE user SET name=?, email=?, password=? WHERE user_id=?");
            statement.setString(1, getName());
            statement.setString(2, getEmail());
            statement.setString(3, getPassword());
            statement.setInt(4, getUserId());
            statement.executeUpdate();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    // Method to delete a user from the database
    public void deleteUser() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = InventoryManagementSystem.getConnection();
            statement = connection.prepareStatement("DELETE FROM user WHERE user_id=?");
            statement.setInt(1, getUserId());
            statement.executeUpdate();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }
}