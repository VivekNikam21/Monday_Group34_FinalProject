/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author nikam
 */
public class NurseProfile extends Profile{

    public NurseProfile (Person p){
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Nurse"; // Implements the abstract method
    }
}
