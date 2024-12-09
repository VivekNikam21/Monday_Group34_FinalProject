/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class TherapistProfile extends Profile {
    public TherapistProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Therapist"; // Implements the abstract method
    }
}
