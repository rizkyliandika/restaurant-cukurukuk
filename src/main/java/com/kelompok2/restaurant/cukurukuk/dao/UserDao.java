/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.dao;

import com.kelompok2.restaurant.cukurukuk.models.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dika
 */
public interface UserDao {
    public int add(User user) throws SQLException;
    public void delete (int id) throws SQLException;
    public User getUser(int id) throws SQLException;
    public List<User> getUsers() throws SQLException;
    public void update(User user) throws SQLException;
    public User getUserByUsername(String username) throws SQLException;
    public User login(String username, String password) throws SQLException;
}
