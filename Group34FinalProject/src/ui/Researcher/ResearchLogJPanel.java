/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Researcher;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.InnovationManagement.Innovation;
import model.InnovationManagement.InnovationManagement;
import model.InnovationManagement.Research;
import model.InnovationManagement.ResearchManagement;
import model.InnovationManagement.Researcher;
import model.InnovationManagement.Specialist;

/**
 *
 * @author Dell
 */
public class ResearchLogJPanel extends javax.swing.JPanel {
    JPanel WorkArea;
    Business business;
    Research research;
    Researcher selectedresearcher;
    ResearchManagement researchmanagement;
    /**
     * Creates new form ResearchLogJPanel
     */
    public ResearchLogJPanel(Business business, JPanel jp) {
        initComponents();
        WorkArea = jp;
        this.business = business;
        initializeTable();
        refreshTable();
    }
    
    public ResearchLogJPanel(ResearchManagement researchmanagement) {
        initComponents();
        this.researchmanagement = researchmanagement;
        
    }
     
     public void initializeTable() {
//clear patient table
       ComboBox.removeAllItems();

        int rc = tblResource.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblResource.getModel()).removeRow(i);
        }
//load therapist to the combobox

        
        ArrayList<Researcher> researcherlist= business.getResearcherDirectory().getResearcherList();

        if (researcherlist.isEmpty()) {
            return;
        }
        for (Researcher r : researcherlist) {
        ComboBox.addItem(r.toString());
    }
        
         ComboBox.setSelectedIndex(0);
    String researchername = (String) ComboBox.getSelectedItem();
        
    if (selectedresearcher == null) {
        // Handle the case where the therapist is not found
        return;
    }
        
    ResearchManagement im = selectedresearcher.getResearchManagement();
            for (Research rs : im.getResearchList()) {

                Object[] row = new Object[5];
                row[0] = rs;
                row[1] = rs.getOwner();
                row[2] = rs.getDate();
                ((DefaultTableModel) tblResource.getModel()).addRow(row);
            }

        }
   
   public void refreshTable() {

//clear supplier table
        int rc = tblResource.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblResource.getModel()).removeRow(i);
        }

        String researchername  = (String) ComboBox.getSelectedItem();

        selectedresearcher = business.getResearcherDirectory().findResearcher(researchername);
        if (selectedresearcher == null) {
            return;
        }
         ResearchManagement im = selectedresearcher.getResearchManagement();
            for (Research rs : im.getResearchList()) {

                Object[] row = new Object[5];
                row[0] = rs;
                row[1] = rs.getOwner();
                row[2] = rs.getDate();
                ((DefaultTableModel) tblResource.getModel()).addRow(row);
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
        tblResource = new javax.swing.JTable();
        ComboBox = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblProcess = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        tblResource.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Research Name", "Owner", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblResource);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("Add Resource");

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("B A C K");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProcess.setBackground(new java.awt.Color(0, 102, 102));
        lblProcess.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblProcess.setForeground(new java.awt.Color(255, 255, 255));
        lblProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcess.setText("Research Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblProcess)
                        .addGap(737, 737, 737))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblProcess)
                .addGap(89, 89, 89)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         WorkArea.remove(this);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JTable tblResource;
    // End of variables declaration//GEN-END:variables
}
