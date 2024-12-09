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
    
     public Patient newPatient(String n, int id, int age, String eid, String nu, String t, String ts, String s, String ns, String m, int d, int f) {
        Patient p = new Patient(n,id, age, eid, nu, t, ts, s ,ns,m,d,f);
        patients.add(p);
        return p;
    }
     
     public ArrayList<Patient> getPatientList(){
        return patients;
    }

    public void removePatient(Patient p) {
        patients.remove(p);
    }
    
    public Patient searchPatient(String search){
        for (Patient p:patients){
            if(p.getName().contains(search)) {
                return p;
        }
        }
        return null;
    }
}
