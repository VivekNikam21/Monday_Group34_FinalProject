/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.InsuranceManagement.ProcessorProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class CoachDirectory {
      ArrayList<CoachProfile> coachlist;
     
     public CoachDirectory(){
         coachlist = new ArrayList<CoachProfile>();
     }
    
     public CoachProfile addCoachProfile(Person p){
         
         CoachProfile cp = new CoachProfile(p);
         coachlist.add(cp);
         return cp;
     }   
}
