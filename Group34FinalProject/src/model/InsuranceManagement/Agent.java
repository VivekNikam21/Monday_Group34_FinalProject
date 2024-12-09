/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import model.Business;
import model.ClinicManagement.PatientManagement;

/**
 *
 * @author nikam
 */
public class Agent {
    Business business;
    String name;
    PolicyManagement policymanagement;
    ClientManagement clientmanagement;
    
    public Agent (String n, Business business){
        this.business = business;
        this.name = n;
        clientmanagement = new ClientManagement("Client");
        policymanagement = new PolicyManagement("Policy");
    }
    
    public String getName(){
        return name;
    }
    
     public ClientManagement getClientManagement(){
        return clientmanagement;
    }
     public PolicyManagement getPolicyManagement(){
        return policymanagement;
    }
     
     @Override
   public String toString(){
       return name;
   }
}
