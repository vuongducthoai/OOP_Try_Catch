package _05_EXCEPTION.OOP_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String CONNECTION_URL = "jdbc:sqlserver://localhost:1433;database=LapTrinh;encrypt=true;trustServerCertificate=true;";
    public static final String DB_USER = "sa";
    public static final String DB_PASSWORD = "Thoai12309@";

    private static Connection connection;

    public DbConnection(){

    }

    public static Connection getConnection(){
        if(connection == null){
            try {
              Class.forName(DB_DRIVER);
              connection = DriverManager.getConnection(CONNECTION_URL, DB_USER, DB_PASSWORD);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            if(connection != null && !connection.isClosed()){
                connection.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e){
            System.out.println("Error closing connection");
        }
    }

}
