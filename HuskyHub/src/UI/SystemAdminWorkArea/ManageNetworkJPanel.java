/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srira
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    private boolean cityValid;

    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        citySuccessLbl.setVisible(false);
        cityLbl.setVisible(false);
        networkJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateNetworkTable();
    }

    private boolean cityPatternCorrect(String val3) {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(val3);
        boolean b = m.matches();
        return b;
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        nameJTextField.setText("");
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
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Enter Campus Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 132, 20));

        submitJButton.setBackground(new java.awt.Color(255, 51, 51));
        submitJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(51, 51, 51));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 90, 40));

        nameJTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameJTextField.setForeground(new java.awt.Color(51, 51, 51));
        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyReleased(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 190, 30));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, 30));

        networkJTable.setBackground(new java.awt.Color(204, 204, 204));
        networkJTable.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkJTable.setForeground(new java.awt.Color(51, 51, 51));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 404, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGE NETWORK");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 723, 30));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 51, 51));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 190, 20));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 40, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (cityValid) {
            String name = nameJTextField.getText();
            Network network = system.createAndAddNetwork();
            network.setName(name);
            citySuccessLbl.setVisible(false);
            populateNetworkTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void nameJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyReleased
        // TODO add your handling code here:
        if (!cityPatternCorrect(nameJTextField.getText()) && !(nameJTextField.getText().isEmpty())) {
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(true);
            cityValid = false;
        } else if (nameJTextField.getText().isEmpty()) {
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(false);
            cityValid = false;
        } else {
            cityLbl.setVisible(false);
            cityValid = true;
            citySuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_nameJTextFieldKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = networkJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network n = (Network) networkJTable.getValueAt(row, 0);
        system.getNetworkList().remove(n);
        populateNetworkTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
