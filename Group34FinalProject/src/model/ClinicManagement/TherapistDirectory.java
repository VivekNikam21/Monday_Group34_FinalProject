/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class TherapistDirectory {
    ArrayList<TherapistProfile> therapistlist;
     
     public TherapistDirectory(){
         therapistlist = new ArrayList<TherapistProfile>();
     }
    
     public TherapistProfile addTherapistProfile(Person p){
         
         TherapistProfile tp = new TherapistProfile();
         therapistlist.add(tp);
         return tp;
     }
}
