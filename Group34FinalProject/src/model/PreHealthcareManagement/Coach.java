/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import model.Business;
import model.InsuranceManagement.ClientManagement;
import model.InsuranceManagement.PolicyManagement;

/**
 *
 * @author nikam
 */
public class Coach {
    Business business;
    String name;
    ProgramManagement programmanagement;
    PeopleManagement peoplemanagement;
    
    public Coach (String n, Business business){
        this.business = business;
        this.name = n;
        programmanagement = new ProgramManagement("Program");
        peoplemanagement = new PeopleManagement("People");
    }
    
    public String getName(){
        return name;
    }
    
     public ProgramManagement getProgramManagement(){
        return programmanagement;
    }
     public PeopleManagement getPeopleManagement(){
        return peoplemanagement;
    }
     @Override
   public String toString(){
       return name;
   }
}
