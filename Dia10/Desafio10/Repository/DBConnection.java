package Dia10.Desafio10.Repository;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://172.17.0.2/seciteci";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
        return conn;
    }
}
