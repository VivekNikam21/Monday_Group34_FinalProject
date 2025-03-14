/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.ClinicManagement.Therapist;
import model.ClinicManagement.TherapistDirectory;

/**
 *
 * @author nikam
 */
public class ManageUsers extends javax.swing.JPanel {
     JPanel WorkArea;
    Business business;
    TherapistDirectory therapistDirectory;
    
    /**
     * Creates new form ManageUsers
     */
    public ManageUsers(Business bu, JPanel jp) {
        initComponents();
        WorkArea = jp;
        this.business = bu;
        this.therapistDirectory = bu.getTherapistDirectory();
        TherapistTable();
    }
    
    public void TherapistTable() {
        
        DefaultTableModel model = (DefaultTableModel)tblTherapist.getModel();
        model.setRowCount(0);
        
        for(Therapist tp : therapistDirectory.getTherapistList()) {
            Object row[] = new Object[1];
            row[0] = tp;
           // row[1] = s.getProductCatalog().getProductCount() == 0 ? "None" : s.getProductCatalog().getProductCount();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTherapist = new javax.swing.JTable();
        Nurse = new javax.swing.JScrollPane();
        tblTherapist1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));

        tblTherapist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Therapist"
            }
        ));
        jScrollPane1.setViewportView(tblTherapist);

        tblTherapist1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Therapist"
            }
        ));
        Nurse.setViewportView(tblTherapist1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(Nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(948, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(482, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Nurse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTherapist;
    private javax.swing.JTable tblTherapist1;
    // End of variables declaration//GEN-END:variables
}
