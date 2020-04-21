/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiminjariwala.project1.models;

import java.util.Date;

/**
 *
 * @author Jaimin Jariwala
 */
public class Invoice {
 
    private final int invoiceNo;
    private Date invoiceDate;
    private int customerId;
    private final int employeeId;
    private int storeId;
    private double tax;
    private double total;
    private Cart cart;

    public Invoice(int invoiceNo,int employeeId) {
        this.invoiceNo = invoiceNo;
        this.employeeId = employeeId;
        cart = new Cart();
    }

    public Invoice(int invoiceNo, Date invoiceDate, int customerId, int employeeId, int storeId, double tax, double total) {
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.storeId = storeId;
        this.tax = tax;
        this.total = total;
        cart = new Cart();
    }

    
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
