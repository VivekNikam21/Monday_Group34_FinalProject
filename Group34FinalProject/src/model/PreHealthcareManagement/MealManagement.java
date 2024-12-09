/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class MealManagement {
     ArrayList<Meal> meals;
    
    public MealManagement(String n) {
         meals = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Meal newMeal(String n, String d, String a, String dy) {
        Meal m = new Meal(n,d, a, dy);
        meals.add(m);
        return m;
    }
    public ArrayList<Meal> getMealList(){
        return meals;
    }

    public void removeMeal(Meal m) {
        meals.remove(m);
    }
    
    public Meal searchMeal(String search){
        for (Meal m:meals){
            if(m.getName().contains(search)) {
                return m;
        }
        }
        return null;
    }   
}
