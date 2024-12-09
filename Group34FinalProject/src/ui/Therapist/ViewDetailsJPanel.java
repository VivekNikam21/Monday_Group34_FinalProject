/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Therapist;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.ClinicManagement.Patient;

/**
 *
 * @author Dell
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {
    JPanel WorkArea;
    Patient patient;
    /**
     * Creates new form ViewDetailsJPanel
     */
    public ViewDetailsJPanel(JPanel vp, Patient p) {
        initComponents();
        WorkArea = vp;
        this.patient = p;
        txtName.setText(p.getName());
        txtPatientID.setText(String.valueOf(p.getId()));
        txtAge.setText(String.valueOf(p.getAge()));
        txtEmailID.setText(String.valueOf(p.getEmailid()));
        txtContactNumber.setText(String.valueOf(p.getContact()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewDetails = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPatientID = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblViewDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewDetails.setText("View Details");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name: ");

        txtName.setEditable(false);

        lblPatientID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientID.setText("Patient ID:");

        txtPatientID.setEditable(false);

        lblAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        txtAge.setEditable(false);

        txtEmailID.setEditable(false);

        lblEmailID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailID.setText("Email ID:");

        lblContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContactNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNumber.setText("Contact Number:");

        txtContactNumber.setEditable(false);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(204, 255, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 102));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(703, 703, 703)
                        .addComponent(btnUpdate)
                        .addGap(101, 101, 101)
                        .addComponent(btnSave)))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNumber)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtAge.setEditable(true);
        txtEmailID.setEditable(true);
        txtContactNumber.setEditable(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        patient.setName(txtName.getText());
        patient.setAge(Integer.parseInt(txtAge.getText()));
        patient.setEmailid(txtEmailID.getText());
        patient.setContact(txtContactNumber.getText());
        JOptionPane.showMessageDialog(null, "Patient Successfully Updated", "Information", JOptionPane.INFORMATION_MESSAGE);
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         WorkArea.remove(this);
         
        Component[] panelStack = WorkArea.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length -1];
        PatientRecordsJPanel patientRecordJPanel = (PatientRecordsJPanel) lastPanel;
        patientRecordJPanel.refreshTable();
       
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblViewDetails;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables

    private void setViewMode() {
        txtName.setEditable(false);
        txtAge.setEditable(false);
        txtEmailID.setEditable(false);
        txtContactNumber.setEditable(false);
        btnSave.setEnabled(false);
    }
}
