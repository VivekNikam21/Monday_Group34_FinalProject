/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

/**
 *
 * @author nikam
 */
public class Doc {
    
    private String cname;
    private int cid;   
    private String fname;
    private String dtype;
    
    public Doc(String cn, int cid, String fn, String dt) {
        cname = cn;
        this.cid = cid;
        fname =fn;
        dtype = dt;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }
    @Override
    public String toString(){
         return String.valueOf(cid);
    }
}
