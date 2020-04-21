/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiminjariwala.project1.models;

/**
 *
 * @author Jaimin Jariwala
 */
public class LineItem{
    
    private final Product product;
    private int quantity;
    private double discount;
    private String description;

    public LineItem(Product product, int quantity, double discount, String description) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.description = description;
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public LineItem(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
