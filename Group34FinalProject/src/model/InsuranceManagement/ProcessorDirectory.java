/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;
import model.Business;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class ProcessorDirectory {
    Business business;
    ArrayList<Processor> processors;
      ClaimManagement claimmanagement;
      DocManagement docmanagement;
    ArrayList<ProcessorProfile> processorlist;
     
     public ProcessorDirectory(){
         processorlist = new ArrayList<ProcessorProfile>();
         processors = new ArrayList<Processor>();
     }
    
     public ProcessorProfile addProcessorProfile(Person p){
         
         ProcessorProfile pp = new ProcessorProfile(p);
         processorlist.add(pp);
         return pp;
     }   
     
     
     public ClaimManagement getClaimManagement() {
        return claimmanagement;
    }
     public DocManagement getDocManagement() {
        return docmanagement;
    }
     public Processor findProcessor(String id){
        
        for (Processor processor: processors){
            
            if(processor.getName().equals(id)) return processor;
        }
        return null;
        }
     
      public Processor newProcessor(String n){
        Processor processor = new Processor(n, this.business);
        processors.add(processor);
        return processor;

    }
public ArrayList<Processor> getProcessorList(){
        return processors;
    }
}
