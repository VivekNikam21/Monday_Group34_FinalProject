/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Therapist;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.ClinicManagement.Patient;
import model.ClinicManagement.PatientManagement;
import model.ClinicManagement.Therapist;

/**
 *
 * @author Dell
 */
public class SessionManagementJPanel extends javax.swing.JPanel {
    JPanel WorkArea;
    Business business;
    Patient patient;
    Therapist selectedtherapist;
    PatientManagement patientmanagement;
    /**
     * Creates new form SessionManagementJPanel
     */
    public SessionManagementJPanel(Business bu, JPanel jp) {
        
        initComponents();
        WorkArea = jp;
        this.business = bu;
        initializeTable();
        refreshTable();
    }
    public SessionManagementJPanel(PatientManagement patientmanagement) {
        initComponents();
        this.patientmanagement = patientmanagement;
        
    }
   public void initializeTable() {

//clear patient table
       ComboBox.removeAllItems();

        int rc = tblSession.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblSession.getModel()).removeRow(i);
        }
//load therapist to the combobox

        
        ArrayList<Therapist> therapistlist= business.getTherapistDirectory().getTherapistList();

        if (therapistlist.isEmpty()) {
            return;
        }
        for (Therapist tp : therapistlist) {
        ComboBox.addItem(tp.toString());
    }
        
         ComboBox.setSelectedIndex(0);
    String therapistName = (String) ComboBox.getSelectedItem();
        
    if (selectedtherapist == null) {
        // Handle the case where the therapist is not found
        return;
    }
        
    PatientManagement pm = selectedtherapist.getPatientManagement();
            for (Patient pt : pm.getPatientList()) {

                Object[] row = new Object[5];
                row[0] = pt.getId();
                row[1] = pt.getName();
                row[2] = pt.getTreatment();
                row[3] = pt.getSessionnotes();
                ((DefaultTableModel) tblSession.getModel()).addRow(row);
            }

        }
   
   public void refreshTable() {

//clear supplier table
        int rc = tblSession.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblSession.getModel()).removeRow(i);
        }

        String therapistname = (String) ComboBox.getSelectedItem();

        selectedtherapist = business.getTherapistDirectory().findTherapist(therapistname);
        if (selectedtherapist == null) {
            return;
        }
        PatientManagement pm = selectedtherapist.getPatientManagement();

        for (Patient pt : pm.getPatientList()) {

            Object[] row = new Object[5];
                row[0] = pt;
                row[1] = pt.getName();
                row[2] = pt.getTreatment();
                row[3] = pt.getSessionnotes();
            ((DefaultTableModel) tblSession.getModel()).addRow(row);
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

        lblSessionManagement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSession = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblSessionManagement.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSessionManagement.setForeground(new java.awt.Color(255, 255, 255));
        lblSessionManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSessionManagement.setText("Session Management");

        tblSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Treatment", "Session Notes"
            }
        ));
        jScrollPane1.setViewportView(tblSession);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("View");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 255, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                        .addGap(487, 487, 487)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(194, 194, 194)
                                .addComponent(btnUpdate))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblSessionManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack)))
                .addContainerGap(506, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSessionManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int row = tblSession.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Patient p = (Patient)tblSession.getValueAt(row, 0);
        ViewSession vd = new ViewSession(WorkArea, p);
        WorkArea.add("ViewSession", vd);
        CardLayout layout = (CardLayout)WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         WorkArea.remove(this);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText().trim();
        if (search.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Entry is required to search", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        PatientManagement pm = selectedtherapist.getPatientManagement();
        Patient patient = pm.searchPatient(search);
        if (patient != null) {
            ViewDetailsJPanel viewPanel = new ViewDetailsJPanel(WorkArea, patient);
            WorkArea.add("ViewPatientDetailJPanel", viewPanel);
            CardLayout layout = (CardLayout) WorkArea.getLayout();
            layout.next(WorkArea);
        } else {
            JOptionPane.showMessageDialog(this, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSessionManagement;
    private javax.swing.JTable tblSession;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
