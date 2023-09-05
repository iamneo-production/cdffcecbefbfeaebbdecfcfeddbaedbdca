package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        // Database connection information
        String jdbcURL = "mysql://localhost:8080/mysql";
        String username = "root";
        String password = "root";

        // Attempt to establish a connection
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Database connection successful!");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
