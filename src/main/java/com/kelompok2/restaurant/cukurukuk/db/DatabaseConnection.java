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
    private Connection connection = null;
    
    public Connection Datasource() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        String url = "jdbc:mysql://localhost:3306/restaurant";
        String username = "root";
        String password = "D1k4321";
        this.connection = DriverManager.getConnection(url, username, password);
        return this.connection;
    }

}
