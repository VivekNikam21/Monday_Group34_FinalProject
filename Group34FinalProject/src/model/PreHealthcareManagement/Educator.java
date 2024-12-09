/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import model.Business;

/**
 *
 * @author nikam
 */
public class Educator {
    Business business;
    String name;
    ResourceManagement resourcemanagement;
    
    public Educator (String n, Business business){
        this.business = business;
        this.name = n;
        resourcemanagement = new ResourceManagement("Program");
       // peoplemanagement = new PeopleManagement("People");
    }
    
    public String getName(){
        return name;
    }
    
     public ResourceManagement getResourceManagement(){
        return resourcemanagement;
    }
    /* public PeopleManagement getPeopleManagement(){
        return peoplemanagement;
    }*/
     @Override
   public String toString(){
       return name;
   }
}
