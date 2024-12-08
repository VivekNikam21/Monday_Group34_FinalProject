/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class SpecialistProfile extends Profile {
    
    public SpecialistProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Specialist"; // Implements the abstract method
    }
}
