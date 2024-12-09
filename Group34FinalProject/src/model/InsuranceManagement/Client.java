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
public class Client {
      private String name;
    private int cpid;   
    private String cpname;
    private String cpvalid;
    
    public Client(String n, int id, String cn, String cv) {
        name = n;
        this.cpid = id;
        cpname = cn;
        cpvalid = cv;
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }

    public String getCpvalid() {
        return cpvalid;
    }

    public void setCpvalid(String cpvalid) {
        this.cpvalid = cpvalid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpid(int cpid) {
        this.cpid = cpid;
    }
    
    @Override
    public String toString(){
         return name;
    }
    public int getCpid() {
        return cpid;
    }
    
}
