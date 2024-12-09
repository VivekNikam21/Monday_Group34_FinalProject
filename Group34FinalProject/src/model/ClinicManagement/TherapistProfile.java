/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import model.Business;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class TherapistProfile extends Profile {
    Business business;
    String name;
    PatientManagement patientmanagement;
    public TherapistProfile (Person p){
        super(p);
    }
    
    public String getName(){
        return name;
    }
    @Override
    public String getRole() {
        return "Therapist"; // Implements the abstract method
    }
    
}
