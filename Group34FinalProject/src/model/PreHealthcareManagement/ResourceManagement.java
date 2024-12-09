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
public class ResourceManagement {
 
    ArrayList<Resource> resources;
    
    public ResourceManagement(String n) {
         resources = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Resource newResource(String t, String ty, String up) {
        Resource r = new Resource(t, ty, up);
        resources.add(r);
        return r;
    }
    public ArrayList<Resource> getResourceList(){
        return resources;
    }

    public void removeResource(Resource r) {
        resources.remove(r);
    }
    
    public Resource searchResource(String search){
        for (Resource r:resources){
            if(r.getTitle().contains(search)) {
                return r;
        }
        }
        return null;
    }   
}
