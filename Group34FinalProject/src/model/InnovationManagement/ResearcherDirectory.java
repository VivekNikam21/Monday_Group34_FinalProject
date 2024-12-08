/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;
import model.ClinicManagement.TherapistProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class ResearcherDirectory {
    ArrayList<ResearcherProfile> researcherlist;
     
     public ResearcherDirectory(){
         researcherlist = new ArrayList<ResearcherProfile>();
     }
    
     public ResearcherProfile addResearcherProfile(Person p){
         
         ResearcherProfile rp = new ResearcherProfile();
         researcherlist.add(rp);
         return rp;
     }
}
