/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workQueue;

/**
 *
 * @author nikam
 */
public class MedicationWorkRequest extends WorkRequest {
     private String medication;

    

    public void setMedication(String med) {
        this.medication = med;
    }
    
    public String getMedication() {
        return medication;
    }
}
