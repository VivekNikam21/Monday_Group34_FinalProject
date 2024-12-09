/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.Business;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class EducatorDirectory {
    Business business;
    ArrayList<EducatorProfile> educatorlist;
     ArrayList<Educator> educators;
      ResourceManagement resourcemanagement;
    //  PeopleManagement peoplemanagement;
     
     public EducatorDirectory(){
         educatorlist = new ArrayList<EducatorProfile>();
         educators = new ArrayList<Educator>();
     }
    public ResourceManagement getResourceManagement() {
        return resourcemanagement;
    }
     public EducatorProfile addEducatorProfile(Person p){
         
         EducatorProfile ep = new EducatorProfile(p);
         educatorlist.add(ep);
         return ep;
     }   
     
     public Educator findEducator(String id){
        
        for (Educator educator: educators){
            
            if(educator.getName().equals(id)) return educator;
        }
        return null;
        }
     
      public Educator newEducator(String n){
        Educator educator = new Educator(n, this.business);
        educators.add(educator);
        return educator;

    }
public ArrayList<Educator> getEducatorList(){
        return educators;
    }
}
