/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Educator;

<<<<<<< HEAD
import javax.swing.JPanel;
import model.Business;
import model.InnovationManagement.SpecialistProfile;
import model.PreHealthcareManagement.EducatorProfile;

=======
>>>>>>> 2ba083150d082e3831f704026783b8c05b0a0984
/**
 *
 * @author Reva
 */
public class EducatorWorkAreaJPanel extends javax.swing.JPanel {

<<<<<<< HEAD
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
=======
    /**
     * Creates new form EducatorWorkAreaJPanel
     */
    public EducatorWorkAreaJPanel() {
>>>>>>> 2ba083150d082e3831f704026783b8c05b0a0984
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

        lblNurse = new javax.swing.JLabel();
        btnMedication = new javax.swing.JButton();
        btnProgress = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblNurse.setBackground(new java.awt.Color(0, 102, 102));
        lblNurse.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNurse.setForeground(new java.awt.Color(255, 255, 255));
        lblNurse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNurse.setText("EDUCATOR");

        btnMedication.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMedication.setForeground(new java.awt.Color(0, 102, 102));
        btnMedication.setText("Resource Center");
        btnMedication.setMaximumSize(new java.awt.Dimension(280, 50));

        btnProgress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnProgress.setForeground(new java.awt.Color(0, 102, 102));
        btnProgress.setText("Workshop Management");

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNurse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317)
                        .addComponent(btnProgress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(724, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMedication;
    private javax.swing.JButton btnProgress;
    private javax.swing.JLabel lblNurse;
    // End of variables declaration//GEN-END:variables
}
