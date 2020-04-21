/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiminjariwala.project1.models;

import java.util.ArrayList;

/**
 *
 * @author Jaimin Jariwala
 */
public class Cart {
        
    private ArrayList<LineItem> items;
    private double totalAmount;
    private int itemCount;

    public ArrayList<LineItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getItemCount() {
        return itemCount;
    }
    
    public void addItem(LineItem item){
        items.add(item);
    }
    
    public void removeItem(LineItem item){
        items.remove(item);
    }
    
    public void removeAll(){
        items.clear();
    }
}
