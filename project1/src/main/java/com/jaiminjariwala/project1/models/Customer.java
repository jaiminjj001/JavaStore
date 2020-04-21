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
public class Customer extends Person{
    
    private int customerId;
    private String membershipId;

    public int getCustomerId() {
        return customerId;
    }

    public String getMembershipId() {
        return membershipId;
    }
    
    
}
