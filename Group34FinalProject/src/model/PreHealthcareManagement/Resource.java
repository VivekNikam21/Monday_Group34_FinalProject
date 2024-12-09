/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PreHealthcareManagement;

/**
 *
 * @author nikam
 */
public class Resource {
    String title;
    String type;
    String upload;
    
    public Resource(String t, String ty, String up) {
        title =t;
        type = ty;
        upload = up;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }
    
    @Override
    public String toString(){
         return title;
    }
    
}
