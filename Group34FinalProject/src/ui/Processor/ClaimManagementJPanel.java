/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Processor;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.InsuranceManagement.Agent;
import model.InsuranceManagement.Claim;
import model.InsuranceManagement.ClaimManagement;
import model.InsuranceManagement.Policy;
import model.InsuranceManagement.PolicyManagement;
import model.InsuranceManagement.Processor;

/**
 *
 * @author Reva
 */
public class ClaimManagementJPanel extends javax.swing.JPanel {
     JPanel WorkArea;
    Business business;
    Claim claim;
    Processor selectedprocessor;
    ClaimManagement claimmanagement;
    /**
     * Creates new form ClaimManagementJPanel
     */
    public ClaimManagementJPanel(Business business, JPanel jp) {
        initComponents();
        WorkArea = jp;
        this.business = business;
        initializeTable();
        refreshTable();
    }
    
     public ClaimManagementJPanel(ClaimManagement claimmanagement) {
        initComponents();
        this.claimmanagement = claimmanagement;
        
    }
public void initializeTable() {
//clear patient table
       ComboBox.removeAllItems();

        int rc = tblClaims.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblClaims.getModel()).removeRow(i);
        }
//load therapist to the combobox

        
        ArrayList<Processor> processorlist= business.getProcessorDirectory().getProcessorList();

        if (processorlist.isEmpty()) {
            return;
        }
        for (Processor p : processorlist) {
        ComboBox.addItem(p.toString());
    }
        
         ComboBox.setSelectedIndex(0);
    String processorName = (String) ComboBox.getSelectedItem();
        
    if (selectedprocessor == null) {
        // Handle the case where the therapist is not found
        return;
    }
        
    ClaimManagement cm = selectedprocessor.getClaimManagement();
            for (Claim c : cm.getClaimList()) {

                Object[] row = new Object[7];
                row[0] = c;
                row[1] = c.getName();
                row[2] = c.getPno();
                row[3] = c.getAmount();
                row[4] = c.getReason();
                row[5] = c.getStatus();
                ((DefaultTableModel) tblClaims.getModel()).addRow(row);
            }

        }
   
   public void refreshTable() {

//clear supplier table
        int rc = tblClaims.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblClaims.getModel()).removeRow(i);
        }

        String processorname = (String) ComboBox.getSelectedItem();

        selectedprocessor = business.getProcessorDirectory().findProcessor(processorname);
        if (selectedprocessor == null) {
            return;
        }
        ClaimManagement cm = selectedprocessor.getClaimManagement();

        for (Claim c : cm.getClaimList()) {

            Object[] row = new Object[7];
                row[0] = c;
                row[1] = c.getName();
                row[2] = c.getPno();
                row[3] = c.getAmount();
                row[4] = c.getReason();
                row[5] = c.getStatus();
            ((DefaultTableModel) tblClaims.getModel()).addRow(row);
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

        lblProcess = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClaims = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 102));

        lblProcess.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblProcess.setForeground(new java.awt.Color(255, 255, 255));
        lblProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcess.setText("Claim Management");

        tblClaims.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Claim ID", "Name", "Policy No", "Amount", "Reason", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblClaims);

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(204, 255, 255));
        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReject.setForeground(new java.awt.Color(0, 102, 102));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(204, 255, 255));
        btnApprove.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 102, 102));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 1908, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(788, 788, 788)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        
        int row = tblClaims.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Claim c = (Claim)tblClaims.getValueAt(row, 0);
        c.setStatus("Rejected");
        refreshTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
       int row = tblClaims.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Claim c = (Claim)tblClaims.getValueAt(row, 0);
        c.setStatus("Approved");
        refreshTable(); 
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        WorkArea.remove(this);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JTable tblClaims;
    // End of variables declaration//GEN-END:variables
}
