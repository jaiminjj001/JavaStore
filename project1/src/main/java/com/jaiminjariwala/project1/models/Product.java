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
public class Product {
    
    private final int productUPC;
    private String name;
    private String description;
    private double sellingPrc;
    private double costPrc;
    private double discount;
    private String remarks;
    private int inStock;

    public Product(int productUPC) {
        this.productUPC = productUPC;
    }

    public Product(int productUPC, String name, String description, double sellingPrc, double costPrc, double discount, String remarks, int inStock) {
        this.productUPC = productUPC;
        this.name = name;
        this.description = description;
        this.sellingPrc = sellingPrc;
        this.costPrc = costPrc;
        this.discount = discount;
        this.remarks = remarks;
        this.inStock = inStock;
    }
    
    
    public int getProductUPC() {
        return productUPC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSellingPrc() {
        return sellingPrc;
    }

    public void setSellingPrc(double sellingPrc) {
        this.sellingPrc = sellingPrc;
    }

    public double getCostPrc() {
        return costPrc;
    }

    public void setCostPrc(double costPrc) {
        this.costPrc = costPrc;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    
    
}
