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
public class Store {
    
    private final int storeId;
    private String name;
    private String adddress;
    private final String licenseNo;
    private final String registrationNo;
    private String contactNo;
    private Manager manager;

    public Store(int storeId, String licenseNo, String registrationNo, Manager manager) {
        this.storeId = storeId;
        this.licenseNo = licenseNo;
        this.registrationNo = registrationNo;
        this.manager = manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    public String getName() {
        return name;
    }

    public String getAdddress() {
        return adddress;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public Manager getManager() {
        return manager;
    }
    
    
}
