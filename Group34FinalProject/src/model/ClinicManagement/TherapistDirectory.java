/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;
import model.Business;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class TherapistDirectory {
    Business business;
    ArrayList<TherapistProfile> therapistlist;
    ArrayList<Therapist> therapists;
    PatientManagement patientmanagement;
     
     public TherapistDirectory(){
         therapistlist = new ArrayList<TherapistProfile>();
         therapists = new ArrayList<Therapist>();
     }
    
     public TherapistProfile addTherapistProfile(Person p){
         
         TherapistProfile tp = new TherapistProfile(p);
         therapistlist.add(tp);
         return tp;
     }
     public Therapist findTherapist(String id){
        
        for (Therapist therapist: therapists){
            
            if(therapist.getName().equals(id)) return therapist;
        }
        return null;
        }
     public PatientManagement getPatientManagement() {
        return patientmanagement;
    }
     
     public Therapist newTherapist(String n){
        Therapist therapist = new Therapist(n, this.business);
        therapists.add(therapist);
        return therapist;

    }
    public ArrayList<Therapist> getTherapistList(){
        return therapists;
    }
    
    
}
