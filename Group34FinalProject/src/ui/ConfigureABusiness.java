/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Business;
import model.ClinicManagement.NurseDirectory;
import model.ClinicManagement.NurseProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author nikam
 */
public class ConfigureABusiness {
    static Business initialize() {
         Business business = new Business("Service");
        PersonDirectory persondirectory = business.getPersonDirectory();
// creating person in sales org 
        Person nurseperson001 = persondirectory.newPerson("P1");
        
         NurseDirectory nursedirectory = business.getNurseDirectory();
        NurseProfile nurseprofile = nursedirectory.addNurseProfile(nurseperson001);
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(nurseprofile, "Sales", "12345");
         
        return business;
    }
}
