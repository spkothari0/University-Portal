/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Physiotherapist;

import userinterface.PhysiotherapistRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Student.Student;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysioWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sohan
 */
public class PhysiotherapistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhysioWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;

    public PhysiotherapistWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.enterprise = enterprise;
         this.ecosystem = business;
         this.network = network;
         populateStudent();
         greetLbl.setText(account.getEmployee().getName() + "!!");
        
    }
    
    public void populateStudent(){
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
        for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
            if(emp.toString().equals(account.getEmployee().toString())){
                for( WorkRequest request: account.getWorkQueue().getWorkRequestList()){
                Student cust = request.getSender().getStudent();
            
            Object[] row = new Object[4];
            row[0] = cust.getId();
            row[1] = cust;
            row[2] = request;
            row[3] = request.getStatus();
            dtm.addRow(row);
           }
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
        tblStudentList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        physioMsgTxt = new javax.swing.JTextArea();
        enterpriseLabel = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudentList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblStudentList.setForeground(new java.awt.Color(51, 51, 51));
        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "Student Name", "Goal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 675, 91));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Process Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 107, 30));

        nameTxt.setEditable(false);
        nameTxt.setBackground(new java.awt.Color(255, 255, 255));
        nameTxt.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 90, 30));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 190, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 107, 40));

        radioMale.setBackground(new java.awt.Color(204, 255, 255));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setForeground(new java.awt.Color(204, 204, 204));
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 68, -1));

        radioFemale.setBackground(new java.awt.Color(204, 255, 255));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(204, 204, 204));
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 72, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Height(in cm):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 86, 30));

        txtHeight.setEditable(false);
        txtHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtHeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 190, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Weight (in kg):");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 30));

        txtWeight.setEditable(false);
        txtWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 190, 30));

        viewDetailsBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 138, 45));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 100, -1));

        physioMsgTxt.setColumns(20);
        physioMsgTxt.setForeground(new java.awt.Color(51, 51, 51));
        physioMsgTxt.setRows(5);
        jScrollPane2.setViewportView(physioMsgTxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("STUDENT DETAILS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        radioFemale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        radioMale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStudentList.getSelectedRow();
        if(selectedRow >=0){
            Student student = (Student) tblStudentList.getValueAt(selectedRow, 1);
            nameTxt.setText(student.getName());
            txtAge.setText(String.valueOf(student.getAge()));
            if(student.getGender().toLowerCase().equals("male")){
                radioMale.setSelected(true);
            }else{
                radioFemale.setSelected(false);
            }
            txtHeight.setText(String.valueOf(student.getHeight()));
            txtWeight.setText(String.valueOf(student.getWeight()));
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewDetailsBtnActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblStudentList.getSelectedRow();
        if(selectedRow >=0){
            PhysioWorkRequest request = (PhysioWorkRequest) tblStudentList.getValueAt(selectedRow, 2);
            if(!"Result Posted".equals(request.getStatus())){
                request.setStatus("Result Posted");
                request.setPhysioResult(physioMsgTxt.getText());
                String email = request.getSender().getUsername();
                String name = account.getEmployee().getName();
                populateStudent();
                JOptionPane.showMessageDialog(null,"Email has been sent to Student!","Success",JOptionPane.INFORMATION_MESSAGE);
                physioMsgTxt.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Result has been already Processed","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextArea physioMsgTxt;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
