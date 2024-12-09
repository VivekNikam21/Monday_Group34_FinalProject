/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Educator;

/**
 *
 * @author Reva
 */
public class WorkshopManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkshopManagementJPanel
     */
    public WorkshopManagementJPanel() {
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

        lblProcess = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClaims = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblProcess.setBackground(new java.awt.Color(0, 102, 102));
        lblProcess.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblProcess.setForeground(new java.awt.Color(255, 255, 255));
        lblProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcess.setText("Workshop Management");

        tblClaims.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Instructor", "Days", "Time"
            }
        ));
        jScrollPane1.setViewportView(tblClaims);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("Edit");

        btnUpdate1.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate1.setText("Add");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(599, 599, 599))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JTable tblClaims;
    // End of variables declaration//GEN-END:variables
}
