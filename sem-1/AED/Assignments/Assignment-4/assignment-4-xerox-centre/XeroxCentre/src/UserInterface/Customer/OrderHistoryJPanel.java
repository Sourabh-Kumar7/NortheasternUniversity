/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import DataManagement.DataManager;
import OrderManagement.Order;
import TheBusiness.Personnel.Customer;
import java.awt.Color;
import java.awt.Point;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhisamarth
 */
public class OrderHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderHistoryJPanel
     */
    javax.swing.JFrame parentFrame;
    Customer customer;
    public OrderHistoryJPanel(JFrame parentFrame, Customer customer) {
        this.customer = customer;
        this.parentFrame = parentFrame;
        initComponents();
        Color lightBlue = new Color(173, 216, 230);
        setBackground(lightBlue);  
        loadOrderHistoryData(customer);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVIewOrderHistory = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Order History");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnVIewOrderHistory.setText("View Order History");
        btnVIewOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIewOrderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVIewOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVIewOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVIewOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIewOrderHistoryActionPerformed
        // Get the selected row from the table
        int selectedRow = jTable1.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            // No row selected, show an error message
            JOptionPane.showMessageDialog(this, "Please select an order to view.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // A row is selected, get the order ID from the selected row
            int orderId = (int) jTable1.getValueAt(selectedRow, 0);

            // Fetch the order details from DataManager or your data source
            Order order = DataManager.masterOrderList.get(orderId);

            if (order != null) {
                // Pass the selected order to the View Order History frame
                Point parentFramePosition = this.parentFrame.getLocation();
                this.parentFrame.setVisible(false);
                ViewOrderHistoryJFrame orderHistory = new ViewOrderHistoryJFrame(this.parentFrame, order);
                orderHistory.setLocation(parentFramePosition);
                orderHistory.setVisible(true);
            } else {
                // Order not found, show an error message
                JOptionPane.showMessageDialog(this, "Selected order not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnVIewOrderHistoryActionPerformed
    
    public void loadOrderHistoryData(Customer customer) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Clear existing rows in the table
        model.setRowCount(0);

        // Populate the table with order history data
        List<Integer> orderIds = customer.getOldOrderIds(); // Get the list of old order IDs
        for (int orderId : orderIds) {
            // You can fetch order details from DataManager or your data source
            Order order = DataManager.masterOrderList.get(orderId);

            if (order != null) {
                model.addRow(new Object[]{
                    order.getId(),
                    order.getSellingPrice()
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVIewOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
