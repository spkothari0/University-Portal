/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GymHelperEnterprise;
import Business.Network.Network;
import Business.Organization.FitnessTrainingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FitnessTrainerWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyas
 */
public class FitnessTrainerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FitnessTrainerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    Enterprise e;

    FitnessTrainerJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;
        fitnessTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateFitnessStatusTable();
    }

    private void populateFitnessStatusTable() {
        DefaultTableModel dtm = (DefaultTableModel) fitnessTbl.getModel();
        dtm.setRowCount(0);
        Organization org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter instanceof GymHelperEnterprise) {
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FitnessTrainingOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                if (request.getSender().equals(userAccount)) {
                    Object row[] = new Object[5];
                    row[0] = request.getRequestID();
                    row[1] = request.getMessage();
                    row[2] = request.getReceiver();
                    row[3] = ((FitnessTrainerWorkRequest) request).getFitnessTrainerResult();
                    row[4] = request.getStatus();
                    dtm.addRow(row);
                }
            }
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
        msgTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fitnessTbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgTxt.setBackground(new java.awt.Color(204, 255, 204));
        msgTxt.setColumns(20);
        msgTxt.setForeground(new java.awt.Color(51, 51, 51));
        msgTxt.setRows(5);
        jScrollPane1.setViewportView(msgTxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 320, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Enter Your Message:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 80));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Request Workouts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 155, 48));

        fitnessTbl.setBackground(new java.awt.Color(204, 255, 204));
        fitnessTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        fitnessTbl.setForeground(new java.awt.Color(51, 51, 51));
        fitnessTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Trainer Name ", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(fitnessTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 820, 150));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 51, 51));
        enterpriseLabel.setText("FITNESS TRAINER");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (userAccount.getWorkQueue().getWorkRequestList().size() == 0) {
            FitnessTrainerWorkRequest req = new FitnessTrainerWorkRequest();
            req.setSender(userAccount);
            req.setMessage(msgTxt.getText());
            req.setStatus("Request sent to Admin");
            Organization org = null;

            for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enter instanceof GymHelperEnterprise) {
                    e = enter;
                }
            }
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FitnessTrainingOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(req);
                userAccount.getWorkQueue().getWorkRequestList().add(req);
            }
            JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateFitnessStatusTable();
        } else {
            int x = userAccount.getWorkQueue().getWorkRequestList().size() - 1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if (r.getStatus().toLowerCase().equals("result posted")) {
                FitnessTrainerWorkRequest req = new FitnessTrainerWorkRequest();
                req.setSender(userAccount);
                req.setMessage(msgTxt.getText());
                req.setStatus("Request sent to Admin");
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof GymHelperEnterprise) {
                        e = enter;
                    }
                }
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FitnessTrainingOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(req);
                    userAccount.getWorkQueue().getWorkRequestList().add(req);
                }
                JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateFitnessStatusTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please wait until the previous request has been processed !", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable fitnessTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgTxt;
    // End of variables declaration//GEN-END:variables
}
