/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class Patient {
     private String name;
    private int id;
    private int age;
    private String emailid;
    private String contact;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public Patient(String n, int id, int age, String eid, String nu) {
        name = n;
        this.id = id;
        this.age = age;
        emailid = eid;
        contact = nu;
    }
    
     @Override
    public String toString(){
         return String.valueOf(id);
    }
    public int getAge(){
        return age;
    }
}
