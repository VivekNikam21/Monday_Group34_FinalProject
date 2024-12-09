/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class Patient {
     private String name;
    private int id;
    private int age;
    private String emailid;
    private String contact;
    private String treatment;
    private String sessionnotes;
    private String summary;
    private String ncomments;
    private String medication;
    private int dosage;
    private int frequency;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNcomments() {
        return ncomments;
    }

    public void setNcomments(String ncomments) {
        this.ncomments = ncomments;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getSessionnotes() {
        return sessionnotes;
    }

    public void setSessionnotes(String sessionnotes) {
        this.sessionnotes = sessionnotes;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public Patient(String n, int id, int age, String eid, String nu, String t, String ts, String s, String ns, String m, int d, int f) {
        name = n;
        this.id = id;
        this.age = age;
        emailid = eid;
        contact = nu;
        treatment = t;
        sessionnotes = ts;
        summary = s;
        ncomments = ns;
        medication = m;
        dosage = d;
        frequency =f;
    }
    
     @Override
    public String toString(){
         return String.valueOf(id);
    }
    public int getAge(){
        return age;
    }
}
