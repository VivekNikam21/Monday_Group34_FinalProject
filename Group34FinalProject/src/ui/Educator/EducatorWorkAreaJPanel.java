/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Educator;

import javax.swing.JPanel;
import model.Business;
import model.InnovationManagement.SpecialistProfile;
import model.PreHealthcareManagement.EducatorProfile;
/**
 *
 * @author Reva
 */
public class EducatorWorkAreaJPanel extends javax.swing.JPanel {
    JPanel WorkArea;
    Business business;
    EducatorProfile educator;
    /**
     * Creates new form EducatorWorkAreaJPanel
     */
    public EducatorWorkAreaJPanel(Business b, EducatorProfile ep, JPanel ejp) {
        business = b;
        this.WorkArea = ejp;
        educator = ep;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEducator = new javax.swing.JLabel();
        btnResourceCenter = new javax.swing.JButton();
        btnWorkshopManagement = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblEducator.setBackground(new java.awt.Color(0, 102, 102));
        lblEducator.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblEducator.setForeground(new java.awt.Color(255, 255, 255));
        lblEducator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEducator.setText("EDUCATOR");

        btnResourceCenter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResourceCenter.setForeground(new java.awt.Color(0, 102, 102));
        btnResourceCenter.setText("Resource Center");
        btnResourceCenter.setMaximumSize(new java.awt.Dimension(280, 50));

        btnWorkshopManagement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnWorkshopManagement.setForeground(new java.awt.Color(0, 102, 102));
        btnWorkshopManagement.setText("Workshop Management");

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEducator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnResourceCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317)
                        .addComponent(btnWorkshopManagement))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(724, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblEducator, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWorkshopManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResourceCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResourceCenter;
    private javax.swing.JButton btnWorkshopManagement;
    private javax.swing.JLabel lblEducator;
    // End of variables declaration//GEN-END:variables
}
