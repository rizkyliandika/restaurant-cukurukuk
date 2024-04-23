/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.controller;

import com.kelompok2.restaurant.cukurukuk.dao.CashierDao;
import com.kelompok2.restaurant.cukurukuk.db.DatabaseConnection;
import com.kelompok2.restaurant.cukurukuk.models.Cashier;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author P051021010
 */
public class CashierDaoImpl implements CashierDao {

    List<Cashier> cashiers;
    DatabaseConnection connection = new DatabaseConnection();
    BeanListHandler<Cashier> beanListHandler;

    @Override
    public Cashier get(int id) {
        return cashiers.get(id);
    }

    @Override
    public List<Cashier> getAll() {
        beanListHandler = new BeanListHandler<>(Cashier.class);
        String query = "SELECT * FROM cashier";
        QueryRunner runner = new QueryRunner();
        try {
            cashiers = runner.query(connection.Datasource(), query, beanListHandler);
            return cashiers;
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return cashiers;
    }

    @Override
    public void save(Cashier cashier) {
        cashiers.add(cashier);
    }

    @Override
    public void update(Cashier cashier) {
        cashiers.set(cashier.getId(), cashier);
    }

    @Override
    public void delete(Cashier cashier) {
        cashiers.remove(cashier);
    }

}
