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
public class Employee extends Person {
    
    private int employeeId;
    private String password;
    boolean special;

    public Employee(String password, boolean special) {
        this.password = password;
        this.special = special;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }    
}
