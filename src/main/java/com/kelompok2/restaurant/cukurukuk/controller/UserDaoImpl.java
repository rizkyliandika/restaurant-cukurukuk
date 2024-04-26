/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.controller;

import com.kelompok2.restaurant.cukurukuk.dao.UserDao;
import com.kelompok2.restaurant.cukurukuk.db.DatabaseConnection;
import com.kelompok2.restaurant.cukurukuk.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author P051021010
 */
public class UserDaoImpl implements UserDao {

    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(User user) throws SQLException {
        String query = "INSERT INTO cashier.`user` (username, email, password, active) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, user.getUsername());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setBoolean(4, user.getActive());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM user where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public User getUser(int id) throws SQLException {
        String query = "SELECT * FROM user where id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setActive(rs.getBoolean("active"));
        }
        if (check == true) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String query = "SELECT * FROM user";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList<>();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setActive(rs.getBoolean("active"));
            ls.add(user);
        }
        return ls;
    }

    @Override
    public void update(User user) throws SQLException {
        String query
                = "UPDATE user set username=?, email=?, password=?, active=?, where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setBoolean(4, user.getActive());
        ps.executeUpdate();
    }

    @Override
    public User getUserByUsername(String username) throws SQLException {
        String query = "SELECT * FROM user where username=?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, username);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setActive(rs.getBoolean("active"));
        }
        if (check == true) {
            return user;
        } else {
            throw new NullPointerException("User not found !");
        }
    }

    @Override
    public User login(String username, String password) throws SQLException {
        String query = "SELECT * FROM user where username=? AND password=?";
        PreparedStatement ps
                = con.prepareStatement(query);

        ps.setString(1, username);
        ps.setString(2, password);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setActive(rs.getBoolean("active"));
        }
        
        if (check == true) {
            return user;
        }
        throw new NullPointerException("Username or Password is invalid !");
    }

}
