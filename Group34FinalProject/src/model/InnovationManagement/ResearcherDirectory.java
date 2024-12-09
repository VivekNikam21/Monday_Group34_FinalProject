/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;
import model.Business;
import model.ClinicManagement.TherapistProfile;
import model.InsuranceManagement.Agent;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.PolicyManagement;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class ResearcherDirectory {
    ArrayList<ResearcherProfile> researcherlist;
     Business business;
      ArrayList<Researcher> researchers;
      ResearchManagement researchmanagement;
     
     public ResearcherDirectory(){
         researcherlist = new ArrayList<ResearcherProfile>();
         researchers = new ArrayList<Researcher>();
     }
    
     public ResearcherProfile addResearcherProfile(Person p){
         
         ResearcherProfile rp = new ResearcherProfile(p);
         researcherlist.add(rp);
         return rp;
     }
     public ResearchManagement getResearchManagement() {
        return researchmanagement;
    }
     
     public Researcher findResearcher(String id){
        
        for (Researcher researcher: researchers){
            
            if(researcher.getName().equals(id)) return researcher;
        }
        return null;
        }
     
      public Researcher newResearcher(String n){
        Researcher researcher = new Researcher(n, this.business);
        researchers.add(researcher);
        return researcher;

    }
public ArrayList<Researcher> getResearcherList(){
        return researchers;
    }
}
