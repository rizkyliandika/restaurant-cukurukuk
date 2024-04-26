/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.kelompok2.restaurant.cukurukuk.db;
import java.sql.*;

/**
 *
 * @author P051021010
 */
public class DatabaseConnection {
    private static Connection con = null;
    private static final String DB_URI = "jdbc:mysql://localhost:3306/restaurant";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "D1k4321";
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Connection getConnection()
    {
        return con;
    }

}
