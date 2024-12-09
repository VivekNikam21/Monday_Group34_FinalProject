/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;
import model.Business;
import model.ClinicManagement.PatientManagement;
import model.ClinicManagement.Therapist;
import model.InnovationManagement.SpecialistProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class AgentDirectory {
        
    Business business;
     ArrayList<AgentProfile> agentlist;
      ArrayList<Agent> agents;
      PolicyManagement policymanagement;
      ClientManagement clientmanagement;
     
     public AgentDirectory(){
         agentlist = new ArrayList<AgentProfile>();
         agents = new ArrayList<Agent>();
     }
    
     public AgentProfile addAgentProfile(Person p){
         
         AgentProfile ap = new AgentProfile(p);
         agentlist.add(ap);
         return ap;
     }   
     
     public PolicyManagement getPolicyManagement() {
        return policymanagement;
    }
     public ClientManagement getClientManagement() {
        return clientmanagement;
    }
     public Agent findAgent(String id){
        
        for (Agent agent: agents){
            
            if(agent.getName().equals(id)) return agent;
        }
        return null;
        }
     
      public Agent newAgent(String n){
        Agent agent = new Agent(n, this.business);
        agents.add(agent);
        return agent;

    }
public ArrayList<Agent> getAgentList(){
        return agents;
    }
}
