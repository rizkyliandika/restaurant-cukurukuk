/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.controller;

import com.kelompok2.restaurant.cukurukuk.dao.TableDao;
import com.kelompok2.restaurant.cukurukuk.db.DatabaseConnection;
import com.kelompok2.restaurant.cukurukuk.models.Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P051021010
 */
public class TableDaoImpl implements TableDao {
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Table table) throws SQLException {
        String query = "INSERT INTO restaurant.`tables` (tableNumber, active) VALUES (?, ?)";
        
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, table.getTableNumber());
        ps.setBoolean(2, table.isActive());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM restaurant.`tables` where id =?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Table getTable(int id) throws SQLException {
        String query = "SELECT * FROM restaurant.`user` where id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        Table table = new Table();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            table.setTableNumber(rs.getInt("tableNumber"));
            table.setActive(rs.getBoolean("active"));
        }
        if (check == true) {
            return table;
        } else {
            return null;
        }
    }

    @Override
    public List<Table> getTables() throws SQLException {
        String query = "SELECT * FROM restaurant.`user`";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Table> ls = new ArrayList<>();

        while (rs.next()) {
            Table table = new Table();
            table.setId(rs.getInt("id"));
            table.setTableNumber(rs.getInt("tableNumber"));
            table.setActive(rs.getBoolean("active"));
            ls.add(table);
        }
        return ls;    
    }

    @Override
    public void update(Table table) throws SQLException {
        String query
                = "UPDATE restaurant.`user` set tableNumber=?, active=?, where id = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, table.getTableNumber());
        ps.setBoolean(2, table.isActive());
        ps.executeUpdate();
    }
}
