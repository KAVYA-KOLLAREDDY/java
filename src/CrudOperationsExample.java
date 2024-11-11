import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CrudOperationsExample {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=sample;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "sa"; // Replace with your SQL Server username
    private static final String PASSWORD = "Chitti@141"; // Replace with your SQL Server password

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("SQL Server JDBC Driver not found.");
            e.printStackTrace();
            return;
        }
        // Perform all CRUD operations
        createRecord("John", "john@example.com");
        readRecords();
        updateRecord(1, "John Doe", "johndoe@example.com");
        deleteRecord(1);
    }

    // CREATE operation
    public static void createRecord(String firstname, String email) {
        String insertQuery = "INSERT INTO SQLcustomers (firstname, email) VALUES (?,?)";
        
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, email);
            
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error while inserting record.");
            e.printStackTrace();
        }
    }

    // READ operation
    public static void readRecords() {
        String selectQuery = "SELECT * FROM SQLcustomers";
        
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("customers_id"));
                System.out.println("Name: " + resultSet.getString("firstname"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("---------");
            }
        } catch (SQLException e) {
            System.out.println("Error while reading records.");
            e.printStackTrace();
        }
    }

    // UPDATE operation
    public static void updateRecord(int id, String newFirstname, String newEmail) {
        String updateQuery = "UPDATE SQLcustomers SET firstname = ?, email = ? WHERE customers_id = ?";
        
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            
            preparedStatement.setString(1, newFirstname);
            preparedStatement.setString(2, newEmail);
            preparedStatement.setInt(3, id);
            
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error while updating record.");
            e.printStackTrace();
        }
    }

    // DELETE operation
    public static void deleteRecord(int id) {
        String deleteQuery = "DELETE FROM SQLcustomers WHERE customers_id = ?";
        
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            
            preparedStatement.setInt(1, id);
            
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error while deleting record.");
            e.printStackTrace();
        }
    }
}
