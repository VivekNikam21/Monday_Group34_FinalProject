/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

/**
 *
 * @author nikam
 */
public class People {
    String name;
    int age;
    float height;
    float weight;
    float bmi;

     public People(String n, int a, float h, float w, float b) {
        name = n;
        age = a;
        height = h;
        weight =w;
        bmi = b;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
    
    @Override
    public String toString(){
         return name;
    }
    
}
