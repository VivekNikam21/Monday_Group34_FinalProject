/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InnovationManagement;

/**
 *
 * @author nikam
 */
public class Research {
    private String name;
    private String owner;
    private String date;
    
    public Research(String n, String o, String d) {
        name = n;
        owner = o;
        date = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
     @Override
    public String toString(){
         return name;
    }
}
