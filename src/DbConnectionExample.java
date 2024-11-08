import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionExample {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=sample;encrypt=true;trustServerCertificate=true";
        String username = "sa"; // Replace with your SQL Server username
        String password = "Chitti@141"; // Replace with your SQL Server password

        // Load the SQL Server JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Establish a connection
        Connection connection = DriverManager.getConnection(url, username, password);

        // Execute a query
        String query = "SELECT * FROM SQLcustomers";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Process the result set
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("customers_id"));
            System.out.println("Name: " + resultSet.getString("firstname"));
            System.out.println("Email: " + resultSet.getString("email"));
            System.out.println("---------");
        }

        // Close resources
        resultSet.close();
        statement.close();
        connection.close();
    }
}
