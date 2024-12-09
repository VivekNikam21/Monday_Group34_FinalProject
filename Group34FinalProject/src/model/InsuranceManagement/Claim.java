/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

/**
 *
 * @author nikam
 */
public class Claim {
    private String name;
    private int cid;   
    private int pno;
    private int amount;
    private String reason;
    private String status;
    
    public Claim(String n, int id, int pno, int am, String r, String s) {
        name = n;
        this.cid = id;
        this.pno = pno;
        this.amount = am;
        reason =r;
        status = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     @Override
    public String toString(){
         return String.valueOf(cid);
    }
    public int getAmount(){
        return amount;
    }
     public int getPno(){
        return pno;
    }
}
