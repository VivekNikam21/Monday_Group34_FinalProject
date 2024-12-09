/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

/**
 *
 * @author nikam
 */
public class Meal {
    String name;
    String dp; 
    String allergy;
    String days;
    
    public Meal(String n, String d, String a, String dy) {
        name = n;
        dp = d;
        allergy = a;
        days = dy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    
    
    @Override
    public String toString(){
         return name;
    }
    
    
}
