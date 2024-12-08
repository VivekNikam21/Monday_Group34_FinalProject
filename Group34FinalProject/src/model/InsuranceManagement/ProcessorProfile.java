/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class ProcessorProfile extends Profile {
    public ProcessorProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Processor"; // Implements the abstract method
    }
}
