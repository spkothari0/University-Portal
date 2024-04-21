/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Student.Student;
import Business.StudentRequestOrder;
import Business.EcoSystem;
import Business.Enterprise.DietEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NutritionistCatalog;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyas
 */
public class StudentAnalysisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentAnalysisJPanel
     */
    private Student student;
    private JPanel userProcessContainer;
    private double bmi;
    private StudentRequestOrder order;
    private UserAccount userAccount;
    private EcoSystem system;
    Enterprise e;
    private Network network;

    public StudentAnalysisJPanel(JPanel userProcessContainer, Student student, EcoSystem system, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.student = student;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        dietStatusTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        calculateBMI();
        calculateWeightCategory();
        populateDietStatusTable();
    }

    public void calculateBMI() {
        double heightMts = student.getHeight() / 100;
        double heightSquare = heightMts * heightMts;
        bmi = student.getWeight() / heightSquare;
        System.out.println("BMI  " + bmi);
        String bmiStr = String.format("%.2f", bmi);
        txtBMI.setText(String.valueOf(bmiStr));
    }

    public void calculateWeightCategory() {
        if (bmi <= 18.5) {
            txtWtDec.setText("UNDER WEIGHT");
        } else if (bmi > 18.5 && bmi <= 24.9) {
            txtWtDec.setText("NORMAL WEIGHT");
        } else if (bmi >= 25 && bmi <= 29.9) {
            txtWtDec.setText("OVER WEIGHT");
        } else if (bmi >= 30) {
            txtWtDec.setText("OBESE");
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

        jLabel1 = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnDocApp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        txtWtDec = new javax.swing.JTextField();
        goalComboBox = new javax.swing.JComboBox<>();
        trainerAptBtn = new javax.swing.JButton();
        submitRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dietStatusTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Your BMI:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 149, 30));

        txtBMI.setEditable(false);
        txtBMI.setBackground(new java.awt.Color(204, 204, 204));
        txtBMI.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtBMI.setForeground(new java.awt.Color(51, 51, 51));
        txtBMI.setEnabled(false);
        txtBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBMIActionPerformed(evt);
            }
        });
        add(txtBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, 32));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Based on your BMI you are:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 40));

        btnDocApp.setBackground(new java.awt.Color(204, 204, 204));
        btnDocApp.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnDocApp.setForeground(new java.awt.Color(51, 51, 51));
        btnDocApp.setText("Get Doctor Appointment");
        btnDocApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocAppActionPerformed(evt);
            }
        });
        add(btnDocApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 183, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Your Goal:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Your Analysis");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 692, 36));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        txtWtDec.setEditable(false);
        txtWtDec.setBackground(new java.awt.Color(204, 204, 204));
        txtWtDec.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtWtDec.setForeground(new java.awt.Color(51, 51, 51));
        txtWtDec.setEnabled(false);
        txtWtDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWtDecActionPerformed(evt);
            }
        });
        add(txtWtDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 32));

        goalComboBox.setBackground(new java.awt.Color(204, 204, 204));
        goalComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        goalComboBox.setForeground(new java.awt.Color(51, 51, 51));
        goalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gain Weight", "Loose Weight" }));
        add(goalComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 138, 32));

        trainerAptBtn.setBackground(new java.awt.Color(204, 204, 204));
        trainerAptBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        trainerAptBtn.setForeground(new java.awt.Color(51, 51, 51));
        trainerAptBtn.setText("Get Training Workouts");
        trainerAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainerAptBtnActionPerformed(evt);
            }
        });
        add(trainerAptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 183, 40));

        submitRequest.setBackground(new java.awt.Color(204, 204, 204));
        submitRequest.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        submitRequest.setForeground(new java.awt.Color(51, 51, 51));
        submitRequest.setText("Submit Request to Nutrition");
        submitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestActionPerformed(evt);
            }
        });
        add(submitRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 190, 45));

        dietStatusTbl.setBackground(new java.awt.Color(204, 204, 204));
        dietStatusTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        dietStatusTbl.setForeground(new java.awt.Color(51, 51, 51));
        dietStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Diet Request ID", "Goal", "Nutritrionist", "Comment", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dietStatusTbl);
        if (dietStatusTbl.getColumnModel().getColumnCount() > 0) {
            dietStatusTbl.getColumnModel().getColumn(0).setResizable(false);
            dietStatusTbl.getColumnModel().getColumn(1).setResizable(false);
            dietStatusTbl.getColumnModel().getColumn(2).setResizable(false);
            dietStatusTbl.getColumnModel().getColumn(3).setResizable(false);
            dietStatusTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 720, 130));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Training");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 180, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 760, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 10, 160));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 10, 160));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 760, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Diet Status");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 378, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nutrition");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Doctor");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBMIActionPerformed

    private void btnDocAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocAppActionPerformed
        DoctorAppointmentJPanel doc = new DoctorAppointmentJPanel(userProcessContainer, system, network, userAccount);
        userProcessContainer.add("DoctorAppointmentJPanel", doc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDocAppActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtWtDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWtDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWtDecActionPerformed

    private void trainerAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainerAptBtnActionPerformed
        // TODO add your handling code here:
        TrainerAppointmentJPanel trainer = new TrainerAppointmentJPanel(userProcessContainer, system, network, userAccount);
        userProcessContainer.add("TrainerAppointmentJPanel", trainer);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_trainerAptBtnActionPerformed

    private void submitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestActionPerformed
        // TODO add your handling code here:
        if (userAccount.getWorkQueue().getWorkRequestList().size() == 0) {
            String bmi = txtBMI.getText();
            String goal = (String) goalComboBox.getSelectedItem();
            NutritionistWorkRequest request = new NutritionistWorkRequest();
            request.setMessage(goal);
            request.setSender(userAccount);
            request.setStatus("Request Sent to Admin");
            System.out.print("Request sent to Admin");
            Organization org = null;

            for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enter instanceof DietEnterprise) {
                    e = enter;
                }
            }
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof NutritionistCatalog) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateDietStatusTable();
        } else {
            int x = userAccount.getWorkQueue().getWorkRequestList().size() - 1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if (r.getStatus().toLowerCase().equals("result posted")) {
                String bmi = txtBMI.getText();
                String goal = (String) goalComboBox.getSelectedItem();
                NutritionistWorkRequest request = new NutritionistWorkRequest();
                request.setMessage(goal);
                request.setSender(userAccount);
                request.setStatus("Request Sent to Admin");
                System.out.print("Request sent to Admin");
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof DietEnterprise) {
                        e = enter;
                    }
                }
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof NutritionistCatalog) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
                JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateDietStatusTable();

            } else {
                JOptionPane.showMessageDialog(null, "Please wait until the previous request has been processed !", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_submitRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDocApp;
    private javax.swing.JTable dietStatusTbl;
    private javax.swing.JComboBox<String> goalComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton submitRequest;
    private javax.swing.JButton trainerAptBtn;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtWtDec;
    // End of variables declaration//GEN-END:variables

    private void populateDietStatusTable() {
        DefaultTableModel dtm = (DefaultTableModel) dietStatusTbl.getModel();
        dtm.setRowCount(0);
        Organization org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter instanceof DietEnterprise) {
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof NutritionistCatalog) {
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
                    row[3] = ((NutritionistWorkRequest) request).getDietResult();
                    row[4] = request.getStatus();
                    dtm.addRow(row);
                }
            }
        }
    }
}
