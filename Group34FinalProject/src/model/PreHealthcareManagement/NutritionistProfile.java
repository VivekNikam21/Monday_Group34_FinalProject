/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class NutritionistProfile extends Profile {
    public NutritionistProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Nutritionist"; // Implements the abstract method
    }
}
