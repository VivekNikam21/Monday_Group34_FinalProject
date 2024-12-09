/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import model.Business;

/**
 *
 * @author nikam
 */
public class Processor {
     Business business;
    String name;
    ClaimManagement claimmanagement;
    DocManagement docmanagement;
    
     public Processor (String n, Business business){
        this.business = business;
        this.name = n;
        claimmanagement = new ClaimManagement("Claim");
        docmanagement = new DocManagement("Doc");
    }
    
    public String getName(){
        return name;
    }
    
     public ClaimManagement getClaimManagement(){
        return claimmanagement;
    }
     public DocManagement getDocManagement(){
        return docmanagement;
    }
     
     @Override
   public String toString(){
       return name;
   }
}
