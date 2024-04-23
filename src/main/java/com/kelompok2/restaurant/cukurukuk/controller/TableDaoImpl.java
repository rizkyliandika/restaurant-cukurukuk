/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.controller;

import com.kelompok2.restaurant.cukurukuk.dao.TableDao;
import com.kelompok2.restaurant.cukurukuk.models.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P051021010
 */
public class TableDaoImpl implements TableDao {
    List<Table> tables;

    public TableDaoImpl() {
        tables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tables.add(new Table(i, Integer.toString(i + 1)));
        }
    }
    
    @Override
    public Table get(int id) {
        return tables.get(id);
    }

    @Override
    public List<Table> getAll() {
        return tables;
    }

    @Override
    public void save(Table table) {
        tables.add(table);
    }

    @Override
    public void update(Table table) {
        tables.set(table.getId(), table);
    }

    @Override
    public void delete(Table table) {
        tables.remove(table);
    }
}
