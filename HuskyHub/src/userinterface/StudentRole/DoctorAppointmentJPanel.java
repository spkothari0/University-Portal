/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shreyas
 */
public class DoctorAppointmentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;

    /**
     * Creates new form DoctorAppointmentJPanel
     */
    public DoctorAppointmentJPanel() {

    }

    DoctorAppointmentJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        generalBtn = new javax.swing.JButton();
        physioBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalBtn.setBackground(new java.awt.Color(204, 204, 204));
        generalBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        generalBtn.setForeground(new java.awt.Color(51, 51, 51));
        generalBtn.setText("General Practitioner");
        generalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(generalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 156, 35));

        physioBtn.setBackground(new java.awt.Color(204, 204, 204));
        physioBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        physioBtn.setForeground(new java.awt.Color(51, 51, 51));
        physioBtn.setText("Physiotherapist");
        physioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physioBtnActionPerformed(evt);
            }
        });
        jPanel1.add(physioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 156, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/gneralPrac.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/physio.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 40));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jSplitPane1.setLeftComponent(jPanel1);

        rightJPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightJPanel);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void generalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalBtnActionPerformed
        // TODO add your handling code here:
        GeneralPractitionerJPanel panel = new GeneralPractitionerJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("ManageStudentsJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_generalBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void physioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physioBtnActionPerformed
        // TODO add your handling code here:
        PhysiotherapistJPanel panel = new PhysiotherapistJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("ManageStudentsJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_physioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton generalBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton physioBtn;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}