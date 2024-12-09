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
public class ResearcherProfile extends Profile {
    
    public ResearcherProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Researcher"; // Implements the abstract method
    }
}
