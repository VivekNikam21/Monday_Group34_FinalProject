/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import model.Business;
import model.InsuranceManagement.ClientManagement;
import model.InsuranceManagement.PolicyManagement;

/**
 *
 * @author nikam
 */
public class Specialist {
   Business business;
    String name;
    InnovationManagement innovationmanagement;
    
    public Specialist (String n, Business business){
        this.business = business;
        this.name = n;
        innovationmanagement = new InnovationManagement("Innovation");
    }
    
    public String getName(){
        return name;
    }
    
     public InnovationManagement getInnovationManagement(){
        return innovationmanagement;
    }
     
     @Override
   public String toString(){
       return name;
   }   
}
