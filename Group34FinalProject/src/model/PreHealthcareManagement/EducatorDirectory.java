/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class EducatorDirectory {
    ArrayList<EducatorProfile> educatorlist;
     
     public EducatorDirectory(){
         educatorlist = new ArrayList<EducatorProfile>();
     }
    
     public EducatorProfile addEducatorProfile(Person p){
         
         EducatorProfile ep = new EducatorProfile(p);
         educatorlist.add(ep);
         return ep;
     }   
}
