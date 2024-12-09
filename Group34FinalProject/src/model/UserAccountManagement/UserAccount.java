/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccountManagement;

import model.Personnel.Person;
import model.Personnel.Profile;
import model.workQueue.WorkQueue;

/**
 *
 * @author nikam
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;
    WorkQueue workqueue;
    Person person;

    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        password = pw;
        this.profile = profile;

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public Person getPerson() {
        return person;
    }
    
    public Profile getProfile() {
        return profile;
    }
    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

}
