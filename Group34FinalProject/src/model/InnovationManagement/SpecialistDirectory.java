/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class SpecialistDirectory {
 ArrayList<SpecialistProfile> specialistlist;
     
     public SpecialistDirectory(){
         specialistlist = new ArrayList<SpecialistProfile>();
     }
    
     public SpecialistProfile addSpecialistProfile(Person p){
         
         SpecialistProfile sp = new SpecialistProfile();
         specialistlist.add(sp);
         return sp;
     }   
}
