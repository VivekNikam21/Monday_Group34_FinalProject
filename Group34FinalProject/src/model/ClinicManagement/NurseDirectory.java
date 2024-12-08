/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;
import java.util.function.Supplier;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class NurseDirectory {
    
     ArrayList<NurseProfile> nurselist;
     
     public NurseDirectory(){
         nurselist = new ArrayList<NurseProfile>();
     }
    
     public NurseProfile addNurseProfile(Person p){
         
         NurseProfile np = new NurseProfile(p);
         nurselist.add(np);
         return np;
     }
}
