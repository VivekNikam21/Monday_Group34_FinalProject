/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class ResearchManagement {
    ArrayList<Research> researches;
    
    public ResearchManagement(String n) {
         researches = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Research newResearch(String n, String o, String d) {
        Research r = new Research(n, o, d);
        researches.add(r);
        return r;
    }
    public ArrayList<Research> getResearchList(){
        return researches;
    }

    public void removeResearch(Innovation i) {
        researches.remove(i);
    }
    
    public Research searchResearch(String search){
        for (Research i:researches){
            if(i.getName().contains(search)) {
                return i;
        }
        }
        return null;
    }
}
