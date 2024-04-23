package com.kelompok2.restaurant.cukurukuk.dao;

import com.kelompok2.restaurant.cukurukuk.models.Cashier;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author P051021010
 */
public interface CashierDao {
    Cashier get(int id);
    List<Cashier> getAll();
    void save(Cashier cashier);
    void update(Cashier cashier);
    void delete(Cashier cashier);
}
