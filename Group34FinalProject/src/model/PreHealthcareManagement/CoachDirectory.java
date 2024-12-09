/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.Business;
import model.InsuranceManagement.Agent;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.ClientManagement;
import model.InsuranceManagement.PolicyManagement;
import model.InsuranceManagement.ProcessorProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class CoachDirectory {
    Business business;
      ArrayList<CoachProfile> coachlist;
       ArrayList<Coach> coaches;
      ProgramManagement programmanagement;
      PeopleManagement peoplemanagement;
     
       public CoachDirectory(){
         coachlist = new ArrayList<CoachProfile>();
         coaches = new ArrayList<Coach>();
     }
    
     public CoachProfile addCoachProfile(Person p){
         
         CoachProfile cp = new CoachProfile(p);
         coachlist.add(cp);
         return cp;
     }   
     
     public ProgramManagement getProgramManagement() {
        return programmanagement;
    }
     public PeopleManagement getPeopleManagement() {
        return peoplemanagement;
    }
      public Coach findCoach(String id){
        
        for (Coach coach: coaches){
            
            if(coach.getName().equals(id)) return coach;
        }
        return null;
        }
     
      public Coach newCoach(String n){
        Coach coach = new Coach(n, this.business);
        coaches.add(coach);
        return coach;

    }
public ArrayList<Coach> getCoachList(){
        return coaches;
    }
}
