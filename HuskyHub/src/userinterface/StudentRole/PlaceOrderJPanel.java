/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Student.Student;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Items;
import Business.Enterprise.DormInventoryEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.InventoryCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DormInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyas
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private Enterprise enterprise;
    private int cartCount = 0;
    private String total;
    private int itemCount = 0;
    private ArrayList<Items> cusList;
    private ArrayList<Items> histList;
    private Student student;
    private Network network;

    /**
     * Creates new form PlaceOrderJPanel
     */
    PlaceOrderJPanel(JPanel userProcessContainer, Student student, EcoSystem system, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.student = student;
        this.business = system;
        this.enterprise = enterprise;
        this.network = network;
        this.cusList = new ArrayList<>();
        this.histList = new ArrayList<>();
        dormInventoryTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        histTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        invoiceTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        histItemTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateDormInventoryItems();
    }

    private void populateDormInventoryItems() {
        DefaultTableModel dtm = (DefaultTableModel) dormInventoryTbl.getModel();
        dtm.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (Items i : e.getItemsList()) {
                    Object row[] = new Object[2];
                    row[0] = i;
                    row[1] = i.getPrice();
                    dtm.addRow(row);
                }
            }
        }

        DefaultTableModel dtm1 = (DefaultTableModel) histTbl.getModel();
        dtm1.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
                        if (request.getReceiver() != null && request.getReceiver().getRole().toString().equals("Business.Role.DeliveryManRole")) {
                            if (request.getStatus().toLowerCase().equals("delivered")) {
                                int ord = request.getRequestID();
                                Object row[] = new Object[4];
                                row[0] = ord;
                                row[1] = request.getRequestDate();
                                row[2] = request;
                                row[3] = ((DormInventoryWorkRequest) request).getTotalBill();
                                dtm1.addRow(row);
                            }
                        }
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

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dormInventoryTbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentNotes = new javax.swing.JTextArea();
        addToCartBtn = new javax.swing.JButton();
        delCartBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        totBillTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        histTbl = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        histItemTbl = new javax.swing.JTable();
        addToCartHistBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 0, 1127, 37));

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        dormInventoryTbl.setBackground(new java.awt.Color(204, 204, 204));
        dormInventoryTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        dormInventoryTbl.setForeground(new java.awt.Color(51, 51, 51));
        dormInventoryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dormInventoryTbl);
        if (dormInventoryTbl.getColumnModel().getColumnCount() > 0) {
            dormInventoryTbl.getColumnModel().getColumn(0).setResizable(false);
            dormInventoryTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 93));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dorm Inventories");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 452, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 99, 40));

        studentNotes.setBackground(new java.awt.Color(204, 204, 204));
        studentNotes.setColumns(20);
        studentNotes.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        studentNotes.setForeground(new java.awt.Color(51, 51, 51));
        studentNotes.setRows(5);
        jScrollPane2.setViewportView(studentNotes);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 260, 58));

        addToCartBtn.setBackground(new java.awt.Color(204, 204, 204));
        addToCartBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(51, 51, 51));
        addToCartBtn.setText("Add To Cart");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });
        add(addToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        delCartBtn.setBackground(new java.awt.Color(255, 51, 51));
        delCartBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        delCartBtn.setForeground(new java.awt.Color(51, 51, 51));
        delCartBtn.setText("Delete From Cart");
        delCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCartBtnActionPerformed(evt);
            }
        });
        add(delCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, 49));

        placeOrderBtn.setBackground(new java.awt.Color(204, 204, 204));
        placeOrderBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(51, 51, 51));
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });
        add(placeOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 125, 49));

        invoiceTbl.setBackground(new java.awt.Color(204, 204, 204));
        invoiceTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        invoiceTbl.setForeground(new java.awt.Color(51, 51, 51));
        invoiceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(invoiceTbl);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 114));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 125, -1));

        totBillTxt.setEditable(false);
        totBillTxt.setBackground(new java.awt.Color(204, 204, 204));
        totBillTxt.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        totBillTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(totBillTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 193, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Order History");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 452, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Order History Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 440, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 60, 590));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1010, 80));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cart Items");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 450, -1));

        histTbl.setBackground(new java.awt.Color(204, 204, 204));
        histTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        histTbl.setForeground(new java.awt.Color(51, 51, 51));
        histTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Ordered Date", "Message", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(histTbl);
        if (histTbl.getColumnModel().getColumnCount() > 0) {
            histTbl.getColumnModel().getColumn(0).setResizable(false);
            histTbl.getColumnModel().getColumn(1).setResizable(false);
            histTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 440, 93));

        histItemTbl.setBackground(new java.awt.Color(204, 204, 204));
        histItemTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        histItemTbl.setForeground(new java.awt.Color(51, 51, 51));
        histItemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(histItemTbl);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 114));

        addToCartHistBtn.setBackground(new java.awt.Color(204, 204, 204));
        addToCartHistBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addToCartHistBtn.setForeground(new java.awt.Color(51, 51, 51));
        addToCartHistBtn.setText("Show Items");
        addToCartHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartHistBtnActionPerformed(evt);
            }
        });
        add(addToCartHistBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Order History");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 452, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        if (invoiceTbl.getRowCount() > 0 && cartCount > 0) {
            DormInventoryWorkRequest request = new DormInventoryWorkRequest();
            request.setCusList(cusList);
            request.setSender(userAccount);
            request.setStatus("Order Placed");
            request.setTotalBill(Integer.parseInt(totBillTxt.getText()));
            request.setMessage(studentNotes.getText());
            Organization org = null;
            for (Network net : business.getNetworkList()) {
                for (Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof DormInventoryEnterprise) {
                        for (Organization organization : enter.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof InventoryCatalog) {
                                org = organization;
                                break;
                            }
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Order placed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please add the menus to the cart to place the order.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = dormInventoryTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            Items i = (Items) dormInventoryTbl.getValueAt(selectedRow, 0);
            cartCount++;
            cusList.add(i);
            this.total = populateTable();
            totBillTxt.setText(this.total);
            JOptionPane.showMessageDialog(null, "Added to cart successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void delCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = invoiceTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            Items i = (Items) invoiceTbl.getValueAt(selectedRow, 0);
            cusList.remove(i);
            this.total = populateTable();
            totBillTxt.setText(this.total);

        }
    }//GEN-LAST:event_delCartBtnActionPerformed

    private void addToCartHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartHistBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = histTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            WorkRequest i = (WorkRequest) histTbl.getValueAt(selectedRow, 2);
            histList = ((DormInventoryWorkRequest) i).getCusList();
            DefaultTableModel dtm = (DefaultTableModel) histItemTbl.getModel();
            dtm.setRowCount(0);
            for (int d = 0; d < histList.size(); d++) {
                Object row[] = new Object[2];

                row[0] = histList.get(d).getItemName();
                row[1] = histList.get(d).getPrice();
                dtm.addRow(row);
            }
        }

    }//GEN-LAST:event_addToCartHistBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton addToCartHistBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delCartBtn;
    private javax.swing.JTable dormInventoryTbl;
    private javax.swing.JTable histItemTbl;
    private javax.swing.JTable histTbl;
    private javax.swing.JTable invoiceTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JTextArea studentNotes;
    private javax.swing.JTextField totBillTxt;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable(String name) {
        DefaultTableModel dtm = (DefaultTableModel) dormInventoryTbl.getModel();
        dtm.setRowCount(0);
        for (Enterprise e : business.getEnterpriseDirectory().getEnterpriseList()) {
            if (name == String.valueOf(e)) {
                for (Items item : e.getItemsList()) {
                    Object row[] = new Object[2];
                    row[0] = item;
                    row[1] = item.getPrice();
                    dtm.addRow(row);
                }
            }

        }
    }

    public String populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) invoiceTbl.getModel();
        dtm.setRowCount(0);
        int totalBill = 0;
        for (int i = itemCount; i < cusList.size(); i++) {
            Object row[] = new Object[2];

            row[0] = cusList.get(i);
            row[1] = cusList.get(i).getPrice();
            totalBill = totalBill + cusList.get(i).getPrice();
            dtm.addRow(row);
        }

        return String.valueOf(totalBill);
    }
}
