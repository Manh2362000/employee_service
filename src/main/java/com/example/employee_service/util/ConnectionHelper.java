package com.example.employee_service.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/t2008m_restful_web_demo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection =
                        DriverManager.getConnection(CONNECTION_STRING,USERNAME,PASSWORD);
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
