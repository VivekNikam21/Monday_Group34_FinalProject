/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;
import model.Business;
import model.InsuranceManagement.Agent;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.PolicyManagement;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class SpecialistDirectory {
 ArrayList<SpecialistProfile> specialistlist;
  Business business;
      ArrayList<Specialist> specialists;
      InnovationManagement innovationmanagement;
     
     public SpecialistDirectory(){
         specialistlist = new ArrayList<SpecialistProfile>();
         specialists = new ArrayList<Specialist>();
     }
    
     public SpecialistProfile addSpecialistProfile(Person p){
         
         SpecialistProfile sp = new SpecialistProfile(p);
         specialistlist.add(sp);
         return sp;
     }   
     public InnovationManagement getInnovationManagement() {
        return innovationmanagement;
    }
     public Specialist findSpecialist(String id){
        
        for (Specialist specialist: specialists){
            
            if(specialist.getName().equals(id)) return specialist;
        }
        return null;
        }
     
      public Specialist newSpecialist(String n){
        Specialist specialist = new Specialist(n, this.business);
        specialists.add(specialist);
        return specialist;

    }
public ArrayList<Specialist> getSpecialistList(){
        return specialists;
    }
}
