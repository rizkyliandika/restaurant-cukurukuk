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
public class Transaction {
    private int id;
    private SimpleDateFormat transactionDate;
    private int total;
    private int orderId;
    private int userId;
    private int reservationid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimpleDateFormat getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(SimpleDateFormat transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReservationid() {
        return reservationid;
    }

    public void setReservationid(int reservationid) {
        this.reservationid = reservationid;
    }

    public Transaction(SimpleDateFormat transactionDate, int total, int orderId, int userId, int reservationid) {
        this.transactionDate = transactionDate;
        this.total = total;
        this.orderId = orderId;
        this.userId = userId;
        this.reservationid = reservationid;
    }

    public Transaction() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.transactionDate);
        hash = 13 * hash + this.total;
        hash = 13 * hash + this.orderId;
        hash = 13 * hash + this.userId;
        hash = 13 * hash + this.reservationid;
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
        final Transaction other = (Transaction) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.total != other.total) {
            return false;
        }
        if (this.orderId != other.orderId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (this.reservationid != other.reservationid) {
            return false;
        }
        return Objects.equals(this.transactionDate, other.transactionDate);
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + id + ", transactionDate=" + transactionDate + ", total=" + total + ", orderId=" + orderId + ", userId=" + userId + ", reservationid=" + reservationid + '}';
    }
    
}
