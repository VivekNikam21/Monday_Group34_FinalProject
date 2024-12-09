/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import model.Business;

/**
 *
 * @author nikam
 */
public class Therapist {
    
    Business business;
    String name;
    PatientManagement patientmanagement;
    
    public Therapist (String n, Business business){
        this.business = business;
        this.name = n;
        patientmanagement = new PatientManagement("Client");
    }
    
    public String getName(){
        return name;
    }
    
     public PatientManagement getPatientManagement(){
        return patientmanagement;
    }
     
     @Override
   public String toString(){
       return name;
   }
    
}
