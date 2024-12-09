/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ClinicManagement.PatientManagement;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class AdminProfile extends Profile {
    
    Business business;
    String name;
    public AdminProfile (Person p){
        super(p);
    }
    
    public String getName(){
        return name;
    }
    @Override
    public String getRole() {
        return "Admin"; // Implements the abstract method
    }
    
}
