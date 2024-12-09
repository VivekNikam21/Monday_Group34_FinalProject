/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

/**
 *
 * @author nikam
 */
public class Policy {
    private String name;
    private int pid;   
    private int amount;
    private String validity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public int getPid() {
        return pid;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
   public Policy(String n, int id, int am, String v) {
        name = n;
        this.pid = id;
        this.amount = am;
        validity = v;
    }
   
   @Override
    public String toString(){
         return String.valueOf(pid);
    }
    public int getAmount(){
        return amount;
    }
}
