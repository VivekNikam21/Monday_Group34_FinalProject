/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class DocManagement {
    ArrayList<Doc> docs;
    
    public DocManagement(String n) {
         docs = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Doc newDoc(String cn, int cid, String fn, String dt) {
        Doc d = new Doc(cn,cid, fn, dt);
        docs.add(d);
        return d;
    }
    public ArrayList<Doc> getDocList(){
        return docs;
    }

    public void removeDoc(Doc d) {
        docs.remove(d);
    }
    
    public Doc searchDoc(String search){
        for (Doc d:docs){
            if(d.getFname().contains(search)) {
                return d;
        }
        }
        return null;
    }
}
