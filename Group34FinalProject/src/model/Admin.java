/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ClinicManagement.PatientManagement;

/**
 *
 * @author nikam
 */
public class Admin {
    Business business;
    String name;
  
    public Admin (String n, Business business){
        this.business = business;
        this.name = n;
    }
    
    public String getName(){
        return name;
    }
    
   
     @Override
   public String toString(){
       return name;
   }
}
