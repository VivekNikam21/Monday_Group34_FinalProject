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
public class Nutritionist {
     Business business;
    String name;
    MealManagement mealmanagement;
    
    public Nutritionist (String n, Business business){
        this.business = business;
        this.name = n;
        mealmanagement = new MealManagement("Meal");
       // peoplemanagement = new PeopleManagement("People");
    }
    
    public String getName(){
        return name;
    }
    
     public MealManagement getMealManagement(){
        return mealmanagement;
    }
    /* public PeopleManagement getPeopleManagement(){
        return peoplemanagement;
    }*/
     @Override
   public String toString(){
       return name;
   }
}
