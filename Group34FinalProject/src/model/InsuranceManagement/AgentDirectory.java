/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;
import model.InnovationManagement.SpecialistProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class AgentDirectory {
    
     ArrayList<AgentProfile> agentlist;
     
     public AgentDirectory(){
         agentlist = new ArrayList<AgentProfile>();
     }
    
     public AgentProfile addAgentProfile(Person p){
         
         AgentProfile ap = new AgentProfile();
         agentlist.add(ap);
         return ap;
     }   
}
