/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class ProcessorDirectory {
    
    ArrayList<ProcessorProfile> processorlist;
     
     public ProcessorDirectory(){
         processorlist = new ArrayList<ProcessorProfile>();
     }
    
     public ProcessorProfile addProcessorProfile(Person p){
         
         ProcessorProfile pp = new ProcessorProfile(p);
         processorlist.add(pp);
         return pp;
     }   
}
