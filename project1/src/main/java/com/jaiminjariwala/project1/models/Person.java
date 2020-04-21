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
public class Person {
    private String name;
    private int age;
    private String address;
    private String contact;
    private String nationalId;

    public Person() {
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
