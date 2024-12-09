/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class PatientManagement {
    ArrayList<Patient> patients;
    
    public PatientManagement(String n) {
         patients = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
     public Patient newPatient(String n, int id, int age, String eid, String nu) {
        Patient p = new Patient(n,id, age, eid, nu);
        patients.add(p);
        return p;
    }
     
     public ArrayList<Patient> getPatientList(){
        return patients;
    }

     
}
