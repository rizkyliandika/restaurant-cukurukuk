/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.dao;

import com.kelompok2.restaurant.cukurukuk.models.Table;
import java.util.List;

/**
 *
 * @author P051021010
 */
public interface TableDao {
    Table get(int id);
    List<Table> getAll();
    void save(Table table);
    void update(Table table);
    void delete(Table table);
}
