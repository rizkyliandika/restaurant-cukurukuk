/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.models;

import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 *
 * @author Recky_118439
 */
public class Reservation {
    private int id;
    private SimpleDateFormat reservationDate;
    private int tableId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimpleDateFormat getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(SimpleDateFormat reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
    
    public Reservation(SimpleDateFormat reservationDate, int tableId) {
        this.reservationDate = reservationDate;
        this.tableId = tableId;
    }

    public Reservation() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.reservationDate);
        hash = 29 * hash + this.tableId;
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
        final Reservation other = (Reservation) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.tableId != other.tableId) {
            return false;
        }
        return Objects.equals(this.reservationDate, other.reservationDate);
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", reservationDate=" + reservationDate + ", tableId=" + tableId + '}';
    }    
    
}