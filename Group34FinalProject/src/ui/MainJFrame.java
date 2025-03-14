/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import model.AdminProfile;
import model.Business;
import ui.Processor.ProcessorWorkAreaJPanel;
import ui.Researcher.ResearcherWorkAreaJPanel;
import ui.Specialist.SpecialistWorkAreaJPanel;
import model.ClinicManagement.NurseProfile;
import model.ClinicManagement.TherapistProfile;
import model.InnovationManagement.ResearcherProfile;
import model.InnovationManagement.SpecialistProfile;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.ProcessorProfile;
import model.Personnel.Profile;
import model.PreHealthcareManagement.CoachProfile;
import model.PreHealthcareManagement.EducatorProfile;
import model.PreHealthcareManagement.NutritionistProfile;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import ui.Admin.AdminJPanel;
import ui.Admin.AdminWorkAreaJPanel;
import ui.Agent.AgentWorkAreaJPanel;
import ui.Coach.CoachWorkAreaJPanel;
import ui.Educator.EducatorWorkAreaJPanel;
import ui.Nurse.NurseWorkAreaJpanel;  
import ui.Nutritionist.NutritionistWorkAreaJPanel;
import ui.Therapist.TherapistWorkAreaJpanel;
/*correct ui
/**
 *
 * @author Dell
 */
public class MainJFrame extends javax.swing.JFrame {
    Business business;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workArea.setBackground(new java.awt.Color(0, 102, 102));

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Username");

        txtPassword.setBackground(new java.awt.Color(204, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 102, 102));

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Password");

        txtUser.setBackground(new java.awt.Color(204, 255, 255));
        txtUser.setForeground(new java.awt.Color(0, 102, 102));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 102, 102));
        btnLogin.setText("L O G I N");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(workArea);

        userProcessContainer.setBackground(new java.awt.Color(0, 102, 102));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String un = txtUser.getText();
        String pw = txtPassword.getText();

        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        Profile profile = useraccount.getAssociatedPersonProfile();
        if (useraccount == null) {
            return;
        }
        NurseWorkAreaJpanel nurseworkarea;

        if (profile instanceof NurseProfile) {

            NurseProfile np = (NurseProfile) profile;
            nurseworkarea = new NurseWorkAreaJpanel(business, np, userProcessContainer);
           userProcessContainer.removeAll();
            userProcessContainer.add("Nurse", nurseworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        AdminJPanel adminworkarea;

        if (profile instanceof AdminProfile) {

            AdminProfile np = (AdminProfile) profile;
            adminworkarea = new AdminJPanel(business, np, userProcessContainer);
           userProcessContainer.removeAll();
            userProcessContainer.add("Admin", adminworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        TherapistWorkAreaJpanel therapistworkarea;
        if (profile instanceof TherapistProfile) {

            TherapistProfile tp = (TherapistProfile) profile;
            therapistworkarea = new TherapistWorkAreaJpanel (business, tp, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Therapist", therapistworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        ResearcherWorkAreaJPanel researcherworkarea;
        if (profile instanceof ResearcherProfile) {

            ResearcherProfile rp = (ResearcherProfile) profile;
            researcherworkarea = new ResearcherWorkAreaJPanel(business, rp, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Researcher", researcherworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        SpecialistWorkAreaJPanel specialistworkarea;
        if (profile instanceof SpecialistProfile) {

            SpecialistProfile sp = (SpecialistProfile) profile;
            specialistworkarea = new SpecialistWorkAreaJPanel(business, sp, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Specialist", specialistworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        AgentWorkAreaJPanel agentworkarea;
        if (profile instanceof AgentProfile) {

            AgentProfile ap = (AgentProfile) profile;
            agentworkarea = new AgentWorkAreaJPanel(business, ap, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Agent", agentworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        ProcessorWorkAreaJPanel processorworkarea;
        if (profile instanceof ProcessorProfile) {

            ProcessorProfile pp = (ProcessorProfile) profile;
            processorworkarea = new ProcessorWorkAreaJPanel(business, pp, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Processor", processorworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        CoachWorkAreaJPanel coachworkarea;
        if (profile instanceof CoachProfile) {

            CoachProfile cp = (CoachProfile) profile;
            coachworkarea = new CoachWorkAreaJPanel(business, cp, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Coach", coachworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        EducatorWorkAreaJPanel educatorworkarea;
        if (profile instanceof EducatorProfile) {

            EducatorProfile ep = (EducatorProfile) profile;
            educatorworkarea = new EducatorWorkAreaJPanel(business, ep, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Educator", educatorworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        NutritionistWorkAreaJPanel nutritionistworkarea;
        if (profile instanceof NutritionistProfile) {

            NutritionistProfile np = (NutritionistProfile) profile;
            nutritionistworkarea = new NutritionistWorkAreaJPanel(business, np, userProcessContainer);
            userProcessContainer.removeAll();
            userProcessContainer.add("Nutritionist", nutritionistworkarea);
            ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
