/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.dao;

import com.kelompok2.restaurant.cukurukuk.models.Table;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author P051021010
 */
public interface TableDao {
    public int add(Table table) throws SQLException;
    public void delete (int id) throws SQLException;
    public Table getTable(int id) throws SQLException;
    public List<Table> getTables() throws SQLException;
    public void update(Table user) throws SQLException;
}
