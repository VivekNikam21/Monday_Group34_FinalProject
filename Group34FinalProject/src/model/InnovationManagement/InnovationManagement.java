/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;
import model.InsuranceManagement.Claim;

/**
 *
 * @author nikam
 */
public class InnovationManagement {
    ArrayList<Innovation> innovations;
    
    public InnovationManagement(String n) {
         innovations = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Innovation newInnovation(String n, String o, String d) {
        Innovation i = new Innovation(n, o, d);
        innovations.add(i);
        return i;
    }
    public ArrayList<Innovation> getInnovationList(){
        return innovations;
    }

    public void removeInnovation(Innovation i) {
        innovations.remove(i);
    }
    
    public Innovation searchInnovation(String search){
        for (Innovation i:innovations){
            if(i.getName().contains(search)) {
                return i;
        }
        }
        return null;
    }
}
