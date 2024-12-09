/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class PeopleManagement {
    ArrayList<People> peoples;
    
    public PeopleManagement(String n) {
         peoples = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public People newPeople(String n, int a, float h, float w, float b) {
        People p = new People(n,a, h, w, b);
        peoples.add(p);
        return p;
    }
    public ArrayList<People> getPeopleList(){
        return peoples;
    }

    public void removePeople(People p) {
        peoples.remove(p);
    }
    
    public People searchPeople(String search){
        for (People p:peoples){
            if(p.getName().contains(search)) {
                return p;
        }
        }
        return null;
    }   
}
