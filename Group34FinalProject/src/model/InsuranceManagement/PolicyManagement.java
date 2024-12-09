/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;
import model.ClinicManagement.Patient;

/**
 *
 * @author nikam
 */
public class PolicyManagement {
    
     ArrayList<Policy> policies;
    
    public PolicyManagement(String n) {
         policies = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Policy newPolicy(String n, int id, int am, String v) {
        Policy p = new Policy(n,id, am, v);
        policies.add(p);
        return p;
    }
    public ArrayList<Policy> getPolicyList(){
        return policies;
    }

    public void removePolicy(Policy p) {
        policies.remove(p);
    }
    
    public Policy searchPolicy(String search){
        for (Policy p:policies){
            if(p.getName().contains(search)) {
                return p;
        }
        }
        return null;
    }
}
