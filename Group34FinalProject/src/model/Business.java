/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ClinicManagement.NurseDirectory;
import model.Personnel.PersonDirectory;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author nikam
 */
public class Business {
    UserAccountDirectory useraccountdirectory;
    NurseDirectory nursedirectory;
    PersonDirectory persondirectory;
    public Business(String n) {
        this.useraccountdirectory = new UserAccountDirectory();
        this.persondirectory = new PersonDirectory();
        this.nursedirectory = new NurseDirectory();
    }
    
    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }
    
    public NurseDirectory getNurseDirectory() {
        return nursedirectory;
    }
}
