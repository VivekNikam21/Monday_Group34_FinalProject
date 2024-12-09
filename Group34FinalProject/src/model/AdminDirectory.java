/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.ClinicManagement.PatientManagement;
import model.ClinicManagement.Therapist;
import model.ClinicManagement.TherapistProfile;
import model.Personnel.Person;

/**
 *
 * @author nikam
 */
public class AdminDirectory {
    Business business;
    ArrayList<AdminProfile> adminlist;
    ArrayList<Admin> admins;
     
     public AdminDirectory(){
         adminlist = new ArrayList<AdminProfile>();
         admins = new ArrayList<Admin>();
     }
    
     public AdminProfile addAdminProfile(Person p){
         
         AdminProfile tp = new AdminProfile(p);
         adminlist.add(tp);
         return tp;
     }
     public Admin findAdmin(String id){
        
        for (Admin admin: admins){
            
            if(admin.getName().equals(id)) return admin;
        }
        return null;
        }
     
     public Admin newAdmin(String n){
        Admin admin = new Admin(n, this.business);
        admins.add(admin);
        return admin;

    }
    public ArrayList<Admin> getAdminList(){
        return admins;
    }
}
