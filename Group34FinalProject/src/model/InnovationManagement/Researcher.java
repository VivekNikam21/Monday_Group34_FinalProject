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
public class Researcher {
 Business business;
    String name;
    ResearchManagement researchmanagement;
    
    public Researcher (String n, Business business){
        this.business = business;
        this.name = n;
        researchmanagement = new ResearchManagement("Research");
    }
    
    public String getName(){
        return name;
    }
    
     public ResearchManagement getResearchManagement(){
        return researchmanagement;
    }
     
     @Override
   public String toString(){
       return name;
   }   
}
