/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.Business;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class NutritionistDirectory {
    Business business;
    ArrayList<NutritionistProfile> nutritionistlist;
     ArrayList<Nutritionist> nutritionists;
     MealManagement mealmanagement;
     
     public NutritionistDirectory(){
         nutritionistlist = new ArrayList<NutritionistProfile>();
          nutritionists = new ArrayList<Nutritionist>();
     }
    
     public MealManagement getMealManagement() {
        return mealmanagement;
    }
     public NutritionistProfile addNutritionistProfile(Person p){
         
         NutritionistProfile np = new NutritionistProfile(p);
         nutritionistlist.add(np);
         return np;
     }   
     
     public Nutritionist findNutritionist(String id){
        
        for (Nutritionist nutritionist: nutritionists){
            
            if(nutritionist.getName().equals(id)) return nutritionist;
        }
        return null;
        }
     
      public Nutritionist newNutritionist(String n){
        Nutritionist nutritionist = new Nutritionist(n, this.business);
        nutritionists.add(nutritionist);
        return nutritionist;

    }
public ArrayList<Nutritionist> getNutritionistList(){
        return nutritionists;
    }
}
