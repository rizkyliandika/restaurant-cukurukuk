/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.restaurant.cukurukuk.models;

import java.util.Objects;

/**
 *
 * @author Recky_118439
 */
public class Menu {
    private int id;
    private String name;
    private int price;
    private String image;
    private boolean status;
    private int categoryId;

    public Menu(String name, int price, String image, boolean status, int categoryId) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.status = status;
        this.categoryId = categoryId;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.price;
        hash = 47 * hash + Objects.hashCode(this.image);
        hash = 47 * hash + (this.status ? 1 : 0);
        hash = 47 * hash + this.categoryId;
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
        if (this.price != other.price) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.image, other.image);
    }

    @Override
    public String toString() {
        return "Menu{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", status=" + status + ", categoryId=" + categoryId + '}';
    }
}
