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
public class ClientManagement {
    
    ArrayList<Client> clients;
    
    public ClientManagement(String n) {
         clients = new ArrayList();  ///create the list of elements otherwise it is null
    }
     public Client newClient(String n, int id, String cn, String cv) {
        Client c = new Client(n,id, cn, cv);
        clients.add(c);
        return c;
    }
    public ArrayList<Client> getClientList(){
        return clients;
    }

    public void removePatient(Client p) {
        clients.remove(p);
    }
    
    public Client searchClient(String search){
        for (Client c:clients){
            if(c.getName().contains(search)) {
                return c;
        }
        }
        return null;
    }
}
