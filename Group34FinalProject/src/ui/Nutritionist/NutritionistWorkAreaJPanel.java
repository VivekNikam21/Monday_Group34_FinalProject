/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Nutritionist;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Business;
import model.InnovationManagement.SpecialistProfile;
import model.PreHealthcareManagement.NutritionistProfile;
import ui.Educator.ResourceCenterJPanel;


/**
 *
 * @author Reva
 */
public class NutritionistWorkAreaJPanel extends javax.swing.JPanel {
    JPanel WorkArea;
    Business business;
    NutritionistProfile nutritionist;
    /**
     * Creates new form NutritionistWorkAreaJPanel
     */
    public NutritionistWorkAreaJPanel(Business b, NutritionistProfile np, JPanel njp) {
        business = b;
        this.WorkArea = njp;
        nutritionist = np;
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

        btnBack = new javax.swing.JButton();
        btnMealPlan = new javax.swing.JButton();
        lblNutritionist = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnMealPlan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMealPlan.setForeground(new java.awt.Color(0, 102, 102));
        btnMealPlan.setText("Meal Plan");
        btnMealPlan.setMaximumSize(new java.awt.Dimension(280, 50));
        btnMealPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMealPlanActionPerformed(evt);
            }
        });

        lblNutritionist.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNutritionist.setForeground(new java.awt.Color(255, 255, 255));
        lblNutritionist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNutritionist.setText("NUTRITIONIST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNutritionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(btnMealPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNutritionist, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnMealPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMealPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMealPlanActionPerformed
        // TODO add your handling code here:
        MealPlanJPanel pmjp = new MealPlanJPanel(business, WorkArea);
        WorkArea.add("Meal", pmjp);
        ((java.awt.CardLayout) WorkArea.getLayout()).next(WorkArea);
    }//GEN-LAST:event_btnMealPlanActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        WorkArea.remove(this);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMealPlan;
    private javax.swing.JLabel lblNutritionist;
    // End of variables declaration//GEN-END:variables
}
