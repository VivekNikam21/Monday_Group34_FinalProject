/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;
import model.InsuranceManagement.Claim;

/**
 *
 * @author nikam
 */
public class ProgramManagement {
 ArrayList<Program> programs;
    
    public ProgramManagement(String n) {
         programs = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Program newProgram(String n, String sd, String ed, String pt) {
        Program p = new Program(n,sd, ed, pt);
        programs.add(p);
        return p;
    }
    public ArrayList<Program> getProgramList(){
        return programs;
    }

    public void removeProgram(Program p) {
        programs.remove(p);
    }
    
    public Program searchProgram(String search){
        for (Program p:programs){
            if(p.getName().contains(search)) {
                return p;
        }
        }
        return null;
    }   
}
