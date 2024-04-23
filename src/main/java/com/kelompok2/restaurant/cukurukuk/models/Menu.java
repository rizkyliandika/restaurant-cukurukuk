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
public class Menu {
    private int id;
    private int availability;
    private String description;

    public Menu(int availability, String description) {
        this.availability = availability;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + this.availability;
        hash = 79 * hash + Objects.hashCode(this.description);
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
        final Menu other = (Menu) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.availability != other.availability) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    @Override
    public String toString() {
        return "Menu{" + "id=" + id + ", availability=" + availability + ", description=" + description + '}';
    }
}
