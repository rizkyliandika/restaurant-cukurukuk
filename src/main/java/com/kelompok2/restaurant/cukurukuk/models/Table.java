/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.models;

import java.util.Objects;

/**
 *
 * @author P051021010
 */
public class Table {
    private int id;
    private String tableNumber;
    
    public Table () {
        
    }
    
    public Table (String tableNumber) {
        this.tableNumber = tableNumber;
    }
    
    public Table (int id, String tableNumber) {
        this.id = id;
        this.tableNumber = tableNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.tableNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Table other = (Table) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.tableNumber, other.tableNumber);
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", tableNumber=" + tableNumber + '}';
    }
}
