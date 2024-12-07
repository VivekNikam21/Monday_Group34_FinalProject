/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class NutritionistDirectory {
    ArrayList<NutritionistProfile> nutritionistlist;
     
     public NutritionistDirectory(){
         nutritionistlist = new ArrayList<NutritionistProfile>();
     }
    
     public NutritionistProfile addNutritionistProfile(Person p){
         
         NutritionistProfile np = new NutritionistProfile();
         nutritionistlist.add(np);
         return np;
     }   
}
